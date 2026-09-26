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

public class y4
extends Enum {
    public static final y4 o;
    public static final y4 W;
    private static final y4[] N;
    public static final y4 T;
    public static final y4 v;
    public static final y4 U;
    private static final long a;

    public static y4[] Z(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (y4[])((Enum)((Object)m44.a("m", (long)8371869747353531627L, (long)l))).clone();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private y4() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                y4.a = prr.a((long)1344581696339107812L, (long)-1359580430368836673L, MethodHandles.lookup().lookupClass()).a(37436586645949L);
                var9 = y4.a ^ 67773116245169L;
                var1_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var9 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new String[5];
                var6_4 = 0;
                var5_5 = "(\u00d5\u00d0\u00e9\u00f9\u0004\u008f\u00ee\u001a\u001bm#a\u0017\u0083w\u0081\u00d1\u00bd\u0012pFO\u00f7\u0018\\\u001d\u00f8-\u000b-k\u009f\u00fb\u00912r\u001bq\u00b3u4\u00cao{jG\u00a3k\u0018\u0081\u0091\u0000*\u00c89\u001a\u00a6\u00f06\u0088m\u001d\u00ccw\u0016\u00eb'\u00d1q\\\u00e2\u0080\u00e6";
                var7_6 = "(\u00d5\u00d0\u00e9\u00f9\u0004\u008f\u00ee\u001a\u001bm#a\u0017\u0083w\u0081\u00d1\u00bd\u0012pFO\u00f7\u0018\\\u001d\u00f8-\u000b-k\u009f\u00fb\u00912r\u001bq\u00b3u4\u00cao{jG\u00a3k\u0018\u0081\u0091\u0000*\u00c89\u001a\u00a6\u00f06\u0088m\u001d\u00ccw\u0016\u00eb'\u00d1q\\\u00e2\u0080\u00e6".length();
                var4_7 = 24;
                var3_8 = -1;
lbl19:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = y4.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00ba\u0089\u00bfx\u00f5;}\u00ec\u0007~m]VI\u000bN.\u00d2\u0005\u001c=\u0094\u0088\u009c \u0081\u0091\u0000*\u00c89\u001a\u00a6\u00f06\u0088m\u001d\u00ccw\u0016c\u00fb\u00d4\u00ed=\u00ef N\u00c7,\u00ba\u00b9\u0093\u00ae\u00a3\t";
                    var7_6 = "\u00ba\u0089\u00bfx\u00f5;}\u00ec\u0007~m]VI\u000bN.\u00d2\u0005\u001c=\u0094\u0088\u009c \u0081\u0091\u0000*\u00c89\u001a\u00a6\u00f06\u0088m\u001d\u00ccw\u0016c\u00fb\u00d4\u00ed=\u00ef N\u00c7,\u00ba\u00b9\u0093\u00ae\u00a3\t".length();
                    var4_7 = 24;
                    var3_8 = -1;
lbl33:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl38:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = y4.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var1_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        y4.T = new y4(var0_3[1], 0);
        y4.v = new y4(var0_3[0], 1);
        y4.W = new y4(var0_3[2], 2);
        y4.o = new y4(var0_3[4], 3);
        y4.U = new y4(var0_3[3], 4);
        y4.N = new y4[]{m44.a("j", (long)-5635427465836227355L, (long)var9), m44.a("j", (long)-6033111865905814217L, (long)var9), m44.a("j", (long)-5653650952258491885L, (long)var9), m44.a("j", (long)-5472081496010934228L, (long)var9), m44.a("j", (long)-5667073442561704563L, (long)var9)};
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
