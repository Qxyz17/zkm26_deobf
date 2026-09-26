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

public abstract class l6k {
    public static final String m;
    public static final String C;
    public static final String M;
    public static final String H;

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = prr.a((long)-8455089274228520502L, (long)-3019465799095495167L, MethodHandles.lookup().lookupClass()).a(79544669071401L) ^ 135910015983953L;
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
                var0_3 = new String[7];
                var6_4 = 0;
                var5_5 = "-JI\u0084$\u00c1\u00fe\u009b:<|\u00ee\u00b2\u00d8<\u00b4\u0010P\u0084\u007f\u0015\u00a9\u0091+\u008e\u00a8\u0087\u001d\u0016'\u00e6\u00d4\u00e1\b9\u00f6\u009d`\u00a6\u0000\b\u009e\u0090d\u009c\u00c7\u00bb-\u0005z\u00cd\u00b9\u009al\u001d;tHDG\u0001M\u00842\u00cebA\u00c3b\u0006\"y\u00ce\u00a8\u008b\u00bd\u00c1\u00c7\u00d4$**j\u00e4\u00b06\u00ea\u00d4,\u00a7\u00e3\u0089cdP\u00bd\u00ad\u0090z\u00e5>u\u00d5\u0090\u00f0\u00ae6Tt\u00e8CA^^\u00a0\u00ce\u00c0\u00c0\u00b1\u00e4\f\u00c1\u00b2\u0018\u00fbU\u00e9\u00bb\u00af\u00be|6\u0010\u0010S\u007f.|S%\u00d6\u00f2\u0005\u00b8\u000e\u008b\u009f%\u008cD\u00e3J\u00bc\u00aa\u00f9\u0084\u0017\u0002\u00d8\u000b\u00ad\u001d\u00d8\u0091cb\u0007)\u00bf^\u00d7r\u008e\u0006\u00dd\u00ec)_\u001fQ\u0012P<\u00b1\u0089\u009b\u008a\u0010z\u00e1)^\u00a4\u0093}yn\u00af\u00ea=e\u00e1X\u00e1";
                var7_6 = "-JI\u0084$\u00c1\u00fe\u009b:<|\u00ee\u00b2\u00d8<\u00b4\u0010P\u0084\u007f\u0015\u00a9\u0091+\u008e\u00a8\u0087\u001d\u0016'\u00e6\u00d4\u00e1\b9\u00f6\u009d`\u00a6\u0000\b\u009e\u0090d\u009c\u00c7\u00bb-\u0005z\u00cd\u00b9\u009al\u001d;tHDG\u0001M\u00842\u00cebA\u00c3b\u0006\"y\u00ce\u00a8\u008b\u00bd\u00c1\u00c7\u00d4$**j\u00e4\u00b06\u00ea\u00d4,\u00a7\u00e3\u0089cdP\u00bd\u00ad\u0090z\u00e5>u\u00d5\u0090\u00f0\u00ae6Tt\u00e8CA^^\u00a0\u00ce\u00c0\u00c0\u00b1\u00e4\f\u00c1\u00b2\u0018\u00fbU\u00e9\u00bb\u00af\u00be|6\u0010\u0010S\u007f.|S%\u00d6\u00f2\u0005\u00b8\u000e\u008b\u009f%\u008cD\u00e3J\u00bc\u00aa\u00f9\u0084\u0017\u0002\u00d8\u000b\u00ad\u001d\u00d8\u0091cb\u0007)\u00bf^\u00d7r\u008e\u0006\u00dd\u00ec)_\u001fQ\u0012P<\u00b1\u0089\u009b\u008a\u0010z\u00e1)^\u00a4\u0093}yn\u00af\u00ea=e\u00e1X\u00e1".length();
                var4_7 = 16;
                var3_8 = -1;
lbl18:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl23:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = l6k.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "d\u009c\u00c7\u00bb-\u0005z\u00cd\u00b9\u009al\u001d;tHDG\u0001M\u00842\u00cebA\u00c3b\u0006\"y\u00ce\u00a8\u008b\u00d5\u0019\u001av\u00f7\u00dd\u00b5U\u00dc\u00a3\u00deWt\u00e9\u000f\u0005\u00e7Q\u00de\u0094\u0091\u00d0s\ts\u00f7\u00a1\u009c\u00df7\u00a6\u00045\u001b\u00f5\u0090\u0088km\u00ee\u00c5\fa\u00f1\u00e0\u00cf\u000b\u00a0\u00b4\u00d8/\u00b9\u00cbT4\u00b0\u0012\u00c1\u00b7Nv\u00ae5\u00f1*\u00e3G\u00ad\u00c61\u00b0RV\u0083\"\r`\u009e;]\u0010P\u00ad\u00e0\u00de\u00b4\u00b1\u00e8\u00f8S\u0086P\u00e1\u00aa\u00f8\u00f0\u00e0";
                    var7_6 = "d\u009c\u00c7\u00bb-\u0005z\u00cd\u00b9\u009al\u001d;tHDG\u0001M\u00842\u00cebA\u00c3b\u0006\"y\u00ce\u00a8\u008b\u00d5\u0019\u001av\u00f7\u00dd\u00b5U\u00dc\u00a3\u00deWt\u00e9\u000f\u0005\u00e7Q\u00de\u0094\u0091\u00d0s\ts\u00f7\u00a1\u009c\u00df7\u00a6\u00045\u001b\u00f5\u0090\u0088km\u00ee\u00c5\fa\u00f1\u00e0\u00cf\u000b\u00a0\u00b4\u00d8/\u00b9\u00cbT4\u00b0\u0012\u00c1\u00b7Nv\u00ae5\u00f1*\u00e3G\u00ad\u00c61\u00b0RV\u0083\"\r`\u009e;]\u0010P\u00ad\u00e0\u00de\u00b4\u00b1\u00e8\u00f8S\u0086P\u00e1\u00aa\u00f8\u00f0\u00e0".length();
                    var4_7 = 112;
                    var3_8 = -1;
lbl32:
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
lbl37:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = l6k.a(var8_9).intern();
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
lbl49:
                // 1 sources

                ** continue;
            }
        }
        l6k.M = m44.a("n", (Object)var0_3[6], (Object)"\n", (long)-2514729431652614651L, (long)var9);
        l6k.m = m44.a("n", (Object)var0_3[0], (long)-2830571361438485752L, (long)var9);
        l6k.H = var0_3[3] + (String)m44.a("n", (Object)var0_3[4], (long)-2830571361438485752L, (long)var9) + var0_3[2];
        l6k.C = var0_3[5] + (String)m44.a("n", (Object)var0_3[1], (long)-2830571361438485752L, (long)var9) + "\"";
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
