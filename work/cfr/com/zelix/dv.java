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

public class dv
extends Enum {
    public static final dv h;
    public static final dv w;
    private static final dv[] u;
    public static final dv i;
    public static final dv t;
    public static final dv U;
    public static final dv v;
    public static final dv r;
    public static final dv a;
    public static final dv T;
    public static final dv c;
    public static final dv S;
    public static final dv K;
    public static final dv P;
    private static final long b;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dv() {
        void var2_-1;
        void var1_-1;
    }

    public static dv[] N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return (dv[])((Enum)((Object)m44.a("n", (long)-5181656714731952020L, (long)l10))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        dv.b = prr.a(6214112427139287940L, -8746915072613685655L, MethodHandles.lookup().lookupClass()).a(101406282560289L);
                        var20 = dv.b ^ 113341927412342L;
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
                        var11_3 = new String[13];
                        var17_4 = 0;
                        var16_5 = "k\u00e2\u009f\u00a7\u00e6\u00fbi.\b\u00929\u00d9\u0080\u00b7Y\u00e0\u00aa\b\u00b0\u007f\u00a77\u0004\u00beB\u00d1\b\u00cdG\u00efi\u00aa\\\u00d0\b\b\u00ael 7\u00af\u0080=\u00f7\u0010\u00fb\u00ce\u00ce\u00e2\u00d8B\u00f6\u00ea\u00a05\u00c0i\u00a2\u00feU\u00ac\u0010\u00d0\u000e\u0010l\u00a4\u008e\u00cdVA\u0003\u008b\u008c\\\u0019\u001c?\b\u008a\u00c7!r\u00fdI\u0095\u00e5\b\u00c8\u001e\u00c6\"v\u00aa#\u00a7\b\u0085\u00b8\u00c2j\u009a\u00a8\u00ac\u00ae\u0010{R\u00edL\u00b1\u00b0\u00a1\u00c5\u00e9DU\u00e0n\u0013l\u009e";
                        var18_6 = "k\u00e2\u009f\u00a7\u00e6\u00fbi.\b\u00929\u00d9\u0080\u00b7Y\u00e0\u00aa\b\u00b0\u007f\u00a77\u0004\u00beB\u00d1\b\u00cdG\u00efi\u00aa\\\u00d0\b\b\u00ael 7\u00af\u0080=\u00f7\u0010\u00fb\u00ce\u00ce\u00e2\u00d8B\u00f6\u00ea\u00a05\u00c0i\u00a2\u00feU\u00ac\u0010\u00d0\u000e\u0010l\u00a4\u008e\u00cdVA\u0003\u008b\u008c\\\u0019\u001c?\b\u008a\u00c7!r\u00fdI\u0095\u00e5\b\u00c8\u001e\u00c6\"v\u00aa#\u00a7\b\u0085\u00b8\u00c2j\u009a\u00a8\u00ac\u00ae\u0010{R\u00edL\u00b1\u00b0\u00a1\u00c5\u00e9DU\u00e0n\u0013l\u009e".length();
                        var15_7 = 8;
                        var14_8 = -1;
lbl19:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_8;
                            v4 = var16_5.substring(v3, v3 + var15_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl24:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = dv.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u000f\u009a\u00f4R\u001b\u00ca\u0082o\b\u00a5.\u00df$1_\u0015\u00fc";
                            var18_6 = "\u000f\u009a\u00f4R\u001b\u00ca\u0082o\b\u00a5.\u00df$1_\u0015\u00fc".length();
                            var15_7 = 8;
                            var14_8 = -1;
lbl33:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_8;
                                v4 = var16_5.substring(v6, v6 + var15_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl38:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = dv.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var12_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                var0_12 = new long[15];
                var4_13 = 0;
                var5_14 = ":\u0006\u0092\u00cfh\u00c0\u0082\u00e9\u00a68\"\u0004\u00e4\u00b9\u00ef\u0095\"\u0097\u00ea\u001f\u0012\u00f5f\u00bb\u0080pRo\u00d0]j\u0089\u001c\u00a4\u009c&\u0006\u00fdr\u00f2\u00a4f\u009d\u00e6\u00c4\\\u00f8\u001e\u001a\u00ce\u000b\u009f4?\u00bd\u00bc\u00dalY\u009bp\u00da\u0004Tt\u0090\u0090\u00edmvd\u0016\u0084!\u00d9-\u00da/\u00ae\u00ed%r)8\u00bd\u00d6\u00e7\u00c9\u00f4Dt\u0086\u00ea0NcX\u00b3%\nK\u00a9\u00a6\u00c3";
                var6_15 = ":\u0006\u0092\u00cfh\u00c0\u0082\u00e9\u00a68\"\u0004\u00e4\u00b9\u00ef\u0095\"\u0097\u00ea\u001f\u0012\u00f5f\u00bb\u0080pRo\u00d0]j\u0089\u001c\u00a4\u009c&\u0006\u00fdr\u00f2\u00a4f\u009d\u00e6\u00c4\\\u00f8\u001e\u001a\u00ce\u000b\u009f4?\u00bd\u00bc\u00dalY\u009bp\u00da\u0004Tt\u0090\u0090\u00edmvd\u0016\u0084!\u00d9-\u00da/\u00ae\u00ed%r)8\u00bd\u00d6\u00e7\u00c9\u00f4Dt\u0086\u00ea0NcX\u00b3%\nK\u00a9\u00a6\u00c3".length();
                var3_16 = 0;
                while (true) {
                    var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
                    v10 = var0_12;
                    v11 = var4_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl74:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_16 < var6_15) ** continue;
                    var5_14 = "\u00f5\u00c7\u0010\u0091\u00d3|\u00db\u00e6\u00a0\u0001\t\u0081\u00feA\u00bf\u00ce";
                    var6_15 = "\u00f5\u00c7\u0010\u0091\u00d3|\u00db\u00e6\u00a0\u0001\t\u0081\u00feA\u00bf\u00ce".length();
                    var3_16 = 0;
                    while (true) {
                        var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
                        v10 = var0_12;
                        v11 = var4_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl87:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_16 < var6_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var1_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl100:
                // 1 sources

                ** continue;
            }
        }
        dv.K = new dv(var11_3[11], 0);
        dv.T = new dv(var11_3[5], 1);
        dv.i = new dv(var11_3[1], 2);
        dv.P = new dv(var11_3[2], 3);
        dv.U = new dv(var11_3[9], 4);
        dv.h = new dv(var11_3[10], 5);
        dv.v = new dv(var11_3[6], (int)var0_12[4]);
        dv.w = new dv(var11_3[12], (int)var0_12[7]);
        dv.t = new dv(var11_3[3], (int)var0_12[8]);
        dv.r = new dv(var11_3[0], (int)var0_12[9]);
        dv.S = new dv(var11_3[7], (int)var0_12[12]);
        dv.c = new dv(var11_3[8], (int)var0_12[1]);
        dv.a = new dv(var11_3[4], (int)var0_12[13]);
        v15 = new dv[(int)var0_12[10]];
        v15[0] = m44.a("j", (long)6879355930420886731L, (long)var20);
        v15[1] = m44.a("j", (long)6385512845687063021L, (long)var20);
        v15[2] = m44.a("j", (long)6593068613174742808L, (long)var20);
        v15[3] = m44.a("j", (long)6416096327199037461L, (long)var20);
        v15[4] = m44.a("j", (long)6849194581161488685L, (long)var20);
        v15[5] = m44.a("j", (long)6653344082055516736L, (long)var20);
        v15[(int)var0_12[3]] = m44.a("j", (long)6465655600938855781L, (long)var20);
        v15[(int)var0_12[5]] = m44.a("j", (long)6562734566815590972L, (long)var20);
        v15[(int)var0_12[11]] = m44.a("j", (long)6714628090326275494L, (long)var20);
        v15[(int)var0_12[14]] = m44.a("j", (long)5111274557580871031L, (long)var20);
        v15[(int)var0_12[0]] = m44.a("j", (long)5163825627762229862L, (long)var20);
        v15[(int)var0_12[6]] = m44.a("j", (long)4763354985663254646L, (long)var20);
        v15[(int)var0_12[2]] = m44.a("j", (long)6477795675097619604L, (long)var20);
        dv.u = v15;
    }

    private static String a(byte[] byArray) {
        int n10 = 0;
        int n11 = byArray.length;
        char[] cArray = new char[n11];
        for (int i10 = 0; i10 < n11; ++i10) {
            char c10;
            int n12 = 0xFF & byArray[i10];
            if (n12 < 192) {
                cArray[n10++] = (char)n12;
                continue;
            }
            if (n12 < 224) {
                c10 = (char)((char)(n12 & 0x1F) << 6);
                n12 = byArray[++i10];
                c10 = (char)(c10 | (char)(n12 & 0x3F));
                cArray[n10++] = c10;
                continue;
            }
            if (i10 >= n11 - 2) continue;
            c10 = (char)((char)(n12 & 0xF) << 12);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F) << 6);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F));
            cArray[n10++] = c10;
        }
        return new String(cArray, 0, n10);
    }
}

