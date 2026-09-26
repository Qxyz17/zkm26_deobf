/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class o9 {
    private static o9 f;
    private int U;
    public static final Integer M;
    private Integer[] k;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Integer e(long var1_1, int var3_2) {
        block21: {
            block17: {
                block15: {
                    block16: {
                        var1_1 = o9.a ^ var1_1;
                        var4_3 = m44.a("n", (long)-7264221461542763258L, (long)var1_1);
                        v0 = var3_2;
                        v1 /* !! */  = -1;
                        if (var4_3 != null) break block15;
                        try {
                            block20: {
                                if (v0 != v1 /* !! */ ) break block16;
                                break block20;
                                catch (n9 v2) {
                                    throw m44.a("n", (Object)v2, (long)-7377955013824301819L, (long)var1_1);
                                }
                            }
                            return m44.a("j", (long)-6920039206275722014L, (long)var1_1);
                        }
                        catch (n9 v3) {
                            throw m44.a("n", (Object)v3, (long)-7377955013824301819L, (long)var1_1);
                        }
                    }
                    try {
                        v0 = var3_2;
                        if (var4_3 != null) break block17;
                        v1 /* !! */  = (int)o9.a("m", (int)29666, (long)(4870983176427585909L ^ var1_1));
                    }
                    catch (n9 v4) {
                        throw m44.a("n", (Object)v4, (long)-7377955013824301819L, (long)var1_1);
                    }
                }
                if (v0 <= v1 /* !! */ ) break block21;
                v0 = var3_2;
            }
            return v0;
        }
        v5 = var5_4 = this;
        if (var4_3 != null) ** GOTO lbl48
        synchronized (v5) {
            block18: {
                block19: {
                    block23: {
                        block22: {
                            v6 = var3_2;
                            v7 = this.U;
                            if (var1_1 < 0L) break block22;
                            if (v6 < v7) break block23;
                            v6 = var3_2;
                            v7 = 2;
                        }
                        var6_5 = v6 * v7;
                        var7_7 = new Integer[var6_5];
                        System.arraycopy(this.k, 0, var7_7, 0, this.U);
                        this.k = var7_7;
                        this.U = var6_5;
                    }
                    v5 = this;
lbl48:
                    // 2 sources

                    var6_6 = v5.k[var3_2];
                    try {
                        v8 = var6_6;
                        if (var4_3 != null) break block18;
                        if (v8 != null) break block19;
                    }
                    catch (n9 v9) {
                        throw m44.a("n", (Object)v9, (long)-7377955013824301819L, (long)var1_1);
                    }
                    this.k[var3_2] = var6_6 = Integer.valueOf(var3_2);
                }
                v8 = var6_6;
                // ** MonitorExit[var5_4] (shouldn't be in output)
            }
            return v8;
        }
    }

    private o9(int n) {
        this.k = new Integer[n];
        this.U = n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = prr.a((long)-6023183260830178563L, (long)6067706623598675981L, MethodHandles.lookup().lookupClass()).a(62706917204656L);
        d = new HashMap(13);
        long l = a ^ 0x58A2F0554917L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "t\u008a\u009dn\u00edx\u00cd\u00a1\u008f\u0090\u00cc\u0002\u0017w/\u00c5";
        int n2 = "t\u008a\u009dn\u00edx\u00cd\u00a1\u008f\u0090\u00cc\u0002\u0017w/\u00c5".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
        M = -1;
    }

    public static o9 f(long l) {
        l = a ^ l;
        try {
            if (f == null) {
                f = new o9((int)o9.a("m", (int)9511, (long)(0x7B8721C122A592A7L ^ l)));
            }
        }
        catch (n9 n92) {
            throw m44.a("h", (Object)((Object)n92), (long)-7166900150309244909L, (long)l);
        }
        return f;
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x27E6;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/o9", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            o9.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = o9.a(n, l);
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
            throw new RuntimeException("com/zelix/o9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(o9.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
