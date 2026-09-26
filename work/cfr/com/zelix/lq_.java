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

public class lq_
extends lqo {
    private static String g;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    @Override
    public String x(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return m44.a("n", (long)1041031057979415837L, (long)l10);
    }

    @Override
    public boolean accept(File file) {
        Object object;
        block22: {
            block23: {
                CallSite callSite;
                long l10;
                block20: {
                    String string;
                    long l11;
                    block21: {
                        block18: {
                            block19: {
                                block16: {
                                    long l12;
                                    block17: {
                                        long l13 = l10 = b ^ 0x42E9C41AE647L;
                                        l12 = l13 ^ 0x1F840F20A863L;
                                        l11 = l13 ^ 0x5F6D3A6B12DDL;
                                        string = ((String)((Object)m44.a("w", (Object)file, (long)243404879312940984L, (long)l10))).toLowerCase();
                                        callSite = m44.a("h", (long)1948142243668336526L, (long)l10);
                                        try {
                                            try {
                                                object = m44.a("w", (Object)file, (long)1806049219946926698L, (long)l10);
                                                if (callSite != null) break block16;
                                                if (object == false) break block17;
                                            }
                                            catch (n9 n92) {
                                                throw m44.a("h", (Object)n92, (long)66556045661828428L, (long)l10);
                                            }
                                            return true;
                                        }
                                        catch (n9 n93) {
                                            throw m44.a("h", (Object)n93, (long)66556045661828428L, (long)l10);
                                        }
                                    }
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = m44.a("w", (Object)file, (long)243404879312940984L, (long)l10);
                                    objectArray[0] = l12;
                                    object = m44.a("h", (Object)objectArray, (long)2098912573559501882L, (long)l10);
                                }
                                try {
                                    try {
                                        if (callSite != null) break block18;
                                        if (object == false) break block19;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("h", (Object)n94, (long)66556045661828428L, (long)l10);
                                    }
                                    return true;
                                }
                                catch (n9 n95) {
                                    throw m44.a("h", (Object)n95, (long)66556045661828428L, (long)l10);
                                }
                            }
                            object = string.endsWith((String)((Object)lq_.a("z", (int)24777, (long)(0x6A3410BFB10C6FADL ^ l10))));
                        }
                        try {
                            try {
                                if (callSite != null) break block20;
                                if (object == false) break block21;
                            }
                            catch (n9 n96) {
                                throw m44.a("h", (Object)n96, (long)66556045661828428L, (long)l10);
                            }
                            return true;
                        }
                        catch (n9 n97) {
                            throw m44.a("h", (Object)n97, (long)66556045661828428L, (long)l10);
                        }
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = string;
                    objectArray[0] = l11;
                    object = m44.a("h", (Object)objectArray, (long)327377551213027692L, (long)l10);
                }
                try {
                    try {
                        if (callSite != null) break block22;
                        if (object == false) break block23;
                    }
                    catch (n9 n98) {
                        throw m44.a("h", (Object)n98, (long)66556045661828428L, (long)l10);
                    }
                    return true;
                }
                catch (n9 n99) {
                    throw m44.a("h", (Object)n99, (long)66556045661828428L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = prr.a(1004088158800329182L, -2638803277855778096L, MethodHandles.lookup().lookupClass()).a(57523659276134L);
        long l10 = b ^ 0x6E1A2A312F05L;
        e = new HashMap(13);
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
        String string = ";:=\u008e\u00d2\u00a1\r\u00e6\u00de\u00a4\u00b2K\u008d\u00ae\u00e2c@g\u00be\u00a1\u00f8\u001cq.D\u009b\u00e13\u008d\n\u001e\u0003\u00acb\u0085\u00ca\u00bbpw|&\u00bc\u00f6y\n\u00ff9dHqT\u000e4\u00a8\u00cf\u0004\u00a3\u00a5\u00eb\u008d\u0010\u00c1\u00abk\u00a3\u00ce\u00eaf\u007f\u00b9C\u00af\u0014B\u001a\u0099\u0096a\u00a351";
        int n11 = ";:=\u008e\u00d2\u00a1\r\u00e6\u00de\u00a4\u00b2K\u008d\u00ae\u00e2c@g\u00be\u00a1\u00f8\u001cq.D\u009b\u00e13\u008d\n\u001e\u0003\u00acb\u0085\u00ca\u00bbpw|&\u00bc\u00f6y\n\u00ff9dHqT\u000e4\u00a8\u00cf\u0004\u00a3\u00a5\u00eb\u008d\u0010\u00c1\u00abk\u00a3\u00ce\u00eaf\u007f\u00b9C\u00af\u0014B\u001a\u0099\u0096a\u00a351".length();
        int n12 = 16;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = lq_.a(byArray3).intern();
            if ((n13 += n12) >= n11) {
                c = stringArray;
                d = new String[2];
                m44.a("i", (String)((Object)lq_.a("z", (int)24316, (long)(0x28EB1C07DAB518DBL ^ l10))), (long)-3829621698153424459L, (long)l10);
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x1933;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lq_", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n11].getBytes("ISO-8859-1");
            lq_.d[n11] = lq_.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lq_.a(n10, l10);
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
            throw new RuntimeException("com/zelix/lq_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lq_.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

