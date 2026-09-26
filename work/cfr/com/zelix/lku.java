/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._0;
import com.zelix._o;
import com.zelix._v;
import com.zelix.cf;
import com.zelix.dl;
import com.zelix.f;
import com.zelix.f5;
import com.zelix.f6;
import com.zelix.gc;
import com.zelix.l6q;
import com.zelix.lb6;
import com.zelix.lk0;
import com.zelix.lon;
import com.zelix.lq0;
import com.zelix.lun;
import com.zelix.m44;
import com.zelix.nh;
import com.zelix.prr;
import com.zelix.rs;
import com.zelix.sz;
import com.zelix.tm;
import com.zelix.zr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lku {
    private final Set s;
    private List z;
    private final f l;
    private static Iterator G;
    private int r;
    private Set D;
    private final List v;
    private Set O;
    private int X;
    private int c;
    private Iterator a;
    private static int A;
    private final l6q d;
    private int P;
    private final List M;
    private List h;
    private Set j;
    private Set L;
    private Random Q;
    private Set T;
    private boolean t;
    private int C;
    private Set i;
    private final Iterator o;
    private static final long b;
    private static final String[] e;
    private static final String[] f;
    private static final Map g;
    private static final long[] k;
    private static final Integer[] m;
    private static final Map n;
    private static final long[] p;
    private static final Long[] q;
    private static final Map u;

    /*
     * Exception decompiling
     */
    private void T(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [29[DOLOOP]], but top level block is 12[TRYBLOCK]
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

    public int A(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return (int)lku.b("x", (int)17391, (long)(0x594B6BBD80929D40L ^ l10));
    }

    int[] W(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return (int[])m44.a("t", (Object)this, (long)5630999340135601155L, (long)l10).get(m44.a("t", (Object)this, (long)5630999340135601155L, (long)l10).size() - 1);
    }

    /*
     * Unable to fully structure code
     */
    static int g(Object[] var0) {
        block17: {
            block18: {
                block16: {
                    block15: {
                        var2_1 = (Integer)var0[0];
                        var1_2 = (lb6)var0[1];
                        var3_3 = (Long)var0[2];
                        var3_3 = lku.b ^ var3_3;
                        var6_4 = 0;
                        var5_5 = m44.a("k", (long)1255219744789531072L, (long)var3_3);
                        try {
                            v0 = m44.a("o", (long)1138979347109769250L, (long)var3_3);
                            if (var5_5 != null) {
                                if (v0 == null) break block15;
                            }
                            ** GOTO lbl18
                        }
                        catch (NumberFormatException v1) {
                            throw m44.a("k", (Object)v1, (long)1065928551777359370L, (long)var3_3);
                        }
                        try {
                            v0 = m44.a("o", (long)1138979347109769250L, (long)var3_3);
lbl18:
                            // 2 sources

                            var6_4 = Integer.parseInt((String)v0);
                        }
                        catch (NumberFormatException var7_6) {
                            // empty catch block
                        }
                    }
                    try {
                        v2 = var2_1;
                        v3 = lku.b("x", (int)17042, (long)(3118082048567104591L ^ var3_3));
                        v4 = var5_5;
                        if (var3_3 <= 0L) ** GOTO lbl48
                        if (v4 == null) break block16;
                        if (v2 <= v3) {
                        }
                        ** GOTO lbl40
                    }
                    catch (NumberFormatException v5) {
                        throw m44.a("k", (Object)v5, (long)1065928551777359370L, (long)var3_3);
                    }
                    v2 = var2_1 * lku.b("x", (int)29164, (long)(6955668989182535456L ^ var3_3));
                    if (var3_3 < 0L) ** GOTO lbl41
                    var7_7 = v2;
                    try {
                        var1_2.P(2);
                        if (var5_5 != null) break block17;
lbl40:
                        // 2 sources

                        v2 = var2_1;
lbl41:
                        // 2 sources

                        v3 = lku.b("x", (int)12103, (long)(7219499516742121917L ^ var3_3));
                    }
                    catch (NumberFormatException v6) {
                        throw m44.a("k", (Object)v6, (long)1065928551777359370L, (long)var3_3);
                    }
                }
                try {
                    v4 = var5_5;
lbl48:
                    // 2 sources

                    if (v4 == null) break block18;
                    if (v2 >= v3) {
                    }
                    ** GOTO lbl60
                }
                catch (NumberFormatException v7) {
                    throw m44.a("k", (Object)v7, (long)1065928551777359370L, (long)var3_3);
                }
                v2 = var2_1 * 3;
                if (var3_3 < 0L) ** GOTO lbl61
                var7_7 = v2;
                try {
                    var1_2.P(5);
                    if (var5_5 != null) break block17;
lbl60:
                    // 2 sources

                    v2 = var2_1;
lbl61:
                    // 2 sources

                    v3 = lku.b("x", (int)31354, (long)(6508550817651321986L ^ var3_3));
                }
                catch (NumberFormatException v8) {
                    throw m44.a("k", (Object)v8, (long)1065928551777359370L, (long)var3_3);
                }
            }
            var8_8 = (float)(v2 - v3) / 2500.0f;
            var7_7 = (int)((float)var2_1 * (6.0f - 3.0f * var8_8));
            var1_2.P(2 + m44.a("k", (float)(3.0f * var8_8), (long)724574112065306869L, (long)var3_3));
        }
        return Math.max(var7_7, Math.max((int)lku.b("x", (int)21822, (long)(3081916593133339595L ^ var3_3)), var6_4));
    }

    private static void d(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        int n11 = (Integer)objectArray[1];
        List list = (List)objectArray[2];
        long l10 = (Long)objectArray[3];
        List list2 = (List)objectArray[4];
        int n12 = (Integer)objectArray[5];
        long l11 = l10 = b ^ l10;
        long l12 = l11 ^ 0x54E243CC8B89L;
        long l13 = l11 ^ 0x279E68232FB9L;
        if (n10 < n11) {
            int n13 = n10 + (n11 - n10) / 2;
            if (++n12 < m44.a("i", (long)-8496472039448749113L, (long)l10)) {
                Object[] objectArray2 = new Object[6];
                objectArray2[5] = n12;
                objectArray2[4] = list2;
                objectArray2[3] = l13;
                objectArray2[2] = list;
                objectArray2[1] = n13;
                objectArray2[0] = n10;
                m44.a("m", (Object)objectArray2, (long)-7773610452899191585L, (long)l10);
                Object[] objectArray3 = new Object[6];
                objectArray3[5] = n12;
                objectArray3[4] = list2;
                objectArray3[3] = l13;
                objectArray3[2] = list;
                objectArray3[1] = n11;
                objectArray3[0] = n13 + 1;
                m44.a("m", (Object)objectArray3, (long)-7773610452899191585L, (long)l10);
            }
            Object[] objectArray4 = new Object[6];
            objectArray4[5] = list2;
            objectArray4[4] = list;
            objectArray4[3] = l12;
            objectArray4[2] = n11;
            objectArray4[1] = n13;
            objectArray4[0] = n10;
            m44.a("m", (Object)objectArray4, (long)-7944719708470599404L, (long)l10);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int U(Object[] var0) {
        block41: {
            block47: {
                block46: {
                    block45: {
                        block44: {
                            block43: {
                                block42: {
                                    block40: {
                                        block38: {
                                            block39: {
                                                var1_1 = (Integer)var0[0];
                                                var2_2 = (Long)var0[1];
                                                var2_2 = lku.b ^ var2_2;
                                                var4_3 = m44.a("l", (long)7959127072335525599L, (long)var2_2);
                                                try {
                                                    try {
                                                        try {
                                                            v0 /* !! */  = var1_1;
                                                            if (var4_3 == null) break block38;
                                                            if (v0 /* !! */  <= lku.b("x", (int)10233, (long)(6419058988750753314L ^ var2_2))) break block39;
                                                        }
                                                        catch (NumberFormatException v1) {
                                                            throw m44.a("l", (Object)v1, (long)8202708642686740757L, (long)var2_2);
                                                        }
                                                        v2 /* !! */  = (int)m44.a("h", (long)8032903244782611427L, (long)var2_2);
                                                        if (var2_2 < 0L || var4_3 == null) break block40;
                                                    }
                                                    catch (NumberFormatException v3) {
                                                        throw m44.a("l", (Object)v3, (long)8202708642686740757L, (long)var2_2);
                                                    }
                                                    if (v2 /* !! */  != 0) {
                                                    }
                                                    ** GOTO lbl31
                                                }
                                                catch (NumberFormatException v4) {
                                                    throw m44.a("l", (Object)v4, (long)8202708642686740757L, (long)var2_2);
                                                }
                                            }
                                            v0 /* !! */  = (int)lku.b("x", (int)23537, (long)(2875653069147714102L ^ var2_2));
                                        }
                                        var5_4 = v0 /* !! */ ;
                                        try {
                                            if (var4_3 != null) break block41;
lbl31:
                                            // 2 sources

                                            v2 /* !! */  = var1_1;
                                        }
                                        catch (NumberFormatException v5) {
                                            throw m44.a("l", (Object)v5, (long)8202708642686740757L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        v6 = lku.b("x", (int)28514, (long)(4285125229169247886L ^ var2_2));
                                        v7 = var4_3;
                                        if (var2_2 < 0L) ** GOTO lbl59
                                        if (v7 == null) break block42;
                                        if (v2 /* !! */  <= v6) {
                                        }
                                        ** GOTO lbl51
                                    }
                                    catch (NumberFormatException v8) {
                                        throw m44.a("l", (Object)v8, (long)8202708642686740757L, (long)var2_2);
                                    }
                                    v2 /* !! */  = (int)lku.b("x", (int)307, (long)(8811164000264677589L ^ var2_2));
                                    if (var2_2 <= 0L) ** GOTO lbl52
                                    var5_4 = v2 /* !! */ ;
                                    try {
                                        if (var4_3 != null) break block41;
lbl51:
                                        // 2 sources

                                        v2 /* !! */  = var1_1;
lbl52:
                                        // 2 sources

                                        v6 = lku.b("x", (int)29426, (long)(205734762453310235L ^ var2_2));
                                    }
                                    catch (NumberFormatException v9) {
                                        throw m44.a("l", (Object)v9, (long)8202708642686740757L, (long)var2_2);
                                    }
                                }
                                try {
                                    v7 = var4_3;
lbl59:
                                    // 2 sources

                                    if (var2_2 <= 0L) ** GOTO lbl79
                                    if (v7 == null) break block43;
                                    if (v2 /* !! */  <= v6) {
                                    }
                                    ** GOTO lbl71
                                }
                                catch (NumberFormatException v10) {
                                    throw m44.a("l", (Object)v10, (long)8202708642686740757L, (long)var2_2);
                                }
                                v2 /* !! */  = (int)lku.b("x", (int)20601, (long)(1350366241837103528L ^ var2_2));
                                if (var2_2 <= 0L) ** GOTO lbl72
                                var5_4 = v2 /* !! */ ;
                                try {
                                    if (var4_3 != null) break block41;
lbl71:
                                    // 2 sources

                                    v2 /* !! */  = var1_1;
lbl72:
                                    // 2 sources

                                    v6 = lku.b("x", (int)26118, (long)(6238009579293478848L ^ var2_2));
                                }
                                catch (NumberFormatException v11) {
                                    throw m44.a("l", (Object)v11, (long)8202708642686740757L, (long)var2_2);
                                }
                            }
                            try {
                                v7 = var4_3;
lbl79:
                                // 2 sources

                                if (var2_2 < 0L) ** GOTO lbl99
                                if (v7 == null) break block44;
                                if (v2 /* !! */  <= v6) {
                                }
                                ** GOTO lbl91
                            }
                            catch (NumberFormatException v12) {
                                throw m44.a("l", (Object)v12, (long)8202708642686740757L, (long)var2_2);
                            }
                            v2 /* !! */  = (int)lku.b("x", (int)2532, (long)(8575910318241898542L ^ var2_2));
                            if (var2_2 < 0L) ** GOTO lbl92
                            var5_4 = v2 /* !! */ ;
                            try {
                                if (var4_3 != null) break block41;
lbl91:
                                // 2 sources

                                v2 /* !! */  = var1_1;
lbl92:
                                // 2 sources

                                v6 = lku.b("x", (int)31709, (long)(7898567034413027842L ^ var2_2));
                            }
                            catch (NumberFormatException v13) {
                                throw m44.a("l", (Object)v13, (long)8202708642686740757L, (long)var2_2);
                            }
                        }
                        try {
                            v7 = var4_3;
lbl99:
                            // 2 sources

                            if (var2_2 <= 0L) ** GOTO lbl119
                            if (v7 == null) break block45;
                            if (v2 /* !! */  <= v6) {
                            }
                            ** GOTO lbl111
                        }
                        catch (NumberFormatException v14) {
                            throw m44.a("l", (Object)v14, (long)8202708642686740757L, (long)var2_2);
                        }
                        v2 /* !! */  = (int)lku.b("x", (int)28041, (long)(3793915182386775108L ^ var2_2));
                        if (var2_2 <= 0L) ** GOTO lbl112
                        var5_4 = v2 /* !! */ ;
                        try {
                            if (var4_3 != null) break block41;
lbl111:
                            // 2 sources

                            v2 /* !! */  = var1_1;
lbl112:
                            // 2 sources

                            v6 = lku.b("x", (int)10806, (long)(879757878630826980L ^ var2_2));
                        }
                        catch (NumberFormatException v15) {
                            throw m44.a("l", (Object)v15, (long)8202708642686740757L, (long)var2_2);
                        }
                    }
                    try {
                        v7 = var4_3;
lbl119:
                        // 2 sources

                        if (v7 == null) break block46;
                        if (v2 /* !! */  <= v6) {
                        }
                        ** GOTO lbl129
                    }
                    catch (NumberFormatException v16) {
                        throw m44.a("l", (Object)v16, (long)8202708642686740757L, (long)var2_2);
                    }
                    var5_4 = 4;
                    try {
                        try {
                            if (var2_2 >= 0L && var4_3 != null) break block41;
lbl129:
                            // 2 sources

                            v2 /* !! */  = var1_1;
                            if (var4_3 == null) break block47;
                        }
                        catch (NumberFormatException v17) {
                            throw m44.a("l", (Object)v17, (long)8202708642686740757L, (long)var2_2);
                        }
                        v6 = lku.b("x", (int)12427, (long)(2033980323960314176L ^ var2_2));
                    }
                    catch (NumberFormatException v18) {
                        throw m44.a("l", (Object)v18, (long)8202708642686740757L, (long)var2_2);
                    }
                }
                if (v2 /* !! */  > v6) ** GOTO lbl145
                v2 /* !! */  = 2;
                if (var2_2 <= 0L) break block47;
                var5_4 = v2 /* !! */ ;
                try {
                    if (var4_3 != null) break block41;
lbl145:
                    // 2 sources

                    v2 /* !! */  = 1;
                }
                catch (NumberFormatException v19) {
                    throw m44.a("l", (Object)v19, (long)8202708642686740757L, (long)var2_2);
                }
            }
            var5_4 = v2 /* !! */ ;
        }
        return var5_4;
    }

    /*
     * Exception decompiling
     */
    private void p(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [21[DOLOOP], 22[DOLOOP]], but top level block is 2[TRYBLOCK]
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

    private void t(Object[] objectArray) {
        List<gc> list;
        CallSite callSite;
        long l10;
        Set set;
        Set set2;
        long l11;
        List list2;
        List list3;
        Set set3;
        Set set4;
        block15: {
            Object object;
            CallSite callSite2;
            ArrayList<lq0> arrayList;
            ArrayList<lq0> arrayList2;
            long l12;
            long l13;
            long l14;
            long l15;
            long l16;
            long l17;
            long l18;
            long l19;
            long l20;
            long l21;
            long l22;
            long l23;
            block14: {
                int n10;
                ArrayList<lq0> arrayList3;
                int n11;
                int n12;
                long l24;
                long l25;
                long l26;
                int n13;
                long l27;
                _o _o2;
                block12: {
                    block13: {
                        _o2 = (_o)objectArray[0];
                        set4 = (Set)objectArray[1];
                        set3 = (Set)objectArray[2];
                        list3 = (List)objectArray[3];
                        list2 = (List)objectArray[4];
                        l11 = (Long)objectArray[5];
                        set2 = (Set)objectArray[6];
                        set = (Set)objectArray[7];
                        long l28 = l11 = b ^ l11;
                        l23 = l28 ^ 0x61CDE05F0CD1L;
                        l27 = l28 ^ 0x70EE667B01B7L;
                        l22 = l28 ^ 0x3639775C5760L;
                        l21 = l28 ^ 0x1CD3602CF9E2L;
                        long l29 = l28 ^ 0x54597B898581L;
                        l20 = l28 ^ 0x40598FC4213EL;
                        l19 = l28 ^ 0x1E8A0C2C1E44L;
                        l10 = l28 ^ 0x279E68232FB9L;
                        long l30 = l28 ^ 0xFE221027DE1L;
                        n13 = (int)(l30 >>> 32);
                        l26 = l30 << 32 >>> 32;
                        l18 = l28 ^ 0x6F310394151EL;
                        l17 = l28 ^ 0x2D86DD309115L;
                        l16 = l28 ^ 0x75BCE7431762L;
                        l15 = l28 ^ 0x1640EF16D75BL;
                        l25 = l28 ^ 0xDB916E5409BL;
                        l14 = l28 ^ 0x77AFD7FFC321L;
                        l13 = l28 ^ 0x6FF8B51F7A15L;
                        l24 = l28 ^ 0x61274DEA0140L;
                        l12 = l28 ^ 0x7291CD7E503FL;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l29;
                        arrayList2 = m44.a("t", (Object)_o2, (Object)objectArray2, (long)-1641210904015828448L, (long)l11);
                        n12 = arrayList2.size();
                        callSite = m44.a("k", (long)-775971754157773424L, (long)l11);
                        try {
                            n11 = n12;
                            if (callSite == null) break block12;
                            if (n11 != 0) break block13;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw m44.a("k", (Object)numberFormatException, (long)-1541728440662740390L, (long)l11);
                        }
                        return;
                    }
                    n11 = n12;
                }
                if (n11 > 1) {
                    arrayList2 = new ArrayList(arrayList2);
                    Object[] objectArray3 = new Object[3];
                    objectArray3[2] = l27;
                    objectArray3[1] = m44.a("u", (Object)this, (long)-730666253963102284L, (long)l11);
                    objectArray3[0] = arrayList2;
                    m44.a("k", (Object)objectArray3, (long)-949444150587140431L, (long)l11);
                }
                _o _o3 = _o2;
                Object[] objectArray4 = new Object[1];
                objectArray4[0] = l17;
                CallSite callSite3 = m44.a("t", (Object)_o3, (Object)objectArray4, (long)-1554524465367313958L, (long)l11);
                arrayList = new ArrayList<lq0>(n12 + 1);
                arrayList.add(new lq0(_o3, n13, l26, callSite3));
                int n14 = 0;
                block4: while (n14 < n12) {
                    arrayList3 = arrayList2;
                    n10 = n14;
                    do {
                        _o _o4 = (_o)arrayList3.get(n10);
                        Object[] objectArray5 = new Object[1];
                        objectArray5[0] = l24;
                        CallSite callSite4 = m44.a("t", (Object)_o4, (Object)objectArray5, (long)-1439658120182549613L, (long)l11);
                        Object[] objectArray6 = new Object[2];
                        objectArray6[1] = l25;
                        objectArray6[0] = callSite4;
                        m44.a("t", (Object)callSite3, (Object)objectArray6, (long)-808892461798501110L, (long)l11);
                        Object[] objectArray7 = new Object[1];
                        objectArray7[0] = l15;
                        Object[] objectArray8 = new Object[2];
                        objectArray8[1] = l12;
                        objectArray8[0] = (int)m44.a("t", (Object)callSite3, (Object)objectArray7, (long)-1267549013657422936L, (long)l11);
                        CallSite callSite5 = m44.a("j", (Object)this, (Object)objectArray8, (long)-908976944182897327L, (long)l11);
                        Object[] objectArray9 = new Object[1];
                        objectArray9[0] = l15;
                        Object[] objectArray10 = new Object[2];
                        objectArray10[1] = l12;
                        objectArray10[0] = (int)m44.a("t", (Object)callSite4, (Object)objectArray9, (long)-1267549013657422936L, (long)l11);
                        callSite2 = m44.a("j", (Object)this, (Object)objectArray10, (long)-908976944182897327L, (long)l11);
                        list3.add(new gc((long)callSite5, (long)callSite2, l19));
                        arrayList.add(new lq0(_o4, n13, l26, callSite4));
                        _o3 = _o4;
                        if (l11 >= 0L) {
                            object = callSite4;
                            if (callSite == null) break block14;
                            callSite3 = object;
                            ++n14;
                        }
                        if (callSite != null) continue block4;
                        arrayList3 = arrayList;
                        n10 = 0;
                    } while (l11 <= 0L);
                }
                object = arrayList3.get(n10);
            }
            lq0 lq02 = (lq0)object;
            Object[] objectArray11 = new Object[1];
            objectArray11[0] = l22;
            CallSite callSite6 = m44.a("t", (Object)((_o)lq02.S()), (Object)objectArray11, (long)-640095954075296599L, (long)l11);
            f5 f52 = (f5)lq02.D();
            rs rs2 = new rs(l21);
            Object[] objectArray12 = new Object[7];
            objectArray12[6] = m44.a("u", (Object)this, (long)-730666253963102284L, (long)l11);
            objectArray12[5] = null;
            objectArray12[4] = rs2;
            objectArray12[3] = m44.a("t", (Object)f52, (Object)new Object[0], (long)-1478187098978224055L, (long)l11);
            objectArray12[2] = l23;
            objectArray12[1] = f52.M();
            objectArray12[0] = (long)callSite6;
            callSite2 = m44.a("k", (Object)objectArray12, (long)-1445475759593170340L, (long)l11);
            Object[] objectArray13 = new Object[2];
            objectArray13[1] = l18;
            objectArray13[0] = (long)callSite2;
            m44.a("t", (Object)f52, (Object)objectArray13, (long)-1265710404170338617L, (long)l11);
            set.add(f52);
            Object[] objectArray14 = new Object[1];
            objectArray14[0] = l15;
            Object[] objectArray15 = new Object[2];
            objectArray15[1] = l12;
            objectArray15[0] = (int)m44.a("t", (Object)f52, (Object)objectArray14, (long)-1267549013657422936L, (long)l11);
            CallSite callSite7 = m44.a("j", (Object)this, (Object)objectArray15, (long)-908976944182897327L, (long)l11);
            list2.add(new gc((long)callSite7, (long)callSite2, l19));
            int n15 = arrayList.size();
            int n16 = 1;
            while (n16 < n15) {
                CallSite callSite3;
                block16: {
                    block17: {
                        block18: {
                            lq0 object2 = (lq0)arrayList.get(n16);
                            _o _o2 = (_o)object2.S();
                            f5 f53 = (f5)object2.D();
                            Object[] objectArray16 = new Object[7];
                            objectArray16[6] = m44.a("u", (Object)this, (long)-730666253963102284L, (long)l11);
                            objectArray16[5] = set2;
                            objectArray16[4] = rs2;
                            objectArray16[3] = m44.a("t", (Object)f53, (Object)new Object[0], (long)-1478187098978224055L, (long)l11);
                            objectArray16[2] = l23;
                            objectArray16[1] = f53.M();
                            objectArray16[0] = (long)callSite6;
                            CallSite callSite4 = m44.a("k", (Object)objectArray16, (long)-1445475759593170340L, (long)l11);
                            Object[] objectArray17 = new Object[2];
                            objectArray17[1] = l18;
                            objectArray17[0] = (long)callSite4;
                            m44.a("t", (Object)f53, (Object)objectArray17, (long)-1265710404170338617L, (long)l11);
                            set.add(f53);
                            Object[] objectArray18 = new Object[1];
                            objectArray18[0] = l15;
                            Object[] objectArray19 = new Object[2];
                            objectArray19[1] = l12;
                            objectArray19[0] = (int)m44.a("t", (Object)f53, (Object)objectArray18, (long)-1267549013657422936L, (long)l11);
                            CallSite callSite5 = m44.a("j", (Object)this, (Object)objectArray19, (long)-908976944182897327L, (long)l11);
                            Object[] objectArray20 = new Object[1];
                            objectArray20[0] = l16;
                            Object[] objectArray21 = new Object[1];
                            objectArray21[0] = (long)m44.a("t", (Object)rs2, (Object)objectArray20, (long)-1635679189607396934L, (long)l11);
                            m44.a("t", (Object)f53, (Object)objectArray21, (long)-1006668129295934033L, (long)l11);
                            if (l11 >= 0L) {
                                list = list2;
                                if (callSite == null) break block15;
                                list.add(new gc((long)callSite5, (long)callSite4, l19));
                            }
                            Object[] objectArray22 = new Object[2];
                            objectArray22[1] = f53;
                            objectArray22[0] = l14;
                            CallSite callSite8 = m44.a("j", (Object)this, (Object)objectArray22, (long)-611327918500582986L, (long)l11);
                            try {
                                Object[] objectArray23 = new Object[2];
                                objectArray23[1] = l20;
                                objectArray23[0] = (long)callSite8;
                                m44.a("t", (Object)_o2, (Object)objectArray23, (long)-881479207187406791L, (long)l11);
                                callSite3 = callSite;
                                if (l11 < 0L) break block16;
                                if (callSite3 == null) break block17;
                                Object[] objectArray24 = new Object[1];
                                objectArray24[0] = l13;
                                if (m44.a("t", (Object)_o2, (Object)objectArray24, (long)-772007474045154458L, (long)l11) != false) break block18;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw m44.a("k", (Object)numberFormatException, (long)-1541728440662740390L, (long)l11);
                            }
                            Object[] objectArray25 = new Object[1];
                            objectArray25[0] = l17;
                            CallSite callSite9 = m44.a("t", (Object)_o2, (Object)objectArray25, (long)-1554524465367313958L, (long)l11);
                            Object[] objectArray26 = new Object[1];
                            objectArray26[0] = l22;
                            CallSite callSite10 = m44.a("t", (Object)_o2, (Object)objectArray26, (long)-640095954075296599L, (long)l11);
                            Object[] objectArray27 = new Object[2];
                            objectArray27[1] = l18;
                            objectArray27[0] = (long)callSite10;
                            m44.a("t", (Object)callSite9, (Object)objectArray27, (long)-1265710404170338617L, (long)l11);
                            set.add(callSite9);
                            Object[] objectArray28 = new Object[1];
                            objectArray28[0] = l15;
                            Object[] objectArray29 = new Object[2];
                            objectArray29[1] = l12;
                            objectArray29[0] = (int)m44.a("t", (Object)callSite9, (Object)objectArray28, (long)-1267549013657422936L, (long)l11);
                            CallSite callSite11 = m44.a("j", (Object)this, (Object)objectArray29, (long)-908976944182897327L, (long)l11);
                            list2.add(new gc((long)callSite11, (long)callSite10, l19));
                        }
                        ++n16;
                    }
                    callSite3 = callSite;
                }
                if (callSite3 != null) continue;
            }
            list = arrayList2;
        }
        for (_o _o3 : list) {
            Object[] objectArray30 = new Object[8];
            objectArray30[7] = set;
            objectArray30[6] = set2;
            objectArray30[5] = l10;
            objectArray30[4] = list2;
            objectArray30[3] = list3;
            objectArray30[2] = set3;
            objectArray30[1] = set4;
            objectArray30[0] = _o3;
            m44.a("j", (Object)this, (Object)objectArray30, (long)-1649492060312657759L, (long)l11);
            if (callSite != null) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean c(Object[] var1_1) {
        block51: {
            var3_2 = (int[])var1_1[0];
            var6_3 = (List)var1_1[1];
            var4_4 = (Long)var1_1[2];
            var2_5 = (Set)var1_1[3];
            v0 = var4_4 = lku.b ^ var4_4;
            var7_6 = v0 ^ 30067595732566L;
            v1 = v0 ^ 85953175508810L;
            var9_7 = (int)(v1 >>> 32);
            var10_8 = v1 << 32 >>> 32;
            v2 = v0 ^ 90737563387436L;
            var12_9 = (int)(v2 >>> 32);
            var13_10 = (int)(v2 << 32 >>> 48);
            var14_11 = (int)(v2 << 48 >>> 48);
            var15_12 = v0 ^ 21571574260837L;
            v3 = v0 ^ 63385156933833L;
            var17_13 = (int)(v3 >>> 32);
            var18_14 = (int)(v3 << 32 >>> 48);
            var19_15 = (int)(v3 << 48 >>> 48);
            var21_16 = 1;
            v4 = new Object[2];
            v4[1] = var7_6;
            v4[0] = cf.x(var6_3.size(), var12_9, (char)var13_10, (short)var14_11);
            var22_17 = m44.a("n", (Object)v4, (long)3050346567992229149L, (long)var4_4);
            var23_18 = var6_3.iterator();
            var20_19 = m44.a("n", (long)3183510570575508613L, (long)var4_4);
            while (var23_18.hasNext()) {
                block66: {
                    block67: {
                        block65: {
                            block63: {
                                block64: {
                                    block61: {
                                        block62: {
                                            block59: {
                                                block60: {
                                                    block57: {
                                                        block58: {
                                                            block52: {
                                                                block53: {
                                                                    block56: {
                                                                        block55: {
                                                                            block54: {
                                                                                var24_20 = (f5)var23_18.next();
                                                                                v5 = new Object[1];
                                                                                v5[0] = var15_12;
                                                                                var25_21 = m44.a("q", (Object)var24_20, (Object)v5, (long)3448889249773399321L, (long)var4_4);
                                                                                var27_22 = var24_20.M();
                                                                                var29_23 = nh.x(var27_22, var17_13, (short)var18_14, (int)lku.b("x", (int)12759, (long)(2968109808463288923L ^ var4_4)), (int)lku.b("x", (int)25281, (long)(8653259058960058715L ^ var4_4)), var3_2, var19_15);
                                                                                var31_24 = nh.W(var27_22, var9_7, var10_8, (int)lku.b("x", (int)12912, (long)(7513503193086466537L ^ var4_4)), var3_2);
                                                                                var33_25 = m44.a("p", (Object)this, (long)3379687976015789865L, (long)var4_4).contains(var24_20);
                                                                                var34_26 = m44.a("p", (Object)this, (long)3985681026492629341L, (long)var4_4).contains(var24_20);
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    v6 = var34_26;
                                                                                                    v7 = var20_19;
                                                                                                    if (var4_4 > 0L) {
                                                                                                        if (v7 == null) break block51;
                                                                                                        v7 = var20_19;
                                                                                                    }
                                                                                                    if (var4_4 >= 0L) {
                                                                                                        if (v7 == null) break block52;
                                                                                                    }
                                                                                                    ** GOTO lbl99
                                                                                                }
                                                                                                catch (NumberFormatException v8) {
                                                                                                    throw m44.a("n", (Object)v8, (long)3715335642058910543L, (long)var4_4);
                                                                                                }
                                                                                                if (v6 == 0) break block53;
                                                                                            }
                                                                                            catch (NumberFormatException v9) {
                                                                                                throw m44.a("n", (Object)v9, (long)3715335642058910543L, (long)var4_4);
                                                                                            }
                                                                                            v10 = var21_16;
                                                                                            v11 = var20_19;
                                                                                            if (var4_4 > 0L) {
                                                                                                if (v11 == null) break block54;
                                                                                            }
                                                                                            ** GOTO lbl82
                                                                                        }
                                                                                        catch (NumberFormatException v12) {
                                                                                            throw m44.a("n", (Object)v12, (long)3715335642058910543L, (long)var4_4);
                                                                                        }
                                                                                        if (v10 == 0) break block55;
                                                                                    }
                                                                                    catch (NumberFormatException v13) {
                                                                                        throw m44.a("n", (Object)v13, (long)3715335642058910543L, (long)var4_4);
                                                                                    }
                                                                                    v10 = var22_17.add(var31_24);
                                                                                }
                                                                                catch (NumberFormatException v14) {
                                                                                    throw m44.a("n", (Object)v14, (long)3715335642058910543L, (long)var4_4);
                                                                                }
                                                                            }
                                                                            try {
                                                                                v11 = var20_19;
lbl82:
                                                                                // 2 sources

                                                                                if (v11 == null) break block56;
                                                                                if (v10 == 0) break block55;
                                                                            }
                                                                            catch (NumberFormatException v15) {
                                                                                throw m44.a("n", (Object)v15, (long)3715335642058910543L, (long)var4_4);
                                                                            }
                                                                            v10 = 1;
                                                                            break block56;
                                                                        }
                                                                        v10 = 0;
                                                                    }
                                                                    var21_16 = v10;
                                                                }
                                                                v16 = var21_16;
                                                            }
                                                            try {
                                                                try {
                                                                    v7 = var20_19;
lbl99:
                                                                    // 2 sources

                                                                    if (var4_4 > 0L) {
                                                                        if (v7 == null) break block57;
                                                                        if (v16 != 0) break block58;
                                                                    }
                                                                    ** GOTO lbl115
                                                                }
                                                                catch (NumberFormatException v17) {
                                                                    throw m44.a("n", (Object)v17, (long)3715335642058910543L, (long)var4_4);
                                                                }
                                                                return false;
                                                            }
                                                            catch (NumberFormatException v18) {
                                                                throw m44.a("n", (Object)v18, (long)3715335642058910543L, (long)var4_4);
                                                            }
                                                        }
                                                        v16 = var29_23 == var25_21 ? 0 : (var29_23 < var25_21 ? -1 : 1);
                                                    }
                                                    try {
                                                        try {
                                                            v7 = var20_19;
lbl115:
                                                            // 2 sources

                                                            if (var4_4 >= 0L) {
                                                                if (v7 == null) break block59;
                                                                if (v16 != 0) break block60;
                                                            }
                                                            ** GOTO lbl133
                                                        }
                                                        catch (NumberFormatException v19) {
                                                            throw m44.a("n", (Object)v19, (long)3715335642058910543L, (long)var4_4);
                                                        }
                                                        return false;
                                                    }
                                                    catch (NumberFormatException v20) {
                                                        throw m44.a("n", (Object)v20, (long)3715335642058910543L, (long)var4_4);
                                                    }
                                                }
                                                v16 = var33_25;
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v7 = var20_19;
lbl133:
                                                            // 2 sources

                                                            if (v7 == null) break block61;
                                                            if (v16 == 0) break block62;
                                                        }
                                                        catch (NumberFormatException v21) {
                                                            throw m44.a("n", (Object)v21, (long)3715335642058910543L, (long)var4_4);
                                                        }
                                                        cfr_temp_0 = var29_23 - 0L;
                                                        v16 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                        v22 = var20_19;
                                                        if (var4_4 > 0L) {
                                                            if (v22 == null) break block61;
                                                        }
                                                        ** GOTO lbl162
                                                    }
                                                    catch (NumberFormatException v23) {
                                                        throw m44.a("n", (Object)v23, (long)3715335642058910543L, (long)var4_4);
                                                    }
                                                    if (v16 != 0) break block62;
                                                }
                                                catch (NumberFormatException v24) {
                                                    throw m44.a("n", (Object)v24, (long)3715335642058910543L, (long)var4_4);
                                                }
                                                return false;
                                            }
                                            catch (NumberFormatException v25) {
                                                throw m44.a("n", (Object)v25, (long)3715335642058910543L, (long)var4_4);
                                            }
                                        }
                                        v16 = var33_25;
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v22 = var20_19;
lbl162:
                                                    // 2 sources

                                                    if (v22 == null) break block63;
                                                    if (v16 == 0) break block64;
                                                }
                                                catch (NumberFormatException v26) {
                                                    throw m44.a("n", (Object)v26, (long)3715335642058910543L, (long)var4_4);
                                                }
                                                cfr_temp_1 = var29_23 - lku.c("c", (int)16863, (long)(6081293615148705384L ^ var4_4));
                                                v16 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                                v27 = var20_19;
                                                if (var4_4 >= 0L) {
                                                    if (v27 == null) break block63;
                                                }
                                                ** GOTO lbl189
                                            }
                                            catch (NumberFormatException v28) {
                                                throw m44.a("n", (Object)v28, (long)3715335642058910543L, (long)var4_4);
                                            }
                                            if (v16 <= 0) break block64;
                                        }
                                        catch (NumberFormatException v29) {
                                            throw m44.a("n", (Object)v29, (long)3715335642058910543L, (long)var4_4);
                                        }
                                        return false;
                                    }
                                    catch (NumberFormatException v30) {
                                        throw m44.a("n", (Object)v30, (long)3715335642058910543L, (long)var4_4);
                                    }
                                }
                                v16 = var34_26;
                            }
                            try {
                                try {
                                    v27 = var20_19;
lbl189:
                                    // 2 sources

                                    if (var4_4 > 0L) {
                                        if (v27 == null) break block65;
                                        if (v16 == 0) break block66;
                                    }
                                    ** GOTO lbl203
                                }
                                catch (NumberFormatException v31) {
                                    throw m44.a("n", (Object)v31, (long)3715335642058910543L, (long)var4_4);
                                }
                                v16 = var2_5.contains(var31_24);
                            }
                            catch (NumberFormatException v32) {
                                throw m44.a("n", (Object)v32, (long)3715335642058910543L, (long)var4_4);
                            }
                        }
                        try {
                            v27 = var20_19;
lbl203:
                            // 2 sources

                            if (v27 == null) break block67;
                            if (v16 == 0) break block66;
                        }
                        catch (NumberFormatException v33) {
                            throw m44.a("n", (Object)v33, (long)3715335642058910543L, (long)var4_4);
                        }
                        v16 = 0;
                    }
                    return (boolean)v16;
                }
                if (var20_19 != null) continue;
            }
            v6 = 1;
        }
        return (boolean)v6;
    }

    /*
     * WARNING - void declaration
     */
    private void h(Object[] objectArray) {
        long l10;
        Object object;
        long l11;
        block16: {
            block13: {
                Object object2;
                block15: {
                    void l16;
                    l11 = (Long)objectArray[0];
                    int n10 = (Integer)objectArray[1];
                    int n11 = (Integer)objectArray[2];
                    long l12 = l11 = b ^ l11;
                    long l13 = l12 ^ 0x3BB331FD086EL;
                    long l14 = l12 ^ 0x482F9961D4C6L;
                    long l15 = l12 ^ 0x587DAE9DABD9L;
                    lb6 lb62 = new lb6();
                    Object[] objectArray2 = new Object[3];
                    objectArray2[2] = l14;
                    objectArray2[1] = lb62;
                    objectArray2[0] = n11;
                    m44.a("p", (Object)this, (int)m44.a("l", (Object)objectArray2, (long)-1379449237083486592L, (long)l11), (long)-720939335791855123L, (long)l11);
                    int n12 = lb62.U(l13);
                    CallSite callSite = m44.a("l", (long)-1579637548186176833L, (long)l11);
                    m44.a("p", (Object)this, (int)(m44.a("r", (Object)this, (long)-720939335791855123L, (long)l11) / n12), (long)-813412358227778127L, (long)l11);
                    m44.a("p", (Object)this, (int)(m44.a("r", (Object)this, (long)-720939335791855123L, (long)l11) / 2), (long)-845698955838641440L, (long)l11);
                    CallSite callSite2 = lku.b("x", (int)12759, (long)(0x2930C1DEF06A5C61L ^ l11));
                    while (l16 < lku.b("x", (int)10913, (long)(0x14ED1541FB7B4704L ^ l11))) {
                        CallSite callSite3;
                        block11: {
                            block12: {
                                int n13 = 2 << l16;
                                try {
                                    block14: {
                                        try {
                                            try {
                                                try {
                                                    callSite3 = callSite;
                                                    if (l11 <= 0L) break block11;
                                                    if (callSite3 == null) break block12;
                                                    object = n13;
                                                    if (callSite == null) break block13;
                                                }
                                                catch (NumberFormatException numberFormatException) {
                                                    throw m44.a("l", (Object)numberFormatException, (long)-741510713748476555L, (long)l11);
                                                }
                                                if (object <= m44.a("r", (Object)this, (long)-720939335791855123L, (long)l11)) break block14;
                                            }
                                            catch (NumberFormatException numberFormatException) {
                                                throw m44.a("l", (Object)numberFormatException, (long)-741510713748476555L, (long)l11);
                                            }
                                            m44.a("p", (Object)this, (int)(lku.b("x", (int)32323, (long)(0xF5CEA5B5EB413CEL ^ l11)) - l16), (long)-884064254070244243L, (long)l11);
                                            object2 = callSite;
                                            if (l11 < 0L) break block15;
                                            if (object2 != null) break;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw m44.a("l", (Object)numberFormatException, (long)-741510713748476555L, (long)l11);
                                        }
                                    }
                                    ++l16;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw m44.a("l", (Object)numberFormatException, (long)-741510713748476555L, (long)l11);
                                }
                            }
                            callSite3 = callSite;
                        }
                        if (callSite3 != null) continue;
                    }
                    object = m44.a("r", (Object)this, (long)-720939335791855123L, (long)l11);
                    l10 = l15;
                    if (l11 < 0L) break block16;
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l10;
                    object2 = objectArray3;
                    objectArray3[0] = (int)object;
                }
                object = m44.a("l", (Object)object2, (long)-1379394441307476214L, (long)l11);
            }
            l10 = -1607978889336637314L;
        }
        m44.a("o", (int)object, (long)l10, (long)l11);
        long l13 = (1L << m44.a("r", (Object)this, (long)-884064254070244243L, (long)l11)) - 1L;
        m44.a("o", (Iterator)((Object)m44.a("s", (Object)m44.a("s", (Object)m44.a("r", (Object)this, (long)-1516843222668154725L, (long)l11), (long)0L, (long)(l13 + 1L), (long)-778772849148978873L, (long)l11), (long)-1441057638611563648L, (long)l11)), (long)-1233247277174018502L, (long)l11);
        m44.a("p", (Object)this, (Iterator)((Object)m44.a("s", (Object)m44.a("s", (Object)m44.a("r", (Object)this, (long)-1516843222668154725L, (long)l11), (long)0L, (long)lku.c("c", (int)13173, (long)(0x4B5497BBFDC992F9L ^ l11)), (long)-778772849148978873L, (long)l11), (long)-1441057638611563648L, (long)l11)), (long)-1682995940412858257L, (long)l11);
        m44.a("p", (Object)this, (int)(m44.a("r", (Object)this, (long)-813412358227778127L, (long)l11) / 5), (long)-1451084553592818123L, (long)l11);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static long B(Object[] var0) {
        block10: {
            block9: {
                var3_1 = (Long)var0[0];
                var5_2 = (Long)var0[1];
                var7_3 = (Long)var0[2];
                var10_4 = (int[])var0[3];
                var1_5 = (rs)var0[4];
                var9_6 = (Set)var0[5];
                var2_7 = (Random)var0[6];
                v0 = var7_3 = lku.b ^ var7_3;
                var11_8 = v0 ^ 56093294555688L;
                var13_9 = v0 ^ 25645916150315L;
                v1 = v0 ^ 64832269147613L;
                var15_10 = (int)(v1 >>> 32);
                var16_11 = (int)(v1 << 32 >>> 40);
                var17_12 = (int)(v1 << 56 >>> 56);
                v2 = new Object[3];
                v2[2] = var11_8;
                v2[1] = var10_4;
                v2[0] = var5_2;
                var19_13 = m44.a("k", (Object)v2, (long)-3831889484754321256L, (long)var7_3);
                var21_14 = var19_13 & lku.c("c", (int)16924, (long)(1882239670240632785L ^ var7_3));
                var23_15 = nh.N(var3_1, var15_10, var10_4, var16_11, (byte)var17_12);
                var18_16 = m44.a("k", (long)-3002925003658473736L, (long)var7_3);
                var25_17 = var23_15 & lku.c("c", (int)6294, (long)(2265582922478912856L ^ var7_3));
                var27_18 = var23_15 >>> lku.b("x", (int)12759, (long)(2968072560158728230L ^ var7_3)) & lku.c("c", (int)17939, (long)(4840294518180305882L ^ var7_3));
                var29_19 = var23_15 & lku.c("c", (int)28868, (long)(6629642184717233419L ^ var7_3));
                var39_20 = m44.a("t", (Object)var2_7, (long)0L, (long)lku.c("c", (int)182, (long)(4909362762448346490L ^ var7_3)), (long)-3929872664122645248L, (long)var7_3);
                var40_21 = m44.a("t", (Object)var39_20, (long)-3438742217797929017L, (long)var7_3);
                block2: while (true) {
                    var41_26 = (Long)var40_21.next();
                    var31_22 = var41_26 << lku.b("x", (int)12759, (long)(2968072560158728230L ^ var7_3));
                    var37_25 = var31_22 | var29_19;
                    var43_27 = var37_25 & lku.c("c", (int)6294, (long)(2265582922478912856L ^ var7_3));
                    var35_24 = var21_14 ^ (var25_17 ^ var43_27);
                    var33_23 = var41_26 & lku.c("c", (int)17939, (long)(4840294518180305882L ^ var7_3)) ^ var27_18;
                    if (var33_23 == 0L) continue;
                    v3 = var9_6;
                    while (var18_16 != null) {
                        block8: {
                            try {
                                if (v3 == null) break block8;
                                if (!var9_6.contains((long)var35_24)) ** break;
                                continue block2;
                                if (var7_3 <= 0L) break block9;
                            }
                            catch (NumberFormatException v4) {
                                throw m44.a("k", (Object)v4, (long)-3894795136997912270L, (long)var7_3);
                            }
                        }
                        var41_26 = nh.N(var37_25, var15_10, var10_4, var16_11, (byte)var17_12);
                        if (var7_3 >= 0L) {
                            v5 = var5_2 ^ (var3_1 ^ var41_26);
                            if (var18_16 == null) break block10;
                            var43_27 = v5;
                            v6 = new Object[2];
                            v6[1] = var13_9;
                            v6[0] = var43_27;
                            m44.a("t", (Object)var1_5, (Object)v6, (long)-4000862041779495615L, (long)var7_3);
                        }
                        v3 = var9_6;
lbl64:
                        // 2 sources

                        ** while (var18_16 != null)
lbl65:
                        // 1 sources

                    }
                    break;
                }
lbl66:
                // 2 sources

                if (var7_3 <= 0L) ** GOTO lbl64
                if (v3 != null) {
                    var45_28 = var9_6.remove((long)var21_14);
                    var46_29 = var9_6.add((long)var35_24);
                }
            }
            v5 = var41_26;
        }
        return v5;
    }

    private long D(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        f5 f52 = (f5)objectArray[1];
        long l11 = l10 = b ^ l10;
        long l12 = l11 ^ 0x499BEDB96630L;
        long l13 = l11 ^ 0x3D38B8F28BDAL;
        long l14 = l11 ^ 0x6B9D05B351E8L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        CallSite callSite = m44.a("t", (Object)this, (Object)objectArray2, (long)1857437448603930790L, (long)l10);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l14;
        CallSite callSite2 = m44.a("t", (Object)f52, (Object)objectArray3, (long)1896457981149452436L, (long)l10);
        int n10 = f52.hashCode();
        int n11 = ((Random)((Object)m44.a("u", (Object)this, (long)1820710821411756844L, (long)l10))).nextInt((int)lku.b("x", (int)4470, (long)(0x1E5EF04347920F7DL ^ l10)));
        Object[] objectArray4 = new Object[5];
        objectArray4[4] = callSite;
        objectArray4[3] = n10;
        objectArray4[2] = l13;
        objectArray4[1] = (long)callSite2;
        objectArray4[0] = n11;
        CallSite callSite3 = m44.a("k", (Object)objectArray4, (long)214174504544900476L, (long)l10);
        return (long)callSite3;
    }

    lku(List list, List list2, long l10, List list3, List list4, sz sz2, List list5, List list6, List list7, List list8, sz sz3, Iterator iterator, Random random, boolean bl2) {
        long l11 = l10 = b ^ l10;
        long l12 = l11 ^ 0x2D0D8E3D93F5L;
        long l13 = l11 ^ 0x70EE2C874212L;
        long l14 = l11 ^ 0x5108ACD379D4L;
        int n10 = (int)(l14 >>> 32);
        int n11 = (int)(l14 << 32 >>> 48);
        int n12 = (int)(l14 << 48 >>> 48);
        long l15 = l11 ^ 0x1008587972FFL;
        int n13 = (int)(l15 >>> 32);
        int n14 = (int)(l15 << 32 >>> 32);
        long l16 = l11 ^ 0x4DC55E5F816DL;
        long l17 = l11 ^ 0x47FE12B973FDL;
        long l18 = l11 ^ 0x3DEB6B6F567BL;
        long l19 = l11 ^ 0x45CA1DC9505EL;
        long l20 = l11 ^ 0x28F91C906138L;
        long l21 = l11 ^ 0x1D7A26BDC444L;
        long l22 = l11 ^ 0x3216BEE7EC45L;
        long l23 = l11 ^ 0x33F0DEF41BFDL;
        long l24 = l11 ^ 0x62A0BF20D1FEL;
        long l25 = l11 ^ 0x40D73D31D67FL;
        long l26 = l11 ^ 0x6664E9B1CD44L;
        this.M = new ArrayList();
        this.v = new ArrayList();
        m44.a("r", (Object)this, (boolean)false, (long)-8471698679503175668L, (long)l10);
        m44.a("r", (Object)this, (Random)random, (long)-7840470816886386343L, (long)l10);
        this.o = iterator;
        tm tm2 = new tm(this);
        m44.a("n", (Object)list, (Object)tm2, (long)-7727125814620970712L, (long)l10);
        m44.a("n", (Object)list2, (Object)tm2, (long)-7727125814620970712L, (long)l10);
        Object[] objectArray = new Object[3];
        objectArray[2] = list2.size();
        objectArray[1] = list.size();
        objectArray[0] = l18;
        m44.a("o", (Object)this, (Object)objectArray, (long)-8189232099186449880L, (long)l10);
        this.d = new l6q(true, l12, (int)(m44.a("p", (Object)this, (long)-8250203972659457246L, (long)l10) / lku.b("x", (int)19092, (long)(0x75107F80CDACDEEEL ^ l10))));
        this.s = new LinkedHashSet(cf.x((int)(m44.a("p", (Object)this, (long)-8250203972659457246L, (long)l10) / lku.b("x", (int)19092, (long)(0x75107F80CDACDEEEL ^ l10))), n10, (char)n11, (short)n12));
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = bl2;
        objectArray2[2] = l23;
        objectArray2[1] = list2.size();
        objectArray2[0] = list3;
        m44.a("o", (Object)this, (Object)objectArray2, (long)-7906524775423948339L, (long)l10);
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = this;
        objectArray3[3] = l17;
        objectArray3[2] = list4;
        objectArray3[1] = (int)m44.a("p", (Object)this, (long)-8250203972659457246L, (long)l10);
        objectArray3[0] = m44.a("p", (Object)this, (long)-7840470816886386343L, (long)l10);
        this.l = m44.a("n", (Object)objectArray3, (long)-7669318290823177660L, (long)l10);
        CallSite callSite = m44.a("n", (long)-7794013028572066947L, (long)l10);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = n14;
        objectArray4[0] = n13;
        CallSite callSite2 = m44.a("q", (Object)m44.a("p", (Object)this, (long)-8433636557813510440L, (long)l10), (Object)objectArray4, (long)-7705420437471895729L, (long)l10);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l20;
        objectArray5[0] = callSite2;
        m44.a("o", (Object)this, (Object)objectArray5, (long)-8300167641871985462L, (long)l10);
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = list5;
        objectArray6[0] = l24;
        m44.a("q", (Object)this, (Object)objectArray6, (long)-7693551037943895740L, (long)l10);
        lon lon2 = new lon(m44.a("p", (Object)this, (long)-8595128375206265179L, (long)l10).size());
        lon lon3 = new lon(m44.a("p", (Object)this, (long)-7989645498057441071L, (long)l10).size());
        dl dl2 = new dl(cf.x(list2.size(), n10, (char)n11, (short)n12), l21);
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l13;
        objectArray7[0] = m44.a("p", (Object)this, (long)-7840470816886386343L, (long)l10);
        CallSite callSite3 = m44.a("n", (Object)objectArray7, (long)-7986672412438700335L, (long)l10);
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = callSite3;
        objectArray8[0] = l16;
        m44.a("o", (Object)this, (Object)objectArray8, (long)-8495935861620295091L, (long)l10);
        CallSite callSite4 = callSite;
        Object[] objectArray9 = new Object[1];
        objectArray9[0] = l22;
        sz2.Z(l26, m44.a("q", (Object)this, (Object)objectArray9, (long)-7803741954154095917L, (long)l10).clone());
        m44.a("r", (Object)this, (boolean)true, (long)-8471698679503175668L, (long)l10);
        Object[] objectArray10 = new Object[5];
        objectArray10[4] = l19;
        objectArray10[3] = dl2;
        objectArray10[2] = list2;
        objectArray10[1] = lon3;
        objectArray10[0] = lon2;
        m44.a("o", (Object)this, (Object)objectArray10, (long)-8069184182200529815L, (long)l10);
        Object[] objectArray11 = new Object[9];
        objectArray11[8] = list8;
        objectArray11[7] = list7;
        objectArray11[6] = list6;
        objectArray11[5] = dl2;
        objectArray11[4] = list2;
        objectArray11[3] = list;
        objectArray11[2] = l25;
        objectArray11[1] = lon3;
        objectArray11[0] = lon2;
        m44.a("o", (Object)this, (Object)objectArray11, (long)-8048621838175177814L, (long)l10);
        Object[] objectArray12 = new Object[1];
        objectArray12[0] = l22;
        CallSite callSite5 = m44.a("q", (Object)this, (Object)objectArray12, (long)-7803741954154095917L, (long)l10);
        int[] nArray = new int[((CallSite)callSite5).length];
        try {
            System.arraycopy(callSite5, 0, nArray, 0, ((CallSite)callSite5).length);
            sz3.Z(l26, nArray);
            if (m44.a("n", (long)-8284617718527380418L, (long)l10) == null) {
                m44.a("n", (Object)new _0[3], (long)-8576347036500478890L, (long)l10);
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw m44.a("n", (Object)numberFormatException, (long)-8325038488648133449L, (long)l10);
        }
    }

    /*
     * Exception decompiling
     */
    void K(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[DOLOOP]], but top level block is 17[SIMPLE_IF_TAKEN]
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

    public int q(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return (int)m44.a("l", (long)6537891477982710634L, (long)l10);
    }

    private long d(Object[] objectArray) {
        CallSite callSite;
        long l10 = (Long)objectArray[0];
        long l11 = l10 = b ^ l10;
        long l12 = l11 ^ 0x76912346685L;
        long l13 = l11 ^ 0x73CA477F8B6FL;
        long l14 = l11 ^ 0x59612CFC495DL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        CallSite callSite2 = m44.a("q", (Object)this, (Object)objectArray2, (long)1834019988055691283L, (long)l10);
        int n10 = ((Random)((Object)m44.a("p", (Object)this, (long)1869337075715152793L, (long)l10))).nextInt((int)lku.b("x", (int)24857, (long)(0x56526A2737EFF95L ^ l10)));
        CallSite callSite3 = m44.a("n", (long)1807684038784287165L, (long)l10);
        int n11 = ((Random)((Object)m44.a("p", (Object)this, (long)1869337075715152793L, (long)l10))).nextInt((int)lku.b("x", (int)24857, (long)(0x56526A2737EFF95L ^ l10)));
        block0: while (true) {
            CallSite callSite4;
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l14;
            callSite = callSite4 = m44.a("q", (Object)this, (Object)objectArray3, (long)2242331264171545890L, (long)l10);
            while (true) {
                if (m44.a("p", (Object)this, (long)1829528912689049379L, (long)l10).contains((long)callSite4)) continue block0;
                m44.a("p", (Object)this, (long)1829528912689049379L, (long)l10).add((long)callSite4);
                Object[] objectArray4 = new Object[5];
                objectArray4[4] = callSite2;
                objectArray4[3] = n10;
                objectArray4[2] = l13;
                objectArray4[1] = (long)callSite4;
                objectArray4[0] = n11;
                CallSite callSite5 = m44.a("n", (Object)objectArray4, (long)165973896935577033L, (long)l10);
                if (l10 <= 0L) continue;
                callSite = callSite5;
                if (callSite3 != null) break block0;
            }
            break;
        }
        return (long)callSite;
    }

    /*
     * Exception decompiling
     */
    private void E(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [60[DOLOOP], 61[DOLOOP], 59[DOLOOP]], but top level block is 23[TRYBLOCK]
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

    private long s(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10 = b ^ l10;
        long l12 = l11 ^ 0x33039FC22E19L;
        long l13 = l11 ^ 0x4CA5F738F52EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l13;
        CallSite callSite = m44.a("r", (Object)this, (Object)objectArray2, (long)-8441728418885008456L, (long)l10);
        reference var10_7 = lku.b("x", (int)2124, (long)(0x6613C173FC318541L ^ l10)) - m44.a("s", (Object)this, (long)-7849130966351684412L, (long)l10);
        long l14 = (Long)m44.a("i", (long)-8193238609759809901L, (long)l10).next();
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = l12;
        objectArray3[3] = callSite;
        objectArray3[2] = l14;
        objectArray3[1] = (int)var10_7;
        objectArray3[0] = n10;
        CallSite callSite2 = m44.a("m", (Object)objectArray3, (long)-7674267962024171717L, (long)l10);
        return (long)callSite2;
    }

    private void q(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int[] nArray = (int[])objectArray[1];
        l10 = b ^ l10;
        m44.a("t", (Object)this, (long)2525723083206408491L, (long)l10).add(nArray);
    }

    public int L(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return (int)m44.a("u", (Object)this, (long)-5826453404960104206L, (long)l10);
    }

    private static void r(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        int n11 = (Integer)objectArray[1];
        int n12 = (Integer)objectArray[2];
        long l10 = (Long)objectArray[3];
        List list = (List)objectArray[4];
        List list2 = (List)objectArray[5];
        long l11 = (l10 = b ^ l10) ^ 0x7A34DBC137A5L;
        int n13 = (int)(l11 >>> 32);
        int n14 = (int)(l11 << 32 >>> 48);
        int n15 = (int)(l11 << 48 >>> 48);
        int n16 = n10;
        int n17 = n11 + 1;
        for (int i10 = n10; i10 <= n12; ++i10) {
            list2.set(i10, list.get(i10));
        }
        while (n16 <= n11 && n17 <= n12) {
            f5 f52 = ((f5)list2.get(n16)).Y(n13, (short)n14, n15, (lun)list2.get(n17)) ? (f5)list2.get(n16++) : (f5)list2.get(n17++);
            list.set(n10, f52);
            ++n10;
        }
        while (n16 <= n11) {
            list.set(n10, list2.get(n16));
            ++n10;
            ++n16;
        }
    }

    long Y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        long l11 = (Long)m44.a("t", (Object)this, (long)9065117859677753754L, (long)l10).next();
        return l11;
    }

    /*
     * Exception decompiling
     */
    private void i(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [58[DOLOOP]], but top level block is 26[TRYBLOCK]
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
    private void P(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [79[DOLOOP]], but top level block is 22[TRYBLOCK]
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
    private void D(Object[] var1_1) {
        var2_2 = (Set)var1_1[0];
        var4_3 = (Set)var1_1[1];
        var3_4 = (List)var1_1[2];
        var7_5 = (dl)var1_1[3];
        var5_6 = (Long)var1_1[4];
        v0 = var5_6 = lku.b ^ var5_6;
        var8_7 = v0 ^ 114451563146661L;
        var10_8 = v0 ^ 123925662718622L;
        v1 = v0 ^ 77519539701939L;
        var12_9 = (int)(v1 >>> 48);
        var13_10 = (int)(v1 << 16 >>> 32);
        var14_11 = (int)(v1 << 48 >>> 48);
        var15_12 = v0 ^ 138959065865462L;
        var17_13 = v0 ^ 139746524858892L;
        var19_14 = v0 ^ 38851918672825L;
        v2 = v0 ^ 4588370253928L;
        var21_15 = v2 >>> 32;
        var23_16 = (int)(v2 << 32 >>> 32);
        v3 = v0 ^ 56473874400819L;
        var24_17 = (int)(v3 >>> 32);
        var25_18 = (int)(v3 << 32 >>> 48);
        var26_19 = (int)(v3 << 48 >>> 48);
        v4 = v0 ^ 69964612195591L;
        var27_20 = (int)(v4 >>> 48);
        var28_21 = (int)(v4 << 16 >>> 48);
        var29_22 = (int)(v4 << 32 >>> 32);
        var30_23 = v0 ^ 125636971046010L;
        var32_24 = v0 ^ 96080922675022L;
        var34_25 = v0 ^ 114095727618890L;
        var36_26 = v0 ^ 134698988611145L;
        var38_27 = v0 ^ 62232935074972L;
        var40_28 = v0 ^ 44999519714840L;
        var42_29 = v0 ^ 110424755832863L;
        v5 = v0 ^ 132574980935378L;
        var44_30 = (int)(v5 >>> 48);
        var45_31 = (int)(v5 << 16 >>> 32);
        var46_32 = (int)(v5 << 48 >>> 48);
        var47_33 = v0 ^ 100986194259750L;
        var49_34 = v0 ^ 74896802556078L;
        var51_35 = v0 ^ 68475982174763L;
        var53_36 = v0 ^ 44873088637002L;
        var55_37 = v0 ^ 87880279113850L;
        v6 = new Object[1];
        v6[0] = var47_33;
        var58_38 = m44.a("v", (Object)m44.a("w", (Object)this, (long)-787331210137472705L, (long)var5_6), (Object)v6, (long)-1358319119008278959L, (long)var5_6);
        var59_39 = var3_4.size();
        var60_40 = new ArrayList<gc>(var59_39);
        v7 = m44.a("i", (long)-1427227503959182182L, (long)var5_6);
        v8 = new Object[2];
        v8[1] = var36_26;
        v8[0] = cf.x(m44.a("w", (Object)this, (long)-625830901391474366L, (long)var5_6).size(), var24_17, (char)var25_18, (short)var26_19);
        m44.a("u", (Object)this, (Set)m44.a("i", (Object)v8, (long)-1564328173707920126L, (long)var5_6), (long)-1421837921612539388L, (long)var5_6);
        var57_41 = v7;
        var61_42 = new ArrayList<f5>(m44.a("w", (Object)this, (long)-625830901391474366L, (long)var5_6).size());
        var62_43 = m44.a("w", (Object)this, (long)-625830901391474366L, (long)var5_6).iterator();
        block40: while (var62_43.hasNext()) {
            v9 /* !! */  = var62_43.next();
            do {
                var63_44 = (f5)v9 /* !! */ ;
                var61_42.add(var63_44);
                if (var57_41 != null) continue block40;
                v9 /* !! */  = new f6(this);
            } while (var5_6 < 0L);
        }
        var62_43 = v9 /* !! */ ;
        m44.a("i", var61_42, (Object)var62_43, (long)-1502831912384831793L, (long)var5_6);
        block42: while (true) {
            lk0.t(var61_42.isEmpty() == false, new String[]{(String)lku.a("d", (int)25920, (long)(6096305355161658034L ^ var5_6)) + m44.a("w", (Object)this, (long)-625830901391474366L, (long)var5_6).size() + (String)lku.a("d", (int)14898, (long)(9143415756762004931L ^ var5_6)) + var59_39 + (String)lku.a("d", (int)29970, (long)(8686100380011098849L ^ var5_6)) + var60_40.size() + (String)lku.a("d", (int)29970, (long)(8686100380011098849L ^ var5_6)) + m44.a("w", (Object)this, (long)-1421397807952538269L, (long)var5_6).size()}, var55_37);
            var63_45 = m44.a("w", (Object)this, (long)-1380794184276775234L, (long)var5_6).nextInt(var61_42.size());
            v10 /* !! */  = var61_42.remove(var63_45);
            do {
                block59: {
                    var64_46 = (f5)v10 /* !! */ ;
                    v11 = m44.a("w", (Object)this, (long)-1421397807952538269L, (long)var5_6).contains(var64_46);
                    if (var57_41 != null) {
                        block54: {
                            block60: {
                                block57: {
                                    block55: {
                                        try {
                                            block56: {
                                                try {
                                                    try {
                                                        try {
                                                            if (v11 != 0) break block54;
                                                            v12 /* !! */  = m44.a("w", (Object)this, (long)-1227106016192708810L, (long)var5_6);
                                                            if (var57_41 == null) break block55;
                                                        }
                                                        catch (NumberFormatException v13) {
                                                            throw m44.a("i", (Object)v13, (long)-895961452634559664L, (long)var5_6);
                                                        }
                                                        if (var5_6 <= 0L) break block55;
                                                        if (!v12 /* !! */ .contains(var64_46)) break block56;
                                                    }
                                                    catch (NumberFormatException v14) {
                                                        throw m44.a("i", (Object)v14, (long)-895961452634559664L, (long)var5_6);
                                                    }
                                                    if (var57_41 != null) break block54;
                                                }
                                                catch (NumberFormatException v15) {
                                                    throw m44.a("i", (Object)v15, (long)-895961452634559664L, (long)var5_6);
                                                }
                                            }
                                            v12 /* !! */  = var58_38.get(var64_46);
                                        }
                                        catch (NumberFormatException v16) {
                                            throw m44.a("i", (Object)v16, (long)-895961452634559664L, (long)var5_6);
                                        }
                                    }
                                    var65_47 = (lun)v12 /* !! */ ;
                                    try {
                                        block58: {
                                            try {
                                                try {
                                                    v17 = var65_47;
                                                    v18 = var57_41;
                                                    if (var5_6 >= 0L) {
                                                        if (v18 == null) break block57;
                                                        v18 = new Object[]{};
                                                    }
                                                    if (m44.a("v", (Object)v17, (Object)v18, (long)-1026239875078976344L, (long)var5_6) != false) break block58;
                                                }
                                                catch (NumberFormatException v19) {
                                                    throw m44.a("i", (Object)v19, (long)-895961452634559664L, (long)var5_6);
                                                }
                                                if (var57_41 != null) break block54;
                                            }
                                            catch (NumberFormatException v20) {
                                                throw m44.a("i", (Object)v20, (long)-895961452634559664L, (long)var5_6);
                                            }
                                        }
                                        v17 = var65_47;
                                    }
                                    catch (NumberFormatException v21) {
                                        throw m44.a("i", (Object)v21, (long)-895961452634559664L, (long)var5_6);
                                    }
                                }
                                var66_48 = (f5)v17;
                                try {
                                    block61: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v11 = (int)m44.a("w", (Object)this, (long)-1421397807952538269L, (long)var5_6).contains(var66_48);
                                                                if (var57_41 == null) break block59;
                                                                if (v11 != 0) break block54;
                                                            }
                                                            catch (NumberFormatException v22) {
                                                                throw m44.a("i", (Object)v22, (long)-895961452634559664L, (long)var5_6);
                                                            }
                                                            v11 = (int)var4_3.contains(var66_48);
                                                            if (var57_41 == null) break block59;
                                                        }
                                                        catch (NumberFormatException v23) {
                                                            throw m44.a("i", (Object)v23, (long)-895961452634559664L, (long)var5_6);
                                                        }
                                                        if (v11 != 0) break block54;
                                                    }
                                                    catch (NumberFormatException v24) {
                                                        throw m44.a("i", (Object)v24, (long)-895961452634559664L, (long)var5_6);
                                                    }
                                                    v25 = m44.a("w", (Object)this, (long)-625830901391474366L, (long)var5_6).contains(var66_48);
                                                    if (var57_41 == null) break block60;
                                                }
                                                catch (NumberFormatException v26) {
                                                    throw m44.a("i", (Object)v26, (long)-895961452634559664L, (long)var5_6);
                                                }
                                                if (var5_6 <= 0L) break block60;
                                                if (!v25) break block61;
                                            }
                                            catch (NumberFormatException v27) {
                                                throw m44.a("i", (Object)v27, (long)-895961452634559664L, (long)var5_6);
                                            }
                                            if (var57_41 != null) break block54;
                                        }
                                        catch (NumberFormatException v28) {
                                            throw m44.a("i", (Object)v28, (long)-895961452634559664L, (long)var5_6);
                                        }
                                    }
                                    v29 = new Object[1];
                                    v29[0] = var30_23;
                                    m44.a("w", (Object)this, (long)-1421837921612539388L, (long)var5_6).add((long)m44.a("v", (Object)var64_46, (Object)v29, (long)-1169937936067924730L, (long)var5_6));
                                    v25 = var2_2.add(var64_46);
                                }
                                catch (NumberFormatException v30) {
                                    throw m44.a("i", (Object)v30, (long)-895961452634559664L, (long)var5_6);
                                }
                            }
                            var67_49 = v25;
                            var67_49 = var4_3.add(var66_48);
                            var60_40.add(new gc(var64_46, var66_48, var32_24));
                        }
                        v11 = var60_40.size();
                    }
                }
                if (v11 < var59_39) continue block42;
                var63_45 = 0;
                v31 = new Object[1];
                v31[0] = var15_12;
                var64_46 = m44.a("i", (Object)v31, (long)-1093612149267330735L, (long)var5_6);
                v32 = new Object[1];
                v32[0] = var17_13;
                var65_47 = m44.a("i", (Object)v32, (long)-1267487341177763190L, (long)var5_6);
                v10 /* !! */  = var60_40.iterator();
            } while (var5_6 < 0L || var57_41 == null);
            break;
        }
        var66_48 = v10 /* !! */ ;
        block44: while (var66_48.hasNext()) {
            v33 /* !! */  = var66_48.next();
            do {
                block65: {
                    block64: {
                        block62: {
                            var67_51 = (gc)v33 /* !! */ ;
                            var68_53 = (_o)var3_4.get(var63_45++);
                            v34 = new Object[1];
                            v34[0] = var19_14;
                            var69_54 = m44.a("v", (Object)var68_53, (Object)v34, (long)-784806430077380467L, (long)var5_6).D();
                            try {
                                try {
                                    block63: {
                                        try {
                                            try {
                                                try {
                                                    block66: {
                                                        v35 = var69_54.P((char)var27_20, (short)var28_21, var29_22);
                                                        v36 = var57_41;
                                                        if (var5_6 < 0L) break block66;
                                                        if (v36 == null) ** GOTO lbl298
                                                        v36 = var57_41;
                                                    }
                                                    if (v36 == null) break block62;
                                                }
                                                catch (NumberFormatException v37) {
                                                    throw m44.a("i", (Object)v37, (long)-895961452634559664L, (long)var5_6);
                                                }
                                                if (!v35) break block63;
                                            }
                                            catch (NumberFormatException v38) {
                                                throw m44.a("i", (Object)v38, (long)-895961452634559664L, (long)var5_6);
                                            }
                                            var64_46.add(var68_53);
                                            if (var57_41 != null) break block64;
                                        }
                                        catch (NumberFormatException v39) {
                                            throw m44.a("i", (Object)v39, (long)-895961452634559664L, (long)var5_6);
                                        }
                                    }
                                    v40 = var69_54;
                                    if (var57_41 == null) break block65;
                                }
                                catch (NumberFormatException v41) {
                                    throw m44.a("i", (Object)v41, (long)-895961452634559664L, (long)var5_6);
                                }
                                v42 = v40.n(var8_7);
                            }
                            catch (NumberFormatException v43) {
                                throw m44.a("i", (Object)v43, (long)-895961452634559664L, (long)var5_6);
                            }
                        }
                        try {
                            if (v42) {
                                var65_47.put(var69_54, var68_53);
                                if (var57_41 != null) continue block44;
                            }
                        }
                        catch (NumberFormatException v44) {
                            throw m44.a("i", (Object)v44, (long)-895961452634559664L, (long)var5_6);
                        }
                    }
                    v45 = new Object[1];
                    v45[0] = var40_28;
                    v40 = m44.a("v", (Object)var67_51, (Object)v45, (long)-1114865688764429846L, (long)var5_6);
                }
                var70_55 = (f5)v40;
                v46 = new Object[1];
                v46[0] = var49_34;
                var71_56 = (f5)m44.a("v", (Object)var67_51, (Object)v46, (long)-888450280515600030L, (long)var5_6);
                v47 = new Object[2];
                v47[1] = var70_55;
                v47[0] = var51_35;
                var72_57 = m44.a("h", (Object)this, (Object)v47, (long)-1256951145086684996L, (long)var5_6);
                v48 = new Object[1];
                v48[0] = var10_8;
                var74_58 = m44.a("h", (Object)this, (Object)v48, (long)-952328309112353588L, (long)var5_6);
                v49 = new Object[5];
                v49[4] = (long)var74_58;
                v49[3] = (long)var72_57;
                v49[2] = var71_56;
                v49[1] = var38_27;
                v49[0] = var70_55;
                m44.a("v", (Object)var68_53, (Object)v49, (long)-837524349502809226L, (long)var5_6);
                v50 = new Object[5];
                v50[4] = var14_11;
                v50[3] = var68_53;
                v50[2] = var13_10;
                v50[1] = (int)((short)var12_9);
                v50[0] = var71_56;
                m44.a("v", (Object)var7_5, (Object)v50, (long)-1410354221786405041L, (long)var5_6);
                if (var57_41 != null) continue block44;
                v33 /* !! */  = var64_46.iterator();
            } while (var5_6 <= 0L);
        }
        var66_48 = v33 /* !! */ ;
        block46: while (true) {
            v35 = var66_48.hasNext();
lbl298:
            // 2 sources

            if (!v35) break;
            v51 /* !! */  = var66_48.next();
            block47: while (true) {
                var67_52 = (_o)v51 /* !! */ ;
                v52 = new Object[1];
                v52[0] = var19_14;
                var68_53 = m44.a("v", (Object)var67_52, (Object)v52, (long)-784806430077380467L, (long)var5_6).D();
                v53 = new Object[2];
                v53[1] = var23_16;
                v53[0] = var21_15;
                var69_54 = m44.a("v", (Object)var68_53, (Object)v53, (long)-790128211544944132L, (long)var5_6).iterator();
                block48: while (var69_54.hasNext()) {
                    v54 /* !! */  = var69_54.next();
                    do {
                        var70_55 = (_v)v54 /* !! */ ;
                        var71_56 = (_o)var65_47.get(var70_55);
                        v55 = new Object[1];
                        v55[0] = var53_36;
                        v56 = new Object[1];
                        v56[0] = var42_29;
                        v57 = new Object[3];
                        v57[2] = (int)((short)var46_32);
                        v57[1] = var45_31;
                        v57[0] = (int)((short)var44_30);
                        v58 = new Object[1];
                        v58[0] = var34_25;
                        v59 = new Object[5];
                        v59[4] = (long)m44.a("v", (Object)var67_52, (Object)v58, (long)-1275798417741803764L, (long)var5_6);
                        v59[3] = (long)m44.a("v", (Object)var67_52, (Object)v57, (long)-588717398695379762L, (long)var5_6);
                        v59[2] = m44.a("v", (Object)var67_52, (Object)v56, (long)-907631641352435504L, (long)var5_6);
                        v59[1] = var38_27;
                        v59[0] = m44.a("v", (Object)var67_52, (Object)v55, (long)-788403190710457703L, (long)var5_6);
                        m44.a("v", (Object)var71_56, (Object)v59, (long)-837524349502809226L, (long)var5_6);
                        if (var57_41 == null) continue block46;
                        v51 /* !! */  = var57_41;
                        if (var5_6 <= 0L) continue block47;
                        if (v51 /* !! */  != null) continue block48;
                        v54 /* !! */  = var57_41;
                    } while (var5_6 < 0L);
                }
                break;
            }
            if (v54 /* !! */  == null) break;
        }
    }

    private static void Y(Object[] objectArray) {
        List list = (List)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = b ^ l10) ^ 0x39362C32A041L;
        int n10 = 0;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = n10;
        objectArray2[4] = new ArrayList(list);
        objectArray2[3] = l11;
        objectArray2[2] = list;
        objectArray2[1] = list.size() - 1;
        objectArray2[0] = 0;
        m44.a("m", (Object)objectArray2, (long)2010444723365325607L, (long)l10);
    }

    public lun M(Object[] objectArray) {
        Object object;
        block15: {
            Object object2;
            block16: {
                Object[] objectArray2;
                long l10;
                long l11;
                long l12;
                long l13;
                zr zr2;
                long l14;
                block14: {
                    Object object3;
                    Object object4;
                    long l15;
                    block13: {
                        Object object5;
                        int n10;
                        block11: {
                            block12: {
                                l14 = (Long)objectArray[0];
                                zr2 = (zr)objectArray[1];
                                l13 = (Long)objectArray[2];
                                long l16 = l13 = b ^ l13;
                                l12 = l16 ^ 0x542850BE9105L;
                                l11 = l16 ^ 0x786940D8A95L;
                                l10 = l16 ^ 0x1143D7368BA5L;
                                l15 = l16 ^ 0x6E90378EE68DL;
                                long l17 = l16 ^ 0x197DB8FA80D1L;
                                int n11 = (int)(l17 >>> 32);
                                int n12 = (int)(l17 << 32 >>> 48);
                                int n13 = (int)(l17 << 48 >>> 48);
                                Object[] objectArray3 = new Object[1];
                                objectArray3[0] = l10;
                                object4 = m44.a("q", (Object)this, (Object)objectArray3, (long)-841142490403406541L, (long)l13);
                                objectArray2 = m44.a("n", (long)-849428650768765795L, (long)l13);
                                int n14 = (int)nh.x(l14, n11, (short)n12, (int)m44.a("p", (Object)this, (long)-1326005393014873521L, (long)l13), (int)lku.b("x", (int)26643, (long)(0x164E408A704F9BB5L ^ l13)), (int[])object4, n13);
                                try {
                                    n10 = n14;
                                    object5 = m44.a("p", (Object)this, (long)-1317984898025701311L, (long)l13).size();
                                    if (objectArray2 == null) break block11;
                                    if (n10 >= object5) break block12;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw m44.a("n", (Object)numberFormatException, (long)-1470523343856913577L, (long)l13);
                                }
                                lun lun2 = (lun)m44.a("p", (Object)this, (long)-687225944374835099L, (long)l13).get(n14);
                                return lun2;
                            }
                            try {
                                object3 = m44.a("p", (Object)this, (long)-687225944374835099L, (long)l13);
                                if (objectArray2 == null) break block13;
                                n10 = object3.size();
                                object5 = lku.b("x", (int)19092, (long)(0x75105CD5A47DB90EL ^ l13));
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw m44.a("n", (Object)numberFormatException, (long)-1470523343856913577L, (long)l13);
                            }
                        }
                        try {
                            if (n10 % object5 != 0) break block14;
                            object3 = object4.clone();
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw m44.a("n", (Object)numberFormatException, (long)-1470523343856913577L, (long)l13);
                        }
                    }
                    object2 = (int[])object3;
                    object4 = object2;
                    Object[] objectArray4 = new Object[2];
                    objectArray4[1] = object4;
                    objectArray4[0] = l15;
                    m44.a("o", (Object)this, (Object)objectArray4, (long)-1299152094865924691L, (long)l13);
                }
                Object[] objectArray5 = new Object[1];
                objectArray5[0] = l10;
                object2 = new f5(l14, (int[])m44.a("q", (Object)this, (Object)objectArray5, (long)-841142490403406541L, (long)l13), l12, (l6q)((Object)m44.a("p", (Object)this, (long)-867928738217724429L, (long)l13)), (Set)((Object)m44.a("p", (Object)this, (long)-1372839249109333893L, (long)l13)));
                try {
                    try {
                        object = object2;
                        Object[] objectArray6 = objectArray2;
                        if (l13 > 0L) {
                            if (objectArray6 == null) break block15;
                            Object[] objectArray7 = new Object[2];
                            objectArray7[1] = l11;
                            objectArray6 = objectArray7;
                            objectArray7[0] = m44.a("p", (Object)this, (long)-687225944374835099L, (long)l13).size();
                        }
                        m44.a("q", (Object)object, (Object)objectArray6, (long)-765547813592845402L, (long)l13);
                        m44.a("p", (Object)this, (long)-687225944374835099L, (long)l13).add(object2);
                        if (m44.a("p", (Object)this, (long)-687225944374835099L, (long)l13).size() < m44.a("p", (Object)this, (long)-1451130644513413169L, (long)l13) - true) break block16;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw m44.a("n", (Object)numberFormatException, (long)-1470523343856913577L, (long)l13);
                    }
                    zr2.I(true);
                }
                catch (NumberFormatException numberFormatException) {
                    throw m44.a("n", (Object)numberFormatException, (long)-1470523343856913577L, (long)l13);
                }
            }
            object = object2;
        }
        return object;
    }

    private void n(Object[] objectArray) {
        int n10;
        CallSite callSite;
        int n11;
        Object object;
        long l10;
        long l11;
        long l12;
        long l13;
        long l14;
        long l15;
        long l16;
        int n12;
        long l17;
        List list;
        long l18;
        _o _o2;
        block4: {
            block5: {
                _o2 = (_o)objectArray[0];
                Set set = (Set)objectArray[1];
                l18 = (Long)objectArray[2];
                Set set2 = (Set)objectArray[3];
                list = (List)objectArray[4];
                long l19 = l18 = b ^ l18;
                l17 = l19 ^ 0x9A11CA92305L;
                long l20 = l19 ^ 0x76AD5BD05F53L;
                n12 = (int)(l20 >>> 32);
                l16 = l20 << 32 >>> 32;
                l15 = l19 ^ 0x54C9A7E2B3A7L;
                l14 = l19 ^ 0x6F0F95C4F5E9L;
                l13 = l19 ^ 0x74F66C376229L;
                l12 = l19 ^ 0x67C576FE3CF6L;
                long l21 = l19 ^ 0x552E19166C1EL;
                l11 = l19 ^ 0x1868373823F2L;
                l10 = l19 ^ 0xBDEB7AC728DL;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l21;
                object = m44.a("v", (Object)_o2, (Object)objectArray2, (long)-2997110046483710782L, (long)l18);
                n11 = object.size();
                callSite = m44.a("i", (long)-2915719558425587934L, (long)l18);
                try {
                    n10 = n11;
                    if (callSite == null) break block4;
                    if (n10 != 0) break block5;
                }
                catch (NumberFormatException numberFormatException) {
                    throw m44.a("i", (Object)numberFormatException, (long)-4023729418248908568L, (long)l18);
                }
                return;
            }
            n10 = n11;
        }
        if (n10 > 1) {
            object = new ArrayList(object);
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = l17;
            objectArray3[1] = m44.a("w", (Object)this, (long)-2923293938561592058L, (long)l18);
            objectArray3[0] = object;
            m44.a("i", (Object)objectArray3, (long)-3431570446460619773L, (long)l18);
        }
        _o _o3 = _o2;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l15;
        CallSite callSite2 = m44.a("v", (Object)_o3, (Object)objectArray4, (long)-3972384382564256920L, (long)l18);
        ArrayList<lq0> arrayList = new ArrayList<lq0>(n11 + 1);
        arrayList.add(new lq0(_o3, n12, l16, callSite2));
        for (int i10 = 0; i10 < n11; ++i10) {
            _o _o4 = (_o)object.get(i10);
            Object[] objectArray5 = new Object[1];
            objectArray5[0] = l11;
            CallSite callSite3 = m44.a("v", (Object)_o4, (Object)objectArray5, (long)-3551308353356361439L, (long)l18);
            Object[] objectArray6 = new Object[2];
            objectArray6[1] = l13;
            objectArray6[0] = callSite3;
            m44.a("v", (Object)callSite2, (Object)objectArray6, (long)-2993691058215290952L, (long)l18);
            Object[] objectArray7 = new Object[1];
            objectArray7[0] = l14;
            Object[] objectArray8 = new Object[2];
            objectArray8[1] = l10;
            objectArray8[0] = (int)m44.a("v", (Object)callSite2, (Object)objectArray7, (long)-3685426996778675942L, (long)l18);
            CallSite callSite4 = m44.a("h", (Object)this, (Object)objectArray8, (long)-3327928099787016221L, (long)l18);
            Object[] objectArray9 = new Object[1];
            objectArray9[0] = l14;
            Object[] objectArray10 = new Object[2];
            objectArray10[1] = l10;
            objectArray10[0] = (int)m44.a("v", (Object)callSite3, (Object)objectArray9, (long)-3685426996778675942L, (long)l18);
            CallSite callSite5 = m44.a("h", (Object)this, (Object)objectArray10, (long)-3327928099787016221L, (long)l18);
            list.add(new gc((long)callSite4, (long)callSite5, l12));
            arrayList.add(new lq0(_o4, n12, l16, callSite3));
            _o3 = _o4;
            callSite2 = callSite3;
            if (callSite != null) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            block26: {
                                lku.b = prr.a(-8146200051830288593L, 6238973368747035872L, MethodHandles.lookup().lookupClass()).a(21899547780306L);
                                lku.g = new HashMap<K, V>(13);
                                var22 = lku.b ^ 117184448114234L;
                                var24_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                                v0 = SecretKeyFactory.getInstance("DES");
                                v1 = new byte[8];
                                v2 = v1;
                                v1[0] = (byte)(var22 >>> 56);
                                for (var25_2 = 1; var25_2 < 8; ++var25_2) {
                                    v2 = v2;
                                    v2[var25_2] = (byte)(var22 << var25_2 * 8 >>> 56);
                                }
                                var24_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                                var31_3 = new String[5];
                                var29_4 = 0;
                                var28_5 = "\u0097{\u00bd\u00b2\u000e V\u000bC]\u00b6\u0086\u00e5\u00c3|\u00e1\u00d8x'\u00f3\u00bc\u00df\u00cf\u00e1*\u007f\u0099`\u0014\u00f2f\u0019\u00ff\u00cf\u00c0\u00eby\u0096\u00c2\u00b5\u0010\u00b3\u0095\u00d1\u0010\u001f\u0080\u00b3\u0019\u00e3S\u00ddN\u0083:\u00b8d\u0010S\u00f4\u009f\u00f7\u00b8\u000eh\u00fcd\u00ec\u00aa\u00fdh\u0012\u00e1x";
                                var30_6 = "\u0097{\u00bd\u00b2\u000e V\u000bC]\u00b6\u0086\u00e5\u00c3|\u00e1\u00d8x'\u00f3\u00bc\u00df\u00cf\u00e1*\u007f\u0099`\u0014\u00f2f\u0019\u00ff\u00cf\u00c0\u00eby\u0096\u00c2\u00b5\u0010\u00b3\u0095\u00d1\u0010\u001f\u0080\u00b3\u0019\u00e3S\u00ddN\u0083:\u00b8d\u0010S\u00f4\u009f\u00f7\u00b8\u000eh\u00fcd\u00ec\u00aa\u00fdh\u0012\u00e1x".length();
                                var27_7 = 40;
                                var26_8 = -1;
lbl20:
                                // 2 sources

                                while (true) {
                                    v3 = ++var26_8;
                                    v4 = var28_5.substring(v3, v3 + var27_7);
                                    v5 = -1;
                                    break block26;
                                    break;
                                }
lbl25:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = lku.a(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    var28_5 = "1=\"A\u00c8\u00ba\u0006\u00feg\u00e3\u001aC\u00f7\u0089\u00a9'\u0010\u0013\u008b7>\u00bc\u00b9~\u009eC\u001b\u00f2AlBd\u00fb";
                                    var30_6 = "1=\"A\u00c8\u00ba\u0006\u00feg\u00e3\u001aC\u00f7\u0089\u00a9'\u0010\u0013\u008b7>\u00bc\u00b9~\u009eC\u001b\u00f2AlBd\u00fb".length();
                                    var27_7 = 16;
                                    var26_8 = -1;
lbl34:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var26_8;
                                        v4 = var28_5.substring(v6, v6 + var27_7);
                                        v5 = 0;
                                        break block26;
                                        break;
                                    }
                                    break;
                                }
lbl39:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = lku.a(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    break block27;
                                    break;
                                }
                            }
                            var32_9 = var24_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                        lku.e = var31_3;
                        lku.f = new String[5];
                        lku.n = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v7 = SecretKeyFactory.getInstance("DES");
                        v8 = new byte[8];
                        v9 = v8;
                        v8[0] = (byte)(var22 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v9 = v9;
                            v9[var12_11] = (byte)(var22 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[44];
                        var14_13 = 0;
                        var15_14 = "\t\u00b2V\tw\u0013\u00df\u0087\u00c9\u0081\u008e\u00ea\u0003\u00c6TW\u00ce\u00bb\u00af\u0014\u00ce%\u00ed\u00ad\u00e6\u008cf#\u0016>+\u00bd\u0094\u00179\u00c2Xt\u00ecZm?\u000b2J\u00f8`W\u00baI\u008c\u0019\u0098*v\u00f6\u00ee\t\u0006\u00ecyv\u008d+\u00ccb\u0007\u0091xE\u0097l\u00b0jgl\u0016\u00e4\u00f7\u00a9\u00c1R\r%]\u009eRH\u0090\u0080a\u00ca\u000b!\u00ffU\u00b5\u0002\u00c2\u000eV\u00caGP\u0019!l\u0001q65%\u00c6;\u000es\u00ce\u00f5\u008eK\u009a\t\u00ee\u00b4\u0018r\u0011{\u0016\u00e7~AN\u00c2Q\u00f5\u00a0s\u0099\u00f9\u00ff\u00d4S\u009e\u00ed\u00fe?\u00b9\u00fa'\u00ec\u00d8;\u00ba\u0012;nG~V\u001f\f\u0092\u0084\u000bU\u00c0(]\u00cc`\u00f4Gac\u00f1\u00d1\u00e0R\u00ff(t`\u001dg\u0097\u00c9\u00878\u00b7\u0096)\u00b6\u0016\u00c5\u001a\u00b1\u00a8\u00d4x\u00e6pc\u001c?\u0014\u00c2\u00e8\u00d6lq<s\u00e4C\u00c8\u0013\u0095\u00e6\u00d95\u0000r'\u009a>76\u008c~\u009a\u0000%%\u000e\u00a3\u00b8\u00a6.\u008ch7NF\u00e0\u0090F\u0006\u00158Q\u0090\u001b\u00b2\u0090?\u00b0\u00c4\u00ecL\u009at\u00fcT\u0017\u00dd\u00e9\u009a_<\u0080\r\u00e5\u00e0h\u00108\u000bp\u00b5~\u00b0\u00ed\b\u0002\u00eb,?\f\u00e5\u00a3\u00ed\u00c5\u00c3s\u00a7\u0098g\u0013+d\u00bc\u00ce\u00c1\u00df\u00edL\u00e6\u0013X\u00e0\u00b7\u0004-\u00f1L;(\u00d9\u0095\u00ad\u00e6\u00ae\u009f\u0012\u00f8\u0014\u00c5\u00a9\u00c2\u001f\u001c\u00fa\u001eL\u00fb";
                        var16_15 = "\t\u00b2V\tw\u0013\u00df\u0087\u00c9\u0081\u008e\u00ea\u0003\u00c6TW\u00ce\u00bb\u00af\u0014\u00ce%\u00ed\u00ad\u00e6\u008cf#\u0016>+\u00bd\u0094\u00179\u00c2Xt\u00ecZm?\u000b2J\u00f8`W\u00baI\u008c\u0019\u0098*v\u00f6\u00ee\t\u0006\u00ecyv\u008d+\u00ccb\u0007\u0091xE\u0097l\u00b0jgl\u0016\u00e4\u00f7\u00a9\u00c1R\r%]\u009eRH\u0090\u0080a\u00ca\u000b!\u00ffU\u00b5\u0002\u00c2\u000eV\u00caGP\u0019!l\u0001q65%\u00c6;\u000es\u00ce\u00f5\u008eK\u009a\t\u00ee\u00b4\u0018r\u0011{\u0016\u00e7~AN\u00c2Q\u00f5\u00a0s\u0099\u00f9\u00ff\u00d4S\u009e\u00ed\u00fe?\u00b9\u00fa'\u00ec\u00d8;\u00ba\u0012;nG~V\u001f\f\u0092\u0084\u000bU\u00c0(]\u00cc`\u00f4Gac\u00f1\u00d1\u00e0R\u00ff(t`\u001dg\u0097\u00c9\u00878\u00b7\u0096)\u00b6\u0016\u00c5\u001a\u00b1\u00a8\u00d4x\u00e6pc\u001c?\u0014\u00c2\u00e8\u00d6lq<s\u00e4C\u00c8\u0013\u0095\u00e6\u00d95\u0000r'\u009a>76\u008c~\u009a\u0000%%\u000e\u00a3\u00b8\u00a6.\u008ch7NF\u00e0\u0090F\u0006\u00158Q\u0090\u001b\u00b2\u0090?\u00b0\u00c4\u00ecL\u009at\u00fcT\u0017\u00dd\u00e9\u009a_<\u0080\r\u00e5\u00e0h\u00108\u000bp\u00b5~\u00b0\u00ed\b\u0002\u00eb,?\f\u00e5\u00a3\u00ed\u00c5\u00c3s\u00a7\u0098g\u0013+d\u00bc\u00ce\u00c1\u00df\u00edL\u00e6\u0013X\u00e0\u00b7\u0004-\u00f1L;(\u00d9\u0095\u00ad\u00e6\u00ae\u009f\u0012\u00f8\u0014\u00c5\u00a9\u00c2\u001f\u001c\u00fa\u001eL\u00fb".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v10 = var17_12;
                            v11 = var14_13++;
                            v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v13 = -1;
                            break block28;
                            break;
                        }
lbl78:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = "\u00f7F\u0003E\u00f7\u00f5X\u00be\u00aa\u00ad\u0018,\u009dTD\u009c";
                            var16_15 = "\u00f7F\u0003E\u00f7\u00f5X\u00be\u00aa\u00ad\u0018,\u009dTD\u009c".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v10 = var17_12;
                                v11 = var14_13++;
                                v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v13 = 0;
                                break block28;
                                break;
                            }
                            break;
                        }
lbl91:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            break block29;
                            break;
                        }
                    }
                    var19_18 = v12;
                    var21_19 = var11_10.doFinal(new byte[]{(byte)(var19_18 >>> 56), (byte)(var19_18 >>> 48), (byte)(var19_18 >>> 40), (byte)(var19_18 >>> 32), (byte)(var19_18 >>> 24), (byte)(var19_18 >>> 16), (byte)(var19_18 >>> 8), (byte)var19_18});
                    v14 = ((long)var21_19[0] & 255L) << 56 | ((long)var21_19[1] & 255L) << 48 | ((long)var21_19[2] & 255L) << 40 | ((long)var21_19[3] & 255L) << 32 | ((long)var21_19[4] & 255L) << 24 | ((long)var21_19[5] & 255L) << 16 | ((long)var21_19[6] & 255L) << 8 | (long)var21_19[7] & 255L;
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
                lku.k = var17_12;
                lku.m = new Integer[44];
                lku.u = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v15 = SecretKeyFactory.getInstance("DES");
                v16 = new byte[8];
                v17 = v16;
                v16[0] = (byte)(var22 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v17 = v17;
                    v17[var1_21] = (byte)(var22 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v15.generateSecret(new DESKeySpec(v17)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[8];
                var3_23 = 0;
                var4_24 = "Q\u00cdUA\u008c\u00870i\u0013@Tv\u00a7(uj\t\u00c6%\u0095\u00dfz|\u000b_\u0089\u00ba\u00d5\u00ab2{=\u00d3\u0091\u00a1\u00f8\u0001m\u0017!\u000202\u0017\u00c7c\u009d\u0092";
                var5_25 = "Q\u00cdUA\u008c\u00870i\u0013@Tv\u00a7(uj\t\u00c6%\u0095\u00dfz|\u000b_\u0089\u00ba\u00d5\u00ab2{=\u00d3\u0091\u00a1\u00f8\u0001m\u0017!\u000202\u0017\u00c7c\u009d\u0092".length();
                var2_26 = 0;
                while (true) {
                    var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
                    v18 = var6_22;
                    v19 = var3_23++;
                    v20 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
                    v21 = -1;
                    break block30;
                    break;
                }
lbl131:
                // 1 sources

                while (true) {
                    v18[v19] = v22;
                    if (var2_26 < var5_25) ** continue;
                    var4_24 = "]m\u0018\u0005\u00d4s%\u00ee\u00f2\u00a3\u0092\u0015$8\u000bE";
                    var5_25 = "]m\u0018\u0005\u00d4s%\u00ee\u00f2\u00a3\u0092\u0015$8\u000bE".length();
                    var2_26 = 0;
                    while (true) {
                        var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
                        v18 = var6_22;
                        v19 = var3_23++;
                        v20 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
                        v21 = 0;
                        break block30;
                        break;
                    }
                    break;
                }
lbl144:
                // 1 sources

                while (true) {
                    v18[v19] = v22;
                    if (var2_26 < var5_25) ** continue;
                    break block31;
                    break;
                }
            }
            var8_28 = v20;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            v22 = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
            switch (v21) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl157:
                // 1 sources

                ** continue;
            }
        }
        lku.p = var6_22;
        lku.q = new Long[8];
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x66BC;
        if (f[n11] == null) {
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
                throw new RuntimeException("com/zelix/lku", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e[n11].getBytes("ISO-8859-1");
            lku.f[n11] = lku.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return f[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lku.a(n10, l10);
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
            throw new RuntimeException("com/zelix/lku" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0xAC4;
        if (m[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = k[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])n.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    n.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lku", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lku.m[n11] = n12;
        }
        return m[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = lku.b(n10, l10);
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
            throw new RuntimeException("com/zelix/lku" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x46E3;
        if (q[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = p[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])u.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    u.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lku", exception);
            }
            long l13 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            lku.q[n11] = l13;
        }
        return q[n11];
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = lku.c(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return l11;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/lku" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lku.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(lku.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(lku.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

