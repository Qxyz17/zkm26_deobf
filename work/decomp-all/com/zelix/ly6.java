/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.i0;
import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
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

public abstract class ly6
extends l7t {
    private static final long a = prr.a((long)-4254315870978706126L, (long)6852600760545371614L, MethodHandles.lookup().lookupClass()).a(92722094076276L);
    private static final String e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    public String e(Object[] objectArray) {
        StringBuffer stringBuffer;
        block23: {
            int n;
            int n2;
            long l;
            block21: {
                int n3;
                int n4;
                CallSite callSite;
                long l2;
                block17: {
                    int n5;
                    block18: {
                        l = (Long)objectArray[0];
                        l2 = l ^ 0L;
                        stringBuffer = new StringBuffer();
                        callSite = m44.a("n", (long)-6782168670771776808L, (long)l);
                        n4 = this.r.length;
                        try {
                            try {
                                n5 = n4;
                                if (callSite != false) break block17;
                                if (n5 <= 1) break block18;
                            }
                            catch (n9 n92) {
                                throw m44.a("n", (Object)((Object)n92), (long)-4838448671621293751L, (long)l);
                            }
                            m44.a("q", (Object)stringBuffer, (char)ly6.a("s", (int)17409, (long)(0x471FF23293DD851EL ^ l)), (long)-6593698356192392654L, (long)l);
                        }
                        catch (n9 n93) {
                            throw m44.a("n", (Object)((Object)n93), (long)-4838448671621293751L, (long)l);
                        }
                    }
                    n5 = n3 = 0;
                }
                while (n3 < n4) {
                    CallSite callSite2;
                    block19: {
                        block20: {
                            block22: {
                                i0 i02 = (i0)this.r[n3];
                                try {
                                    try {
                                        try {
                                            Object[] objectArray2 = new Object[1];
                                            objectArray2[0] = l2;
                                            stringBuffer.append((String)((Object)m44.a("q", (Object)i02, (Object)objectArray2, (long)-6581495104713834516L, (long)l)));
                                            callSite2 = callSite;
                                            if (l <= 0L) break block19;
                                            if (callSite2 != false) break block20;
                                            n2 = n3;
                                            n = n4 - 1;
                                            if (l < 0L || callSite != false) break block21;
                                        }
                                        catch (n9 n94) {
                                            throw m44.a("n", (Object)((Object)n94), (long)-4838448671621293751L, (long)l);
                                        }
                                        if (n2 >= n) break block22;
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("n", (Object)((Object)n95), (long)-4838448671621293751L, (long)l);
                                    }
                                    stringBuffer.append(e);
                                }
                                catch (n9 n96) {
                                    throw m44.a("n", (Object)((Object)n96), (long)-4838448671621293751L, (long)l);
                                }
                            }
                            ++n3;
                        }
                        callSite2 = callSite;
                    }
                    if (callSite2 == false) continue;
                }
                if (l <= 0L) break block23;
                n2 = n4;
                n = 1;
            }
            try {
                if (n2 > n) {
                    m44.a("q", (Object)stringBuffer, (char)ly6.a("s", (int)18251, (long)(0x65977285DAC58655L ^ l)), (long)-6593698356192392654L, (long)l);
                }
            }
            catch (n9 n97) {
                throw m44.a("n", (Object)((Object)n97), (long)-4838448671621293751L, (long)l);
            }
        }
        return stringBuffer.toString();
    }

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x47526B4E5A06L;
        long l4 = l2 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object object = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l);
        CallSite callSite = m44.a("h", (long)-5113628074367501874L, (long)l);
        for (int i = 0; i < object; ++i) {
            lmu lmu3 = this.V(i);
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = l4;
            objectArray3[1] = lqu2;
            objectArray3[0] = this;
            m44.a("w", (Object)lmu3, (Object)objectArray3, (long)-6656114929610942631L, (long)l);
            if (callSite != false) continue;
        }
    }

    public ly6(long l, char c, int n) {
        long l2 = (l << 16 | (long)c << 48 >>> 48) ^ a;
        long l3 = l2 ^ 0x4F3255E3AB5EL;
        int n2 = (int)(l3 >>> 56);
        long l4 = l3 << 8 >>> 8;
        super((byte)n2, n, l4);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x132451B42BC1L;
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
        byte[] byArray3 = cipher.doFinal(")\u00f2\u00e6\u00daHJ\u00b0\u0087".getBytes("ISO-8859-1"));
        e = ly6.b(byArray3).intern();
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
        long[] lArray = new long[2];
        int n = 0;
        String string = "d\u00d5Fv\u00b6\u001a\u0097\u008f\u0089e 2\u00f1\u0007/\u00bd";
        int n2 = "d\u00d5Fv\u00b6\u001a\u0097\u008f\u0089e 2\u00f1\u0007/\u00bd".length();
        int n3 = 0;
        do {
            byte[] byArray6 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n3 < n2);
        f = lArray;
        g = new Integer[2];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7427;
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
                throw new RuntimeException("com/zelix/ly6", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ly6.g[n2] = n3;
        }
        return g[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ly6.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/ly6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ly6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
