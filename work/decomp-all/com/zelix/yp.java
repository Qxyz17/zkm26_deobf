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

public class yp
extends Enum {
    public static final yp K;
    public static final yp y;
    public static final yp X;
    public static final yp p;
    public static final yp M;
    private static final yp[] j;
    public static final yp v;
    public static final yp i;
    public static final yp F;
    public static final yp I;
    public static final yp x;
    public static final yp T;
    public static final yp b;
    private static final long a;

    public static yp[] g(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (yp[])((Enum)((Object)m44.a("n", (long)-2949169412498837130L, (long)l))).clone();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private yp() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        yp.a = prr.a((long)-5657599027443317538L, (long)254642095926805726L, MethodHandles.lookup().lookupClass()).a(258219443650855L);
                        var20 = yp.a ^ 70175247184197L;
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
                        var11_3 = new String[12];
                        var17_4 = 0;
                        var16_5 = "%\u00d6W+\u0082\u00f4H[\u00a7c\u0085\u00adC]f8\u0018\u00f0t9\u0096\u009a\u00afY*\u00c3\u00b3ic6\u00a3\u00ec\u00d1\u00e3\u00da&P\u0098\u0013\u00d9\u00f10\u00ba\u0011B\u00cb\u00a4n\u00b7\u00c6\u00da\u00f9\u00fd+^e\u00f4fI\u0006[]\u0097va[j\u00b9\u00d8T\u00f6\u009e>\u00bb\u0016c\u00c0\u009a\u00ce\u00dd\u00ff6\u00db\u009a\u00ed\u00e0\u0080D\u00afK\u0018Rl>\u009f\u009a\u0001\u0083G&\u00c8\u00a7\u007fP\u00b4\u009e\u00c3\u001e8\u00a9\u00e3@C\u00bdj \u00a1Z\u0093\u0014\u00ab;\u00bd\u00d2\u0016\u00e3Y(\u00d0F|\u0004\u0099\u0095\u00b3\u00cfR\u00dey\u0088RW\u00f5Z^\u000f.k\u0018\u0097,\u000f\u00bd\u00c0bJ\u0015{\u00a7\u0013\u00f1\u00b8\u00ce\u00b40\u00e5yB+\u0087+\u00d4\u00cb\u0018x\u0086*Bn\u00ecjn\u00aa\u0087u\u00d2Se\u00a1h\u0088\u00a4\u00f7\u0081\u00b3\u00b7\u001f\u009e\u0018Rl>\u009f\u009a\u0001\u0083G\u007f\u00c06\u00846\u00e9\u00a4\u00a1\u00d72mE{|`'0\u00a1Z\u0093\u0014\u00ab;\u00bd\u00d2\u0016\u00e3Y(\u00d0F|\u0004\u0092xO\u001fI\u00b9\u00ac\u00e0\u0002a/\u00af\u0010\u00a5\u00029K\u00b4\u0086e5\u00e0F\u001b\u00c8<\ni\u009a/C^0;9\u0083\u0014|\u0083!QvI;\u00ab\u0084\u0092\u00aa\u00ff\u0080z\u00c9{?A\u00cb+\u00fa&\\\u00e6d\u001f\u0089:o\u0015u\u00bc\u00b4d\u00df\u00a5G\u00df\u00cb4\u00d1G\u00ad\u00ae";
                        var18_6 = "%\u00d6W+\u0082\u00f4H[\u00a7c\u0085\u00adC]f8\u0018\u00f0t9\u0096\u009a\u00afY*\u00c3\u00b3ic6\u00a3\u00ec\u00d1\u00e3\u00da&P\u0098\u0013\u00d9\u00f10\u00ba\u0011B\u00cb\u00a4n\u00b7\u00c6\u00da\u00f9\u00fd+^e\u00f4fI\u0006[]\u0097va[j\u00b9\u00d8T\u00f6\u009e>\u00bb\u0016c\u00c0\u009a\u00ce\u00dd\u00ff6\u00db\u009a\u00ed\u00e0\u0080D\u00afK\u0018Rl>\u009f\u009a\u0001\u0083G&\u00c8\u00a7\u007fP\u00b4\u009e\u00c3\u001e8\u00a9\u00e3@C\u00bdj \u00a1Z\u0093\u0014\u00ab;\u00bd\u00d2\u0016\u00e3Y(\u00d0F|\u0004\u0099\u0095\u00b3\u00cfR\u00dey\u0088RW\u00f5Z^\u000f.k\u0018\u0097,\u000f\u00bd\u00c0bJ\u0015{\u00a7\u0013\u00f1\u00b8\u00ce\u00b40\u00e5yB+\u0087+\u00d4\u00cb\u0018x\u0086*Bn\u00ecjn\u00aa\u0087u\u00d2Se\u00a1h\u0088\u00a4\u00f7\u0081\u00b3\u00b7\u001f\u009e\u0018Rl>\u009f\u009a\u0001\u0083G\u007f\u00c06\u00846\u00e9\u00a4\u00a1\u00d72mE{|`'0\u00a1Z\u0093\u0014\u00ab;\u00bd\u00d2\u0016\u00e3Y(\u00d0F|\u0004\u0092xO\u001fI\u00b9\u00ac\u00e0\u0002a/\u00af\u0010\u00a5\u00029K\u00b4\u0086e5\u00e0F\u001b\u00c8<\ni\u009a/C^0;9\u0083\u0014|\u0083!QvI;\u00ab\u0084\u0092\u00aa\u00ff\u0080z\u00c9{?A\u00cb+\u00fa&\\\u00e6d\u001f\u0089:o\u0015u\u00bc\u00b4d\u00df\u00a5G\u00df\u00cb4\u00d1G\u00ad\u00ae".length();
                        var15_7 = 16;
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
                            var11_3[var17_4++] = yp.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u00c4\u00fd\u00966\u0005\u0015R\u00a5(;9\u0083\u0014|\u0083!Q\u00fd\u0083\u00f7\u00c6\u000fCU\u0094\nP\u00de\u007f!\u0099\u0097\u0093\u00b81\u00fb\u00d9\u0006\u0081V\u0004\u0082\u0019hA\u0085w\u00f3\u00ee";
                            var18_6 = "\u00c4\u00fd\u00966\u0005\u0015R\u00a5(;9\u0083\u0014|\u0083!Q\u00fd\u0083\u00f7\u00c6\u000fCU\u0094\nP\u00de\u007f!\u0099\u0097\u0093\u00b81\u00fb\u00d9\u0006\u0081V\u0004\u0082\u0019hA\u0085w\u00f3\u00ee".length();
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
                            var11_3[var17_4++] = yp.a(var19_9).intern();
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
                var0_12 = new long[13];
                var4_13 = 0;
                var5_14 = "\u0083\u0002\u001a1\u00fb\u000e\u00f6_\u001f\u00be\u00b5z\u00f4\u000e;\u00b1\u0082\u008d\u00d6\u0002\u0084b\u00d1\u00bd5H\u009b\u0099\u00f2\u00ee\u0086\u0084\u0083\u00e1\u00a5^\u00eb\u00b2\u00f4\u0003\u009b\u008f\u00bcfh\u0099\u0096V\u00ab\u00f8\u000f\u00cdZ\u00b8\u00c9\u00ceK\u00d9\u009e:{A\u009b\u00b6\u0086\u00cf'fB\u00be]\";@] <v\u00a2\u00b6\u00df\u00cb\u00f7\u008e\u00f9q\u00ff\u008c";
                var6_15 = "\u0083\u0002\u001a1\u00fb\u000e\u00f6_\u001f\u00be\u00b5z\u00f4\u000e;\u00b1\u0082\u008d\u00d6\u0002\u0084b\u00d1\u00bd5H\u009b\u0099\u00f2\u00ee\u0086\u0084\u0083\u00e1\u00a5^\u00eb\u00b2\u00f4\u0003\u009b\u008f\u00bcfh\u0099\u0096V\u00ab\u00f8\u000f\u00cdZ\u00b8\u00c9\u00ceK\u00d9\u009e:{A\u009b\u00b6\u0086\u00cf'fB\u00be]\";@] <v\u00a2\u00b6\u00df\u00cb\u00f7\u008e\u00f9q\u00ff\u008c".length();
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
                    var5_14 = "z\u00bcO\u0089\u00e6\n\u0092\u008a\u0014Ir\u00a32\u00dc\u00ab\u00c8";
                    var6_15 = "z\u00bcO\u0089\u00e6\n\u0092\u008a\u0014Ir\u00a32\u00dc\u00ab\u00c8".length();
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
        yp.v = new yp(var11_3[0], 0);
        yp.F = new yp(var11_3[7], 1);
        yp.K = new yp(var11_3[3], 2);
        yp.p = new yp(var11_3[5], 3);
        yp.y = new yp(var11_3[1], 4);
        yp.X = new yp(var11_3[4], 5);
        yp.i = new yp(var11_3[6], (int)var0_12[3]);
        yp.M = new yp(var11_3[9], (int)var0_12[2]);
        yp.I = new yp(var11_3[2], (int)var0_12[1]);
        yp.x = new yp(var11_3[11], (int)var0_12[7]);
        yp.b = new yp(var11_3[8], (int)var0_12[11]);
        yp.T = new yp(var11_3[10], (int)var0_12[4]);
        v15 = new yp[(int)var0_12[12]];
        v15[0] = m44.a("n", (long)-9069389317888248576L, (long)var20);
        v15[1] = m44.a("n", (long)-7263440324701716475L, (long)var20);
        v15[2] = m44.a("n", (long)-6982266186456521460L, (long)var20);
        v15[3] = m44.a("n", (long)-9056220953102062134L, (long)var20);
        v15[4] = m44.a("n", (long)-7112618366382742823L, (long)var20);
        v15[5] = m44.a("n", (long)-7307341119474840862L, (long)var20);
        v15[(int)var0_12[6]] = m44.a("n", (long)-7145944561554132665L, (long)var20);
        v15[(int)var0_12[5]] = m44.a("n", (long)-7374370778030866997L, (long)var20);
        v15[(int)var0_12[10]] = m44.a("n", (long)-8740399400567699645L, (long)var20);
        v15[(int)var0_12[9]] = m44.a("n", (long)-8731789092738572523L, (long)var20);
        v15[(int)var0_12[0]] = m44.a("n", (long)-7386666100595684645L, (long)var20);
        v15[(int)var0_12[8]] = m44.a("n", (long)-7317051634553446215L, (long)var20);
        yp.j = v15;
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
