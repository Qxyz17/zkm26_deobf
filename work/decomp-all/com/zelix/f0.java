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

public class f0
implements l6e {
    public static final String[] b;
    public static final String[] l;
    public static final String[] q;
    private static final String[] a;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    public String[] J(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("k", (long)-3889095519182563150L, (long)l);
    }

    public String[] b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("i", (long)-1989954358066994140L, (long)l);
    }

    public String[] f(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("i", (long)-9065054531069461417L, (long)l);
    }

    public List m(Object[] objectArray) {
        xo xo2 = (xo)objectArray[0];
        long l = (Long)objectArray[1];
        xo[] xoArray = (xo[])objectArray[2];
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(is.Z((int)f0.b("u", (int)22672, (long)(0x61D263B6617E8F7FL ^ l))));
        arrayList.add(is.Z((int)f0.b("u", (int)7292, (long)(0x2C3F4BCA0CE04B96L ^ l))));
        arrayList.add(is.Z((int)f0.b("u", (int)30217, (long)(0x3915D80E3D6621E7L ^ l))));
        arrayList.add(is.Z((int)f0.b("u", (int)1838, (long)(0x274B7DB3314F50C6L ^ l))));
        arrayList.add(new i_((int)f0.b("u", (int)14322, (long)(0x481A1A58FF46E01BL ^ l)), (js)xoArray[0]));
        arrayList.add(new i_((int)f0.b("u", (int)112, (long)(0x4B66EA3D0F1D579DL ^ l)), (js)xo2));
        arrayList.add(is.Z((int)f0.b("u", (int)16129, (long)(0x9837136B2E068EAL ^ l))));
        return arrayList;
    }

    public String B(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return f0.a("h", (int)6803, (long)(0x1025C96B9E20E050L ^ l));
    }

    public String w(Object[] objectArray) {
        return "b";
    }

    public int r(Object[] objectArray) {
        return 2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        var20 = prr.a((long)-1854315772254269508L, (long)7392956107533556569L, MethodHandles.lookup().lookupClass()).a(251092501856155L) ^ 97336360467257L;
                        f0.d = new HashMap<K, V>(13);
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
                        var15_5 = "\u00a1\u00ceSI\u00a5\u009a\u00d5\u00b9\u00e6r\u009b\u00b9M\u00ae\u00bb\u0014-*#\u000fR\u00b2\u0083 m\u00a22\u00f1W\n5\u000fcq\u008f\u00ea#\u0097z\u0088\u00be\u0098=\u00f74\u00e8\u00e6z\u00d1\u00faO\u00f5\u00d2\u00ecy\u009f \u0086\u00a5E\u00da\u00a5\u0081\u0016\u00de\u0013_\u00bc\u00ebK\u0013o\u00fcB\u0091\u00f0MP\u00a4u\u00cfCnG\u0005'>M\u00ff";
                        var17_6 = "\u00a1\u00ceSI\u00a5\u009a\u00d5\u00b9\u00e6r\u009b\u00b9M\u00ae\u00bb\u0014-*#\u000fR\u00b2\u0083 m\u00a22\u00f1W\n5\u000fcq\u008f\u00ea#\u0097z\u0088\u00be\u0098=\u00f74\u00e8\u00e6z\u00d1\u00faO\u00f5\u00d2\u00ecy\u009f \u0086\u00a5E\u00da\u00a5\u0081\u0016\u00de\u0013_\u00bc\u00ebK\u0013o\u00fcB\u0091\u00f0MP\u00a4u\u00cfCnG\u0005'>M\u00ff".length();
                        var14_7 = 56;
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
                            var18_3[var16_4++] = f0.b(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u0097M\u009bXG\u00ebGo\u00e0\u008c6]\nA\u00cdB\u00f8\u00c7\u009cd27\u00ab\ff\u009e\u00ceWo\u00a3\u00ad\u00e30\u00f9\u00a8m\u00baS\u00b8\u00c0\u0090R\u00c0EcT\u00dd\u0018.\u00e4R\u0016~\u009a\u0091\u00c0+e\u00eb`\u00cf\u0090@`\u008c4\u00f1\u00deL\u0083El\u00c1\u0097<:\u008e\u00d9\u0088A?\u001e\u009d\u00ec=\u00d6\u0006p>m\u008e\u00aa\u00d7\u00a2\b\u00fa\u00f3\\\\\u0083\u0091\u00c9b\u00da\u00dd\u00fb\u00fe\u0003\u00e9\u00be8:\u00b9\u00a9\u00a9\u0013\u00f1\u00aa8\u00f4mS\u000e\u00e7Z\u0090W\u00cc( #\u001d\u00a9\u00c9\u00a8\u00edQq\u008e\u00a9\u00b7\u00b3e\u00c27|\u00b7\u00b3\u00fb\u001a\u00dbv\u00aa\u009e\u00da~J\u00ee\u00e9\u00bb\u00b2&h4\u001d\u00e7\u0018\u00f5\u0089";
                            var17_6 = "\u0097M\u009bXG\u00ebGo\u00e0\u008c6]\nA\u00cdB\u00f8\u00c7\u009cd27\u00ab\ff\u009e\u00ceWo\u00a3\u00ad\u00e30\u00f9\u00a8m\u00baS\u00b8\u00c0\u0090R\u00c0EcT\u00dd\u0018.\u00e4R\u0016~\u009a\u0091\u00c0+e\u00eb`\u00cf\u0090@`\u008c4\u00f1\u00deL\u0083El\u00c1\u0097<:\u008e\u00d9\u0088A?\u001e\u009d\u00ec=\u00d6\u0006p>m\u008e\u00aa\u00d7\u00a2\b\u00fa\u00f3\\\\\u0083\u0091\u00c9b\u00da\u00dd\u00fb\u00fe\u0003\u00e9\u00be8:\u00b9\u00a9\u00a9\u0013\u00f1\u00aa8\u00f4mS\u000e\u00e7Z\u0090W\u00cc( #\u001d\u00a9\u00c9\u00a8\u00edQq\u008e\u00a9\u00b7\u00b3e\u00c27|\u00b7\u00b3\u00fb\u001a\u00dbv\u00aa\u009e\u00da~J\u00ee\u00e9\u00bb\u00b2&h4\u001d\u00e7\u0018\u00f5\u0089".length();
                            var14_7 = 128;
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
                            var18_3[var16_4++] = f0.b(var19_9).intern();
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
                f0.a = var18_3;
                f0.c = new String[4];
                f0.g = new HashMap<K, V>(13);
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
                var6_12 = new long[7];
                var3_13 = 0;
                var4_14 = "t\u00a7)\u00df\u000b\u00b8v\u00ba\u00c2*\u0019\u009e\u00c5J[\u0093\u00d9\u0003\u00c0\u00bc\u00f9\u00e7\u00d1\u00eb\u00ae\u00f4\u0098\u00ec\u00f5\u00e58[\u00c8\b\\)\u00b5\u00b4\u00e3\u009a";
                var5_15 = "t\u00a7)\u00df\u000b\u00b8v\u00ba\u00c2*\u0019\u009e\u00c5J[\u0093\u00d9\u0003\u00c0\u00bc\u00f9\u00e7\u00d1\u00eb\u00ae\u00f4\u0098\u00ec\u00f5\u00e58[\u00c8\b\\)\u00b5\u00b4\u00e3\u009a".length();
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
                    var4_14 = "\u0089\u00c2\u00c4\u00a3v\r\u00fb\u00d5\u00fe\n\u0017e\u0000&\u00de*";
                    var5_15 = "\u0089\u00c2\u00c4\u00a3v\r\u00fb\u00d5\u00fe\n\u0017e\u0000&\u00de*".length();
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
        f0.e = var6_12;
        f0.f = new Integer[7];
        f0.q = new String[]{f0.a("h", (int)26544, (long)(3293183016207307297L ^ var20))};
        f0.l = new String[]{f0.a("h", (int)2046, (long)(6407869404076978798L ^ var20))};
        f0.b = new String[]{f0.a("h", (int)15157, (long)(6665749333915438759L ^ var20))};
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x699C;
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
                throw new RuntimeException("com/zelix/f0", exception);
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
            f0.c[n2] = f0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = f0.a(n, l);
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
            throw new RuntimeException("com/zelix/f0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x56A9;
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
                throw new RuntimeException("com/zelix/f0", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            f0.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = f0.b(n, l);
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
            throw new RuntimeException("com/zelix/f0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(f0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
