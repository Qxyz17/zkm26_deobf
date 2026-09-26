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
    private static final long a = prr.a(-4254315870978706126L, 6852600760545371614L, MethodHandles.lookup().lookupClass()).a(92722094076276L);
    private static final String e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    public String e(Object[] objectArray) {
        StringBuffer stringBuffer;
        block23: {
            int n10;
            int n11;
            long l10;
            block21: {
                int n12;
                int n13;
                CallSite callSite;
                long l11;
                block17: {
                    int n14;
                    block18: {
                        l10 = (Long)objectArray[0];
                        l11 = l10 ^ 0L;
                        stringBuffer = new StringBuffer();
                        callSite = m44.a("n", (long)-6782168670771776808L, (long)l10);
                        n13 = this.r.length;
                        try {
                            try {
                                n14 = n13;
                                if (callSite != false) break block17;
                                if (n14 <= 1) break block18;
                            }
                            catch (n9 n92) {
                                throw m44.a("n", (Object)n92, (long)-4838448671621293751L, (long)l10);
                            }
                            m44.a("q", (Object)stringBuffer, (char)ly6.a("s", (int)17409, (long)(0x471FF23293DD851EL ^ l10)), (long)-6593698356192392654L, (long)l10);
                        }
                        catch (n9 n93) {
                            throw m44.a("n", (Object)n93, (long)-4838448671621293751L, (long)l10);
                        }
                    }
                    n14 = n12 = 0;
                }
                while (n12 < n13) {
                    CallSite callSite2;
                    block19: {
                        block20: {
                            block22: {
                                i0 i02 = (i0)((Object)this.r[n12]);
                                try {
                                    try {
                                        try {
                                            Object[] objectArray2 = new Object[1];
                                            objectArray2[0] = l11;
                                            stringBuffer.append((String)((Object)m44.a("q", (Object)i02, (Object)objectArray2, (long)-6581495104713834516L, (long)l10)));
                                            callSite2 = callSite;
                                            if (l10 <= 0L) break block19;
                                            if (callSite2 != false) break block20;
                                            n11 = n12;
                                            n10 = n13 - 1;
                                            if (l10 < 0L || callSite != false) break block21;
                                        }
                                        catch (n9 n94) {
                                            throw m44.a("n", (Object)n94, (long)-4838448671621293751L, (long)l10);
                                        }
                                        if (n11 >= n10) break block22;
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("n", (Object)n95, (long)-4838448671621293751L, (long)l10);
                                    }
                                    stringBuffer.append(e);
                                }
                                catch (n9 n96) {
                                    throw m44.a("n", (Object)n96, (long)-4838448671621293751L, (long)l10);
                                }
                            }
                            ++n12;
                        }
                        callSite2 = callSite;
                    }
                    if (callSite2 == false) continue;
                }
                if (l10 <= 0L) break block23;
                n11 = n13;
                n10 = 1;
            }
            try {
                if (n11 > n10) {
                    m44.a("q", (Object)stringBuffer, (char)ly6.a("s", (int)18251, (long)(0x65977285DAC58655L ^ l10)), (long)-6593698356192392654L, (long)l10);
                }
            }
            catch (n9 n97) {
                throw m44.a("n", (Object)n97, (long)-4838448671621293751L, (long)l10);
            }
        }
        return stringBuffer.toString();
    }

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0x47526B4E5A06L;
        long l13 = l11 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        Object object = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l10);
        CallSite callSite = m44.a("h", (long)-5113628074367501874L, (long)l10);
        for (int i10 = 0; i10 < object; ++i10) {
            lmu lmu3 = this.V(i10);
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = l13;
            objectArray3[1] = lqu2;
            objectArray3[0] = this;
            m44.a("w", (Object)lmu3, (Object)objectArray3, (long)-6656114929610942631L, (long)l10);
            if (callSite != false) continue;
        }
    }

    public ly6(long l10, char c10, int n10) {
        long l11 = (l10 << 16 | (long)c10 << 48 >>> 48) ^ a;
        long l12 = l11 ^ 0x4F3255E3AB5EL;
        int n11 = (int)(l12 >>> 56);
        long l13 = l12 << 8 >>> 8;
        super((byte)n11, n10, l13);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x132451B42BC1L;
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
        byte[] byArray3 = cipher.doFinal(")\u00f2\u00e6\u00daHJ\u00b0\u0087".getBytes("ISO-8859-1"));
        e = ly6.b(byArray3).intern();
        h = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l10 >>> 56);
        for (int i11 = 1; i11 < 8; ++i11) {
            byArray5 = byArray5;
            byArray5[i11] = (byte)(l10 << i11 * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "d\u00d5Fv\u00b6\u001a\u0097\u008f\u0089e 2\u00f1\u0007/\u00bd";
        int n11 = "d\u00d5Fv\u00b6\u001a\u0097\u008f\u0089e 2\u00f1\u0007/\u00bd".length();
        int n12 = 0;
        do {
            byte[] byArray6 = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            long l11 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n13] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n12 < n11);
        f = lArray;
        g = new Integer[2];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
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

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x7427;
        if (g[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = f[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l12, objectArray);
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
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ly6.g[n11] = n12;
        }
        return g[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = ly6.a(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
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

