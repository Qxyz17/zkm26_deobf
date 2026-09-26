/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class y_ {
    private Set s;
    private int U;
    private int N;
    private long Y;
    private Set n;
    private long K;
    private int P;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final long[] e;
    private static final Long[] f;
    private static final Map g;

    public void W(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        y_ y_2 = this;
        m44.a("w", (Object)y_2, (int)(m44.a("u", (Object)y_2, (long)-2278051480945143248L, (long)l) + true), (long)-2278051480945143248L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean l(Object[] var1_1) {
        block24: {
            block23: {
                block25: {
                    block28: {
                        block27: {
                            block26: {
                                block22: {
                                    var2_2 = (Long)var1_1[0];
                                    var2_2 = y_.a ^ var2_2;
                                    var4_3 = m44.a("o", (long)-8350159136657970094L, (long)var2_2);
                                    try {
                                        v0 = m44.a("k", (long)-7837893167926258997L, (long)var2_2);
                                        if (var4_3 != null) break block22;
                                        if (v0 != false) break block23;
                                    }
                                    catch (n9 v1) {
                                        throw m44.a("o", (Object)v1, (long)-8224789172017864763L, (long)var2_2);
                                    }
                                    v0 = m44.a("k", (long)-7777479751463638833L, (long)var2_2);
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (var4_3 != null) break block24;
                                                    if (v0 != false) break block25;
                                                }
                                                catch (n9 v2) {
                                                    throw m44.a("o", (Object)v2, (long)-8224789172017864763L, (long)var2_2);
                                                }
                                                v0 = m44.a("q", (Object)this, (long)-8305838623377291411L, (long)var2_2);
                                                v3 /* !! */  = 2;
                                                if (var2_2 <= 0L || var4_3 != null) break block26;
                                            }
                                            catch (n9 v4) {
                                                throw m44.a("o", (Object)v4, (long)-8224789172017864763L, (long)var2_2);
                                            }
                                            if (v0 < v3 /* !! */ ) break block23;
                                        }
                                        catch (n9 v5) {
                                            throw m44.a("o", (Object)v5, (long)-8224789172017864763L, (long)var2_2);
                                        }
                                        v0 = m44.a("q", (Object)this, (long)-7553292581451257124L, (long)var2_2);
                                        v6 = var4_3;
                                        if (var2_2 > 0L) {
                                            if (v6 != null) break block27;
                                        }
                                        ** GOTO lbl58
                                    }
                                    catch (n9 v7) {
                                        throw m44.a("o", (Object)v7, (long)-8224789172017864763L, (long)var2_2);
                                    }
                                    v3 /* !! */  = (int)y_.a("b", (int)29894, (long)(6053710863359377498L ^ var2_2));
                                }
                                catch (n9 v8) {
                                    throw m44.a("o", (Object)v8, (long)-8224789172017864763L, (long)var2_2);
                                }
                            }
                            try {
                                if (v0 < v3 /* !! */ ) break block23;
                                cfr_temp_0 = m44.a("q", (Object)this, (long)-8234557617310924691L, (long)var2_2) - y_.b("d", (int)26195, (long)(3335011936148224052L ^ var2_2));
                                v0 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                            }
                            catch (n9 v9) {
                                throw m44.a("o", (Object)v9, (long)-8224789172017864763L, (long)var2_2);
                            }
                        }
                        try {
                            try {
                                v6 = var4_3;
lbl58:
                                // 2 sources

                                if (var2_2 > 0L) {
                                    if (v6 != null) break block28;
                                    if (v0 < 0) break block23;
                                }
                                ** GOTO lbl73
                            }
                            catch (n9 v10) {
                                throw m44.a("o", (Object)v10, (long)-8224789172017864763L, (long)var2_2);
                            }
                            cfr_temp_1 = m44.a("q", (Object)this, (long)-7921943036576465823L, (long)var2_2) - y_.b("d", (int)21544, (long)(4008091564828346957L ^ var2_2));
                            v0 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                        }
                        catch (n9 v11) {
                            throw m44.a("o", (Object)v11, (long)-8224789172017864763L, (long)var2_2);
                        }
                    }
                    try {
                        v6 = var4_3;
lbl73:
                        // 2 sources

                        if (v6 != null) break block24;
                        if (v0 < 0) break block23;
                    }
                    catch (n9 v12) {
                        throw m44.a("o", (Object)v12, (long)-8224789172017864763L, (long)var2_2);
                    }
                }
                v0 = (reference)true;
                break block24;
            }
            v0 = (reference)false;
        }
        var5_4 /* !! */  = v0;
        return (boolean)var5_4 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean Y(Object[] var1_1) {
        block30: {
            block29: {
                block31: {
                    block34: {
                        block33: {
                            block32: {
                                block28: {
                                    var2_2 = (Long)var1_1[0];
                                    var4_3 = (var2_2 = y_.a ^ var2_2) ^ 80518117827004L;
                                    var6_4 = m44.a("j", (long)-5220997129147918393L, (long)var2_2);
                                    try {
                                        try {
                                            v0 = m44.a("n", (long)-5323174905748392872L, (long)var2_2);
                                            if (var6_4 != null) break block28;
                                            if (v0 != false) break block29;
                                        }
                                        catch (n9 v1) {
                                            throw m44.a("j", (Object)v1, (long)-5310129239248575408L, (long)var2_2);
                                        }
                                        v2 = new Object[1];
                                        v2[0] = var4_3;
                                        v0 = m44.a("u", (Object)this, (Object)v2, (long)-5733573051292633012L, (long)var2_2);
                                    }
                                    catch (n9 v3) {
                                        throw m44.a("j", (Object)v3, (long)-5310129239248575408L, (long)var2_2);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (var6_4 != null) break block30;
                                                            if (v0 != false) break block31;
                                                        }
                                                        catch (n9 v4) {
                                                            throw m44.a("j", (Object)v4, (long)-5310129239248575408L, (long)var2_2);
                                                        }
                                                        v0 = m44.a("n", (long)-6199143735579873646L, (long)var2_2);
                                                        if (var6_4 != null) break block30;
                                                    }
                                                    catch (n9 v5) {
                                                        throw m44.a("j", (Object)v5, (long)-5310129239248575408L, (long)var2_2);
                                                    }
                                                    if (v0 != false) break block31;
                                                }
                                                catch (n9 v6) {
                                                    throw m44.a("j", (Object)v6, (long)-5310129239248575408L, (long)var2_2);
                                                }
                                                v0 = m44.a("t", (Object)this, (long)-5247054741402698504L, (long)var2_2);
                                                v7 /* !! */  = true;
                                                if (var2_2 <= 0L || var6_4 != null) break block32;
                                            }
                                            catch (n9 v8) {
                                                throw m44.a("j", (Object)v8, (long)-5310129239248575408L, (long)var2_2);
                                            }
                                            if (v0 < v7 /* !! */ ) break block29;
                                        }
                                        catch (n9 v9) {
                                            throw m44.a("j", (Object)v9, (long)-5310129239248575408L, (long)var2_2);
                                        }
                                        v0 = m44.a("t", (Object)this, (long)-6000945146801680055L, (long)var2_2);
                                        v10 = var6_4;
                                        if (var2_2 > 0L) {
                                            if (v10 != null) break block33;
                                        }
                                        ** GOTO lbl77
                                    }
                                    catch (n9 v11) {
                                        throw m44.a("j", (Object)v11, (long)-5310129239248575408L, (long)var2_2);
                                    }
                                    v7 /* !! */  = y_.a("b", (int)6857, (long)(4198400277084526017L ^ var2_2));
                                }
                                catch (n9 v12) {
                                    throw m44.a("j", (Object)v12, (long)-5310129239248575408L, (long)var2_2);
                                }
                            }
                            try {
                                if (v0 < v7 /* !! */ ) break block29;
                                cfr_temp_0 = m44.a("t", (Object)this, (long)-5319325939291964424L, (long)var2_2) - y_.b("d", (int)12346, (long)(4815439260727547342L ^ var2_2));
                                v0 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                            }
                            catch (n9 v13) {
                                throw m44.a("j", (Object)v13, (long)-5310129239248575408L, (long)var2_2);
                            }
                        }
                        try {
                            try {
                                v10 = var6_4;
lbl77:
                                // 2 sources

                                if (var2_2 > 0L) {
                                    if (v10 != null) break block34;
                                    if (v0 < 0) break block29;
                                }
                                ** GOTO lbl92
                            }
                            catch (n9 v14) {
                                throw m44.a("j", (Object)v14, (long)-5310129239248575408L, (long)var2_2);
                            }
                            cfr_temp_1 = m44.a("t", (Object)this, (long)-6225498042486503436L, (long)var2_2) - y_.b("d", (int)24578, (long)(6742313561869469169L ^ var2_2));
                            v0 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                        }
                        catch (n9 v15) {
                            throw m44.a("j", (Object)v15, (long)-5310129239248575408L, (long)var2_2);
                        }
                    }
                    try {
                        v10 = var6_4;
lbl92:
                        // 2 sources

                        if (v10 != null) break block30;
                        if (v0 < 0) break block29;
                    }
                    catch (n9 v16) {
                        throw m44.a("j", (Object)v16, (long)-5310129239248575408L, (long)var2_2);
                    }
                }
                v0 = (reference)true;
                break block30;
            }
            v0 = (reference)false;
        }
        var7_5 /* !! */  = v0;
        return (boolean)var7_5 /* !! */ ;
    }

    public void u(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        y_ y_2 = this;
        m44.a("t", (Object)y_2, (int)(m44.a("v", (Object)y_2, (long)-6369659337524962709L, (long)l) + true), (long)-6369659337524962709L, (long)l);
    }

    public void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        l = a ^ l;
        y_ y_2 = this;
        m44.a("t", (Object)y_2, (long)(m44.a("v", (Object)y_2, (long)-5660862983969710306L, (long)l) + (long)n), (long)-5660862983969710306L, (long)l);
    }

    public void x(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        l = a ^ l;
        m44.a("p", (Object)this, (long)4269109632296037142L, (long)l).add(n);
    }

    public y_(long l, int n) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x4182A739C02BL;
        long l4 = l2 ^ 0x456147A5BA94L;
        long l5 = l2 ^ 0x85C735EE051L;
        int n2 = (int)(l5 >>> 32);
        int n3 = (int)(l5 << 32 >>> 48);
        int n4 = (int)(l5 << 48 >>> 48);
        m44.a("w", (Object)this, (int)0, (long)1662117786453846752L, (long)l);
        Object[] objectArray = new Object[1];
        objectArray[0] = l4;
        m44.a("w", (Object)this, (Set)((Object)m44.a("k", (Object)objectArray, (long)1634963395788238643L, (long)l)), (long)1077572636759229069L, (long)l);
        m44.a("w", (Object)this, (int)-1, (long)902950833385178961L, (long)l);
        m44.a("w", (Object)this, (int)0, (long)937563332474290000L, (long)l);
        m44.a("w", (Object)this, (long)0L, (long)1311618412929842269L, (long)l);
        m44.a("w", (Object)this, (long)y_.b("d", (int)5298, (long)(0x1AA43516899D0AEAL ^ l)), (long)974095014751862865L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = cf.x((int)(n * 5), (int)n2, (char)((char)n3), (short)((short)n4));
        m44.a("w", (Object)this, (Set)((Object)m44.a("k", (Object)objectArray2, (long)876047781195094880L, (long)l)), (long)1331934278282838611L, (long)l);
    }

    public void Z(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        m44.a("r", (Object)this, (long)7123409913323417250L, (long)l).add(string);
    }

    public void f(Object[] objectArray) {
        block11: {
            y_ y_2;
            long l;
            block10: {
                CallSite callSite;
                block8: {
                    CallSite callSite2;
                    block9: {
                        l = (Long)objectArray[0];
                        l = a ^ l;
                        callSite2 = m44.a("l", (long)6464081947462941177L, (long)l);
                        try {
                            try {
                                callSite = m44.a("r", (Object)this, (long)5182766698189117380L, (long)l);
                                if (callSite2 != null) break block8;
                                if (callSite == null) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("l", (Object)((Object)n92), (long)6372843176850000494L, (long)l);
                            }
                            m44.a("p", (Object)this, (long)m44.a("r", (Object)this, (long)5182766698189117380L, (long)l).size(), (long)6346618267204703686L, (long)l);
                            m44.a("p", (Object)this, null, (long)5182766698189117380L, (long)l);
                        }
                        catch (n9 n93) {
                            throw m44.a("l", (Object)((Object)n93), (long)6372843176850000494L, (long)l);
                        }
                    }
                    try {
                        y_2 = this;
                        if (callSite2 != null) break block10;
                        callSite = m44.a("r", (Object)y_2, (long)6585203201376081690L, (long)l);
                    }
                    catch (n9 n94) {
                        throw m44.a("l", (Object)((Object)n94), (long)6372843176850000494L, (long)l);
                    }
                }
                try {
                    if (callSite == null) break block11;
                    m44.a("p", (Object)this, (int)m44.a("r", (Object)this, (long)6585203201376081690L, (long)l).size(), (long)6417898913104089798L, (long)l);
                    y_2 = this;
                }
                catch (n9 n95) {
                    throw m44.a("l", (Object)((Object)n95), (long)6372843176850000494L, (long)l);
                }
            }
            m44.a("p", (Object)y_2, null, (long)6585203201376081690L, (long)l);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    block11: {
                        y_.a = prr.a((long)8455976853751250938L, (long)6258946926017813215L, MethodHandles.lookup().lookupClass()).a(155871385348887L);
                        y_.d = new HashMap<K, V>(13);
                        var11 = y_.a ^ 129152499056875L;
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
                        var19_3 = new long[2];
                        var16_4 = 0;
                        var17_5 = "\u00e2%\u00beA\b\u00e8j\u00c9\f\u0083f\u00f6\b\u001f=\u00e4";
                        var18_6 = "\u00e2%\u00beA\b\u00e8j\u00c9\f\u0083f\u00f6\b\u001f=\u00e4".length();
                        var15_7 = 0;
                        while (true) {
                            break block11;
                            break;
                        }
lbl21:
                        // 1 sources

                        while (true) {
                            var19_3[v3] = ((long)var23_10[0] & 255L) << 56 | ((long)var23_10[1] & 255L) << 48 | ((long)var23_10[2] & 255L) << 40 | ((long)var23_10[3] & 255L) << 32 | ((long)var23_10[4] & 255L) << 24 | ((long)var23_10[5] & 255L) << 16 | ((long)var23_10[6] & 255L) << 8 | (long)var23_10[7] & 255L;
                            if (var15_7 < var18_6) ** continue;
                            break block12;
                            break;
                        }
                    }
                    var20_8 = var17_5.substring(var15_7, var15_7 += 8).getBytes("ISO-8859-1");
                    v3 = var16_4++;
                    var21_9 = ((long)var20_8[0] & 255L) << 56 | ((long)var20_8[1] & 255L) << 48 | ((long)var20_8[2] & 255L) << 40 | ((long)var20_8[3] & 255L) << 32 | ((long)var20_8[4] & 255L) << 24 | ((long)var20_8[5] & 255L) << 16 | ((long)var20_8[6] & 255L) << 8 | (long)var20_8[7] & 255L;
                    var23_10 = var13_1.doFinal(new byte[]{(byte)(var21_9 >>> 56), (byte)(var21_9 >>> 48), (byte)(var21_9 >>> 40), (byte)(var21_9 >>> 32), (byte)(var21_9 >>> 24), (byte)(var21_9 >>> 16), (byte)(var21_9 >>> 8), (byte)var21_9});
                    ** while (true)
                }
                y_.b = var19_3;
                y_.c = new Integer[2];
                y_.g = new HashMap<K, V>(13);
                var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var11 >>> 56);
                for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                    v6 = v6;
                    v6[var1_12] = (byte)(var11 << var1_12 * 8 >>> 56);
                }
                var0_11.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_13 = new long[5];
                var3_14 = 0;
                var4_15 = "\u00felmJ\u00cd@\u0011\u0015\u00ca\u00e4\u0089_\b8]\u008a\u00b2\"\u00c8<C\u0097\u000b\u007f";
                var5_16 = "\u00felmJ\u00cd@\u0011\u0015\u00ca\u00e4\u0089_\b8]\u008a\u00b2\"\u00c8<C\u0097\u000b\u007f".length();
                var2_17 = 0;
                while (true) {
                    var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                    v7 = var6_13;
                    v8 = var3_14++;
                    v9 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                    v10 = -1;
                    break block13;
                    break;
                }
lbl60:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_17 < var5_16) ** continue;
                    var4_15 = "\u00c9\u00e1\u0004\u009e2\u00f7\u0006w\u00d1\u00031\u00f6\u00b4\u00a8\u0090\u00fb";
                    var5_16 = "\u00c9\u00e1\u0004\u009e2\u00f7\u0006w\u00d1\u00031\u00f6\u00b4\u00a8\u0090\u00fb".length();
                    var2_17 = 0;
                    while (true) {
                        var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                        v7 = var6_13;
                        v8 = var3_14++;
                        v9 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                        v10 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl73:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_17 < var5_16) ** continue;
                    break block14;
                    break;
                }
            }
            var8_19 = v9;
            var10_20 = var0_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            v11 = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl86:
                // 1 sources

                ** continue;
            }
        }
        y_.e = var6_13;
        y_.f = new Long[5];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x738C;
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
                throw new RuntimeException("com/zelix/y_", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            y_.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = y_.a(n, l);
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
            throw new RuntimeException("com/zelix/y_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1975;
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
                throw new RuntimeException("com/zelix/y_", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            y_.f[n2] = l4;
        }
        return f[n2];
    }

    private static long b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = y_.b(n, l);
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
            throw new RuntimeException("com/zelix/y_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(y_.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(y_.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
