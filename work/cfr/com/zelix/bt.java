/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.aw;
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

public class bt
extends kx
implements ni {
    private x8 F;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map g;

    @Override
    public void q(x8 x82, long l10, x8 x83) {
        block11: {
            bt bt2;
            long l11;
            block12: {
                CallSite callSite;
                block10: {
                    l11 = l10 ^ 0L;
                    callSite = m44.a("n", (long)-5231047857311529425L, (long)l10);
                    try {
                        try {
                            bt2 = this;
                            if (callSite == false) break block10;
                            if (m44.a("p", (Object)bt2, (long)-5893327943551261472L, (long)l10) == false) break block11;
                        }
                        catch (n9 n92) {
                            throw m44.a("n", (Object)n92, (long)-5629971182225821598L, (long)l10);
                        }
                        bt2 = this;
                    }
                    catch (n9 n93) {
                        throw m44.a("n", (Object)n93, (long)-5629971182225821598L, (long)l10);
                    }
                }
                try {
                    block13: {
                        try {
                            try {
                                if (callSite == false) break block12;
                                if (m44.a("p", (Object)bt2, (long)-5890490222267568393L, (long)l10) != x82) break block13;
                            }
                            catch (n9 n94) {
                                throw m44.a("n", (Object)n94, (long)-5629971182225821598L, (long)l10);
                            }
                            m44.a("r", (Object)this, (x8)x83, (long)-5890490222267568393L, (long)l10);
                            if (callSite != false) break block11;
                        }
                        catch (n9 n95) {
                            throw m44.a("n", (Object)n95, (long)-5629971182225821598L, (long)l10);
                        }
                    }
                    bt2 = this;
                }
                catch (n9 n96) {
                    throw m44.a("n", (Object)n96, (long)-5629971182225821598L, (long)l10);
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
     */
    bt(long var1_1, _4 var3_2, int var4_3, String var5_4, h1 var6_5, l6q var7_6) {
        block26: {
            block27: {
                block23: {
                    block24: {
                        block25: {
                            v0 = var1_1 = bt.a ^ var1_1;
                            var8_7 = v0 ^ 81857436845808L;
                            var10_8 = v0 ^ 115289615371028L;
                            var12_9 = v0 ^ 81313573809562L;
                            var14_10 = v0 ^ 88890385915627L;
                            var16_11 = v0 ^ 12239143856313L;
                            var18_12 = v0 ^ 118159106379262L;
                            v1 = m44.a("i", (long)7199167578394530464L, (long)var1_1);
                            super(var3_2, var4_3, var14_10, var5_4, var6_5, var7_6);
                            m44.a("u", (Object)this, (byte[])new byte[this.W], (long)8719784191809506589L, (long)var1_1);
                            var6_5.read((byte[])m44.a("w", (Object)this, (long)8719784191809506589L, (long)var1_1));
                            v2 = new Object[3];
                            v2[2] = var10_8;
                            v2[1] = false;
                            v2[0] = m44.a("w", (Object)this, (long)8719784191809506589L, (long)var1_1);
                            var21_13 = m44.a("i", (Object)v2, (long)8749247222978807203L, (long)var1_1);
                            var22_14 = null;
                            var20_15 = v1;
                            var23_16 = var21_13.readUnsignedShort();
                            if (var23_16 == 0) break block23;
                            var24_19 = var3_2.m(var16_11, var23_16);
                            v3 = var24_19;
                            if (var1_1 < 0L || var20_15 == false) break block24;
                            try {
                                block30: {
                                    if (v3 != null) break block25;
                                    break block30;
                                    catch (Throwable v4) {
                                        throw m44.a("i", (Object)v4, (long)7300707165804274925L, (long)var1_1);
                                    }
                                }
                                m44.a("u", (Object)this, (boolean)false, (long)8843292860769480815L, (long)var1_1);
                                throw new aw((String)m44.a("v", (Object)var3_2.G(var12_9), (long)var8_7, (long)7038108657647915276L, (long)var1_1) + (String)bt.b("y", (int)32138, (long)(2899743412550907665L ^ var1_1)) + var23_16 + (String)bt.b("y", (int)19224, (long)(9072765822251139458L ^ var1_1)));
                            }
                            catch (Throwable v5) {
                                throw m44.a("i", (Object)v5, (long)7300707165804274925L, (long)var1_1);
                            }
                        }
                        v3 = var24_19;
                    }
                    try {
                        if (!(v3 instanceof x8)) {
                            m44.a("u", (Object)this, (boolean)false, (long)8843292860769480815L, (long)var1_1);
                            throw new aw((String)m44.a("v", (Object)var3_2.G(var12_9), (long)var8_7, (long)7038108657647915276L, (long)var1_1) + (String)bt.b("y", (int)24274, (long)(7257841514126808138L ^ var1_1)) + var23_16 + (String)bt.b("y", (int)22807, (long)(8616796193444139912L ^ var1_1)) + var24_19.getClass().getName() + (String)bt.b("y", (int)15248, (long)(7719598148324487433L ^ var1_1)));
                        }
                    }
                    catch (Throwable v6) {
                        throw m44.a("i", (Object)v6, (long)7300707165804274925L, (long)var1_1);
                    }
                    m44.a("u", (Object)this, (x8)((x8)var24_19), (long)8849510799455271544L, (long)var1_1);
                    var7_6.t(m44.a("w", (Object)this, (long)8849510799455271544L, (long)var1_1), this, var18_12);
                }
                try {
                    if (var21_13 == null) break block26;
                    if (var22_14 == null) break block27;
                }
                catch (Throwable v7) {
                    throw m44.a("i", (Object)v7, (long)7300707165804274925L, (long)var1_1);
                }
                try {
                    m44.a("v", (Object)var21_13, (long)7298216040042424419L, (long)var1_1);
                }
                catch (Throwable var23_17) {
                    m44.a("v", (Object)var22_14, (Object)var23_17, (long)8838872542482974417L, (long)var1_1);
                }
                break block26;
            }
            m44.a("v", (Object)var21_13, (long)7298216040042424419L, (long)var1_1);
            break block26;
            catch (Throwable var23_18) {
                try {
                    var22_14 = var23_18;
                    throw var23_18;
                }
                catch (Throwable var25_20) {
                    block29: {
                        block28: {
                            try {
                                if (var21_13 == null) break block28;
                                if (var22_14 != null) {
                                }
                                ** GOTO lbl88
                            }
                            catch (Throwable v8) {
                                throw m44.a("i", (Object)v8, (long)7300707165804274925L, (long)var1_1);
                            }
                            try {
                                m44.a("v", (Object)var21_13, (long)7298216040042424419L, (long)var1_1);
                            }
                            catch (Throwable var26_21) {
                                try {
                                    v9 = var22_14;
                                    if (var1_1 <= 0L) break block29;
                                    m44.a("v", (Object)v9, (Object)var26_21, (long)8838872542482974417L, (long)var1_1);
                                    if (var20_15 != false) break block28;
lbl88:
                                    // 2 sources

                                    m44.a("v", (Object)var21_13, (long)7298216040042424419L, (long)var1_1);
                                }
                                catch (Throwable v10) {
                                    throw m44.a("i", (Object)v10, (long)7300707165804274925L, (long)var1_1);
                                }
                            }
                        }
                        v9 = var25_20;
                    }
                    throw v9;
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void N(Object[] var1_1) {
        block28: {
            block27: {
                block26: {
                    block25: {
                        block24: {
                            var2_2 = (DataOutputStream)var1_1[0];
                            var4_3 = (Map)var1_1[1];
                            var5_4 = (Long)var1_1[2];
                            var3_5 = (lqu)var1_1[3];
                            var7_6 = var5_4 ^ 62442288127650L;
                            v0 = m44.a("k", (long)1083949478671047661L, (long)var5_4);
                            v1 = new Object[2];
                            v1[1] = var2_2;
                            v1[0] = var7_6;
                            super.c(v1);
                            var9_7 = v0;
                            try {
                                try {
                                    v2 = this;
                                    if (var9_7 != false) break block24;
                                    if (m44.a("u", (Object)v2, (long)1009829788873835733L, (long)var5_4) != false) {
                                    }
                                    ** GOTO lbl82
                                }
                                catch (n9 v3) {
                                    throw m44.a("k", (Object)v3, (long)1291196825540153431L, (long)var5_4);
                                }
                                v2 = this;
                            }
                            catch (n9 v4) {
                                throw m44.a("k", (Object)v4, (long)1291196825540153431L, (long)var5_4);
                            }
                        }
                        try {
                            try {
                                v5 = m44.a("u", (Object)v2, (long)1041974150035721922L, (long)var5_4);
                                if (var9_7 != false) break block25;
                                if (v5 != null) {
                                }
                                ** GOTO lbl75
                            }
                            catch (n9 v6) {
                                throw m44.a("k", (Object)v6, (long)1291196825540153431L, (long)var5_4);
                            }
                            v5 = (js)var4_3.get(m44.a("u", (Object)this, (long)1041974150035721922L, (long)var5_4));
                        }
                        catch (n9 v7) {
                            throw m44.a("k", (Object)v7, (long)1291196825540153431L, (long)var5_4);
                        }
                    }
                    var10_8 = v5;
                    try {
                        try {
                            v8 = var9_7;
                            if (var5_4 < 0L) ** GOTO lbl61
                            if (v8 != false) break block26;
                            if (var10_8 != null) {
                            }
                            ** GOTO lbl64
                        }
                        catch (n9 v9) {
                            throw m44.a("k", (Object)v9, (long)1291196825540153431L, (long)var5_4);
                        }
                        var2_2.writeShort(var10_8.E());
                    }
                    catch (n9 v10) {
                        throw m44.a("k", (Object)v10, (long)1291196825540153431L, (long)var5_4);
                    }
                }
                try {
                    v8 = var9_7;
lbl61:
                    // 2 sources

                    if (var5_4 > 0L) {
                        if (v8 == false) break block27;
                    }
                    ** GOTO lbl72
lbl64:
                    // 2 sources

                    var2_2.writeShort(m44.a("u", (Object)this, (long)1041974150035721922L, (long)var5_4).E());
                }
                catch (n9 v11) {
                    throw m44.a("k", (Object)v11, (long)1291196825540153431L, (long)var5_4);
                }
            }
            try {
                try {
                    block29: {
                        v8 = var9_7;
lbl72:
                        // 2 sources

                        if (var5_4 >= 0L) {
                            if (v8 == false) break block28;
                        }
                        break block29;
lbl75:
                        // 2 sources

                        var2_2.writeShort(0);
                        v8 = var9_7;
                    }
                    if (v8 == false) break block28;
                }
                catch (n9 v12) {
                    throw m44.a("k", (Object)v12, (long)1291196825540153431L, (long)var5_4);
                }
lbl82:
                // 2 sources

                var2_2.write((byte[])m44.a("u", (Object)this, (long)988812052272789927L, (long)var5_4));
            }
            catch (n9 v13) {
                throw m44.a("k", (Object)v13, (long)1291196825540153431L, (long)var5_4);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void c(Object[] var1_1) {
        block13: {
            block11: {
                var2_2 = (Long)var1_1[0];
                var4_3 = (DataOutputStream)var1_1[1];
                var5_4 = var2_2 ^ 0L;
                v0 = m44.a("i", (long)716282175763740856L, (long)var2_2);
                v1 = new Object[2];
                v1[1] = var4_3;
                v1[0] = var5_4;
                super.c(v1);
                var7_5 = v0;
                try {
                    try {
                        v2 = this;
                        if (var7_5 == false) break block11;
                        if (m44.a("w", (Object)v2, (long)1198408428474194551L, (long)var2_2) != false) {
                        }
                        ** GOTO lbl42
                    }
                    catch (n9 v3) {
                        throw m44.a("i", (Object)v3, (long)1101543944074415861L, (long)var2_2);
                    }
                    v2 = this;
                }
                catch (n9 v4) {
                    throw m44.a("i", (Object)v4, (long)1101543944074415861L, (long)var2_2);
                }
            }
            try {
                try {
                    block12: {
                        try {
                            if (m44.a("w", (Object)v2, (long)1213699425690701920L, (long)var2_2) == null) break block12;
                            var4_3.writeShort(m44.a("w", (Object)this, (long)1213699425690701920L, (long)var2_2).E());
                            if (var7_5 != false) break block13;
                        }
                        catch (n9 v5) {
                            throw m44.a("i", (Object)v5, (long)1101543944074415861L, (long)var2_2);
                        }
                    }
                    var4_3.writeShort(0);
                    if (var7_5 != false) break block13;
                }
                catch (n9 v6) {
                    throw m44.a("i", (Object)v6, (long)1101543944074415861L, (long)var2_2);
                }
lbl42:
                // 2 sources

                var4_3.write((byte[])m44.a("w", (Object)this, (long)1376640891870979845L, (long)var2_2));
            }
            catch (n9 v7) {
                throw m44.a("i", (Object)v7, (long)1101543944074415861L, (long)var2_2);
            }
        }
    }

    @Override
    void z(gu gu2, long l10) {
        block9: {
            CallSite callSite;
            long l11;
            block10: {
                bt bt2;
                CallSite callSite2;
                block8: {
                    l11 = l10 ^ 0x6DE1DADD9981L;
                    CallSite callSite3 = m44.a("h", (long)5618762033536375070L, (long)l10);
                    this.b.e(l11, gu2, this, this.H());
                    callSite2 = callSite3;
                    try {
                        try {
                            bt2 = this;
                            if (callSite2 != false) break block8;
                            if (m44.a("v", (Object)bt2, (long)5544088189886891558L, (long)l10) == false) break block9;
                        }
                        catch (n9 n92) {
                            throw m44.a("h", (Object)n92, (long)5987655181882725028L, (long)l10);
                        }
                        bt2 = this;
                    }
                    catch (n9 n93) {
                        throw m44.a("h", (Object)n93, (long)5987655181882725028L, (long)l10);
                    }
                }
                try {
                    try {
                        callSite = m44.a("v", (Object)bt2, (long)5514369646013156401L, (long)l10);
                        if (callSite2 != false) break block10;
                        if (callSite == null) break block9;
                    }
                    catch (n9 n94) {
                        throw m44.a("h", (Object)n94, (long)5987655181882725028L, (long)l10);
                    }
                    callSite = m44.a("v", (Object)this, (long)5514369646013156401L, (long)l10);
                }
                catch (n9 n95) {
                    throw m44.a("h", (Object)n95, (long)5987655181882725028L, (long)l10);
                }
            }
            ((x8)((Object)callSite)).e(l11, gu2, this, this.H());
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                bt.a = prr.a(480248143837102949L, 6809567440673148045L, MethodHandles.lookup().lookupClass()).a(96739268770978L);
                bt.g = new HashMap<K, V>(13);
                var0 = bt.a ^ 68915914417314L;
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
                var6_5 = "|\u00a5>*\u001e\u00ed\u00da\u0099\u0083\u0016v}@(\u00bb\t\u00ce\u008e\u0015\u00a5j\u0017\u00d2\u00b9\u0091\u0085\u00dbgE\u00ac\u0015@+\u00c2G\u00c6\u00c6~F\u00c7\u00af\u0084\u0083\u0001JJz\u00eb\u00d3\u0091\n\u00de\u0082\u0089\u0089\u0081E\u00eb[\u00a4CQ\u00b7\u00ea\u00b6wX\u00da\u0007\u0093\u0094g@q\u0005\u00cb\u00ac\u00bb\u0090\u00a525\u00eb; \u00aeF\u00e8\u0085\u00a3\u00a7Q\u0094\u000b\u00e5r_\u00c6\u00ef\u00d1\u001e^I\r)\u00cc\u00af\u0094\u00073 R\u00edOI;w-\u0096\u00b3v\u00b0\u00e6b\u00c5\u001b\u0083\u00b1\u00c3{\u00b4-\u0007l\u0004\u0092K@\u0003u\u00f0\u00f1\u00cbh\u00f3\u009c\u0012\u00a6\u00d2\u009b\u009d\\\u0004\u009e\u00cb\u00e6\u0095\u00cd\u0003\u0080\u0001\u00e4Z\u00aaB\u001c\u00a2\u00949Ek\u0094Wv\u001aD}Q\u0089\u00cb\u00c1\u00e8\u00abg\u0099\u009f<\u00b2zS\u00e5/\u0016b\u00cb \u00c4\rd`\u0007|";
                var8_6 = "|\u00a5>*\u001e\u00ed\u00da\u0099\u0083\u0016v}@(\u00bb\t\u00ce\u008e\u0015\u00a5j\u0017\u00d2\u00b9\u0091\u0085\u00dbgE\u00ac\u0015@+\u00c2G\u00c6\u00c6~F\u00c7\u00af\u0084\u0083\u0001JJz\u00eb\u00d3\u0091\n\u00de\u0082\u0089\u0089\u0081E\u00eb[\u00a4CQ\u00b7\u00ea\u00b6wX\u00da\u0007\u0093\u0094g@q\u0005\u00cb\u00ac\u00bb\u0090\u00a525\u00eb; \u00aeF\u00e8\u0085\u00a3\u00a7Q\u0094\u000b\u00e5r_\u00c6\u00ef\u00d1\u001e^I\r)\u00cc\u00af\u0094\u00073 R\u00edOI;w-\u0096\u00b3v\u00b0\u00e6b\u00c5\u001b\u0083\u00b1\u00c3{\u00b4-\u0007l\u0004\u0092K@\u0003u\u00f0\u00f1\u00cbh\u00f3\u009c\u0012\u00a6\u00d2\u009b\u009d\\\u0004\u009e\u00cb\u00e6\u0095\u00cd\u0003\u0080\u0001\u00e4Z\u00aaB\u001c\u00a2\u00949Ek\u0094Wv\u001aD}Q\u0089\u00cb\u00c1\u00e8\u00abg\u0099\u009f<\u00b2zS\u00e5/\u0016b\u00cb \u00c4\rd`\u0007|".length();
                var5_7 = 72;
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
                    var9_3[var7_4++] = bt.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0000P4\u00a1I\u00c0i\u00eea\u0015\u00cb]\\\u0004GU\u00f4\u00f4d\u0092$\u00f2+\u0013\u0090\u00dc\u0001?(@o;\u00ff\rZ(\u00e53L`\u0010\u00d8j\u00c1h\u0017\u00a2\u00d4\u00c9O\u00f1\u00ac\u00db\u00ed\u00c4\u0093t";
                    var8_6 = "\u0000P4\u00a1I\u00c0i\u00eea\u0015\u00cb]\\\u0004GU\u00f4\u00f4d\u0092$\u00f2+\u0013\u0090\u00dc\u0001?(@o;\u00ff\rZ(\u00e53L`\u0010\u00d8j\u00c1h\u0017\u00a2\u00d4\u00c9O\u00f1\u00ac\u00db\u00ed\u00c4\u0093t".length();
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
                    var9_3[var7_4++] = bt.c(var10_9).intern();
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
        bt.c = var9_3;
        bt.d = new String[5];
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3A6D;
        if (d[n11] == null) {
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
                throw new RuntimeException("com/zelix/bt", exception);
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
            bt.d[n11] = bt.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = bt.b(n10, l10);
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
            throw new RuntimeException("com/zelix/bt" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bt.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

