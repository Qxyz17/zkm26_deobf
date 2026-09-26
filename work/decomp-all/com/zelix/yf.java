/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class yf {
    private boolean w;
    private static final long b = prr.a((long)-562387783135559807L, (long)4667413075297255701L, MethodHandles.lookup().lookupClass()).a(204925057315964L);
    private static final String d;

    protected void Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        l = b ^ l;
        m44.a("p", (Object)this, (boolean)bl, (long)-218825214841208597L, (long)l);
    }

    public abstract void f(Object[] var1);

    public abstract void p(Object[] var1);

    protected boolean Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return (boolean)m44.a("w", (Object)this, (long)-6835424009517818562L, (long)l);
    }

    public void T(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = (String)objectArray[2];
        long l2 = l ^ 0x4D4E22085F88L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = string2;
        objectArray2[1] = l2;
        objectArray2[0] = string;
        m44.a("w", (Object)this, (Object)objectArray2, (long)-2718089725895441529L, (long)l);
    }

    public abstract void K(Object[] var1);

    protected final String J(Object[] objectArray) {
        String string;
        block8: {
            block10: {
                long l = (Long)objectArray[0];
                String string2 = (String)objectArray[1];
                l = b ^ l;
                CallSite callSite = m44.a("n", (long)200500039722212606L, (long)l);
                try {
                    block9: {
                        try {
                            try {
                                try {
                                    string = string2;
                                    if (callSite != null) break block8;
                                    if (string == null) break block9;
                                }
                                catch (n9 n92) {
                                    throw m44.a("n", (Object)((Object)n92), (long)121633840384926919L, (long)l);
                                }
                                string = string2.trim();
                                if (callSite != null) break block8;
                            }
                            catch (n9 n93) {
                                throw m44.a("n", (Object)((Object)n93), (long)121633840384926919L, (long)l);
                            }
                            if (string.endsWith(":")) break block10;
                        }
                        catch (n9 n94) {
                            throw m44.a("n", (Object)((Object)n94), (long)121633840384926919L, (long)l);
                        }
                    }
                    string = d;
                    break block8;
                }
                catch (n9 n95) {
                    throw m44.a("n", (Object)((Object)n95), (long)121633840384926919L, (long)l);
                }
            }
            string = " ";
        }
        return string;
    }

    public yf(short s, short s2, int n) {
        long l = ((long)s << 48 | (long)s2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        m44.a("v", (Object)this, (boolean)true, (long)6845713288587272989L, (long)l);
    }

    public abstract void t(Object[] var1);

    public abstract void I(Object[] var1);

    public abstract void n(Object[] var1);

    public abstract void a(Object[] var1);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x5B8C520CB83EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00b8\r\u008e<\u00f0;u\u00dd".getBytes("ISO-8859-1"));
                d = yf.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static n9 b(n9 n92) {
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
