/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._e;
import com.zelix._f;
import com.zelix.b4;
import com.zelix.bf;
import com.zelix.df;
import com.zelix.in;
import com.zelix.l62;
import com.zelix.l6q;
import com.zelix.l6w;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ol;
import com.zelix.prr;
import com.zelix.w;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class l6m
extends l6w {
    in g;
    private List K;
    private boolean Z;
    private String l;
    private boolean S;
    private boolean C;
    private String w;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long h;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public String S(Object[] var1_1) {
        block67: {
            block68: {
                block59: {
                    block64: {
                        block65: {
                            block63: {
                                block62: {
                                    block60: {
                                        block58: {
                                            var4_2 = (l62)var1_1[0];
                                            var17_3 = (bf)var1_1[1];
                                            var9_4 = (String)var1_1[2];
                                            var3_5 = (String)var1_1[3];
                                            var5_6 = (String)var1_1[4];
                                            var12_7 = (Long)var1_1[5];
                                            var8_8 = (Map)var1_1[6];
                                            var10_9 = (l6q)var1_1[7];
                                            var7_10 = (l6q)var1_1[8];
                                            var2_11 = (Map)var1_1[9];
                                            var14_12 = (Boolean)var1_1[10];
                                            var15_13 = (Map)var1_1[11];
                                            var16_14 = (HashMap)var1_1[12];
                                            var11_15 = (df)var1_1[13];
                                            var6_16 = (ol)var1_1[14];
                                            v0 = var12_7;
                                            v1 = v0 ^ 138193176501146L;
                                            var18_17 = (int)(v1 >>> 48);
                                            var19_18 = (int)(v1 << 16 >>> 32);
                                            var20_19 = (int)(v1 << 48 >>> 48);
                                            var21_20 = v0 ^ 129475040903998L;
                                            var23_21 = v0 ^ 51568932695404L;
                                            var25_22 = v0 ^ 117076549656609L;
                                            var27_23 = v0 ^ 4401294540411L;
                                            var29_24 = m44.a("l", (long)-8611702006696449999L, (long)var12_7);
                                            try {
                                                try {
                                                    v2 /* !! */  = m44.a("r", (Object)this, (long)-8559483441507971281L, (long)var12_7);
                                                    if (var29_24 != null) break block58;
                                                    if (v2 /* !! */  == true) break block59;
                                                }
                                                catch (n9 v3) {
                                                    throw m44.a("l", (Object)v3, (long)-7529786886311518516L, (long)var12_7);
                                                }
                                                v2 /* !! */  = (CallSite)var9_4.startsWith((String)l6m.a("t", (int)3512, (long)(5895664019454932151L ^ var12_7)));
                                            }
                                            catch (n9 v4) {
                                                throw m44.a("l", (Object)v4, (long)-7529786886311518516L, (long)var12_7);
                                            }
                                        }
                                        try {
                                            block61: {
                                                try {
                                                    try {
                                                        try {
                                                            v5 = var29_24;
                                                            if (var12_7 > 0L) {
                                                                if (v5 != null) break block60;
                                                                if (v2 /* !! */  == false) break block61;
                                                            }
                                                            ** GOTO lbl74
                                                        }
                                                        catch (n9 v6) {
                                                            throw m44.a("l", (Object)v6, (long)-7529786886311518516L, (long)var12_7);
                                                        }
                                                        v2 /* !! */  = (CallSite)var14_12;
                                                        if (var12_7 <= 0L || var29_24 != null) break block62;
                                                    }
                                                    catch (n9 v7) {
                                                        throw m44.a("l", (Object)v7, (long)-7529786886311518516L, (long)var12_7);
                                                    }
                                                    if (v2 /* !! */  == false) {
                                                    }
                                                    ** GOTO lbl81
                                                }
                                                catch (n9 v8) {
                                                    throw m44.a("l", (Object)v8, (long)-7529786886311518516L, (long)var12_7);
                                                }
                                            }
                                            v2 /* !! */  = (CallSite)var9_4.startsWith((String)l6m.a("t", (int)21978, (long)(4740691147920207060L ^ var12_7)));
                                        }
                                        catch (n9 v9) {
                                            throw m44.a("l", (Object)v9, (long)-7529786886311518516L, (long)var12_7);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                v5 = var29_24;
lbl74:
                                                // 2 sources

                                                if (var12_7 <= 0L) ** GOTO lbl106
                                                if (v5 != null) break block63;
                                                if (v2 /* !! */  != false) {
                                                }
                                                ** GOTO lbl94
                                            }
                                            catch (n9 v10) {
                                                throw m44.a("l", (Object)v10, (long)-7529786886311518516L, (long)var12_7);
                                            }
lbl81:
                                            // 2 sources

                                            v11 = var9_4.substring(l6m.a("t", (int)32609, (long)(7081430758551570027L ^ var12_7)).length());
                                            if (var29_24 != null) break block64;
                                        }
                                        catch (n9 v12) {
                                            throw m44.a("l", (Object)v12, (long)-7529786886311518516L, (long)var12_7);
                                        }
                                        v2 /* !! */  = m44.a("l", (Object)new Object[]{v11}, (long)-8356434130597382372L, (long)var12_7);
                                    }
                                    catch (n9 v13) {
                                        throw m44.a("l", (Object)v13, (long)-7529786886311518516L, (long)var12_7);
                                    }
                                }
                                try {
                                    if (var12_7 < 0L) break block63;
                                    if (v2 /* !! */  != false) ** GOTO lbl135
lbl94:
                                    // 2 sources

                                    v2 /* !! */  = (CallSite)var9_4.startsWith((String)l6m.a("t", (int)14571, (long)(2917607440887480807L ^ var12_7)));
                                }
                                catch (n9 v14) {
                                    throw m44.a("l", (Object)v14, (long)-7529786886311518516L, (long)var12_7);
                                }
                            }
                            try {
                                try {
                                    block66: {
                                        try {
                                            try {
                                                try {
                                                    v5 = var29_24;
lbl106:
                                                    // 2 sources

                                                    if (v5 != null) break block65;
                                                    if (v2 /* !! */  == false) break block66;
                                                }
                                                catch (n9 v15) {
                                                    throw m44.a("l", (Object)v15, (long)-7529786886311518516L, (long)var12_7);
                                                }
                                                v2 /* !! */  = (CallSite)var14_12;
                                                if (var12_7 < 0L || var29_24 != null) break block65;
                                            }
                                            catch (n9 v16) {
                                                throw m44.a("l", (Object)v16, (long)-7529786886311518516L, (long)var12_7);
                                            }
                                            if (v2 /* !! */  == false) {
                                            }
                                            ** GOTO lbl135
                                        }
                                        catch (n9 v17) {
                                            throw m44.a("l", (Object)v17, (long)-7529786886311518516L, (long)var12_7);
                                        }
                                    }
                                    if (var12_7 <= 0L) break block64;
                                    v11 = var9_4;
                                    if (var29_24 != null) break block64;
                                }
                                catch (n9 v18) {
                                    throw m44.a("l", (Object)v18, (long)-7529786886311518516L, (long)var12_7);
                                }
                                v2 /* !! */  = (CallSite)v11.startsWith((String)l6m.a("t", (int)21374, (long)(8114393757534087795L ^ var12_7)));
                            }
                            catch (n9 v19) {
                                throw m44.a("l", (Object)v19, (long)-7529786886311518516L, (long)var12_7);
                            }
                        }
                        try {
                            if (v2 /* !! */  == false) break block59;
lbl135:
                            // 3 sources

                            var8_8.put(var9_4, var17_3);
                            v11 = var2_11.put(var9_4, var17_3);
                        }
                        catch (n9 v20) {
                            throw m44.a("l", (Object)v20, (long)-7529786886311518516L, (long)var12_7);
                        }
                    }
                    return null;
                }
                var30_25 = var4_2.G(var21_20);
                try {
                    v21 /* !! */  = m44.a("r", (Object)this, (long)-8178472801820920187L, (long)var12_7);
                    if (var29_24 != null) break block67;
                    if (v21 /* !! */  == false) break block68;
                }
                catch (n9 v22) {
                    throw m44.a("l", (Object)v22, (long)-7529786886311518516L, (long)var12_7);
                }
                var32_26 = var10_9.t((char)var18_17, var5_6, var19_18, (short)var20_19);
                if (var32_26 != null) {
                    var33_28 = 0;
                    while (var33_28 < var32_26.size()) {
                        block71: {
                            block72: {
                                block73: {
                                    block69: {
                                        var34_30 = (String)var32_26.get(var33_28);
                                        try {
                                            block70: {
                                                try {
                                                    try {
                                                        v23 = var34_30;
                                                        if (var29_24 != null) break block69;
                                                        if (v23 != m44.a("r", (Object)this, (long)-8121925902449390982L, (long)var12_7)) break block70;
                                                    }
                                                    catch (n9 v24) {
                                                        throw m44.a("l", (Object)v24, (long)-7529786886311518516L, (long)var12_7);
                                                    }
                                                    v25 = var29_24;
                                                    if (var12_7 <= 0L) break block71;
                                                    if (v25 == null) break block72;
                                                }
                                                catch (n9 v26) {
                                                    throw m44.a("l", (Object)v26, (long)-7529786886311518516L, (long)var12_7);
                                                }
                                            }
                                            v23 = var34_30;
                                        }
                                        catch (n9 v27) {
                                            throw m44.a("l", (Object)v27, (long)-7529786886311518516L, (long)var12_7);
                                        }
                                    }
                                    var31_29 = v23;
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v28 = var31_29;
                                                    if (var29_24 != null) break block72;
                                                    if (v28.equals(var9_4)) break block73;
                                                }
                                                catch (n9 v29) {
                                                    throw m44.a("l", (Object)v29, (long)-7529786886311518516L, (long)var12_7);
                                                }
                                                v28 = this;
                                                if (var29_24 != null) break block72;
                                            }
                                            catch (n9 v30) {
                                                throw m44.a("l", (Object)v30, (long)-7529786886311518516L, (long)var12_7);
                                            }
                                            v31 = new Object[11];
                                            v31[10] = var16_14;
                                            v31[9] = var15_13;
                                            v31[8] = var30_25;
                                            v31[7] = var6_16;
                                            v31[6] = var11_15;
                                            v31[5] = var8_8;
                                            v31[4] = var2_11;
                                            v31[3] = var17_3;
                                            v31[2] = var31_29;
                                            v31[1] = var9_4;
                                            v31[0] = var23_21;
                                            if (m44.a("m", (Object)v28, (Object)v31, (long)-7825907200673380930L, (long)var12_7) == false) break block73;
                                        }
                                        catch (n9 v32) {
                                            throw m44.a("l", (Object)v32, (long)-7529786886311518516L, (long)var12_7);
                                        }
                                        var2_11.put(var31_29, var17_3);
                                        var32_26.set(var33_28, m44.a("r", (Object)this, (long)-8121925902449390982L, (long)var12_7));
                                        return var31_29;
                                    }
                                    catch (n9 v33) {
                                        throw m44.a("l", (Object)v33, (long)-7529786886311518516L, (long)var12_7);
                                    }
                                }
                                v28 = var32_26.set(var33_28, m44.a("r", (Object)this, (long)-8121925902449390982L, (long)var12_7));
                            }
                            ++var33_28;
                            v25 = var29_24;
                        }
                        if (v25 == null) continue;
                    }
                }
            }
            v21 /* !! */  = (CallSite)_e.vH;
        }
        var32_27 = v21 /* !! */ ;
        block49: while (true) {
            v34 = new Object[2];
            v34[1] = var25_22;
            v34[0] = var4_2;
            var31_29 = m44.a("m", (Object)this, (Object)v34, (long)-8431795020854154498L, (long)var12_7);
            if (var32_27 == false) ** GOTO lbl239
            v35 = var9_4 + (char)l6m.h + (String)var31_29;
            do {
                var31_29 = v35;
lbl239:
                // 2 sources

                v36 = new Object[11];
                v36[10] = var16_14;
                v36[9] = var15_13;
                v36[8] = var30_25;
                v36[7] = var6_16;
                v36[6] = var11_15;
                v36[5] = var8_8;
                v36[4] = var2_11;
                v36[3] = var17_3;
                v36[2] = var31_29;
                v36[1] = var9_4;
                v36[0] = var23_21;
                if (m44.a("m", (Object)this, (Object)v36, (long)-7825907200673380930L, (long)var12_7) == false) continue block49;
                var8_8.put(var31_29, var17_3);
                var2_11.put(var31_29, var17_3);
                var7_10.t(var5_6, var31_29, var27_23);
                v35 = var31_29;
            } while (var12_7 < 0L || var29_24 != null);
            break;
        }
        return v35;
    }

    private boolean u(Object[] objectArray) {
        boolean bl2;
        block9: {
            block11: {
                block10: {
                    String string = (String)objectArray[0];
                    b4 b42 = (b4)objectArray[1];
                    Map map = (Map)objectArray[2];
                    long l10 = (Long)objectArray[3];
                    HashMap hashMap = (HashMap)objectArray[4];
                    l10 = b ^ l10;
                    CallSite callSite = m44.a("l", (long)6716335896224349561L, (long)l10);
                    try {
                        try {
                            block8: {
                                try {
                                    try {
                                        if (map == null) break block8;
                                        bl2 = string.equals(map.get(b42));
                                        if (callSite != null) break block9;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("l", (Object)n92, (long)4812364447433558916L, (long)l10);
                                    }
                                    if (bl2) break block10;
                                }
                                catch (n9 n93) {
                                    throw m44.a("l", (Object)n93, (long)4812364447433558916L, (long)l10);
                                }
                            }
                            bl2 = string.equals(hashMap.get(b42));
                            if (callSite != null) break block9;
                        }
                        catch (n9 n94) {
                            throw m44.a("l", (Object)n94, (long)4812364447433558916L, (long)l10);
                        }
                        if (!bl2) break block11;
                    }
                    catch (n9 n95) {
                        throw m44.a("l", (Object)n95, (long)4812364447433558916L, (long)l10);
                    }
                }
                bl2 = true;
                break block9;
            }
            bl2 = false;
        }
        return bl2;
    }

    l6m(int n10, boolean bl2, short s10, boolean bl3, boolean bl4, int n11, String string, boolean bl5, char c10, List list) {
        long l10 = ((long)s10 << 48 | (long)n11 << 32 >>> 16 | (long)c10 << 48 >>> 48) ^ b;
        long l11 = l10 ^ 0x47C18056846AL;
        super(n10, l11, bl4);
        m44.a("u", (Object)this, (String)"", (long)2081796816616053207L, (long)l10);
        m44.a("u", (Object)this, (boolean)bl3, (long)2173772630851699751L, (long)l10);
        m44.a("u", (Object)this, (boolean)bl2, (long)2036995129347856314L, (long)l10);
        m44.a("u", (Object)this, (String)string, (long)480137308581340870L, (long)l10);
        m44.a("u", (Object)this, (boolean)bl5, (long)2102374061131736360L, (long)l10);
        m44.a("u", (Object)this, (List)list, (long)74762934235649313L, (long)l10);
    }

    private String r(Object[] objectArray) {
        l6m l6m2;
        long l10;
        long l11;
        block25: {
            block22: {
                l6m l6m3;
                long l12;
                block26: {
                    CallSite callSite;
                    CallSite callSite2;
                    block23: {
                        block21: {
                            l62 l622 = (l62)objectArray[0];
                            l11 = (Long)objectArray[1];
                            long l13 = l11 = b ^ l11;
                            l12 = l13 ^ 0x7E0A1472F405L;
                            l10 = l13 ^ 0x6EDFDE37A92DL;
                            callSite2 = m44.a("k", (long)1639941942136305294L, (long)l11);
                            try {
                                try {
                                    if (callSite2 != null) break block21;
                                    if (l622 == m44.a("u", (Object)this, (long)1090705769648004489L, (long)l11)) break block22;
                                }
                                catch (n9 n92) {
                                    throw m44.a("k", (Object)n92, (long)666526833048240243L, (long)l11);
                                }
                                m44.a("w", (Object)this, (l62)l622, (long)1090705769648004489L, (long)l11);
                            }
                            catch (n9 n93) {
                                throw m44.a("k", (Object)n93, (long)666526833048240243L, (long)l11);
                            }
                        }
                        try {
                            try {
                                block24: {
                                    try {
                                        try {
                                            callSite = m44.a("u", (Object)this, (long)1249445571499252392L, (long)l11);
                                            if (l11 <= 0L || callSite2 != null) break block23;
                                            if (callSite != false) break block24;
                                        }
                                        catch (n9 n94) {
                                            throw m44.a("k", (Object)n94, (long)666526833048240243L, (long)l11);
                                        }
                                        l6m2 = this;
                                        if (l11 < 0L) break block25;
                                        m44.a("w", (Object)l6m2, (in)new in((char[])m44.a("o", (long)1710643186667935363L, (long)l11), l12, (char[])m44.a("o", (long)1710643186667935363L, (long)l11), (List)((Object)m44.a("u", (Object)this, (long)872480178681698355L, (long)l11)), (boolean)m44.a("u", (Object)this, (long)871754004129787576L, (long)l11)), (long)1023210719516280279L, (long)l11);
                                        if (callSite2 == null) break block22;
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("k", (Object)n95, (long)666526833048240243L, (long)l11);
                                    }
                                }
                                l6m3 = this;
                                if (callSite2 != null) break block26;
                            }
                            catch (n9 n96) {
                                throw m44.a("k", (Object)n96, (long)666526833048240243L, (long)l11);
                            }
                            callSite = m44.a("u", (Object)l6m3, (long)1385132687932442933L, (long)l11);
                        }
                        catch (n9 n97) {
                            throw m44.a("k", (Object)n97, (long)666526833048240243L, (long)l11);
                        }
                    }
                    try {
                        block27: {
                            try {
                                block28: {
                                    block29: {
                                        try {
                                            try {
                                                if (l11 >= 0L) {
                                                    if (callSite == false) break block27;
                                                    if (l11 < 0L) break block28;
                                                    callSite = m44.a("o", (long)1235339495430736177L, (long)l11);
                                                }
                                                if (callSite == false) break block29;
                                            }
                                            catch (n9 n98) {
                                                throw m44.a("k", (Object)n98, (long)666526833048240243L, (long)l11);
                                            }
                                            l6m2 = this;
                                            if (l11 < 0L) break block25;
                                            m44.a("w", (Object)l6m2, (in)new in((char[])m44.a("o", (long)1309637068247907345L, (long)l11), l12, (char[])m44.a("o", (long)916146184155050498L, (long)l11), (List)((Object)m44.a("u", (Object)this, (long)872480178681698355L, (long)l11)), (boolean)m44.a("u", (Object)this, (long)871754004129787576L, (long)l11)), (long)1023210719516280279L, (long)l11);
                                            if (callSite2 == null) break block22;
                                        }
                                        catch (n9 n99) {
                                            throw m44.a("k", (Object)n99, (long)666526833048240243L, (long)l11);
                                        }
                                    }
                                    l6m2 = this;
                                    if (l11 < 0L) break block25;
                                    m44.a("w", (Object)l6m2, (in)new in((char[])m44.a("o", (long)1708452053939471209L, (long)l11), l12, (char[])m44.a("o", (long)1122214134967594164L, (long)l11), (List)((Object)m44.a("u", (Object)this, (long)872480178681698355L, (long)l11)), (boolean)m44.a("u", (Object)this, (long)871754004129787576L, (long)l11)), (long)1023210719516280279L, (long)l11);
                                }
                                if (callSite2 == null) break block22;
                            }
                            catch (n9 n910) {
                                throw m44.a("k", (Object)n910, (long)666526833048240243L, (long)l11);
                            }
                        }
                        l6m3 = this;
                    }
                    catch (n9 n911) {
                        throw m44.a("k", (Object)n911, (long)666526833048240243L, (long)l11);
                    }
                }
                m44.a("w", (Object)l6m3, (in)new in((char[])m44.a("o", (long)969435220669924757L, (long)l11), l12, (char[])m44.a("o", (long)1122214134967594164L, (long)l11), (List)((Object)m44.a("u", (Object)this, (long)872480178681698355L, (long)l11)), (boolean)m44.a("u", (Object)this, (long)871754004129787576L, (long)l11)), (long)1023210719516280279L, (long)l11);
            }
            l6m2 = this;
        }
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = m44.a("u", (Object)this, (long)845544443757472724L, (long)l11);
        objectArray2[0] = l10;
        CallSite callSite = m44.a("t", (Object)m44.a("u", (Object)l6m2, (long)1023210719516280279L, (long)l11), (Object)objectArray2, (long)1025655020212684120L, (long)l11);
        return callSite;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean K(Object[] var1_1) {
        block47: {
            block48: {
                block44: {
                    block41: {
                        block40: {
                            block39: {
                                block38: {
                                    block36: {
                                        block37: {
                                            block34: {
                                                block35: {
                                                    var4_2 = (Long)var1_1[0];
                                                    var3_3 = (String)var1_1[1];
                                                    var13_4 = (String)var1_1[2];
                                                    var10_5 = (bf)var1_1[3];
                                                    var8_6 = (Map)var1_1[4];
                                                    var11_7 = (Map)var1_1[5];
                                                    var12_8 = (df)var1_1[6];
                                                    var9_9 = (ol)var1_1[7];
                                                    var7_10 = (_f)var1_1[8];
                                                    var6_11 = (Map)var1_1[9];
                                                    var2_12 = (HashMap)var1_1[10];
                                                    v0 = var4_2 = l6m.b ^ var4_2;
                                                    var14_13 = v0 ^ 57582501437939L;
                                                    var16_14 = v0 ^ 17221578717220L;
                                                    var18_15 = v0 ^ 112418467018822L;
                                                    var20_16 = m44.a("n", (long)6597626240344079299L, (long)var4_2);
                                                    try {
                                                        try {
                                                            v1 = var3_3.equals(var13_4);
                                                            if (var20_16 != null) break block34;
                                                            if (!v1) break block35;
                                                        }
                                                        catch (n9 v2) {
                                                            throw m44.a("n", (Object)v2, (long)4932213459280858430L, (long)var4_2);
                                                        }
                                                        return false;
                                                    }
                                                    catch (n9 v3) {
                                                        throw m44.a("n", (Object)v3, (long)4932213459280858430L, (long)var4_2);
                                                    }
                                                }
                                                v1 = var8_6.containsKey(var13_4);
                                            }
                                            try {
                                                try {
                                                    v4 = var20_16;
                                                    if (var4_2 > 0L) {
                                                        if (v4 != null) break block36;
                                                        if (!v1) break block37;
                                                    }
                                                    ** GOTO lbl51
                                                }
                                                catch (n9 v5) {
                                                    throw m44.a("n", (Object)v5, (long)4932213459280858430L, (long)var4_2);
                                                }
                                                return false;
                                            }
                                            catch (n9 v6) {
                                                throw m44.a("n", (Object)v6, (long)4932213459280858430L, (long)var4_2);
                                            }
                                        }
                                        v1 = var12_8.C(var7_10, var18_15, new w(var13_4, var10_5.V()));
                                    }
                                    try {
                                        v4 = var20_16;
lbl51:
                                        // 2 sources

                                        if (v4 != null) break block38;
                                        if (!v1) break block39;
                                    }
                                    catch (n9 v7) {
                                        throw m44.a("n", (Object)v7, (long)4932213459280858430L, (long)var4_2);
                                    }
                                    v1 = false;
                                }
                                return v1;
                            }
                            var21_17 = var9_9.T(var7_10);
                            try {
                                v8 = var21_17;
                                if (var20_16 != null) break block40;
                                if (v8 == null) break block41;
                            }
                            catch (n9 v9) {
                                throw m44.a("n", (Object)v9, (long)4932213459280858430L, (long)var4_2);
                            }
                            v8 = var21_17;
                        }
                        for (bf var23_19 : v8.keySet()) {
                            block43: {
                                block42: {
                                    try {
                                        v10 = new Object[5];
                                        v10[4] = var2_12;
                                        v10[3] = var16_14;
                                        v10[2] = var6_11;
                                        v10[1] = var23_19 /* !! */ ;
                                        v10[0] = var13_4;
                                        v11 /* !! */  = m44.a("o", (Object)this, (Object)v10, (long)4778845620545325539L, (long)var4_2);
                                        if (var20_16 != null) break block42;
                                        if (v11 /* !! */  == false) break block43;
                                    }
                                    catch (n9 v12) {
                                        throw m44.a("n", (Object)v12, (long)4932213459280858430L, (long)var4_2);
                                    }
                                    v11 /* !! */  = (CallSite)false;
                                }
                                return (boolean)v11 /* !! */ ;
                            }
                            if (var20_16 == null) continue;
                        }
                    }
                    v13 = new Object[1];
                    v13[0] = var14_13;
                    var22_18 = m44.a("q", (Object)var7_10, (Object)v13, (long)6708928352670644578L, (long)var4_2);
                    try {
                        v14 = var22_18;
                        if (var20_16 != null) ** GOTO lbl105
                        if (v14 != null) {
                        }
                        ** GOTO lbl136
                    }
                    catch (n9 v15) {
                        throw m44.a("n", (Object)v15, (long)4932213459280858430L, (long)var4_2);
                    }
                    block29: while (true) {
                        v14 = var22_18;
lbl105:
                        // 2 sources

                        if (!v14.hasMoreElements()) ** GOTO lbl136
                        v16 = var22_18.nextElement();
                        do {
                            block46: {
                                block45: {
                                    var23_19 /* !! */  = (b4)v16;
                                    try {
                                        try {
                                            v17 = new Object[5];
                                            v17[4] = var2_12;
                                            v17[3] = var16_14;
                                            v17[2] = var6_11;
                                            v17[1] = var23_19 /* !! */ ;
                                            v17[0] = var13_4;
                                            v18 /* !! */  = m44.a("o", (Object)this, (Object)v17, (long)4778845620545325539L, (long)var4_2);
                                            v19 = var20_16;
                                            if (var4_2 >= 0L) {
                                                if (v19 != null) break block44;
                                                if (var20_16 != null) break block45;
                                            }
                                            ** GOTO lbl145
                                        }
                                        catch (n9 v20) {
                                            throw m44.a("n", (Object)v20, (long)4932213459280858430L, (long)var4_2);
                                        }
                                        if (!v18 /* !! */ ) break block46;
                                    }
                                    catch (n9 v21) {
                                        throw m44.a("n", (Object)v21, (long)4932213459280858430L, (long)var4_2);
                                    }
                                    v22 = false;
                                }
                                return v22;
                            }
                            if (var20_16 == null) continue block29;
lbl136:
                            // 3 sources

                            v16 = var11_7;
                        } while (var4_2 < 0L);
                        break;
                    }
                    v18 /* !! */  = v16.containsKey(var13_4);
                }
                try {
                    try {
                        try {
                            try {
                                v19 = var20_16;
lbl145:
                                // 2 sources

                                if (v19 != null) break block47;
                                if (!v18 /* !! */ ) break block48;
                            }
                            catch (n9 v23) {
                                throw m44.a("n", (Object)v23, (long)4932213459280858430L, (long)var4_2);
                            }
                            v18 /* !! */  = m44.a("p", (Object)this, (long)6733539962363503991L, (long)var4_2);
                            if (var20_16 != null) break block47;
                        }
                        catch (n9 v24) {
                            throw m44.a("n", (Object)v24, (long)4932213459280858430L, (long)var4_2);
                        }
                        if (v18 /* !! */ ) break block48;
                    }
                    catch (n9 v25) {
                        throw m44.a("n", (Object)v25, (long)4932213459280858430L, (long)var4_2);
                    }
                    return false;
                }
                catch (n9 v26) {
                    throw m44.a("n", (Object)v26, (long)4932213459280858430L, (long)var4_2);
                }
            }
            v18 /* !! */  = true;
        }
        return v18 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    l6m.b = prr.a(8330076131556722179L, 1018251213722139159L, MethodHandles.lookup().lookupClass()).a(22049477838952L);
                    l6m.f = new HashMap<K, V>(13);
                    var5 = l6m.b ^ 79124957893030L;
                    var7_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var5 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var5 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var14_3 = new String[5];
                    var12_4 = 0;
                    var11_5 = "\u00d9\u00d9\u00e4\u009a6\u0011L(\u00c4\u00cdg\u001eT\u00d0\u009c\u00f8\u0010'&\u0013j\u0017za\u0007i]$\u00fc\u00c2\u00a5x(\u0010\u00cft\u0090\u00e3\u00f7p\u00b3i#\u00b5Q\u0090\u00d3\u00ef!\u00df";
                    var13_6 = "\u00d9\u00d9\u00e4\u009a6\u0011L(\u00c4\u00cdg\u001eT\u00d0\u009c\u00f8\u0010'&\u0013j\u0017za\u0007i]$\u00fc\u00c2\u00a5x(\u0010\u00cft\u0090\u00e3\u00f7p\u00b3i#\u00b5Q\u0090\u00d3\u00ef!\u00df".length();
                    var10_7 = 16;
                    var9_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        v3 = ++var9_8;
                        v4 = var11_5.substring(v3, v3 + var10_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = l6m.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "/\u0096\u00ea\u009aQ \u00eb\u00f5\u00ae\u00a0\u00cf\bU\u0001\u0006\u0084\u0010\u00eb\u00de`b`\u00dde\u0006\u00ce\u0085\u00f6\u00fd\u00df\u00ea\u00a8 ";
                        var13_6 = "/\u0096\u00ea\u009aQ \u00eb\u00f5\u00ae\u00a0\u00cf\bU\u0001\u0006\u0084\u0010\u00eb\u00de`b`\u00dde\u0006\u00ce\u0085\u00f6\u00fd\u00df\u00ea\u00a8 ".length();
                        var10_7 = 16;
                        var9_8 = -1;
lbl34:
                        // 2 sources

                        while (true) {
                            v6 = ++var9_8;
                            v4 = var11_5.substring(v6, v6 + var10_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = l6m.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var15_9 = var7_1.doFinal(v4.getBytes("ISO-8859-1"));
                switch (v5) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl51:
                    // 1 sources

                    ** continue;
                }
            }
            l6m.d = var14_3;
            l6m.e = new String[5];
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var5 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var5 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl65:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = -6475023277475051769L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        l6m.h = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
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

    private static String a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3A7D;
        if (e[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/l6m", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n11].getBytes("ISO-8859-1");
            l6m.e[n11] = l6m.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = l6m.a(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/l6m" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(l6m.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

