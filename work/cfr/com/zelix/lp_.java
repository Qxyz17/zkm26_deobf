/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._e;
import com.zelix.fx;
import com.zelix.la3;
import com.zelix.lma;
import com.zelix.lpm;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.un;
import com.zelix.vg;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lp_
extends lpm {
    private static final long a;
    private static final String[] e;
    private static final String[] k;
    private static final Map n;
    private static final long[] o;
    private static final Integer[] p;
    private static final Map q;

    public lp_(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x45865A86F4D1L;
        super(n10, l11);
    }

    @Override
    public String N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return lp_.b("w", (int)28625, (long)(0x1523B2CE48E6A307L ^ l10));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String L(Object[] var0) {
        block23: {
            block17: {
                var1_1 = (Long)var0[0];
                var3_2 = (List)var0[1];
                var4_3 = (Integer)var0[2];
                var5_4 = (var1_1 = lp_.a ^ var1_1) ^ 79091700987445L;
                var8_5 = var3_2.size();
                var7_6 = m44.a("o", (long)-8108297935640830911L, (long)var1_1);
                if (var8_5 <= 0) break block23;
                v0 = new Object[5];
                v0[4] = (int)lp_.c("m", (int)19417, (long)(3551936939363298516L ^ var1_1));
                v0[3] = var5_4;
                v0[2] = var4_3;
                v0[1] = (int)lp_.c("m", (int)5183, (long)(128102796795065137L ^ var1_1));
                v0[0] = "";
                var9_7 = m44.a("o", (Object)v0, (long)-7680084124269235038L, (long)var1_1);
                var10_8 = new StringBuffer((int)lp_.c("m", (int)17179, (long)(7603316366132995092L ^ var1_1)));
                v1 = new Object[5];
                v1[4] = (int)lp_.c("m", (int)19686, (long)(321966071904857071L ^ var1_1));
                v1[3] = var5_4;
                v1[2] = var4_3;
                v1[1] = (int)lp_.c("m", (int)28899, (long)(5274211264693458927L ^ var1_1));
                v1[0] = lp_.b("w", (int)29548, (long)(1525612077283232688L ^ var1_1));
                var10_8.append(_e.n + (String)m44.a("o", (Object)v1, (long)-7680084124269235038L, (long)var1_1));
                var11_9 = 0;
                block10: while (var11_9 < var8_5) {
                    v2 = var3_2.get(var11_9);
                    do {
                        block22: {
                            block20: {
                                block18: {
                                    block19: {
                                        v3 = (String)v2;
                                        if (var7_6 != false) break block17;
                                        var12_10 = v3;
                                        try {
                                            try {
                                                v4 /* !! */  = var11_9;
                                                v5 /* !! */  = var7_6;
                                                if (var1_1 >= 0L) {
                                                    if (v5 /* !! */  != false) break block18;
                                                    if (v4 /* !! */  <= 0) break block19;
                                                }
                                                ** GOTO lbl65
                                            }
                                            catch (n9 v6) {
                                                throw m44.a("o", (Object)v6, (long)-8519762593834607881L, (long)var1_1);
                                            }
                                            var10_8.append((String)var9_7);
                                        }
                                        catch (n9 v7) {
                                            throw m44.a("o", (Object)v7, (long)-8519762593834607881L, (long)var1_1);
                                        }
                                    }
                                    try {
                                        if (var1_1 > 0L) {
                                            v8 = var10_8.append(var12_10);
                                            if (var7_6 != false) break block20;
                                        }
                                        v4 /* !! */  = var11_9;
                                    }
                                    catch (n9 v9) {
                                        throw m44.a("o", (Object)v9, (long)-8519762593834607881L, (long)var1_1);
                                    }
                                }
                                try {
                                    block21: {
                                        try {
                                            block24: {
                                                if (var1_1 <= 0L) break block24;
                                                v5 /* !! */  = (CallSite)(var8_5 - 1);
lbl65:
                                                // 2 sources

                                                if (v4 /* !! */  >= v5 /* !! */ ) break block21;
                                                var10_8.append((String)lp_.b("w", (int)10664, (long)(506505119737319794L ^ var1_1)) + _e.n);
                                                v4 /* !! */  = (int)var7_6;
                                            }
                                            if (var1_1 <= 0L) break block22;
                                            if (v4 /* !! */  == 0) break block20;
                                        }
                                        catch (n9 v10) {
                                            throw m44.a("o", (Object)v10, (long)-8519762593834607881L, (long)var1_1);
                                        }
                                    }
                                    v8 = var10_8.append(";" + _e.n);
                                }
                                catch (n9 v11) {
                                    throw m44.a("o", (Object)v11, (long)-8519762593834607881L, (long)var1_1);
                                }
                            }
                            ++var11_9;
                            v4 /* !! */  = (int)var7_6;
                        }
                        if (v4 /* !! */  == 0) continue block10;
                        v2 = var10_8;
                    } while (var1_1 <= 0L);
                }
                v3 = v2.toString();
            }
            return v3;
        }
        return null;
    }

    @Override
    protected void l(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10;
        long l12 = l11 ^ 0x6DF7BA9051C2L;
        long l13 = l11 ^ 0x550B0FC6572DL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        CallSite callSite = m44.a("q", (Object)lqu2, (Object)objectArray2, (long)3638594277050117288L, (long)l10);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l13;
        String string = (String)((Object)m44.a("n", (Object)objectArray3, (long)3433008837598041604L, (long)l10)) + (String)((Object)lp_.b("w", (int)511, (long)(0x3FA2853CD2880206L ^ l10)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l10), (Object)string, (long)3896853000951639041L, (long)l10);
    }

    public static lpm u(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        lqu lqu2 = (lqu)objectArray[2];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x1E806D24D927L;
        long l13 = l11 ^ 0x281CD1FBE17AL;
        long l14 = l11 ^ 0x1E0AE756961AL;
        long l15 = l11 ^ 0x3F669721E888L;
        BufferedReader bufferedReader = new BufferedReader(new StringReader(string));
        try {
            fx fx2 = new fx(bufferedReader, l12);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l15;
            CallSite callSite = m44.a("u", (Object)fx2, (Object)objectArray2, (long)3540864510639510723L, (long)l10);
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = l14;
            objectArray3[1] = lqu2;
            objectArray3[0] = null;
            m44.a("u", (Object)callSite, (Object)objectArray3, (long)3547806761097763517L, (long)l10);
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l13;
            CallSite callSite2 = m44.a("u", (Object)((la3)((Object)callSite)), (Object)objectArray4, (long)3372480613244359970L, (long)l10);
            return callSite2;
        }
        catch (lma lma2) {
            throw new un((String)((Object)m44.a("u", (Object)lma2, (long)3545204896232456445L, (long)l10)));
        }
        catch (vg vg2) {
            throw new un((String)((Object)m44.a("u", (Object)vg2, (long)3015327797097500983L, (long)l10)));
        }
    }

    @Override
    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        int n11 = (Integer)objectArray[3];
        int n12 = (Integer)objectArray[4];
        long l11 = l10;
        long l12 = l11 ^ 0x3E0224440141L;
        long l13 = l11 ^ 0x22F459EBFD72L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this;
        objectArray2[0] = l13;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-6350837393386492020L, (long)l10);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lp_.b("w", (int)15476, (long)(0x3EF07F66A745B6EFL ^ l10));
        objectArray3[4] = n12;
        objectArray3[3] = n11;
        objectArray3[2] = l12;
        objectArray3[1] = n10;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)this, (Object)objectArray3, (long)-4778337559753001233L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        lp_.a = prr.a(-1579673324590797083L, -2817586720919423486L, MethodHandles.lookup().lookupClass()).a(27187748728731L);
                        lp_.n = new HashMap<K, V>(13);
                        var11 = lp_.a ^ 76066730227986L;
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
                        var20_3 = new String[5];
                        var18_4 = 0;
                        var17_5 = "\u00edC\u000e\u00971\u00dc\t\u008e\u00ca)\u00b9\u0013\u009f\u00ddU\u0001\u0007|\u00d6;\u00f8\u0099\u0098\u00d0<0\u00b4K\u0096\u00cb\u0012\u00b7\u0099\u009c7Q\u00f9\u009e\u0014\u00bb \u00b4-\u00b8\u00d7\u00ec\u0092\u00f4\u00d2p\u00e4\u0094f_\u00cf\u008e\u00d1@c\u0080b\u00c4\u001cF\u00ddu\u0001\u00c6\u00edO\u00ce\u00aaX\u0010\t\u00b9w,\u0000\u008c\u0087\u00d3\u00ec\u0097P_q\u00c8\u0094\u000b";
                        var19_6 = "\u00edC\u000e\u00971\u00dc\t\u008e\u00ca)\u00b9\u0013\u009f\u00ddU\u0001\u0007|\u00d6;\u00f8\u0099\u0098\u00d0<0\u00b4K\u0096\u00cb\u0012\u00b7\u0099\u009c7Q\u00f9\u009e\u0014\u00bb \u00b4-\u00b8\u00d7\u00ec\u0092\u00f4\u00d2p\u00e4\u0094f_\u00cf\u008e\u00d1@c\u0080b\u00c4\u001cF\u00ddu\u0001\u00c6\u00edO\u00ce\u00aaX\u0010\t\u00b9w,\u0000\u008c\u0087\u00d3\u00ec\u0097P_q\u00c8\u0094\u000b".length();
                        var16_7 = 40;
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
                            var20_3[var18_4++] = lp_.c(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u0015B\u00f9b\u00d2\u00dd{\u00d9q{\u00f7\u0097:\u0099\u0096\u00f0\u0010\u00aa+\u00c3\u00e9\u00e4n\u00f5T\u00b4\u00ac\u00aa\u00e0m\u008c\u00edw";
                            var19_6 = "\u0015B\u00f9b\u00d2\u00dd{\u00d9q{\u00f7\u0097:\u0099\u0096\u00f0\u0010\u00aa+\u00c3\u00e9\u00e4n\u00f5T\u00b4\u00ac\u00aa\u00e0m\u008c\u00edw".length();
                            var16_7 = 16;
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
                            var20_3[var18_4++] = lp_.c(var21_9).intern();
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
                lp_.e = var20_3;
                lp_.k = new String[5];
                lp_.q = new HashMap<K, V>(13);
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
                var4_14 = "PU\u008a|\u00cb\u00c13\u00a6\u00ce\u00bb\u00a4\u00ebV\u00aa\u00f4gQ\u00f5\u00e5y\u00ff\u00ceo\u00c1";
                var5_15 = "PU\u008a|\u00cb\u00c13\u00a6\u00ce\u00bb\u00a4\u00ebV\u00aa\u00f4gQ\u00f5\u00e5y\u00ff\u00ceo\u00c1".length();
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
                    var4_14 = "\u00b3\u0095p\u0001\"\u00e3\u00d6\u00b3\u00ba\u0087\u00d7o\u00d4:S\u00e4";
                    var5_15 = "\u00b3\u0095p\u0001\"\u00e3\u00d6\u00b3\u00ba\u0087\u00d7o\u00d4:S\u00e4".length();
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
        lp_.o = var6_12;
        lp_.p = new Integer[5];
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x2378;
        if (k[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])n.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    n.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lp_", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e[n11].getBytes("ISO-8859-1");
            lp_.k[n11] = lp_.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lp_.b(n10, l10);
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
            throw new RuntimeException("com/zelix/lp_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3CAD;
        if (p[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = o[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])q.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    q.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lp_", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lp_.p[n11] = n12;
        }
        return p[n11];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = lp_.c(n10, l10);
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
            throw new RuntimeException("com/zelix/lp_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lp_.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(lp_.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

