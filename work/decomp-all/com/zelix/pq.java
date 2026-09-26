/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.pu;
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

public class pq
extends pu {
    private static final long i = prr.a((long)4721422222321063291L, (long)278212394924669237L, MethodHandles.lookup().lookupClass()).a(188983658998354L);
    private static final String[] x;
    private static final String[] y;
    private static final Map A;

    public final void X(Object[] objectArray) {
        fu fu2 = (fu)objectArray[0];
        long l = (Long)objectArray[1];
        lqq lqq2 = (lqq)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x707565519BDBL;
        long l4 = l2 ^ 0L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = pq.d("y", (int)26387, (long)(0xF92CC4075B9E537L ^ l));
        m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-1869309732353598459L, (long)l);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = lqq2;
        objectArray3[1] = l4;
        objectArray3[0] = fu2;
        super.X(objectArray3);
    }

    boolean D(Object[] objectArray) {
        return false;
    }

    public pq(int n, short s, short s2, int n2) {
        long l = ((long)s << 48 | (long)s2 << 48 >>> 16 | (long)n2 << 32 >>> 32) ^ i;
        long l2 = l ^ 0x5B657FB54692L;
        super(n, l2);
    }

    boolean v(Object[] objectArray) {
        return false;
    }

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return pq.d("y", (int)29182, (long)(0x49A47A862391342EL ^ l));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        A = new HashMap(13);
        long l = i ^ 0x2A0743B4A48DL;
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
        String string = "\u00ac~g\u00dd\u0007\u00d9\u00ed\n\u001c\u00af\u00d7\u00ec\u00ac0\u00ee\u00fb\u0097#\u0099\u008a\u0084H\u00a6p\u00a2\u00b5\u00bb=Lq\u00aa`(;\u00a7\u00e7\u00ec\u00c3\u00e5\u0018\u00ac)\u0013\u00c7\u009e\u009e\u00852$\u001f\u00b0e\u00ae\u00bdQy\u0005\u00bf\u00ed\n6\u00ea\u008c\u0097W\u00a6\u00a4\u00e0\\\u009a\u0010R\u0016";
        int n2 = "\u00ac~g\u00dd\u0007\u00d9\u00ed\n\u001c\u00af\u00d7\u00ec\u00ac0\u00ee\u00fb\u0097#\u0099\u008a\u0084H\u00a6p\u00a2\u00b5\u00bb=Lq\u00aa`(;\u00a7\u00e7\u00ec\u00c3\u00e5\u0018\u00ac)\u0013\u00c7\u009e\u009e\u00852$\u001f\u00b0e\u00ae\u00bdQy\u0005\u00bf\u00ed\n6\u00ea\u008c\u0097W\u00a6\u00a4\u00e0\\\u009a\u0010R\u0016".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = pq.d(byArray3).intern();
            if ((n4 += n3) >= n2) {
                x = stringArray;
                y = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static String d(byte[] byArray) {
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

    private static String d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7636;
        if (y[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])A.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    A.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/pq", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = x[n2].getBytes("ISO-8859-1");
            pq.y[n2] = pq.d(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return y[n2];
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = pq.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/pq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(pq.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
