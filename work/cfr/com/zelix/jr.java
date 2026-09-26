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
import com.zelix.va;
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

    @Override
    protected void O(DataOutputStream dataOutputStream, long l10) {
        dataOutputStream.writeByte(((va)((Object)m44.a("m", (long)-74852683698232507L, (long)l10))).g());
        dataOutputStream.writeShort((int)m44.a("w", (Object)this, (long)-1764957968415654623L, (long)l10));
    }

    @Override
    public boolean G() {
        return true;
    }

    jr(int n10, char c10, int n11, h1 h12, to to2, int n12) {
        long l10 = ((long)n10 << 32 | (long)c10 << 48 >>> 32 | (long)n12 << 48 >>> 48) ^ a;
        super(n11, to2);
        m44.a("t", (Object)this, (int)h12.readUnsignedShort(), (long)8771003169708925720L, (long)l10);
    }

    @Override
    public String N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x45ED9453B3FL;
        return ((x8)this.l.m(l11, (int)m44.a("q", (Object)this, (long)2929538409404379655L, (long)l10))).V().replace((char)jr.c("x", (int)31036, (long)(0x6C081D54FD23129DL ^ l10)), (char)jr.c("x", (int)21158, (long)(0x35D3EF2CF2B2B906L ^ l10)));
    }

    @Override
    public void r(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10 ^ 0x2C3F4D2E2F5DL;
        ((x8)this.l.m(l11, (int)m44.a("s", (Object)this, (long)4379161062826714725L, (long)l10))).A(string);
    }

    @Override
    public String g(long l10) {
        long l11 = l10 ^ 0x37838B89E08BL;
        return ((x8)this.l.m(l11, (int)m44.a("u", (Object)this, (long)-931123122073638477L, (long)l10))).V();
    }

    @Override
    public js i(l6q l6q2, l6q l6q3, l6q l6q4, l6q l6q5, long l10, PrintWriter printWriter) {
        long l11 = l10;
        long l12 = l11 ^ 0x330C83A99E71L;
        int n10 = (int)(l12 >>> 32);
        int n11 = (int)(l12 << 32 >>> 40);
        int n12 = (int)(l12 << 56 >>> 56);
        long l13 = l11 ^ 0x4D3EB9EBAF7DL;
        long l14 = l11 ^ 0x2B5FD5FA8DC6L;
        long l15 = l11 ^ 0x7231103C1230L;
        long l16 = l11 ^ 0x3F5CD60287A2L;
        try {
            js js2 = this.l.m(l15, (int)m44.a("v", (Object)this, (long)119549653150604040L, (long)l10));
            if (js2 instanceof x8) {
                jf jf2 = new jf(this, (x8)js2, l6q2, l14);
                return jf2;
            }
            Object[] objectArray = new Object[3];
            objectArray[2] = (int)((byte)n12);
            objectArray[1] = n11;
            objectArray[0] = n10;
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l16;
            objectArray2[0] = m44.a("w", (Object)this, (long)l13, (long)1791770362047130281L, (long)l10);
            String string = (String)((Object)m44.a("w", (Object)this.l, (Object)objectArray, (long)2038621223880514639L, (long)l10)) + (String)((Object)jr.b("w", (int)3029, (long)(0x65E430C92B1269BAL ^ l10))) + (String)((Object)jr.b("w", (int)24926, (long)(0x6B31C7BA585E8333L ^ l10))) + (String)((Object)jr.b("w", (int)32547, (long)(0x5B47C1FE5F0A1D4DL ^ l10))) + (int)m44.a("v", (Object)this, (long)119549653150604040L, (long)l10) + (String)((Object)jr.b("w", (int)32547, (long)(0x5B47C1FE5F0A1D4DL ^ l10))) + (String)((Object)m44.a("h", (Object)objectArray2, (long)2174414554445932441L, (long)l10)) + (String)((Object)jr.b("w", (int)21873, (long)(0x5892425CE49BB71BL ^ l10)));
            throw new aw(string);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            Object[] objectArray = new Object[3];
            objectArray[2] = (int)((byte)n12);
            objectArray[1] = n11;
            objectArray[0] = n10;
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l16;
            objectArray3[0] = m44.a("w", (Object)this, (long)l13, (long)1791770362047130281L, (long)l10);
            String string = (String)((Object)m44.a("w", (Object)this.l, (Object)objectArray, (long)2038621223880514639L, (long)l10)) + (String)((Object)jr.b("w", (int)32547, (long)(0x5B47C1FE5F0A1D4DL ^ l10))) + (String)((Object)jr.b("w", (int)12018, (long)(0x3BFD7836EEC3CC99L ^ l10))) + (String)((Object)jr.b("w", (int)32547, (long)(0x5B47C1FE5F0A1D4DL ^ l10))) + (String)((Object)m44.a("w", (Object)arrayIndexOutOfBoundsException, (long)2026021970840546810L, (long)l10)) + (String)((Object)jr.b("w", (int)32547, (long)(0x5B47C1FE5F0A1D4DL ^ l10))) + (String)((Object)m44.a("h", (Object)objectArray3, (long)2174414554445932441L, (long)l10)) + (String)((Object)jr.b("w", (int)12367, (long)(0x531EE20491285223L ^ l10)));
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
                        jr.a = prr.a(1518072647140228834L, 3312815997771944290L, MethodHandles.lookup().lookupClass()).a(248355735283673L);
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
        int n10 = 0;
        int n11 = byArray.length;
        char[] cArray = new char[n11];
        for (int i10 = 0; i10 < n11; ++i10) {
            char c10;
            int n12 = 0xFF & byArray[i10];
            if (n12 < 192) {
                cArray[n10++] = (char)n12;
                continue;
            }
            if (n12 < 224) {
                c10 = (char)((char)(n12 & 0x1F) << 6);
                n12 = byArray[++i10];
                c10 = (char)(c10 | (char)(n12 & 0x3F));
                cArray[n10++] = c10;
                continue;
            }
            if (i10 >= n11 - 2) continue;
            c10 = (char)((char)(n12 & 0xF) << 12);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F) << 6);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F));
            cArray[n10++] = c10;
        }
        return new String(cArray, 0, n10);
    }

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x6810;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/jr", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n11].getBytes("ISO-8859-1");
            jr.c[n11] = jr.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = jr.b(n10, l10);
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

    private static int c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x48D1;
        if (f[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = e[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l12, objectArray);
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
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            jr.f[n11] = n12;
        }
        return f[n11];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = jr.c(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
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

