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

public class y2 {
    static final int[] u;

    /*
     * Unable to fully structure code
     */
    static {
        block37: {
            block36: {
                var11 = prr.a((long)8369238195751052350L, (long)1424701866328194085L, MethodHandles.lookup().lookupClass()).a(71265386426836L) ^ 11962303191487L;
                var13_1 = var11 ^ 21063192086602L;
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
                var0_4 = new long[9];
                var4_5 = 0;
                var5_6 = "\u00f6\u00fd\u00be\u00f1\u00e5$<\u0013\u00b2),\u00a9\u0007g2P\u00bdi9\u009323\"\u00aa\u00db)\u00d2\\Akd\u00c3H'T\u0086\u00c0\u00df\u0003\u00ca\u0010\u00dfb]\u00db.\u00bdM\u00dc\u00d1\u00a1I5\u00da\u00df\u00fb";
                var6_7 = "\u00f6\u00fd\u00be\u00f1\u00e5$<\u0013\u00b2),\u00a9\u0007g2P\u00bdi9\u009323\"\u00aa\u00db)\u00d2\\Akd\u00c3H'T\u0086\u00c0\u00df\u0003\u00ca\u0010\u00dfb]\u00db.\u00bdM\u00dc\u00d1\u00a1I5\u00da\u00df\u00fb".length();
                var3_8 = 0;
                while (true) {
                    var7_9 = var5_6.substring(var3_8, var3_8 += 8).getBytes("ISO-8859-1");
                    v3 = var0_4;
                    v4 = var4_5++;
                    v5 = ((long)var7_9[0] & 255L) << 56 | ((long)var7_9[1] & 255L) << 48 | ((long)var7_9[2] & 255L) << 40 | ((long)var7_9[3] & 255L) << 32 | ((long)var7_9[4] & 255L) << 24 | ((long)var7_9[5] & 255L) << 16 | ((long)var7_9[6] & 255L) << 8 | (long)var7_9[7] & 255L;
                    v6 = -1;
                    break block36;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_8 < var6_7) ** continue;
                    var5_6 = "\u00ef\u0004\u00f3h\u0001\u00b4\u009f@\"\u0013\u009ag(X\u00f2@";
                    var6_7 = "\u00ef\u0004\u00f3h\u0001\u00b4\u009f@\"\u0013\u009ag(X\u00f2@".length();
                    var3_8 = 0;
                    while (true) {
                        var7_9 = var5_6.substring(var3_8, var3_8 += 8).getBytes("ISO-8859-1");
                        v3 = var0_4;
                        v4 = var4_5++;
                        v5 = ((long)var7_9[0] & 255L) << 56 | ((long)var7_9[1] & 255L) << 48 | ((long)var7_9[2] & 255L) << 40 | ((long)var7_9[3] & 255L) << 32 | ((long)var7_9[4] & 255L) << 24 | ((long)var7_9[5] & 255L) << 16 | ((long)var7_9[6] & 255L) << 8 | (long)var7_9[7] & 255L;
                        v6 = 0;
                        break block36;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_8 < var6_7) ** continue;
                    break block37;
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
        y2.u = new int[((CallSite)m44.a("h", (Object)v8, (long)189311357802998424L, (long)var11)).length];
        try {
            m44.a("l", (long)221610678282444130L, (long)var11)[va.Q.ordinal()] = (CallSite)true;
        }
        catch (NoSuchFieldError var15_12) {
            // empty catch block
        }
        try {
            m44.a("l", (long)221610678282444130L, (long)var11)[m44.a("l", (long)188873287829967467L, (long)var11).ordinal()] = (CallSite)2;
        }
        catch (NoSuchFieldError var15_13) {
            // empty catch block
        }
        try {
            m44.a("l", (long)221610678282444130L, (long)var11)[m44.a("l", (long)1783670018900775104L, (long)var11).ordinal()] = (CallSite)3;
        }
        catch (NoSuchFieldError var15_14) {
            // empty catch block
        }
        try {
            m44.a("l", (long)221610678282444130L, (long)var11)[m44.a("l", (long)537469364905616711L, (long)var11).ordinal()] = (CallSite)4;
        }
        catch (NoSuchFieldError var15_15) {
            // empty catch block
        }
        try {
            m44.a("l", (long)221610678282444130L, (long)var11)[m44.a("l", (long)2093060148147448649L, (long)var11).ordinal()] = (CallSite)5;
        }
        catch (NoSuchFieldError var15_16) {
            // empty catch block
        }
        try {
            m44.a("l", (long)221610678282444130L, (long)var11)[m44.a("l", (long)2216844235944960938L, (long)var11).ordinal()] = (CallSite)((int)var0_4[4]);
        }
        catch (NoSuchFieldError var15_17) {
            // empty catch block
        }
        try {
            m44.a("l", (long)221610678282444130L, (long)var11)[m44.a("l", (long)1905192546065798853L, (long)var11).ordinal()] = (CallSite)((int)var0_4[5]);
        }
        catch (NoSuchFieldError var15_18) {
            // empty catch block
        }
        try {
            m44.a("l", (long)221610678282444130L, (long)var11)[m44.a("l", (long)1959316121700392775L, (long)var11).ordinal()] = (CallSite)((int)var0_4[1]);
        }
        catch (NoSuchFieldError var15_19) {
            // empty catch block
        }
        try {
            m44.a("l", (long)221610678282444130L, (long)var11)[m44.a("l", (long)2090623934484298172L, (long)var11).ordinal()] = (CallSite)((int)var0_4[0]);
        }
        catch (NoSuchFieldError var15_20) {
            // empty catch block
        }
        try {
            m44.a("l", (long)221610678282444130L, (long)var11)[m44.a("l", (long)489680777548694906L, (long)var11).ordinal()] = (CallSite)((int)var0_4[6]);
        }
        catch (NoSuchFieldError var15_21) {
            // empty catch block
        }
        try {
            m44.a("l", (long)221610678282444130L, (long)var11)[m44.a("l", (long)1953396514867920107L, (long)var11).ordinal()] = (CallSite)((int)var0_4[3]);
        }
        catch (NoSuchFieldError var15_22) {
            // empty catch block
        }
        try {
            m44.a("l", (long)221610678282444130L, (long)var11)[m44.a("l", (long)538229586412370034L, (long)var11).ordinal()] = (CallSite)((int)var0_4[2]);
        }
        catch (NoSuchFieldError var15_23) {
            // empty catch block
        }
        try {
            m44.a("l", (long)221610678282444130L, (long)var11)[m44.a("l", (long)567665377760364376L, (long)var11).ordinal()] = (CallSite)((int)var0_4[7]);
        }
        catch (NoSuchFieldError var15_24) {
            // empty catch block
        }
        try {
            m44.a("l", (long)221610678282444130L, (long)var11)[m44.a("l", (long)372677089261017953L, (long)var11).ordinal()] = (CallSite)((int)var0_4[8]);
        }
        catch (NoSuchFieldError var15_25) {
            // empty catch block
        }
    }
}
