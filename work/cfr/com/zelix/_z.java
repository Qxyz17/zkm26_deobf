/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._2;
import com.zelix._3;
import com.zelix._4;
import com.zelix._9;
import com.zelix.h1;
import com.zelix.iq;
import com.zelix.k6;
import com.zelix.k7;
import com.zelix.ka;
import com.zelix.kj;
import com.zelix.kp;
import com.zelix.ky;
import com.zelix.l6q;
import com.zelix.lb6;
import com.zelix.lk0;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.ss;
import com.zelix.sz;
import com.zelix.t6;
import com.zelix.uv;
import com.zelix.v7;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class _z
extends _9 {
    private static final long b;
    private static final String[] d;
    private static final String[] g;
    private static final Map h;
    private static final long[] i;
    private static final Integer[] j;
    private static final Map l;

    /*
     * Exception decompiling
     */
    public static _z D(k6 var0, iq var1_1, v7[] var2_2, v7[] var3_3, t6 var4_4, Set var5_5, long var6_6, List var8_7, lb6 var9_8, sz var10_9, sz var11_10, Map var12_11, Map var13_12) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [73[DOLOOP]], but top level block is 24[TRYBLOCK]
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
    public final uv t(Object[] var1_1) {
        block61: {
            block63: {
                block62: {
                    block59: {
                        block60: {
                            block56: {
                                block58: {
                                    block57: {
                                        block54: {
                                            block55: {
                                                block51: {
                                                    block53: {
                                                        block52: {
                                                            block50: {
                                                                block48: {
                                                                    block49: {
                                                                        var2_2 = (Long)var1_1[0];
                                                                        var4_3 = (var2_2 = _z.b ^ var2_2) ^ 28190800289385L;
                                                                        v0 = new Object[1];
                                                                        v0[0] = var4_3;
                                                                        var7_4 = m44.a("t", (Object)this, (Object)v0, (long)-174196364993099022L, (long)var2_2);
                                                                        var6_5 = m44.a("k", (long)-1888420170423946963L, (long)var2_2);
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        v1 = var7_4;
                                                                                        if (var6_5 != false) break block48;
                                                                                        if (v1 < 0) break block49;
                                                                                    }
                                                                                    catch (n9 v2) {
                                                                                        throw m44.a("k", (Object)v2, (long)-2113699305478831933L, (long)var2_2);
                                                                                    }
                                                                                    v1 = var7_4;
                                                                                    v3 = _z.b("j", (int)11670, (long)(3564473989860963269L ^ var2_2));
                                                                                    v4 = var6_5;
                                                                                    if (var2_2 > 0L) {
                                                                                        if (v4 != false) break block50;
                                                                                    }
                                                                                    ** GOTO lbl46
                                                                                }
                                                                                catch (n9 v5) {
                                                                                    throw m44.a("k", (Object)v5, (long)-2113699305478831933L, (long)var2_2);
                                                                                }
                                                                                if (v1 > v3) break block49;
                                                                            }
                                                                            catch (n9 v6) {
                                                                                throw m44.a("k", (Object)v6, (long)-2113699305478831933L, (long)var2_2);
                                                                            }
                                                                            return m44.a("o", (long)-101908965119987072L, (long)var2_2);
                                                                        }
                                                                        catch (n9 v7) {
                                                                            throw m44.a("k", (Object)v7, (long)-2113699305478831933L, (long)var2_2);
                                                                        }
                                                                    }
                                                                    v1 = var7_4;
                                                                }
                                                                v3 = _z.b("j", (int)12303, (long)(2118054567383445082L ^ var2_2));
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v4 = var6_5;
lbl46:
                                                                            // 2 sources

                                                                            if (v4 != false) break block51;
                                                                            if (v1 < v3) break block52;
                                                                        }
                                                                        catch (n9 v8) {
                                                                            throw m44.a("k", (Object)v8, (long)-2113699305478831933L, (long)var2_2);
                                                                        }
                                                                        v1 = var7_4;
                                                                        v3 = _z.b("j", (int)23708, (long)(522868817223008970L ^ var2_2));
                                                                        v9 = var6_5;
                                                                        if (var2_2 > 0L) {
                                                                            if (v9 != false) break block51;
                                                                        }
                                                                        ** GOTO lbl77
                                                                    }
                                                                    catch (n9 v10) {
                                                                        throw m44.a("k", (Object)v10, (long)-2113699305478831933L, (long)var2_2);
                                                                    }
                                                                    if (var2_2 <= 0L) break block53;
                                                                    if (v1 > v3) break block52;
                                                                }
                                                                catch (n9 v11) {
                                                                    throw m44.a("k", (Object)v11, (long)-2113699305478831933L, (long)var2_2);
                                                                }
                                                                return m44.a("o", (long)-394632423016318991L, (long)var2_2);
                                                            }
                                                            catch (n9 v12) {
                                                                throw m44.a("k", (Object)v12, (long)-2113699305478831933L, (long)var2_2);
                                                            }
                                                        }
                                                        v1 = var7_4;
                                                        v13 = 30352;
                                                    }
                                                    v3 = _z.b("j", (int)v13, (long)(3443600289196042443L ^ var2_2));
                                                }
                                                try {
                                                    try {
                                                        v9 = var6_5;
lbl77:
                                                        // 2 sources

                                                        if (var2_2 > 0L) {
                                                            if (v9 != false) break block54;
                                                            if (v1 != v3) break block55;
                                                        }
                                                        ** GOTO lbl96
                                                    }
                                                    catch (n9 v14) {
                                                        throw m44.a("k", (Object)v14, (long)-2113699305478831933L, (long)var2_2);
                                                    }
                                                    return m44.a("o", (long)-1937026557343679395L, (long)var2_2);
                                                }
                                                catch (n9 v15) {
                                                    throw m44.a("k", (Object)v15, (long)-2113699305478831933L, (long)var2_2);
                                                }
                                            }
                                            v1 = var7_4;
                                            v3 = _z.b("j", (int)27202, (long)(2520250077285643291L ^ var2_2));
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v9 = var6_5;
lbl96:
                                                        // 2 sources

                                                        if (v9 != false) break block56;
                                                        if (v1 < v3) break block57;
                                                    }
                                                    catch (n9 v16) {
                                                        throw m44.a("k", (Object)v16, (long)-2113699305478831933L, (long)var2_2);
                                                    }
                                                    v1 = var7_4;
                                                    v3 = _z.b("j", (int)29520, (long)(2814055049211768082L ^ var2_2));
                                                    v17 = var6_5;
                                                    if (var2_2 > 0L) {
                                                        if (v17 != false) break block56;
                                                    }
                                                    ** GOTO lbl127
                                                }
                                                catch (n9 v18) {
                                                    throw m44.a("k", (Object)v18, (long)-2113699305478831933L, (long)var2_2);
                                                }
                                                if (var2_2 < 0L) break block58;
                                                if (v1 > v3) break block57;
                                            }
                                            catch (n9 v19) {
                                                throw m44.a("k", (Object)v19, (long)-2113699305478831933L, (long)var2_2);
                                            }
                                            return m44.a("o", (long)-2095830610713165120L, (long)var2_2);
                                        }
                                        catch (n9 v20) {
                                            throw m44.a("k", (Object)v20, (long)-2113699305478831933L, (long)var2_2);
                                        }
                                    }
                                    v1 = var7_4;
                                    v21 = 32584;
                                }
                                v3 = _z.b("j", (int)v21, (long)(4517871617975738652L ^ var2_2));
                            }
                            try {
                                try {
                                    v17 = var6_5;
lbl127:
                                    // 2 sources

                                    if (var2_2 >= 0L) {
                                        if (v17 != false) break block59;
                                        if (v1 != v3) break block60;
                                    }
                                    ** GOTO lbl146
                                }
                                catch (n9 v22) {
                                    throw m44.a("k", (Object)v22, (long)-2113699305478831933L, (long)var2_2);
                                }
                                return m44.a("o", (long)-227435264490344273L, (long)var2_2);
                            }
                            catch (n9 v23) {
                                throw m44.a("k", (Object)v23, (long)-2113699305478831933L, (long)var2_2);
                            }
                        }
                        v1 = var7_4;
                        v3 = _z.b("j", (int)19460, (long)(3004905881055777372L ^ var2_2));
                    }
                    try {
                        try {
                            try {
                                try {
                                    v17 = var6_5;
lbl146:
                                    // 2 sources

                                    if (v17 != false) break block61;
                                    if (v1 < v3) break block62;
                                }
                                catch (n9 v24) {
                                    throw m44.a("k", (Object)v24, (long)-2113699305478831933L, (long)var2_2);
                                }
                                v1 = var7_4;
                                v3 = _z.b("j", (int)27974, (long)(1804792851458224919L ^ var2_2));
                                if (var2_2 <= 0L || var6_5 != false) break block61;
                            }
                            catch (n9 v25) {
                                throw m44.a("k", (Object)v25, (long)-2113699305478831933L, (long)var2_2);
                            }
                            if (var2_2 < 0L) break block63;
                            if (v1 > v3) break block62;
                        }
                        catch (n9 v26) {
                            throw m44.a("k", (Object)v26, (long)-2113699305478831933L, (long)var2_2);
                        }
                        return m44.a("o", (long)-2102851112144703317L, (long)var2_2);
                    }
                    catch (n9 v27) {
                        throw m44.a("k", (Object)v27, (long)-2113699305478831933L, (long)var2_2);
                    }
                }
                v1 = var7_4;
                v28 = 29304;
            }
            v3 = _z.b("j", (int)v28, (long)(1063602908780162086L ^ var2_2));
        }
        try {
            if (v1 == v3) {
                return m44.a("o", (long)-157151041062905320L, (long)var2_2);
            }
        }
        catch (n9 v29) {
            throw m44.a("k", (Object)v29, (long)-2113699305478831933L, (long)var2_2);
        }
        return null;
    }

    @Override
    public final String R(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return _z.a("z", (int)26861, (long)(0x5B44646327774EA3L ^ l10));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static _z L(Object[] var0) {
        block50: {
            block48: {
                block49: {
                    block46: {
                        block47: {
                            block44: {
                                block45: {
                                    block42: {
                                        block43: {
                                            block41: {
                                                block38: {
                                                    block39: {
                                                        block40: {
                                                            block37: {
                                                                block51: {
                                                                    block35: {
                                                                        block36: {
                                                                            var3_1 = (k6)var0[0];
                                                                            var4_2 = (h1)var0[1];
                                                                            var6_3 = (l6q)var0[2];
                                                                            var1_4 = (l6q)var0[3];
                                                                            var7_5 = (PrintWriter)var0[4];
                                                                            var10_6 = (lb6)var0[5];
                                                                            var5_7 = (Map)var0[6];
                                                                            var8_8 = (Long)var0[7];
                                                                            var2_9 = (Map)var0[8];
                                                                            v0 = var8_8 = _z.b ^ var8_8;
                                                                            var11_10 = v0 ^ 53678259617751L;
                                                                            v1 = v0 ^ 54213100712077L;
                                                                            var13_11 = (int)(v1 >>> 32);
                                                                            var14_12 = (int)(v1 << 32 >>> 32);
                                                                            var15_13 = v0 ^ 114013823279589L;
                                                                            var17_14 = v0 ^ 134436087189628L;
                                                                            var19_15 = v0 ^ 131621576478553L;
                                                                            var21_16 = v0 ^ 27061773947988L;
                                                                            var23_17 = v0 ^ 83454962683981L;
                                                                            var25_18 = v0 ^ 136775638770111L;
                                                                            var27_19 = v0 ^ 17503347299128L;
                                                                            var30_20 /* !! */  = null;
                                                                            var31_21 = var4_2.readUnsignedByte();
                                                                            var29_22 = m44.a("k", (long)8740070669141552557L, (long)var8_8);
                                                                            try {
                                                                                v2 = var31_21;
                                                                                v3 = _z.b("j", (int)29304, (long)(1063589614736208038L ^ var8_8));
                                                                                if (var29_22 != false) break block35;
                                                                                if (v2 != v3) break block36;
                                                                            }
                                                                            catch (n9 v4) {
                                                                                throw m44.a("k", (Object)v4, (long)9091269586493201475L, (long)var8_8);
                                                                            }
                                                                            var30_20 /* !! */  = new k7((int)var31_21, var3_1, var4_2, var6_3, var1_4, var7_5, var10_6, var5_7, var23_17, var2_9);
                                                                            break block50;
                                                                        }
                                                                        try {
                                                                            v2 = var31_21;
                                                                            v5 /* !! */  = var29_22;
                                                                            if (var8_8 > 0L) {
                                                                                if (v5 /* !! */  != false) break block37;
                                                                                v3 = _z.b("j", (int)32584, (long)(4517876130884091292L ^ var8_8));
                                                                            }
                                                                            ** GOTO lbl60
                                                                        }
                                                                        catch (n9 v6) {
                                                                            throw m44.a("k", (Object)v6, (long)9091269586493201475L, (long)var8_8);
                                                                        }
                                                                    }
                                                                    if (v2 != v3) break block51;
                                                                    var30_20 /* !! */  = new ky((int)var31_21, var3_1, var4_2, var19_15, var6_3, var1_4, var7_5, var10_6, var5_7, var2_9);
                                                                    break block50;
                                                                }
                                                                v2 = var31_21;
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        v5 /* !! */  = var29_22;
lbl60:
                                                                        // 2 sources

                                                                        if (var8_8 < 0L) break block38;
                                                                        if (v5 /* !! */  != false) break block39;
                                                                        if (v2 < false) break block40;
                                                                    }
                                                                    catch (n9 v7) {
                                                                        throw m44.a("k", (Object)v7, (long)9091269586493201475L, (long)var8_8);
                                                                    }
                                                                    v2 = var31_21;
                                                                    v8 /* !! */  = _z.b("j", (int)11670, (long)(3564460695884181317L ^ var8_8));
                                                                    v9 = var29_22;
                                                                    if (var8_8 >= 0L) {
                                                                        if (v9 != false) break block41;
                                                                    }
                                                                    ** GOTO lbl92
                                                                }
                                                                catch (n9 v10) {
                                                                    throw m44.a("k", (Object)v10, (long)9091269586493201475L, (long)var8_8);
                                                                }
                                                                if (v2 > v8 /* !! */ ) break block40;
                                                            }
                                                            catch (n9 v11) {
                                                                throw m44.a("k", (Object)v11, (long)9091269586493201475L, (long)var8_8);
                                                            }
                                                            var30_20 /* !! */  = new kj((int)var31_21, var3_1, var4_2, var6_3, var1_4, var7_5, var10_6, var21_16, var5_7, var2_9);
                                                            break block50;
                                                        }
                                                        v2 = var31_21;
                                                    }
                                                    v5 /* !! */  = (CallSite)12303;
                                                }
                                                v8 /* !! */  = _z.b("j", (int)v5 /* !! */ , (long)(2118058807543476954L ^ var8_8));
                                            }
                                            try {
                                                try {
                                                    try {
                                                        v9 = var29_22;
lbl92:
                                                        // 2 sources

                                                        if (v9 != false) break block42;
                                                        if (v2 < v8 /* !! */ ) break block43;
                                                    }
                                                    catch (n9 v12) {
                                                        throw m44.a("k", (Object)v12, (long)9091269586493201475L, (long)var8_8);
                                                    }
                                                    v2 = var31_21;
                                                    v8 /* !! */  = _z.b("j", (int)16278, (long)(7120967207602896215L ^ var8_8));
                                                    v13 = var29_22;
                                                    if (var8_8 > 0L) {
                                                        if (v13 != false) break block42;
                                                    }
                                                    ** GOTO lbl118
                                                }
                                                catch (n9 v14) {
                                                    throw m44.a("k", (Object)v14, (long)9091269586493201475L, (long)var8_8);
                                                }
                                                if (v2 > v8 /* !! */ ) break block43;
                                            }
                                            catch (n9 v15) {
                                                throw m44.a("k", (Object)v15, (long)9091269586493201475L, (long)var8_8);
                                            }
                                            var30_20 /* !! */  = new kp((int)var31_21, var3_1, var4_2, var6_3, var1_4, var7_5, var11_10, var10_6, var5_7, var2_9);
                                            break block50;
                                        }
                                        v2 = var31_21;
                                        v8 /* !! */  = _z.b("j", (int)30352, (long)(3443613366318986315L ^ var8_8));
                                    }
                                    try {
                                        v13 = var29_22;
lbl118:
                                        // 2 sources

                                        if (var8_8 > 0L) {
                                            if (v13 != false) break block44;
                                            if (v2 != v8 /* !! */ ) break block45;
                                        }
                                        ** GOTO lbl135
                                    }
                                    catch (n9 v16) {
                                        throw m44.a("k", (Object)v16, (long)9091269586493201475L, (long)var8_8);
                                    }
                                    var30_20 /* !! */  = new ka((int)var31_21, var3_1, var4_2, var6_3, var1_4, var7_5, var13_11, var10_6, var5_7, var14_12, var2_9);
                                    break block50;
                                }
                                v2 = var31_21;
                                v8 /* !! */  = _z.b("j", (int)20473, (long)(6974132210248076579L ^ var8_8));
                            }
                            try {
                                try {
                                    try {
                                        v13 = var29_22;
lbl135:
                                        // 2 sources

                                        if (v13 != false) break block46;
                                        if (v2 < v8 /* !! */ ) break block47;
                                    }
                                    catch (n9 v17) {
                                        throw m44.a("k", (Object)v17, (long)9091269586493201475L, (long)var8_8);
                                    }
                                    v2 = var31_21;
                                    v8 /* !! */  = _z.b("j", (int)28579, (long)(8137332611624332671L ^ var8_8));
                                    v18 = var29_22;
                                    if (var8_8 >= 0L) {
                                        if (v18 != false) break block46;
                                    }
                                    ** GOTO lbl163
                                }
                                catch (n9 v19) {
                                    throw m44.a("k", (Object)v19, (long)9091269586493201475L, (long)var8_8);
                                }
                                if (v2 > v8 /* !! */ ) break block47;
                            }
                            catch (n9 v20) {
                                throw m44.a("k", (Object)v20, (long)9091269586493201475L, (long)var8_8);
                            }
                            var30_20 /* !! */  = new _3((int)var31_21, var3_1, var4_2, var6_3, var25_18, var1_4, var7_5, var10_6, var5_7, var2_9);
                            break block50;
                        }
                        v2 = var31_21;
                        v8 /* !! */  = _z.b("j", (int)17422, (long)(2470595672225629901L ^ var8_8));
                    }
                    try {
                        try {
                            try {
                                v18 = var29_22;
lbl163:
                                // 2 sources

                                if (v18 != false) break block48;
                                if (v2 < v8 /* !! */ ) break block49;
                            }
                            catch (n9 v21) {
                                throw m44.a("k", (Object)v21, (long)9091269586493201475L, (long)var8_8);
                            }
                            v2 = var31_21;
                            v8 /* !! */  = _z.b("j", (int)3105, (long)(8827327310148472561L ^ var8_8));
                            if (var29_22 != false) break block48;
                        }
                        catch (n9 v22) {
                            throw m44.a("k", (Object)v22, (long)9091269586493201475L, (long)var8_8);
                        }
                        if (v2 > v8 /* !! */ ) break block49;
                    }
                    catch (n9 v23) {
                        throw m44.a("k", (Object)v23, (long)9091269586493201475L, (long)var8_8);
                    }
                    var30_20 /* !! */  = new _2((int)var31_21, var3_1, var4_2, var6_3, var17_14, var1_4, var7_5, var10_6, var5_7, var2_9);
                    break block50;
                }
                v2 = false;
                v8 /* !! */  = (CallSite)true;
            }
            v24 = new String[v8 /* !! */ ];
            v25 = new Object[1];
            v25[0] = var15_13;
            v24[0] = (String)_z.a("z", (int)5771, (long)(1038735924533982269L ^ var8_8)) + (int)var31_21 + (String)_z.a("z", (int)14375, (long)(7027227128775072403L ^ var8_8)) + (String)m44.a("t", (Object)var3_1, (Object)v25, (long)6971274859811628866L, (long)var8_8) + "'";
            lk0.t(v2, v24, var27_19);
        }
        return var30_20 /* !! */ ;
    }

    public abstract int K(Object[] var1);

    /*
     * Exception decompiling
     */
    static boolean n(char var0, char var1_1, ss[] var2_2, int var3_3, ss[] var4_4) {
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

    protected abstract void o(long var1, DataOutputStream var3, lb6 var4, Map var5);

    protected final void z(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        DataOutputStream dataOutputStream = (DataOutputStream)objectArray[1];
        lb6 lb62 = (lb6)objectArray[2];
        long l11 = (l10 = b ^ l10) ^ 0x1521B6FDC363L;
        this.o(l11, dataOutputStream, lb62, null);
    }

    _z(_4 _42) {
        super(_42);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    _z.b = prr.a(-5793385841545577822L, 522839890233509637L, MethodHandles.lookup().lookupClass()).a(197909711280171L);
                    _z.h = new HashMap<K, V>(13);
                    var11 = _z.b ^ 69192306120987L;
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
                    var20_3 = new String[3];
                    var18_4 = 0;
                    var17_5 = "Y\u00f1\u0092\u00b6/\u000b^2\u00c5-\u00a4\u00bd\u00e4=\u0082\u0090 A\u0019\u00df\u009f\u00e7\u0016<\u00f3\u00e3~C\u00ad\u00ab/\"U \u009cl`Bc\u00fa<banW\u00beLb\t@\u00fc\u00c7\u00eb\u0081\u009c4S#%ve]\u0011\u00ce\u00141\u00b2]S\u009a\u00b1\u00ed\u00b4\u0090\u00de+\u008fiIpd)\u00de\u00fdHlM\u0097\u00d9\u008e\u0002\u0083\u0011\u009blr\u00d4\u0005\u009a\u00a3N\u001d\u00d5b\u0095\u0003e\u00d5(\u00e1\u00d84\u0001\u0014";
                    var19_6 = "Y\u00f1\u0092\u00b6/\u000b^2\u00c5-\u00a4\u00bd\u00e4=\u0082\u0090 A\u0019\u00df\u009f\u00e7\u0016<\u00f3\u00e3~C\u00ad\u00ab/\"U \u009cl`Bc\u00fa<banW\u00beLb\t@\u00fc\u00c7\u00eb\u0081\u009c4S#%ve]\u0011\u00ce\u00141\u00b2]S\u009a\u00b1\u00ed\u00b4\u0090\u00de+\u008fiIpd)\u00de\u00fdHlM\u0097\u00d9\u008e\u0002\u0083\u0011\u009blr\u00d4\u0005\u009a\u00a3N\u001d\u00d5b\u0095\u0003e\u00d5(\u00e1\u00d84\u0001\u0014".length();
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
                        var20_3[var18_4++] = _z.a(var21_9).intern();
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
                _z.d = var20_3;
                _z.g = new String[3];
                _z.l = new HashMap<K, V>(13);
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
                var6_12 = new long[20];
                var3_13 = 0;
                var4_14 = "\u00c8\u0083-\u00a4yJ\u00c9`\u0081\u008d\u0091\u00c0G\u0096\u00b5\u009f\u00d7\u00f6\u0018\u00c7Z\u008bjY\u001b\u00e7i\u00e4\u00eb\u008aI\u0082\u00c8v\u00b6\u00a1\u00fa\u00e2\u00bc\u0081\u00f7\u00a2\u0018P\u0087\u0014=\u008d\u0088\u00c3'\u00cd\u001d\u00fd\u0005u\u0089\u001b\u009f\"~MD\u00d1|\u00d4@M\u00f5W\u008c\u00b9\u00ce\u0096.\u00d3\u0099Z\u008a\u00e5\u0088m\u0001NLv\u00a8b\u00ea\u00b1\u0084\u0007\u00e7J.=k\u00d2\u0091\u008d$9\u00ea\u00c3\u00cd\u0005\u00bd:\u0087\u00b0F\u0000\u0083j\u00cd\u00fbz%U\u00b2=q\u00b7\u0086k\f\u0092\u0098\u008e\u0004\u001c?\u00fe\u00c0/\u00fc\u009a\u00af\u00e6a\u008ds\u00b4\u001a";
                var5_15 = "\u00c8\u0083-\u00a4yJ\u00c9`\u0081\u008d\u0091\u00c0G\u0096\u00b5\u009f\u00d7\u00f6\u0018\u00c7Z\u008bjY\u001b\u00e7i\u00e4\u00eb\u008aI\u0082\u00c8v\u00b6\u00a1\u00fa\u00e2\u00bc\u0081\u00f7\u00a2\u0018P\u0087\u0014=\u008d\u0088\u00c3'\u00cd\u001d\u00fd\u0005u\u0089\u001b\u009f\"~MD\u00d1|\u00d4@M\u00f5W\u008c\u00b9\u00ce\u0096.\u00d3\u0099Z\u008a\u00e5\u0088m\u0001NLv\u00a8b\u00ea\u00b1\u0084\u0007\u00e7J.=k\u00d2\u0091\u008d$9\u00ea\u00c3\u00cd\u0005\u00bd:\u0087\u00b0F\u0000\u0083j\u00cd\u00fbz%U\u00b2=q\u00b7\u0086k\f\u0092\u0098\u008e\u0004\u001c?\u00fe\u00c0/\u00fc\u009a\u00af\u00e6a\u008ds\u00b4\u001a".length();
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
                    var4_14 = "\u00be\u00db\u00f2bF\u00d59\u0090U\u0095\u0082\u001c\u001b\u00b1G\u0017";
                    var5_15 = "\u00be\u00db\u00f2bF\u00d59\u0090U\u0095\u0082\u001c\u001b\u00b1G\u0017".length();
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
        _z.i = var6_12;
        _z.j = new Integer[20];
    }

    private static n9 d(n9 n92) {
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x10B8;
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
                throw new RuntimeException("com/zelix/_z", exception);
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
            _z.g[n11] = _z.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = _z.a(n10, l10);
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
            throw new RuntimeException("com/zelix/_z" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x70DE;
        if (j[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = i[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])l.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/_z", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _z.j[n11] = n12;
        }
        return j[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = _z.b(n10, l10);
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
            throw new RuntimeException("com/zelix/_z" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_z.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_z.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

