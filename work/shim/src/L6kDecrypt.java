import com.zelix.prr;
import com.zelix.fpp;
import java.lang.reflect.Method;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class L6kDecrypt {
    // 段1: cp[5] 字符串(205 iso bytes), 段2: cp[6] 字符串(129 iso bytes)
    // 直接从 l6k.class 常量池按索引拿——用反射读 cp 不现实，改为内嵌二进制
    static String seg1 = new String(loadHex("SEG1"), java.nio.charset.Charset.forName("ISO-8859-1"));
    static String seg2 = new String(loadHex("SEG2"), java.nio.charset.Charset.forName("ISO-8859-1"));

    static byte[] loadHex(String name) {
        try {
            java.io.InputStream is = L6kDecrypt.class.getResourceAsStream("/" + name + ".bin");
            if (is == null) throw new RuntimeException("missing " + name);
            java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
            byte[] buf = new byte[4096]; int n;
            while ((n = is.read(buf)) > 0) bos.write(buf, 0, n);
            return bos.toByteArray();
        } catch (Exception e) { throw new RuntimeException(e); }
    }

    // l6k.a(byte[]) 的复刻
    static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) { cArray[n++] = (char)n3; continue; }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    public static void main(String[] args) throws Exception {
        Class<?> prrCls = Class.forName("com.zelix.prr");
        Method a3 = null;
        for (Method mth : prrCls.getDeclaredMethods()) {
            if (mth.getName().equals("a") && mth.getParameterCount() == 3) {
                Class<?>[] p = mth.getParameterTypes();
                if (p[0] == long.class && p[1] == long.class) { a3 = mth; break; }
            }
        }
        a3.setAccessible(true);
        Object fppObj = a3.invoke(null, -8455089274228520502L, -3019465799095495167L, null);
        Method aLong = fppObj.getClass().getMethod("a", long.class);
        long key = ((Number) aLong.invoke(fppObj, 79544669071401L)).longValue() ^ 135910015983953L;

        byte[] kb = new byte[8];
        for (int i = 0; i < 8; i++) kb[i] = (byte)(key >>> (56 - i * 8));
        System.out.print("KEY bytes: ");
        for (byte b : kb) System.out.print(String.format("%02X ", b));
        System.out.println();

        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory kf = SecretKeyFactory.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, kf.generateSecret(new DESKeySpec(kb)), new IvParameterSpec(new byte[8]));

        String[] out = new String[7];
        int idx = 0;

        // 段1: 初值 var4=16, tableswitch default(152)
        idx = runSegment(cipher, seg1, 16, idx, out, false);
        // 段2: 初值 var4=112, tableswitch case0(216)
        idx = runSegment(cipher, seg2, 112, idx, out, true);

        System.out.println("=== 解出的 7 个字符串 ===");
        for (int i = 0; i < 7; i++) {
            System.out.println("[" + i + "] " + (out[i] == null ? "<null>" : out[i]));
        }
    }

    // 复刻切片循环。startCase=true 表示 tableswitch 用 case0 分支(存下标 idx)，false 用 default 分支
    static int runSegment(Cipher cipher, String seg, int initLen, int idx, String[] out, boolean startCase) throws Exception {
        String cur = seg;
        int len = cur.length();
        int blockLen = initLen;
        int pos = -1;
        boolean useCase0 = startCase;
        while (true) {
            pos += 1;
            String chunk = cur.substring(pos, pos + blockLen);
            byte[] ct = chunk.getBytes("ISO-8859-1");
            byte[] pt = cipher.doFinal(ct);
            String dec = a(pt).intern();
            out[idx] = dec;
            idx += 1;
            pos += blockLen;
            if (pos < len) {
                blockLen = cur.charAt(pos);
                // tableswitch: case0 走 216(继续循环)，default 走 152(继续循环)——两者都继续，区别在存哪个下标
                // 实际上两分支都是"存并继续"，只是 tableswitch 决定 idx 递增方式，这里统一处理
                continue;
            }
            break;
        }
        return idx;
    }
}
