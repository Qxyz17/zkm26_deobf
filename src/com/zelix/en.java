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

public class en {
    static final int[] y;

    /*
     * Unable to fully structure code
     */
    static {
        block43: {
            block42: {
                var11 = prr.a((long)-7774021065019651321L, (long)-9116351732798831390L, MethodHandles.lookup().lookupClass()).a(188162622435126L) ^ 75383491013920L;
                var13_1 = var11 ^ 75103678440904L;
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
                var5_6 = "\u00bb9\u0095\r1\u009d\u00c7\u00d6\u0001[b\u0016\u0082[\nm\u00f5\u00d2\u00e9\u00ae\u00b0?\u00e2\u00a4\u00f71?\u00fa\u00c0\u0002x\u0012\u00de\u001dV,\u00a6!\u0003`m\u009c\u008e\u00bf\u00dd\u000e0{\u00d1\u009c$\u0084\u00f9\u00a8\u00a8Z[\u009c\u0096v9\u00f5\":\u008fb\u00dfG\u0098O@\\dy\u00da7\u00d7J\u00d2\u00e3";
                var6_7 = "\u00bb9\u0095\r1\u009d\u00c7\u00d6\u0001[b\u0016\u0082[\nm\u00f5\u00d2\u00e9\u00ae\u00b0?\u00e2\u00a4\u00f71?\u00fa\u00c0\u0002x\u0012\u00de\u001dV,\u00a6!\u0003`m\u009c\u008e\u00bf\u00dd\u000e0{\u00d1\u009c$\u0084\u00f9\u00a8\u00a8Z[\u009c\u0096v9\u00f5\":\u008fb\u00dfG\u0098O@\\dy\u00da7\u00d7J\u00d2\u00e3".length();
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
                    var5_6 = "N\u00bc3M\u00f77\u0018\u00d5ud\u009fE{:.\u0003";
                    var6_7 = "N\u00bc3M\u00f77\u0018\u00d5ud\u009fE{:.\u0003".length();
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
        en.y = new int[((CallSite)m44.a("j", (Object)v8, (long)3396495644470101786L, (long)var11)).length];
        try {
            en.y[va.Q.ordinal()] = 1;
        }
        catch (NoSuchFieldError var15_12) {
            // empty catch block
        }
        try {
            en.y[m44.a("n", (long)3394962222545141737L, (long)var11).ordinal()] = 2;
        }
        catch (NoSuchFieldError var15_13) {
            // empty catch block
        }
        try {
            en.y[m44.a("n", (long)3837780503300046146L, (long)var11).ordinal()] = 3;
        }
        catch (NoSuchFieldError var15_14) {
            // empty catch block
        }
        try {
            en.y[m44.a("n", (long)3095994861948274885L, (long)var11).ordinal()] = 4;
        }
        catch (NoSuchFieldError var15_15) {
            // empty catch block
        }
        try {
            en.y[m44.a("n", (long)3498835644532967115L, (long)var11).ordinal()] = 5;
        }
        catch (NoSuchFieldError var15_16) {
            // empty catch block
        }
        try {
            en.y[m44.a("n", (long)3693382084758933032L, (long)var11).ordinal()] = (int)var0_4[7];
        }
        catch (NoSuchFieldError var15_17) {
            // empty catch block
        }
        try {
            en.y[m44.a("n", (long)4031510980839045959L, (long)var11).ordinal()] = (int)var0_4[9];
        }
        catch (NoSuchFieldError var15_18) {
            // empty catch block
        }
        try {
            en.y[m44.a("n", (long)3941411394530046661L, (long)var11).ordinal()] = (int)var0_4[11];
        }
        catch (NoSuchFieldError var15_19) {
            // empty catch block
        }
        try {
            en.y[m44.a("n", (long)3495131969377506366L, (long)var11).ordinal()] = (int)var0_4[3];
        }
        catch (NoSuchFieldError var15_20) {
            // empty catch block
        }
        try {
            en.y[m44.a("n", (long)3119276506650945784L, (long)var11).ordinal()] = (int)var0_4[1];
        }
        catch (NoSuchFieldError var15_21) {
            // empty catch block
        }
        try {
            en.y[m44.a("n", (long)3934330374854152553L, (long)var11).ordinal()] = (int)var0_4[6];
        }
        catch (NoSuchFieldError var15_22) {
            // empty catch block
        }
        try {
            en.y[m44.a("n", (long)3096923566431589872L, (long)var11).ordinal()] = (int)var0_4[2];
        }
        catch (NoSuchFieldError var15_23) {
            // empty catch block
        }
        try {
            en.y[m44.a("n", (long)3054170352775588570L, (long)var11).ordinal()] = (int)var0_4[10];
        }
        catch (NoSuchFieldError var15_24) {
            // empty catch block
        }
        try {
            en.y[m44.a("n", (long)3060997163937543314L, (long)var11).ordinal()] = (int)var0_4[8];
        }
        catch (NoSuchFieldError var15_25) {
            // empty catch block
        }
        try {
            en.y[m44.a("n", (long)2931373525733373667L, (long)var11).ordinal()] = (int)var0_4[5];
        }
        catch (NoSuchFieldError var15_26) {
            // empty catch block
        }
        try {
            en.y[m44.a("n", (long)3000736463919163748L, (long)var11).ordinal()] = (int)var0_4[4];
        }
        catch (NoSuchFieldError var15_27) {
            // empty catch block
        }
        try {
            en.y[m44.a("n", (long)2995264800802025837L, (long)var11).ordinal()] = (int)var0_4[0];
        }
        catch (NoSuchFieldError var15_28) {
            // empty catch block
        }
    }
}
