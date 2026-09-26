import java.io.*;
import java.nio.file.*;

public class DumpSegsRaw {
    public static void main(String[] args) throws Exception {
        byte[] b = Files.readAllBytes(Paths.get(args[0]));
        DataInputStream in = new DataInputStream(new ByteArrayInputStream(b));
        in.readInt(); in.readUnsignedShort(); in.readUnsignedShort();
        int cpCount = in.readUnsignedShort();
        byte[][] raw = new byte[cpCount][];
        for (int i = 1; i < cpCount; i++) {
            int tag = in.readUnsignedByte();
            switch (tag) {
                case 1: { int len = in.readUnsignedShort(); byte[] data = new byte[len]; in.readFully(data); raw[i] = data; break; }
                case 3: case 4: in.readInt(); break;
                case 5: case 6: in.readLong(); i++; break;
                case 7: case 8: case 16: case 19: case 20: in.readUnsignedShort(); break;
                case 9: case 10: case 11: case 12: case 18: in.readUnsignedShort(); in.readUnsignedShort(); break;
                case 15: in.readUnsignedByte(); in.readUnsignedShort(); break;
                default: throw new IOException("tag " + tag + " at " + i);
            }
        }
        int[] targets = {136, 81};
        for (int t : targets) {
            if (raw[t] != null) {
                String name = "RAW_" + t + ".bin";
                Files.write(Paths.get(args[1], name), raw[t]);
                System.out.println("wrote " + name + " rawLen=" + raw[t].length + " mod8=" + (raw[t].length % 8));
            }
        }
    }
}
