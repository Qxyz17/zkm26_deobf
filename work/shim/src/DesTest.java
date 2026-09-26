import com.zelix.prr;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.lang.reflect.Method;

public class DesTest {
    static final long SEED1 = -8455089274228520502L;
    static final long SEED2 = -3019465799095495167L;
    static final long SEED3 = 79544669071401L;
    static final long XORV  = 135910015983953L;

    // l6k 里的密文(ISO-8859-1)，逐字节还原
    static byte[] cipherBytes() {
        String s = "-JI\u0084$\u00c1\u00fe\u009b:<|\u00ee\u00b2\u00d8<\u00b4\u0010P\u0084\u007f\u0015\u00a9\u0091+\u008e\u00a8\u0087\u001d\u0016'\u00e6\u00d4\u00e1\b9\u00f6\u009d`\u00a6\u0000\b\u009e\u0090d\u009c\u00c7\u00bb-\u0005z\u00cd\u00b9\u009al\u001d;tHDG\u0001M\u00842\u00cebA\u00c3b\u0006\"y\u00ce\u00a8\u008b\u00bd\u00c1\u00c7\u00d4$**j\u00e4\u00b06\u00ea\u00d4,\u00a7\u00e3\u0089cdP\u00bd\u00ad\u0090z\u00e5>u\u00d5\u0090\u00f0\u00ae6Tt\u00e8CA^^\u00a0\u00ce\u00c0\u00c0\u00b1\u00e4\f\u00c1\u00b2\u0018\u00fbU\u00e9\u00bb\u00af\u00be|6\u0010\u0010S\u007f.|S%\u00d6\u00f2\u0005\u00b8\u000e\u008b\u009f%\u008cD\u00e3J\u00bc\u00aa\u00f9\u0084\u0017\u0002\u00d8\u000b\u00ad\u001d\u00d8\u0091cb\u0007)\u00bf^\u00d7r\u008e\u0006\u00dd\u00ec)_\u001fQ\u0012P<\u00b1\u0089\u009b\u008a\u0010z\u00e1)^\u00a4\u0093}yn\u00af\u00ea=e\u00e1X\u00e1";
        return s.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);
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
        Object fppObj = a3.invoke(null, SEED1, SEED2, null);
        Method aLong = fppObj.getClass().getMethod("a", long.class);

        System.out.println("XORV = " + XORV + " (0x" + Long.toHexString(XORV) + ")");

        // 多调几次 fpp.a()，观察序列
        for (int i = 0; i < 6; i++) {
            Object val = aLong.invoke(fppObj, SEED3);
            long raw = ((Number) val).longValue();
            long key = raw ^ XORV;
            System.out.println("call#" + i + " RAW=0x" + Long.toHexString(raw) + " KEY=0x" + Long.toHexString(key));
        }

        // 用第一次的 KEY 试解密
        Object val = aLong.invoke(fppObj, SEED3); // 已消费，重新构造一个
        Object fpp2 = a3.invoke(null, SEED1, SEED2, null);
        Method aLong2 = fpp2.getClass().getMethod("a", long.class);
        long raw = ((Number) aLong2.invoke(fpp2, SEED3)).longValue();
        long key = raw ^ XORV;

        byte[] kb = new byte[8];
        for (int i = 0; i < 8; i++) kb[i] = (byte)(key >>> (56 - i * 8));
        System.out.print("KEY bytes: ");
        for (byte b : kb) System.out.print(String.format("%02X ", b));
        System.out.println();

        try {
            Cipher c = Cipher.getInstance("DES/CBC/PKCS5Padding");
            SecretKeyFactory kf = SecretKeyFactory.getInstance("DES");
            c.init(Cipher.DECRYPT_MODE, kf.generateSecret(new DESKeySpec(kb)), new IvParameterSpec(new byte[8]));
            byte[] pt = c.doFinal(cipherBytes());
            System.out.println("DECRYPT OK! plaintext (ISO-8859-1 bytes -> ascii):");
            System.out.println(new String(pt, java.nio.charset.StandardCharsets.ISO_8859_1));
            System.out.print("HEX: ");
            for (byte b : pt) System.out.print(String.format("%02X ", b));
            System.out.println();
        } catch (Exception e) {
            System.out.println("DECRYPT FAILED: " + e);
        }
    }
}
