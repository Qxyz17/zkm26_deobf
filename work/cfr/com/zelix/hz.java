/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fb;
import com.zelix.iq;
import com.zelix.loj;
import com.zelix.lq4;
import com.zelix.lqf;
import com.zelix.lqv;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.o3;
import com.zelix.prr;
import com.zelix.v7;
import com.zelix.zr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedHashSet;
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
public class hz {
    private v7[] n;
    private BitSet K;
    private Set M;
    private final fb a;
    private static String[] O;
    private v7[] W;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    /*
     * Exception decompiling
     */
    public hz(v7[] var1_1, v7[] var2_2, long var3_3, fb var5_4, Set var6_5) {
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
    public static hz r(Object[] var0) {
        block30: {
            block32: {
                block28: {
                    block29: {
                        block27: {
                            block25: {
                                block26: {
                                    var6_1 = (loj)var0[0];
                                    var3_2 = (hz)var0[1];
                                    var1_3 = (v7[])var0[2];
                                    var7_4 = (fb)var0[3];
                                    var2_5 = (Integer)var0[4];
                                    var4_6 = (Integer)var0[5];
                                    var5_7 = (Set)var0[6];
                                    var8_8 = (Integer)var0[7];
                                    v0 = var9_9 = ((long)var2_5 << 48 | (long)var4_6 << 32 >>> 16 | (long)var8_8 << 48 >>> 48) ^ hz.b;
                                    var11_10 = v0 ^ 106989657630361L;
                                    var13_11 = v0 ^ 124726616425625L;
                                    var15_12 = v0 ^ 120795325605722L;
                                    var18_13 = new zr();
                                    v1 = new Object[6];
                                    v1[5] = var18_13;
                                    v1[4] = var11_10;
                                    v1[3] = var3_2.a;
                                    v1[2] = var3_2.W;
                                    v1[1] = var1_3;
                                    v1[0] = var6_1;
                                    var19_14 = m44.a("o", (Object)v1, (long)7220901448533802287L, (long)var9_9);
                                    var20_15 = new LinkedHashSet<E>();
                                    var17_16 = m44.a("o", (long)7252424414770335861L, (long)var9_9);
                                    try {
                                        try {
                                            v2 = var5_7;
                                            if (var17_16 != null) break block25;
                                            if (v2 == null) break block26;
                                        }
                                        catch (n9 v3) {
                                            throw m44.a("o", (Object)v3, (long)7211776886910135626L, (long)var9_9);
                                        }
                                        var20_15.addAll(var5_7);
                                    }
                                    catch (n9 v4) {
                                        throw m44.a("o", (Object)v4, (long)7211776886910135626L, (long)var9_9);
                                    }
                                }
                                v2 = var3_2.M;
                            }
                            try {
                                if (v2 != null) {
                                    var20_15.addAll(var3_2.M);
                                }
                            }
                            catch (n9 v5) {
                                throw m44.a("o", (Object)v5, (long)7211776886910135626L, (long)var9_9);
                            }
                            if (var20_15.size() == 0) {
                                var20_15 = null;
                            }
                            try {
                                try {
                                    v6 = var7_4;
                                    v7 = var17_16;
                                    if (var8_8 >= 0) {
                                        if (v7 != null) break block27;
                                        if (v6 == null) break block28;
                                    }
                                    ** GOTO lbl70
                                }
                                catch (n9 v8) {
                                    throw m44.a("o", (Object)v8, (long)7211776886910135626L, (long)var9_9);
                                }
                                v6 = var3_2.a;
                            }
                            catch (n9 v9) {
                                throw m44.a("o", (Object)v9, (long)7211776886910135626L, (long)var9_9);
                            }
                        }
                        try {
                            v7 = var17_16;
lbl70:
                            // 2 sources

                            if (v7 != null) break block29;
                            if (v6.equals(var7_4)) {
                            }
                            ** GOTO lbl82
                        }
                        catch (n9 v10) {
                            throw m44.a("o", (Object)v10, (long)7211776886910135626L, (long)var9_9);
                        }
                        var21_17 = new hz(var3_2.n, (v7[])var19_14, var13_11, var7_4, var20_15);
                        try {
                            block31: {
                                v11 = var17_16;
                                if (var4_6 >= 0) {
                                    if (v11 == null) break block30;
                                }
                                break block31;
lbl82:
                                // 2 sources

                                v11 = m44.a("p", (Object)var7_4, (long)7110470955085528350L, (long)var9_9);
                            }
                            v6 = (fb)v11;
                        }
                        catch (n9 v12) {
                            throw m44.a("o", (Object)v12, (long)7211776886910135626L, (long)var9_9);
                        }
                    }
                    var22_18 = v6;
                    var22_18.or(var3_2.a);
                    v13 = new hz(var3_2.n, (v7[])var19_14, var13_11, var22_18, var20_15);
                    if (var8_8 < 0) break block32;
                    var21_17 = v13;
                    if (var17_16 == null) break block30;
                }
                v13 = new hz(var3_2.n, (v7[])var19_14, var20_15, var15_12);
            }
            var21_17 = v13;
        }
        return var21_17;
    }

    public v7[] T() {
        return this.W;
    }

    public static void m(String[] stringArray) {
        O = stringArray;
    }

    public static boolean N(Object[] objectArray) {
        v7 v72 = (v7)objectArray[0];
        return v72.y("I");
    }

    /*
     * Exception decompiling
     */
    private static v7[] Z(loj var0, v7[] var1_1, v7[] var2_2, boolean var3_3, zr var4_4, long var5_5, String var7_6) {
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
     * Could not resolve type clashes
     */
    public boolean p(loj var1_1, long var2_2, hz var4_3, Set var5_4, boolean var6_5, String var7_6, int var8_7) {
        block23: {
            block24: {
                block21: {
                    block22: {
                        v0 = var2_2 = hz.b ^ var2_2;
                        var9_8 = v0 ^ 12576825053902L;
                        var11_9 = v0 ^ 49571666154652L;
                        var13_10 = v0 ^ 48140855318581L;
                        var15_11 = m44.a("h", (long)435346340735480538L, (long)var2_2);
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v1 /* !! */  = this.Q(var9_8, var1_1, var4_3, var7_6);
                                                    if (var15_11 != null) break block21;
                                                    if (v1 /* !! */  == 0) break block22;
                                                }
                                                catch (n9 v2) {
                                                    throw m44.a("h", (Object)v2, (long)484700435033804773L, (long)var2_2);
                                                }
                                                v1 /* !! */  = (int)this.w(var13_10, var1_1, var4_3, var7_6);
                                                v3 = var15_11;
                                                if (var2_2 >= 0L) {
                                                    if (v3 != null) break block21;
                                                }
                                                ** GOTO lbl64
                                            }
                                            catch (n9 v4) {
                                                throw m44.a("h", (Object)v4, (long)484700435033804773L, (long)var2_2);
                                            }
                                            if (v1 /* !! */  == 0) break block22;
                                        }
                                        catch (n9 v5) {
                                            throw m44.a("h", (Object)v5, (long)484700435033804773L, (long)var2_2);
                                        }
                                        v1 /* !! */  = (int)var6_5;
                                        if (var15_11 != null) break block23;
                                    }
                                    catch (n9 v6) {
                                        throw m44.a("h", (Object)v6, (long)484700435033804773L, (long)var2_2);
                                    }
                                    if (var2_2 < 0L) break block23;
                                    if (v1 /* !! */  != 0) {
                                    }
                                    ** GOTO lbl69
                                }
                                catch (n9 v7) {
                                    throw m44.a("h", (Object)v7, (long)484700435033804773L, (long)var2_2);
                                }
                                v8 = new Object[3];
                                v8[2] = var5_4;
                                v8[1] = var11_9;
                                v8[0] = var4_3;
                                v1 /* !! */  = (int)m44.a("i", (Object)this, (Object)v8, (long)296626914302068478L, (long)var2_2);
                                if (var15_11 != null) break block23;
                            }
                            catch (n9 v9) {
                                throw m44.a("h", (Object)v9, (long)484700435033804773L, (long)var2_2);
                            }
                            if (v1 /* !! */  == 0) {
                            }
                            ** GOTO lbl69
                        }
                        catch (n9 v10) {
                            throw m44.a("h", (Object)v10, (long)484700435033804773L, (long)var2_2);
                        }
                    }
                    v1 /* !! */  = var8_7;
                }
                try {
                    try {
                        v3 = var15_11;
lbl64:
                        // 2 sources

                        if (v3 != null) break block23;
                        if (v1 /* !! */  != -1) break block24;
                    }
                    catch (n9 v11) {
                        throw m44.a("h", (Object)v11, (long)484700435033804773L, (long)var2_2);
                    }
lbl69:
                    // 3 sources

                    v1 /* !! */  = 1;
                    break block23;
                }
                catch (n9 v12) {
                    throw m44.a("h", (Object)v12, (long)484700435033804773L, (long)var2_2);
                }
            }
            v1 /* !! */  = 0;
        }
        return (boolean)v1 /* !! */ ;
    }

    /*
     * Exception decompiling
     */
    public boolean y(int var1_1, long var2_2) {
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
    String T(long var1_1, int var3_2) {
        block18: {
            block21: {
                block20: {
                    block19: {
                        block17: {
                            var4_3 = (var1_1 = hz.b ^ var1_1) ^ 117861437586575L;
                            var6_4 = m44.a("i", (long)6220589917989872259L, (long)var1_1);
                            try {
                                try {
                                    v0 = this.W[var3_2];
                                    if (var6_4 != null) break block17;
                                    if (v0.i(var4_3)) break block18;
                                }
                                catch (n9 v1) {
                                    throw m44.a("i", (Object)v1, (long)6260936797737361340L, (long)var1_1);
                                }
                                v0 = this.W[var3_2];
                            }
                            catch (n9 v2) {
                                throw m44.a("i", (Object)v2, (long)6260936797737361340L, (long)var1_1);
                            }
                        }
                        try {
                            try {
                                v3 = v7.L;
                                v4 = var6_4;
                                if (var1_1 >= 0L) {
                                    if (v4 != null) break block19;
                                    if (v0 == v3) break block18;
                                }
                                ** GOTO lbl39
                            }
                            catch (n9 v5) {
                                throw m44.a("i", (Object)v5, (long)6260936797737361340L, (long)var1_1);
                            }
                            v0 = this.W[var3_2];
                            v3 = v7.X;
                        }
                        catch (n9 v6) {
                            throw m44.a("i", (Object)v6, (long)6260936797737361340L, (long)var1_1);
                        }
                    }
                    try {
                        try {
                            try {
                                if (var1_1 <= 0L) break block20;
                                v4 = var6_4;
lbl39:
                                // 2 sources

                                if (v4 != null) break block20;
                                if (v0 == v3) break block18;
                            }
                            catch (n9 v7) {
                                throw m44.a("i", (Object)v7, (long)6260936797737361340L, (long)var1_1);
                            }
                            v0 = this.W[var3_2];
                            if (var6_4 != null) break block21;
                        }
                        catch (n9 v8) {
                            throw m44.a("i", (Object)v8, (long)6260936797737361340L, (long)var1_1);
                        }
                        v3 = v7.w;
                    }
                    catch (n9 v9) {
                        throw m44.a("i", (Object)v9, (long)6260936797737361340L, (long)var1_1);
                    }
                }
                try {
                    if (v0 == v3) break block18;
                    v0 = this.W[var3_2];
                }
                catch (n9 v10) {
                    throw m44.a("i", (Object)v10, (long)6260936797737361340L, (long)var1_1);
                }
            }
            return v0.h();
        }
        return null;
    }

    boolean I(long l10) {
        v7 v72;
        CallSite callSite;
        int n10;
        int n11;
        v7[] v7Array;
        long l11;
        block17: {
            int n12;
            l11 = (l10 = b ^ l10) ^ 0x68537EB20219L;
            v7Array = this.n;
            n11 = v7Array.length;
            n10 = 0;
            callSite = m44.a("h", (long)-3444433671033314078L, (long)l10);
            while (n10 < n11) {
                CallSite callSite2;
                block15: {
                    block16: {
                        block18: {
                            v72 = v7Array[n10];
                            try {
                                try {
                                    try {
                                        callSite2 = callSite;
                                        if (l10 <= 0L) break block15;
                                        if (callSite2 != null) break block16;
                                        n12 = v72.n(l11) ? 1 : 0;
                                        if (callSite != null) break block17;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("h", (Object)n92, (long)-3422101738209076771L, (long)l10);
                                    }
                                    if (n12 == 0) break block18;
                                }
                                catch (n9 n93) {
                                    throw m44.a("h", (Object)n93, (long)-3422101738209076771L, (long)l10);
                                }
                                return true;
                            }
                            catch (n9 n94) {
                                throw m44.a("h", (Object)n94, (long)-3422101738209076771L, (long)l10);
                            }
                        }
                        ++n10;
                    }
                    callSite2 = callSite;
                }
                if (callSite2 == null) continue;
            }
            v7Array = this.W;
            n11 = v7Array.length;
            if (l10 >= 0L) {
                n12 = n10 = 0;
            }
        }
        while (n10 < n11) {
            CallSite callSite3;
            block19: {
                block20: {
                    block21: {
                        boolean bl2;
                        block22: {
                            v72 = v7Array[n10];
                            try {
                                try {
                                    try {
                                        callSite3 = callSite;
                                        if (l10 < 0L) break block19;
                                        if (callSite3 != null) break block20;
                                        if (v72 == null) break block21;
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("h", (Object)n95, (long)-3422101738209076771L, (long)l10);
                                    }
                                    bl2 = v72.n(l11);
                                    if (callSite != null) break block22;
                                }
                                catch (n9 n96) {
                                    throw m44.a("h", (Object)n96, (long)-3422101738209076771L, (long)l10);
                                }
                                if (!bl2) break block21;
                            }
                            catch (n9 n97) {
                                throw m44.a("h", (Object)n97, (long)-3422101738209076771L, (long)l10);
                            }
                            bl2 = true;
                        }
                        return bl2;
                    }
                    ++n10;
                }
                callSite3 = callSite;
            }
            if (callSite3 == null) continue;
        }
        return false;
    }

    public v7[] X() {
        return this.n;
    }

    /*
     * Exception decompiling
     */
    public hz(int var1_1, String var2_2, v7[] var3_3, fb var4_4, Set var5_5, int var6_6) {
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

    public hz(v7[] v7Array, long l10) {
        long l11 = (l10 = b ^ l10) ^ 0x1DA651D3594AL;
        this(v7Array, (fb)null, l11, null);
    }

    public iq h(long l10) {
        block5: {
            fb fb2;
            long l11;
            block4: {
                l11 = (l10 = b ^ l10) ^ 0x14E6B57D0BC3L;
                CallSite callSite = m44.a("k", (long)-7184934680748529511L, (long)l10);
                try {
                    try {
                        fb2 = this.a;
                        if (callSite != null) break block4;
                        if (fb2 == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)-7135581204379707994L, (long)l10);
                    }
                    fb2 = this.a;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)-7135581204379707994L, (long)l10);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l11;
            return m44.a("t", (Object)fb2, (Object)objectArray, (long)-9207818929058335157L, (long)l10);
        }
        return null;
    }

    public hz(v7[] v7Array, v7[] v7Array2, Set set, long l10) {
        long l11 = (l10 = b ^ l10) ^ 0x778D71BAE9BFL;
        this(v7Array, v7Array2, l11, null, set);
    }

    public static String[] f() {
        return O;
    }

    lq4 O(Object[] objectArray) {
        boolean bl2 = (Boolean)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10 = b ^ l10;
        long l12 = l11 ^ 0x16902A960A9DL;
        long l13 = l11 ^ 0x4DA1D9BC9E90L;
        try {
            if (bl2) {
                return new lqv(l13, this);
            }
        }
        catch (n9 n92) {
            throw m44.a("k", (Object)n92, (long)-8948315017291740530L, (long)l10);
        }
        return new lqf(this, l12);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean T(Object[] var0) {
        block48: {
            block49: {
                block43: {
                    block44: {
                        block45: {
                            block47: {
                                block46: {
                                    block41: {
                                        block42: {
                                            block39: {
                                                block40: {
                                                    block37: {
                                                        block38: {
                                                            var3_1 = (v7)var0[0];
                                                            var1_2 = (Long)var0[1];
                                                            var4_3 = (v7)var0[2];
                                                            var5_4 = (var1_2 = hz.b ^ var1_2) ^ 73035321516677L;
                                                            var7_5 = m44.a("k", (long)-4654018418135381063L, (long)var1_2);
                                                            try {
                                                                try {
                                                                    v0 /* !! */  = var3_1.equals(var4_3);
                                                                    if (var7_5 != null) break block37;
                                                                    if (!v0 /* !! */ ) break block38;
                                                                }
                                                                catch (n9 v1) {
                                                                    throw m44.a("k", (Object)v1, (long)-4622606767924349306L, (long)var1_2);
                                                                }
                                                                return true;
                                                            }
                                                            catch (n9 v2) {
                                                                throw m44.a("k", (Object)v2, (long)-4622606767924349306L, (long)var1_2);
                                                            }
                                                        }
                                                        v0 /* !! */  = m44.a("k", (Object)new Object[]{var3_1}, (long)-6462529761565211796L, (long)var1_2);
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var7_5 != null) break block39;
                                                                    if (!v0 /* !! */ ) break block40;
                                                                }
                                                                catch (n9 v3) {
                                                                    throw m44.a("k", (Object)v3, (long)-4622606767924349306L, (long)var1_2);
                                                                }
                                                                v0 /* !! */  = m44.a("k", (Object)new Object[]{var4_3}, (long)-6462529761565211796L, (long)var1_2);
                                                                v4 = var7_5;
                                                                if (var1_2 >= 0L) {
                                                                    if (v4 != null) break block39;
                                                                }
                                                                ** GOTO lbl52
                                                            }
                                                            catch (n9 v5) {
                                                                throw m44.a("k", (Object)v5, (long)-4622606767924349306L, (long)var1_2);
                                                            }
                                                            if (!v0 /* !! */ ) break block40;
                                                        }
                                                        catch (n9 v6) {
                                                            throw m44.a("k", (Object)v6, (long)-4622606767924349306L, (long)var1_2);
                                                        }
                                                        return true;
                                                    }
                                                    catch (n9 v7) {
                                                        throw m44.a("k", (Object)v7, (long)-4622606767924349306L, (long)var1_2);
                                                    }
                                                }
                                                v0 /* !! */  = var4_3.y("F");
                                            }
                                            try {
                                                try {
                                                    v4 = var7_5;
lbl52:
                                                    // 2 sources

                                                    if (var1_2 > 0L) {
                                                        if (v4 != null) break block41;
                                                        if (!v0 /* !! */ ) break block42;
                                                    }
                                                    ** GOTO lbl71
                                                }
                                                catch (n9 v8) {
                                                    throw m44.a("k", (Object)v8, (long)-4622606767924349306L, (long)var1_2);
                                                }
                                                return var3_1.y("I");
                                            }
                                            catch (n9 v9) {
                                                throw m44.a("k", (Object)v9, (long)-4622606767924349306L, (long)var1_2);
                                            }
                                        }
                                        v0 /* !! */  = var4_3.y("D");
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v4 = var7_5;
lbl71:
                                                        // 2 sources

                                                        if (var1_2 >= 0L) {
                                                            if (v4 != null) break block43;
                                                            if (!v0 /* !! */ ) break block44;
                                                        }
                                                        ** GOTO lbl111
                                                    }
                                                    catch (n9 v10) {
                                                        throw m44.a("k", (Object)v10, (long)-4622606767924349306L, (long)var1_2);
                                                    }
                                                    v11 = var3_1.y("F");
                                                    if (var7_5 != null) break block45;
                                                }
                                                catch (n9 v12) {
                                                    throw m44.a("k", (Object)v12, (long)-4622606767924349306L, (long)var1_2);
                                                }
                                                if (v11) break block46;
                                            }
                                            catch (n9 v13) {
                                                throw m44.a("k", (Object)v13, (long)-4622606767924349306L, (long)var1_2);
                                            }
                                            v11 = var3_1.y("I");
                                            if (var7_5 != null) break block45;
                                        }
                                        catch (n9 v14) {
                                            throw m44.a("k", (Object)v14, (long)-4622606767924349306L, (long)var1_2);
                                        }
                                        if (!v11) break block47;
                                    }
                                    catch (n9 v15) {
                                        throw m44.a("k", (Object)v15, (long)-4622606767924349306L, (long)var1_2);
                                    }
                                }
                                v11 = true;
                                break block45;
                            }
                            v11 = false;
                        }
                        return v11;
                    }
                    v0 /* !! */  = hz.U(var3_1, var5_4);
                }
                try {
                    try {
                        try {
                            try {
                                v4 = var7_5;
lbl111:
                                // 2 sources

                                if (v4 != null) break block48;
                                if (!v0 /* !! */ ) break block49;
                            }
                            catch (n9 v16) {
                                throw m44.a("k", (Object)v16, (long)-4622606767924349306L, (long)var1_2);
                            }
                            v0 /* !! */  = hz.U(var4_3, var5_4);
                            if (var7_5 != null) break block48;
                        }
                        catch (n9 v17) {
                            throw m44.a("k", (Object)v17, (long)-4622606767924349306L, (long)var1_2);
                        }
                        if (!v0 /* !! */ ) break block49;
                    }
                    catch (n9 v18) {
                        throw m44.a("k", (Object)v18, (long)-4622606767924349306L, (long)var1_2);
                    }
                    return true;
                }
                catch (n9 v19) {
                    throw m44.a("k", (Object)v19, (long)-4622606767924349306L, (long)var1_2);
                }
            }
            v0 /* !! */  = false;
        }
        return v0 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean n(Object[] var0) {
        block17: {
            block18: {
                block21: {
                    block22: {
                        block19: {
                            block20: {
                                var1_1 = (v7)var0[0];
                                var6_2 = (v7)var0[1];
                                var4_3 = (Long)var0[2];
                                var3_4 = (loj)var0[3];
                                var2_5 = (String)var0[4];
                                v0 = var4_3 = hz.b ^ var4_3;
                                var7_6 = v0 ^ 58090800507824L;
                                var9_7 = v0 ^ 34545497530857L;
                                var11_8 = v0 ^ 119273530802433L;
                                var13_9 = v0 ^ 32538865894217L;
                                var15_10 = m44.a("o", (long)-7014984116365661579L, (long)var4_3);
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v1 /* !! */  = hz.U(var1_1, var13_9);
                                                        if (var15_10 != null) break block17;
                                                        if (!v1 /* !! */ ) break block18;
                                                    }
                                                    catch (n9 v2) {
                                                        throw m44.a("o", (Object)v2, (long)-7055614124408744118L, (long)var4_3);
                                                    }
                                                    v1 /* !! */  = hz.U(var6_2, var13_9);
                                                    if (var15_10 != null) break block17;
                                                }
                                                catch (n9 v3) {
                                                    throw m44.a("o", (Object)v3, (long)-7055614124408744118L, (long)var4_3);
                                                }
                                                if (!v1 /* !! */ ) break block18;
                                            }
                                            catch (n9 v4) {
                                                throw m44.a("o", (Object)v4, (long)-7055614124408744118L, (long)var4_3);
                                            }
                                            v5 /* !! */  = var1_1.y("n");
                                            v6 = var15_10;
                                            if (var4_3 > 0L) {
                                                if (v6 != null) break block19;
                                            }
                                            ** GOTO lbl56
                                        }
                                        catch (n9 v7) {
                                            throw m44.a("o", (Object)v7, (long)-7055614124408744118L, (long)var4_3);
                                        }
                                        if (!v5 /* !! */ ) break block20;
                                    }
                                    catch (n9 v8) {
                                        throw m44.a("o", (Object)v8, (long)-7055614124408744118L, (long)var4_3);
                                    }
                                    return true;
                                }
                                catch (n9 v9) {
                                    throw m44.a("o", (Object)v9, (long)-7055614124408744118L, (long)var4_3);
                                }
                            }
                            v5 /* !! */  = var3_4.C(var1_1, var11_8, var6_2, var2_5);
                        }
                        try {
                            try {
                                v6 = var15_10;
lbl56:
                                // 2 sources

                                if (v6 != null) break block21;
                                if (!v5 /* !! */ ) break block22;
                            }
                            catch (n9 v10) {
                                throw m44.a("o", (Object)v10, (long)-7055614124408744118L, (long)var4_3);
                            }
                            return true;
                        }
                        catch (n9 v11) {
                            throw m44.a("o", (Object)v11, (long)-7055614124408744118L, (long)var4_3);
                        }
                    }
                    v12 = new Object[3];
                    v12[2] = var9_7;
                    v12[1] = var2_5;
                    v12[0] = var6_2;
                    v5 /* !! */  = m44.a("p", (Object)var3_4, (Object)v12, (long)-7101025054666902537L, (long)var4_3);
                }
                return v5 /* !! */ ;
            }
            v13 = new Object[3];
            v13[2] = var6_2;
            v13[1] = var7_6;
            v13[0] = var1_1;
            v1 /* !! */  = m44.a("o", (Object)v13, (long)-9149956643344677561L, (long)var4_3);
        }
        return v1 /* !! */ ;
    }

    /*
     * Exception decompiling
     */
    private boolean w(long var1_1, loj var3_2, hz var4_3, String var5_4) {
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
    private boolean Q(long var1_1, loj var3_2, hz var4_3, String var5_4) {
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
    public hz h(loj var1_1, hz var2_2, zr var3_3, String var4_4, long var5_5) {
        block49: {
            block47: {
                block48: {
                    block46: {
                        block45: {
                            block44: {
                                block42: {
                                    block43: {
                                        block39: {
                                            block41: {
                                                block40: {
                                                    v0 = var5_5 = hz.b ^ var5_5;
                                                    var7_6 = v0 ^ 21226707591793L;
                                                    v1 = v0 ^ 107038038020466L;
                                                    var9_7 = (int)(v1 >>> 32);
                                                    var10_8 = (int)(v1 << 32 >>> 48);
                                                    var11_9 = (int)(v1 << 48 >>> 48);
                                                    var12_10 = v0 ^ 9218019981945L;
                                                    var14_11 = v0 ^ 17466785661362L;
                                                    var17_12 = new zr();
                                                    var18_13 = new zr();
                                                    var19_14 = hz.Z(var1_1, this.n, var2_2.n, true, var17_12, var12_10, var4_4);
                                                    var20_15 = hz.z(var9_7, var1_1, this.W, var2_2.W, (char)var10_8, true, (short)var11_9, var18_13, var4_4);
                                                    var16_16 = m44.a("o", (long)4777663528980362909L, (long)var5_5);
                                                    try {
                                                        try {
                                                            try {
                                                                v2 = var3_3;
                                                                v3 = var17_12.S();
                                                                if (var16_16 != null) break block39;
                                                                if (v3) break block40;
                                                            }
                                                            catch (n9 v4) {
                                                                throw m44.a("o", (Object)v4, (long)4827017538322926498L, (long)var5_5);
                                                            }
                                                            v3 = var18_13.S();
                                                            if (var16_16 != null) break block39;
                                                        }
                                                        catch (n9 v5) {
                                                            throw m44.a("o", (Object)v5, (long)4827017538322926498L, (long)var5_5);
                                                        }
                                                        if (!v3) break block41;
                                                    }
                                                    catch (n9 v6) {
                                                        throw m44.a("o", (Object)v6, (long)4827017538322926498L, (long)var5_5);
                                                    }
                                                }
                                                v3 = true;
                                                break block39;
                                            }
                                            v3 = false;
                                        }
                                        v2.I(v3);
                                        var21_17 = new LinkedHashSet<E>();
                                        try {
                                            try {
                                                v7 = this.M;
                                                if (var5_5 < 0L || var16_16 != null) break block42;
                                                if (v7 == null) break block43;
                                            }
                                            catch (n9 v8) {
                                                throw m44.a("o", (Object)v8, (long)4827017538322926498L, (long)var5_5);
                                            }
                                            var21_17.addAll(this.M);
                                        }
                                        catch (n9 v9) {
                                            throw m44.a("o", (Object)v9, (long)4827017538322926498L, (long)var5_5);
                                        }
                                    }
                                    v7 = var2_2.M;
                                }
                                try {
                                    if (v7 != null) {
                                        var21_17.addAll(var2_2.M);
                                    }
                                }
                                catch (n9 v10) {
                                    throw m44.a("o", (Object)v10, (long)4827017538322926498L, (long)var5_5);
                                }
                                try {
                                    try {
                                        v11 = var21_17;
                                        if (var5_5 < 0L || var16_16 != null) break block44;
                                        if (v11.size() <= 0) break block45;
                                    }
                                    catch (n9 v12) {
                                        throw m44.a("o", (Object)v12, (long)4827017538322926498L, (long)var5_5);
                                    }
                                    v11 = this.M;
                                }
                                catch (n9 v13) {
                                    throw m44.a("o", (Object)v13, (long)4827017538322926498L, (long)var5_5);
                                }
                            }
                            try {
                                try {
                                    if (v11 != null && var21_17.equals(this.M)) break block46;
                                }
                                catch (n9 v14) {
                                    throw m44.a("o", (Object)v14, (long)4827017538322926498L, (long)var5_5);
                                }
                                var3_3.I(true);
                                if (var5_5 < 0L || var16_16 == null) break block46;
                            }
                            catch (n9 v15) {
                                throw m44.a("o", (Object)v15, (long)4827017538322926498L, (long)var5_5);
                            }
                        }
                        var21_17 = null;
                    }
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        v16 = this;
                                        if (var16_16 != null) break block47;
                                        if (v16.a != null) {
                                        }
                                        ** GOTO lbl147
                                    }
                                    catch (n9 v17) {
                                        throw m44.a("o", (Object)v17, (long)4827017538322926498L, (long)var5_5);
                                    }
                                    v16 = var2_2;
                                    if (var16_16 != null) break block47;
                                }
                                catch (n9 v18) {
                                    throw m44.a("o", (Object)v18, (long)4827017538322926498L, (long)var5_5);
                                }
                                if (var5_5 < 0L) break block47;
                                if (v16.a != null) {
                                }
                                ** GOTO lbl147
                            }
                            catch (n9 v19) {
                                throw m44.a("o", (Object)v19, (long)4827017538322926498L, (long)var5_5);
                            }
                            v20 = this.a;
                            if (var16_16 != null) break block48;
                        }
                        catch (n9 v21) {
                            throw m44.a("o", (Object)v21, (long)4827017538322926498L, (long)var5_5);
                        }
                        if (v20.equals(var2_2.a)) {
                        }
                        ** GOTO lbl132
                    }
                    catch (n9 v22) {
                        throw m44.a("o", (Object)v22, (long)4827017538322926498L, (long)var5_5);
                    }
                    var22_18 = new hz(var19_14, var20_15, var7_6, (fb)m44.a("p", (Object)this.a, (long)4919361907068886006L, (long)var5_5), var21_17);
                    try {
                        block50: {
                            v23 = var16_16;
                            if (var5_5 >= 0L) {
                                if (v23 == null) break block49;
                            }
                            break block50;
lbl132:
                            // 2 sources

                            v23 = m44.a("p", (Object)this.a, (long)4919361907068886006L, (long)var5_5);
                        }
                        v20 = (fb)v23;
                    }
                    catch (n9 v24) {
                        throw m44.a("o", (Object)v24, (long)4827017538322926498L, (long)var5_5);
                    }
                }
                var23_19 = v20;
                var23_19.or(var2_2.a);
                v16 = new hz(var19_14, var20_15, var7_6, var23_19, var21_17);
                if (var5_5 <= 0L) break block47;
                var22_18 = v16;
                try {
                    var3_3.I(true);
                    if (var16_16 == null) break block49;
lbl147:
                    // 3 sources

                    v16 = new hz(var19_14, var20_15, var21_17, var14_11);
                }
                catch (n9 v25) {
                    throw m44.a("o", (Object)v25, (long)4827017538322926498L, (long)var5_5);
                }
            }
            var22_18 = v16;
        }
        return var22_18;
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(Object[] var1_1) {
        block55: {
            block56: {
                block53: {
                    block54: {
                        block52: {
                            block50: {
                                block51: {
                                    block45: {
                                        var3_2 = (hz)var1_1[0];
                                        var4_3 = (Long)var1_1[1];
                                        var2_4 = (Set)var1_1[2];
                                        var4_3 = hz.b ^ var4_3;
                                        var7_5 = this.X();
                                        var8_6 = ((v7[])var7_5).length;
                                        var9_8 = 0;
                                        var6_10 = m44.a("h", (long)1795510205982305338L, (long)var4_3);
                                        while (var9_8 < var8_6) {
                                            block43: {
                                                block44: {
                                                    block46: {
                                                        var10_11 = var7_5[var9_8];
                                                        try {
                                                            try {
                                                                try {
                                                                    v0 = var6_10;
                                                                    if (var4_3 <= 0L) break block43;
                                                                    if (v0 != null) break block44;
                                                                    v1 = (int)var2_4.contains(var10_11);
                                                                    if (var6_10 != null) break block45;
                                                                }
                                                                catch (n9 v2) {
                                                                    throw m44.a("h", (Object)v2, (long)1754792305892446469L, (long)var4_3);
                                                                }
                                                                if (v1 == 0) break block46;
                                                                return false;
                                                            }
                                                            catch (n9 v3) {
                                                                throw m44.a("h", (Object)v3, (long)1754792305892446469L, (long)var4_3);
                                                            }
                                                        }
                                                        catch (n9 v4) {
                                                            throw m44.a("h", (Object)v4, (long)1754792305892446469L, (long)var4_3);
                                                        }
                                                    }
                                                    ++var9_8;
                                                }
                                                v0 = var6_10;
                                            }
                                            if (v0 == null) continue;
                                        }
                                        var7_5 = var3_2.X();
                                        var8_6 = ((v7[])var7_5).length;
                                        if (var4_3 >= 0L) {
                                            v1 = var9_8 = 0;
                                        }
                                    }
                                    while (var9_8 < var8_6) {
                                        block47: {
                                            block48: {
                                                block49: {
                                                    var10_11 = var7_5[var9_8];
                                                    try {
                                                        try {
                                                            try {
                                                                v5 = var6_10;
                                                                if (var4_3 < 0L) break block47;
                                                                if (v5 != null) break block48;
                                                                v6 = var2_4.contains(var10_11);
                                                                if (var6_10 != null) return v6;
                                                            }
                                                            catch (n9 v7) {
                                                                throw m44.a("h", (Object)v7, (long)1754792305892446469L, (long)var4_3);
                                                            }
                                                            if (!v6) break block49;
                                                            return false;
                                                        }
                                                        catch (n9 v8) {
                                                            throw m44.a("h", (Object)v8, (long)1754792305892446469L, (long)var4_3);
                                                        }
                                                    }
                                                    catch (n9 v9) {
                                                        throw m44.a("h", (Object)v9, (long)1754792305892446469L, (long)var4_3);
                                                    }
                                                }
                                                ++var9_8;
                                            }
                                            v5 = var6_10;
                                        }
                                        if (v5 == null) continue;
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v10 = this.M;
                                                    if (var6_10 != null) break block50;
                                                    if (v10 != null) break block51;
                                                }
                                                catch (n9 v11) {
                                                    throw m44.a("h", (Object)v11, (long)1754792305892446469L, (long)var4_3);
                                                }
                                                v10 = var3_2.M;
                                                v12 = var6_10;
                                                if (var4_3 > 0L) {
                                                    if (v12 != null) break block50;
                                                }
                                                ** GOTO lbl95
                                            }
                                            catch (n9 v13) {
                                                throw m44.a("h", (Object)v13, (long)1754792305892446469L, (long)var4_3);
                                            }
                                            if (v10 != null) break block51;
                                            return true;
                                        }
                                        catch (n9 v14) {
                                            throw m44.a("h", (Object)v14, (long)1754792305892446469L, (long)var4_3);
                                        }
                                    }
                                    catch (n9 v15) {
                                        throw m44.a("h", (Object)v15, (long)1754792305892446469L, (long)var4_3);
                                    }
                                }
                                v10 = this.M;
                            }
                            try {
                                try {
                                    v12 = var6_10;
lbl95:
                                    // 2 sources

                                    if (var4_3 > 0L) {
                                        if (v12 != null) break block52;
                                        if (v10 == null) return false;
                                    }
                                    ** GOTO lbl109
                                }
                                catch (n9 v16) {
                                    throw m44.a("h", (Object)v16, (long)1754792305892446469L, (long)var4_3);
                                }
                                v10 = var3_2.M;
                            }
                            catch (n9 v17) {
                                throw m44.a("h", (Object)v17, (long)1754792305892446469L, (long)var4_3);
                            }
                        }
                        try {
                            v12 = var6_10;
lbl109:
                            // 2 sources

                            if (var4_3 > 0L) {
                                if (v12 != null) break block53;
                                if (v10 != null) break block54;
                                return false;
                            }
                            ** GOTO lbl122
                        }
                        catch (n9 v18) {
                            throw m44.a("h", (Object)v18, (long)1754792305892446469L, (long)var4_3);
                        }
                    }
                    v10 = this.M;
                }
                try {
                    try {
                        v12 = var6_10;
lbl122:
                        // 2 sources

                        if (v12 != null) break block55;
                        if (v10.size() == var3_2.M.size()) break block56;
                        return false;
                    }
                    catch (n9 v19) {
                        throw m44.a("h", (Object)v19, (long)1754792305892446469L, (long)var4_3);
                    }
                }
                catch (n9 v20) {
                    throw m44.a("h", (Object)v20, (long)1754792305892446469L, (long)var4_3);
                }
            }
            v10 = this.M;
        }
        var7_5 = v10.iterator();
        block34: while (true) {
            v21 = var7_5.hasNext();
            do {
                if (v21 == false) return true;
                var8_7 = (o3)var7_5.next();
                while (true) {
                    for (Object var10_11 : var3_2.M) {
                        try {
                            if (var8_7 == var10_11) {
                                if (var6_10 == null) continue block34;
                                if (var4_3 < 0L) continue;
                            }
                        }
                        catch (n9 v22) {
                            throw m44.a("h", (Object)v22, (long)1754792305892446469L, (long)var4_3);
                        }
                        if (var6_10 == null) continue;
                    }
                    break;
                }
                v21 = false;
            } while (var4_3 <= 0L);
            break;
        }
        return v21;
    }

    public o3 Z(Object[] objectArray) {
        Set set;
        o3 o32;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                o32 = (o3)objectArray[1];
                l10 = b ^ l10;
                CallSite callSite = m44.a("i", (long)-6779134374182300357L, (long)l10);
                try {
                    try {
                        set = this.M;
                        if (callSite != null) break block4;
                        if (set != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)n92, (long)-6819852268232349692L, (long)l10);
                    }
                    this.M = new LinkedHashSet();
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)n93, (long)-6819852268232349692L, (long)l10);
                }
            }
            set = this.M;
        }
        set.add(o32);
        return o32;
    }

    public hz(v7[] v7Array, fb fb2, long l10, Set set) {
        long l11 = l10 = b ^ l10;
        long l12 = l11 ^ 0x6D8518E6C53CL;
        long l13 = l11 ^ 0xA1C100F6DD0L;
        this(v7.I(0, l13), v7Array, l12, fb2, set);
    }

    /*
     * Unable to fully structure code
     */
    public static boolean U(v7 var0, long var1_1) {
        block15: {
            block19: {
                block16: {
                    block17: {
                        var1_1 = hz.b ^ var1_1;
                        var3_2 = m44.a("j", (long)-2913631435595832512L, (long)var1_1);
                        try {
                            block18: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v0 = var0.o("[");
                                                    if (var3_2 != null) break block15;
                                                    if (v0) break block16;
                                                }
                                                catch (n9 v1) {
                                                    throw m44.a("j", (Object)v1, (long)-2945324540227412353L, (long)var1_1);
                                                }
                                                v0 = var0.o("L");
                                                v2 = var3_2;
                                                if (var1_1 > 0L) {
                                                    if (v2 != null) break block17;
                                                }
                                                ** GOTO lbl45
                                            }
                                            catch (n9 v3) {
                                                throw m44.a("j", (Object)v3, (long)-2945324540227412353L, (long)var1_1);
                                            }
                                            if (var1_1 < 0L) break block17;
                                            if (!v0) break block18;
                                        }
                                        catch (n9 v4) {
                                            throw m44.a("j", (Object)v4, (long)-2945324540227412353L, (long)var1_1);
                                        }
                                        v0 = var0.T(";");
                                        if (var3_2 != null) break block15;
                                    }
                                    catch (n9 v5) {
                                        throw m44.a("j", (Object)v5, (long)-2945324540227412353L, (long)var1_1);
                                    }
                                    if (v0) break block16;
                                }
                                catch (n9 v6) {
                                    throw m44.a("j", (Object)v6, (long)-2945324540227412353L, (long)var1_1);
                                }
                            }
                            v0 = var0.y("n");
                        }
                        catch (n9 v7) {
                            throw m44.a("j", (Object)v7, (long)-2945324540227412353L, (long)var1_1);
                        }
                    }
                    try {
                        v2 = var3_2;
lbl45:
                        // 2 sources

                        if (v2 != null) break block15;
                        if (!v0) break block19;
                    }
                    catch (n9 v8) {
                        throw m44.a("j", (Object)v8, (long)-2945324540227412353L, (long)var1_1);
                    }
                }
                v0 = true;
                break block15;
            }
            v0 = false;
        }
        return v0;
    }

    public static boolean X(Object[] objectArray) {
        boolean bl2;
        block6: {
            block7: {
                block5: {
                    v7 v72;
                    CallSite callSite;
                    long l10;
                    block4: {
                        l10 = (Long)objectArray[0];
                        v7 v73 = (v7)objectArray[1];
                        l10 = b ^ l10;
                        callSite = m44.a("o", (long)-5823776389693613059L, (long)l10);
                        try {
                            v72 = v73;
                            if (callSite != null) break block4;
                            if (v72 == null) break block5;
                        }
                        catch (n9 n92) {
                            throw m44.a("o", (Object)n92, (long)-5792364211759323454L, (long)l10);
                        }
                        v72 = v73;
                    }
                    try {
                        bl2 = v72.y("?");
                        if (callSite != null) break block6;
                        if (!bl2) break block7;
                    }
                    catch (n9 n93) {
                        throw m44.a("o", (Object)n93, (long)-5792364211759323454L, (long)l10);
                    }
                }
                bl2 = true;
                break block6;
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    public o3 Q(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [21[DOLOOP], 20[WHILELOOP]], but top level block is 9[TRYBLOCK]
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

    private static v7[] e(Object[] objectArray) {
        v7[] v7Array;
        block8: {
            loj loj2 = (loj)objectArray[0];
            v7[] v7Array2 = (v7[])objectArray[1];
            v7[] v7Array3 = (v7[])objectArray[2];
            fb fb2 = (fb)objectArray[3];
            long l10 = (Long)objectArray[4];
            zr zr2 = (zr)objectArray[5];
            l10 = b ^ l10;
            int n10 = v7Array2.length;
            v7[] v7Array4 = (v7[])v7Array2.clone();
            CallSite callSite = m44.a("j", (long)-8628681401289311088L, (long)l10);
            zr2.I(false);
            if (fb2 != null) {
                for (int i10 = 0; i10 < n10; ++i10) {
                    boolean bl2;
                    block9: {
                        block10: {
                            try {
                                try {
                                    v7Array = v7Array3;
                                    if (callSite != null) break block8;
                                    bl2 = v7Array[i10].equals(v7Array4[i10]);
                                    if (l10 < 0L || callSite != null) break block9;
                                }
                                catch (n9 n92) {
                                    throw m44.a("j", (Object)n92, (long)-8579239979395956305L, (long)l10);
                                }
                                if (!bl2) break block10;
                            }
                            catch (n9 n93) {
                                throw m44.a("j", (Object)n93, (long)-8579239979395956305L, (long)l10);
                            }
                            if (l10 > 0L) continue;
                        }
                        bl2 = fb2.get(i10);
                    }
                    try {
                        if (!bl2) continue;
                        zr2.I(true);
                        v7Array4[i10] = v7Array3[i10];
                        continue;
                    }
                    catch (n9 n94) {
                        throw m44.a("j", (Object)n94, (long)-8579239979395956305L, (long)l10);
                    }
                }
            }
            v7Array = v7Array4;
        }
        return v7Array;
    }

    public final int c() {
        return this.n.length;
    }

    public static boolean I(v7 v72, long l10) {
        boolean bl2;
        block6: {
            block8: {
                block7: {
                    l10 = b ^ l10;
                    CallSite callSite = m44.a("l", (long)-4150439576793894218L, (long)l10);
                    try {
                        try {
                            try {
                                bl2 = v72.y("J");
                                if (callSite != null) break block6;
                                if (bl2) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("l", (Object)n92, (long)-4119099882351030391L, (long)l10);
                            }
                            bl2 = v72.y("D");
                            if (callSite != null) break block6;
                        }
                        catch (n9 n93) {
                            throw m44.a("l", (Object)n93, (long)-4119099882351030391L, (long)l10);
                        }
                        if (!bl2) break block8;
                    }
                    catch (n9 n94) {
                        throw m44.a("l", (Object)n94, (long)-4119099882351030391L, (long)l10);
                    }
                }
                bl2 = true;
                break block6;
            }
            bl2 = false;
        }
        return bl2;
    }

    public int M(int n10, int n11, char c10) {
        int n12;
        block3: {
            long l10 = ((long)n10 << 32 | (long)n11 << 48 >>> 32 | (long)c10 << 48 >>> 48) ^ b;
            long l11 = l10 ^ 0x600F2ECC86C2L;
            int n13 = 0;
            v7[] v7Array = this.n;
            int n14 = v7Array.length;
            int n15 = 0;
            CallSite callSite = m44.a("k", (long)-5345233077066645247L, (long)l10);
            while (n15 < n14) {
                v7 v72 = v7Array[n15];
                if (n10 >= 0) {
                    n12 = n13 + v72.C(l11);
                    if (callSite != null) break block3;
                    n13 = n12;
                    ++n15;
                }
                if (callSite == null) continue;
            }
            n12 = n13;
        }
        return n12;
    }

    /*
     * Unable to fully structure code
     */
    public v7[] r(Object[] var1_1) {
        block27: {
            block28: {
                var2_2 = (Long)var1_1[0];
                var2_2 = hz.b ^ var2_2;
                var4_3 = m44.a("l", (long)4046180432538881270L, (long)var2_2);
                try {
                    v0 = this;
                    if (var4_3 != null) break block27;
                    if (v0.K == null) break block28;
                }
                catch (n9 v1) {
                    throw m44.a("l", (Object)v1, (long)4077520044886258121L, (long)var2_2);
                }
                var5_4 = new v7[this.W.length];
                var6_5 = 0;
                block20: while (var6_5 < this.W.length) {
                    block29: {
                        try {
                            block30: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v2 = this;
                                                            if (var4_3 != null) break block29;
                                                            if (v2.K.get(var6_5)) break block30;
                                                        }
                                                        catch (n9 v3) {
                                                            throw m44.a("l", (Object)v3, (long)4077520044886258121L, (long)var2_2);
                                                        }
                                                        v4 = this.W[var6_5];
                                                        if (var4_3 == null) {
                                                        }
                                                        ** GOTO lbl81
                                                    }
                                                    catch (n9 v5) {
                                                        throw m44.a("l", (Object)v5, (long)4077520044886258121L, (long)var2_2);
                                                    }
                                                    if (var2_2 < 0L) ** GOTO lbl81
                                                    if (v4 == v7.k) {
                                                    }
                                                    ** GOTO lbl77
                                                }
                                                catch (n9 v6) {
                                                    throw m44.a("l", (Object)v6, (long)4077520044886258121L, (long)var2_2);
                                                }
                                                v7 = var5_4[var6_5 - 1];
                                                if (var4_3 == null) {
                                                }
                                                ** GOTO lbl72
                                            }
                                            catch (n9 v8) {
                                                throw m44.a("l", (Object)v8, (long)4077520044886258121L, (long)var2_2);
                                            }
                                            if (v7 == v7.c) break block30;
                                        }
                                        catch (n9 v9) {
                                            throw m44.a("l", (Object)v9, (long)4077520044886258121L, (long)var2_2);
                                        }
                                        v4 = var5_4[var6_5 - 1];
                                        if (var4_3 == null) {
                                        }
                                        ** GOTO lbl81
                                    }
                                    catch (n9 v10) {
                                        throw m44.a("l", (Object)v10, (long)4077520044886258121L, (long)var2_2);
                                    }
                                    if (var2_2 < 0L) ** GOTO lbl81
                                    if (v4 == v7.z) {
                                    }
                                    ** GOTO lbl77
                                }
                                catch (n9 v11) {
                                    throw m44.a("l", (Object)v11, (long)4077520044886258121L, (long)var2_2);
                                }
                            }
                            v2 = this;
                        }
                        catch (n9 v12) {
                            throw m44.a("l", (Object)v12, (long)4077520044886258121L, (long)var2_2);
                        }
                    }
                    v13 = v2.W;
                    do {
                        block31: {
                            block32: {
                                v7 = v13[var6_5];
lbl72:
                                // 2 sources

                                var7_6 = v7;
                                try {
                                    v14 = var4_3;
                                    if (var2_2 <= 0L) break block31;
                                    if (v14 == null) break block32;
lbl77:
                                    // 3 sources

                                    v4 = v7.w;
                                }
                                catch (n9 v15) {
                                    throw m44.a("l", (Object)v15, (long)4077520044886258121L, (long)var2_2);
                                }
lbl81:
                                // 5 sources

                                var7_6 = v4;
                            }
                            var5_4[var6_5] = var7_6;
                            ++var6_5;
                            v14 = var4_3;
                        }
                        if (v14 == null) continue block20;
                        v13 = var5_4;
                    } while (var2_2 <= 0L);
                }
                return v13;
            }
            v0 = this;
        }
        return v0.W;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean o(loj var1_1, hz var2_2, char var3_3, Set var4_4, boolean var5_5, char var6_6, String var7_7, int var8_8) {
        block16: {
            block14: {
                block17: {
                    block15: {
                        block13: {
                            v0 = var9_9 = ((long)var3_3 << 48 | (long)var6_6 << 48 >>> 16 | (long)var8_8 << 32 >>> 32) ^ hz.b;
                            var11_10 = v0 ^ 120892197869838L;
                            var13_11 = v0 ^ 83111379427164L;
                            var15_12 = v0 ^ 84986785338357L;
                            var17_13 = m44.a("h", (long)993835037986126106L, (long)var9_9);
                            try {
                                try {
                                    v1 /* !! */  = this.Q(var11_10, var1_1, var2_2, var7_7);
                                    if (var17_13 != null) break block13;
                                    if (!v1 /* !! */ ) break block14;
                                }
                                catch (n9 v2) {
                                    throw m44.a("h", (Object)v2, (long)971201891047883813L, (long)var9_9);
                                }
                                v1 /* !! */  = this.w(var15_12, var1_1, var2_2, var7_7);
                            }
                            catch (n9 v3) {
                                throw m44.a("h", (Object)v3, (long)971201891047883813L, (long)var9_9);
                            }
                        }
                        try {
                            v4 = var17_13;
                            if (var6_6 > '\u0000') {
                                if (v4 != null) break block15;
                                if (!v1 /* !! */ ) break block14;
                            }
                            ** GOTO lbl35
                        }
                        catch (n9 v5) {
                            throw m44.a("h", (Object)v5, (long)971201891047883813L, (long)var9_9);
                        }
                        v1 /* !! */  = var5_5;
                    }
                    try {
                        try {
                            try {
                                v4 = var17_13;
lbl35:
                                // 2 sources

                                if (v4 != null) break block16;
                                if (!v1 /* !! */ ) break block17;
                            }
                            catch (n9 v6) {
                                throw m44.a("h", (Object)v6, (long)971201891047883813L, (long)var9_9);
                            }
                            v7 = new Object[3];
                            v7[2] = var4_4;
                            v7[1] = var13_11;
                            v7[0] = var2_2;
                            v1 /* !! */  = m44.a("i", (Object)this, (Object)v7, (long)1143265697853967678L, (long)var9_9);
                            if (var17_13 != null) break block16;
                        }
                        catch (n9 v8) {
                            throw m44.a("h", (Object)v8, (long)971201891047883813L, (long)var9_9);
                        }
                        if (!v1 /* !! */ ) break block14;
                    }
                    catch (n9 v9) {
                        throw m44.a("h", (Object)v9, (long)971201891047883813L, (long)var9_9);
                    }
                }
                v1 /* !! */  = true;
                break block16;
            }
            v1 /* !! */  = false;
        }
        return v1 /* !! */ ;
    }

    boolean f(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        return this.K.get(n10);
    }

    public boolean V(long l10, int n10) {
        boolean bl2;
        block8: {
            block7: {
                v7 v72;
                CallSite callSite;
                block6: {
                    l10 = b ^ l10;
                    callSite = m44.a("n", (long)2422013041999926604L, (long)l10);
                    try {
                        try {
                            v72 = this.W[n10];
                            if (callSite != null) break block6;
                            if (v72 == null) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("n", (Object)n92, (long)2390304526728161395L, (long)l10);
                        }
                        v72 = this.W[n10];
                    }
                    catch (n9 n93) {
                        throw m44.a("n", (Object)n93, (long)2390304526728161395L, (long)l10);
                    }
                }
                try {
                    bl2 = v72.y("?");
                    if (callSite != null) break block8;
                    if (bl2) break block7;
                }
                catch (n9 n94) {
                    throw m44.a("n", (Object)n94, (long)2390304526728161395L, (long)l10);
                }
                bl2 = true;
                break block8;
            }
            bl2 = false;
        }
        return bl2;
    }

    boolean Q(int n10, char c10, char c11, int n11) {
        boolean bl2;
        block13: {
            block11: {
                v7 v72;
                v7 v73;
                long l10;
                block12: {
                    CallSite callSite;
                    block10: {
                        l10 = ((long)n10 << 32 | (long)c10 << 48 >>> 32 | (long)c11 << 48 >>> 48) ^ b;
                        long l11 = l10 ^ 0x6157C21FA950L;
                        callSite = m44.a("n", (long)4867533528728385372L, (long)l10);
                        try {
                            try {
                                v73 = this.W[n11];
                                if (callSite != null) break block10;
                                if (v73.i(l11)) break block11;
                            }
                            catch (n9 n92) {
                                throw m44.a("n", (Object)n92, (long)4844847073336461923L, (long)l10);
                            }
                            v73 = this.W[n11];
                        }
                        catch (n9 n93) {
                            throw m44.a("n", (Object)n93, (long)4844847073336461923L, (long)l10);
                        }
                    }
                    try {
                        try {
                            v72 = v7.X;
                            if (n10 < 0 || callSite != null) break block12;
                            if (v73 == v72) break block11;
                        }
                        catch (n9 n94) {
                            throw m44.a("n", (Object)n94, (long)4844847073336461923L, (long)l10);
                        }
                        v73 = this.W[n11];
                        v72 = v7.w;
                    }
                    catch (n9 n95) {
                        throw m44.a("n", (Object)n95, (long)4844847073336461923L, (long)l10);
                    }
                }
                try {
                    if (v73 == v72) break block11;
                    bl2 = true;
                    break block13;
                }
                catch (n9 n96) {
                    throw m44.a("n", (Object)n96, (long)4844847073336461923L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    public boolean q(Object[] var1_1) {
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
    boolean n(int var1_1, char var2_2, BitSet var3_3, short var4_4) {
        block14: {
            block16: {
                block15: {
                    block13: {
                        block12: {
                            var5_5 = ((long)var1_1 << 32 | (long)var2_2 << 48 >>> 32 | (long)var4_4 << 48 >>> 48) ^ hz.b;
                            var9_6 = null;
                            var7_7 = m44.a("k", (long)1910034935997918801L, (long)var5_5);
                            try {
                                v0 = this.K;
                                if (var7_7 != null) break block12;
                                if (v0 == null) {
                                }
                                ** GOTO lbl19
                            }
                            catch (n9 v1) {
                                throw m44.a("k", (Object)v1, (long)1887403988360024942L, (long)var5_5);
                            }
                            this.K = new BitSet(this.W.length);
                            var8_8 = true;
                            try {
                                block17: {
                                    v2 = var7_7;
                                    if (var4_4 > 0) {
                                        if (v2 == null) break block13;
                                    }
                                    break block17;
lbl19:
                                    // 2 sources

                                    v2 = this.K.clone();
                                }
                                v0 = (BitSet)v2;
                            }
                            catch (n9 v3) {
                                throw m44.a("k", (Object)v3, (long)1887403988360024942L, (long)var5_5);
                            }
                        }
                        var9_6 = v0;
                        var8_8 = false;
                    }
                    try {
                        try {
                            try {
                                this.K.or(var3_3);
                                v4 = var8_8;
                                if (var7_7 != null) break block14;
                                if (v4) break block15;
                            }
                            catch (n9 v5) {
                                throw m44.a("k", (Object)v5, (long)1887403988360024942L, (long)var5_5);
                            }
                            v4 = this.K.equals(var9_6);
                            if (var7_7 != null) break block14;
                        }
                        catch (n9 v6) {
                            throw m44.a("k", (Object)v6, (long)1887403988360024942L, (long)var5_5);
                        }
                        if (v4) break block16;
                    }
                    catch (n9 v7) {
                        throw m44.a("k", (Object)v7, (long)1887403988360024942L, (long)var5_5);
                    }
                }
                v4 = true;
                break block14;
            }
            v4 = false;
        }
        return v4;
    }

    public Set k(long l10) {
        l10 = b ^ l10;
        try {
            if (this.M != null) {
                return new LinkedHashSet(this.M);
            }
        }
        catch (n9 n92) {
            throw m44.a("m", (Object)n92, (long)3411222716440831496L, (long)l10);
        }
        return null;
    }

    boolean g(long l10) {
        boolean bl2;
        l10 = b ^ l10;
        try {
            bl2 = this.K != null;
        }
        catch (n9 n92) {
            throw m44.a("i", (Object)n92, (long)-5128647876839771764L, (long)l10);
        }
        return bl2;
    }

    BitSet J() {
        return (BitSet)this.K.clone();
    }

    /*
     * Exception decompiling
     */
    public static v7[] z(int var0, loj var1_1, v7[] var2_2, v7[] var3_3, char var4_4, boolean var5_5, short var6_6, zr var7_7, String var8_8) {
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

    public fb j() {
        return this.a;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                hz.b = prr.a(-6663684786602406894L, -8221204524858666917L, MethodHandles.lookup().lookupClass()).a(80380328495126L);
                var9 = hz.b ^ 55634394472689L;
                hz.e = new HashMap<K, V>(13);
                m44.a("j", null, (long)-4840196781345832408L, (long)var9);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[5];
                var5_4 = 0;
                var4_5 = "\u0093\u00e3 \u00df\u00c2\u0019!Od\u0004\u00d6\u007f3\u0004\u0007\u00a8\u0010\t\u0097\u0016'27\u0003\u00cc\u00caC\u00bd,0\u0018\u00e6\u00c20/\u00d3\fH.\u0091\u00d3\u0095\u00f6\u008b\u0091a\u00b9I=X\u00a5I3:0wA\u0082\u0005\u00ef\u00a9X\u00d8\u00a8\u00da4\u00a2\u0086\u0084\u00a2\u009cP\u00d91w\u0098\u009a\u00eb\u00c1\u00a0\u00fbC";
                var6_6 = "\u0093\u00e3 \u00df\u00c2\u0019!Od\u0004\u00d6\u007f3\u0004\u0007\u00a8\u0010\t\u0097\u0016'27\u0003\u00cc\u00caC\u00bd,0\u0018\u00e6\u00c20/\u00d3\fH.\u0091\u00d3\u0095\u00f6\u008b\u0091a\u00b9I=X\u00a5I3:0wA\u0082\u0005\u00ef\u00a9X\u00d8\u00a8\u00da4\u00a2\u0086\u0084\u00a2\u009cP\u00d91w\u0098\u009a\u00eb\u00c1\u00a0\u00fbC".length();
                var3_7 = 16;
                var2_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = hz.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "Jck3\u00f3\u00b7\u00a4\u00e0r\u00c7\u001e\u00f7\u00db)S@\u009f\u0000X\u0007h\u00f1=\u0002Y\u00ed3O\u000b\t\u00b7\u0091\rA\u00d9\u00c6\u00e2\u0096\u00a0\u00f6\u00d8\u0087\u009cYEp`\u00a1g\u00b3\u00fa\"7Y\u00eb\u00fd@\u00eb\u001e{\u00a9\f\u0080\u00eaO\b3X\u00dc\b\u00f3\u00173\u001b;\u001b\u001d\u0002\u00cf\u0080EV\n\u0093r\u0087\u0088\u00da\u00baaIp\u00ec)\u008cm\u001f\u0088as\u00b8\u009e\u009bT\u0018\u00f7!|u\u00af\u0097\u009c6\u00fc\u00eb\u00ab\u00b9\u0092%\u0081>";
                    var6_6 = "Jck3\u00f3\u00b7\u00a4\u00e0r\u00c7\u001e\u00f7\u00db)S@\u009f\u0000X\u0007h\u00f1=\u0002Y\u00ed3O\u000b\t\u00b7\u0091\rA\u00d9\u00c6\u00e2\u0096\u00a0\u00f6\u00d8\u0087\u009cYEp`\u00a1g\u00b3\u00fa\"7Y\u00eb\u00fd@\u00eb\u001e{\u00a9\f\u0080\u00eaO\b3X\u00dc\b\u00f3\u00173\u001b;\u001b\u001d\u0002\u00cf\u0080EV\n\u0093r\u0087\u0088\u00da\u00baaIp\u00ec)\u008cm\u001f\u0088as\u00b8\u009e\u009bT\u0018\u00f7!|u\u00af\u0097\u009c6\u00fc\u00eb\u00ab\u00b9\u0092%\u0081>".length();
                    var3_7 = 56;
                    var2_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = hz.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        hz.c = var7_3;
        hz.d = new String[5];
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x2A9;
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
                throw new RuntimeException("com/zelix/hz", exception);
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
            hz.d[n11] = hz.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = hz.a(n10, l10);
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
            throw new RuntimeException("com/zelix/hz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(hz.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

