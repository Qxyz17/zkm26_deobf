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

public class tu {
    static final int[] y;
    static final int[] k;

    /*
     * Unable to fully structure code
     */
    static {
        block37: {
            block36: {
                v0 = var11 = prr.a((long)7078688816003068604L, (long)7298159079323667786L, MethodHandles.lookup().lookupClass()).a(145355655713453L) ^ 43051202005361L;
                var13_1 = v0 ^ 10638909975483L;
                var15_2 = v0 ^ 30093340419934L;
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
                var5_7 = "(\u00c3\u0001\\\\M\u00fd\u009b\u00e2,\\;q6\u00c37zl\u008eV\u00f0\u0005\u00de\u00b3b\u00bd\u00cd}\u00ce\u00fc\u00a7\u008d+\u00a8H\u00d1\u008bXW\u00e2";
                var6_8 = "(\u00c3\u0001\\\\M\u00fd\u009b\u00e2,\\;q6\u00c37zl\u008eV\u00f0\u0005\u00de\u00b3b\u00bd\u00cd}\u00ce\u00fc\u00a7\u008d+\u00a8H\u00d1\u008bXW\u00e2".length();
                var3_9 = 0;
                while (true) {
                    var7_10 = var5_7.substring(var3_9, var3_9 += 8).getBytes("ISO-8859-1");
                    v4 = var0_5;
                    v5 = var4_6++;
                    v6 = ((long)var7_10[0] & 255L) << 56 | ((long)var7_10[1] & 255L) << 48 | ((long)var7_10[2] & 255L) << 40 | ((long)var7_10[3] & 255L) << 32 | ((long)var7_10[4] & 255L) << 24 | ((long)var7_10[5] & 255L) << 16 | ((long)var7_10[6] & 255L) << 8 | (long)var7_10[7] & 255L;
                    v7 = -1;
                    break block36;
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v4[v5] = v8;
                    if (var3_9 < var6_8) ** continue;
                    var5_7 = "\u0088n\u001f \u00dc\u0089\u00c6\u00ecPY\u00b8e$oov";
                    var6_8 = "\u0088n\u001f \u00dc\u0089\u00c6\u00ecPY\u00b8e$oov".length();
                    var3_9 = 0;
                    while (true) {
                        var7_10 = var5_7.substring(var3_9, var3_9 += 8).getBytes("ISO-8859-1");
                        v4 = var0_5;
                        v5 = var4_6++;
                        v6 = ((long)var7_10[0] & 255L) << 56 | ((long)var7_10[1] & 255L) << 48 | ((long)var7_10[2] & 255L) << 40 | ((long)var7_10[3] & 255L) << 32 | ((long)var7_10[4] & 255L) << 24 | ((long)var7_10[5] & 255L) << 16 | ((long)var7_10[6] & 255L) << 8 | (long)var7_10[7] & 255L;
                        v7 = 0;
                        break block36;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    v4[v5] = v8;
                    if (var3_9 < var6_8) ** continue;
                    break block37;
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
        tu.y = new int[((CallSite)m44.a("l", (Object)v9, (long)-3696950768934445510L, (long)var11)).length];
        try {
            m44.a("h", (long)-3139575812965281138L, (long)var11)[m44.a("h", (long)-2933420427855499991L, (long)var11).ordinal()] = (CallSite)true;
        }
        catch (NoSuchFieldError var17_13) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-3139575812965281138L, (long)var11)[m44.a("h", (long)-2945649522049845137L, (long)var11).ordinal()] = (CallSite)2;
        }
        catch (NoSuchFieldError var17_14) {
            // empty catch block
        }
        v10 = new Object[1];
        v10[0] = var15_2;
        tu.k = new int[((CallSite)m44.a("l", (Object)v10, (long)-3229160122870594157L, (long)var11)).length];
        try {
            m44.a("h", (long)-3721820947546689115L, (long)var11)[m44.a("h", (long)-3067667263218113970L, (long)var11).ordinal()] = (CallSite)true;
        }
        catch (NoSuchFieldError var17_15) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-3721820947546689115L, (long)var11)[m44.a("h", (long)-3711694978805770421L, (long)var11).ordinal()] = (CallSite)2;
        }
        catch (NoSuchFieldError var17_16) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-3721820947546689115L, (long)var11)[m44.a("h", (long)-4011445635800632766L, (long)var11).ordinal()] = (CallSite)3;
        }
        catch (NoSuchFieldError var17_17) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-3721820947546689115L, (long)var11)[m44.a("h", (long)-3089559979231757692L, (long)var11).ordinal()] = (CallSite)4;
        }
        catch (NoSuchFieldError var17_18) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-3721820947546689115L, (long)var11)[m44.a("h", (long)-3613750157715268180L, (long)var11).ordinal()] = (CallSite)5;
        }
        catch (NoSuchFieldError var17_19) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-3721820947546689115L, (long)var11)[m44.a("h", (long)-3889810658382826089L, (long)var11).ordinal()] = (CallSite)((int)var0_5[1]);
        }
        catch (NoSuchFieldError var17_20) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-3721820947546689115L, (long)var11)[m44.a("h", (long)-3315309467563306995L, (long)var11).ordinal()] = (CallSite)((int)var0_5[5]);
        }
        catch (NoSuchFieldError var17_21) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-3721820947546689115L, (long)var11)[m44.a("h", (long)-3537997184891573627L, (long)var11).ordinal()] = (CallSite)((int)var0_5[0]);
        }
        catch (NoSuchFieldError var17_22) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-3721820947546689115L, (long)var11)[m44.a("h", (long)-3342780870583285669L, (long)var11).ordinal()] = (CallSite)((int)var0_5[4]);
        }
        catch (NoSuchFieldError var17_23) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-3721820947546689115L, (long)var11)[m44.a("h", (long)-3588470849766335083L, (long)var11).ordinal()] = (CallSite)((int)var0_5[6]);
        }
        catch (NoSuchFieldError var17_24) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-3721820947546689115L, (long)var11)[m44.a("h", (long)-3775428401584134647L, (long)var11).ordinal()] = (CallSite)((int)var0_5[2]);
        }
        catch (NoSuchFieldError var17_25) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-3721820947546689115L, (long)var11)[m44.a("h", (long)-3658357926528649225L, (long)var11).ordinal()] = (CallSite)((int)var0_5[3]);
        }
        catch (NoSuchFieldError var17_26) {
            // empty catch block
        }
    }
}
