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

public class gl
extends Enum {
    public static final gl d;
    public static final gl T;
    public static final gl o;
    public static final gl R;
    public static final gl w;
    private static final gl[] L;
    public static final gl J;
    public static final gl I;
    public static final gl Q;
    public static final gl v;
    public static final gl G;
    public static final gl i;
    public static final gl H;
    public static final gl B;
    private static final long a;

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        gl.a = prr.a((long)8086293655603961547L, (long)-840939694266237263L, MethodHandles.lookup().lookupClass()).a(148132904474830L);
                        var20 = gl.a ^ 40277519681664L;
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
                        var16_5 = "\u00c9<\u00e0\u00d8-;\u00ea$\u00bf)/\u0004\u00af\u00faw\u0098\u00dc\u0010\u0010\u0016\u0010\u00ed#\u00c1\u0010\u00aa\u001e\u00ae\u00bb\u0002\u00ff?OW\u0091\u00fa\u00bb\u0089\\\u007ff \u00f4\u0011\u0014)W\u0086\u00f9\u0096\u00b4U\u009acz\u00e7IQ8e\u0014\u009dY9\u00ea\u00b2\u00c3\u009a\u0097\u0090<iY\u009a(\u00b0\u0002c\u001a\u00e7T3\u00fcQ\u00fak\u0099\u0083)\u00b8\u00bcF\u00a98v}k\u00ef(\u0088R\u00b3\u00a2\u00ea\u00eb\b=\u00ab\r\u00d3\u00af\u00c2\u00fb\u00de\u0085\u0018\u00e6\u00f9\u008c\u009c\u001b\u00bd\u00e9\r\u00f1\u00ea\u0087\u00da.f>\u007f\u00ccy\u00cd*\u00fd\u0006\u00e2\u0019\u0010a@\u0005\u00b0\u00c6\u00d4\u0005\u00fc\u00a1\u00d7\u00de\t\u00f8,\u00dd\u008b\u0010S\u00d8Ht\u0018\u0018\u00cdr\u00d1\u00d8f\u00e3x\u0017\u0012\u00db\u0010\u00c9<\u00e0\u00d8-;\u00ea$\u00bc\u00d0\u0017\u00a5V*{\u00ed\u0010{\u00b6\u00a73\u0005\u00f7>\u00fe\u008bf\u0012\u008c\u00bb\u0084\u001eI\u0018\u00e4NV\u008f\u00bd:H\u00ae?ksEG\u00cd\u0080c^\"\u00bb\u0094>\u0083>\u00f0 5\u009fVJ\u00d6\u00a1\u00bb/\u00fc\u00a1\u000f\n\u00a3\u00e8X\u00d6%:\n\u00e1j={f\u00d2\u0087\u00ac&\u00dd\u00c4\u00e0\u0083";
                        var18_6 = "\u00c9<\u00e0\u00d8-;\u00ea$\u00bf)/\u0004\u00af\u00faw\u0098\u00dc\u0010\u0010\u0016\u0010\u00ed#\u00c1\u0010\u00aa\u001e\u00ae\u00bb\u0002\u00ff?OW\u0091\u00fa\u00bb\u0089\\\u007ff \u00f4\u0011\u0014)W\u0086\u00f9\u0096\u00b4U\u009acz\u00e7IQ8e\u0014\u009dY9\u00ea\u00b2\u00c3\u009a\u0097\u0090<iY\u009a(\u00b0\u0002c\u001a\u00e7T3\u00fcQ\u00fak\u0099\u0083)\u00b8\u00bcF\u00a98v}k\u00ef(\u0088R\u00b3\u00a2\u00ea\u00eb\b=\u00ab\r\u00d3\u00af\u00c2\u00fb\u00de\u0085\u0018\u00e6\u00f9\u008c\u009c\u001b\u00bd\u00e9\r\u00f1\u00ea\u0087\u00da.f>\u007f\u00ccy\u00cd*\u00fd\u0006\u00e2\u0019\u0010a@\u0005\u00b0\u00c6\u00d4\u0005\u00fc\u00a1\u00d7\u00de\t\u00f8,\u00dd\u008b\u0010S\u00d8Ht\u0018\u0018\u00cdr\u00d1\u00d8f\u00e3x\u0017\u0012\u00db\u0010\u00c9<\u00e0\u00d8-;\u00ea$\u00bc\u00d0\u0017\u00a5V*{\u00ed\u0010{\u00b6\u00a73\u0005\u00f7>\u00fe\u008bf\u0012\u008c\u00bb\u0084\u001eI\u0018\u00e4NV\u008f\u00bd:H\u00ae?ksEG\u00cd\u0080c^\"\u00bb\u0094>\u0083>\u00f0 5\u009fVJ\u00d6\u00a1\u00bb/\u00fc\u00a1\u000f\n\u00a3\u00e8X\u00d6%:\n\u00e1j={f\u00d2\u0087\u00ac&\u00dd\u00c4\u00e0\u0083".length();
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
                            var11_3[var17_4++] = gl.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = ">\n\u0012)&\u00c7D+\u00e7kM\r\u00ce\u00ae\u00b6qdeho\u000e\u008a\u00ae\u00dc\u00e2R\u00ba\u00b6\u00eb\u00b4^\u0089\u0010\u00c1\u0005\u0081\u0097X\u00f1\u00e5\u00b9\u00f6\u000f;\u00f0H2?{";
                            var18_6 = ">\n\u0012)&\u00c7D+\u00e7kM\r\u00ce\u00ae\u00b6qdeho\u000e\u008a\u00ae\u00dc\u00e2R\u00ba\u00b6\u00eb\u00b4^\u0089\u0010\u00c1\u0005\u0081\u0097X\u00f1\u00e5\u00b9\u00f6\u000f;\u00f0H2?{".length();
                            var15_7 = 32;
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
                            var11_3[var17_4++] = gl.a(var19_9).intern();
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
                var5_14 = "-\u00e8\u00da\u0094iw\u00eeh\u001d\u0089Pk\u00a0\u00ccr\u0016v\u00e6\u00fc\u0093#\u00d4\"/y.5\u008b \u00dd\u00c2\u0083=z4`\u00bd\u00c5&\u0094*i\u00fc\u00f7\u00d9bs\u00f78\u0007\u00b5\u008f\u00a7\u00af\u009ea\u001f\u0013\u00fc\u00c9\u007f;1\u00c6\u00ac;4\u00b4'\u009f\u00beVB\u00f0\u00dc\u00b6\u00d3\u00ce-k~s\u00cc}5\u00f7\u00c0\u009b\u0089\u00feBq\u00f7\u001a\u0004\u0004\u00c0\u00cc\u0018i\u0002q\u00d1\u00a0";
                var6_15 = "-\u00e8\u00da\u0094iw\u00eeh\u001d\u0089Pk\u00a0\u00ccr\u0016v\u00e6\u00fc\u0093#\u00d4\"/y.5\u008b \u00dd\u00c2\u0083=z4`\u00bd\u00c5&\u0094*i\u00fc\u00f7\u00d9bs\u00f78\u0007\u00b5\u008f\u00a7\u00af\u009ea\u001f\u0013\u00fc\u00c9\u007f;1\u00c6\u00ac;4\u00b4'\u009f\u00beVB\u00f0\u00dc\u00b6\u00d3\u00ce-k~s\u00cc}5\u00f7\u00c0\u009b\u0089\u00feBq\u00f7\u001a\u0004\u0004\u00c0\u00cc\u0018i\u0002q\u00d1\u00a0".length();
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
                    var5_14 = "\u0016Wy\u0098_\r\u00cc\u00b3\u0005\u00ben\u009c\u00de\u00d4\u00a2\u00d6";
                    var6_15 = "\u0016Wy\u0098_\r\u00cc\u00b3\u0005\u00ben\u009c\u00de\u00d4\u00a2\u00d6".length();
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
        gl.Q = new gl(var11_3[1], 0);
        gl.R = new gl(var11_3[8], 1);
        gl.G = new gl(var11_3[7], 2);
        gl.J = new gl(var11_3[5], 3);
        gl.T = new gl(var11_3[12], 4);
        gl.o = new gl(var11_3[6], 5);
        gl.v = new gl(var11_3[9], (int)var0_12[2]);
        gl.w = new gl(var11_3[2], (int)var0_12[0]);
        gl.B = new gl(var11_3[10], (int)var0_12[4]);
        gl.I = new gl(var11_3[11], (int)var0_12[10]);
        gl.i = new gl(var11_3[4], (int)var0_12[14]);
        gl.d = new gl(var11_3[0], (int)var0_12[5]);
        gl.H = new gl(var11_3[3], (int)var0_12[9]);
        v15 = new gl[(int)var0_12[12]];
        v15[0] = m44.a("n", (long)-4189997441878249424L, (long)var20);
        v15[1] = m44.a("n", (long)-4350147460320931590L, (long)var20);
        v15[2] = m44.a("n", (long)-4395900850140334290L, (long)var20);
        v15[3] = m44.a("n", (long)-2835675290215093120L, (long)var20);
        v15[4] = m44.a("n", (long)-4421163717835415372L, (long)var20);
        v15[5] = m44.a("n", (long)-4216238797323407796L, (long)var20);
        v15[(int)var0_12[13]] = m44.a("n", (long)-2467591529633701046L, (long)var20);
        v15[(int)var0_12[1]] = m44.a("n", (long)-4278602710354494478L, (long)var20);
        v15[(int)var0_12[8]] = m44.a("n", (long)-4068375463349531740L, (long)var20);
        v15[(int)var0_12[3]] = m44.a("n", (long)-4378875303566525696L, (long)var20);
        v15[(int)var0_12[11]] = m44.a("n", (long)-4252777269759705409L, (long)var20);
        v15[(int)var0_12[7]] = m44.a("n", (long)-4214471051379741803L, (long)var20);
        v15[(int)var0_12[6]] = m44.a("n", (long)-4102005741562942790L, (long)var20);
        gl.L = v15;
    }

    public static gl[] I(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (gl[])((Enum)((Object)m44.a("n", (long)1770213980385216146L, (long)l))).clone();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gl() {
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
