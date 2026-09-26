import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.nio.file.*;

public class L6kDecrypt2 {
    static byte[] seg1, seg2;

    static String a(byte[] byArray) {
        int n = 0, n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) { cArray[n++] = (char)n3; continue; }
            if (n3 < 224) { c = (char)((n3 & 0x1F) << 6); n3 = byArray[++i]; c = (char)(c | (n3 & 0x3F)); cArray[n++] = c; continue; }
            if (i >= n2 - 2) continue;
            c = (char)((n3 & 0xF) << 12);
            n3 = byArray[++i]; c = (char)(c | (n3 & 0x3F) << 6);
            n3 = byArray[++i]; c = (char)(c | (n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    public static void main(String[] args) throws Exception {
        seg1 = Files.readAllBytes(Paths.get(args[0], "SEG1.bin"));
        seg2 = Files.readAllBytes(Paths.get(args[0], "SEG2.bin"));
        byte[] kb = new byte[]{(byte)0x01,(byte)0x01,(byte)0x58,(byte)0x54,(byte)0xA8,(byte)0x1F,(byte)0x68,(byte)0x3E};

        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory kf = SecretKeyFactory.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, kf.generateSecret(new DESKeySpec(kb)), new IvParameterSpec(new byte[8]));

        String[] out = new String[7];
        int idx = 0;
        // 段1: 初值 16
        idx = run(cipher, new String(seg1, "ISO-8859-1"), 16, idx, out);
        // 段2: 初值 112
        idx = run(cipher, new String(seg2, "ISO-8859-1"), 112, idx, out);

        System.out.println("=== 解出的字符串 ===");
        for (int i = 0; i < 7; i++) {
            System.out.println("[" + i + "] " + (out[i] == null ? "<null>" : "[" + out[i] + "]"));
        }
    }

    static int run(Cipher cipher, String seg, int initLen, int idx, String[] out) throws Exception {
        String cur = seg;
        int len = cur.length();
        int blockLen = initLen;
        int pos = -1;
        int guard = 0;
        while (true) {
            if (guard++ > 100) { System.out.println("循环保护触发"); break; }
            pos += 1;
            if (pos + blockLen > len) { System.out.println("切片越界 pos=" + pos + " len=" + blockLen); break; }
            String chunk = cur.substring(pos, pos + blockLen);
            byte[] ct = chunk.getBytes("ISO-8859-1");
            byte[] pt = cipher.doFinal(ct);
            out[idx++] = a(pt);
            pos += blockLen;
            if (pos < len) {
                blockLen = cur.charAt(pos);
                continue;
            }
            break;
        }
        return idx;
    }
}
