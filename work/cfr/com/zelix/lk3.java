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

public class lk3 {
    static final int[] h;

    /*
     * Unable to fully structure code
     */
    static {
        block27: {
            block26: {
                var11 = prr.a(-5251387867818576L, -3098407071860817359L, MethodHandles.lookup().lookupClass()).a(262382078956931L) ^ 82632450015392L;
                var13_1 = var11 ^ 35214888595944L;
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
                var0_4 = new long[4];
                var4_5 = 0;
                var5_6 = "\u00e4\u0014}\u0082G)\u00ff\u00cc\u0006\u000f\u0007\u00f4L}\u00f5\u00bf";
                var6_7 = "\u00e4\u0014}\u0082G)\u00ff\u00cc\u0006\u000f\u0007\u00f4L}\u00f5\u00bf".length();
                var3_8 = 0;
                while (true) {
                    var7_9 = var5_6.substring(var3_8, var3_8 += 8).getBytes("ISO-8859-1");
                    v3 = var0_4;
                    v4 = var4_5++;
                    v5 = ((long)var7_9[0] & 255L) << 56 | ((long)var7_9[1] & 255L) << 48 | ((long)var7_9[2] & 255L) << 40 | ((long)var7_9[3] & 255L) << 32 | ((long)var7_9[4] & 255L) << 24 | ((long)var7_9[5] & 255L) << 16 | ((long)var7_9[6] & 255L) << 8 | (long)var7_9[7] & 255L;
                    v6 = -1;
                    break block26;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_8 < var6_7) ** continue;
                    var5_6 = "\u0095_\u000e\u00c3L\u00d5Mi\u00b7\n\u0018B\u00a3\t\u00b4\u0092";
                    var6_7 = "\u0095_\u000e\u00c3L\u00d5Mi\u00b7\n\u0018B\u00a3\t\u00b4\u0092".length();
                    var3_8 = 0;
                    while (true) {
                        var7_9 = var5_6.substring(var3_8, var3_8 += 8).getBytes("ISO-8859-1");
                        v3 = var0_4;
                        v4 = var4_5++;
                        v5 = ((long)var7_9[0] & 255L) << 56 | ((long)var7_9[1] & 255L) << 48 | ((long)var7_9[2] & 255L) << 40 | ((long)var7_9[3] & 255L) << 32 | ((long)var7_9[4] & 255L) << 24 | ((long)var7_9[5] & 255L) << 16 | ((long)var7_9[6] & 255L) << 8 | (long)var7_9[7] & 255L;
                        v6 = 0;
                        break block26;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_8 < var6_7) ** continue;
                    break block27;
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
        lk3.h = new int[((CallSite)m44.a("i", (Object)v8, (long)-3462965449500983203L, (long)var11)).length];
        try {
            m44.a("m", (long)-2916020356794685831L, (long)var11)[m44.a("m", (long)-3578584067522853557L, (long)var11).ordinal()] = (CallSite)true;
        }
        catch (NoSuchFieldError var15_12) {
            // empty catch block
        }
        try {
            m44.a("m", (long)-2916020356794685831L, (long)var11)[m44.a("m", (long)-3211665178995817991L, (long)var11).ordinal()] = (CallSite)2;
        }
        catch (NoSuchFieldError var15_13) {
            // empty catch block
        }
        try {
            m44.a("m", (long)-2916020356794685831L, (long)var11)[m44.a("m", (long)-3432036924316582769L, (long)var11).ordinal()] = (CallSite)3;
        }
        catch (NoSuchFieldError var15_14) {
            // empty catch block
        }
        try {
            m44.a("m", (long)-2916020356794685831L, (long)var11)[m44.a("m", (long)-3966217260131070438L, (long)var11).ordinal()] = (CallSite)4;
        }
        catch (NoSuchFieldError var15_15) {
            // empty catch block
        }
        try {
            m44.a("m", (long)-2916020356794685831L, (long)var11)[m44.a("m", (long)-3034792907585242917L, (long)var11).ordinal()] = (CallSite)5;
        }
        catch (NoSuchFieldError var15_16) {
            // empty catch block
        }
        try {
            m44.a("m", (long)-2916020356794685831L, (long)var11)[m44.a("m", (long)-3529123194364631673L, (long)var11).ordinal()] = (CallSite)((int)var0_4[3]);
        }
        catch (NoSuchFieldError var15_17) {
            // empty catch block
        }
        try {
            m44.a("m", (long)-2916020356794685831L, (long)var11)[m44.a("m", (long)-2995490242313338293L, (long)var11).ordinal()] = (CallSite)((int)var0_4[2]);
        }
        catch (NoSuchFieldError var15_18) {
            // empty catch block
        }
        try {
            m44.a("m", (long)-2916020356794685831L, (long)var11)[m44.a("m", (long)-3526501347355390346L, (long)var11).ordinal()] = (CallSite)((int)var0_4[1]);
        }
        catch (NoSuchFieldError var15_19) {
            // empty catch block
        }
        try {
            m44.a("m", (long)-2916020356794685831L, (long)var11)[m44.a("m", (long)-3864555202844308579L, (long)var11).ordinal()] = (CallSite)((int)var0_4[0]);
        }
        catch (NoSuchFieldError var15_20) {
            // empty catch block
        }
    }
}

