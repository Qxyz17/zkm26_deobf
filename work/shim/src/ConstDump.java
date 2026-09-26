import java.io.*;
import java.nio.file.*;

public class ConstDump {
    public static void main(String[] args) throws Exception {
        byte[] b = Files.readAllBytes(Paths.get(args[0]));
        DataInputStream in = new DataInputStream(new ByteArrayInputStream(b));
        int magic = in.readInt();
        int minor = in.readUnsignedShort();
        int major = in.readUnsignedShort();
        int cpCount = in.readUnsignedShort();
        System.out.println("magic=0x" + Integer.toHexString(magic) + " ver=" + minor + "." + major + " cpCount=" + cpCount);

        Object[] cp = new Object[cpCount];
        for (int i = 1; i < cpCount; i++) {
            int tag = in.readUnsignedByte();
            switch (tag) {
                case 1: {
                    int len = in.readUnsignedShort();
                    byte[] data = new byte[len];
                    in.readFully(data);
                    cp[i] = new String(data, "ISO-8859-1");
                    break;
                }
                case 3: cp[i] = in.readInt(); break;
                case 4: cp[i] = in.readFloat(); break;
                case 5: cp[i] = in.readLong(); i++; break;
                case 6: cp[i] = in.readDouble(); i++; break;
                case 7: cp[i] = "Class#" + in.readUnsignedShort(); break;
                case 8: cp[i] = "String#" + in.readUnsignedShort(); break;
                case 9: in.readUnsignedShort(); in.readUnsignedShort(); cp[i]="Fieldref"; break;
                case 10: in.readUnsignedShort(); in.readUnsignedShort(); cp[i]="Methodref"; break;
                case 11: in.readUnsignedShort(); in.readUnsignedShort(); cp[i]="InterfaceMethodref"; break;
                case 12: in.readUnsignedShort(); in.readUnsignedShort(); cp[i]="NameAndType"; break;
                case 15: in.readUnsignedByte(); in.readUnsignedShort(); cp[i]="MethodHandle"; break;
                case 16: in.readUnsignedShort(); cp[i]="MethodType"; break;
                case 18: in.readUnsignedShort(); in.readUnsignedShort(); cp[i]="InvokeDynamic"; break;
                case 19: in.readUnsignedShort(); cp[i]="Module"; break;
                case 20: in.readUnsignedShort(); cp[i]="Package"; break;
                default: throw new IOException("unknown tag " + tag + " at cp index " + i);
            }
        }

        System.out.println("=== Utf8 entries >= 32 chars ===");
        for (int i = 1; i < cpCount; i++) {
            if (cp[i] instanceof String) {
                String s = (String) cp[i];
                if (s.length() >= 32) {
                    byte[] raw = s.getBytes("ISO-8859-1");
                    StringBuilder hex = new StringBuilder();
                    for (int j = 0; j < Math.min(raw.length, 48); j++) hex.append(String.format("%02X ", raw[j]));
                    System.out.println("cp[" + i + "] len=" + s.length() + " bytelen=" + raw.length);
                    System.out.println("  hex48: " + hex);
                }
            }
        }

        int bestIdx = -1; int bestLen = 0;
        for (int i = 1; i < cpCount; i++) {
            if (cp[i] instanceof String) {
                int L = ((String)cp[i]).length();
                if (L > bestLen) { bestLen = L; bestIdx = i; }
            }
        }
        if (bestIdx > 0) {
            byte[] raw = ((String)cp[bestIdx]).getBytes("ISO-8859-1");
            Files.write(Paths.get(args[1]), raw);
            System.out.println("=== wrote largest Utf8 cp[" + bestIdx + "] len=" + raw.length + " to " + args[1]);
        }
    }
}
