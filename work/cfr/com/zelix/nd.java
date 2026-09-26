/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._0;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class nd {
    private static _0[] T;
    protected static final String[] l;

    public static _0[] x() {
        return T;
    }

    public static void F(_0[] _0Array) {
        T = _0Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                var9 = prr.a(-1062624944088104757L, 2416740137829651523L, MethodHandles.lookup().lookupClass()).a(248031169965175L) ^ 64754447905203L;
                if (m44.a("l", (long)5114993780154162775L, (long)var9) == null) {
                    m44.a("l", (Object)new _0[5], (long)6760096557912285564L, (long)var9);
                }
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
                var5_5 = "\u00b5h\u00f7s\u00c4\u0094\u00fe.\u00a1HG\u00c2\u00bf w\u00aa\u0018}\u0007d\u00a8\ro\u0091\u0081\u00a7jS@w\u00c8\u00fc\u00bd\u00c4H\u008f<%\u00a4\u00f818\u00b4VGh\u00ae\u0097\u00bb\u00d9\u0096\u00cf\u00c9\u00e7\u0018P7\u001f\u00e5\u00bf\u0012\u00e8\u0019B L\u0003\u00e0\u0016\u00f8\u00efE\u0097\u0089J\u008a\u00c0]O{H\u0018\u00b4*Fs9\u00fe\u001f}1\u00eb&\u00b7^\u00eb\u00afy";
                var7_6 = "\u00b5h\u00f7s\u00c4\u0094\u00fe.\u00a1HG\u00c2\u00bf w\u00aa\u0018}\u0007d\u00a8\ro\u0091\u0081\u00a7jS@w\u00c8\u00fc\u00bd\u00c4H\u008f<%\u00a4\u00f818\u00b4VGh\u00ae\u0097\u00bb\u00d9\u0096\u00cf\u00c9\u00e7\u0018P7\u001f\u00e5\u00bf\u0012\u00e8\u0019B L\u0003\u00e0\u0016\u00f8\u00efE\u0097\u0089J\u008a\u00c0]O{H\u0018\u00b4*Fs9\u00fe\u001f}1\u00eb&\u00b7^\u00eb\u00afy".length();
                var4_7 = 16;
                var3_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = nd.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "h\u00e5\u0002\f\u00ca\u0002\u0082\u00d13\u00bf\u00b4!\u00b6\u00c3F~\u0018\u00b5T\u00af\u00f5D\u00c3\u00e4\u0081{\u00fd\u00cc\u00d5\u00e6\u00c7j\u00a9:5\u0007Z\nQ\u0006\u008e";
                    var7_6 = "h\u00e5\u0002\f\u00ca\u0002\u0082\u00d13\u00bf\u00b4!\u00b6\u00c3F~\u0018\u00b5T\u00af\u00f5D\u00c3\u00e4\u0081{\u00fd\u00cc\u00d5\u00e6\u00c7j\u00a9:5\u0007Z\nQ\u0006\u008e".length();
                    var4_7 = 16;
                    var3_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = nd.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var8_9 = var1_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl51:
                // 1 sources

                ** continue;
            }
        }
        nd.l = new String[]{var0_3[3], var0_3[0], var0_3[2], var0_3[1], var0_3[4]};
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

