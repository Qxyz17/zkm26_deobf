/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.v0;
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

public abstract class qy
extends v0 {
    private static final long c = prr.a((long)-6050711929106708364L, (long)6616321934695842666L, MethodHandles.lookup().lookupClass()).a(130217336027532L);
    private static final String[] d;
    private static final String[] e;
    private static final Map g;

    protected final void O(Object[] objectArray) {
        long l = (Long)objectArray[0];
        lqq lqq2 = (lqq)objectArray[1];
        int n = (Integer)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
    }

    public qy(long l, int n) {
        long l2 = (l = c ^ l) ^ 0x5194DD95533FL;
        super(l2, n);
    }

    public final void X(Object[] objectArray) {
        fu fu2 = (fu)objectArray[0];
        long l = (Long)objectArray[1];
        lqq lqq2 = (lqq)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x32E0AEE1AD38L;
        long l4 = l2 ^ 0x79CE25C1C7F5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = (String)((Object)qy.a("k", (int)27061, (long)(0x554330EE14EB8E8AL ^ l))) + (String)((Object)m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-1884516549641214229L, (long)l)) + (String)((Object)qy.a("k", (int)31885, (long)(0x23492B387FE1BB3L ^ l)));
        m44.a("r", (Object)lqq2, (Object)objectArray3, (long)-22266681956419799L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = new HashMap(13);
        long l = c ^ 0x4A9946389614L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u001eB\u00e5\u0085^\u00a2\u00ec\u000b\u008a:\u007f\u00cc\u00a82\u00e1\u00b0\u000f\u00c8\u0001\u0087O*\u00e0\u00aa8\u0004\u001e\u00e6\u00a4\u0083g\u00c4L\u00bd\u00af\u008f\u0016-\u00ab\u00d4>\u00b3\u00fa.\u001dC\u0006\u00a2\u00c1i\u0007\u00d2\u00d0\r\u0015\u00c7\u00d2\u00a7\u00e6\u00ce\u008e\u00d1F\u00f6S\u009b5\u007f\u00b1j\u00a1\u00ae\u001a\u00d1]\u00afJ\u00fc\u00c3O\\";
        int n2 = "\u001eB\u00e5\u0085^\u00a2\u00ec\u000b\u008a:\u007f\u00cc\u00a82\u00e1\u00b0\u000f\u00c8\u0001\u0087O*\u00e0\u00aa8\u0004\u001e\u00e6\u00a4\u0083g\u00c4L\u00bd\u00af\u008f\u0016-\u00ab\u00d4>\u00b3\u00fa.\u001dC\u0006\u00a2\u00c1i\u0007\u00d2\u00d0\r\u0015\u00c7\u00d2\u00a7\u00e6\u00ce\u008e\u00d1F\u00f6S\u009b5\u007f\u00b1j\u00a1\u00ae\u001a\u00d1]\u00afJ\u00fc\u00c3O\\".length();
        int n3 = 24;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = qy.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                d = stringArray;
                e = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x132D;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/qy", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            qy.e[n2] = qy.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = qy.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/qy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(qy.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
