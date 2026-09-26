import java.nio.file.*;

public class SimSlice {
    public static void main(String[] args) throws Exception {
        byte[] seg1 = Files.readAllBytes(Paths.get(args[0], "UTF8_136.bin"));
        byte[] seg2 = Files.readAllBytes(Paths.get(args[0], "UTF8_81.bin"));
        String s1 = new String(seg1, "ISO-8859-1");
        String s2 = new String(seg2, "ISO-8859-1");
        System.out.println("SEG1 len=" + s1.length() + " SEG2 len=" + s2.length());

        System.out.println("--- 模拟段1 (初值16) ---");
        simulate(s1, 16, 7);
        System.out.println("--- 模拟段2 (初值112) ---");
        simulate(s2, 112, 7);
    }

    static void simulate(String cur, int initLen, int totalSlots) throws Exception {
        int len = cur.length();
        int blockLen = initLen;
        int pos = -1;
        int idx = 0;
        int guard = 0;
        while (true) {
            if (guard++ > 50) { System.out.println("guard stop"); break; }
            pos += 1;
            if (pos + blockLen > len) {
                System.out.println("  越界: pos=" + pos + " blockLen=" + blockLen + " len=" + len + " -> 停止");
                break;
            }
            String chunk = cur.substring(pos, pos + blockLen);
            byte[] cb = chunk.getBytes("ISO-8859-1");
            System.out.println("  out[" + idx + "] pos=" + pos + " len=" + blockLen + " -> bytes=" + cb.length + " first8=" + hex(cb, 8));
            idx++;
            pos += blockLen;
            if (pos < len) {
                blockLen = cur.charAt(pos);
                System.out.println("    下一块长度 charAt(" + pos + ")=" + blockLen);
                continue;
            }
            break;
        }
    }

    static String hex(byte[] b, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(n, b.length); i++) sb.append(String.format("%02X ", b[i]));
        return sb.toString();
    }
}
