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

public interface l69 {
    public static final String[] U;

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = prr.a((long)3352095135454999883L, (long)-86229636157354473L, MethodHandles.lookup().lookupClass()).a(9466139360187L) ^ 92882614556643L;
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
                var0_3 = new String[31];
                var6_4 = 0;
                var5_5 = "\u00d0-\u00b6\u009f\u0095/\u0081\u00dc\u0010\u00bfzj\u008a?\u00de\u009c\u0085s\u0001\u0010\u00cf\u0090\u0080+-\bD\u00fdw\u00b6a\u00a5\u0084\r\b[\u00e8\u00d4\u00a0q\u008b\u0085\u00b6\bF\u0097\u0006\u00d5\u00a7\u00d2\u0016\u00eb\u0018cku\u00c9\u000e\u0002^\u00c1\u00ddZ\u00c1\u0082\u00d6f\u00eb]/\u00c9\u008a\u00e33\u0012\\\u00db\u0018\u00ddARByJ\u00fe\u0095k'\u00a6>\u00f9\u00f1f$7\u00e4J\u00af\u00f2\u008b\u0087W\u0018cku\u00c9\u000e\u0002^\u00c1\u00a7\nG\t\u00fb\u0086N\u0085\u00d1\u00cf\u00d5\u001b\u00ba\u0094>\u0097\b\u00b8|B}+\u00e6\u00de\u0013\bTYEj\u0090\u00d3\u00e3L\b\u000b\u00ad%L\u00df\u001dx\u00a1\b\u00930\u00b6\u00891dL\u0094\b'\u00d9\u00da\u00fe\u00f5\u007fS0\u0018l)\u00e5^c\u00fa.\u001d\u00e8w\u000e@\u0005\u00cc\f\u0085-W9k\u0012WxI\b\u00da\u00d3\u00d8\u0001\u0094\u00fd\u00c9#\b\u008b\u00e3M\u00e2\u00ff\u0083jJ\u0010d\u0088N\u000b\u00da*\u00a4\u00cc\u00d0\u00cd\u00c6\u008ayD!\u00d1\b\u00ec^\u00fb\u0080\u008eL\u0088J\b\u00dc\u008aw\u00d1NMG\u00c6\u0010\u00a4>e\u00e6\u00ca\u000e=\u000bh\u001a\u00bd\u00c2\u00c0\u00912\u00f2\bRQ09.\u00b66\u0089\bs.q\u00bf\u00e0\u00e4 \u00b8\bl\u0091\u0000o\u00aa_So\u0018cku\u00c9\u000e\u0002^\u00c1\u00bf\u001f\u00cf\u0097\u00ff\u00f2\u00c0\u0098&iT1_\u0001\n\u00d2\b\u00c7\u0007s\u009dtn#\u00ef\b\u008b\u00e3M\u00e2\u00ff\u0083jJ\bFu\u00e9l\u00e7\u00b7\u0017M\b\u00e9v\u00e6\u00b9\u0014Iu5\b\u00930\u00b6\u00891dL\u0094";
                var7_6 = "\u00d0-\u00b6\u009f\u0095/\u0081\u00dc\u0010\u00bfzj\u008a?\u00de\u009c\u0085s\u0001\u0010\u00cf\u0090\u0080+-\bD\u00fdw\u00b6a\u00a5\u0084\r\b[\u00e8\u00d4\u00a0q\u008b\u0085\u00b6\bF\u0097\u0006\u00d5\u00a7\u00d2\u0016\u00eb\u0018cku\u00c9\u000e\u0002^\u00c1\u00ddZ\u00c1\u0082\u00d6f\u00eb]/\u00c9\u008a\u00e33\u0012\\\u00db\u0018\u00ddARByJ\u00fe\u0095k'\u00a6>\u00f9\u00f1f$7\u00e4J\u00af\u00f2\u008b\u0087W\u0018cku\u00c9\u000e\u0002^\u00c1\u00a7\nG\t\u00fb\u0086N\u0085\u00d1\u00cf\u00d5\u001b\u00ba\u0094>\u0097\b\u00b8|B}+\u00e6\u00de\u0013\bTYEj\u0090\u00d3\u00e3L\b\u000b\u00ad%L\u00df\u001dx\u00a1\b\u00930\u00b6\u00891dL\u0094\b'\u00d9\u00da\u00fe\u00f5\u007fS0\u0018l)\u00e5^c\u00fa.\u001d\u00e8w\u000e@\u0005\u00cc\f\u0085-W9k\u0012WxI\b\u00da\u00d3\u00d8\u0001\u0094\u00fd\u00c9#\b\u008b\u00e3M\u00e2\u00ff\u0083jJ\u0010d\u0088N\u000b\u00da*\u00a4\u00cc\u00d0\u00cd\u00c6\u008ayD!\u00d1\b\u00ec^\u00fb\u0080\u008eL\u0088J\b\u00dc\u008aw\u00d1NMG\u00c6\u0010\u00a4>e\u00e6\u00ca\u000e=\u000bh\u001a\u00bd\u00c2\u00c0\u00912\u00f2\bRQ09.\u00b66\u0089\bs.q\u00bf\u00e0\u00e4 \u00b8\bl\u0091\u0000o\u00aa_So\u0018cku\u00c9\u000e\u0002^\u00c1\u00bf\u001f\u00cf\u0097\u00ff\u00f2\u00c0\u0098&iT1_\u0001\n\u00d2\b\u00c7\u0007s\u009dtn#\u00ef\b\u008b\u00e3M\u00e2\u00ff\u0083jJ\bFu\u00e9l\u00e7\u00b7\u0017M\b\u00e9v\u00e6\u00b9\u0014Iu5\b\u00930\u00b6\u00891dL\u0094".length();
                var4_7 = 8;
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
                    var0_3[var6_4++] = l69.b(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u0093-\u00ba\u00c4\u00be\u0010]\u00bf\u00d6\u00f2\u00c0d\u00e8fX\u0014\bX\u00a9I9\u008c\u00f0eS";
                    var7_6 = "\u0093-\u00ba\u00c4\u00be\u0010]\u00bf\u00d6\u00f2\u00c0d\u00e8fX\u0014\bX\u00a9I9\u008c\u00f0eS".length();
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
                    var0_3[var6_4++] = l69.b(var8_9).intern();
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
        l69.U = new String[]{var0_3[9], var0_3[12], var0_3[14], var0_3[0], var0_3[30], var0_3[23], var0_3[8], var0_3[6], var0_3[25], var0_3[15], var0_3[7], var0_3[19], var0_3[4], var0_3[27], var0_3[22], var0_3[24], var0_3[18], var0_3[20], var0_3[21], var0_3[3], var0_3[2], var0_3[10], var0_3[26], var0_3[1], var0_3[29], var0_3[16], var0_3[11], var0_3[28], var0_3[5], var0_3[13], var0_3[17]};
    }

    private static String b(byte[] byArray) {
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
