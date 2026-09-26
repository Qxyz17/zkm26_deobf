/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
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
import javax.swing.Icon;
import javax.swing.JFileChooser;

public class lo1 {
    private JFileChooser p;
    private static final long a = prr.a(2600200191334140134L, 1466022810369496423L, MethodHandles.lookup().lookupClass()).a(105909048573777L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public static Icon p(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        CallSite callSite = m44.a("l", (long)-5853042939511373407L, (long)l10);
        try {
            CallSite callSite2;
            block4: {
                CallSite callSite3;
                block5: {
                    callSite3 = m44.a("l", (Object)lo1.a("s", (int)18042, (long)(0x77600F86C8E032DAL ^ l10)), (long)-6124399666707677166L, (long)l10);
                    try {
                        callSite2 = callSite3;
                        if (callSite == null) break block4;
                        if (callSite2 != null) break block5;
                    }
                    catch (Throwable throwable) {
                        throw m44.a("l", (Object)throwable, (long)-5841413804766761665L, (long)l10);
                    }
                    callSite3 = m44.a("l", (long)-6125761684384191851L, (long)l10);
                }
                callSite2 = callSite3;
            }
            return callSite2;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Icon W(Object[] objectArray) {
        CallSite callSite;
        File file = (File)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        CallSite callSite2 = m44.a("l", (long)-3502170408975638527L, (long)l10);
        try {
            callSite = m44.a("r", (Object)this, (long)-3461343948859234358L, (long)l10);
            if (callSite2 == null) return m44.a("s", (Object)callSite, (Object)file, (long)-3826721015506715336L, (long)l10);
            if (callSite == null) return null;
        }
        catch (Throwable throwable) {
            throw m44.a("l", (Object)throwable, (long)-3508519667459289953L, (long)l10);
        }
        try {
            callSite = m44.a("r", (Object)this, (long)-3461343948859234358L, (long)l10);
            return m44.a("s", (Object)callSite, (Object)file, (long)-3826721015506715336L, (long)l10);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return null;
    }

    public lo1(long l10) {
        l10 = a ^ l10;
        try {
            m44.a("v", (Object)this, (JFileChooser)new JFileChooser(), (long)734303526961930764L, (long)l10);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public static Icon l(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        CallSite callSite = m44.a("k", (long)-8146227308683976298L, (long)l10);
        try {
            CallSite callSite2;
            block4: {
                CallSite callSite3;
                block5: {
                    callSite3 = m44.a("k", (Object)lo1.a("s", (int)28230, (long)(0x5C12BDD28E093AD0L ^ l10)), (long)-8415297052233080795L, (long)l10);
                    try {
                        callSite2 = callSite3;
                        if (callSite == null) break block4;
                        if (callSite2 != null) break block5;
                    }
                    catch (Throwable throwable) {
                        throw m44.a("k", (Object)throwable, (long)-8153705489657541368L, (long)l10);
                    }
                    callSite3 = m44.a("k", (long)-7533796204549063047L, (long)l10);
                }
                callSite2 = callSite3;
            }
            return callSite2;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l10 = a ^ 0x636B5A3B1E13L;
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
        String[] stringArray = new String[2];
        int n10 = 0;
        String string = "\u00c8%:@E\u001f\u00ff\u00a3(\u00b9\u00fc\u00bfY&\u00e2,\u00a3\u009b\u001e8\u00ff\u0081\u00923M;\u00d9\u00beW5\u0011\u00a0\u0092\u00be4\u00d3f\u0001\u0089\u00e2\u0001J\u0014\u00e7\u00f0\u0003\u0098W8e\u00a4\u00af\u00c5\u00b6\u00b5\b\u0099\u00bal\u0087\fD\u00c9\u00833\u00cc5~\u001a\u00e7v\u00c0R\u00f7\u0084U\u00b2\u00f9,X\u00b4\u000e)=\u001d\r=9\u00dbQ\u00df\u0088Z+\u00e1\u008d\u0080=\u0019\u0085.\u00c9\u0019\u0084\u0015";
        int n11 = "\u00c8%:@E\u001f\u00ff\u00a3(\u00b9\u00fc\u00bfY&\u00e2,\u00a3\u009b\u001e8\u00ff\u0081\u00923M;\u00d9\u00beW5\u0011\u00a0\u0092\u00be4\u00d3f\u0001\u0089\u00e2\u0001J\u0014\u00e7\u00f0\u0003\u0098W8e\u00a4\u00af\u00c5\u00b6\u00b5\b\u0099\u00bal\u0087\fD\u00c9\u00833\u00cc5~\u001a\u00e7v\u00c0R\u00f7\u0084U\u00b2\u00f9,X\u00b4\u000e)=\u001d\r=9\u00dbQ\u00df\u0088Z+\u00e1\u008d\u0080=\u0019\u0085.\u00c9\u0019\u0084\u0015".length();
        int n12 = 48;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = lo1.a(byArray3).intern();
            if ((n13 += n12) >= n11) {
                b = stringArray;
                c = new String[2];
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static String a(byte[] byArray) {
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

    private static String a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x55A2;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lo1", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n11].getBytes("ISO-8859-1");
            lo1.c[n11] = lo1.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lo1.a(n10, l10);
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
            throw new RuntimeException("com/zelix/lo1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lo1.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

