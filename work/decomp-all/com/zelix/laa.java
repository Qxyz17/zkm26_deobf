/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lpm;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.prr;
import java.io.PrintWriter;
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

public class laa
extends lpm {
    private static final long a = prr.a((long)-8235263617397890919L, (long)-3882778198109323816L, MethodHandles.lookup().lookupClass()).a(181367130088077L);
    private static final String[] e;
    private static final String[] k;
    private static final Map n;

    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l;
        long l3 = l2 ^ 0x3E0224440141L;
        long l4 = l2 ^ 0x7DCCEBDCF70FL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this;
        objectArray2[0] = l4;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-4981623821923563524L, (long)l);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = laa.b("x", (int)16334, (long)(0x2E49996E77DAA9EFL ^ l));
        objectArray3[4] = n3;
        objectArray3[3] = n2;
        objectArray3[2] = l3;
        objectArray3[1] = n;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-4778337559753001233L, (long)l);
    }

    public laa(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x5051E6C3E30FL;
        super(n, l2);
    }

    protected void l(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l;
        long l3 = l2 ^ 0x6DF7BA9051C2L;
        long l4 = l2 ^ 0x550B0FC6572DL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        CallSite callSite = m44.a("q", (Object)lqu2, (Object)objectArray2, (long)3638594277050117288L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        String string = (String)((Object)m44.a("n", (Object)objectArray3, (long)3433008837598041604L, (long)l)) + (String)((Object)laa.b("x", (int)27190, (long)(0x78E2F60D13707577L ^ l)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l), (Object)string, (long)3896853000951639041L, (long)l);
    }

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return laa.b("x", (int)28946, (long)(0x1BCAE7BC9B8E217EL ^ l));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        n = new HashMap(13);
        long l = a ^ 0x6D5D0FE55D60L;
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
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\u0092\u00e4\u00c8L\u00bc\u0094\u00c4e\u00f3\u0091qq\u0016\b\u0010\u00e8#\u0091I\u00f6\u00ad\u00b0\u00bc\fL\u0092\u00b1Jg\u00910\"0L\u00d8 >\u0014\u00d9Y\u0085\u00de\u00aa\u00bcpt#\u00a7\u00f1\u001f\u0006q\u000f5\u00da9\u00c7\u00d4#\u00f9\u00ba\u001a%\u0011\u008e4\u009eX\u0016\u0094\u00af\u0003\u0095\u001c\u00f7\u009e\u00bfr\u0081\u00dd\u00fe m(\u008e+\u00e6\u00bf\u00f753\u00cd\u0084\u008a\u00f1\u008c\u00d1(|\u008faK\u009b\u009f\u00b6\u0000AS8\u00ebo\u00af\u00f5}";
        int n2 = "\u0092\u00e4\u00c8L\u00bc\u0094\u00c4e\u00f3\u0091qq\u0016\b\u0010\u00e8#\u0091I\u00f6\u00ad\u00b0\u00bc\fL\u0092\u00b1Jg\u00910\"0L\u00d8 >\u0014\u00d9Y\u0085\u00de\u00aa\u00bcpt#\u00a7\u00f1\u001f\u0006q\u000f5\u00da9\u00c7\u00d4#\u00f9\u00ba\u001a%\u0011\u008e4\u009eX\u0016\u0094\u00af\u0003\u0095\u001c\u00f7\u009e\u00bfr\u0081\u00dd\u00fe m(\u008e+\u00e6\u00bf\u00f753\u00cd\u0084\u008a\u00f1\u008c\u00d1(|\u008faK\u009b\u009f\u00b6\u0000AS8\u00ebo\u00af\u00f5}".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = laa.c(byArray3).intern();
            if ((n4 += n3) >= n2) {
                e = stringArray;
                k = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static String c(byte[] byArray) {
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3FC1;
        if (k[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])laa.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    laa.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/laa", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e[n2].getBytes("ISO-8859-1");
            laa.k[n2] = laa.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = laa.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/laa" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(laa.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
