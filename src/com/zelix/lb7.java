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

public class lb7 {
    static final int[] I;

    /*
     * Unable to fully structure code
     */
    static {
        block53: {
            block52: {
                var11 = prr.a((long)-7852796070463877000L, (long)3838660539738583451L, MethodHandles.lookup().lookupClass()).a(146808856187401L) ^ 79119798500046L;
                var13_1 = var11 ^ 53538471899372L;
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
                var0_4 = new long[17];
                var4_5 = 0;
                var5_6 = "\u0095\u00d0\u00ae\u00bc\u00dc^\u0091\u00c1\u00aa@\u0087\b\u00ca\u00a3\u00b4\u0011\u00c9\n\u0082b\u0081\u00bd\f1\u0013C\u00f6\u00b9\u00d8\u00db\u009e\u00d6o\u00a4\u00af5:\n\tZ\u0014\u00a9Zc\u00d6\u00a4N\u001e\u0088\u00ef\u00d1\u00b5K\u00af\u00fe@\u00bb\u0003\u00b2y\u00c4 \u00d299\u009c\u00c7\u0001z\n\u009f\u0095\u0006\n\u00b4}\"Y`\u0010v\u00e6@\u00a1eK\u0006\u00e3\u00b1\u00e8z2\u0098\u00d7l\u0006\u00e3@\u0094\u00e1\t\u00ee\u00da\u00caPb\u0002\u00e7\u0004;;%O<\u00f0\u00d4\u00cb\u008e/2";
                var6_7 = "\u0095\u00d0\u00ae\u00bc\u00dc^\u0091\u00c1\u00aa@\u0087\b\u00ca\u00a3\u00b4\u0011\u00c9\n\u0082b\u0081\u00bd\f1\u0013C\u00f6\u00b9\u00d8\u00db\u009e\u00d6o\u00a4\u00af5:\n\tZ\u0014\u00a9Zc\u00d6\u00a4N\u001e\u0088\u00ef\u00d1\u00b5K\u00af\u00fe@\u00bb\u0003\u00b2y\u00c4 \u00d299\u009c\u00c7\u0001z\n\u009f\u0095\u0006\n\u00b4}\"Y`\u0010v\u00e6@\u00a1eK\u0006\u00e3\u00b1\u00e8z2\u0098\u00d7l\u0006\u00e3@\u0094\u00e1\t\u00ee\u00da\u00caPb\u0002\u00e7\u0004;;%O<\u00f0\u00d4\u00cb\u008e/2".length();
                var3_8 = 0;
                while (true) {
                    var7_9 = var5_6.substring(var3_8, var3_8 += 8).getBytes("ISO-8859-1");
                    v3 = var0_4;
                    v4 = var4_5++;
                    v5 = ((long)var7_9[0] & 255L) << 56 | ((long)var7_9[1] & 255L) << 48 | ((long)var7_9[2] & 255L) << 40 | ((long)var7_9[3] & 255L) << 32 | ((long)var7_9[4] & 255L) << 24 | ((long)var7_9[5] & 255L) << 16 | ((long)var7_9[6] & 255L) << 8 | (long)var7_9[7] & 255L;
                    v6 = -1;
                    break block52;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_8 < var6_7) ** continue;
                    var5_6 = "\u009b\u001c\u0003\u0004\u00ad\u008f\u0006\u0087\u0097X\u00d9\u00aak\u00f2i\u00a7";
                    var6_7 = "\u009b\u001c\u0003\u0004\u00ad\u008f\u0006\u0087\u0097X\u00d9\u00aak\u00f2i\u00a7".length();
                    var3_8 = 0;
                    while (true) {
                        var7_9 = var5_6.substring(var3_8, var3_8 += 8).getBytes("ISO-8859-1");
                        v3 = var0_4;
                        v4 = var4_5++;
                        v5 = ((long)var7_9[0] & 255L) << 56 | ((long)var7_9[1] & 255L) << 48 | ((long)var7_9[2] & 255L) << 40 | ((long)var7_9[3] & 255L) << 32 | ((long)var7_9[4] & 255L) << 24 | ((long)var7_9[5] & 255L) << 16 | ((long)var7_9[6] & 255L) << 8 | (long)var7_9[7] & 255L;
                        v6 = 0;
                        break block52;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_8 < var6_7) ** continue;
                    break block53;
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
        lb7.I = new int[((CallSite)m44.a("l", (Object)v8, (long)-288450671899332377L, (long)var11)).length];
        try {
            m44.a("h", (long)-139879254088028192L, (long)var11)[m44.a("h", (long)-1034413103397471L, (long)var11).ordinal()] = (CallSite)true;
        }
        catch (NoSuchFieldError var15_12) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-139879254088028192L, (long)var11)[m44.a("h", (long)-2209744481088038902L, (long)var11).ordinal()] = (CallSite)2;
        }
        catch (NoSuchFieldError var15_13) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-139879254088028192L, (long)var11)[m44.a("h", (long)-27658798257404045L, (long)var11).ordinal()] = (CallSite)3;
        }
        catch (NoSuchFieldError var15_14) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-139879254088028192L, (long)var11)[m44.a("h", (long)-269971333597187146L, (long)var11).ordinal()] = (CallSite)4;
        }
        catch (NoSuchFieldError var15_15) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-139879254088028192L, (long)var11)[m44.a("h", (long)-1904332820048353511L, (long)var11).ordinal()] = (CallSite)5;
        }
        catch (NoSuchFieldError var15_16) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-139879254088028192L, (long)var11)[m44.a("h", (long)-2287667605002678724L, (long)var11).ordinal()] = (CallSite)((int)var0_4[14]);
        }
        catch (NoSuchFieldError var15_17) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-139879254088028192L, (long)var11)[m44.a("h", (long)-218229972316398303L, (long)var11).ordinal()] = (CallSite)((int)var0_4[6]);
        }
        catch (NoSuchFieldError var15_18) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-139879254088028192L, (long)var11)[m44.a("h", (long)-119199317066401445L, (long)var11).ordinal()] = (CallSite)((int)var0_4[3]);
        }
        catch (NoSuchFieldError var15_19) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-139879254088028192L, (long)var11)[m44.a("h", (long)-4183929527709009L, (long)var11).ordinal()] = (CallSite)((int)var0_4[7]);
        }
        catch (NoSuchFieldError var15_20) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-139879254088028192L, (long)var11)[m44.a("h", (long)-419203522328464635L, (long)var11).ordinal()] = (CallSite)((int)var0_4[4]);
        }
        catch (NoSuchFieldError var15_21) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-139879254088028192L, (long)var11)[m44.a("h", (long)-1814051148462884548L, (long)var11).ordinal()] = (CallSite)((int)var0_4[9]);
        }
        catch (NoSuchFieldError var15_22) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-139879254088028192L, (long)var11)[m44.a("h", (long)-1956034931499840682L, (long)var11).ordinal()] = (CallSite)((int)var0_4[1]);
        }
        catch (NoSuchFieldError var15_23) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-139879254088028192L, (long)var11)[m44.a("h", (long)-2288811375976783960L, (long)var11).ordinal()] = (CallSite)((int)var0_4[13]);
        }
        catch (NoSuchFieldError var15_24) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-139879254088028192L, (long)var11)[m44.a("h", (long)-2056733660395826389L, (long)var11).ordinal()] = (CallSite)((int)var0_4[2]);
        }
        catch (NoSuchFieldError var15_25) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-139879254088028192L, (long)var11)[m44.a("h", (long)-2167522348787021325L, (long)var11).ordinal()] = (CallSite)((int)var0_4[11]);
        }
        catch (NoSuchFieldError var15_26) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-139879254088028192L, (long)var11)[m44.a("h", (long)-258465161452774382L, (long)var11).ordinal()] = (CallSite)((int)var0_4[5]);
        }
        catch (NoSuchFieldError var15_27) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-139879254088028192L, (long)var11)[m44.a("h", (long)-2038729343935342549L, (long)var11).ordinal()] = (CallSite)((int)var0_4[8]);
        }
        catch (NoSuchFieldError var15_28) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-139879254088028192L, (long)var11)[m44.a("h", (long)-1902151576108642502L, (long)var11).ordinal()] = (CallSite)((int)var0_4[10]);
        }
        catch (NoSuchFieldError var15_29) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-139879254088028192L, (long)var11)[m44.a("h", (long)-305351654816357269L, (long)var11).ordinal()] = (CallSite)((int)var0_4[16]);
        }
        catch (NoSuchFieldError var15_30) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-139879254088028192L, (long)var11)[m44.a("h", (long)-124864835756384541L, (long)var11).ordinal()] = (CallSite)((int)var0_4[12]);
        }
        catch (NoSuchFieldError var15_31) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-139879254088028192L, (long)var11)[m44.a("h", (long)-111573918413106061L, (long)var11).ordinal()] = (CallSite)((int)var0_4[0]);
        }
        catch (NoSuchFieldError var15_32) {
            // empty catch block
        }
        try {
            m44.a("h", (long)-139879254088028192L, (long)var11)[m44.a("h", (long)-396604956873824831L, (long)var11).ordinal()] = (CallSite)((int)var0_4[15]);
        }
        catch (NoSuchFieldError var15_33) {
            // empty catch block
        }
    }
}
