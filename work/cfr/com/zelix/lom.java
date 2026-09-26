/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._2;
import com.zelix._z;
import com.zelix.bc;
import com.zelix.e;
import com.zelix.hz;
import com.zelix.iq;
import com.zelix.k6;
import com.zelix.l;
import com.zelix.lb6;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.ss;
import com.zelix.sz;
import com.zelix.t6;
import com.zelix.v7;
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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lom {
    private final hz[] h;
    private final e s;
    private final l T;
    private static boolean[][][] B;
    private final bc I;
    private final String J;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    /*
     * Unable to fully structure code
     */
    private static boolean[][] u(Object[] var0) {
        var5_1 = (Integer)var0[0];
        var2_2 = (Long)var0[1];
        var1_3 = (boolean[])var0[2];
        var4_4 = (boolean[][])var0[3];
        var2_2 = lom.a ^ var2_2;
        var7_5 = var4_4;
        var6_6 = m44.a("l", (long)7567885702116318678L, (long)var2_2);
        var8_7 = 0;
        block14: while (true) {
            v0 = var8_7;
            block15: while (v0 < var1_3.length) {
                block21: {
                    try {
                        try {
                            v1 = var1_3[var8_7];
                            v2 = var6_6;
                            while (true) {
                                if (v2 != null) break block21;
                                if (v1 != 0) {
                                }
                                ** GOTO lbl95
                                break;
                            }
                        }
                        catch (n9 v3) {
                            throw m44.a("l", (Object)v3, (long)7551938844415099143L, (long)var2_2);
                        }
                        v1 = var7_5.length / 2;
                    }
                    catch (n9 v4) {
                        throw m44.a("l", (Object)v4, (long)7551938844415099143L, (long)var2_2);
                    }
                }
                v5 = new boolean[v1][var5_1];
                do {
                    var9_8 = v5;
                    var10_9 = (int)m44.a("l", (double)2.0, (double)(var8_7 + 1), (long)7656590836413585751L, (long)var2_2);
                    var11_10 = var4_4.length / var10_9;
                    var12_11 = 1;
                    var13_12 = 0;
                    var14_13 = 1;
                    var15_14 = 0;
                    while (var15_14 < var7_5.length) {
                        block24: {
                            block25: {
                                block26: {
                                    block27: {
                                        block28: {
                                            block22: {
                                                block23: {
                                                    v0 = var12_11;
                                                    if (var6_6 != null) continue block15;
                                                    try {
                                                        try {
                                                            v2 = var6_6;
                                                            if (var2_2 < 0L) ** continue;
                                                            if (v2 != null) break block22;
                                                            if (v0 == 0) break block23;
                                                        }
                                                        catch (n9 v6) {
                                                            throw m44.a("l", (Object)v6, (long)7551938844415099143L, (long)var2_2);
                                                        }
                                                        System.arraycopy(var7_5[var15_14], 0, var9_8[var13_12], 0, var5_1);
                                                        ++var13_12;
                                                    }
                                                    catch (n9 v7) {
                                                        throw m44.a("l", (Object)v7, (long)7551938844415099143L, (long)var2_2);
                                                    }
                                                }
                                                try {
                                                    ++var14_13;
                                                    v8 = var6_6;
                                                    if (var2_2 < 0L) break block24;
                                                    if (v8 != null) break block25;
                                                    v9 = var14_13;
                                                }
                                                catch (n9 v10) {
                                                    throw m44.a("l", (Object)v10, (long)7551938844415099143L, (long)var2_2);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (var2_2 > 0L) {
                                                        if (v9 <= var11_10) break block26;
                                                        v9 = var12_11;
                                                    }
                                                    if (var6_6 != null) break block27;
                                                }
                                                catch (n9 v11) {
                                                    throw m44.a("l", (Object)v11, (long)7551938844415099143L, (long)var2_2);
                                                }
                                                if (v9 != 0) break block28;
                                            }
                                            catch (n9 v12) {
                                                throw m44.a("l", (Object)v12, (long)7551938844415099143L, (long)var2_2);
                                            }
                                            v9 = 1;
                                            break block27;
                                        }
                                        v9 = 0;
                                    }
                                    var12_11 = v9;
                                    var14_13 = 1;
                                }
                                ++var15_14;
                            }
                            v8 = var6_6;
                        }
                        if (v8 == null) continue;
                    }
                    v5 = var9_8;
                    if (var2_2 <= 0L) break block14;
                    var7_5 = v5;
lbl95:
                    // 2 sources

                    ++var8_7;
                    if (var6_6 == null) continue block14;
                    v5 = var7_5;
                } while (var2_2 < 0L);
            }
            break;
        }
        return v5;
    }

    private boolean[][] a(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        Integer[] integerArray = (Integer[])objectArray[1];
        boolean[][] blArray = (boolean[][])objectArray[2];
        long l10 = (Long)objectArray[3];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x6371A0AD68C2L;
        long l13 = l11 ^ 0x5F0730D8B2C1L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l12;
        objectArray2[1] = integerArray;
        objectArray2[0] = n10;
        CallSite callSite = m44.a("l", (Object)this, (Object)objectArray2, (long)4373195132955736349L, (long)l10);
        Object[] objectArray3 = new Object[4];
        objectArray3[3] = blArray;
        objectArray3[2] = callSite;
        objectArray3[1] = l13;
        objectArray3[0] = n10;
        return m44.a("m", (Object)objectArray3, (long)4430582921888465729L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static boolean[][] F(Object[] objectArray) {
        CallSite callSite;
        block13: {
            int n10;
            CallSite callSite2;
            block20: {
                long l10;
                int n11;
                block14: {
                    n11 = (Integer)objectArray[0];
                    l10 = (Long)objectArray[1];
                    l10 = a ^ l10;
                    CallSite callSite3 = m44.a("m", (long)4685955163223406039L, (long)l10);
                    try {
                        callSite = m44.a("i", (long)6570491205055862310L, (long)l10)[n11];
                        if (callSite3 != null) break block13;
                        if (callSite != null) break block14;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)n92, (long)4669314490199058694L, (long)l10);
                    }
                    int n12 = (int)m44.a("m", (double)2.0, (double)n11, (long)4774079880604250454L, (long)l10);
                    boolean[][] blArray = new boolean[n12][n11];
                    int n13 = 0;
                    block6: while (true) {
                        int n14 = n13;
                        int n15 = n11;
                        block7: while (n14 < n15) {
                            CallSite callSite4;
                            int n16 = (int)m44.a("m", (double)2.0, (double)(n13 + 1), (long)4774079880604250454L, (long)l10);
                            int n17 = n12;
                            int n18 = n16;
                            block8: while (true) {
                                int n19 = n17 / n18;
                                boolean bl2 = true;
                                int n20 = 0;
                                if (callSite3 != null) break block14;
                                int n21 = 0;
                                block9: while (n21 < n12) {
                                    CallSite callSite5;
                                    try {
                                        ++n20;
                                        callSite5 = callSite3;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("m", (Object)n93, (long)4669314490199058694L, (long)l10);
                                    }
                                    do {
                                        block17: {
                                            block18: {
                                                block19: {
                                                    boolean bl3;
                                                    block15: {
                                                        block16: {
                                                            if (l10 < 0L) break block17;
                                                            if (callSite5 != null) break block18;
                                                            n14 = n20;
                                                            n15 = n19;
                                                            if (callSite3 != null) continue block7;
                                                            if (l10 <= 0L) continue block8;
                                                            if (n14 <= n15) break block19;
                                                            n20 = 1;
                                                            try {
                                                                bl3 = bl2;
                                                                if (callSite3 != null) break block15;
                                                                if (bl3) break block16;
                                                            }
                                                            catch (n9 n94) {
                                                                throw m44.a("m", (Object)n94, (long)4669314490199058694L, (long)l10);
                                                            }
                                                            bl3 = true;
                                                            break block15;
                                                        }
                                                        bl3 = false;
                                                    }
                                                    bl2 = bl3;
                                                }
                                                blArray[n21][n13] = bl2;
                                                ++n21;
                                            }
                                            callSite5 = callSite3;
                                        }
                                        if (callSite5 == null) continue block9;
                                        ++n13;
                                        callSite4 = callSite3;
                                    } while (l10 <= 0L);
                                }
                                break;
                            }
                            if (callSite4 == null) continue block6;
                        }
                        break;
                    }
                    callSite2 = m44.a("i", (long)6570491205055862310L, (long)l10);
                    n10 = n11;
                    if (l10 < 0L) break block20;
                    callSite2[n10] = blArray;
                }
                callSite2 = m44.a("i", (long)6570491205055862310L, (long)l10);
                n10 = n11;
            }
            callSite = callSite2[n10];
        }
        return callSite;
    }

    /*
     * Exception decompiling
     */
    private _z[] l(Object[] var1_1) {
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
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        lom.a = prr.a(-7754686077551777261L, 7224157114327018093L, MethodHandles.lookup().lookupClass()).a(163647646743404L);
                        var20 = lom.a ^ 6706937681643L;
                        lom.d = new HashMap<K, V>(13);
                        var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                            v2 = v2;
                            v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                        }
                        var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_3 = new String[5];
                        var16_4 = 0;
                        var15_5 = "<\u00d4\u00dc5\u00b6\u0083\u0000\u00a6\u00a0\u0098gh\u00aa,IY(g]\u00c9\u0096\u00a0l\u00e8>Y\u00c1\u0002!\u00b3j\u000b?\u00cd\u00cd.%\u00a1v0\u0087\u00e5\u00afz@}\u0096-U\u00fcbA\u00b4+\u0006\u00a3\n(\u00fc\u00c2\u00bfg\u0012_\u00c6aB\u00be(\u00f1\u0019F\u00db\u00a93\u001f\u009c\u00dfD\u00bc\u009a`\u0014r1k\u00f5\u00c1\u0019\u00d7\fw\u008b~D\u008cR\u009d";
                        var17_6 = "<\u00d4\u00dc5\u00b6\u0083\u0000\u00a6\u00a0\u0098gh\u00aa,IY(g]\u00c9\u0096\u00a0l\u00e8>Y\u00c1\u0002!\u00b3j\u000b?\u00cd\u00cd.%\u00a1v0\u0087\u00e5\u00afz@}\u0096-U\u00fcbA\u00b4+\u0006\u00a3\n(\u00fc\u00c2\u00bfg\u0012_\u00c6aB\u00be(\u00f1\u0019F\u00db\u00a93\u001f\u009c\u00dfD\u00bc\u009a`\u0014r1k\u00f5\u00c1\u0019\u00d7\fw\u008b~D\u008cR\u009d".length();
                        var14_7 = 16;
                        var13_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = lom.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u0084y\u0082\n4\u00b6\u0014\u00b03\u0088\u00f7\u009b\u00ee\u00ecH \u0010\u00f3\u00cc\u00f1Q+\u00ba\u000b\u00b3@\u00f7?Me\u00fc\u00a3\u009c";
                            var17_6 = "\u0084y\u0082\n4\u00b6\u0014\u00b03\u0088\u00f7\u009b\u00ee\u00ecH \u0010\u00f3\u00cc\u00f1Q+\u00ba\u000b\u00b3@\u00f7?Me\u00fc\u00a3\u009c".length();
                            var14_7 = 16;
                            var13_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = lom.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var11_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                lom.b = var18_3;
                lom.c = new String[5];
                lom.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[8];
                var3_13 = 0;
                var4_14 = "\u0017wT\u000e\u009b\u008b\bv\u0004\u0000\u00b5O\u00b9\u0095<\u00c2\u0010\u00f3\u0081l6\u0004\u00f5\u0083\"\u008eq\u00c95g\u00bb.\u00b5\u001c\u00aaF\u0091\u00a3lCR\u00cfM\u0083>\u00d4,\u00ca";
                var5_15 = "\u0017wT\u000e\u009b\u008b\bv\u0004\u0000\u00b5O\u00b9\u0095<\u00c2\u0010\u00f3\u0081l6\u0004\u00f5\u0083\"\u008eq\u00c95g\u00bb.\u00b5\u001c\u00aaF\u0091\u00a3lCR\u00cfM\u0083>\u00d4,\u00ca".length();
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
                    var4_14 = "ZD\u00ccfBS\u00e6\u00ae\u0099A\u00ec\u008ae2\u0018\u0002";
                    var5_15 = "ZD\u00ccfBS\u00e6\u00ae\u0099A\u00ec\u008ae2\u0018\u0002".length();
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
        lom.e = var6_12;
        lom.f = new Integer[8];
        m44.a("o", (boolean[][][])new boolean[lom.b("c", (int)32107, (long)(6003501289198723625L ^ var20))][][], (long)-5017473882552912041L, (long)var20);
    }

    /*
     * Exception decompiling
     */
    public _z[] M(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [18[DOLOOP]], but top level block is 21[SIMPLE_IF_TAKEN]
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

    public lom(bc bc2, long l10, l l11) {
        block8: {
            long l12;
            block9: {
                l l13;
                block6: {
                    long l14 = l10 = a ^ l10;
                    long l15 = l14 ^ 0x12D9745C7B5EL;
                    l12 = l14 ^ 0x7C1BD1C1BB12L;
                    long l16 = l14 ^ 0x7BD3C03CDC80L;
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l15;
                    this.s = m44.a("p", (Object)bc2, (Object)objectArray, (long)5841405731327061191L, (long)l10);
                    this.I = bc2;
                    CallSite callSite = m44.a("o", (long)5633395148730055421L, (long)l10);
                    try {
                        lom lom2;
                        block7: {
                            try {
                                try {
                                    lom2 = this;
                                    l13 = l11;
                                    if (callSite != null) break block6;
                                    lom2.T = l13;
                                    if (m44.a("k", (long)5632737795102024275L, (long)l10) == false) break block7;
                                }
                                catch (n9 n92) {
                                    throw m44.a("o", (Object)n92, (long)5757483394389124652L, (long)l10);
                                }
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l16;
                                this.h = m44.a("p", (Object)l11, (Object)objectArray2, (long)5738505050341883264L, (long)l10);
                                if (l10 <= 0L) break block8;
                                if (callSite == null) break block9;
                            }
                            catch (n9 n93) {
                                throw m44.a("o", (Object)n93, (long)5757483394389124652L, (long)l10);
                            }
                        }
                        lom2 = this;
                        l13 = l11;
                    }
                    catch (n9 n94) {
                        throw m44.a("o", (Object)n94, (long)5757483394389124652L, (long)l10);
                    }
                }
                lom2.h = l13.w();
            }
            this.J = bc2.v(l12);
        }
    }

    /*
     * Exception decompiling
     */
    private boolean[] G(Object[] var1_1) {
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
    public _z[] b(Object[] var1_1) {
        block48: {
            block45: {
                block43: {
                    block44: {
                        block41: {
                            block42: {
                                var8_2 = (k6)var1_1[0];
                                var7_3 = (t6)var1_1[1];
                                var4_4 = (Long)var1_1[2];
                                var9_5 = (Set)var1_1[3];
                                var2_6 = (List)var1_1[4];
                                var6_7 = ((Boolean)var1_1[5]).booleanValue();
                                var3_8 = ((Boolean)var1_1[6]).booleanValue();
                                v0 = var4_4 = lom.a ^ var4_4;
                                v1 = v0 ^ 66286929652036L;
                                var10_9 = (int)(v1 >>> 32);
                                var11_10 = (int)(v1 << 32 >>> 48);
                                var12_11 = (int)(v1 << 48 >>> 48);
                                var13_12 = v0 ^ 93933211306426L;
                                var15_13 = v0 ^ 22284494978007L;
                                var17_14 = v0 ^ 65016147249859L;
                                var19_15 = v0 ^ 8909886604828L;
                                var21_16 = v0 ^ 63944084635834L;
                                var23_17 = v0 ^ 38911187012319L;
                                var25_18 = v0 ^ 95400836531964L;
                                var27_19 = v0 ^ 23315598966628L;
                                var29_20 = v0 ^ 71476809168917L;
                                v2 = new Object[1];
                                v2[0] = var19_15;
                                var32_21 = m44.a("p", (Object)m44.a("q", (Object)this, (long)-6485880143206665025L, (long)var4_4), (Object)v2, (long)-4752867032435085705L, (long)var4_4);
                                var33_22 = ((CallSite)var32_21).length;
                                v3 = new Object[1];
                                v3[0] = var21_16;
                                var34_23 = m44.a("o", (Object)v3, (long)-6566600324197269444L, (long)var4_4);
                                v4 = new Object[1];
                                v4[0] = var21_16;
                                var35_24 = m44.a("o", (Object)v4, (long)-6566600324197269444L, (long)var4_4);
                                var36_25 = new _z[var33_22];
                                var31_26 = m44.a("o", (long)-5150530380867154859L, (long)var4_4);
                                var37_27 = new lb6(-1);
                                var38_28 = new sz(var10_9, (short)var11_10, (char)var12_11);
                                var39_29 = new sz(var10_9, (short)var11_10, (char)var12_11);
                                try {
                                    try {
                                        v5 = this.h.length;
                                        if (var31_26 != null) break block41;
                                        if (v5 > 0) {
                                        }
                                        break block42;
                                    }
                                    catch (n9 v6) {
                                        throw m44.a("o", (Object)v6, (long)-5093918320793563004L, (long)var4_4);
                                    }
                                    var38_28.Z(var29_20, ss.s(var8_2, this.h[0].T(), var7_3, var15_13, var9_5, var2_6, true, (Map)var34_23, (Map)var35_24));
                                    var39_29.Z(var29_20, new ss[0]);
                                }
                                catch (n9 v7) {
                                    throw m44.a("o", (Object)v7, (long)-5093918320793563004L, (long)var4_4);
                                }
                            }
                            v5 = var6_7;
                        }
                        try {
                            try {
                                try {
                                    if (var31_26 != null) break block43;
                                    if (v5 != 0) break block44;
                                }
                                catch (n9 v8) {
                                    throw m44.a("o", (Object)v8, (long)-5093918320793563004L, (long)var4_4);
                                }
                                v5 = var3_8;
                                if (var31_26 != null) break block43;
                            }
                            catch (n9 v9) {
                                throw m44.a("o", (Object)v9, (long)-5093918320793563004L, (long)var4_4);
                            }
                            if (v5 == 0) break block45;
                        }
                        catch (n9 v10) {
                            throw m44.a("o", (Object)v10, (long)-5093918320793563004L, (long)var4_4);
                        }
                    }
                    v5 = var40_30 = 0;
                }
                while (var40_30 < var33_22) {
                    block46: {
                        block47: {
                            var41_32 = var32_21[var40_30].intValue();
                            var42_33 = this.h[var41_32];
                            try {
                                try {
                                    v11 = var31_26;
                                    if (var4_4 < 0L) break block46;
                                    if (v11 != null) break block47;
                                    v12 = var42_33;
                                    if (var31_26 != null) break block48;
                                }
                                catch (n9 v13) {
                                    throw m44.a("o", (Object)v13, (long)-5093918320793563004L, (long)var4_4);
                                }
                                v14 = new Object[1];
                                v14[0] = var25_18;
                                if (m44.a("p", (Object)v12, (Object)v14, (long)-5107381246513679677L, (long)var4_4) != false) {
                                }
                                ** GOTO lbl108
                            }
                            catch (n9 v15) {
                                throw m44.a("o", (Object)v15, (long)-5093918320793563004L, (long)var4_4);
                            }
                            var6_7 = 0;
                            var3_8 = 0;
                            try {
                                if (var4_4 >= 0L) {
                                    if (var31_26 == null) break;
                                }
                                break block47;
lbl108:
                                // 2 sources

                                ++var40_30;
                            }
                            catch (n9 v16) {
                                throw m44.a("o", (Object)v16, (long)-5093918320793563004L, (long)var4_4);
                            }
                        }
                        v11 = var31_26;
                    }
                    if (v11 == null) continue;
                }
            }
            v12 = this.h[0];
        }
        var40_31 = v12;
        var41_32 = 0;
        while (var41_32 < var33_22) {
            block54: {
                block55: {
                    block57: {
                        block56: {
                            block52: {
                                block51: {
                                    block49: {
                                        block50: {
                                            var42_34 = var32_21[var41_32].intValue();
                                            var43_35 = (iq)this.s.get(var42_34);
                                            var44_36 = this.h[var42_34];
                                            try {
                                                v17 = var44_36;
                                                v18 = var31_26;
                                                if (var4_4 <= 0L) break block49;
                                                if (v18 != null) break block50;
                                                if (v17 != null) break block51;
                                            }
                                            catch (n9 v19) {
                                                throw m44.a("o", (Object)v19, (long)-5093918320793563004L, (long)var4_4);
                                            }
                                            v17 = var44_36;
                                        }
                                        v20 = new String[lom.b("c", (int)12920, (long)(954102966156424655L ^ var4_4))];
                                        v20[0] = lom.a("l", (int)26487, (long)(350554825207299956L ^ var4_4));
                                        v20[1] = m44.a("o", (int)var42_34, (long)-6747875760295161899L, (long)var4_4);
                                        v20[2] = lom.a("l", (int)25542, (long)(3080787009036401604L ^ var4_4));
                                        v20[3] = m44.a("q", (Object)this, (long)-6492672371325475192L, (long)var4_4);
                                        v20[4] = lom.a("l", (int)11712, (long)(675237824938702273L ^ var4_4));
                                        v20[5] = Integer.toHexString((int)m44.a("p", (Object)var43_35, (Object)new Object[0], (long)-5028586571835853164L, (long)var4_4));
                                        v20[lom.b("c", (int)25579, (long)(2484290867835413595L ^ var4_4))] = lom.a("l", (int)18524, (long)(3275916486579294297L ^ var4_4));
                                        v20[lom.b("c", (int)9046, (long)(5155165475015058659L ^ var4_4))] = m44.a("o", (int)var43_35.B(), (long)-6747875760295161899L, (long)var4_4);
                                        v21 = new Object[3];
                                        v21[2] = var17_14;
                                        v18 = v21;
                                        v21[1] = v20;
                                    }
                                    v18[0] = v17;
                                    m44.a("o", (Object)v18, (long)-6875062687217014416L, (long)var4_4);
                                }
                                try {
                                    block53: {
                                        try {
                                            try {
                                                try {
                                                    v22 = var3_8;
                                                    if (var31_26 != null) break block52;
                                                    if (v22 == 0) break block53;
                                                }
                                                catch (n9 v23) {
                                                    throw m44.a("o", (Object)v23, (long)-5093918320793563004L, (long)var4_4);
                                                }
                                                v22 = var41_32;
                                                if (var31_26 != null) break block52;
                                            }
                                            catch (n9 v24) {
                                                throw m44.a("o", (Object)v24, (long)-5093918320793563004L, (long)var4_4);
                                            }
                                            if (v22 < var33_22 - 1) {
                                            }
                                            ** GOTO lbl196
                                        }
                                        catch (n9 v25) {
                                            throw m44.a("o", (Object)v25, (long)-5093918320793563004L, (long)var4_4);
                                        }
                                    }
                                    v22 = var6_7;
                                }
                                catch (n9 v26) {
                                    throw m44.a("o", (Object)v26, (long)-5093918320793563004L, (long)var4_4);
                                }
                            }
                            if (v22 == 0) break block56;
                            v27 = new Object[1];
                            v27[0] = var23_17;
                            var45_37 /* !! */  = m44.a("p", (Object)var44_36, (Object)v27, (long)-6911422678871279412L, (long)var4_4);
                            v28 = var31_26;
                            if (var4_4 <= 0L) ** GOTO lbl194
                            if (v28 == null) break block57;
                        }
                        var45_37 /* !! */  = var44_36.T();
                    }
                    try {
                        var36_25[var41_32] = _z.D(var8_2, var43_35, var44_36.X(), var45_37 /* !! */ , var7_3, var9_5, var27_19, var2_6, var37_27, var39_29, var38_28, (Map)var34_23, (Map)var35_24);
                        v28 = var31_26;
lbl194:
                        // 2 sources

                        if (var4_4 <= 0L) break block54;
                        if (v28 == null) break block55;
lbl196:
                        // 2 sources

                        v29 = new Object[13];
                        v29[12] = var35_24;
                        v29[11] = var34_23;
                        v29[10] = var38_28;
                        v29[9] = var39_29;
                        v29[8] = var37_27;
                        v29[7] = var2_6;
                        v29[6] = var9_5;
                        v29[5] = var13_12;
                        v29[4] = var7_3;
                        v29[3] = var44_36;
                        v29[2] = var40_31;
                        v29[1] = var43_35;
                        v29[0] = var8_2;
                        var36_25[var41_32] = m44.a("n", (Object)this, (Object)v29, (long)-5098357758991660606L, (long)var4_4);
                    }
                    catch (n9 v30) {
                        throw m44.a("o", (Object)v30, (long)-5093918320793563004L, (long)var4_4);
                    }
                }
                var40_31 = var44_36;
                ++var41_32;
                v28 = var31_26;
            }
            if (v28 == null) continue;
        }
        return var36_25;
    }

    /*
     * Exception decompiling
     */
    private int U(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[DOLOOP]], but top level block is 2[TRYBLOCK]
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private _z h(Object[] var1_1) {
        block95: {
            block97: {
                block98: {
                    block99: {
                        block103: {
                            block104: {
                                block101: {
                                    block100: {
                                        block87: {
                                            block91: {
                                                block92: {
                                                    block88: {
                                                        var11_2 = (k6)var1_1[0];
                                                        var3_3 = (iq)var1_1[1];
                                                        var9_4 = (hz)var1_1[2];
                                                        var8_5 = (hz)var1_1[3];
                                                        var4_6 = (t6)var1_1[4];
                                                        var5_7 = (Long)var1_1[5];
                                                        var10_8 = (Set)var1_1[6];
                                                        var12_9 = (List)var1_1[7];
                                                        var2_10 = (lb6)var1_1[8];
                                                        var13_11 = (sz)var1_1[9];
                                                        var14_12 = (sz)var1_1[10];
                                                        var15_13 = (Map)var1_1[11];
                                                        var7_14 = (Map)var1_1[12];
                                                        v0 = var5_7 = lom.a ^ var5_7;
                                                        var16_15 = v0 ^ 52389904657324L;
                                                        var18_16 = v0 ^ 69005861079714L;
                                                        var20_17 = v0 ^ 3155718812217L;
                                                        var22_18 = v0 ^ 108905102544522L;
                                                        var24_19 = v0 ^ 57306102523525L;
                                                        var26_20 = v0 ^ 2515767055166L;
                                                        var28_21 = v0 ^ 19645386582183L;
                                                        var30_22 = v0 ^ 132590868221881L;
                                                        var32_23 = v0 ^ 92096285635970L;
                                                        var34_24 = v0 ^ 58365620176628L;
                                                        var36_25 = v0 ^ 104981525364123L;
                                                        var39_26 = var8_5.T();
                                                        v1 = new Object[1];
                                                        v1[0] = var24_19;
                                                        var40_27 = m44.a("r", (Object)var8_5, (Object)v1, (long)887111047655511190L, (long)var5_7);
                                                        var41_28 = var8_5.X();
                                                        var42_29 = new ArrayList<E>(var12_9);
                                                        var43_30 = new ArrayList<E>(var12_9);
                                                        v2 = new Object[2];
                                                        v2[1] = var22_18;
                                                        v2[0] = var10_8;
                                                        v3 = new Object[2];
                                                        v3[1] = var32_23;
                                                        v3[0] = var15_13;
                                                        v4 = new Object[2];
                                                        v4[1] = var32_23;
                                                        v4[0] = var7_14;
                                                        var44_31 = _z.D(var11_2, var3_3, var41_28, var39_26, var4_6, (Set)m44.a("m", (Object)v2, (long)1390436492281774937L, (long)var5_7), var26_20, var42_29, new lb6(var2_10.U(var28_21)), new sz(var13_11.t(), var20_17), new sz(var14_12.t(), var20_17), (Map)m44.a("m", (Object)v3, (long)1329807150245405435L, (long)var5_7), (Map)m44.a("m", (Object)v4, (long)1329807150245405435L, (long)var5_7));
                                                        v5 = new Object[2];
                                                        v5[1] = var22_18;
                                                        v5[0] = var10_8;
                                                        v6 = new Object[2];
                                                        v6[1] = var32_23;
                                                        v6[0] = var15_13;
                                                        v7 = new Object[2];
                                                        v7[1] = var32_23;
                                                        v7[0] = var7_14;
                                                        var45_32 = _z.D(var11_2, var3_3, var41_28, (v7[])var40_27, var4_6, (Set)m44.a("m", (Object)v5, (long)1390436492281774937L, (long)var5_7), var26_20, var43_30, new lb6(var2_10.U(var28_21)), new sz(var13_11.t(), var20_17), new sz(var14_12.t(), var20_17), (Map)m44.a("m", (Object)v6, (long)1329807150245405435L, (long)var5_7), (Map)m44.a("m", (Object)v7, (long)1329807150245405435L, (long)var5_7));
                                                        var46_33 /* !! */  = 0;
                                                        v8 = m44.a("m", (long)1504119354371268623L, (long)var5_7);
                                                        var47_34 = new v7[var39_26.length];
                                                        System.arraycopy(var39_26, 0, var47_34, 0, var39_26.length);
                                                        v9 = new Object[1];
                                                        v9[0] = var16_15;
                                                        var48_35 = m44.a("r", (Object)var44_31, (Object)v9, (long)1034261336814766583L, (long)var5_7);
                                                        var38_36 = v8;
                                                        try {
                                                            v10 = var48_35;
                                                            v11 = m44.a("i", (long)864465107627252101L, (long)var5_7);
                                                            if (var38_36 != null) break block87;
                                                            if (v10 == v11) {
                                                            }
                                                            ** GOTO lbl176
                                                        }
                                                        catch (n9 v12) {
                                                            throw m44.a("m", (Object)v12, (long)1519071227046952158L, (long)var5_7);
                                                        }
                                                        var49_37 = 0;
                                                        for (ss var53_51 : (ss[])var14_12.t()) {
                                                            block89: {
                                                                block90: {
                                                                    try {
                                                                        try {
                                                                            v13 = var49_37;
                                                                            if (var38_36 != null) break block88;
                                                                            v14 = new Object[1];
                                                                            v14[0] = var36_25;
                                                                            v15 /* !! */  = m44.a("r", (Object)var53_51, (Object)v14, (long)1514056507684611830L, (long)var5_7);
                                                                            if (var38_36 != null) break block89;
                                                                        }
                                                                        catch (n9 v16) {
                                                                            throw m44.a("m", (Object)v16, (long)1519071227046952158L, (long)var5_7);
                                                                        }
                                                                        if (v15 /* !! */  == false) break block90;
                                                                    }
                                                                    catch (n9 v17) {
                                                                        throw m44.a("m", (Object)v17, (long)1519071227046952158L, (long)var5_7);
                                                                    }
                                                                    v15 /* !! */  = (CallSite)2;
                                                                    break block89;
                                                                }
                                                                v15 /* !! */  = (CallSite)true;
                                                            }
                                                            var49_37 = v13 + v15 /* !! */ ;
                                                            if (var38_36 == null) continue;
                                                        }
                                                        if (var5_7 <= 0L) break block97;
                                                        v13 = 0;
                                                    }
                                                    var50_43 = v13;
                                                    v18 = new Object[1];
                                                    v18[0] = var18_16;
                                                    for (CallSite var54_53 : m44.a("r", (Object)((_2)var44_31), (Object)v18, (long)1654924661605385734L, (long)var5_7)) {
                                                        block93: {
                                                            block94: {
                                                                try {
                                                                    try {
                                                                        v19 = var50_43;
                                                                        if (var5_7 <= 0L) break block91;
                                                                        v20 = new Object[1];
                                                                        v20[0] = var36_25;
                                                                        v21 /* !! */  = (int)m44.a("r", (Object)var54_53, (Object)v20, (long)1514056507684611830L, (long)var5_7);
                                                                        if (var38_36 != null) break block92;
                                                                        if (var38_36 != null) break block93;
                                                                    }
                                                                    catch (n9 v22) {
                                                                        throw m44.a("m", (Object)v22, (long)1519071227046952158L, (long)var5_7);
                                                                    }
                                                                    if (v21 /* !! */  == 0) break block94;
                                                                }
                                                                catch (n9 v23) {
                                                                    throw m44.a("m", (Object)v23, (long)1519071227046952158L, (long)var5_7);
                                                                }
                                                                v24 = 2;
                                                                break block93;
                                                            }
                                                            v24 = 1;
                                                        }
                                                        var50_43 = v19 + v24;
                                                        if (var38_36 == null) continue;
                                                    }
                                                    v19 = var49_37 + var50_43;
                                                    if (var5_7 <= 0L) break block91;
                                                    v21 /* !! */  = 1;
                                                }
                                                v19 = v19 - v21 /* !! */ ;
                                            }
                                            var51_48 = (reference)v19;
                                            while (var51_48 >= var49_37) {
                                                block96: {
                                                    try {
                                                        try {
                                                            try {
                                                                v25 /* !! */  = (int)m44.a("r", (Object)var8_5, (Object)new Object[]{(int)var51_48}, (long)986545603008354879L, (long)var5_7);
                                                                v26 = var38_36;
                                                                if (var5_7 > 0L) {
                                                                    if (v26 != null) break block95;
                                                                    v26 = var38_36;
                                                                }
                                                                if (v26 != null) break block96;
                                                            }
                                                            catch (n9 v27) {
                                                                throw m44.a("m", (Object)v27, (long)1519071227046952158L, (long)var5_7);
                                                            }
                                                            if (v25 /* !! */  != 0) break;
                                                        }
                                                        catch (n9 v28) {
                                                            throw m44.a("m", (Object)v28, (long)1519071227046952158L, (long)var5_7);
                                                        }
                                                        var47_34[var51_48] = var40_27[var51_48];
                                                        v29 = true;
                                                    }
                                                    catch (n9 v30) {
                                                        throw m44.a("m", (Object)v30, (long)1519071227046952158L, (long)var5_7);
                                                    }
                                                }
                                                var46_33 /* !! */  = v29;
                                                --var51_48;
                                                v31 = var38_36;
lbl170:
                                                // 2 sources

                                                ** while (v31 != null)
lbl171:
                                                // 1 sources

                                            }
lbl172:
                                            // 3 sources

                                            try {
                                                v31 = var38_36;
                                                if (var5_7 <= 0L) ** GOTO lbl170
                                                if (v31 == null) break block97;
lbl176:
                                                // 2 sources

                                                v10 = var48_35;
                                                v11 = m44.a("i", (long)1513123251526513462L, (long)var5_7);
                                            }
                                            catch (n9 v32) {
                                                throw m44.a("m", (Object)v32, (long)1519071227046952158L, (long)var5_7);
                                            }
                                        }
                                        try {
                                            try {
                                                if (v10 != v11) break block97;
                                                v25 /* !! */  = var41_28.length;
                                                if (var38_36 != null) break block98;
                                            }
                                            catch (n9 v33) {
                                                throw m44.a("m", (Object)v33, (long)1519071227046952158L, (long)var5_7);
                                            }
                                            if (v25 /* !! */  >= 2) break block99;
                                        }
                                        catch (n9 v34) {
                                            throw m44.a("m", (Object)v34, (long)1519071227046952158L, (long)var5_7);
                                        }
                                        var49_38 = (ss[])var14_12.t();
                                        var50_44 = var9_4.T();
                                        v35 = new Object[2];
                                        v35[1] = var50_44;
                                        v35[0] = var30_22;
                                        var51_48 = m44.a("l", (Object)this, (Object)v35, (long)759210535927488069L, (long)var5_7);
                                        v36 = new Object[2];
                                        v36[1] = var39_26;
                                        v36[0] = var30_22;
                                        var52_50 /* !! */  = (int)m44.a("l", (Object)this, (Object)v36, (long)759210535927488069L, (long)var5_7);
                                        var53_52 = -1;
                                        var54_54 = 0;
                                        while (var54_54 <= var51_48) {
                                            try {
                                                if (var38_36 != null) break block99;
                                                if (var50_44[var54_54] != var39_26[var54_54]) break;
                                            }
                                            catch (n9 v37) {
                                                throw m44.a("m", (Object)v37, (long)1519071227046952158L, (long)var5_7);
                                            }
                                            var53_52 = var54_54++;
                                            if (var38_36 == null) continue;
                                        }
                                        try {
                                            try {
                                                try {
                                                    v25 /* !! */  = (int)var51_48;
                                                    v38 = var38_36;
                                                    if (var5_7 > 0L) {
                                                        if (v38 != null) break block98;
                                                        if (v25 /* !! */  >= var52_50 /* !! */ ) break block99;
                                                    }
                                                    ** GOTO lbl325
                                                }
                                                catch (n9 v39) {
                                                    throw m44.a("m", (Object)v39, (long)1519071227046952158L, (long)var5_7);
                                                }
                                                v25 /* !! */  = var53_52;
                                                v38 = var38_36;
                                                if (var5_7 >= 0L) {
                                                    if (v38 != null) break block98;
                                                }
                                                ** GOTO lbl325
                                            }
                                            catch (n9 v40) {
                                                throw m44.a("m", (Object)v40, (long)1519071227046952158L, (long)var5_7);
                                            }
                                            if (v25 /* !! */  != var51_48) break block99;
                                        }
                                        catch (n9 v41) {
                                            throw m44.a("m", (Object)v41, (long)1519071227046952158L, (long)var5_7);
                                        }
                                        var54_54 = var52_50 /* !! */ ;
                                        block71: for (var55_55 /* !! */  = var52_50 /* !! */ ; var55_55 /* !! */  >= var53_52 + 1; --var54_54, --var55_55 /* !! */ ) {
                                            try {
                                                do {
                                                    try {
                                                        try {
                                                            v42 /* !! */  = (int)m44.a("r", (Object)var40_27[var55_55 /* !! */ ], (Object)new Object[0], (long)791761395380941065L, (long)var5_7);
                                                            v43 = var38_36;
                                                            if (var5_7 >= 0L) {
                                                                if (v43 != null) break block100;
                                                                v43 = var38_36;
                                                            }
                                                            if (var5_7 > 0L) {
                                                                if (v43 != null) break block100;
                                                            }
                                                            ** GOTO lbl277
                                                        }
                                                        catch (n9 v44) {
                                                            throw m44.a("m", (Object)v44, (long)1519071227046952158L, (long)var5_7);
                                                        }
                                                        if (v42 /* !! */  == 0) break block71;
                                                    }
                                                    catch (n9 v45) {
                                                        throw m44.a("m", (Object)v45, (long)1519071227046952158L, (long)var5_7);
                                                    }
                                                    var47_34[var55_55 /* !! */ ] = var40_27[var55_55 /* !! */ ];
                                                    if (var38_36 == null) continue block71;
                                                } while (var5_7 <= 0L);
                                                break;
                                            }
                                            catch (n9 v46) {
                                                throw m44.a("m", (Object)v46, (long)1519071227046952158L, (long)var5_7);
                                            }
                                        }
                                        v42 /* !! */  = var54_54;
                                    }
                                    try {
                                        block102: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v43 = var38_36;
lbl277:
                                                                // 2 sources

                                                                if (v43 != null) break block101;
                                                                if (v42 /* !! */  == var51_48) break block102;
                                                            }
                                                            catch (n9 v47) {
                                                                throw m44.a("m", (Object)v47, (long)1519071227046952158L, (long)var5_7);
                                                            }
                                                            v48 = var41_28;
                                                            if (var38_36 != null) break block103;
                                                        }
                                                        catch (n9 v49) {
                                                            throw m44.a("m", (Object)v49, (long)1519071227046952158L, (long)var5_7);
                                                        }
                                                        if (var5_7 <= 0L) break block103;
                                                        if (v48.length == 0) {
                                                        }
                                                        ** GOTO lbl314
                                                    }
                                                    catch (n9 v50) {
                                                        throw m44.a("m", (Object)v50, (long)1519071227046952158L, (long)var5_7);
                                                    }
                                                    if (var5_7 <= 0L) break block104;
                                                    v42 /* !! */  = var54_54 - var51_48;
                                                    if (var38_36 != null) break block101;
                                                }
                                                catch (n9 v51) {
                                                    throw m44.a("m", (Object)v51, (long)1519071227046952158L, (long)var5_7);
                                                }
                                                if (v42 /* !! */  <= 3) {
                                                }
                                                ** GOTO lbl314
                                            }
                                            catch (n9 v52) {
                                                throw m44.a("m", (Object)v52, (long)1519071227046952158L, (long)var5_7);
                                            }
                                        }
                                        v42 /* !! */  = 1;
                                    }
                                    catch (n9 v53) {
                                        throw m44.a("m", (Object)v53, (long)1519071227046952158L, (long)var5_7);
                                    }
                                }
                                var46_33 /* !! */  = v42 /* !! */ ;
                            }
                            try {
                                if (var38_36 == null) break block99;
lbl314:
                                // 3 sources

                                v48 = var39_26;
                            }
                            catch (n9 v54) {
                                throw m44.a("m", (Object)v54, (long)1519071227046952158L, (long)var5_7);
                            }
                        }
                        System.arraycopy(v48, 0, var47_34, 0, var39_26.length);
                    }
                    v25 /* !! */  = var46_33 /* !! */ ;
                }
                try {
                    v38 = var38_36;
lbl325:
                    // 3 sources

                    if (v38 != null) break block95;
                    if (v25 /* !! */  != 0) break block97;
                }
                catch (n9 v55) {
                    throw m44.a("m", (Object)v55, (long)1519071227046952158L, (long)var5_7);
                }
                var49_39 = 0;
                while (var49_39 < var39_26.length) {
                    block105: {
                        block106: {
                            block107: {
                                block109: {
                                    block108: {
                                        var50_45 = var39_26[var49_39];
                                        var51_49 = var40_27[var49_39];
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v56 = var38_36;
                                                            if (var5_7 < 0L) break block105;
                                                            if (v56 != null) break block106;
                                                            v25 /* !! */  = (int)var50_45.n(var34_24);
                                                            if (var38_36 != null) break block95;
                                                        }
                                                        catch (n9 v57) {
                                                            throw m44.a("m", (Object)v57, (long)1519071227046952158L, (long)var5_7);
                                                        }
                                                        if (v25 /* !! */  != 0) break block107;
                                                    }
                                                    catch (n9 v58) {
                                                        throw m44.a("m", (Object)v58, (long)1519071227046952158L, (long)var5_7);
                                                    }
                                                    v59 /* !! */  = m44.a("r", (Object)var50_45, (Object)new Object[0], (long)791761395380941065L, (long)var5_7);
                                                    v60 = var38_36;
                                                    if (var5_7 > 0L) {
                                                        if (v60 != null) break block108;
                                                    }
                                                    ** GOTO lbl371
                                                }
                                                catch (n9 v61) {
                                                    throw m44.a("m", (Object)v61, (long)1519071227046952158L, (long)var5_7);
                                                }
                                                if (v59 /* !! */  != false) break block107;
                                            }
                                            catch (n9 v62) {
                                                throw m44.a("m", (Object)v62, (long)1519071227046952158L, (long)var5_7);
                                            }
                                            v59 /* !! */  = m44.a("r", (Object)var51_49, (Object)new Object[0], (long)791761395380941065L, (long)var5_7);
                                        }
                                        catch (n9 v63) {
                                            throw m44.a("m", (Object)v63, (long)1519071227046952158L, (long)var5_7);
                                        }
                                    }
                                    try {
                                        try {
                                            v60 = var38_36;
lbl371:
                                            // 2 sources

                                            if (v60 != null) break block109;
                                            if (v59 /* !! */  == false) break block107;
                                        }
                                        catch (n9 v64) {
                                            throw m44.a("m", (Object)v64, (long)1519071227046952158L, (long)var5_7);
                                        }
                                        var47_34[var49_39] = var51_49;
                                        v59 /* !! */  = (CallSite)true;
                                    }
                                    catch (n9 v65) {
                                        throw m44.a("m", (Object)v65, (long)1519071227046952158L, (long)var5_7);
                                    }
                                }
                                var46_33 /* !! */  = (int)v59 /* !! */ ;
                            }
                            ++var49_39;
                        }
                        v56 = var38_36;
                    }
                    if (v56 == null) continue;
                }
            }
            if (var5_7 < 0L) return _z.D(var11_2, var3_3, var41_28, var39_26, var4_6, var10_8, var26_20, var12_9, var2_10, var13_11, var14_12, var15_13, var7_14);
            v25 /* !! */  = var46_33 /* !! */ ;
        }
        if (v25 /* !! */  == 0) return _z.D(var11_2, var3_3, var41_28, var39_26, var4_6, var10_8, var26_20, var12_9, var2_10, var13_11, var14_12, var15_13, var7_14);
        return _z.D(var11_2, var3_3, var41_28, var47_34, var4_6, var10_8, var26_20, var12_9, var2_10, var13_11, var14_12, var15_13, var7_14);
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x73F9;
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
                throw new RuntimeException("com/zelix/lom", exception);
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
            lom.c[n11] = lom.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lom.a(n10, l10);
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
            throw new RuntimeException("com/zelix/lom" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x6C4E;
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
                throw new RuntimeException("com/zelix/lom", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lom.f[n11] = n12;
        }
        return f[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = lom.b(n10, l10);
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
            throw new RuntimeException("com/zelix/lom" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lom.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(lom.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

