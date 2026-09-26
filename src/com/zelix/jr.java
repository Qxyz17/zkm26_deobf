/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.aw;
import com.zelix.h1;
import com.zelix.jf;
import com.zelix.js;
import com.zelix.jv;
import com.zelix.l6q;
import com.zelix.lkh;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.to;
import com.zelix.x8;
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

public class jr
extends jv
implements lkh {
    int o;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    protected void O(DataOutputStream dataOutputStream, long l) {
        dataOutputStream.writeByte(m44.a("m", (long)-74852683698232507L, (long)l).g());
        dataOutputStream.writeShort((int)m44.a("w", (Object)((Object)this), (long)-1764957968415654623L, (long)l));
    }

    public boolean G() {
        return true;
    }

    jr(int n, char c, int n2, h1 h12, to to2, int n3) {
        long l = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ a;
        super(n2, to2);
        m44.a("t", (Object)((Object)this), (int)h12.readUnsignedShort(), (long)8771003169708925720L, (long)l);
    }

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x45ED9453B3FL;
        return ((x8)this.l.m(l2, (int)m44.a("q", (Object)((Object)this), (long)2929538409404379655L, (long)l))).V().replace((char)jr.c("x", (int)31036, (long)(0x6C081D54FD23129DL ^ l)), (char)jr.c("x", (int)21158, (long)(0x35D3EF2CF2B2B906L ^ l)));
    }

    public void r(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l ^ 0x2C3F4D2E2F5DL;
        ((x8)this.l.m(l2, (int)m44.a("s", (Object)((Object)this), (long)4379161062826714725L, (long)l))).A(string);
    }

    public String g(long l) {
        long l2 = l ^ 0x37838B89E08BL;
        return ((x8)this.l.m(l2, (int)m44.a("u", (Object)((Object)this), (long)-931123122073638477L, (long)l))).V();
    }

    public js i(l6q l6q2, l6q l6q3, l6q l6q4, l6q l6q5, long l, PrintWriter printWriter) {
        long l2 = l;
        long l3 = l2 ^ 0x330C83A99E71L;
        int n = (int)(l3 >>> 32);
        int n2 = (int)(l3 << 32 >>> 40);
        int n3 = (int)(l3 << 56 >>> 56);
        long l4 = l2 ^ 0x4D3EB9EBAF7DL;
        long l5 = l2 ^ 0x2B5FD5FA8DC6L;
        long l6 = l2 ^ 0x7231103C1230L;
        long l7 = l2 ^ 0x3F5CD60287A2L;
        try {
            js js2 = this.l.m(l6, (int)m44.a("v", (Object)((Object)this), (long)119549653150604040L, (long)l));
            if (js2 instanceof x8) {
                jf jf2 = new jf(this, (x8)js2, l6q2, l5);
                return jf2;
            }
            Object[] objectArray = new Object[3];
            objectArray[2] = (int)((byte)n3);
            objectArray[1] = n2;
            objectArray[0] = n;
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l7;
            objectArray2[0] = m44.a("w", (Object)((Object)this), (long)l4, (long)1791770362047130281L, (long)l);
            String string = (String)((Object)m44.a("w", (Object)this.l, (Object)objectArray, (long)2038621223880514639L, (long)l)) + (String)((Object)jr.b("w", (int)3029, (long)(0x65E430C92B1269BAL ^ l))) + (String)((Object)jr.b("w", (int)24926, (long)(0x6B31C7BA585E8333L ^ l))) + (String)((Object)jr.b("w", (int)32547, (long)(0x5B47C1FE5F0A1D4DL ^ l))) + (int)m44.a("v", (Object)((Object)this), (long)119549653150604040L, (long)l) + (String)((Object)jr.b("w", (int)32547, (long)(0x5B47C1FE5F0A1D4DL ^ l))) + (String)((Object)m44.a("h", (Object)objectArray2, (long)2174414554445932441L, (long)l)) + (String)((Object)jr.b("w", (int)21873, (long)(0x5892425CE49BB71BL ^ l)));
            throw new aw(string);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            Object[] objectArray = new Object[3];
            objectArray[2] = (int)((byte)n3);
            objectArray[1] = n2;
            objectArray[0] = n;
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l7;
            objectArray3[0] = m44.a("w", (Object)((Object)this), (long)l4, (long)1791770362047130281L, (long)l);
            String string = (String)((Object)m44.a("w", (Object)this.l, (Object)objectArray, (long)2038621223880514639L, (long)l)) + (String)((Object)jr.b("w", (int)32547, (long)(0x5B47C1FE5F0A1D4DL ^ l))) + (String)((Object)jr.b("w", (int)12018, (long)(0x3BFD7836EEC3CC99L ^ l))) + (String)((Object)jr.b("w", (int)32547, (long)(0x5B47C1FE5F0A1D4DL ^ l))) + (String)((Object)m44.a("w", (Object)arrayIndexOutOfBoundsException, (long)2026021970840546810L, (long)l)) + (String)((Object)jr.b("w", (int)32547, (long)(0x5B47C1FE5F0A1D4DL ^ l))) + (String)((Object)m44.a("h", (Object)objectArray3, (long)2174414554445932441L, (long)l)) + (String)((Object)jr.b("w", (int)12367, (long)(0x531EE20491285223L ^ l)));
            throw new aw(string);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        jr.a = prr.a((long)1518072647140228834L, (long)3312815997771944290L, MethodHandles.lookup().lookupClass()).a(248355735283673L);
                        jr.d = new HashMap<K, V>(13);
                        var11 = jr.a ^ 21203972855248L;
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
                        var20_3 = new String[6];
                        var18_4 = 0;
                        var17_5 = "\u001c_\u0017\u00d4\u00be\u00aa`\u00af\u00f2i~\u0091\u009b\u0096\u0095k\u0010g6\u00f7\u00e9\u00c8\u00c4'\u0093\u00a5\u001f\u0019v\u00f0\u00e0Tb@\u008b\u00cdBqi=\u00ac\u0091O5\u0098!\u0016\u00a5L\u00e2\u00d2\u00cc\u00a9\\\u001b SR&\u0007z\u009b1\u00a9\u009bF>\u00f5\u00d2a\u00c1\u00e5]\\\u00d4\"\u00afy\u00a7\u00f4/\u00db\u0080b\u001b\u00fa\u000e\u00b8\t7\u009c\u00191\u00df\u00a2\u0082\u00a4-\u0010\u009b\u00fdp>\u00b1\u0083\u00e5\u00f6.\b\u001f\f\u0016\u00eb\u0092N";
                        var19_6 = "\u001c_\u0017\u00d4\u00be\u00aa`\u00af\u00f2i~\u0091\u009b\u0096\u0095k\u0010g6\u00f7\u00e9\u00c8\u00c4'\u0093\u00a5\u001f\u0019v\u00f0\u00e0Tb@\u008b\u00cdBqi=\u00ac\u0091O5\u0098!\u0016\u00a5L\u00e2\u00d2\u00cc\u00a9\\\u001b SR&\u0007z\u009b1\u00a9\u009bF>\u00f5\u00d2a\u00c1\u00e5]\\\u00d4\"\u00afy\u00a7\u00f4/\u00db\u0080b\u001b\u00fa\u000e\u00b8\t7\u009c\u00191\u00df\u00a2\u0082\u00a4-\u0010\u009b\u00fdp>\u00b1\u0083\u00e5\u00f6.\b\u001f\f\u0016\u00eb\u0092N".length();
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
                            var20_3[var18_4++] = jr.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00cb\u0080{\u0085\u0083\u0094\u00d4\u000bd\u00be\u00f9\u00b9\u0013\u009a\f\u00e3-y|\u00c6\u001c\u00b1x\u0010\u00af\u00f7\u00d4p\u0016\u00f4\u001c\b\u0016t\u00c0\u0092\u00b5\u00d6U'N\u00dcmr\u00fc\u00826c\u0018\u00ddB\u009ar\u0018\u008b\u007f\u00aau\u00fa\u00f0[\u00a6\u0018h\u0010\u00cb\u007f\u00f3\u0082\u00a65\u0090\u00fe<\u0001\u00cbp\u0085\u0001\u00885";
                            var19_6 = "\u00cb\u0080{\u0085\u0083\u0094\u00d4\u000bd\u00be\u00f9\u00b9\u0013\u009a\f\u00e3-y|\u00c6\u001c\u00b1x\u0010\u00af\u00f7\u00d4p\u0016\u00f4\u001c\b\u0016t\u00c0\u0092\u00b5\u00d6U'N\u00dcmr\u00fc\u00826c\u0018\u00ddB\u009ar\u0018\u008b\u007f\u00aau\u00fa\u00f0[\u00a6\u0018h\u0010\u00cb\u007f\u00f3\u0082\u00a65\u0090\u00fe<\u0001\u00cbp\u0085\u0001\u00885".length();
                            var16_7 = 64;
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
                            var20_3[var18_4++] = jr.b(var21_9).intern();
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
                jr.b = var20_3;
                jr.c = new String[6];
                jr.g = new HashMap<K, V>(13);
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
                var6_12 = new long[2];
                var3_13 = 0;
                var4_14 = "\u00fa\u008a\u00c1\u000f\u001b\u00be\u008e\u008cpff\u00054\u00e4e\u00f3";
                var5_15 = "\u00fa\u008a\u00c1\u000f\u001b\u00be\u008e\u008cpff\u00054\u00e4e\u00f3".length();
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
        jr.e = var6_12;
        jr.f = new Integer[2];
    }

    private static String b(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6810;
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
                throw new RuntimeException("com/zelix/jr", exception);
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
            jr.c[n2] = jr.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = jr.b(n, l);
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
            throw new RuntimeException("com/zelix/jr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x48D1;
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
                throw new RuntimeException("com/zelix/jr", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            jr.f[n2] = n3;
        }
        return f[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = jr.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/jr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(jr.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(jr.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
