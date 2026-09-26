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

public class lpn
extends lpm {
    private static final long a = prr.a(-2775801418875091375L, 6731169155424295822L, MethodHandles.lookup().lookupClass()).a(146280779521790L);
    private static final String[] e;
    private static final String[] k;
    private static final Map n;

    @Override
    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        int n11 = (Integer)objectArray[3];
        int n12 = (Integer)objectArray[4];
        long l11 = l10;
        long l12 = l11 ^ 0x3E0224440141L;
        long l13 = l11 ^ 0x1C733F60A4CDL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this;
        objectArray2[0] = l13;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-6404429268026509652L, (long)l10);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lpn.b("g", (int)22994, (long)(0x5D4C6377740306C8L ^ l10));
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
        return lpn.b("g", (int)19282, (long)(0x1159BBFB8388D204L ^ l10));
    }

    public lpn(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x5D9D63CE6633L;
        super(n10, l11);
    }

    @Override
    protected void l(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10;
        long l12 = l11 ^ 0x6DF7BA9051C2L;
        long l13 = l11 ^ 0x550B0FC6572DL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        CallSite callSite = m44.a("q", (Object)lqu2, (Object)objectArray2, (long)3638594277050117288L, (long)l10);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l13;
        String string = (String)((Object)m44.a("n", (Object)objectArray3, (long)3433008837598041604L, (long)l10)) + (String)((Object)lpn.b("g", (int)17380, (long)(0x2A5032754150159CL ^ l10)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l10), (Object)string, (long)3896853000951639041L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        n = new HashMap(13);
        long l10 = a ^ 0x6F7A54C7FFA7L;
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
        String string = "\u00f2\u007f\u00a7/\u00cda\u00e2\u009a-\u0016\u00a7^\u009a\u00ed\u0086\u0097\u00a3-\u00cah&\u0014\u00cf\u0088\u001b8z\u001b\u00b3P\u00e1\u00a8\u00a4\u00c6\u0090\u00f89\u00f5\u00fc\u009aT\u00d7V\\\u00869\u0080\u0086\u009b*\u00b0Q:{\u008e\u0001\u00f5\u00e8\u001f\u00dc\u00a7k\u00a7\u00ac\u00ba\u00a2.\u001b\u00afd\u00d0T \u008e\u001f\u00c8-\"3%\u009e\u00cb\u000b\f\u00cc<&\u00f8Q%\u00e2E\u00c8\u008d\u00c5\u00b3\u00a5\u0006\u0016\u0084\u0098S$\u0082\u00dc8\u00c0;\u00f8\u00aao\u008f\u0084\u00dc\u0091\u00ba\u0087\u00ff\u00e7R\u00cb\u00d1\u00a0A^3\u000b\u0019\u007fh\u0000\u001f\u0014\u008d)\u00d5\u009eaL\u0004J\u001e\u00e2\u0080\\\u00d6\u00e2^\u0082'\u0019\u00ee\u00a2\u00ea\u0017\u00e5\u0006\u00bc\t\u00b5\u001b\u0003";
        int n11 = "\u00f2\u007f\u00a7/\u00cda\u00e2\u009a-\u0016\u00a7^\u009a\u00ed\u0086\u0097\u00a3-\u00cah&\u0014\u00cf\u0088\u001b8z\u001b\u00b3P\u00e1\u00a8\u00a4\u00c6\u0090\u00f89\u00f5\u00fc\u009aT\u00d7V\\\u00869\u0080\u0086\u009b*\u00b0Q:{\u008e\u0001\u00f5\u00e8\u001f\u00dc\u00a7k\u00a7\u00ac\u00ba\u00a2.\u001b\u00afd\u00d0T \u008e\u001f\u00c8-\"3%\u009e\u00cb\u000b\f\u00cc<&\u00f8Q%\u00e2E\u00c8\u008d\u00c5\u00b3\u00a5\u0006\u0016\u0084\u0098S$\u0082\u00dc8\u00c0;\u00f8\u00aao\u008f\u0084\u00dc\u0091\u00ba\u0087\u00ff\u00e7R\u00cb\u00d1\u00a0A^3\u000b\u0019\u007fh\u0000\u001f\u0014\u008d)\u00d5\u009eaL\u0004J\u001e\u00e2\u0080\\\u00d6\u00e2^\u0082'\u0019\u00ee\u00a2\u00ea\u0017\u00e5\u0006\u00bc\t\u00b5\u001b\u0003".length();
        int n12 = 72;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = lpn.c(byArray3).intern();
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x76F9;
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
                throw new RuntimeException("com/zelix/lpn", exception);
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
            lpn.k[n11] = lpn.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lpn.b(n10, l10);
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
            throw new RuntimeException("com/zelix/lpn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lpn.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

