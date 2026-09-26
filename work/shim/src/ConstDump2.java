import java.io.*;
import java.nio.file.*;

public class ConstDump2 {
    public static void main(String[] args) throws Exception {
        byte[] b = Files.readAllBytes(Paths.get(args[0]));
        DataInputStream in = new DataInputStream(new ByteArrayInputStream(b));
        in.readInt(); in.readUnsignedShort(); in.readUnsignedShort();
        int cpCount = in.readUnsignedShort();
        String[] utf8 = new String[cpCount];
        for (int i = 1; i < cpCount; i++) {
            int tag = in.readUnsignedByte();
            switch (tag) {
                case 1: {
                    int len = in.readUnsignedShort();
                    byte[] data = new byte[len];
                    in.readFully(data);
                    utf8[i] = new String(data, "UTF-8");  // ★ 正确解码
                    break;
                }
                case 3: case 4: in.readInt(); break;
                case 5: case 6: in.readLong(); i++; break;
                case 7: case 8: case 16: case 19: case 20: in.readUnsignedShort(); break;
                case 9: case 10: case 11: case 12: case 18: in.readUnsignedShort(); in.readUnsignedShort(); break;
                case 15: in.readUnsignedByte(); in.readUnsignedShort(); break;
                default: throw new IOException("tag " + tag + " at " + i);
            }
        }

        // cp[136] 是我们锁定的密文
        int idx = 136;
        String s = utf8[idx];
        System.out.println("cp[" + idx + "] java-String length = " + s.length());
        byte[] iso = s.getBytes("ISO-8859-1");
        System.out.println("ISO-8859-1 bytes = " + iso.length + "  (mod 8 = " + (iso.length % 8) + ")");
        Files.write(Paths.get(args[1]), iso);
        System.out.println("wrote " + iso.length + " bytes to " + args[1]);

        // 也 dump 全部 utf8 字符串的前几个
        System.out.println("=== 全部 cp[136] 前后 Utf8 ===");
        for (int i = 130; i <= 150; i++) {
            if (utf8[i] != null) {
                String t = utf8[i];
                String disp = t.length() > 60 ? t.substring(0, 60) + "..." : t;
                System.out.println("cp[" + i + "] len=" + t.length() + " : " + disp.replaceAll("[^\\x20-\\x7e]", "."));
            }
        }
    }
}
