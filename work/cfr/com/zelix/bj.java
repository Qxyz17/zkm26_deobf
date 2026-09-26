/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.aw;
import com.zelix.b3;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.js;
import com.zelix.kx;
import com.zelix.l6q;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ni;
import com.zelix.prr;
import com.zelix.x8;
import java.io.DataOutputStream;
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

public class bj
extends kx
implements ni {
    private x8 J;
    private b3[] g;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map i;

    @Override
    public void q(x8 x82, long l10, x8 x83) {
        block11: {
            bj bj2;
            long l11;
            block12: {
                CallSite callSite;
                block10: {
                    l11 = l10 ^ 0L;
                    callSite = m44.a("n", (long)-5231047857311529425L, (long)l10);
                    try {
                        try {
                            bj2 = this;
                            if (callSite == false) break block10;
                            if (m44.a("p", (Object)bj2, (long)-5893327943551261472L, (long)l10) == false) break block11;
                        }
                        catch (n9 n92) {
                            throw m44.a("n", (Object)n92, (long)-5271963944706066690L, (long)l10);
                        }
                        bj2 = this;
                    }
                    catch (n9 n93) {
                        throw m44.a("n", (Object)n93, (long)-5271963944706066690L, (long)l10);
                    }
                }
                try {
                    block13: {
                        try {
                            try {
                                if (callSite == false) break block12;
                                if (m44.a("p", (Object)bj2, (long)-5708550217815684612L, (long)l10) != x82) break block13;
                            }
                            catch (n9 n94) {
                                throw m44.a("n", (Object)n94, (long)-5271963944706066690L, (long)l10);
                            }
                            m44.a("r", (Object)this, (x8)x83, (long)-5708550217815684612L, (long)l10);
                            if (callSite != false) break block11;
                        }
                        catch (n9 n95) {
                            throw m44.a("n", (Object)n95, (long)-5271963944706066690L, (long)l10);
                        }
                    }
                    bj2 = this;
                }
                catch (n9 n96) {
                    throw m44.a("n", (Object)n96, (long)-5271963944706066690L, (long)l10);
                }
            }
            super.q(x82, l11, x83);
        }
    }

    @Override
    public void W(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        int n11 = (Integer)objectArray[2];
        HashMap hashMap = (HashMap)objectArray[3];
        HashMap hashMap2 = (HashMap)objectArray[4];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void c(Object[] var1_1) {
        block15: {
            block14: {
                var2_2 = (Long)var1_1[0];
                var4_3 = (DataOutputStream)var1_1[1];
                v0 = var2_2;
                var5_4 = v0 ^ 0L;
                var7_5 = v0 ^ 2841541785188L;
                v1 = m44.a("i", (long)716282175763740856L, (long)var2_2);
                v2 = new Object[2];
                v2[1] = var4_3;
                v2[0] = var5_4;
                super.c(v2);
                var9_6 = v1;
                try {
                    try {
                        v3 /* !! */  = m44.a("w", (Object)this, (long)1198408428474194551L, (long)var2_2);
                        if (var9_6 == false) break block14;
                        if (v3 /* !! */  != false) {
                        }
                        ** GOTO lbl52
                    }
                    catch (n9 v4) {
                        throw m44.a("i", (Object)v4, (long)594778414420265065L, (long)var2_2);
                    }
                    var4_3.writeShort(m44.a("w", (Object)this, (long)1031338308009572203L, (long)var2_2).E());
                    var4_3.writeShort(((CallSite)m44.a("w", (Object)this, (long)1088320543459280820L, (long)var2_2)).length);
                    v3 /* !! */  = (reference)false;
                }
                catch (n9 v5) {
                    throw m44.a("i", (Object)v5, (long)594778414420265065L, (long)var2_2);
                }
            }
            var10_7 = v3 /* !! */ ;
            block8: while (var10_7 < ((CallSite)m44.a("w", (Object)this, (long)1088320543459280820L, (long)var2_2)).length) {
                try {
                    v6 = new Object[2];
                    v6[1] = var4_3;
                    v6[0] = var7_5;
                    m44.a("v", (Object)m44.a("w", (Object)this, (long)1088320543459280820L, (long)var2_2)[var10_7], (Object)v6, (long)661271200792890057L, (long)var2_2);
                    ++var10_7;
                    do {
                        v7 = var9_6;
                        if (var2_2 > 0L) {
                            if (v7 == false) break block15;
                            v7 = var9_6;
                        }
                        if (v7 != false) continue block8;
                    } while (var2_2 <= 0L);
                    break;
                }
                catch (n9 v8) {
                    throw m44.a("i", (Object)v8, (long)594778414420265065L, (long)var2_2);
                }
            }
            try {
                if (var2_2 <= 0L || var9_6 != false) break block15;
lbl52:
                // 2 sources

                var4_3.write((byte[])m44.a("w", (Object)this, (long)1376640891870979845L, (long)var2_2));
            }
            catch (n9 v9) {
                throw m44.a("i", (Object)v9, (long)594778414420265065L, (long)var2_2);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    bj(_4 var1_1, int var2_2, String var3_3, h1 var4_4, l6q var5_5, long var6_6) {
        block34: {
            block35: {
                block32: {
                    block33: {
                        block30: {
                            block31: {
                                v0 = var6_6 = bj.a ^ var6_6;
                                var8_7 = v0 ^ 1974670480448L;
                                v1 = v0 ^ 88582162669632L;
                                var10_8 = (int)(v1 >>> 32);
                                var11_9 = (int)(v1 << 32 >>> 48);
                                var12_10 = (int)(v1 << 48 >>> 48);
                                var13_11 = v0 ^ 38911806560676L;
                                var15_12 = v0 ^ 2531385474858L;
                                var17_13 = v0 ^ 30104752884827L;
                                var19_14 = v0 ^ 71023947430409L;
                                var21_15 = v0 ^ 36069796634446L;
                                v2 = m44.a("i", (long)2954553910042656231L, (long)var6_6);
                                super(var1_1, var2_2, var17_13, var3_3, var4_4, var5_5);
                                var23_16 = v2;
                                m44.a("u", (Object)this, (byte[])new byte[this.W], (long)3148770665665208237L, (long)var6_6);
                                var4_4.read((byte[])m44.a("w", (Object)this, (long)3148770665665208237L, (long)var6_6));
                                v3 = new Object[3];
                                v3[2] = var13_11;
                                v3[1] = false;
                                v3[0] = m44.a("w", (Object)this, (long)3148770665665208237L, (long)var6_6);
                                var24_17 = m44.a("i", (Object)v3, (long)3160359563103033107L, (long)var6_6);
                                var25_18 = null;
                                var26_19 = var24_17.readUnsignedShort();
                                var27_22 = var1_1.m(var19_14, var26_19);
                                v4 = var27_22;
                                if (var23_16 != false) break block30;
                                try {
                                    block38: {
                                        if (v4 != null) break block31;
                                        break block38;
                                        catch (aw v5) {
                                            throw m44.a("i", (Object)v5, (long)3524474031011868865L, (long)var6_6);
                                        }
                                    }
                                    m44.a("u", (Object)this, (boolean)false, (long)2885113812087988959L, (long)var6_6);
                                    throw new aw((String)m44.a("v", (Object)var1_1.G(var15_12), (long)var8_7, (long)3682863889827939260L, (long)var6_6) + (String)bj.b("a", (int)16129, (long)(1497659537766829541L ^ var6_6)) + var26_19 + (String)bj.b("a", (int)17501, (long)(9012097123478845112L ^ var6_6)));
                                }
                                catch (aw v6) {
                                    throw m44.a("i", (Object)v6, (long)3524474031011868865L, (long)var6_6);
                                }
                            }
                            v4 = var27_22;
                        }
                        v7 = v4 instanceof x8;
                        if (var23_16 != false) break block32;
                        try {
                            block39: {
                                if (v7 != 0) break block33;
                                break block39;
                                catch (aw v8) {
                                    throw m44.a("i", (Object)v8, (long)3524474031011868865L, (long)var6_6);
                                }
                            }
                            m44.a("u", (Object)this, (boolean)false, (long)2885113812087988959L, (long)var6_6);
                            throw new aw((String)m44.a("v", (Object)var1_1.G(var15_12), (long)var8_7, (long)3682863889827939260L, (long)var6_6) + (String)bj.b("a", (int)3447, (long)(6657189198858223505L ^ var6_6)) + var26_19 + (String)bj.b("a", (int)7814, (long)(685053815457836129L ^ var6_6)) + var27_22.getClass().getName() + (String)bj.b("a", (int)826, (long)(7676651494854095320L ^ var6_6)));
                        }
                        catch (aw v9) {
                            throw m44.a("i", (Object)v9, (long)3524474031011868865L, (long)var6_6);
                        }
                    }
                    m44.a("u", (Object)this, (x8)((x8)var27_22), (long)3961035848781369283L, (long)var6_6);
                    var5_5.t(m44.a("w", (Object)this, (long)3961035848781369283L, (long)var6_6), this, var21_15);
                    v7 = var24_17.readUnsignedShort();
                }
                var28_23 = v7;
                m44.a("u", (Object)this, (b3[])new b3[var28_23], (long)4013301418793156380L, (long)var6_6);
                block26: for (var29_24 = 0; var29_24 < var28_23; ++var29_24) {
                    try {
                        m44.a("w", (Object)this, (long)4013301418793156380L, (long)var6_6)[var29_24] = new b3(var10_8, this, (short)var11_9, (h1)var24_17, var12_10);
lbl70:
                        // 2 sources

                        while (var23_16 == false) {
                            continue block26;
                        }
                    }
                    catch (n9 v10) {
                        throw m44.a("i", (Object)v10, (long)3524474031011868865L, (long)var6_6);
                    }
                    break block34;
                    {
                        catch (aw var30_25) {
                            m44.a("u", (Object)this, (boolean)false, (long)2885113812087988959L, (long)var6_6);
                            throw var30_25;
                        }
                    }
                }
                try {
                    if (var6_6 < 0L) ** GOTO lbl70
                    if (var24_17 == null) break block34;
                    if (var25_18 == null) break block35;
                }
                catch (aw v11) {
                    throw m44.a("i", (Object)v11, (long)3524474031011868865L, (long)var6_6);
                }
                try {
                    m44.a("v", (Object)var24_17, (long)4033030001102371539L, (long)var6_6);
                }
                catch (Throwable var26_20) {
                    m44.a("v", (Object)var25_18, (Object)var26_20, (long)2889534176109565025L, (long)var6_6);
                }
                break block34;
            }
            m44.a("v", (Object)var24_17, (long)4033030001102371539L, (long)var6_6);
            break block34;
            catch (Throwable var26_21) {
                try {
                    var25_18 = var26_21;
                    throw var26_21;
                }
                catch (Throwable var31_26) {
                    block37: {
                        block36: {
                            try {
                                if (var24_17 == null) break block36;
                                if (var25_18 != null) {
                                }
                                ** GOTO lbl115
                            }
                            catch (aw v12) {
                                throw m44.a("i", (Object)v12, (long)3524474031011868865L, (long)var6_6);
                            }
                            try {
                                m44.a("v", (Object)var24_17, (long)4033030001102371539L, (long)var6_6);
                            }
                            catch (Throwable var32_27) {
                                try {
                                    v13 = var25_18;
                                    if (var6_6 <= 0L) break block37;
                                    m44.a("v", (Object)v13, (Object)var32_27, (long)2889534176109565025L, (long)var6_6);
                                    if (var23_16 == false) break block36;
lbl115:
                                    // 2 sources

                                    m44.a("v", (Object)var24_17, (long)4033030001102371539L, (long)var6_6);
                                }
                                catch (aw v14) {
                                    throw m44.a("i", (Object)v14, (long)3524474031011868865L, (long)var6_6);
                                }
                            }
                        }
                        v13 = var31_26;
                    }
                    throw v13;
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void N(Object[] var1_1) {
        block26: {
            block24: {
                block25: {
                    block23: {
                        block22: {
                            var3_2 = (DataOutputStream)var1_1[0];
                            var2_3 = (Map)var1_1[1];
                            var4_4 = (Long)var1_1[2];
                            var6_5 = (lqu)var1_1[3];
                            v0 = var4_4;
                            var7_6 = v0 ^ 62442288127650L;
                            var9_7 = v0 ^ 48102949711725L;
                            v1 = m44.a("k", (long)1680553024964027930L, (long)var4_4);
                            v2 = new Object[2];
                            v2[1] = var3_2;
                            v2[0] = var7_6;
                            super.c(v2);
                            var11_8 = v1;
                            try {
                                try {
                                    v3 /* !! */  = this;
                                    if (var11_8 == false) break block22;
                                    if (m44.a("u", (Object)v3 /* !! */ , (long)1009829788873835733L, (long)var4_4) != false) {
                                    }
                                    ** GOTO lbl80
                                }
                                catch (n9 v4) {
                                    throw m44.a("k", (Object)v4, (long)1649209285490513611L, (long)var4_4);
                                }
                                v3 /* !! */  = var2_3.get(m44.a("u", (Object)this, (long)1221096106462456265L, (long)var4_4));
                            }
                            catch (n9 v5) {
                                throw m44.a("k", (Object)v5, (long)1649209285490513611L, (long)var4_4);
                            }
                        }
                        var12_9 = (js)v3 /* !! */ ;
                        try {
                            try {
                                v6 = var11_8;
                                if (var4_4 <= 0L) ** GOTO lbl49
                                if (v6 == false) break block23;
                                if (var12_9 != null) {
                                }
                                ** GOTO lbl51
                            }
                            catch (n9 v7) {
                                throw m44.a("k", (Object)v7, (long)1649209285490513611L, (long)var4_4);
                            }
                            var3_2.writeShort(var12_9.E());
                        }
                        catch (n9 v8) {
                            throw m44.a("k", (Object)v8, (long)1649209285490513611L, (long)var4_4);
                        }
                    }
                    try {
                        v6 = var11_8;
lbl49:
                        // 2 sources

                        if (var4_4 <= 0L) break block24;
                        if (v6 != false) break block25;
lbl51:
                        // 2 sources

                        var3_2.writeShort(m44.a("u", (Object)this, (long)1221096106462456265L, (long)var4_4).E());
                    }
                    catch (n9 v9) {
                        throw m44.a("k", (Object)v9, (long)1649209285490513611L, (long)var4_4);
                    }
                }
                var3_2.writeShort(((CallSite)m44.a("u", (Object)this, (long)1276846424427960598L, (long)var4_4)).length);
                v6 = var13_10 = (reference)false;
            }
            block14: while (var13_10 < ((CallSite)m44.a("u", (Object)this, (long)1276846424427960598L, (long)var4_4)).length) {
                try {
                    v10 = new Object[3];
                    v10[2] = var2_3;
                    v10[1] = var9_7;
                    v10[0] = var3_2;
                    m44.a("t", (Object)m44.a("u", (Object)this, (long)1276846424427960598L, (long)var4_4)[var13_10], (Object)v10, (long)1088971250334465237L, (long)var4_4);
                    ++var13_10;
                    do {
                        v11 = var11_8;
                        if (var4_4 > 0L) {
                            if (v11 == false) break block26;
                            v11 = var11_8;
                        }
                        if (v11 != false) continue block14;
                    } while (var4_4 < 0L);
                    break;
                }
                catch (n9 v12) {
                    throw m44.a("k", (Object)v12, (long)1649209285490513611L, (long)var4_4);
                }
            }
            try {
                if (var4_4 <= 0L || var11_8 != false) break block26;
lbl80:
                // 2 sources

                var3_2.write((byte[])m44.a("u", (Object)this, (long)988812052272789927L, (long)var4_4));
            }
            catch (n9 v13) {
                throw m44.a("k", (Object)v13, (long)1649209285490513611L, (long)var4_4);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    void z(gu gu2, long l10) {
        block6: {
            void var9_7;
            Object object;
            CallSite callSite;
            long l11;
            block5: {
                long l12 = l10;
                l11 = l12 ^ 0L;
                long l13 = l12 ^ 0x6DE1DADD9981L;
                CallSite callSite2 = m44.a("h", (long)6170399952317654249L, (long)l10);
                this.b.e(l13, gu2, this, this.H());
                callSite = callSite2;
                try {
                    try {
                        object = m44.a("v", (Object)this, (long)5544088189886891558L, (long)l10);
                        if (callSite == false) break block5;
                        if (object == false) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)6057349304735716408L, (long)l10);
                    }
                    ((x8)((Object)m44.a("v", (Object)this, (long)5909031065846410042L, (long)l10))).e(l13, gu2, this, this.H());
                    object = false;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)6057349304735716408L, (long)l10);
                }
            }
            CallSite callSite3 = object;
            while (var9_7 < ((CallSite)m44.a("v", (Object)this, (long)6002006432286432229L, (long)l10)).length) {
                m44.a("w", (Object)m44.a("v", (Object)this, (long)6002006432286432229L, (long)l10)[var9_7], (Object)gu2, (long)l11, (long)6040475462986636767L, (long)l10);
                ++var9_7;
                if (callSite != false) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                bj.a = prr.a(-5940193955237167273L, 5333931641616944784L, MethodHandles.lookup().lookupClass()).a(241708093305734L);
                bj.i = new HashMap<K, V>(13);
                var0 = bj.a ^ 74979974760679L;
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
                var9_3 = new String[5];
                var7_4 = 0;
                var6_5 = "_I2e\u00ed\u0015\u001a\u0082\u009fJ\u00f2\n$\u00e2\u00d6\u00abZ\u00aa\u000b\u00cc\u00cb\u00ac\u008d\u00a2M\u00e9\u00d1[J\u00d4\u0007\u00e2\u00d3\u0096\u0014w\u00fdAP\u00d5\u0010\u0015pr4bG\u0082\u00db\b\u00ad\u00e6\u00de\u0001\u0081\t\u00c0P\u00a0\u00ccN\u00af8\u00e1\u00dd\u00f2<\u00b2\u008a\u00e4\u0015\u00fc\u00d0\u00e4\u0089\u009a\u00b4}:ec\b\u0090h\u008e\u00ed\u00cb\u00a8T\u0083\u0013\u00f8\u00cet\u00bf\u0090k\u0007{\u00d7\u00cd\u00b5\u00ea\u0091\u00e9\u00d2\u0013\u00f2\u00c06\u0082~\u000f\u00b8d}E\u00f2\u0010\u00ed)\u00dfA\u0019\u00db\u00a3\f\u00d4U5\u00b8\u0017n\u00ca\u0006\u00ca9\u00fe";
                var8_6 = "_I2e\u00ed\u0015\u001a\u0082\u009fJ\u00f2\n$\u00e2\u00d6\u00abZ\u00aa\u000b\u00cc\u00cb\u00ac\u008d\u00a2M\u00e9\u00d1[J\u00d4\u0007\u00e2\u00d3\u0096\u0014w\u00fdAP\u00d5\u0010\u0015pr4bG\u0082\u00db\b\u00ad\u00e6\u00de\u0001\u0081\t\u00c0P\u00a0\u00ccN\u00af8\u00e1\u00dd\u00f2<\u00b2\u008a\u00e4\u0015\u00fc\u00d0\u00e4\u0089\u009a\u00b4}:ec\b\u0090h\u008e\u00ed\u00cb\u00a8T\u0083\u0013\u00f8\u00cet\u00bf\u0090k\u0007{\u00d7\u00cd\u00b5\u00ea\u0091\u00e9\u00d2\u0013\u00f2\u00c06\u0082~\u000f\u00b8d}E\u00f2\u0010\u00ed)\u00dfA\u0019\u00db\u00a3\f\u00d4U5\u00b8\u0017n\u00ca\u0006\u00ca9\u00fe".length();
                var5_7 = 40;
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
                    var9_3[var7_4++] = bj.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u008a\u00f0HE3/\u009e\u00ac@\u00e7V3\u00bd\u000f\u00ab\u0095vD\u0090\u00e5\u0001\u00cbr\u00c6efO)`\r\u00e6\u009b\u009b#H\u009d\u00e6\u0085}\u001fq\u00ac\u00d6\u0004\u00ef\u00ad\u00c1\u008fH\u000bt\u00e3\u00fb\u00ae0BpB\u00cf3\u00f7S\r\u00041\u00f2\u00abS\u00b4\u00c6f\u00a4\u00e7\u00a41\u00bcsTuA\u00b56\u00bc\u00a4\u00e0\u0011#\u0011l\f](\u000b\u00f4\u009aR\u00e9E\u0090W\u009e\u009cy\u009fSI\u00c3\u00fd\u008b\u0090\u00b6,\u0086\u008d\u0080\u0003j\u0095\u00d2\u00f44";
                    var8_6 = "\u008a\u00f0HE3/\u009e\u00ac@\u00e7V3\u00bd\u000f\u00ab\u0095vD\u0090\u00e5\u0001\u00cbr\u00c6efO)`\r\u00e6\u009b\u009b#H\u009d\u00e6\u0085}\u001fq\u00ac\u00d6\u0004\u00ef\u00ad\u00c1\u008fH\u000bt\u00e3\u00fb\u00ae0BpB\u00cf3\u00f7S\r\u00041\u00f2\u00abS\u00b4\u00c6f\u00a4\u00e7\u00a41\u00bcsTuA\u00b56\u00bc\u00a4\u00e0\u0011#\u0011l\f](\u000b\u00f4\u009aR\u00e9E\u0090W\u009e\u009cy\u009fSI\u00c3\u00fd\u008b\u0090\u00b6,\u0086\u008d\u0080\u0003j\u0095\u00d2\u00f44".length();
                    var5_7 = 48;
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
                    var9_3[var7_4++] = bj.c(var10_9).intern();
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
        bj.c = var9_3;
        bj.d = new String[5];
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x50A0;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])i.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/bj", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n11].getBytes("ISO-8859-1");
            bj.d[n11] = bj.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = bj.b(n10, l10);
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
            throw new RuntimeException("com/zelix/bj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bj.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

