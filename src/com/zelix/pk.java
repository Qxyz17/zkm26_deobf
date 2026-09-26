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

public class pk
extends pu {
    private static final long i = prr.a((long)4760840419459162159L, (long)-7788735246767418747L, MethodHandles.lookup().lookupClass()).a(170810196666118L);
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
        objectArray2[0] = pk.d("v", (int)15076, (long)(0x4AFE20E13DD85A24L ^ l));
        m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-1869309732353598459L, (long)l);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = lqq2;
        objectArray3[1] = l4;
        objectArray3[0] = fu2;
        super.X(objectArray3);
    }

    public pk(long l, int n) {
        long l2 = (l = i ^ l) ^ 0x139A7898ED22L;
        super(n, l2);
    }

    boolean v(Object[] objectArray) {
        return true;
    }

    boolean D(Object[] objectArray) {
        return true;
    }

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return pk.d("v", (int)26111, (long)(0x141605731FE5C2CBL ^ l));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        A = new HashMap(13);
        long l = i ^ 0x17E50CB07807L;
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
        String string = "\u00abZ\u00d9\f;\b\u00a8:\u008e;}\u0099\u00ec9\u00c1$\u00ed\u0085\u00dbg\u0017\u00ef2Gm\u009d`\u00b8\u00b3\u00ce\u00c7/0P\u00ec\u0098\u008eV\u00ee\u0085m\u00ef\u0089N\u00de\u00fc\u00c2CQ`\u00fe\u00c6=\u00c7\u00d2/\u00b0\u00f0noQ\u00f5\u0019\u001d\u00b7m.\u00f3\u0005\u00f4\u00d6J\u009ab\u0016=\u00c5\u00e4\n\u000e;";
        int n2 = "\u00abZ\u00d9\f;\b\u00a8:\u008e;}\u0099\u00ec9\u00c1$\u00ed\u0085\u00dbg\u0017\u00ef2Gm\u009d`\u00b8\u00b3\u00ce\u00c7/0P\u00ec\u0098\u008eV\u00ee\u0085m\u00ef\u0089N\u00de\u00fc\u00c2CQ`\u00fe\u00c6=\u00c7\u00d2/\u00b0\u00f0noQ\u00f5\u0019\u001d\u00b7m.\u00f3\u0005\u00f4\u00d6J\u009ab\u0016=\u00c5\u00e4\n\u000e;".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = pk.d(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x14D2;
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
                throw new RuntimeException("com/zelix/pk", exception);
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
            pk.y[n2] = pk.d(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return y[n2];
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = pk.d(n, l);
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
            throw new RuntimeException("com/zelix/pk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(pk.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
