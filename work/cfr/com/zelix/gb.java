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

public interface gb {
    public static final String[] q;

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = prr.a(-6814725148232099836L, -3374033838496821026L, MethodHandles.lookup().lookupClass()).a(54089859311942L) ^ 74367683360652L;
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
                var0_3 = new String[21];
                var6_4 = 0;
                var5_5 = "\u00c4A\u0011P,DNC\u0010\u00b4x\u00b9w\u00bd\u00c6\u00b2\u00b7/\u009a\u0091fP\u0098\u009b\u00e5 sD\u00f2\u00dc\u00e3\u0004\u00a3\u0097k\u00be\u000f\u00af\u0093s\u00edM\u0000\u00a5\u00c5\u0015\u000b\u00a7\u00a5\u00b5\u0080\u00002\u009f\u00b2\u00897V\u0018\u00d8\u00fd\u00cd\u00a7\u00c1\u00ae\u0090PA\u00f1>\u0093\u00a1\u009c<\u00e8\u00b1\u00a5O\u00d8\u00b0\u0095\u00b4\u0098\u0010\u00a3\u00c0\u0091d\u00bb\u001b\u00d5\u0002\u00e2_\u001c\u00dd\u00ec\u00b5\u0019\u00bc\u0010\u00d8\u00fd\u00cd\u00a7\u00c1\u00ae\u0090P\u00d6v\u00b2\t\u00faS:t\u0010:\u00ec\u0017E\u00eb\u0091\u0092Lb/hH\u00fc\u00de\u001ez\u0018\u00e9%r\u00ce\u00afK\u008e\u00a7\u00997}.\u00f81P\u00cb\u00c8\u000f\u008c\u00b8\u00cb\u0011U\u00e0 \u00d8\u00fd\u00cd\u00a7\u00c1\u00ae\u0090P\u0085a+s\\\u0092uK^%O\u00ad\u00c0{\u0018\u0007G\u00d7{NK\u00fc\u00a8\u00f7 \u0083\u00c4\u00d1|\u00b9\u009e\u00fa33\u00d3\u0000\u00b9\u00ca\u0010\u00ae\u00a0\u0087WAb\u00b0\u00b7J\u0007\u00dev\u00110j  \u00f7 \u0083\u00c4\u00d1|\u00b9\u009e\u00fa33\u00d3\u0000\u00b9\u00ca\u0010\u00ae\u00a0\u00e2\u00faOQ\u00ad\u00dd\u00b2p\u0087\b\u001e\u00f8\u00d7L\u00a7r \u00e9%r\u00ce\u00afK\u008e\u00a7\u00997}.\u00f81P\u00cbp'\u00d9\u001ftS\u0081\u0001&\u0088\u000e7)l\u008d^\u0018%\u007f\u0081\u00a2\u009czAr\u00acU\u001dV]\u008e\u00d4\u008cJ\u00e3*3\u00f5J\u00ee\u00ca\b\u00dc\u00b3\u0000P\u0083\u001d\u0086\u00d7 \u00d8\u00fd\u00cd\u00a7\u00c1\u00ae\u0090P\u0085a+s\\\u0092uK\u000fl\u00b3\u00ebT\u00a1\u00c2yW\u00d2\u00b1\u00d1Q\u0018u\u00d4\u0018h\u00c0F\u008d\u00b1\u0012\u0087\u00d3\u00e6d\u00ea$\u0005|\u00a0\u0080\u009b\u008d\u00bd\u0082g\u00b5\u00cd\u00ce\u0010\u00d7\u00f7p\u00dfHI\u000e\u0007\u00d6&$\f\u00c5\u008a_\u00e6 h\u00c0F\u008d\u00b1\u0012\u0087\u00d3\u00e6d\u00ea$\u0005|\u00a0\u0080\u00db\u00f0\u00e5\u00d8si\u001d\u000f<`\u00c7w$\u0081\u00c9<\u0010OP\u00f0\u00a3'\u008e\u0013\u00c7\u00e0\u00a0\u0088\f\u0093\u00b0\u00f6\u00f0";
                var7_6 = "\u00c4A\u0011P,DNC\u0010\u00b4x\u00b9w\u00bd\u00c6\u00b2\u00b7/\u009a\u0091fP\u0098\u009b\u00e5 sD\u00f2\u00dc\u00e3\u0004\u00a3\u0097k\u00be\u000f\u00af\u0093s\u00edM\u0000\u00a5\u00c5\u0015\u000b\u00a7\u00a5\u00b5\u0080\u00002\u009f\u00b2\u00897V\u0018\u00d8\u00fd\u00cd\u00a7\u00c1\u00ae\u0090PA\u00f1>\u0093\u00a1\u009c<\u00e8\u00b1\u00a5O\u00d8\u00b0\u0095\u00b4\u0098\u0010\u00a3\u00c0\u0091d\u00bb\u001b\u00d5\u0002\u00e2_\u001c\u00dd\u00ec\u00b5\u0019\u00bc\u0010\u00d8\u00fd\u00cd\u00a7\u00c1\u00ae\u0090P\u00d6v\u00b2\t\u00faS:t\u0010:\u00ec\u0017E\u00eb\u0091\u0092Lb/hH\u00fc\u00de\u001ez\u0018\u00e9%r\u00ce\u00afK\u008e\u00a7\u00997}.\u00f81P\u00cb\u00c8\u000f\u008c\u00b8\u00cb\u0011U\u00e0 \u00d8\u00fd\u00cd\u00a7\u00c1\u00ae\u0090P\u0085a+s\\\u0092uK^%O\u00ad\u00c0{\u0018\u0007G\u00d7{NK\u00fc\u00a8\u00f7 \u0083\u00c4\u00d1|\u00b9\u009e\u00fa33\u00d3\u0000\u00b9\u00ca\u0010\u00ae\u00a0\u0087WAb\u00b0\u00b7J\u0007\u00dev\u00110j  \u00f7 \u0083\u00c4\u00d1|\u00b9\u009e\u00fa33\u00d3\u0000\u00b9\u00ca\u0010\u00ae\u00a0\u00e2\u00faOQ\u00ad\u00dd\u00b2p\u0087\b\u001e\u00f8\u00d7L\u00a7r \u00e9%r\u00ce\u00afK\u008e\u00a7\u00997}.\u00f81P\u00cbp'\u00d9\u001ftS\u0081\u0001&\u0088\u000e7)l\u008d^\u0018%\u007f\u0081\u00a2\u009czAr\u00acU\u001dV]\u008e\u00d4\u008cJ\u00e3*3\u00f5J\u00ee\u00ca\b\u00dc\u00b3\u0000P\u0083\u001d\u0086\u00d7 \u00d8\u00fd\u00cd\u00a7\u00c1\u00ae\u0090P\u0085a+s\\\u0092uK\u000fl\u00b3\u00ebT\u00a1\u00c2yW\u00d2\u00b1\u00d1Q\u0018u\u00d4\u0018h\u00c0F\u008d\u00b1\u0012\u0087\u00d3\u00e6d\u00ea$\u0005|\u00a0\u0080\u009b\u008d\u00bd\u0082g\u00b5\u00cd\u00ce\u0010\u00d7\u00f7p\u00dfHI\u000e\u0007\u00d6&$\f\u00c5\u008a_\u00e6 h\u00c0F\u008d\u00b1\u0012\u0087\u00d3\u00e6d\u00ea$\u0005|\u00a0\u0080\u00db\u00f0\u00e5\u00d8si\u001d\u000f<`\u00c7w$\u0081\u00c9<\u0010OP\u00f0\u00a3'\u008e\u0013\u00c7\u00e0\u00a0\u0088\f\u0093\u00b0\u00f6\u00f0".length();
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
                    var0_3[var6_4++] = gb.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "sD\u00f2\u00dc\u00e3\u0004\u00a3\u0097k\u00be\u000f\u00af\u0093s\u00edM=,\u00b9\u0012\u0084{\u00a4\u00b0M\u00caT\u008e\u00f5\u00c9\u00d3N\u0018\u00d8\u00fd\u00cd\u00a7\u00c1\u00ae\u0090P\u0012K\n\u0017\u000b\u00c7\u00c4\u00df\u00c0\u0000\u00db\u00e2\u00d8\u00ed\u00a8\u00dd";
                    var7_6 = "sD\u00f2\u00dc\u00e3\u0004\u00a3\u0097k\u00be\u000f\u00af\u0093s\u00edM=,\u00b9\u0012\u0084{\u00a4\u00b0M\u00caT\u008e\u00f5\u00c9\u00d3N\u0018\u00d8\u00fd\u00cd\u00a7\u00c1\u00ae\u0090P\u0012K\n\u0017\u000b\u00c7\u00c4\u00df\u00c0\u0000\u00db\u00e2\u00d8\u00ed\u00a8\u00dd".length();
                    var4_7 = 32;
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
                    var0_3[var6_4++] = gb.a(var8_9).intern();
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
        gb.q = new String[]{var0_3[18], var0_3[12], var0_3[10], var0_3[9], var0_3[6], var0_3[4], var0_3[13], var0_3[0], var0_3[16], var0_3[7], var0_3[11], var0_3[20], var0_3[3], var0_3[15], var0_3[17], var0_3[8], var0_3[14], var0_3[1], var0_3[19], var0_3[2], var0_3[5]};
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

