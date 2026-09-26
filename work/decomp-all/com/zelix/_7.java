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

public class _7 {
    static final int[] X;

    /*
     * Unable to fully structure code
     */
    static {
        block35: {
            block34: {
                var11 = prr.a((long)1106813632868509363L, (long)-544808042004513959L, MethodHandles.lookup().lookupClass()).a(157663429135134L) ^ 4031858753788L;
                var13_1 = var11 ^ 66189674146031L;
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
                var0_4 = new long[8];
                var4_5 = 0;
                var5_6 = "8S-\u00c5\u008f\u00e2q\u0080\u00ba\u00d2]\u00f1\u0080\u00ad\u0011fB\u008aV(\u0084sO\u00b25M\u00ac\t\u0005Gn)\u00b1\u009a\u0006\u00d2\u00a46\u00f0\u00fb\u00fa\u00ef\u0083\u00ed\u00c8\u00d3j\u00ea";
                var6_7 = "8S-\u00c5\u008f\u00e2q\u0080\u00ba\u00d2]\u00f1\u0080\u00ad\u0011fB\u008aV(\u0084sO\u00b25M\u00ac\t\u0005Gn)\u00b1\u009a\u0006\u00d2\u00a46\u00f0\u00fb\u00fa\u00ef\u0083\u00ed\u00c8\u00d3j\u00ea".length();
                var3_8 = 0;
                while (true) {
                    var7_9 = var5_6.substring(var3_8, var3_8 += 8).getBytes("ISO-8859-1");
                    v3 = var0_4;
                    v4 = var4_5++;
                    v5 = ((long)var7_9[0] & 255L) << 56 | ((long)var7_9[1] & 255L) << 48 | ((long)var7_9[2] & 255L) << 40 | ((long)var7_9[3] & 255L) << 32 | ((long)var7_9[4] & 255L) << 24 | ((long)var7_9[5] & 255L) << 16 | ((long)var7_9[6] & 255L) << 8 | (long)var7_9[7] & 255L;
                    v6 = -1;
                    break block34;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_8 < var6_7) ** continue;
                    var5_6 = "\u00eb^ssqT\u00b1\u00f6\u00bd\"\u00ff?\u008c&\u00da\u00b6";
                    var6_7 = "\u00eb^ssqT\u00b1\u00f6\u00bd\"\u00ff?\u008c&\u00da\u00b6".length();
                    var3_8 = 0;
                    while (true) {
                        var7_9 = var5_6.substring(var3_8, var3_8 += 8).getBytes("ISO-8859-1");
                        v3 = var0_4;
                        v4 = var4_5++;
                        v5 = ((long)var7_9[0] & 255L) << 56 | ((long)var7_9[1] & 255L) << 48 | ((long)var7_9[2] & 255L) << 40 | ((long)var7_9[3] & 255L) << 32 | ((long)var7_9[4] & 255L) << 24 | ((long)var7_9[5] & 255L) << 16 | ((long)var7_9[6] & 255L) << 8 | (long)var7_9[7] & 255L;
                        v6 = 0;
                        break block34;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_8 < var6_7) ** continue;
                    break block35;
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
        _7.X = new int[((CallSite)m44.a("j", (Object)v8, (long)5705867942533607753L, (long)var11)).length];
        try {
            m44.a("n", (long)6253961766968198968L, (long)var11)[m44.a("n", (long)5211791458886200295L, (long)var11).ordinal()] = (CallSite)true;
        }
        catch (NoSuchFieldError var15_12) {
            // empty catch block
        }
        try {
            m44.a("n", (long)6253961766968198968L, (long)var11)[m44.a("n", (long)5742519894205404865L, (long)var11).ordinal()] = (CallSite)2;
        }
        catch (NoSuchFieldError var15_13) {
            // empty catch block
        }
        try {
            m44.a("n", (long)6253961766968198968L, (long)var11)[m44.a("n", (long)5499785243142117428L, (long)var11).ordinal()] = (CallSite)3;
        }
        catch (NoSuchFieldError var15_14) {
            // empty catch block
        }
        try {
            m44.a("n", (long)6253961766968198968L, (long)var11)[m44.a("n", (long)5631448896808292153L, (long)var11).ordinal()] = (CallSite)4;
        }
        catch (NoSuchFieldError var15_15) {
            // empty catch block
        }
        try {
            m44.a("n", (long)6253961766968198968L, (long)var11)[m44.a("n", (long)5197535896023082497L, (long)var11).ordinal()] = (CallSite)5;
        }
        catch (NoSuchFieldError var15_16) {
            // empty catch block
        }
        try {
            m44.a("n", (long)6253961766968198968L, (long)var11)[m44.a("n", (long)5662993896659794505L, (long)var11).ordinal()] = (CallSite)((int)var0_4[6]);
        }
        catch (NoSuchFieldError var15_17) {
            // empty catch block
        }
        try {
            m44.a("n", (long)6253961766968198968L, (long)var11)[m44.a("n", (long)5494362011323956496L, (long)var11).ordinal()] = (CallSite)((int)var0_4[1]);
        }
        catch (NoSuchFieldError var15_18) {
            // empty catch block
        }
        try {
            m44.a("n", (long)6253961766968198968L, (long)var11)[m44.a("n", (long)5333185406448222858L, (long)var11).ordinal()] = (CallSite)((int)var0_4[3]);
        }
        catch (NoSuchFieldError var15_19) {
            // empty catch block
        }
        try {
            m44.a("n", (long)6253961766968198968L, (long)var11)[m44.a("n", (long)5891416758337442395L, (long)var11).ordinal()] = (CallSite)((int)var0_4[2]);
        }
        catch (NoSuchFieldError var15_20) {
            // empty catch block
        }
        try {
            m44.a("n", (long)6253961766968198968L, (long)var11)[m44.a("n", (long)5802318016154080586L, (long)var11).ordinal()] = (CallSite)((int)var0_4[5]);
        }
        catch (NoSuchFieldError var15_21) {
            // empty catch block
        }
        try {
            m44.a("n", (long)6253961766968198968L, (long)var11)[m44.a("n", (long)6140296822925444954L, (long)var11).ordinal()] = (CallSite)((int)var0_4[0]);
        }
        catch (NoSuchFieldError var15_22) {
            // empty catch block
        }
        try {
            m44.a("n", (long)6253961766968198968L, (long)var11)[m44.a("n", (long)5438391510439085420L, (long)var11).ordinal()] = (CallSite)((int)var0_4[7]);
        }
        catch (NoSuchFieldError var15_23) {
            // empty catch block
        }
        try {
            m44.a("n", (long)6253961766968198968L, (long)var11)[m44.a("n", (long)5677246560008948664L, (long)var11).ordinal()] = (CallSite)((int)var0_4[4]);
        }
        catch (NoSuchFieldError var15_24) {
            // empty catch block
        }
    }
}
