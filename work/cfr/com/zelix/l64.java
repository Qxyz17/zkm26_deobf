/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public interface l64 {
    public static final String[] c;

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = prr.a(99418718703407803L, 4067286810296674468L, MethodHandles.lookup().lookupClass()).a(240498296719157L) ^ 130221513497661L;
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
                var0_3 = new String[18];
                var6_4 = 0;
                var5_5 = "\u00a7N\u0012\u00b7\u0092\u0085-\u00f3~\u00c5\tCxL\u0089\u00b2\b\u00a4\u0093\u001e\u00adK\u009e\u00c9u\u0010\u0084J\u00dd0x^\r\u00bcc\u0088)$\u0095\u00a4\u008e\u00b6\u0010\u00f5\u00ec\u00bcyO\u00cf\u00d0\u00a5\u0002\u00c4n\u00d0)2\u00e2U\u0010q\u0095\u001f?\u00e3\u0099\u00e5\u00b0\u00f5\u0098W\u00d7?s\u0085\u0003\b\u0090\u0013P\u00f4\u00e1\u00a5\u0010E\u0010\u0089.T\u00a10\u0018i\u00c7\u00af\u00a9T\u00efd{\u00ad\u0013\u00104\u00b8\u00d3K3\"S\u00c6f<\u00fc\u00af/j$\u0087\u0010N\u00f89\u008b\u00b480\u009b\\\u0083\f\u00f6;\u00ee\u0084\u00e5\u00106j\u00b3h/\u0093\b\u00baQd\u00f09L(<\u008c\u0010\u00be\u009fw\u0083\u00b8@-\u00db\u008c=}\u00f4;\u009e\u0005\"\u0010\u00ba\u009fCzF\u00a1\u00fe\"\u00cfE+\u0092>)\u00f1\u0081\u0018\u00ba\u009fCzF\u00a1\u00fe\"i\u0011\u00fc\u00d1\u001c\u00f5\u009dq\u0018\u009c\u009b\u00b5Z\u00ef\u00853\u0010\u00b4\u0089n\u0096\u0012\u00bf\u0017\u00eeW\u00d8\u00b6\u00e4~t-\u00ca\u0010\u00007\fI\u0099uV\u0004\u001d#\u00df\u009e\u00a2\u00f5\u00cf6\b\f\u001e?Y\u0091\u00b8s\u00b1";
                var7_6 = "\u00a7N\u0012\u00b7\u0092\u0085-\u00f3~\u00c5\tCxL\u0089\u00b2\b\u00a4\u0093\u001e\u00adK\u009e\u00c9u\u0010\u0084J\u00dd0x^\r\u00bcc\u0088)$\u0095\u00a4\u008e\u00b6\u0010\u00f5\u00ec\u00bcyO\u00cf\u00d0\u00a5\u0002\u00c4n\u00d0)2\u00e2U\u0010q\u0095\u001f?\u00e3\u0099\u00e5\u00b0\u00f5\u0098W\u00d7?s\u0085\u0003\b\u0090\u0013P\u00f4\u00e1\u00a5\u0010E\u0010\u0089.T\u00a10\u0018i\u00c7\u00af\u00a9T\u00efd{\u00ad\u0013\u00104\u00b8\u00d3K3\"S\u00c6f<\u00fc\u00af/j$\u0087\u0010N\u00f89\u008b\u00b480\u009b\\\u0083\f\u00f6;\u00ee\u0084\u00e5\u00106j\u00b3h/\u0093\b\u00baQd\u00f09L(<\u008c\u0010\u00be\u009fw\u0083\u00b8@-\u00db\u008c=}\u00f4;\u009e\u0005\"\u0010\u00ba\u009fCzF\u00a1\u00fe\"\u00cfE+\u0092>)\u00f1\u0081\u0018\u00ba\u009fCzF\u00a1\u00fe\"i\u0011\u00fc\u00d1\u001c\u00f5\u009dq\u0018\u009c\u009b\u00b5Z\u00ef\u00853\u0010\u00b4\u0089n\u0096\u0012\u00bf\u0017\u00eeW\u00d8\u00b6\u00e4~t-\u00ca\u0010\u00007\fI\u0099uV\u0004\u001d#\u00df\u009e\u00a2\u00f5\u00cf6\b\f\u001e?Y\u0091\u00b8s\u00b1".length();
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
                    var0_3[var6_4++] = l64.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "l-\u009afD\u00b8\u00a8\u00e9\\Y\u00f0\u00e4\u00ba\u0099=\u00a9\u0010\u00c5\u0097\u0086Xw\u0017\u00e0\u00f2\u00ea\u001c,\b\u00ad\u00ec\u00aa\u008e";
                    var7_6 = "l-\u009afD\u00b8\u00a8\u00e9\\Y\u00f0\u00e4\u00ba\u0099=\u00a9\u0010\u00c5\u0097\u0086Xw\u0017\u00e0\u00f2\u00ea\u001c,\b\u00ad\u00ec\u00aa\u008e".length();
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
                    var0_3[var6_4++] = l64.a(var8_9).intern();
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
        l64.c = new String[]{var0_3[15], var0_3[2], var0_3[7], var0_3[16], var0_3[12], var0_3[13], var0_3[17], var0_3[8], var0_3[0], var0_3[10], var0_3[9], var0_3[3], var0_3[4], var0_3[6], var0_3[11], var0_3[1], var0_3[5], var0_3[14]};
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

