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

public class m7
extends Enum {
    public static final m7 Z;
    public static final m7 F;
    public static final m7 y;
    public static final m7 g;
    public static final m7 H;
    public static final m7 b;
    private static final m7[] O;
    public static final m7 X;
    public static final m7 N;
    public static final m7 Q;
    public static final m7 t;
    public static final m7 c;
    public static final m7 d;
    public static final m7 S;
    private final int C;
    public static final m7 P;

    public int q() {
        return this.C;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        var20 = prr.a((long)2606854389857648621L, (long)-1698688129768080576L, MethodHandles.lookup().lookupClass()).a(10619826333261L) ^ 92331711625843L;
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
                        var11_3 = new String[14];
                        var17_4 = 0;
                        var16_5 = "\u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\u00e1j\u00cc\u00a0\u0080\u00e2\u00aa\u00b7G\u00cd\u009c\u00d1\u00a9'\u00adO\u0018\u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\u00e5\u00ff\u00eeL\u0090\u00cc\u0017\u00a9P\u0082 CM\u0087\u0018\u00ef \u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\fBAlA\ra\u00bd\u00dc\u00aeE\u0013\u00e4\"z\f\u000e*xh8\u00c5\u009cw\u0010\u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\u008be\u00c5\u00b9\u00b0A\u00ad^\u0018\u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\u009f\u00db\u0081\u00ffV\u00cft\n\u009eP\u00ed\u00aa\u00a4\u0018\u009ck \u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\fBAlA\ra\u00bd\u0085\u00e3!\u008f)\u00b1~f\u00a5\u00e7\u00c9\u00a6\u00e1n\u0086\u001a\u0018\u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\u00b8\u00d3t\u001ap\u0097\u0011\u00d6\u001df|\u00fc4\\\u009c\u0018 \u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac'CC\u001c\u0083\u008b&\u00b5\u00d5@?7|'\u00df\u0012j\u00b9\u00af\u00b03/F\u00ba\u0018\u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\u00c7\t\u00c7D\u008a\u00bb\u009f-\u0017\nr{\u009cWj\u0099\u0018\u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\fBAlA\ra\u00bd>M\u00c6p\u00e5.S\u00b6\u0018\u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\u00e1j\u00cc\u00a0\u0080\u00e2\u00aa\u00b7\u00e6\u00a8\u00ed\u00c8\u00da\u00ba~\u001a \u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\fBAlA\ra\u00bd\u0085\u00e3!\u008f)\u00b1~f\u009e\u00ff\u00cdK\u00e1\r\u00da\u0012";
                        var18_6 = "\u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\u00e1j\u00cc\u00a0\u0080\u00e2\u00aa\u00b7G\u00cd\u009c\u00d1\u00a9'\u00adO\u0018\u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\u00e5\u00ff\u00eeL\u0090\u00cc\u0017\u00a9P\u0082 CM\u0087\u0018\u00ef \u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\fBAlA\ra\u00bd\u00dc\u00aeE\u0013\u00e4\"z\f\u000e*xh8\u00c5\u009cw\u0010\u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\u008be\u00c5\u00b9\u00b0A\u00ad^\u0018\u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\u009f\u00db\u0081\u00ffV\u00cft\n\u009eP\u00ed\u00aa\u00a4\u0018\u009ck \u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\fBAlA\ra\u00bd\u0085\u00e3!\u008f)\u00b1~f\u00a5\u00e7\u00c9\u00a6\u00e1n\u0086\u001a\u0018\u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\u00b8\u00d3t\u001ap\u0097\u0011\u00d6\u001df|\u00fc4\\\u009c\u0018 \u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac'CC\u001c\u0083\u008b&\u00b5\u00d5@?7|'\u00df\u0012j\u00b9\u00af\u00b03/F\u00ba\u0018\u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\u00c7\t\u00c7D\u008a\u00bb\u009f-\u0017\nr{\u009cWj\u0099\u0018\u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\fBAlA\ra\u00bd>M\u00c6p\u00e5.S\u00b6\u0018\u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\u00e1j\u00cc\u00a0\u0080\u00e2\u00aa\u00b7\u00e6\u00a8\u00ed\u00c8\u00da\u00ba~\u001a \u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\fBAlA\ra\u00bd\u0085\u00e3!\u008f)\u00b1~f\u009e\u00ff\u00cdK\u00e1\r\u00da\u0012".length();
                        var15_7 = 24;
                        var14_8 = -1;
lbl18:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_8;
                            v4 = var16_5.substring(v3, v3 + var15_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl23:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = m7.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\u00e0\u00e3!'7~\u00a74\u0007\u00c5o\u00fe`\u00ed\u00a6\u00d7 \u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac$W\u00db\"M\u0084\u00a32\u009ecS\u00b7\u009e\u00eeP_\u00cf\u00bcK\u00e2u\u00b3\u00a3(";
                            var18_6 = "\u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac\u00e0\u00e3!'7~\u00a74\u0007\u00c5o\u00fe`\u00ed\u00a6\u00d7 \u00ad\u00fe\u0007\u00ee\u00006\u008a\u00ac$W\u00db\"M\u0084\u00a32\u009ecS\u00b7\u009e\u00eeP_\u00cf\u00bcK\u00e2u\u00b3\u00a3(".length();
                            var15_7 = 24;
                            var14_8 = -1;
lbl32:
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
lbl37:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = m7.a(var19_9).intern();
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
lbl49:
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
                var0_12 = new long[26];
                var4_13 = 0;
                var5_14 = "\u00b6\u00dfz\u008a\u0012 \u0083\u00b1\u00b2d\u00db\u00a4\u00b6H)\u00dd?\u00be\u0094\u001eQc\u007f\u00dd\u0006\u00f6rr\u00f8@\u0093\u0093 \u00f5o|\n\u008f\u0098\u00c9\u00d4\u00a1\u00a7wGX\u0011lj\u001d\u0081x%\u000b\u00d2\u0089\u00ed\u00feG\n{\u00f9\u00d7\u00b4\u00ccT\u00d9\u00d6\u009do\u00fa\u00b5\u00ed8\u00e3b\u0085\u001f\u000b\u0016\u007fO\u00adl`6V\u00bc\u00a10$[\u00a5\u0000|]\u000f#\u0098\u0092\u0014\u00f96}\u00abJ\u00fa\u00bd\u00d2\u00f2/zbp\u00d99*\u0090\u001dL^\u00b2\u0017\u00eb\u00bc\u00d6\u008eYVr\u0010\u008d\u00d1P\u00c4\u00c1\u00ad\u009c\u00b9L\u00ffB\u0012\u00fc>\u00cd\u00a1\u00d4\u0092\u00c4\u00a1\u001a\u0085'n\u00d8N%\u00dc\u00b2\u00deS\u0096{\u009d\u008f!\u00ba1\u0096\u00cd\u00da\u00e3\u00bc?w\u00af \u00c0^\u00db\u0003\u00bb\u0092\u00acW\u00cd&\u00fdjI\u00f0";
                var6_15 = "\u00b6\u00dfz\u008a\u0012 \u0083\u00b1\u00b2d\u00db\u00a4\u00b6H)\u00dd?\u00be\u0094\u001eQc\u007f\u00dd\u0006\u00f6rr\u00f8@\u0093\u0093 \u00f5o|\n\u008f\u0098\u00c9\u00d4\u00a1\u00a7wGX\u0011lj\u001d\u0081x%\u000b\u00d2\u0089\u00ed\u00feG\n{\u00f9\u00d7\u00b4\u00ccT\u00d9\u00d6\u009do\u00fa\u00b5\u00ed8\u00e3b\u0085\u001f\u000b\u0016\u007fO\u00adl`6V\u00bc\u00a10$[\u00a5\u0000|]\u000f#\u0098\u0092\u0014\u00f96}\u00abJ\u00fa\u00bd\u00d2\u00f2/zbp\u00d99*\u0090\u001dL^\u00b2\u0017\u00eb\u00bc\u00d6\u008eYVr\u0010\u008d\u00d1P\u00c4\u00c1\u00ad\u009c\u00b9L\u00ffB\u0012\u00fc>\u00cd\u00a1\u00d4\u0092\u00c4\u00a1\u001a\u0085'n\u00d8N%\u00dc\u00b2\u00deS\u0096{\u009d\u008f!\u00ba1\u0096\u00cd\u00da\u00e3\u00bc?w\u00af \u00c0^\u00db\u0003\u00bb\u0092\u00acW\u00cd&\u00fdjI\u00f0".length();
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
lbl73:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_16 < var6_15) ** continue;
                    var5_14 = "\u00da\u008b\u00b2\u0080W\u0091\u008a\u00d35N\u000b\u00f4\u00e4\u0082Xy";
                    var6_15 = "\u00da\u008b\u00b2\u0080W\u0091\u008a\u00d35N\u000b\u00f4\u00e4\u0082Xy".length();
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
lbl86:
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
lbl99:
                // 1 sources

                ** continue;
            }
        }
        m7.N = new m7(var11_3[3], 0, 0);
        m7.P = new m7(var11_3[13], 1, 1);
        m7.t = new m7(var11_3[7], 2, 2);
        m7.H = new m7(var11_3[4], 3, 4);
        m7.S = new m7(var11_3[12], 4, (int)var0_12[10]);
        m7.c = new m7(var11_3[6], 5, (int)var0_12[14]);
        m7.b = new m7(var11_3[9], (int)var0_12[9], (int)var0_12[7]);
        m7.y = new m7(var11_3[11], (int)var0_12[16], (int)var0_12[5]);
        m7.F = new m7(var11_3[5], (int)var0_12[12], (int)var0_12[22]);
        m7.X = new m7(var11_3[2], (int)var0_12[18], (int)var0_12[21]);
        m7.g = new m7(var11_3[0], (int)var0_12[24], (int)var0_12[15]);
        m7.d = new m7(var11_3[10], (int)var0_12[6], (int)var0_12[0]);
        m7.Q = new m7(var11_3[1], (int)var0_12[4], (int)var0_12[23]);
        m7.Z = new m7(var11_3[8], (int)var0_12[19], (int)var0_12[3]);
        v15 = new m7[(int)var0_12[1]];
        v15[0] = m44.a("o", (long)-3276497666451276961L, (long)var20);
        v15[1] = m44.a("o", (long)-3632293363057156146L, (long)var20);
        v15[2] = m7.t;
        v15[3] = m44.a("o", (long)-3696244601407479712L, (long)var20);
        v15[4] = m7.S;
        v15[5] = m44.a("o", (long)-3281019423457618119L, (long)var20);
        v15[(int)var0_12[8]] = m44.a("o", (long)-3003542166433333293L, (long)var20);
        v15[(int)var0_12[25]] = m7.y;
        v15[(int)var0_12[12]] = m7.F;
        v15[(int)var0_12[2]] = m7.X;
        v15[(int)var0_12[13]] = m44.a("o", (long)-3286371618654317770L, (long)var20);
        v15[(int)var0_12[11]] = m44.a("o", (long)-3647872652751676692L, (long)var20);
        v15[(int)var0_12[17]] = m44.a("o", (long)-3469893660503784381L, (long)var20);
        v15[(int)var0_12[20]] = m44.a("o", (long)-2997625001554904271L, (long)var20);
        m7.O = v15;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private m7() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.C = var3_1;
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
