/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._6;
import com.zelix._p;
import com.zelix._u;
import com.zelix._x;
import com.zelix.d7;
import com.zelix.g;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ol;
import com.zelix.prr;
import com.zelix.v8;
import com.zelix.yf;
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

public class dj
extends d7 {
    private String o;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public dj(long l, String string, v8 v82, _p _p2, _p _p3, _x _x2, _u _u2, _6 _62, char c, yf yf2) {
        long l2 = (l << 16 | (long)c << 48 >>> 48) ^ a;
        long l3 = l2 ^ 0x21B3CCF2D98DL;
        int n = (int)(l3 >>> 32);
        int n2 = (int)(l3 << 32 >>> 48);
        int n3 = (int)(l3 << 48 >>> 48);
        super(n, string, (char)n2, n3, v82, _p2, _p3, _x2, _u2, _62, yf2);
    }

    /*
     * Unable to fully structure code
     */
    void Z(Object[] var1_1) {
        block57: {
            block58: {
                block69: {
                    block64: {
                        block65: {
                            block66: {
                                block67: {
                                    block68: {
                                        block63: {
                                            block60: {
                                                block62: {
                                                    block61: {
                                                        block59: {
                                                            block53: {
                                                                block55: {
                                                                    block56: {
                                                                        block54: {
                                                                            var4_2 = (g)var1_1[0];
                                                                            var2_3 = (Long)var1_1[1];
                                                                            var5_4 = (List)var1_1[2];
                                                                            v0 = var2_3;
                                                                            var6_5 = v0 ^ 87709032364408L;
                                                                            var8_6 = v0 ^ 86990437449995L;
                                                                            var10_7 = v0 ^ 88794581239799L;
                                                                            var12_8 = v0 ^ 42473911073173L;
                                                                            var14_9 = v0 ^ 38694023484056L;
                                                                            var16_10 = v0 ^ 27331795207821L;
                                                                            var18_11 = v0 ^ 83188928860528L;
                                                                            var20_12 = v0 ^ 70883236740534L;
                                                                            var22_13 = v0 ^ 112106722428998L;
                                                                            v1 = new Object[1];
                                                                            v1[0] = var10_7;
                                                                            var25_14 = m44.a("s", (Object)var4_2, (Object)v1, (long)2854846168187985466L, (long)var2_3);
                                                                            var24_15 = m44.a("l", (long)2600853758383336635L, (long)var2_3);
                                                                            try {
                                                                                v2 = m44.a("s", (Object)var25_14, (Object)dj.d("o", (int)16690, (long)(6015693807398761005L ^ var2_3)), (long)2877129169433921777L, (long)var2_3);
                                                                                if (var24_15 == null) break block53;
                                                                                if (v2 != false) {
                                                                                }
                                                                                ** GOTO lbl73
                                                                            }
                                                                            catch (n9 v3) {
                                                                                throw m44.a("l", (Object)v3, (long)2869284687957148831L, (long)var2_3);
                                                                            }
                                                                            v4 = new Object[2];
                                                                            v4[1] = dj.d("o", (int)28743, (long)(2783984215223141204L ^ var2_3));
                                                                            v4[0] = var22_13;
                                                                            var26_16 = m44.a("s", (Object)var4_2, (Object)v4, (long)4555209824173780987L, (long)var2_3);
                                                                            try {
                                                                                try {
                                                                                    v5 = var26_16;
                                                                                    if (var24_15 == null) break block54;
                                                                                    if (v5 == null) break block55;
                                                                                }
                                                                                catch (n9 v6) {
                                                                                    throw m44.a("l", (Object)v6, (long)2869284687957148831L, (long)var2_3);
                                                                                }
                                                                                v5 = var26_16.t();
                                                                            }
                                                                            catch (n9 v7) {
                                                                                throw m44.a("l", (Object)v7, (long)2869284687957148831L, (long)var2_3);
                                                                            }
                                                                        }
                                                                        var27_17 = (String)v5;
                                                                        try {
                                                                            v8 = var27_17;
                                                                            if (var2_3 < 0L || var24_15 == null) break block56;
                                                                            if (v8 == null) break block55;
                                                                        }
                                                                        catch (n9 v9) {
                                                                            throw m44.a("l", (Object)v9, (long)2869284687957148831L, (long)var2_3);
                                                                        }
                                                                        v8 = var27_17;
                                                                    }
                                                                    try {
                                                                        if (v8.length() > 0) {
                                                                            m44.a("p", (Object)this, (String)var27_17, (long)2447980727091691009L, (long)var2_3);
                                                                            v10 = new Object[2];
                                                                            v10[1] = var14_9;
                                                                            v10[0] = var27_17;
                                                                            var26_16.Z(var20_12, m44.a("s", (Object)this, (Object)v10, (long)4442792358343339408L, (long)var2_3));
                                                                        }
                                                                    }
                                                                    catch (n9 v11) {
                                                                        throw m44.a("l", (Object)v11, (long)2869284687957148831L, (long)var2_3);
                                                                    }
                                                                }
                                                                try {
                                                                    if (var2_3 <= 0L) break block57;
                                                                    if (var24_15 != null) break block58;
lbl73:
                                                                    // 2 sources

                                                                    v2 = m44.a("s", (Object)var25_14, (Object)dj.d("o", (int)22241, (long)(6279542866271348209L ^ var2_3)), (long)2877129169433921777L, (long)var2_3);
                                                                }
                                                                catch (n9 v12) {
                                                                    throw m44.a("l", (Object)v12, (long)2869284687957148831L, (long)var2_3);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    v13 = var24_15;
                                                                    if (var2_3 >= 0L) {
                                                                        if (v13 == null) break block59;
                                                                        if (v2 != false) break block60;
                                                                    }
                                                                    ** GOTO lbl96
                                                                }
                                                                catch (n9 v14) {
                                                                    throw m44.a("l", (Object)v14, (long)2869284687957148831L, (long)var2_3);
                                                                }
                                                                v2 = m44.a("s", (Object)var25_14, (Object)dj.d("o", (int)32167, (long)(4150793624975412926L ^ var2_3)), (long)2877129169433921777L, (long)var2_3);
                                                            }
                                                            catch (n9 v15) {
                                                                throw m44.a("l", (Object)v15, (long)2869284687957148831L, (long)var2_3);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                v13 = var24_15;
lbl96:
                                                                // 2 sources

                                                                if (var2_3 > 0L) {
                                                                    if (v13 == null) break block61;
                                                                    if (v2 != false) break block60;
                                                                }
                                                                ** GOTO lbl111
                                                            }
                                                            catch (n9 v16) {
                                                                throw m44.a("l", (Object)v16, (long)2869284687957148831L, (long)var2_3);
                                                            }
                                                            v2 = m44.a("s", (Object)var25_14, (Object)dj.d("o", (int)24231, (long)(5801235863702678963L ^ var2_3)), (long)2877129169433921777L, (long)var2_3);
                                                        }
                                                        catch (n9 v17) {
                                                            throw m44.a("l", (Object)v17, (long)2869284687957148831L, (long)var2_3);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            v13 = var24_15;
lbl111:
                                                            // 2 sources

                                                            if (v13 == null) break block62;
                                                            if (v2 != false) break block60;
                                                        }
                                                        catch (n9 v18) {
                                                            throw m44.a("l", (Object)v18, (long)2869284687957148831L, (long)var2_3);
                                                        }
                                                        v2 = m44.a("s", (Object)var25_14, (Object)dj.d("o", (int)13125, (long)(6285223632390438991L ^ var2_3)), (long)2877129169433921777L, (long)var2_3);
                                                    }
                                                    catch (n9 v19) {
                                                        throw m44.a("l", (Object)v19, (long)2869284687957148831L, (long)var2_3);
                                                    }
                                                }
                                                if (v2 == false) break block69;
                                            }
                                            v20 = new Object[2];
                                            v20[1] = dj.d("o", (int)4268, (long)(5517916822808978363L ^ var2_3));
                                            v20[0] = var22_13;
                                            var26_16 = m44.a("s", (Object)var4_2, (Object)v20, (long)4555209824173780987L, (long)var2_3);
                                            try {
                                                try {
                                                    v21 = var26_16;
                                                    if (var24_15 == null) break block63;
                                                    if (v21 == null) break block64;
                                                }
                                                catch (n9 v22) {
                                                    throw m44.a("l", (Object)v22, (long)2869284687957148831L, (long)var2_3);
                                                }
                                                v21 = var26_16.t();
                                            }
                                            catch (n9 v23) {
                                                throw m44.a("l", (Object)v23, (long)2869284687957148831L, (long)var2_3);
                                            }
                                        }
                                        var27_17 = (String)v21;
                                        v24 = new Object[2];
                                        v24[1] = var16_10;
                                        v24[0] = var27_17;
                                        var28_18 = m44.a("s", (Object)this, (Object)v24, (long)2340296649648818539L, (long)var2_3);
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v25 = var28_18;
                                                        if (var2_3 <= 0L || var24_15 == null) break block65;
                                                        if (v25 != null) break block66;
                                                    }
                                                    catch (n9 v26) {
                                                        throw m44.a("l", (Object)v26, (long)2869284687957148831L, (long)var2_3);
                                                    }
                                                    v27 = this;
                                                    v28 = var24_15;
                                                    if (var2_3 <= 0L) break block67;
                                                    if (v28 == null) break block68;
                                                }
                                                catch (n9 v29) {
                                                    throw m44.a("l", (Object)v29, (long)2869284687957148831L, (long)var2_3);
                                                }
                                                if (m44.a("r", (Object)v27, (long)2447980727091691009L, (long)var2_3) == null) break block66;
                                            }
                                            catch (n9 v30) {
                                                throw m44.a("l", (Object)v30, (long)2869284687957148831L, (long)var2_3);
                                            }
                                            v27 = this;
                                        }
                                        catch (n9 v31) {
                                            throw m44.a("l", (Object)v31, (long)2869284687957148831L, (long)var2_3);
                                        }
                                    }
                                    v32 = new Object[2];
                                    v32[1] = var27_17;
                                    v32[0] = var6_5;
                                    v33 = new Object[2];
                                    v33[1] = var16_10;
                                    v28 = v33;
                                    v33[0] = m44.a("m", (Object)this, (Object)v32, (long)2537830531087052355L, (long)var2_3);
                                }
                                var28_18 = m44.a("s", (Object)v27, (Object)v28, (long)2340296649648818539L, (long)var2_3);
                            }
                            v25 = var28_18;
                        }
                        try {
                            if (v25 != null) {
                                v34 = new Object[1];
                                v34[0] = var8_6;
                                var26_16.Z(var20_12, m44.a("s", (Object)var28_18, (Object)v34, (long)4258109515471129900L, (long)var2_3));
                            }
                        }
                        catch (n9 v35) {
                            throw m44.a("l", (Object)v35, (long)2869284687957148831L, (long)var2_3);
                        }
                    }
                    if (var24_15 != null) break block58;
                }
                v36 = new Object[1];
                v36[0] = var12_8;
                var26_16 = m44.a("s", (Object)var4_2, (Object)v36, (long)2875901081386532426L, (long)var2_3);
                block40: while (var26_16.hasMoreElements()) {
                    var27_17 = (String)var26_16.nextElement();
                    v37 = new Object[2];
                    v37[1] = var27_17;
                    v37[0] = var22_13;
                    var28_18 = m44.a("s", (Object)var4_2, (Object)v37, (long)4555209824173780987L, (long)var2_3);
                    try {
                        v38 = new Object[4];
                        v38[3] = var18_11;
                        v38[2] = false;
                        v38[1] = var27_17;
                        v38[0] = (String)var28_18.t();
                        var28_18.Z(var20_12, m44.a("s", (Object)this, (Object)v38, (long)2586499129865557344L, (long)var2_3));
                        do {
                            v39 = var24_15;
                            if (var2_3 > 0L) {
                                if (v39 == null) break block57;
                                v39 = var24_15;
                            }
                            if (v39 != null) continue block40;
                        } while (var2_3 < 0L);
                        break;
                    }
                    catch (n9 v40) {
                        throw m44.a("l", (Object)v40, (long)2869284687957148831L, (long)var2_3);
                    }
                }
            }
            var5_4.add(var4_2);
        }
    }

    /*
     * Unable to fully structure code
     */
    void A(Object[] var1_1) {
        block55: {
            block59: {
                block60: {
                    block61: {
                        block62: {
                            block63: {
                                block58: {
                                    block56: {
                                        block51: {
                                            block53: {
                                                block54: {
                                                    block52: {
                                                        var6_2 = (g)var1_1[0];
                                                        var5_3 = (Map)var1_1[1];
                                                        var7_4 = (Map)var1_1[2];
                                                        var2_5 = (Long)var1_1[3];
                                                        var4_6 = (Map)var1_1[4];
                                                        var8_7 = (ol)var1_1[5];
                                                        v0 = var2_5;
                                                        var9_8 = v0 ^ 100676097953201L;
                                                        var11_9 = v0 ^ 75416333251390L;
                                                        var13_10 = v0 ^ 13806428762692L;
                                                        var15_11 = v0 ^ 0L;
                                                        var17_12 = v0 ^ 124935295466639L;
                                                        v1 = new Object[1];
                                                        v1[0] = var11_9;
                                                        var20_13 = m44.a("r", (Object)var6_2, (Object)v1, (long)-3217990004458181901L, (long)var2_5);
                                                        var19_14 = m44.a("m", (long)-3399933066493011854L, (long)var2_5);
                                                        try {
                                                            v2 = m44.a("r", (Object)var20_13, (Object)dj.d("o", (int)219, (long)(2106787915650533124L ^ var2_5)), (long)-3232306997521023944L, (long)var2_5);
                                                            if (var19_14 == null) break block51;
                                                            if (v2 != false) {
                                                            }
                                                            ** GOTO lbl66
                                                        }
                                                        catch (n9 v3) {
                                                            throw m44.a("m", (Object)v3, (long)-3235647845015048106L, (long)var2_5);
                                                        }
                                                        v4 = new Object[2];
                                                        v4[1] = dj.d("o", (int)7945, (long)(7852788247546370268L ^ var2_5));
                                                        v4[0] = var17_12;
                                                        var21_15 = m44.a("r", (Object)var6_2, (Object)v4, (long)-3747470538448659662L, (long)var2_5);
                                                        try {
                                                            try {
                                                                v5 = var21_15;
                                                                if (var19_14 == null) break block52;
                                                                if (v5 == null) break block53;
                                                            }
                                                            catch (n9 v6) {
                                                                throw m44.a("m", (Object)v6, (long)-3235647845015048106L, (long)var2_5);
                                                            }
                                                            v5 = var21_15.t();
                                                        }
                                                        catch (n9 v7) {
                                                            throw m44.a("m", (Object)v7, (long)-3235647845015048106L, (long)var2_5);
                                                        }
                                                    }
                                                    var22_16 = (String)v5;
                                                    try {
                                                        v8 = var22_16;
                                                        if (var2_5 <= 0L || var19_14 == null) break block54;
                                                        if (v8 == null) break block53;
                                                    }
                                                    catch (n9 v9) {
                                                        throw m44.a("m", (Object)v9, (long)-3235647845015048106L, (long)var2_5);
                                                    }
                                                    v8 = var22_16;
                                                }
                                                try {
                                                    if (v8.length() > 0) {
                                                        m44.a("q", (Object)this, (String)var22_16, (long)-3084422768709301560L, (long)var2_5);
                                                    }
                                                }
                                                catch (n9 v10) {
                                                    throw m44.a("m", (Object)v10, (long)-3235647845015048106L, (long)var2_5);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (var2_5 >= 0L && var19_14 != null) break block55;
lbl66:
                                                    // 2 sources

                                                    v11 = var20_13;
                                                    if (var19_14 == null) break block56;
                                                }
                                                catch (n9 v12) {
                                                    throw m44.a("m", (Object)v12, (long)-3235647845015048106L, (long)var2_5);
                                                }
                                                v2 = m44.a("r", (Object)v11, (Object)dj.d("o", (int)2740, (long)(463433064291634533L ^ var2_5)), (long)-3232306997521023944L, (long)var2_5);
                                            }
                                            catch (n9 v13) {
                                                throw m44.a("m", (Object)v13, (long)-3235647845015048106L, (long)var2_5);
                                            }
                                        }
                                        try {
                                            block57: {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (v2 != false) break block57;
                                                                        v11 = var20_13;
                                                                        if (var19_14 == null) break block56;
                                                                    }
                                                                    catch (n9 v14) {
                                                                        throw m44.a("m", (Object)v14, (long)-3235647845015048106L, (long)var2_5);
                                                                    }
                                                                    if (var2_5 <= 0L) break block56;
                                                                    if (m44.a("r", (Object)v11, (Object)dj.d("o", (int)12492, (long)(6872452305648432912L ^ var2_5)), (long)-3232306997521023944L, (long)var2_5) != false) break block57;
                                                                }
                                                                catch (n9 v15) {
                                                                    throw m44.a("m", (Object)v15, (long)-3235647845015048106L, (long)var2_5);
                                                                }
                                                                v11 = var20_13;
                                                                if (var19_14 == null) break block56;
                                                            }
                                                            catch (n9 v16) {
                                                                throw m44.a("m", (Object)v16, (long)-3235647845015048106L, (long)var2_5);
                                                            }
                                                            if (var2_5 < 0L) break block56;
                                                            if (m44.a("r", (Object)v11, (Object)dj.d("o", (int)1031, (long)(7443550124813222876L ^ var2_5)), (long)-3232306997521023944L, (long)var2_5) != false) break block57;
                                                        }
                                                        catch (n9 v17) {
                                                            throw m44.a("m", (Object)v17, (long)-3235647845015048106L, (long)var2_5);
                                                        }
                                                        v11 = var20_13;
                                                        if (var19_14 == null) break block56;
                                                    }
                                                    catch (n9 v18) {
                                                        throw m44.a("m", (Object)v18, (long)-3235647845015048106L, (long)var2_5);
                                                    }
                                                    if (m44.a("r", (Object)v11, (Object)dj.d("o", (int)2313, (long)(2335371579668434641L ^ var2_5)), (long)-3232306997521023944L, (long)var2_5) != false) {
                                                    }
                                                    ** GOTO lbl202
                                                }
                                                catch (n9 v19) {
                                                    throw m44.a("m", (Object)v19, (long)-3235647845015048106L, (long)var2_5);
                                                }
                                            }
                                            v11 = (String)dj.d("o", (int)12107, (long)(8272291893668948120L ^ var2_5)) + (String)m44.a("s", (Object)this, (long)-3378416810448268519L, (long)var2_5) + (String)dj.d("o", (int)10375, (long)(3771140908869234517L ^ var2_5)) + (String)var20_13 + (String)dj.d("o", (int)22655, (long)(5250636684724985771L ^ var2_5));
                                        }
                                        catch (n9 v20) {
                                            throw m44.a("m", (Object)v20, (long)-3235647845015048106L, (long)var2_5);
                                        }
                                    }
                                    var21_15 = v11;
                                    v21 = new Object[2];
                                    v21[1] = dj.d("o", (int)26303, (long)(6877980206297964904L ^ var2_5));
                                    v21[0] = var17_12;
                                    var22_16 = m44.a("r", (Object)var6_2, (Object)v21, (long)-3747470538448659662L, (long)var2_5);
                                    try {
                                        try {
                                            v22 = var22_16;
                                            if (var19_14 == null) break block58;
                                            if (v22 == null) break block59;
                                        }
                                        catch (n9 v23) {
                                            throw m44.a("m", (Object)v23, (long)-3235647845015048106L, (long)var2_5);
                                        }
                                        v22 = var22_16.t();
                                    }
                                    catch (n9 v24) {
                                        throw m44.a("m", (Object)v24, (long)-3235647845015048106L, (long)var2_5);
                                    }
                                }
                                var23_17 = (String)v22;
                                v25 = new Object[2];
                                v25[1] = var13_10;
                                v25[0] = var23_17;
                                var24_18 = m44.a("r", (Object)this, (Object)v25, (long)-3120023456542671454L, (long)var2_5);
                                try {
                                    try {
                                        try {
                                            try {
                                                v26 = var24_18;
                                                v27 = var19_14;
                                                if (var2_5 >= 0L) {
                                                    if (v27 == null) break block60;
                                                    if (v26 != null) break block61;
                                                }
                                                ** GOTO lbl191
                                            }
                                            catch (n9 v28) {
                                                throw m44.a("m", (Object)v28, (long)-3235647845015048106L, (long)var2_5);
                                            }
                                            v29 = this;
                                            v30 = var19_14;
                                            if (var2_5 <= 0L) break block62;
                                            if (v30 == null) break block63;
                                        }
                                        catch (n9 v31) {
                                            throw m44.a("m", (Object)v31, (long)-3235647845015048106L, (long)var2_5);
                                        }
                                        if (m44.a("s", (Object)v29, (long)-3084422768709301560L, (long)var2_5) == null) break block61;
                                    }
                                    catch (n9 v32) {
                                        throw m44.a("m", (Object)v32, (long)-3235647845015048106L, (long)var2_5);
                                    }
                                    v29 = this;
                                }
                                catch (n9 v33) {
                                    throw m44.a("m", (Object)v33, (long)-3235647845015048106L, (long)var2_5);
                                }
                            }
                            v34 = new Object[2];
                            v34[1] = var23_17;
                            v34[0] = var9_8;
                            v35 = new Object[2];
                            v35[1] = var13_10;
                            v30 = v35;
                            v35[0] = m44.a("l", (Object)this, (Object)v34, (long)-2886460769444275574L, (long)var2_5);
                        }
                        var24_18 = m44.a("r", (Object)v29, (Object)v30, (long)-3120023456542671454L, (long)var2_5);
                    }
                    v26 = var24_18;
                }
                try {
                    try {
                        v27 = var19_14;
lbl191:
                        // 2 sources

                        if (v27 == null || v26 == null) break block59;
                    }
                    catch (n9 v36) {
                        throw m44.a("m", (Object)v36, (long)-3235647845015048106L, (long)var2_5);
                    }
                    v26 = var5_3.put(var24_18, var21_15);
                }
                catch (n9 v37) {
                    throw m44.a("m", (Object)v37, (long)-3235647845015048106L, (long)var2_5);
                }
            }
            try {
                if (var2_5 <= 0L || var19_14 != null) break block55;
lbl202:
                // 2 sources

                v38 = new Object[6];
                v38[5] = var8_7;
                v38[4] = var4_6;
                v38[3] = var15_11;
                v38[2] = var7_4;
                v38[1] = var5_3;
                v38[0] = var6_2;
                super.A(v38);
            }
            catch (n9 v39) {
                throw m44.a("m", (Object)v39, (long)-3235647845015048106L, (long)var2_5);
            }
        }
    }

    private String l(Object[] objectArray) {
        String string;
        block4: {
            String string2;
            long l;
            block5: {
                l = (Long)objectArray[0];
                string2 = (String)objectArray[1];
                l = a ^ l;
                CallSite callSite = m44.a("i", (long)-3664495005701618298L, (long)l);
                try {
                    try {
                        string = string2;
                        if (callSite == null) break block4;
                        if (!string.startsWith(".")) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)((Object)n92), (long)-3536257290120417886L, (long)l);
                    }
                    return (String)((Object)m44.a("w", (Object)((Object)this), (long)-3979504198980561092L, (long)l)) + string2;
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)((Object)n93), (long)-3536257290120417886L, (long)l);
                }
            }
            string = (String)((Object)m44.a("w", (Object)((Object)this), (long)-3979504198980561092L, (long)l)) + "." + string2;
        }
        return string;
    }

    public dj(String string, _u _u2, _6 _62, yf yf2, long l) {
        long l2 = (l = a ^ l) ^ 0x1CD385B7DFB8L;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 48);
        int n3 = (int)(l2 << 32 >>> 32);
        super(string, _u2, _62, (char)n, yf2, (char)n2, n3);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                dj.a = prr.a((long)-1281645654580378799L, (long)-759639353684627887L, MethodHandles.lookup().lookupClass()).a(98771563313362L);
                dj.d = new HashMap<K, V>(13);
                var0 = dj.a ^ 107542178988680L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[17];
                var7_4 = 0;
                var6_5 = "Vy\u008d\u00a4h\u0019>\u00ac4\u00fdd\u009d\u001a\u00d1\u008c:\u00f1\u00e4d-\u0014i\u00841\u00d4\u009a5Xvq=\b\u0010\u00a9\u00a0W}[\u00efj\u00e3\u00b43\u0091\u00f7\u0084\u00a6,k\u0018\u00f6bJ\u00d0\u00f7e3\u00d9E\u0013\u00beTP\u00bc\u0093\u0099nP\u008f\u00f2\u00a2\u0018\u00c0) \u00da\u009d\u008e\n5pq\u008f\u00d1n\u00fa%N\"\u00fcF\u009c\u00d1\u00de\u00c6i\u0094|\u001a\u00e5i\t7X6\u008dM |'\u00d9N\u001d\u00f2\u00a1'I\u00b9\u00ab\u00bc\u00fe\u0090\u00e7\u0091\u00f4#\u00e6\u0089b\u00e1\u000f\u00ac\u008a\u001a\u00185\u00cdc\u00c8< 3\n\u00f6\u00b4\n\u0088*V\u0083x)\u00ec\u0087R\u00d92\u00c50\u008cd\u00d4b;\u00ed\u00cb$\u00de\u0085\u0080\u00c8Y\\\u0010!@G3\u0010\u009e\u00e4<\u00a9\u00d3g\u008fbK\u00d1\u000e\u0010\u00f7\u00a14\u009b\u00a5\u00d2R\u009d\u00ee\u0083WFw\u0087\u00d4\u0004\u0010\u00c5A\u00d2|\u00ed\u00c2\u0097\u0013\u00e0k\u00df\u00ae\u00b9W\u00fa\u00b7\u0010\u00da+\u001f\u00a9\u0018\tS\u0018\u00c7W\u00c74\u0012\u0019\u0015\u00fe +\u00c8\u00fe\u00e9Sh\\\u009a\u009f\u00a4\u00a6U\u00d5\u00fd\u0087\u0095\u00a67\u00af\u0088}\u00bb3\u00ea\u00f1n\u0017n\u00b6wt\u00f8\u0018\u00f4G\u00b9c\u009eG\u00cc\u00b7\u001f\u00d47}\u009bn\u0000e\u00a1\u00fc\u00d6+\u00f0h\u00f3h\u0018\b/\u008d\u00a0a\u00b5\u00d7\u00b8\u008b=\u00d8\u00ae\u0019\u00fb\u0012\u0091\u00a1vwC\u00b5\u0006D&\u0018\u0018\nY\u0081p\u0090\u00c3\u00f2\u0083\u0018\u00e3\u00f8\u00fa|U'S\u00a6E[\u0087\u00e5k%\u0010\u00f3\u00e2\\N\u00d4\u00f2\u0093W\b\u00f0_\u00df\u009a\u00f1\u00b0\u00fe";
                var8_6 = "Vy\u008d\u00a4h\u0019>\u00ac4\u00fdd\u009d\u001a\u00d1\u008c:\u00f1\u00e4d-\u0014i\u00841\u00d4\u009a5Xvq=\b\u0010\u00a9\u00a0W}[\u00efj\u00e3\u00b43\u0091\u00f7\u0084\u00a6,k\u0018\u00f6bJ\u00d0\u00f7e3\u00d9E\u0013\u00beTP\u00bc\u0093\u0099nP\u008f\u00f2\u00a2\u0018\u00c0) \u00da\u009d\u008e\n5pq\u008f\u00d1n\u00fa%N\"\u00fcF\u009c\u00d1\u00de\u00c6i\u0094|\u001a\u00e5i\t7X6\u008dM |'\u00d9N\u001d\u00f2\u00a1'I\u00b9\u00ab\u00bc\u00fe\u0090\u00e7\u0091\u00f4#\u00e6\u0089b\u00e1\u000f\u00ac\u008a\u001a\u00185\u00cdc\u00c8< 3\n\u00f6\u00b4\n\u0088*V\u0083x)\u00ec\u0087R\u00d92\u00c50\u008cd\u00d4b;\u00ed\u00cb$\u00de\u0085\u0080\u00c8Y\\\u0010!@G3\u0010\u009e\u00e4<\u00a9\u00d3g\u008fbK\u00d1\u000e\u0010\u00f7\u00a14\u009b\u00a5\u00d2R\u009d\u00ee\u0083WFw\u0087\u00d4\u0004\u0010\u00c5A\u00d2|\u00ed\u00c2\u0097\u0013\u00e0k\u00df\u00ae\u00b9W\u00fa\u00b7\u0010\u00da+\u001f\u00a9\u0018\tS\u0018\u00c7W\u00c74\u0012\u0019\u0015\u00fe +\u00c8\u00fe\u00e9Sh\\\u009a\u009f\u00a4\u00a6U\u00d5\u00fd\u0087\u0095\u00a67\u00af\u0088}\u00bb3\u00ea\u00f1n\u0017n\u00b6wt\u00f8\u0018\u00f4G\u00b9c\u009eG\u00cc\u00b7\u001f\u00d47}\u009bn\u0000e\u00a1\u00fc\u00d6+\u00f0h\u00f3h\u0018\b/\u008d\u00a0a\u00b5\u00d7\u00b8\u008b=\u00d8\u00ae\u0019\u00fb\u0012\u0091\u00a1vwC\u00b5\u0006D&\u0018\u0018\nY\u0081p\u0090\u00c3\u00f2\u0083\u0018\u00e3\u00f8\u00fa|U'S\u00a6E[\u0087\u00e5k%\u0010\u00f3\u00e2\\N\u00d4\u00f2\u0093W\b\u00f0_\u00df\u009a\u00f1\u00b0\u00fe".length();
                var5_7 = 32;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = dj.d(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00a3\u00cb2\u00c2\u00b4\u00f15\u00e8\u0084W\u00ec*\u00f1d\u00d2\u0007\u00d2uH?\u00ba6V\u00e4\u0018q\u0015\u00a4\u0080>\u00f7\u00b0\u00d1\u0096\u007f\u00f7k<\u00bf%W1V\u008f\u00bf@\u0016U\u00bf";
                    var8_6 = "\u00a3\u00cb2\u00c2\u00b4\u00f15\u00e8\u0084W\u00ec*\u00f1d\u00d2\u0007\u00d2uH?\u00ba6V\u00e4\u0018q\u0015\u00a4\u0080>\u00f7\u00b0\u00d1\u0096\u007f\u00f7k<\u00bf%W1V\u008f\u00bf@\u0016U\u00bf".length();
                    var5_7 = 24;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = dj.d(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        dj.b = var9_3;
        dj.c = new String[17];
    }

    private static n9 b(n9 n92) {
        return n92;
    }

    private static String d(byte[] byArray) {
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

    private static String d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5D41;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/dj", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            dj.c[n2] = dj.d(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dj.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/dj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dj.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
