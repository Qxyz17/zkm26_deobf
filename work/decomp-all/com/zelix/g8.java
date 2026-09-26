/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmw;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class g8
implements lmw {
    private int b;
    private static final long a = prr.a((long)-5659611731279762393L, (long)2817014320571229150L, MethodHandles.lookup().lookupClass()).a(199981373593732L);
    private static final String c;

    public String x(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return c;
    }

    public int hashCode() {
        long l = a ^ 0x6691283EF120L;
        return (int)m44.a("q", (Object)this, (long)-4873270132657485865L, (long)l);
    }

    public int n(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return -1;
    }

    public String U(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x2AABF27F19E1L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("r", (Object)this, (Object)objectArray2, (long)8012236839125867505L, (long)l);
    }

    public boolean equals(Object object) {
        boolean bl;
        block4: {
            block5: {
                long l = a ^ 0x7085015DFDBFL;
                CallSite callSite = m44.a("h", (long)-5317992304286940446L, (long)l);
                try {
                    try {
                        bl = object instanceof g8;
                        if (callSite != null) break block4;
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)-5248375096829748755L, (long)l);
                    }
                    return true;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)-5248375096829748755L, (long)l);
                }
            }
            bl = false;
        }
        return bl;
    }

    public String B(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0xF10DCA4132EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("u", (Object)this, (Object)objectArray2, (long)7349324077770625342L, (long)l);
    }

    public boolean a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return true;
    }

    public String D(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return null;
    }

    public g8(long l) {
        l = a ^ l;
        m44.a("t", (Object)this, (int)this.getClass().getName().hashCode(), (long)9156270525539206296L, (long)l);
    }

    public boolean S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public boolean Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x222B942870CBL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal(",j\u00fa\u00e2 \u0010\u008f\u0010".getBytes("ISO-8859-1"));
                c = g8.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }
}
