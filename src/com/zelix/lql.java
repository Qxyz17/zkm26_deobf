/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lqo;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.io.File;
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

public class lql
extends lqo {
    private static String F;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = prr.a((long)6396484583104372533L, (long)1935771602817413115L, MethodHandles.lookup().lookupClass()).a(68007590381046L);
        long l = b ^ 0x36EF6C98A4AEL;
        e = new HashMap(13);
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
        String string = "\u00bcow\u00d1F\u000b\u00b8\u00a9{\u001fV\u008a\u00f4l\n\u00c0\u00bc\u0007M/\u00e1M\u0080\u00a9\u00f2\tCh\u0012\u00bd\u00a8\u0099n%$\u00d8\u001d\"\u00bb(\u0010\u00e59\u00bd\u00860\u00d5\u00e0an\u00da\u00cc\u00ceg\u009a~\u00f3";
        int n2 = "\u00bcow\u00d1F\u000b\u00b8\u00a9{\u001fV\u008a\u00f4l\n\u00c0\u00bc\u0007M/\u00e1M\u0080\u00a9\u00f2\tCh\u0012\u00bd\u00a8\u0099n%$\u00d8\u001d\"\u00bb(\u0010\u00e59\u00bd\u00860\u00d5\u00e0an\u00da\u00cc\u00ceg\u009a~\u00f3".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = lql.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                c = stringArray;
                d = new String[2];
                m44.a("j", (String)((Object)lql.a("x", (int)11142, (long)(0x1D20F08903C75F22L ^ l))), (long)6601317633598361875L, (long)l);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public boolean accept(File file) {
        Object object;
        block6: {
            block8: {
                block7: {
                    long l = b ^ 0x7EF3A610D7E9L;
                    CallSite callSite = m44.a("n", (long)3773818802920272088L, (long)l);
                    try {
                        try {
                            try {
                                object = m44.a("q", (Object)file, (long)3910845256123743548L, (long)l);
                                if (callSite != null) break block6;
                                if (object != false) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("n", (Object)((Object)n92), (long)3130938067713327122L, (long)l);
                            }
                            object = ((String)((Object)m44.a("q", (Object)file, (long)3185947413101887726L, (long)l))).endsWith((String)((Object)lql.a("x", (int)20735, (long)(0x7DCC87524848571DL ^ l))));
                            if (callSite != null) break block6;
                        }
                        catch (n9 n93) {
                            throw m44.a("n", (Object)((Object)n93), (long)3130938067713327122L, (long)l);
                        }
                        if (object == false) break block8;
                    }
                    catch (n9 n94) {
                        throw m44.a("n", (Object)((Object)n94), (long)3130938067713327122L, (long)l);
                    }
                }
                object = true;
                break block6;
            }
            object = false;
        }
        return (boolean)object;
    }

    public String x(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("n", (long)749710655776375016L, (long)l);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3EE2;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lql", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            lql.d[n2] = lql.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lql.a(n, l);
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
            throw new RuntimeException("com/zelix/lql" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lql.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
