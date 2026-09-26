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

public class ow
extends Enum {
    public static final ow L;
    public static final ow I;
    public static final ow v;
    public static final ow w;
    public static final ow r;
    public static final ow l;
    public static final ow E;
    public static final ow x;
    public static final ow h;
    public static final ow j;
    public static final ow K;
    private static final ow[] T;
    public static final ow B;
    private final int o;
    private static final long a;

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        ow.a = prr.a((long)218829644313726439L, (long)-8200840523077719419L, MethodHandles.lookup().lookupClass()).a(253956092396486L);
                        var20 = ow.a ^ 14443478666234L;
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
                        var16_5 = "\u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ffNP\u009e~c\u00d8\u00aa/\u00b1\u00c6\u009b\u00d8v\u0096PG \u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ffNP\u009e~c\u00d8\u00aa/@^\u0090\u001a\u008f\n\u00ed\u0082\u0080{k\u00ed\u008d\u0088\u00df\u00b7\u0018\u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ff\u00fd\u001a\u00e43\u00b3oI\u0085\u00da?\u00fa\u009f\u00e6ah\u000b \u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ffNP\u009e~c\u00d8\u00aa/H\u00896\u0083u\u00bb\u00e8\u000f\u009f\u000ed\u00ea\u00e5g\u00cbF\u0018\u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ff\u00bd\u00cd\u00ef\u0012\u00e1\u00bb\\=/\u00d2\b\u00f9\u00ce)\u0001\u00ce \u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ff\u0090\u00ee\u00fcS\u00c4h\u009cfS\u0086\u00cf\u00b9\u00c2\u0013\u00b8I%h\u00ca;\u00ea\u00e6KC \u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ffM|oP\u001cYm\u00d9k\u00d5Y@\u0004\u00fa9\u001bP\u00f3\u0088\u00c5\u008b\u00de[\u0093\u0018\u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ff;\u001d\u00f90%\u0014\"4\u00ee\u0005\u00f5\\yi\u00c5:\u0018\u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ff%:qO\u00c6\u001c+u\u00e0\u00b0\u00da\u0000\u001d\nk\u00a9\u0018\u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ff\u00e5\u00d7\u00fe\u00f7\u00bb\u00d5r\u000f)\u008d\u00e6[\u00fbF\u00adQ";
                        var18_6 = "\u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ffNP\u009e~c\u00d8\u00aa/\u00b1\u00c6\u009b\u00d8v\u0096PG \u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ffNP\u009e~c\u00d8\u00aa/@^\u0090\u001a\u008f\n\u00ed\u0082\u0080{k\u00ed\u008d\u0088\u00df\u00b7\u0018\u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ff\u00fd\u001a\u00e43\u00b3oI\u0085\u00da?\u00fa\u009f\u00e6ah\u000b \u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ffNP\u009e~c\u00d8\u00aa/H\u00896\u0083u\u00bb\u00e8\u000f\u009f\u000ed\u00ea\u00e5g\u00cbF\u0018\u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ff\u00bd\u00cd\u00ef\u0012\u00e1\u00bb\\=/\u00d2\b\u00f9\u00ce)\u0001\u00ce \u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ff\u0090\u00ee\u00fcS\u00c4h\u009cfS\u0086\u00cf\u00b9\u00c2\u0013\u00b8I%h\u00ca;\u00ea\u00e6KC \u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ffM|oP\u001cYm\u00d9k\u00d5Y@\u0004\u00fa9\u001bP\u00f3\u0088\u00c5\u008b\u00de[\u0093\u0018\u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ff;\u001d\u00f90%\u0014\"4\u00ee\u0005\u00f5\\yi\u00c5:\u0018\u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ff%:qO\u00c6\u001c+u\u00e0\u00b0\u00da\u0000\u001d\nk\u00a9\u0018\u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ff\u00e5\u00d7\u00fe\u00f7\u00bb\u00d5r\u000f)\u008d\u00e6[\u00fbF\u00adQ".length();
                        var15_7 = 24;
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
                            var11_3[var17_4++] = ow.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ff\u00c1lX\u00e1k\u00b8>&\u0088\u0018\u00d6\u00c3\u00172|\u00c3 \u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ffNP\u009e~c\u00d8\u00aa/H\u00896\u0083u\u00bb\u00e8\u000f`\u00d3\u00ceQ\u00d9m\u00c9b";
                            var18_6 = "\u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ff\u00c1lX\u00e1k\u00b8>&\u0088\u0018\u00d6\u00c3\u00172|\u00c3 \u00a1\u00ae\u00e8\u00e4\u00934\u008d\u00ffNP\u009e~c\u00d8\u00aa/H\u00896\u0083u\u00bb\u00e8\u000f`\u00d3\u00ceQ\u00d9m\u00c9b".length();
                            var15_7 = 24;
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
                            var11_3[var17_4++] = ow.a(var19_9).intern();
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
                var0_12 = new long[25];
                var4_13 = 0;
                var5_14 = "\u00f9\u00ea\u00e0\u00bc\u0091F\u00a1\u00026v(t\r\u008bm\\k\u000e(?\u00e7!SQ\u00cchR\u008b\u00e4\u0095k~\u00fbWZL\u00c6S\u00cd\u0085\u00aa\u00d0\u00cb\u00cf\u001eJ\u00ce`_-\u00adGlu:\"\u00af!Q\u00c6\u0013v eG\u00e8\u00b8\n\u00fb60.\u00b3\u008d\u0001lE\u00de_&\u00d0\u00de5A#F,\u0017\u00b1\u00c40\u0003'\u0011\u00d6\u00b7\u00ef\u00e6I\rx\u00c1\u00b5\b\u001cg\u0016\u00cb3\u001aj0#o\\\u00a4R\"\u0082\u00ed\u009b\u00aa\u001d\u00b7\u00b7d\u000f\u00d1\u00f2\u001b\u00f3\u00a4\u000bt\u00de\u0083w\u0088\u00bc\u0014z\u001b-$M\u0013\u0080\u00acb\u00cc;\u00c6\u0096#\u0088m\u00d1\u00bf\u008dQ\b\u00b9\u00e9RW`\r) m\u00d1G\u0015\u0091\u00fe\u0092\u00b0/\u00a7.JC\u0088\u0018";
                var6_15 = "\u00f9\u00ea\u00e0\u00bc\u0091F\u00a1\u00026v(t\r\u008bm\\k\u000e(?\u00e7!SQ\u00cchR\u008b\u00e4\u0095k~\u00fbWZL\u00c6S\u00cd\u0085\u00aa\u00d0\u00cb\u00cf\u001eJ\u00ce`_-\u00adGlu:\"\u00af!Q\u00c6\u0013v eG\u00e8\u00b8\n\u00fb60.\u00b3\u008d\u0001lE\u00de_&\u00d0\u00de5A#F,\u0017\u00b1\u00c40\u0003'\u0011\u00d6\u00b7\u00ef\u00e6I\rx\u00c1\u00b5\b\u001cg\u0016\u00cb3\u001aj0#o\\\u00a4R\"\u0082\u00ed\u009b\u00aa\u001d\u00b7\u00b7d\u000f\u00d1\u00f2\u001b\u00f3\u00a4\u000bt\u00de\u0083w\u0088\u00bc\u0014z\u001b-$M\u0013\u0080\u00acb\u00cc;\u00c6\u0096#\u0088m\u00d1\u00bf\u008dQ\b\u00b9\u00e9RW`\r) m\u00d1G\u0015\u0091\u00fe\u0092\u00b0/\u00a7.JC\u0088\u0018".length();
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
                    var5_14 = "\u00b0\f\u00b0=\u001f\\K\u001d\u0095S\u00c20r'+\u00ee";
                    var6_15 = "\u00b0\f\u00b0=\u001f\\K\u001d\u0095S\u00c20r'+\u00ee".length();
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
        ow.B = new ow(var11_3[6], 0, (int)var0_12[22]);
        ow.K = new ow(var11_3[5], 1, (int)var0_12[3]);
        ow.E = new ow(var11_3[4], 2, (int)var0_12[10]);
        ow.r = new ow(var11_3[9], 3, (int)var0_12[24]);
        ow.w = new ow(var11_3[10], 4, (int)var0_12[18]);
        ow.L = new ow(var11_3[0], 5, (int)var0_12[5]);
        ow.l = new ow(var11_3[3], (int)var0_12[23], (int)var0_12[14]);
        ow.j = new ow(var11_3[11], (int)var0_12[12], (int)var0_12[7]);
        ow.v = new ow(var11_3[1], (int)var0_12[13], (int)var0_12[0]);
        ow.x = new ow(var11_3[7], (int)var0_12[4], (int)var0_12[19]);
        ow.I = new ow(var11_3[2], (int)var0_12[9], (int)var0_12[1]);
        ow.h = new ow(var11_3[8], (int)var0_12[6], (int)var0_12[2]);
        v15 = new ow[(int)var0_12[16]];
        v15[0] = m44.a("j", (long)8881612937441189402L, (long)var20);
        v15[1] = m44.a("j", (long)7268466891812177626L, (long)var20);
        v15[2] = m44.a("j", (long)9056935767123910104L, (long)var20);
        v15[3] = m44.a("j", (long)7487705965486120526L, (long)var20);
        v15[4] = m44.a("j", (long)7443745348750227244L, (long)var20);
        v15[5] = m44.a("j", (long)8771051248755008681L, (long)var20);
        v15[(int)var0_12[17]] = m44.a("j", (long)7048344346831238098L, (long)var20);
        v15[(int)var0_12[8]] = m44.a("j", (long)9026392994271670596L, (long)var20);
        v15[(int)var0_12[15]] = m44.a("j", (long)7450077604797105743L, (long)var20);
        v15[(int)var0_12[11]] = m44.a("j", (long)7390120332893905731L, (long)var20);
        v15[(int)var0_12[21]] = m44.a("j", (long)7423665481884527919L, (long)var20);
        v15[(int)var0_12[20]] = m44.a("j", (long)8735297114607198753L, (long)var20);
        ow.T = v15;
    }

    public int w(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (int)m44.a("v", (Object)((Object)this), (long)5860896234776894608L, (long)l);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ow() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.o = var3_1;
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
