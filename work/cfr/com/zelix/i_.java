/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.a;
import com.zelix.bn;
import com.zelix.c;
import com.zelix.c4;
import com.zelix.cf;
import com.zelix.eo;
import com.zelix.fb;
import com.zelix.h1;
import com.zelix.hj;
import com.zelix.hp;
import com.zelix.hz;
import com.zelix.ic;
import com.zelix.ii;
import com.zelix.io;
import com.zelix.j2;
import com.zelix.j5;
import com.zelix.j9;
import com.zelix.jd;
import com.zelix.jf;
import com.zelix.js;
import com.zelix.l6q;
import com.zelix.lby;
import com.zelix.lk0;
import com.zelix.lk9;
import com.zelix.loj;
import com.zelix.m44;
import com.zelix.mb;
import com.zelix.n9;
import com.zelix.oz;
import com.zelix.prr;
import com.zelix.r8;
import com.zelix.u2;
import com.zelix.u9;
import com.zelix.v7;
import com.zelix.x8;
import com.zelix.xa;
import com.zelix.xb;
import com.zelix.xk;
import com.zelix.xm;
import com.zelix.xp;
import com.zelix.xt;
import com.zelix.y0;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
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
public class i_
extends oz
implements r8,
a,
eo,
hj,
mb,
y0,
c4 {
    js k;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map g;
    private static final long[] m;
    private static final Integer[] n;
    private static final Map t;

    @Override
    public void U(Object[] objectArray) {
        block5: {
            xa xa2;
            block4: {
                xa xa3 = (xa)objectArray[0];
                xa2 = (xa)objectArray[1];
                long l10 = (Long)objectArray[2];
                CallSite callSite = m44.a("h", (long)-5485674813792749566L, (long)l10);
                try {
                    i_ i_2;
                    try {
                        i_2 = this;
                        if (callSite == false) break block4;
                        if (i_2.k != xa3) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-6100475499714101502L, (long)l10);
                    }
                    i_2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-6100475499714101502L, (long)l10);
                }
            }
            i_2.k = xa2;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public final boolean d(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 14[SWITCH]
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

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public hz n(hz var1_1, boolean var2_2, char var3_3, int var4_4, boolean var5_5, loj var6_6, char var7_7, String var8_8) {
        block85: {
            v0 = var9_9 = (long)var3_3 << 48 | (long)var4_4 << 32 >>> 16 | (long)var7_7 << 48 >>> 48;
            var11_10 = v0 ^ 9235592160028L;
            var13_11 = v0 ^ 6215624408093L;
            var15_12 = v0 ^ 114161761794490L;
            var17_13 = v0 ^ 31988536357509L;
            var19_14 = v0 ^ 121995932232441L;
            var21_15 = v0 ^ 124303018560863L;
            var23_16 = v0 ^ 9278367680005L;
            var25_17 = v0 ^ 332116234582L;
            v1 = v0 ^ 101946427565099L;
            var27_18 = (int)(v1 >>> 56);
            var28_19 = (int)(v1 << 8 >>> 32);
            var29_20 = (int)(v1 << 40 >>> 40);
            v2 = v0 ^ 65811635556040L;
            var30_21 = v2 >>> 8;
            var32_22 = (int)(v2 << 56 >>> 56);
            var33_23 = v0 ^ 5679798847631L;
            var35_24 = v0 ^ 8842354942294L;
            var37_25 = v0 ^ 66632514719157L;
            var39_26 = v0 ^ 129763427281871L;
            var42_27 = new lby(var30_21, var8_8, (byte)var32_22);
            var43_28 = var1_1.T();
            var44_29 = var1_1.X();
            var45_30 = null;
            var46_31 = var44_29.length;
            var47_32 = var1_1.j();
            var41_33 = m44.a("l", (long)-4354173775004039090L, (long)var9_9);
            var48_34 = var1_1.k(var13_11);
            try {
                v3 = this.X;
                if (var41_33 == false) break block85;
            }
            catch (n9 v4) {
                throw m44.a("l", (Object)v4, (long)-2658557484950466738L, (long)var9_9);
            }
            {
                ** switch (v3)
            }
lbl-1000:
            // 1 sources

            {
                case 19: {
                    var45_30 = v7.I(var46_31 + 1, var25_17);
                    try {
                        System.arraycopy(var44_29, 0, var45_30, 0, var46_31);
                        v5 /* !! */  = this.k instanceof c;
                        v6 = var41_33;
                        if (var7_7 <= '\u0000') ** GOTO lbl121
                        if (v6 == false) ** GOTO lbl117
                        if (v5 /* !! */  != 0) {
                        }
                        ** GOTO lbl112
                    }
                    catch (n9 v7) {
                        throw m44.a("l", (Object)v7, (long)-2658557484950466738L, (long)var9_9);
                    }
                    var49_35 = ((c)this.k).j(var35_24);
                    try {
                        try {
                            try {
                                v5 /* !! */  = (int)var49_35.equals(i_.b("r", (int)13461, (long)(3064681577023547586L ^ var9_9)));
                                v8 = var41_33;
                                if (var3_3 < '\u0000') ** GOTO lbl82
                                if (v8 == false) ** GOTO lbl77
                                if (v5 /* !! */  != 0) {
                                }
                                ** GOTO lbl73
                            }
                            catch (n9 v9) {
                                throw m44.a("l", (Object)v9, (long)-2658557484950466738L, (long)var9_9);
                            }
                            var45_30[var46_31] = v7.B;
                            v5 /* !! */  = (int)var41_33;
                            if (var4_4 < 0) ** GOTO lbl110
                            if (v5 /* !! */  == 0) {
                            }
                            ** GOTO lbl108
                        }
                        catch (n9 v10) {
                            throw m44.a("l", (Object)v10, (long)-2658557484950466738L, (long)var9_9);
                        }
lbl73:
                        // 2 sources

                        v5 /* !! */  = (int)var49_35.equals(i_.b("r", (int)19223, (long)(6472760952396142418L ^ var9_9)));
                    }
                    catch (n9 v11) {
                        throw m44.a("l", (Object)v11, (long)-2658557484950466738L, (long)var9_9);
                    }
lbl77:
                    // 2 sources

                    try {
                        try {
                            try {
                                if (var4_4 < 0) ** GOTO lbl100
                                v8 = var41_33;
lbl82:
                                // 2 sources

                                if (v8 == false) ** GOTO lbl100
                                if (v5 /* !! */  != 0) {
                                }
                                ** GOTO lbl96
                            }
                            catch (n9 v12) {
                                throw m44.a("l", (Object)v12, (long)-2658557484950466738L, (long)var9_9);
                            }
                            var45_30[var46_31] = v7.Y;
                            v5 /* !! */  = (int)var41_33;
                            if (var7_7 <= '\u0000') ** GOTO lbl110
                            if (v5 /* !! */  == 0) {
                            }
                            ** GOTO lbl108
                        }
                        catch (n9 v13) {
                            throw m44.a("l", (Object)v13, (long)-2658557484950466738L, (long)var9_9);
                        }
lbl96:
                        // 2 sources

                        v5 /* !! */  = (int)var49_35.equals(i_.b("r", (int)27941, (long)(6941538905803059559L ^ var9_9)));
                    }
                    catch (n9 v14) {
                        throw m44.a("l", (Object)v14, (long)-2658557484950466738L, (long)var9_9);
                    }
lbl100:
                    // 3 sources

                    try {
                        if (var3_3 >= '\u0000') {
                            if (v5 /* !! */  != 0) {
                                var45_30[var46_31] = v7.V;
                            }
                        }
                        ** GOTO lbl110
                    }
                    catch (n9 v15) {
                        throw m44.a("l", (Object)v15, (long)-2658557484950466738L, (long)var9_9);
                    }
lbl108:
                    // 3 sources

                    try {
                        v5 /* !! */  = (int)var41_33;
lbl110:
                        // 4 sources

                        if (var7_7 <= '\u0000') ** GOTO lbl117
                        if (v5 /* !! */  != 0) ** GOTO lbl201
lbl112:
                        // 2 sources

                        v5 /* !! */  = this.k instanceof jf;
                    }
                    catch (n9 v16) {
                        throw m44.a("l", (Object)v16, (long)-2658557484950466738L, (long)var9_9);
                    }
lbl117:
                    // 3 sources

                    try {
                        try {
                            try {
                                v6 = var41_33;
lbl121:
                                // 2 sources

                                if (var7_7 <= '\u0000') ** GOTO lbl140
                                if (v6 == false) ** GOTO lbl138
                                if (v5 /* !! */  != 0) {
                                }
                                ** GOTO lbl134
                            }
                            catch (n9 v17) {
                                throw m44.a("l", (Object)v17, (long)-2658557484950466738L, (long)var9_9);
                            }
                            var45_30[var46_31] = m44.a("h", (long)-2615269712084233667L, (long)var9_9);
                            if (var41_33 == false) {
                            }
                            ** GOTO lbl201
                        }
                        catch (n9 v18) {
                            throw m44.a("l", (Object)v18, (long)-2658557484950466738L, (long)var9_9);
                        }
lbl134:
                        // 2 sources

                        v5 /* !! */  = this.k instanceof j2;
                    }
                    catch (n9 v19) {
                        throw m44.a("l", (Object)v19, (long)-2658557484950466738L, (long)var9_9);
                    }
lbl138:
                    // 2 sources

                    try {
                        v6 = var41_33;
lbl140:
                        // 2 sources

                        if (var4_4 <= 0) ** GOTO lbl161
                        if (v6 == false) ** GOTO lbl159
                        if (v5 /* !! */  != 0) {
                        }
                        ** GOTO lbl154
                    }
                    catch (n9 v20) {
                        throw m44.a("l", (Object)v20, (long)-2658557484950466738L, (long)var9_9);
                    }
                    var45_30 = v7.I(var46_31 + 1, var25_17);
                    try {
                        System.arraycopy(var44_29, 0, var45_30, 0, var46_31);
                        var45_30[var46_31] = v7.M((byte)var27_18, var28_19, var29_20, (String)i_.b("r", (int)30411, (long)(1162045264073484955L ^ var9_9)));
                        v5 /* !! */  = (int)var41_33;
                        if (var7_7 < '\u0000') ** GOTO lbl159
                        if (v5 /* !! */  != 0) ** GOTO lbl201
lbl154:
                        // 2 sources

                        v5 /* !! */  = this.k instanceof j9;
                    }
                    catch (n9 v21) {
                        throw m44.a("l", (Object)v21, (long)-2658557484950466738L, (long)var9_9);
                    }
lbl159:
                    // 3 sources

                    try {
                        v6 = var41_33;
lbl161:
                        // 2 sources

                        if (var3_3 < '\u0000') ** GOTO lbl183
                        if (v6 == false) ** GOTO lbl180
                        if (v5 /* !! */  != 0) {
                        }
                        ** GOTO lbl175
                    }
                    catch (n9 v22) {
                        throw m44.a("l", (Object)v22, (long)-2658557484950466738L, (long)var9_9);
                    }
                    var45_30 = v7.I(var46_31 + 1, var25_17);
                    try {
                        System.arraycopy(var44_29, 0, var45_30, 0, var46_31);
                        var45_30[var46_31] = v7.M((byte)var27_18, var28_19, var29_20, (String)i_.b("r", (int)14490, (long)(6398058744939586766L ^ var9_9)));
                        v5 /* !! */  = (int)var41_33;
                        if (var7_7 <= '\u0000') ** GOTO lbl180
                        if (v5 /* !! */  != 0) ** GOTO lbl201
lbl175:
                        // 2 sources

                        v5 /* !! */  = this.k instanceof j5;
                    }
                    catch (n9 v23) {
                        throw m44.a("l", (Object)v23, (long)-2658557484950466738L, (long)var9_9);
                    }
lbl180:
                    // 3 sources

                    try {
                        try {
                            v6 = var41_33;
lbl183:
                            // 2 sources

                            if (v6 == false) ** GOTO lbl193
                            if (v5 /* !! */  != 0) {
                            }
                            ** GOTO lbl201
                        }
                        catch (n9 v24) {
                            throw m44.a("l", (Object)v24, (long)-2658557484950466738L, (long)var9_9);
                        }
                        v5 /* !! */  = var46_31 + 1;
                    }
                    catch (n9 v25) {
                        throw m44.a("l", (Object)v25, (long)-2658557484950466738L, (long)var9_9);
                    }
lbl193:
                    // 2 sources

                    var45_30 = v7.I(v5 /* !! */ , var25_17);
                    System.arraycopy(var44_29, 0, var45_30, 0, var46_31);
                    var49_35 = (j5)this.k;
                    v26 = new Object[1];
                    v26[0] = var17_13;
                    var50_37 = m44.a("s", (Object)var49_35, (Object)v26, (long)-2683358755509513721L, (long)var9_9);
                    var45_30[var46_31] = v7.M((byte)var27_18, var28_19, var29_20, (String)var50_37);
lbl201:
                    // 6 sources

                    return new hz(var45_30, var43_28, var15_12, var47_32, var48_34);
                }
lbl202:
                // 1 sources

                case 20: {
                    var45_30 = v7.I(var46_31 + 1, var25_17);
                    System.arraycopy(var44_29, 0, var45_30, 0, var46_31);
                    var49_36 = ((c)this.k).j(var35_24);
                    try {
                        try {
                            try {
                                v27 = var49_36.equals(i_.b("r", (int)17158, (long)(7739820134899998558L ^ var9_9)));
                                if (var4_4 <= 0 || var41_33 == false) ** GOTO lbl226
                                if (v27) {
                                }
                                ** GOTO lbl222
                            }
                            catch (n9 v28) {
                                throw m44.a("l", (Object)v28, (long)-2658557484950466738L, (long)var9_9);
                            }
                            var45_30[var46_31] = v7.c;
                            if (var41_33 == false) {
                            }
                            ** GOTO lbl232
                        }
                        catch (n9 v29) {
                            throw m44.a("l", (Object)v29, (long)-2658557484950466738L, (long)var9_9);
                        }
lbl222:
                        // 2 sources

                        v27 = var49_36.equals(i_.b("r", (int)2609, (long)(5050132617710671478L ^ var9_9)));
                    }
                    catch (n9 v30) {
                        throw m44.a("l", (Object)v30, (long)-2658557484950466738L, (long)var9_9);
                    }
lbl226:
                    // 2 sources

                    try {
                        if (v27) {
                            var45_30[var46_31] = v7.z;
                        }
                    }
                    catch (n9 v31) {
                        throw m44.a("l", (Object)v31, (long)-2658557484950466738L, (long)var9_9);
                    }
lbl232:
                    // 2 sources

                    return new hz(var45_30, var43_28, var15_12, var47_32, var48_34);
                }
lbl233:
                // 1 sources

                case 178: {
                    var45_30 = v7.I(var46_31 + 1, var25_17);
                    System.arraycopy(var44_29, 0, var45_30, 0, var46_31);
                    var50_38 = (xk)this.k;
                    var45_30[var46_31] = v7.M((byte)var27_18, var28_19, var29_20, var50_38.V(var11_10));
                    return new hz(var45_30, var43_28, var15_12, var47_32, var48_34);
                }
lbl239:
                // 1 sources

                case 179: {
                    var45_30 = v7.I(var46_31 - 1, var25_17);
                    System.arraycopy(var44_29, 0, var45_30, 0, var46_31 - 1);
                    return new hz(var45_30, var43_28, var15_12, var47_32, var48_34);
                }
lbl243:
                // 1 sources

                case 180: {
                    var45_30 = v7.I(var46_31, var25_17);
                    System.arraycopy(var44_29, 0, var45_30, 0, var46_31 - 1);
                    var51_39 = (xk)this.k;
                    var45_30[var46_31 - 1] = v7.M((byte)var27_18, var28_19, var29_20, var51_39.V(var11_10));
                    return new hz(var45_30, var43_28, var15_12, var47_32, var48_34);
                }
lbl249:
                // 1 sources

                case 181: {
                    var45_30 = v7.I(var46_31 - 2, var25_17);
                    System.arraycopy(var44_29, 0, var45_30, 0, var46_31 - 2);
                    if (var2_2) {
                        var52_40 = (xk)this.k;
                        v32 = new Object[5];
                        v32[4] = var8_8;
                        v32[3] = var6_6;
                        v32[2] = var21_15;
                        v32[1] = v7.M((byte)var27_18, var28_19, var29_20, var52_40.V(var11_10));
                        v32[0] = var44_29[var46_31 - 1];
                        if (m44.a("l", (Object)v32, (long)-4348026623736594657L, (long)var9_9) == false) {
                            // empty if block
                        }
                    }
                    return new hz(var45_30, var43_28, var15_12, var47_32, var48_34);
                }
lbl264:
                // 1 sources

                case 183: {
                    return this.L(var44_29, var46_31, var43_28, var33_23, var47_32, var48_34, true, true, var2_2, var5_5, var6_6, var8_8);
                }
lbl266:
                // 1 sources

                case 182: 
                case 185: {
                    return this.L(var44_29, var46_31, var43_28, var33_23, var47_32, var48_34, true, false, var2_2, var5_5, var6_6, var8_8);
                }
lbl268:
                // 1 sources

                case 184: {
                    return this.L(var44_29, var46_31, var43_28, var33_23, var47_32, var48_34, false, false, var2_2, var5_5, var6_6, var8_8);
                }
lbl270:
                // 1 sources

                case 186: {
                    v33 = new Object[10];
                    v33[9] = var8_8;
                    v33[8] = var19_14;
                    v33[7] = var6_6;
                    v33[6] = var5_5;
                    v33[5] = var2_2;
                    v33[4] = var48_34;
                    v33[3] = var47_32;
                    v33[2] = var43_28;
                    v33[1] = var46_31;
                    v33[0] = var44_29;
                    return m44.a("m", (Object)this, (Object)v33, (long)-2431516890995556898L, (long)var9_9);
                }
lbl284:
                // 1 sources

                case 187: {
                    var45_30 = v7.I(var46_31 + 1, var25_17);
                    System.arraycopy(var44_29, 0, var45_30, 0, var46_31);
                    var52_41 = (jf)this.k;
                    var45_30[var46_31] = v7.Q(var52_41.h(var37_25), var23_16, false, (ic)this);
                    return new hz(var45_30, var43_28, var15_12, var47_32, var48_34);
                }
lbl290:
                // 1 sources

                case 189: {
                    var45_30 = v7.I(var46_31, var25_17);
                    System.arraycopy(var44_29, 0, var45_30, 0, var46_31 - 1);
                    var53_42 = (jf)this.k;
                    var45_30[var46_31 - 1] = v7.M((byte)var27_18, var28_19, var29_20, "[" + var53_42.h(var37_25));
                    return new hz(var45_30, var43_28, var15_12, var47_32, var48_34);
                }
lbl296:
                // 1 sources

                case 192: {
                    var45_30 = v7.I(var46_31, var25_17);
                    System.arraycopy(var44_29, 0, var45_30, 0, var46_31 - 1);
                    var54_43 = (jf)this.k;
                    var45_30[var46_31 - 1] = v7.M((byte)var27_18, var28_19, var29_20, var54_43.h(var37_25));
                    return new hz(var45_30, var43_28, var15_12, var47_32, var48_34);
                }
lbl302:
                // 1 sources

                case 193: {
                    var45_30 = v7.I(var46_31, var25_17);
                    System.arraycopy(var44_29, 0, var45_30, 0, var46_31 - 1);
                    var45_30[var46_31 - 1] = v7.B;
                    return new hz(var45_30, var43_28, var15_12, var47_32, var48_34);
                }
            }
lbl307:
            // 1 sources

            v3 = false;
        }
        lk0.t(v3, new String[]{(String)i_.b("r", (int)25749, (long)(4780402113743091923L ^ var9_9)) + this.X}, var39_26);
        return null;
    }

    @Override
    public boolean r(Object[] objectArray) {
        boolean bl2;
        block14: {
            block15: {
                Object object;
                block16: {
                    block17: {
                        ii ii2 = (ii)objectArray[0];
                        Set set = (Set)objectArray[1];
                        bn bn2 = (bn)objectArray[2];
                        long l10 = (Long)objectArray[3];
                        int n10 = (Integer)objectArray[4];
                        long l11 = l10;
                        long l12 = l11 ^ 0x7520A4869E2FL;
                        long l13 = l11 ^ 0x12A54F469405L;
                        CallSite callSite = m44.a("k", (long)8691382388752823105L, (long)l10);
                        try {
                            try {
                                try {
                                    bl2 = this.X;
                                    if (callSite == false) break block14;
                                    if (bl2 != i_.e("u", (int)4410, (long)(0x76D390854A93061CL ^ l10))) break block15;
                                }
                                catch (n9 n92) {
                                    throw m44.a("k", (Object)n92, (long)6923660124136469569L, (long)l10);
                                }
                                bl2 = this.k instanceof xp;
                                if (callSite == false) break block14;
                            }
                            catch (n9 n93) {
                                throw m44.a("k", (Object)n93, (long)6923660124136469569L, (long)l10);
                            }
                            if (!bl2) break block15;
                        }
                        catch (n9 n94) {
                            throw m44.a("k", (Object)n94, (long)6923660124136469569L, (long)l10);
                        }
                        xp xp2 = (xp)this.k;
                        try {
                            try {
                                try {
                                    try {
                                        Object[] objectArray2 = new Object[1];
                                        objectArray2[0] = l12;
                                        object = m44.a("t", (Object)xp2, (Object)objectArray2, (long)7320776223038961253L, (long)l10);
                                        if (callSite == false) break block16;
                                        if (object == false) break block17;
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("k", (Object)n95, (long)6923660124136469569L, (long)l10);
                                    }
                                    object = set.contains(xp2);
                                    if (callSite == false) break block16;
                                }
                                catch (n9 n96) {
                                    throw m44.a("k", (Object)n96, (long)6923660124136469569L, (long)l10);
                                }
                                if (object != false) break block17;
                            }
                            catch (n9 n97) {
                                throw m44.a("k", (Object)n97, (long)6923660124136469569L, (long)l10);
                            }
                            Object[] objectArray3 = new Object[5];
                            objectArray3[4] = l13;
                            objectArray3[3] = new lk9(n10, this);
                            objectArray3[2] = xp2;
                            objectArray3[1] = bn2;
                            objectArray3[0] = bn2.D();
                            m44.a("t", (Object)ii2, (Object)objectArray3, (long)9012032619352306582L, (long)l10);
                            return true;
                        }
                        catch (n9 n98) {
                            throw m44.a("k", (Object)n98, (long)6923660124136469569L, (long)l10);
                        }
                    }
                    object = false;
                }
                return (boolean)object;
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean P(Object[] var1_1) {
        block9: {
            block8: {
                block7: {
                    var2_2 = (Long)var1_1[0];
                    var4_3 = m44.a("n", (long)5697171316799031075L, (long)var2_2);
                    try {
                        try {
                            v0 = this.X;
                            v1 = var4_3;
                            if (var2_2 >= 0L) {
                                if (v1 != false) break block7;
                                if (v0 != i_.e("u", (int)22012, (long)(4412600810210683523L ^ var2_2))) break block8;
                            }
                            ** GOTO lbl22
                        }
                        catch (n9 v2) {
                            throw m44.a("n", (Object)v2, (long)5208623898935090204L, (long)var2_2);
                        }
                        v0 = this.k instanceof xa;
                    }
                    catch (n9 v3) {
                        throw m44.a("n", (Object)v3, (long)5208623898935090204L, (long)var2_2);
                    }
                }
                try {
                    v1 = var4_3;
lbl22:
                    // 2 sources

                    if (v1 != false) break block9;
                    if (!v0) break block8;
                }
                catch (n9 v4) {
                    throw m44.a("n", (Object)v4, (long)5208623898935090204L, (long)var2_2);
                }
                v0 = true;
                break block9;
            }
            v0 = false;
        }
        return v0;
    }

    public i_(int n10, js js2) {
        super(n10);
        this.k = js2;
    }

    /*
     * Exception decompiling
     */
    i_(int var1_1, h1 var2_2, hp var3_3, long var4_4, l6q var6_5, l6q var7_6, l6q var8_7, l6q var9_8, l6q var10_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 6[SWITCH]
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

    @Override
    public final boolean T(long l10) {
        return false;
    }

    @Override
    public boolean A(Object[] objectArray) {
        boolean bl2;
        block14: {
            block15: {
                Object object;
                block16: {
                    block17: {
                        ii ii2 = (ii)objectArray[0];
                        Set set = (Set)objectArray[1];
                        bn bn2 = (bn)objectArray[2];
                        long l10 = (Long)objectArray[3];
                        int n10 = (Integer)objectArray[4];
                        long l11 = l10;
                        long l12 = l11 ^ 0x37247116886EL;
                        long l13 = l11 ^ 0x6628DCFF6A38L;
                        CallSite callSite = m44.a("h", (long)8873843081478927125L, (long)l10);
                        try {
                            try {
                                try {
                                    bl2 = this.X;
                                    if (callSite != false) break block14;
                                    if (bl2 != i_.e("u", (int)32179, (long)(0x36072BF294C376F9L ^ l10))) break block15;
                                }
                                catch (n9 n92) {
                                    throw m44.a("h", (Object)n92, (long)8970868856979515434L, (long)l10);
                                }
                                bl2 = this.k instanceof xa;
                                if (callSite != false) break block14;
                            }
                            catch (n9 n93) {
                                throw m44.a("h", (Object)n93, (long)8970868856979515434L, (long)l10);
                            }
                            if (!bl2) break block15;
                        }
                        catch (n9 n94) {
                            throw m44.a("h", (Object)n94, (long)8970868856979515434L, (long)l10);
                        }
                        xa xa2 = (xa)this.k;
                        try {
                            try {
                                try {
                                    try {
                                        Object[] objectArray2 = new Object[1];
                                        objectArray2[0] = l13;
                                        object = m44.a("w", (Object)xa2, (Object)objectArray2, (long)9202386550191910299L, (long)l10);
                                        if (callSite != false) break block16;
                                        if (object == false) break block17;
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("h", (Object)n95, (long)8970868856979515434L, (long)l10);
                                    }
                                    object = set.contains(xa2);
                                    if (callSite != false) break block16;
                                }
                                catch (n9 n96) {
                                    throw m44.a("h", (Object)n96, (long)8970868856979515434L, (long)l10);
                                }
                                if (object != false) break block17;
                            }
                            catch (n9 n97) {
                                throw m44.a("h", (Object)n97, (long)8970868856979515434L, (long)l10);
                            }
                            Object[] objectArray3 = new Object[5];
                            objectArray3[4] = l12;
                            objectArray3[3] = new lk9(n10, this);
                            objectArray3[2] = xa2;
                            objectArray3[1] = bn2;
                            objectArray3[0] = bn2.D();
                            m44.a("w", (Object)ii2, (Object)objectArray3, (long)7023942418792329213L, (long)l10);
                            return true;
                        }
                        catch (n9 n98) {
                            throw m44.a("h", (Object)n98, (long)8970868856979515434L, (long)l10);
                        }
                    }
                    object = false;
                }
                return (boolean)object;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public boolean d(ii ii2, Set set, bn bn2, int n10, long l10) {
        boolean bl2;
        block19: {
            block20: {
                Object object;
                block21: {
                    block22: {
                        long l11 = l10;
                        long l12 = l11 ^ 0x50C52D9B4FCDL;
                        long l13 = l11 ^ 0x50DBEEB0A050L;
                        CallSite callSite = m44.a("k", (long)-4862376159837014858L, (long)l10);
                        try {
                            try {
                                try {
                                    bl2 = this.X;
                                    if (callSite != false) break block19;
                                    if (bl2 != i_.e("u", (int)11474, (long)(0x7804AAC71538603FL ^ l10))) break block20;
                                }
                                catch (n9 n92) {
                                    throw m44.a("k", (Object)n92, (long)-4909615928495493239L, (long)l10);
                                }
                                bl2 = this.k instanceof xt;
                                if (callSite != false) break block19;
                            }
                            catch (n9 n93) {
                                throw m44.a("k", (Object)n93, (long)-4909615928495493239L, (long)l10);
                            }
                            if (!bl2) break block20;
                        }
                        catch (n9 n94) {
                            throw m44.a("k", (Object)n94, (long)-4909615928495493239L, (long)l10);
                        }
                        xt xt2 = (xt)this.k;
                        x8 x82 = xt2.V();
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                Object object2 = m44.a("t", (Object)x82, (Object)new Object[0], (long)-4722412079814637109L, (long)l10);
                                                object2 = callSite;
                                                if (l10 >= 0L) {
                                                    if (object2 != false) break block21;
                                                    object2 = 2;
                                                }
                                                if (object < object2) break block22;
                                            }
                                            catch (n9 n95) {
                                                throw m44.a("k", (Object)n95, (long)-4909615928495493239L, (long)l10);
                                            }
                                            Object[] objectArray = new Object[1];
                                            objectArray[0] = l13;
                                            object = m44.a("t", (Object)xt2, (Object)objectArray, (long)-6562076652257736268L, (long)l10);
                                            if (callSite != false) break block21;
                                        }
                                        catch (n9 n96) {
                                            throw m44.a("k", (Object)n96, (long)-4909615928495493239L, (long)l10);
                                        }
                                        if (object == false) break block22;
                                    }
                                    catch (n9 n97) {
                                        throw m44.a("k", (Object)n97, (long)-4909615928495493239L, (long)l10);
                                    }
                                    object = set.contains(xt2);
                                    if (callSite != false) break block21;
                                }
                                catch (n9 n98) {
                                    throw m44.a("k", (Object)n98, (long)-4909615928495493239L, (long)l10);
                                }
                                if (object != false) break block22;
                            }
                            catch (n9 n99) {
                                throw m44.a("k", (Object)n99, (long)-4909615928495493239L, (long)l10);
                            }
                            Object[] objectArray = new Object[5];
                            objectArray[4] = l12;
                            objectArray[3] = new lk9(n10, this);
                            objectArray[2] = xt2;
                            objectArray[1] = bn2;
                            objectArray[0] = bn2.D();
                            m44.a("t", (Object)ii2, (Object)objectArray, (long)-6423987347638458274L, (long)l10);
                            return true;
                        }
                        catch (n9 n910) {
                            throw m44.a("k", (Object)n910, (long)-4909615928495493239L, (long)l10);
                        }
                    }
                    object = false;
                }
                return (boolean)object;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public final void k(Object[] objectArray) {
        block5: {
            jd jd2;
            block4: {
                jd jd3 = (jd)objectArray[0];
                jd2 = (jd)objectArray[1];
                long l10 = (Long)objectArray[2];
                CallSite callSite = m44.a("l", (long)-5520680336640542530L, (long)l10);
                try {
                    i_ i_2;
                    try {
                        i_2 = this;
                        if (callSite == false) break block4;
                        if (i_2.k != jd3) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)-6058840738147582018L, (long)l10);
                    }
                    i_2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)-6058840738147582018L, (long)l10);
                }
            }
            i_2.k = jd2;
        }
    }

    @Override
    public final void o(Object[] objectArray) {
        block5: {
            xp xp2;
            block4: {
                xp xp3 = (xp)objectArray[0];
                long l10 = (Long)objectArray[1];
                xp2 = (xp)objectArray[2];
                CallSite callSite = m44.a("k", (long)7272722803229110065L, (long)l10);
                try {
                    i_ i_2;
                    try {
                        i_2 = this;
                        if (callSite == false) break block4;
                        if (i_2.k != xp3) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)8963800240429262897L, (long)l10);
                    }
                    i_2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)8963800240429262897L, (long)l10);
                }
            }
            i_2.k = xp2;
        }
    }

    /*
     * Exception decompiling
     */
    private hz L(v7[] var1_1, int var2_2, v7[] var3_3, long var4_4, fb var6_5, Set var7_6, boolean var8_7, boolean var9_8, boolean var10_9, boolean var11_10, loj var12_11, String var13_12) {
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
    @Override
    public final boolean z(long var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean a(Object[] var1_1) {
        block9: {
            block8: {
                block7: {
                    var2_2 = (Long)var1_1[0];
                    var4_3 = m44.a("i", (long)6221690961620213131L, (long)var2_2);
                    try {
                        try {
                            v0 = this.X;
                            v1 = var4_3;
                            if (var2_2 > 0L) {
                                if (v1 == false) break block7;
                                if (v0 != i_.e("u", (int)11474, (long)(8648305927322506557L ^ var2_2))) break block8;
                            }
                            ** GOTO lbl22
                        }
                        catch (n9 v2) {
                            throw m44.a("i", (Object)v2, (long)5683495449695345291L, (long)var2_2);
                        }
                        v0 = this.k instanceof xp;
                    }
                    catch (n9 v3) {
                        throw m44.a("i", (Object)v3, (long)5683495449695345291L, (long)var2_2);
                    }
                }
                try {
                    v1 = var4_3;
lbl22:
                    // 2 sources

                    if (v1 == false) break block9;
                    if (!v0) break block8;
                }
                catch (n9 v4) {
                    throw m44.a("i", (Object)v4, (long)5683495449695345291L, (long)var2_2);
                }
                v0 = true;
                break block9;
            }
            v0 = false;
        }
        return v0;
    }

    @Override
    public final void S(Object[] objectArray) {
        block5: {
            jf jf2;
            block4: {
                jf jf3 = (jf)objectArray[0];
                jf2 = (jf)objectArray[1];
                long l10 = (Long)objectArray[2];
                CallSite callSite = m44.a("o", (long)-8934589895468429347L, (long)l10);
                try {
                    i_ i_2;
                    try {
                        i_2 = this;
                        if (callSite == false) break block4;
                        if (i_2.k != jf3) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)-7166981985832990499L, (long)l10);
                    }
                    i_2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)n93, (long)-7166981985832990499L, (long)l10);
                }
            }
            i_2.k = jf2;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean L(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 5[SWITCH]
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

    @Override
    public void G(short s10, int n10, DataOutputStream dataOutputStream, int n11) {
        long l10 = (long)s10 << 48 | (long)n10 << 32 >>> 16 | (long)n11 << 48 >>> 48;
        long l11 = l10 ^ 0L;
        int n12 = (int)(l11 >>> 48);
        int n13 = (int)(l11 << 16 >>> 32);
        int n14 = (int)(l11 << 48 >>> 48);
        super.G((short)n12, n13, dataOutputStream, n14);
        dataOutputStream.writeShort(this.k.E());
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean v(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 11[SWITCH]
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

    @Override
    public void h(Object[] objectArray) {
        block4: {
            StringBuilder stringBuilder;
            PrintWriter printWriter;
            long l10;
            block5: {
                l10 = (Long)objectArray[0];
                printWriter = (PrintWriter)objectArray[1];
                StringBuilder stringBuilder2 = (StringBuilder)objectArray[2];
                long l11 = l10;
                long l12 = l11 ^ 0x5D3C6484BBF6L;
                long l13 = l11 ^ 0x55B55102092AL;
                long l14 = l11 ^ 0x65C1E45CBF52L;
                long l15 = l11 ^ 0x8A9056647FBL;
                int n10 = (int)(l15 >>> 32);
                int n11 = (int)(l15 << 32 >>> 56);
                int n12 = (int)(l15 << 40 >>> 40);
                stringBuilder = new StringBuilder((int)i_.e("u", (int)4979, (long)(0x3874782180021336L ^ l10)));
                m44.a("w", (Object)stringBuilder, (Object)stringBuilder2, (long)-1446051688896854452L, (long)l10);
                m44.a("w", (Object)stringBuilder, (Object)stringBuilder2, (long)-1446051688896854452L, (long)l10);
                CallSite callSite = m44.a("h", (long)-1142121718372861931L, (long)l10);
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = n12;
                objectArray2[1] = (int)((byte)n11);
                objectArray2[0] = n10;
                stringBuilder.append((String)((Object)m44.a("w", (Object)this, (Object)objectArray2, (long)-636251684499120046L, (long)l10)));
                stringBuilder.append((char)i_.e("u", (int)4265, (long)(0x5F607C88D97C10E6L ^ l10)));
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l13;
                stringBuilder.append((String)((Object)m44.a("w", (Object)this.k, (Object)objectArray3, (long)-1439441735835203503L, (long)l10)));
                CallSite callSite2 = callSite;
                Object[] objectArray4 = new Object[1];
                objectArray4[0] = l14;
                CallSite callSite3 = m44.a("w", (Object)this, (Object)objectArray4, (long)-1388346946909084418L, (long)l10);
                Object[] objectArray5 = new Object[1];
                objectArray5[0] = l13;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = m44.a("w", (Object)this.k, (Object)objectArray5, (long)-1439441735835203503L, (long)l10);
                objectArray6[1] = callSite3;
                objectArray6[0] = l12;
                callSite3 = m44.a("h", (Object)objectArray6, (long)-1214410100789358428L, (long)l10);
                try {
                    try {
                        if (callSite2 != false) break block4;
                        if (((String)((Object)callSite3)).length() <= 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-612900013225581782L, (long)l10);
                    }
                    stringBuilder.append((char)i_.e("u", (int)15952, (long)(0x3C127F691F24BE18L ^ l10)));
                    stringBuilder.append((String)((Object)callSite3));
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-612900013225581782L, (long)l10);
                }
            }
            m44.a("w", (Object)printWriter, (Object)stringBuilder, (long)-1115217303126203474L, (long)l10);
        }
    }

    @Override
    public final void T(Object[] objectArray) {
        block5: {
            xm xm2;
            block4: {
                xm xm3 = (xm)objectArray[0];
                long l10 = (Long)objectArray[1];
                xm2 = (xm)objectArray[2];
                CallSite callSite = m44.a("i", (long)3749176034057453531L, (long)l10);
                try {
                    i_ i_2;
                    try {
                        i_2 = this;
                        if (callSite == false) break block4;
                        if (i_2.k != xm3) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)n92, (long)3210936473484572891L, (long)l10);
                    }
                    i_2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)n93, (long)3210936473484572891L, (long)l10);
                }
            }
            i_2.k = xm2;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public oz r(Map var1_1, int var2_2, int var3_3, int var4_4) {
        block15: {
            block17: {
                block16: {
                    block14: {
                        v0 = var5_5 = (long)var2_2 << 32 | (long)var3_3 << 48 >>> 32 | (long)var4_4 << 48 >>> 48;
                        var7_6 = v0 ^ 46596226632346L;
                        var9_7 = v0 ^ 112878472744304L;
                        var11_8 = m44.a("k", (long)8704658504643637502L, (long)var5_5);
                        try {
                            try {
                                v1 = this;
                                if (var11_8 != false) break block14;
                                if (v1.X == i_.e("u", (int)11474, (long)(8648279800683930743L ^ var5_5))) {
                                }
                                break block15;
                            }
                            catch (n9 v2) {
                                throw m44.a("k", (Object)v2, (long)9193531549757664193L, (long)var5_5);
                            }
                            v1 = cf.J(var7_6, this.k, var1_1);
                        }
                        catch (n9 v3) {
                            throw m44.a("k", (Object)v3, (long)9193531549757664193L, (long)var5_5);
                        }
                    }
                    var13_9 = (js)v1;
                    try {
                        v4 = var13_9;
                        if (var11_8 != false) break block16;
                        if (v4 != null) {
                        }
                        ** GOTO lbl35
                    }
                    catch (n9 v5) {
                        throw m44.a("k", (Object)v5, (long)9193531549757664193L, (long)var5_5);
                    }
                    var12_10 = var13_9;
                    try {
                        v6 /* !! */  = (int)var11_8;
                        if (var2_2 >= 0) {
                            if (v6 /* !! */  == 0) break block17;
                        }
                        ** GOTO lbl44
lbl35:
                        // 2 sources

                        v4 = this.k;
                    }
                    catch (n9 v7) {
                        throw m44.a("k", (Object)v7, (long)9193531549757664193L, (long)var5_5);
                    }
                }
                var12_10 = v4;
            }
            try {
                v6 /* !! */  = var12_10.E();
lbl44:
                // 2 sources

                if (v6 /* !! */  <= i_.e("u", (int)18149, (long)(6756265939374198338L ^ var5_5))) {
                    return new io(var9_7, this.k);
                }
            }
            catch (n9 v8) {
                throw m44.a("k", (Object)v8, (long)9193531549757664193L, (long)var5_5);
            }
            return null;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean g(long var1_1) {
        block9: {
            block8: {
                block7: {
                    var3_2 = m44.a("n", (long)752188044712510019L, (long)var1_1);
                    try {
                        try {
                            v0 = this.X;
                            v1 = var3_2;
                            if (var1_1 >= 0L) {
                                if (v1 != false) break block7;
                                if (v0 != i_.e("u", (int)11474, (long)(8648243242104313546L ^ var1_1))) break block8;
                            }
                            ** GOTO lbl20
                        }
                        catch (n9 v2) {
                            throw m44.a("n", (Object)v2, (long)948179231879829884L, (long)var1_1);
                        }
                        v0 = this.k instanceof xt;
                    }
                    catch (n9 v3) {
                        throw m44.a("n", (Object)v3, (long)948179231879829884L, (long)var1_1);
                    }
                }
                try {
                    v1 = var3_2;
lbl20:
                    // 2 sources

                    if (v1 != false) break block9;
                    if (!v0) break block8;
                }
                catch (n9 v4) {
                    throw m44.a("n", (Object)v4, (long)948179231879829884L, (long)var1_1);
                }
                v0 = true;
                break block9;
            }
            v0 = false;
        }
        return v0;
    }

    @Override
    public String l(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10;
        long l12 = l11 ^ 0x643AFC476936L;
        long l13 = l11 ^ 0x3926A82327E7L;
        int n10 = (int)(l13 >>> 32);
        int n11 = (int)(l13 << 32 >>> 56);
        int n12 = (int)(l13 << 40 >>> 40);
        StringBuilder stringBuilder = new StringBuilder();
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n12;
        objectArray2[1] = (int)((byte)n11);
        objectArray2[0] = n10;
        stringBuilder.append((String)((Object)m44.a("s", (Object)this, (Object)objectArray2, (long)-7550383759637692338L, (long)l10)));
        stringBuilder.append((char)i_.e("u", (int)27151, (long)(0x4D70775C29CB8A57L ^ l10)));
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l12;
        stringBuilder.append((String)((Object)m44.a("s", (Object)this.k, (Object)objectArray3, (long)-8351324275647535027L, (long)l10)));
        return stringBuilder.toString();
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean q(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean u(Object[] var1_1) {
        block9: {
            block8: {
                block7: {
                    var2_2 = (Long)var1_1[0];
                    var4_3 = m44.a("h", (long)6583934264900751490L, (long)var2_2);
                    try {
                        try {
                            v0 = this.X;
                            v1 = var4_3;
                            if (var2_2 > 0L) {
                                if (v1 == false) break block7;
                                if (v0 != i_.e("u", (int)11474, (long)(8648252448432560180L ^ var2_2))) break block8;
                            }
                            ** GOTO lbl22
                        }
                        catch (n9 v2) {
                            throw m44.a("h", (Object)v2, (long)4888344431443105666L, (long)var2_2);
                        }
                        v0 = this.k instanceof xp;
                    }
                    catch (n9 v3) {
                        throw m44.a("h", (Object)v3, (long)4888344431443105666L, (long)var2_2);
                    }
                }
                try {
                    v1 = var4_3;
lbl22:
                    // 2 sources

                    if (v1 == false) break block9;
                    if (!v0) break block8;
                }
                catch (n9 v4) {
                    throw m44.a("h", (Object)v4, (long)4888344431443105666L, (long)var2_2);
                }
                v0 = true;
                break block9;
            }
            v0 = false;
        }
        return v0;
    }

    @Override
    public int T(char c10, int n10, char c11) {
        return 3;
    }

    @Override
    public final void V(Object[] objectArray) {
        block5: {
            xt xt2;
            block4: {
                xt xt3 = (xt)objectArray[0];
                xt2 = (xt)objectArray[1];
                long l10 = (Long)objectArray[2];
                CallSite callSite = m44.a("l", (long)4490842495129154958L, (long)l10);
                try {
                    i_ i_2;
                    try {
                        i_2 = this;
                        if (callSite == false) break block4;
                        if (i_2.k != xt3) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)2799721076389884558L, (long)l10);
                    }
                    i_2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)2799721076389884558L, (long)l10);
                }
            }
            i_2.k = xt2;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private hz w(Object[] var1_1) {
        block29: {
            block27: {
                block28: {
                    block25: {
                        block26: {
                            block24: {
                                block22: {
                                    block23: {
                                        var10_2 = (v7[])var1_1[0];
                                        var3_3 = (Integer)var1_1[1];
                                        var9_4 = (v7[])var1_1[2];
                                        var7_5 = (fb)var1_1[3];
                                        var8_6 = (Set)var1_1[4];
                                        var11_7 = ((Boolean)var1_1[5]).booleanValue();
                                        var12_8 = (Boolean)var1_1[6];
                                        var2_9 = (loj)var1_1[7];
                                        var5_10 = (Long)var1_1[8];
                                        var4_11 = (String)var1_1[9];
                                        v0 = var5_10 = i_.b ^ var5_10;
                                        var13_12 = v0 ^ 76815704571117L;
                                        var15_13 = v0 ^ 25977291740853L;
                                        var17_14 = v0 ^ 91280315942920L;
                                        var19_15 = v0 ^ 27439219321975L;
                                        var21_16 = v0 ^ 113705905336915L;
                                        var23_17 = v0 ^ 37675522397185L;
                                        var25_18 = v0 ^ 71128935225026L;
                                        var27_19 = v0 ^ 96871425872134L;
                                        v1 = v0 ^ 139299061457276L;
                                        var29_20 = (int)(v1 >>> 56);
                                        var30_21 = (int)(v1 << 8 >>> 32);
                                        var31_22 = (int)(v1 << 40 >>> 40);
                                        v2 = v0 ^ 28396723784607L;
                                        var32_23 = v2 >>> 8;
                                        var34_24 = (int)(v2 << 56 >>> 56);
                                        v3 = v0 ^ 79176256581320L;
                                        var35_25 = (int)(v3 >>> 32);
                                        var36_26 = (int)(v3 << 32 >>> 56);
                                        var37_27 = (int)(v3 << 40 >>> 40);
                                        var38_28 = v0 ^ 12451529124846L;
                                        var40_29 = v0 ^ 12493816588340L;
                                        var43_30 = new lby(var32_23, var4_11, (byte)var34_24);
                                        var44_31 = (jd)this.k;
                                        var42_32 = m44.a("k", (long)5099759282427694361L, (long)var5_10);
                                        v4 = new Object[1];
                                        v4[0] = var38_28;
                                        var45_33 = m44.a("t", (Object)var44_31, (Object)v4, (long)4874402182276441370L, (long)var5_10);
                                        try {
                                            v5 = new Object[1];
                                            v5[0] = var25_18;
                                            if (!m44.a("t", (Object)var45_33, (Object)v5, (long)6866349938040649171L, (long)var5_10).equals(m44.a("o", (long)5033906049692299101L, (long)var5_10))) {
                                                v6 = new Object[3];
                                                v6[2] = var37_27;
                                                v6[1] = (int)((byte)var36_26);
                                                v6[0] = var35_25;
                                                v7 = new Object[1];
                                                v7[0] = var25_18;
                                                throw new u9((String)m44.a("t", (Object)this, (Object)v6, (long)6780403286411053409L, (long)var5_10) + " " + (String)m44.a("t", (Object)m44.a("t", (Object)var45_33, (Object)v7, (long)6866349938040649171L, (long)var5_10), (long)4643376440326200422L, (long)var5_10) + (String)i_.b("r", (int)3328, (long)(1392485276544537622L ^ var5_10)));
                                            }
                                        }
                                        catch (u2 v8) {
                                            throw m44.a("k", (Object)v8, (long)6795309534540253721L, (long)var5_10);
                                        }
                                        v9 = new Object[1];
                                        v9[0] = var19_15;
                                        var46_34 = m44.a("t", (Object)var44_31, (Object)v9, (long)6760501506806352408L, (long)var5_10);
                                        v10 = new Object[1];
                                        v10[0] = var21_16;
                                        var47_35 = m44.a("t", (Object)var44_31, (Object)v10, (long)6907944380410677277L, (long)var5_10);
                                        var48_36 = js.a(var27_19, (xb)var47_35);
                                        var49_37 = var48_36.size();
                                        var50_38 = js.T((xb)var47_35, var40_29);
                                        try {
                                            v11 = var50_38 == null ? 0 : 1;
                                        }
                                        catch (u2 v12) {
                                            throw m44.a("k", (Object)v12, (long)6795309534540253721L, (long)var5_10);
                                        }
                                        var51_39 = v11;
                                        try {
                                            v13 = var11_7;
                                            if (var42_32 == false) break block22;
                                            if (v13 == 0) break block23;
                                        }
                                        catch (u2 v14) {
                                            throw m44.a("k", (Object)v14, (long)6795309534540253721L, (long)var5_10);
                                        }
                                        for (var52_40 = 0; var52_40 < var49_37; ++var52_40) {
                                            var53_41 = var10_2[var3_3 - var49_37 + var52_40];
                                            var54_42 = v7.M((byte)var29_20, var30_21, var31_22, (String)var48_36.get(var52_40));
                                            try {
                                                v15 = new Object[5];
                                                v15[4] = var4_11;
                                                v15[3] = var2_9;
                                                v15[2] = var17_14;
                                                v15[1] = var54_42;
                                                v15[0] = var53_41;
                                                v16 /* !! */  = (int)m44.a("k", (Object)v15, (long)5115973572375329352L, (long)var5_10);
                                                v17 = var42_32;
                                                if (var5_10 <= 0L) ** GOTO lbl124
                                                if (v17 == false) break block24;
                                                try {
                                                    block30: {
                                                        if (v16 /* !! */  != 0) continue;
                                                        break block30;
                                                        catch (u2 v18) {
                                                            throw m44.a("k", (Object)v18, (long)6795309534540253721L, (long)var5_10);
                                                        }
                                                    }
                                                    v19 = new Object[1];
                                                    v19[0] = var15_13;
                                                    throw new u9((String)i_.b("r", (int)32185, (long)(3551280183472055484L ^ var5_10)) + var53_41.h() + (String)i_.b("r", (int)8374, (long)(1933994071294556592L ^ var5_10)) + var54_42.h() + (String)i_.b("r", (int)9486, (long)(5433088731487222787L ^ var5_10)) + var52_40 + (String)i_.b("r", (int)27034, (long)(9137190298276786323L ^ var5_10)) + (String)m44.a("t", (Object)var47_35, (Object)v19, (long)6822931051362209923L, (long)var5_10) + (String)i_.b("r", (int)29329, (long)(1570183562317589402L ^ var5_10)) + var43_30);
                                                }
                                                catch (u2 v20) {
                                                    throw m44.a("k", (Object)v20, (long)6795309534540253721L, (long)var5_10);
                                                }
                                            }
                                            catch (u2 var55_43) {
                                                // empty catch block
                                            }
                                            if (var42_32 != false) continue;
                                        }
                                    }
                                    v13 = var3_3 - var49_37 + var51_39;
                                }
                                var52_40 = v13;
                                v16 /* !! */  = var52_40 - var51_39;
                            }
                            try {
                                try {
                                    v17 = var42_32;
lbl124:
                                    // 2 sources

                                    if (v17 == false) break block25;
                                    if (v16 /* !! */  >= 0) break block26;
                                }
                                catch (u2 v21) {
                                    throw m44.a("k", (Object)v21, (long)6795309534540253721L, (long)var5_10);
                                }
                                throw new u9((String)i_.b("r", (int)19289, (long)(907844403748688449L ^ var5_10)) + var52_40 + (String)i_.b("r", (int)25149, (long)(396558798739274556L ^ var5_10)) + var43_30);
                            }
                            catch (u2 v22) {
                                throw m44.a("k", (Object)v22, (long)6795309534540253721L, (long)var5_10);
                            }
                        }
                        v16 /* !! */  = var52_40;
                    }
                    var53_41 = v7.I(v16 /* !! */ , var23_17);
                    try {
                        try {
                            v23 = var10_2;
                            v24 = 0;
                            v25 = var42_32;
                            if (var5_10 < 0L) break block27;
                            if (v25 == false) break block28;
                            System.arraycopy(v23, v24, var53_41, 0, var52_40 - var51_39);
                            if (var51_39 != 1) break block29;
                        }
                        catch (u2 v26) {
                            throw m44.a("k", (Object)v26, (long)6795309534540253721L, (long)var5_10);
                        }
                        v23 = var53_41;
                        v24 = var53_41.length - 1;
                    }
                    catch (u2 v27) {
                        throw m44.a("k", (Object)v27, (long)6795309534540253721L, (long)var5_10);
                    }
                }
                v25 = (byte)var29_20;
            }
            v23[v24] = v7.M(v25, var30_21, var31_22, var50_38);
        }
        return new hz(var53_41, var9_4, var13_12, var7_5, var8_6);
    }

    @Override
    public js s(long l10) {
        return this.k;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void H(DataOutputStream var1_1, Map var2_2, long var3_3) {
        block9: {
            block8: {
                v0 = var3_3 ^ 109183790174989L;
                var5_4 = (int)(v0 >>> 48);
                var6_5 = (int)(v0 << 16 >>> 32);
                var7_6 = (int)(v0 << 48 >>> 48);
                v1 = m44.a("h", (long)6106537255087152994L, (long)var3_3);
                super.G((short)var5_4, var6_5, var1_1, var7_6);
                var8_7 = v1;
                var9_8 = (js)var2_2.get(this.k);
                try {
                    try {
                        if (var8_7 == false) break block8;
                        if (var9_8 != null) {
                        }
                        ** GOTO lbl26
                    }
                    catch (n9 v2) {
                        throw m44.a("h", (Object)v2, (long)5491842119061133410L, (long)var3_3);
                    }
                    var1_1.writeShort(var9_8.E());
                }
                catch (n9 v3) {
                    throw m44.a("h", (Object)v3, (long)5491842119061133410L, (long)var3_3);
                }
            }
            try {
                if (var3_3 <= 0L || var8_7 != false) break block9;
lbl26:
                // 2 sources

                var1_1.writeShort(this.k.E());
            }
            catch (n9 v4) {
                throw m44.a("h", (Object)v4, (long)5491842119061133410L, (long)var3_3);
            }
        }
    }

    @Override
    public final boolean e(long l10, int n10) {
        return true;
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean M(long var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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
    @Override
    public final boolean S(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[SWITCH]
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

    /*
     * Exception decompiling
     */
    @Override
    public boolean Y(long var1_1, int var3_2, int var4_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 10[SWITCH]
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

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        i_.b = prr.a(2188974264768775754L, -8373156838438720254L, MethodHandles.lookup().lookupClass()).a(236663533968631L);
                        i_.g = new HashMap<K, V>(13);
                        var11 = i_.b ^ 114872833453259L;
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
                        var20_3 = new String[25];
                        var18_4 = 0;
                        var17_5 = "i\u0000\u00e4\u00eb\u00b9\u00b8\u0080\u00d14\u0002\u0083$\u0083\u00afA\u0007\u0010\u00b8\u00bf\u00de\u0017`\u00e0\u00bd`G\u00b1\u0089J\u0017el\u0088@\u0098$\u00beXJ\u00dd\u00f0}7\u00f65\u008a\u00b8\u0098\u00a0\u001a\u00ffn\u0099\u00dd9bh\u00d3\u00c3\u00d7L\u0003\u0003\u00ae\u0017O\u00c4q$#~)x\u00cetJ\u00fb3W\u00ef\u008b \u001d\u008c\u00afQ/r\u0086\u0081vm\u00d4}qJ\u00d9a8%\"g \u009e\u00192\u0092}\u0096\u001e\u00e3\u00fa3\u0095\u0003\u00dd\u00d0wr\u00edy\u000b\\E0L0\u00bc,8\u00e7\u007f\u00db(Q\u00c0\u00ec\u0096\u00ae\u00a2\u0005\u0086\u00fc\u00fc\u001aW\u0089j#Z\u00ac\u0099i\u00ce\u00f2@\u00b2\u00c6\u00af\u00a9\u00dc\u00f6J-\u0014DR\u00a0\u00a3/\u0086\u00c3\u00d1\u00de#\u00ad\u00b0\u0014\u0086\u00b3\u00e0\u00fa\u008c\u00f3\u00a5\u00fb)K\u00db\u00f3\u00e4\u00c8\u00fd\u0001\u00f0\u0085\u00e8/c\u00f7\u00ab\u00b8\u00c8Xr\u00edJ\u00c4\u0003W\u00c6\u0097ROHT\u001b1CDH>\u00c0\u0092\u00b1J\u00ebhN1\u001f\u00d3\u0085\u00b1\u008b\u00964\u0082\u0007\u00ab'y\u00f6\u0000\u00bf\u00ed\u00da\u00d7P*\u00f3N\u00fb\u00cf\u00bb\u0017\u00ef\u00bb\u009es\u00b8\u00f0\u00f0\u009c\u009bOk\u00c3\u00e1\u00f1l[\u0015\u00aa\u0015H\u0085\u0084\u00aee\u001et\u00ca\"#`\u008c2\u00b3\u00deX{\u008c@\u00e2)s\fAI\u00cbiq\u00a1?\u0010\u0083\u0084\u00aePBx\u00aa\u00ac\u0013\u00d6\u001d.6\u00d4\u00ad^p\u0016s\u00c9=\u00b0\u00a4)\u0001`\u0017\u00dej\u0015\u00b9\u00c4%\u00cc\u0011 |Xc\u00c4\u001b\u008d\u0006\u00a0\u00cd\u00b9u\u008f\u00f1d\u00b6,8:w\u0093/\u0019=\u0085\n\r\u009a\u001fm\u00bf\u001f\u00a1's\u001a\u00a4\u0081\u00f9\u000b\u0085T\u00beI\u00a7\u00dch\u00a3\u00056<\b,/\u008eQ\u00c0\u00ea\u00adWZ\u00e1t\u0011Y\u00bd\u00da\u00c4P\u00fd\u00e5-\u00a8\u00aa D\u0003\u00f6\u0083\u00e9T\u00fdL\u0010\u0095\u00c2\u00d1\u00c0\u0080\u00f6{&\u00a3u\u00ab\u00fe}\u00e6\u007f+\u009a\u0081\u00da\u00e5\u00adb\u00fa \u0088\u00a4\u00b86o\u0085\u00c7\u00d9\u00fb\u00f8\u00fb\u001d\u000e\u000b\u00e5\u0093\u00f3\u00c0\u000f\u00e1\u00c5D\u00c146\u00f3\u0084B\u0014vX\u00be Upju\u00ef\u0015\u0011\u0086\u008d\u00ff\u00c3\u001d\u0004\u00cdy\u00d8\u00ab\u00ec\u0086U~\u0091s\u00a1\u008e\u00e2\u00cf\u0084<<\u00c6\u00c0\u0010\u0091%\u00e2\u0018\u0090\u00f1\u001f=[\u009e\u00c4\u0017\u00d3Ne\u00dc u\u00e9\u00e3\u0089\u00ee\u00ab\u00b3\u001d\u00a8\u00cb\u00a7l\u00be\u009c\u00d7_\u00c0B\u00d8t\u00b4pR\u00f79\u00deG\u00c0\u00f7\u00e3\u00bc\u00bb\u0018Ly\u00e3\u00f2}HQE\u00d7\u00f4\u00b4\u008af\u008b\u008a4\u001ex'K\u0017r\u009a\u00a3 \u00d1aHW`\u0017\u00a9\u00cf\u00e7\u0091\u0084f\u00e9\u000e:\u00db\u0013D\u00b8\u00a9\u008d\u00afu\u00b8\u00de\u00dd8\u00db\u0013\u00ef\u0094\u00a0\u00105M?T\u00f9Ke\u00a83#UV\u00bf\u00dcJ'\u0010\u009f\u00bf~\u008e\u00b8\u00e8\u001c{\u009d*\u0098\u0014\u00c6\u0082\u0080C \u00d8i\u00b8@*D--\u00ed\n\u00a8\u00ab\u00fd\u00bb\u00ac!(\u0092d\u0015\u009d\u00ad\u009c-\u00cb\u00a8\u0018:\u00c7\u00ce\u00e7\u00c7\u0010\u00fd\u00ec[\u0086&\u00bc\u0099)\u008a\u00dc1WErkr z\u00be\u0084\u00c2\u009d0aB6\u00fb4\u00a0\u0081n\u00b5k\u0007\u00bb\u00fc\u00ffG\u0099#\u00c6\u0012\u00f1\u0006lb\u008c\u008e<(q%\u0010\u00c4\u009e\u00024\u001b\\g\\^S\u0090$'$\u00ef\u00f2{y\u00bfN\u00c7<DI6\u001c\u00ec\u00c8\u0012;\u00ce\u00ff\u00bd\u00d7\u00f1\u00db\u00ef\u0010\u00b6\u00dd\u00c1\u0085\u00c2*$<\u000b\u00f4Vp\u00cd\u000b\u00bbT\u0010_v\u00c2|\u0083\u0006\u00cf\u00c1\u0097O\u00e1\u00f0\u00bc\u00ea\u00af6";
                        var19_6 = "i\u0000\u00e4\u00eb\u00b9\u00b8\u0080\u00d14\u0002\u0083$\u0083\u00afA\u0007\u0010\u00b8\u00bf\u00de\u0017`\u00e0\u00bd`G\u00b1\u0089J\u0017el\u0088@\u0098$\u00beXJ\u00dd\u00f0}7\u00f65\u008a\u00b8\u0098\u00a0\u001a\u00ffn\u0099\u00dd9bh\u00d3\u00c3\u00d7L\u0003\u0003\u00ae\u0017O\u00c4q$#~)x\u00cetJ\u00fb3W\u00ef\u008b \u001d\u008c\u00afQ/r\u0086\u0081vm\u00d4}qJ\u00d9a8%\"g \u009e\u00192\u0092}\u0096\u001e\u00e3\u00fa3\u0095\u0003\u00dd\u00d0wr\u00edy\u000b\\E0L0\u00bc,8\u00e7\u007f\u00db(Q\u00c0\u00ec\u0096\u00ae\u00a2\u0005\u0086\u00fc\u00fc\u001aW\u0089j#Z\u00ac\u0099i\u00ce\u00f2@\u00b2\u00c6\u00af\u00a9\u00dc\u00f6J-\u0014DR\u00a0\u00a3/\u0086\u00c3\u00d1\u00de#\u00ad\u00b0\u0014\u0086\u00b3\u00e0\u00fa\u008c\u00f3\u00a5\u00fb)K\u00db\u00f3\u00e4\u00c8\u00fd\u0001\u00f0\u0085\u00e8/c\u00f7\u00ab\u00b8\u00c8Xr\u00edJ\u00c4\u0003W\u00c6\u0097ROHT\u001b1CDH>\u00c0\u0092\u00b1J\u00ebhN1\u001f\u00d3\u0085\u00b1\u008b\u00964\u0082\u0007\u00ab'y\u00f6\u0000\u00bf\u00ed\u00da\u00d7P*\u00f3N\u00fb\u00cf\u00bb\u0017\u00ef\u00bb\u009es\u00b8\u00f0\u00f0\u009c\u009bOk\u00c3\u00e1\u00f1l[\u0015\u00aa\u0015H\u0085\u0084\u00aee\u001et\u00ca\"#`\u008c2\u00b3\u00deX{\u008c@\u00e2)s\fAI\u00cbiq\u00a1?\u0010\u0083\u0084\u00aePBx\u00aa\u00ac\u0013\u00d6\u001d.6\u00d4\u00ad^p\u0016s\u00c9=\u00b0\u00a4)\u0001`\u0017\u00dej\u0015\u00b9\u00c4%\u00cc\u0011 |Xc\u00c4\u001b\u008d\u0006\u00a0\u00cd\u00b9u\u008f\u00f1d\u00b6,8:w\u0093/\u0019=\u0085\n\r\u009a\u001fm\u00bf\u001f\u00a1's\u001a\u00a4\u0081\u00f9\u000b\u0085T\u00beI\u00a7\u00dch\u00a3\u00056<\b,/\u008eQ\u00c0\u00ea\u00adWZ\u00e1t\u0011Y\u00bd\u00da\u00c4P\u00fd\u00e5-\u00a8\u00aa D\u0003\u00f6\u0083\u00e9T\u00fdL\u0010\u0095\u00c2\u00d1\u00c0\u0080\u00f6{&\u00a3u\u00ab\u00fe}\u00e6\u007f+\u009a\u0081\u00da\u00e5\u00adb\u00fa \u0088\u00a4\u00b86o\u0085\u00c7\u00d9\u00fb\u00f8\u00fb\u001d\u000e\u000b\u00e5\u0093\u00f3\u00c0\u000f\u00e1\u00c5D\u00c146\u00f3\u0084B\u0014vX\u00be Upju\u00ef\u0015\u0011\u0086\u008d\u00ff\u00c3\u001d\u0004\u00cdy\u00d8\u00ab\u00ec\u0086U~\u0091s\u00a1\u008e\u00e2\u00cf\u0084<<\u00c6\u00c0\u0010\u0091%\u00e2\u0018\u0090\u00f1\u001f=[\u009e\u00c4\u0017\u00d3Ne\u00dc u\u00e9\u00e3\u0089\u00ee\u00ab\u00b3\u001d\u00a8\u00cb\u00a7l\u00be\u009c\u00d7_\u00c0B\u00d8t\u00b4pR\u00f79\u00deG\u00c0\u00f7\u00e3\u00bc\u00bb\u0018Ly\u00e3\u00f2}HQE\u00d7\u00f4\u00b4\u008af\u008b\u008a4\u001ex'K\u0017r\u009a\u00a3 \u00d1aHW`\u0017\u00a9\u00cf\u00e7\u0091\u0084f\u00e9\u000e:\u00db\u0013D\u00b8\u00a9\u008d\u00afu\u00b8\u00de\u00dd8\u00db\u0013\u00ef\u0094\u00a0\u00105M?T\u00f9Ke\u00a83#UV\u00bf\u00dcJ'\u0010\u009f\u00bf~\u008e\u00b8\u00e8\u001c{\u009d*\u0098\u0014\u00c6\u0082\u0080C \u00d8i\u00b8@*D--\u00ed\n\u00a8\u00ab\u00fd\u00bb\u00ac!(\u0092d\u0015\u009d\u00ad\u009c-\u00cb\u00a8\u0018:\u00c7\u00ce\u00e7\u00c7\u0010\u00fd\u00ec[\u0086&\u00bc\u0099)\u008a\u00dc1WErkr z\u00be\u0084\u00c2\u009d0aB6\u00fb4\u00a0\u0081n\u00b5k\u0007\u00bb\u00fc\u00ffG\u0099#\u00c6\u0012\u00f1\u0006lb\u008c\u008e<(q%\u0010\u00c4\u009e\u00024\u001b\\g\\^S\u0090$'$\u00ef\u00f2{y\u00bfN\u00c7<DI6\u001c\u00ec\u00c8\u0012;\u00ce\u00ff\u00bd\u00d7\u00f1\u00db\u00ef\u0010\u00b6\u00dd\u00c1\u0085\u00c2*$<\u000b\u00f4Vp\u00cd\u000b\u00bbT\u0010_v\u00c2|\u0083\u0006\u00cf\u00c1\u0097O\u00e1\u00f0\u00bc\u00ea\u00af6".length();
                        var16_7 = 16;
                        var15_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = i_.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00a8\u00aa\b\u0083l\u00adI\u00a0\u001b\u0093\u0081qht-\u0017>&\u00f0mZE\u00c3\"\u00af\u00b7e.8j\u00ec\u00f5\u008c\u00ba-hn\u00aa\u00cb\u00fdH\u00baz\u008a=I\u00d7\u00d2F\u00f7\u00d4\u00e2\u00a7d\u00bc\b\u009d\u0099I\u00c4\u00aa\u0015\u00b8\u0011\u00c8\u00e5\u0017\u00acY\u00e4\u0010\u0010\u00daf\u00c3E\u0097\u00fb\u008c9\u00a1\u0016\u008a\u0086\u0002\u0096|\u0085\u0083CyW\u00d49B\u00b6~\u0093>\u00f5(\u00f4T\u00ee\u00ad\u00b1\u00d5\u00dbI5\f\u00ebh";
                            var19_6 = "\u00a8\u00aa\b\u0083l\u00adI\u00a0\u001b\u0093\u0081qht-\u0017>&\u00f0mZE\u00c3\"\u00af\u00b7e.8j\u00ec\u00f5\u008c\u00ba-hn\u00aa\u00cb\u00fdH\u00baz\u008a=I\u00d7\u00d2F\u00f7\u00d4\u00e2\u00a7d\u00bc\b\u009d\u0099I\u00c4\u00aa\u0015\u00b8\u0011\u00c8\u00e5\u0017\u00acY\u00e4\u0010\u0010\u00daf\u00c3E\u0097\u00fb\u008c9\u00a1\u0016\u008a\u0086\u0002\u0096|\u0085\u0083CyW\u00d49B\u00b6~\u0093>\u00f5(\u00f4T\u00ee\u00ad\u00b1\u00d5\u00dbI5\f\u00ebh".length();
                            var16_7 = 40;
                            var15_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = i_.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block19;
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
                i_.d = var20_3;
                i_.e = new String[25];
                i_.t = new HashMap<K, V>(13);
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
                var6_12 = new long[10];
                var3_13 = 0;
                var4_14 = "\u00c5\u00b9\u009b\u00f3\u00d4\u0019\u0011\u009af\u00f7\u00e6\u00f0g$5\u00fa'|\u001b\u0092\u00f8W'\u00b6\u000e\u00c8\u00f9\u008c\u00b7OO\u00f6C\u000b\t\u0098c\u00d8\u0016U\f\u00a5aS\u00f6\u00ec\u00a6\u0000\u00ebT\u008a\u00a7..$\u00e0\u0000\u0002\u0087fI@\u00c8|";
                var5_15 = "\u00c5\u00b9\u009b\u00f3\u00d4\u0019\u0011\u009af\u00f7\u00e6\u00f0g$5\u00fa'|\u001b\u0092\u00f8W'\u00b6\u000e\u00c8\u00f9\u008c\u00b7OO\u00f6C\u000b\t\u0098c\u00d8\u0016U\f\u00a5aS\u00f6\u00ec\u00a6\u0000\u00ebT\u008a\u00a7..$\u00e0\u0000\u0002\u0087fI@\u00c8|".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl78:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "3q\u00b6-G3\u00a4E\u009c>\u00fb\u00d9l\u00f8\\\u00a8";
                    var5_15 = "3q\u00b6-G3\u00a4E\u009c>\u00fb\u00d9l\u00f8\\\u00a8".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl91:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl104:
                // 1 sources

                ** continue;
            }
        }
        i_.m = var6_12;
        i_.n = new Integer[10];
    }

    private static Exception a(Exception exception) {
        return exception;
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

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x56AC;
        if (e[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/i_", exception);
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
            i_.e[n11] = i_.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = i_.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/i_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int e(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x66D2;
        if (n[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = m[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])t.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    t.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/i_", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            i_.n[n11] = n12;
        }
        return n[n11];
    }

    private static int e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = i_.e(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/i_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(i_.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(i_.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

