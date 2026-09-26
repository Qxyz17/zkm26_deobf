/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l62;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.io.BufferedReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class h9 {
    private static final long a = prr.a((long)-3034266535678095805L, (long)2981603174344995630L, MethodHandles.lookup().lookupClass()).a(149617764820046L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public h9(BufferedReader var1_1, String var2_2, long var3_3, Map var5_4) {
        v0 = var3_3 = h9.a ^ var3_3;
        var6_5 = v0 ^ 50646370580930L;
        var8_6 = v0 ^ 63481176522320L;
        v1 = m44.a("n", (long)-2355519160871840010L, (long)var3_3);
        super();
        var10_7 = v1;
        while (true) {
            block66: {
                block56: {
                    block57: {
                        block55: {
                            if ((var11_8 = var1_1.readLine()) == null) break block66;
                            v2 = new Object[3];
                            v2[2] = var8_6;
                            v2[1] = 0;
                            v2[0] = var11_8;
                            var12_9 = m44.a("n", (Object)v2, (long)-2402453042500497613L, (long)var3_3);
                            if (var12_9 > 0) {
                                var13_10 = var11_8.substring((int)var12_9);
                                try {
                                    if (var3_3 <= 0L || var10_7 == null) break block55;
                                    m44.a("n", (Object)"ZtBppc", (long)-2848123761687578118L, (long)var3_3);
                                }
                                catch (n9 v3) {
                                    throw m44.a("n", (Object)v3, (long)-4412428024488377088L, (long)var3_3);
                                }
                            }
                            var13_10 = var11_8;
                        }
                        try {
                            try {
                                v4 /* !! */  = m44.a("q", (Object)var13_10, (long)-4336149849177180790L, (long)var3_3);
                                if (var10_7 != null) break block56;
                                if (v4 /* !! */  == false) break block57;
                            }
                            catch (n9 v5) {
                                throw m44.a("n", (Object)v5, (long)-4412428024488377088L, (long)var3_3);
                            }
                            if (var10_7 == null) continue;
                        }
                        catch (n9 v6) {
                            throw m44.a("n", (Object)v6, (long)-4412428024488377088L, (long)var3_3);
                        }
                    }
                    v4 /* !! */  = (CallSite)var13_10.charAt(0);
                }
                v7 = 32650;
                block47: while (true) {
                    v8 = h9.b("i", (int)v7, (long)(2302149396435884764L ^ var3_3));
                    block48: while (true) {
                        block67: {
                            if (var10_7 != null) break block67;
                            try {
                                try {
                                    if (v4 /* !! */  == v8) ** GOTO lbl197
                                    v4 /* !! */  = (CallSite)var13_10.charAt(0);
                                    if (var10_7 == null) {
                                    }
                                    ** GOTO lbl63
                                }
                                catch (n9 v9) {
                                    throw m44.a("n", (Object)v9, (long)-4412428024488377088L, (long)var3_3);
                                }
                                v8 = h9.b("i", (int)26845, (long)(6665384667266403722L ^ var3_3));
                            }
                            catch (n9 v10) {
                                throw m44.a("n", (Object)v10, (long)-4412428024488377088L, (long)var3_3);
                            }
                        }
                        if (v4 /* !! */  == v8) ** GOTO lbl197
                        do {
                            v4 /* !! */  = (CallSite)false;
lbl63:
                            // 2 sources

                            var14_11 /* !! */  = v4 /* !! */ ;
                            var15_12 = null;
                            var16_13 = new StringTokenizer(var13_10, (String)h9.a("t", (int)25646, (long)(1877202691299191322L ^ var3_3)), true);
                            while (var16_13.hasMoreTokens()) {
                                block65: {
                                    block64: {
                                        block62: {
                                            block63: {
                                                block58: {
                                                    block59: {
                                                        block60: {
                                                            var17_14 = var16_13.nextToken();
                                                            var18_15 = var17_14.length();
                                                            try {
                                                                v11 /* !! */  = var18_15;
                                                                if (var10_7 != null) break block58;
                                                                v12 = 1;
                                                                if (var10_7 != null) continue block48;
                                                                if (var3_3 < 0L) continue block47;
                                                            }
                                                            catch (n9 v13) {
                                                                throw m44.a("n", (Object)v13, (long)-4412428024488377088L, (long)var3_3);
                                                            }
                                                            try {
                                                                block61: {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (v11 /* !! */  == v12) {
                                                                                        if (var3_3 < 0L) break block59;
                                                                                        v14 = var17_14.equals(":");
                                                                                        if (var10_7 != null) break block60;
                                                                                    }
                                                                                    ** GOTO lbl115
                                                                                }
                                                                                catch (n9 v15) {
                                                                                    throw m44.a("n", (Object)v15, (long)-4412428024488377088L, (long)var3_3);
                                                                                }
                                                                                if (var3_3 < 0L) break block60;
                                                                                if (v14) break block61;
                                                                            }
                                                                            catch (n9 v16) {
                                                                                throw m44.a("n", (Object)v16, (long)-4412428024488377088L, (long)var3_3);
                                                                            }
                                                                            v17 = var17_14;
                                                                            if (var10_7 != null) break block62;
                                                                        }
                                                                        catch (n9 v18) {
                                                                            throw m44.a("n", (Object)v18, (long)-4412428024488377088L, (long)var3_3);
                                                                        }
                                                                        if (!v17.equals("=")) break block63;
                                                                    }
                                                                    catch (n9 v19) {
                                                                        throw m44.a("n", (Object)v19, (long)-4412428024488377088L, (long)var3_3);
                                                                    }
                                                                }
                                                                v14 = true;
                                                            }
                                                            catch (n9 v20) {
                                                                throw m44.a("n", (Object)v20, (long)-4412428024488377088L, (long)var3_3);
                                                            }
                                                        }
                                                        var14_11 /* !! */  = (CallSite)v14;
                                                    }
                                                    try {
                                                        if (var10_7 == null) break block63;
lbl115:
                                                        // 2 sources

                                                        v11 /* !! */  = (int)var14_11 /* !! */ ;
                                                    }
                                                    catch (n9 v21) {
                                                        throw m44.a("n", (Object)v21, (long)-4412428024488377088L, (long)var3_3);
                                                    }
                                                }
                                                if (v11 /* !! */  != 0) {
                                                    var19_16 = m44.a("n", (Object)new Object[]{var17_14}, (long)-2805176656203457068L, (long)var3_3);
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        v17 = var19_16;
                                                                                        if (var10_7 != null) break block62;
                                                                                        if (v17.endsWith(";")) break block63;
                                                                                    }
                                                                                    catch (n9 v22) {
                                                                                        throw m44.a("n", (Object)v22, (long)-4412428024488377088L, (long)var3_3);
                                                                                    }
                                                                                    v17 = var19_16;
                                                                                    if (var10_7 != null) break block62;
                                                                                }
                                                                                catch (n9 v23) {
                                                                                    throw m44.a("n", (Object)v23, (long)-4412428024488377088L, (long)var3_3);
                                                                                }
                                                                                if (v17.indexOf("[") != -1) break block63;
                                                                            }
                                                                            catch (n9 v24) {
                                                                                throw m44.a("n", (Object)v24, (long)-4412428024488377088L, (long)var3_3);
                                                                            }
                                                                            v17 = var19_16;
                                                                            if (var10_7 != null) break block62;
                                                                        }
                                                                        catch (n9 v25) {
                                                                            throw m44.a("n", (Object)v25, (long)-4412428024488377088L, (long)var3_3);
                                                                        }
                                                                        if (v17.indexOf(".") != -1) break block63;
                                                                    }
                                                                    catch (n9 v26) {
                                                                        throw m44.a("n", (Object)v26, (long)-4412428024488377088L, (long)var3_3);
                                                                    }
                                                                    v17 = var19_16;
                                                                    if (var10_7 != null) break block62;
                                                                }
                                                                catch (n9 v27) {
                                                                    throw m44.a("n", (Object)v27, (long)-4412428024488377088L, (long)var3_3);
                                                                }
                                                                if (v17.indexOf("<") != -1) break block63;
                                                            }
                                                            catch (n9 v28) {
                                                                throw m44.a("n", (Object)v28, (long)-4412428024488377088L, (long)var3_3);
                                                            }
                                                            if (var3_3 <= 0L) break block64;
                                                            v17 = var19_16;
                                                            if (var10_7 != null) break block62;
                                                        }
                                                        catch (n9 v29) {
                                                            throw m44.a("n", (Object)v29, (long)-4412428024488377088L, (long)var3_3);
                                                        }
                                                        if (v17.indexOf(">") != -1) break block63;
                                                    }
                                                    catch (n9 v30) {
                                                        throw m44.a("n", (Object)v30, (long)-4412428024488377088L, (long)var3_3);
                                                    }
                                                    var20_17 = l62.B((String)var19_16, (long)var6_5);
                                                    try {
                                                        try {
                                                            v31 = var10_7;
                                                            if (var3_3 < 0L) break block65;
                                                            if (v31 != null) break block64;
                                                            if (var20_17 == null) break block63;
                                                        }
                                                        catch (n9 v32) {
                                                            throw m44.a("n", (Object)v32, (long)-4412428024488377088L, (long)var3_3);
                                                        }
                                                        var5_4.put(var20_17, (String)h9.a("t", (int)10566, (long)(2008437361681655667L ^ var3_3)) + var2_2 + "'");
                                                    }
                                                    catch (n9 v33) {
                                                        throw m44.a("n", (Object)v33, (long)-4412428024488377088L, (long)var3_3);
                                                    }
                                                }
                                            }
                                            v17 = var17_14;
                                        }
                                        var15_12 = v17;
                                    }
                                    v31 = var10_7;
                                }
                                if (v31 == null) continue;
                            }
lbl197:
                            // 4 sources

                        } while (var3_3 < 0L);
                        break;
                    }
                    break;
                }
                if (var10_7 == null) continue;
            }
            if (var3_3 > 0L) break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x79B9F8CD50A5L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "o\u00f0\u000eh\u009b}\u00d4F\u00ef\u00a7hsY\u0016a* \u0099v<iMPF3@\u00ed\u0012\u00dd\u009b_\u00bd\u00af\u00e8\u001a\u00e4l\u001aGo\u00f6\u00deq\u00ba\u0002e\u0080\u00af\u0006";
        int n2 = "o\u00f0\u000eh\u009b}\u00d4F\u00ef\u00a7hsY\u0016a* \u0099v<iMPF3@\u00ed\u0012\u00dd\u009b_\u00bd\u00af\u00e8\u001a\u00e4l\u001aGo\u00f6\u00deq\u00ba\u0002e\u0080\u00af\u0006".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = h9.a(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        b = stringArray;
        c = new String[2];
        g = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray5 = byArray5;
            byArray5[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n6 = 0;
        String string2 = "\u00b0@\u0081\u0002\u009aT\u0095\u00f4\u00b1\u00bf\u00d0\u00b0o\u0014_>";
        int n7 = "\u00b0@\u0081\u0002\u009aT\u0095\u00f4\u00b1\u00bf\u00d0\u00b0o\u0014_>".length();
        int n8 = 0;
        do {
            byte[] byArray6 = string2.substring(n8, n8 += 8).getBytes("ISO-8859-1");
            int n10 = n6++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n10] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n8 < n7);
        e = lArray;
        f = new Integer[2];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3DD;
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
                throw new RuntimeException("com/zelix/h9", exception);
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
            h9.c[n2] = h9.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = h9.a(n, l);
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
            throw new RuntimeException("com/zelix/h9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x68BF;
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
                throw new RuntimeException("com/zelix/h9", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            h9.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = h9.b(n, l);
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
            throw new RuntimeException("com/zelix/h9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(h9.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(h9.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
