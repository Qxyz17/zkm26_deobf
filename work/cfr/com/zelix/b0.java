/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._v;
import com.zelix.aw;
import com.zelix.b8;
import com.zelix.bk;
import com.zelix.e9;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.hf;
import com.zelix.js;
import com.zelix.k8;
import com.zelix.kt;
import com.zelix.kw;
import com.zelix.l6q;
import com.zelix.lb6;
import com.zelix.lmm;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.n_;
import com.zelix.ni;
import com.zelix.prr;
import com.zelix.qr;
import com.zelix.x8;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class b0
extends _4
implements ni,
Comparable {
    private int D;
    int Z;
    final String W;
    x8 A;
    x8 H;
    final String F;
    kt E;
    kw[] T;
    int G;
    private static final long f;
    private static final String[] g;
    private static final String[] h;
    private static final Map i;
    private static final long[] s;
    private static final Integer[] w;
    private static final Map x;

    @Override
    public final void q(x8 x82, long l10, x8 x83) {
        block12: {
            block13: {
                b0 b02;
                x8 x84;
                x8 x85;
                block10: {
                    CallSite callSite = m44.a("n", (long)-5231047857311529425L, (long)l10);
                    try {
                        try {
                            block11: {
                                try {
                                    try {
                                        x85 = this.H;
                                        x84 = x82;
                                        if (callSite == false) break block10;
                                        if (x85 != x84) break block11;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("n", (Object)n92, (long)-5433256799827290750L, (long)l10);
                                    }
                                    this.H = x83;
                                    if (callSite != false) break block12;
                                }
                                catch (n9 n93) {
                                    throw m44.a("n", (Object)n93, (long)-5433256799827290750L, (long)l10);
                                }
                            }
                            b02 = this;
                            if (callSite == false) break block13;
                        }
                        catch (n9 n94) {
                            throw m44.a("n", (Object)n94, (long)-5433256799827290750L, (long)l10);
                        }
                        x85 = b02.A;
                        x84 = x82;
                    }
                    catch (n9 n95) {
                        throw m44.a("n", (Object)n95, (long)-5433256799827290750L, (long)l10);
                    }
                }
                if (x85 != x84) break block12;
                b02 = this;
            }
            b02.A = x83;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void M(Object[] var1_1) {
        block64: {
            var3_2 = (hf)var1_1[0];
            var6_3 = (Long)var1_1[1];
            var5_4 = (qr)var1_1[2];
            var4_5 = (lqu)var1_1[3];
            var2_6 = (PrintWriter)var1_1[4];
            v0 = var6_3;
            var8_7 = v0 ^ 31231447211100L;
            var10_8 = v0 ^ 118759496790181L;
            var12_9 = v0 ^ 93401797814153L;
            var14_10 = v0 ^ 17580531733966L;
            var16_11 = v0 ^ 46475995847818L;
            var18_12 = v0 ^ 36027586482350L;
            var20_13 = v0 ^ 114222712729904L;
            var22_14 = v0 ^ 92687900685343L;
            var25_15 = new ArrayList<kw>();
            var26_16 = 0;
            var24_17 = m44.a("n", (long)9139968804049588127L, (long)var6_3);
            while (var26_16 < this.G) {
                block67: {
                    block68: {
                        block74: {
                            block77: {
                                block75: {
                                    block76: {
                                        block69: {
                                            block70: {
                                                block72: {
                                                    block73: {
                                                        block71: {
                                                            block65: {
                                                                block66: {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    v1 = this.T[var26_16] instanceof k8;
                                                                                    v2 /* !! */  = (int)var24_17;
                                                                                    if (var6_3 <= 0L) ** GOTO lbl263
                                                                                    if (v2 /* !! */  == 0) break block64;
                                                                                    v3 = var24_17;
                                                                                    if (var6_3 > 0L) {
                                                                                        if (v3 == false) break block65;
                                                                                    }
                                                                                    ** GOTO lbl76
                                                                                }
                                                                                catch (n9 v4) {
                                                                                    throw m44.a("n", (Object)v4, (long)9018763066878614578L, (long)var6_3);
                                                                                }
                                                                                if (var6_3 < 0L) break block65;
                                                                                if (v1 != 0) {
                                                                                }
                                                                                ** GOTO lbl69
                                                                            }
                                                                            catch (n9 v5) {
                                                                                throw m44.a("n", (Object)v5, (long)9018763066878614578L, (long)var6_3);
                                                                            }
                                                                            v6 = m44.a("p", (Object)var5_4, (long)9070421087827004622L, (long)var6_3);
                                                                            if (var6_3 >= 0L) {
                                                                                if (var24_17 == false) break block66;
                                                                            }
                                                                            ** GOTO lbl67
                                                                        }
                                                                        catch (n9 v7) {
                                                                            throw m44.a("n", (Object)v7, (long)9018763066878614578L, (long)var6_3);
                                                                        }
                                                                        if (v6 != false) {
                                                                        }
                                                                        ** GOTO lbl59
                                                                    }
                                                                    catch (n9 v8) {
                                                                        throw m44.a("n", (Object)v8, (long)9018763066878614578L, (long)var6_3);
                                                                    }
                                                                    var27_18 = (k8)this.T[var26_16];
                                                                    try {
                                                                        v6 = var24_17;
                                                                        if (var6_3 <= 0L) break block67;
                                                                        if (v6 != false) break block68;
lbl59:
                                                                        // 2 sources

                                                                        var25_15.add(this.T[var26_16]);
                                                                    }
                                                                    catch (n9 v9) {
                                                                        throw m44.a("n", (Object)v9, (long)9018763066878614578L, (long)var6_3);
                                                                    }
                                                                }
                                                                try {
                                                                    v6 = var24_17;
lbl67:
                                                                    // 2 sources

                                                                    if (var6_3 <= 0L) break block67;
                                                                    if (v6 != false) break block68;
lbl69:
                                                                    // 2 sources

                                                                    v10 = this.T[var26_16] instanceof e9;
                                                                }
                                                                catch (n9 v11) {
                                                                    throw m44.a("n", (Object)v11, (long)9018763066878614578L, (long)var6_3);
                                                                }
                                                            }
                                                            try {
                                                                v3 = var24_17;
lbl76:
                                                                // 2 sources

                                                                if (var6_3 < 0L) ** GOTO lbl160
                                                                if (v3 == false) break block69;
                                                                if (v10) {
                                                                }
                                                                ** GOTO lbl151
                                                            }
                                                            catch (n9 v12) {
                                                                throw m44.a("n", (Object)v12, (long)9018763066878614578L, (long)var6_3);
                                                            }
                                                            var27_18 = (e9)this.T[var26_16];
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v13 /* !! */  = m44.a("p", (Object)var5_4, (long)9199990988204698132L, (long)var6_3);
                                                                            if (var24_17 == false) break block70;
                                                                            if (v13 /* !! */  != false) {
                                                                            }
                                                                            ** GOTO lbl142
                                                                        }
                                                                        catch (n9 v14) {
                                                                            throw m44.a("n", (Object)v14, (long)9018763066878614578L, (long)var6_3);
                                                                        }
                                                                        v15 = new Object[1];
                                                                        v15[0] = var8_7;
                                                                        v6 = m44.a("q", (Object)var3_2, (Object)v15, (long)9070268176912221411L, (long)var6_3);
                                                                        v16 = var24_17;
                                                                        if (var6_3 >= 0L) {
                                                                            if (v16 == false) break block71;
                                                                        }
                                                                        ** GOTO lbl126
                                                                    }
                                                                    catch (n9 v17) {
                                                                        throw m44.a("n", (Object)v17, (long)9018763066878614578L, (long)var6_3);
                                                                    }
                                                                    if (var6_3 >= 0L) {
                                                                        if (v6 == false) break block70;
                                                                    }
                                                                    ** GOTO lbl149
                                                                }
                                                                catch (n9 v18) {
                                                                    throw m44.a("n", (Object)v18, (long)9018763066878614578L, (long)var6_3);
                                                                }
                                                                v19 = new Object[4];
                                                                v19[3] = var2_6;
                                                                v19[2] = var14_10;
                                                                v19[1] = var4_5;
                                                                v19[0] = var3_2;
                                                                v6 = m44.a("q", (Object)var27_18, (Object)v19, (long)7105237260292676990L, (long)var6_3);
                                                            }
                                                            catch (n9 v20) {
                                                                throw m44.a("n", (Object)v20, (long)9018763066878614578L, (long)var6_3);
                                                            }
                                                        }
                                                        try {
                                                            if (var6_3 <= 0L) ** GOTO lbl139
                                                            v16 = var24_17;
lbl126:
                                                            // 2 sources

                                                            if (v16 == false) break block72;
                                                            if (v6 == false) break block73;
                                                        }
                                                        catch (n9 v21) {
                                                            throw m44.a("n", (Object)v21, (long)9018763066878614578L, (long)var6_3);
                                                        }
                                                        if (var6_3 >= 0L) break block70;
                                                    }
                                                    var25_15.add(this.T[var26_16]);
                                                }
                                                try {
                                                    v6 = var24_17;
lbl139:
                                                    // 2 sources

                                                    if (var6_3 >= 0L) {
                                                        if (v6 != false) break block70;
                                                    }
                                                    ** GOTO lbl149
lbl142:
                                                    // 2 sources

                                                    v13 /* !! */  = (CallSite)var25_15.add(this.T[var26_16]);
                                                }
                                                catch (n9 v22) {
                                                    throw m44.a("n", (Object)v22, (long)9018763066878614578L, (long)var6_3);
                                                }
                                            }
                                            try {
                                                v6 = var24_17;
lbl149:
                                                // 3 sources

                                                if (var6_3 <= 0L) break block67;
                                                if (v6 != false) break block68;
lbl151:
                                                // 2 sources

                                                v10 = this.T[var26_16] instanceof b8;
                                            }
                                            catch (n9 v23) {
                                                throw m44.a("n", (Object)v23, (long)9018763066878614578L, (long)var6_3);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    v3 = var24_17;
lbl160:
                                                    // 2 sources

                                                    if (v3 == false) break block68;
                                                    if (v10) {
                                                    }
                                                    ** GOTO lbl237
                                                }
                                                catch (n9 v24) {
                                                    throw m44.a("n", (Object)v24, (long)9018763066878614578L, (long)var6_3);
                                                }
                                                v6 = m44.a("p", (Object)var5_4, (long)9097969233797576529L, (long)var6_3);
                                                if (var6_3 > 0L) {
                                                    if (var24_17 == false) break block74;
                                                }
                                                ** GOTO lbl235
                                            }
                                            catch (n9 v25) {
                                                throw m44.a("n", (Object)v25, (long)9018763066878614578L, (long)var6_3);
                                            }
                                            if (v6 != false) {
                                            }
                                            ** GOTO lbl227
                                        }
                                        catch (n9 v26) {
                                            throw m44.a("n", (Object)v26, (long)9018763066878614578L, (long)var6_3);
                                        }
                                        var27_18 = (b8)this.T[var26_16];
                                        try {
                                            try {
                                                v27 = var2_6;
                                                v28 = new Object[1];
                                                v28[0] = var20_13;
                                                v29 = new Object[3];
                                                v29[2] = var3_2;
                                                v29[1] = var22_14;
                                                v29[0] = this.G(var10_8);
                                                v30 = (String)b0.a("i", (int)21580, (long)(1640000580359327555L ^ var6_3)) + (String)m44.a("q", (Object)var27_18, (Object)new Object[0], (long)7102480711816852862L, (long)var6_3) + (String)b0.a("i", (int)3089, (long)(2513050155039610642L ^ var6_3)) + (String)m44.a("q", (Object)this, (Object)v28, (long)6954357054693766918L, (long)var6_3) + (String)b0.a("i", (int)7607, (long)(4419826585201788597L ^ var6_3)) + (String)m44.a("n", (Object)v29, (long)7190907415203291453L, (long)var6_3);
                                                if (var6_3 < 0L) break block75;
                                                v27.println(v30);
                                                v31 = var4_5;
                                                if (var24_17 == false) break block76;
                                                v6 = m44.a("q", (Object)v31, (long)9072161152107161517L, (long)var6_3);
                                                if (var6_3 >= 0L) {
                                                    if (v6 == false) break block77;
                                                }
                                                ** GOTO lbl225
                                            }
                                            catch (n9 v32) {
                                                throw m44.a("n", (Object)v32, (long)9018763066878614578L, (long)var6_3);
                                            }
                                            v31 = var4_5;
                                        }
                                        catch (n9 v33) {
                                            throw m44.a("n", (Object)v33, (long)9018763066878614578L, (long)var6_3);
                                        }
                                    }
                                    v34 = new Object[1];
                                    v34[0] = var16_11;
                                    v27 = m44.a("q", (Object)v31, (Object)v34, (long)9166696083131081184L, (long)var6_3);
                                    v35 = new Object[1];
                                    v35[0] = var20_13;
                                    v36 = new Object[3];
                                    v36[2] = var3_2;
                                    v36[1] = var22_14;
                                    v36[0] = this.G(var10_8);
                                    v30 = (String)b0.a("i", (int)16075, (long)(6331076641119430083L ^ var6_3)) + (String)m44.a("q", (Object)var27_18, (Object)new Object[0], (long)7102480711816852862L, (long)var6_3) + (String)b0.a("i", (int)12686, (long)(3759212938330860167L ^ var6_3)) + (String)m44.a("q", (Object)this, (Object)v35, (long)6954357054693766918L, (long)var6_3) + (String)b0.a("i", (int)7102, (long)(7426658552530026672L ^ var6_3)) + (String)m44.a("n", (Object)v36, (long)7190907415203291453L, (long)var6_3);
                                }
                                v27.println(v30);
                            }
                            try {
                                v6 = var24_17;
lbl225:
                                // 2 sources

                                if (var6_3 < 0L) break block67;
                                if (v6 != false) break block68;
lbl227:
                                // 2 sources

                                var25_15.add(this.T[var26_16]);
                            }
                            catch (n9 v37) {
                                throw m44.a("n", (Object)v37, (long)9018763066878614578L, (long)var6_3);
                            }
                        }
                        try {
                            v6 = var24_17;
lbl235:
                            // 2 sources

                            if (var6_3 <= 0L) break block67;
                            if (v6 != false) break block68;
lbl237:
                            // 2 sources

                            v38 = new Object[6];
                            v38[5] = var18_12;
                            v38[4] = var2_6;
                            v38[3] = var4_5;
                            v38[2] = this.T[var26_16];
                            v38[1] = var5_4;
                            v38[0] = var3_2;
                            m44.a("q", (Object)this, (Object)v38, (long)7359307865362602890L, (long)var6_3);
                            v39 = var25_15;
lbl247:
                            // 2 sources

                            while (true) {
                                v10 = v39.add(this.T[var26_16]);
                                break;
                            }
                        }
                        catch (n9 v40) {
                            throw m44.a("n", (Object)v40, (long)9018763066878614578L, (long)var6_3);
                        }
                    }
                    ++var26_16;
                    v6 = var24_17;
                }
                if (v6 != false) continue;
            }
            v39 = var25_15;
            ** while (var6_3 < 0L)
lbl259:
            // 1 sources

            v1 = v39.size();
        }
        try {
            v2 /* !! */  = this.G;
lbl263:
            // 2 sources

            if (v1 < v2 /* !! */ ) {
                this.T = var25_15.toArray(new kw[var25_15.size()]);
                this.G = this.T.length;
                v41 = new Object[1];
                v41[0] = var12_9;
                m44.a("q", (Object)this, (Object)v41, (long)7090367630023321801L, (long)var6_3);
            }
        }
        catch (n9 v42) {
            throw m44.a("n", (Object)v42, (long)9018763066878614578L, (long)var6_3);
        }
    }

    /*
     * Unable to fully structure code
     */
    final void c(Object[] var1_1) {
        block6: {
            block7: {
                var5_2 = (Integer)var1_1[0];
                var6_3 = (Integer)var1_1[1];
                var2_4 = (Long)var1_1[2];
                var7_5 = (HashMap)var1_1[3];
                var4_6 = (HashMap)var1_1[4];
                v0 = var2_4 = b0.f ^ var2_4;
                var8_7 = v0 ^ 44619513315526L;
                var10_8 = v0 ^ 40407555460970L;
                var12_9 = v0 ^ 92145137334701L;
                var15_10 = this.V();
                var14_11 = m44.a("l", (long)2679020598318552165L, (long)var2_4);
                var16_12 = m44.a("l", var15_10, (Object)var4_6, (long)var12_9, (long)2861717540572429220L, (long)var2_4);
                try {
                    try {
                        v1 = var16_12.equals(var15_10);
                        if (var14_11 == false) break block6;
                        if (v1 != 0) break block7;
                    }
                    catch (n9 v2) {
                        throw m44.a("l", (Object)v2, (long)2797701839477934024L, (long)var2_4);
                    }
                    v3 = new Object[2];
                    v3[1] = var16_12;
                    v3[0] = var8_7;
                    m44.a("s", (Object)this, (Object)v3, (long)4213472909430821005L, (long)var2_4);
                }
                catch (n9 v4) {
                    throw m44.a("l", (Object)v4, (long)2797701839477934024L, (long)var2_4);
                }
            }
            v1 = var17_13 = 0;
        }
        while (var17_13 < this.T.length) {
            v5 = new Object[5];
            v5[4] = var4_6;
            v5[3] = var7_5;
            v5[2] = var6_3;
            v5[1] = var5_2;
            v5[0] = var10_8;
            m44.a("s", (Object)this.T[var17_13], (Object)v5, (long)2593200728327560728L, (long)var2_4);
            ++var17_13;
lbl44:
            // 2 sources

            ** while (var14_11 == false)
lbl45:
            // 1 sources

        }
lbl46:
        // 2 sources

        if (var2_4 < 0L) ** GOTO lbl44
    }

    public final String B() {
        return this.W;
    }

    public void R(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l11 = l10 ^ 0x459FC17D5E2DL;
        this.A.A(string);
        m44.a("u", (Object)this, (long)-571340268985874567L, (long)l10);
        Object var7_5 = null;
        b0 b02 = this;
        lb6 lb62 = new lb6(2);
        m44.a("u", (Object)this, (long)l11, (Object)lb62, (Object)b02, var7_5, (long)-154992116961825448L, (long)l10);
    }

    public final void b(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = f ^ l10) ^ 0x308E0428A007L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("p", (Object)this.E, (Object)objectArray2, (long)-7127153526999901618L, (long)l10);
    }

    public final boolean X(Object[] objectArray) {
        boolean bl2;
        block2: {
            block3: {
                long l10 = (Long)objectArray[0];
                l10 = f ^ l10;
                CallSite callSite = m44.a("i", (long)3548995500135638439L, (long)l10);
                try {
                    bl2 = this.W.equals(this.A.V());
                    if (callSite != false) break block2;
                    if (bl2) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("i", (Object)n92, (long)3091233838872005629L, (long)l10);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final boolean f(long l10) {
        boolean bl2;
        block8: {
            block7: {
                CallSite callSite;
                block6: {
                    long l11 = l10 = f ^ l10;
                    long l12 = l11 ^ 0x36A637E525BCL;
                    long l13 = l11 ^ 0x12F11CCDBB6L;
                    callSite = m44.a("k", (long)5796917234111415445L, (long)l10);
                    try {
                        try {
                            bl2 = this.E.o(l12);
                            if (callSite != false) break block6;
                            if (!bl2) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("k", (Object)n92, (long)5464025045068442319L, (long)l10);
                        }
                        bl2 = this.E.y(l13);
                    }
                    catch (n9 n93) {
                        throw m44.a("k", (Object)n93, (long)5464025045068442319L, (long)l10);
                    }
                }
                try {
                    if (callSite != false) break block8;
                    if (bl2) break block7;
                }
                catch (n9 n94) {
                    throw m44.a("k", (Object)n94, (long)5464025045068442319L, (long)l10);
                }
                bl2 = true;
                break block8;
            }
            bl2 = false;
        }
        return bl2;
    }

    public String d(long l10) {
        return this.H.V();
    }

    public b0(_v _v2, x8 x82, x8 x83, kw[] kwArray, int n10) {
        super(_v2);
        this.E = new kt(this);
        this.H = x82;
        this.A = x83;
        this.G = kwArray.length;
        this.T = kwArray;
        this.F = x82.V();
        this.W = x83.V();
        this.Z = n10;
    }

    public void E(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        this.Z = n10;
    }

    public abstract boolean J();

    public final String U(Object[] objectArray) {
        return this.F;
    }

    /*
     * Exception decompiling
     */
    public Set O(long var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:383)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:65)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final void e(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = f ^ l10) ^ 0x572A33E6F1B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("t", (Object)this.E, (Object)objectArray2, (long)9115818489664893844L, (long)l10);
    }

    public final int z(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = f ^ l10) ^ 0x375FB5D2921BL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (int)m44.a("u", (Object)this.E, (Object)objectArray2, (long)8502871493557490616L, (long)l10);
    }

    public String Z(long l10) {
        long l11 = l10 ^ 0x3EBE9273D130L;
        return this.d(l11);
    }

    public final void f(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        boolean bl2 = (Boolean)objectArray[1];
        long l11 = (l10 = f ^ l10) ^ 0x70E5A65CF694L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = bl2;
        m44.a("s", (Object)this.E, (Object)objectArray2, (long)4369506196530973736L, (long)l10);
    }

    public final void N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = f ^ l10) ^ 0x7D9FF52393CBL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("v", (Object)this.E, (Object)objectArray2, (long)-6355057352581993238L, (long)l10);
    }

    public String m() {
        return this.F;
    }

    /*
     * Exception decompiling
     */
    void t(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:383)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:65)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    void X(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:383)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:65)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public String s(long l10, int n10) {
        long l11 = (l10 << 32 | (long)n10 << 32 >>> 32) ^ f;
        long l12 = l11 ^ 0x4BD5CF26C96FL;
        return ((_v)this.H()).h(l12);
    }

    /*
     * Unable to fully structure code
     */
    public final void l(Object[] var1_1) {
        var3_2 = (Set)var1_1[0];
        var7_3 = (Set)var1_1[1];
        var4_4 = (Set)var1_1[2];
        var2_5 = (Set)var1_1[3];
        var5_6 = (Long)var1_1[4];
        v0 = var5_6 = b0.f ^ var5_6;
        var8_7 = v0 ^ 140639952348875L;
        var10_8 = v0 ^ 57156123311326L;
        var13_9 = 0;
        var12_10 = m44.a("k", (long)-6732113647013529995L, (long)var5_6);
        while (var13_9 < this.T.length) {
            block12: {
                block13: {
                    block14: {
                        block11: {
                            var14_11 = this.T[var13_9];
                            try {
                                v1 = var14_11 instanceof bk;
                                if (var12_10 != false) break block11;
                                if (v1) {
                                }
                                ** GOTO lbl34
                            }
                            catch (n9 v2) {
                                throw m44.a("k", (Object)v2, (long)-5101331426018879441L, (long)var5_6);
                            }
                            var15_12 = (bk)var14_11;
                            try {
                                try {
                                    v3 = new Object[2];
                                    v3[1] = var10_8;
                                    v3[0] = var7_3;
                                    m44.a("t", (Object)var15_12, (Object)v3, (long)-5135512357786702434L, (long)var5_6);
                                    v4 = var12_10;
                                    if (var5_6 < 0L) break block12;
                                    if (v4 == false) break block13;
lbl34:
                                    // 2 sources

                                    v5 = var14_11;
                                    if (var5_6 < 0L || var12_10 != false) break block14;
                                }
                                catch (n9 v6) {
                                    throw m44.a("k", (Object)v6, (long)-5101331426018879441L, (long)var5_6);
                                }
                                v1 = v5 instanceof e9;
                            }
                            catch (n9 v7) {
                                throw m44.a("k", (Object)v7, (long)-5101331426018879441L, (long)var5_6);
                            }
                        }
                        if (!v1) ** GOTO lbl59
                        v5 = var14_11;
                    }
                    try {
                        v8 = new Object[5];
                        v8[4] = var2_5;
                        v8[3] = var4_4;
                        v8[2] = var8_7;
                        v8[1] = var7_3;
                        v8[0] = var3_2;
                        m44.a("t", (Object)((e9)v5), (Object)v8, (long)-4834627085683446767L, (long)var5_6);
                        v4 = var12_10;
                        if (var5_6 < 0L) break block12;
                        if (v4 == false) break block13;
lbl59:
                        // 2 sources

                        v9 = new Object[5];
                        v9[4] = var2_5;
                        v9[3] = var4_4;
                        v9[2] = var7_3;
                        v9[1] = var3_2;
                        v9[0] = var14_11;
                        m44.a("t", (Object)this, (Object)v9, (long)-6713179129015811973L, (long)var5_6);
                    }
                    catch (n9 v10) {
                        throw m44.a("k", (Object)v10, (long)-5101331426018879441L, (long)var5_6);
                    }
                }
                ++var13_9;
                v4 = var12_10;
            }
            if (v4 == false) continue;
        }
    }

    /*
     * Exception decompiling
     */
    void p(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:383)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:65)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final boolean H(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = f ^ l10) ^ 0x64A5D3F49E92L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("p", (Object)this.E, (Object)objectArray2, (long)-8398040625200542623L, (long)l10);
    }

    public abstract String M(long var1);

    public final boolean y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = f ^ l10) ^ 0x3EC615575F8FL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("v", (Object)this.E, (Object)objectArray2, (long)-8514758931497520108L, (long)l10);
    }

    void a(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
    }

    /*
     * Exception decompiling
     */
    final void U(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:383)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:65)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    void z(gu gu2, long l10) {
        long l11 = l10;
        long l12 = l11 ^ 0L;
        long l13 = l11 ^ 0L;
        long l14 = l11 ^ 0x6DE1DADD9981L;
        m44.a("w", (Object)this.E, (Object)gu2, (long)l13, (long)5471500934357375931L, (long)l10);
        this.H.e(l14, gu2, this, this.H());
        CallSite callSite = m44.a("h", (long)6170399952317654249L, (long)l10);
        this.A.e(l14, gu2, this, this.H());
        kw[] kwArray = this.T;
        int n10 = kwArray.length;
        CallSite callSite2 = callSite;
        for (int i10 = 0; i10 < n10; ++i10) {
            kw kw2 = kwArray[i10];
            kw2.z(gu2, l12);
            if (callSite2 != false) continue;
        }
    }

    public final boolean s(long l10) {
        boolean bl2;
        block2: {
            block3: {
                l10 = f ^ l10;
                CallSite callSite = m44.a("h", (long)-909244897162657239L, (long)l10);
                try {
                    bl2 = this.F.equals(this.H.V());
                    if (callSite == false) break block2;
                    if (bl2) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)-1108146508798504572L, (long)l10);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final boolean O(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = f ^ l10) ^ 0x34BF40C7C1B1L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("w", (Object)this.E, (Object)objectArray2, (long)350574252563597791L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    public final boolean l(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:383)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:65)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public boolean I(Object[] objectArray) {
        boolean bl2;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                l10 = f ^ l10;
                CallSite callSite = m44.a("i", (long)-8549864399483570160L, (long)l10);
                try {
                    try {
                        bl2 = this.Z;
                        if (callSite == false) break block4;
                        if (!bl2) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)n92, (long)-8455961664348181571L, (long)l10);
                    }
                    bl2 = true;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)n93, (long)-8455961664348181571L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    boolean i(long l10, int n10) {
        boolean bl2;
        block4: {
            block5: {
                l10 = f ^ l10;
                CallSite callSite = m44.a("n", (long)2055867218460503503L, (long)l10);
                try {
                    try {
                        bl2 = this.D & n10;
                        if (callSite == false) break block4;
                        if (bl2 != n10) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)2267927853708623458L, (long)l10);
                    }
                    bl2 = true;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)2267927853708623458L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public abstract boolean e();

    public final int T() {
        return this.E.G();
    }

    public final void S(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = f ^ l10) ^ 0x767C33DB035BL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("s", (Object)this.E, (Object)objectArray2, (long)-8685361374041609338L, (long)l10);
    }

    public final boolean o(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = f ^ l10) ^ 0x358E093B4AD6L;
        return this.E.E(l11);
    }

    void J(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        this.D |= n10;
    }

    public b0(_4 _42, h1 h12, long l10, l6q l6q2) {
        long l11 = (l10 = f ^ l10) ^ 0x7B86244D67C4L;
        this(_42, h12, l11, l6q2, null);
        this.Z = 0;
    }

    public void C(Object[] objectArray) {
        kw kw2 = (kw)objectArray[0];
        Set set = (Set)objectArray[1];
        Set set2 = (Set)objectArray[2];
        Set set3 = (Set)objectArray[3];
        Set set4 = (Set)objectArray[4];
    }

    String y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return this.H.V().toLowerCase();
    }

    public final int K(Object[] objectArray) {
        b0 b02 = (b0)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = f ^ l10) ^ 0x1CBCEFF7DAAAL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l11;
        return ((String)((Object)m44.a("s", (Object)this, (Object)objectArray2, (long)-1668415362320817083L, (long)l10))).compareTo((String)((Object)m44.a("s", (Object)b02, (Object)objectArray3, (long)-1668415362320817083L, (long)l10)));
    }

    public int compareTo(Object object) {
        long l10 = f ^ 0x4EE37F12C51AL;
        long l11 = l10 ^ 0x3D27166127D1L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l11;
        objectArray[0] = (b0)object;
        return (int)m44.a("r", (Object)this, (Object)objectArray, (long)557337902758809304L, (long)l10);
    }

    public b0(_4 _42, h1 h12, long l10, l6q l6q2, PrintWriter printWriter) {
        block4: {
            block5: {
                long l11 = l10 = f ^ l10;
                long l12 = l11 ^ 0x2D72F025FC5AL;
                long l13 = l11 ^ 0x1325DDBDCD2L;
                long l14 = l11 ^ 0x4D245A67991DL;
                CallSite callSite = m44.a("j", (long)-1201402498832090188L, (long)l10);
                super(_42);
                CallSite callSite2 = callSite;
                this.E = new kt((_4)this, h12);
                int n10 = h12.readUnsignedShort();
                int n11 = h12.readUnsignedShort();
                js js2 = this.m(l12, n10);
                js js3 = this.m(l12, n11);
                try {
                    try {
                        this.G = h12.readUnsignedShort();
                        Object[] objectArray = new Object[4];
                        objectArray[3] = printWriter;
                        objectArray[2] = js3;
                        objectArray[1] = js2;
                        objectArray[0] = l13;
                        m44.a("u", (Object)this, (Object)objectArray, (long)-1053946815011987761L, (long)l10);
                        if (callSite2 != false) break block4;
                        if (l6q2 == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)-795704899547310610L, (long)l10);
                    }
                    l6q2.t(this.H, this, l14);
                    l6q2.t(this.A, this, l14);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)-795704899547310610L, (long)l10);
                }
            }
            this.F = this.H.V();
            this.W = this.A.V();
            this.Z = 0;
        }
    }

    public void I(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l11 = l10 ^ 0x2689D27117B0L;
        this.H.A(string);
        m44.a("p", (Object)this, (long)-5652208729291698460L, (long)l10);
        Object var7_5 = null;
        b0 b02 = this;
        lb6 lb62 = new lb6(0);
        m44.a("p", (Object)this, (long)l11, (Object)lb62, (Object)b02, var7_5, (long)-5457174813190822715L, (long)l10);
    }

    public abstract void v(Object[] var1);

    /*
     * Exception decompiling
     */
    void j(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:383)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:65)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final boolean B(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = f ^ l10) ^ 0x3EAE277A7A30L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("q", (Object)this.E, (Object)objectArray2, (long)3001095110798031048L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    boolean j(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:383)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:65)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public Enumeration D(long l10) {
        Set set;
        block4: {
            Set set2;
            block5: {
                long l11 = (l10 = f ^ l10) ^ 0x6547E5CD64A3L;
                set2 = this.O(l11);
                CallSite callSite = m44.a("j", (long)-5410057392936394740L, (long)l10);
                try {
                    try {
                        set = set2;
                        if (callSite != false) break block4;
                        if (set.size() != 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)-5814911142024868266L, (long)l10);
                    }
                    return new lmm();
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)-5814911142024868266L, (long)l10);
                }
            }
            set = set2;
        }
        return Collections.enumeration(set);
    }

    public final boolean t(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = f ^ l10) ^ 0x144FDFB9CC86L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("p", (Object)this.E, (Object)objectArray2, (long)5167474315558834551L, (long)l10);
    }

    public final void o(Object[] objectArray) {
        boolean bl2 = (Boolean)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = f ^ l10) ^ 0x3544E99CDA52L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = bl2;
        m44.a("r", (Object)this.E, (Object)objectArray2, (long)-8458192584320623573L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    public final void w(Object[] var1_1) {
        block9: {
            block8: {
                var4_2 = (Boolean)var1_1[0];
                var2_3 = (Long)var1_1[1];
                var2_3 = b0.f ^ var2_3;
                var5_4 = m44.a("i", (long)8879057634323410911L, (long)var2_3);
                try {
                    try {
                        if (var5_4 != false) break block8;
                        if (var4_2) {
                        }
                        ** GOTO lbl21
                    }
                    catch (n9 v0) {
                        throw m44.a("i", (Object)v0, (long)6962120507528855941L, (long)var2_3);
                    }
                    m44.a("v", (Object)this, (Object)new Object[]{1}, (long)8839448990982260160L, (long)var2_3);
                }
                catch (n9 v1) {
                    throw m44.a("i", (Object)v1, (long)6962120507528855941L, (long)var2_3);
                }
            }
            try {
                if (var2_3 < 0L || var5_4 == false) break block9;
lbl21:
                // 2 sources

                m44.a("v", (Object)this, (Object)new Object[]{1}, (long)8731865804706892234L, (long)var2_3);
            }
            catch (n9 v2) {
                throw m44.a("i", (Object)v2, (long)6962120507528855941L, (long)var2_3);
            }
        }
    }

    public final boolean h(long l10) {
        long l11 = (l10 = f ^ l10) ^ 0x181FFB40B545L;
        return this.E.y(l11);
    }

    /*
     * Exception decompiling
     */
    public void P(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:383)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:65)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public boolean w(long l10) {
        boolean bl2;
        block2: {
            block3: {
                l10 = f ^ l10;
                CallSite callSite = m44.a("k", (long)3518043984230310965L, (long)l10);
                try {
                    bl2 = this.e();
                    if (callSite != false) break block2;
                    if (bl2) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("k", (Object)n92, (long)3131213453244893807L, (long)l10);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        return bl2;
    }

    public String V() {
        return this.A.V();
    }

    public void k(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = f ^ l10) ^ 0x416DF8A929C6L;
        m44.a("v", (Object)this.E, (Object)new Object[]{n10}, (long)-8405735874395303409L, (long)l10);
        m44.a("v", (Object)this, (long)-8072361486327156590L, (long)l10);
        Object var7_5 = null;
        b0 b02 = this;
        lb6 lb62 = new lb6(1);
        m44.a("v", (Object)this, (long)l11, (Object)lb62, (Object)b02, var7_5, (long)-8488617277232162125L, (long)l10);
    }

    public abstract String X(Object[] var1);

    public boolean S(Object[] objectArray) {
        boolean bl2;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                l10 = f ^ l10;
                CallSite callSite = m44.a("l", (long)4858809141916283429L, (long)l10);
                try {
                    try {
                        bl2 = this.Z;
                        if (callSite == false) break block4;
                        if (!bl2) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)4653152045038461320L, (long)l10);
                    }
                    bl2 = true;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)4653152045038461320L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public final void W(Object[] objectArray) {
        boolean bl2 = (Boolean)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = f ^ l10) ^ 0x7C5062AD5AE9L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = bl2;
        m44.a("s", (Object)this.E, (Object)objectArray2, (long)6948687902586708895L, (long)l10);
    }

    public String q(long l10) {
        long l11 = (l10 = f ^ l10) ^ 0x62D1167B5DE1L;
        return this.E.D(l11);
    }

    public final boolean R(Object[] objectArray) {
        boolean bl2;
        block2: {
            block3: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = f ^ l10) ^ 0x20E94B560331L;
                CallSite callSite = m44.a("o", (long)-3146050621102784335L, (long)l10);
                try {
                    bl2 = this.i(l11, 1);
                    if (callSite != false) break block2;
                    if (bl2) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)n92, (long)-3463215379446436117L, (long)l10);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final boolean D(long l10) {
        long l11 = (l10 = f ^ l10) ^ 0x10BDCA3CFA19L;
        return this.E.d(l11);
    }

    /*
     * Exception decompiling
     */
    public String P(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[DOLOOP]], but top level block is 4[SIMPLE_IF_TAKEN]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final n_ C(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = f ^ l10;
        long l12 = l11 ^ 0x751DBB57B519L;
        long l13 = l11 ^ 0x35E2614B01D9L;
        long l14 = l13 >>> 16;
        int n10 = (int)(l13 << 48 >>> 48);
        long l15 = l11 ^ 0x755C37B8C6B0L;
        long l16 = l11 ^ 0x5FA7D76FA1A4L;
        long l17 = l11 ^ 0x818A8A72801L;
        long l18 = l11 ^ 0x3AE946BA548DL;
        n_ n_2 = new n_(l14, (char)n10);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l17;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l15;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l12;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l16;
        Object[] objectArray6 = new Object[5];
        objectArray6[4] = l18;
        objectArray6[3] = m44.a("q", (Object)n_2, (Object)objectArray5, (long)2634492131793877734L, (long)l10);
        objectArray6[2] = m44.a("q", (Object)n_2, (Object)objectArray4, (long)4472823024535342146L, (long)l10);
        objectArray6[1] = m44.a("q", (Object)n_2, (Object)objectArray3, (long)2590778064143367127L, (long)l10);
        objectArray6[0] = m44.a("q", (Object)n_2, (Object)objectArray2, (long)4183585904104067077L, (long)l10);
        m44.a("q", (Object)this, (Object)objectArray6, (long)4537377203721554185L, (long)l10);
        return n_2;
    }

    final void Q(Object[] objectArray) {
        HashMap hashMap = (HashMap)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10 = f ^ l10;
        long l12 = l11 ^ 0x8129323E62CL;
        long l13 = l11 ^ 0x73486F339F47L;
        String string = this.V();
        CallSite callSite = m44.a("n", string, (Object)hashMap, (long)l13, (long)98230878656585038L, (long)l10);
        try {
            if (!((String)((Object)callSite)).equals(string)) {
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = callSite;
                objectArray2[0] = l12;
                m44.a("q", (Object)this, (Object)objectArray2, (long)2059099199043352167L, (long)l10);
            }
        }
        catch (n9 n92) {
            throw m44.a("n", (Object)n92, (long)16131511968604450L, (long)l10);
        }
    }

    void K(Object[] objectArray) {
        block8: {
            js js2;
            js js3;
            block9: {
                long l10;
                long l11;
                block6: {
                    l11 = (Long)objectArray[0];
                    js3 = (js)objectArray[1];
                    js2 = (js)objectArray[2];
                    PrintWriter printWriter = (PrintWriter)objectArray[3];
                    long l12 = l11 = f ^ l11;
                    l10 = l12 ^ 0x2E514FE09D79L;
                    long l13 = l12 ^ 0x7C18BF1248B9L;
                    CallSite callSite = m44.a("h", (long)-2289657398757051170L, (long)l11);
                    try {
                        block7: {
                            try {
                                try {
                                    if (callSite != false) break block6;
                                    if (!(js3 instanceof x8)) break block7;
                                }
                                catch (n9 n92) {
                                    throw m44.a("h", (Object)n92, (long)-315440072460281212L, (long)l11);
                                }
                                if (l11 < 0L) break block8;
                                if (js2 instanceof x8) break block9;
                            }
                            catch (n9 n93) {
                                throw m44.a("h", (Object)n93, (long)-315440072460281212L, (long)l11);
                            }
                        }
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l13;
                        objectArray2[0] = false;
                        m44.a("w", (Object)this, (Object)objectArray2, (long)-2113402479266782551L, (long)l11);
                    }
                    catch (n9 n94) {
                        throw m44.a("h", (Object)n94, (long)-315440072460281212L, (long)l11);
                    }
                }
                throw new aw(this.f(l10) + (String)((Object)b0.a("i", (int)24622, (long)(0x5995C7631420BD9EL ^ l11))) + (String)((Object)b0.a("i", (int)24956, (long)(0x653B3C025E9F3CCEL ^ l11))) + (String)((Object)b0.a("i", (int)8745, (long)(0x7414CD1D6644FF9EL ^ l11))) + "");
            }
            this.H = (x8)js3;
            this.A = (x8)js2;
        }
    }

    public final boolean n(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = f ^ l10) ^ 0x33B91248CA60L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("q", (Object)this.E, (Object)objectArray2, (long)3156553985152290849L, (long)l10);
    }

    public boolean V(byte by2, long l10) {
        boolean bl2;
        block2: {
            block3: {
                long l11 = ((long)by2 << 56 | l10 << 8 >>> 8) ^ f;
                CallSite callSite = m44.a("o", (long)373450247542371430L, (long)l11);
                try {
                    bl2 = this.Z;
                    if (callSite == false) break block2;
                    if (!bl2) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)n92, (long)491005676982249419L, (long)l11);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final boolean v(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = f ^ l10) ^ 0x5B71B738FA44L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("t", (Object)this.E, (Object)objectArray2, (long)-6975625635663475943L, (long)l10);
    }

    void L(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        this.D &= ~n10;
    }

    /*
     * Exception decompiling
     */
    public Set c(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:383)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:65)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final boolean Z(Object[] objectArray) {
        boolean bl2;
        block4: {
            block5: {
                int n10 = (Integer)objectArray[0];
                long l10 = (Long)objectArray[1];
                l10 = f ^ l10;
                CallSite callSite = m44.a("l", (long)6734505300016105874L, (long)l10);
                try {
                    try {
                        bl2 = this.E.G() & n10;
                        if (callSite != false) break block4;
                        if (bl2 != n10) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)5103441173622253512L, (long)l10);
                    }
                    bl2 = true;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)5103441173622253512L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        b0.f = prr.a(1343373263385426082L, -2151589267463972715L, MethodHandles.lookup().lookupClass()).a(280566735814146L);
                        b0.i = new HashMap<K, V>(13);
                        var11 = b0.f ^ 86904943339139L;
                        var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var20_3 = new String[17];
                        var18_4 = 0;
                        var17_5 = "y@}\u00c6\u008a\u0095K\u00feIP\u00b9s\u00bb\u00b2Hjy\u00a1U\u00fb\u00a0x\u001cg\u00d8\u00cdiPF\u00b9\u00d2lXq\u00a3C\u00ff\u00cd\u00b3\u00a7u\u0004\u0091\u00df\u001d.\u0094\u0004\u008d\u000b\u00e7\u00cc\u001e\u00f2{C\u00f3<0\u00beQ\u009b>\u00f2\u0018\u0014\u0096/Q\u00ca\u00e3(\u001d\u00d1\u0089\u0095g\u009d&\t\u00faz\u00037\u008d\u00b7\u00e7q\u00d4\u0010\u0010\u0093\f\u0001\u0016\u00d9;\u00f993\u00d6{vlNH\u00b8l\u0080\u00b0\u00b9pm\u00c5~\u00a0\u0080_!y\u0012W\u00be\u00bf~VD\u008ci~u\u0084\u00d2\b+\u00a4\u0010\u008a\b\u00a6\u001e\u00ea/\u00c5\u00e4vcI\u00ce2\u00df\u00b3hP.\\\u0094\u00e3\u00af^\u00ec\u00f1<Ub\u000fo\u00c6h\u00d4\u00f6/(\u0086-\u00a3\u009cq\u00b2\u00e6\u00b1q``1\u00b5\u0012\r\u00dd\u00a9\u00f0\u00e7hm\u0093\u0006\u0089^\u0086\u00c4l\u00a5/\u0095\u001eL)`\u00ef\u00cf\u00bb\u00e6\u0010\u009a?x\u00afo>\u00deI\u00d9\u00cc\u0084]\u00d8\u00bb\u0000T\rg\u00f2\u00e2\u00e2_\u00c3\u00fb6\u00f1\u001d\u0005\u0098\u00ff\u001a/W\u00e2\u00da\u00b8[\u0098\u0081\u0086\u00c8\u0086\u00c4\u00d9\u000f\u00bbu\u00e6K|\u00bdkDP`\u0080\u00e8\u00b2\u00cb\u00deu\u00d4\u00bc\u001f\u00c7\u00b1\u0090\u00e1\u00e7&\u0010\u009d\u00e8\u00c8\u0002\u00e9\u00cc\u00bf\u0018B\u0019\u00bd5\u00a0\u00df!2^U\u00e2\u00cc\u00ed\u00cc\u00a8-\u00f8\u00f8\u0016\u0084Q\u00a5^\u00c4\u0010|2\u00d1\u0094d\u00b2F\u00bf2\nE\u009d\u00a9\u00d6\u0000\u00b8\u0018\u00f37\u00a5Vs\u00fe\u0086\"K\u00ad\u00f9dX\u001f\u008a\u00c5\u0085\u008a\u00bf\u00a3Eh\u00a5\u00e5\u0010m\u0082\u00f3qtX\u0019-=&\u009e\u00c31(U\u009e0\u0015\u00e6n\u00f5\u00e9Q\u00ee\u00fe\u0090dH\u00af\u00f8zN2\u00f2\u0000#g\u00aa\u0094\u00b0>\u0093\b\u00d2\u0083f\u00f1\u0081\u00a6#e\u00cc\u0011\u00f0\u00b9|cd\u00e9\u0085\u00c7\u00e1\u00f4\u00bd3\u0010\u0000\u00b5\u0082\u00e0\u0001\u00d8\u00e2X\u00deb\u0018\u0000\u000e\\\u009b\u00b1\u0018\u0015\u00cd\u00ab\u001e\u00f1ZzN\u00148\u0019\u00a7Y\u0013\u00da\u001e\u0090\u00b2\u0095\u00faH\u00a8\u00c4\u00018,\u009f\u00f8T\u00b6\u0093m.\u00e0\u00ee\u00b5@\u0016\u00d7\u00ee\u0085\u009c\u0099\u0019\t\u008b\u001cl\u00e4/\u00b4 \u00df\u001b\u00c5\u00c3\u00d5\u00fb\u009a|%\"\u00f6\u0085\u00163\t\u0014.\u00ff\u00b5\u00cda:\f\u00ed\u00c4/\u00dc1\u008e0D\u00e1\u00c4\u00b1L\u00dd\u0090\u0082\u0099T\u00e1\u00b1[\u00d2\u00bcrO\u00eb`\u0011*-\"\u009fLO=\u00f0\u00fe\u00ab\u008d>\u00af\b\u00ad\u00d0P\u00b3@6\u00ff\u0088\u00b4\u00be\u00a3\u00f1\u009a5\u0010\u00c2\u00be\u00a1\u00ae\u00d5T|\u00b1\u00caY\u008f'\u00e6}[\u0001hO\u00e0\u00bf+\u001d\u00cd\u00bf~\u00e21\b\u00faSX'A\u00c4C\u0013\u000e_\u0002\u00db\u00fa\r)A\u00d8\u0004#\u0016\u00fa\u008a*\u0084U\u00d3*\u00a5\u00b5\\y\u00cb2Q`\u00de\u0085\u0003\b\u00ab\u0086;\u0083\u00c6t\u00c8\u009e\u00bbX\u00cd\u001e\u00fd)^\u00ef\u0006qU\u009fWR\u00e5S\u00af\u009a\u008d\u00baj\r\u00cb\u001f8\u0096\u00ce\u00a0\u0087z\u0006\u00e5\u00c7\u00ad1\u00d5\u001c\u00ee\u00cc\u00ac\u0013\u001b\u0012\u001cg\u00b3";
                        var19_6 = "y@}\u00c6\u008a\u0095K\u00feIP\u00b9s\u00bb\u00b2Hjy\u00a1U\u00fb\u00a0x\u001cg\u00d8\u00cdiPF\u00b9\u00d2lXq\u00a3C\u00ff\u00cd\u00b3\u00a7u\u0004\u0091\u00df\u001d.\u0094\u0004\u008d\u000b\u00e7\u00cc\u001e\u00f2{C\u00f3<0\u00beQ\u009b>\u00f2\u0018\u0014\u0096/Q\u00ca\u00e3(\u001d\u00d1\u0089\u0095g\u009d&\t\u00faz\u00037\u008d\u00b7\u00e7q\u00d4\u0010\u0010\u0093\f\u0001\u0016\u00d9;\u00f993\u00d6{vlNH\u00b8l\u0080\u00b0\u00b9pm\u00c5~\u00a0\u0080_!y\u0012W\u00be\u00bf~VD\u008ci~u\u0084\u00d2\b+\u00a4\u0010\u008a\b\u00a6\u001e\u00ea/\u00c5\u00e4vcI\u00ce2\u00df\u00b3hP.\\\u0094\u00e3\u00af^\u00ec\u00f1<Ub\u000fo\u00c6h\u00d4\u00f6/(\u0086-\u00a3\u009cq\u00b2\u00e6\u00b1q``1\u00b5\u0012\r\u00dd\u00a9\u00f0\u00e7hm\u0093\u0006\u0089^\u0086\u00c4l\u00a5/\u0095\u001eL)`\u00ef\u00cf\u00bb\u00e6\u0010\u009a?x\u00afo>\u00deI\u00d9\u00cc\u0084]\u00d8\u00bb\u0000T\rg\u00f2\u00e2\u00e2_\u00c3\u00fb6\u00f1\u001d\u0005\u0098\u00ff\u001a/W\u00e2\u00da\u00b8[\u0098\u0081\u0086\u00c8\u0086\u00c4\u00d9\u000f\u00bbu\u00e6K|\u00bdkDP`\u0080\u00e8\u00b2\u00cb\u00deu\u00d4\u00bc\u001f\u00c7\u00b1\u0090\u00e1\u00e7&\u0010\u009d\u00e8\u00c8\u0002\u00e9\u00cc\u00bf\u0018B\u0019\u00bd5\u00a0\u00df!2^U\u00e2\u00cc\u00ed\u00cc\u00a8-\u00f8\u00f8\u0016\u0084Q\u00a5^\u00c4\u0010|2\u00d1\u0094d\u00b2F\u00bf2\nE\u009d\u00a9\u00d6\u0000\u00b8\u0018\u00f37\u00a5Vs\u00fe\u0086\"K\u00ad\u00f9dX\u001f\u008a\u00c5\u0085\u008a\u00bf\u00a3Eh\u00a5\u00e5\u0010m\u0082\u00f3qtX\u0019-=&\u009e\u00c31(U\u009e0\u0015\u00e6n\u00f5\u00e9Q\u00ee\u00fe\u0090dH\u00af\u00f8zN2\u00f2\u0000#g\u00aa\u0094\u00b0>\u0093\b\u00d2\u0083f\u00f1\u0081\u00a6#e\u00cc\u0011\u00f0\u00b9|cd\u00e9\u0085\u00c7\u00e1\u00f4\u00bd3\u0010\u0000\u00b5\u0082\u00e0\u0001\u00d8\u00e2X\u00deb\u0018\u0000\u000e\\\u009b\u00b1\u0018\u0015\u00cd\u00ab\u001e\u00f1ZzN\u00148\u0019\u00a7Y\u0013\u00da\u001e\u0090\u00b2\u0095\u00faH\u00a8\u00c4\u00018,\u009f\u00f8T\u00b6\u0093m.\u00e0\u00ee\u00b5@\u0016\u00d7\u00ee\u0085\u009c\u0099\u0019\t\u008b\u001cl\u00e4/\u00b4 \u00df\u001b\u00c5\u00c3\u00d5\u00fb\u009a|%\"\u00f6\u0085\u00163\t\u0014.\u00ff\u00b5\u00cda:\f\u00ed\u00c4/\u00dc1\u008e0D\u00e1\u00c4\u00b1L\u00dd\u0090\u0082\u0099T\u00e1\u00b1[\u00d2\u00bcrO\u00eb`\u0011*-\"\u009fLO=\u00f0\u00fe\u00ab\u008d>\u00af\b\u00ad\u00d0P\u00b3@6\u00ff\u0088\u00b4\u00be\u00a3\u00f1\u009a5\u0010\u00c2\u00be\u00a1\u00ae\u00d5T|\u00b1\u00caY\u008f'\u00e6}[\u0001hO\u00e0\u00bf+\u001d\u00cd\u00bf~\u00e21\b\u00faSX'A\u00c4C\u0013\u000e_\u0002\u00db\u00fa\r)A\u00d8\u0004#\u0016\u00fa\u008a*\u0084U\u00d3*\u00a5\u00b5\\y\u00cb2Q`\u00de\u0085\u0003\b\u00ab\u0086;\u0083\u00c6t\u00c8\u009e\u00bbX\u00cd\u001e\u00fd)^\u00ef\u0006qU\u009fWR\u00e5S\u00af\u009a\u008d\u00baj\r\u00cb\u001f8\u0096\u00ce\u00a0\u0087z\u0006\u00e5\u00c7\u00ad1\u00d5\u001c\u00ee\u00cc\u00ac\u0013\u001b\u0012\u001cg\u00b3".length();
                        var16_7 = 64;
                        var15_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = b0.c(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "@}U\u00f2\u00e4/\u00a9\u00aa\u00be\u00a3\u00ad\u00e6&\u009a\u00f0\"\u00a0]\u00a9]:{\u00d8_\u00a7\u0094\u0094\u001c\u00cd\u00c37RA\u00f3%\u0094\u009a\u009fg\u001c\u00f1/\u00b6Cx\u0016\u00fd\u008a\u0081\u00c9`\u0084\u00e5\u00da!N\u0019N\u00ea^\u0019C\u008c8\u0000J\u00f4\u008ea.\u001a\u0019\u001f\u00bd\"\u00f7(\u00b9\u0094\u00b4\u0018J\u00bc\u00c3\u00bb\u001f=\u008e\u00ba\u00e8G\u0004FD\u001d?xSK\u0001\u000e\u0002\u00b8~c";
                            var19_6 = "@}U\u00f2\u00e4/\u00a9\u00aa\u00be\u00a3\u00ad\u00e6&\u009a\u00f0\"\u00a0]\u00a9]:{\u00d8_\u00a7\u0094\u0094\u001c\u00cd\u00c37RA\u00f3%\u0094\u009a\u009fg\u001c\u00f1/\u00b6Cx\u0016\u00fd\u008a\u0081\u00c9`\u0084\u00e5\u00da!N\u0019N\u00ea^\u0019C\u008c8\u0000J\u00f4\u008ea.\u001a\u0019\u001f\u00bd\"\u00f7(\u00b9\u0094\u00b4\u0018J\u00bc\u00c3\u00bb\u001f=\u008e\u00ba\u00e8G\u0004FD\u001d?xSK\u0001\u000e\u0002\u00b8~c".length();
                            var16_7 = 80;
                            var15_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = b0.c(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block14;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                b0.g = var20_3;
                b0.h = new String[17];
                b0.x = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[3];
                var3_13 = 0;
                var4_14 = "\u0095\u008b\u0012w\u009e=\u00a9\u00de\u0096\u0095\u00af\u00b8\u007f\u009e\u00f8\u0098\u00a8tT\u00eb\u008f\u0093\rr";
                var5_15 = "\u0095\u008b\u0012w\u009e=\u00a9\u00de\u0096\u0095\u00af\u00b8\u007f\u009e\u00f8\u0098\u00a8tT\u00eb\u008f\u0093\rr".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl73:
                // 1 sources

                while (true) {
                    var6_12[v10] = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
                    if (var2_16 < var5_15) ** continue;
                    break block16;
                    break;
                }
            }
            var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
            v10 = var3_13++;
            var8_18 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            ** while (true)
        }
        b0.s = var6_12;
        b0.w = new Integer[3];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String c(byte[] byArray) {
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x36CD;
        if (h[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])i.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/b0", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = g[n11].getBytes("ISO-8859-1");
            b0.h[n11] = b0.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = b0.a(n10, l10);
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
            throw new RuntimeException("com/zelix/b0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int d(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x7863;
        if (w[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = s[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])x.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    x.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/b0", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            b0.w[n11] = n12;
        }
        return w[n11];
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = b0.d(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/b0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(b0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

