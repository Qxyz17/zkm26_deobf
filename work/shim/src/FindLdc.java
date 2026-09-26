import java.io.*;
import java.nio.file.*;

public class FindLdc {
    public static void main(String[] args) throws Exception {
        byte[] b = Files.readAllBytes(Paths.get(args[0]));
        DataInputStream in = new DataInputStream(new ByteArrayInputStream(b));
        in.readInt(); in.readUnsignedShort(); in.readUnsignedShort();
        int cpCount = in.readUnsignedShort();
        // 只记 Utf8 内容 + String 项
        int[] stringRef = new int[cpCount];   // String -> Utf8 index
        String[] utf8 = new String[cpCount];
        byte[] utf8raw = null;
        for (int i = 1; i < cpCount; i++) {
            int tag = in.readUnsignedByte();
            switch (tag) {
                case 1: { int len = in.readUnsignedShort(); byte[] d = new byte[len]; in.readFully(d); utf8[i] = new String(d, "UTF-8"); break; }
                case 3: case 4: in.readInt(); break;
                case 5: case 6: in.readLong(); i++; break;
                case 7: case 16: case 19: case 20: in.readUnsignedShort(); break;
                case 8: stringRef[i] = in.readUnsignedShort(); break;  // String -> Utf8
                case 9: case 10: case 11: case 12: case 18: in.readUnsignedShort(); in.readUnsignedShort(); break;
                case 15: in.readUnsignedByte(); in.readUnsignedShort(); break;
                default: throw new IOException("tag " + tag + " at " + i);
            }
        }
        // 读 method 的 Code，找 ldc/ldc_w
        // 跳过 header
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        DataInputStream d = new DataInputStream(bis);
        d.readInt(); d.readUnsignedShort(); d.readUnsignedShort(); d.readUnsignedShort();
        // cp 重读（跳过）
        for (int i = 1; i < cpCount; i++) {
            int tag = d.readUnsignedByte();
            switch (tag) {
                case 1: int len = d.readUnsignedShort(); d.skipBytes(len); break;
                case 3: case 4: d.skipBytes(4); break;
                case 5: case 6: d.skipBytes(8); i++; break;
                case 7: case 16: case 19: case 20: d.skipBytes(2); break;
                case 8: d.skipBytes(2); break;
                case 9: case 10: case 11: case 12: case 18: d.skipBytes(4); break;
                case 15: d.skipBytes(3); break;
            }
        }
        d.readUnsignedShort(); d.readUnsignedShort(); d.readUnsignedShort(); // access, this, super
        int ifCount = d.readUnsignedShort();
        for (int i = 0; i < ifCount; i++) d.readUnsignedShort();
        int fieldCount = d.readUnsignedShort();
        for (int i = 0; i < fieldCount; i++) { d.readUnsignedShort(); d.readUnsignedShort(); d.readUnsignedShort(); int ac = d.readUnsignedShort(); for (int j = 0; j < ac; j++) { d.readUnsignedShort(); int l = d.readInt(); d.skipBytes(l); } }
        int methodCount = d.readUnsignedShort();
        System.out.println("方法数: " + methodCount);
        for (int i = 0; i < methodCount; i++) {
            d.readUnsignedShort(); int nameIdx = d.readUnsignedShort(); d.readUnsignedShort();
            int ac = d.readUnsignedShort();
            for (int j = 0; j < ac; j++) {
                int an = d.readUnsignedShort(); int al = d.readInt();
                String aname = utf8[an];
                if ("Code".equals(aname)) {
                    byte[] code = new byte[al]; d.readFully(code);
                    // 扫描 ldc (0x12) / ldc_w (0x13)
                    for (int k = 0; k < code.length; k++) {
                        int op = code[k] & 0xFF;
                        if (op == 0x12) {
                            int idx = code[k+1] & 0xFF;
                            int uidx = stringRef[idx] > 0 ? stringRef[idx] : idx;
                            if (utf8[uidx] != null && utf8[uidx].length() > 20)
                                System.out.println("  [" + utf8[nameIdx] + "] ldc #" + idx + " (->utf8#" + uidx + " len=" + utf8[uidx].length() + ")");
                            k += 1;
                        } else if (op == 0x13) {
                            int idx = ((code[k+1] & 0xFF) << 8) | (code[k+2] & 0xFF);
                            int uidx = stringRef[idx] > 0 ? stringRef[idx] : idx;
                            if (utf8[uidx] != null && utf8[uidx].length() > 20)
                                System.out.println("  [" + utf8[nameIdx] + "] ldc_w #" + idx + " (->utf8#" + uidx + " len=" + utf8[uidx].length() + ")");
                            k += 2;
                        }
                    }
                } else {
                    d.skipBytes(al);
                }
            }
        }
        // 导出所有长 utf8
        for (int i = 1; i < cpCount; i++) {
            if (utf8[i] != null && utf8[i].getBytes("ISO-8859-1").length >= 100) {
                byte[] iso = utf8[i].getBytes("ISO-8859-1");
                Files.write(Paths.get(args[1], "UTF8_" + i + ".bin"), iso);
                System.out.println("导出 UTF8_" + i + ".bin isoLen=" + iso.length);
            }
        }
    }
}
