/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.jf;
import com.zelix.lmw;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lkn
implements lmw {
    jf F;
    private static final long a = prr.a((long)5521934524194220678L, (long)-178650930533102164L, MethodHandles.lookup().lookupClass()).a(233662047112840L);
    private static final String b;
    private static final long c;

    public String U(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x2AABF27F19E1L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("r", (Object)this, (Object)objectArray2, (long)8138204630560932469L, (long)l);
    }

    public String B(Object[] objectArray) {
        CallSite callSite;
        block13: {
            int n;
            Object object;
            block11: {
                CallSite callSite2;
                long l;
                block12: {
                    CallSite callSite3;
                    block9: {
                        block10: {
                            l = (Long)objectArray[0];
                            long l2 = l ^ 0xF10DCA4132EL;
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l2;
                            object = m44.a("u", (Object)this, (Object)objectArray2, (long)8808918024281983162L, (long)l);
                            callSite2 = m44.a("j", (long)8962443080938850480L, (long)l);
                            try {
                                try {
                                    callSite3 = object;
                                    if (callSite2 != null) break block9;
                                    if (callSite3 != null) break block10;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("j", (Object)illegalArgumentException, (long)8925047492003327860L, (long)l);
                                }
                                return null;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("j", (Object)illegalArgumentException, (long)8925047492003327860L, (long)l);
                            }
                        }
                        callSite3 = object;
                    }
                    int n2 = ((String)((Object)callSite3)).lastIndexOf((int)c);
                    try {
                        n = n2;
                        if (callSite2 != null) break block11;
                        if (n <= -1) break block12;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("j", (Object)illegalArgumentException, (long)8925047492003327860L, (long)l);
                    }
                    object = ((String)object).substring(n2 + 1);
                }
                try {
                    callSite = object;
                    if (callSite2 != null) break block13;
                    n = ((String)((Object)callSite)).endsWith(";") ? 1 : 0;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("j", (Object)illegalArgumentException, (long)8925047492003327860L, (long)l);
                }
            }
            if (n != 0) {
                object = ((String)object).substring(1, ((String)object).length() - 1);
            }
            callSite = object;
        }
        return callSite;
    }

    public int hashCode() {
        block5: {
            CallSite callSite;
            block4: {
                long l = a ^ 0x205DA1214364L;
                CallSite callSite2 = m44.a("h", (long)-5176174423955976966L, (long)l);
                try {
                    try {
                        callSite = m44.a("v", (Object)this, (long)-6386746505217243290L, (long)l);
                        if (callSite2 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("h", (Object)illegalArgumentException, (long)-4641427952914289858L, (long)l);
                    }
                    callSite = m44.a("v", (Object)this, (long)-6386746505217243290L, (long)l);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("h", (Object)illegalArgumentException, (long)-4641427952914289858L, (long)l);
                }
            }
            return callSite.hashCode();
        }
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl;
        block12: {
            block13: {
                boolean bl2;
                CallSite callSite;
                long l;
                block14: {
                    lkn lkn2;
                    block15: {
                        block17: {
                            CallSite callSite2;
                            block16: {
                                l = a ^ 0xE8ADC2268CCL;
                                CallSite callSite3 = m44.a("h", (long)-7817503354146822318L, (long)l);
                                try {
                                    bl = object instanceof lkn;
                                    if (callSite3 != null) break block12;
                                    if (!bl) break block13;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("h", (Object)illegalArgumentException, (long)-7764633427831521130L, (long)l);
                                }
                                lkn2 = (lkn)object;
                                try {
                                    try {
                                        try {
                                            try {
                                                callSite = m44.a("v", (Object)this, (long)-8289551094060929842L, (long)l);
                                                if (callSite3 != null) break block14;
                                                if (callSite == null) break block15;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw m44.a("h", (Object)illegalArgumentException, (long)-7764633427831521130L, (long)l);
                                            }
                                            callSite2 = m44.a("v", (Object)lkn2, (long)-8289551094060929842L, (long)l);
                                            if (callSite3 != null) break block16;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("h", (Object)illegalArgumentException, (long)-7764633427831521130L, (long)l);
                                        }
                                        if (callSite2 == null) break block17;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("h", (Object)illegalArgumentException, (long)-7764633427831521130L, (long)l);
                                    }
                                    callSite2 = m44.a("v", (Object)this, (long)-8289551094060929842L, (long)l);
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("h", (Object)illegalArgumentException, (long)-7764633427831521130L, (long)l);
                                }
                            }
                            return callSite2.equals(m44.a("v", (Object)lkn2, (long)-8289551094060929842L, (long)l));
                        }
                        return false;
                    }
                    callSite = m44.a("v", (Object)lkn2, (long)-8289551094060929842L, (long)l);
                }
                try {
                    bl2 = callSite == null;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("h", (Object)illegalArgumentException, (long)-7764633427831521130L, (long)l);
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    public String D(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l;
            block4: {
                long l2 = (Long)objectArray[0];
                l = l2 ^ 0x787C433384F7L;
                CallSite callSite2 = m44.a("l", (long)8020613449256049566L, (long)l2);
                try {
                    try {
                        callSite = m44.a("r", (Object)this, (long)8086721390948634626L, (long)l2);
                        if (callSite2 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)7562155622125108314L, (long)l2);
                    }
                    callSite = m44.a("r", (Object)this, (long)8086721390948634626L, (long)l2);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)7562155622125108314L, (long)l2);
                }
            }
            return callSite.g(l);
        }
        return null;
    }

    public boolean a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return true;
    }

    public boolean S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public lkn(long l, jf jf2) {
        block4: {
            block5: {
                l = a ^ l;
                CallSite callSite = m44.a("m", (long)-4913453387448824033L, (long)l);
                CallSite callSite2 = callSite;
                try {
                    try {
                        if (callSite2 != null) break block4;
                        if (jf2 != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("m", (Object)illegalArgumentException, (long)-4867488248094414629L, (long)l);
                    }
                    throw new IllegalArgumentException();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("m", (Object)illegalArgumentException, (long)-4867488248094414629L, (long)l);
                }
            }
            m44.a("q", (Object)this, (jf)jf2, (long)-6577270859197119357L, (long)l);
        }
    }

    public boolean Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return true;
    }

    public int n(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return -1;
    }

    public String x(Object[] objectArray) {
        block5: {
            lkn lkn2;
            long l;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                l = l2 ^ 0x6FBF11526654L;
                CallSite callSite = m44.a("n", (long)1888294398372277988L, (long)l2);
                try {
                    try {
                        lkn2 = this;
                        if (callSite != null) break block4;
                        if (m44.a("p", (Object)lkn2, (long)379339127851427192L, (long)l2) == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("n", (Object)illegalArgumentException, (long)2128035310855719200L, (long)l2);
                    }
                    lkn2 = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)2128035310855719200L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l;
            return m44.a("q", (Object)lkn2, (Object)objectArray2, (long)1893741291477181555L, (long)l2);
        }
        return b;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x2A82DBDC24L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        byte[] byArray3 = cipher.doFinal("~\u00f7\u00cf#\u00b8\\1U".getBytes("ISO-8859-1"));
        b = lkn.a(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = 3255101156753175687L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                c = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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
