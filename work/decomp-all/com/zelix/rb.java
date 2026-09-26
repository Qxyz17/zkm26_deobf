/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.i_;
import com.zelix.is;
import com.zelix.js;
import com.zelix.l6e;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.xo;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class rb
implements l6e {
    public static final String[] i;
    public static final String[] w;
    public static final String[] g;
    private static final String[] a;
    private static final String[] b;
    private static final Map c;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;

    public String w(Object[] objectArray) {
        return "b";
    }

    public String B(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return rb.a("o", (int)14256, (long)(0xA027C99CC4AC5AAL ^ l));
    }

    public String[] J(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("k", (long)-3939863116252321586L, (long)l);
    }

    public String[] b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("i", (long)-2251235541566085762L, (long)l);
    }

    public int r(Object[] objectArray) {
        return 2;
    }

    public String[] f(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("i", (long)-8898310839210320736L, (long)l);
    }

    public List m(Object[] objectArray) {
        xo xo2 = (xo)objectArray[0];
        long l = (Long)objectArray[1];
        xo[] xoArray = (xo[])objectArray[2];
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(is.Z((int)rb.b("t", (int)31984, (long)(0x459172469F594203L ^ l))));
        arrayList.add(is.Z((int)rb.b("t", (int)18177, (long)(0x1CDE762776C79F4L ^ l))));
        arrayList.add(new i_((int)rb.b("t", (int)6685, (long)(0x2A2DF787CF5224ECL ^ l)), (js)xoArray[0]));
        arrayList.add(new i_((int)rb.b("t", (int)19182, (long)(0x262E4653D8D9F41CL ^ l)), (js)xo2));
        arrayList.add(is.Z((int)rb.b("t", (int)10147, (long)(0x2C23AA93177F1957L ^ l))));
        arrayList.add(is.Z((int)rb.b("t", (int)9894, (long)(0x27318F35E9389856L ^ l))));
        return arrayList;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        var20 = prr.a((long)8316176335282293274L, (long)1727471690180537766L, MethodHandles.lookup().lookupClass()).a(135211906438426L) ^ 75343041622637L;
                        rb.c = new HashMap<K, V>(13);
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
                        var18_3 = new String[4];
                        var16_4 = 0;
                        var15_5 = "\b\u00d5\u00fa\u00f0\u008a9\u00c2:\u00fb\u00ff\u00a12k\u0004\u00dd\u00be@z\u00b9\u00f8\u00c7=\u00a3\u00e3\u0003\u00c1\u00c7\u00af\u0094X\u00b6{\u00c3\u009f2\u009c?\u0013\u00cd\u001b\u008bb#\u00f9\u0098I\u0000\u00bdr\u0085*\u0010p\u001e4\u0082\u00cb\u0082\u00bf\u00e4\u00d9\u009aU\u0017\u0000\u00f2\u0083q\u008b\u0083\u00de\u00bb\u00fc\u00f6\u0096p}k\u00cb\u001b\u00d0_o.U\u00c1\u00e6\u00e0\u0002\u0095\u00a9s5]\u00e4\u0013\u00cb\u00e0\u00d5R\u00b5L\u00cc/\u0081\u00ce\u0096\u0001\u00c34(/d\u00da\u00fc\u00e8\u00ca\u00a3\u00a4\u00faQo_L\u00fcc\b\u00eb(\u009bn!\u009d^\u00c0\u00fe\u001al\u00bf\u00ad$\bZ>\u0097\u00ad\u0006H\u00f7\u00d3\u00a9\u00caj\u0005\u00e8\u0012n\u00ea\u00ed9\u00d0p\u00bb\u000f\u0013q\u00bcq\u00a8";
                        var17_6 = "\b\u00d5\u00fa\u00f0\u008a9\u00c2:\u00fb\u00ff\u00a12k\u0004\u00dd\u00be@z\u00b9\u00f8\u00c7=\u00a3\u00e3\u0003\u00c1\u00c7\u00af\u0094X\u00b6{\u00c3\u009f2\u009c?\u0013\u00cd\u001b\u008bb#\u00f9\u0098I\u0000\u00bdr\u0085*\u0010p\u001e4\u0082\u00cb\u0082\u00bf\u00e4\u00d9\u009aU\u0017\u0000\u00f2\u0083q\u008b\u0083\u00de\u00bb\u00fc\u00f6\u0096p}k\u00cb\u001b\u00d0_o.U\u00c1\u00e6\u00e0\u0002\u0095\u00a9s5]\u00e4\u0013\u00cb\u00e0\u00d5R\u00b5L\u00cc/\u0081\u00ce\u0096\u0001\u00c34(/d\u00da\u00fc\u00e8\u00ca\u00a3\u00a4\u00faQo_L\u00fcc\b\u00eb(\u009bn!\u009d^\u00c0\u00fe\u001al\u00bf\u00ad$\bZ>\u0097\u00ad\u0006H\u00f7\u00d3\u00a9\u00caj\u0005\u00e8\u0012n\u00ea\u00ed9\u00d0p\u00bb\u000f\u0013q\u00bcq\u00a8".length();
                        var14_7 = 128;
                        var13_8 = -1;
lbl19:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl24:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = rb.b(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u00f8\u00b3\u00fc\u0093< \u00f6\u00b5\u00e2\u0095\u00b0I\u0083\u0082u\u00da\u00fe+\u00c7\u0014\u00bcP\u0090\u00a9\u00ab\u00fe,.J\u00c9'\u00a70\u0013\b*z\u00078a\u00ac\u009a\u00ff\u0000\u0082\u0094\u00d4\u00f3\u00d4A\u00fe*\u00d9\tp{\u00de\tY\u00c8(\u00c3\u0000\u00b0\u001d\u00e4\u0095\u00a4@\u00b1\u00b1\u00cc\u00f97\u00dd\u0097b>O_\u0013";
                            var17_6 = "\u00f8\u00b3\u00fc\u0093< \u00f6\u00b5\u00e2\u0095\u00b0I\u0083\u0082u\u00da\u00fe+\u00c7\u0014\u00bcP\u0090\u00a9\u00ab\u00fe,.J\u00c9'\u00a70\u0013\b*z\u00078a\u00ac\u009a\u00ff\u0000\u0082\u0094\u00d4\u00f3\u00d4A\u00fe*\u00d9\tp{\u00de\tY\u00c8(\u00c3\u0000\u00b0\u001d\u00e4\u0095\u00a4@\u00b1\u00b1\u00cc\u00f97\u00dd\u0097b>O_\u0013".length();
                            var14_7 = 32;
                            var13_8 = -1;
lbl33:
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
lbl38:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = rb.b(var19_9).intern();
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
lbl50:
                        // 1 sources

                        ** continue;
                    }
                }
                rb.a = var18_3;
                rb.b = new String[4];
                rb.f = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[6];
                var3_13 = 0;
                var4_14 = "\u00ef\u001b\u00ce\u00b7\u0083\u0014\u00b7<t\u00f6\u00dc\u008d/W\u00a2W\u0098\u0089\u00ac]I\u0018\u0003j\u00df,\u00fc\u0097Wa2*";
                var5_15 = "\u00ef\u001b\u00ce\u00b7\u0083\u0014\u00b7<t\u00f6\u00dc\u008d/W\u00a2W\u0098\u0089\u00ac]I\u0018\u0003j\u00df,\u00fc\u0097Wa2*".length();
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
lbl77:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "sKA\u009a\u00d2C\u00e69\u001b>\u0094@\u00b9\u0088\u0011R";
                    var5_15 = "sKA\u009a\u00d2C\u00e69\u001b>\u0094@\u00b9\u0088\u0011R".length();
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
lbl90:
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
lbl103:
                // 1 sources

                ** continue;
            }
        }
        rb.d = var6_12;
        rb.e = new Integer[6];
        rb.w = new String[]{rb.a("o", (int)13825, (long)(6161179499583539963L ^ var20))};
        rb.i = new String[]{rb.a("o", (int)8397, (long)(7537877978288987190L ^ var20))};
        rb.g = new String[]{rb.a("o", (int)24681, (long)(4277314782087502993L ^ var20))};
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6147;
        if (b[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])c.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    c.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/rb", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = a[n2].getBytes("ISO-8859-1");
            rb.b[n2] = rb.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return b[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = rb.a(n, l);
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
            throw new RuntimeException("com/zelix/rb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3FB2;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/rb", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            rb.e[n2] = n3;
        }
        return e[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = rb.b(n, l);
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
            throw new RuntimeException("com/zelix/rb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(rb.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(rb.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
