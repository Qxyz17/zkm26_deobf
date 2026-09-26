/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._z;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.iq;
import com.zelix.k6;
import com.zelix.l6q;
import com.zelix.lb6;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.o9;
import com.zelix.prr;
import com.zelix.ss;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class k7
extends _z {
    private final ss[] C;
    private final ss[] P;
    private final int T;
    private final int Q;
    private static final long a = prr.a((long)4956676683030066576L, (long)-4021420973155999559L, MethodHandles.lookup().lookupClass()).a(60772584929372L);
    private static final long[] c;
    private static final Integer[] f;
    private static final Map m;

    /*
     * Exception decompiling
     */
    void z(gu var1_1, long var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[DOLOOP]], but top level block is 9[SIMPLE_IF_TAKEN]
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at CfrApi.lambda$main$2(CfrApi.java:31)
         *     at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
         *     at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
         *     at java.base/java.lang.Thread.run(Thread.java:829)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public k7(k6 k62, int n, long l, iq iq2, ss[] ssArray, ss[] ssArray2) {
        l = a ^ l;
        super((_4)k62);
        this.T = (int)k7.c("p", (int)15924, (long)(0x423323452DDB58ECL ^ l));
        this.k = iq2;
        this.Q = n;
        this.H = iq2.B();
        this.C = ssArray;
        this.P = ssArray2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    k7(int var1_1, _4 var2_2, h1 var3_3, l6q var4_4, l6q var5_5, PrintWriter var6_6, lb6 var7_7, Map var8_8, long var9_9, Map var11_10) {
        block35: {
            block36: {
                block34: {
                    block32: {
                        block28: {
                            v0 = var9_9 = k7.a ^ var9_9;
                            var12_11 = v0 ^ 1476266869480L;
                            var14_12 = v0 ^ 55112759494654L;
                            var16_13 = v0 ^ 2088544956473L;
                            var18_14 = v0 ^ 53586562457550L;
                            var20_15 = v0 ^ 82675906022851L;
                            v1 = m44.a("l", (long)-320383532948148374L, (long)var9_9);
                            super(var2_2);
                            var22_16 = v1;
                            this.T = (int)k7.c("p", (int)15924, (long)(4770262204940512250L ^ var9_9));
                            var23_17 = o9.f((long)var12_11);
                            this.Q = var3_3.readUnsignedShort();
                            var24_18 = var3_3.readUnsignedShort();
                            this.P = new ss[var24_18];
                            var25_19 = 0;
                            while (var25_19 < var24_18) {
                                block26: {
                                    block27: {
                                        block29: {
                                            try {
                                                try {
                                                    try {
                                                        v2 = new Object[9];
                                                        v2[8] = var23_17;
                                                        v2[7] = var16_13;
                                                        v2[6] = var11_10;
                                                        v2[5] = var8_8;
                                                        v2[4] = var6_6;
                                                        v2[3] = var5_5;
                                                        v2[2] = var4_4;
                                                        v2[1] = var3_3;
                                                        v2[0] = (k6)var2_2;
                                                        this.P[var25_19] = m44.a("l", (Object)v2, (long)-1614051544949710L, (long)var9_9);
lbl33:
                                                        // 2 sources

                                                        while (true) {
                                                            v3 = var22_16;
                                                            if (var9_9 < 0L) break block26;
                                                            if (v3 != false) break block27;
                                                            v4 /* !! */  = (int)m44.a("s", (Object)this.P[var25_19], (Object)new Object[0], (long)-2207375748022083543L, (long)var9_9);
                                                            if (var22_16 != false) break block28;
                                                            break;
                                                        }
                                                    }
                                                    catch (n9 v5) {
                                                        throw m44.a("l", (Object)v5, (long)-2257754990287359493L, (long)var9_9);
                                                    }
                                                    if (v4 /* !! */  != 0) break block29;
                                                }
                                                catch (n9 v6) {
                                                    throw m44.a("l", (Object)v6, (long)-2257754990287359493L, (long)var9_9);
                                                }
                                                this.M = false;
                                            }
                                            catch (n9 v7) {
                                                throw m44.a("l", (Object)v7, (long)-2257754990287359493L, (long)var9_9);
                                            }
                                        }
                                        ++var25_19;
                                    }
                                    v3 = var22_16;
                                }
                                if (v3 == false) continue;
                            }
                            var25_19 = var3_3.readUnsignedShort();
                            this.C = new ss[var25_19];
                            ** while (var9_9 < 0L)
lbl59:
                            // 1 sources

                            v4 /* !! */  = var26_20 = 0;
                        }
                        while (var26_20 < var25_19) {
                            block30: {
                                block31: {
                                    block33: {
                                        try {
                                            try {
                                                try {
                                                    v8 = new Object[9];
                                                    v8[8] = var23_17;
                                                    v8[7] = var16_13;
                                                    v8[6] = var11_10;
                                                    v8[5] = var8_8;
                                                    v8[4] = var6_6;
                                                    v8[3] = var5_5;
                                                    v8[2] = var4_4;
                                                    v8[1] = var3_3;
                                                    v8[0] = (k6)var2_2;
                                                    this.C[var26_20] = m44.a("l", (Object)v8, (long)-1614051544949710L, (long)var9_9);
                                                    v9 = var22_16;
                                                    while (true) {
                                                        if (var9_9 <= 0L) break block30;
                                                        if (v9 != false) break block31;
                                                        v10 /* !! */  = (int)m44.a("s", (Object)this.C[var26_20], (Object)new Object[0], (long)-2207375748022083543L, (long)var9_9);
                                                        v11 /* !! */  = (int)var22_16;
                                                        if (var9_9 >= 0L) {
                                                            if (v11 /* !! */  != 0) break block32;
                                                        }
                                                        ** GOTO lbl117
                                                        break;
                                                    }
                                                }
                                                catch (n9 v12) {
                                                    throw m44.a("l", (Object)v12, (long)-2257754990287359493L, (long)var9_9);
                                                }
                                                if (v10 /* !! */  != 0) break block33;
                                            }
                                            catch (n9 v13) {
                                                throw m44.a("l", (Object)v13, (long)-2257754990287359493L, (long)var9_9);
                                            }
                                            this.M = false;
                                        }
                                        catch (n9 v14) {
                                            throw m44.a("l", (Object)v14, (long)-2257754990287359493L, (long)var9_9);
                                        }
                                    }
                                    ++var26_20;
                                }
                                v9 = var22_16;
                            }
                            if (v9 == false) continue;
                        }
                        var26_20 = var7_7.U(var18_14);
                        try {
                            v15 = var22_16;
                            if (var9_9 < 0L) ** continue;
                            if (var9_9 >= 0L) {
                                if (v15 != false) break block34;
                                v10 /* !! */  = var26_20;
                            }
                            ** GOTO lbl127
                        }
                        catch (n9 v16) {
                            throw m44.a("l", (Object)v16, (long)-2257754990287359493L, (long)var9_9);
                        }
                    }
                    try {
                        v11 /* !! */  = -1;
lbl117:
                        // 2 sources

                        if (v10 /* !! */  == v11 /* !! */ ) {
                            this.H = (int)m44.a("r", (Object)this, (long)-427914002146412045L, (long)var9_9);
                        }
                        ** GOTO lbl128
                    }
                    catch (n9 v17) {
                        throw m44.a("l", (Object)v17, (long)-2257754990287359493L, (long)var9_9);
                    }
                }
                try {
                    if (var9_9 < 0L) break block35;
                    v18 = var22_16;
lbl127:
                    // 2 sources

                    if (v18 == false) break block36;
lbl128:
                    // 2 sources

                    this.H = var26_20 + 1 + m44.a("r", (Object)this, (long)-427914002146412045L, (long)var9_9);
                }
                catch (n9 v19) {
                    throw m44.a("l", (Object)v19, (long)-2257754990287359493L, (long)var9_9);
                }
            }
            var7_7.P(this.H);
            var4_4.t((Object)var23_17.e(var14_12, this.H), (Object)this, var20_15);
        }
    }

    /*
     * Exception decompiling
     */
    public int y(char var1_1, long var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[DOLOOP]], but top level block is 7[SIMPLE_IF_TAKEN]
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at CfrApi.lambda$main$2(CfrApi.java:31)
         *     at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
         *     at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
         *     at java.base/java.lang.Thread.run(Thread.java:829)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    protected void o(long var1_1, DataOutputStream var3_2, lb6 var4_3, Map var5_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[DOLOOP]], but top level block is 6[SIMPLE_IF_TAKEN]
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at CfrApi.lambda$main$2(CfrApi.java:31)
         *     at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
         *     at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
         *     at java.base/java.lang.Thread.run(Thread.java:829)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public int K(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return (int)k7.c("p", (int)5658, (long)(0x461230DE418743FBL ^ l));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        m = new HashMap(13);
        long l = a ^ 0x382037C3C379L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u0080\u0006\"4\u00a1\u0082\u00d0\u00aa\u00ba\u00e5\u00d3\u00c4\u00a3;\u00de\u00dc";
        int n2 = "\u0080\u0006\"4\u00a1\u0082\u00d0\u00aa\u00ba\u00e5\u00d3\u00c4\u00a3;\u00de\u00dc".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        c = lArray;
        f = new Integer[2];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2504;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])m.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/k7", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            k7.f[n2] = n3;
        }
        return f[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = k7.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/k7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(k7.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
