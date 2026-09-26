import java.io.*;
import java.nio.file.*;

public class Utf8ToLatin1 {
    public static void main(String[] args) throws Exception {
        byte[] raw = Files.readAllBytes(Paths.get(args[0]));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int i = 0;
        int bad = 0;
        while (i < raw.length) {
            int b0 = raw[i] & 0xFF;
            int cp, len;
            if (b0 < 0x80) { cp = b0; len = 1; }
            else if ((b0 & 0xE0) == 0xC0) { cp = b0 & 0x1F; len = 2; }
            else if ((b0 & 0xF0) == 0xE0) { cp = b0 & 0x0F; len = 3; }
            else if ((b0 & 0xF8) == 0xF0) { cp = b0 & 0x07; len = 4; }
            else { System.out.println("非法UTF-8前导 @ " + i + ": " + String.format("%02X", b0)); i++; bad++; continue; }

            boolean ok = true;
            for (int k = 1; k < len; k++) {
                if (i + k >= raw.length) { ok = false; break; }
                int bk = raw[i + k] & 0xFF;
                if ((bk & 0xC0) != 0x80) { ok = false; break; }
                cp = (cp << 6) | (bk & 0x3F);
            }
            if (!ok) { System.out.println("非法UTF-8续字节 @ " + i); i++; bad++; continue; }

            if (cp > 0xFF) {
                System.out.println("code point > 255 @ byte " + i + ": U+" + Integer.toHexString(cp) + " (len=" + len + ")");
                bad++;
            }
            out.write(cp & 0xFF);
            i += len;
        }
        byte[] result = out.toByteArray();
        System.out.println("输入 " + raw.length + " 字节 -> Latin-1 " + result.length + " 字节 (异常 " + bad + " 处)");
        Files.write(Paths.get(args[1]), result);
        System.out.println("写到 " + args[1]);
    }
}
