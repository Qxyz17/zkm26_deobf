import java.lang.reflect.Method;

public class TestEss2 {
    public static void main(String[] args) throws Exception {
        try {
            Class<?> ess = Class.forName("com.zelix.ess");
            Method m = ess.getMethod("a", long.class, long.class, Object.class);
            Class<?> target = Class.forName("com.zelix.bn");
            System.out.println("target: " + target);
            Object b44 = m.invoke(null, -844179677517071031L, -313397354718704507L, target);
            Method al = b44.getClass().getMethod("a", long.class);
            Object key = al.invoke(b44, 212284683528426L);
            long k = ((Number)key).longValue();
            System.out.println("key: " + k + " hex: " + Long.toHexString(k));
            long var0 = k ^ 62016845884693L;
            System.out.println("var0: " + var0 + " hex: " + Long.toHexString(var0));
            byte[] kb = new byte[8];
            kb[0] = (byte)((int)(var0 >>> 56));
            for (int i = 1; i < 8; i++) kb[i] = (byte)((int)(var0 << i * 8 >>> 56));
            System.out.print("DES key: ");
            for (byte b : kb) System.out.print(String.format("%02X", b));
            System.out.println();
            javax.crypto.Cipher c = javax.crypto.Cipher.getInstance("DES/CBC/PKCS5Padding");
            c.init(2, javax.crypto.SecretKeyFactory.getInstance("DES").generateSecret(new javax.crypto.spec.DESKeySpec(kb)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
            String ct = "\u00d3\u00ba\u0084\u00a9@\u00b8W\u00ee\u00aa\t4\u0094\u00a5r\u0094t-Jo\u0086\u00b1T\u00b8\u0002\u0086~\u00ba\u00de\u00bc\u00d0\u00f2\u00e3";
            byte[] pt = c.doFinal(ct.getBytes("ISO-8859-1"));
            System.out.println("plain: " + new String(pt, "UTF-8"));
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
