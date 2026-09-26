/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lyn;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.un;
import com.zelix.y1;
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

public class laq
extends lyn {
    private static final long a;
    private static final String[] e;
    private static final String[] f;
    private static final Map g;

    @Override
    public String N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return laq.b("q", (int)15036, (long)(0x20D32C4E664CEDECL ^ l10));
    }

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0x43EA633718BEL;
        long l13 = l11 ^ 0x408CF84350F9L;
        long l14 = l11 ^ 0x2C69CF006FB0L;
        long l15 = l11 ^ 0x1A86BD711C75L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l14;
        CallSite callSite = m44.a("w", (Object)lqu2, (Object)objectArray2, (long)-6410373196425327712L, (long)l10);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l12;
        CallSite callSite2 = m44.a("w", (Object)lqu2, (Object)objectArray3, (long)-5092376014320582940L, (long)l10);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l13;
        CallSite callSite3 = m44.a("w", (Object)lqu2, (Object)objectArray4, (long)-5139488470093813520L, (long)l10);
        Object[] objectArray5 = new Object[5];
        objectArray5[4] = (int)callSite3;
        objectArray5[3] = (int)callSite2;
        objectArray5[2] = l15;
        objectArray5[1] = (int)callSite;
        objectArray5[0] = lqu2;
        m44.a("w", (Object)this, (Object)objectArray5, (long)-6534893680615783272L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void m(Object[] var1_1) {
        block24: {
            block25: {
                block27: {
                    block32: {
                        block26: {
                            block30: {
                                block23: {
                                    block28: {
                                        var5_2 = (lqu)var1_1[0];
                                        var4_3 = (Integer)var1_1[1];
                                        var2_4 = (Long)var1_1[2];
                                        var7_5 = (Integer)var1_1[3];
                                        var6_6 = (Integer)var1_1[4];
                                        v0 = var2_4;
                                        var8_7 = v0 ^ 68178919293249L;
                                        var10_8 = v0 ^ 26930838262578L;
                                        var12_9 = v0 ^ 137924833380875L;
                                        var14_10 = v0 ^ 96728590166182L;
                                        var16_11 = v0 ^ 72203912314858L;
                                        var18_12 = v0 ^ 92096042686252L;
                                        var20_13 = v0 ^ 37916867321335L;
                                        var22_14 = v0 ^ 58185242848944L;
                                        var24_15 = v0 ^ 41228634740897L;
                                        var26_16 = v0 ^ 32452763901518L;
                                        var28_17 = v0 ^ 42037362405452L;
                                        var30_18 = v0 ^ 64450643180146L;
                                        var32_19 = v0 ^ 12848589994278L;
                                        var34_20 = v0 ^ 86555404386089L;
                                        var36_21 = v0 ^ 16810875509741L;
                                        var38_22 = v0 ^ 59712036483791L;
                                        var40_23 = v0 ^ 139052689147471L;
                                        var42_24 = v0 ^ 34824938651213L;
                                        v1 = new Object[1];
                                        v1[0] = var14_10;
                                        var45_25 = m44.a("r", (Object)var5_2, (Object)v1, (long)-6675443245045908919L, (long)var2_4);
                                        var44_26 = m44.a("m", (long)-6521875426121538117L, (long)var2_4);
                                        v2 = new Object[1];
                                        v2[0] = var32_19;
                                        v3 = m44.a("r", (Object)var45_25, (Object)v2, (long)-6636044448968313900L, (long)var2_4);
                                        if (var44_26 == false) break block23;
                                        if (v3 != false) ** GOTO lbl65
                                        break block28;
                                        catch (un v4) {
                                            throw m44.a("m", (Object)v4, (long)-6636695676453767383L, (long)var2_4);
                                        }
                                    }
                                    try {
                                        block29: {
                                            v5 = var5_2;
                                            v6 = new Object[1];
                                            v6[0] = var40_23;
                                            v7 = new Object[1];
                                            v7[0] = var30_18;
                                            v8 = new Object[2];
                                            v8[1] = var34_20;
                                            v9 = v8;
                                            v8[0] = (String)laq.b("q", (int)14854, (long)(1428520097169419032L ^ var2_4)) + (String)m44.a("r", (Object)this, (Object)v6, (long)-6508849489292330816L, (long)var2_4) + (String)laq.b("q", (int)2357, (long)(8560535655946754084L ^ var2_4)) + (int)m44.a("r", (Object)this, (Object)v7, (long)-5060083376287246742L, (long)var2_4) + (String)laq.b("q", (int)30610, (long)(3127030989106341509L ^ var2_4));
                                            v10 = -4793997075062359565L;
                                            v11 = var2_4;
                                            if (var2_4 < 0L) break block24;
                                            m44.a("r", (Object)v5, (Object)v9, (long)v10, (long)v11);
                                            if (var44_26 != false) break block25;
                                            break block29;
                                            catch (un v12) {
                                                throw m44.a("m", (Object)v12, (long)-6636695676453767383L, (long)var2_4);
                                            }
                                        }
                                        v13 = new Object[1];
                                        v13[0] = var36_21;
                                        v3 = m44.a("r", (Object)var45_25, (Object)v13, (long)-6545124818307683363L, (long)var2_4);
                                    }
                                    catch (un v14) {
                                        throw m44.a("m", (Object)v14, (long)-6636695676453767383L, (long)var2_4);
                                    }
                                }
                                v15 = var44_26;
                                if (var2_4 <= 0L) ** GOTO lbl117
                                if (v15 == false) break block26;
                                if (v3 == false) ** GOTO lbl105
                                break block30;
                                catch (un v16) {
                                    throw m44.a("m", (Object)v16, (long)-6636695676453767383L, (long)var2_4);
                                }
                            }
                            try {
                                block31: {
                                    v5 = var5_2;
                                    v17 = new Object[1];
                                    v17[0] = var40_23;
                                    v18 = new Object[1];
                                    v18[0] = var30_18;
                                    v19 = new Object[2];
                                    v19[1] = var34_20;
                                    v9 = v19;
                                    v19[0] = (String)laq.b("q", (int)31586, (long)(7704936026822961783L ^ var2_4)) + (String)m44.a("r", (Object)this, (Object)v17, (long)-6508849489292330816L, (long)var2_4) + (String)laq.b("q", (int)16356, (long)(2243457077965205239L ^ var2_4)) + (int)m44.a("r", (Object)this, (Object)v18, (long)-5060083376287246742L, (long)var2_4) + (String)laq.b("q", (int)4890, (long)(6727998015029019142L ^ var2_4));
                                    v10 = -4793997075062359565L;
                                    v11 = var2_4;
                                    if (var2_4 <= 0L) break block24;
                                    m44.a("r", (Object)v5, (Object)v9, (long)v10, (long)v11);
                                    if (var44_26 != false) break block25;
                                    break block31;
                                    catch (un v20) {
                                        throw m44.a("m", (Object)v20, (long)-6636695676453767383L, (long)var2_4);
                                    }
                                }
                                v21 = new Object[1];
                                v21[0] = var28_17;
                                v3 = m44.a("r", (Object)var45_25, (Object)v21, (long)-4661537732773208149L, (long)var2_4);
                            }
                            catch (un v22) {
                                throw m44.a("m", (Object)v22, (long)-6636695676453767383L, (long)var2_4);
                            }
                        }
                        if (var2_4 <= 0L) break block27;
                        v15 = var44_26;
lbl117:
                        // 2 sources

                        if (v15 == false) break block27;
                        if (v3 != false) ** GOTO lbl148
                        break block32;
                        catch (un v23) {
                            throw m44.a("m", (Object)v23, (long)-6636695676453767383L, (long)var2_4);
                        }
                    }
                    try {
                        block33: {
                            v5 = var5_2;
                            v24 = new Object[1];
                            v24[0] = var40_23;
                            v25 = new Object[1];
                            v25[0] = var30_18;
                            v26 = new Object[1];
                            v26[0] = var20_13;
                            v27 = new Object[2];
                            v27[1] = var34_20;
                            v9 = v27;
                            v27[0] = (String)laq.b("q", (int)31586, (long)(7704936026822961783L ^ var2_4)) + (String)m44.a("r", (Object)this, (Object)v24, (long)-6508849489292330816L, (long)var2_4) + (String)laq.b("q", (int)16356, (long)(2243457077965205239L ^ var2_4)) + (int)m44.a("r", (Object)this, (Object)v25, (long)-5060083376287246742L, (long)var2_4) + (String)laq.b("q", (int)13524, (long)(4980992087726007744L ^ var2_4)) + (String)m44.a("r", (Object)var45_25, (Object)v26, (long)-6469821743548244350L, (long)var2_4);
                            v10 = -4793997075062359565L;
                            v11 = var2_4;
                            if (var2_4 <= 0L) break block24;
                            m44.a("r", (Object)v5, (Object)v9, (long)v10, (long)v11);
                            if (var44_26 != false) break block25;
                            break block33;
                            catch (un v28) {
                                throw m44.a("m", (Object)v28, (long)-6636695676453767383L, (long)var2_4);
                            }
                        }
                        v29 = new Object[1];
                        v29[0] = var10_8;
                        v3 = m44.a("r", (Object)var45_25, (Object)v29, (long)-6358941898981584462L, (long)var2_4);
                    }
                    catch (un v30) {
                        throw m44.a("m", (Object)v30, (long)-6636695676453767383L, (long)var2_4);
                    }
                }
                try {
                    if (v3 == false) {
                        v31 = new Object[1];
                        v31[0] = var40_23;
                        v32 = new Object[1];
                        v32[0] = var30_18;
                        v33 = new Object[2];
                        v33[1] = (String)laq.b("q", (int)24649, (long)(536739183079551321L ^ var2_4)) + (String)m44.a("r", (Object)this, (Object)v31, (long)-6508849489292330816L, (long)var2_4) + (String)laq.b("q", (int)16356, (long)(2243457077965205239L ^ var2_4)) + (int)m44.a("r", (Object)this, (Object)v32, (long)-5060083376287246742L, (long)var2_4) + (String)laq.b("q", (int)13122, (long)(4757231053272162911L ^ var2_4));
                        v33[0] = var16_11;
                        m44.a("r", (Object)var5_2, (Object)v33, (long)-5111898876524193914L, (long)var2_4);
                        return;
                    }
                }
                catch (un v34) {
                    throw m44.a("m", (Object)v34, (long)-6636695676453767383L, (long)var2_4);
                }
            }
            v5 = var5_2;
            v35 = new Object[1];
            v9 = v35;
            v35[0] = var24_15;
            v10 = -4963623474998811189L;
            v11 = var2_4;
        }
        var46_27 = m44.a("r", (Object)v5, (Object)v9, (long)v10, (long)v11);
        v36 = new Object[1];
        v36[0] = var26_16;
        var47_28 = (String)m44.a("m", (Object)v36, (long)-6429108569517432985L, (long)var2_4) + (String)laq.b("q", (int)21990, (long)(808795762677138672L ^ var2_4));
        var46_27.println(var47_28);
        m44.a("r", (Object)m44.a("i", (long)-6626972079646401238L, (long)var2_4), (Object)var47_28, (long)-4650195723326610078L, (long)var2_4);
        v37 = new Object[1];
        v37[0] = var26_16;
        var48_29 = new y1(var38_22, var5_2, m44.a("m", (Object)v37, (long)-6429108569517432985L, (long)var2_4).length());
        v38 = new Object[1];
        v38[0] = var18_12;
        var49_30 = m44.a("m", (Object)v38, (long)-5007732890716330147L, (long)var2_4);
        try {
            v39 = new Object[1];
            v39[0] = var22_14;
            v40 = new Object[1];
            v40[0] = var42_24;
            v41 = new Object[7];
            v41[6] = var5_2;
            v41[5] = null;
            v41[4] = var49_30;
            v41[3] = var12_9;
            v41[2] = var48_29;
            v41[1] = m44.a("r", (Object)var5_2, (Object)v40, (long)-6903992667427848746L, (long)var2_4);
            v41[0] = m44.a("r", (Object)var5_2, (Object)v39, (long)-5015467617385361641L, (long)var2_4);
            m44.a("r", (Object)var45_25, (Object)v41, (long)-4875662959054553387L, (long)var2_4);
        }
        catch (un var50_31) {
            v42 = new Object[2];
            v42[1] = var34_20;
            v42[0] = m44.a("r", (Object)var50_31, (long)-4815111429787033545L, (long)var2_4);
            m44.a("r", (Object)var5_2, (Object)v42, (long)-4793997075062359565L, (long)var2_4);
        }
        v43 = new Object[6];
        v43[5] = laq.b("q", (int)13288, (long)(6358909946222158586L ^ var2_4));
        v43[4] = var6_6;
        v43[3] = var7_5;
        v43[2] = var8_7;
        v43[1] = var4_3;
        v43[0] = var5_2;
        m44.a("r", (Object)this, (Object)v43, (long)-4778337559753001233L, (long)var2_4);
    }

    public laq(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x3664376F77B6L;
        super(l11, n10);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                laq.a = prr.a(-5979710502836003690L, -6203705818543631059L, MethodHandles.lookup().lookupClass()).a(134794686665975L);
                laq.g = new HashMap<K, V>(13);
                var0 = laq.a ^ 81521537073584L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[12];
                var7_4 = 0;
                var6_5 = ",Nr\u008d.+4\u0089h5\u00e1\u00b1_\u00a5\u0015\u00ea\u00f6\u0013\u00cbp\u00bc\u0083\u00dd\u00e6\u0080's\u00fag\u00af\u00c8\u00c9\u00127c\u00d9\u0017\u009a\u0017G+\u0092\u0090\t\u00e2*\u00c6N(A&\u0001\u00dfXb\u00a9\u0096\u00ac9=\u00e5z_x\u00f6\u00c0\u0094\b\u00d4\u008f\u0090\f[R*\u0014\u00c5\u001b\u001f\u00bd\u001b\u0099\u008f\u00df\u001d\u00d0\u00c9l\u00060\u008d\u00ab\n\u009b\u0002\u0085\u0093\u008d\u0094~\u00bcB\u0010C\u00ba\u00db\u00cbyH\u0018\u00ac|!`5=\u00b5J\u00b4\f\u0089\u0017\u0000]M\u00ac\u00a2\u00f7\u00c3\u008a|\u00fcg[\u00fe\u00daZ\u009f(\u0017\u000b%\u00c2\u00ce\u00d1\u00d4\u00ea\u00c8\u00d0\u00bd\u00d5>D\u0006\u00bf\u00d7\u0011\u0095m\u00c4^Zt\u00a3p\u00ec\u00ef\u00d1\u0098\u00a1\u00ce^kW_\u00abHv\u00fb\u0018g\u0013)\u0084\u00dd\u00e79\u00a3m;H\u00b5\u00f4\u00ee\u00a8\u00b4\t\u009b\u00a2{yZB\u009f(z\u00bb[\u00b6U\u001d\u00f4P\u00bc\u00cf\u00f3\u00d6\b\u00cc\u0003{\u0011dAH\u00f6\u0012\u00e3\u008a\u0082\u00deP0*,\u00cd\u00dd\u00b9\u00a5L\u0099\u00fa\u0090\u00b1\u00bbP\u0098\u00c0\u00be\u00d2\u00d6\u0081\u0098\u00191\u00cb\u0099\u00f9\\3\u009a]\u00e4y\u008d\u00e9\u00abv\u00b2\u00af\u008a\u00ef&\u00f2\u00fa\u00a3\u00f3\u0096$;z\\\u001a.2$Z\u00a0\u00d5\u00ff\u0087)t\u00f7sV\u00d7x]\u0003\u00c8\u00bd\u00ed\u00c7\u00ce\n\u00da`F&\u00a2z\u00ff\u00e6\u000b\u0095:G\u0099\u00b00\u00f5\t\u00bbL\u00e0(\u0004\u00b8JE\u00813U\u00e4\u00bf\u0086\u00e0\u0088g\u0016t\u001dmQ=\u001c\tu;\u001d\u0011\u00d4[!\u0094\u00e9\u00c2\u00bb\u0019\u00e7\u0007R\u00defnN0 \u0089gw\u0087k\u001bz\u00f6\u00b6l\u00c3\u007f\u00a3~\u000e\t\u00d8\u00ec\u00bd#\u00af\u00d7\u00c7\u0005\u009d0EH?\u0004\u00e8=\u0091\u00aa|\u000bq\u00fb\u00da@\u009d\u0081\u00c4h\u0096\u00c420\t<!\u00f8ze\u00d9\u00ae\u00c7\u0097 \u00bb\u00af\u00fc\u009f\u00e3\u00d7\u00cf\u0082\u0098\u0010\u0000L\u00bd\u0081!\u0088\u00c1#9a\u0005\u00f8\\\u0090\u00ee\u00e5\u0088^\u0080\u00da6\u00f1\u00f1\u0005n\u00b6\u0005";
                var8_6 = ",Nr\u008d.+4\u0089h5\u00e1\u00b1_\u00a5\u0015\u00ea\u00f6\u0013\u00cbp\u00bc\u0083\u00dd\u00e6\u0080's\u00fag\u00af\u00c8\u00c9\u00127c\u00d9\u0017\u009a\u0017G+\u0092\u0090\t\u00e2*\u00c6N(A&\u0001\u00dfXb\u00a9\u0096\u00ac9=\u00e5z_x\u00f6\u00c0\u0094\b\u00d4\u008f\u0090\f[R*\u0014\u00c5\u001b\u001f\u00bd\u001b\u0099\u008f\u00df\u001d\u00d0\u00c9l\u00060\u008d\u00ab\n\u009b\u0002\u0085\u0093\u008d\u0094~\u00bcB\u0010C\u00ba\u00db\u00cbyH\u0018\u00ac|!`5=\u00b5J\u00b4\f\u0089\u0017\u0000]M\u00ac\u00a2\u00f7\u00c3\u008a|\u00fcg[\u00fe\u00daZ\u009f(\u0017\u000b%\u00c2\u00ce\u00d1\u00d4\u00ea\u00c8\u00d0\u00bd\u00d5>D\u0006\u00bf\u00d7\u0011\u0095m\u00c4^Zt\u00a3p\u00ec\u00ef\u00d1\u0098\u00a1\u00ce^kW_\u00abHv\u00fb\u0018g\u0013)\u0084\u00dd\u00e79\u00a3m;H\u00b5\u00f4\u00ee\u00a8\u00b4\t\u009b\u00a2{yZB\u009f(z\u00bb[\u00b6U\u001d\u00f4P\u00bc\u00cf\u00f3\u00d6\b\u00cc\u0003{\u0011dAH\u00f6\u0012\u00e3\u008a\u0082\u00deP0*,\u00cd\u00dd\u00b9\u00a5L\u0099\u00fa\u0090\u00b1\u00bbP\u0098\u00c0\u00be\u00d2\u00d6\u0081\u0098\u00191\u00cb\u0099\u00f9\\3\u009a]\u00e4y\u008d\u00e9\u00abv\u00b2\u00af\u008a\u00ef&\u00f2\u00fa\u00a3\u00f3\u0096$;z\\\u001a.2$Z\u00a0\u00d5\u00ff\u0087)t\u00f7sV\u00d7x]\u0003\u00c8\u00bd\u00ed\u00c7\u00ce\n\u00da`F&\u00a2z\u00ff\u00e6\u000b\u0095:G\u0099\u00b00\u00f5\t\u00bbL\u00e0(\u0004\u00b8JE\u00813U\u00e4\u00bf\u0086\u00e0\u0088g\u0016t\u001dmQ=\u001c\tu;\u001d\u0011\u00d4[!\u0094\u00e9\u00c2\u00bb\u0019\u00e7\u0007R\u00defnN0 \u0089gw\u0087k\u001bz\u00f6\u00b6l\u00c3\u007f\u00a3~\u000e\t\u00d8\u00ec\u00bd#\u00af\u00d7\u00c7\u0005\u009d0EH?\u0004\u00e8=\u0091\u00aa|\u000bq\u00fb\u00da@\u009d\u0081\u00c4h\u0096\u00c420\t<!\u00f8ze\u00d9\u00ae\u00c7\u0097 \u00bb\u00af\u00fc\u009f\u00e3\u00d7\u00cf\u0082\u0098\u0010\u0000L\u00bd\u0081!\u0088\u00c1#9a\u0005\u00f8\\\u0090\u00ee\u00e5\u0088^\u0080\u00da6\u00f1\u00f1\u0005n\u00b6\u0005".length();
                var5_7 = 48;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = laq.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "[\u00a3\b\u00bd6\u0002e\u00c0u\u00f6\u00cd\u00c4\u00b8Q\u00c4.9'\u00d8\u00e9d\u0013)\u00d2\u001a,\u00bf\u00ad]~\u00a4 \u00beGN\u008b2\u0096p\u00e3(P1\u00b8cm\u00c2-\u00d0\u00c4B\u00df\u008e\u00a1!\u00eeJ\f(\u00be\u0096\u00d2`\u0082QtZp\u00feXUBJ\u00f9\u00bc\u00bf%\u00c6\u000ek\u00c8";
                    var8_6 = "[\u00a3\b\u00bd6\u0002e\u00c0u\u00f6\u00cd\u00c4\u00b8Q\u00c4.9'\u00d8\u00e9d\u0013)\u00d2\u001a,\u00bf\u00ad]~\u00a4 \u00beGN\u008b2\u0096p\u00e3(P1\u00b8cm\u00c2-\u00d0\u00c4B\u00df\u008e\u00a1!\u00eeJ\f(\u00be\u0096\u00d2`\u0082QtZp\u00feXUBJ\u00f9\u00bc\u00bf%\u00c6\u000ek\u00c8".length();
                    var5_7 = 40;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = laq.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        laq.e = var9_3;
        laq.f = new String[12];
    }

    private static un a(un un2) {
        return un2;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x38F4;
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
                throw new RuntimeException("com/zelix/laq", exception);
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
            laq.f[n11] = laq.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return f[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = laq.b(n10, l10);
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
            throw new RuntimeException("com/zelix/laq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(laq.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

