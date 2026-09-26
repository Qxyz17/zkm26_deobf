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
    private static final long a = prr.a(-5883569755728637710L, -3797129161924582522L, MethodHandles.lookup().lookupClass()).a(10027521316830L);
    private static final String c;

    @Override
    public String U(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x2AABF27F19E1L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("r", (Object)this, (Object)objectArray2, (long)8505347988392902249L, (long)l10);
    }

    @Override
    public boolean Y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    @Override
    public boolean a(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    public int hashCode() {
        long l10 = a ^ 0x706CA65BA47DL;
        return (int)m44.a("q", (Object)this, (long)-8671259144288181718L, (long)l10);
    }

    @Override
    public boolean S(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return true;
    }

    public lqa(int n10, bc bc2, long l10) {
        l10 = a ^ l10;
        m44.a("w", (Object)this, (int)-1, (long)5417003484559683246L, (long)l10);
        m44.a("w", (Object)this, (int)n10, (long)5417003484559683246L, (long)l10);
        m44.a("w", (Object)this, (bc)bc2, (long)5553144923227215855L, (long)l10);
    }

    public String A(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x4E4B62361E0BL;
        return ((bc)((Object)m44.a("p", (Object)this, (long)-779773313640140846L, (long)l10))).v(l11);
    }

    public bc g(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("w", (Object)this, (long)2858330414051671381L, (long)l10);
    }

    @Override
    public int n(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return (int)m44.a("v", (Object)this, (long)5568173574860613829L, (long)l10);
    }

    @Override
    public String x(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return c;
    }

    @Override
    public String D(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return null;
    }

    @Override
    public String B(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0xF10DCA4132EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("u", (Object)this, (Object)objectArray2, (long)8990932347660989606L, (long)l10);
    }

    public boolean equals(Object object) {
        boolean bl2;
        block6: {
            block7: {
                Object object2;
                block8: {
                    block9: {
                        long l10 = a ^ 0x6E6FA17BF5A5L;
                        CallSite callSite = m44.a("o", (long)-3578812759256843643L, (long)l10);
                        try {
                            bl2 = object instanceof lqa;
                            if (callSite != null) break block6;
                            if (!bl2) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("o", (Object)n92, (long)-3983016656339814511L, (long)l10);
                        }
                        lqa lqa2 = (lqa)object;
                        try {
                            try {
                                object2 = m44.a("q", (Object)this, (long)-2994504786499849230L, (long)l10);
                                if (callSite != null) break block8;
                                if (object2 != m44.a("q", (Object)lqa2, (long)-2994504786499849230L, (long)l10)) break block9;
                            }
                            catch (n9 n93) {
                                throw m44.a("o", (Object)n93, (long)-3983016656339814511L, (long)l10);
                            }
                            object2 = true;
                            break block8;
                        }
                        catch (n9 n94) {
                            throw m44.a("o", (Object)n94, (long)-3983016656339814511L, (long)l10);
                        }
                    }
                    object2 = false;
                }
                return (boolean)object2;
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x457516279A01L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0003\u00a0I\u0005\u000e\u00b4\u009b\u00f1TO\u00c6b\u00c4X\u00f8\u0019".getBytes("ISO-8859-1"));
                c = lqa.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String a(byte[] byArray) {
        int n10 = 0;
        int n11 = byArray.length;
        char[] cArray = new char[n11];
        for (int i10 = 0; i10 < n11; ++i10) {
            char c10;
            int n12 = 0xFF & byArray[i10];
            if (n12 < 192) {
                cArray[n10++] = (char)n12;
                continue;
            }
            if (n12 < 224) {
                c10 = (char)((char)(n12 & 0x1F) << 6);
                n12 = byArray[++i10];
                c10 = (char)(c10 | (char)(n12 & 0x3F));
                cArray[n10++] = c10;
                continue;
            }
            if (i10 >= n11 - 2) continue;
            c10 = (char)((char)(n12 & 0xF) << 12);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F) << 6);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F));
            cArray[n10++] = c10;
        }
        return new String(cArray, 0, n10);
    }
}

