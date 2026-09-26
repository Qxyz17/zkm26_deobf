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

public class p_
extends pu {
    private static final long i = prr.a((long)6075384100210517435L, (long)-5334035703007396257L, MethodHandles.lookup().lookupClass()).a(270919490462553L);
    private static final String[] x;
    private static final String[] y;
    private static final Map A;

    boolean v(Object[] objectArray) {
        return true;
    }

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return p_.d("n", (int)23282, (long)(0x7D162439644FDA24L ^ l));
    }

    public p_(int n, long l) {
        long l2 = (l = i ^ l) ^ 0x2FF9780BE4E7L;
        super(n, l2);
    }

    boolean D(Object[] objectArray) {
        return false;
    }

    public final void X(Object[] objectArray) {
        fu fu2 = (fu)objectArray[0];
        long l = (Long)objectArray[1];
        lqq lqq2 = (lqq)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x707565519BDBL;
        long l4 = l2 ^ 0L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = p_.d("n", (int)29614, (long)(0x570303F4BCAEB48CL ^ l));
        m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-1869309732353598459L, (long)l);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = lqq2;
        objectArray3[1] = l4;
        objectArray3[0] = fu2;
        super.X(objectArray3);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        A = new HashMap(13);
        long l = i ^ 0x24571B9A5BD0L;
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
        String string = "\u00d4.\u00cf\u00d3\u00cb\bF\t\u009bB\u00bb\u0002\u001e/\u001e\u00af\u008c(\\\u008d\u00ca\u0013+\u00e0\u0000\u009ec\u0014\u0096\u00ef\u00dc! \u00b0n$\u00a8\u00eb\u00d4\u00f9-\u00f4\u00b4\u008a\u00c9N\u00cb\u0019\u00f3;8\u008e\u0092(\u0004h$>\u008c\u00bcF\u0086\u0017\u00ca\u00df";
        int n2 = "\u00d4.\u00cf\u00d3\u00cb\bF\t\u009bB\u00bb\u0002\u001e/\u001e\u00af\u008c(\\\u008d\u00ca\u0013+\u00e0\u0000\u009ec\u0014\u0096\u00ef\u00dc! \u00b0n$\u00a8\u00eb\u00d4\u00f9-\u00f4\u00b4\u008a\u00c9N\u00cb\u0019\u00f3;8\u008e\u0092(\u0004h$>\u008c\u00bcF\u0086\u0017\u00ca\u00df".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = p_.d(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3330;
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
                throw new RuntimeException("com/zelix/p_", exception);
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
            p_.y[n2] = p_.d(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return y[n2];
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = p_.d(n, l);
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
            throw new RuntimeException("com/zelix/p_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(p_.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
