/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._v;
import com.zelix.ai;
import com.zelix.hk;
import com.zelix.ir;
import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lq3;
import com.zelix.lqj;
import com.zelix.lqu;
import com.zelix.ltv;
import com.zelix.lyq;
import com.zelix.lyt;
import com.zelix.lyu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sz;
import com.zelix.u7;
import com.zelix.uf;
import com.zelix.z1;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ltb
extends l7t
implements z1,
u7,
lqj,
lq3 {
    private lqu A;
    private uf f;
    private lyt L;
    private lyq M;
    private String e;
    private lyt[] a;
    private lyu D;
    private List s;
    private ir X;
    private Map E;
    private String j;
    private static final long b;
    private static final String[] d;
    private static final String[] g;
    private static final Map h;
    private static final long k;

    @Override
    public String e(Object[] objectArray) {
        ltb ltb2;
        long l10;
        long l11;
        block4: {
            block5: {
                l11 = (Long)objectArray[0];
                long l12 = l11;
                long l13 = l12 ^ 0x270568F441BEL;
                l10 = l12 ^ 0x2AAD8F49B628L;
                CallSite callSite = m44.a("n", (long)-5069178255005697696L, (long)l11);
                try {
                    try {
                        ltb2 = this;
                        if (callSite == false) break block4;
                        if (m44.a("p", (Object)ltb2, (long)-6457765793357161670L, (long)l11) == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)-6351364318245014927L, (long)l11);
                    }
                    Object[] objectArray2 = new Object[5];
                    objectArray2[4] = l13;
                    objectArray2[3] = m44.a("p", (Object)this, (long)-6457765793357161670L, (long)l11);
                    objectArray2[2] = m44.a("p", (Object)this, (long)-4697169049772118418L, (long)l11);
                    objectArray2[1] = this.f;
                    objectArray2[0] = this.L;
                    return m44.a("n", (Object)objectArray2, (long)-6801088216128519482L, (long)l11);
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)-6351364318245014927L, (long)l11);
                }
            }
            ltb2 = this;
        }
        Object[] objectArray3 = new Object[7];
        objectArray3[6] = m44.a("p", (Object)this, (long)-6524086700461686006L, (long)l11);
        objectArray3[5] = m44.a("p", (Object)this, (long)-6402281770593205209L, (long)l11);
        objectArray3[4] = this.X;
        objectArray3[3] = this.M;
        objectArray3[2] = this.f;
        objectArray3[1] = l10;
        objectArray3[0] = ltb2.L;
        return m44.a("n", (Object)objectArray3, (long)-6382107687204825591L, (long)l11);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final boolean k(Object[] var1_1) {
        block81: {
            block108: {
                block107: {
                    var4_2 = (_v)var1_1[0];
                    var2_3 = (Long)var1_1[1];
                    var5_4 = (ai)var1_1[2];
                    v0 = var2_3;
                    v1 = v0 ^ 109393509595420L;
                    var6_5 = (int)(v1 >>> 48);
                    var7_6 = (int)(v1 << 16 >>> 32);
                    var8_7 = (int)(v1 << 48 >>> 48);
                    var9_8 = v0 ^ 133748230293839L;
                    var11_9 = v0 ^ 82550827049468L;
                    v2 = v0 ^ 117687567283846L;
                    var13_10 = (int)(v2 >>> 32);
                    var14_11 = (int)(v2 << 32 >>> 48);
                    var15_12 = (int)(v2 << 48 >>> 48);
                    var16_13 = v0 ^ 32295823650064L;
                    v3 = v0 ^ 113965472318227L;
                    var18_14 = v3 >>> 16;
                    var20_15 = (int)(v3 << 48 >>> 48);
                    var21_16 = v0 ^ 71355532113962L;
                    v4 = v0 ^ 49233928969116L;
                    var23_17 = (int)(v4 >>> 48);
                    var24_18 = (int)(v4 << 16 >>> 32);
                    var25_19 = (int)(v4 << 48 >>> 48);
                    var26_20 = v0 ^ 26010484453142L;
                    var28_21 = v0 ^ 112370768888067L;
                    var30_22 = v0 ^ 4761888765561L;
                    var32_23 = v0 ^ 9158269229501L;
                    var34_24 = v0 ^ 89386551044010L;
                    var36_25 = v0 ^ 127665900047565L;
                    var38_26 = v0 ^ 130255758210100L;
                    v5 = v0 ^ 133662450054240L;
                    var40_27 = (int)(v5 >>> 56);
                    var41_28 = (int)(v5 << 8 >>> 32);
                    var42_29 = (int)(v5 << 40 >>> 40);
                    var43_30 = v0 ^ 23786636843927L;
                    var45_31 = v0 ^ 134090241953800L;
                    var47_32 = v0 ^ 8469849592280L;
                    var49_33 = v0 ^ 123549269406795L;
                    var51_34 = m44.a("m", (long)-2241803378904648741L, (long)var2_3);
                    if (m44.a("s", (Object)this, (long)-1773839864441841095L, (long)var2_3) == null) break block107;
                    v6 = new Object[1];
                    v6[0] = var32_23;
                    var53_36 = var52_35 /* !! */  = m44.a("r", (Object)var4_2, (Object)v6, (long)-2245918573107907325L, (long)var2_3);
                    var54_37 = var53_36.length;
                    var55_38 = 0;
                    while (var55_38 < var54_37) {
                        block84: {
                            block85: {
                                block91: {
                                    block90: {
                                        block88: {
                                            block86: {
                                                block82: {
                                                    var56_39 = var53_36[var55_38];
                                                    try {
                                                        try {
                                                            block83: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v7 /* !! */  = ltv.L(var56_39.T(), this.f, var11_9);
                                                                            v8 = var51_34;
                                                                            if (var2_3 > 0L) {
                                                                                if (v8 != false) break block81;
                                                                                v8 = var51_34;
                                                                            }
                                                                            if (v8 != false) break block82;
                                                                        }
                                                                        catch (n9 v9) {
                                                                            throw m44.a("m", (Object)v9, (long)-1812683461548739726L, (long)var2_3);
                                                                        }
                                                                        if (v7 /* !! */ ) break block83;
                                                                    }
                                                                    catch (n9 v10) {
                                                                        throw m44.a("m", (Object)v10, (long)-1812683461548739726L, (long)var2_3);
                                                                    }
                                                                    v11 /* !! */  = var51_34;
                                                                    if (var2_3 < 0L) break block84;
                                                                    if (v11 /* !! */  == false) break block85;
                                                                }
                                                                catch (n9 v12) {
                                                                    throw m44.a("m", (Object)v12, (long)-1812683461548739726L, (long)var2_3);
                                                                }
                                                            }
                                                            v13 = this;
                                                            v14 = var51_34;
                                                            if (var2_3 >= 0L) {
                                                                if (v14 != false) break block86;
                                                            }
                                                            ** GOTO lbl116
                                                        }
                                                        catch (n9 v15) {
                                                            throw m44.a("m", (Object)v15, (long)-1812683461548739726L, (long)var2_3);
                                                        }
                                                        v11 /* !! */  = (CallSite)m44.a("s", (Object)v13, (long)-1773839864441841095L, (long)var2_3).i((char)var6_5, var7_6, (short)var8_7, (String)m44.a("m", (Object)var56_39, (long)var36_25, (long)-421479766932381814L, (long)var2_3));
                                                    }
                                                    catch (n9 v16) {
                                                        throw m44.a("m", (Object)v16, (long)-1812683461548739726L, (long)var2_3);
                                                    }
                                                }
                                                try {
                                                    block87: {
                                                        try {
                                                            if (var2_3 > 0L) {
                                                                if (v11 /* !! */  != false) break block87;
                                                                v11 /* !! */  = var51_34;
                                                            }
                                                            if (var2_3 < 0L) break block84;
                                                            if (v11 /* !! */  == false) break block85;
                                                        }
                                                        catch (n9 v17) {
                                                            throw m44.a("m", (Object)v17, (long)-1812683461548739726L, (long)var2_3);
                                                        }
                                                    }
                                                    v13 = this;
                                                }
                                                catch (n9 v18) {
                                                    throw m44.a("m", (Object)v18, (long)-1812683461548739726L, (long)var2_3);
                                                }
                                            }
                                            try {
                                                block89: {
                                                    try {
                                                        try {
                                                            try {
                                                                if (var2_3 < 0L) break block88;
                                                                v14 = var51_34;
lbl116:
                                                                // 2 sources

                                                                if (v14 != false) break block88;
                                                                if (v13.L != null) {
                                                                }
                                                                break block89;
                                                            }
                                                            catch (n9 v19) {
                                                                throw m44.a("m", (Object)v19, (long)-1812683461548739726L, (long)var2_3);
                                                            }
                                                            if (m44.a("m", (Object)var56_39, (long)var45_31, (Object)this.L, (Object)var5_4, (long)-1973943847698307271L, (long)var2_3) != false) break block89;
                                                        }
                                                        catch (n9 v20) {
                                                            throw m44.a("m", (Object)v20, (long)-1812683461548739726L, (long)var2_3);
                                                        }
                                                        v11 /* !! */  = var51_34;
                                                        if (var2_3 < 0L) break block84;
                                                        if (v11 /* !! */  == false) break block85;
                                                    }
                                                    catch (n9 v21) {
                                                        throw m44.a("m", (Object)v21, (long)-1812683461548739726L, (long)var2_3);
                                                    }
                                                }
                                                v13 = this;
                                            }
                                            catch (n9 v22) {
                                                throw m44.a("m", (Object)v22, (long)-1812683461548739726L, (long)var2_3);
                                            }
                                        }
                                        try {
                                            try {
                                                v23 = m44.a("s", (Object)v13, (long)-12618469738746003L, (long)var2_3);
                                                if (var2_3 < 0L || var51_34 != false) break block90;
                                                if (v23 != null) {
                                                }
                                                ** GOTO lbl167
                                            }
                                            catch (n9 v24) {
                                                throw m44.a("m", (Object)v24, (long)-1812683461548739726L, (long)var2_3);
                                            }
                                            v23 = m44.a("s", (Object)this, (long)-12618469738746003L, (long)var2_3);
                                        }
                                        catch (n9 v25) {
                                            throw m44.a("m", (Object)v25, (long)-1812683461548739726L, (long)var2_3);
                                        }
                                    }
                                    try {
                                        block92: {
                                            try {
                                                try {
                                                    v26 = v23.equals(hk.U(var56_39, (byte)var40_27, var41_28, var42_29));
                                                    if (var51_34 != false) break block91;
                                                    if (v26) break block92;
                                                }
                                                catch (n9 v27) {
                                                    throw m44.a("m", (Object)v27, (long)-1812683461548739726L, (long)var2_3);
                                                }
                                                v11 /* !! */  = var51_34;
                                                if (var2_3 < 0L) break block84;
                                                if (v11 /* !! */  == false) break block85;
                                            }
                                            catch (n9 v28) {
                                                throw m44.a("m", (Object)v28, (long)-1812683461548739726L, (long)var2_3);
                                            }
                                        }
                                        v26 = true;
                                    }
                                    catch (n9 v29) {
                                        throw m44.a("m", (Object)v29, (long)-1812683461548739726L, (long)var2_3);
                                    }
                                }
                                return v26;
                            }
                            ++var55_38;
                            v11 /* !! */  = var51_34;
                        }
                        if (v11 /* !! */  == false) continue;
                    }
                    v7 /* !! */  = var51_34;
                    if (var2_3 <= 0L) break block81;
                    if (!v7 /* !! */ ) break block108;
                }
                var53_36 = var52_35 /* !! */  = var4_2.A(var30_22);
                var54_37 = var53_36.length;
                var55_38 = 0;
                while (var55_38 < var54_37) {
                    block95: {
                        block96: {
                            block105: {
                                block103: {
                                    block104: {
                                        block102: {
                                            block101: {
                                                block97: {
                                                    block93: {
                                                        var56_39 = var53_36[var55_38];
                                                        try {
                                                            block94: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v7 /* !! */  = ltv.L(var56_39.T(), this.f, var11_9);
                                                                            v30 = var51_34;
                                                                            if (var2_3 >= 0L) {
                                                                                if (v30 != false) break block81;
                                                                                v30 = var51_34;
                                                                            }
                                                                            if (var2_3 >= 0L) {
                                                                                if (v30 != false) break block93;
                                                                            }
                                                                            ** GOTO lbl225
                                                                        }
                                                                        catch (n9 v31) {
                                                                            throw m44.a("m", (Object)v31, (long)-1812683461548739726L, (long)var2_3);
                                                                        }
                                                                        if (var2_3 <= 0L) break block93;
                                                                        if (v7 /* !! */ ) break block94;
                                                                    }
                                                                    catch (n9 v32) {
                                                                        throw m44.a("m", (Object)v32, (long)-1812683461548739726L, (long)var2_3);
                                                                    }
                                                                    v33 /* !! */  = var51_34;
                                                                    if (var2_3 < 0L) break block95;
                                                                    if (v33 /* !! */  == false) break block96;
                                                                }
                                                                catch (n9 v34) {
                                                                    throw m44.a("m", (Object)v34, (long)-1812683461548739726L, (long)var2_3);
                                                                }
                                                            }
                                                            v33 /* !! */  = (CallSite)this.M.i((char)var6_5, var7_6, (short)var8_7, hk.d(var47_32, var56_39));
                                                        }
                                                        catch (n9 v35) {
                                                            throw m44.a("m", (Object)v35, (long)-1812683461548739726L, (long)var2_3);
                                                        }
                                                    }
                                                    try {
                                                        block98: {
                                                            try {
                                                                try {
                                                                    if (var2_3 <= 0L) break block97;
                                                                    v30 = var51_34;
lbl225:
                                                                    // 2 sources

                                                                    if (v30 != false) break block97;
                                                                    if (v33 /* !! */  != false) break block98;
                                                                }
                                                                catch (n9 v36) {
                                                                    throw m44.a("m", (Object)v36, (long)-1812683461548739726L, (long)var2_3);
                                                                }
                                                                v33 /* !! */  = var51_34;
                                                                if (var2_3 < 0L) break block95;
                                                                if (v33 /* !! */  == false) break block96;
                                                            }
                                                            catch (n9 v37) {
                                                                throw m44.a("m", (Object)v37, (long)-1812683461548739726L, (long)var2_3);
                                                            }
                                                        }
                                                        v33 /* !! */  = (CallSite)ltv.I(hk.U(var56_39, (byte)var40_27, var41_28, var42_29), (short)var23_17, this.X, var24_18, (short)var25_19);
                                                    }
                                                    catch (n9 v38) {
                                                        throw m44.a("m", (Object)v38, (long)-1812683461548739726L, (long)var2_3);
                                                    }
                                                }
                                                try {
                                                    block100: {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        block99: {
                                                                            try {
                                                                                if (var2_3 > 0L) {
                                                                                    if (v33 /* !! */  != false) break block99;
                                                                                    v33 /* !! */  = var51_34;
                                                                                }
                                                                                if (var2_3 < 0L) break block95;
                                                                                if (v33 /* !! */  == false) break block96;
                                                                            }
                                                                            catch (n9 v39) {
                                                                                throw m44.a("m", (Object)v39, (long)-1812683461548739726L, (long)var2_3);
                                                                            }
                                                                        }
                                                                        if (this.L != null) {
                                                                        }
                                                                        break block100;
                                                                    }
                                                                    catch (n9 v40) {
                                                                        throw m44.a("m", (Object)v40, (long)-1812683461548739726L, (long)var2_3);
                                                                    }
                                                                    v33 /* !! */  = (CallSite)ltv.o(var56_39, var18_14, this.L, var5_4, (short)var20_15);
                                                                    if (var2_3 <= 0L || var51_34 != false) break block101;
                                                                }
                                                                catch (n9 v41) {
                                                                    throw m44.a("m", (Object)v41, (long)-1812683461548739726L, (long)var2_3);
                                                                }
                                                                if (var2_3 <= 0L) break block101;
                                                                if (v33 /* !! */  != false) break block100;
                                                            }
                                                            catch (n9 v42) {
                                                                throw m44.a("m", (Object)v42, (long)-1812683461548739726L, (long)var2_3);
                                                            }
                                                            v33 /* !! */  = var51_34;
                                                            if (var2_3 <= 0L) break block95;
                                                            if (v33 /* !! */  == false) break block96;
                                                        }
                                                        catch (n9 v43) {
                                                            throw m44.a("m", (Object)v43, (long)-1812683461548739726L, (long)var2_3);
                                                        }
                                                    }
                                                    v33 /* !! */  = (CallSite)ltv.t(var56_39, (lyt[])m44.a("s", (Object)this, (long)-1862835939687660252L, (long)var2_3), this.X, var5_4, var38_26);
                                                }
                                                catch (n9 v44) {
                                                    throw m44.a("m", (Object)v44, (long)-1812683461548739726L, (long)var2_3);
                                                }
                                            }
                                            try {
                                                if (var2_3 > 0L) {
                                                    if (v33 /* !! */  != false) break block102;
                                                    v33 /* !! */  = var51_34;
                                                }
                                                if (var2_3 < 0L) break block95;
                                                if (v33 /* !! */  == false) break block96;
                                            }
                                            catch (n9 v45) {
                                                throw m44.a("m", (Object)v45, (long)-1812683461548739726L, (long)var2_3);
                                            }
                                        }
                                        var57_40 = new sz(var13_10, (short)var14_11, (char)var15_12);
                                        var58_41 = ltv.f(var5_4, var26_20, var56_39, (List)m44.a("s", (Object)this, (long)-1984205599559990775L, (long)var2_3), var57_40);
                                        try {
                                            v46 = var57_40.a(var49_33);
                                            v47 = var51_34;
                                            if (var2_3 >= 0L) {
                                                if (v47 != false) break block103;
                                                if (v46) break block104;
                                            }
                                            ** GOTO lbl356
                                        }
                                        catch (n9 v48) {
                                            throw m44.a("m", (Object)v48, (long)-1812683461548739726L, (long)var2_3);
                                        }
                                        var59_42 = (String)var57_40.t();
                                        v49 = new Object[1];
                                        v49[0] = var21_16;
                                        var60_43 = m44.a("r", (Object)this, (Object)v49, (long)-486030783030139318L, (long)var2_3);
                                        v50 = new Object[1];
                                        v50[0] = var28_21;
                                        v51 = new Object[4];
                                        v51[3] = m44.a("r", (Object)this, (Object)v50, (long)-2222888599280471992L, (long)var2_3);
                                        v51[2] = var9_8;
                                        v51[1] = ltb.a("q", (int)3348, (long)(4274654065237512245L ^ var2_3));
                                        v51[0] = var59_42;
                                        var59_42 = m44.a("m", (Object)v51, (long)-1778737037707254140L, (long)var2_3);
                                        v52 = new Object[1];
                                        v52[0] = var43_30;
                                        v53 = new Object[4];
                                        v53[3] = m44.a("r", (Object)var60_43, (Object)v52, (long)-2236779272135649588L, (long)var2_3);
                                        v53[2] = var9_8;
                                        v53[1] = ltb.a("q", (int)20594, (long)(6910506513432546653L ^ var2_3));
                                        v53[0] = var59_42;
                                        var59_42 = m44.a("m", (Object)v53, (long)-1778737037707254140L, (long)var2_3);
                                        v54 = new Object[1];
                                        v54[0] = var34_24;
                                        v55 = new Object[4];
                                        v55[3] = m44.a("m", (int)m44.a("r", (Object)var60_43, (Object)v54, (long)-2009006551697437774L, (long)var2_3), (long)-173126903859638249L, (long)var2_3);
                                        v55[2] = var9_8;
                                        v55[1] = ltb.a("q", (int)18749, (long)(260412708874327061L ^ var2_3));
                                        v55[0] = var59_42;
                                        var59_42 = m44.a("m", (Object)v55, (long)-1778737037707254140L, (long)var2_3);
                                        v56 = new Object[2];
                                        v56[1] = var16_13;
                                        v56[0] = var59_42;
                                        m44.a("r", (Object)m44.a("s", (Object)this, (long)-1945752928730603304L, (long)var2_3), (Object)v56, (long)-29050000217458943L, (long)var2_3);
                                    }
                                    v46 = var58_41;
                                }
                                try {
                                    block106: {
                                        try {
                                            try {
                                                v47 = var51_34;
lbl356:
                                                // 2 sources

                                                if (v47 != false) break block105;
                                                if (v46) break block106;
                                            }
                                            catch (n9 v57) {
                                                throw m44.a("m", (Object)v57, (long)-1812683461548739726L, (long)var2_3);
                                            }
                                            v33 /* !! */  = var51_34;
                                            if (var2_3 <= 0L) break block95;
                                            if (v33 /* !! */  == false) break block96;
                                        }
                                        catch (n9 v58) {
                                            throw m44.a("m", (Object)v58, (long)-1812683461548739726L, (long)var2_3);
                                        }
                                    }
                                    v46 = true;
                                }
                                catch (n9 v59) {
                                    throw m44.a("m", (Object)v59, (long)-1812683461548739726L, (long)var2_3);
                                }
                            }
                            return v46;
                        }
                        ++var55_38;
                        v33 /* !! */  = var51_34;
                    }
                    if (v33 /* !! */  == false) continue;
                }
            }
            v7 /* !! */  = false;
        }
        return v7 /* !! */ ;
    }

    public ltb(long l10, int n10) {
        long l11 = l10 = b ^ l10;
        long l12 = l11 ^ 0x4A503713A07CL;
        int n11 = (int)(l12 >>> 56);
        long l13 = l12 << 8 >>> 8;
        long l14 = l11 ^ 0x5408DF68267AL;
        super((byte)n11, n10, l13);
        Object[] objectArray = new Object[2];
        objectArray[1] = l14;
        objectArray[0] = (int)k;
        m44.a("t", (Object)this, (Map)((Object)m44.a("h", (Object)objectArray, (long)-6720751488072210597L, (long)l10)), (long)-4961442602365715332L, (long)l10);
        m44.a("t", (Object)this, new ArrayList(), (long)-4707494950956918572L, (long)l10);
    }

    @Override
    public void N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("w", (Object)this, (long)6704446191034465141L, (long)l10).add(string);
    }

    void H(Object[] objectArray) {
        lyt[] lytArray = (lyt[])objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = b ^ l10;
        m44.a("u", (Object)this, (lyt[])lytArray, (long)-4172082422575913704L, (long)l10);
    }

    void C(Object[] objectArray) {
        lyq lyq2 = (lyq)objectArray[0];
        this.M = lyq2;
    }

    /*
     * Unable to fully structure code
     */
    void Z(Object[] var1_1) {
        block33: {
            block37: {
                block34: {
                    block35: {
                        block31: {
                            var2_2 = (Long)var1_1[0];
                            var4_3 = (String)var1_1[1];
                            v0 = var2_2 = ltb.b ^ var2_2;
                            var5_4 = v0 ^ 52074352283739L;
                            var7_5 = v0 ^ 69212022149083L;
                            var9_6 = v0 ^ 118425918663782L;
                            var11_7 = v0 ^ 108469634923785L;
                            v1 = new Object[1];
                            v1[0] = var7_5;
                            v2 = new Object[1];
                            v2[0] = var9_6;
                            var14_8 = m44.a("s", (Object)m44.a("s", (Object)this, (Object)v1, (long)-8164960683628228165L, (long)var2_2), (Object)v2, (long)-7564882934398738115L, (long)var2_2);
                            v3 = new Object[1];
                            v3[0] = var7_5;
                            v4 = new Object[1];
                            v4[0] = var5_4;
                            var15_9 = m44.a("s", (Object)m44.a("s", (Object)this, (Object)v3, (long)-8164960683628228165L, (long)var2_2), (Object)v4, (long)-7786744405481866173L, (long)var2_2);
                            var13_10 = m44.a("l", (long)-7560701946994867158L, (long)var2_2);
                            try {
                                block32: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v5 = var4_3;
                                                                if (var13_10 != false) break block31;
                                                                if (v5.equals(ltb.a("q", (int)6002, (long)(6261484029862165925L ^ var2_2)))) break block32;
                                                            }
                                                            catch (n9 v6) {
                                                                throw m44.a("l", (Object)v6, (long)-7986725017369770877L, (long)var2_2);
                                                            }
                                                            v5 = var4_3;
                                                            if (var13_10 != false) break block31;
                                                        }
                                                        catch (n9 v7) {
                                                            throw m44.a("l", (Object)v7, (long)-7986725017369770877L, (long)var2_2);
                                                        }
                                                        if (var2_2 < 0L) break block31;
                                                        if (v5.equals(ltb.a("q", (int)19144, (long)(6406035620399013904L ^ var2_2)))) break block32;
                                                    }
                                                    catch (n9 v8) {
                                                        throw m44.a("l", (Object)v8, (long)-7986725017369770877L, (long)var2_2);
                                                    }
                                                    v5 = var4_3;
                                                    v9 = var13_10;
                                                    if (var2_2 > 0L) {
                                                        if (v9 != false) break block31;
                                                    }
                                                    ** GOTO lbl81
                                                }
                                                catch (n9 v10) {
                                                    throw m44.a("l", (Object)v10, (long)-7986725017369770877L, (long)var2_2);
                                                }
                                                if (var2_2 < 0L) break block31;
                                                if (v5.equals(ltb.a("q", (int)10697, (long)(2000790893245956885L ^ var2_2)))) break block32;
                                            }
                                            catch (n9 v11) {
                                                throw m44.a("l", (Object)v11, (long)-7986725017369770877L, (long)var2_2);
                                            }
                                            v5 = var4_3;
                                            if (var13_10 != false) break block33;
                                        }
                                        catch (n9 v12) {
                                            throw m44.a("l", (Object)v12, (long)-7986725017369770877L, (long)var2_2);
                                        }
                                        if (!v5.equals(ltb.a("q", (int)30450, (long)(4675551382291307567L ^ var2_2)))) break block34;
                                    }
                                    catch (n9 v13) {
                                        throw m44.a("l", (Object)v13, (long)-7986725017369770877L, (long)var2_2);
                                    }
                                }
                                v5 = m44.a("r", (Object)this, (long)-8554985622093735867L, (long)var2_2);
                            }
                            catch (n9 v14) {
                                throw m44.a("l", (Object)v14, (long)-7986725017369770877L, (long)var2_2);
                            }
                        }
                        try {
                            block36: {
                                try {
                                    try {
                                        v9 = var13_10;
lbl81:
                                        // 2 sources

                                        if (var2_2 >= 0L) {
                                            if (v9 != false) break block35;
                                            if (v5 != null) break block36;
                                        }
                                        ** GOTO lbl104
                                    }
                                    catch (n9 v15) {
                                        throw m44.a("l", (Object)v15, (long)-7986725017369770877L, (long)var2_2);
                                    }
                                    v16 = this;
                                    if (var2_2 < 0L) break block37;
                                    m44.a("p", (Object)v16, (String)var4_3, (long)-8554985622093735867L, (long)var2_2);
                                    if (var13_10 == false) break block34;
                                }
                                catch (n9 v17) {
                                    throw m44.a("l", (Object)v17, (long)-7986725017369770877L, (long)var2_2);
                                }
                            }
                            v5 = m44.a("r", (Object)this, (long)-8554985622093735867L, (long)var2_2);
                        }
                        catch (n9 v18) {
                            throw m44.a("l", (Object)v18, (long)-7986725017369770877L, (long)var2_2);
                        }
                    }
                    try {
                        try {
                            v9 = var13_10;
lbl104:
                            // 2 sources

                            if (v9 != false) break block33;
                            if (v5.equals(var4_3)) break block34;
                        }
                        catch (n9 v19) {
                            throw m44.a("l", (Object)v19, (long)-7986725017369770877L, (long)var2_2);
                        }
                        v20 = new Object[3];
                        v20[2] = var11_7;
                        v20[1] = true;
                        v20[0] = "\"" + var4_3 + (String)ltb.a("q", (int)1720, (long)(1416415349077388396L ^ var2_2)) + (String)m44.a("r", (Object)this, (long)-8554985622093735867L, (long)var2_2) + (String)ltb.a("q", (int)16611, (long)(556465021128272440L ^ var2_2)) + (String)var14_8 + (String)ltb.a("q", (int)11795, (long)(1765060366621607109L ^ var2_2)) + (int)var15_9 + (String)ltb.a("q", (int)9486, (long)(1652962287137492945L ^ var2_2)) + var4_3 + (String)ltb.a("q", (int)4230, (long)(976949354255268444L ^ var2_2));
                        m44.a("s", (Object)m44.a("r", (Object)this, (long)-7850282046050248919L, (long)var2_2), (Object)v20, (long)-8105294013976446049L, (long)var2_2);
                        return;
                    }
                    catch (n9 v21) {
                        throw m44.a("l", (Object)v21, (long)-7986725017369770877L, (long)var2_2);
                    }
                }
                v16 = this;
            }
            v5 = m44.a("r", (Object)v16, (long)-7635530016696282800L, (long)var2_2).put(var4_3, var4_3);
        }
        var16_11 = v5;
        try {
            if (var2_2 >= 0L && var16_11 != null) {
                v22 = new Object[3];
                v22[2] = var11_7;
                v22[1] = true;
                v22[0] = "\"" + var4_3 + (String)ltb.a("q", (int)20537, (long)(2820866846177000168L ^ var2_2)) + (String)var14_8 + (String)ltb.a("q", (int)1039, (long)(2596098755760172762L ^ var2_2)) + (int)var15_9 + ".";
                m44.a("s", (Object)m44.a("r", (Object)this, (long)-7850282046050248919L, (long)var2_2), (Object)v22, (long)-8105294013976446049L, (long)var2_2);
            }
        }
        catch (n9 v23) {
            throw m44.a("l", (Object)v23, (long)-7986725017369770877L, (long)var2_2);
        }
    }

    @Override
    public void M(Object[] objectArray) {
        block6: {
            lmu lmu2 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            long l10 = (Long)objectArray[2];
            long l11 = l10;
            long l12 = l11 ^ 0x7008BC02B2C1L;
            long l13 = l11 ^ 0x47526B4E5A06L;
            long l14 = l11 ^ 0L;
            CallSite callSite = m44.a("h", (long)-6823249310977527178L, (long)l10);
            m44.a("t", (Object)this, (lqu)lqu2, (long)-6534092667854691979L, (long)l10);
            CallSite callSite2 = callSite;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l13;
            CallSite callSite3 = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l10);
            int n10 = 0;
            block2: while (n10 < callSite3) {
                lmu lmu3 = this.V(n10);
                try {
                    Object[] objectArray3 = new Object[3];
                    objectArray3[2] = l14;
                    objectArray3[1] = m44.a("v", (Object)this, (long)-6534092667854691979L, (long)l10);
                    objectArray3[0] = this;
                    m44.a("w", (Object)lmu3, (Object)objectArray3, (long)-6656114929610942631L, (long)l10);
                    ++n10;
                    do {
                        CallSite callSite4 = callSite2;
                        if (l10 > 0L) {
                            if (callSite4 != false) break block6;
                            callSite4 = callSite2;
                        }
                        if (callSite4 == false) continue block2;
                    } while (l10 < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)-6380056211719048481L, (long)l10);
                }
            }
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l12;
            m44.a("i", (Object)this, (Object)objectArray4, (long)-4690114100447696271L, (long)l10);
        }
    }

    @Override
    public void I(Object[] objectArray) {
        lyu lyu2 = (lyu)objectArray[0];
        long l10 = (Long)objectArray[1];
        m44.a("t", (Object)this, (lyu)lyu2, (long)-7861238059491184708L, (long)l10);
    }

    void Q(Object[] objectArray) {
        ir ir2 = (ir)objectArray[0];
        this.X = ir2;
    }

    @Override
    public void W(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        lyt lyt2 = (lyt)objectArray[1];
        this.L = lyt2;
    }

    @Override
    public void A(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        m44.a("t", (Object)this, (String)string, (long)-8356874154487341896L, (long)l10);
    }

    private void D(Object[] objectArray) {
        block3: {
            int n10;
            long l10;
            long l11;
            block4: {
                block2: {
                    l11 = (Long)objectArray[0];
                    l10 = (l11 = b ^ l11) ^ 0x460445D25B53L;
                    CallSite callSite = m44.a("m", (long)-7708476797270485565L, (long)l11);
                    if (m44.a("s", (Object)this, (long)-8448123755340941415L, (long)l11) == null) break block2;
                    n10 = 3;
                    if (l11 <= 0L) break block3;
                    if (callSite != false) break block4;
                }
                n10 = 4;
            }
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = n10;
            objectArray2[1] = m44.a("s", (Object)this, (long)-8333794776931415295L, (long)l11);
            objectArray2[0] = l10;
            this.f = m44.a("m", (Object)objectArray2, (long)-8573733443009274650L, (long)l11);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    ltb.b = prr.a(-733794929453162476L, -4021514721056446913L, MethodHandles.lookup().lookupClass()).a(192103943678003L);
                    ltb.h = new HashMap<K, V>(13);
                    var5 = ltb.b ^ 84118523825332L;
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
                    var14_3 = new String[14];
                    var12_4 = 0;
                    var11_5 = "\u00ce\u009e\u00b0\u0097d\u00cf\u00c8\u0098'\u00c3t\u0003\u00eb'\u00ffW\u0010~T\u0094\u001e9\u00f2\u00a2\u00ef\u0015(k\u00f0R\u00d6\u00be\u00c1\u0010\u00f8%\u00b0Y\u00da\u0001\u00025\u0095|\u0000D)\u00cc\u00bc\u00a1\u0010T\u00c3\u00fb\u00e2\u0097\u0013\u00ad\bC\u0097\u0003\u00d8o\u00cf\u0004\r\u0010iW\u00fbt\u0005X\u00af\u00cb^W\u0000\u00a8\u00f4#\u00985 1\u00c4\u00ea\u00a3\u00ba\u0012P\u009dII\u0016\u00e6\u00bc\u00e0\u00c5r\u0015\u00b5\u009f\u001c\u00f4\u00cdk\u008e\u009cc[\u00bc\u0089\u00b3\b\u0018\u0010\u00a5\u00e1\u00e8'\u0099Q\u00a9\u00f9r\u0089Z\u0086\u009d\u00feV\u00cc\u0018\u00ef \u0012\u00d0\u00bf\u00b7P\u00f9Q\u001eU\u00bc\u00a0\u00d8tAK\u000fgt\u00f49z\u00ed(\u00f5\u00cb\u00d3w\u0001; \u00ce\u009e1\u00b8\u00a6DK\u00e8\u008f\u00d5\u00a3e\u00bc\u0099\u00a5\u0090\n\u007f\u0084K\u008d\u0092\u0088\u00d7\u000eU\u00e3,s\u00d6\u00df\u00b1@(\u000e\u008bv\u00f0\u007f\u00b2/\u00c3\u00c4q\u00ab\u00d38\u008d\u0083\u00a3|\u008f5\u00d7\u0080\u00ea\b8\u0001\u00c4\u00b0\u0082v\u008dZ\u00b5\u00d1\u00fc:\u009e\u000bF\u00c0\u0093\u0010zPz\u0003\u0085$5\u00dc\u00a6.V\u0098\u0097\u00f0B\u0016(\u0086\u00ee+\u00f5\u00fa(\u009a\u0092-*a\u0007\u0006\u00dfK&M\u0088\u00e2.v\u00ad\u00c9\u00d9\u0095A\u0094B=\bB\u00ad@h\u00b5L\u00a7\u0094[\u00d2";
                    var13_6 = "\u00ce\u009e\u00b0\u0097d\u00cf\u00c8\u0098'\u00c3t\u0003\u00eb'\u00ffW\u0010~T\u0094\u001e9\u00f2\u00a2\u00ef\u0015(k\u00f0R\u00d6\u00be\u00c1\u0010\u00f8%\u00b0Y\u00da\u0001\u00025\u0095|\u0000D)\u00cc\u00bc\u00a1\u0010T\u00c3\u00fb\u00e2\u0097\u0013\u00ad\bC\u0097\u0003\u00d8o\u00cf\u0004\r\u0010iW\u00fbt\u0005X\u00af\u00cb^W\u0000\u00a8\u00f4#\u00985 1\u00c4\u00ea\u00a3\u00ba\u0012P\u009dII\u0016\u00e6\u00bc\u00e0\u00c5r\u0015\u00b5\u009f\u001c\u00f4\u00cdk\u008e\u009cc[\u00bc\u0089\u00b3\b\u0018\u0010\u00a5\u00e1\u00e8'\u0099Q\u00a9\u00f9r\u0089Z\u0086\u009d\u00feV\u00cc\u0018\u00ef \u0012\u00d0\u00bf\u00b7P\u00f9Q\u001eU\u00bc\u00a0\u00d8tAK\u000fgt\u00f49z\u00ed(\u00f5\u00cb\u00d3w\u0001; \u00ce\u009e1\u00b8\u00a6DK\u00e8\u008f\u00d5\u00a3e\u00bc\u0099\u00a5\u0090\n\u007f\u0084K\u008d\u0092\u0088\u00d7\u000eU\u00e3,s\u00d6\u00df\u00b1@(\u000e\u008bv\u00f0\u007f\u00b2/\u00c3\u00c4q\u00ab\u00d38\u008d\u0083\u00a3|\u008f5\u00d7\u0080\u00ea\b8\u0001\u00c4\u00b0\u0082v\u008dZ\u00b5\u00d1\u00fc:\u009e\u000bF\u00c0\u0093\u0010zPz\u0003\u0085$5\u00dc\u00a6.V\u0098\u0097\u00f0B\u0016(\u0086\u00ee+\u00f5\u00fa(\u009a\u0092-*a\u0007\u0006\u00dfK&M\u0088\u00e2.v\u00ad\u00c9\u00d9\u0095A\u0094B=\bB\u00ad@h\u00b5L\u00a7\u0094[\u00d2".length();
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
                        var14_3[var12_4++] = ltb.b(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "\u00d95\u00d5a-\u0019p;\u00cb\u00ab\u00c1\u00e9W)\u00f1\u009b\u00f7P\u001c\\\u00be\u00f0#\u00cf?d\u0088`KD.\u00cer\\q)\u00aerQ\u00d7^ux\u0090%j\u00a2\u00c8\u008a\u00bb\u0018W\u0015\u001c\u0013\u0085\u0010B\u00d9\u00bc\u00b8\u00d8}\u00e3P\u00df\u0002?d\u00aa&0\u008c";
                        var13_6 = "\u00d95\u00d5a-\u0019p;\u00cb\u00ab\u00c1\u00e9W)\u00f1\u009b\u00f7P\u001c\\\u00be\u00f0#\u00cf?d\u0088`KD.\u00cer\\q)\u00aerQ\u00d7^ux\u0090%j\u00a2\u00c8\u008a\u00bb\u0018W\u0015\u001c\u0013\u0085\u0010B\u00d9\u00bc\u00b8\u00d8}\u00e3P\u00df\u0002?d\u00aa&0\u008c".length();
                        var10_7 = 56;
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
                        var14_3[var12_4++] = ltb.b(var15_9).intern();
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
            ltb.d = var14_3;
            ltb.g = new String[14];
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
        var2_12 = 3639645349333015869L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        ltb.k = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x2916;
        if (g[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ltb", exception);
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
            ltb.g[n11] = ltb.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = ltb.a(n10, l10);
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
            throw new RuntimeException("com/zelix/ltb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ltb.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

