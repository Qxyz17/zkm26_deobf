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

public class go
extends Error {
    int r;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    public go(String string, int n, long l) {
        l = a ^ l;
        super(string);
        m44.a("t", (Object)this, (int)n, (long)-4133243824916779898L, (long)l);
    }

    public go(boolean bl, int n, int n2, int n3, String string, int n4, char c, int n5, char c2, int n6) {
        long l;
        long l2 = l = ((long)n4 << 32 | (long)c2 << 48 >>> 32 | (long)n6 << 48 >>> 48) ^ a;
        long l3 = l2 ^ 0x2940425C72EAL;
        long l4 = l2 ^ 0x27D42652177FL;
        Object[] objectArray = new Object[7];
        objectArray[6] = (int)c;
        objectArray[5] = string;
        objectArray[4] = n3;
        objectArray[3] = n2;
        objectArray[2] = n;
        objectArray[1] = bl;
        objectArray[0] = l3;
        this(go.E(objectArray), n5, l4);
    }

    protected static String E(Object[] objectArray) {
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
                l = (l2 = a ^ l2) ^ 0x6E37F8E4E674L;
                CallSite callSite = m44.a("m", (long)-4897260311556643769L, (long)l2);
                try {
                    try {
                        stringBuilder = new StringBuilder().append((String)((Object)go.a("v", (int)3778, (long)(0x36F0EDA1EFBB7F32L ^ l2)))).append(n2).append((String)((Object)go.a("v", (int)22325, (long)(0x41D35B84DBF2A6C7L ^ l2)))).append(n3);
                        object = go.a("v", (int)6308, (long)(0x1B468340421B695DL ^ l2));
                        if (callSite != null) break block4;
                        stringBuilder = stringBuilder.append((String)object);
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)((Object)n92), (long)-6900253130840085642L, (long)l2);
                    }
                    object = go.a("v", (int)18173, (long)(0x39951E09F5F6370BL ^ l2));
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)((Object)n93), (long)-6900253130840085642L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l;
            objectArray2[0] = String.valueOf(c);
            object = "\"" + (String)((Object)m44.a("m", (Object)objectArray2, (long)-4626713683465746844L, (long)l2)) + "\"" + (String)((Object)go.a("v", (int)6726, (long)(0x4C1F074E751B6BBAL ^ l2))) + c + (String)((Object)go.a("v", (int)23502, (long)(0x6652A15C552A34L ^ l2)));
        }
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l;
        objectArray3[0] = string;
        return stringBuilder.append((String)object).append((String)((Object)go.a("v", (int)4221, (long)(0x4667FC5339BC6186L ^ l2)))).append((String)((Object)m44.a("m", (Object)objectArray3, (long)-4626713683465746844L, (long)l2))).append("\"").toString();
    }

    /*
     * Exception decompiling
     */
    protected static final String K(Object[] var0) {
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

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        go.a = prr.a((long)-5600191859516962468L, (long)-45684607659954540L, MethodHandles.lookup().lookupClass()).a(54705882335344L);
                        go.d = new HashMap<K, V>(13);
                        var11 = go.a ^ 58067602596829L;
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
                        var17_5 = "\u0097\u00b5(J\u0019\u0089A9\u00ca\u00ce\u00a3p\u00cd\u00010\u00cd\u0018>\u008aR\u0087\u00b4\u0093\u0096\u00b4`\u008aF2\u00e9\u00dd\u0086\u00f06p\f\u00c7\u0084\u0085\u00d1N\u0010q\u00e8\u0083\u00b7\u00ba\u00c7\u009c\u00fa\u00d3\u00ac\u00b8W\u00e6\u00fb\u00b6Y(f\u00e0\u00de\u00fe\u00f5\u00f6U'yJe\u0005\u00e7\u00d2\u00f7\u0081\u00a7\u00c4A\u00d7\u00e5\u00c2B\u00ba#\u00e8\u00ac\u0096I\u0096\u0019\u00e9M'\u00b1\u00c6\u00ff\u00ffj\u00ac\u0010\u00e0\u00e56\u000e\u0002l\u00b2_\u00c5\u0005&\u00fcz\u00d6Z\u00d7\u0010\u0084d~\u008c\u00ba\u0098\u00fcn\u008b\u00b3k\u0097V\u00df\u00e7\u00b3\u0010\u0094\u0097>\u00ab\u0099\u00cd\u0098|\u001b\u00e5\u00a7\u00df\u00f9\u0082\u0096\u0089\u0010\u0001\u00f9:\u00fb\u00a7\b\u00a8>\u0092|Bg\u00f0y\u00e8f \u00c3\u00fc\u0007@2\u00b1\u0006\u00f3\u001f\u00194\u00e0\u00c6!\u00aa%\u0090\u0000~\u008d\u00aa\u00d7C\u00d4y\u00e0\u0096\u00c6\u0019thb\u0010\u00d3\u00a4\u00bdz\u00e6\u00d5\u00e9\u009a\u00c5\u00dc(\u00b7N0)\u00d9(\u00f1\u0086L\u00a2_\u0019V\u00d1\u008bP7F\u00f6\u0081\u00ed\u00a8\u00aa\u00b9\u0098lNW;\u008c\u00fc\u0090Z\u0088\u00ccuxQ\u00ebf\u001d\u00c4(CO\u00e8\u0010\u00dc\u00ec\u00b0e\u00d1}\u00f6\u00a5\u00bf\u00e3\u00fa{\u00d9\u00ff:\u00ee\u0010\u001f\u00e4F\u00ef\u00c2\u00d7I\u00caH\u00c6&<\u009ae\u00e5i\u0010NX\u009b\u00a9\u0091\u00e9B}\u00ba\u000b\u00e8(\u00ea\u0087b6\u0010}\u009f\u008d\u00d3\n\u0003\u00d0\u00a7;\u001c\u00a2V\u0097\u0091.\u0012";
                        var19_6 = "\u0097\u00b5(J\u0019\u0089A9\u00ca\u00ce\u00a3p\u00cd\u00010\u00cd\u0018>\u008aR\u0087\u00b4\u0093\u0096\u00b4`\u008aF2\u00e9\u00dd\u0086\u00f06p\f\u00c7\u0084\u0085\u00d1N\u0010q\u00e8\u0083\u00b7\u00ba\u00c7\u009c\u00fa\u00d3\u00ac\u00b8W\u00e6\u00fb\u00b6Y(f\u00e0\u00de\u00fe\u00f5\u00f6U'yJe\u0005\u00e7\u00d2\u00f7\u0081\u00a7\u00c4A\u00d7\u00e5\u00c2B\u00ba#\u00e8\u00ac\u0096I\u0096\u0019\u00e9M'\u00b1\u00c6\u00ff\u00ffj\u00ac\u0010\u00e0\u00e56\u000e\u0002l\u00b2_\u00c5\u0005&\u00fcz\u00d6Z\u00d7\u0010\u0084d~\u008c\u00ba\u0098\u00fcn\u008b\u00b3k\u0097V\u00df\u00e7\u00b3\u0010\u0094\u0097>\u00ab\u0099\u00cd\u0098|\u001b\u00e5\u00a7\u00df\u00f9\u0082\u0096\u0089\u0010\u0001\u00f9:\u00fb\u00a7\b\u00a8>\u0092|Bg\u00f0y\u00e8f \u00c3\u00fc\u0007@2\u00b1\u0006\u00f3\u001f\u00194\u00e0\u00c6!\u00aa%\u0090\u0000~\u008d\u00aa\u00d7C\u00d4y\u00e0\u0096\u00c6\u0019thb\u0010\u00d3\u00a4\u00bdz\u00e6\u00d5\u00e9\u009a\u00c5\u00dc(\u00b7N0)\u00d9(\u00f1\u0086L\u00a2_\u0019V\u00d1\u008bP7F\u00f6\u0081\u00ed\u00a8\u00aa\u00b9\u0098lNW;\u008c\u00fc\u0090Z\u0088\u00ccuxQ\u00ebf\u001d\u00c4(CO\u00e8\u0010\u00dc\u00ec\u00b0e\u00d1}\u00f6\u00a5\u00bf\u00e3\u00fa{\u00d9\u00ff:\u00ee\u0010\u001f\u00e4F\u00ef\u00c2\u00d7I\u00caH\u00c6&<\u009ae\u00e5i\u0010NX\u009b\u00a9\u0091\u00e9B}\u00ba\u000b\u00e8(\u00ea\u0087b6\u0010}\u009f\u008d\u00d3\n\u0003\u00d0\u00a7;\u001c\u00a2V\u0097\u0091.\u0012".length();
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
                            var20_3[var18_4++] = go.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "V\u00c5#s\u0091\u0003\u0013\u0098\u00b0\u00bf\u00ad k\u0012\u00c7\u00b9\u0010\u00ecF=*\u008f\u00bf:\u00b7\u00a6(\u00b9\u00a3o\u00bbF\u00dc";
                            var19_6 = "V\u00c5#s\u0091\u0003\u0013\u0098\u00b0\u00bf\u00ad k\u0012\u00c7\u00b9\u0010\u00ecF=*\u008f\u00bf:\u00b7\u00a6(\u00b9\u00a3o\u00bbF\u00dc".length();
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
                            var20_3[var18_4++] = go.a(var21_9).intern();
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
                go.b = var20_3;
                go.c = new String[17];
                go.g = new HashMap<K, V>(13);
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
                var4_14 = "\u008f%\u0016\u0081cl59f\u00b8'\u00c4\r\u0089\u0007\u00a7\u00f7\u0003\u00e9I\u00b7-S\u00fb";
                var5_15 = "\u008f%\u0016\u0081cl59f\u00b8'\u00c4\r\u0089\u0007\u00a7\u00f7\u0003\u00e9I\u00b7-S\u00fb".length();
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
        go.e = var6_12;
        go.f = new Integer[3];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4261;
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
                throw new RuntimeException("com/zelix/go", exception);
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
            go.c[n2] = go.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = go.a(n, l);
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
            throw new RuntimeException("com/zelix/go" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xF36;
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
                throw new RuntimeException("com/zelix/go", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            go.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = go.b(n, l);
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
            throw new RuntimeException("com/zelix/go" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(go.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(go.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
