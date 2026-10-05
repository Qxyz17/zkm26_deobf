/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ess;
import com.zelix.x44;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _fj {
    static final int[] L;

    /*
     * Unable to fully structure code
     */
    static {
        block53: {
            block52: {
                var11 = ess.a(-8793718955903716064L, 7455274242493079206L, MethodHandles.lookup().lookupClass()).a(177323478174675L) ^ 118494879121481L;
                var13_1 = var11 ^ 63885221456438L;
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
                var5_6 = "<%1\u000e\u0012D\u0090j\u00f0I\u008bGD\u00f1\u00fe\u00b3P:\u0097\u00f3)\u00fe\u00bd\u00b47\u00dc \u0016Y\u00e0\u00bd?\u00f1!\u00f2`F\u0016|j\u00db\u0086U\u001a\u00f3\u00f9\u00faDf\u001cx\u008b\u00daz\u0086\u0011\u00f3=(\u00bf\u0097*\u00cdI<\u000f\u00ea\u00f4\u008e9k\u00bc\u00f5\u00f6:_\u00a6`\u00d1\u0096\u0016\u00cbSHP\u00c5\u0005p\u00b6\u00d0\u000b\f\"\r\u00ca\u009fO\f7\u009b\u00aeO\u00f5\u0013\u0092\u00d5\u00e9\u00fdR#\u00f3\u00b2#\u001c\u00132Tf7\u000f";
                var6_7 = "<%1\u000e\u0012D\u0090j\u00f0I\u008bGD\u00f1\u00fe\u00b3P:\u0097\u00f3)\u00fe\u00bd\u00b47\u00dc \u0016Y\u00e0\u00bd?\u00f1!\u00f2`F\u0016|j\u00db\u0086U\u001a\u00f3\u00f9\u00faDf\u001cx\u008b\u00daz\u0086\u0011\u00f3=(\u00bf\u0097*\u00cdI<\u000f\u00ea\u00f4\u008e9k\u00bc\u00f5\u00f6:_\u00a6`\u00d1\u0096\u0016\u00cbSHP\u00c5\u0005p\u00b6\u00d0\u000b\f\"\r\u00ca\u009fO\f7\u009b\u00aeO\u00f5\u0013\u0092\u00d5\u00e9\u00fdR#\u00f3\u00b2#\u001c\u00132Tf7\u000f".length();
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
                    var5_6 = "\u0084\u00bb6\u00f2S\u00ea\u00e6\u00dc\u0087\u00c5_r\u00be\u00c7\u008f'";
                    var6_7 = "\u0084\u00bb6\u00f2S\u00ea\u00e6\u00dc\u0087\u00c5_r\u00be\u00c7\u008f'".length();
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
        _fj.L = new int[((CallSite)x44.a("u", (Object)v8, (long)2070577681328345974L, (long)var11)).length];
        try {
            x44.a("l", (long)2056347273114886287L, (long)var11)[x44.a("l", (long)106817344446484699L, (long)var11).ordinal()] = (CallSite)true;
        }
        catch (NoSuchFieldError var15_12) {
            // empty catch block
        }
        try {
            x44.a("l", (long)2056347273114886287L, (long)var11)[x44.a("l", (long)452464842346744566L, (long)var11).ordinal()] = (CallSite)2;
        }
        catch (NoSuchFieldError var15_13) {
            // empty catch block
        }
        try {
            x44.a("l", (long)2056347273114886287L, (long)var11)[x44.a("l", (long)1897808128963929882L, (long)var11).ordinal()] = (CallSite)3;
        }
        catch (NoSuchFieldError var15_14) {
            // empty catch block
        }
        try {
            x44.a("l", (long)2056347273114886287L, (long)var11)[x44.a("l", (long)2036875472518121757L, (long)var11).ordinal()] = (CallSite)4;
        }
        catch (NoSuchFieldError var15_15) {
            // empty catch block
        }
        try {
            x44.a("l", (long)2056347273114886287L, (long)var11)[x44.a("l", (long)267432136217420171L, (long)var11).ordinal()] = (CallSite)5;
        }
        catch (NoSuchFieldError var15_16) {
            // empty catch block
        }
        try {
            x44.a("l", (long)2056347273114886287L, (long)var11)[x44.a("l", (long)2217376255224172915L, (long)var11).ordinal()] = (CallSite)((int)var0_4[9]);
        }
        catch (NoSuchFieldError var15_17) {
            // empty catch block
        }
        try {
            x44.a("l", (long)2056347273114886287L, (long)var11)[x44.a("l", (long)237611506030771710L, (long)var11).ordinal()] = (CallSite)((int)var0_4[6]);
        }
        catch (NoSuchFieldError var15_18) {
            // empty catch block
        }
        try {
            x44.a("l", (long)2056347273114886287L, (long)var11)[x44.a("l", (long)100193554644538030L, (long)var11).ordinal()] = (CallSite)((int)var0_4[12]);
        }
        catch (NoSuchFieldError var15_19) {
            // empty catch block
        }
        try {
            x44.a("l", (long)2056347273114886287L, (long)var11)[x44.a("l", (long)2049179321035039803L, (long)var11).ordinal()] = (CallSite)((int)var0_4[4]);
        }
        catch (NoSuchFieldError var15_20) {
            // empty catch block
        }
        try {
            x44.a("l", (long)2056347273114886287L, (long)var11)[x44.a("l", (long)571932542247161180L, (long)var11).ordinal()] = (CallSite)((int)var0_4[11]);
        }
        catch (NoSuchFieldError var15_21) {
            // empty catch block
        }
        try {
            x44.a("l", (long)2056347273114886287L, (long)var11)[x44.a("l", (long)47206861414241909L, (long)var11).ordinal()] = (CallSite)((int)var0_4[1]);
        }
        catch (NoSuchFieldError var15_22) {
            // empty catch block
        }
        try {
            x44.a("l", (long)2056347273114886287L, (long)var11)[x44.a("l", (long)131177437538533821L, (long)var11).ordinal()] = (CallSite)((int)var0_4[0]);
        }
        catch (NoSuchFieldError var15_23) {
            // empty catch block
        }
        try {
            x44.a("l", (long)2056347273114886287L, (long)var11)[x44.a("l", (long)1888689546559164714L, (long)var11).ordinal()] = (CallSite)((int)var0_4[2]);
        }
        catch (NoSuchFieldError var15_24) {
            // empty catch block
        }
        try {
            x44.a("l", (long)2056347273114886287L, (long)var11)[x44.a("l", (long)472540599564333988L, (long)var11).ordinal()] = (CallSite)((int)var0_4[10]);
        }
        catch (NoSuchFieldError var15_25) {
            // empty catch block
        }
        try {
            x44.a("l", (long)2056347273114886287L, (long)var11)[x44.a("l", (long)76097026488275463L, (long)var11).ordinal()] = (CallSite)((int)var0_4[3]);
        }
        catch (NoSuchFieldError var15_26) {
            // empty catch block
        }
        try {
            x44.a("l", (long)2056347273114886287L, (long)var11)[x44.a("l", (long)2150150637955679912L, (long)var11).ordinal()] = (CallSite)((int)var0_4[8]);
        }
        catch (NoSuchFieldError var15_27) {
            // empty catch block
        }
        try {
            x44.a("l", (long)2056347273114886287L, (long)var11)[x44.a("l", (long)2249297027021995098L, (long)var11).ordinal()] = (CallSite)((int)var0_4[7]);
        }
        catch (NoSuchFieldError var15_28) {
            // empty catch block
        }
        try {
            x44.a("l", (long)2056347273114886287L, (long)var11)[x44.a("l", (long)116687341486044537L, (long)var11).ordinal()] = (CallSite)((int)var0_4[5]);
        }
        catch (NoSuchFieldError var15_29) {
            // empty catch block
        }
        try {
            x44.a("l", (long)2056347273114886287L, (long)var11)[x44.a("l", (long)1790801691252267784L, (long)var11).ordinal()] = (CallSite)((int)var0_4[13]);
        }
        catch (NoSuchFieldError var15_30) {
            // empty catch block
        }
        try {
            x44.a("l", (long)2056347273114886287L, (long)var11)[x44.a("l", (long)554063187983001556L, (long)var11).ordinal()] = (CallSite)((int)var0_4[15]);
        }
        catch (NoSuchFieldError var15_31) {
            // empty catch block
        }
        try {
            x44.a("l", (long)2056347273114886287L, (long)var11)[x44.a("l", (long)2171092726337558684L, (long)var11).ordinal()] = (CallSite)((int)var0_4[14]);
        }
        catch (NoSuchFieldError var15_32) {
            // empty catch block
        }
        try {
            x44.a("l", (long)2056347273114886287L, (long)var11)[x44.a("l", (long)105921781736125843L, (long)var11).ordinal()] = (CallSite)((int)var0_4[16]);
        }
        catch (NoSuchFieldError var15_33) {
            // empty catch block
        }
    }
}
