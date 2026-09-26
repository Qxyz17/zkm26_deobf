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
import com.zelix.v7;
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

public class ia
extends iy {
    private static final long b;
    private static final long[] m;
    private static final Integer[] n;
    private static final Map t;

    @Override
    public hz n(hz hz2, boolean bl2, char c10, int n10, boolean bl3, loj loj2, char c11, String string) {
        long l10;
        long l11 = l10 = (long)c10 << 48 | (long)n10 << 32 >>> 16 | (long)c11 << 48 >>> 48;
        long l12 = l11 ^ 0x5A73015BC1DL;
        long l13 = l11 ^ 0x67D45B4239BAL;
        long l14 = l11 ^ 0x4D53AB9156L;
        v7[] v7Array = hz2.X();
        v7[] v7Array2 = hz2.T();
        int n11 = v7Array.length;
        v7[] v7Array3 = v7.I(n11 + 1, l14);
        System.arraycopy(v7Array, 0, v7Array3, 0, n11);
        v7Array3[n11] = v7.X;
        return new hz(v7Array3, v7Array2, l13, hz2.j(), hz2.k(l12));
    }

    @Override
    public boolean w(long l10) {
        return true;
    }

    public ia(iq iq2, long l10) {
        l10 = b ^ l10;
        super((int)ia.e("x", (int)17587, (long)(0x123B64EACAB7F764L ^ l10)), iq2);
    }

    ia(h1 h12, int n10, l6q l6q2, long l10) {
        long l11 = (l10 = b ^ l10) ^ 0x645C492898D4L;
        super((int)ia.e("x", (int)9432, (long)(0x4E7699128C87E26CL ^ l10)), h12, l11, n10, l6q2);
    }

    @Override
    public List N(long l10) {
        block8: {
            block7: {
                CallSite callSite;
                int n10;
                block6: {
                    int n11 = this.J();
                    CallSite callSite2 = m44.a("k", (long)-4988472562570415370L, (long)l10);
                    try {
                        try {
                            n10 = n11;
                            callSite = ia.e("x", (int)18045, (long)(0x16C9042C6613FC12L ^ l10));
                            if (callSite2 != false) break block6;
                            if (n10 < callSite) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("k", (Object)n92, (long)-4891686938593962382L, (long)l10);
                        }
                        n10 = n11;
                        callSite = ia.e("x", (int)26108, (long)(0x55FB54ECB4515F92L ^ l10));
                    }
                    catch (n9 n93) {
                        throw m44.a("k", (Object)n93, (long)-4891686938593962382L, (long)l10);
                    }
                }
                if (n10 <= callSite) break block8;
            }
            ArrayList<it> arrayList = new ArrayList<it>(1);
            arrayList.add(new it((int)ia.e("x", (int)20134, (long)(0x390894710854F4CBL ^ l10)), this.K));
            return arrayList;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ia.b = prr.a(114454497046844474L, 8737227670785534247L, MethodHandles.lookup().lookupClass()).a(246335721412670L);
                ia.t = new HashMap<K, V>(13);
                var0 = ia.b ^ 103711301082766L;
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
                var6_5 = "\u00a0\u000bQ]\u00ae\u00cc\u009a\u0084\u00a6j4\u00c26\u0007\u00fe\u0001{`\u00b4\u00e0\u008cu8\u00e1";
                var7_6 = "\u00a0\u000bQ]\u00ae\u00cc\u009a\u0084\u00a6j4\u00c26\u0007\u00fe\u0001{`\u00b4\u00e0\u008cu8\u00e1".length();
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
                    var6_5 = "\u009a&\u00e1\u007f\u00ffb<\u00b1\u0081*\u00ad\u00b2s#\u00fb\u00b0";
                    var7_6 = "\u009a&\u00e1\u007f\u00ffb<\u00b1\u0081*\u00ad\u00b2s#\u00fb\u00b0".length();
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
        ia.m = var8_3;
        ia.n = new Integer[5];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int e(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x1611;
        if (n[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = m[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])t.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    t.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ia", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ia.n[n11] = n12;
        }
        return n[n11];
    }

    private static int e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = ia.e(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/ia" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ia.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

