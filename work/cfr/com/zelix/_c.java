/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _c {
    public static final String V;
    public static final String D;
    public static final String a;
    public static final String A;
    public static final String u;
    public static final File c;
    public static final String k;
    public static final String Z;
    public static final String I;
    public static final char x;
    public static final String E;
    public static final char b;
    public static final String n;

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = prr.a(-6088369561903640184L, -6574757835641761569L, MethodHandles.lookup().lookupClass()).a(40008564753168L) ^ 19999646268214L;
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
                var0_3 = new String[11];
                var6_4 = 0;
                var5_5 = "K5!T@o\u0087\u00055\u00f9A\u00fab\u00ce3\u00e4\u0010\u00f5\u0011t\r\u00eb\u00d2\u00e7\u00bc\u0011>\u00dcW\u00d5?\u00e2\u0093\u0010\u0019N\u00f3\u001e}\u0088W\u00fd\u00bc\u00d3\u008fpO9\u00979\u0010\u00fa>\u00c6\u0087\u00c0\u00d7\u00a7\u00980#\u00fe\u0080\u000e\u00a02\u00de\b$\u00dd?\u00c2\u00b5\u00bec\u00fd\u0010\u00df\u00f1\u00b1\u00c2l\u00fc@Y$\u0004\u00cb)\u00e3\u00a7q\u00c8\u0010\u001f\u00ade\u00b8\u00da3o\u00c7\u0088\t\u00be\u0007x\u0003\u00f1\u00f9\u0018\u00e8l(\u00e9o\u00ad\u0019G\u0084\u00ba\u00aa\u0018\u00b7\u00ba\u00ddUj\tt\u00a0XqP\u00d1\b\u0099\u00f8\u0017\u0017\u008f\u00a6\u00cbi";
                var7_6 = "K5!T@o\u0087\u00055\u00f9A\u00fab\u00ce3\u00e4\u0010\u00f5\u0011t\r\u00eb\u00d2\u00e7\u00bc\u0011>\u00dcW\u00d5?\u00e2\u0093\u0010\u0019N\u00f3\u001e}\u0088W\u00fd\u00bc\u00d3\u008fpO9\u00979\u0010\u00fa>\u00c6\u0087\u00c0\u00d7\u00a7\u00980#\u00fe\u0080\u000e\u00a02\u00de\b$\u00dd?\u00c2\u00b5\u00bec\u00fd\u0010\u00df\u00f1\u00b1\u00c2l\u00fc@Y$\u0004\u00cb)\u00e3\u00a7q\u00c8\u0010\u001f\u00ade\u00b8\u00da3o\u00c7\u0088\t\u00be\u0007x\u0003\u00f1\u00f9\u0018\u00e8l(\u00e9o\u00ad\u0019G\u0084\u00ba\u00aa\u0018\u00b7\u00ba\u00ddUj\tt\u00a0XqP\u00d1\b\u0099\u00f8\u0017\u0017\u008f\u00a6\u00cbi".length();
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
                    var0_3[var6_4++] = _c.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00f5\u0011t\r\u00eb\u00d2\u00e7\u00bc\u009eE\u00f1s\u001e\u00e90\u00bc\u0010\u0086\u00f5\u00bb\u0094\u0092\u00c6\u008fV\u00f08r\u0096\u00ff\u00c8\u00d2t";
                    var7_6 = "\u00f5\u0011t\r\u00eb\u00d2\u00e7\u00bc\u009eE\u00f1s\u001e\u00e90\u00bc\u0010\u0086\u00f5\u00bb\u0094\u0092\u00c6\u008fV\u00f08r\u0096\u00ff\u00c8\u00d2t".length();
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
                    var0_3[var6_4++] = _c.a(var8_9).intern();
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
        _c.D = m44.a("l", var0_3[2], (long)7157846049058130154L, (long)var9);
        _c.u = m44.a("l", var0_3[10], (long)7157846049058130154L, (long)var9);
        _c.x = m44.a("h", (long)7223357691816310445L, (long)var9).charAt(0);
        _c.a = m44.a("l", var0_3[6], (long)7157846049058130154L, (long)var9);
        _c.b = m44.a("h", (long)7468516489460490292L, (long)var9).charAt(0);
        _c.n = m44.a("l", var0_3[5], (Object)"\n", (long)7420788354867496423L, (long)var9);
        _c.c = new File((String)m44.a("h", (long)7147761291280430348L, (long)var9));
        _c.I = m44.a("l", var0_3[9], (Object)var0_3[8], (long)7420788354867496423L, (long)var9);
        _c.A = m44.a("l", var0_3[1], (long)7157846049058130154L, (long)var9);
        _c.Z = m44.a("l", var0_3[0], (Object)m44.a("h", (long)7147761291280430348L, (long)var9), (long)7420788354867496423L, (long)var9);
        _c.V = m44.a("l", var0_3[7], (long)7157846049058130154L, (long)var9);
        _c.E = m44.a("l", var0_3[4], (long)7157846049058130154L, (long)var9);
        _c.k = m44.a("l", var0_3[3], (long)7157846049058130154L, (long)var9);
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

