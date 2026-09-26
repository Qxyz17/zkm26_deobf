/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.lbt;
import com.zelix.lkx;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lwr;
import com.zelix.m44;
import com.zelix.mn;
import com.zelix.n9;
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

public abstract class l7w
extends l7t
implements lbt {
    private String k;
    private final boolean J;
    private String A;
    private String e;
    private static final long a;
    private static final long[] d;
    private static final Integer[] f;
    private static final Map g;

    private String h(Object[] objectArray) {
        CallSite callSite;
        Object object;
        long l10;
        block3: {
            block4: {
                l10 = (Long)objectArray[0];
                String string = (String)objectArray[1];
                l10 = a ^ l10;
                object = string.replace((char)l7w.a("s", (int)25913, (long)(0x2A6CCF4542038891L ^ l10)), (char)l7w.a("s", (int)19884, (long)(0x4AA986DD69682006L ^ l10)));
                CallSite callSite2 = m44.a("k", (long)-6186281838819706595L, (long)l10);
                try {
                    callSite = m44.a("o", (long)-5930069374236654288L, (long)l10);
                    if (callSite2 != false) break block3;
                    if (callSite == l7w.a("s", (int)13398, (long)(0x7BC0C1243CB959FFL ^ l10))) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("k", (Object)n92, (long)-5360434365977133965L, (long)l10);
                }
                object = string.replace((char)m44.a("o", (long)-5930069374236654288L, (long)l10), (char)l7w.a("s", (int)19884, (long)(0x4AA986DD69682006L ^ l10)));
            }
            callSite = m44.a("o", (long)-6087106735014905782L, (long)l10);
        }
        if (callSite == false) {
            object = m44.a("t", (Object)object, (long)-5631924772392608076L, (long)l10);
        }
        return object;
    }

    @Override
    public String p(Object[] objectArray) {
        String string;
        StringBuilder stringBuilder;
        long l10 = (Long)objectArray[0];
        try {
            stringBuilder = new StringBuilder();
            string = m44.a("p", (Object)this, (long)8139890231353069683L, (long)l10) != false ? "!" : "";
        }
        catch (n9 n92) {
            throw m44.a("n", (Object)n92, (long)7986757125074134846L, (long)l10);
        }
        return stringBuilder.append(string).append("\"").append((String)((Object)m44.a("p", (Object)this, (long)7985723180093741553L, (long)l10))).append("\"").toString();
    }

    @Override
    public final void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0x518E6651348FL;
        long l13 = l11 ^ 0x36230D9FA4F8L;
        long l14 = l11 ^ 0x6E2A80000718L;
        long l15 = l11 ^ 0x47526B4E5A06L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l15;
        CallSite callSite = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l10);
        lwr lwr2 = (lwr)this.V(0);
        m44.a("t", (Object)this, (String)((Object)m44.a("w", (Object)lwr2, (Object)new Object[0], (long)-4968184746715213117L, (long)l10)), (long)-4686937243768927785L, (long)l10);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = m44.a("v", (Object)this, (long)-4686937243768927785L, (long)l10);
        objectArray3[0] = l13;
        CallSite callSite2 = m44.a("i", (Object)this, (Object)objectArray3, (long)-4951574545322784467L, (long)l10);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l14;
        objectArray4[0] = callSite2;
        CallSite callSite3 = m44.a("h", (Object)objectArray4, (long)-6573103780832126586L, (long)l10);
        m44.a("t", (Object)this, (String)((String)((Object)callSite2)).substring(0, (int)(callSite3 + true)), (long)-4973176016200566200L, (long)l10);
        m44.a("t", (Object)this, (String)("*" + (String)((Object)m44.a("v", (Object)this, (long)-4973176016200566200L, (long)l10))), (long)-4973176016200566200L, (long)l10);
        m44.a("t", (Object)this, (String)((String)((Object)callSite2)).substring((int)(callSite3 + true)), (long)-6351565050268560858L, (long)l10);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l12;
        objectArray5[0] = this;
        m44.a("w", (Object)((lkx)((Object)lmu2)), (Object)objectArray5, (long)-6817564929646714496L, (long)l10);
    }

    private static int G(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        int n10 = string.lastIndexOf((int)l7w.a("s", (int)3308, (long)(0xF8B1206F5E5C2A7L ^ l10)));
        int n11 = string.lastIndexOf("!");
        return Math.max(n10, n11);
    }

    public l7w(int n10, boolean bl2, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x6F3763BD6A7L;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
        this.J = bl2;
    }

    @Override
    public boolean e(Object[] objectArray) {
        Object object;
        block16: {
            boolean bl2;
            block17: {
                boolean bl3;
                block18: {
                    block19: {
                        boolean bl4;
                        CallSite callSite;
                        long l10;
                        block15: {
                            block14: {
                                block13: {
                                    String string = (String)objectArray[0];
                                    l10 = (Long)objectArray[1];
                                    long l11 = l10;
                                    long l12 = l11 ^ 0x7086B3B13330L;
                                    long l13 = l11 ^ 0x288F3E2E90D0L;
                                    long l14 = l11 ^ 0x63BF80BA626BL;
                                    Object[] objectArray2 = new Object[2];
                                    objectArray2[1] = string;
                                    objectArray2[0] = l12;
                                    CallSite callSite2 = m44.a("i", (Object)this, (Object)objectArray2, (long)3206632797649624805L, (long)l10);
                                    Object[] objectArray3 = new Object[2];
                                    objectArray3[1] = l13;
                                    objectArray3[0] = callSite2;
                                    CallSite callSite3 = m44.a("h", (Object)objectArray3, (long)3679408229543562830L, (long)l10);
                                    String string2 = ((String)((Object)callSite2)).substring((int)(callSite3 + true));
                                    String string3 = ((String)((Object)callSite2)).substring(0, (int)(callSite3 + true));
                                    callSite = m44.a("h", (long)3368966272689810950L, (long)l10);
                                    try {
                                        try {
                                            bl4 = mn.R(string3, l14, (String)((Object)m44.a("v", (Object)this, (long)3257224473135410560L, (long)l10)));
                                            if (callSite == false) break block13;
                                            if (bl4) {
                                            }
                                            break block14;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("h", (Object)n92, (long)2970322327146750160L, (long)l10);
                                        }
                                        bl4 = mn.R(string2, l14, (String)((Object)m44.a("v", (Object)this, (long)3464098900193461742L, (long)l10)));
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("h", (Object)n93, (long)2970322327146750160L, (long)l10);
                                    }
                                }
                                try {
                                    if (callSite == false) break block15;
                                    if (!bl4) break block14;
                                }
                                catch (n9 n94) {
                                    throw m44.a("h", (Object)n94, (long)2970322327146750160L, (long)l10);
                                }
                                bl4 = true;
                                break block15;
                            }
                            bl4 = false;
                        }
                        bl2 = bl4;
                        try {
                            try {
                                try {
                                    object = m44.a("v", (Object)this, (long)3970114561517524893L, (long)l10);
                                    if (callSite == false) break block16;
                                    if (object == false) break block17;
                                }
                                catch (n9 n95) {
                                    throw m44.a("h", (Object)n95, (long)2970322327146750160L, (long)l10);
                                }
                                bl3 = bl2;
                                if (callSite == false) break block18;
                            }
                            catch (n9 n96) {
                                throw m44.a("h", (Object)n96, (long)2970322327146750160L, (long)l10);
                            }
                            if (bl3) break block19;
                        }
                        catch (n9 n97) {
                            throw m44.a("h", (Object)n97, (long)2970322327146750160L, (long)l10);
                        }
                        bl3 = true;
                        break block18;
                    }
                    bl3 = false;
                }
                return bl3;
            }
            object = bl2;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                l7w.a = prr.a(-1707304463162363649L, -7586915547017778046L, MethodHandles.lookup().lookupClass()).a(137129745778974L);
                l7w.g = new HashMap<K, V>(13);
                var0 = l7w.a ^ 24381567024628L;
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
                var6_5 = "\u00ebA\u00ed\u00e8\u00ba\u0094\u00be\u00eb\u00bd\u0086y.\u009b\u008b\u00e1\u00c8";
                var7_6 = "\u00ebA\u00ed\u00e8\u00ba\u0094\u00be\u00eb\u00bd\u0086y.\u009b\u008b\u00e1\u00c8".length();
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
                    var6_5 = "{\u00bf\u0098/>\u00b5\u0084Rg\u0019\u0001w\u00f7\u00d5\u00d9\u0092";
                    var7_6 = "{\u00bf\u0098/>\u00b5\u0084Rg\u0019\u0001w\u00f7\u00d5\u00d9\u0092".length();
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
        l7w.d = var8_3;
        l7w.f = new Integer[4];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x5354;
        if (f[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = d[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/l7w", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            l7w.f[n11] = n12;
        }
        return f[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = l7w.a(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/l7w" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(l7w.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

