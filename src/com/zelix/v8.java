/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.gk;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class v8
implements Map {
    private Map W;
    private static final long a = prr.a((long)-2835873347867735191L, (long)-5338979947425604348L, MethodHandles.lookup().lookupClass()).a(262817834810816L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    @Override
    public final int size() {
        long l = a ^ 0x28B55BDE1037L;
        return m44.a("t", (Object)this, (long)7254135913337030429L, (long)l).size();
    }

    public final synchronized Collection values() {
        long l = a ^ 0x1C59195B0FEEL;
        return m44.a("k", m44.a("u", (Object)this, (long)8895430331216074948L, (long)l).values(), (long)9000927134806993578L, (long)l);
    }

    public final synchronized Enumeration c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return Collections.enumeration(m44.a("t", (Object)this, (long)3385569158650711373L, (long)l).keySet());
    }

    public final Object get(Object object) {
        long l = a ^ 0x69A6DB17EDDAL;
        return m44.a("q", (Object)this, (long)-7402053847388882192L, (long)l).get(object);
    }

    public Set keySet() {
        long l = a ^ 0x71B63565CA44L;
        long l2 = l ^ 0x3962BBF4B0DFL;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 40);
        int n3 = (int)(l2 << 56 >>> 56);
        return new gk(n, m44.a("w", (Object)this, (long)-4694853976869282450L, (long)l).keySet(), n2, (byte)n3);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean containsKey(Object object) {
        long l = a ^ 0x2499A86D248AL;
        return m44.a("q", (Object)this, (long)5771030874953397152L, (long)l).containsKey(object);
    }

    public v8(long l) {
        long l2 = (l = a ^ l) ^ 0x32D8A966C9CCL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = (int)v8.a("j", (int)19133, (long)(0x48D770C14F64DF75L ^ l));
        m44.a("r", (Object)this, (Map)((Object)m44.a("n", (Object)objectArray, (long)5552233490374314221L, (long)l)), (long)5827631852568097641L, (long)l);
    }

    public Set entrySet() {
        long l = a ^ 0x76234D2589C9L;
        return m44.a("l", m44.a("r", (Object)this, (long)-192105865021481245L, (long)l).entrySet(), (long)-1774677939742329485L, (long)l);
    }

    @Override
    public final boolean containsValue(Object object) {
        long l = a ^ 0x5A30ACF70735L;
        return (boolean)m44.a("w", (Object)m44.a("v", (Object)this, (long)8334382423751168031L, (long)l), (Object)object, (long)8556279862819849781L, (long)l);
    }

    public Object remove(Object object) {
        throw new UnsupportedOperationException();
    }

    public final Map J(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x555DB871B240L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = m44.a("q", (Object)this, (long)5903930989766357592L, (long)l);
        return m44.a("o", (Object)objectArray2, (long)6176240563792422201L, (long)l);
    }

    @Override
    public final boolean isEmpty() {
        long l = a ^ 0x2EE5DF13F2F8L;
        return (boolean)m44.a("r", (Object)m44.a("s", (Object)this, (long)-8762640941995104814L, (long)l), (long)-7338310261649424792L, (long)l);
    }

    public v8(Map map, long l) {
        block3: {
            block2: {
                long l2 = (l = a ^ l) ^ 0x7D0FCE588460L;
                if (map != null) break block2;
                Object[] objectArray = new Object[2];
                objectArray[1] = l2;
                objectArray[0] = (int)v8.a("j", (int)6462, (long)(0x585D50FAC828415BL ^ l));
                m44.a("v", (Object)this, (Map)((Object)m44.a("j", (Object)objectArray, (long)45371511082026305L, (long)l)), (long)2122224139240275653L, (long)l);
                if (l >= 0L) break block3;
            }
            m44.a("v", (Object)this, (Map)map, (long)2122224139240275653L, (long)l);
        }
    }

    public Object put(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x78A4D0714A85L;
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
        String string = "\u0081\u0084y\u00b4\u00af\u00ca\u0082I\u00f1Q\u009c\u0003\u000b\u00dc\u00b7O";
        int n2 = "\u0081\u0084y\u00b4\u00af\u00ca\u0082I\u00f1Q\u009c\u0003\u000b\u00dc\u00b7O".length();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5498;
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
                throw new RuntimeException("com/zelix/v8", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            v8.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = v8.a(n, l);
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
            throw new RuntimeException("com/zelix/v8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(v8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
