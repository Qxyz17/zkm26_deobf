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

public class r7 {
    static final int[] S;

    /*
     * Unable to fully structure code
     */
    static {
        block43: {
            block42: {
                var11 = prr.a((long)-3336658938041278215L, (long)-6642490530080425074L, MethodHandles.lookup().lookupClass()).a(7838099396043L) ^ 63758392918359L;
                var13_1 = var11 ^ 48106037263942L;
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
                var5_6 = "L\u00abB\u000b7\u00b6\u00e9e\u00a6\u00d5R\u0086\u0092\u00ac<\u00e7\u00ad\u00d9\u00d5\u00c8cU#\u008dX\u00a0L jcz\u00af\u00ddO\u00e3\u00e1\u00f1\u00a4\u008c\u008aD2jz\u0006\u009b\u0014\u00cd !\u00c2j\u0091\u00d7\u00d7\n\u00ed\u00a0\u00a9\u000e7,\u0018\u00f3\u00e4\u008f\u00cf#f\u0094\u00f1\u0087\u00e2,l\u00c7\u00f6\u00dc\u0005\u00e3";
                var6_7 = "L\u00abB\u000b7\u00b6\u00e9e\u00a6\u00d5R\u0086\u0092\u00ac<\u00e7\u00ad\u00d9\u00d5\u00c8cU#\u008dX\u00a0L jcz\u00af\u00ddO\u00e3\u00e1\u00f1\u00a4\u008c\u008aD2jz\u0006\u009b\u0014\u00cd !\u00c2j\u0091\u00d7\u00d7\n\u00ed\u00a0\u00a9\u000e7,\u0018\u00f3\u00e4\u008f\u00cf#f\u0094\u00f1\u0087\u00e2,l\u00c7\u00f6\u00dc\u0005\u00e3".length();
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
                    var5_6 = ":\u00d6\u00af\u008f9\u00faR\u0092\u0091\u00e4\u00f03\bk\u00fcd";
                    var6_7 = ":\u00d6\u00af\u008f9\u00faR\u0092\u0091\u00e4\u00f03\bk\u00fcd".length();
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
        r7.S = new int[((CallSite)m44.a("l", (Object)v8, (long)3795594703787613332L, (long)var11)).length];
        try {
            m44.a("h", (long)3728503874259306017L, (long)var11)[m44.a("h", (long)2940825263384630694L, (long)var11).ordinal()] = (CallSite)true;
        }
        catch (NoSuchFieldError var15_12) {
            // empty catch block
        }
        try {
            m44.a("h", (long)3728503874259306017L, (long)var11)[m44.a("h", (long)3259721337357461835L, (long)var11).ordinal()] = (CallSite)2;
        }
        catch (NoSuchFieldError var15_13) {
            // empty catch block
        }
        try {
            m44.a("h", (long)3728503874259306017L, (long)var11)[m44.a("h", (long)3514930841479721846L, (long)var11).ordinal()] = (CallSite)3;
        }
        catch (NoSuchFieldError var15_14) {
            // empty catch block
        }
        try {
            m44.a("h", (long)3728503874259306017L, (long)var11)[m44.a("h", (long)3102799329070124976L, (long)var11).ordinal()] = (CallSite)4;
        }
        catch (NoSuchFieldError var15_15) {
            // empty catch block
        }
        try {
            m44.a("h", (long)3728503874259306017L, (long)var11)[m44.a("h", (long)3249315449210800871L, (long)var11).ordinal()] = (CallSite)5;
        }
        catch (NoSuchFieldError var15_16) {
            // empty catch block
        }
        try {
            m44.a("h", (long)3728503874259306017L, (long)var11)[va.Q.ordinal()] = (CallSite)((int)var0_4[0]);
        }
        catch (NoSuchFieldError var15_17) {
            // empty catch block
        }
        try {
            m44.a("h", (long)3728503874259306017L, (long)var11)[m44.a("h", (long)3205615629984817353L, (long)var11).ordinal()] = (CallSite)((int)var0_4[4]);
        }
        catch (NoSuchFieldError var15_18) {
            // empty catch block
        }
        try {
            m44.a("h", (long)3728503874259306017L, (long)var11)[m44.a("h", (long)3098533674624015685L, (long)var11).ordinal()] = (CallSite)((int)var0_4[9]);
        }
        catch (NoSuchFieldError var15_19) {
            // empty catch block
        }
        try {
            m44.a("h", (long)3728503874259306017L, (long)var11)[m44.a("h", (long)3372323685104772812L, (long)var11).ordinal()] = (CallSite)((int)var0_4[6]);
        }
        catch (NoSuchFieldError var15_20) {
            // empty catch block
        }
        try {
            m44.a("h", (long)3728503874259306017L, (long)var11)[m44.a("h", (long)3564952471544304459L, (long)var11).ordinal()] = (CallSite)((int)var0_4[11]);
        }
        catch (NoSuchFieldError var15_21) {
            // empty catch block
        }
        try {
            m44.a("h", (long)3728503874259306017L, (long)var11)[m44.a("h", (long)3788437310932804711L, (long)var11).ordinal()] = (CallSite)((int)var0_4[2]);
        }
        catch (NoSuchFieldError var15_22) {
            // empty catch block
        }
        try {
            m44.a("h", (long)3728503874259306017L, (long)var11)[m44.a("h", (long)3563495322877480574L, (long)var11).ordinal()] = (CallSite)((int)var0_4[3]);
        }
        catch (NoSuchFieldError var15_23) {
            // empty catch block
        }
        try {
            m44.a("h", (long)3728503874259306017L, (long)var11)[m44.a("h", (long)3597523224573243732L, (long)var11).ordinal()] = (CallSite)((int)var0_4[10]);
        }
        catch (NoSuchFieldError var15_24) {
            // empty catch block
        }
        try {
            m44.a("h", (long)3728503874259306017L, (long)var11)[m44.a("h", (long)3599703475227307804L, (long)var11).ordinal()] = (CallSite)((int)var0_4[5]);
        }
        catch (NoSuchFieldError var15_25) {
            // empty catch block
        }
        try {
            m44.a("h", (long)3728503874259306017L, (long)var11)[m44.a("h", (long)3684009633569205613L, (long)var11).ordinal()] = (CallSite)((int)var0_4[1]);
        }
        catch (NoSuchFieldError var15_26) {
            // empty catch block
        }
        try {
            m44.a("h", (long)3728503874259306017L, (long)var11)[m44.a("h", (long)3614893398309647082L, (long)var11).ordinal()] = (CallSite)((int)var0_4[8]);
        }
        catch (NoSuchFieldError var15_27) {
            // empty catch block
        }
        try {
            m44.a("h", (long)3728503874259306017L, (long)var11)[m44.a("h", (long)3611674667545864931L, (long)var11).ordinal()] = (CallSite)((int)var0_4[7]);
        }
        catch (NoSuchFieldError var15_28) {
            // empty catch block
        }
    }
}
