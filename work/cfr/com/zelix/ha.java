/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.va;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ha {
    static final int[] x;

    /*
     * Unable to fully structure code
     */
    static {
        block43: {
            block42: {
                var11 = prr.a(-8819953542763046512L, 1781511386147768785L, MethodHandles.lookup().lookupClass()).a(191964721277648L) ^ 117460130867460L;
                var13_1 = var11 ^ 108562161285280L;
                var1_2 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var2_3 = 1; var2_3 < 8; ++var2_3) {
                    v2 = v2;
                    v2[var2_3] = (byte)(var11 << var2_3 * 8 >>> 56);
                }
                var1_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_4 = new long[12];
                var4_5 = 0;
                var5_6 = "\u00d5Y\u0007u)}\u00b4\u00d1\u0005\u0017F\u00f3Se\u000e\u00fe\u00c7\u0000\u00e6\u0094\u00a86\u00c3\u008f\u0012\u00dc\u0084$\u00fcr1^\u009d\u00ce\u0013X\u0001\u0082e\u009e\u00f4V\u0086x\u00ca\u00d8\u0093\u00fe*\u00df\u00a1\u00cb\u00e4\u0089AO\u00dc\u0084\u00bd\u00ab\u00f1\u009c1Y(@\f\u00b8q2\u008e\u008a!\u00c3^\u001f\u00c0\u00d7}n";
                var6_7 = "\u00d5Y\u0007u)}\u00b4\u00d1\u0005\u0017F\u00f3Se\u000e\u00fe\u00c7\u0000\u00e6\u0094\u00a86\u00c3\u008f\u0012\u00dc\u0084$\u00fcr1^\u009d\u00ce\u0013X\u0001\u0082e\u009e\u00f4V\u0086x\u00ca\u00d8\u0093\u00fe*\u00df\u00a1\u00cb\u00e4\u0089AO\u00dc\u0084\u00bd\u00ab\u00f1\u009c1Y(@\f\u00b8q2\u008e\u008a!\u00c3^\u001f\u00c0\u00d7}n".length();
                var3_8 = 0;
                while (true) {
                    var7_9 = var5_6.substring(var3_8, var3_8 += 8).getBytes("ISO-8859-1");
                    v3 = var0_4;
                    v4 = var4_5++;
                    v5 = ((long)var7_9[0] & 255L) << 56 | ((long)var7_9[1] & 255L) << 48 | ((long)var7_9[2] & 255L) << 40 | ((long)var7_9[3] & 255L) << 32 | ((long)var7_9[4] & 255L) << 24 | ((long)var7_9[5] & 255L) << 16 | ((long)var7_9[6] & 255L) << 8 | (long)var7_9[7] & 255L;
                    v6 = -1;
                    break block42;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_8 < var6_7) ** continue;
                    var5_6 = "\u00ae\u00de\u0012\u00c9c\u00d0\u00e2\u00db.\u00d8\u00e77\u00ef\u00da\u00e3\u00d5";
                    var6_7 = "\u00ae\u00de\u0012\u00c9c\u00d0\u00e2\u00db.\u00d8\u00e77\u00ef\u00da\u00e3\u00d5".length();
                    var3_8 = 0;
                    while (true) {
                        var7_9 = var5_6.substring(var3_8, var3_8 += 8).getBytes("ISO-8859-1");
                        v3 = var0_4;
                        v4 = var4_5++;
                        v5 = ((long)var7_9[0] & 255L) << 56 | ((long)var7_9[1] & 255L) << 48 | ((long)var7_9[2] & 255L) << 40 | ((long)var7_9[3] & 255L) << 32 | ((long)var7_9[4] & 255L) << 24 | ((long)var7_9[5] & 255L) << 16 | ((long)var7_9[6] & 255L) << 8 | (long)var7_9[7] & 255L;
                        v6 = 0;
                        break block42;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_8 < var6_7) ** continue;
                    break block43;
                    break;
                }
            }
            var8_10 = v5;
            var10_11 = var1_2.doFinal(new byte[]{(byte)(var8_10 >>> 56), (byte)(var8_10 >>> 48), (byte)(var8_10 >>> 40), (byte)(var8_10 >>> 32), (byte)(var8_10 >>> 24), (byte)(var8_10 >>> 16), (byte)(var8_10 >>> 8), (byte)var8_10});
            v7 = ((long)var10_11[0] & 255L) << 56 | ((long)var10_11[1] & 255L) << 48 | ((long)var10_11[2] & 255L) << 40 | ((long)var10_11[3] & 255L) << 32 | ((long)var10_11[4] & 255L) << 24 | ((long)var10_11[5] & 255L) << 16 | ((long)var10_11[6] & 255L) << 8 | (long)var10_11[7] & 255L;
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
        v8 = new Object[1];
        v8[0] = var13_1;
        ha.x = new int[((CallSite)m44.a("j", (Object)v8, (long)3623955389765212786L, (long)var11)).length];
        try {
            ha.x[m44.a("n", (long)3326367383345763136L, (long)var11).ordinal()] = 1;
        }
        catch (NoSuchFieldError var15_12) {
            // empty catch block
        }
        try {
            ha.x[m44.a("n", (long)3159998845115428781L, (long)var11).ordinal()] = 2;
        }
        catch (NoSuchFieldError var15_13) {
            // empty catch block
        }
        try {
            ha.x[m44.a("n", (long)3900613733348193680L, (long)var11).ordinal()] = 3;
        }
        catch (NoSuchFieldError var15_14) {
            // empty catch block
        }
        try {
            ha.x[m44.a("n", (long)3308196227522726230L, (long)var11).ordinal()] = 4;
        }
        catch (NoSuchFieldError var15_15) {
            // empty catch block
        }
        try {
            ha.x[m44.a("n", (long)3166499288342203393L, (long)var11).ordinal()] = 5;
        }
        catch (NoSuchFieldError var15_16) {
            // empty catch block
        }
        try {
            ha.x[va.Q.ordinal()] = (int)var0_4[6];
        }
        catch (NoSuchFieldError var15_17) {
            // empty catch block
        }
        try {
            ha.x[m44.a("n", (long)3070024560593298991L, (long)var11).ordinal()] = (int)var0_4[2];
        }
        catch (NoSuchFieldError var15_18) {
            // empty catch block
        }
        try {
            ha.x[m44.a("n", (long)3307465708648061859L, (long)var11).ordinal()] = (int)var0_4[9];
        }
        catch (NoSuchFieldError var15_19) {
            // empty catch block
        }
        try {
            ha.x[m44.a("n", (long)2894319199352676394L, (long)var11).ordinal()] = (int)var0_4[11];
        }
        catch (NoSuchFieldError var15_20) {
            // empty catch block
        }
        try {
            ha.x[m44.a("n", (long)4007931120971716013L, (long)var11).ordinal()] = (int)var0_4[10];
        }
        catch (NoSuchFieldError var15_21) {
            // empty catch block
        }
        try {
            ha.x[m44.a("n", (long)3635938535970726529L, (long)var11).ordinal()] = (int)var0_4[8];
        }
        catch (NoSuchFieldError var15_22) {
            // empty catch block
        }
        try {
            ha.x[m44.a("n", (long)4004365692977334424L, (long)var11).ordinal()] = (int)var0_4[5];
        }
        catch (NoSuchFieldError var15_23) {
            // empty catch block
        }
        try {
            ha.x[m44.a("n", (long)3966177258643388338L, (long)var11).ordinal()] = (int)var0_4[4];
        }
        catch (NoSuchFieldError var15_24) {
            // empty catch block
        }
        try {
            ha.x[m44.a("n", (long)3968513777059867130L, (long)var11).ordinal()] = (int)var0_4[1];
        }
        catch (NoSuchFieldError var15_25) {
            // empty catch block
        }
        try {
            ha.x[m44.a("n", (long)3874910157734308747L, (long)var11).ordinal()] = (int)var0_4[3];
        }
        catch (NoSuchFieldError var15_26) {
            // empty catch block
        }
        try {
            ha.x[m44.a("n", (long)3804669878664344588L, (long)var11).ordinal()] = (int)var0_4[0];
        }
        catch (NoSuchFieldError var15_27) {
            // empty catch block
        }
        try {
            ha.x[m44.a("n", (long)3817213574788754437L, (long)var11).ordinal()] = (int)var0_4[7];
        }
        catch (NoSuchFieldError var15_28) {
            // empty catch block
        }
    }
}

