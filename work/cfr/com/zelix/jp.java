/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
import com.zelix.jj;
import com.zelix.l6q;
import com.zelix.lbq;
import com.zelix.lkc;
import com.zelix.lo5;
import com.zelix.lod;
import com.zelix.luz;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.zn;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class jp
extends jj
implements lbq {
    private Map B;
    private int l;
    private String q;
    private String U;
    private l6q R;
    private l6q L;
    private String k;
    private static final long a = prr.a(1393985388881265120L, -736972656539854614L, MethodHandles.lookup().lookupClass()).a(34640962189707L);
    private static final long b;

    @Override
    protected void k(Object[] objectArray) {
        jp jp2;
        long l10;
        lkc lkc2;
        long l11;
        block26: {
            CallSite callSite;
            long l12;
            block24: {
                CallSite callSite2;
                block25: {
                    jp jp3;
                    long l13;
                    block23: {
                        CallSite callSite3;
                        long l14;
                        block21: {
                            long l15;
                            block22: {
                                l11 = (Long)objectArray[0];
                                lkc2 = (lkc)objectArray[1];
                                long l16 = l11;
                                l13 = l16 ^ 0x4EC0BA064380L;
                                l14 = l16 ^ 0x2402D5685986L;
                                l10 = l16 ^ 0x5629E783773BL;
                                l12 = l16 ^ 0x78BE60F150F8L;
                                l15 = l16 ^ 0x9DF4433A298L;
                                callSite2 = m44.a("j", (long)7374193648435527192L, (long)l11);
                                try {
                                    try {
                                        callSite3 = m44.a("t", (Object)this, (long)7407065987072040920L, (long)l11);
                                        if (callSite2 != null) break block21;
                                        if (callSite3 != null) break block22;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("j", (Object)n92, (long)7350749101694170133L, (long)l11);
                                    }
                                    m44.a("v", (Object)this, (String)((Object)m44.a("t", (Object)this, (long)7171610624818500765L, (long)l11)), (long)7407065987072040920L, (long)l11);
                                }
                                catch (n9 n93) {
                                    throw m44.a("j", (Object)n93, (long)7350749101694170133L, (long)l11);
                                }
                            }
                            try {
                                Object[] objectArray2 = new Object[3];
                                objectArray2[2] = l15;
                                objectArray2[1] = m44.a("t", (Object)this, (long)7171610624818500765L, (long)l11);
                                objectArray2[0] = m44.a("t", (Object)this, (long)7407065987072040920L, (long)l11);
                                m44.a("u", (Object)lkc2, (Object)objectArray2, (long)8991495145091779801L, (long)l11);
                                jp3 = this;
                                if (l11 < 0L || callSite2 != null) break block23;
                                callSite3 = m44.a("t", (Object)jp3, (long)7280821252535120458L, (long)l11);
                            }
                            catch (n9 n94) {
                                throw m44.a("j", (Object)n94, (long)7350749101694170133L, (long)l11);
                            }
                        }
                        try {
                            if (callSite3 != null) {
                                Object[] objectArray3 = new Object[3];
                                objectArray3[2] = m44.a("t", (Object)this, (long)7280821252535120458L, (long)l11);
                                objectArray3[1] = l14;
                                objectArray3[0] = m44.a("t", (Object)this, (long)7171610624818500765L, (long)l11);
                                m44.a("u", (Object)lkc2, (Object)objectArray3, (long)7277253703444827604L, (long)l11);
                            }
                        }
                        catch (n9 n95) {
                            throw m44.a("j", (Object)n95, (long)7350749101694170133L, (long)l11);
                        }
                        jp3 = this;
                    }
                    try {
                        try {
                            callSite = m44.a("t", (Object)jp3, (long)8836503211399188958L, (long)l11);
                            if (l11 <= 0L || callSite2 != null) break block24;
                            if (callSite == null) break block25;
                        }
                        catch (n9 n96) {
                            throw m44.a("j", (Object)n96, (long)7350749101694170133L, (long)l11);
                        }
                        Object[] objectArray4 = new Object[3];
                        objectArray4[2] = l13;
                        objectArray4[1] = m44.a("t", (Object)this, (long)8836503211399188958L, (long)l11);
                        objectArray4[0] = m44.a("t", (Object)this, (long)7171610624818500765L, (long)l11);
                        m44.a("u", (Object)lkc2, (Object)objectArray4, (long)9021025199042776396L, (long)l11);
                    }
                    catch (n9 n97) {
                        throw m44.a("j", (Object)n97, (long)7350749101694170133L, (long)l11);
                    }
                }
                try {
                    jp2 = this;
                    if (l11 <= 0L || callSite2 != null) break block26;
                    callSite = m44.a("t", (Object)jp2, (long)8875868749597114170L, (long)l11);
                }
                catch (n9 n98) {
                    throw m44.a("j", (Object)n98, (long)7350749101694170133L, (long)l11);
                }
            }
            try {
                if (callSite != null) {
                    Object[] objectArray5 = new Object[3];
                    objectArray5[2] = m44.a("t", (Object)this, (long)8875868749597114170L, (long)l11);
                    objectArray5[1] = m44.a("t", (Object)this, (long)7171610624818500765L, (long)l11);
                    objectArray5[0] = l12;
                    m44.a("u", (Object)lkc2, (Object)objectArray5, (long)7283411183887753857L, (long)l11);
                }
            }
            catch (n9 n99) {
                throw m44.a("j", (Object)n99, (long)7350749101694170133L, (long)l11);
            }
            jp2 = this;
        }
        try {
            if (jp2.B != null) {
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = this.B;
                objectArray6[1] = l10;
                objectArray6[0] = m44.a("t", (Object)this, (long)7171610624818500765L, (long)l11);
                m44.a("u", (Object)lkc2, (Object)objectArray6, (long)7386629654947874465L, (long)l11);
            }
        }
        catch (n9 n910) {
            throw m44.a("j", (Object)n910, (long)7350749101694170133L, (long)l11);
        }
    }

    void W(Integer n10, Integer n11, int n12, byte by2, int n13) {
        block4: {
            Object object;
            block5: {
                long l10;
                long l11 = l10 = ((long)n12 << 32 | (long)by2 << 56 >>> 32 | (long)n13 << 40 >>> 40) ^ a;
                long l12 = l11 ^ 0x2522F87CA244L;
                long l13 = l11 ^ 0x61CAF440CDA4L;
                int n14 = (int)(l13 >>> 32);
                int n15 = (int)(l13 << 32 >>> 48);
                int n16 = (int)(l13 << 48 >>> 48);
                CallSite callSite = m44.a("n", (long)2684733553729912076L, (long)l10);
                try {
                    try {
                        object = this.B;
                        if (callSite != null) break block4;
                        if (object != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)2672723240464742145L, (long)l10);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l12;
                    objectArray[0] = cf.x((int)m44.a("p", (Object)this, (long)2607856714030170235L, (long)l10), n14, (char)n15, (short)n16);
                    this.B = m44.a("n", (Object)objectArray, (long)2775740241692304229L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)2672723240464742145L, (long)l10);
                }
            }
            object = this.B.put(n10, n11);
        }
    }

    public void t(Object[] objectArray) {
        CallSite callSite;
        long l10;
        int n10;
        String string;
        String string2;
        String string3;
        block2: {
            long l11;
            block3: {
                string3 = (String)objectArray[0];
                l11 = (Long)objectArray[1];
                string2 = (String)objectArray[2];
                string = (String)objectArray[3];
                n10 = (Integer)objectArray[4];
                long l12 = l11 = a ^ l11;
                long l13 = l12 ^ 0xD48B8011EF7L;
                long l14 = l12 ^ 0x75BD89E19CADL;
                int n11 = (int)(l14 >>> 32);
                int n12 = (int)(l14 << 32 >>> 48);
                int n13 = (int)(l14 << 48 >>> 48);
                l10 = l12 ^ 0x7EFEF38406D8L;
                CallSite callSite2 = m44.a("o", (long)8379794306856512517L, (long)l11);
                try {
                    callSite = m44.a("q", (Object)this, (long)7547175708271379395L, (long)l11);
                    if (callSite2 != null) break block2;
                    if (callSite != null) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)n92, (long)8367265719623460360L, (long)l11);
                }
                int n14 = cf.x((int)m44.a("q", (Object)this, (long)8447032896287641970L, (long)l11), n11, (char)n12, (short)n13);
                m44.a("s", (Object)this, (l6q)new l6q(l13, n14), (long)7547175708271379395L, (long)l11);
            }
            callSite = m44.a("q", (Object)this, (long)7547175708271379395L, (long)l11);
        }
        ((l6q)((Object)callSite)).t(new lo5(string2, string, n10), string3, l10);
    }

    void W(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        m44.a("v", (Object)this, (String)string, (long)-8364463832255204616L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void s(Object[] var1_1) {
        block25: {
            block27: {
                block26: {
                    block24: {
                        block22: {
                            block23: {
                                block20: {
                                    block21: {
                                        block19: {
                                            var7_2 = (String)var1_1[0];
                                            var13_3 = (String)var1_1[1];
                                            var5_4 = (String)var1_1[2];
                                            var2_5 = (Integer)var1_1[3];
                                            var9_6 = (String)var1_1[4];
                                            var10_7 = (String)var1_1[5];
                                            var6_8 = ((Boolean)var1_1[6]).booleanValue();
                                            var4_9 = (String)var1_1[7];
                                            var3_10 = (String)var1_1[8];
                                            var8_11 = (Boolean)var1_1[9];
                                            var11_12 = (Long)var1_1[10];
                                            v0 = var11_12 = jp.a ^ var11_12;
                                            var14_13 = v0 ^ 105270834957347L;
                                            var16_14 = v0 ^ 118935168662039L;
                                            var18_15 = v0 ^ 48413093401612L;
                                            var20_16 = m44.a("k", (long)7394717558785310417L, (long)var11_12);
                                            try {
                                                try {
                                                    v1 = this;
                                                    if (var20_16 != null) ** GOTO lbl31
                                                    if (m44.a("u", (Object)v1, (long)8927363598325710835L, (long)var11_12) != null) break block19;
                                                }
                                                catch (n9 v2) {
                                                    throw m44.a("k", (Object)v2, (long)7406782160709727452L, (long)var11_12);
                                                }
                                                v1 = this;
                                            }
                                            catch (n9 v3) {
                                                throw m44.a("k", (Object)v3, (long)7406782160709727452L, (long)var11_12);
                                            }
lbl31:
                                            // 2 sources

                                            m44.a("w", (Object)v1, (l6q)new l6q(var14_13, (int)m44.a("k", (int)((int)jp.b), (int)m44.a("u", (Object)this, (long)7488836767504368550L, (long)var11_12), (long)9167970464924762628L, (long)var11_12)), (long)8927363598325710835L, (long)var11_12);
                                        }
                                        try {
                                            v4 = var13_3;
                                            v5 = var20_16;
                                            if (var11_12 > 0L) {
                                                if (v5 != null) break block20;
                                                if (v4 != null) break block21;
                                            }
                                            ** GOTO lbl49
                                        }
                                        catch (n9 v6) {
                                            throw m44.a("k", (Object)v6, (long)7406782160709727452L, (long)var11_12);
                                        }
                                        var13_3 = "";
                                    }
                                    v4 = var10_7;
                                }
                                try {
                                    v5 = var20_16;
lbl49:
                                    // 2 sources

                                    if (var11_12 >= 0L) {
                                        if (v5 != null) break block22;
                                        if (v4 != null) break block23;
                                    }
                                    ** GOTO lbl63
                                }
                                catch (n9 v7) {
                                    throw m44.a("k", (Object)v7, (long)7406782160709727452L, (long)var11_12);
                                }
                                var10_7 = "";
                            }
                            v4 = var4_9;
                        }
                        try {
                            if (var11_12 <= 0L) break block24;
                            v5 = var20_16;
lbl63:
                            // 2 sources

                            if (v5 != null) break block24;
                            if (v4 != null) {
                            }
                            ** GOTO lbl80
                        }
                        catch (n9 v8) {
                            throw m44.a("k", (Object)v8, (long)7406782160709727452L, (long)var11_12);
                        }
                        v4 = var4_9;
                    }
                    try {
                        try {
                            try {
                                v9 = v4.length();
                                if (var20_16 != null) break block25;
                                if (v9 > 0) break block26;
                            }
                            catch (n9 v10) {
                                throw m44.a("k", (Object)v10, (long)7406782160709727452L, (long)var11_12);
                            }
lbl80:
                            // 2 sources

                            v9 = var6_8;
                            if (var20_16 != null) break block25;
                        }
                        catch (n9 v11) {
                            throw m44.a("k", (Object)v11, (long)7406782160709727452L, (long)var11_12);
                        }
                        if (v9 == 0) break block27;
                    }
                    catch (n9 v12) {
                        throw m44.a("k", (Object)v12, (long)7406782160709727452L, (long)var11_12);
                    }
                }
                v9 = 1;
                break block25;
            }
            v9 = 0;
        }
        var21_17 = v9;
        m44.a("u", (Object)this, (long)8927363598325710835L, (long)var11_12).t(new lod(var7_2, var13_3, var5_4, var2_5), new luz(var9_6, var10_7, var16_14, var6_8, var4_9, var3_10, var21_17, var8_11), var18_15);
    }

    @Override
    protected void O(Object[] objectArray) {
        zn zn2 = (zn)objectArray[0];
        lkc lkc2 = (lkc)objectArray[1];
        int n10 = (Integer)objectArray[2];
        long l10 = (Long)objectArray[3];
        long l11 = l10 ^ 0x42A38934E5A4L;
        m44.a("r", (Object)this, (int)n10, (long)6856895623270808419L, (long)l10);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("q", (Object)lkc2, (Object)objectArray2, (long)6819946720867337981L, (long)l10);
    }

    void S(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l10 = a ^ l10;
        m44.a("w", (Object)this, (String)string, (long)8825800711493807419L, (long)l10);
    }

    @Override
    public void U(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("s", (Object)this, (String)string, (long)-593398182344146728L, (long)l10);
    }

    public jp(int n10) {
        super(n10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x6183572D616L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = -4114181606452777393L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static n9 b(n9 n92) {
        return n92;
    }
}

