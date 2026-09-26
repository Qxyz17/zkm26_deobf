/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ah;
import com.zelix.ge;
import com.zelix.loz;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lqe
implements loz {
    private ah g;
    private String o;
    private Dimension R;
    private int x;
    private int S;
    private Point E;
    private ge[] I;
    private ge[] U;
    private Component i;
    private Integer[] t;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map h;

    /*
     * Unable to fully structure code
     */
    boolean J(Object[] var1_1) {
        block25: {
            block27: {
                block26: {
                    block21: {
                        block20: {
                            var5_2 = (Boolean)var1_1[0];
                            var2_3 = (Long)var1_1[1];
                            var4_4 = (ge[])var1_1[2];
                            v0 = var2_3 = lqe.a ^ var2_3;
                            var6_5 = v0 ^ 80491644415486L;
                            var8_6 = v0 ^ 75076885409049L;
                            var11_7 = new boolean[]{false};
                            var12_8 = 0;
                            var10_9 = m44.a("k", (long)-5954044446587778520L, (long)var2_3);
                            block12: while (var12_8 < lqe.b("y", (int)8342, (long)(3166806071588882756L ^ var2_3))) {
                                try {
                                    v1 = new Object[5];
                                    v1[4] = var6_5;
                                    v1[3] = var5_2;
                                    v1[2] = var11_7;
                                    v1[1] = var4_4;
                                    v1[0] = var12_8;
                                    m44.a("j", (Object)this, (Object)v1, (long)-5223833805895859749L, (long)var2_3);
                                    ++var12_8;
                                    do {
                                        v2 = var10_9;
                                        if (var2_3 > 0L) {
                                            if (v2 == null) break block20;
                                            v2 = var10_9;
                                        }
                                        if (v2 != null) continue block12;
                                    } while (var2_3 < 0L);
                                    break;
                                }
                                catch (n9 v3) {
                                    throw m44.a("k", (Object)v3, (long)-6125846963550884061L, (long)var2_3);
                                }
                            }
                            var12_8 = 0;
                        }
                        var13_10 = 1;
                        block14: while (var13_10 != 0) {
                            v4 = new boolean[1];
                            v5 = v4;
                            v4[0] = false;
                            do {
                                block23: {
                                    block24: {
                                        block22: {
                                            var14_11 = v5;
                                            v6 = 0;
                                            v7 = var10_9;
                                            if (var2_3 <= 0L) ** GOTO lbl88
                                            if (v7 == null) break block21;
                                            var15_12 = v6;
                                            block16: while (var15_12 < lqe.b("y", (int)11209, (long)(4557197708296684048L ^ var2_3))) {
                                                try {
                                                    v8 = new Object[5];
                                                    v8[4] = var5_2;
                                                    v8[3] = var14_11;
                                                    v8[2] = var4_4;
                                                    v8[1] = var15_12;
                                                    v8[0] = var8_6;
                                                    m44.a("j", (Object)this, (Object)v8, (long)-5432517714276802596L, (long)var2_3);
                                                    ++var15_12;
                                                    while (var2_3 > 0L && var10_9 != null) {
                                                        if (var10_9 != null) continue block16;
                                                        if (var2_3 < 0L) continue;
                                                        break block16;
                                                    }
                                                    break block22;
                                                }
                                                catch (n9 v9) {
                                                    throw m44.a("k", (Object)v9, (long)-6125846963550884061L, (long)var2_3);
                                                }
                                            }
                                            var13_10 = var14_11[0];
                                        }
                                        try {
                                            v10 = var13_10;
                                            if (var10_9 == null) break block23;
                                            if (v10 == 0) break block24;
                                        }
                                        catch (n9 v11) {
                                            throw m44.a("k", (Object)v11, (long)-6125846963550884061L, (long)var2_3);
                                        }
                                        v10 = 1;
                                        break block23;
                                    }
                                    v10 = var12_8 = var12_8;
                                }
                                if (var10_9 != null) continue block14;
                                v5 = var11_7;
                            } while (var2_3 < 0L);
                        }
                        v6 = v5[0];
                    }
                    try {
                        try {
                            try {
                                v7 = var10_9;
lbl88:
                                // 2 sources

                                if (v7 == null) break block25;
                                if (v6 != 0) break block26;
                            }
                            catch (n9 v12) {
                                throw m44.a("k", (Object)v12, (long)-6125846963550884061L, (long)var2_3);
                            }
                            v6 = var12_8;
                            if (var10_9 == null) break block25;
                        }
                        catch (n9 v13) {
                            throw m44.a("k", (Object)v13, (long)-6125846963550884061L, (long)var2_3);
                        }
                        if (v6 == 0) break block27;
                    }
                    catch (n9 v14) {
                        throw m44.a("k", (Object)v14, (long)-6125846963550884061L, (long)var2_3);
                    }
                }
                v6 = 1;
                break block25;
            }
            v6 = 0;
        }
        return (boolean)v6;
    }

    Dimension C(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return new Dimension((Integer)((Object)m44.a("w", (Object)this, (long)-2334029878854082072L, (long)l10)[0]), (Integer)((Object)m44.a("w", (Object)this, (long)-2334029878854082072L, (long)l10)[1]));
    }

    lqe(String string, Component component, ah ah2, long l10) {
        l10 = a ^ l10;
        m44.a("r", (Object)this, (ge[])new ge[lqe.b("y", (int)8342, (long)(0x2BF2CCD6B8305901L ^ l10))], (long)-1759376754393423527L, (long)l10);
        m44.a("r", (Object)this, (Integer[])new Integer[lqe.b("y", (int)8342, (long)(0x2BF2CCD6B8305901L ^ l10))], (long)-1732573207605339769L, (long)l10);
        m44.a("r", (Object)this, (String)string, (long)-129328529003537500L, (long)l10);
        m44.a("r", (Object)this, (Component)component, (long)-2226400702545222084L, (long)l10);
        m44.a("r", (Object)this, (ah)ah2, (long)-2014290771626815543L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    boolean E(Object[] var1_1) {
        block60: {
            block47: {
                block46: {
                    block45: {
                        var2_2 = (Long)var1_1[0];
                        v0 = var2_2 = lqe.a ^ var2_2;
                        var4_3 = v0 ^ 26811966733935L;
                        var6_4 = v0 ^ 56660400106702L;
                        var8_5 = v0 ^ 106096021321345L;
                        var10_6 = v0 ^ 131798887167243L;
                        var12_7 = v0 ^ 15754050949344L;
                        var14_8 = v0 ^ 95911641576674L;
                        var16_9 = v0 ^ 63425431823798L;
                        var18_10 = v0 ^ 65701567959634L;
                        var20_11 = m44.a("n", (long)4842369630362362949L, (long)var2_2);
                        try {
                            try {
                                v1 = m44.a("p", (Object)this, (long)4686052567561725265L, (long)var2_2);
                                if (var20_11 == null) break block45;
                                if (v1 != null) break block46;
                            }
                            catch (n9 v2) {
                                throw m44.a("n", (Object)v2, (long)4940993317882560846L, (long)var2_2);
                            }
                            m44.a("r", (Object)this, (ge[])new ge[lqe.b("y", (int)8342, (long)(3166787882665371433L ^ var2_2))], (long)4686052567561725265L, (long)var2_2);
                            v1 = m44.a("p", (Object)this, (long)6466338050627297137L, (long)var2_2);
                        }
                        catch (n9 v3) {
                            throw m44.a("n", (Object)v3, (long)4940993317882560846L, (long)var2_2);
                        }
                    }
                    System.arraycopy(v1, 0, m44.a("p", (Object)this, (long)4686052567561725265L, (long)var2_2), 0, (int)lqe.b("y", (int)8342, (long)(3166787882665371433L ^ var2_2)));
                    var21_12 /* !! */  = 0;
                    while (var21_12 /* !! */  < lqe.b("y", (int)8342, (long)(3166787882665371433L ^ var2_2))) {
                        block48: {
                            block49: {
                                block50: {
                                    block58: {
                                        block55: {
                                            block56: {
                                                block53: {
                                                    block51: {
                                                        var22_13 = m44.a("p", (Object)this, (long)4686052567561725265L, (long)var2_2)[var21_12 /* !! */ ];
                                                        try {
                                                            block52: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (var2_2 < 0L || var20_11 == null) break block47;
                                                                                    v4 = var20_11;
                                                                                    if (var2_2 < 0L) break block48;
                                                                                    if (v4 == null) break block49;
                                                                                }
                                                                                catch (n9 v5) {
                                                                                    throw m44.a("n", (Object)v5, (long)4940993317882560846L, (long)var2_2);
                                                                                }
                                                                                if (var22_13 == null) break block50;
                                                                            }
                                                                            catch (n9 v6) {
                                                                                throw m44.a("n", (Object)v6, (long)4940993317882560846L, (long)var2_2);
                                                                            }
                                                                            v7 = new Object[1];
                                                                            v7[0] = var8_5;
                                                                            v8 = m44.a("q", (Object)var22_13, (Object)v7, (long)6815706681180663845L, (long)var2_2);
                                                                            v9 = var20_11;
                                                                            if (var2_2 > 0L) {
                                                                                if (v9 == null) break block51;
                                                                            }
                                                                            ** GOTO lbl82
                                                                        }
                                                                        catch (n9 v10) {
                                                                            throw m44.a("n", (Object)v10, (long)4940993317882560846L, (long)var2_2);
                                                                        }
                                                                        if (var2_2 <= 0L) break block51;
                                                                        if (v8 == false) break block52;
                                                                    }
                                                                    catch (n9 v11) {
                                                                        throw m44.a("n", (Object)v11, (long)4940993317882560846L, (long)var2_2);
                                                                    }
                                                                    if (var20_11 != null) break block50;
                                                                }
                                                                catch (n9 v12) {
                                                                    throw m44.a("n", (Object)v12, (long)4940993317882560846L, (long)var2_2);
                                                                }
                                                            }
                                                            v13 = new Object[1];
                                                            v13[0] = var6_4;
                                                            v8 = m44.a("q", (Object)var22_13, (Object)v13, (long)5029502655266986657L, (long)var2_2);
                                                        }
                                                        catch (n9 v14) {
                                                            throw m44.a("n", (Object)v14, (long)4940993317882560846L, (long)var2_2);
                                                        }
                                                    }
                                                    try {
                                                        block54: {
                                                            try {
                                                                try {
                                                                    v9 = var20_11;
lbl82:
                                                                    // 2 sources

                                                                    if (var2_2 >= 0L) {
                                                                        if (v9 == null) break block53;
                                                                        if (v8 == false) break block54;
                                                                    }
                                                                    ** GOTO lbl108
                                                                }
                                                                catch (n9 v15) {
                                                                    throw m44.a("n", (Object)v15, (long)4940993317882560846L, (long)var2_2);
                                                                }
                                                                m44.a("p", (Object)this, (long)4686052567561725265L, (long)var2_2)[var21_12 /* !! */ ] = null;
                                                                if (var20_11 != null) break block50;
                                                            }
                                                            catch (n9 v16) {
                                                                throw m44.a("n", (Object)v16, (long)4940993317882560846L, (long)var2_2);
                                                            }
                                                        }
                                                        v17 = new Object[1];
                                                        v17[0] = var16_9;
                                                        v8 = m44.a("q", (Object)var22_13, (Object)v17, (long)6439431411499313654L, (long)var2_2);
                                                    }
                                                    catch (n9 v18) {
                                                        throw m44.a("n", (Object)v18, (long)4940993317882560846L, (long)var2_2);
                                                    }
                                                }
                                                try {
                                                    block57: {
                                                        try {
                                                            try {
                                                                try {
                                                                    v9 = var20_11;
lbl108:
                                                                    // 2 sources

                                                                    if (var2_2 <= 0L) ** GOTO lbl158
                                                                    if (v9 == null) break block55;
                                                                    if (v8 != false) {
                                                                    }
                                                                    ** GOTO lbl147
                                                                }
                                                                catch (n9 v19) {
                                                                    throw m44.a("n", (Object)v19, (long)4940993317882560846L, (long)var2_2);
                                                                }
                                                                if (var2_2 < 0L) break block56;
                                                                v20 = new Object[1];
                                                                v20[0] = var18_10;
                                                                if (m44.a("q", (Object)var22_13, (Object)v20, (long)6602861925647595410L, (long)var2_2) != 5) break block57;
                                                            }
                                                            catch (n9 v21) {
                                                                throw m44.a("n", (Object)v21, (long)4940993317882560846L, (long)var2_2);
                                                            }
                                                            v22 = new Object[1];
                                                            v22[0] = var10_6;
                                                            m44.a("r", (Object)this, (int)m44.a("q", (Object)var22_13, (Object)v22, (long)6623641582517046290L, (long)var2_2), (long)4990350881781282308L, (long)var2_2);
                                                            v23 = var20_11;
                                                            if (var2_2 >= 0L) {
                                                                if (v23 != null) break block56;
                                                            }
                                                            ** GOTO lbl146
                                                        }
                                                        catch (n9 v24) {
                                                            throw m44.a("n", (Object)v24, (long)4940993317882560846L, (long)var2_2);
                                                        }
                                                    }
                                                    v25 = new Object[1];
                                                    v25[0] = var10_6;
                                                    m44.a("r", (Object)this, (int)m44.a("q", (Object)var22_13, (Object)v25, (long)6623641582517046290L, (long)var2_2), (long)6406558831535926390L, (long)var2_2);
                                                }
                                                catch (n9 v26) {
                                                    throw m44.a("n", (Object)v26, (long)4940993317882560846L, (long)var2_2);
                                                }
                                            }
                                            try {
                                                m44.a("p", (Object)this, (long)4686052567561725265L, (long)var2_2)[var21_12 /* !! */ ] = null;
                                                v23 = var20_11;
lbl146:
                                                // 2 sources

                                                if (v23 != null) break block50;
lbl147:
                                                // 2 sources

                                                v27 = new Object[1];
                                                v27[0] = var4_3;
                                                v8 = m44.a("q", (Object)var22_13, (Object)v27, (long)5042179076672889728L, (long)var2_2);
                                            }
                                            catch (n9 v28) {
                                                throw m44.a("n", (Object)v28, (long)4940993317882560846L, (long)var2_2);
                                            }
                                        }
                                        try {
                                            try {
                                                v9 = var20_11;
lbl158:
                                                // 2 sources

                                                if (v9 == null) break block58;
                                                if (v8 == false) break block50;
                                            }
                                            catch (n9 v29) {
                                                throw m44.a("n", (Object)v29, (long)4940993317882560846L, (long)var2_2);
                                            }
                                            v30 = new Object[2];
                                            v30[1] = var14_8;
                                            v30[0] = true;
                                            v8 = m44.a("q", (Object)var22_13, (Object)v30, (long)6354287840330541913L, (long)var2_2);
                                        }
                                        catch (n9 v31) {
                                            throw m44.a("n", (Object)v31, (long)4940993317882560846L, (long)var2_2);
                                        }
                                    }
                                    var23_14 = v8;
                                }
                                ++var21_12 /* !! */ ;
                            }
                            v4 = var20_11;
                        }
                        if (v4 != null) continue;
                    }
                }
                var21_12 /* !! */  = 0;
            }
            while (true) {
                block59: {
                    try {
                        v32 = new Object[3];
                        v32[2] = m44.a("p", (Object)this, (long)4686052567561725265L, (long)var2_2);
                        v32[1] = var12_7;
                        v32[0] = false;
                        v33 /* !! */  = m44.a("q", (Object)this, (Object)v32, (long)6857979698027747920L, (long)var2_2);
                        if (var2_2 >= 0L) {
                            if (v33 /* !! */  == false) break block59;
                            v33 /* !! */  = (CallSite)true;
                        }
                        if (var20_11 == null) break block60;
                    }
                    catch (n9 v34) {
                        throw m44.a("n", (Object)v34, (long)4940993317882560846L, (long)var2_2);
                    }
                    var21_12 /* !! */  = (int)v33 /* !! */ ;
                    if (var20_11 != null) continue;
                }
                if (var2_2 > 0L) break;
            }
            v33 /* !! */  = (CallSite)var21_12 /* !! */ ;
        }
        return (boolean)v33 /* !! */ ;
    }

    boolean S(Object[] objectArray) {
        long l10;
        int n10;
        block13: {
            int n11;
            block11: {
                n10 = (Integer)objectArray[0];
                l10 = (Long)objectArray[1];
                l10 = a ^ l10;
                CallSite callSite = m44.a("o", (long)-6365078765154238244L, (long)l10);
                try {
                    block12: {
                        try {
                            try {
                                try {
                                    n11 = n10;
                                    if (callSite == null) break block11;
                                    if (n11 == lqe.b("y", (int)8342, (long)(0x2BF28FDEE23D03B0L ^ l10))) break block12;
                                }
                                catch (n9 n92) {
                                    throw m44.a("o", (Object)n92, (long)-6915048333610129961L, (long)l10);
                                }
                                n11 = n10;
                                if (callSite == null) break block11;
                            }
                            catch (n9 n93) {
                                throw m44.a("o", (Object)n93, (long)-6915048333610129961L, (long)l10);
                            }
                            if (n11 != lqe.b("y", (int)1730, (long)(0x11D7A3BCB56225EEL ^ l10))) break block13;
                        }
                        catch (n9 n94) {
                            throw m44.a("o", (Object)n94, (long)-6915048333610129961L, (long)l10);
                        }
                    }
                    n11 = 1;
                }
                catch (n9 n95) {
                    throw m44.a("o", (Object)n95, (long)-6915048333610129961L, (long)l10);
                }
            }
            return n11 != 0;
        }
        CallSite callSite = m44.a("q", (Object)this, (long)-4808178844863413450L, (long)l10)[n10];
        try {
            if (callSite != null) {
                return true;
            }
        }
        catch (n9 n96) {
            throw m44.a("o", (Object)n96, (long)-6915048333610129961L, (long)l10);
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    void x(Object[] var1_1) {
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
     * Unable to fully structure code
     */
    boolean q(Object[] var1_1) {
        block19: {
            block16: {
                block18: {
                    block17: {
                        block15: {
                            var2_2 = (Long)var1_1[0];
                            var2_2 = lqe.a ^ var2_2;
                            var4_3 = m44.a("h", (long)-8451579488350261821L, (long)var2_2);
                            try {
                                try {
                                    v0 = m44.a("v", (Object)this, (long)-8044927030466154967L, (long)var2_2)[0];
                                    if (var4_3 == null) break block15;
                                    if (v0 == null) break block16;
                                }
                                catch (n9 v1) {
                                    throw m44.a("h", (Object)v1, (long)-8279982811990144824L, (long)var2_2);
                                }
                                v0 = m44.a("v", (Object)this, (long)-8044927030466154967L, (long)var2_2)[1];
                            }
                            catch (n9 v2) {
                                throw m44.a("h", (Object)v2, (long)-8279982811990144824L, (long)var2_2);
                            }
                        }
                        try {
                            try {
                                v3 = var4_3;
                                if (var2_2 > 0L) {
                                    if (v3 == null) break block17;
                                    if (v0 == null) break block16;
                                }
                                ** GOTO lbl37
                            }
                            catch (n9 v4) {
                                throw m44.a("h", (Object)v4, (long)-8279982811990144824L, (long)var2_2);
                            }
                            v0 = m44.a("v", (Object)this, (long)-8044927030466154967L, (long)var2_2)[3];
                        }
                        catch (n9 v5) {
                            throw m44.a("h", (Object)v5, (long)-8279982811990144824L, (long)var2_2);
                        }
                    }
                    try {
                        try {
                            if (var2_2 <= 0L) break block18;
                            v3 = var4_3;
lbl37:
                            // 2 sources

                            if (v3 == null) break block18;
                            if (v0 == null) break block16;
                        }
                        catch (n9 v6) {
                            throw m44.a("h", (Object)v6, (long)-8279982811990144824L, (long)var2_2);
                        }
                        v0 = m44.a("v", (Object)this, (long)-8044927030466154967L, (long)var2_2)[2];
                    }
                    catch (n9 v7) {
                        throw m44.a("h", (Object)v7, (long)-8279982811990144824L, (long)var2_2);
                    }
                }
                try {
                    if (v0 == null) break block16;
                    v8 = true;
                    break block19;
                }
                catch (n9 v9) {
                    throw m44.a("h", (Object)v9, (long)-8279982811990144824L, (long)var2_2);
                }
            }
            v8 = false;
        }
        return v8;
    }

    public String c(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("p", (Object)this, (long)4270809943514439380L, (long)l10);
    }

    int u(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("q", (Object)this, (long)8293847996901885831L, (long)l10);
    }

    boolean s(Object[] objectArray) {
        boolean bl2 = (Boolean)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x88B18E60199L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = m44.a("q", (Object)this, (long)631641862762991112L, (long)l10);
        objectArray2[1] = l11;
        objectArray2[0] = bl2;
        return (boolean)m44.a("p", (Object)this, (Object)objectArray2, (long)1032862447141292841L, (long)l10);
    }

    boolean Q(Object[] objectArray) {
        boolean bl2 = (Boolean)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x79B9AC43FD30L;
        int n10 = 0;
        CallSite callSite = m44.a("l", (long)-3827598956218290793L, (long)l10);
        while (n10 < lqe.b("y", (int)8342, (long)(0x2BF29E4F8E576EFBL ^ l10))) {
            CallSite callSite2;
            block11: {
                block12: {
                    Object object;
                    block13: {
                        CallSite callSite3;
                        block9: {
                            CallSite callSite4 = m44.a("r", (Object)this, (long)-3427482648100219229L, (long)l10)[n10];
                            try {
                                block10: {
                                    try {
                                        try {
                                            callSite3 = callSite4;
                                            if (l10 <= 0L || callSite == null) break block9;
                                            if (callSite3 != null) break block10;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("l", (Object)n92, (long)-3655865455087155044L, (long)l10);
                                        }
                                        callSite2 = callSite;
                                        if (l10 < 0L) break block11;
                                        if (callSite2 != null) break block12;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("l", (Object)n93, (long)-3655865455087155044L, (long)l10);
                                    }
                                }
                                callSite3 = callSite4;
                            }
                            catch (n9 n94) {
                                throw m44.a("l", (Object)n94, (long)-3655865455087155044L, (long)l10);
                            }
                        }
                        try {
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l11;
                            objectArray2[0] = bl2;
                            object = m44.a("s", (Object)callSite3, (Object)objectArray2, (long)-3315535955902012789L, (long)l10);
                            if (callSite == null) break block13;
                            if (object != false) break block12;
                        }
                        catch (n9 n95) {
                            throw m44.a("l", (Object)n95, (long)-3655865455087155044L, (long)l10);
                        }
                        object = false;
                    }
                    return (boolean)object;
                }
                ++n10;
                callSite2 = callSite;
            }
            if (callSite2 != null) continue;
        }
        return true;
    }

    int R(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("v", (Object)this, (long)-9126734072089628142L, (long)l10);
    }

    private void O(Object[] objectArray) {
        block7: {
            int n10 = (Integer)objectArray[0];
            ge[] geArray = (ge[])objectArray[1];
            boolean[] blArray = (boolean[])objectArray[2];
            boolean bl2 = (Boolean)objectArray[3];
            long l10 = (Long)objectArray[4];
            long l11 = l10 = a ^ l10;
            long l12 = l11 ^ 0x4CD21828A259L;
            long l13 = l11 ^ 0x105BC61049FCL;
            CallSite callSite = m44.a("h", (long)9092146308526922075L, (long)l10);
            if (m44.a("v", (Object)this, (long)7260526781162560177L, (long)l10)[n10] == null) {
                ge ge2;
                ge ge3;
                block6: {
                    ge3 = geArray[n10];
                    try {
                        ge2 = ge3;
                        if (l10 <= 0L || callSite == null) break block6;
                        if (ge2 == null) break block7;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)8759404924367486032L, (long)l10);
                    }
                    ge2 = ge3;
                }
                try {
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = l13;
                    objectArray2[0] = bl2;
                    if (m44.a("w", (Object)ge2, (Object)objectArray2, (long)7291521857264506439L, (long)l10) != false) {
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l12;
                        m44.a("v", (Object)this, (long)7260526781162560177L, (long)l10)[n10] = (int)m44.a("w", (Object)ge3, (Object)objectArray3, (long)7174331679365515415L, (long)l10);
                        blArray[0] = true;
                    }
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)8759404924367486032L, (long)l10);
                }
            }
        }
    }

    Point J(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return new Point((Integer)((Object)m44.a("r", (Object)this, (long)-5251608294658258579L, (long)l10)[3]), (Integer)((Object)m44.a("r", (Object)this, (long)-5251608294658258579L, (long)l10)[2]));
    }

    /*
     * Exception decompiling
     */
    private void A(Object[] var1_1) {
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
    public String J(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[DOLOOP]], but top level block is 12[SIMPLE_IF_TAKEN]
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

    int r(Object[] objectArray) {
        int n10;
        block9: {
            CallSite callSite;
            int n11;
            long l10;
            block7: {
                CallSite callSite2;
                block8: {
                    l10 = (Long)objectArray[0];
                    n11 = (Integer)objectArray[1];
                    l10 = a ^ l10;
                    callSite2 = m44.a("j", (long)7433128664673697873L, (long)l10);
                    try {
                        n10 = n11;
                        callSite = lqe.b("y", (int)8342, (long)(0x2BF2FA6B8A02C33DL ^ l10));
                        if (callSite2 == null) break block7;
                        if (n10 != callSite) break block8;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)6955147276071019866L, (long)l10);
                    }
                    CallSite callSite3 = m44.a("t", (Object)m44.a("u", (Object)m44.a("t", (Object)this, (long)8873792100201544704L, (long)l10), (long)7246989002701389913L, (long)l10), (long)7072221390814470051L, (long)l10);
                    return (int)callSite3;
                }
                try {
                    n10 = n11;
                    if (callSite2 == null) break block9;
                    callSite = lqe.b("y", (int)6327, (long)(0x48C1011B0B73FB1DL ^ l10));
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)6955147276071019866L, (long)l10);
                }
            }
            try {
                if (n10 == callSite) {
                    return (int)m44.a("t", (Object)m44.a("u", (Object)m44.a("t", (Object)this, (long)8873792100201544704L, (long)l10), (long)7246989002701389913L, (long)l10), (long)9187456722892868722L, (long)l10);
                }
            }
            catch (n9 n94) {
                throw m44.a("j", (Object)n94, (long)6955147276071019866L, (long)l10);
            }
            n10 = (Integer)((Object)m44.a("t", (Object)this, (long)9063669509837128635L, (long)l10)[n11]);
        }
        return n10;
    }

    String p(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x37F59A5901C1L;
        m44.a("t", (Object)this, null, (long)-5882896561245789506L, (long)l10);
        CallSite callSite = m44.a("h", (long)-6249413711792796109L, (long)l10);
        m44.a("t", (Object)this, null, (long)-5264981797257701635L, (long)l10);
        CallSite callSite2 = callSite;
        int n10 = 0;
        while (n10 < lqe.b("y", (int)8342, (long)(0x2BF2A21FD7860D5FL ^ l10))) {
            CallSite callSite3;
            block14: {
                block15: {
                    block13: {
                        CallSite callSite4;
                        block11: {
                            CallSite callSite5 = m44.a("v", (Object)this, (long)-5491261370140019449L, (long)l10)[n10];
                            try {
                                block12: {
                                    try {
                                        try {
                                            callSite4 = callSite5;
                                            if (callSite2 == null) break block11;
                                            if (callSite4 != null) break block12;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("h", (Object)n92, (long)-5843422798697338056L, (long)l10);
                                        }
                                        if (callSite2 != null) break block13;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("h", (Object)n93, (long)-5843422798697338056L, (long)l10);
                                    }
                                }
                                callSite4 = callSite5;
                            }
                            catch (n9 n94) {
                                throw m44.a("h", (Object)n94, (long)-5843422798697338056L, (long)l10);
                            }
                        }
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l11;
                        CallSite callSite6 = m44.a("w", (Object)callSite4, (Object)objectArray2, (long)-5668848948139935470L, (long)l10);
                        try {
                            try {
                                callSite3 = callSite2;
                                if (l10 <= 0L) break block14;
                                if (callSite3 == null) break block15;
                                if (callSite6 == null) break block13;
                            }
                            catch (n9 n95) {
                                throw m44.a("h", (Object)n95, (long)-5843422798697338056L, (long)l10);
                            }
                            return callSite6;
                        }
                        catch (n9 n96) {
                            throw m44.a("h", (Object)n96, (long)-5843422798697338056L, (long)l10);
                        }
                    }
                    ++n10;
                }
                callSite3 = callSite2;
            }
            if (callSite3 != null) continue;
        }
        return null;
    }

    Point R(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return new Point((Integer)((Object)m44.a("q", (Object)this, (long)-2344810039383875322L, (long)l10)[5]), (Integer)((Object)m44.a("q", (Object)this, (long)-2344810039383875322L, (long)l10)[4]));
    }

    String A(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x2E95DE4AAE6DL;
        long l13 = l11 ^ 0x4EED11BC1326L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = string;
        objectArray2[0] = l12;
        CallSite callSite = m44.a("i", (Object)objectArray2, (long)-7557624598607989553L, (long)l10);
        m44.a("w", (Object)this, (long)-8175596758151624634L, (long)l10)[callSite] = new ge(l13, (ah)((Object)m44.a("w", (Object)this, (long)-8280766153893910826L, (long)l10)), string2);
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    lqe.a = prr.a(4835798816606906012L, 2501910563140626736L, MethodHandles.lookup().lookupClass()).a(64943501811344L);
                    lqe.d = new HashMap<K, V>(13);
                    var11 = lqe.a ^ 20951780084276L;
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
                    var20_3 = new String[2];
                    var18_4 = 0;
                    var17_5 = "j)\u00a04IN\u0099a\u00f8:\u0016$ q%n\u0010\u00bc\u00d7\u00d3\u00a2\u0089\r[J\u0002\u001c\r4\u00a3\u0014\u000e\u00a4";
                    var19_6 = "j)\u00a04IN\u0099a\u00f8:\u0016$ q%n\u0010\u00bc\u00d7\u00d3\u00a2\u0089\r[J\u0002\u001c\r4\u00a3\u0014\u000e\u00a4".length();
                    var16_7 = 16;
                    var15_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        var20_3[var18_4++] = lqe.a(var21_9).intern();
                        if ((var15_8 += var16_7) < var19_6) {
                            var16_7 = var17_5.charAt(var15_8);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v3 = ++var15_8;
                    var21_9 = var13_1.doFinal(var17_5.substring(v3, v3 + var16_7).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                lqe.b = var20_3;
                lqe.c = new String[2];
                lqe.h = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v6 = v6;
                    v6[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[13];
                var3_13 = 0;
                var4_14 = "\u00c1\u00f0\u00beF\u00ad*r\u0003\u001d\u00e6\u009dK4\u001bI\u0095\u0080\u00ed\u00f3\u00d6e|\u008dv\u00bb\u00daaT\u00a3Rm\u00d8\u00fb\u00ca\u001d\u00f2\u00e3:N_/w\u00bd\u00ec\u00ac\u008c\u00fb\u00ee2\u00d2V\u00c7\u009b\u00b4\u0010n\u00e7\u009f\u00d5\u00d5\u0089\u00943\u0010\u00fd\u0086\u00bd=\u000e3\u00af\u00b9\u0096\u001fM\u001b\u00c0\u00d7\u00be\u00c5Y\u009a\u00dc\u0089A\u00e5\u00a2\u000e";
                var5_15 = "\u00c1\u00f0\u00beF\u00ad*r\u0003\u001d\u00e6\u009dK4\u001bI\u0095\u0080\u00ed\u00f3\u00d6e|\u008dv\u00bb\u00daaT\u00a3Rm\u00d8\u00fb\u00ca\u001d\u00f2\u00e3:N_/w\u00bd\u00ec\u00ac\u008c\u00fb\u00ee2\u00d2V\u00c7\u009b\u00b4\u0010n\u00e7\u009f\u00d5\u00d5\u0089\u00943\u0010\u00fd\u0086\u00bd=\u000e3\u00af\u00b9\u0096\u001fM\u001b\u00c0\u00d7\u00be\u00c5Y\u009a\u00dc\u0089A\u00e5\u00a2\u000e".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v7 = var6_12;
                    v8 = var3_13++;
                    v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v10 = -1;
                    break block13;
                    break;
                }
lbl58:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "5\u00c0L\u00f8\u00b7\u0011f\u0080a\u0013\u0083\u00c0\f9j\u000f";
                    var5_15 = "5\u00c0L\u00f8\u00b7\u0011f\u0080a\u0013\u0083\u00c0\f9j\u000f".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v7 = var6_12;
                        v8 = var3_13++;
                        v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v10 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl71:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    break block14;
                    break;
                }
            }
            var8_18 = v9;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v11 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl84:
                // 1 sources

                ** continue;
            }
        }
        lqe.e = var6_12;
        lqe.f = new Integer[13];
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3C8B;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lqe", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n11].getBytes("ISO-8859-1");
            lqe.c[n11] = lqe.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lqe.a(n10, l10);
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
            throw new RuntimeException("com/zelix/lqe" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x129D;
        if (f[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = e[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lqe", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lqe.f[n11] = n12;
        }
        return f[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = lqe.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/lqe" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lqe.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(lqe.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

