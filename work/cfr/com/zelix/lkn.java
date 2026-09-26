/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.jf;
import com.zelix.js;
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
    private static final long a = prr.a(5521934524194220678L, -178650930533102164L, MethodHandles.lookup().lookupClass()).a(233662047112840L);
    private static final String b;
    private static final long c;

    @Override
    public String U(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x2AABF27F19E1L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("r", (Object)this, (Object)objectArray2, (long)8138204630560932469L, (long)l10);
    }

    @Override
    public String B(Object[] objectArray) {
        CallSite callSite;
        block13: {
            int n10;
            Object object;
            block11: {
                CallSite callSite2;
                long l10;
                block12: {
                    CallSite callSite3;
                    block9: {
                        block10: {
                            l10 = (Long)objectArray[0];
                            long l11 = l10 ^ 0xF10DCA4132EL;
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l11;
                            object = m44.a("u", (Object)this, (Object)objectArray2, (long)8808918024281983162L, (long)l10);
                            callSite2 = m44.a("j", (long)8962443080938850480L, (long)l10);
                            try {
                                try {
                                    callSite3 = object;
                                    if (callSite2 != null) break block9;
                                    if (callSite3 != null) break block10;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("j", (Object)illegalArgumentException, (long)8925047492003327860L, (long)l10);
                                }
                                return null;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("j", (Object)illegalArgumentException, (long)8925047492003327860L, (long)l10);
                            }
                        }
                        callSite3 = object;
                    }
                    int n11 = ((String)((Object)callSite3)).lastIndexOf((int)c);
                    try {
                        n10 = n11;
                        if (callSite2 != null) break block11;
                        if (n10 <= -1) break block12;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("j", (Object)illegalArgumentException, (long)8925047492003327860L, (long)l10);
                    }
                    object = ((String)object).substring(n11 + 1);
                }
                try {
                    callSite = object;
                    if (callSite2 != null) break block13;
                    n10 = ((String)((Object)callSite)).endsWith(";") ? 1 : 0;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("j", (Object)illegalArgumentException, (long)8925047492003327860L, (long)l10);
                }
            }
            if (n10 != 0) {
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
                long l10 = a ^ 0x205DA1214364L;
                CallSite callSite2 = m44.a("h", (long)-5176174423955976966L, (long)l10);
                try {
                    try {
                        callSite = m44.a("v", (Object)this, (long)-6386746505217243290L, (long)l10);
                        if (callSite2 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("h", (Object)illegalArgumentException, (long)-4641427952914289858L, (long)l10);
                    }
                    callSite = m44.a("v", (Object)this, (long)-6386746505217243290L, (long)l10);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("h", (Object)illegalArgumentException, (long)-4641427952914289858L, (long)l10);
                }
            }
            return ((js)((Object)callSite)).hashCode();
        }
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2;
        block12: {
            block13: {
                boolean bl3;
                CallSite callSite;
                long l10;
                block14: {
                    lkn lkn2;
                    block15: {
                        block17: {
                            CallSite callSite2;
                            block16: {
                                l10 = a ^ 0xE8ADC2268CCL;
                                CallSite callSite3 = m44.a("h", (long)-7817503354146822318L, (long)l10);
                                try {
                                    bl2 = object instanceof lkn;
                                    if (callSite3 != null) break block12;
                                    if (!bl2) break block13;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("h", (Object)illegalArgumentException, (long)-7764633427831521130L, (long)l10);
                                }
                                lkn2 = (lkn)object;
                                try {
                                    try {
                                        try {
                                            try {
                                                callSite = m44.a("v", (Object)this, (long)-8289551094060929842L, (long)l10);
                                                if (callSite3 != null) break block14;
                                                if (callSite == null) break block15;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw m44.a("h", (Object)illegalArgumentException, (long)-7764633427831521130L, (long)l10);
                                            }
                                            callSite2 = m44.a("v", (Object)lkn2, (long)-8289551094060929842L, (long)l10);
                                            if (callSite3 != null) break block16;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("h", (Object)illegalArgumentException, (long)-7764633427831521130L, (long)l10);
                                        }
                                        if (callSite2 == null) break block17;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("h", (Object)illegalArgumentException, (long)-7764633427831521130L, (long)l10);
                                    }
                                    callSite2 = m44.a("v", (Object)this, (long)-8289551094060929842L, (long)l10);
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("h", (Object)illegalArgumentException, (long)-7764633427831521130L, (long)l10);
                                }
                            }
                            return ((js)((Object)callSite2)).equals(m44.a("v", (Object)lkn2, (long)-8289551094060929842L, (long)l10));
                        }
                        return false;
                    }
                    callSite = m44.a("v", (Object)lkn2, (long)-8289551094060929842L, (long)l10);
                }
                try {
                    bl3 = callSite == null;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("h", (Object)illegalArgumentException, (long)-7764633427831521130L, (long)l10);
                }
                return bl3;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public String D(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l10;
            block4: {
                long l11 = (Long)objectArray[0];
                l10 = l11 ^ 0x787C433384F7L;
                CallSite callSite2 = m44.a("l", (long)8020613449256049566L, (long)l11);
                try {
                    try {
                        callSite = m44.a("r", (Object)this, (long)8086721390948634626L, (long)l11);
                        if (callSite2 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)7562155622125108314L, (long)l11);
                    }
                    callSite = m44.a("r", (Object)this, (long)8086721390948634626L, (long)l11);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)7562155622125108314L, (long)l11);
                }
            }
            return ((jf)((Object)callSite)).g(l10);
        }
        return null;
    }

    @Override
    public boolean a(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return true;
    }

    @Override
    public boolean S(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    public lkn(long l10, jf jf2) {
        block4: {
            block5: {
                l10 = a ^ l10;
                CallSite callSite = m44.a("m", (long)-4913453387448824033L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    try {
                        if (callSite2 != null) break block4;
                        if (jf2 != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("m", (Object)illegalArgumentException, (long)-4867488248094414629L, (long)l10);
                    }
                    throw new IllegalArgumentException();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("m", (Object)illegalArgumentException, (long)-4867488248094414629L, (long)l10);
                }
            }
            m44.a("q", (Object)this, (jf)jf2, (long)-6577270859197119357L, (long)l10);
        }
    }

    @Override
    public boolean Y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return true;
    }

    @Override
    public int n(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return -1;
    }

    @Override
    public String x(Object[] objectArray) {
        block5: {
            lkn lkn2;
            long l10;
            long l11;
            block4: {
                l11 = (Long)objectArray[0];
                l10 = l11 ^ 0x6FBF11526654L;
                CallSite callSite = m44.a("n", (long)1888294398372277988L, (long)l11);
                try {
                    try {
                        lkn2 = this;
                        if (callSite != null) break block4;
                        if (m44.a("p", (Object)lkn2, (long)379339127851427192L, (long)l11) == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("n", (Object)illegalArgumentException, (long)2128035310855719200L, (long)l11);
                    }
                    lkn2 = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)2128035310855719200L, (long)l11);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l10;
            return m44.a("q", (Object)lkn2, (Object)objectArray2, (long)1893741291477181555L, (long)l11);
        }
        return b;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x2A82DBDC24L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        byte[] byArray3 = cipher.doFinal("~\u00f7\u00cf#\u00b8\\1U".getBytes("ISO-8859-1"));
        b = lkn.a(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l11 = 3255101156753175687L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                c = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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

