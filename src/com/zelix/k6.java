/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._z;
import com.zelix.h1;
import com.zelix.k_;
import com.zelix.ko;
import com.zelix.l6q;
import com.zelix.lb6;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
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

public class k6
extends ko {
    private static final long c;
    private static final String[] d;
    private static final String[] g;
    private static final Map h;

    k6(char c, _4 _42, x8 x82, long l, int n) {
        long l2 = ((long)c << 48 | l << 16 >>> 16) ^ k6.c;
        long l3 = l2 ^ 0x76CB9628B6E7L;
        super(l3, _42, x82, n);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    k6(_4 var1_1, long var2_2, int var4_3, String var5_4, h1 var6_5, l6q var7_6, l6q var8_7, PrintWriter var9_8, l6q var10_9) {
        block21: {
            block27: {
                block26: {
                    block24: {
                        v0 = var2_2 = k6.c ^ var2_2;
                        var11_10 = v0 ^ 65120884989005L;
                        var13_11 = v0 ^ 11043163486678L;
                        var15_12 = v0 ^ 86449948043638L;
                        var17_13 = v0 ^ 118782380057746L;
                        var19_14 = v0 ^ 5293989257754L;
                        v1 = m44.a("k", (long)-4500588340800343870L, (long)var2_2);
                        super(var1_1, var11_10, var4_3, var5_4, var6_5, var7_6);
                        var21_15 = v1;
                        var22_16 = new byte[this.W];
                        var6_5.read(var22_16);
                        v2 = new Object[3];
                        v2[2] = var15_12;
                        v2[1] = false;
                        v2[0] = var22_16;
                        var23_17 = m44.a("k", (Object)v2, (long)-2663395924107450431L, (long)var2_2);
                        try {
                            v3 /* !! */  = this.W;
                            if (var21_15 == false) break block21;
                            if (v3 /* !! */  >= 2) {
                            }
                            ** GOTO lbl97
                        }
                        catch (n9 v4) {
                            throw m44.a("k", (Object)v4, (long)-2385852903034093255L, (long)var2_2);
                        }
                        this.N = var23_17.readUnsignedShort();
                        v5 = new Object[1];
                        v5[0] = var13_11;
                        var24_18 = m44.a("k", (Object)v5, (long)-2471755014886606512L, (long)var2_2);
                        v6 = new Object[1];
                        v6[0] = var13_11;
                        var25_19 = m44.a("k", (Object)v6, (long)-2471755014886606512L, (long)var2_2);
                        var26_20 = new lb6(-1);
                        this.I = new _z[this.N];
                        var27_21 = 0;
                        while (var27_21 < this.N) {
                            block22: {
                                block23: {
                                    block25: {
                                        try {
                                            try {
                                                try {
                                                    v7 = new Object[9];
                                                    v7[8] = var25_19;
                                                    v7[7] = var19_14;
                                                    v7[6] = var24_18;
                                                    v7[5] = var26_20;
                                                    v7[4] = var9_8;
                                                    v7[3] = var8_7;
                                                    v7[2] = var10_9;
                                                    v7[1] = var23_17;
                                                    v7[0] = this;
                                                    this.I[var27_21] = m44.a("k", (Object)v7, (long)-4107362561896243592L, (long)var2_2);
                                                    v8 = var21_15;
                                                    if (var2_2 < 0L) break block22;
                                                    if (v8 == false) break block23;
                                                    v9 = m44.a("t", (Object)this.I[var27_21], (Object)new Object[0], (long)-2646854290395036361L, (long)var2_2);
                                                    if (var21_15 == false) break block24;
                                                }
                                                catch (n9 v10) {
                                                    throw m44.a("k", (Object)v10, (long)-2385852903034093255L, (long)var2_2);
                                                }
                                                if (v9 != false) break block25;
                                            }
                                            catch (n9 v11) {
                                                throw m44.a("k", (Object)v11, (long)-2385852903034093255L, (long)var2_2);
                                            }
                                            m44.a("w", (Object)this, (boolean)false, (long)-4401721840421534458L, (long)var2_2);
                                        }
                                        catch (n9 v12) {
                                            throw m44.a("k", (Object)v12, (long)-2385852903034093255L, (long)var2_2);
                                        }
                                    }
                                    ++var27_21;
                                }
                                v8 = var21_15;
                            }
                            if (v8 != false) continue;
                        }
                        try {
                            v13 = this;
                            v14 /* !! */  = (int)var21_15;
                            if (var2_2 > 0L) {
                                if (v14 /* !! */  == 0) break block26;
                                v9 = m44.a("u", (Object)v13, (long)-4401721840421534458L, (long)var2_2);
                            }
                            ** GOTO lbl101
                        }
                        catch (n9 v15) {
                            throw m44.a("k", (Object)v15, (long)-2385852903034093255L, (long)var2_2);
                        }
                    }
                    if (v9 != false) break block27;
                    v16 = this;
                }
                m44.a("w", (Object)v16, (byte[])var22_16, (long)-2447469937259496949L, (long)var2_2);
            }
            try {
                v3 /* !! */  = (int)var21_15;
                if (var2_2 <= 0L || v3 /* !! */  != 0) break block21;
lbl97:
                // 2 sources

                m44.a("w", (Object)this, (boolean)false, (long)-4401721840421534458L, (long)var2_2);
                var9_8.println((String)k6.b("j", (int)13934, (long)(7884690848443880672L ^ var2_2)) + this.f(var17_13) + (String)k6.b("j", (int)15219, (long)(2071529518103124476L ^ var2_2)) + (String)k6.b("j", (int)12816, (long)(3639230301688254620L ^ var2_2)) + (String)k6.b("j", (int)29715, (long)(1596815990412187294L ^ var2_2)));
                v13 = this;
                v14 /* !! */  = this.W;
lbl101:
                // 2 sources

                m44.a("w", (Object)v13, (byte[])new byte[v14 /* !! */ ], (long)-2447469937259496949L, (long)var2_2);
                v3 /* !! */  = var23_17.read((byte[])m44.a("u", (Object)this, (long)-2447469937259496949L, (long)var2_2));
            }
            catch (n9 v17) {
                throw m44.a("k", (Object)v17, (long)-2385852903034093255L, (long)var2_2);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    protected void T(Object[] var1_1) {
        var4_2 = (DataOutputStream)var1_1[0];
        var2_3 = (Long)var1_1[1];
        var5_4 = (Map)var1_1[2];
        var6_5 = var2_3 ^ 3649405080481L;
        v0 = m44.a("i", (long)3263002734463507456L, (long)var2_3);
        var4_2.writeShort(this.N);
        var8_6 = v0;
        var9_7 = new lb6(-1);
        var10_8 = 0;
        while (var10_8 < this.N) {
            ((_z)this.I[var10_8]).o(var6_5, var4_2, var9_7, var5_4);
            ++var10_8;
lbl15:
            // 2 sources

            ** while (var8_6 == false)
lbl16:
            // 1 sources

        }
lbl17:
        // 2 sources

        if (var2_3 < 0L) ** GOTO lbl15
    }

    String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = c ^ l) ^ 0x4F2F6A90A6DFL;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 48);
        int n3 = (int)(l2 << 48 >>> 48);
        return ((k_)this.H()).l(n, (char)n2, (short)n3);
    }

    /*
     * Unable to fully structure code
     */
    protected void n(Object[] var1_1) {
        var2_2 = (DataOutputStream)var1_1[0];
        var3_3 = (Long)var1_1[1];
        var5_4 = var3_3 ^ 11933796996741L;
        var2_2.writeShort(this.N);
        var8_5 = new lb6(-1);
        var7_6 = m44.a("l", (long)7605927609817372869L, (long)var3_3);
        var9_7 = 0;
        while (var9_7 < this.N) {
            v0 = new Object[3];
            v0[2] = var8_5;
            v0[1] = var2_2;
            v0[0] = var5_4;
            m44.a("s", (Object)((_z)this.I[var9_7]), (Object)v0, (long)8072619063407709603L, (long)var3_3);
            ++var9_7;
lbl18:
            // 2 sources

            ** while (var7_6 == false)
lbl19:
            // 1 sources

        }
lbl20:
        // 2 sources

        if (var3_3 <= 0L) ** GOTO lbl18
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                k6.c = prr.a((long)3440236736520918922L, (long)1132927746064110079L, MethodHandles.lookup().lookupClass()).a(47881587358016L);
                k6.h = new HashMap<K, V>(13);
                var0 = k6.c ^ 79409109293796L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "\u00a2\u00f1\u00ceW96w\u0016N\u0096\u0091\u00d4\u00d4\u00e1*;\u0006\u0095\u00d7N#\u0013N4\u00ab\u00f6\u0083 \u00f9\u00e2C\u0099\u00f6Q\u00a0)o\u0099#\u00ae\u00da\u00f4\u00e4\u0002\u00a3>w}\u000b\u00acp\u00c6I\b\u00ab\u00b6\u0010\u008dI\u0016\u00e1\u009f\u00ec0tIz\u00be\u00ef\u00a0\u008f\u001c\u00e2";
                var8_6 = "\u00a2\u00f1\u00ceW96w\u0016N\u0096\u0091\u00d4\u00d4\u00e1*;\u0006\u0095\u00d7N#\u0013N4\u00ab\u00f6\u0083 \u00f9\u00e2C\u0099\u00f6Q\u00a0)o\u0099#\u00ae\u00da\u00f4\u00e4\u0002\u00a3>w}\u000b\u00acp\u00c6I\b\u00ab\u00b6\u0010\u008dI\u0016\u00e1\u009f\u00ec0tIz\u00be\u00ef\u00a0\u008f\u001c\u00e2".length();
                var5_7 = 56;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = k6.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "?,\u000f \u0094\u0090V\u00dd\u0001\u0018;@A\u0003J=\u0010\u00c1w\u00bfx\u0017\u00f9r\u00ff \u00c9\u00e3D\u00c4x[\u00cc";
                    var8_6 = "?,\u000f \u0094\u0090V\u00dd\u0001\u0018;@A\u0003J=\u0010\u00c1w\u00bfx\u0017\u00f9r\u00ff \u00c9\u00e3D\u00c4x[\u00cc".length();
                    var5_7 = 16;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = k6.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        k6.d = var9_3;
        k6.g = new String[4];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String c(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3018;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/k6", exception);
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
            k6.g[n2] = k6.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = k6.b(n, l);
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
            throw new RuntimeException("com/zelix/k6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(k6.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
