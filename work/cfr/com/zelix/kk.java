/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._n;
import com.zelix.h1;
import com.zelix.ko;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.x8;
import java.io.ByteArrayOutputStream;
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

public class kk
extends ko {
    private static final long c;
    private static final String[] d;
    private static final String[] g;
    private static final Map h;

    kk(long l10, _4 _42, x8 x82, int n10) {
        long l11 = (l10 = c ^ l10) ^ 0xC38F2B17642L;
        super(l11, _42, x82, n10);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void T(Object[] var1_1) {
        var3_2 = (DataOutputStream)var1_1[0];
        var4_3 = (Long)var1_1[1];
        var2_4 = (Map)var1_1[2];
        var6_5 = var4_3 ^ 109934980621404L;
        v0 = m44.a("i", (long)3823824288663429623L, (long)var4_3);
        var3_2.writeShort(this.N);
        var8_6 = v0;
        var9_7 = 0;
        while (var9_7 < this.N) {
            v1 = new Object[3];
            v1[2] = var6_5;
            v1[1] = var2_4;
            v1[0] = var3_2;
            m44.a("v", (Object)((_n)this.I[var9_7]), (Object)v1, (long)3856799978745458490L, (long)var4_3);
            ++var9_7;
lbl19:
            // 2 sources

            ** while (var8_6 != false)
lbl20:
            // 1 sources

        }
lbl21:
        // 2 sources

        if (var4_3 < 0L) ** GOTO lbl19
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    kk(_4 var1_1, int var2_2, String var3_3, h1 var4_4, l6q var5_5, l6q var6_6, PrintWriter var7_7, l6q var8_8, long var9_9) {
        block14: {
            block17: {
                v0 = var9_9 = kk.c ^ var9_9;
                var11_10 = v0 ^ 13766199641020L;
                var13_11 = v0 ^ 106541434101815L;
                var15_12 = v0 ^ 48224472905718L;
                var17_13 = v0 ^ 100842608180067L;
                v1 = m44.a("j", (long)-2415190536482476237L, (long)var9_9);
                super(var1_1, var11_10, var2_2, var3_3, var4_4, var5_5);
                var19_14 = v1;
                try {
                    v2 /* !! */  = this.W;
                    if (var19_14 == false) break block14;
                    if (v2 /* !! */  >= 2) {
                    }
                    ** GOTO lbl67
                }
                catch (n9 v3) {
                    throw m44.a("j", (Object)v3, (long)-2581478282184599416L, (long)var9_9);
                }
                this.N = var4_4.readUnsignedShort();
                this.I = new _n[this.N];
                var20_15 = 0;
                while (var20_15 < this.N) {
                    block15: {
                        block16: {
                            block18: {
                                try {
                                    try {
                                        try {
                                            v4 = this;
lbl26:
                                            // 2 sources

                                            while (true) {
                                                v4.I[var20_15] = new _n(this, var4_4, var8_8, var6_6, var13_11, var7_7);
                                                v5 = var19_14;
                                                if (var9_9 < 0L) break block15;
                                                if (v5 == false) break block16;
                                                v6 = m44.a("u", (Object)this.I[var20_15], (Object)new Object[0], (long)-4272425430821233978L, (long)var9_9);
                                                if (var19_14 == false) break block17;
                                                break;
                                            }
                                        }
                                        catch (n9 v7) {
                                            throw m44.a("j", (Object)v7, (long)-2581478282184599416L, (long)var9_9);
                                        }
                                        if (v6 != false) break block18;
                                    }
                                    catch (n9 v8) {
                                        throw m44.a("j", (Object)v8, (long)-2581478282184599416L, (long)var9_9);
                                    }
                                    m44.a("v", (Object)this, (boolean)false, (long)-2515041650680554761L, (long)var9_9);
                                }
                                catch (n9 v9) {
                                    throw m44.a("j", (Object)v9, (long)-2581478282184599416L, (long)var9_9);
                                }
                            }
                            ++var20_15;
                        }
                        v5 = var19_14;
                    }
                    if (v5 != false) continue;
                }
                v4 = this;
                ** while (var9_9 <= 0L)
lbl52:
                // 1 sources

                v6 = m44.a("t", (Object)v4, (long)-2515041650680554761L, (long)var9_9);
            }
            if (v6 != false) break block14;
            var20_16 = new ByteArrayOutputStream(this.W);
            var21_17 = new DataOutputStream(var20_16);
            try {
                v10 = new Object[2];
                v10[1] = var15_12;
                v10[0] = var21_17;
                m44.a("u", (Object)this, (Object)v10, (long)-4319535694780737405L, (long)var9_9);
                m44.a("v", (Object)this, (byte[])m44.a("u", (Object)var20_16, (long)-2874277720559772782L, (long)var9_9), (long)-4469294107638618630L, (long)var9_9);
                this.I = null;
                v2 /* !! */  = (int)var19_14;
                if (var9_9 <= 0L || v2 /* !! */  != 0) break block14;
lbl67:
                // 2 sources

                m44.a("v", (Object)this, (boolean)false, (long)-2515041650680554761L, (long)var9_9);
                var7_7.println((String)kk.b("n", (int)3211, (long)(1525798099187019071L ^ var9_9)) + this.f(var17_13) + (String)kk.b("n", (int)24701, (long)(1110443457638678984L ^ var9_9)) + (String)kk.b("n", (int)5351, (long)(7485094550815290704L ^ var9_9)) + (String)kk.b("n", (int)29852, (long)(973003175911773482L ^ var9_9)));
                m44.a("v", (Object)this, (byte[])new byte[this.W], (long)-4469294107638618630L, (long)var9_9);
                v2 /* !! */  = var4_4.read((byte[])m44.a("t", (Object)this, (long)-4469294107638618630L, (long)var9_9));
            }
            catch (n9 v11) {
                throw m44.a("j", (Object)v11, (long)-2581478282184599416L, (long)var9_9);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void n(Object[] var1_1) {
        var4_2 = (DataOutputStream)var1_1[0];
        var2_3 = (Long)var1_1[1];
        var5_4 = var2_3 ^ 66562268438603L;
        v0 = m44.a("l", (long)8202706938922280242L, (long)var2_3);
        var4_2.writeShort(this.N);
        var8_5 = 0;
        var7_6 = v0;
        while (var8_5 < this.N) {
            v1 = new Object[2];
            v1[1] = var5_4;
            v1[0] = var4_2;
            m44.a("s", (Object)((_n)this.I[var8_5]), (Object)v1, (long)7701155952551973288L, (long)var2_3);
            ++var8_5;
lbl17:
            // 2 sources

            ** while (var7_6 != false)
lbl18:
            // 1 sources

        }
lbl19:
        // 2 sources

        if (var2_3 <= 0L) ** GOTO lbl17
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                kk.c = prr.a(4597097264557579447L, -6821324939338159114L, MethodHandles.lookup().lookupClass()).a(250082823614540L);
                kk.h = new HashMap<K, V>(13);
                var0 = kk.c ^ 100056411350954L;
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
                var6_5 = "\u0097\u00f0@\u00f4\u0086X\u0084H0\u0005\u00cd\u00b2\u0090\u00f8\u00f6q\u0010\u00f8M$\u00e99\u009f\u00ba#\u00e4\u00aa\u00bd\no\u00ac\u00f6f";
                var8_6 = "\u0097\u00f0@\u00f4\u0086X\u0084H0\u0005\u00cd\u00b2\u0090\u00f8\u00f6q\u0010\u00f8M$\u00e99\u009f\u00ba#\u00e4\u00aa\u00bd\no\u00ac\u00f6f".length();
                var5_7 = 16;
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
                    var9_3[var7_4++] = kk.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00bd\u00f0\u00cc\u00b2B\u00d7\u0017]\u00ddZD\u00bf\u00fe\u00d7\u0010g\u00c7J\u0000\u00e5w;\u0010\u0089\u0016\u0088\u0006\u00b0\u00bf\u00d1\u0019\u0092?\u00db\u000f\u001d\u00998\u00dd\u00156\u0006\u00cc\u00bbFc\n&\u00c51\u00d0R\u00c58\u008f\u00ce\u0010.\u00a6\u00c2\u0088m\u008ay\u0091\u0001\u00d1j\u0088\u0098|g\u009b";
                    var8_6 = "\u00bd\u00f0\u00cc\u00b2B\u00d7\u0017]\u00ddZD\u00bf\u00fe\u00d7\u0010g\u00c7J\u0000\u00e5w;\u0010\u0089\u0016\u0088\u0006\u00b0\u00bf\u00d1\u0019\u0092?\u00db\u000f\u001d\u00998\u00dd\u00156\u0006\u00cc\u00bbFc\n&\u00c51\u00d0R\u00c58\u008f\u00ce\u0010.\u00a6\u00c2\u0088m\u008ay\u0091\u0001\u00d1j\u0088\u0098|g\u009b".length();
                    var5_7 = 56;
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
                    var9_3[var7_4++] = kk.c(var10_9).intern();
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
        kk.d = var9_3;
        kk.g = new String[4];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String c(byte[] byArray) {
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x6CD0;
        if (g[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/kk", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n11].getBytes("ISO-8859-1");
            kk.g[n11] = kk.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = kk.b(n10, l10);
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
            throw new RuntimeException("com/zelix/kk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(kk.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

