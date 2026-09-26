/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.h1;
import com.zelix.hp;
import com.zelix.i_;
import com.zelix.jd;
import com.zelix.js;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.io.DataOutputStream;
import java.io.PrintWriter;
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

public class il
extends i_ {
    private static final long a;
    private static final String[] c;
    private static final String[] h;
    private static final Map i;
    private static final long[] u;
    private static final Integer[] v;
    private static final Map w;
    private static final long x;

    @Override
    public String l(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x3926A82327E7L;
        int n10 = (int)(l11 >>> 32);
        int n11 = (int)(l11 << 32 >>> 56);
        int n12 = (int)(l11 << 40 >>> 40);
        StringBuilder stringBuilder = new StringBuilder();
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n12;
        objectArray2[1] = (int)((byte)n11);
        objectArray2[0] = n10;
        stringBuilder.append((String)((Object)m44.a("s", (Object)this, (Object)objectArray2, (long)-7550383759637692338L, (long)l10)));
        stringBuilder.append((char)il.f("g", (int)16071, (long)(0x6F7CF1F65FC80C13L ^ l10)));
        jd jd2 = (jd)this.k;
        stringBuilder.append(jd2.E());
        return stringBuilder.toString();
    }

    @Override
    public js s(long l10) {
        return m44.a("u", (Object)this, (Object)new Object[0], (long)8612250821515315784L, (long)l10);
    }

    il(long l10, char c10, h1 h12, hp hp2, l6q l6q2, l6q l6q3, l6q l6q4, l6q l6q5, l6q l6q6, l6q l6q7) {
        long l11;
        long l12 = l11 = (l10 << 16 | (long)c10 << 48 >>> 48) ^ a;
        long l13 = l12 ^ 0x5291F1B338F4L;
        long l14 = l12 ^ 0x332910C72C01L;
        super((int)il.f("g", (int)14167, (long)(0x261C1295D281D208L ^ l11)), h12, hp2, l13, l6q2, l6q3, l6q4, l6q5, l6q6);
        m44.a("q", (Object)h12, (long)x, (long)4779587193081702024L, (long)l11);
        l6q7.t((jd)this.k, this, l14);
    }

    public jd y(Object[] objectArray) {
        return (jd)this.k;
    }

    @Override
    public void h(Object[] objectArray) {
        block28: {
            boolean bl2;
            long l10;
            block30: {
                block29: {
                    CallSite callSite;
                    block26: {
                        StringBuilder stringBuilder;
                        StringBuilder stringBuilder2;
                        PrintWriter printWriter;
                        block27: {
                            CallSite callSite2;
                            CallSite callSite3;
                            CallSite callSite4;
                            long l11;
                            block33: {
                                block23: {
                                    block25: {
                                        CallSite callSite5;
                                        long l12;
                                        block24: {
                                            jd jd2;
                                            jd jd3;
                                            long l13;
                                            block22: {
                                                CallSite callSite6;
                                                CallSite callSite7;
                                                block32: {
                                                    block21: {
                                                        jd jd4;
                                                        long l14;
                                                        block20: {
                                                            Object object;
                                                            StringBuilder stringBuilder3;
                                                            StringBuilder stringBuilder4;
                                                            long l15;
                                                            block31: {
                                                                block19: {
                                                                    jd jd5;
                                                                    block18: {
                                                                        l10 = (Long)objectArray[0];
                                                                        printWriter = (PrintWriter)objectArray[1];
                                                                        stringBuilder2 = (StringBuilder)objectArray[2];
                                                                        long l16 = l10;
                                                                        l14 = l16 ^ 0x36B10DA430F6L;
                                                                        l11 = l16 ^ 0x5D3C6484BBF6L;
                                                                        l15 = l16 ^ 0x7B7D8DE1E476L;
                                                                        l12 = l16 ^ 0x570BE2FCBF86L;
                                                                        long l17 = l16 ^ 0x8A9056647FBL;
                                                                        int n10 = (int)(l17 >>> 32);
                                                                        int n11 = (int)(l17 << 32 >>> 56);
                                                                        int n12 = (int)(l17 << 40 >>> 40);
                                                                        l13 = l16 ^ 0x4BF8B53BC2DDL;
                                                                        stringBuilder = new StringBuilder((int)il.f("g", (int)18471, (long)(0x16AFE812276A9AECL ^ l10)));
                                                                        callSite = m44.a("h", (long)-1155528826364025814L, (long)l10);
                                                                        Object[] objectArray2 = new Object[3];
                                                                        objectArray2[2] = n12;
                                                                        objectArray2[1] = (int)((byte)n11);
                                                                        objectArray2[0] = n10;
                                                                        CallSite callSite8 = m44.a("w", (Object)this, (Object)objectArray2, (long)-636251684499120046L, (long)l10);
                                                                        jd3 = (jd)this.k;
                                                                        try {
                                                                            stringBuilder4 = stringBuilder;
                                                                            stringBuilder3 = new StringBuilder().append((String)((Object)callSite8)).append(" ");
                                                                            jd5 = jd3;
                                                                            if (callSite == false) break block18;
                                                                            if (jd5 == null) break block19;
                                                                        }
                                                                        catch (n9 n92) {
                                                                            throw m44.a("h", (Object)n92, (long)-1222386364034213810L, (long)l10);
                                                                        }
                                                                        jd5 = jd3;
                                                                    }
                                                                    object = jd5.E();
                                                                    break block31;
                                                                }
                                                                object = il.c("t", (int)1428, (long)(0x6AECB76FE0A15C18L ^ l10));
                                                            }
                                                            stringBuilder4.append(stringBuilder3.append(object).toString());
                                                            Object[] objectArray3 = new Object[2];
                                                            objectArray3[1] = this.X;
                                                            objectArray3[0] = l15;
                                                            callSite4 = m44.a("h", (Object)objectArray3, (long)-1509257710096725591L, (long)l10);
                                                            try {
                                                                callSite7 = callSite4;
                                                                jd4 = jd3;
                                                                if (callSite == false) break block20;
                                                                if (jd4 == null) break block21;
                                                            }
                                                            catch (n9 n93) {
                                                                throw m44.a("h", (Object)n93, (long)-1222386364034213810L, (long)l10);
                                                            }
                                                            jd4 = jd3;
                                                        }
                                                        Object[] objectArray4 = new Object[1];
                                                        objectArray4[0] = l14;
                                                        callSite6 = m44.a("w", (Object)jd4, (Object)objectArray4, (long)-789265656069189038L, (long)l10);
                                                        break block32;
                                                    }
                                                    callSite6 = il.c("t", (int)15290, (long)(0xDE1318E7E06237L ^ l10));
                                                }
                                                Object[] objectArray5 = new Object[3];
                                                objectArray5[2] = callSite6;
                                                objectArray5[1] = callSite7;
                                                objectArray5[0] = l11;
                                                callSite4 = m44.a("h", (Object)objectArray5, (long)-1214410100789358428L, (long)l10);
                                                try {
                                                    callSite3 = callSite4;
                                                    jd2 = jd3;
                                                    if (l10 <= 0L || callSite == false) break block22;
                                                    if (jd2 == null) break block23;
                                                }
                                                catch (n9 n94) {
                                                    throw m44.a("h", (Object)n94, (long)-1222386364034213810L, (long)l10);
                                                }
                                                jd2 = jd3;
                                            }
                                            try {
                                                try {
                                                    Object[] objectArray6 = new Object[1];
                                                    objectArray6[0] = l13;
                                                    callSite5 = m44.a("w", (Object)jd2, (Object)objectArray6, (long)-1543016830573327319L, (long)l10);
                                                    if (callSite == false) break block24;
                                                    if (callSite5 == null) break block25;
                                                }
                                                catch (n9 n95) {
                                                    throw m44.a("h", (Object)n95, (long)-1222386364034213810L, (long)l10);
                                                }
                                                Object[] objectArray7 = new Object[1];
                                                objectArray7[0] = l13;
                                                callSite5 = m44.a("w", (Object)jd3, (Object)objectArray7, (long)-1543016830573327319L, (long)l10);
                                            }
                                            catch (n9 n96) {
                                                throw m44.a("h", (Object)n96, (long)-1222386364034213810L, (long)l10);
                                            }
                                        }
                                        Object[] objectArray8 = new Object[1];
                                        objectArray8[0] = l12;
                                        callSite2 = m44.a("w", (Object)callSite5, (Object)objectArray8, (long)-675070252917617196L, (long)l10);
                                        break block33;
                                    }
                                    callSite2 = il.c("t", (int)15290, (long)(0xDE1318E7E06237L ^ l10));
                                    break block33;
                                }
                                callSite2 = il.c("t", (int)15290, (long)(0xDE1318E7E06237L ^ l10));
                            }
                            Object[] objectArray9 = new Object[3];
                            objectArray9[2] = callSite2;
                            objectArray9[1] = callSite3;
                            objectArray9[0] = l11;
                            callSite4 = m44.a("h", (Object)objectArray9, (long)-1214410100789358428L, (long)l10);
                            try {
                                try {
                                    if (l10 < 0L || callSite == false) break block26;
                                    if (((String)((Object)callSite4)).length() <= 0) break block27;
                                }
                                catch (n9 n97) {
                                    throw m44.a("h", (Object)n97, (long)-1222386364034213810L, (long)l10);
                                }
                                stringBuilder.append("\t" + (String)((Object)callSite4));
                            }
                            catch (n9 n98) {
                                throw m44.a("h", (Object)n98, (long)-1222386364034213810L, (long)l10);
                            }
                        }
                        printWriter.println(stringBuilder2.toString() + stringBuilder2.toString() + stringBuilder);
                    }
                    try {
                        try {
                            if (m44.a("h", (long)-778813723462939640L, (long)l10) != null) break block28;
                            if (callSite == false) break block29;
                        }
                        catch (n9 n99) {
                            throw m44.a("h", (Object)n99, (long)-1222386364034213810L, (long)l10);
                        }
                        bl2 = false;
                        break block30;
                    }
                    catch (n9 n910) {
                        throw m44.a("h", (Object)n910, (long)-1222386364034213810L, (long)l10);
                    }
                }
                bl2 = true;
            }
            m44.a("h", (boolean)bl2, (long)-641505786945932695L, (long)l10);
        }
    }

    @Override
    public int T(char c10, int n10, char c11) {
        return 5;
    }

    @Override
    public void G(short s10, int n10, DataOutputStream dataOutputStream, int n11) {
        long l10 = (long)s10 << 48 | (long)n10 << 32 >>> 16 | (long)n11 << 48 >>> 48;
        long l11 = l10 ^ 0L;
        int n12 = (int)(l11 >>> 48);
        int n13 = (int)(l11 << 16 >>> 32);
        int n14 = (int)(l11 << 48 >>> 48);
        super.G((short)n12, n13, dataOutputStream, n14);
        dataOutputStream.writeShort(0);
    }

    public il(int n10, jd jd2, int n11, char c10) {
        long l10 = ((long)n10 << 32 | (long)n11 << 48 >>> 32 | (long)c10 << 48 >>> 48) ^ a;
        super((int)il.f("g", (int)32690, (long)(0x2A4208AEB7C189E9L ^ l10)), jd2);
    }

    @Override
    public void H(DataOutputStream dataOutputStream, Map map, long l10) {
        long l11 = l10 ^ 0L;
        super.H(dataOutputStream, map, l11);
        dataOutputStream.writeShort(0);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block16: {
                block15: {
                    block14: {
                        il.a = prr.a(2721235229186337464L, -5248909922466808427L, MethodHandles.lookup().lookupClass()).a(188385493371966L);
                        il.i = new HashMap<K, V>(13);
                        var16 = il.a ^ 6118425986814L;
                        var18_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var16 >>> 56);
                        for (var19_2 = 1; var19_2 < 8; ++var19_2) {
                            v2 = v2;
                            v2[var19_2] = (byte)(var16 << var19_2 * 8 >>> 56);
                        }
                        var18_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var25_3 = new String[2];
                        var23_4 = 0;
                        var22_5 = "\u00a0n.\u00c3\u00101b\"h\u00e4w\u00c1\u0088\u00ba\u00c60\u0010\u00d5\u00e9\u00fa\u00d7\u00be\u0014\u00d0\u0095\u0012mj\n\u0088;el";
                        var24_6 = "\u00a0n.\u00c3\u00101b\"h\u00e4w\u00c1\u0088\u00ba\u00c60\u0010\u00d5\u00e9\u00fa\u00d7\u00be\u0014\u00d0\u0095\u0012mj\n\u0088;el".length();
                        var21_7 = 16;
                        var20_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl22:
                        // 1 sources

                        while (true) {
                            var25_3[var23_4++] = il.c(var26_9).intern();
                            if ((var20_8 += var21_7) < var24_6) {
                                var21_7 = var22_5.charAt(var20_8);
                                ** continue;
                            }
                            break block14;
                            break;
                        }
                        v3 = ++var20_8;
                        var26_9 = var18_1.doFinal(var22_5.substring(v3, v3 + var21_7).getBytes("ISO-8859-1"));
                        ** while (true)
                    }
                    il.c = var25_3;
                    il.h = new String[2];
                    il.w = new HashMap<K, V>(13);
                    var5_10 = Cipher.getInstance("DES/CBC/NoPadding");
                    v4 = SecretKeyFactory.getInstance("DES");
                    v5 = new byte[8];
                    v6 = v5;
                    v5[0] = (byte)(var16 >>> 56);
                    for (var6_11 = 1; var6_11 < 8; ++var6_11) {
                        v6 = v6;
                        v6[var6_11] = (byte)(var16 << var6_11 * 8 >>> 56);
                    }
                    var5_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                    var11_12 = new long[4];
                    var8_13 = 0;
                    var9_14 = "\u00ddV\u00b0(\u00a9\u00a1m\b\u008e\u00c5\u00e6\u00a4\u00ba\u00a0\u001eC";
                    var10_15 = "\u00ddV\u00b0(\u00a9\u00a1m\b\u008e\u00c5\u00e6\u00a4\u00ba\u00a0\u001eC".length();
                    var7_16 = 0;
                    while (true) {
                        var12_17 = var9_14.substring(var7_16, var7_16 += 8).getBytes("ISO-8859-1");
                        v7 = var11_12;
                        v8 = var8_13++;
                        v9 = ((long)var12_17[0] & 255L) << 56 | ((long)var12_17[1] & 255L) << 48 | ((long)var12_17[2] & 255L) << 40 | ((long)var12_17[3] & 255L) << 32 | ((long)var12_17[4] & 255L) << 24 | ((long)var12_17[5] & 255L) << 16 | ((long)var12_17[6] & 255L) << 8 | (long)var12_17[7] & 255L;
                        v10 = -1;
                        break block15;
                        break;
                    }
lbl58:
                    // 1 sources

                    while (true) {
                        v7[v8] = v11;
                        if (var7_16 < var10_15) ** continue;
                        var9_14 = "\f\u00cf\u00fb&0\u0084\u0086\u00e79\u00f8\u00cdKa}\u0092@";
                        var10_15 = "\f\u00cf\u00fb&0\u0084\u0086\u00e79\u00f8\u00cdKa}\u0092@".length();
                        var7_16 = 0;
                        while (true) {
                            var12_17 = var9_14.substring(var7_16, var7_16 += 8).getBytes("ISO-8859-1");
                            v7 = var11_12;
                            v8 = var8_13++;
                            v9 = ((long)var12_17[0] & 255L) << 56 | ((long)var12_17[1] & 255L) << 48 | ((long)var12_17[2] & 255L) << 40 | ((long)var12_17[3] & 255L) << 32 | ((long)var12_17[4] & 255L) << 24 | ((long)var12_17[5] & 255L) << 16 | ((long)var12_17[6] & 255L) << 8 | (long)var12_17[7] & 255L;
                            v10 = 0;
                            break block15;
                            break;
                        }
                        break;
                    }
lbl71:
                    // 1 sources

                    while (true) {
                        v7[v8] = v11;
                        if (var7_16 < var10_15) ** continue;
                        break block16;
                        break;
                    }
                }
                var13_18 = v9;
                var15_19 = var5_10.doFinal(new byte[]{(byte)(var13_18 >>> 56), (byte)(var13_18 >>> 48), (byte)(var13_18 >>> 40), (byte)(var13_18 >>> 32), (byte)(var13_18 >>> 24), (byte)(var13_18 >>> 16), (byte)(var13_18 >>> 8), (byte)var13_18});
                v11 = ((long)var15_19[0] & 255L) << 56 | ((long)var15_19[1] & 255L) << 48 | ((long)var15_19[2] & 255L) << 40 | ((long)var15_19[3] & 255L) << 32 | ((long)var15_19[4] & 255L) << 24 | ((long)var15_19[5] & 255L) << 16 | ((long)var15_19[6] & 255L) << 8 | (long)var15_19[7] & 255L;
                switch (v10) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl84:
                    // 1 sources

                    ** continue;
                }
            }
            il.u = var11_12;
            il.v = new Integer[4];
            var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
            v12 = SecretKeyFactory.getInstance("DES");
            v13 = new byte[8];
            v14 = v13;
            v13[0] = (byte)(var16 >>> 56);
            for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                v14 = v14;
                v14[var1_21] = (byte)(var16 << var1_21 * 8 >>> 56);
            }
            break block17;
lbl98:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_20.init(2, (Key)v12.generateSecret(new DESKeySpec(v14)), new IvParameterSpec(new byte[8]));
        var2_22 = -8002997881306594426L;
        var4_23 = var0_20.doFinal(new byte[]{(byte)(var2_22 >>> 56), (byte)(var2_22 >>> 48), (byte)(var2_22 >>> 40), (byte)(var2_22 >>> 32), (byte)(var2_22 >>> 24), (byte)(var2_22 >>> 16), (byte)(var2_22 >>> 8), (byte)var2_22});
        ** while (true)
        il.x = ((long)var4_23[0] & 255L) << 56 | ((long)var4_23[1] & 255L) << 48 | ((long)var4_23[2] & 255L) << 40 | ((long)var4_23[3] & 255L) << 32 | ((long)var4_23[4] & 255L) << 24 | ((long)var4_23[5] & 255L) << 16 | ((long)var4_23[6] & 255L) << 8 | (long)var4_23[7] & 255L;
    }

    private static n9 a(n9 n92) {
        return n92;
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

    private static String c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3F12;
        if (h[n11] == null) {
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
                throw new RuntimeException("com/zelix/il", exception);
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
            il.h[n11] = il.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n11];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = il.c(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/il" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int f(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3454;
        if (v[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = u[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])w.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    w.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/il", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            il.v[n11] = n12;
        }
        return v[n11];
    }

    private static int f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = il.f(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/il" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(il.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(il.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

