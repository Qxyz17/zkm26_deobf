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

public class eq
extends Enum {
    public static final eq w;
    public static final eq X;
    private final int z;
    public static final eq F;
    public static final eq Y;
    public static final eq y;
    public static final eq D;
    public static final eq C;
    public static final eq p;
    public static final eq W;
    public static final eq e;
    public static final eq O;
    private static final eq[] R;
    public static final eq s;
    public static final eq q;
    public static final eq T;
    public static final eq a;
    public static final eq B;
    public static final eq V;
    public static final eq n;
    public static final eq j;
    public static final eq U;
    public static final eq I;
    public static final eq t;
    private static final long b;

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        eq.b = prr.a((long)6589906862131417132L, (long)765702146476051381L, MethodHandles.lookup().lookupClass()).a(66596095287122L);
                        var20 = eq.b ^ 50226445438577L;
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
                        var11_3 = new String[22];
                        var17_4 = 0;
                        var16_5 = "\u00ces>\u00a2\u009d\u007f[\u00e1C\u00c7\u001d\u0016.r\u00ce\u00fe4\u0002\u00cb\u008a\u009aRC\u00a8\u009dqlP\u00b7\u00e02\u00a6 \u00b8\u00dd\u001d\u00e8\u0087\u00a8G\u00d9\u00ca\u008e\u00d8(\u00f8Ca5\u00fb\u009c\u00cc\u001c4\u008cl\u00d6\u001c)b\u00f6\u00ac1N\u00cc\u0018\u00bf\u00ce\u0082\u00f0\u00fe8\u00ab\u00e9X\u00b9l\u00d9<(\u0089\u009dcx\u00a2\u00a0\u001a\u00c9\u000b\u00eb\u0018\u00e9\u00b2\u00c8\u00f1{\u0012/X \u0015N\u00b6\u0081\u00fe\u00f9\n\u00d1\u00af:\u0085\u00fe\u00c6c\u00d2\u0010*\u00b7\u00e8\u0017\u00b1\u0088\u00d2\u00bc\u0098tzPeA\u008df\u0010\u0094\u00e5c\u00a1>5\t\u00af7\u00a6m\u00e2\u00b7\u008a:9\u0010\u00b8\u00dd\u001d\u00e8\u0087\u00a8G\u00d9Q\u00b8\u009b\u00d6w\u0000\n\u000f\u0018\u001a\u0089\u0093\u00bbC\u0004\u00a2\u00bc\u00f7\u00cb\u0010b\u00f3%\u00b1\u00dd\u00fc\u00b42lhn\u00df8 \u00a2\u001b$\u00ed\u00ba\u00a1\u00fd\u008d.W\u0093\u00b4\u00a0 Z-\u00b3P\u00cb\u00cc\u00be\t\u0080\u0096\u00b0\b\u00d0\u0095\u0089\u00aa@\u00a0\b\u00ee\u0019\u00d7\u0088\u00e9b\u0011J \u00b6\u00d9F`\u0087\u00aa\u008f\u001f\u0088\u00a0\u00d9`\u00bf-\u00ca\u00a8\u0010f\u00e5\u00af\u001f\u001c]\u008c\u00abh\u00f4\u00e81\u00bc*\u00de(\u00e1\u00a0By\u00a8\u001a2\u00fc\u00caV\u001a\u00b9y\u0089\u0082\u0013\u0010\u00b0\f(\u0089\u00b9\u00fb\u00ea\n)\t\u00b2i-\u00ee\u00fb\u0019\u0018\u008bd\u001dq\u00f1\u0000\u0018\u00b8\u00dd\u001d\u00e8\u0087\u00a8G\u00d9\u00ca\u008e\u00d8(\u00f8Ca5\"\u0086\u00e4Zr\u00946 \u0018\u00b8\u00dd\u001d\u00e8\u0087\u00a8G\u00d9\u00ca\u008e\u00d8(\u00f8Ca5\u00a4#\u00beZ\u0086I\u00cd\u00a7\u0010DO\u0087\u001b\u00c0\u0094\u00ada\u001fx\u00c2\u00d1+\u00cd\u00f5\u0011\bH\u00cd\b\u00c5^D\u00d3\u0087\ba\u00a1\u00fb\u00ab\u00f2\u00f4f\u00ee\u0018\u00a2\u001b$\u00ed\u00ba\u00a1\u00fd\u008d.W\u0093\u00b4\u00a0 Z-\u0015\u00be\u0097\u00d2;\u0000\u000f\u008d\u0010\u00b8\u00dd\u001d\u00e8\u0087\u00a8G\u00d9\u0092GsL\t\u009dQ\u0091\u0018\u00b6\u00d9F`\u0087\u00aa\u008f\u001f\u0088\u00a0\u00d9`\u00bf-\u00ca\u00a8\u008eD\u00fe/\u0001\u00c9\u00b8\u001a";
                        var18_6 = "\u00ces>\u00a2\u009d\u007f[\u00e1C\u00c7\u001d\u0016.r\u00ce\u00fe4\u0002\u00cb\u008a\u009aRC\u00a8\u009dqlP\u00b7\u00e02\u00a6 \u00b8\u00dd\u001d\u00e8\u0087\u00a8G\u00d9\u00ca\u008e\u00d8(\u00f8Ca5\u00fb\u009c\u00cc\u001c4\u008cl\u00d6\u001c)b\u00f6\u00ac1N\u00cc\u0018\u00bf\u00ce\u0082\u00f0\u00fe8\u00ab\u00e9X\u00b9l\u00d9<(\u0089\u009dcx\u00a2\u00a0\u001a\u00c9\u000b\u00eb\u0018\u00e9\u00b2\u00c8\u00f1{\u0012/X \u0015N\u00b6\u0081\u00fe\u00f9\n\u00d1\u00af:\u0085\u00fe\u00c6c\u00d2\u0010*\u00b7\u00e8\u0017\u00b1\u0088\u00d2\u00bc\u0098tzPeA\u008df\u0010\u0094\u00e5c\u00a1>5\t\u00af7\u00a6m\u00e2\u00b7\u008a:9\u0010\u00b8\u00dd\u001d\u00e8\u0087\u00a8G\u00d9Q\u00b8\u009b\u00d6w\u0000\n\u000f\u0018\u001a\u0089\u0093\u00bbC\u0004\u00a2\u00bc\u00f7\u00cb\u0010b\u00f3%\u00b1\u00dd\u00fc\u00b42lhn\u00df8 \u00a2\u001b$\u00ed\u00ba\u00a1\u00fd\u008d.W\u0093\u00b4\u00a0 Z-\u00b3P\u00cb\u00cc\u00be\t\u0080\u0096\u00b0\b\u00d0\u0095\u0089\u00aa@\u00a0\b\u00ee\u0019\u00d7\u0088\u00e9b\u0011J \u00b6\u00d9F`\u0087\u00aa\u008f\u001f\u0088\u00a0\u00d9`\u00bf-\u00ca\u00a8\u0010f\u00e5\u00af\u001f\u001c]\u008c\u00abh\u00f4\u00e81\u00bc*\u00de(\u00e1\u00a0By\u00a8\u001a2\u00fc\u00caV\u001a\u00b9y\u0089\u0082\u0013\u0010\u00b0\f(\u0089\u00b9\u00fb\u00ea\n)\t\u00b2i-\u00ee\u00fb\u0019\u0018\u008bd\u001dq\u00f1\u0000\u0018\u00b8\u00dd\u001d\u00e8\u0087\u00a8G\u00d9\u00ca\u008e\u00d8(\u00f8Ca5\"\u0086\u00e4Zr\u00946 \u0018\u00b8\u00dd\u001d\u00e8\u0087\u00a8G\u00d9\u00ca\u008e\u00d8(\u00f8Ca5\u00a4#\u00beZ\u0086I\u00cd\u00a7\u0010DO\u0087\u001b\u00c0\u0094\u00ada\u001fx\u00c2\u00d1+\u00cd\u00f5\u0011\bH\u00cd\b\u00c5^D\u00d3\u0087\ba\u00a1\u00fb\u00ab\u00f2\u00f4f\u00ee\u0018\u00a2\u001b$\u00ed\u00ba\u00a1\u00fd\u008d.W\u0093\u00b4\u00a0 Z-\u0015\u00be\u0097\u00d2;\u0000\u000f\u008d\u0010\u00b8\u00dd\u001d\u00e8\u0087\u00a8G\u00d9\u0092GsL\t\u009dQ\u0091\u0018\u00b6\u00d9F`\u0087\u00aa\u008f\u001f\u0088\u00a0\u00d9`\u00bf-\u00ca\u00a8\u008eD\u00fe/\u0001\u00c9\u00b8\u001a".length();
                        var15_7 = 32;
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
                            var11_3[var17_4++] = eq.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = ",\u00e0\u00d6\u00f3\u0007 #\u00bd(\u00e1\u00a0By\u00a8\u001a2\u00fc\u00f73\u00c6\f\u00ddhIa\u00bb\u00ba\u00c6\u00db\u00a9\u00cc\u009c\u0092sE\u00e9\u00ef\u00fa\u001e\u001b\u00e5f<\b\"H\u00051\u00ce";
                            var18_6 = ",\u00e0\u00d6\u00f3\u0007 #\u00bd(\u00e1\u00a0By\u00a8\u001a2\u00fc\u00f73\u00c6\f\u00ddhIa\u00bb\u00ba\u00c6\u00db\u00a9\u00cc\u009c\u0092sE\u00e9\u00ef\u00fa\u001e\u001b\u00e5f<\b\"H\u00051\u00ce".length();
                            var15_7 = 8;
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
                            var11_3[var17_4++] = eq.a(var19_9).intern();
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
                var0_12 = new long[47];
                var4_13 = 0;
                var5_14 = "u\u00b7\u000f\u00c9Z\u007f4v\u00f6\u00a3\u00df9\u0015\u00cf\u0098~\u001a]\u00b6v\u00bba\u0092\u00d8\u00a5i\u00b2\u00ec\u00c9a\u00dc\u00deq\u0001[\u0007MoQ\u00eb\u00bd\u00c6\u00b0s\u007fZ\u00da\u0097\u001f\t?\u00d7k\u00cez\u00af[c\u00a4\u00150\u001db\u008a\u00c0z\u00d0F\u00efJ\u00cbS\u00fd\u000e\u00a7\u0097V\u00c1b\u00b4'\u00dc0\u00f9iA%\u00d9\u001eXN-\u00ac&\u00db\u00e5\u007f\u0014En/V=\u00f6\u00bb\u00f5l\u00c0\u001e\u00d8(\u00cc\u0001\u00bb\u00e3ey\"/o\u0011\u00a6\u009fI\u00e9cG\u00a0\u0098\r\u00f9\u00e9\u001f\u00e9\u00034\u00ac5\u00ec6R\u0094\u00e9\u008e\u00a5\u00ce\u00d1\u00cc\u009a\u009bIa|\u009dP\u00fcZ\u0017O\u0000!+\u00c2\u00e7-f\u00b29\u00d0\u00c0\u00fd\u0016{(#\u0091\u00e9&\u00cf\u00ab\u00e3ZP\u00ea\u00db9|\u0013\u00d1\u00b2y\u001clu\u00a3\u001d\u00fc\u008e\u00c2\u00e2\u0007n\f{`[\u00dd\u0010=\u0000\u00c4\u00d7\u008a\r\u0011Jc\u00f1jYE\u0088L\u00ef\u00ea\u00bc\u0092\u00bf@N\u0096r\u00f2\u00c03y\u0094\u00ca\u0090\u00d4\u00cf\u00ae'-#\u0013\u00cd\u0004\u0083#\u00bf\\W\u00b85\u00a3\u0011\u00d3\u00a1!\u007fO\u00ef~\u00d8\u00c3\u00bf&3\"\u00aa\u007f\u00ed\u00a7J\u00bb\u00e9\u0006\u00e0\u009a\n\u00ef_m2(\u0015\u009e\u0019\u00ae\u00b4\u00a3y\u00ad\u00afEd\u001d\u0011%\u00d5w\u007f\u00dbxl\u00b8\u0083\u00a4;\u00e3e>\u0001R\u0084`O5\u0003\u00fa\u00e8\u00dfB\u00afL\u009f\u001adAjP\u00d1@\u00fe\u00a7\u00b8\u00b6{\u008a\u0005\u0007\u00db9O\f\u0095k\u001a\u00d3n\u0093k\u00ecoB}\u0006Y\u0087";
                var6_15 = "u\u00b7\u000f\u00c9Z\u007f4v\u00f6\u00a3\u00df9\u0015\u00cf\u0098~\u001a]\u00b6v\u00bba\u0092\u00d8\u00a5i\u00b2\u00ec\u00c9a\u00dc\u00deq\u0001[\u0007MoQ\u00eb\u00bd\u00c6\u00b0s\u007fZ\u00da\u0097\u001f\t?\u00d7k\u00cez\u00af[c\u00a4\u00150\u001db\u008a\u00c0z\u00d0F\u00efJ\u00cbS\u00fd\u000e\u00a7\u0097V\u00c1b\u00b4'\u00dc0\u00f9iA%\u00d9\u001eXN-\u00ac&\u00db\u00e5\u007f\u0014En/V=\u00f6\u00bb\u00f5l\u00c0\u001e\u00d8(\u00cc\u0001\u00bb\u00e3ey\"/o\u0011\u00a6\u009fI\u00e9cG\u00a0\u0098\r\u00f9\u00e9\u001f\u00e9\u00034\u00ac5\u00ec6R\u0094\u00e9\u008e\u00a5\u00ce\u00d1\u00cc\u009a\u009bIa|\u009dP\u00fcZ\u0017O\u0000!+\u00c2\u00e7-f\u00b29\u00d0\u00c0\u00fd\u0016{(#\u0091\u00e9&\u00cf\u00ab\u00e3ZP\u00ea\u00db9|\u0013\u00d1\u00b2y\u001clu\u00a3\u001d\u00fc\u008e\u00c2\u00e2\u0007n\f{`[\u00dd\u0010=\u0000\u00c4\u00d7\u008a\r\u0011Jc\u00f1jYE\u0088L\u00ef\u00ea\u00bc\u0092\u00bf@N\u0096r\u00f2\u00c03y\u0094\u00ca\u0090\u00d4\u00cf\u00ae'-#\u0013\u00cd\u0004\u0083#\u00bf\\W\u00b85\u00a3\u0011\u00d3\u00a1!\u007fO\u00ef~\u00d8\u00c3\u00bf&3\"\u00aa\u007f\u00ed\u00a7J\u00bb\u00e9\u0006\u00e0\u009a\n\u00ef_m2(\u0015\u009e\u0019\u00ae\u00b4\u00a3y\u00ad\u00afEd\u001d\u0011%\u00d5w\u007f\u00dbxl\u00b8\u0083\u00a4;\u00e3e>\u0001R\u0084`O5\u0003\u00fa\u00e8\u00dfB\u00afL\u009f\u001adAjP\u00d1@\u00fe\u00a7\u00b8\u00b6{\u008a\u0005\u0007\u00db9O\f\u0095k\u001a\u00d3n\u0093k\u00ecoB}\u0006Y\u0087".length();
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
                    var5_14 = "\u0084\u00c2\u00e6\u001e\u00e6`Eg\u0010\u00d4\u009a\u00b7{IC\u0089";
                    var6_15 = "\u0084\u00c2\u00e6\u001e\u00e6`Eg\u0010\u00d4\u009a\u00b7{IC\u0089".length();
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
        eq.j = new eq(var11_3[19], 0, 0);
        eq.W = new eq(var11_3[17], 1, 1);
        eq.U = new eq(var11_3[4], 2, (int)var0_12[39]);
        eq.D = new eq(var11_3[10], 3, (int)var0_12[35]);
        eq.a = new eq(var11_3[8], 4, (int)var0_12[21]);
        eq.T = new eq(var11_3[15], 5, (int)var0_12[33]);
        eq.n = new eq(var11_3[6], (int)var0_12[3], (int)var0_12[14]);
        eq.B = new eq(var11_3[18], (int)var0_12[8], (int)var0_12[26]);
        eq.O = new eq(var11_3[3], (int)var0_12[2], (int)var0_12[38]);
        eq.V = new eq(var11_3[9], (int)var0_12[42], (int)var0_12[9]);
        eq.C = new eq(var11_3[5], (int)var0_12[13], (int)var0_12[6]);
        eq.Y = new eq(var11_3[2], (int)var0_12[10], (int)var0_12[7]);
        eq.F = new eq(var11_3[7], (int)var0_12[11], (int)var0_12[37]);
        eq.y = new eq(var11_3[14], (int)var0_12[12], (int)var0_12[22]);
        eq.X = new eq(var11_3[20], (int)var0_12[36], (int)var0_12[40]);
        eq.t = new eq(var11_3[13], (int)var0_12[18], (int)var0_12[43]);
        eq.e = new eq(var11_3[12], (int)var0_12[46], (int)var0_12[19]);
        eq.I = new eq(var11_3[16], (int)var0_12[17], (int)var0_12[16]);
        eq.p = new eq(var11_3[11], (int)var0_12[4], (int)var0_12[23]);
        eq.w = new eq(var11_3[0], (int)var0_12[34], (int)var0_12[5]);
        eq.q = new eq(var11_3[21], (int)var0_12[24], (int)var0_12[45]);
        eq.s = new eq(var11_3[1], (int)var0_12[27], (int)var0_12[29]);
        v15 = new eq[(int)var0_12[25]];
        v15[0] = m44.a("i", (long)3788945403363593928L, (long)var20);
        v15[1] = m44.a("i", (long)3043364536076981091L, (long)var20);
        v15[2] = m44.a("i", (long)3815928263936166938L, (long)var20);
        v15[3] = m44.a("i", (long)3974853768202909919L, (long)var20);
        v15[4] = m44.a("i", (long)3385345252483902576L, (long)var20);
        v15[5] = m44.a("i", (long)3110237602517108053L, (long)var20);
        v15[(int)var0_12[20]] = m44.a("i", (long)4004238893619680840L, (long)var20);
        v15[(int)var0_12[0]] = m44.a("i", (long)3833089037060829746L, (long)var20);
        v15[(int)var0_12[32]] = m44.a("i", (long)3789911358942845382L, (long)var20);
        v15[(int)var0_12[31]] = m44.a("i", (long)3551064597789751404L, (long)var20);
        v15[(int)var0_12[28]] = m44.a("i", (long)3295061417073783381L, (long)var20);
        v15[(int)var0_12[15]] = m44.a("i", (long)3437265101622575167L, (long)var20);
        v15[(int)var0_12[30]] = m44.a("i", (long)3122640372291474625L, (long)var20);
        v15[(int)var0_12[44]] = m44.a("i", (long)2890283277644027970L, (long)var20);
        v15[(int)var0_12[41]] = m44.a("i", (long)3063066881237287578L, (long)var20);
        v15[(int)var0_12[1]] = m44.a("i", (long)3963420284856751995L, (long)var20);
        v15[(int)var0_12[46]] = m44.a("i", (long)2944686235117704002L, (long)var20);
        v15[(int)var0_12[17]] = m44.a("i", (long)3383164060645557331L, (long)var20);
        v15[(int)var0_12[4]] = m44.a("i", (long)3506745793810411266L, (long)var20);
        v15[(int)var0_12[34]] = m44.a("i", (long)3831788015751026058L, (long)var20);
        v15[(int)var0_12[24]] = m44.a("i", (long)3826589555225796378L, (long)var20);
        v15[(int)var0_12[27]] = m44.a("i", (long)3537475344990580392L, (long)var20);
        eq.R = v15;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private eq() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.z = var3_1;
    }

    public static eq[] f(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return (eq[])((Enum)((Object)m44.a("o", (long)-569520954159913651L, (long)l))).clone();
    }

    int O(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return (int)m44.a("p", (Object)((Object)this), (long)-8039980215484118197L, (long)l);
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
