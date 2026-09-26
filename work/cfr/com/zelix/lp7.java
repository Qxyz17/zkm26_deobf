/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lwm;
import com.zelix.lyn;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lp7
extends lyn {
    int o;
    private static final long a;
    private static final String[] e;
    private static final String[] f;
    private static final Map g;
    private static final long[] k;
    private static final Integer[] n;
    private static final Map p;
    private static final long[] q;
    private static final Long[] s;
    private static final Map t;

    /*
     * Unable to fully structure code
     */
    @Override
    public void M(Object[] var1_1) {
        block13: {
            block14: {
                block12: {
                    var2_2 = (lmu)var1_1[0];
                    var3_3 = (lqu)var1_1[1];
                    var4_4 = (Long)var1_1[2];
                    v0 = var4_4;
                    var6_5 = v0 ^ 74673965963454L;
                    var8_6 = v0 ^ 29166006246517L;
                    var10_7 = v0 ^ 0L;
                    var12_8 = v0 ^ 70974204760313L;
                    var14_9 = v0 ^ 48832956100528L;
                    var16_10 = v0 ^ 78419313187334L;
                    v1 = new Object[1];
                    v1[0] = var16_10;
                    var19_11 = m44.a("w", (Object)this, (Object)v1, (long)-4972914505230991179L, (long)var4_4);
                    v2 = new Object[1];
                    v2[0] = var14_9;
                    var20_12 = m44.a("w", (Object)var3_3, (Object)v2, (long)-6410373196425327712L, (long)var4_4);
                    v3 = new Object[1];
                    v3[0] = var6_5;
                    var21_13 = m44.a("w", (Object)var3_3, (Object)v3, (long)-5092376014320582940L, (long)var4_4);
                    var18_14 = m44.a("h", (long)-6823249310977527178L, (long)var4_4);
                    v4 = new Object[1];
                    v4[0] = var12_8;
                    var22_15 = m44.a("w", (Object)var3_3, (Object)v4, (long)-5139488470093813520L, (long)var4_4);
                    if (var19_11 != true) ** GOTO lbl70
                    var23_16 = (lwm)this.V(0);
                    v5 = new Object[3];
                    v5[2] = var10_7;
                    v5[1] = var3_3;
                    v5[0] = this;
                    m44.a("w", (Object)var23_16, (Object)v5, (long)-4983248947017682808L, (long)var4_4);
                    var24_17 = m44.a("w", (Object)var23_16, (Object)new Object[0], (long)-4968184746715213117L, (long)var4_4);
                    try {
                        m44.a("t", (Object)this, (int)Integer.parseInt((String)var24_17), (long)-4674541197781312014L, (long)var4_4);
                    }
                    catch (NumberFormatException var25_18) {
                        block10: {
                            block11: {
                                try {
                                    try {
                                        m44.a("t", (Object)this, (int)lp7.c("w", (int)15116, (long)(8032625294883207037L ^ var4_4)), (long)-4674541197781312014L, (long)var4_4);
                                        v6 = this;
                                        v7 = var18_14;
                                        if (var4_4 < 0L) break block10;
                                        if (v7 != false) break block11;
                                        v8 = m44.a("v", (Object)v6, (long)-4674541197781312014L, (long)var4_4);
                                        if (var4_4 > 0L) {
                                            if (v8 >= 0) break block12;
                                        }
                                        ** GOTO lbl69
                                    }
                                    catch (NumberFormatException v9) {
                                        throw m44.a("h", (Object)v9, (long)-6633427101474247155L, (long)var4_4);
                                    }
                                    v6 = this;
                                }
                                catch (NumberFormatException v10) {
                                    throw m44.a("h", (Object)v10, (long)-6633427101474247155L, (long)var4_4);
                                }
                            }
                            v7 = lp7.c("w", (int)6292, (long)(1464682422493648100L ^ var4_4));
                        }
                        m44.a("t", (Object)v6, (int)v7, (long)-4674541197781312014L, (long)var4_4);
                    }
                }
                try {
                    if (var4_4 < 0L) break block13;
                    v8 = var18_14;
lbl69:
                    // 2 sources

                    if (v8 == false) break block14;
lbl70:
                    // 2 sources

                    m44.a("t", (Object)this, (int)lp7.c("w", (int)6292, (long)(1464682422493648100L ^ var4_4)), (long)-4674541197781312014L, (long)var4_4);
                }
                catch (NumberFormatException v11) {
                    throw m44.a("h", (Object)v11, (long)-6633427101474247155L, (long)var4_4);
                }
            }
            v12 = new Object[5];
            v12[4] = (int)var22_15;
            v12[3] = (int)var21_13;
            v12[2] = var8_6;
            v12[1] = (int)var20_12;
            v12[0] = var3_3;
            m44.a("w", (Object)this, (Object)v12, (long)-6545384257220678841L, (long)var4_4);
        }
    }

    public lp7(int n10, char c10, int n11, short s10) {
        long l10 = ((long)n10 << 32 | (long)c10 << 48 >>> 32 | (long)s10 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x757324AE104FL;
        super(l11, n11);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void m(Object[] var1_1) {
        block16: {
            block15: {
                block14: {
                    var4_2 = (lqu)var1_1[0];
                    var2_3 = (Integer)var1_1[1];
                    var5_4 = (Long)var1_1[2];
                    var3_5 = (Integer)var1_1[3];
                    var7_6 = (Integer)var1_1[4];
                    v0 = var5_4;
                    var8_7 = v0 ^ 41228634740897L;
                    var10_8 = v0 ^ 32452763901518L;
                    v1 = new Object[1];
                    v1[0] = var8_7;
                    var13_9 = m44.a("r", (Object)var4_2, (Object)v1, (long)-4963623474998811189L, (long)var5_4);
                    v2 = m44.a("m", (long)-6521875426121538117L, (long)var5_4);
                    v3 = new Object[1];
                    v3[0] = var10_8;
                    var14_10 = (String)m44.a("m", (Object)v3, (long)-6429108569517432985L, (long)var5_4) + (String)lp7.b("y", (int)31024, (long)(8358624978525437542L ^ var5_4));
                    var13_9.println(var14_10);
                    m44.a("r", (Object)m44.a("i", (long)-6626972079646401238L, (long)var5_4), (Object)var14_10, (long)-4650195723326610078L, (long)var5_4);
                    var12_11 = v2;
                    var15_12 = m44.a("m", (long)-4992281869728831884L, (long)var5_4);
                    var16_13 = (int)(m44.a("r", (Object)var15_12, (long)-6695499469126477580L, (long)var5_4) - m44.a("r", (Object)var15_12, (long)-6516014803665300792L, (long)var5_4)) / lp7.c("w", (int)31761, (long)(5591771160781384726L ^ var5_4));
                    m44.a("r", (Object)var15_12, (long)-6537584437285133089L, (long)var5_4);
                    v4 = m44.a("r", (Object)var4_2, (long)-5058169403218336890L, (long)var5_4);
                    if (var12_11 == false) ** GOTO lbl42
                    try {
                        block17: {
                            if (v4 == false) break block14;
                            break block17;
                            catch (InterruptedException v5) {
                                throw m44.a("m", (Object)v5, (long)-4646501277128412552L, (long)var5_4);
                            }
                        }
                        var13_9.println((String)lp7.b("y", (int)9505, (long)(2400507098701193842L ^ var5_4)) + (int)m44.a("s", (Object)this, (long)-6677242810399080057L, (long)var5_4) + (String)lp7.b("y", (int)2908, (long)(8298388179883412491L ^ var5_4)));
                    }
                    catch (InterruptedException v6) {
                        throw m44.a("m", (Object)v6, (long)-4646501277128412552L, (long)var5_4);
                    }
                }
                try {
                    v4 = m44.a("s", (Object)this, (long)-6677242810399080057L, (long)var5_4);
lbl42:
                    // 2 sources

                    m44.a("m", (long)((long)v4), (long)-5022287330949168927L, (long)var5_4);
                }
                catch (InterruptedException var17_14) {
                    // empty catch block
                }
                var17_15 = (int)(m44.a("r", (Object)var15_12, (long)-6695499469126477580L, (long)var5_4) - m44.a("r", (Object)var15_12, (long)-6516014803665300792L, (long)var5_4)) / lp7.c("w", (int)16179, (long)(57918260494085941L ^ var5_4));
                var18_16 = m44.a("r", (Object)var15_12, (long)-6912809254724167001L, (long)var5_4);
                try {
                    try {
                        v7 = var12_11;
                        if (var5_4 < 0L) ** GOTO lbl66
                        if (v7 == false) break block15;
                        if (var18_16 > lp7.d("o", (int)8421, (long)(6744843270768855740L ^ var5_4))) {
                        }
                        ** GOTO lbl67
                    }
                    catch (InterruptedException v8) {
                        throw m44.a("m", (Object)v8, (long)-4646501277128412552L, (long)var5_4);
                    }
                    var13_9.println(m44.a("r", (Object)new StringBuilder().append((String)lp7.b("y", (int)29970, (long)(8204449902692250182L ^ var5_4))), (long)(var18_16 / lp7.d("o", (int)8480, (long)(7142135529576041336L ^ var5_4))), (long)-4819058318632373161L, (long)var5_4).append((String)lp7.b("y", (int)21383, (long)(2889717972041241810L ^ var5_4))).append(var17_15).append((String)lp7.b("y", (int)15450, (long)(3902937554538330890L ^ var5_4))).append(var17_15 - var16_13).append((String)lp7.b("y", (int)11629, (long)(8777136034228431423L ^ var5_4))).toString());
                }
                catch (InterruptedException v9) {
                    throw m44.a("m", (Object)v9, (long)-4646501277128412552L, (long)var5_4);
                }
            }
            try {
                if (var5_4 <= 0L) break block16;
                v7 = var12_11;
lbl66:
                // 2 sources

                if (v7 != false) break block16;
lbl67:
                // 2 sources

                var13_9.println("\t" + var17_15 + (String)lp7.b("y", (int)22110, (long)(5416751394063782148L ^ var5_4)) + (var17_15 - var16_13) + (String)lp7.b("y", (int)11260, (long)(8835531415084559527L ^ var5_4)));
            }
            catch (InterruptedException v10) {
                throw m44.a("m", (Object)v10, (long)-4646501277128412552L, (long)var5_4);
            }
        }
    }

    @Override
    public String N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return lp7.b("y", (int)8499, (long)(0x4A4C7026C052A02DL ^ l10));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block26: {
            block25: {
                block24: {
                    block23: {
                        block22: {
                            block21: {
                                lp7.a = prr.a(-1330780979653312929L, -3146452803293209587L, MethodHandles.lookup().lookupClass()).a(170987554074147L);
                                lp7.g = new HashMap<K, V>(13);
                                var22 = lp7.a ^ 9984131462633L;
                                var24_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                                v0 = SecretKeyFactory.getInstance("DES");
                                v1 = new byte[8];
                                v2 = v1;
                                v1[0] = (byte)(var22 >>> 56);
                                for (var25_2 = 1; var25_2 < 8; ++var25_2) {
                                    v2 = v2;
                                    v2[var25_2] = (byte)(var22 << var25_2 * 8 >>> 56);
                                }
                                var24_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                                var31_3 = new String[10];
                                var29_4 = 0;
                                var28_5 = "-\u0086\u00eb,\u00cb\u00ed\u00b7\u00d2\u00adS\u0096Cw\u000e4\u0095 1\u00ba\u00c8\u00ad\u00b7\u00b3w\u00f2\u00ce\u00cb\u00a7\u00e56]\u001c\u00b1\u00d5\u008a\u0084\u0017S\u0002\u00b4\u00b4i\u00d9iL\u00e0\u00cc\u00c2\u009e(\u00b5\u0010\u00f4,\u008e\u00e5x~\u0083\u00b3\u00d7\u00cf\u00e2\u0001\u00b3\u00e5L\u0019A`\u00e3O\u008e\u00c5\u0099\u0083\u0011\u00a3\u0002\u0099,eC\u009e\u0096\u00f5\u0086\u00ef\u0083\u0093\u0010^!\u00c75r\u00c7\u00c5\u00ff\u0013*\u00e0=/#\u0013\u00f6(\u00fb\u001bu\u001b{\u00886\u00ee\u001d\u00f9F\u00f7\u008fz\u008c\u00f9\u00f4\"p\u00fe\u0085$\u00c8if}i\u00c5\u00f6\u00f0\u00c7\u00b5\u00c3`[\u00fa\u0091\u00d8\u00ef\u00f1\u0018\u001d\u00f0\u008d\u00fb\u00fb\u00c1\u00c6\u00b2\u00c5'W\u00c6/,\u00a3\u00e5\u0092_Uk\t@\u0094\u00c1(2au\u00f88h[\u0011\u008a\u0018\u0096\u0000\u0015\u00de\u00f0\u00efS\u0016dr6\u00eb\u00e5(=\u0093\u0088\f\u00d0b\u00e1\u008e\u00fd\u0005\u0085\u00a0q\r\u00aeP\u0018y <,c\u0003\u0016\u00e5\u009f\u0083w\u0091t=rU$\u00abBa`\u00f93]";
                                var30_6 = "-\u0086\u00eb,\u00cb\u00ed\u00b7\u00d2\u00adS\u0096Cw\u000e4\u0095 1\u00ba\u00c8\u00ad\u00b7\u00b3w\u00f2\u00ce\u00cb\u00a7\u00e56]\u001c\u00b1\u00d5\u008a\u0084\u0017S\u0002\u00b4\u00b4i\u00d9iL\u00e0\u00cc\u00c2\u009e(\u00b5\u0010\u00f4,\u008e\u00e5x~\u0083\u00b3\u00d7\u00cf\u00e2\u0001\u00b3\u00e5L\u0019A`\u00e3O\u008e\u00c5\u0099\u0083\u0011\u00a3\u0002\u0099,eC\u009e\u0096\u00f5\u0086\u00ef\u0083\u0093\u0010^!\u00c75r\u00c7\u00c5\u00ff\u0013*\u00e0=/#\u0013\u00f6(\u00fb\u001bu\u001b{\u00886\u00ee\u001d\u00f9F\u00f7\u008fz\u008c\u00f9\u00f4\"p\u00fe\u0085$\u00c8if}i\u00c5\u00f6\u00f0\u00c7\u00b5\u00c3`[\u00fa\u0091\u00d8\u00ef\u00f1\u0018\u001d\u00f0\u008d\u00fb\u00fb\u00c1\u00c6\u00b2\u00c5'W\u00c6/,\u00a3\u00e5\u0092_Uk\t@\u0094\u00c1(2au\u00f88h[\u0011\u008a\u0018\u0096\u0000\u0015\u00de\u00f0\u00efS\u0016dr6\u00eb\u00e5(=\u0093\u0088\f\u00d0b\u00e1\u008e\u00fd\u0005\u0085\u00a0q\r\u00aeP\u0018y <,c\u0003\u0016\u00e5\u009f\u0083w\u0091t=rU$\u00abBa`\u00f93]".length();
                                var27_7 = 16;
                                var26_8 = -1;
lbl20:
                                // 2 sources

                                while (true) {
                                    v3 = ++var26_8;
                                    v4 = var28_5.substring(v3, v3 + var27_7);
                                    v5 = -1;
                                    break block21;
                                    break;
                                }
lbl25:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = lp7.c(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    var28_5 = "\u00de\u0084dXh\u00c6\u001a\u00e7\u00a5\u00ba{T\u0001\u008b\u009aI\u00aa9\u008bK\u00a2\u0006\u00e7\u0087\u00e0\u00ea\n\u00a3,\u00fcP\u0092bY2\u00ca\u00aa\u00a3\u00029\u0010\u00f4\u00fap\u001a\u00d6\u00c0\u0012\u00abL\u0003\u00a2\\\u009d\u00bc \u0014";
                                    var30_6 = "\u00de\u0084dXh\u00c6\u001a\u00e7\u00a5\u00ba{T\u0001\u008b\u009aI\u00aa9\u008bK\u00a2\u0006\u00e7\u0087\u00e0\u00ea\n\u00a3,\u00fcP\u0092bY2\u00ca\u00aa\u00a3\u00029\u0010\u00f4\u00fap\u001a\u00d6\u00c0\u0012\u00abL\u0003\u00a2\\\u009d\u00bc \u0014".length();
                                    var27_7 = 40;
                                    var26_8 = -1;
lbl34:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var26_8;
                                        v4 = var28_5.substring(v6, v6 + var27_7);
                                        v5 = 0;
                                        break block21;
                                        break;
                                    }
                                    break;
                                }
lbl39:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = lp7.c(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    break block22;
                                    break;
                                }
                            }
                            var32_9 = var24_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                        lp7.e = var31_3;
                        lp7.f = new String[10];
                        lp7.p = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v7 = SecretKeyFactory.getInstance("DES");
                        v8 = new byte[8];
                        v9 = v8;
                        v8[0] = (byte)(var22 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v9 = v9;
                            v9[var12_11] = (byte)(var22 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[4];
                        var14_13 = 0;
                        var15_14 = "wqT\u0013\u000f\u00b6\u008b\u00e4\u00ef\u0094iQI\u001c\u009a\u00d5";
                        var16_15 = "wqT\u0013\u000f\u00b6\u008b\u00e4\u00ef\u0094iQI\u001c\u009a\u00d5".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v10 = var17_12;
                            v11 = var14_13++;
                            v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v13 = -1;
                            break block23;
                            break;
                        }
lbl78:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = "\u00a3\u0097\u008f\u00af\u00bd\u00ebs\u001a\u009a\u00a0\u00047\u00816\u0001\u00fd";
                            var16_15 = "\u00a3\u0097\u008f\u00af\u00bd\u00ebs\u001a\u009a\u00a0\u00047\u00816\u0001\u00fd".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v10 = var17_12;
                                v11 = var14_13++;
                                v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v13 = 0;
                                break block23;
                                break;
                            }
                            break;
                        }
lbl91:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            break block24;
                            break;
                        }
                    }
                    var19_18 = v12;
                    var21_19 = var11_10.doFinal(new byte[]{(byte)(var19_18 >>> 56), (byte)(var19_18 >>> 48), (byte)(var19_18 >>> 40), (byte)(var19_18 >>> 32), (byte)(var19_18 >>> 24), (byte)(var19_18 >>> 16), (byte)(var19_18 >>> 8), (byte)var19_18});
                    v14 = ((long)var21_19[0] & 255L) << 56 | ((long)var21_19[1] & 255L) << 48 | ((long)var21_19[2] & 255L) << 40 | ((long)var21_19[3] & 255L) << 32 | ((long)var21_19[4] & 255L) << 24 | ((long)var21_19[5] & 255L) << 16 | ((long)var21_19[6] & 255L) << 8 | (long)var21_19[7] & 255L;
                    switch (v13) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl104:
                        // 1 sources

                        ** continue;
                    }
                }
                lp7.k = var17_12;
                lp7.n = new Integer[4];
                lp7.t = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v15 = SecretKeyFactory.getInstance("DES");
                v16 = new byte[8];
                v17 = v16;
                v16[0] = (byte)(var22 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v17 = v17;
                    v17[var1_21] = (byte)(var22 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v15.generateSecret(new DESKeySpec(v17)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[2];
                var3_23 = 0;
                var4_24 = "\u00fe-\u000f\u00c4\u0005*\u00ac\u00fd\u0005{Q\u00eae\u00e8rt";
                var5_25 = "\u00fe-\u000f\u00c4\u0005*\u00ac\u00fd\u0005{Q\u00eae\u00e8rt".length();
                var2_26 = 0;
                while (true) {
                    break block25;
                    break;
                }
lbl126:
                // 1 sources

                while (true) {
                    var6_22[v18] = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
                    if (var2_26 < var5_25) ** continue;
                    break block26;
                    break;
                }
            }
            var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
            v18 = var3_23++;
            var8_28 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            ** while (true)
        }
        lp7.q = var6_22;
        lp7.s = new Long[2];
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String c(byte[] byArray) {
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

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x6EB0;
        if (f[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lp7", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e[n11].getBytes("ISO-8859-1");
            lp7.f[n11] = lp7.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return f[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lp7.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/lp7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x39E4;
        if (n[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = k[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])p.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    p.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lp7", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lp7.n[n11] = n12;
        }
        return n[n11];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = lp7.c(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/lp7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long d(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3BA;
        if (s[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = q[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])t.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    t.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lp7", exception);
            }
            long l13 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            lp7.s[n11] = l13;
        }
        return s[n11];
    }

    private static long d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = lp7.d(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return l11;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/lp7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lp7.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(lp7.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(lp7.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

