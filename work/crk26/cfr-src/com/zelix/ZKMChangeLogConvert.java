/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.em;
import com.zelix.lke;
import com.zelix.lo0;
import com.zelix.loq;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.s4;
import com.zelix.sz;
import java.io.File;
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

public class ZKMChangeLogConvert
extends lo0 {
    private final File K;
    private int J;
    private int S;
    private final File h;
    private int a;
    private lke Z;
    private lqu P;
    private int i;
    private final loq z;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map j;

    /*
     * Exception decompiling
     */
    private void z(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [21[CATCHBLOCK]], but top level block is 9[TRYBLOCK]
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
    private void L(Object[] var1_1) {
        block34: {
            block33: {
                block31: {
                    block32: {
                        block29: {
                            block30: {
                                block27: {
                                    block25: {
                                        block26: {
                                            block23: {
                                                block24: {
                                                    var2_2 = (Long)var1_1[0];
                                                    v0 = var2_2 = ZKMChangeLogConvert.b ^ var2_2;
                                                    var4_3 = v0 ^ 5681167212807L;
                                                    var6_4 = v0 ^ 86309683330907L;
                                                    var8_5 = v0 ^ 6924099676480L;
                                                    var10_6 = v0 ^ 117274413585929L;
                                                    var12_7 = v0 ^ 109335181881616L;
                                                    var15_8 = false;
                                                    var14_9 = m44.a("i", (long)-7089118716265461516L, (long)var2_2);
                                                    var16_10 /* !! */  = false;
                                                    try {
                                                        try {
                                                            try {
                                                                v1 /* !! */  = m44.a("w", (Object)this, (long)-8678549173801226755L, (long)var2_2);
                                                                if (var14_9 != false) break block23;
                                                                v2 = new Object[1];
                                                                v2[0] = var6_4;
                                                                if (v1 /* !! */  < m44.a("v", (Object)m44.a("w", (Object)this, (long)-7166254649848742880L, (long)var2_2), (Object)v2, (long)-9188020508399724566L, (long)var2_2)) break block24;
                                                            }
                                                            catch (n9 v3) {
                                                                throw m44.a("i", (Object)v3, (long)-9007921559101939795L, (long)var2_2);
                                                            }
                                                            v4 /* !! */  = m44.a("w", (Object)this, (long)-6972065425700065501L, (long)var2_2);
                                                            v5 = new Object[1];
                                                            v5[0] = var8_5;
                                                            v6 = m44.a("v", (Object)m44.a("w", (Object)this, (long)-7166254649848742880L, (long)var2_2), (Object)v5, (long)-9145235553739566775L, (long)var2_2);
                                                            if (var2_2 <= 0L || var14_9 != false) break block25;
                                                        }
                                                        catch (n9 v7) {
                                                            throw m44.a("i", (Object)v7, (long)-9007921559101939795L, (long)var2_2);
                                                        }
                                                        if (v4 /* !! */  >= v6) break block26;
                                                    }
                                                    catch (n9 v8) {
                                                        throw m44.a("i", (Object)v8, (long)-9007921559101939795L, (long)var2_2);
                                                    }
                                                }
                                                var15_8 = true;
                                                v1 /* !! */  = (CallSite)true;
                                            }
                                            var16_10 /* !! */  = v1 /* !! */ ;
                                        }
                                        try {
                                            v4 /* !! */  = m44.a("w", (Object)this, (long)-9160447503707692311L, (long)var2_2);
                                            v6 = var14_9;
                                            if (var2_2 < 0L) break block25;
                                            if (v6 != false) break block27;
                                            v9 = new Object[1];
                                            v9[0] = var4_3;
                                            v6 = m44.a("v", (Object)m44.a("w", (Object)this, (long)-7166254649848742880L, (long)var2_2), (Object)v9, (long)-9156530259566229667L, (long)var2_2);
                                        }
                                        catch (n9 v10) {
                                            throw m44.a("i", (Object)v10, (long)-9007921559101939795L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        block28: {
                                            try {
                                                try {
                                                    if (var2_2 > 0L) {
                                                        if (v4 /* !! */  < v6) break block28;
                                                        v11 = m44.a("w", (Object)this, (long)-7458053277787721930L, (long)var2_2);
                                                        v6 = var14_9;
                                                    }
                                                    if (var2_2 >= 0L) {
                                                        if (v6 != false) break block29;
                                                    }
                                                    ** GOTO lbl90
                                                }
                                                catch (n9 v12) {
                                                    throw m44.a("i", (Object)v12, (long)-9007921559101939795L, (long)var2_2);
                                                }
                                                v13 = new Object[1];
                                                v13[0] = var10_6;
                                                if (v11 >= m44.a("v", (Object)m44.a("w", (Object)this, (long)-7166254649848742880L, (long)var2_2), (Object)v13, (long)-7011962463887216103L, (long)var2_2)) break block30;
                                            }
                                            catch (n9 v14) {
                                                throw m44.a("i", (Object)v14, (long)-9007921559101939795L, (long)var2_2);
                                            }
                                        }
                                        v4 /* !! */  = (CallSite)true;
                                    }
                                    catch (n9 v15) {
                                        throw m44.a("i", (Object)v15, (long)-9007921559101939795L, (long)var2_2);
                                    }
                                }
                                var16_10 /* !! */  = v4 /* !! */ ;
                            }
                            v11 = var16_10 /* !! */ ;
                        }
                        try {
                            try {
                                v6 = var14_9;
lbl90:
                                // 2 sources

                                if (var2_2 > 0L) {
                                    if (v6 != false) break block31;
                                    if (v11 == false) break block32;
                                }
                                ** GOTO lbl109
                            }
                            catch (n9 v16) {
                                throw m44.a("i", (Object)v16, (long)-9007921559101939795L, (long)var2_2);
                            }
                            v17 = new Object[1];
                            v17[0] = var12_7;
                            m44.a("v", (Object)m44.a("m", (long)-8704024343626439868L, (long)var2_2), (Object)m44.a("v", (Object)m44.a("w", (Object)this, (long)-7166254649848742880L, (long)var2_2), (Object)v17, (long)-7425756210991412633L, (long)var2_2), (long)-7297111335272087378L, (long)var2_2);
                        }
                        catch (n9 v18) {
                            throw m44.a("i", (Object)v18, (long)-9007921559101939795L, (long)var2_2);
                        }
                    }
                    v11 = var15_8;
                }
                try {
                    v6 = var14_9;
lbl109:
                    // 2 sources

                    if (v6 != false) break block33;
                    if (v11 == false) break block34;
                }
                catch (n9 v19) {
                    throw m44.a("i", (Object)v19, (long)-9007921559101939795L, (long)var2_2);
                }
                v11 = 1;
            }
            m44.a("i", (int)v11, (long)-7017787228985322356L, (long)var2_2);
        }
    }

    private void b(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = b ^ l10;
        long l12 = l11 ^ 0xE6A7116F6EDL;
        long l13 = l11 ^ 0x453F44E128B1L;
        long l14 = l11 ^ 0xD0CEA62BEAAL;
        long l15 = l11 ^ 0x61E9DD2181E3L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l15;
        m44.a("w", (Object)this, (int)m44.a("t", (Object)m44.a("u", (Object)this, (long)5433120287243955146L, (long)l10), (Object)objectArray2, (long)5285688890630596083L, (long)l10), (long)5734673654569285852L, (long)l10);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l12;
        m44.a("w", (Object)this, (int)m44.a("t", (Object)m44.a("u", (Object)this, (long)5433120287243955146L, (long)l10), (Object)objectArray3, (long)6271107994521587895L, (long)l10), (long)6284077045446178051L, (long)l10);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l14;
        m44.a("w", (Object)this, (int)m44.a("t", (Object)m44.a("u", (Object)this, (long)5433120287243955146L, (long)l10), (Object)objectArray4, (long)6268891897116640931L, (long)l10), (long)5247876844824279241L, (long)l10);
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l13;
        m44.a("w", (Object)this, (int)m44.a("t", (Object)m44.a("u", (Object)this, (long)5433120287243955146L, (long)l10), (Object)objectArray5, (long)6311675339444994048L, (long)l10), (long)5793197854100273687L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ZKMChangeLogConvert(String var1_1, String var2_2, String var3_3) {
        block40: {
            block42: {
                block41: {
                    block38: {
                        block37: {
                            block36: {
                                block34: {
                                    block35: {
                                        v0 = var4_4 = ZKMChangeLogConvert.b ^ 88247999211045L;
                                        v1 = v0 ^ 5442393766792L;
                                        var6_5 = (int)(v1 >>> 32);
                                        var7_6 = (int)(v1 << 32 >>> 48);
                                        var8_7 = (int)(v1 << 48 >>> 48);
                                        var9_8 = v0 ^ 87090629983034L;
                                        var11_9 = v0 ^ 130531366122387L;
                                        var13_10 = v0 ^ 40579378359999L;
                                        var15_11 = v0 ^ 26906075629864L;
                                        var17_12 = v0 ^ 38413081931919L;
                                        var19_13 = v0 ^ 97028130843005L;
                                        var21_14 = v0 ^ 71226138888681L;
                                        var23_15 = v0 ^ 34791047477573L;
                                        v2 = m44.a("k", (long)-1692161041113874962L, (long)var4_4);
                                        super();
                                        var25_16 = v2;
                                        try {
                                            this.h = new File(var1_1);
                                            v3 = this;
                                            if (var25_16 != false) break block34;
                                            v3.K = new File(var2_2);
                                            if (var3_3 != null) {
                                            }
                                            ** GOTO lbl64
                                        }
                                        catch (n9 v4) {
                                            throw m44.a("k", (Object)v4, (long)-583436635720439113L, (long)var4_4);
                                        }
                                        try {
                                            try {
                                                v5 /* !! */  = var3_3.length();
                                                if (var25_16 != false) break block35;
                                                if (v5 /* !! */  > 0) {
                                                }
                                                ** GOTO lbl64
                                            }
                                            catch (n9 v6) {
                                                throw m44.a("k", (Object)v6, (long)-583436635720439113L, (long)var4_4);
                                            }
                                            v7 = new Object[2];
                                            v7[1] = var13_10;
                                            v7[0] = var3_3;
                                            v5 /* !! */  = (int)m44.a("k", (Object)v7, (long)-716422225805196564L, (long)var4_4);
                                        }
                                        catch (n9 v8) {
                                            throw m44.a("k", (Object)v8, (long)-583436635720439113L, (long)var4_4);
                                        }
                                    }
                                    var26_17 = new s4(var19_13, var3_3);
                                    v9 = new Object[2];
                                    v9[1] = new em((s4)var26_17, (boolean)m44.a("o", (long)-1419120332841205886L, (long)var4_4), var11_9);
                                    v9[0] = var9_8;
                                    m44.a("t", (Object)var26_17, (Object)v9, (long)-700121295853316051L, (long)var4_4);
                                    v10 = new Object[3];
                                    v10[2] = new sz(var6_5, (short)var7_6, (char)var8_7);
                                    v10[1] = new sz(var6_5, (short)var7_6, (char)var8_7);
                                    v10[0] = var15_11;
                                    var27_18 = m44.a("t", (Object)var26_17, (Object)v10, (long)-827977153668373485L, (long)var4_4);
                                    try {
                                        this.z = new loq((s4)var26_17, var21_14, (boolean)m44.a("o", (long)-1419120332841205886L, (long)var4_4));
                                        if (var25_16 == false) break block36;
lbl64:
                                        // 3 sources

                                        v3 = this;
                                    }
                                    catch (n9 v11) {
                                        throw m44.a("k", (Object)v11, (long)-583436635720439113L, (long)var4_4);
                                    }
                                }
                                v3.z = null;
                            }
                            try {
                                try {
                                    v12 = m44.a("t", (Object)m44.a("u", (Object)this, (long)-1486303297627702990L, (long)var4_4), (long)-1493009931995910497L, (long)var4_4);
                                    if (var25_16 != false) break block37;
                                    if (v12 != false) {
                                    }
                                    ** GOTO lbl93
                                }
                                catch (n9 v13) {
                                    throw m44.a("k", (Object)v13, (long)-583436635720439113L, (long)var4_4);
                                }
                                v12 = m44.a("t", (Object)m44.a("u", (Object)this, (long)-1486303297627702990L, (long)var4_4), (long)-688076695663133431L, (long)var4_4);
                            }
                            catch (n9 v14) {
                                throw m44.a("k", (Object)v14, (long)-583436635720439113L, (long)var4_4);
                            }
                        }
                        try {
                            block39: {
                                try {
                                    try {
                                        if (var25_16 != false) break block38;
                                        if (v12 == false) break block39;
                                    }
                                    catch (n9 v15) {
                                        throw m44.a("k", (Object)v15, (long)-583436635720439113L, (long)var4_4);
                                    }
lbl93:
                                    // 2 sources

                                    m44.a("t", (Object)m44.a("o", (long)-802133114590147076L, (long)var4_4), (Object)((String)ZKMChangeLogConvert.a("p", (int)14947, (long)(4085836851681026247L ^ var4_4)) + (String)m44.a("t", (Object)m44.a("u", (Object)this, (long)-1486303297627702990L, (long)var4_4), (long)-1499578769186548149L, (long)var4_4) + (String)ZKMChangeLogConvert.a("p", (int)20603, (long)(3939109324189600475L ^ var4_4))), (long)-1179613734123080268L, (long)var4_4);
                                    if (var25_16 == false) break block40;
                                }
                                catch (n9 v16) {
                                    throw m44.a("k", (Object)v16, (long)-583436635720439113L, (long)var4_4);
                                }
                            }
                            v12 = m44.a("t", (Object)m44.a("u", (Object)this, (long)-866656016463613893L, (long)var4_4), (long)-688076695663133431L, (long)var4_4);
                        }
                        catch (n9 v17) {
                            throw m44.a("k", (Object)v17, (long)-583436635720439113L, (long)var4_4);
                        }
                    }
                    try {
                        if (v12 == false) break block41;
                        m44.a("t", (Object)m44.a("o", (long)-802133114590147076L, (long)var4_4), (Object)((String)ZKMChangeLogConvert.a("p", (int)13175, (long)(4345986100849112L ^ var4_4)) + (String)m44.a("t", (Object)m44.a("u", (Object)this, (long)-866656016463613893L, (long)var4_4), (long)-1499578769186548149L, (long)var4_4) + (String)ZKMChangeLogConvert.a("p", (int)27377, (long)(8670907955356119129L ^ var4_4))), (long)-1179613734123080268L, (long)var4_4);
                        if (var25_16 == false) break block40;
                    }
                    catch (n9 v18) {
                        throw m44.a("k", (Object)v18, (long)-583436635720439113L, (long)var4_4);
                    }
                }
                var26_17 = new sz(var6_5, (short)var7_6, (char)var8_7);
                try {
                    try {
                        v19 = new Object[2];
                        v19[1] = var17_12;
                        v19[0] = var26_17;
                        m44.a("j", (Object)this, (Object)v19, (long)-1094045875234704152L, (long)var4_4);
                        if (var25_16 != false) break block42;
                        if (var26_17.a(var23_15)) {
                        }
                        ** GOTO lbl133
                    }
                    catch (n9 v20) {
                        throw m44.a("k", (Object)v20, (long)-583436635720439113L, (long)var4_4);
                    }
                    m44.a("t", (Object)m44.a("o", (long)-802133114590147076L, (long)var4_4), (Object)((String)ZKMChangeLogConvert.a("p", (int)6300, (long)(3238265057319109163L ^ var4_4)) + (String)m44.a("t", (Object)m44.a("u", (Object)this, (long)-1486303297627702990L, (long)var4_4), (long)-1499578769186548149L, (long)var4_4) + (String)ZKMChangeLogConvert.a("p", (int)8302, (long)(8001107635676478171L ^ var4_4)) + (String)m44.a("t", (Object)m44.a("u", (Object)this, (long)-866656016463613893L, (long)var4_4), (long)-1499578769186548149L, (long)var4_4) + "'"), (long)-1179613734123080268L, (long)var4_4);
                }
                catch (n9 v21) {
                    throw m44.a("k", (Object)v21, (long)-583436635720439113L, (long)var4_4);
                }
            }
            try {
                if (var25_16 == false) break block40;
lbl133:
                // 2 sources

                m44.a("t", (Object)m44.a("o", (long)-802133114590147076L, (long)var4_4), (Object)((String)ZKMChangeLogConvert.a("p", (int)20661, (long)(1583041250747255304L ^ var4_4)) + (String)var26_17.t()), (long)-1179613734123080268L, (long)var4_4);
            }
            catch (n9 v22) {
                throw m44.a("k", (Object)v22, (long)-583436635720439113L, (long)var4_4);
            }
        }
        try {
            if (m44.a("k", (long)-1541849778219658333L, (long)var4_4) == null) {
                m44.a("k", (int)(++var25_16), (long)-602615951845389358L, (long)var4_4);
            }
        }
        catch (n9 v23) {
            throw m44.a("k", (Object)v23, (long)-583436635720439113L, (long)var4_4);
        }
    }

    public static void main(String[] stringArray) {
        String string;
        String string2;
        String string3;
        ZKMChangeLogConvert zKMChangeLogConvert;
        long l10;
        block11: {
            int n10;
            block12: {
                int n11;
                block10: {
                    l10 = prr.a(746675452397906257L, -1361089526612468222L, MethodHandles.lookup().lookupClass()).a(41255675593944L) ^ 0x402CF6B474D2L;
                    CallSite callSite = m44.a("n", (long)-3448515479309874513L, (long)l10);
                    try {
                        try {
                            try {
                                n10 = stringArray.length;
                                n11 = 2;
                                if (callSite == false) break block10;
                                if (n10 == n11) break block11;
                            }
                            catch (n9 n92) {
                                throw m44.a("n", (Object)n92, (long)-3773392389386856718L, (long)l10);
                            }
                            n10 = stringArray.length;
                            if (callSite == false) break block12;
                        }
                        catch (n9 n93) {
                            throw m44.a("n", (Object)n93, (long)-3773392389386856718L, (long)l10);
                        }
                        n11 = 3;
                    }
                    catch (n9 n94) {
                        throw m44.a("n", (Object)n94, (long)-3773392389386856718L, (long)l10);
                    }
                }
                try {
                    if (n10 == n11) break block11;
                    m44.a("q", (Object)m44.a("j", (long)-3991525403964018247L, (long)l10), (Object)ZKMChangeLogConvert.a("p", (int)5921, (long)(0xFF92C55A290F1CDL ^ l10)), (long)-3178367699798734351L, (long)l10);
                    n10 = 1;
                }
                catch (n9 n95) {
                    throw m44.a("n", (Object)n95, (long)-3773392389386856718L, (long)l10);
                }
            }
            m44.a("n", (int)n10, (long)-2899025967001051693L, (long)l10);
        }
        try {
            ZKMChangeLogConvert zKMChangeLogConvert2;
            zKMChangeLogConvert = zKMChangeLogConvert2;
            string3 = stringArray[0];
            string2 = stringArray[1];
            string = stringArray.length == 3 ? stringArray[2] : null;
        }
        catch (n9 n96) {
            throw m44.a("n", (Object)n96, (long)-3773392389386856718L, (long)l10);
        }
        zKMChangeLogConvert(string3, string2, string);
    }

    /*
     * Exception decompiling
     */
    private void I(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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
                        ZKMChangeLogConvert.b = prr.a(-7362104312068254199L, 4831597676481465756L, MethodHandles.lookup().lookupClass()).a(222807785162868L);
                        ZKMChangeLogConvert.e = new HashMap<K, V>(13);
                        var11 = ZKMChangeLogConvert.b ^ 26478907836399L;
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
                        var17_5 = "\u00bc\u00e7mY\u00f7\u0085\u00c7\u0085P\t\u0098GX\u00bc\u0010sNW\u0098V\u00b5\u00c1:\u00b3\u008cN\u008c\u0080\u00b5r\u00c9\u00a2\u00abF\u00a7^z\u0001\u00c5\u0082\u0010\u008e\u0013\u00c0\u00ea\u00fd\u00d5\u009a\u00a3\u00eb\u00e0\u00d1\u00d1\u00f0l\\\u000f\u0010n)F\u0002\u00d2\u00f1\u00c7\u00c9HVC\u00c5\u00feug\u00d0\u00103q\u00d4 \u00d8\u008a\u00ee\u00a4\u00ae\u0001&\u0015n6\u00fcG0{\u0016%\u00ea\u001fQ\u00c2\t\u00c9\u0098vES\u00d9Y\u00d6\u00ce\u00d0H\u0005\u00f4/\u00bc/\u000b\u00d2r{WH\u00111\u00c57;b\u00f3\u009d\u00b1{\u00c1\u00de[\u00a0\u00a1\u00a8JH@\u00ee\u0092\u0007+\r3\u00f5\u00bc%<3\u009b\u00ac\u000eg\u00baB.\u00e6\u00c8|7-&\b\u0097c\u00ca/4SumLI\u0093\u00b0'Z\u00ed\u008c\u0001\u00c8\u00b2\u0097n\u00ed\u000bsn\u00c8N\u0014\u00e99\u008bA)\u00c1\u00f4\u008c\u001e\u00f2\u00a4 \u00e4\u00af\u00d9\u0094\u00e48\u00f7\u008bY\u00e6`N\\\u00aefX\u00d7\u0082j\u00c6\u0018\u00a6\u00ae;\u0085\u0013\u0003\u001f\u008b\u00c8 \u00ee\u0018\u00e2\u009c\u00adcf\u00b4\u000b\u00d3\u001d]\u008b\u00ce\u0095\u00cb\u0080\u00c2x\u009a\u00cfB\u00aa\u00be \u00f3\u0010eX\u0086g\u00f6~\nY\u00fby:\u00ea\u007f\u0086\u0096\r\u0010\u00b2\u0090\u00c6\u001b\u00fe|\u008f\u0092i\u0086\u0088\u0097c\u007fm\u00fb\u0010\u00f3\u00cc\u00bfN\u0016\u00d1\u00a0<\u0001jV\u001f\u0084\u00ad\u00a1d\u0018\u00fa\u008c\u0087\u0095\u00d3\u0081\u000e\u0097\u0016,\u00e3\u00af\u0083\u00f1-\u00c7\u00aa\u00173\u00b6\u00d29\u00f2[\u00b8\u0089\u00f0J\u00dcp\u00d0QmR\u00f6\u00d4\u009aa\u00e4\u00b3\u00b8\u00cb?q\u0092\u008d#\u0084$\u00c9(\u00d5`+\u008f\f\u00e8v\u00e6b\u009b\u00bbr8]\u0010\u0007\u00fb7\u00b8vi[\u00ccR\u0086lu\u000f\u007f\u00a7\u0013\u000f-\u00e2\u0099,i\u00deI7\u00b2\u00e6m_\u008bLaS\u009b\u00eb\u0005\u00b1\u00f6\u0003\u0083\nx\u00fb|bN(7F\u0013}\u00df\u00df\u00ff3B\u0017\u00d7\u0001\u00ef\u0085n\u00a8\u00a1ZBx\u00be\u00819\u00ed5\u00f9rQ\u00b0\u00d73\u00a0\u000b.*oe\u00ff\u00f8\u0017\u00ffq\u00f8\u00c3HU?\u00eb~\u00e1<\u00a3\u0087@\u00a4\u009eN\u009d1\u00bd\u00c3\u00fabdSj&*\u00ce'\u00fe0\u00ad_\u0005@*\u00c2m\u0019\u00f2\u008f\f&{\u00b5\u00cd\u00b2\u00e7\u00f5\u00d0e=\u0085\u00de=0@J\u00d7\u00a3\u00b1\u0091\u0003x\u00be\u009fL\u00adt\u009a\u00fdH\u00b8\u0093\u00c6%\u00a5\u008ai\u00b5\u0080RD\u0080\u00e8]\u008c1\u00c3\u00d9O\u00d3a\u0093\u00d2\u0097\u00d1\u00ab\u0000\u00c8\u001co\u00d6SHO\u0004\u00b1\u00e1\u0013\u00ca\u001dzh\u00dd.\u0093\u00e0\u00ed\u009b\u00be\u0013\u00c1\u008cT)\u0086\u00dc\u0002@\u009c\n\u00bd\u0089\u00a6\f\u009c\u00c0O\u00e3\u0090\u0019\u00d1Y\u000eP\u009e[r\u001d\u00dd\u00d4v\u0089N\u00ad\u0094\u00bdq\t\u00d1n\u001c\u000e\u00dby\u00ad+K\u0015\u00fd\u0006\u0082^\u00fb{\u0085(\u00b7\u00c3om\u0016A\f\u00b9\u0003\u00ec\u0081\u001a\u00b11\u00d06\u00adc\u008b\u00c7\u00b8\u00ca\u00b1\u00ae\u00f6MB\u00c1~K\u00e1\u00d9-:\u009c\u0017v\u0088\u009d\u0005 \u00dczm\u00d6\u00f7\u0011=#\u001f\u007f;\u00b6\u0086\u0017\u0082\u0010\u00fb\u00d5\u009b\u0013\u00f1\u00b8\u001a\u00e8h<p\u00c3\u00fd\u009aG\u009d\u0010\u00eb\u00d89>\u00d4r n\u00ccuUmt\u0017\u00966(\u008e]\u00dd\ng\u00c5%Y\u00d1F\u00b1t\u00c1\u00dcD\u00c7\u0010\u008ag\u00a0\u0090\u0091,\u00a7i\u0095\n\u0089\u000e\u00eeRP\u0087\u00c5\u0006({W\u00a7\u0098\u0010\u001doN\u00e7\u001cu^\u00ce\u00b5 -\b\u00fe>\u00dc\u00ea`\u00edC\u008f14\u00c1\u0002\u001b\u0016\u00af\u00f5\u00ee\u00d7\u00dc\u0015\u001eW\u00ea\u00ca]*EO?\u00ad\u008d*CX\u00b3\u00f2\u00b6\u009f\u00cd\u00ac\u00fcXn5\u00b5\u00c0\\\u0018\t\u008b\u00c6\u00a8\u00aa&\u0081\u0085k #\u00db\u0095\u00cdJv1;8\u008aW@\u00e7l\u00c5\u0089~2\u00aa\u00e0\u00add$=\u0097pq*\u00f5\u0011\u00f1\u00c8q\u00e5\u0015a\u0081\u0093\u00dc\u00a6\u001a\u00c7F8\u00bea\u00c9\t~x\u00eeK\u00d0,\u00c1[\u00a8c6f\u0092\u001f+4T\u00f3\u0083b)\u00d5U2\u00cc\u00aa\u00e1\u00ab\u0097\u00077\u00bdM8\u00c1\u00073\r\u008d\u00dc\\G\u00d9g%.\u00ca\b\u00c4\u0011m\u0003\u0010\"kc5Nt\u0088r\u001b4QU=\u00d2\u001c\u00db";
                        var19_6 = "\u00bc\u00e7mY\u00f7\u0085\u00c7\u0085P\t\u0098GX\u00bc\u0010sNW\u0098V\u00b5\u00c1:\u00b3\u008cN\u008c\u0080\u00b5r\u00c9\u00a2\u00abF\u00a7^z\u0001\u00c5\u0082\u0010\u008e\u0013\u00c0\u00ea\u00fd\u00d5\u009a\u00a3\u00eb\u00e0\u00d1\u00d1\u00f0l\\\u000f\u0010n)F\u0002\u00d2\u00f1\u00c7\u00c9HVC\u00c5\u00feug\u00d0\u00103q\u00d4 \u00d8\u008a\u00ee\u00a4\u00ae\u0001&\u0015n6\u00fcG0{\u0016%\u00ea\u001fQ\u00c2\t\u00c9\u0098vES\u00d9Y\u00d6\u00ce\u00d0H\u0005\u00f4/\u00bc/\u000b\u00d2r{WH\u00111\u00c57;b\u00f3\u009d\u00b1{\u00c1\u00de[\u00a0\u00a1\u00a8JH@\u00ee\u0092\u0007+\r3\u00f5\u00bc%<3\u009b\u00ac\u000eg\u00baB.\u00e6\u00c8|7-&\b\u0097c\u00ca/4SumLI\u0093\u00b0'Z\u00ed\u008c\u0001\u00c8\u00b2\u0097n\u00ed\u000bsn\u00c8N\u0014\u00e99\u008bA)\u00c1\u00f4\u008c\u001e\u00f2\u00a4 \u00e4\u00af\u00d9\u0094\u00e48\u00f7\u008bY\u00e6`N\\\u00aefX\u00d7\u0082j\u00c6\u0018\u00a6\u00ae;\u0085\u0013\u0003\u001f\u008b\u00c8 \u00ee\u0018\u00e2\u009c\u00adcf\u00b4\u000b\u00d3\u001d]\u008b\u00ce\u0095\u00cb\u0080\u00c2x\u009a\u00cfB\u00aa\u00be \u00f3\u0010eX\u0086g\u00f6~\nY\u00fby:\u00ea\u007f\u0086\u0096\r\u0010\u00b2\u0090\u00c6\u001b\u00fe|\u008f\u0092i\u0086\u0088\u0097c\u007fm\u00fb\u0010\u00f3\u00cc\u00bfN\u0016\u00d1\u00a0<\u0001jV\u001f\u0084\u00ad\u00a1d\u0018\u00fa\u008c\u0087\u0095\u00d3\u0081\u000e\u0097\u0016,\u00e3\u00af\u0083\u00f1-\u00c7\u00aa\u00173\u00b6\u00d29\u00f2[\u00b8\u0089\u00f0J\u00dcp\u00d0QmR\u00f6\u00d4\u009aa\u00e4\u00b3\u00b8\u00cb?q\u0092\u008d#\u0084$\u00c9(\u00d5`+\u008f\f\u00e8v\u00e6b\u009b\u00bbr8]\u0010\u0007\u00fb7\u00b8vi[\u00ccR\u0086lu\u000f\u007f\u00a7\u0013\u000f-\u00e2\u0099,i\u00deI7\u00b2\u00e6m_\u008bLaS\u009b\u00eb\u0005\u00b1\u00f6\u0003\u0083\nx\u00fb|bN(7F\u0013}\u00df\u00df\u00ff3B\u0017\u00d7\u0001\u00ef\u0085n\u00a8\u00a1ZBx\u00be\u00819\u00ed5\u00f9rQ\u00b0\u00d73\u00a0\u000b.*oe\u00ff\u00f8\u0017\u00ffq\u00f8\u00c3HU?\u00eb~\u00e1<\u00a3\u0087@\u00a4\u009eN\u009d1\u00bd\u00c3\u00fabdSj&*\u00ce'\u00fe0\u00ad_\u0005@*\u00c2m\u0019\u00f2\u008f\f&{\u00b5\u00cd\u00b2\u00e7\u00f5\u00d0e=\u0085\u00de=0@J\u00d7\u00a3\u00b1\u0091\u0003x\u00be\u009fL\u00adt\u009a\u00fdH\u00b8\u0093\u00c6%\u00a5\u008ai\u00b5\u0080RD\u0080\u00e8]\u008c1\u00c3\u00d9O\u00d3a\u0093\u00d2\u0097\u00d1\u00ab\u0000\u00c8\u001co\u00d6SHO\u0004\u00b1\u00e1\u0013\u00ca\u001dzh\u00dd.\u0093\u00e0\u00ed\u009b\u00be\u0013\u00c1\u008cT)\u0086\u00dc\u0002@\u009c\n\u00bd\u0089\u00a6\f\u009c\u00c0O\u00e3\u0090\u0019\u00d1Y\u000eP\u009e[r\u001d\u00dd\u00d4v\u0089N\u00ad\u0094\u00bdq\t\u00d1n\u001c\u000e\u00dby\u00ad+K\u0015\u00fd\u0006\u0082^\u00fb{\u0085(\u00b7\u00c3om\u0016A\f\u00b9\u0003\u00ec\u0081\u001a\u00b11\u00d06\u00adc\u008b\u00c7\u00b8\u00ca\u00b1\u00ae\u00f6MB\u00c1~K\u00e1\u00d9-:\u009c\u0017v\u0088\u009d\u0005 \u00dczm\u00d6\u00f7\u0011=#\u001f\u007f;\u00b6\u0086\u0017\u0082\u0010\u00fb\u00d5\u009b\u0013\u00f1\u00b8\u001a\u00e8h<p\u00c3\u00fd\u009aG\u009d\u0010\u00eb\u00d89>\u00d4r n\u00ccuUmt\u0017\u00966(\u008e]\u00dd\ng\u00c5%Y\u00d1F\u00b1t\u00c1\u00dcD\u00c7\u0010\u008ag\u00a0\u0090\u0091,\u00a7i\u0095\n\u0089\u000e\u00eeRP\u0087\u00c5\u0006({W\u00a7\u0098\u0010\u001doN\u00e7\u001cu^\u00ce\u00b5 -\b\u00fe>\u00dc\u00ea`\u00edC\u008f14\u00c1\u0002\u001b\u0016\u00af\u00f5\u00ee\u00d7\u00dc\u0015\u001eW\u00ea\u00ca]*EO?\u00ad\u008d*CX\u00b3\u00f2\u00b6\u009f\u00cd\u00ac\u00fcXn5\u00b5\u00c0\\\u0018\t\u008b\u00c6\u00a8\u00aa&\u0081\u0085k #\u00db\u0095\u00cdJv1;8\u008aW@\u00e7l\u00c5\u0089~2\u00aa\u00e0\u00add$=\u0097pq*\u00f5\u0011\u00f1\u00c8q\u00e5\u0015a\u0081\u0093\u00dc\u00a6\u001a\u00c7F8\u00bea\u00c9\t~x\u00eeK\u00d0,\u00c1[\u00a8c6f\u0092\u001f+4T\u00f3\u0083b)\u00d5U2\u00cc\u00aa\u00e1\u00ab\u0097\u00077\u00bdM8\u00c1\u00073\r\u008d\u00dc\\G\u00d9g%.\u00ca\b\u00c4\u0011m\u0003\u0010\"kc5Nt\u0088r\u001b4QU=\u00d2\u001c\u00db".length();
                        var16_7 = 40;
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
                            var20_3[var18_4++] = ZKMChangeLogConvert.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "P\u00act,\u00bae\u00b7\u00e1`\u0017\b\u00c8D.\u00c8\u00b8K\u00be\u00ffS\u00fa\u0006K\u00b5\u00a5Z)\u00d3\u00fcC\u00e5\u00e8\u00c6.\u00f65\u00a4\u00a0\u009d\u00aeZ\u0089\u0010\u00d1\u00bdYX\u009c\u0010\u00e2\u00a1\u00bf\u00b5\u00b6$t\u00f0\u00c9;j\u0089wS3\u00b4";
                            var19_6 = "P\u00act,\u00bae\u00b7\u00e1`\u0017\b\u00c8D.\u00c8\u00b8K\u00be\u00ffS\u00fa\u0006K\u00b5\u00a5Z)\u00d3\u00fcC\u00e5\u00e8\u00c6.\u00f65\u00a4\u00a0\u009d\u00aeZ\u0089\u0010\u00d1\u00bdYX\u009c\u0010\u00e2\u00a1\u00bf\u00b5\u00b6$t\u00f0\u00c9;j\u0089wS3\u00b4".length();
                            var16_7 = 48;
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
                            var20_3[var18_4++] = ZKMChangeLogConvert.b(var21_9).intern();
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
                ZKMChangeLogConvert.c = var20_3;
                ZKMChangeLogConvert.d = new String[25];
                ZKMChangeLogConvert.j = new HashMap<K, V>(13);
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
                var6_12 = new long[6];
                var3_13 = 0;
                var4_14 = "\u00fc\u00da\u00a9\u00a6Ay\u000e\u008c(\u00d7r\u00c0\u0094\u00a8\b\u00f9\u009a\u00f8;b-\u000fS\u0083_Bn\u00daNa\u008b\u00f9";
                var5_15 = "\u00fc\u00da\u00a9\u00a6Ay\u000e\u008c(\u00d7r\u00c0\u0094\u00a8\b\u00f9\u009a\u00f8;b-\u000fS\u0083_Bn\u00daNa\u008b\u00f9".length();
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
                    var4_14 = "\u00ca\u0099\u00bdfE\u001a'\u00e6\u00af0\u0083\u00c6A\u0007\u00e5t";
                    var5_15 = "\u00ca\u0099\u00bdfE\u001a'\u00e6\u00af0\u0083\u00c6A\u0007\u00e5t".length();
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
        ZKMChangeLogConvert.f = var6_12;
        ZKMChangeLogConvert.g = new Integer[6];
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

    private static String a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x2391;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ZKMChangeLogConvert", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n11].getBytes("ISO-8859-1");
            ZKMChangeLogConvert.d[n11] = ZKMChangeLogConvert.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = ZKMChangeLogConvert.a(n10, l10);
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
            throw new RuntimeException("com/zelix/ZKMChangeLogConvert" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x6F4F;
        if (g[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = f[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ZKMChangeLogConvert", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ZKMChangeLogConvert.g[n11] = n12;
        }
        return g[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = ZKMChangeLogConvert.b(n10, l10);
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
            throw new RuntimeException("com/zelix/ZKMChangeLogConvert" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ZKMChangeLogConvert.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ZKMChangeLogConvert.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

