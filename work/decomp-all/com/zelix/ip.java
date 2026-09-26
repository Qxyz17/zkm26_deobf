/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.h1;
import com.zelix.hz;
import com.zelix.iq;
import com.zelix.it;
import com.zelix.iy;
import com.zelix.l6q;
import com.zelix.loj;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ip
extends iy {
    private static final long b;
    private static final long[] m;
    private static final Integer[] n;
    private static final Map t;

    public List N(long l) {
        block8: {
            block7: {
                CallSite callSite;
                int n;
                block6: {
                    int n2 = this.J();
                    CallSite callSite2 = m44.a("k", (long)-6551188946577232183L, (long)l);
                    try {
                        try {
                            n = n2;
                            callSite = ip.e("t", (int)32566, (long)(0x44BBCEF5D310DA3EL ^ l));
                            if (callSite2 == false) break block6;
                            if (n < callSite) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("k", (Object)((Object)n92), (long)-4692566911939957634L, (long)l);
                        }
                        n = n2;
                        callSite = ip.e("t", (int)238, (long)(0x27E67C922E57A5E5L ^ l));
                    }
                    catch (n9 n93) {
                        throw m44.a("k", (Object)((Object)n93), (long)-4692566911939957634L, (long)l);
                    }
                }
                if (n <= callSite) break block8;
            }
            ArrayList<it> arrayList = new ArrayList<it>(1);
            arrayList.add(new it((int)ip.e("t", (int)15492, (long)(0x2B959E6FDD69998DL ^ l)), this.K));
            return arrayList;
        }
        return null;
    }

    public ip(long l, iq iq2) {
        l = b ^ l;
        super((int)ip.e("t", (int)29504, (long)(0x3928724A541C0ECBL ^ l)), iq2);
    }

    public hz n(hz hz2, boolean bl, char c, int n, boolean bl2, loj loj2, char c2, String string) {
        long l;
        long l2 = l = (long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48;
        long l3 = l2 ^ 0x5A73015BC1DL;
        long l4 = l2 ^ 0x67D45B4239BAL;
        return new hz(hz2.X(), hz2.T(), l4, hz2.j(), hz2.k(l3));
    }

    ip(h1 h12, int n, l6q l6q2, int n2, int n3, int n4) {
        long l = ((long)n2 << 32 | (long)n3 << 48 >>> 32 | (long)n4 << 48 >>> 48) ^ b;
        long l2 = l ^ 0x4AE407F19A07L;
        super((int)ip.e("t", (int)19993, (long)(0x47CCDDEAAC1C151DL ^ l)), h12, l2, n, l6q2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ip.b = prr.a((long)-3779287562094199016L, (long)-4082447199617097810L, MethodHandles.lookup().lookupClass()).a(192192077140053L);
                ip.t = new HashMap<K, V>(13);
                var0 = ip.b ^ 114618971810222L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "-\u0017\u00985\u00dc\u00f3\u00bf\u00e8\u00a7T\u00e9T\u000e8\u00edjI84e\u00b0\u00ae\u0002G";
                var7_6 = "-\u0017\u00985\u00dc\u00f3\u00bf\u00e8\u00a7T\u00e9T\u000e8\u00edjI84e\u00b0\u00ae\u0002G".length();
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
                    var6_5 = "\u0018\u0093\u00db\u00cc\u00fa\u00d91\u008e\u00f7\u0087y9\u00e2\u00d29\u0098";
                    var7_6 = "\u0018\u0093\u00db\u00cc\u00fa\u00d91\u008e\u00f7\u0087y9\u00e2\u00d29\u0098".length();
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
        ip.m = var8_3;
        ip.n = new Integer[5];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int e(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x975;
        if (ip.n[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = m[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])t.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    t.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ip", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ip.n[n2] = n3;
        }
        return ip.n[n2];
    }

    private static int e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ip.e(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/ip" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ip.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
