/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._o;
import com.zelix.lku;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class tm
implements Comparator {
    final lku i;
    private static final long a = prr.a((long)9103799985263583415L, (long)3481766362581364467L, MethodHandles.lookup().lookupClass()).a(271713824357337L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public int M(Object[] objectArray) {
        long l = (Long)objectArray[0];
        _o _o2 = (_o)objectArray[1];
        _o _o3 = (_o)objectArray[2];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x558EDC677EDFL;
        long l4 = l2 ^ 0x620BBEFDD019L;
        long l5 = l2 ^ 0x1F2E60DEDA5AL;
        StringBuilder stringBuilder = new StringBuilder();
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        CallSite callSite = m44.a("v", (Object)_o2, (Object)objectArray2, (long)-7585310903969907923L, (long)l);
        stringBuilder.append(callSite.h(l3));
        stringBuilder.append((char)tm.a("s", (int)5869, (long)(0x3A5909834CD13AFFL ^ l)));
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l5;
        stringBuilder.append((String)((Object)m44.a("v", (Object)callSite, (Object)objectArray3, (long)-8098513884498057580L, (long)l)));
        StringBuilder stringBuilder2 = new StringBuilder();
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l4;
        CallSite callSite2 = m44.a("v", (Object)_o3, (Object)objectArray4, (long)-7585310903969907923L, (long)l);
        stringBuilder2.append(callSite2.h(l3));
        stringBuilder2.append((char)tm.a("s", (int)4877, (long)(0x3733F27A2002BF1EL ^ l)));
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l5;
        stringBuilder2.append((String)((Object)m44.a("v", (Object)callSite2, (Object)objectArray5, (long)-8098513884498057580L, (long)l)));
        return stringBuilder.toString().compareTo(stringBuilder2.toString());
    }

    public int compare(Object object, Object object2) {
        long l = a ^ 0x7EA6671CA5A5L;
        long l2 = l ^ 0xEA9EC7A274BL;
        Object[] objectArray = new Object[3];
        objectArray[2] = (_o)object2;
        objectArray[1] = (_o)object;
        objectArray[0] = l2;
        return (int)m44.a("s", (Object)this, (Object)objectArray, (long)2729002186402972532L, (long)l);
    }

    tm(lku lku2) {
        this.i = lku2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x2F5DB536F667L;
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
        String string = "\u00b1\u00fc\u00c6Q\u0098\u0095\u00a6\u0007\u00f6\u00e2\u0007v&\u0089\u00eb.";
        int n2 = "\u00b1\u00fc\u00c6Q\u0098\u0095\u00a6\u0007\u00f6\u00e2\u0007v&\u0089\u00eb.".length();
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
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2EFD;
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
                throw new RuntimeException("com/zelix/tm", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            tm.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = tm.a(n, l);
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
            throw new RuntimeException("com/zelix/tm" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(tm.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
