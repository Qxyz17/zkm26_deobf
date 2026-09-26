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

public class uv
extends Enum {
    public static final uv Y;
    public static final uv v;
    public static final uv C;
    public static final uv h;
    public static final uv g;
    private static final uv[] V;
    public static final uv x;
    public static final uv R;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private uv() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        var20 = prr.a((long)-7743667903500526588L, (long)2060637094219218898L, MethodHandles.lookup().lookupClass()).a(165418444713907L) ^ 109733973490355L;
                        var12_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var13_2 = 1; var13_2 < 8; ++var13_2) {
                            v2 = v2;
                            v2[var13_2] = (byte)(var20 << var13_2 * 8 >>> 56);
                        }
                        var12_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var11_3 = new String[7];
                        var17_4 = 0;
                        var16_5 = "GBa\u00e9\u00a2\u00e6dO \u00f5V+!X\\^r\u00e1\u00ef\u00cd\u0095\u00b8\u00cc\u009c\u0013\b\u00ae\u00a7\u00ff\t\u00df\u00ca\u008d\u0086\u0018\u00d4D\u00e3\u00ef\u00b9[\u0010\u00f9\u000f\u0088\u00f3\u00df\u00fe\u00ad\u00d9\f\"\u00ae\u0090\u00b4\u00a1g\u00f0(\u00f5V+!X\\^r\u00e1\u00ef\u00cd\u0095\u00b8\u00cc\u009c\u0013\b\u00ae\u00a7\u00ff\t\u00df\u00ca\u008d,\u0086\u00dc\u0085\u00e3Q\u00d52K\u008b\u00f2.\u00aaD\u00f0\u00bd\b\u00d8\u0081\u00c1A\u00b8\u00ae\u001dn";
                        var18_6 = "GBa\u00e9\u00a2\u00e6dO \u00f5V+!X\\^r\u00e1\u00ef\u00cd\u0095\u00b8\u00cc\u009c\u0013\b\u00ae\u00a7\u00ff\t\u00df\u00ca\u008d\u0086\u0018\u00d4D\u00e3\u00ef\u00b9[\u0010\u00f9\u000f\u0088\u00f3\u00df\u00fe\u00ad\u00d9\f\"\u00ae\u0090\u00b4\u00a1g\u00f0(\u00f5V+!X\\^r\u00e1\u00ef\u00cd\u0095\u00b8\u00cc\u009c\u0013\b\u00ae\u00a7\u00ff\t\u00df\u00ca\u008d,\u0086\u00dc\u0085\u00e3Q\u00d52K\u008b\u00f2.\u00aaD\u00f0\u00bd\b\u00d8\u0081\u00c1A\u00b8\u00ae\u001dn".length();
                        var15_7 = 8;
                        var14_8 = -1;
lbl18:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_8;
                            v4 = var16_5.substring(v3, v3 + var15_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl23:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = uv.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "E\u0001T\u00a9(\u00a25\u00e0\b\u00d4\u00e3]\u0093\u00db\u00d0f ";
                            var18_6 = "E\u0001T\u00a9(\u00a25\u00e0\b\u00d4\u00e3]\u0093\u00db\u00d0f ".length();
                            var15_7 = 8;
                            var14_8 = -1;
lbl32:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_8;
                                v4 = var16_5.substring(v6, v6 + var15_7);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl37:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = uv.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            break block14;
                            break;
                        }
                    }
                    var19_9 = var12_1.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl49:
                        // 1 sources

                        ** continue;
                    }
                }
                var1_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var2_11 = 1; var2_11 < 8; ++var2_11) {
                    v9 = v9;
                    v9[var2_11] = (byte)(var20 << var2_11 * 8 >>> 56);
                }
                var1_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var0_12 = new long[3];
                var4_13 = 0;
                var5_14 = "(\u00f9\u009bA`\u0005^\u001e\u0083$W0kC\u00af\u00e9l\u00f4\u00f8Z<OQ\u008d";
                var6_15 = "(\u00f9\u009bA`\u0005^\u001e\u0083$W0kC\u00af\u00e9l\u00f4\u00f8Z<OQ\u008d".length();
                var3_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl68:
                // 1 sources

                while (true) {
                    var0_12[v10] = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
                    if (var3_16 < var6_15) ** continue;
                    break block16;
                    break;
                }
            }
            var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
            v10 = var4_13++;
            var8_18 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
            var10_19 = var1_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            ** while (true)
        }
        uv.C = new uv(var11_3[6], 0);
        uv.x = new uv(var11_3[1], 1);
        uv.R = new uv(var11_3[3], 2);
        uv.g = new uv(var11_3[4], 3);
        uv.h = new uv(var11_3[2], 4);
        uv.Y = new uv(var11_3[5], 5);
        uv.v = new uv(var11_3[0], (int)var0_12[1]);
        v11 = new uv[(int)var0_12[2]];
        v11[0] = m44.a("h", (long)5134857975652141911L, (long)var20);
        v11[1] = m44.a("h", (long)4851124120656088614L, (long)var20);
        v11[2] = m44.a("h", (long)6685893617636312458L, (long)var20);
        v11[3] = m44.a("h", (long)6574482913470380823L, (long)var20);
        v11[4] = m44.a("h", (long)4972150586916751736L, (long)var20);
        v11[5] = m44.a("h", (long)6559053359861451132L, (long)var20);
        v11[(int)var0_12[0]] = m44.a("h", (long)4901873235116123087L, (long)var20);
        uv.V = v11;
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
