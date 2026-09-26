/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ou
extends Enum {
    private static final ou[] W;
    public static final ou d;
    public static final ou F;
    public static final ou P;
    public static final ou B;
    public static final ou k;
    public static final ou w;
    private static final long a;

    public static ou[] Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (ou[])((Enum)((Object)m44.a("i", (long)-6542397884825454466L, (long)l))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    ou.a = prr.a((long)-3783705178523544591L, (long)1436074540937928637L, MethodHandles.lookup().lookupClass()).a(178810094244897L);
                    var16 = ou.a ^ 13149061381205L;
                    var8_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var16 >>> 56);
                    for (var9_2 = 1; var9_2 < 8; ++var9_2) {
                        v2 = v2;
                        v2[var9_2] = (byte)(var16 << var9_2 * 8 >>> 56);
                    }
                    var8_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var7_3 = new String[6];
                    var13_4 = 0;
                    var12_5 = "\u0004['\u0019\u00can\u0096\u009b\u00cd#\u00dfX\u001b~\u00b4\u009fW\u0016\u008d\u0094}>\u00b4\u0097\u0018\u0004['\u0019\u00can\u0096\u009b\u00cd#\u00dfX\u001b~\u00b4\u009f\u00bd\u001d\u0016\u0089\u0011@\u00a4m\u0010\u00db\u00e0%v\u0011\u00d8\u00bb\u00b7\u00cd\u00edp:\u00b8z/\u0019\u0010\u00013j\u0098\u00c45\u00e9\u0098\u0091%\u0099R\u00fe\u00eb\u0001\u00a9";
                    var14_6 = "\u0004['\u0019\u00can\u0096\u009b\u00cd#\u00dfX\u001b~\u00b4\u009fW\u0016\u008d\u0094}>\u00b4\u0097\u0018\u0004['\u0019\u00can\u0096\u009b\u00cd#\u00dfX\u001b~\u00b4\u009f\u00bd\u001d\u0016\u0089\u0011@\u00a4m\u0010\u00db\u00e0%v\u0011\u00d8\u00bb\u00b7\u00cd\u00edp:\u00b8z/\u0019\u0010\u00013j\u0098\u00c45\u00e9\u0098\u0091%\u0099R\u00fe\u00eb\u0001\u00a9".length();
                    var11_7 = 24;
                    var10_8 = -1;
lbl19:
                    // 2 sources

                    while (true) {
                        v3 = ++var10_8;
                        v4 = var12_5.substring(v3, v3 + var11_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl24:
                    // 1 sources

                    while (true) {
                        var7_3[var13_4++] = ou.a(var15_9).intern();
                        if ((var10_8 += var11_7) < var14_6) {
                            var11_7 = var12_5.charAt(var10_8);
                            ** continue;
                        }
                        var12_5 = "\u00a7\u00ef\u0004m\u00e1\u0006v\u00b1\u0018\u00faXi\u00c8\u000bO\u0096\u00ea\u00db\u00f1\bn\u00a6\u0005\u009a4w\u0005V\u009b'\u0095\u00fe\u00bf";
                        var14_6 = "\u00a7\u00ef\u0004m\u00e1\u0006v\u00b1\u0018\u00faXi\u00c8\u000bO\u0096\u00ea\u00db\u00f1\bn\u00a6\u0005\u009a4w\u0005V\u009b'\u0095\u00fe\u00bf".length();
                        var11_7 = 8;
                        var10_8 = -1;
lbl33:
                        // 2 sources

                        while (true) {
                            v6 = ++var10_8;
                            v4 = var12_5.substring(v6, v6 + var11_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl38:
                    // 1 sources

                    while (true) {
                        var7_3[var13_4++] = ou.a(var15_9).intern();
                        if ((var10_8 += var11_7) < var14_6) {
                            var11_7 = var12_5.charAt(var10_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var15_9 = var8_1.doFinal(v4.getBytes("ISO-8859-1"));
                switch (v5) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl50:
                    // 1 sources

                    ** continue;
                }
            }
            var2_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var16 >>> 56);
            for (var3_11 = 1; var3_11 < 8; ++var3_11) {
                v9 = v9;
                v9[var3_11] = (byte)(var16 << var3_11 * 8 >>> 56);
            }
            break block14;
lbl62:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var4_13 = -7494327760525839216L;
        var6_14 = var2_10.doFinal(new byte[]{(byte)(var4_13 >>> 56), (byte)(var4_13 >>> 48), (byte)(var4_13 >>> 40), (byte)(var4_13 >>> 32), (byte)(var4_13 >>> 24), (byte)(var4_13 >>> 16), (byte)(var4_13 >>> 8), (byte)var4_13});
        ** while (true)
        var0_12 = ((long)var6_14[0] & 255L) << 56 | ((long)var6_14[1] & 255L) << 48 | ((long)var6_14[2] & 255L) << 40 | ((long)var6_14[3] & 255L) << 32 | ((long)var6_14[4] & 255L) << 24 | ((long)var6_14[5] & 255L) << 16 | ((long)var6_14[6] & 255L) << 8 | (long)var6_14[7] & 255L;
        ou.k = new ou(var7_3[4], 0);
        ou.B = new ou(var7_3[3], 1);
        ou.F = new ou(var7_3[5], 2);
        ou.w = new ou(var7_3[0], 3);
        ou.d = new ou(var7_3[1], 4);
        ou.P = new ou(var7_3[2], 5);
        v10 = new ou[(int)var0_12];
        v10[0] = m44.a("l", (long)-2294077077155267110L, (long)var16);
        v10[1] = m44.a("l", (long)-165648261135853515L, (long)var16);
        v10[2] = m44.a("l", (long)-269800693961614507L, (long)var16);
        v10[3] = m44.a("l", (long)-1852391404668491239L, (long)var16);
        v10[4] = m44.a("l", (long)-462794612814775744L, (long)var16);
        v10[5] = m44.a("l", (long)-242203059153859891L, (long)var16);
        ou.W = v10;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ou() {
        void var2_-1;
        void var1_-1;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }
}
