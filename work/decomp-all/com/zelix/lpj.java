/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l6q;
import com.zelix.l7l;
import com.zelix.lqu;
import com.zelix.lyn;
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

public abstract class lpj
extends lyn {
    protected l6q k;
    private static final long a;
    private static final String[] g;
    private static final String[] n;
    private static final Map o;
    private static final long z;

    boolean v(Object[] objectArray) {
        l7l l7l2 = (l7l)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        return true;
    }

    /*
     * Exception decompiling
     */
    public final void M(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [22[DOLOOP]], but top level block is 25[SIMPLE_IF_TAKEN]
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

    public lpj(int n, short s, int n2, short s2) {
        long l;
        long l2 = l = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s2 << 48 >>> 48) ^ a;
        long l3 = l2 ^ 0x6DCDBB9BACE1L;
        long l4 = l2 ^ 0xE09F1B13335L;
        super(l3, n2);
        m44.a("u", (Object)((Object)this), (l6q)new l6q((int)z, l4, 3), (long)4783009096915913031L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    lpj.a = prr.a((long)6470738174364954199L, (long)-8826548114461662184L, MethodHandles.lookup().lookupClass()).a(138478608576879L);
                    lpj.o = new HashMap<K, V>(13);
                    var5 = lpj.a ^ 100115473771697L;
                    var7_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var5 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var5 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var14_3 = new String[6];
                    var12_4 = 0;
                    var11_5 = "k\n%\u00cd#\u00f3\u0084L\u0019ut\u009d\u000b\u00e5\u0094\u009b\u00f5M\u00de\u0003>e\u00b6\u0092\u00c2\u00d4y.\u00eafBy\u0018t\u00e8\u00b8$R\u0080)Z\u0082\u00d3\u0007\u00f4A\u0088\u00a8\u00ee\u00d5\u00b6\u00d3\u00f7\u00b5h\u00b6\n8\u00e6\u00acZ\u0001\u000f\u00e8\u00d0SC{'\u00eav\u0090\u001f\u00163[{\u000f\u0001Q\f\u0091\u00e2\u0099\u0087\u00ec\u001b\u00eeZ\u00fec\u00a2\u00c5\u0080\u0010\u00f2\u00cfk\u0091\u00c7\u00e0\u00f7\u001c\u0084\u00db#B\u00f4\u007f\r\u009a\u0095S\u0084@;E\u0006\u00f5\u0007\u00ccil\u00e2A\u008d\u00e0\u00c9\u00bf\u0081\u00fa\u00a7O\u00c5N\u00f7\u00cf\u008d\u00bf\u00f8\u00c3?\u00ce\u00c6\u00b7\u00e2t\u00e9ib\u001d\u00fe\u0013\u009e\u00c8\u007f\u00a3\u00df\u00d3\u001c\u00f4\u0093<\u001d\u00c3\u00b3\u00f4\u0090t\u00a7::E\u0001\u0092\u0003\u0086r%";
                    var13_6 = "k\n%\u00cd#\u00f3\u0084L\u0019ut\u009d\u000b\u00e5\u0094\u009b\u00f5M\u00de\u0003>e\u00b6\u0092\u00c2\u00d4y.\u00eafBy\u0018t\u00e8\u00b8$R\u0080)Z\u0082\u00d3\u0007\u00f4A\u0088\u00a8\u00ee\u00d5\u00b6\u00d3\u00f7\u00b5h\u00b6\n8\u00e6\u00acZ\u0001\u000f\u00e8\u00d0SC{'\u00eav\u0090\u001f\u00163[{\u000f\u0001Q\f\u0091\u00e2\u0099\u0087\u00ec\u001b\u00eeZ\u00fec\u00a2\u00c5\u0080\u0010\u00f2\u00cfk\u0091\u00c7\u00e0\u00f7\u001c\u0084\u00db#B\u00f4\u007f\r\u009a\u0095S\u0084@;E\u0006\u00f5\u0007\u00ccil\u00e2A\u008d\u00e0\u00c9\u00bf\u0081\u00fa\u00a7O\u00c5N\u00f7\u00cf\u008d\u00bf\u00f8\u00c3?\u00ce\u00c6\u00b7\u00e2t\u00e9ib\u001d\u00fe\u0013\u009e\u00c8\u007f\u00a3\u00df\u00d3\u001c\u00f4\u0093<\u001d\u00c3\u00b3\u00f4\u0090t\u00a7::E\u0001\u0092\u0003\u0086r%".length();
                    var10_7 = 32;
                    var9_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        v3 = ++var9_8;
                        v4 = var11_5.substring(v3, v3 + var10_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = lpj.c(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "\u0002<$\u00abJ:\u00e1\u00ce\u00a9?\u00d1\u0096\u00b9\u00e5\u00d8\u0015\u00ealN\u00bf\u00bf(`\u00da7\u00c5S\u0096\u00f6\u00c7\u00b6\u00a7\u00c0\u00bc\u00a9\u009f!g\n\u0094\u0010\u009e\u001eAE\u00fb\u00c8\u0007\u00de\u0091\u00cf\u009c\u009d\u008b@\u00aa\u0004";
                        var13_6 = "\u0002<$\u00abJ:\u00e1\u00ce\u00a9?\u00d1\u0096\u00b9\u00e5\u00d8\u0015\u00ealN\u00bf\u00bf(`\u00da7\u00c5S\u0096\u00f6\u00c7\u00b6\u00a7\u00c0\u00bc\u00a9\u009f!g\n\u0094\u0010\u009e\u001eAE\u00fb\u00c8\u0007\u00de\u0091\u00cf\u009c\u009d\u008b@\u00aa\u0004".length();
                        var10_7 = 40;
                        var9_8 = -1;
lbl34:
                        // 2 sources

                        while (true) {
                            v6 = ++var9_8;
                            v4 = var11_5.substring(v6, v6 + var10_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = lpj.c(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var15_9 = var7_1.doFinal(v4.getBytes("ISO-8859-1"));
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
            lpj.g = var14_3;
            lpj.n = new String[6];
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var5 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var5 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl65:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = -2032809352693746781L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        lpj.z = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String c(byte[] byArray) {
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x35D9;
        if (lpj.n[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])o.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lpj", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = g[n2].getBytes("ISO-8859-1");
            lpj.n[n2] = lpj.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return lpj.n[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lpj.b(n, l);
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
            throw new RuntimeException("com/zelix/lpj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lpj.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
