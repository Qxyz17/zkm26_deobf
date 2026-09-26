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

public class dn {
    public static final String T;
    public static final String N;
    public static final String z;

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = prr.a((long)-1563607902825594063L, (long)-3501216681788774446L, MethodHandles.lookup().lookupClass()).a(100127215848846L) ^ 20861629723578L;
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
                var5_5 = "\u00e9\u001a9\u00b2\u00c8V\u00c4\u0018,\u009e(\u00ed\u00d5\u00c0\u001a\u00f6\u001b\u00ad7\u00de\u00eac.\u00e0\u0081\u00dc\u0092\u00b7\u00de\u0016 zJ^\u0006>\u0094\u001e\u00a1\u00c3\u00af\u00c2\u0089\u0004Z\u00d54\u0084\u0010\u001e\u00122\u0089\u009ajBu\u00e5\u00e6\u00f8\u00d6\u0007\u0085\u00ceSC\t/\u00d3\u00bf3\u00f4\u00f8+\u00e8\u00abxrU\u00fd\u007fy\u00ba\u00bb\u008b\u00b0\u0086\u0007\u000b\u008ct\u0084\u00a5\u00f5\u009b)4\u0011\u00c8b~%\u00d7K\u00ec\u0013\u0084\u0015\u009c\u0093|\u0090\u0094Z1.5\u009f\u0081\u00b8&~4\u00f5vUK\u00d6\u00fa\u0014A\u0082\u0004\u00de+\u00ce\u008a\u0083F\u0086\u00e6\u00c6\u00fe\u001f\u0010\u00e6\u00a1\u00a83\u00a2\u00d3)\u00f3/z\u00b3\u0003\u0011s\u00cc\u00aa\u0010=o\u00c9\u0089F\u00a3\u00d2\u001d\t\u00b5\u000eC\u00bd%4X";
                var7_6 = "\u00e9\u001a9\u00b2\u00c8V\u00c4\u0018,\u009e(\u00ed\u00d5\u00c0\u001a\u00f6\u001b\u00ad7\u00de\u00eac.\u00e0\u0081\u00dc\u0092\u00b7\u00de\u0016 zJ^\u0006>\u0094\u001e\u00a1\u00c3\u00af\u00c2\u0089\u0004Z\u00d54\u0084\u0010\u001e\u00122\u0089\u009ajBu\u00e5\u00e6\u00f8\u00d6\u0007\u0085\u00ceSC\t/\u00d3\u00bf3\u00f4\u00f8+\u00e8\u00abxrU\u00fd\u007fy\u00ba\u00bb\u008b\u00b0\u0086\u0007\u000b\u008ct\u0084\u00a5\u00f5\u009b)4\u0011\u00c8b~%\u00d7K\u00ec\u0013\u0084\u0015\u009c\u0093|\u0090\u0094Z1.5\u009f\u0081\u00b8&~4\u00f5vUK\u00d6\u00fa\u0014A\u0082\u0004\u00de+\u00ce\u008a\u0083F\u0086\u00e6\u00c6\u00fe\u001f\u0010\u00e6\u00a1\u00a83\u00a2\u00d3)\u00f3/z\u00b3\u0003\u0011s\u00cc\u00aa\u0010=o\u00c9\u0089F\u00a3\u00d2\u001d\t\u00b5\u000eC\u00bd%4X".length();
                var4_7 = 144;
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
                    var0_3[var6_4++] = dn.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "9'\u000b2\u001a\u0084|\u000e$\u00e4\u00bfC\u0001v\u00a2\u0091\b\u00a7 \u00f2\u00d1\u009c\u009e\u0085B";
                    var7_6 = "9'\u000b2\u001a\u0084|\u000e$\u00e4\u00bfC\u0001v\u00a2\u0091\b\u00a7 \u00f2\u00d1\u009c\u009e\u0085B".length();
                    var4_7 = 16;
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
                    var0_3[var6_4++] = dn.a(var8_9).intern();
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
        dn.N = m44.a("o", (Object)var0_3[3], (Object)"\n", (long)-1260818154575360612L, (long)var9);
        dn.T = m44.a("o", (Object)var0_3[1], (long)-1500116291286171503L, (long)var9);
        dn.z = var0_3[0] + (String)m44.a("o", (Object)var0_3[2], (long)-1500116291286171503L, (long)var9) + var0_3[4];
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
