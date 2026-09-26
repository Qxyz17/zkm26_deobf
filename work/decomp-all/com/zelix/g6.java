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

public class g6
extends Enum {
    private static final g6[] I;
    public static final g6 K;
    public static final g6 P;
    public static final g6 u;
    public static final g6 d;
    public static final g6 O;
    public static final g6 A;
    public static final g6 L;
    public static final g6 V;
    private static final long a;

    public static g6[] M(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (g6[])((Enum)((Object)m44.a("l", (long)-1015448180011277074L, (long)l))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        g6.a = prr.a((long)-7977752438433089297L, (long)6567619194879682231L, MethodHandles.lookup().lookupClass()).a(26821230416941L);
                        var20 = g6.a ^ 30933209531399L;
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
                        var11_3 = new String[8];
                        var17_4 = 0;
                        var16_5 = "%\u00cfa\u0085\u0005\u00d5D\u00a3'\u000e\u00ce~-\u0093\u00f1\u00b0\u009fp?\u00d0P\u0083\u00c2c\u0018]\u0096\u009c\u00e0\u0092\u0099Z\u0095\u0003\u008e\u008b[\u00d7\u00d3:\u00c0t\u00da\u00b7\u00a3\u00db\u00db%\u0013\u0018\u00cd\u00d3\u00b4\u00f23\u00dc\u000b\u00b4\u00a2*\u0014\u0083\u00c0\u0018\u00f6\u0088\u00cb_vhiu\u00f5\u00f7\u0018\u001a\u0019\u00d3_\u00de\u00a0\u00141~\u000bL\u0001-\u00ef0\u001e0D\u00deC\u00a4\u001a\u00de\u0001(\u00b8\u0097\u00b8\u008b\u00d3\u00c7\u0090\u0011\u0092\u0086\u00c0\u00f3\u00a7\u00e1\u00cf#\u00a1!\u00aa\rj\u0014C\u00af\u00a5\u0081wr\u00e5\u00d4\u0085!?Z\u00f7\u0096\u00b5]U\u00db\u0018}\u0004/&$\b\u0000Ofit\u00c7\u0010\u00d5\u00e8\u00de\u00de\u0093\u0013\u00e4m\u00de\u0002\u00e2";
                        var18_6 = "%\u00cfa\u0085\u0005\u00d5D\u00a3'\u000e\u00ce~-\u0093\u00f1\u00b0\u009fp?\u00d0P\u0083\u00c2c\u0018]\u0096\u009c\u00e0\u0092\u0099Z\u0095\u0003\u008e\u008b[\u00d7\u00d3:\u00c0t\u00da\u00b7\u00a3\u00db\u00db%\u0013\u0018\u00cd\u00d3\u00b4\u00f23\u00dc\u000b\u00b4\u00a2*\u0014\u0083\u00c0\u0018\u00f6\u0088\u00cb_vhiu\u00f5\u00f7\u0018\u001a\u0019\u00d3_\u00de\u00a0\u00141~\u000bL\u0001-\u00ef0\u001e0D\u00deC\u00a4\u001a\u00de\u0001(\u00b8\u0097\u00b8\u008b\u00d3\u00c7\u0090\u0011\u0092\u0086\u00c0\u00f3\u00a7\u00e1\u00cf#\u00a1!\u00aa\rj\u0014C\u00af\u00a5\u0081wr\u00e5\u00d4\u0085!?Z\u00f7\u0096\u00b5]U\u00db\u0018}\u0004/&$\b\u0000Ofit\u00c7\u0010\u00d5\u00e8\u00de\u00de\u0093\u0013\u00e4m\u00de\u0002\u00e2".length();
                        var15_7 = 24;
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
                            var11_3[var17_4++] = g6.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u00ad\u00feP &\u0013\u00cc\u00d2\u00fc\u00df\u0004\u008c\u0003\u001ds:(OK\u0095\u00ab\u00c6o\u008b\u0018\u00fbI\u00eb5N\u00cb\u00c3\t\u009fK=\u00bd(\u00bfz\u00e9\u00e7\u00e6\u00d3\u00caq\u00f3\u00e6\u0096";
                            var18_6 = "\u00ad\u00feP &\u0013\u00cc\u00d2\u00fc\u00df\u0004\u008c\u0003\u001ds:(OK\u0095\u00ab\u00c6o\u008b\u0018\u00fbI\u00eb5N\u00cb\u00c3\t\u009fK=\u00bd(\u00bfz\u00e9\u00e7\u00e6\u00d3\u00caq\u00f3\u00e6\u0096".length();
                            var15_7 = 24;
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
                            var11_3[var17_4++] = g6.a(var19_9).intern();
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
                var0_12 = new long[5];
                var4_13 = 0;
                var5_14 = "N\u00d4&\u00ca\u00ac\u0098\u00da\u00fe\u001f\u0083o\u0014\u00a9\u0084\u0096\u0010m#\u0081\u00e3HX\u00c5\u00fc";
                var6_15 = "N\u00d4&\u00ca\u00ac\u0098\u00da\u00fe\u001f\u0083o\u0014\u00a9\u0084\u0096\u0010m#\u0081\u00e3HX\u00c5\u00fc".length();
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
                    var5_14 = "8\u00ee\u00d63+\u001d\u00b8\u00b2\u00a8\u001caR\u00e0\u0094\u00bfH";
                    var6_15 = "8\u00ee\u00d63+\u001d\u00b8\u00b2\u00a8\u001caR\u00e0\u0094\u00bfH".length();
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
        g6.O = new g6(var11_3[1], 0);
        g6.u = new g6(var11_3[4], 1);
        g6.P = new g6(var11_3[0], 2);
        g6.d = new g6(var11_3[3], 3);
        g6.K = new g6(var11_3[5], 4);
        g6.L = new g6(var11_3[2], 5);
        g6.V = new g6(var11_3[6], (int)var0_12[3]);
        g6.A = new g6(var11_3[7], (int)var0_12[1]);
        v15 = new g6[(int)var0_12[0]];
        v15[0] = m44.a("l", (long)-6865781360461274159L, (long)var20);
        v15[1] = m44.a("l", (long)-4843382614654366789L, (long)var20);
        v15[2] = m44.a("l", (long)-6460116455631959481L, (long)var20);
        v15[3] = m44.a("l", (long)-6802570867655448486L, (long)var20);
        v15[4] = m44.a("l", (long)-4899825298240858089L, (long)var20);
        v15[5] = m44.a("l", (long)-6600752165479811117L, (long)var20);
        v15[(int)var0_12[4]] = m44.a("l", (long)-4785009382767015388L, (long)var20);
        v15[(int)var0_12[2]] = m44.a("l", (long)-6378508545788537748L, (long)var20);
        g6.I = v15;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private g6() {
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
