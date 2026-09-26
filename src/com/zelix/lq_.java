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

    public String x(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("n", (long)1041031057979415837L, (long)l);
    }

    public boolean accept(File file) {
        Object object;
        block22: {
            block23: {
                CallSite callSite;
                long l;
                block20: {
                    String string;
                    long l2;
                    block21: {
                        block18: {
                            block19: {
                                block16: {
                                    long l3;
                                    block17: {
                                        long l4 = l = b ^ 0x42E9C41AE647L;
                                        l3 = l4 ^ 0x1F840F20A863L;
                                        l2 = l4 ^ 0x5F6D3A6B12DDL;
                                        string = ((String)((Object)m44.a("w", (Object)file, (long)243404879312940984L, (long)l))).toLowerCase();
                                        callSite = m44.a("h", (long)1948142243668336526L, (long)l);
                                        try {
                                            try {
                                                object = m44.a("w", (Object)file, (long)1806049219946926698L, (long)l);
                                                if (callSite != null) break block16;
                                                if (object == false) break block17;
                                            }
                                            catch (n9 n92) {
                                                throw m44.a("h", (Object)((Object)n92), (long)66556045661828428L, (long)l);
                                            }
                                            return true;
                                        }
                                        catch (n9 n93) {
                                            throw m44.a("h", (Object)((Object)n93), (long)66556045661828428L, (long)l);
                                        }
                                    }
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = m44.a("w", (Object)file, (long)243404879312940984L, (long)l);
                                    objectArray[0] = l3;
                                    object = m44.a("h", (Object)objectArray, (long)2098912573559501882L, (long)l);
                                }
                                try {
                                    try {
                                        if (callSite != null) break block18;
                                        if (object == false) break block19;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("h", (Object)((Object)n94), (long)66556045661828428L, (long)l);
                                    }
                                    return true;
                                }
                                catch (n9 n95) {
                                    throw m44.a("h", (Object)((Object)n95), (long)66556045661828428L, (long)l);
                                }
                            }
                            object = string.endsWith((String)((Object)lq_.a("z", (int)24777, (long)(0x6A3410BFB10C6FADL ^ l))));
                        }
                        try {
                            try {
                                if (callSite != null) break block20;
                                if (object == false) break block21;
                            }
                            catch (n9 n96) {
                                throw m44.a("h", (Object)((Object)n96), (long)66556045661828428L, (long)l);
                            }
                            return true;
                        }
                        catch (n9 n97) {
                            throw m44.a("h", (Object)((Object)n97), (long)66556045661828428L, (long)l);
                        }
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = string;
                    objectArray[0] = l2;
                    object = m44.a("h", (Object)objectArray, (long)327377551213027692L, (long)l);
                }
                try {
                    try {
                        if (callSite != null) break block22;
                        if (object == false) break block23;
                    }
                    catch (n9 n98) {
                        throw m44.a("h", (Object)((Object)n98), (long)66556045661828428L, (long)l);
                    }
                    return true;
                }
                catch (n9 n99) {
                    throw m44.a("h", (Object)((Object)n99), (long)66556045661828428L, (long)l);
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
        b = prr.a((long)1004088158800329182L, (long)-2638803277855778096L, MethodHandles.lookup().lookupClass()).a(57523659276134L);
        long l = b ^ 0x6E1A2A312F05L;
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
        String string = ";:=\u008e\u00d2\u00a1\r\u00e6\u00de\u00a4\u00b2K\u008d\u00ae\u00e2c@g\u00be\u00a1\u00f8\u001cq.D\u009b\u00e13\u008d\n\u001e\u0003\u00acb\u0085\u00ca\u00bbpw|&\u00bc\u00f6y\n\u00ff9dHqT\u000e4\u00a8\u00cf\u0004\u00a3\u00a5\u00eb\u008d\u0010\u00c1\u00abk\u00a3\u00ce\u00eaf\u007f\u00b9C\u00af\u0014B\u001a\u0099\u0096a\u00a351";
        int n2 = ";:=\u008e\u00d2\u00a1\r\u00e6\u00de\u00a4\u00b2K\u008d\u00ae\u00e2c@g\u00be\u00a1\u00f8\u001cq.D\u009b\u00e13\u008d\n\u001e\u0003\u00acb\u0085\u00ca\u00bbpw|&\u00bc\u00f6y\n\u00ff9dHqT\u000e4\u00a8\u00cf\u0004\u00a3\u00a5\u00eb\u008d\u0010\u00c1\u00abk\u00a3\u00ce\u00eaf\u007f\u00b9C\u00af\u0014B\u001a\u0099\u0096a\u00a351".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = lq_.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                c = stringArray;
                d = new String[2];
                m44.a("i", (String)((Object)lq_.a("z", (int)24316, (long)(0x28EB1C07DAB518DBL ^ l))), (long)-3829621698153424459L, (long)l);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1933;
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
                throw new RuntimeException("com/zelix/lq_", exception);
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
            lq_.d[n2] = lq_.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lq_.a(n, l);
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
