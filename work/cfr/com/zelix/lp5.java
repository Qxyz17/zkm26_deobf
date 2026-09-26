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

public class lp5
extends lpm {
    private static final long a = prr.a(8133013996765079175L, 3261155702981730975L, MethodHandles.lookup().lookupClass()).a(151364392592565L);
    private static final String[] e;
    private static final String[] k;
    private static final Map n;

    @Override
    protected void l(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10;
        long l12 = l11 ^ 0x550B0FC6572DL;
        long l13 = l11 ^ 0x6DF7BA9051C2L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        String string = (String)((Object)m44.a("n", (Object)objectArray2, (long)3433008837598041604L, (long)l10)) + (String)((Object)lp5.b("e", (int)4741, (long)(0x533404897BD0815CL ^ l10)));
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l13;
        CallSite callSite = m44.a("q", (Object)lqu2, (Object)objectArray3, (long)3638594277050117288L, (long)l10);
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l10), (Object)string, (long)3896853000951639041L, (long)l10);
    }

    @Override
    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        int n11 = (Integer)objectArray[3];
        int n12 = (Integer)objectArray[4];
        long l11 = l10;
        long l12 = l11 ^ 0x3E0224440141L;
        long l13 = l11 ^ 0x4217F72B922L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l13;
        objectArray2[0] = this;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-4622131982749435735L, (long)l10);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lp5.b("e", (int)11899, (long)(0x48C097839CC1B4C3L ^ l10));
        objectArray3[4] = n12;
        objectArray3[3] = n11;
        objectArray3[2] = l12;
        objectArray3[1] = n10;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)this, (Object)objectArray3, (long)-4778337559753001233L, (long)l10);
    }

    @Override
    public String N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return lp5.b("e", (int)18733, (long)(0x19A6654EE74695DBL ^ l10));
    }

    public lp5(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x151694E51703L;
        super(n10, l11);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        n = new HashMap(13);
        long l10 = a ^ 0x6486078E6153L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[3];
        int n10 = 0;
        String string = "\u009e\u00f3H\u00fe\u00c8nG\u00e7\u007fg\u0013a\u00daUbm\u00aa#\n\u00d8MY\u00db\u0001(\u008b\u0002\u0006\u008c\u00feC#\u00dfJ%\u0085\u00adR\u00ab\u00e5\u00e13\u00c8m\u0013\u0083\u00c8\u00cc\u00cb\u00afe\u00a8\u00eb\u00f3\u00fe\u00dbJ\u00f4\u008e\u0004\u00cc\u00bc\u007f\u001fS@\u00d1\u00e2\u00b3`9\u007f\u001bS\u0088\u008b\u00f0\u00dd\u00030p\u00fa\u00f3\u00bc+\u00ad\u00b1?\u00a1X\u00f2v\u00f5\u009e\u0093\u00ab\u00a9p\u00f7\u00bdN\u00d6\u001ags\u00bd3\u00df\u009a<\u00a59\u0092\u0006\u00a4\u0017E\u00eaZ0\u0091R&\u00db[~d\u00f1\u00c7\u00ff";
        int n11 = "\u009e\u00f3H\u00fe\u00c8nG\u00e7\u007fg\u0013a\u00daUbm\u00aa#\n\u00d8MY\u00db\u0001(\u008b\u0002\u0006\u008c\u00feC#\u00dfJ%\u0085\u00adR\u00ab\u00e5\u00e13\u00c8m\u0013\u0083\u00c8\u00cc\u00cb\u00afe\u00a8\u00eb\u00f3\u00fe\u00dbJ\u00f4\u008e\u0004\u00cc\u00bc\u007f\u001fS@\u00d1\u00e2\u00b3`9\u007f\u001bS\u0088\u008b\u00f0\u00dd\u00030p\u00fa\u00f3\u00bc+\u00ad\u00b1?\u00a1X\u00f2v\u00f5\u009e\u0093\u00ab\u00a9p\u00f7\u00bdN\u00d6\u001ags\u00bd3\u00df\u009a<\u00a59\u0092\u0006\u00a4\u0017E\u00eaZ0\u0091R&\u00db[~d\u00f1\u00c7\u00ff".length();
        int n12 = 24;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = lp5.c(byArray3).intern();
            if ((n13 += n12) >= n11) {
                e = stringArray;
                k = new String[3];
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    private static String c(byte[] byArray) {
        int n10 = 0;
        int n11 = byArray.length;
        char[] cArray = new char[n11];
        for (int i10 = 0; i10 < n11; ++i10) {
            char c10;
            int n12 = 0xFF & byArray[i10];
            if (n12 < 192) {
                cArray[n10++] = (char)n12;
                continue;
            }
            if (n12 < 224) {
                c10 = (char)((char)(n12 & 0x1F) << 6);
                n12 = byArray[++i10];
                c10 = (char)(c10 | (char)(n12 & 0x3F));
                cArray[n10++] = c10;
                continue;
            }
            if (i10 >= n11 - 2) continue;
            c10 = (char)((char)(n12 & 0xF) << 12);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F) << 6);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F));
            cArray[n10++] = c10;
        }
        return new String(cArray, 0, n10);
    }

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x335A;
        if (k[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])n.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    n.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lp5", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e[n11].getBytes("ISO-8859-1");
            lp5.k[n11] = lp5.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lp5.b(n10, l10);
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
            throw new RuntimeException("com/zelix/lp5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lp5.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

