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

public class l6_
extends Enum {
    public static final l6_ L;
    private static final l6_[] V;
    public static final l6_ h;
    public static final l6_ O;
    private final int U;
    public static final l6_ r;
    private static final long a;

    public static l6_[] N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (l6_[])((Enum)((Object)m44.a("h", (long)-6699512100458148040L, (long)l))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                l6_.a = prr.a((long)8933433964323533819L, (long)-5631727916387469200L, MethodHandles.lookup().lookupClass()).a(155912626086347L);
                var9 = l6_.a ^ 108813123776444L;
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
                var0_3 = new String[4];
                var6_4 = 0;
                var5_5 = "(m\u00a0\u0093\u00da<d\u0092\b\rr\u0084\u0016\u00b1.=\u00dc";
                var7_6 = "(m\u00a0\u0093\u00da<d\u0092\b\rr\u0084\u0016\u00b1.=\u00dc".length();
                var4_7 = 8;
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
                    var0_3[var6_4++] = l6_.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "PZ\u0014i\u00ec8\u00a87\u0010\u00bb\u00a4ZG\u00acL|)i\u0095\u00b0\u00d2orp ";
                    var7_6 = "PZ\u0014i\u00ec8\u00a87\u0010\u00bb\u00a4ZG\u00acL|)i\u0095\u00b0\u00d2orp ".length();
                    var4_7 = 8;
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
                    var0_3[var6_4++] = l6_.a(var8_9).intern();
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
        l6_.r = new l6_(var0_3[2], 0, 0);
        l6_.L = new l6_(var0_3[1], 1, 1);
        l6_.O = new l6_(var0_3[3], 2, 2);
        l6_.h = new l6_(var0_3[0], 3, 3);
        l6_.V = new l6_[]{m44.a("m", (long)7368614986982550907L, (long)var9), m44.a("m", (long)7127101775608478520L, (long)var9), m44.a("m", (long)9131265764959344377L, (long)var9), m44.a("m", (long)8757359204646121657L, (long)var9)};
    }

    int g(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (int)m44.a("p", (Object)((Object)this), (long)2697472347873206833L, (long)l);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private l6_() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.U = var3_1;
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
