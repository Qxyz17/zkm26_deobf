/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.r5;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lth
extends l7t {
    static final Map h;
    ArrayList w;
    int X;
    private static final long a;

    void U(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l10 = a ^ l10;
        ((ArrayList)((Object)m44.a("r", (Object)this, (long)-7273480704690353654L, (long)l10))).add(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void M(Object[] objectArray) {
        lmu lmu2;
        long l10;
        long l11;
        long l12;
        block6: {
            lmu lmu3 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            l12 = (Long)objectArray[2];
            long l13 = l12;
            l11 = l13 ^ 0x33799DBBFD99L;
            l10 = l13 ^ 0x6352E8763037L;
            long l14 = l13 ^ 0x47526B4E5A06L;
            long l15 = l13 ^ 0L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l14;
            CallSite callSite = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l12);
            CallSite callSite2 = m44.a("h", (long)-6823249310977527178L, (long)l12);
            int n10 = 0;
            block2: while (n10 < callSite) {
                try {
                    do {
                        if (l12 >= 0L) {
                            lmu2 = this.V(n10);
                            if (callSite2 != false) break block6;
                            Object[] objectArray3 = new Object[3];
                            objectArray3[2] = l15;
                            objectArray3[1] = lqu2;
                            objectArray3[0] = this;
                            m44.a("w", (Object)lmu2, (Object)objectArray3, (long)-6656114929610942631L, (long)l12);
                            ++n10;
                        }
                        if (callSite2 == false) continue block2;
                    } while (l12 <= 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)-4998457780394246908L, (long)l12);
                }
            }
            lmu2 = lmu3;
        }
        r5 r52 = (r5)((Object)lmu2);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l11;
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = m44.a("w", (Object)this, (Object)objectArray4, (long)-5132729226861876411L, (long)l12);
        objectArray5[0] = l10;
        m44.a("w", (Object)r52, (Object)objectArray5, (long)-4956867482493701791L, (long)l12);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    lth.a = prr.a(370530529213863127L, 4561042637280557568L, MethodHandles.lookup().lookupClass()).a(196848809297498L);
                    var16 = lth.a ^ 140102801191628L;
                    var18_1 = var16 ^ 41986014078274L;
                    var8_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var16 >>> 56);
                    for (var9_3 = 1; var9_3 < 8; ++var9_3) {
                        v2 = v2;
                        v2[var9_3] = (byte)(var16 << var9_3 * 8 >>> 56);
                    }
                    var8_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var7_4 = new String[8];
                    var13_5 = 0;
                    var12_6 = "\u0015\u00e4\u008d\u0003p\u00ef~\u00ee\b,tA\u0089f\u00be\u00a3\u00cd\bi5\u00a2\u00ae\\\u00d2|n\bs\u0080 i\u00e4\u0007-:\b3E\u00a4n\u0099\u00a5Wk\b\u00e6d\u0015b\u00b6fQ>";
                    var14_7 = "\u0015\u00e4\u008d\u0003p\u00ef~\u00ee\b,tA\u0089f\u00be\u00a3\u00cd\bi5\u00a2\u00ae\\\u00d2|n\bs\u0080 i\u00e4\u0007-:\b3E\u00a4n\u0099\u00a5Wk\b\u00e6d\u0015b\u00b6fQ>".length();
                    var11_8 = 8;
                    var10_9 = -1;
lbl21:
                    // 2 sources

                    while (true) {
                        v3 = ++var10_9;
                        v4 = var12_6.substring(v3, v3 + var11_8);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl26:
                    // 1 sources

                    while (true) {
                        var7_4[var13_5++] = lth.b(var15_10).intern();
                        if ((var10_9 += var11_8) < var14_7) {
                            var11_8 = var12_6.charAt(var10_9);
                            ** continue;
                        }
                        var12_6 = "Q\u00f1\u0014\u00b25\u00940\u00bd\b\u00b2(5\u00ba\u000f\u0086\u009d&";
                        var14_7 = "Q\u00f1\u0014\u00b25\u00940\u00bd\b\u00b2(5\u00ba\u000f\u0086\u009d&".length();
                        var11_8 = 8;
                        var10_9 = -1;
lbl35:
                        // 2 sources

                        while (true) {
                            v6 = ++var10_9;
                            v4 = var12_6.substring(v6, v6 + var11_8);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl40:
                    // 1 sources

                    while (true) {
                        var7_4[var13_5++] = lth.b(var15_10).intern();
                        if ((var10_9 += var11_8) < var14_7) {
                            var11_8 = var12_6.charAt(var10_9);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var15_10 = var8_2.doFinal(v4.getBytes("ISO-8859-1"));
                switch (v5) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl52:
                    // 1 sources

                    ** continue;
                }
            }
            var2_11 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var16 >>> 56);
            for (var3_12 = 1; var3_12 < 8; ++var3_12) {
                v9 = v9;
                v9[var3_12] = (byte)(var16 << var3_12 * 8 >>> 56);
            }
            break block14;
lbl64:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_11.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var4_14 = 7765628888736268097L;
        var6_15 = var2_11.doFinal(new byte[]{(byte)(var4_14 >>> 56), (byte)(var4_14 >>> 48), (byte)(var4_14 >>> 40), (byte)(var4_14 >>> 32), (byte)(var4_14 >>> 24), (byte)(var4_14 >>> 16), (byte)(var4_14 >>> 8), (byte)var4_14});
        ** while (true)
        var0_13 = ((long)var6_15[0] & 255L) << 56 | ((long)var6_15[1] & 255L) << 48 | ((long)var6_15[2] & 255L) << 40 | ((long)var6_15[3] & 255L) << 32 | ((long)var6_15[4] & 255L) << 24 | ((long)var6_15[5] & 255L) << 16 | ((long)var6_15[6] & 255L) << 8 | (long)var6_15[7] & 255L;
        v10 = new Object[2];
        v10[1] = var18_1;
        v10[0] = (int)var0_13;
        lth.h = m44.a("h", (Object)v10, (long)-2196795617884543901L, (long)var16);
        m44.a("l", (long)-2278452853562207489L, (long)var16).put(var7_4[5], "B");
        m44.a("l", (long)-2278452853562207489L, (long)var16).put(var7_4[7], "C");
        m44.a("l", (long)-2278452853562207489L, (long)var16).put(var7_4[1], "D");
        m44.a("l", (long)-2278452853562207489L, (long)var16).put(var7_4[6], "F");
        m44.a("l", (long)-2278452853562207489L, (long)var16).put(var7_4[0], "I");
        m44.a("l", (long)-2278452853562207489L, (long)var16).put(var7_4[2], "J");
        m44.a("l", (long)-2278452853562207489L, (long)var16).put(var7_4[3], "S");
        m44.a("l", (long)-2278452853562207489L, (long)var16).put(var7_4[4], "Z");
    }

    public String K(Object[] objectArray) {
        String string;
        block32: {
            StringBuffer stringBuffer;
            block26: {
                int n10;
                CallSite callSite;
                int n11;
                long l10;
                block28: {
                    int n12;
                    block27: {
                        block29: {
                            block30: {
                                block25: {
                                    int n13;
                                    l10 = (Long)objectArray[0];
                                    l10 = a ^ l10;
                                    stringBuffer = new StringBuffer();
                                    n11 = ((ArrayList)((Object)m44.a("t", (Object)this, (long)-4185689951304592148L, (long)l10))).size();
                                    callSite = m44.a("j", (long)-2629378140976161980L, (long)l10);
                                    try {
                                        n13 = n11;
                                        if (callSite == false) break block25;
                                        if (n13 == 0) break block26;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("j", (Object)n92, (long)-2869982639685869682L, (long)l10);
                                    }
                                    n13 = n10 = 0;
                                }
                                block18: while (n10 < m44.a("t", (Object)this, (long)-2455902753462311452L, (long)l10)) {
                                    try {
                                        stringBuffer.append("[");
                                        ++n10;
                                        do {
                                            CallSite callSite2 = callSite;
                                            if (l10 >= 0L) {
                                                if (callSite2 == false) break block27;
                                                callSite2 = callSite;
                                            }
                                            if (callSite2 != false) continue block18;
                                        } while (l10 <= 0L);
                                        break;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("j", (Object)n93, (long)-2869982639685869682L, (long)l10);
                                    }
                                }
                                try {
                                    n12 = n11;
                                    Object object = callSite;
                                    if (l10 >= 0L) {
                                        if (object == false) break block28;
                                        object = true;
                                    }
                                    if (n12 != object) break block29;
                                }
                                catch (n9 n94) {
                                    throw m44.a("j", (Object)n94, (long)-2869982639685869682L, (long)l10);
                                }
                                String string2 = (String)((ArrayList)((Object)m44.a("t", (Object)this, (long)-4185689951304592148L, (long)l10))).get(0);
                                String string3 = (String)m44.a("n", (long)-2692218725998122947L, (long)l10).get(string2);
                                try {
                                    block31: {
                                        try {
                                            try {
                                                if (callSite == false) break block30;
                                                if (string3 == null) break block31;
                                            }
                                            catch (n9 n95) {
                                                throw m44.a("j", (Object)n95, (long)-2869982639685869682L, (long)l10);
                                            }
                                            stringBuffer.append(string3);
                                            if (callSite != false) break block26;
                                        }
                                        catch (n9 n96) {
                                            throw m44.a("j", (Object)n96, (long)-2869982639685869682L, (long)l10);
                                        }
                                    }
                                    stringBuffer.append("L");
                                    stringBuffer.append(string2);
                                }
                                catch (n9 n97) {
                                    throw m44.a("j", (Object)n97, (long)-2869982639685869682L, (long)l10);
                                }
                            }
                            stringBuffer.append(";");
                            break block26;
                        }
                        stringBuffer.append("L");
                    }
                    n12 = n10 = 0;
                }
                block20: while (n10 < n11) {
                    StringBuffer stringBuffer2 = ((ArrayList)((Object)m44.a("t", (Object)this, (long)-4185689951304592148L, (long)l10))).get(n10);
                    do {
                        CallSite callSite3;
                        block33: {
                            block34: {
                                block35: {
                                    String string4;
                                    block36: {
                                        string = (String)((Object)stringBuffer2);
                                        if (l10 < 0L) break block32;
                                        string4 = string;
                                        try {
                                            try {
                                                try {
                                                    if (callSite == false) break block20;
                                                    callSite3 = callSite;
                                                    if (l10 < 0L) break block33;
                                                    if (callSite3 == false) break block34;
                                                }
                                                catch (n9 n98) {
                                                    throw m44.a("j", (Object)n98, (long)-2869982639685869682L, (long)l10);
                                                }
                                                if (l10 < 0L) break block35;
                                                if (n10 <= 0) break block36;
                                            }
                                            catch (n9 n99) {
                                                throw m44.a("j", (Object)n99, (long)-2869982639685869682L, (long)l10);
                                            }
                                            stringBuffer.append("/");
                                        }
                                        catch (n9 n910) {
                                            throw m44.a("j", (Object)n910, (long)-2869982639685869682L, (long)l10);
                                        }
                                    }
                                    stringBuffer.append(string4);
                                }
                                ++n10;
                            }
                            callSite3 = callSite;
                        }
                        if (callSite3 != false) continue block20;
                        stringBuffer2 = stringBuffer.append(";");
                    } while (l10 <= 0L);
                }
            }
            string = stringBuffer.toString();
        }
        return string;
    }

    public lth(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x47A757C2217L;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
        m44.a("w", (Object)this, new ArrayList(), (long)4501439366298316669L, (long)l10);
    }

    void n(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        lth lth2 = this;
        m44.a("u", (Object)lth2, (int)(m44.a("w", (Object)lth2, (long)3141754010680185751L, (long)l10) + true), (long)3141754010680185751L, (long)l10);
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
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

