import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class Dec1 {
    public static void main(String[] args) throws Exception {
        long e = 27478187097506L;
        long var0 = e ^ 62016845884693L;
        byte[] kb = new byte[8];
        kb[0] = (byte)((int)(var0 >>> 56));
        for (int i = 1; i < 8; i++) kb[i] = (byte)((int)(var0 << i * 8 >>> 56));
        System.out.print("key: ");
        for (byte b : kb) System.out.print(String.format("%02X", b));
        System.out.println();

        Cipher c = Cipher.getInstance("DES/CBC/PKCS5Padding");
        c.init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(kb)), new IvParameterSpec(new byte[8]));
        String ct = "\u00d3\u00ba\u0084\u00a9@\u00b8W\u00ee\u00aa\t4\u0094\u00a5r\u0094t-Jo\u0086\u00b1T\u00b8\u0002\u0086~\u00ba\u00de\u00bc\u00d0\u00f2\u00e3";
        byte[] pt = c.doFinal(ct.getBytes("ISO-8859-1"));
        System.out.println("plain: " + new String(pt, "UTF-8"));
    }
}
