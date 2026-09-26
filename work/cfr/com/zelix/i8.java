/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.h1;
import com.zelix.hp;
import com.zelix.i_;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.xq;
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

public class i8
extends i_ {
    private int A;
    private static final long a;
    private static final long[] c;
    private static final Integer[] h;
    private static final Map i;

    i8(h1 h12, hp hp2, l6q l6q2, l6q l6q3, l6q l6q4, l6q l6q5, long l10, l6q l6q6) {
        long l11 = (l10 = a ^ l10) ^ 0x13F907FF0AF1L;
        super((int)i8.c("r", (int)27790, (long)(0x2DFC97630341DFECL ^ l10)), h12, hp2, l11, l6q2, l6q3, l6q4, l6q5, l6q6);
        m44.a("w", (Object)this, (int)h12.read(), (long)8448163468726920488L, (long)l10);
        m44.a("t", (Object)h12, (long)1L, (long)8093461465507828877L, (long)l10);
    }

    @Override
    public void H(DataOutputStream dataOutputStream, Map map, long l10) {
        long l11 = l10 ^ 0L;
        super.H(dataOutputStream, map, l11);
        dataOutputStream.writeByte((int)m44.a("v", (Object)this, (long)5469213963879472115L, (long)l10));
        dataOutputStream.writeByte(0);
    }

    @Override
    public String l(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10;
        long l12 = l11 ^ 0x6B9DB85C7821L;
        int n10 = (int)(l12 >>> 48);
        int n11 = (int)(l12 << 16 >>> 32);
        int n12 = (int)(l12 << 48 >>> 48);
        long l13 = l11 ^ 0x3926A82327E7L;
        int n13 = (int)(l13 >>> 32);
        int n14 = (int)(l13 << 32 >>> 56);
        int n15 = (int)(l13 << 40 >>> 40);
        StringBuilder stringBuilder = new StringBuilder();
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n15;
        objectArray2[1] = (int)((byte)n14);
        objectArray2[0] = n13;
        stringBuilder.append((String)((Object)m44.a("s", (Object)this, (Object)objectArray2, (long)-7550383759637692338L, (long)l10)));
        stringBuilder.append((char)i8.c("r", (int)2274, (long)(0x608843C447AE5E0CL ^ l10)));
        stringBuilder.append((String)((Object)m44.a("s", (Object)this.k, (char)((char)n10), (int)n11, (short)((short)n12), (long)-7853083534666706113L, (long)l10)));
        return stringBuilder.toString();
    }

    @Override
    public void G(short s10, int n10, DataOutputStream dataOutputStream, int n11) {
        long l10 = (long)s10 << 48 | (long)n10 << 32 >>> 16 | (long)n11 << 48 >>> 48;
        long l11 = l10 ^ 0L;
        int n12 = (int)(l11 >>> 48);
        int n13 = (int)(l11 << 16 >>> 32);
        int n14 = (int)(l11 << 48 >>> 48);
        super.G((short)n12, n13, dataOutputStream, n14);
        dataOutputStream.writeByte((int)m44.a("s", (Object)this, (long)1795790913073776894L, (long)l10));
        dataOutputStream.writeByte(0);
    }

    public i8(xq xq2, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x751CF36222EDL;
        super((int)i8.c("r", (int)5727, (long)(0x3C45AC342AFB1BDAL ^ l10)), xq2);
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        m44.a("q", (Object)this, (int)(m44.a("r", (Object)xq2, (Object)objectArray, (long)-3016519799646573675L, (long)l10) + true), (long)-3757250860252734514L, (long)l10);
    }

    public void I(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        l10 = a ^ l10;
        m44.a("u", (Object)this, (int)n10, (long)-121415078776854L, (long)l10);
    }

    @Override
    public int T(char c10, int n10, char c11) {
        return 5;
    }

    @Override
    public void h(Object[] objectArray) {
        block4: {
            StringBuilder stringBuilder;
            StringBuilder stringBuilder2;
            PrintWriter printWriter;
            block5: {
                long l10 = (Long)objectArray[0];
                printWriter = (PrintWriter)objectArray[1];
                stringBuilder2 = (StringBuilder)objectArray[2];
                long l11 = l10;
                long l12 = l11 ^ 0x5D3C6484BBF6L;
                long l13 = l11 ^ 0x7B7D8DE1E476L;
                long l14 = l11 ^ 0x5A121519183DL;
                int n10 = (int)(l14 >>> 48);
                int n11 = (int)(l14 << 16 >>> 32);
                int n12 = (int)(l14 << 48 >>> 48);
                long l15 = l11 ^ 0x8A9056647FBL;
                int n13 = (int)(l15 >>> 32);
                int n14 = (int)(l15 << 32 >>> 56);
                int n15 = (int)(l15 << 40 >>> 40);
                CallSite callSite = m44.a("h", (long)-1155528826364025814L, (long)l10);
                stringBuilder = new StringBuilder((int)i8.c("r", (int)9249, (long)(0x6C347DBCB8B012D2L ^ l10)));
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = n15;
                objectArray2[1] = (int)((byte)n14);
                objectArray2[0] = n13;
                CallSite callSite2 = m44.a("w", (Object)this, (Object)objectArray2, (long)-636251684499120046L, (long)l10);
                stringBuilder.append((String)((Object)callSite2) + " " + this.k.E() + " " + (int)m44.a("v", (Object)this, (long)-1103673281496096581L, (long)l10) + " " + 0);
                CallSite callSite3 = callSite;
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = this.X;
                objectArray3[0] = l13;
                CallSite callSite4 = m44.a("h", (Object)objectArray3, (long)-1509257710096725591L, (long)l10);
                Object[] objectArray4 = new Object[3];
                objectArray4[2] = m44.a("w", (Object)this.k, (char)((char)n10), (int)n11, (short)((short)n12), (long)-929976081543482589L, (long)l10);
                objectArray4[1] = callSite4;
                objectArray4[0] = l12;
                callSite4 = m44.a("h", (Object)objectArray4, (long)-1214410100789358428L, (long)l10);
                Object[] objectArray5 = new Object[3];
                objectArray5[2] = m44.a("h", (int)m44.a("v", (Object)this, (long)-1103673281496096581L, (long)l10), (long)-1207627958331833678L, (long)l10);
                objectArray5[1] = callSite4;
                objectArray5[0] = l12;
                callSite4 = m44.a("h", (Object)objectArray5, (long)-1214410100789358428L, (long)l10);
                try {
                    try {
                        if (callSite3 == false) break block4;
                        if (((String)((Object)callSite4)).length() <= 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-962822514567315706L, (long)l10);
                    }
                    stringBuilder.append("\t" + (String)((Object)callSite4));
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-962822514567315706L, (long)l10);
                }
            }
            printWriter.println(stringBuilder2.toString() + stringBuilder2.toString() + stringBuilder);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                i8.a = prr.a(-9025028060472100967L, -2770608637772460055L, MethodHandles.lookup().lookupClass()).a(156846886315780L);
                i8.i = new HashMap<K, V>(13);
                var0 = i8.a ^ 55142323336805L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "\u00f0\u00a8\u0098\u00b7\u0094\u00a3\u00fde\u0019P\u00bf\u0083\u0089B\u008f\u00ec";
                var7_6 = "\u00f0\u00a8\u0098\u00b7\u0094\u00a3\u00fde\u0019P\u00bf\u0083\u0089B\u008f\u00ec".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "+\u00c9a\u0089d\u00a1k\u00f2*\u00c8E\u00c1&\u0013\u0001a";
                    var7_6 = "+\u00c9a\u0089d\u00a1k\u00f2*\u00c8E\u00c1&\u0013\u0001a".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        i8.c = var8_3;
        i8.h = new Integer[4];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x506E;
        if (h[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = c[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/i8", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            i8.h[n11] = n12;
        }
        return h[n11];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = i8.c(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/i8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(i8.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

