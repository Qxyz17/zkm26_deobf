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

public class nk
extends Error {
    int a;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public nk(String string, long l, int n) {
        l = b ^ l;
        super(string);
        m44.a("u", (Object)this, (int)n, (long)-3197739082197682285L, (long)l);
    }

    /*
     * Exception decompiling
     */
    protected static final String d(Object[] var0) {
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

    public nk(int n, boolean bl, int n2, int n3, long l, int n4, String string, char c, int n5) {
        long l2;
        long l3 = l2 = ((long)n << 32 | l << 32 >>> 32) ^ b;
        long l4 = l3 ^ 0x693B4ACB25C5L;
        long l5 = l3 ^ 0x642957552E49L;
        Object[] objectArray = new Object[7];
        objectArray[6] = (int)c;
        objectArray[5] = string;
        objectArray[4] = n4;
        objectArray[3] = n3;
        objectArray[2] = n2;
        objectArray[1] = bl;
        objectArray[0] = l5;
        this(nk.n(objectArray), l4, n5);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected static String n(Object[] objectArray) {
        Object object;
        StringBuilder stringBuilder;
        long l;
        String string;
        long l2;
        block4: {
            char c;
            block5: {
                l2 = (Long)objectArray[0];
                boolean bl = (Boolean)objectArray[1];
                int n = (Integer)objectArray[2];
                int n2 = (Integer)objectArray[3];
                int n3 = (Integer)objectArray[4];
                string = (String)objectArray[5];
                c = ((Integer)objectArray[6]).intValue();
                l = (l2 = b ^ l2) ^ 0x78C7B8AAA45FL;
                CallSite callSite = m44.a("m", (long)-2761189444937054292L, (long)l2);
                try {
                    try {
                        stringBuilder = new StringBuilder().append((String)((Object)nk.a("h", (int)15709, (long)(0x2BFEAEA6B8B9D0E0L ^ l2)))).append(n2).append((String)((Object)nk.a("h", (int)8926, (long)(0x6E39EE9C63364F6DL ^ l2)))).append(n3);
                        object = nk.a("h", (int)19632, (long)(0x23F141E017D2210FL ^ l2));
                        if (callSite != null) break block4;
                        stringBuilder = stringBuilder.append((String)object);
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)((Object)n92), (long)-2570271498686416393L, (long)l2);
                    }
                    object = nk.a("h", (int)12327, (long)(0x12C135BF9281DD9DL ^ l2));
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)((Object)n93), (long)-2570271498686416393L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = String.valueOf(c);
            objectArray2[0] = l;
            object = "\"" + (String)((Object)m44.a("m", (Object)objectArray2, (long)-2384829713474359254L, (long)l2)) + "\"" + (String)((Object)nk.a("h", (int)16113, (long)(0x2F32D9D87D4FD34FL ^ l2))) + c + (String)((Object)nk.a("h", (int)20937, (long)(0x75CE371208A53C7CL ^ l2)));
        }
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = string;
        objectArray3[0] = l;
        return stringBuilder.append((String)object).append((String)((Object)nk.a("h", (int)18985, (long)(0x5A9005CDE41AA780L ^ l2)))).append((String)((Object)m44.a("m", (Object)objectArray3, (long)-2384829713474359254L, (long)l2))).append("\"").toString();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        nk.b = prr.a((long)-6103001150371981315L, (long)3085099050512633027L, MethodHandles.lookup().lookupClass()).a(64539221039540L);
                        nk.e = new HashMap<K, V>(13);
                        var11 = nk.b ^ 36954827731417L;
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
                        var17_5 = "\u00a8'\ne\u00c2k*+\u00cd\u00c4\u0091\u0002H\u00e05\u007f\u0010\u00eeT\u00a2e9\u0013\u0097&$\b\u009c\u00db#M\u00bb\u0000\u0010\u00cb\u00de\u00d6\u00bb\u0083\u00a6}\u00f6\u00ff\u00c2\u0093\u0089\u00ce\u00d9\u00afg\u0010\u00f1I\u00a82\u00999];\u008c\u0099\u00f7\u00cf\u0090d\u0097\u008a(.==\u00f2\u0080\u00f5\nj\u009f\u0080\u009b \u008e\u00d2\u00e5\u008c\u00e9\u00a9\u0002\u00c32t\u00106\u00f9\u00a7\u0097.\u009dz\u00d7\u00ee\u00d1_:\u00d2\u001b\u00e8.(\u0010\u00b8<\u001bu\u001e\u00da\u0083L\u008c\u00d3\u00d4,\u0099\u00c2\u00fcE(]\u0007\u0082B'bT\u0011 \u00ef\u009b,\u00fe\u00d1\r\u00bc\u00e5S\u00f0\u00c1-\u00ef\u00d3d\u00e2l\u0098\u009e\u00fe\u001e\u00f5n\u00bbDt\u008b\u00d1\u00ea\u00dd8\u0010\u00d3\u00e5\u0005\u00f2\u0099\u00fa0\u0000\u00bd\u009e$\u00a0\u00b9\u007f\u009a]\u0010\u001f\n\u0012\u0011\u00d8$\u008d\u00e6\u0014\u00c4BJ?O\u00efv\u0010\u001a\u000b\u00fe\u009c\u00c9\u001a\u00bd\u00cacs}\u009b~\u0080\u0096Z \u008b\u000fL1\u00ed\u00e2\u00a9\u00f7\u0002\u00f5\u0005\u0093\u00e7\u009f\u0019\u00b4\u00fb\u00ae\u0080\u001f\u00cc\u0082\u00a11D\u00d7E\u00e2H\u0012S\u00ee\u0010\u00d8\u007fo\u00a0\u00eb\u0011vb^NH\u00ac\u00c6\u00ec\u009c\u00f6\u0010\u00f7 #\u0094\u00c6~*\f\u0013f_YP5dQ\u0010<d\u0089\u00bf}\r\u00c7\u00bc\u00edc\u00c5\u00eb\u00e7\u00a8\u00b2d\u0010\u009b\u00c9x\u00b8\u0084\u00b2R\u008e\u00cc\u00ef\u0097\u0088\u00fc\u0018\u009d\u00e6";
                        var19_6 = "\u00a8'\ne\u00c2k*+\u00cd\u00c4\u0091\u0002H\u00e05\u007f\u0010\u00eeT\u00a2e9\u0013\u0097&$\b\u009c\u00db#M\u00bb\u0000\u0010\u00cb\u00de\u00d6\u00bb\u0083\u00a6}\u00f6\u00ff\u00c2\u0093\u0089\u00ce\u00d9\u00afg\u0010\u00f1I\u00a82\u00999];\u008c\u0099\u00f7\u00cf\u0090d\u0097\u008a(.==\u00f2\u0080\u00f5\nj\u009f\u0080\u009b \u008e\u00d2\u00e5\u008c\u00e9\u00a9\u0002\u00c32t\u00106\u00f9\u00a7\u0097.\u009dz\u00d7\u00ee\u00d1_:\u00d2\u001b\u00e8.(\u0010\u00b8<\u001bu\u001e\u00da\u0083L\u008c\u00d3\u00d4,\u0099\u00c2\u00fcE(]\u0007\u0082B'bT\u0011 \u00ef\u009b,\u00fe\u00d1\r\u00bc\u00e5S\u00f0\u00c1-\u00ef\u00d3d\u00e2l\u0098\u009e\u00fe\u001e\u00f5n\u00bbDt\u008b\u00d1\u00ea\u00dd8\u0010\u00d3\u00e5\u0005\u00f2\u0099\u00fa0\u0000\u00bd\u009e$\u00a0\u00b9\u007f\u009a]\u0010\u001f\n\u0012\u0011\u00d8$\u008d\u00e6\u0014\u00c4BJ?O\u00efv\u0010\u001a\u000b\u00fe\u009c\u00c9\u001a\u00bd\u00cacs}\u009b~\u0080\u0096Z \u008b\u000fL1\u00ed\u00e2\u00a9\u00f7\u0002\u00f5\u0005\u0093\u00e7\u009f\u0019\u00b4\u00fb\u00ae\u0080\u001f\u00cc\u0082\u00a11D\u00d7E\u00e2H\u0012S\u00ee\u0010\u00d8\u007fo\u00a0\u00eb\u0011vb^NH\u00ac\u00c6\u00ec\u009c\u00f6\u0010\u00f7 #\u0094\u00c6~*\f\u0013f_YP5dQ\u0010<d\u0089\u00bf}\r\u00c7\u00bc\u00edc\u00c5\u00eb\u00e7\u00a8\u00b2d\u0010\u009b\u00c9x\u00b8\u0084\u00b2R\u008e\u00cc\u00ef\u0097\u0088\u00fc\u0018\u009d\u00e6".length();
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
                            var20_3[var18_4++] = nk.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u0088'\u00c2+\u00a5\u00e1v\u00a3#\u00b0\u0002\u001c\u00cd\u00ea\u00a0\u00e9\u0018\u00a8\u00d9Fe$\u008c+6\u00e8:U`\u00b92\u0084\u00a6u\u0080\u00c0\u00b1\u0084uc\u00ad";
                            var19_6 = "\u0088'\u00c2+\u00a5\u00e1v\u00a3#\u00b0\u0002\u001c\u00cd\u00ea\u00a0\u00e9\u0018\u00a8\u00d9Fe$\u008c+6\u00e8:U`\u00b92\u0084\u00a6u\u0080\u00c0\u00b1\u0084uc\u00ad".length();
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
                            var20_3[var18_4++] = nk.a(var21_9).intern();
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
                nk.c = var20_3;
                nk.d = new String[17];
                nk.h = new HashMap<K, V>(13);
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
                var4_14 = "\u00d4\u0016\u0001\u00ef\u009aI\u0000\u001aUxW\u00ee\u0080\u0082\u00b8&[zm\u00fc\u0089\u00e8m\u00b8";
                var5_15 = "\u00d4\u0016\u0001\u00ef\u009aI\u0000\u001aUxW\u00ee\u0080\u0082\u00b8&[zm\u00fc\u0089\u00e8m\u00b8".length();
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
        nk.f = var6_12;
        nk.g = new Integer[3];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2553;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/nk", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            nk.d[n2] = nk.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = nk.a(n, l);
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
            throw new RuntimeException("com/zelix/nk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7F22;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/nk", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            nk.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = nk.b(n, l);
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
            throw new RuntimeException("com/zelix/nk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(nk.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(nk.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
