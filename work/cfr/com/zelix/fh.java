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

public class fh
extends Enum {
    public static final fh X;
    public static final fh b;
    private final boolean g;
    public static final fh T;
    public static final fh Y;
    public static final fh a;
    public static final fh M;
    public static final fh f;
    private static final fh[] x;
    public static final fh q;
    public static final fh u;
    public static final fh U;
    public static final fh R;
    public static final fh G;
    private static final long c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fh() {
        this((String)var1_-1, (int)var2_-1, false);
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        fh.c = prr.a(-4378494473152250882L, -1463571300671710778L, MethodHandles.lookup().lookupClass()).a(80411006727627L);
                        var20 = fh.c ^ 133063522646973L;
                        var12_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var13_2 = 1; var13_2 < 8; ++var13_2) {
                            v2 = v2;
                            v2[var13_2] = (byte)(var20 << var13_2 * 8 >>> 56);
                        }
                        var12_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var11_3 = new String[12];
                        var17_4 = 0;
                        var16_5 = "r\u00fc\u0002\u00bak\u00d0:\u00e5\u00ac\u00e4]\u009dd\u00d5A.\u00103\u00a8Z\u00d9\u00e6\t\u00de6`\u009c-\u0017K\u0014\u00e5N\bb\u007fb\u008ff\u00df\u001d\u00ef\u0010d\u001f*\u00e79\u00e4\u00ca\u00f2\u0000eH\u00b7\u00c8%\u00db\u00ae\u0010\u00c9\"\u0005\u0007\u00fe:\u0098\u00ac\u00fd`f\u0099\u0007\u00ebr/\bd)/\u0006\u001f\u00e1\u00a4$\u0010gJW\u001f \u009a\u0092Y\u00ae\u00a2\u009d\"\u00cf\u008c\u00fb?\u0010<z l\u008f\u0012\u001e\u00eb]L\u00ae\u00d8\u00ae\u0086\u00ea\u00eb\u0010\u00b5\u00b7\u008eO\u001aC\u0090nSe\u00c4\u00e8\u00c3\u0001\u00ce*\u0010\u00850|z\u009a\u009c3+\u00e6ZT9\u00c7\f1\u00aa";
                        var18_6 = "r\u00fc\u0002\u00bak\u00d0:\u00e5\u00ac\u00e4]\u009dd\u00d5A.\u00103\u00a8Z\u00d9\u00e6\t\u00de6`\u009c-\u0017K\u0014\u00e5N\bb\u007fb\u008ff\u00df\u001d\u00ef\u0010d\u001f*\u00e79\u00e4\u00ca\u00f2\u0000eH\u00b7\u00c8%\u00db\u00ae\u0010\u00c9\"\u0005\u0007\u00fe:\u0098\u00ac\u00fd`f\u0099\u0007\u00ebr/\bd)/\u0006\u001f\u00e1\u00a4$\u0010gJW\u001f \u009a\u0092Y\u00ae\u00a2\u009d\"\u00cf\u008c\u00fb?\u0010<z l\u008f\u0012\u001e\u00eb]L\u00ae\u00d8\u00ae\u0086\u00ea\u00eb\u0010\u00b5\u00b7\u008eO\u001aC\u0090nSe\u00c4\u00e8\u00c3\u0001\u00ce*\u0010\u00850|z\u009a\u009c3+\u00e6ZT9\u00c7\f1\u00aa".length();
                        var15_7 = 16;
                        var14_8 = -1;
lbl19:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_8;
                            v4 = var16_5.substring(v3, v3 + var15_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl24:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = fh.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u0016\u0014z*\u0006L\u00d3M\u000ecfX\u00cd\u00da\u0006D\u0010\u00905\u0005\u00aa\u0089F\u0007\n\u00e2\u00a7\u00ad\u00aa\u001f:\u00b0\u00b4";
                            var18_6 = "\u0016\u0014z*\u0006L\u00d3M\u000ecfX\u00cd\u00da\u0006D\u0010\u00905\u0005\u00aa\u0089F\u0007\n\u00e2\u00a7\u00ad\u00aa\u001f:\u00b0\u00b4".length();
                            var15_7 = 16;
                            var14_8 = -1;
lbl33:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_8;
                                v4 = var16_5.substring(v6, v6 + var15_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl38:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = fh.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var12_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                var1_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var2_11 = 1; var2_11 < 8; ++var2_11) {
                    v9 = v9;
                    v9[var2_11] = (byte)(var20 << var2_11 * 8 >>> 56);
                }
                var1_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var0_12 = new long[13];
                var4_13 = 0;
                var5_14 = "\u00f9\u00f0\u00c1\u008e\u0085\u00f6\u00d1\u0011iu\u00a3|%\u00afL\u00e0\u00c8$\u00b3I\u0018\r\u0000\u007fqt)\u00b8\u00a5\u00a2e\u0003\u00fb\u0092|\u0096!\u00da\u00f8\u00aaB\u00c2\u009f\u00c9\u0094\u00b6\u0081\u00e4\u008b\u00ba\u0080\n@\u0002\u00b5\u0081\u00f2\u00a6\b'\u008c_\u008c\u00f0\u009a\u00a6\r8\u000f8\u0081\u00f5W&mm\u00f8\u0084eln\u009ck\u009e\u00c2\u00069L";
                var6_15 = "\u00f9\u00f0\u00c1\u008e\u0085\u00f6\u00d1\u0011iu\u00a3|%\u00afL\u00e0\u00c8$\u00b3I\u0018\r\u0000\u007fqt)\u00b8\u00a5\u00a2e\u0003\u00fb\u0092|\u0096!\u00da\u00f8\u00aaB\u00c2\u009f\u00c9\u0094\u00b6\u0081\u00e4\u008b\u00ba\u0080\n@\u0002\u00b5\u0081\u00f2\u00a6\b'\u008c_\u008c\u00f0\u009a\u00a6\r8\u000f8\u0081\u00f5W&mm\u00f8\u0084eln\u009ck\u009e\u00c2\u00069L".length();
                var3_16 = 0;
                while (true) {
                    var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
                    v10 = var0_12;
                    v11 = var4_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl74:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_16 < var6_15) ** continue;
                    var5_14 = "\u0096qk\"\u0005y\u0012=G\r\u001e\u00a0\u000f\u0093\u00cf\u00a8";
                    var6_15 = "\u0096qk\"\u0005y\u0012=G\r\u001e\u00a0\u000f\u0093\u00cf\u00a8".length();
                    var3_16 = 0;
                    while (true) {
                        var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
                        v10 = var0_12;
                        v11 = var4_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl87:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_16 < var6_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var1_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl100:
                // 1 sources

                ** continue;
            }
        }
        fh.f = new fh(var11_3[8], 0);
        fh.q = new fh(var11_3[11], 1);
        fh.u = new fh(var11_3[5], 2);
        fh.T = new fh(var11_3[10], 3, true);
        fh.R = new fh(var11_3[3], 4, true);
        fh.M = new fh(var11_3[0], 5);
        fh.a = new fh(var11_3[7], (int)var0_12[5]);
        fh.Y = new fh(var11_3[1], (int)var0_12[7], true);
        fh.X = new fh(var11_3[9], (int)var0_12[0], true);
        fh.U = new fh(var11_3[6], (int)var0_12[3]);
        fh.G = new fh(var11_3[4], (int)var0_12[9]);
        fh.b = new fh(var11_3[2], (int)var0_12[6]);
        v15 = new fh[(int)var0_12[12]];
        v15[0] = m44.a("o", (long)-8628208494438011741L, (long)var20);
        v15[1] = m44.a("o", (long)-8341252722158050702L, (long)var20);
        v15[2] = fh.u;
        v15[3] = fh.T;
        v15[4] = m44.a("o", (long)-8266797849861210544L, (long)var20);
        v15[5] = m44.a("o", (long)-7905580782310157312L, (long)var20);
        v15[(int)var0_12[11]] = m44.a("o", (long)-8246506517247281242L, (long)var20);
        v15[(int)var0_12[8]] = m44.a("o", (long)-7556267707641841682L, (long)var20);
        v15[(int)var0_12[4]] = m44.a("o", (long)-7812609466992163240L, (long)var20);
        v15[(int)var0_12[10]] = fh.U;
        v15[(int)var0_12[2]] = m44.a("o", (long)-8287632111475181047L, (long)var20);
        v15[(int)var0_12[1]] = fh.b;
        fh.x = v15;
    }

    public static fh[] i(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = c ^ l10;
        return (fh[])((Enum)((Object)m44.a("i", (long)-6393073829978674666L, (long)l10))).clone();
    }

    public boolean l() {
        return this.g;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fh() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.g = var3_1;
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

