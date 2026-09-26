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

public class fw {
    static final int[] a;

    /*
     * Unable to fully structure code
     */
    static {
        block33: {
            block32: {
                var11 = prr.a((long)-8223410681716712569L, (long)-3381002468292368820L, MethodHandles.lookup().lookupClass()).a(78925587778616L) ^ 60878320102827L;
                var13_1 = var11 ^ 121570826082818L;
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
                var5_6 = "m\u00b4\u00acH\u00bfw\u00df\u000e\u00f6W\u00c9Eb\u00f6\u00dbHL\u00e2,\u00181\u00df\u0016\u0087^L\u00a3\u00c8\u0019\u00c9\u00bb\u00d11\u008a\u0099\u0093,\u00ff\u00ef\u00e9";
                var6_7 = "m\u00b4\u00acH\u00bfw\u00df\u000e\u00f6W\u00c9Eb\u00f6\u00dbHL\u00e2,\u00181\u00df\u0016\u0087^L\u00a3\u00c8\u0019\u00c9\u00bb\u00d11\u008a\u0099\u0093,\u00ff\u00ef\u00e9".length();
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
                    var5_6 = "*\u001d\u0099\u00c4Y\u00fc\u0013\u009bo!\u0088\u009d\u00aa\u00cfqF";
                    var6_7 = "*\u001d\u0099\u00c4Y\u00fc\u0013\u009bo!\u0088\u009d\u00aa\u00cfqF".length();
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
        fw.a = new int[((CallSite)m44.a("n", (Object)v8, (long)-9160071552760258182L, (long)var11)).length];
        try {
            m44.a("j", (long)-7199409358472252575L, (long)var11)[m44.a("j", (long)-8696718325676268626L, (long)var11).ordinal()] = (CallSite)true;
        }
        catch (NoSuchFieldError var15_12) {
            // empty catch block
        }
        try {
            m44.a("j", (long)-7199409358472252575L, (long)var11)[m44.a("j", (long)-8993525711135412865L, (long)var11).ordinal()] = (CallSite)2;
        }
        catch (NoSuchFieldError var15_13) {
            // empty catch block
        }
        try {
            m44.a("j", (long)-7199409358472252575L, (long)var11)[fh.T.ordinal()] = (CallSite)3;
        }
        catch (NoSuchFieldError var15_14) {
            // empty catch block
        }
        try {
            m44.a("j", (long)-7199409358472252575L, (long)var11)[m44.a("j", (long)-9058126487762030243L, (long)var11).ordinal()] = (CallSite)4;
        }
        catch (NoSuchFieldError var15_15) {
            // empty catch block
        }
        try {
            m44.a("j", (long)-7199409358472252575L, (long)var11)[m44.a("j", (long)-7114347115826668787L, (long)var11).ordinal()] = (CallSite)5;
        }
        catch (NoSuchFieldError var15_16) {
            // empty catch block
        }
        try {
            m44.a("j", (long)-7199409358472252575L, (long)var11)[m44.a("j", (long)-9042110021996627797L, (long)var11).ordinal()] = (CallSite)((int)var0_4[6]);
        }
        catch (NoSuchFieldError var15_17) {
            // empty catch block
        }
        try {
            m44.a("j", (long)-7199409358472252575L, (long)var11)[m44.a("j", (long)-7480548962635826973L, (long)var11).ordinal()] = (CallSite)((int)var0_4[0]);
        }
        catch (NoSuchFieldError var15_18) {
            // empty catch block
        }
        try {
            m44.a("j", (long)-7199409358472252575L, (long)var11)[m44.a("j", (long)-7162562061401585323L, (long)var11).ordinal()] = (CallSite)((int)var0_4[3]);
        }
        catch (NoSuchFieldError var15_19) {
            // empty catch block
        }
        try {
            m44.a("j", (long)-7199409358472252575L, (long)var11)[fh.U.ordinal()] = (CallSite)((int)var0_4[2]);
        }
        catch (NoSuchFieldError var15_20) {
            // empty catch block
        }
        try {
            m44.a("j", (long)-7199409358472252575L, (long)var11)[m44.a("j", (long)-8939341429091945212L, (long)var11).ordinal()] = (CallSite)((int)var0_4[4]);
        }
        catch (NoSuchFieldError var15_21) {
            // empty catch block
        }
        try {
            m44.a("j", (long)-7199409358472252575L, (long)var11)[fh.u.ordinal()] = (CallSite)((int)var0_4[1]);
        }
        catch (NoSuchFieldError var15_22) {
            // empty catch block
        }
        try {
            m44.a("j", (long)-7199409358472252575L, (long)var11)[fh.b.ordinal()] = (CallSite)((int)var0_4[5]);
        }
        catch (NoSuchFieldError var15_23) {
            // empty catch block
        }
    }
}
