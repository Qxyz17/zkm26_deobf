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

public class va
extends Enum {
    public static final va Q;
    public static final va k;
    final int p;
    public static final va R;
    public static final va N;
    public static final va b;
    public static final va V;
    public static final va L;
    private static int B;
    public static final va e;
    public static final va g;
    private static final va[] O;
    public static final va u;
    public static final va w;
    public static final va y;
    public static final va t;
    public static final va G;
    public static final va P;
    public static final va C;
    public static final va U;
    public static final va i;
    private static final long a;

    int g() {
        return this.p;
    }

    public static void s(int n) {
        B = n;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    block19: {
                        va.a = prr.a((long)5457282760289901036L, (long)-1363443221191383621L, MethodHandles.lookup().lookupClass()).a(246925132998904L);
                        var20 = va.a ^ 127719898012522L;
                        if (m44.a("o", (long)538240050733735431L, (long)var20) == false) {
                            m44.a("o", (int)39, (long)455658206403172420L, (long)var20);
                        }
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
                        var11_3 = new String[18];
                        var17_4 = 0;
                        var16_5 = "\u00c1\u00f8A\b\u00d5 :8;\u009a\u00cf\u00f1\u00b3\u00c77?\b\u0098\u00af\u001fP\r=\u00d5\u008d\u0010H\u00bb}\u00aa\u008c\u00af\u008e;I\u00bc\u008c\"\u00f61\u0081(\b_ \u00c8\b(\u0095V\u001a\by\u00a9'Q\u0098\u009c[\u00a8\u0010\u001f\u00fb\u0088\u00a9a\u001a\u00d7\u00e3y\u0003\u008b\u00dbk\u008b\u0098?\b\u0082\u00f1\u00c4\u00b6e\u00d3\u00e5L\u0010\u00e9\u00d2A\u00c7\u00c2H\tB\u0002t_\u00f1NiG%\b\u0003\u00cc\u0013\u00abZVy|\b\u008bht\u00cd\u00e4u\u00b4K\bY5\u0092c\u00a7\u00df\u00c7\u00f7\u0010\u0094\u00d0\u00c1\u009f3\u000ezr\u00c3\n;\u00c1\u00f62\u00ad4\u00181\u00b6\u00fa\"\u00ec\u00cf\u008d\u009d\u0097c\u00eb\u00a1b\u00fb&\u00c1)rJ\t\u00eb\n\u00c0\u00ed\u0010\u00fb`\u00e50\u0094\u0091\u00a6!W,\u007f\r\u00cc\u00b5\u00bc\u00c2\b\u00a9&\u00aa\u00e1\"\u00a5\b\u009d\b\u008e\u000b\u00d9\u00e6\u001c\u00a7\u00d8\u00e9";
                        var18_6 = "\u00c1\u00f8A\b\u00d5 :8;\u009a\u00cf\u00f1\u00b3\u00c77?\b\u0098\u00af\u001fP\r=\u00d5\u008d\u0010H\u00bb}\u00aa\u008c\u00af\u008e;I\u00bc\u008c\"\u00f61\u0081(\b_ \u00c8\b(\u0095V\u001a\by\u00a9'Q\u0098\u009c[\u00a8\u0010\u001f\u00fb\u0088\u00a9a\u001a\u00d7\u00e3y\u0003\u008b\u00dbk\u008b\u0098?\b\u0082\u00f1\u00c4\u00b6e\u00d3\u00e5L\u0010\u00e9\u00d2A\u00c7\u00c2H\tB\u0002t_\u00f1NiG%\b\u0003\u00cc\u0013\u00abZVy|\b\u008bht\u00cd\u00e4u\u00b4K\bY5\u0092c\u00a7\u00df\u00c7\u00f7\u0010\u0094\u00d0\u00c1\u009f3\u000ezr\u00c3\n;\u00c1\u00f62\u00ad4\u00181\u00b6\u00fa\"\u00ec\u00cf\u008d\u009d\u0097c\u00eb\u00a1b\u00fb&\u00c1)rJ\t\u00eb\n\u00c0\u00ed\u0010\u00fb`\u00e50\u0094\u0091\u00a6!W,\u007f\r\u00cc\u00b5\u00bc\u00c2\b\u00a9&\u00aa\u00e1\"\u00a5\b\u009d\b\u008e\u000b\u00d9\u00e6\u001c\u00a7\u00d8\u00e9".length();
                        var15_7 = 16;
                        var14_8 = -1;
lbl21:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_8;
                            v4 = var16_5.substring(v3, v3 + var15_7);
                            v5 = -1;
                            break block19;
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = va.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "1\u00ab\u00f8\u00c1\u007fo\u00b2\u00a5\u00b1\u00c9e}\u00eaL\u00c2!\u0090s\r\u009f\u00cfG\f\u0018\b\u0005\u0091\u009bc$\u00e8T(";
                            var18_6 = "1\u00ab\u00f8\u00c1\u007fo\u00b2\u00a5\u00b1\u00c9e}\u00eaL\u00c2!\u0090s\r\u009f\u00cfG\f\u0018\b\u0005\u0091\u009bc$\u00e8T(".length();
                            var15_7 = 24;
                            var14_8 = -1;
lbl35:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_8;
                                v4 = var16_5.substring(v6, v6 + var15_7);
                                v5 = 0;
                                break block19;
                                break;
                            }
                            break;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = va.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            break block20;
                            break;
                        }
                    }
                    var19_9 = var12_1.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl52:
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
                var0_12 = new long[28];
                var4_13 = 0;
                var5_14 = "\u00b2t\u009e,\f\u0014h\u00cfu\u0013<\u00e0\u00b7\u00b6\u00dd\u00fe\u0010\u00b9\u0017\u008b\u0087'\u0000\u0000\u0080\u0017\t\u00d1r\u00a9\u00c9\u00da\u00c8\u00fc\u0016\u00fd\u00c2\u0082GJx\u00e9m\u0095\u00e4T\n\u00df_S7\u0085Ph\u001b\"\u0011\u00d5\u00ce\u00b0\u000b\u009a\u00cee\u00c3\u00ecK\u00d5o\n\u00f2\u00b4`\u00f2v\u00f9\fK\u00c6m2\u008b!\u0083!u5\u0086\u00b4\rR\u00dd\u00d1\u00b0\u009b\u008c\u001cJ\u00b2<\u00e07\u00ef\u00fdtV\u00b6k\u00f2$\u00cen\u00ab\u00f2I\u00e8E\u00ea\u00c0\u008c\u007f2\u0083\u0098g\u0017\u0096U)\u00d8 k4\u00de\u0010k$Jf\u0016 \u00c5]\u00dc\u00cfy\u00bd\u00d3\u00b8I\u00bd\u00aa\u00fd\u00d5\u008dy\u0016Km\u00b5]\u00a2\u00afx\u00f8d\u0085\u0015&\u0016\u000b\u0083\u00dd\u0017\u001a4V,\u009a\u00cf\u00c0\u00ba\t\u00ae\\F\u009bP\u00ca.]\u00bep\u0001\u0095n\u00e5\u0017\u0086O(&\u00b6\u0013\u0013\u0084\u00c0\u00ed";
                var6_15 = "\u00b2t\u009e,\f\u0014h\u00cfu\u0013<\u00e0\u00b7\u00b6\u00dd\u00fe\u0010\u00b9\u0017\u008b\u0087'\u0000\u0000\u0080\u0017\t\u00d1r\u00a9\u00c9\u00da\u00c8\u00fc\u0016\u00fd\u00c2\u0082GJx\u00e9m\u0095\u00e4T\n\u00df_S7\u0085Ph\u001b\"\u0011\u00d5\u00ce\u00b0\u000b\u009a\u00cee\u00c3\u00ecK\u00d5o\n\u00f2\u00b4`\u00f2v\u00f9\fK\u00c6m2\u008b!\u0083!u5\u0086\u00b4\rR\u00dd\u00d1\u00b0\u009b\u008c\u001cJ\u00b2<\u00e07\u00ef\u00fdtV\u00b6k\u00f2$\u00cen\u00ab\u00f2I\u00e8E\u00ea\u00c0\u008c\u007f2\u0083\u0098g\u0017\u0096U)\u00d8 k4\u00de\u0010k$Jf\u0016 \u00c5]\u00dc\u00cfy\u00bd\u00d3\u00b8I\u00bd\u00aa\u00fd\u00d5\u008dy\u0016Km\u00b5]\u00a2\u00afx\u00f8d\u0085\u0015&\u0016\u000b\u0083\u00dd\u0017\u001a4V,\u009a\u00cf\u00c0\u00ba\t\u00ae\\F\u009bP\u00ca.]\u00bep\u0001\u0095n\u00e5\u0017\u0086O(&\u00b6\u0013\u0013\u0084\u00c0\u00ed".length();
                var3_16 = 0;
                while (true) {
                    var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
                    v10 = var0_12;
                    v11 = var4_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block21;
                    break;
                }
lbl76:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_16 < var6_15) ** continue;
                    var5_14 = "\u00a4\u00bc\u00e6\u0006$\u00e4!\u008d&]\u00f1\u00c1\u00c3\u0013\u00c8\u00e9";
                    var6_15 = "\u00a4\u00bc\u00e6\u0006$\u00e4!\u008d&]\u00f1\u00c1\u00c3\u0013\u00c8\u00e9".length();
                    var3_16 = 0;
                    while (true) {
                        var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
                        v10 = var0_12;
                        v11 = var4_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl89:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_16 < var6_15) ** continue;
                    break block22;
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
lbl102:
                // 1 sources

                ** continue;
            }
        }
        va.b = new va(var11_3[1], 0, 1);
        va.R = new va(var11_3[14], 1, 3);
        va.C = new va(var11_3[6], 2, 4);
        va.w = new va(var11_3[9], 3, 5);
        va.i = new va(var11_3[17], 4, (int)var0_12[25]);
        va.Q = new va(var11_3[8], 5, (int)var0_12[12]);
        va.G = new va(var11_3[4], (int)var0_12[19], (int)var0_12[14]);
        va.U = new va(var11_3[2], (int)var0_12[6], (int)var0_12[20]);
        va.g = new va(var11_3[7], (int)var0_12[3], (int)var0_12[27]);
        va.t = new va(var11_3[16], (int)var0_12[24], (int)var0_12[21]);
        va.V = new va(var11_3[5], (int)var0_12[13], (int)var0_12[22]);
        va.k = new va(var11_3[13], (int)var0_12[16], (int)var0_12[2]);
        va.y = new va(var11_3[11], (int)var0_12[17], (int)var0_12[15]);
        va.u = new va(var11_3[12], (int)var0_12[9], (int)var0_12[4]);
        va.N = new va(var11_3[0], (int)var0_12[11], (int)var0_12[26]);
        va.e = new va(var11_3[3], (int)var0_12[5], (int)var0_12[18]);
        va.L = new va(var11_3[10], (int)var0_12[1], (int)var0_12[10]);
        va.P = new va(var11_3[15], (int)var0_12[0], 0);
        v15 = new va[(int)var0_12[23]];
        v15[0] = m44.a("k", (long)352595849590749581L, (long)var20);
        v15[1] = m44.a("k", (long)78707137388791136L, (long)var20);
        v15[2] = m44.a("k", (long)2084267271368056669L, (long)var20);
        v15[3] = m44.a("k", (long)514570877080216475L, (long)var20);
        v15[4] = m44.a("k", (long)89130669259433676L, (long)var20);
        v15[5] = va.Q;
        v15[(int)var0_12[19]] = m44.a("k", (long)24741889270107362L, (long)var20);
        v15[(int)var0_12[6]] = m44.a("k", (long)516637448678666606L, (long)var20);
        v15[(int)var0_12[3]] = m44.a("k", (long)209314536877279975L, (long)var20);
        v15[(int)var0_12[24]] = m44.a("k", (long)2112757303658135392L, (long)var20);
        v15[(int)var0_12[13]] = m44.a("k", (long)1781313676701550668L, (long)var20);
        v15[(int)var0_12[16]] = m44.a("k", (long)2116499331951092309L, (long)var20);
        v15[(int)var0_12[17]] = m44.a("k", (long)2145891278159404415L, (long)var20);
        v15[(int)var0_12[8]] = m44.a("k", (long)2152707210696885047L, (long)var20);
        v15[(int)var0_12[7]] = m44.a("k", (long)2237022164147061062L, (long)var20);
        v15[(int)var0_12[5]] = m44.a("k", (long)2162267220805000897L, (long)var20);
        v15[(int)var0_12[1]] = m44.a("k", (long)2176498702992148168L, (long)var20);
        v15[(int)var0_12[0]] = m44.a("k", (long)1811545523159607243L, (long)var20);
        va.O = v15;
    }

    public static int h() {
        return B;
    }

    public static int x() {
        int n = va.h();
        if (n == 0) {
            return 121;
        }
        return 0;
    }

    public static va[] t(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (va[])((Enum)((Object)m44.a("l", (long)-2800330699796569793L, (long)l))).clone();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private va() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.p = var3_1;
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
