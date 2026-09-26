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

public class g4
extends Enum {
    public static final g4 r;
    public static final g4 l;
    public static final g4 U;
    public static final g4 o;
    public static final g4 f;
    private static int[] m;
    private static final g4[] s;
    public static final g4 N;
    public static final g4 u;
    private static final long a;

    public static void e(int[] nArray) {
        m = nArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private g4() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block16: {
                block15: {
                    block14: {
                        g4.a = prr.a((long)1253644190133812779L, (long)-8790731112840481035L, MethodHandles.lookup().lookupClass()).a(51348423674600L);
                        var20 = g4.a ^ 109243189609249L;
                        if (m44.a("o", (long)3627922101865043314L, (long)var20) == null) {
                            m44.a("o", (Object)new int[3], (long)3453381459579259472L, (long)var20);
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
                        var11_3 = new String[7];
                        var17_4 = 0;
                        var16_5 = "\u0093Y\u0004\u00ce=+\u00bc\u001et\u00f1\u0083$\u0015\u0004L\u0098Qp\u009e\u001c\u0098X\u00a1\u00ef\u00ba}T\u00c7\u00c9&\u00fd\n\u0018\u00e35\u0012\u00c7\u00abm\u0019\n\u008f\u00133\u0001`\u00bbW\u0014\u009c5\u001c\u009b1\u008c\n\u0014\u0018\u00903+\u009d\u008e[\u00c1;\u00d8\u0088\u00d8\u00adr\u0094I\r\u00d8\u00c3\u00a8\u009b\u00ebrqU\u0018\u00f8\u00d8\u00fd\t\u00e4\u00b6\u00d6\u00b0\u00f2\t\u00d9\u00fe\u00b6edTy\u00b2 Y\u00a4\u008cZ\u008f\u0010\u008d\u00f2\u001e\u00ca\u00e2\u000b\u00f8\u00b9\u00b4\u00fb\u00e6\tf\u008c\u007f!";
                        var18_6 = "\u0093Y\u0004\u00ce=+\u00bc\u001et\u00f1\u0083$\u0015\u0004L\u0098Qp\u009e\u001c\u0098X\u00a1\u00ef\u00ba}T\u00c7\u00c9&\u00fd\n\u0018\u00e35\u0012\u00c7\u00abm\u0019\n\u008f\u00133\u0001`\u00bbW\u0014\u009c5\u001c\u009b1\u008c\n\u0014\u0018\u00903+\u009d\u008e[\u00c1;\u00d8\u0088\u00d8\u00adr\u0094I\r\u00d8\u00c3\u00a8\u009b\u00ebrqU\u0018\u00f8\u00d8\u00fd\t\u00e4\u00b6\u00d6\u00b0\u00f2\t\u00d9\u00fe\u00b6edTy\u00b2 Y\u00a4\u008cZ\u008f\u0010\u008d\u00f2\u001e\u00ca\u00e2\u000b\u00f8\u00b9\u00b4\u00fb\u00e6\tf\u008c\u007f!".length();
                        var15_7 = 32;
                        var14_8 = -1;
lbl21:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_8;
                            v4 = var16_5.substring(v3, v3 + var15_7);
                            v5 = -1;
                            break block14;
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = g4.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u0093Y\u0004\u00ce=+\u00bc\u001et\u00f1\u0083$\u0015\u0004L\u0098\u00c0\u001e\u00d3a\u00d9\r\u00f1\u0090\u0018G\u0091\u00b7\u00eaw\t\u00fe\u00d0\u0080\u00e9#\u00b4\u00c5;\u00e10:\u0004\u00edch\u00df/v";
                            var18_6 = "\u0093Y\u0004\u00ce=+\u00bc\u001et\u00f1\u0083$\u0015\u0004L\u0098\u00c0\u001e\u00d3a\u00d9\r\u00f1\u0090\u0018G\u0091\u00b7\u00eaw\t\u00fe\u00d0\u0080\u00e9#\u00b4\u00c5;\u00e10:\u0004\u00edch\u00df/v".length();
                            var15_7 = 24;
                            var14_8 = -1;
lbl35:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_8;
                                v4 = var16_5.substring(v6, v6 + var15_7);
                                v5 = 0;
                                break block14;
                                break;
                            }
                            break;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = g4.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            break block15;
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
                var0_12 = new long[3];
                var4_13 = 0;
                var5_14 = "\u00fcl\u000f\u0013HE\u00b3\u00b7C\u009f\u008a\u00bf\\\u00f9\b\u00a1\u0011\u00c0\u000fP\u00da\"\u0080\u00f8";
                var6_15 = "\u00fcl\u000f\u0013HE\u00b3\u00b7C\u009f\u008a\u00bf\\\u00f9\b\u00a1\u0011\u00c0\u000fP\u00da\"\u0080\u00f8".length();
                var3_16 = 0;
                while (true) {
                    break block16;
                    break;
                }
lbl71:
                // 1 sources

                while (true) {
                    var0_12[v10] = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
                    if (var3_16 < var6_15) ** continue;
                    break block17;
                    break;
                }
            }
            var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
            v10 = var4_13++;
            var8_18 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
            var10_19 = var1_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            ** while (true)
        }
        g4.u = new g4(var11_3[3], 0);
        g4.o = new g4(var11_3[2], 1);
        g4.r = new g4(var11_3[1], 2);
        g4.N = new g4(var11_3[4], 3);
        g4.U = new g4(var11_3[5], 4);
        g4.f = new g4(var11_3[0], 5);
        g4.l = new g4(var11_3[6], (int)var0_12[2]);
        v11 = new g4[(int)var0_12[1]];
        v11[0] = m44.a("k", (long)3388591313017861353L, (long)var20);
        v11[1] = m44.a("k", (long)3303349753030031337L, (long)var20);
        v11[2] = m44.a("k", (long)3163590026393386249L, (long)var20);
        v11[3] = m44.a("k", (long)3098200627685014659L, (long)var20);
        v11[4] = m44.a("k", (long)3548807580723911796L, (long)var20);
        v11[5] = m44.a("k", (long)3994691342026684843L, (long)var20);
        v11[(int)var0_12[0]] = m44.a("k", (long)3446399567283455674L, (long)var20);
        g4.s = v11;
    }

    public static g4[] V(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (g4[])((Enum)((Object)m44.a("k", (long)7892153256720411595L, (long)l))).clone();
    }

    public static int[] z() {
        return m;
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
