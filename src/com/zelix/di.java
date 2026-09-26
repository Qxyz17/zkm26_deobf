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

public class di {
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final long[] e;
    private static final Long[] f;
    private static final Map g;

    public static long i(Object[] objectArray) {
        long l = (Long)objectArray[0];
        byte[] byArray = (byte[])objectArray[1];
        l = a ^ l;
        long l2 = ((long)byArray[0] & di.b("b", (int)9799, (long)(0x2C683AEDB95AA301L ^ l))) << di.a("q", (int)6764, (long)(0x7664A5635C4B00B8L ^ l)) | ((long)byArray[1] & di.b("b", (int)22923, (long)(0x115F31CE13A4DCCCL ^ l))) << di.a("q", (int)24256, (long)(0x58EA11163B4A4407L ^ l)) | ((long)byArray[2] & di.b("b", (int)22923, (long)(0x115F31CE13A4DCCCL ^ l))) << di.a("q", (int)28002, (long)(0x4771C149742077ACL ^ l)) | ((long)byArray[3] & di.b("b", (int)22923, (long)(0x115F31CE13A4DCCCL ^ l))) << di.a("q", (int)27637, (long)(0x3BCC86A544DF13EL ^ l)) | ((long)byArray[4] & di.b("b", (int)22923, (long)(0x115F31CE13A4DCCCL ^ l))) << di.a("q", (int)8650, (long)(0x6BE68E9AE6973B1DL ^ l)) | ((long)byArray[5] & di.b("b", (int)22923, (long)(0x115F31CE13A4DCCCL ^ l))) << di.a("q", (int)27911, (long)(0x1495F72A00877C4L ^ l)) | ((long)byArray[di.a("q", (int)13474, (long)(0x67082C4BC4972E66L ^ l))] & di.b("b", (int)22923, (long)(0x115F31CE13A4DCCCL ^ l))) << di.a("q", (int)911, (long)(0x65DA47075DC11946L ^ l)) | (long)byArray[di.a("q", (int)5308, (long)(0x7518BC7B226D8E7DL ^ l))] & di.b("b", (int)22923, (long)(0x115F31CE13A4DCCCL ^ l));
        return l2;
    }

    public static byte[] h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        l = a ^ l;
        byte[] byArray = new byte[]{(byte)(n >>> di.a("q", (int)13366, (long)(0x7A0BD0BCE9C1CBE6L ^ l))), (byte)(n >>> di.a("q", (int)5968, (long)(0x53E9FA1EA5AB6888L ^ l))), (byte)(n >>> di.a("q", (int)13765, (long)(0x4473795A6AA24A1FL ^ l))), (byte)n};
        return byArray;
    }

    public static byte[] T(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        byte[] byArray = new byte[di.a("q", (int)13765, (long)(0x44737B9F418C1855L ^ l2))];
        byArray[0] = (byte)(l >>> di.a("q", (int)6420, (long)(0x422ACA43E4CD348CL ^ l2)));
        byArray[1] = (byte)(l >>> di.a("q", (int)4434, (long)(0x6A80B24570E3CC7L ^ l2)));
        byArray[2] = (byte)(l >>> di.a("q", (int)5163, (long)(0x630C8DE694F0B9A2L ^ l2)));
        byArray[3] = (byte)(l >>> di.a("q", (int)6823, (long)(0x2C6C1F26B0AB373AL ^ l2)));
        byArray[4] = (byte)(l >>> di.a("q", (int)13366, (long)(0x7A0BD279C2EF99ACL ^ l2)));
        byArray[5] = (byte)(l >>> di.a("q", (int)5968, (long)(0x53E9F8DB8E853AC2L ^ l2)));
        byArray[di.a("q", (int)10483, (long)(0x573989EFC35C057DL ^ l2))] = (byte)(l >>> di.a("q", (int)13765, (long)(0x44737B9F418C1855L ^ l2)));
        byArray[di.a("q", (int)28872, (long)(0x50673F804903DD56L ^ l2))] = (byte)l;
        byte[] byArray2 = byArray;
        return byArray2;
    }

    public static final int B(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        l = a ^ l;
        return (n & di.a("q", (int)4324, (long)(0x7039B5405D7F993FL ^ l))) << di.a("q", (int)13765, (long)(0x44732A6C94CA3C06L ^ l)) | n2 & di.a("q", (int)25574, (long)(0x1F9E98976A66EA38L ^ l));
    }

    public static final int X(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        l = a ^ l;
        return n & di.a("q", (int)25574, (long)(0x1F9EFD6246E6E0C3L ^ l));
    }

    public static final int S(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return (n & di.a("q", (int)17742, (long)(0x23BB2E062CB7116EL ^ l))) >> di.a("q", (int)13765, (long)(0x447327DB5FBC61E1L ^ l));
    }

    public static final int o(Object[] objectArray) {
        int n;
        block4: {
            int n2;
            block5: {
                n2 = (Integer)objectArray[0];
                long l = (Long)objectArray[1];
                l = a ^ l;
                CallSite callSite = m44.a("m", (long)8931528494612964805L, (long)l);
                try {
                    try {
                        n = n2;
                        if (callSite != null) break block4;
                        if (n >= 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)((Object)n92), (long)6954167998136684865L, (long)l);
                    }
                    return (int)(di.a("q", (int)25348, (long)(0x7614E95A35EA4B16L ^ l)) + n2);
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)((Object)n93), (long)6954167998136684865L, (long)l);
                }
            }
            n = n2;
        }
        return n;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    block11: {
                        di.a = prr.a((long)7225009271698176465L, (long)2280066954025470389L, MethodHandles.lookup().lookupClass()).a(33676411465022L);
                        di.d = new HashMap<K, V>(13);
                        var11 = di.a ^ 50165987787238L;
                        var13_1 = Cipher.getInstance("DES/CBC/NoPadding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var19_3 = new long[22];
                        var16_4 = 0;
                        var17_5 = "\u009bH)\u0086\u00e4\u00f2\u00af\u001f\u00b8\r\u00a1\u00b1\u00cc\u008d\u00bd2\u001c2U\u00d0R\u00d8h\u00bc@]#\u00d6\u000b\b\u00d7a\b,\u00c2\u0004G\u0004\u00ef5\u0082B^\u0084\u008d\u00e8\u00dd\u00d5\u00e67\u00ad4y\u00de\b\u00a66O\u0015\u0002c\u001e\u0001\u00bb\u0016:[\u00ce\u00e4\u00e8\u00bd|A\u00c8\u00a5\u00f7\u0097\u001d\u00ce*\u0018\u00aa#*\u009d\u00ff\u00ef(\u00b3\u00e1c\u008d\u00de\u00be8j.\u009ebW\u00d4\u00ef(O\u0017\u00f1Hz\u00c8\u00be\u008bHE\u0094\u00fdM\u00dc\u00ce\u00a2\u00f8\u0081\u00d11&4)q\u00ba\u00ee\u00f9\u00aaf\u00ba\u0097|\u0001\u008aP\u00eb\u001bQ\u008e\u009b\u00e5\u00f0\u00a3:\u008fT\u00c4\u00a4\u000e^k\u00e7[J\u00bc\u001e\u0082";
                        var18_6 = "\u009bH)\u0086\u00e4\u00f2\u00af\u001f\u00b8\r\u00a1\u00b1\u00cc\u008d\u00bd2\u001c2U\u00d0R\u00d8h\u00bc@]#\u00d6\u000b\b\u00d7a\b,\u00c2\u0004G\u0004\u00ef5\u0082B^\u0084\u008d\u00e8\u00dd\u00d5\u00e67\u00ad4y\u00de\b\u00a66O\u0015\u0002c\u001e\u0001\u00bb\u0016:[\u00ce\u00e4\u00e8\u00bd|A\u00c8\u00a5\u00f7\u0097\u001d\u00ce*\u0018\u00aa#*\u009d\u00ff\u00ef(\u00b3\u00e1c\u008d\u00de\u00be8j.\u009ebW\u00d4\u00ef(O\u0017\u00f1Hz\u00c8\u00be\u008bHE\u0094\u00fdM\u00dc\u00ce\u00a2\u00f8\u0081\u00d11&4)q\u00ba\u00ee\u00f9\u00aaf\u00ba\u0097|\u0001\u008aP\u00eb\u001bQ\u008e\u009b\u00e5\u00f0\u00a3:\u008fT\u00c4\u00a4\u000e^k\u00e7[J\u00bc\u001e\u0082".length();
                        var15_7 = 0;
                        while (true) {
                            var20_8 = var17_5.substring(var15_7, var15_7 += 8).getBytes("ISO-8859-1");
                            v3 = var19_3;
                            v4 = var16_4++;
                            v5 = ((long)var20_8[0] & 255L) << 56 | ((long)var20_8[1] & 255L) << 48 | ((long)var20_8[2] & 255L) << 40 | ((long)var20_8[3] & 255L) << 32 | ((long)var20_8[4] & 255L) << 24 | ((long)var20_8[5] & 255L) << 16 | ((long)var20_8[6] & 255L) << 8 | (long)var20_8[7] & 255L;
                            v6 = -1;
                            break block11;
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            v3[v4] = v7;
                            if (var15_7 < var18_6) ** continue;
                            var17_5 = "\u0002\u00a9\u00d0\u00a0'\u00e0\u00d7\u00b1\u00f7\u0097\u00e9\u00eb\u00e0W\u00db\u0084";
                            var18_6 = "\u0002\u00a9\u00d0\u00a0'\u00e0\u00d7\u00b1\u00f7\u0097\u00e9\u00eb\u00e0W\u00db\u0084".length();
                            var15_7 = 0;
                            while (true) {
                                var20_8 = var17_5.substring(var15_7, var15_7 += 8).getBytes("ISO-8859-1");
                                v3 = var19_3;
                                v4 = var16_4++;
                                v5 = ((long)var20_8[0] & 255L) << 56 | ((long)var20_8[1] & 255L) << 48 | ((long)var20_8[2] & 255L) << 40 | ((long)var20_8[3] & 255L) << 32 | ((long)var20_8[4] & 255L) << 24 | ((long)var20_8[5] & 255L) << 16 | ((long)var20_8[6] & 255L) << 8 | (long)var20_8[7] & 255L;
                                v6 = 0;
                                break block11;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            v3[v4] = v7;
                            if (var15_7 < var18_6) ** continue;
                            break block12;
                            break;
                        }
                    }
                    var21_9 = v5;
                    var23_10 = var13_1.doFinal(new byte[]{(byte)(var21_9 >>> 56), (byte)(var21_9 >>> 48), (byte)(var21_9 >>> 40), (byte)(var21_9 >>> 32), (byte)(var21_9 >>> 24), (byte)(var21_9 >>> 16), (byte)(var21_9 >>> 8), (byte)var21_9});
                    v7 = ((long)var23_10[0] & 255L) << 56 | ((long)var23_10[1] & 255L) << 48 | ((long)var23_10[2] & 255L) << 40 | ((long)var23_10[3] & 255L) << 32 | ((long)var23_10[4] & 255L) << 24 | ((long)var23_10[5] & 255L) << 16 | ((long)var23_10[6] & 255L) << 8 | (long)var23_10[7] & 255L;
                    switch (v6) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl52:
                        // 1 sources

                        ** continue;
                    }
                }
                di.b = var19_3;
                di.c = new Integer[22];
                di.g = new HashMap<K, V>(13);
                var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
                v8 = SecretKeyFactory.getInstance("DES");
                v9 = new byte[8];
                v10 = v9;
                v9[0] = (byte)(var11 >>> 56);
                for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                    v10 = v10;
                    v10[var1_12] = (byte)(var11 << var1_12 * 8 >>> 56);
                }
                var0_11.init(2, (Key)v8.generateSecret(new DESKeySpec(v10)), new IvParameterSpec(new byte[8]));
                var6_13 = new long[2];
                var3_14 = 0;
                var4_15 = "}9\u00aePV\u00a8\u008af\u0099\u00bfEk\u00a8&p\u0090";
                var5_16 = "}9\u00aePV\u00a8\u008af\u0099\u00bfEk\u00a8&p\u0090".length();
                var2_17 = 0;
                while (true) {
                    break block13;
                    break;
                }
lbl74:
                // 1 sources

                while (true) {
                    var6_13[v11] = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
                    if (var2_17 < var5_16) ** continue;
                    break block14;
                    break;
                }
            }
            var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
            v11 = var3_14++;
            var8_19 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
            var10_20 = var0_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            ** while (true)
        }
        di.e = var6_13;
        di.f = new Long[2];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5DAB;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/di", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            di.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = di.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/di" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4229;
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
                throw new RuntimeException("com/zelix/di", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            di.f[n2] = l4;
        }
        return f[n2];
    }

    private static long b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = di.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return l2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/di" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(di.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(di.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
