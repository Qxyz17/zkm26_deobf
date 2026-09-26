/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
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

public class tg
extends Enum {
    public static final tg t;
    private static final tg[] b;
    public static final tg K;
    public static final tg Z;
    public static final tg f;
    public static final tg k;
    final int M;
    public static final tg U;
    public static final tg G;
    public static final tg a;
    public static final tg c;
    private static final long d;
    private static final String[] e;
    private static final String[] g;
    private static final Map h;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private tg() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.M = var3_1;
    }

    /*
     * Exception decompiling
     */
    public static tg V(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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

    int q(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = d ^ l;
        return (int)m44.a("p", (Object)((Object)this), (long)2101569985160834164L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        tg.d = prr.a((long)-8504794923439638877L, (long)6353489315562516995L, MethodHandles.lookup().lookupClass()).a(262081181576145L);
                        var20 = tg.d ^ 75584512536879L;
                        tg.h = new HashMap<K, V>(13);
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
                        var18_3 = new String[12];
                        var16_4 = 0;
                        var15_5 = "\u009a\u00f5w\u001c\u000f\u0000f/\u00d9\u001fk\u008dp(\u00bb]\u00d7~j\u0010\u00b2D\u00b4\u0007\u0095\u008e\u00ad\u0081\u00c9\u00ffSk(\u00be\u0082\u00fd\u001b\u00a1\u00cb\u00a0\u00956\u00d3\u00e3\u00e5\u00cc\u00d5e\u00b7u\u00d3\u00c9\u00de\u00a2\u000b7N%b\u00b2\u009cF\u00e8a\u0081\u00b6\u00f9\u00de@\u0017\u00cc\u0018\u0001(\u008f~\u0001\u00b2\bnm\u008f]5\u00e3.\u0080\u0010K\u008f=J\u0005)w@[\u0085H\u00fc$K\u00bf\u00dbh\u0013\u00ed)`|\u00af\u0000r\u0003\u0010\u00a2k\u00ea\u00a1\u0084\u000e\u00afv/\u00eb%#\u0096\u00a2\u0090\u00f6 \u0098\u009c\u00d5\u00d3y\u00ab\u00ed?\u00b8\u00d5J\u0012\u00fc~\u00bcX\u00d6\u0017^6\u0017\u00af6\u00c4\u0013\u00ef\u0082\u00e0\u00d1\u00db]\u00bd\u0010>\u00819\u00c16\nj\u00fa'9\u00b0w\u00ae\u0019\u001d[ (\u00b2N\u00d8\u00b4N)\u00b4o\u008fe\u00a2\u00eb\u00c36o\u00e1\u0014s\u00b0\u0088i\u00a1\u00b5<\tW\u008a\u00edG\u00c9\u00fc\u0018\u00f2&_\u00b7\u00a1\u000b\u0080\u000f\u0099=Y\u00c0\u00e9\u009e;b\u00cc\u0089\u00d6\\\u00e7\u00e9d\u00820I\u0085?\u0098\u00ed\u00b8A\u00c7\u00ac\u007f\u0018\u0084F\u00bfb\u00b5\u00b4\u00c7\u00f7\u00e0\u00d5]\u0017\u0091\u00a6R\u008a\u00ef\u00fa\u009fi\u00a1\u00ea\u009cE&\u00de\u00ffr$7R\u00d8\u00ab0\u0092qy(,\u0086\u00f7\u00f0\u00b9F\u0000\u0006G_-sBE\u00a0\u00cd\u00d1\u00c4?\u0012\u0083\u0011\u009d\u00a5O?\u0090]\u00ea\u00acy\u00fc+c\u000fh\u00c1b\u001c\u009f";
                        var17_6 = "\u009a\u00f5w\u001c\u000f\u0000f/\u00d9\u001fk\u008dp(\u00bb]\u00d7~j\u0010\u00b2D\u00b4\u0007\u0095\u008e\u00ad\u0081\u00c9\u00ffSk(\u00be\u0082\u00fd\u001b\u00a1\u00cb\u00a0\u00956\u00d3\u00e3\u00e5\u00cc\u00d5e\u00b7u\u00d3\u00c9\u00de\u00a2\u000b7N%b\u00b2\u009cF\u00e8a\u0081\u00b6\u00f9\u00de@\u0017\u00cc\u0018\u0001(\u008f~\u0001\u00b2\bnm\u008f]5\u00e3.\u0080\u0010K\u008f=J\u0005)w@[\u0085H\u00fc$K\u00bf\u00dbh\u0013\u00ed)`|\u00af\u0000r\u0003\u0010\u00a2k\u00ea\u00a1\u0084\u000e\u00afv/\u00eb%#\u0096\u00a2\u0090\u00f6 \u0098\u009c\u00d5\u00d3y\u00ab\u00ed?\u00b8\u00d5J\u0012\u00fc~\u00bcX\u00d6\u0017^6\u0017\u00af6\u00c4\u0013\u00ef\u0082\u00e0\u00d1\u00db]\u00bd\u0010>\u00819\u00c16\nj\u00fa'9\u00b0w\u00ae\u0019\u001d[ (\u00b2N\u00d8\u00b4N)\u00b4o\u008fe\u00a2\u00eb\u00c36o\u00e1\u0014s\u00b0\u0088i\u00a1\u00b5<\tW\u008a\u00edG\u00c9\u00fc\u0018\u00f2&_\u00b7\u00a1\u000b\u0080\u000f\u0099=Y\u00c0\u00e9\u009e;b\u00cc\u0089\u00d6\\\u00e7\u00e9d\u00820I\u0085?\u0098\u00ed\u00b8A\u00c7\u00ac\u007f\u0018\u0084F\u00bfb\u00b5\u00b4\u00c7\u00f7\u00e0\u00d5]\u0017\u0091\u00a6R\u008a\u00ef\u00fa\u009fi\u00a1\u00ea\u009cE&\u00de\u00ffr$7R\u00d8\u00ab0\u0092qy(,\u0086\u00f7\u00f0\u00b9F\u0000\u0006G_-sBE\u00a0\u00cd\u00d1\u00c4?\u0012\u0083\u0011\u009d\u00a5O?\u0090]\u00ea\u00acy\u00fc+c\u000fh\u00c1b\u001c\u009f".length();
                        var14_7 = 32;
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
                            var18_3[var16_4++] = tg.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "0\u00d4\u00f7\u00de\u001en3P\u00ce\u00940\u00ca\u00d4\u0090M%\u00da\u0002\u00001\u00b0\u0098\u00ba$\u00d0\u00ab\u00ec\u00e4\u0006\u00a0\u0086p \u0019\u0004\u00d4\u00d71`)\u0018\u0014\u00d03M\u000e\u00c6ah\u00efT\u00ea\u00df?\u00a8\u001f\u00b6m\u00df\u00a6\u00f6\u00f8\u00f5\u0083P";
                            var17_6 = "0\u00d4\u00f7\u00de\u001en3P\u00ce\u00940\u00ca\u00d4\u0090M%\u00da\u0002\u00001\u00b0\u0098\u00ba$\u00d0\u00ab\u00ec\u00e4\u0006\u00a0\u0086p \u0019\u0004\u00d4\u00d71`)\u0018\u0014\u00d03M\u000e\u00c6ah\u00efT\u00ea\u00df?\u00a8\u001f\u00b6m\u00df\u00a6\u00f6\u00f8\u00f5\u0083P".length();
                            var14_7 = 40;
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
                            var18_3[var16_4++] = tg.a(var19_9).intern();
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
                tg.e = var18_3;
                tg.g = new String[12];
                var1_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var2_11 = 1; var2_11 < 8; ++var2_11) {
                    v9 = v9;
                    v9[var2_11] = (byte)(var20 << var2_11 * 8 >>> 56);
                }
                var1_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var0_12 = new long[8];
                var4_13 = 0;
                var5_14 = "}\u008d\u00ff\u0088Z\u00fbL\u00fe\u009aj({\n\u0010=\u0093\u00ec\u0084\u008e\u00a7\u0082k\u00b0\u00fe.|\u00aem-^\u00a7:%\u001cn`\u00f4\u00b4\u0014\u0090Q+\u00c9*z\u00e0\u00f2g";
                var6_15 = "}\u008d\u00ff\u0088Z\u00fbL\u00fe\u009aj({\n\u0010=\u0093\u00ec\u0084\u008e\u00a7\u0082k\u00b0\u00fe.|\u00aem-^\u00a7:%\u001cn`\u00f4\u00b4\u0014\u0090Q+\u00c9*z\u00e0\u00f2g".length();
                var3_16 = 0;
                while (true) {
                    var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
                    v10 = var0_12;
                    v11 = var4_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl77:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_16 < var6_15) ** continue;
                    var5_14 = "\u001e\t\u0097|W\u0097\u00aa\"3\u00fciD\u00acT\u00f3\u0081";
                    var6_15 = "\u001e\t\u0097|W\u0097\u00aa\"3\u00fciD\u00acT\u00f3\u0081".length();
                    var3_16 = 0;
                    while (true) {
                        var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
                        v10 = var0_12;
                        v11 = var4_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_16 < var6_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var1_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl103:
                // 1 sources

                ** continue;
            }
        }
        tg.f = new tg((String)tg.a("p", (int)17275, (long)(1068147221020011369L ^ var20)), 0, 1);
        tg.k = new tg((String)tg.a("p", (int)10574, (long)(1237263896232755543L ^ var20)), 1, 2);
        tg.G = new tg((String)tg.a("p", (int)21465, (long)(1143054576567876556L ^ var20)), 2, 3);
        tg.t = new tg((String)tg.a("p", (int)3555, (long)(9022265162930398711L ^ var20)), 3, 4);
        tg.U = new tg((String)tg.a("p", (int)27478, (long)(7240971316879835974L ^ var20)), 4, 5);
        tg.c = new tg((String)tg.a("p", (int)23548, (long)(3498111996237575140L ^ var20)), 5, (int)var0_12[6]);
        tg.a = new tg((String)tg.a("p", (int)25935, (long)(9222983147304537429L ^ var20)), (int)var0_12[1], (int)var0_12[0]);
        tg.K = new tg((String)tg.a("p", (int)4030, (long)(1559927839416821677L ^ var20)), (int)var0_12[5], (int)var0_12[3]);
        tg.Z = new tg((String)tg.a("p", (int)6061, (long)(6657455105162690486L ^ var20)), (int)var0_12[4], (int)var0_12[7]);
        v15 = new tg[(int)var0_12[2]];
        v15[0] = m44.a("m", (long)-3490798906378255213L, (long)var20);
        v15[1] = m44.a("m", (long)-3263491614351589343L, (long)var20);
        v15[2] = m44.a("m", (long)-3348825745555653289L, (long)var20);
        v15[3] = m44.a("m", (long)-3950419618581950526L, (long)var20);
        v15[4] = m44.a("m", (long)-3154103250451646205L, (long)var20);
        v15[5] = m44.a("m", (long)-3540276787204266913L, (long)var20);
        v15[(int)var0_12[1]] = m44.a("m", (long)-2903272147773373549L, (long)var20);
        v15[(int)var0_12[5]] = m44.a("m", (long)-3542299263321043026L, (long)var20);
        v15[(int)var0_12[4]] = m44.a("m", (long)-3781273645171684795L, (long)var20);
        tg.b = v15;
    }

    public static tg[] u(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = d ^ l;
        return (tg[])((Enum)((Object)m44.a("l", (long)-3486674892956901295L, (long)l))).clone();
    }

    /*
     * Exception decompiling
     */
    static boolean C(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 5[SWITCH]
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

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6CBC;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/tg", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e[n2].getBytes("ISO-8859-1");
            tg.g[n2] = tg.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = tg.a(n, l);
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
            throw new RuntimeException("com/zelix/tg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(tg.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
