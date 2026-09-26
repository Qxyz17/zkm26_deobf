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
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l = a ^ l;
        ((ArrayList)((Object)m44.a("r", (Object)((Object)this), (long)-7273480704690353654L, (long)l))).add(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void M(Object[] objectArray) {
        lmu lmu2;
        long l;
        long l2;
        long l3;
        block6: {
            lmu lmu3 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            l3 = (Long)objectArray[2];
            long l4 = l3;
            l2 = l4 ^ 0x33799DBBFD99L;
            l = l4 ^ 0x6352E8763037L;
            long l5 = l4 ^ 0x47526B4E5A06L;
            long l6 = l4 ^ 0L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l5;
            CallSite callSite = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l3);
            CallSite callSite2 = m44.a("h", (long)-6823249310977527178L, (long)l3);
            int n = 0;
            block2: while (n < callSite) {
                try {
                    do {
                        if (l3 >= 0L) {
                            lmu2 = this.V(n);
                            if (callSite2 != false) break block6;
                            Object[] objectArray3 = new Object[3];
                            objectArray3[2] = l6;
                            objectArray3[1] = lqu2;
                            objectArray3[0] = this;
                            m44.a("w", (Object)lmu2, (Object)objectArray3, (long)-6656114929610942631L, (long)l3);
                            ++n;
                        }
                        if (callSite2 == false) continue block2;
                    } while (l3 <= 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)-4998457780394246908L, (long)l3);
                }
            }
            lmu2 = lmu3;
        }
        r5 r52 = (r5)lmu2;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l2;
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = m44.a("w", (Object)((Object)this), (Object)objectArray4, (long)-5132729226861876411L, (long)l3);
        objectArray5[0] = l;
        m44.a("w", (Object)r52, (Object)objectArray5, (long)-4956867482493701791L, (long)l3);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    lth.a = prr.a((long)370530529213863127L, (long)4561042637280557568L, MethodHandles.lookup().lookupClass()).a(196848809297498L);
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
                int n;
                CallSite callSite;
                int n2;
                long l;
                block28: {
                    int n3;
                    block27: {
                        block29: {
                            block30: {
                                block25: {
                                    int n4;
                                    l = (Long)objectArray[0];
                                    l = a ^ l;
                                    stringBuffer = new StringBuffer();
                                    n2 = ((ArrayList)((Object)m44.a("t", (Object)((Object)this), (long)-4185689951304592148L, (long)l))).size();
                                    callSite = m44.a("j", (long)-2629378140976161980L, (long)l);
                                    try {
                                        n4 = n2;
                                        if (callSite == false) break block25;
                                        if (n4 == 0) break block26;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("j", (Object)((Object)n92), (long)-2869982639685869682L, (long)l);
                                    }
                                    n4 = n = 0;
                                }
                                block18: while (n < m44.a("t", (Object)((Object)this), (long)-2455902753462311452L, (long)l)) {
                                    try {
                                        stringBuffer.append("[");
                                        ++n;
                                        do {
                                            CallSite callSite2 = callSite;
                                            if (l >= 0L) {
                                                if (callSite2 == false) break block27;
                                                callSite2 = callSite;
                                            }
                                            if (callSite2 != false) continue block18;
                                        } while (l <= 0L);
                                        break;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("j", (Object)((Object)n93), (long)-2869982639685869682L, (long)l);
                                    }
                                }
                                try {
                                    n3 = n2;
                                    Object object = callSite;
                                    if (l >= 0L) {
                                        if (object == false) break block28;
                                        object = true;
                                    }
                                    if (n3 != object) break block29;
                                }
                                catch (n9 n94) {
                                    throw m44.a("j", (Object)((Object)n94), (long)-2869982639685869682L, (long)l);
                                }
                                String string2 = (String)((ArrayList)((Object)m44.a("t", (Object)((Object)this), (long)-4185689951304592148L, (long)l))).get(0);
                                String string3 = (String)m44.a("n", (long)-2692218725998122947L, (long)l).get(string2);
                                try {
                                    block31: {
                                        try {
                                            try {
                                                if (callSite == false) break block30;
                                                if (string3 == null) break block31;
                                            }
                                            catch (n9 n95) {
                                                throw m44.a("j", (Object)((Object)n95), (long)-2869982639685869682L, (long)l);
                                            }
                                            stringBuffer.append(string3);
                                            if (callSite != false) break block26;
                                        }
                                        catch (n9 n96) {
                                            throw m44.a("j", (Object)((Object)n96), (long)-2869982639685869682L, (long)l);
                                        }
                                    }
                                    stringBuffer.append("L");
                                    stringBuffer.append(string2);
                                }
                                catch (n9 n97) {
                                    throw m44.a("j", (Object)((Object)n97), (long)-2869982639685869682L, (long)l);
                                }
                            }
                            stringBuffer.append(";");
                            break block26;
                        }
                        stringBuffer.append("L");
                    }
                    n3 = n = 0;
                }
                block20: while (n < n2) {
                    StringBuffer stringBuffer2 = ((ArrayList)((Object)m44.a("t", (Object)((Object)this), (long)-4185689951304592148L, (long)l))).get(n);
                    do {
                        CallSite callSite3;
                        block33: {
                            block34: {
                                block35: {
                                    String string4;
                                    block36: {
                                        string = (String)((Object)stringBuffer2);
                                        if (l < 0L) break block32;
                                        string4 = string;
                                        try {
                                            try {
                                                try {
                                                    if (callSite == false) break block20;
                                                    callSite3 = callSite;
                                                    if (l < 0L) break block33;
                                                    if (callSite3 == false) break block34;
                                                }
                                                catch (n9 n98) {
                                                    throw m44.a("j", (Object)((Object)n98), (long)-2869982639685869682L, (long)l);
                                                }
                                                if (l < 0L) break block35;
                                                if (n <= 0) break block36;
                                            }
                                            catch (n9 n99) {
                                                throw m44.a("j", (Object)((Object)n99), (long)-2869982639685869682L, (long)l);
                                            }
                                            stringBuffer.append("/");
                                        }
                                        catch (n9 n910) {
                                            throw m44.a("j", (Object)((Object)n910), (long)-2869982639685869682L, (long)l);
                                        }
                                    }
                                    stringBuffer.append(string4);
                                }
                                ++n;
                            }
                            callSite3 = callSite;
                        }
                        if (callSite3 != false) continue block20;
                        stringBuffer2 = stringBuffer.append(";");
                    } while (l <= 0L);
                }
            }
            string = stringBuffer.toString();
        }
        return string;
    }

    public lth(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x47A757C2217L;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
        m44.a("w", (Object)((Object)this), new ArrayList(), (long)4501439366298316669L, (long)l);
    }

    void n(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        lth lth2 = this;
        m44.a("u", (Object)((Object)lth2), (int)(m44.a("w", (Object)((Object)lth2), (long)3141754010680185751L, (long)l) + true), (long)3141754010680185751L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
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
