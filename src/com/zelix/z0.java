/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class z0 {
    private final MessageDigest s;
    private byte[] b;
    private static final long a = prr.a((long)5758069248630416404L, (long)-1879911966642237805L, MethodHandles.lookup().lookupClass()).a(84164442321240L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    public z0(long l, int n, BufferedInputStream bufferedInputStream) {
        long l2 = (l << 32 | (long)n << 32 >>> 32) ^ a;
        long l3 = l2 ^ 0x130CE5253C6L;
        this.s = m44.a("i", (Object)z0.a("r", (int)1450, (long)(0x26AAFE0688DE932DL ^ l2)), (long)-6702160071070659738L, (long)l2);
        Object[] objectArray = new Object[2];
        objectArray[1] = bufferedInputStream;
        objectArray[0] = l3;
        m44.a("h", (Object)this, (Object)objectArray, (long)-4923649922384610213L, (long)l2);
    }

    public z0(long l, String string) {
        block9: {
            BufferedInputStream bufferedInputStream;
            block6: {
                long l2 = (l = a ^ l) ^ 0x4ECAAEA44218L;
                CallSite callSite = m44.a("o", (long)-5766492787698060849L, (long)l);
                CallSite callSite2 = callSite;
                this.s = m44.a("o", (Object)z0.a("r", (int)6077, (long)(0x4DA9D6317E9690E5L ^ l)), (long)-5538465371667768648L, (long)l);
                BufferedInputStream bufferedInputStream2 = null;
                try {
                    bufferedInputStream2 = new BufferedInputStream(new FileInputStream(string), (int)z0.b("d", (int)16057, (long)(0xC20F4107F9881F5L ^ l)));
                    Object[] objectArray = new Object[2];
                    objectArray[1] = bufferedInputStream2;
                    objectArray[0] = l2;
                    m44.a("n", (Object)this, (Object)objectArray, (long)-6163772570533057147L, (long)l);
                    bufferedInputStream = bufferedInputStream2;
                    if (callSite2 != null) break block6;
                }
                catch (Throwable throwable) {
                    block8: {
                        BufferedInputStream bufferedInputStream3;
                        block7: {
                            try {
                                bufferedInputStream3 = bufferedInputStream2;
                                if (callSite2 != null) break block7;
                                if (bufferedInputStream3 == null) break block8;
                            }
                            catch (n9 n92) {
                                throw m44.a("o", (Object)((Object)n92), (long)-5564391829703844471L, (long)l);
                            }
                            bufferedInputStream3 = bufferedInputStream2;
                        }
                        m44.a("p", bufferedInputStream3, (long)-5388726833427064851L, (long)l);
                    }
                    throw throwable;
                }
                if (bufferedInputStream == null) break block9;
                bufferedInputStream = bufferedInputStream2;
            }
            m44.a("p", (Object)bufferedInputStream, (long)-5388726833427064851L, (long)l);
        }
    }

    public byte[] g(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (byte[])m44.a("u", (Object)this, (long)-3800236409286764502L, (long)l).clone();
    }

    public String p(Object[] objectArray) {
        String string;
        block7: {
            long l = (Long)objectArray[0];
            long l2 = (l = a ^ l) ^ 0x1A943649E7AFL;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            CallSite callSite = m44.a("w", (Object)this, (Object)objectArray2, (long)5637566082937168698L, (long)l);
            StringBuilder stringBuilder = new StringBuilder();
            int n = 0;
            CallSite callSite2 = m44.a("h", (long)6086154588421179968L, (long)l);
            while (n < ((CallSite)callSite).length) {
                CallSite callSite3;
                block5: {
                    block6: {
                        String string2;
                        block8: {
                            string2 = Integer.toHexString(callSite[n] & z0.b("d", (int)589, (long)(0x10D436663151468CL ^ l)));
                            try {
                                try {
                                    callSite3 = callSite2;
                                    if (l < 0L) break block5;
                                    if (callSite3 != null) break block6;
                                    string = string2;
                                    if (callSite2 != null) break block7;
                                }
                                catch (n9 n92) {
                                    throw m44.a("h", (Object)((Object)n92), (long)5280575128650409478L, (long)l);
                                }
                                if (string.length() != 1) break block8;
                            }
                            catch (n9 n93) {
                                throw m44.a("h", (Object)((Object)n93), (long)5280575128650409478L, (long)l);
                            }
                            string2 = "0" + string2;
                        }
                        stringBuilder.append(string2);
                        ++n;
                    }
                    callSite3 = callSite2;
                }
                if (callSite3 == null) continue;
            }
            string = stringBuilder.toString();
        }
        return string;
    }

    private void E(Object[] objectArray) {
        long l = (Long)objectArray[0];
        BufferedInputStream bufferedInputStream = (BufferedInputStream)objectArray[1];
        l = a ^ l;
        byte[] byArray = new byte[z0.b("d", (int)28326, (long)(0x5183B395CF5575EDL ^ l))];
        CallSite callSite = m44.a("k", (long)-8359488110292855349L, (long)l);
        block0: while (true) {
            CallSite callSite2;
            if ((callSite2 = m44.a("t", (Object)bufferedInputStream, (Object)byArray, (long)-8628690300726673131L, (long)l)) > 0) {
                m44.a("t", (Object)m44.a("u", (Object)this, (long)-7508035096422496483L, (long)l), (Object)byArray, (int)0, (int)callSite2, (long)-8125968403184213542L, (long)l);
            }
            do {
                if (callSite2 != -1) continue block0;
                m44.a("t", (Object)bufferedInputStream, (long)-7984026750127049751L, (long)l);
                m44.a("w", (Object)this, (byte[])m44.a("t", (Object)m44.a("u", (Object)this, (long)-7508035096422496483L, (long)l), (long)-8492383192423122444L, (long)l), (long)-7675649686655760878L, (long)l);
            } while (l < 0L || callSite != null);
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l = a ^ 0x2642A8A8FE4EL;
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
        String string = "O\\\u007f\u0019\u00b3\u00df\u0098\u00a9\u00c7\u00ab#\u00b6\u00df\u009a\u00c3I\u0010_\u0089\u00d2!\u00d7\u00a9if\u00ba\u009b&?\\i\u001f\u008d";
        int n2 = "O\\\u007f\u0019\u00b3\u00df\u0098\u00a9\u00c7\u00ab#\u00b6\u00df\u009a\u00c3I\u0010_\u0089\u00d2!\u00d7\u00a9if\u00ba\u009b&?\\i\u001f\u008d".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = z0.a(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        c = stringArray;
        d = new String[2];
        h = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray5 = byArray5;
            byArray5[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n6 = 0;
        String string2 = "\u0090(\u00e9\u0000G\u00d1\u00c56\u00bf{\u00c8\u00a0\u00fd\u00d7\u00a49\u009c\u00c8+\u008b\u00a8j#`";
        int n7 = "\u0090(\u00e9\u0000G\u00d1\u00c56\u00bf{\u00c8\u00a0\u00fd\u00d7\u00a49\u009c\u00c8+\u008b\u00a8j#`".length();
        int n8 = 0;
        do {
            byte[] byArray6 = string2.substring(n8, n8 += 8).getBytes("ISO-8859-1");
            int n10 = n6++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n10] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n8 < n7);
        f = lArray;
        g = new Integer[3];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x26E1;
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
                throw new RuntimeException("com/zelix/z0", exception);
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
            z0.d[n2] = z0.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = z0.a(n, l);
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
            throw new RuntimeException("com/zelix/z0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1EF6;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/z0", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            z0.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = z0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/z0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(z0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(z0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
