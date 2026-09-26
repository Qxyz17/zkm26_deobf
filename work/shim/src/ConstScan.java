import java.io.*;
import java.nio.file.*;

public class ConstScan {
    public static void main(String[] args) throws Exception {
        byte[] b = Files.readAllBytes(Paths.get(args[0]));
        DataInputStream in = new DataInputStream(new ByteArrayInputStream(b));
        in.readInt(); in.readUnsignedShort(); in.readUnsignedShort();
        int cpCount = in.readUnsignedShort();
        String[] utf8 = new String[cpCount];
        for (int i = 1; i < cpCount; i++) {
            int tag = in.readUnsignedByte();
            switch (tag) {
                case 1: { int len = in.readUnsignedShort(); byte[] data = new byte[len]; in.readFully(data); utf8[i] = new String(data, "UTF-8"); break; }
                case 3: case 4: in.readInt(); break;
                case 5: case 6: in.readLong(); i++; break;
                case 7: case 8: case 16: case 19: case 20: in.readUnsignedShort(); break;
                case 9: case 10: case 11: case 12: case 18: in.readUnsignedShort(); in.readUnsignedShort(); break;
                case 15: in.readUnsignedByte(); in.readUnsignedShort(); break;
                default: throw new IOException("tag " + tag + " at " + i);
            }
        }
        System.out.println("=== 所有 ISO-8859-1 字节数 >= 16 的 Utf8 ===");
        for (int i = 1; i < cpCount; i++) {
            if (utf8[i] == null) continue;
            byte[] iso = utf8[i].getBytes("ISO-8859-1");
            if (iso.length < 16) continue;
            int nonAscii = 0;
            for (byte x : iso) if ((x & 0xFF) > 127 || (x & 0xFF) < 9) nonAscii++;
            boolean isCipher = iso.length % 8 == 0;
            System.out.println("cp[" + i + "] isoLen=" + iso.length + " mod8=" + (iso.length % 8)
                + " nonAscii=" + nonAscii + (isCipher ? "  <== 8-multiple" : ""));
        }
    }
}
