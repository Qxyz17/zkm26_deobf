/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class i1 {
    public static final Set c;

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = prr.a(-3892075944151018864L, -4020243143673465704L, MethodHandles.lookup().lookupClass()).a(23319186118336L) ^ 110596474452727L;
                var11_1 = var9 ^ 39385546036949L;
                var1_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var2_3 = 1; var2_3 < 8; ++var2_3) {
                    v2 = v2;
                    v2[var2_3] = (byte)(var9 << var2_3 * 8 >>> 56);
                }
                var1_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_4 = new String[59];
                var6_5 = 0;
                var5_6 = "\u008dm\u00eev\u0017\u0091.%\bH\u00ba\u00a4\u00a6\u00ac\u00c1\u00e4\u0087\bWZK\u00ac\u00da\u0012\u00ddK\b\u0084\u00a5\u008ep\u0099\u00d2\u00d9\u0093\b\u0088\u008f\u00c9\u0095\u00f6\u00b5\u00be\u0016\u0010\u00d9k\u0096\u00f1\u009d\u0080\u001e\u0091\u007fH\u00eb\u0002Z\u00b11x\u0010\u008a\u00a3\u0001\u00d06z\u00ea\u00e3\u008a\u00b2!\u00aa\u0019Pf\u0014\b\r\u00aa\u00acG\u00c7\u0094\u0018\u0094\b\u001c9\u001d\u00ce\u0081\u00fe\u0081\u00ae\bW\u0003\u00d9\u009b\u0006\u0086\u00cc\u0000\u0010\u00ddSz\u00ad\u00eb\u000bN\u00a4\u0002k\u0085\u0091\u00c3\u00e4G\u00a9\b\u00ca\u00b3\u00ec\u00e2Z \u00b2b\b\u0019|Q\u001f\u0004\u00e5\u00ed\u00ca\u0010\u00d9\u00a7\u0095\u00bc\r\u00de\u0007fN\u00b8a\u00b7\u009a\"$=\u0010S\u0003\u00c9\u0003\u00f7\u008dtD1\u0082\u0004c\u00f5C\u00ff\u00ce\bd\u00d1h4yT\u00e9G\b\u0017t-\u0018\u00ed\u000b\u00da{\b\u009c\u00eah\u00f8p\u000e\u00a5\u00f7\bs6\u00f0\r\u000b\u008b\u007f\f\b\u00d7\u009e\u001b\u008f\u00c1\b\u000f\u008a\b\u00d9[Z\u00c4\u0011\n\u00e38\b\u00c7+,\u00c7\u0007\u0005\u009d\u00d2\bFv\u00bc\u00e2\u00bf\u00d5\u008ey\ba\u00f8\u00bd\u00d2\u00d0\u008f\u00a7,\b\u00cc\u00f0\u00c6bS\u007f\"\u000f\b\u009e\u00fa\u0093\u000eO\u00df\u0095\u0095\u0010\u00e7\u0013\u0019\u00e2\u00e2\u00d5R\u00b5|\u0004\u0088\u00f5P\u00c6\u0090p\bQ\u00f3#\u009f\u00dd\u0080\u0002k\b\u0004\u0092\u0014M\u00a6\u00a9\u00e2K\bV\u00f1\u0086\u00b6\u0085AHe\b\u00ab\u0014\u0017\u0088~\u00c1\u00fe$\b\u00d9h#\u00b0\u0007\u000e\u00a2\u00f1\u0010\u00ccb\u0006\u0007\u00d5i:0\u00b5\u00df\u00cc\u00dd\u001bq\u00daZ\u0010k\u0010/\u00bc\u00a2\u00e6\u00e6\u0013\u00a6\u00fc\n\u00a0\u00cc\u00e4\u009c\u00e7\b\u008f-\u00ea\u00a7\u00df{\u0004\u0092\b\u00eb-n\u00b2K\u00ba\u0088\u0081\b\u00f6g%\u00caP\u009a\u008b\u00da\brP\u00cc\u007f\u0014\u00b7\u008b\u00b2\b\u00991\u0089\u00ec\u00bed\u0003q\u0010W\u00a9\u0095\u00d7\u00a1av).M\\s\u00c4\u00e8!\t\b\u008f:\u008ab\u00ed9\u00e6\u00ec\b\u00fe\u00f5\u00dc\u00c2\u0004\u00959X\b\u00ee\tK\u00e7[\u0084v \u0010\u00e0 E\u00c9\u00b6\u00d8l\u0012zj>\u00da=\u0006\u0094\u00a6\b\u0085!F\u00b1\u00ce\u00bd\u00e1\u0091\b\u00de\u00dfJ\u008a\u00a8 \n\u00de\b!\u00f2L\u00bf-\u00ec\u00ac\u000b\b\u00b7)\u007fA\u00d7\u0013\u00f6,\bxp\t\u001f\u00bcDi~\b\u00d9F\u00beL\f\u00c6 \u00d1\b+\u0090<\u00dd\u00b8\u00d5\u00d1u\b\u0015h6\u00a0\u000b\u00bfp\u009f\b\u00fa=*\u009d\u008f\u00c20\u009b\b\u001d3\u00c2\u0088\u0097hg\u00d3\u0010\u00f7}\u0082f\u0012Ea\u00fd\u00ca#kI\u00d1-0\u0011\b\u00e0\u0094\u00b0P\u00d1\u008e\b\u00f3\bH\u00d0[\u00fd\u00a5\u00fe\u00bd\u00ae";
                var7_7 = "\u008dm\u00eev\u0017\u0091.%\bH\u00ba\u00a4\u00a6\u00ac\u00c1\u00e4\u0087\bWZK\u00ac\u00da\u0012\u00ddK\b\u0084\u00a5\u008ep\u0099\u00d2\u00d9\u0093\b\u0088\u008f\u00c9\u0095\u00f6\u00b5\u00be\u0016\u0010\u00d9k\u0096\u00f1\u009d\u0080\u001e\u0091\u007fH\u00eb\u0002Z\u00b11x\u0010\u008a\u00a3\u0001\u00d06z\u00ea\u00e3\u008a\u00b2!\u00aa\u0019Pf\u0014\b\r\u00aa\u00acG\u00c7\u0094\u0018\u0094\b\u001c9\u001d\u00ce\u0081\u00fe\u0081\u00ae\bW\u0003\u00d9\u009b\u0006\u0086\u00cc\u0000\u0010\u00ddSz\u00ad\u00eb\u000bN\u00a4\u0002k\u0085\u0091\u00c3\u00e4G\u00a9\b\u00ca\u00b3\u00ec\u00e2Z \u00b2b\b\u0019|Q\u001f\u0004\u00e5\u00ed\u00ca\u0010\u00d9\u00a7\u0095\u00bc\r\u00de\u0007fN\u00b8a\u00b7\u009a\"$=\u0010S\u0003\u00c9\u0003\u00f7\u008dtD1\u0082\u0004c\u00f5C\u00ff\u00ce\bd\u00d1h4yT\u00e9G\b\u0017t-\u0018\u00ed\u000b\u00da{\b\u009c\u00eah\u00f8p\u000e\u00a5\u00f7\bs6\u00f0\r\u000b\u008b\u007f\f\b\u00d7\u009e\u001b\u008f\u00c1\b\u000f\u008a\b\u00d9[Z\u00c4\u0011\n\u00e38\b\u00c7+,\u00c7\u0007\u0005\u009d\u00d2\bFv\u00bc\u00e2\u00bf\u00d5\u008ey\ba\u00f8\u00bd\u00d2\u00d0\u008f\u00a7,\b\u00cc\u00f0\u00c6bS\u007f\"\u000f\b\u009e\u00fa\u0093\u000eO\u00df\u0095\u0095\u0010\u00e7\u0013\u0019\u00e2\u00e2\u00d5R\u00b5|\u0004\u0088\u00f5P\u00c6\u0090p\bQ\u00f3#\u009f\u00dd\u0080\u0002k\b\u0004\u0092\u0014M\u00a6\u00a9\u00e2K\bV\u00f1\u0086\u00b6\u0085AHe\b\u00ab\u0014\u0017\u0088~\u00c1\u00fe$\b\u00d9h#\u00b0\u0007\u000e\u00a2\u00f1\u0010\u00ccb\u0006\u0007\u00d5i:0\u00b5\u00df\u00cc\u00dd\u001bq\u00daZ\u0010k\u0010/\u00bc\u00a2\u00e6\u00e6\u0013\u00a6\u00fc\n\u00a0\u00cc\u00e4\u009c\u00e7\b\u008f-\u00ea\u00a7\u00df{\u0004\u0092\b\u00eb-n\u00b2K\u00ba\u0088\u0081\b\u00f6g%\u00caP\u009a\u008b\u00da\brP\u00cc\u007f\u0014\u00b7\u008b\u00b2\b\u00991\u0089\u00ec\u00bed\u0003q\u0010W\u00a9\u0095\u00d7\u00a1av).M\\s\u00c4\u00e8!\t\b\u008f:\u008ab\u00ed9\u00e6\u00ec\b\u00fe\u00f5\u00dc\u00c2\u0004\u00959X\b\u00ee\tK\u00e7[\u0084v \u0010\u00e0 E\u00c9\u00b6\u00d8l\u0012zj>\u00da=\u0006\u0094\u00a6\b\u0085!F\u00b1\u00ce\u00bd\u00e1\u0091\b\u00de\u00dfJ\u008a\u00a8 \n\u00de\b!\u00f2L\u00bf-\u00ec\u00ac\u000b\b\u00b7)\u007fA\u00d7\u0013\u00f6,\bxp\t\u001f\u00bcDi~\b\u00d9F\u00beL\f\u00c6 \u00d1\b+\u0090<\u00dd\u00b8\u00d5\u00d1u\b\u0015h6\u00a0\u000b\u00bfp\u009f\b\u00fa=*\u009d\u008f\u00c20\u009b\b\u001d3\u00c2\u0088\u0097hg\u00d3\u0010\u00f7}\u0082f\u0012Ea\u00fd\u00ca#kI\u00d1-0\u0011\b\u00e0\u0094\u00b0P\u00d1\u008e\b\u00f3\bH\u00d0[\u00fd\u00a5\u00fe\u00bd\u00ae".length();
                var4_8 = 8;
                var3_9 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var3_9;
                    v4 = var5_6.substring(v3, v3 + var4_8);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var0_4[var6_5++] = i1.a(var8_10).intern();
                    if ((var3_9 += var4_8) < var7_7) {
                        var4_8 = var5_6.charAt(var3_9);
                        ** continue;
                    }
                    var5_6 = "\u008b\u009d\u00a5\u00b2%Z\u00f2\u000b\b\u00d7\u00d9k\u0005\u00b49\u009c9";
                    var7_7 = "\u008b\u009d\u00a5\u00b2%Z\u00f2\u000b\b\u00d7\u00d9k\u0005\u00b49\u009c9".length();
                    var4_8 = 8;
                    var3_9 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_9;
                        v4 = var5_6.substring(v6, v6 + var4_8);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var0_4[var6_5++] = i1.a(var8_10).intern();
                    if ((var3_9 += var4_8) < var7_7) {
                        var4_8 = var5_6.charAt(var3_9);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_10 = var1_2.doFinal(v4.getBytes("ISO-8859-1"));
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
        v7 = new Object[1];
        v7[0] = var11_1;
        i1.c = m44.a("j", (Object)v7, (long)-4975940783293611150L, (long)var9);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add("_");
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[5]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[55]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[36]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[34]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[35]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[30]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[49]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[46]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[52]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[21]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[39]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[38]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[17]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[37]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[51]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[47]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[25]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[42]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[41]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[15]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[40]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[19]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[18]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[28]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[26]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[31]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[6]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[20]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[10]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[2]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[56]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[16]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[7]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[14]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[53]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[23]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[22]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[44]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[33]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[11]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[12]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[48]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[3]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[0]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[13]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[57]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[29]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[43]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[9]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[8]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[4]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[54]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[24]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[50]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[27]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[58]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[32]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[1]);
        m44.a("n", (long)-6597122830172268441L, (long)var9).add(var0_4[45]);
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

