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

public class lop
implements lmw {
    private int O;
    private bc M;
    private static final long a = prr.a((long)-6976715973996665020L, (long)-2313423420351447696L, MethodHandles.lookup().lookupClass()).a(257401035514556L);
    private static final String b;

    public String B(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0xF10DCA4132EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("u", (Object)this, (Object)objectArray2, (long)7231888728120484399L, (long)l);
    }

    public int p(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (int)m44.a("v", (Object)this, (long)-2084041463846684895L, (long)l);
    }

    public int hashCode() {
        long l = a ^ 0x42C2FDACDC00L;
        return m44.a("v", (Object)this, (long)8213263729052807991L, (long)l).hashCode() ^ m44.a("v", (Object)this, (long)7920704941048543705L, (long)l);
    }

    public String U(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x2AABF27F19E1L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("r", (Object)this, (Object)objectArray2, (long)7967977973894539488L, (long)l);
    }

    public bc i(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("t", (Object)this, (long)-3163452351556790571L, (long)l);
    }

    public int n(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return -1;
    }

    public boolean equals(Object object) {
        boolean bl;
        block10: {
            block11: {
                Object object2;
                block14: {
                    block13: {
                        lop lop2;
                        lop lop3;
                        CallSite callSite;
                        long l;
                        block12: {
                            l = a ^ 0x3E4BF438544L;
                            callSite = m44.a("l", (long)3604833732502996694L, (long)l);
                            try {
                                bl = object instanceof lop;
                                if (callSite != null) break block10;
                                if (!bl) break block11;
                            }
                            catch (n9 n92) {
                                throw m44.a("l", (Object)((Object)n92), (long)3750827529560513644L, (long)l);
                            }
                            lop3 = (lop)object;
                            try {
                                try {
                                    lop2 = this;
                                    if (callSite != null) break block12;
                                    if (m44.a("r", (Object)lop2, (long)2936099561730845299L, (long)l) != m44.a("r", (Object)lop3, (long)2936099561730845299L, (long)l)) break block13;
                                }
                                catch (n9 n93) {
                                    throw m44.a("l", (Object)((Object)n93), (long)3750827529560513644L, (long)l);
                                }
                                lop2 = this;
                            }
                            catch (n9 n94) {
                                throw m44.a("l", (Object)((Object)n94), (long)3750827529560513644L, (long)l);
                            }
                        }
                        try {
                            try {
                                object2 = m44.a("r", (Object)lop2, (long)3796461969092796573L, (long)l);
                                if (callSite != null) break block14;
                                if (object2 != m44.a("r", (Object)lop3, (long)3796461969092796573L, (long)l)) break block13;
                            }
                            catch (n9 n95) {
                                throw m44.a("l", (Object)((Object)n95), (long)3750827529560513644L, (long)l);
                            }
                            object2 = true;
                            break block14;
                        }
                        catch (n9 n96) {
                            throw m44.a("l", (Object)((Object)n96), (long)3750827529560513644L, (long)l);
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

    public String x(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return b + (int)m44.a("p", (Object)this, (long)2062049282847361199L, (long)l) + ">";
    }

    public boolean a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public boolean S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public String D(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return null;
    }

    public boolean Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return true;
    }

    public lop(int n, long l, bc bc2) {
        l = a ^ l;
        m44.a("r", (Object)this, (int)-1, (long)3699077986845878119L, (long)l);
        m44.a("r", (Object)this, (int)n, (long)3699077986845878119L, (long)l);
        m44.a("r", (Object)this, (bc)bc2, (long)3406237688964165001L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x4CFFC66E8F2CL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00e2\u00b8H\u00cb\u0005\u009d\u00d7rfK*b\u00ae\u00b2v\u009cN$\u00ec\u00fa\u009a(A/".getBytes("ISO-8859-1"));
                b = lop.a(byArray3).intern();
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
