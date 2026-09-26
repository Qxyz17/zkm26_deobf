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
    private static final long a = prr.a((long)-2775801418875091375L, (long)6731169155424295822L, MethodHandles.lookup().lookupClass()).a(146280779521790L);
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
        long l4 = l2 ^ 0x1C733F60A4CDL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this;
        objectArray2[0] = l4;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-6404429268026509652L, (long)l);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lpn.b("g", (int)22994, (long)(0x5D4C6377740306C8L ^ l));
        objectArray3[4] = n3;
        objectArray3[3] = n2;
        objectArray3[2] = l3;
        objectArray3[1] = n;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-4778337559753001233L, (long)l);
    }

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return lpn.b("g", (int)19282, (long)(0x1159BBFB8388D204L ^ l));
    }

    public lpn(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x5D9D63CE6633L;
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
        String string = (String)((Object)m44.a("n", (Object)objectArray3, (long)3433008837598041604L, (long)l)) + (String)((Object)lpn.b("g", (int)17380, (long)(0x2A5032754150159CL ^ l)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l), (Object)string, (long)3896853000951639041L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        n = new HashMap(13);
        long l = a ^ 0x6F7A54C7FFA7L;
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
        String string = "\u00f2\u007f\u00a7/\u00cda\u00e2\u009a-\u0016\u00a7^\u009a\u00ed\u0086\u0097\u00a3-\u00cah&\u0014\u00cf\u0088\u001b8z\u001b\u00b3P\u00e1\u00a8\u00a4\u00c6\u0090\u00f89\u00f5\u00fc\u009aT\u00d7V\\\u00869\u0080\u0086\u009b*\u00b0Q:{\u008e\u0001\u00f5\u00e8\u001f\u00dc\u00a7k\u00a7\u00ac\u00ba\u00a2.\u001b\u00afd\u00d0T \u008e\u001f\u00c8-\"3%\u009e\u00cb\u000b\f\u00cc<&\u00f8Q%\u00e2E\u00c8\u008d\u00c5\u00b3\u00a5\u0006\u0016\u0084\u0098S$\u0082\u00dc8\u00c0;\u00f8\u00aao\u008f\u0084\u00dc\u0091\u00ba\u0087\u00ff\u00e7R\u00cb\u00d1\u00a0A^3\u000b\u0019\u007fh\u0000\u001f\u0014\u008d)\u00d5\u009eaL\u0004J\u001e\u00e2\u0080\\\u00d6\u00e2^\u0082'\u0019\u00ee\u00a2\u00ea\u0017\u00e5\u0006\u00bc\t\u00b5\u001b\u0003";
        int n2 = "\u00f2\u007f\u00a7/\u00cda\u00e2\u009a-\u0016\u00a7^\u009a\u00ed\u0086\u0097\u00a3-\u00cah&\u0014\u00cf\u0088\u001b8z\u001b\u00b3P\u00e1\u00a8\u00a4\u00c6\u0090\u00f89\u00f5\u00fc\u009aT\u00d7V\\\u00869\u0080\u0086\u009b*\u00b0Q:{\u008e\u0001\u00f5\u00e8\u001f\u00dc\u00a7k\u00a7\u00ac\u00ba\u00a2.\u001b\u00afd\u00d0T \u008e\u001f\u00c8-\"3%\u009e\u00cb\u000b\f\u00cc<&\u00f8Q%\u00e2E\u00c8\u008d\u00c5\u00b3\u00a5\u0006\u0016\u0084\u0098S$\u0082\u00dc8\u00c0;\u00f8\u00aao\u008f\u0084\u00dc\u0091\u00ba\u0087\u00ff\u00e7R\u00cb\u00d1\u00a0A^3\u000b\u0019\u007fh\u0000\u001f\u0014\u008d)\u00d5\u009eaL\u0004J\u001e\u00e2\u0080\\\u00d6\u00e2^\u0082'\u0019\u00ee\u00a2\u00ea\u0017\u00e5\u0006\u00bc\t\u00b5\u001b\u0003".length();
        int n3 = 72;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = lpn.c(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x76F9;
        if (k[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])lpn.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lpn.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lpn", exception);
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
            lpn.k[n2] = lpn.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lpn.b(n, l);
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
