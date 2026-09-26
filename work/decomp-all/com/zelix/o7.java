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

public class o7
extends Enum {
    public static final o7 N;
    public static final o7 Q;
    public static final o7 U;
    public static final o7 L;
    public static final o7 S;
    private static final o7[] E;
    private static final long a;

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                o7.a = prr.a((long)976322613990650136L, (long)6085956503342807106L, MethodHandles.lookup().lookupClass()).a(143861270384820L);
                var9 = o7.a ^ 139141289698023L;
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
                var5_5 = "\\\u00b3\u0097\u00ef\u00adfh\u0003?\u000f|[\u00e0)u\u001eU\u00cb@kT\u00d5\u008bt\u0018mV^y\u0006.\u008c\u00caR\u007f\u00ec+:\u008ejJ\u008f\u00f2Y\u009c\u001a\u00bcx\u00f3\u0018\u00db\u00ea\u00d4v\u00dc\u00f7Q\u00d8\u00ba&\u0083\u008bB8{\u00fc\u0089\u00a3#T\u00bd\u0005\u009c\u00e4";
                var7_6 = "\\\u00b3\u0097\u00ef\u00adfh\u0003?\u000f|[\u00e0)u\u001eU\u00cb@kT\u00d5\u008bt\u0018mV^y\u0006.\u008c\u00caR\u007f\u00ec+:\u008ejJ\u008f\u00f2Y\u009c\u001a\u00bcx\u00f3\u0018\u00db\u00ea\u00d4v\u00dc\u00f7Q\u00d8\u00ba&\u0083\u008bB8{\u00fc\u0089\u00a3#T\u00bd\u0005\u009c\u00e4".length();
                var4_7 = 24;
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
                    var0_3[var6_4++] = o7.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00db\u00ea\u00d4v\u00dc\u00f7Q\u00d8\u00ba&\u0083\u008bB8{\u00fc\u0091+\u00f5!\u00d3\u00eeso\u0016\u00b6\u00e6C\u0002\u00c4\u00bfv\u0018IJ\u00e2Z\u00e2\u00afo\u00b3\u00cf}_B\u00d9G5J'\u00ecw]\u000bl\u001a\u0017";
                    var7_6 = "\u00db\u00ea\u00d4v\u00dc\u00f7Q\u00d8\u00ba&\u0083\u008bB8{\u00fc\u0091+\u00f5!\u00d3\u00eeso\u0016\u00b6\u00e6C\u0002\u00c4\u00bfv\u0018IJ\u00e2Z\u00e2\u00afo\u00b3\u00cf}_B\u00d9G5J'\u00ecw]\u000bl\u001a\u0017".length();
                    var4_7 = 32;
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
                    var0_3[var6_4++] = o7.a(var8_9).intern();
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
        o7.U = new o7(var0_3[0], 0);
        o7.L = new o7(var0_3[1], 1);
        o7.S = new o7(var0_3[2], 2);
        o7.N = new o7(var0_3[3], 3);
        o7.Q = new o7(var0_3[4], 4);
        o7.E = new o7[]{m44.a("o", (long)-6273388153866541657L, (long)var9), m44.a("o", (long)-5812842024655772096L, (long)var9), m44.a("o", (long)-5262318988782655816L, (long)var9), m44.a("o", (long)-5586740693312498123L, (long)var9), m44.a("o", (long)-6170619345451733604L, (long)var9)};
    }

    public static o7[] w(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (o7[])((Enum)((Object)m44.a("m", (long)2142934025461663076L, (long)l))).clone();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private o7() {
        void var2_-1;
        void var1_-1;
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
