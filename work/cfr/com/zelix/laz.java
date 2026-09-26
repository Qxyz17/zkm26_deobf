/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fj;
import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lpc;
import com.zelix.lqu;
import com.zelix.ltv;
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

public class laz
extends l7t
implements fj {
    private ltv K;
    private static final long a = prr.a(-5297868046882809885L, 5673792626647471469L, MethodHandles.lookup().lookupClass()).a(261364525947916L);
    private static final String b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;

    @Override
    public void M(Object[] objectArray) {
        block5: {
            long l10;
            long l11;
            lqu lqu2;
            block4: {
                lmu lmu2 = (lmu)objectArray[0];
                lqu2 = (lqu)objectArray[1];
                l11 = (Long)objectArray[2];
                long l12 = l11;
                l10 = l12 ^ 0L;
                long l13 = l12 ^ 0x47526B4E5A06L;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l13;
                CallSite callSite = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l11);
                CallSite callSite2 = m44.a("h", (long)-6823249310977527178L, (long)l11);
                try {
                    try {
                        if (callSite2 != false) break block4;
                        if (callSite <= 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-5079767961280328453L, (long)l11);
                    }
                    m44.a("t", (Object)this, (ltv)((ltv)this.V(0)), (long)-4623937243901703032L, (long)l11);
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-5079767961280328453L, (long)l11);
                }
            }
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = l10;
            objectArray3[1] = lqu2;
            objectArray3[0] = this;
            m44.a("w", (Object)m44.a("v", (Object)this, (long)-4623937243901703032L, (long)l11), (Object)objectArray3, (long)-6856998191809611518L, (long)l11);
        }
    }

    @Override
    public int W(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (int)m44.a("p", (Object)((lpc)((Object)m44.a("q", (Object)this, (long)-7371748982460747190L, (long)l10))), (Object)objectArray2, (long)-8956320021576209384L, (long)l10);
    }

    @Override
    public String N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("u", (Object)((lpc)((Object)m44.a("t", (Object)this, (long)-1905289058653761929L, (long)l10))), (Object)objectArray2, (long)-332623466934055589L, (long)l10);
    }

    public laz(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x3B2C053A5CAEL;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
    }

    public ltv x(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("t", (Object)this, (long)3685714420289945722L, (long)l10);
    }

    public String A(Object[] objectArray) {
        StringBuilder stringBuilder;
        block2: {
            long l10;
            block3: {
                l10 = (Long)objectArray[0];
                long l11 = l10 = a ^ l10;
                long l12 = l11 ^ 0x2369ED79F185L;
                long l13 = l11 ^ 0x6AA2537D66BL;
                stringBuilder = new StringBuilder();
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l13;
                CallSite callSite = m44.a("r", (Object)this, (Object)objectArray2, (long)3932180559591656664L, (long)l10);
                CallSite callSite2 = m44.a("m", (long)3847762537699718563L, (long)l10);
                try {
                    stringBuilder.append(b);
                    stringBuilder.append((char)laz.a("m", (int)28445, (long)(0x4BE47E2F40D7DAE1L ^ l10)));
                    if (callSite2 == false) break block2;
                    if (callSite <= 0) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("m", (Object)n92, (long)3885559793682759830L, (long)l10);
                }
                ltv ltv2 = (ltv)this.V(0);
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l12;
                stringBuilder.append((String)((Object)m44.a("r", (Object)ltv2, (Object)objectArray3, (long)3879964665923307130L, (long)l10)));
            }
            stringBuilder.append((char)laz.a("m", (int)1742, (long)(0x64C25604CF1A3333L ^ l10)));
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x5AC959C00B13L;
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
        byte[] byArray3 = cipher.doFinal("\u000e\u000e\u00a1\u0000\\\u00f9r\u00e8\u0012\u00a2Z\u00990VV\u00f2".getBytes("ISO-8859-1"));
        b = laz.b(byArray3).intern();
        f = new HashMap(13);
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
        String string = "L^\u007f\u0099\u00ae\u0005\u00b7\u00fe2\u0004\u00b7P\u0085\u00f6\u00f2\u00b8";
        int n11 = "L^\u007f\u0099\u00ae\u0005\u00b7\u00fe2\u0004\u00b7P\u0085\u00f6\u00f2\u00b8".length();
        int n12 = 0;
        do {
            byte[] byArray6 = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            long l11 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n13] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n12 < n11);
        d = lArray;
        e = new Integer[2];
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0xC06;
        if (e[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = d[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/laz", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            laz.e[n11] = n12;
        }
        return e[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = laz.a(n10, l10);
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
            throw new RuntimeException("com/zelix/laz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(laz.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

