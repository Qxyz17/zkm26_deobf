/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ch;
import com.zelix.m44;
import com.zelix.mf;
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
import javax.swing.JList;
import javax.swing.ListModel;

public class o4
extends JList {
    private static final String J;
    private static final String I;
    private int w;
    private boolean Q;
    private static final String P;
    private static final long b;
    private static final String[] d;
    private static final String[] f;
    private static final Map g;
    private static final long p;

    private void i(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = b ^ l) ^ 0x7D92ABBD6893L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("v", (Object)this, (boolean)m44.a("j", (Object)objectArray2, (long)892414644522034624L, (long)l), (long)801032007694566089L, (long)l);
        m44.a("u", (Object)this, (Object)new ch(this), (long)1216061786788796830L, (long)l);
        m44.a("u", (Object)this, (Object)new mf(this), (long)1639177572872285964L, (long)l);
    }

    public o4(ListModel listModel, long l) {
        long l2 = (l = b ^ l) ^ 0x1C3144D022D6L;
        super(listModel);
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        m44.a("k", (Object)this, (Object)objectArray, (long)1021552508138911937L, (long)l);
    }

    /*
     * Exception decompiling
     */
    private static boolean o(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[TRYBLOCK]], but top level block is 17[SWITCH]
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
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    o4.b = prr.a((long)-7605186687766035184L, (long)-6097408601111167170L, MethodHandles.lookup().lookupClass()).a(105247076104847L);
                    var14 = o4.b ^ 50521052990904L;
                    o4.g = new HashMap<K, V>(13);
                    var5_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var14 >>> 56);
                    for (var6_2 = 1; var6_2 < 8; ++var6_2) {
                        v2 = v2;
                        v2[var6_2] = (byte)(var14 << var6_2 * 8 >>> 56);
                    }
                    var5_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var12_3 = new String[7];
                    var10_4 = 0;
                    var9_5 = "n\u00f8\u00df\u00e7\u00f9\u00a6\u00f4\u00cd\u0018;\u00fd\u00fc\u009f\u00b0\u0013\u00de \u00b7\u00d1\u008d\u00ad\u0083\u0087\u00ee\u0093\u00a3\u00f9\u001ayrk\u00f8\u00d2\u0098\u0096\u0002:\u00d7\u001de\u00b5#\u0094'\u001d;\u00b0\u00f5\u0004\u00107I\u00e79\u00cc\u00f4)l+%\u0096\u00ff}8\u0005\u00b3\u0010\u00d4\u00af\u0005\u00db\u00c6\u00f8\u00e9\u0082\u00a17\u00d8a\u00baa\u009f\u0017\u0010>\u009b\n\u00a5\u008a\u00cee]\u0085\u0002\b\u00f8\t=\u00e4\u00b6";
                    var11_6 = "n\u00f8\u00df\u00e7\u00f9\u00a6\u00f4\u00cd\u0018;\u00fd\u00fc\u009f\u00b0\u0013\u00de \u00b7\u00d1\u008d\u00ad\u0083\u0087\u00ee\u0093\u00a3\u00f9\u001ayrk\u00f8\u00d2\u0098\u0096\u0002:\u00d7\u001de\u00b5#\u0094'\u001d;\u00b0\u00f5\u0004\u00107I\u00e79\u00cc\u00f4)l+%\u0096\u00ff}8\u0005\u00b3\u0010\u00d4\u00af\u0005\u00db\u00c6\u00f8\u00e9\u0082\u00a17\u00d8a\u00baa\u009f\u0017\u0010>\u009b\n\u00a5\u008a\u00cee]\u0085\u0002\b\u00f8\t=\u00e4\u00b6".length();
                    var8_7 = 16;
                    var7_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        v3 = ++var7_8;
                        v4 = var9_5.substring(v3, v3 + var8_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var12_3[var10_4++] = o4.a(var13_9).intern();
                        if ((var7_8 += var8_7) < var11_6) {
                            var8_7 = var9_5.charAt(var7_8);
                            ** continue;
                        }
                        var9_5 = "r\u00a5\u00b4tx\u00d5\u00ce\u00b7dq*\u0086r\u00de\u00fe\u00e6\u0018\u00b5\u00a3\u0081\u00f1[3\u00de[\u00f8\u000e\u008c\u00d32T4WeB9_\u00cd\u00be\u008dR";
                        var11_6 = "r\u00a5\u00b4tx\u00d5\u00ce\u00b7dq*\u0086r\u00de\u00fe\u00e6\u0018\u00b5\u00a3\u0081\u00f1[3\u00de[\u00f8\u000e\u008c\u00d32T4WeB9_\u00cd\u00be\u008dR".length();
                        var8_7 = 16;
                        var7_8 = -1;
lbl34:
                        // 2 sources

                        while (true) {
                            v6 = ++var7_8;
                            v4 = var9_5.substring(v6, v6 + var8_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        var12_3[var10_4++] = o4.a(var13_9).intern();
                        if ((var7_8 += var8_7) < var11_6) {
                            var8_7 = var9_5.charAt(var7_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var13_9 = var5_1.doFinal(v4.getBytes("ISO-8859-1"));
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
            o4.d = var12_3;
            o4.f = new String[7];
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var14 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var14 << var1_11 * 8 >>> 56);
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
        var2_12 = -3475293821955924829L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        o4.p = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
        o4.J = m44.a("i", (Object)o4.a("e", (int)8728, (long)(708837864302649631L ^ var14)), (Object)o4.a("e", (int)25054, (long)(5276734607077925596L ^ var14)), (long)-347191750031435726L, (long)var14);
        o4.I = m44.a("i", (Object)o4.a("e", (int)1824, (long)(4916417361280926752L ^ var14)), (long)-107894738671200961L, (long)var14);
        o4.P = m44.a("i", (Object)o4.a("e", (int)27838, (long)(2353521119057768379L ^ var14)), (long)-107894738671200961L, (long)var14);
    }

    static /* synthetic */ boolean x(Object[] objectArray) {
        long l = (Long)objectArray[0];
        o4 o42 = (o4)objectArray[1];
        l = b ^ l;
        return (boolean)m44.a("q", (Object)o42, (long)3350906108085233492L, (long)l);
    }

    public o4(char c, char c2, int n) {
        long l = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        long l2 = l ^ 0x2FE6E31E1A9CL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        m44.a("i", (Object)this, (Object)objectArray, (long)3920237516947013771L, (long)l);
    }

    static /* synthetic */ int W(Object[] objectArray) {
        long l = (Long)objectArray[0];
        o4 o42 = (o4)objectArray[1];
        l = b ^ l;
        o4 o43 = o42;
        reference v1 = m44.a("s", (Object)o43, (long)8020029921719383289L, (long)l) + true;
        m44.a("q", (Object)o43, (int)v1, (long)8020029921719383289L, (long)l);
        return (int)v1;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7358;
        if (f[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/o4", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            o4.f[n2] = o4.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return f[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = o4.a(n, l);
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
            throw new RuntimeException("com/zelix/o4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(o4.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
