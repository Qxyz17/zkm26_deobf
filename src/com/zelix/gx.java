/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.f9;
import com.zelix.fr;
import com.zelix.l;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.u2;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class gx
implements f9 {
    private fr P;
    private HashSet T;
    final l F;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    /*
     * Exception decompiling
     */
    public boolean B(Object[] var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at CfrList.lambda$main$0(CfrList.java:27)
         *     at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
         *     at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
         *     at java.base/java.lang.Thread.run(Thread.java:829)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public boolean a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        long l2 = (Long)objectArray[2];
        int n3 = (Integer)objectArray[3];
        long l3 = l2;
        long l4 = l3 ^ 0x7693A563CFE2L;
        long l5 = l3 ^ 0x18682C435AD3L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l.k.e(l4, n3);
        objectArray2[2] = l.k.e(l4, n2);
        objectArray2[1] = l.k.e(l4, n);
        objectArray2[0] = l5;
        CallSite callSite = m44.a("w", (Object)m44.a("v", (Object)this, (long)-899253137768007566L, (long)l2), (Object)objectArray2, (long)-1445747650631850568L, (long)l2);
        return (boolean)callSite;
    }

    public void O(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        long l2 = (Long)objectArray[2];
        int n3 = (Integer)objectArray[3];
        long l3 = l2;
        long l4 = l3 ^ 0xE9321341F01L;
        long l5 = l3 ^ 0x4CD95943F835L;
        m44.a("u", (Object)this, (long)2550812042273056913L, (long)l2).T(l5, l.k.e(l4, n), l.k.e(l4, n2), l.k.e(l4, n3));
    }

    public f9 y(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l l3 = (l)objectArray[1];
        long l4 = l2 ^ 0x7FACA3D3E391L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        return m44.a("w", (Object)l3, (Object)objectArray2, (long)-7956848395833842820L, (long)l2);
    }

    public HashSet N(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return m44.a("s", (Object)this, (long)1082692281596315155L, (long)l2);
    }

    gx(long l2, l l3) {
        long l4 = l2 = a ^ l2;
        long l5 = l4 ^ 0x79FAEB88751AL;
        long l6 = l4 ^ 0x297DA165C88BL;
        this.F = l3;
        m44.a("v", (Object)this, (fr)new fr(5, (int)gx.b("i", (int)27684, (long)(0x165AC41FC451787AL ^ l2)), l6, (int)gx.b("i", (int)12238, (long)(0x79341529526BB93L ^ l2))), (long)-5093849546984328520L, (long)l2);
        Object[] objectArray = new Object[2];
        objectArray[1] = l5;
        objectArray[0] = (int)gx.b("i", (int)32238, (long)(0x376672A9DFCA69B6L ^ l2));
        m44.a("v", (Object)this, (HashSet)((Object)m44.a("j", (Object)objectArray, (long)-5108946025308574127L, (long)l2)), (long)-4897279340958665444L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        gx.a = prr.a((long)-3296386791519147653L, (long)-3727598188864915614L, MethodHandles.lookup().lookupClass()).a(274924536748289L);
                        gx.d = new HashMap<K, V>(13);
                        var11 = gx.a ^ 47387662497606L;
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
                        var20_3 = new String[10];
                        var18_4 = 0;
                        var17_5 = "=\u00ae\u00c5\u00e2\u00a8-\u00a4\u00c6\u00cd\u00e3\u009c\u00eb\u0083\u00ce\u008d\u00a03\u00f522p\u00c5w\u00f0(@dM\u00ba\b\u00fd\u008f\u00cb^<\u008c\u00c8T\u008b.\u0095Z;2\r\u00dc\u00bb'\u009f\u00f5p\u0094\u00c7\u0080\u00a5\u00c57S9\u00cd4^\u00bcT\u00f4(\u00f7\u0016JES\u00e2\u00c0'f\b\u00fcw\u00c9\u00e8\u00cf\u00c79#a\u00a2\u0099\u00c5u\u009d\u0017\u00ba\u00c9\u0091\u00ca\u0097\u00a6\u009b%\u00c0\u0087\u00fb\u00e7\u00c9\u00aa\u00f4(\u0090\u001e~\u00a1N\u00ad\u00d6Z\u001c\u000bf\u0002\u00fa\u00e4\u00be\f\u00a9\u00a6\u0013\u0019\u00e0\u00f9\u008c\u00ba\u00e9\u00e8\u000e\rdN\u00feW\u00022?\u00aa\u00c4\u00aeV\u001e8\u00dd\u008e\u008a\u00c0,\u00f1oz\n\u00cdBY\u00f7Gv/qc>VBkA\u00f3~9\u00c6\u00c1,\u009f\u00a6\u00f0\u00c3\u0086\u0084\u000f\u009eF\u0018\u00e6\u00bd\u0085\u00be\u00df\u00de1\u00dc_\u00f4\u00d4#` \u0003\u0083\u00c8([O\u00d1\u001f\u008b\u00dez/W\u00d6\u00b2\u00b1\u0001\u00ae)\u0081\u00ed\u0005`\u00f8Dh%\u009b'\u00ae\u00e5I\u00e6!V\u00a0\u00db\u0017\u00e8aP\u00b2,7(\u00dc\u00ebQ\u00fb\u00b0\u00c5\u00b4Hw\u00bc8@\u0011\u008d\r\u00be\u00ed\u0002?\u0010\u00d5Q\u0092\u008c\u001c\u00e6\u00a0\u00bd\u0005\u00a0\u0083\u00c6\u00c4\u00eeo\u0015\u00d3\u00c1\u00ca`\u0018\u00da\u00c2\u0017=\u00cb\u00f5\u0094\u00cf\u0001\u00d5\u00cd\u0086\u00edOz\u008e\u00e8\u00c4\u0003.\u0004\u0097\u00a6\u00da";
                        var19_6 = "=\u00ae\u00c5\u00e2\u00a8-\u00a4\u00c6\u00cd\u00e3\u009c\u00eb\u0083\u00ce\u008d\u00a03\u00f522p\u00c5w\u00f0(@dM\u00ba\b\u00fd\u008f\u00cb^<\u008c\u00c8T\u008b.\u0095Z;2\r\u00dc\u00bb'\u009f\u00f5p\u0094\u00c7\u0080\u00a5\u00c57S9\u00cd4^\u00bcT\u00f4(\u00f7\u0016JES\u00e2\u00c0'f\b\u00fcw\u00c9\u00e8\u00cf\u00c79#a\u00a2\u0099\u00c5u\u009d\u0017\u00ba\u00c9\u0091\u00ca\u0097\u00a6\u009b%\u00c0\u0087\u00fb\u00e7\u00c9\u00aa\u00f4(\u0090\u001e~\u00a1N\u00ad\u00d6Z\u001c\u000bf\u0002\u00fa\u00e4\u00be\f\u00a9\u00a6\u0013\u0019\u00e0\u00f9\u008c\u00ba\u00e9\u00e8\u000e\rdN\u00feW\u00022?\u00aa\u00c4\u00aeV\u001e8\u00dd\u008e\u008a\u00c0,\u00f1oz\n\u00cdBY\u00f7Gv/qc>VBkA\u00f3~9\u00c6\u00c1,\u009f\u00a6\u00f0\u00c3\u0086\u0084\u000f\u009eF\u0018\u00e6\u00bd\u0085\u00be\u00df\u00de1\u00dc_\u00f4\u00d4#` \u0003\u0083\u00c8([O\u00d1\u001f\u008b\u00dez/W\u00d6\u00b2\u00b1\u0001\u00ae)\u0081\u00ed\u0005`\u00f8Dh%\u009b'\u00ae\u00e5I\u00e6!V\u00a0\u00db\u0017\u00e8aP\u00b2,7(\u00dc\u00ebQ\u00fb\u00b0\u00c5\u00b4Hw\u00bc8@\u0011\u008d\r\u00be\u00ed\u0002?\u0010\u00d5Q\u0092\u008c\u001c\u00e6\u00a0\u00bd\u0005\u00a0\u0083\u00c6\u00c4\u00eeo\u0015\u00d3\u00c1\u00ca`\u0018\u00da\u00c2\u0017=\u00cb\u00f5\u0094\u00cf\u0001\u00d5\u00cd\u0086\u00edOz\u008e\u00e8\u00c4\u0003.\u0004\u0097\u00a6\u00da".length();
                        var16_7 = 24;
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
                            var20_3[var18_4++] = gx.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u0099\u00c0t\u00a5\u008b\u00b0\u0003\u00d3y\u00ab-\u00db\u0083\u009f\u0094\u00cb\u00d5A|4\u001eYj|\u00cd\u0084\u0006\u00f0U\u0014\u0081\u00acw\u000f\u00c6\u000fW'+\u00a5\u0010\r\u00d2A(n\u00b8ZK2\u00a8\t\u00d9\u00c0CT\u00f0";
                            var19_6 = "\u0099\u00c0t\u00a5\u008b\u00b0\u0003\u00d3y\u00ab-\u00db\u0083\u009f\u0094\u00cb\u00d5A|4\u001eYj|\u00cd\u0084\u0006\u00f0U\u0014\u0081\u00acw\u000f\u00c6\u000fW'+\u00a5\u0010\r\u00d2A(n\u00b8ZK2\u00a8\t\u00d9\u00c0CT\u00f0".length();
                            var16_7 = 40;
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
                            var20_3[var18_4++] = gx.a(var21_9).intern();
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
                gx.b = var20_3;
                gx.c = new String[10];
                gx.g = new HashMap<K, V>(13);
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
                var6_12 = new long[5];
                var3_13 = 0;
                var4_14 = "$SX\u00d4dQlE\u0088\u000b\u001e}^z\u00cb\u00e7\u0014\u0007c\u00ac@\u0098\u00a7 ";
                var5_15 = "$SX\u00d4dQlE\u0088\u000b\u001e}^z\u00cb\u00e7\u0014\u0007c\u00ac@\u0098\u00a7 ".length();
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
                    var4_14 = "\u00c6\u0007\u00c1=m\u00f3B\u00c8>|\u00f2;\u0099\u00c3\u00f4\u0017";
                    var5_15 = "\u00c6\u0007\u00c1=m\u00f3B\u00c8>|\u00f2;\u0099\u00c3\u00f4\u0017".length();
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
        gx.e = var6_12;
        gx.f = new Integer[5];
    }

    private static u2 a(u2 u22) {
        return u22;
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

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x3707;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/gx", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l2 << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            gx.c[n2] = gx.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = gx.a(n, l2);
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
            throw new RuntimeException("com/zelix/gx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x2641;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/gx", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gx.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = gx.b(n, l2);
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
            throw new RuntimeException("com/zelix/gx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(gx.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(gx.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
