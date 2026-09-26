/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._6;
import com.zelix._f;
import com.zelix._v;
import com.zelix.b1;
import com.zelix.bn;
import com.zelix.df;
import com.zelix.h4;
import com.zelix.l62;
import com.zelix.l6q;
import com.zelix.l6z;
import com.zelix.loe;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.s0;
import com.zelix.sh;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hy {
    private final l6q F;
    private final l6q O;
    private final l6q l;
    private Set E;
    private final sh j;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    /*
     * Exception decompiling
     */
    public hy(_v[] var1_1, short var2_2, sh var3_3, s0 var4_4, lqu var5_5, h4 var6_6, char var7_7, _6 var8_8, int var9_9, l6z var10_10, boolean var11_11) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [46[DOLOOP]], but top level block is 54[SIMPLE_IF_TAKEN]
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
    private void r(Object[] var1_1) {
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

    public boolean g(Object[] objectArray) {
        Object object;
        block10: {
            block9: {
                List list;
                CallSite callSite;
                String string;
                long l10;
                long l11;
                long l12;
                block8: {
                    bn bn2 = (bn)objectArray[0];
                    l12 = (Long)objectArray[1];
                    long l13 = l12 = a ^ l12;
                    long l14 = l13 ^ 0x4E33DA346AB5L;
                    int n10 = (int)(l14 >>> 48);
                    int n11 = (int)(l14 << 16 >>> 32);
                    int n12 = (int)(l14 << 48 >>> 48);
                    l11 = l13 ^ 0x1B53AB970E6DL;
                    l10 = l13 ^ 0x37AB219560BEL;
                    string = bn2.h(l11);
                    callSite = m44.a("k", (long)-481281276682135266L, (long)l12);
                    List list2 = ((l6q)((Object)m44.a("u", (Object)this, (long)-2042364721994287714L, (long)l12))).t((char)n10, bn2, n11, (short)n12);
                    try {
                        list = list2;
                        if (callSite != null) break block8;
                        if (list == null) break block9;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)-2015669815743565154L, (long)l12);
                    }
                    list = list2;
                }
                for (b1 b12 : list) {
                    block12: {
                        boolean bl2;
                        block11: {
                            String string2 = b12.h(l11);
                            try {
                                try {
                                    object = m44.a("t", (Object)m44.a("u", (Object)this, (long)-523247420626275623L, (long)l12), (long)l10, (Object)string, (Object)string2, (long)-1852693585124322025L, (long)l12);
                                    CallSite callSite2 = callSite;
                                    if (l12 >= 0L) {
                                        if (callSite2 != null) break block10;
                                        callSite2 = callSite;
                                    }
                                    if (callSite2 != null) break block11;
                                }
                                catch (n9 n93) {
                                    throw m44.a("k", (Object)n93, (long)-2015669815743565154L, (long)l12);
                                }
                                if (!object) break block12;
                            }
                            catch (n9 n94) {
                                throw m44.a("k", (Object)n94, (long)-2015669815743565154L, (long)l12);
                            }
                            bl2 = true;
                        }
                        return bl2;
                    }
                    if (callSite == null) continue;
                }
            }
            object = false;
        }
        return object;
    }

    /*
     * Exception decompiling
     */
    public boolean C(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[DOLOOP]], but top level block is 4[TRYBLOCK]
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

    public boolean u(Object[] objectArray) {
        boolean bl2;
        block8: {
            int n10;
            int n11;
            int n12;
            bn bn2;
            long l10;
            block9: {
                boolean bl3;
                block10: {
                    l10 = (Long)objectArray[0];
                    bn2 = (bn)objectArray[1];
                    long l11 = l10 = a ^ l10;
                    long l12 = l11 ^ 0x1C1F8DF4B30CL;
                    n12 = (int)(l12 >>> 48);
                    n11 = (int)(l12 << 16 >>> 32);
                    n10 = (int)(l12 << 48 >>> 48);
                    long l13 = l11 ^ 0x448A5206AC1CL;
                    long l14 = l11 ^ 0x7707F684A06BL;
                    long l15 = l11 ^ 0x1474587CAA6FL;
                    long l16 = l11 ^ 0x5D4CB4342977L;
                    _f _f2 = bn2.D();
                    CallSite callSite = m44.a("m", (long)8972339535784058056L, (long)l10);
                    try {
                        bl2 = _f2.N(l13);
                        if (callSite != null) break block8;
                        if (!bl2) break block9;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)n92, (long)7048384675792435016L, (long)l10);
                    }
                    loe loe2 = bn2.B(l14);
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l15;
                    Iterator iterator = m44.a("r", (Object)_f2, (Object)objectArray2, (long)7143092050212846463L, (long)l10).iterator();
                    while (iterator.hasNext()) {
                        block12: {
                            boolean bl4;
                            block11: {
                                _v _v2 = (_v)iterator.next();
                                b1 b12 = _v2.U(loe2, l16);
                                boolean bl5 = ((l6q)((Object)m44.a("s", (Object)this, (long)7385360662114283592L, (long)l10))).J((short)n12, b12, n11, (char)n10);
                                try {
                                    try {
                                        bl3 = bl5;
                                        CallSite callSite2 = callSite;
                                        if (l10 > 0L) {
                                            if (callSite2 != null) break block10;
                                            callSite2 = callSite;
                                        }
                                        if (callSite2 != null) break block11;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("m", (Object)n93, (long)7048384675792435016L, (long)l10);
                                    }
                                    if (!bl3) break block12;
                                }
                                catch (n9 n94) {
                                    throw m44.a("m", (Object)n94, (long)7048384675792435016L, (long)l10);
                                }
                                bl4 = true;
                            }
                            return bl4;
                        }
                        if (callSite == null) continue;
                    }
                    bl3 = false;
                }
                return bl3;
            }
            bl2 = ((l6q)((Object)m44.a("s", (Object)this, (long)7385360662114283592L, (long)l10))).J((short)n12, bn2, n11, (char)n10);
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    private void B(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [35[DOLOOP]], but top level block is 3[TRYBLOCK]
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
    public Set n(Object[] var1_1) {
        block14: {
            block13: {
                var2_2 = (bn)var1_1[0];
                var3_3 = (Long)var1_1[1];
                v0 = var3_3 = hy.a ^ var3_3;
                v1 = v0 ^ 119399843356393L;
                var5_4 = (int)(v1 >>> 48);
                var6_5 = (int)(v1 << 16 >>> 32);
                var7_6 = (int)(v1 << 48 >>> 48);
                var8_7 = v0 ^ 63735177460273L;
                var10_8 = v0 ^ 91563955583928L;
                var12_9 = v0 ^ 63735177460273L;
                var14_10 = v0 ^ 23154346874082L;
                var17_11 = var2_2.h(var8_7);
                v2 = new Object[1];
                v2[0] = var10_8;
                var18_12 = m44.a("o", (Object)v2, (long)6313088643914739231L, (long)var3_3);
                var19_13 = m44.a("q", (Object)this, (long)6151669550420765386L, (long)var3_3).t((char)var5_4, var2_2.D(), var6_5, (short)var7_6);
                var16_14 = m44.a("o", (long)5552383768890387778L, (long)var3_3);
                try {
                    v3 = var19_13;
                    if (var16_14 != null) break block13;
                    if (v3 == null) break block14;
                }
                catch (n9 v4) {
                    throw m44.a("o", (Object)v4, (long)5790156184366024386L, (long)var3_3);
                }
                v3 = var19_13;
            }
            for (_v var21_16 : v3) {
                block16: {
                    block15: {
                        try {
                            try {
                                v5 /* !! */  = var21_16.G();
                                v6 = var16_14;
                                if (var3_3 > 0L) {
                                    if (v6 != null) break block15;
                                    if (v5 /* !! */ ) {
                                    }
                                    break block16;
                                }
                                ** GOTO lbl52
                            }
                            catch (n9 v7) {
                                throw m44.a("o", (Object)v7, (long)5790156184366024386L, (long)var3_3);
                            }
                            v5 /* !! */  = m44.a("p", (Object)m44.a("q", (Object)this, (long)5539761356873778821L, (long)var3_3), (long)var14_10, (Object)var21_16.h(var12_9), (Object)var17_11, (long)5914857591897235787L, (long)var3_3);
                        }
                        catch (n9 v8) {
                            throw m44.a("o", (Object)v8, (long)5790156184366024386L, (long)var3_3);
                        }
                    }
                    try {
                        try {
                            v6 = var16_14;
lbl52:
                            // 2 sources

                            if (v6 != null || !v5 /* !! */ ) break block16;
                        }
                        catch (n9 v9) {
                            throw m44.a("o", (Object)v9, (long)5790156184366024386L, (long)var3_3);
                        }
                        v5 /* !! */  = var18_12.add((_f)var21_16);
                    }
                    catch (n9 v10) {
                        throw m44.a("o", (Object)v10, (long)5790156184366024386L, (long)var3_3);
                    }
                }
                if (var16_14 == null) continue;
            }
        }
        return var18_12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void z(Object[] var1_1) {
        block33: {
            block34: {
                block29: {
                    block30: {
                        block28: {
                            block27: {
                                var3_2 = (Long)var1_1[0];
                                var6_3 = (l62)var1_1[1];
                                var7_4 = (Set)var1_1[2];
                                var2_5 = (df)var1_1[3];
                                var5_6 = (df)var1_1[4];
                                v0 = var3_2 = hy.a ^ var3_2;
                                var8_7 = v0 ^ 87225559095467L;
                                var10_8 = v0 ^ 116411986356738L;
                                var12_9 = v0 ^ 101462457475911L;
                                var14_10 = v0 ^ 90014956670310L;
                                var16_11 = v0 ^ 79942704246449L;
                                v1 = v0 ^ 115637622985545L;
                                var18_12 = v1 >>> 32;
                                var20_13 = (int)(v1 << 32 >>> 32);
                                v2 = v0 ^ 90874201923110L;
                                var21_14 = (int)(v2 >>> 48);
                                var22_15 = (int)(v2 << 16 >>> 48);
                                var23_16 = (int)(v2 << 32 >>> 32);
                                var25_17 = m44.a("w", (Object)var6_3, (long)-2029477629529599235L, (long)var3_2);
                                var24_18 = m44.a("h", (long)-2206403460615667411L, (long)var3_2);
                                var26_19 = var2_5.J(var10_8, var25_17);
                                try {
                                    v3 = var26_19;
                                    if (var24_18 != null) break block27;
                                    if (v3 == null) break block28;
                                }
                                catch (n9 v4) {
                                    throw m44.a("h", (Object)v4, (long)-273166517619676499L, (long)var3_2);
                                }
                                v3 = var7_4;
                            }
                            v3.addAll(var26_19);
                        }
                        try {
                            v5 = var25_17.P((char)var21_14, (short)var22_15, var23_16);
                            if (var24_18 != null) break block29;
                            if (!v5) break block30;
                        }
                        catch (n9 v6) {
                            throw m44.a("h", (Object)v6, (long)-273166517619676499L, (long)var3_2);
                        }
                        v7 = new Object[2];
                        v7[1] = var20_13;
                        v7[0] = var18_12;
                        var27_20 = m44.a("w", (Object)var25_17, (Object)v7, (long)-132421245109773603L, (long)var3_2).iterator();
                        while (var27_20.hasNext()) {
                            block32: {
                                block31: {
                                    var28_21 /* !! */  = (_v)var27_20.next();
                                    var29_22 = var2_5.J(var10_8, var28_21 /* !! */ );
                                    try {
                                        try {
                                            if (var3_2 <= 0L) ** GOTO lbl106
                                            v8 /* !! */  = var29_22;
                                            if (var24_18 == null) {
                                                if (var24_18 != null) break block31;
                                            }
                                            ** GOTO lbl99
                                        }
                                        catch (n9 v9) {
                                            throw m44.a("h", (Object)v9, (long)-273166517619676499L, (long)var3_2);
                                        }
                                        if (v8 /* !! */  == null) break block32;
                                    }
                                    catch (n9 v10) {
                                        throw m44.a("h", (Object)v10, (long)-273166517619676499L, (long)var3_2);
                                    }
                                    v11 = var7_4;
                                }
                                v11.addAll(var29_22);
                            }
                            if (var24_18 == null) continue;
                        }
                    }
                    try {
                        v12 = new Object[3];
                        v12[2] = var8_7;
                        v12[1] = var7_4;
                        v12[0] = var25_17;
                        m44.a("w", (Object)var5_6, (Object)v12, (long)-524395141606700584L, (long)var3_2);
                        if (var3_2 <= 0L) break block33;
                        v13 = var25_17;
                        if (var24_18 != null) break block34;
                        v5 = v13.P((char)var21_14, (short)var22_15, var23_16);
                    }
                    catch (n9 v14) {
                        throw m44.a("h", (Object)v14, (long)-273166517619676499L, (long)var3_2);
                    }
                }
                if (!v5) break block33;
                v13 = var25_17;
            }
            v15 = new Object[2];
            v15[1] = var20_13;
            v15[0] = var18_12;
            var27_20 = m44.a("w", (Object)v13, (Object)v15, (long)-132421245109773603L, (long)var3_2).iterator();
            while (var27_20.hasNext()) {
                v8 /* !! */  = var27_20.next();
lbl99:
                // 2 sources

                var28_21 /* !! */  = (_v)v8 /* !! */ ;
                v16 = new Object[3];
                v16[2] = var8_7;
                v16[1] = var7_4;
                v16[0] = var28_21 /* !! */ ;
                m44.a("w", (Object)var5_6, (Object)v16, (long)-524395141606700584L, (long)var3_2);
lbl106:
                // 2 sources

                if (var24_18 == null) continue;
            }
        }
        v17 = new Object[1];
        v17[0] = var14_10;
        var27_20 = m44.a("w", (Object)var6_3, (Object)v17, (long)-414037159979108681L, (long)var3_2);
        try {
            v18 = var27_20;
            if (var24_18 != null) ** GOTO lbl122
            if (v18 != null) {
            }
            ** GOTO lbl144
        }
        catch (n9 v19) {
            throw m44.a("h", (Object)v19, (long)-273166517619676499L, (long)var3_2);
        }
        block16: while (true) {
            v18 = var27_20;
lbl122:
            // 2 sources

            if (!v18.hasMoreElements()) ** GOTO lbl144
            do {
                var28_21 /* !! */  = (l62)var27_20.nextElement();
                var29_22 = m44.a("w", (Object)var28_21 /* !! */ , (long)-2029477629529599235L, (long)var3_2);
                try {
                    if (var3_2 >= 0L && var29_22 != null) {
                        v20 = new Object[2];
                        v20[1] = var12_9;
                        v20[0] = var7_4;
                        v21 = new Object[5];
                        v21[4] = var5_6;
                        v21[3] = var2_5;
                        v21[2] = m44.a("h", (Object)v20, (long)-106136043899720044L, (long)var3_2);
                        v21[1] = var28_21 /* !! */ ;
                        v21[0] = var16_11;
                        m44.a("i", (Object)this, (Object)v21, (long)-2291486263793783588L, (long)var3_2);
                    }
                }
                catch (n9 v22) {
                    throw m44.a("h", (Object)v22, (long)-273166517619676499L, (long)var3_2);
                }
                if (var24_18 == null) continue block16;
lbl144:
                // 3 sources

            } while (var3_2 <= 0L);
            break;
        }
    }

    public boolean V(Object[] objectArray) {
        Object object;
        block4: {
            long l10;
            long l11;
            bn bn2;
            block5: {
                bn2 = (bn)objectArray[0];
                l11 = (Long)objectArray[1];
                l10 = (l11 = a ^ l11) ^ 0x14BA47C58253L;
                CallSite callSite = m44.a("o", (long)-3429918506674376662L, (long)l11);
                try {
                    try {
                        object = m44.a("q", (Object)this, (long)-3436923455330279986L, (long)l11).contains(bn2);
                        if (callSite != null) break block4;
                        if (!object) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)-3660660637487162454L, (long)l11);
                    }
                    return true;
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)n93, (long)-3660660637487162454L, (long)l11);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = bn2;
            objectArray2[0] = l10;
            object = m44.a("p", (Object)this, (Object)objectArray2, (long)-3604011569999082554L, (long)l11);
        }
        return object;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        hy.a = prr.a(783745151940254961L, 936928802969930494L, MethodHandles.lookup().lookupClass()).a(86649155747396L);
                        hy.d = new HashMap<K, V>(13);
                        var11 = hy.a ^ 13466114887126L;
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
                        var20_3 = new String[7];
                        var18_4 = 0;
                        var17_5 = "\u0017T\u0096\u0003\u00f5\u00b0u\u00cft\"7\u00f0\u0005V\u00af\u0085:$f\u00ee\u00d8\u00bf\u0017\u00d9\u00c7\u00ff\u00b8(\u0091\u00b4\u00c3\u009bj\u00d5C\u00c1\u009d\u00e3-A#\u00dd\u0097N\u00ce\u0012\u00db \u0012\u00f0l\u0001C\u00c9h\u00c3\u00c7\u0000\u00a9\u00b4\u009dHg\u000f\u0093`\u0084\u008a\u00f6G\u0016>\u0096\u001e\u00f3a~\u0017\u00d3\u008f\u00a7S\u0099\u00af\u00cf\u00a8\u009a7\u0010\u00f9{7\u00da\u00d4\u001fkP\u008a~z\u00f3\u0012\u00dc+r\u0018\u00cb\u0017\u00be\u00e0\u0014L4\u0083z\u0016H\u00e0\u00d4\u00ef\u00f2Gg`\u009bFu\u00dep!Ha\u00e5Sl\u001bj\u001eB\u001bk\u00fb\u00e9\u00aaC\u00a5g\u0002D\u00bd\u00c1!\u00ec\u00c2\u00a7vA\u00cfH\u00d7\u00e9\u0000\rE\u001d@\u001cp\u00d3i\u00e8\u00ca\u00b4\u00df'U\u00ba1cl\u00b3\u00b0\u001e\u008d\u0016u\u00e4\u00aa\u00de\u00d9\u00d7r~e\u0013S\u009a.WD>\u0001G\u0010\u00ae\u0090K?\u008a\u0099\u00f7\u00c4\u00bb\u00e3\u0097):\u00e8\u0001\u0001";
                        var19_6 = "\u0017T\u0096\u0003\u00f5\u00b0u\u00cft\"7\u00f0\u0005V\u00af\u0085:$f\u00ee\u00d8\u00bf\u0017\u00d9\u00c7\u00ff\u00b8(\u0091\u00b4\u00c3\u009bj\u00d5C\u00c1\u009d\u00e3-A#\u00dd\u0097N\u00ce\u0012\u00db \u0012\u00f0l\u0001C\u00c9h\u00c3\u00c7\u0000\u00a9\u00b4\u009dHg\u000f\u0093`\u0084\u008a\u00f6G\u0016>\u0096\u001e\u00f3a~\u0017\u00d3\u008f\u00a7S\u0099\u00af\u00cf\u00a8\u009a7\u0010\u00f9{7\u00da\u00d4\u001fkP\u008a~z\u00f3\u0012\u00dc+r\u0018\u00cb\u0017\u00be\u00e0\u0014L4\u0083z\u0016H\u00e0\u00d4\u00ef\u00f2Gg`\u009bFu\u00dep!Ha\u00e5Sl\u001bj\u001eB\u001bk\u00fb\u00e9\u00aaC\u00a5g\u0002D\u00bd\u00c1!\u00ec\u00c2\u00a7vA\u00cfH\u00d7\u00e9\u0000\rE\u001d@\u001cp\u00d3i\u00e8\u00ca\u00b4\u00df'U\u00ba1cl\u00b3\u00b0\u001e\u008d\u0016u\u00e4\u00aa\u00de\u00d9\u00d7r~e\u0013S\u009a.WD>\u0001G\u0010\u00ae\u0090K?\u008a\u0099\u00f7\u00c4\u00bb\u00e3\u0097):\u00e8\u0001\u0001".length();
                        var16_7 = 88;
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
                            var20_3[var18_4++] = hy.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00ea\u00b9h\u00a9M\u0084\u00f7\u00c9\u00f4\u00abEG\u00f9jE\u00f4P\u008d\u00f0\u00db&Ip\u00b8\u00e79\u00e45:\n\u009e\u00cezH/52\u000e\u00f9\u00c5\u0007\u00df\t\u00dc\u009a\u00c1\u0083\u0097\n\u009c\u0090\u001b\u0097-\u00c6\b^LM8\u0097\u0010:\n\f\u00e2Ei\u0084\u0000 :P?\u00cb|\u00cc\u0093\u00b9\u0006\u00cb\u0099/\u00ec\u0083\u00a1z2\u00d5X~\u00c7\u00c0\u00f2\u001d\u00de\u00a2";
                            var19_6 = "\u00ea\u00b9h\u00a9M\u0084\u00f7\u00c9\u00f4\u00abEG\u00f9jE\u00f4P\u008d\u00f0\u00db&Ip\u00b8\u00e79\u00e45:\n\u009e\u00cezH/52\u000e\u00f9\u00c5\u0007\u00df\t\u00dc\u009a\u00c1\u0083\u0097\n\u009c\u0090\u001b\u0097-\u00c6\b^LM8\u0097\u0010:\n\f\u00e2Ei\u0084\u0000 :P?\u00cb|\u00cc\u0093\u00b9\u0006\u00cb\u0099/\u00ec\u0083\u00a1z2\u00d5X~\u00c7\u00c0\u00f2\u001d\u00de\u00a2".length();
                            var16_7 = 16;
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
                            var20_3[var18_4++] = hy.a(var21_9).intern();
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
                hy.b = var20_3;
                hy.c = new String[7];
                hy.g = new HashMap<K, V>(13);
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
                var6_12 = new long[2];
                var3_13 = 0;
                var4_14 = "&\u00ce\u00e1\u0000I\u00af\u00bb\u0080\u00fb\u00d4+s%\u00a0n\u00e7";
                var5_15 = "&\u00ce\u00e1\u0000I\u00af\u00bb\u0080\u00fb\u00d4+s%\u00a0n\u00e7".length();
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
        hy.e = var6_12;
        hy.f = new Integer[2];
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x4977;
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
                throw new RuntimeException("com/zelix/hy", exception);
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
            hy.c[n11] = hy.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = hy.a(n10, l10);
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
            throw new RuntimeException("com/zelix/hy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x184B;
        if (f[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = e[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/hy", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            hy.f[n11] = n12;
        }
        return f[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = hy.b(n10, l10);
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
            throw new RuntimeException("com/zelix/hy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(hy.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(hy.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

