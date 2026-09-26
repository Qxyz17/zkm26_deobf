/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lq7 {
    static final int[] F;
    static final int[] w;

    /*
     * Unable to fully structure code
     */
    static {
        block41: {
            block40: {
                v0 = var11 = prr.a((long)2337449983766738193L, (long)-1937240835109505263L, MethodHandles.lookup().lookupClass()).a(44834241783187L) ^ 86887492360682L;
                var13_1 = v0 ^ 122419219490109L;
                var15_2 = v0 ^ 96741572546192L;
                var1_3 = Cipher.getInstance("DES/CBC/NoPadding");
                v1 = SecretKeyFactory.getInstance("DES");
                v2 = new byte[8];
                v3 = v2;
                v2[0] = (byte)(var11 >>> 56);
                for (var2_4 = 1; var2_4 < 8; ++var2_4) {
                    v3 = v3;
                    v3[var2_4] = (byte)(var11 << var2_4 * 8 >>> 56);
                }
                var1_3.init(2, (Key)v1.generateSecret(new DESKeySpec(v3)), new IvParameterSpec(new byte[8]));
                var0_5 = new long[7];
                var4_6 = 0;
                var5_7 = "\u00cc\u00ff\u00d6\u0092\u007f\u00bf8\u00b5\u00e8\u00c6\u00e2\u0010\u00cf\u008b`\u00bd\u00e8\u0087\u0084\u009b\u0084\u0005\u00b5-\u00c8\u009c-C\u00e9Ue\u00e7\u00ef2\u00d1\u00f7\u00c7\u00ca\u00f79";
                var6_8 = "\u00cc\u00ff\u00d6\u0092\u007f\u00bf8\u00b5\u00e8\u00c6\u00e2\u0010\u00cf\u008b`\u00bd\u00e8\u0087\u0084\u009b\u0084\u0005\u00b5-\u00c8\u009c-C\u00e9Ue\u00e7\u00ef2\u00d1\u00f7\u00c7\u00ca\u00f79".length();
                var3_9 = 0;
                while (true) {
                    var7_10 = var5_7.substring(var3_9, var3_9 += 8).getBytes("ISO-8859-1");
                    v4 = var0_5;
                    v5 = var4_6++;
                    v6 = ((long)var7_10[0] & 255L) << 56 | ((long)var7_10[1] & 255L) << 48 | ((long)var7_10[2] & 255L) << 40 | ((long)var7_10[3] & 255L) << 32 | ((long)var7_10[4] & 255L) << 24 | ((long)var7_10[5] & 255L) << 16 | ((long)var7_10[6] & 255L) << 8 | (long)var7_10[7] & 255L;
                    v7 = -1;
                    break block40;
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v4[v5] = v8;
                    if (var3_9 < var6_8) ** continue;
                    var5_7 = "cc\u0001\u00e2\u009f\u00fb\u0005\u009d\u0094[\u0000\u00cc\u00dd\u000e\u00db\n";
                    var6_8 = "cc\u0001\u00e2\u009f\u00fb\u0005\u009d\u0094[\u0000\u00cc\u00dd\u000e\u00db\n".length();
                    var3_9 = 0;
                    while (true) {
                        var7_10 = var5_7.substring(var3_9, var3_9 += 8).getBytes("ISO-8859-1");
                        v4 = var0_5;
                        v5 = var4_6++;
                        v6 = ((long)var7_10[0] & 255L) << 56 | ((long)var7_10[1] & 255L) << 48 | ((long)var7_10[2] & 255L) << 40 | ((long)var7_10[3] & 255L) << 32 | ((long)var7_10[4] & 255L) << 24 | ((long)var7_10[5] & 255L) << 16 | ((long)var7_10[6] & 255L) << 8 | (long)var7_10[7] & 255L;
                        v7 = 0;
                        break block40;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    v4[v5] = v8;
                    if (var3_9 < var6_8) ** continue;
                    break block41;
                    break;
                }
            }
            var8_11 = v6;
            var10_12 = var1_3.doFinal(new byte[]{(byte)(var8_11 >>> 56), (byte)(var8_11 >>> 48), (byte)(var8_11 >>> 40), (byte)(var8_11 >>> 32), (byte)(var8_11 >>> 24), (byte)(var8_11 >>> 16), (byte)(var8_11 >>> 8), (byte)var8_11});
            v8 = ((long)var10_12[0] & 255L) << 56 | ((long)var10_12[1] & 255L) << 48 | ((long)var10_12[2] & 255L) << 40 | ((long)var10_12[3] & 255L) << 32 | ((long)var10_12[4] & 255L) << 24 | ((long)var10_12[5] & 255L) << 16 | ((long)var10_12[6] & 255L) << 8 | (long)var10_12[7] & 255L;
            switch (v7) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl53:
                // 1 sources

                ** continue;
            }
        }
        v9 = new Object[1];
        v9[0] = var13_1;
        lq7.w = new int[((CallSite)m44.a("o", (Object)v9, (long)1246586642999527408L, (long)var11)).length];
        try {
            m44.a("k", (long)1192497354356328161L, (long)var11)[m44.a("k", (long)1661266312233541677L, (long)var11).ordinal()] = (CallSite)true;
        }
        catch (NoSuchFieldError var17_13) {
            // empty catch block
        }
        try {
            m44.a("k", (long)1192497354356328161L, (long)var11)[m44.a("k", (long)718763770807247978L, (long)var11).ordinal()] = (CallSite)2;
        }
        catch (NoSuchFieldError var17_14) {
            // empty catch block
        }
        try {
            m44.a("k", (long)1192497354356328161L, (long)var11)[m44.a("k", (long)736074084894715937L, (long)var11).ordinal()] = (CallSite)3;
        }
        catch (NoSuchFieldError var17_15) {
            // empty catch block
        }
        try {
            m44.a("k", (long)1192497354356328161L, (long)var11)[m44.a("k", (long)605709792641218548L, (long)var11).ordinal()] = (CallSite)4;
        }
        catch (NoSuchFieldError var17_16) {
            // empty catch block
        }
        try {
            m44.a("k", (long)1192497354356328161L, (long)var11)[m44.a("k", (long)1133241795117080527L, (long)var11).ordinal()] = (CallSite)5;
        }
        catch (NoSuchFieldError var17_17) {
            // empty catch block
        }
        try {
            m44.a("k", (long)1192497354356328161L, (long)var11)[m44.a("k", (long)1441005139344443960L, (long)var11).ordinal()] = (CallSite)((int)var0_5[2]);
        }
        catch (NoSuchFieldError var17_18) {
            // empty catch block
        }
        try {
            m44.a("k", (long)1192497354356328161L, (long)var11)[m44.a("k", (long)887284778215120886L, (long)var11).ordinal()] = (CallSite)((int)var0_5[3]);
        }
        catch (NoSuchFieldError var17_19) {
            // empty catch block
        }
        try {
            m44.a("k", (long)1192497354356328161L, (long)var11)[m44.a("k", (long)1017282577790440744L, (long)var11).ordinal()] = (CallSite)((int)var0_5[6]);
        }
        catch (NoSuchFieldError var17_20) {
            // empty catch block
        }
        try {
            m44.a("k", (long)1192497354356328161L, (long)var11)[m44.a("k", (long)902398082593745126L, (long)var11).ordinal()] = (CallSite)((int)var0_5[5]);
        }
        catch (NoSuchFieldError var17_21) {
            // empty catch block
        }
        try {
            m44.a("k", (long)1192497354356328161L, (long)var11)[m44.a("k", (long)1413799959570715246L, (long)var11).ordinal()] = (CallSite)((int)var0_5[4]);
        }
        catch (NoSuchFieldError var17_22) {
            // empty catch block
        }
        try {
            m44.a("k", (long)1192497354356328161L, (long)var11)[m44.a("k", (long)1692466812100966631L, (long)var11).ordinal()] = (CallSite)((int)var0_5[1]);
        }
        catch (NoSuchFieldError var17_23) {
            // empty catch block
        }
        try {
            m44.a("k", (long)1192497354356328161L, (long)var11)[m44.a("k", (long)1106076610190947732L, (long)var11).ordinal()] = (CallSite)((int)var0_5[0]);
        }
        catch (NoSuchFieldError var17_24) {
            // empty catch block
        }
        v10 = new Object[1];
        v10[0] = var15_2;
        lq7.F = new int[((CallSite)m44.a("o", (Object)v10, (long)1668750329658555962L, (long)var11)).length];
        try {
            m44.a("k", (long)685583199279039364L, (long)var11)[m44.a("k", (long)1097326302870253655L, (long)var11).ordinal()] = (CallSite)true;
        }
        catch (NoSuchFieldError var17_25) {
            // empty catch block
        }
        try {
            m44.a("k", (long)685583199279039364L, (long)var11)[m44.a("k", (long)877955526559727617L, (long)var11).ordinal()] = (CallSite)2;
        }
        catch (NoSuchFieldError var17_26) {
            // empty catch block
        }
        try {
            m44.a("k", (long)685583199279039364L, (long)var11)[m44.a("k", (long)620997471247691941L, (long)var11).ordinal()] = (CallSite)3;
        }
        catch (NoSuchFieldError var17_27) {
            // empty catch block
        }
        try {
            m44.a("k", (long)685583199279039364L, (long)var11)[m44.a("k", (long)1107389003940771098L, (long)var11).ordinal()] = (CallSite)4;
        }
        catch (NoSuchFieldError var17_28) {
            // empty catch block
        }
    }
}
