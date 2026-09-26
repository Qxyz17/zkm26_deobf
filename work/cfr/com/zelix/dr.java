/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
import com.zelix.df;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class dr
extends df {
    private static final long a;
    private static final long[] f;
    private static final Integer[] h;
    private static final Map i;

    private dr(int n10, long l10) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x5A48FD323A70L;
        int n11 = (int)(l12 >>> 32);
        int n12 = (int)(l12 << 32 >>> 48);
        int n13 = (int)(l12 << 48 >>> 48);
        long l13 = l11 ^ 0x542D0164E5E0L;
        boolean bl2 = false;
        CallSite callSite = dr.b("m", (int)31379, (long)(0x18C34C2EB4B380CBL ^ l10));
        CallSite callSite2 = dr.b("m", (int)18522, (long)(0x3366C0AD3A373201L ^ l10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(cf.x(n10, n11, (char)n12, (short)n13));
        super(l13, linkedHashMap, (int)callSite2, (int)callSite, bl2);
    }

    @Override
    Set y(int n10, long l10) {
        return new LinkedHashSet(n10);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public df w(Object[] objectArray) {
        dr dr2;
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x3C4CFA0E598L;
        int n10 = this.L.size();
        dr dr3 = new dr(n10 * 2 + 1, l11);
        CallSite callSite = m44.a("o", (long)-3309739370700878809L, (long)l10);
        block2: for (Map.Entry entry : this.L.entrySet()) {
            Set set = (Set)entry.getValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            try {
                do {
                    dr2 = dr3;
                    CallSite callSite2 = callSite;
                    if (l10 > 0L) {
                        if (callSite2 != null) return dr2;
                        callSite2 = entry.getKey();
                    }
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = linkedHashSet;
                    objectArray2[0] = callSite2;
                    m44.a("p", (Object)dr2, (Object)objectArray2, (long)-3726975821585574750L, (long)l10);
                    if (callSite == null) continue block2;
                } while (l10 < 0L);
                break;
            }
            catch (n9 n92) {
                throw m44.a("o", (Object)n92, (long)-3856426763984680018L, (long)l10);
            }
        }
        dr2 = dr3;
        return dr2;
    }

    public dr(long l10) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x2AE812FCF37FL;
        int n10 = (int)(l12 >>> 32);
        int n11 = (int)(l12 << 32 >>> 48);
        int n12 = (int)(l12 << 48 >>> 48);
        long l13 = l11 ^ 0x248DEEAA2CEFL;
        boolean bl2 = false;
        CallSite callSite = dr.b("m", (int)13658, (long)(0x129F13503EB8060CL ^ l10));
        CallSite callSite2 = dr.b("m", (int)18522, (long)(0x3366B00DD5F9FB0EL ^ l10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(cf.x((int)dr.b("m", (int)23049, (long)(0x3BBFA65A1443E95CL ^ l10)), n10, (char)n11, (short)n12));
        super(l13, linkedHashMap, (int)callSite2, (int)callSite, bl2);
    }

    @Override
    Map K(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        return new LinkedHashMap(n10);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                dr.a = prr.a(-2704349267062525957L, -5139579283454280028L, MethodHandles.lookup().lookupClass()).a(30554445621690L);
                dr.i = new HashMap<K, V>(13);
                var0 = dr.a ^ 72669236227601L;
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
                var6_5 = "E\u008fM\u0085Y\u0090/ \u00e5\u00b2ll\u00fb\u0091\u00ec\u009b";
                var7_6 = "E\u008fM\u0085Y\u0090/ \u00e5\u00b2ll\u00fb\u0091\u00ec\u009b".length();
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
                    var6_5 = "\u00e2\u00f5\u001a\u00fd}c*_>/O\u0087\u00982\u00f7\u001e";
                    var7_6 = "\u00e2\u00f5\u001a\u00fd}c*_>/O\u0087\u00982\u00f7\u001e".length();
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
        dr.f = var8_3;
        dr.h = new Integer[4];
    }

    private static n9 b(n9 n92) {
        return n92;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x2756;
        if (h[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = f[n11];
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
                throw new RuntimeException("com/zelix/dr", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            dr.h[n11] = n12;
        }
        return h[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = dr.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/dr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dr.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

