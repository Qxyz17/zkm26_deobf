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

public class vw
extends Error {
    int Y;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public vw(boolean bl, int n, int n2, int n3, String string, char c, int n4, char c2, int n5, int n6) {
        long l;
        long l2 = l = ((long)n4 << 32 | (long)c2 << 48 >>> 32 | (long)n6 << 48 >>> 48) ^ a;
        long l3 = l2 ^ 0x2C781AE1B8BL;
        long l4 = l2 ^ 0x6FF080FFA99DL;
        Object[] objectArray = new Object[7];
        objectArray[6] = (int)c;
        objectArray[5] = string;
        objectArray[4] = n3;
        objectArray[3] = l4;
        objectArray[2] = n2;
        objectArray[1] = n;
        objectArray[0] = bl;
        this(vw.l(objectArray), l3, n5);
    }

    /*
     * Exception decompiling
     */
    protected static final String w(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[TRYBLOCK]], but top level block is 15[SWITCH]
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected static String l(Object[] objectArray) {
        Object object;
        StringBuilder stringBuilder;
        long l;
        String string;
        long l2;
        block4: {
            char c;
            block5: {
                boolean bl = (Boolean)objectArray[0];
                int n = (Integer)objectArray[1];
                int n2 = (Integer)objectArray[2];
                l2 = (Long)objectArray[3];
                int n3 = (Integer)objectArray[4];
                string = (String)objectArray[5];
                c = ((Integer)objectArray[6]).intValue();
                l = (l2 = a ^ l2) ^ 0x32F13D321A61L;
                CallSite callSite = m44.a("k", (long)-997296769872781205L, (long)l2);
                try {
                    try {
                        stringBuilder = new StringBuilder().append((String)((Object)vw.a("m", (int)23096, (long)(0x3286F50752E25E74L ^ l2)))).append(n2).append((String)((Object)vw.a("m", (int)494, (long)(0x5481529C34EF05A4L ^ l2)))).append(n3);
                        object = vw.a("m", (int)17608, (long)(0x23D6DFE48864087L ^ l2));
                        if (callSite == false) break block4;
                        stringBuilder = stringBuilder.append((String)object);
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)((Object)n92), (long)-1525123025672273483L, (long)l2);
                    }
                    object = vw.a("m", (int)8309, (long)(0x48DB0780D180243BL ^ l2));
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)((Object)n93), (long)-1525123025672273483L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = String.valueOf(c);
            objectArray2[0] = l;
            object = "\"" + (String)((Object)m44.a("k", (Object)objectArray2, (long)-983616931302705094L, (long)l2)) + "\"" + (String)((Object)vw.a("m", (int)21481, (long)(0x5DEA0EBFBE3DD7AAL ^ l2))) + c + (String)((Object)vw.a("m", (int)19347, (long)(0x26F92F58B0DCCFDAL ^ l2)));
        }
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = string;
        objectArray3[0] = l;
        return stringBuilder.append((String)object).append((String)((Object)vw.a("m", (int)28486, (long)(0x6CD5C90310E3EB0BL ^ l2)))).append((String)((Object)m44.a("k", (Object)objectArray3, (long)-983616931302705094L, (long)l2))).append("\"").toString();
    }

    public vw(String string, long l, int n) {
        l = a ^ l;
        super(string);
        m44.a("q", (Object)this, (int)n, (long)4632267233788934975L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        vw.a = prr.a((long)-9036425339077095460L, (long)-8212042528103529403L, MethodHandles.lookup().lookupClass()).a(70910557808138L);
                        vw.d = new HashMap<K, V>(13);
                        var11 = vw.a ^ 30017978286671L;
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
                        var20_3 = new String[17];
                        var18_4 = 0;
                        var17_5 = "O\u00df\u0080\u00ccij\u00df\u0015\u00f9g\u00e2\u008aFYg \u0010\u00a3\u0094:^[\u00f3\n\u0091\u0011\u00c5v\u00b2w\u00da\u001c`\u0018\u00869LP\u0093\u00bc$g\u00b1J\u0000)\u0015/\u0085o\u0088\u00e0\u00e2\u000eGp\u00ad\u00a7\u0010\u00b1\u001b\u00d1\u00ff\u00ef\t\u00d3\u00d6f\u00cb\u00c7\n\bl.\u00e1(Y\u00b5\u0094e1x\u00d8D\u00e7\u00ba\u00e2\u00a7M\u00a7\u00d2\u00a1\u000f(\u00c6\u00ad\u00d9\u00aa\u00ce\u00e6f\u00b0\u009d\u00d65\u00ec\u00d2\u00eb\u00ee\u00e1$\u0092\u00cf\u009f?] \u00a8f\u00b1\u0015\u00acje$\u0003\u00b4\u00e6\u00a9\u00a7\u00dbi\u00f1\u0019\u001b\u00fdR\u00b02\u00f0\u00c6p\u0088Q\u00d1\u0011 v8\u0010 \u0014<\u0088x\u00da\u0092Q\u00b5\f\u00b4\u00f4\u00d9oux(i\u00f4\u0019\u00eb+\u0084\u0096B\u00cc\u001a\u00f6\u00ab\u00eb\u00de\u00be\u00f02\u00e7\u001f\u00f2\u00e66n\u00fb\u00ff\u00c4\u00bdg\u00ac\u00f7Zt\u0004\u008c\u0017\u009b\u00bd\u00bb\u00e0\u00b7\u0010\u0096\u0090\u00c4M\u00eb\u00ed\u00f2\r\u00aez/\u00e3\u00af\u007f\u00d0\u00eb\u0010\u00e6\u001a\\i)f\u00a9\u000e\u0007\u009cE\u00c6:\u001d\u0086\u009b\u0010\u0003\u001c>\u00bb\u00f7\u00b3)\u00ca\u0093\u00ce\u00bf\u0013+\u00dd(\u00eb\u0010??\u00e3Ro\u0000\u00d0\u008b\u0081\u0095\u001a(\u0011n\u00c7\u00e3\u0010+\u0095_\u00cc[\u0085\u00ef\u0081\u00aeLG9v^\f\u00bd\u0010\u00b2\u00b4\u00bdU\u00b1\u008f\u00ff\u00a7\u00f1o\u00ab\u0018\u00a0\u00ae\u00e62\u0010\u00f8X\u0080\u0090A\u00d5l\u00a54`\u001cc\u00f6\u00e4\u00bfx";
                        var19_6 = "O\u00df\u0080\u00ccij\u00df\u0015\u00f9g\u00e2\u008aFYg \u0010\u00a3\u0094:^[\u00f3\n\u0091\u0011\u00c5v\u00b2w\u00da\u001c`\u0018\u00869LP\u0093\u00bc$g\u00b1J\u0000)\u0015/\u0085o\u0088\u00e0\u00e2\u000eGp\u00ad\u00a7\u0010\u00b1\u001b\u00d1\u00ff\u00ef\t\u00d3\u00d6f\u00cb\u00c7\n\bl.\u00e1(Y\u00b5\u0094e1x\u00d8D\u00e7\u00ba\u00e2\u00a7M\u00a7\u00d2\u00a1\u000f(\u00c6\u00ad\u00d9\u00aa\u00ce\u00e6f\u00b0\u009d\u00d65\u00ec\u00d2\u00eb\u00ee\u00e1$\u0092\u00cf\u009f?] \u00a8f\u00b1\u0015\u00acje$\u0003\u00b4\u00e6\u00a9\u00a7\u00dbi\u00f1\u0019\u001b\u00fdR\u00b02\u00f0\u00c6p\u0088Q\u00d1\u0011 v8\u0010 \u0014<\u0088x\u00da\u0092Q\u00b5\f\u00b4\u00f4\u00d9oux(i\u00f4\u0019\u00eb+\u0084\u0096B\u00cc\u001a\u00f6\u00ab\u00eb\u00de\u00be\u00f02\u00e7\u001f\u00f2\u00e66n\u00fb\u00ff\u00c4\u00bdg\u00ac\u00f7Zt\u0004\u008c\u0017\u009b\u00bd\u00bb\u00e0\u00b7\u0010\u0096\u0090\u00c4M\u00eb\u00ed\u00f2\r\u00aez/\u00e3\u00af\u007f\u00d0\u00eb\u0010\u00e6\u001a\\i)f\u00a9\u000e\u0007\u009cE\u00c6:\u001d\u0086\u009b\u0010\u0003\u001c>\u00bb\u00f7\u00b3)\u00ca\u0093\u00ce\u00bf\u0013+\u00dd(\u00eb\u0010??\u00e3Ro\u0000\u00d0\u008b\u0081\u0095\u001a(\u0011n\u00c7\u00e3\u0010+\u0095_\u00cc[\u0085\u00ef\u0081\u00aeLG9v^\f\u00bd\u0010\u00b2\u00b4\u00bdU\u00b1\u008f\u00ff\u00a7\u00f1o\u00ab\u0018\u00a0\u00ae\u00e62\u0010\u00f8X\u0080\u0090A\u00d5l\u00a54`\u001cc\u00f6\u00e4\u00bfx".length();
                        var16_7 = 16;
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
                            var20_3[var18_4++] = vw.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\\\u00a3a\u00c3\u00cd\u00a3X'G\u00dbl\u00b8\u00d5\u0010\u00c8\u00fa\u0010U'}\u00fa\u00be\u008b\u0093\u00b9*\u0001\u00b4\u0094\u0019\u00baY\u0085";
                            var19_6 = "\\\u00a3a\u00c3\u00cd\u00a3X'G\u00dbl\u00b8\u00d5\u0010\u00c8\u00fa\u0010U'}\u00fa\u00be\u008b\u0093\u00b9*\u0001\u00b4\u0094\u0019\u00baY\u0085".length();
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
                            var20_3[var18_4++] = vw.a(var21_9).intern();
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
                vw.b = var20_3;
                vw.c = new String[17];
                vw.g = new HashMap<K, V>(13);
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
                var6_12 = new long[3];
                var3_13 = 0;
                var4_14 = "-5\u0082)\u00ac\u00b7\u0011TJ\u0083\\\u008b\u0007,\u00feb\u00b5\u0081!\u00d1\u00db\u0002\u0087\u00ef";
                var5_15 = "-5\u0082)\u00ac\u00b7\u0011TJ\u0083\\\u008b\u0007,\u00feb\u00b5\u0081!\u00d1\u00db\u0002\u0087\u00ef".length();
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
        vw.e = var6_12;
        vw.f = new Integer[3];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x673C;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/vw", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            vw.c[n2] = vw.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = vw.a(n, l);
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
            throw new RuntimeException("com/zelix/vw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x279A;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/vw", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            vw.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = vw.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/vw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(vw.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(vw.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
