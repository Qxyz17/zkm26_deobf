/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.dd;
import com.zelix.fy;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.ltv;
import com.zelix.lws;
import com.zelix.lyt;
import com.zelix.lyw;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.uf;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lym
extends lyw
implements fy {
    private boolean q;
    private boolean m;
    private static final long a = prr.a((long)6539672757231219182L, (long)-7703377051839132900L, MethodHandles.lookup().lookupClass()).a(76134186578523L);
    private static final String d;

    public boolean V(Object[] objectArray) {
        boolean bl;
        block4: {
            block5: {
                long l = (Long)objectArray[0];
                long l2 = l ^ 0x37E4BE2A06ABL;
                dd dd2 = (dd)this.V(0);
                CallSite callSite = m44.a("j", (long)-3577336447021134180L, (long)l);
                try {
                    try {
                        bl = dd2 instanceof lws;
                        if (callSite == false) break block4;
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)-3742684284319444575L, (long)l);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l2;
                    return (boolean)m44.a("u", (Object)((lws)dd2), (Object)objectArray2, (long)-3565213888323211480L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)-3742684284319444575L, (long)l);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean u(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return (boolean)m44.a("w", (Object)((Object)this), (long)2503298406719287530L, (long)l);
    }

    public lym(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x66A91E18D6CCL;
        int n2 = (int)(l2 >>> 48);
        long l3 = l2 << 16 >>> 16;
        super((char)n2, n, l3);
    }

    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        m44.a("r", (Object)((Object)this), (boolean)true, (long)2633670299906998854L, (long)l);
    }

    public void M(Object[] objectArray) {
        block5: {
            lmu lmu2;
            long l;
            long l2;
            block4: {
                lmu lmu3 = (lmu)objectArray[0];
                lqu lqu2 = (lqu)objectArray[1];
                l2 = (Long)objectArray[2];
                long l3 = l2;
                l = l3 ^ 0x7C7B19E51E83L;
                long l4 = l3 ^ 0L;
                CallSite callSite = m44.a("h", (long)-6823249310977527178L, (long)l2);
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = l4;
                objectArray2[1] = lqu2;
                objectArray2[0] = this;
                m44.a("w", (Object)this.V(0), (Object)objectArray2, (long)-6656114929610942631L, (long)l2);
                CallSite callSite2 = callSite;
                try {
                    try {
                        lmu2 = lmu3;
                        if (callSite2 != false) break block4;
                        if (!(lmu2 instanceof ltv)) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)-4945707405732174093L, (long)l2);
                    }
                    lmu2 = lmu3;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)-4945707405732174093L, (long)l2);
                }
            }
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = this;
            objectArray3[0] = l;
            m44.a("w", (Object)((ltv)lmu2), (Object)objectArray3, (long)-6406324941748262110L, (long)l2);
        }
    }

    public String l(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x5429BAC532C0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("q", (Object)((dd)this.V(0)), (Object)objectArray2, (long)-7608408004353192660L, (long)l);
    }

    public boolean b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return (boolean)m44.a("u", (Object)((Object)this), (long)3474995430636852979L, (long)l);
    }

    public void U(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        m44.a("r", (Object)((Object)this), (boolean)true, (long)5868973149366944549L, (long)l);
    }

    public String e(Object[] objectArray) {
        Object object;
        StringBuilder stringBuilder;
        long l;
        block7: {
            block8: {
                l = (Long)objectArray[0];
                long l2 = l ^ 0L;
                CallSite callSite = m44.a("n", (long)-6782168670771776808L, (long)l);
                try {
                    try {
                        stringBuilder = new StringBuilder();
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l2;
                        object = m44.a("q", (Object)((dd)this.V(0)), (Object)objectArray2, (long)-6581495104713834516L, (long)l);
                        if (callSite != false) break block7;
                        stringBuilder = stringBuilder.append((String)object);
                        if (m44.a("p", (Object)((Object)this), (long)-6455172513892436931L, (long)l) == false) break block8;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)-4903498390982318499L, (long)l);
                    }
                    object = "^";
                    break block7;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)-4903498390982318499L, (long)l);
                }
            }
            object = "";
        }
        try {
            if (l > 0L) {
                stringBuilder = stringBuilder.append((String)object);
                object = m44.a("p", (Object)((Object)this), (long)-5092236486299574370L, (long)l) != false ? d : "";
            }
        }
        catch (n9 n94) {
            throw m44.a("n", (Object)((Object)n94), (long)-4903498390982318499L, (long)l);
        }
        return stringBuilder.append((String)object).toString();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public double t(Object[] var1_1) {
        block41: {
            block47: {
                block45: {
                    block46: {
                        block44: {
                            block43: {
                                block42: {
                                    block40: {
                                        block37: {
                                            block48: {
                                                block39: {
                                                    block38: {
                                                        block36: {
                                                            var2_2 = (uf)var1_1[0];
                                                            var3_3 = (Long)var1_1[1];
                                                            var5_4 = (lyt)var1_1[2];
                                                            v0 = var3_3;
                                                            var6_5 = v0 ^ 126187889406435L;
                                                            var8_6 = v0 ^ 54200294757406L;
                                                            var10_7 = v0 ^ 75817767736107L;
                                                            var12_8 = v0 ^ 25188888643874L;
                                                            var14_9 = v0 ^ 136440750566768L;
                                                            var16_10 = v0 ^ 101616260879296L;
                                                            var19_11 = 1.0;
                                                            var21_12 = (dd)this.V(0);
                                                            var18_13 = m44.a("m", (long)-5563175396427406861L, (long)var3_3);
                                                            try {
                                                                try {
                                                                    v1 = var21_12;
                                                                    if (var18_13 != false) break block36;
                                                                    if (!(v1 instanceof lws)) break block37;
                                                                }
                                                                catch (n9 v2) {
                                                                    throw m44.a("m", (Object)v2, (long)-6280266631816825482L, (long)var3_3);
                                                                }
                                                                v1 = var21_12;
                                                            }
                                                            catch (n9 v3) {
                                                                throw m44.a("m", (Object)v3, (long)-6280266631816825482L, (long)var3_3);
                                                            }
                                                        }
                                                        v4 = new Object[1];
                                                        v4[0] = var10_7;
                                                        var22_14 = m44.a("r", (Object)v1, (Object)v4, (long)-5223452200171066169L, (long)var3_3);
                                                        try {
                                                            v5 = var22_14;
                                                            v6 /* !! */  = var18_13;
                                                            if (var3_3 > 0L) {
                                                                if (v6 /* !! */  != false) break block38;
                                                                if (v5 == null) break block37;
                                                            }
                                                            ** GOTO lbl48
                                                        }
                                                        catch (n9 v7) {
                                                            throw m44.a("m", (Object)v7, (long)-6280266631816825482L, (long)var3_3);
                                                        }
                                                        v5 = var22_14;
                                                    }
                                                    try {
                                                        try {
                                                            v6 /* !! */  = (CallSite)true;
lbl48:
                                                            // 2 sources

                                                            v8 = new Object[v6 /* !! */ ];
                                                            v8[0] = v5;
                                                            v9 = m44.a("m", (Object)v8, (long)-6320424018681079622L, (long)var3_3);
                                                            if (var18_13 != false) break block39;
                                                            if (v9 != false) break block37;
                                                        }
                                                        catch (n9 v10) {
                                                            throw m44.a("m", (Object)v10, (long)-6280266631816825482L, (long)var3_3);
                                                        }
                                                        v11 = new Object[2];
                                                        v11[1] = var14_9;
                                                        v11[0] = var22_14;
                                                        v9 = m44.a("m", (Object)v11, (long)-5587688783752955443L, (long)var3_3);
                                                    }
                                                    catch (n9 v12) {
                                                        throw m44.a("m", (Object)v12, (long)-6280266631816825482L, (long)var3_3);
                                                    }
                                                }
                                                if (v9 != false) break block48;
                                                var19_11 *= 0.1;
                                                if (var3_3 < 0L || var18_13 == false) break block37;
                                            }
                                            var19_11 *= 0.5;
                                        }
                                        try {
                                            v13 = var2_2;
                                            if (var3_3 < 0L || var18_13 != false) break block40;
                                            if (v13 == null) break block41;
                                        }
                                        catch (n9 v14) {
                                            throw m44.a("m", (Object)v14, (long)-6280266631816825482L, (long)var3_3);
                                        }
                                        v13 = var2_2;
                                    }
                                    try {
                                        v15 = new Object[1];
                                        v15[0] = var12_8;
                                        v16 = m44.a("r", (Object)v13, (Object)v15, (long)-5343628758695010281L, (long)var3_3);
                                        v17 = var18_13;
                                        if (var3_3 <= 0L) ** GOTO lbl105
                                        if (v17 != false) break block42;
                                        if (v16 != false) {
                                        }
                                        ** GOTO lbl98
                                    }
                                    catch (n9 v18) {
                                        throw m44.a("m", (Object)v18, (long)-6280266631816825482L, (long)var3_3);
                                    }
                                    var19_11 *= 0.5;
                                    try {
                                        v16 = var18_13;
                                        if (var3_3 <= 0L) break block42;
                                        if (v16 == false) break block43;
lbl98:
                                        // 2 sources

                                        v16 = m44.a("r", (Object)var2_2, (Object)new Object[0], (long)-5494406258470160310L, (long)var3_3);
                                    }
                                    catch (n9 v19) {
                                        throw m44.a("m", (Object)v19, (long)-6280266631816825482L, (long)var3_3);
                                    }
                                }
                                try {
                                    v17 = var18_13;
lbl105:
                                    // 2 sources

                                    if (var3_3 >= 0L) {
                                        if (v17 != false) break block44;
                                        if (v16 == false) break block43;
                                    }
                                    ** GOTO lbl121
                                }
                                catch (n9 v20) {
                                    throw m44.a("m", (Object)v20, (long)-6280266631816825482L, (long)var3_3);
                                }
                                var19_11 *= 0.5;
                            }
                            v21 = new Object[1];
                            v21[0] = var16_10;
                            v16 = m44.a("r", (Object)var2_2, (Object)v21, (long)-5523721727619158382L, (long)var3_3);
                        }
                        try {
                            v17 = var18_13;
lbl121:
                            // 2 sources

                            if (var3_3 >= 0L) {
                                if (v17 != false) break block45;
                                if (v16 == false) break block46;
                            }
                            ** GOTO lbl137
                        }
                        catch (n9 v22) {
                            throw m44.a("m", (Object)v22, (long)-6280266631816825482L, (long)var3_3);
                        }
                        var19_11 *= 0.1;
                    }
                    v23 = new Object[1];
                    v23[0] = var6_5;
                    v16 = m44.a("r", (Object)var2_2, (Object)v23, (long)-5444633599538851529L, (long)var3_3);
                }
                try {
                    v17 = var18_13;
lbl137:
                    // 2 sources

                    if (v17 != false) break block47;
                    if (v16 != false) {
                    }
                    ** GOTO lbl148
                }
                catch (n9 v24) {
                    throw m44.a("m", (Object)v24, (long)-6280266631816825482L, (long)var3_3);
                }
                var19_11 *= 0.1;
                try {
                    v16 = var18_13;
                    if (var3_3 <= 0L) break block47;
                    if (v16 == false) break block41;
lbl148:
                    // 2 sources

                    v25 = new Object[1];
                    v25[0] = var8_6;
                    v16 = m44.a("r", (Object)var2_2, (Object)v25, (long)-6019476643098143884L, (long)var3_3);
                }
                catch (n9 v26) {
                    throw m44.a("m", (Object)v26, (long)-6280266631816825482L, (long)var3_3);
                }
            }
            if (v16 != false) {
                var19_11 *= 0.1;
            }
        }
        if (var5_4 != null) {
            var19_11 *= 0.1;
        }
        return var19_11;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x54BDCC6B1A7L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("6\u00dc\u00c0\u0005Ct\u00d5$".getBytes("ISO-8859-1"));
                d = lym.b(byArray3).intern();
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

    private static String b(byte[] byArray) {
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
