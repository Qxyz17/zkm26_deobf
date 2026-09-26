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
        long l;
        block3: {
            block4: {
                l = (Long)objectArray[0];
                String string = (String)objectArray[1];
                l = a ^ l;
                object = string.replace((char)l7w.a("s", (int)25913, (long)(0x2A6CCF4542038891L ^ l)), (char)l7w.a("s", (int)19884, (long)(0x4AA986DD69682006L ^ l)));
                CallSite callSite2 = m44.a("k", (long)-6186281838819706595L, (long)l);
                try {
                    callSite = m44.a("o", (long)-5930069374236654288L, (long)l);
                    if (callSite2 != false) break block3;
                    if (callSite == l7w.a("s", (int)13398, (long)(0x7BC0C1243CB959FFL ^ l))) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("k", (Object)((Object)n92), (long)-5360434365977133965L, (long)l);
                }
                object = string.replace((char)m44.a("o", (long)-5930069374236654288L, (long)l), (char)l7w.a("s", (int)19884, (long)(0x4AA986DD69682006L ^ l)));
            }
            callSite = m44.a("o", (long)-6087106735014905782L, (long)l);
        }
        if (callSite == false) {
            object = m44.a("t", (Object)object, (long)-5631924772392608076L, (long)l);
        }
        return object;
    }

    public String p(Object[] objectArray) {
        String string;
        StringBuilder stringBuilder;
        long l = (Long)objectArray[0];
        try {
            stringBuilder = new StringBuilder();
            string = m44.a("p", (Object)((Object)this), (long)8139890231353069683L, (long)l) != false ? "!" : "";
        }
        catch (n9 n92) {
            throw m44.a("n", (Object)((Object)n92), (long)7986757125074134846L, (long)l);
        }
        return stringBuilder.append(string).append("\"").append((String)((Object)m44.a("p", (Object)((Object)this), (long)7985723180093741553L, (long)l))).append("\"").toString();
    }

    public final void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x518E6651348FL;
        long l4 = l2 ^ 0x36230D9FA4F8L;
        long l5 = l2 ^ 0x6E2A80000718L;
        long l6 = l2 ^ 0x47526B4E5A06L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l6;
        CallSite callSite = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l);
        lwr lwr2 = (lwr)this.V(0);
        m44.a("t", (Object)((Object)this), (String)((Object)m44.a("w", (Object)lwr2, (Object)new Object[0], (long)-4968184746715213117L, (long)l)), (long)-4686937243768927785L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = m44.a("v", (Object)((Object)this), (long)-4686937243768927785L, (long)l);
        objectArray3[0] = l4;
        CallSite callSite2 = m44.a("i", (Object)((Object)this), (Object)objectArray3, (long)-4951574545322784467L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l5;
        objectArray4[0] = callSite2;
        CallSite callSite3 = m44.a("h", (Object)objectArray4, (long)-6573103780832126586L, (long)l);
        m44.a("t", (Object)((Object)this), (String)((String)((Object)callSite2)).substring(0, (int)(callSite3 + true)), (long)-4973176016200566200L, (long)l);
        m44.a("t", (Object)((Object)this), (String)("*" + (String)((Object)m44.a("v", (Object)((Object)this), (long)-4973176016200566200L, (long)l))), (long)-4973176016200566200L, (long)l);
        m44.a("t", (Object)((Object)this), (String)((String)((Object)callSite2)).substring((int)(callSite3 + true)), (long)-6351565050268560858L, (long)l);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l3;
        objectArray5[0] = this;
        m44.a("w", (Object)((lkx)lmu2), (Object)objectArray5, (long)-6817564929646714496L, (long)l);
    }

    private static int G(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        int n = string.lastIndexOf((int)l7w.a("s", (int)3308, (long)(0xF8B1206F5E5C2A7L ^ l)));
        int n2 = string.lastIndexOf("!");
        return Math.max(n, n2);
    }

    public l7w(int n, boolean bl, long l) {
        long l2 = (l = a ^ l) ^ 0x6F3763BD6A7L;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
        this.J = bl;
    }

    public boolean e(Object[] objectArray) {
        Object object;
        block16: {
            boolean bl;
            block17: {
                boolean bl2;
                block18: {
                    block19: {
                        boolean bl3;
                        CallSite callSite;
                        long l;
                        block15: {
                            block14: {
                                block13: {
                                    String string = (String)objectArray[0];
                                    l = (Long)objectArray[1];
                                    long l2 = l;
                                    long l3 = l2 ^ 0x7086B3B13330L;
                                    long l4 = l2 ^ 0x288F3E2E90D0L;
                                    long l5 = l2 ^ 0x63BF80BA626BL;
                                    Object[] objectArray2 = new Object[2];
                                    objectArray2[1] = string;
                                    objectArray2[0] = l3;
                                    CallSite callSite2 = m44.a("i", (Object)((Object)this), (Object)objectArray2, (long)3206632797649624805L, (long)l);
                                    Object[] objectArray3 = new Object[2];
                                    objectArray3[1] = l4;
                                    objectArray3[0] = callSite2;
                                    CallSite callSite3 = m44.a("h", (Object)objectArray3, (long)3679408229543562830L, (long)l);
                                    String string2 = ((String)((Object)callSite2)).substring((int)(callSite3 + true));
                                    String string3 = ((String)((Object)callSite2)).substring(0, (int)(callSite3 + true));
                                    callSite = m44.a("h", (long)3368966272689810950L, (long)l);
                                    try {
                                        try {
                                            bl3 = mn.R((String)string3, (long)l5, (String)((Object)m44.a("v", (Object)((Object)this), (long)3257224473135410560L, (long)l)));
                                            if (callSite == false) break block13;
                                            if (bl3) {
                                            }
                                            break block14;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("h", (Object)((Object)n92), (long)2970322327146750160L, (long)l);
                                        }
                                        bl3 = mn.R((String)string2, (long)l5, (String)((Object)m44.a("v", (Object)((Object)this), (long)3464098900193461742L, (long)l)));
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("h", (Object)((Object)n93), (long)2970322327146750160L, (long)l);
                                    }
                                }
                                try {
                                    if (callSite == false) break block15;
                                    if (!bl3) break block14;
                                }
                                catch (n9 n94) {
                                    throw m44.a("h", (Object)((Object)n94), (long)2970322327146750160L, (long)l);
                                }
                                bl3 = true;
                                break block15;
                            }
                            bl3 = false;
                        }
                        bl = bl3;
                        try {
                            try {
                                try {
                                    object = m44.a("v", (Object)((Object)this), (long)3970114561517524893L, (long)l);
                                    if (callSite == false) break block16;
                                    if (object == false) break block17;
                                }
                                catch (n9 n95) {
                                    throw m44.a("h", (Object)((Object)n95), (long)2970322327146750160L, (long)l);
                                }
                                bl2 = bl;
                                if (callSite == false) break block18;
                            }
                            catch (n9 n96) {
                                throw m44.a("h", (Object)((Object)n96), (long)2970322327146750160L, (long)l);
                            }
                            if (bl2) break block19;
                        }
                        catch (n9 n97) {
                            throw m44.a("h", (Object)((Object)n97), (long)2970322327146750160L, (long)l);
                        }
                        bl2 = true;
                        break block18;
                    }
                    bl2 = false;
                }
                return bl2;
            }
            object = bl;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                l7w.a = prr.a((long)-1707304463162363649L, (long)-7586915547017778046L, MethodHandles.lookup().lookupClass()).a(137129745778974L);
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5354;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
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
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            l7w.f[n2] = n3;
        }
        return f[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = l7w.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
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
