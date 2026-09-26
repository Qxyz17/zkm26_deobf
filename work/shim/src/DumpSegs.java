import java.io.*;
import java.nio.file.*;

public class DumpSegs {
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
        // 暴力找 isoLen == 205 和 129 的两个高熵字符串
        int i205 = -1, i129 = -1;
        for (int i = 1; i < cpCount; i++) {
            if (utf8[i] == null) continue;
            byte[] iso = utf8[i].getBytes("ISO-8859-1");
            if (iso.length == 205) i205 = i;
            if (iso.length == 129) i129 = i;
        }
        System.out.println("isoLen=205 的索引: cp[" + i205 + "]");
        System.out.println("isoLen=129 的索引: cp[" + i129 + "]");
        if (i205 > 0) Files.write(Paths.get(args[1], "SEG1.bin"), utf8[i205].getBytes("ISO-8859-1"));
        if (i129 > 0) Files.write(Paths.get(args[1], "SEG2.bin"), utf8[i129].getBytes("ISO-8859-1"));
        System.out.println("wrote SEG1/SEG2 to " + args[1]);
    }
}
