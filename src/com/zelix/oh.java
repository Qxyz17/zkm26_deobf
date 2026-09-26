/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fh;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class oh {
    static final int[] M;

    /*
     * Unable to fully structure code
     */
    static {
        block33: {
            block32: {
                var11 = prr.a((long)5828881751398171541L, (long)-9041781526637627242L, MethodHandles.lookup().lookupClass()).a(63481398431229L) ^ 114371230810872L;
                var13_1 = var11 ^ 111287250516245L;
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
                var0_4 = new long[7];
                var4_5 = 0;
                var5_6 = "\u0017\u00c7\u009f\u00aa\u000b\u0086\r\u009cg\u0094\u00c4\u0095\u0097\u001a\u00d5\u00fb\u00d0\u00ea\u00bc\u0093\u001e\u0080N|U\u00e7/F\u00bdy\u00d0\u001bW]\u00bd\u00ad\u0082>\r\u00d0";
                var6_7 = "\u0017\u00c7\u009f\u00aa\u000b\u0086\r\u009cg\u0094\u00c4\u0095\u0097\u001a\u00d5\u00fb\u00d0\u00ea\u00bc\u0093\u001e\u0080N|U\u00e7/F\u00bdy\u00d0\u001bW]\u00bd\u00ad\u0082>\r\u00d0".length();
                var3_8 = 0;
                while (true) {
                    var7_9 = var5_6.substring(var3_8, var3_8 += 8).getBytes("ISO-8859-1");
                    v3 = var0_4;
                    v4 = var4_5++;
                    v5 = ((long)var7_9[0] & 255L) << 56 | ((long)var7_9[1] & 255L) << 48 | ((long)var7_9[2] & 255L) << 40 | ((long)var7_9[3] & 255L) << 32 | ((long)var7_9[4] & 255L) << 24 | ((long)var7_9[5] & 255L) << 16 | ((long)var7_9[6] & 255L) << 8 | (long)var7_9[7] & 255L;
                    v6 = -1;
                    break block32;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_8 < var6_7) ** continue;
                    var5_6 = ",\u007fY\bQ\u0087\u00d0\u001b\u00ce\r\u0015\u0001\u00c2\u00cd-\u0016";
                    var6_7 = ",\u007fY\bQ\u0087\u00d0\u001b\u00ce\r\u0015\u0001\u00c2\u00cd-\u0016".length();
                    var3_8 = 0;
                    while (true) {
                        var7_9 = var5_6.substring(var3_8, var3_8 += 8).getBytes("ISO-8859-1");
                        v3 = var0_4;
                        v4 = var4_5++;
                        v5 = ((long)var7_9[0] & 255L) << 56 | ((long)var7_9[1] & 255L) << 48 | ((long)var7_9[2] & 255L) << 40 | ((long)var7_9[3] & 255L) << 32 | ((long)var7_9[4] & 255L) << 24 | ((long)var7_9[5] & 255L) << 16 | ((long)var7_9[6] & 255L) << 8 | (long)var7_9[7] & 255L;
                        v6 = 0;
                        break block32;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_8 < var6_7) ** continue;
                    break block33;
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
        oh.M = new int[((CallSite)m44.a("i", (Object)v8, (long)2591796099358376557L, (long)var11)).length];
        try {
            oh.M[m44.a("m", (long)2618851313462542521L, (long)var11).ordinal()] = 1;
        }
        catch (NoSuchFieldError var15_12) {
            // empty catch block
        }
        try {
            oh.M[fh.T.ordinal()] = 2;
        }
        catch (NoSuchFieldError var15_13) {
            // empty catch block
        }
        try {
            oh.M[m44.a("m", (long)4491154648861521946L, (long)var11).ordinal()] = 3;
        }
        catch (NoSuchFieldError var15_14) {
            // empty catch block
        }
        try {
            oh.M[m44.a("m", (long)4267384931631700980L, (long)var11).ordinal()] = 4;
        }
        catch (NoSuchFieldError var15_15) {
            // empty catch block
        }
        try {
            oh.M[fh.U.ordinal()] = 5;
        }
        catch (NoSuchFieldError var15_16) {
            // empty catch block
        }
        try {
            oh.M[m44.a("m", (long)2316996066630815336L, (long)var11).ordinal()] = (int)var0_4[1];
        }
        catch (NoSuchFieldError var15_17) {
            // empty catch block
        }
        try {
            oh.M[m44.a("m", (long)2419826570388282300L, (long)var11).ordinal()] = (int)var0_4[0];
        }
        catch (NoSuchFieldError var15_18) {
            // empty catch block
        }
        try {
            oh.M[m44.a("m", (long)2370617383567300115L, (long)var11).ordinal()] = (int)var0_4[2];
        }
        catch (NoSuchFieldError var15_19) {
            // empty catch block
        }
        try {
            oh.M[m44.a("m", (long)2403825257552843338L, (long)var11).ordinal()] = (int)var0_4[4];
        }
        catch (NoSuchFieldError var15_20) {
            // empty catch block
        }
        try {
            oh.M[m44.a("m", (long)4579734654861945410L, (long)var11).ordinal()] = (int)var0_4[5];
        }
        catch (NoSuchFieldError var15_21) {
            // empty catch block
        }
        try {
            oh.M[fh.u.ordinal()] = (int)var0_4[6];
        }
        catch (NoSuchFieldError var15_22) {
            // empty catch block
        }
        try {
            oh.M[fh.b.ordinal()] = (int)var0_4[3];
        }
        catch (NoSuchFieldError var15_23) {
            // empty catch block
        }
    }
}
