/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.zj;
import com.zelix.zs;
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

public class z_
extends zj {
    private static final long a = prr.a((long)-2826873914256113944L, (long)5893119822895708170L, MethodHandles.lookup().lookupClass()).a(202371144832480L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    public z_(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x29E8AA843EF6L;
        super(l2, n);
    }

    public void X(Object[] objectArray) {
        fu fu2 = (fu)objectArray[0];
        long l = (Long)objectArray[1];
        lqq lqq2 = (lqq)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x11C7289DCC51L;
        long l4 = l2 ^ 0x32E0AEE1AD38L;
        long l5 = l2 ^ 0x4D8052C494B9L;
        long l6 = l2 ^ 0xABBA2C5DA6L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        zs zs2 = (zs)m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-1797704930665120443L, (long)l);
        try {
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l5;
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l6;
            objectArray4[0] = m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-1785247222142810516L, (long)l);
            m44.a("r", (Object)zs2, (Object)objectArray4, (long)-1907327041323373610L, (long)l);
            Object[] objectArray5 = new Object[1];
            objectArray5[0] = l5;
            if (!((String)((Object)m44.a("r", (Object)((Object)this), (Object)objectArray5, (long)-1785247222142810516L, (long)l))).equals(z_.a("k", (int)6073, (long)(0x278FBEE67929FB2AL ^ l)))) {
                Object[] objectArray6 = new Object[1];
                objectArray6[0] = l5;
                Object[] objectArray7 = new Object[2];
                objectArray7[1] = l4;
                objectArray7[0] = (String)((Object)z_.a("k", (int)14809, (long)(0x640ED8866B2D554BL ^ l))) + (String)((Object)m44.a("r", (Object)((Object)this), (Object)objectArray6, (long)-1785247222142810516L, (long)l)) + "'";
                m44.a("r", (Object)lqq2, (Object)objectArray7, (long)-22266681956419799L, (long)l);
            }
        }
        catch (n9 n92) {
            throw m44.a("m", (Object)((Object)n92), (long)-509933491405383145L, (long)l);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new HashMap(13);
        long l = a ^ 0x400D367CCAB5L;
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
        String string = "R\u001b<>\u0017\u00a1jV\u0096\u00ad\u0089&\u00afy\u0012\"\u00b7|\u00day\u00f6\u00a9;\u0080\u0096\u00f1\u00bcB\u00d2\u00f9\u008f\u00a8=U\u008c\u0081]!\u0091X\u00cf\u00a7\u000b\u00de\u00e9\u00fb)\u00c9\u00ad\u0094\u00fa\u00bfQ\u00a9\u00c1\u00d0t\u00e6\u00c2\u0089{\u00a2}\u00b7\u00c1\u00e80pw>#:\u0019W\u008d:\u001cB\u00ab\u00c8\u009f`\u009c\u009c\u00d7\u00be\u00b2\u0005\u00dd\u0004V\u00a9\u00b1\u0010\u00ed)x\u00b3=*\u00c3\u00cc\u00f5\u00e1\u0013\u000fM\u00f4z\u00c91\u00b8\u00dcw\u00fb\u00ca\t\u00f3\u0005H\u00aef\t~v\u00b2\u00e4u:\u00c1!\b\u0006d{\u00ea\u0010\u00d7k\u00d9\u000bY\u0085s8+8|1\u00e4[0\u00ef";
        int n2 = "R\u001b<>\u0017\u00a1jV\u0096\u00ad\u0089&\u00afy\u0012\"\u00b7|\u00day\u00f6\u00a9;\u0080\u0096\u00f1\u00bcB\u00d2\u00f9\u008f\u00a8=U\u008c\u0081]!\u0091X\u00cf\u00a7\u000b\u00de\u00e9\u00fb)\u00c9\u00ad\u0094\u00fa\u00bfQ\u00a9\u00c1\u00d0t\u00e6\u00c2\u0089{\u00a2}\u00b7\u00c1\u00e80pw>#:\u0019W\u008d:\u001cB\u00ab\u00c8\u009f`\u009c\u009c\u00d7\u00be\u00b2\u0005\u00dd\u0004V\u00a9\u00b1\u0010\u00ed)x\u00b3=*\u00c3\u00cc\u00f5\u00e1\u0013\u000fM\u00f4z\u00c91\u00b8\u00dcw\u00fb\u00ca\t\u00f3\u0005H\u00aef\t~v\u00b2\u00e4u:\u00c1!\b\u0006d{\u00ea\u0010\u00d7k\u00d9\u000bY\u0085s8+8|1\u00e4[0\u00ef".length();
        int n3 = 136;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = z_.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                d = stringArray;
                e = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1880;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/z_", exception);
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
            z_.e[n2] = z_.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = z_.a(n, l);
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
            throw new RuntimeException("com/zelix/z_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(z_.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
