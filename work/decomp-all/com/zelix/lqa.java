/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.bc;
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

public class lqa
implements lmw {
    private int J;
    private bc b;
    private static final long a = prr.a((long)-5883569755728637710L, (long)-3797129161924582522L, MethodHandles.lookup().lookupClass()).a(10027521316830L);
    private static final String c;

    public String U(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x2AABF27F19E1L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("r", (Object)this, (Object)objectArray2, (long)8505347988392902249L, (long)l);
    }

    public boolean Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public boolean a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public int hashCode() {
        long l = a ^ 0x706CA65BA47DL;
        return (int)m44.a("q", (Object)this, (long)-8671259144288181718L, (long)l);
    }

    public boolean S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return true;
    }

    public lqa(int n, bc bc2, long l) {
        l = a ^ l;
        m44.a("w", (Object)this, (int)-1, (long)5417003484559683246L, (long)l);
        m44.a("w", (Object)this, (int)n, (long)5417003484559683246L, (long)l);
        m44.a("w", (Object)this, (bc)bc2, (long)5553144923227215855L, (long)l);
    }

    public String A(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x4E4B62361E0BL;
        return m44.a("p", (Object)this, (long)-779773313640140846L, (long)l).v(l2);
    }

    public bc g(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("w", (Object)this, (long)2858330414051671381L, (long)l);
    }

    public int n(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return (int)m44.a("v", (Object)this, (long)5568173574860613829L, (long)l);
    }

    public String x(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return c;
    }

    public String D(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return null;
    }

    public String B(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0xF10DCA4132EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("u", (Object)this, (Object)objectArray2, (long)8990932347660989606L, (long)l);
    }

    public boolean equals(Object object) {
        boolean bl;
        block6: {
            block7: {
                Object object2;
                block8: {
                    block9: {
                        long l = a ^ 0x6E6FA17BF5A5L;
                        CallSite callSite = m44.a("o", (long)-3578812759256843643L, (long)l);
                        try {
                            bl = object instanceof lqa;
                            if (callSite != null) break block6;
                            if (!bl) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("o", (Object)((Object)n92), (long)-3983016656339814511L, (long)l);
                        }
                        lqa lqa2 = (lqa)object;
                        try {
                            try {
                                object2 = m44.a("q", (Object)this, (long)-2994504786499849230L, (long)l);
                                if (callSite != null) break block8;
                                if (object2 != m44.a("q", (Object)lqa2, (long)-2994504786499849230L, (long)l)) break block9;
                            }
                            catch (n9 n93) {
                                throw m44.a("o", (Object)((Object)n93), (long)-3983016656339814511L, (long)l);
                            }
                            object2 = true;
                            break block8;
                        }
                        catch (n9 n94) {
                            throw m44.a("o", (Object)((Object)n94), (long)-3983016656339814511L, (long)l);
                        }
                    }
                    object2 = false;
                }
                return (boolean)object2;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x457516279A01L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0003\u00a0I\u0005\u000e\u00b4\u009b\u00f1TO\u00c6b\u00c4X\u00f8\u0019".getBytes("ISO-8859-1"));
                c = lqa.a(byArray3).intern();
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
