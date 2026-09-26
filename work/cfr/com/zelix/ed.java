/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
import com.zelix.df;
import com.zelix.fr;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.nl;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ed {
    private final int v;
    Map B;
    private final int h;
    private static final long a = prr.a(-8466262024773491099L, 6180324234683203909L, MethodHandles.lookup().lookupClass()).a(26892097015609L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public Set W(Object[] objectArray) {
        df df2;
        long l10;
        Object object;
        block4: {
            df df3;
            block5: {
                Object object2 = objectArray[0];
                long l11 = (Long)objectArray[1];
                object = objectArray[2];
                l10 = (l11 = a ^ l11) ^ 0x4D517C4436E1L;
                df3 = (df)this.B.get(object2);
                CallSite callSite = m44.a("k", (long)-518658856118458629L, (long)l11);
                try {
                    try {
                        df2 = df3;
                        if (callSite != null) break block4;
                        if (df2 != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)-246357263205612602L, (long)l11);
                    }
                    return null;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)-246357263205612602L, (long)l11);
                }
            }
            df2 = df3;
        }
        return df2.J(l10, object);
    }

    public ed(long l10, int n10, int n11) {
        long l11 = (l10 = a ^ l10) ^ 0x64E5573C9A19L;
        this(n10, l11, n11, (int)ed.a("s", (int)27440, (long)(0x57BCA30AA17D2A8L ^ l10)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public df s(Object[] objectArray) {
        df df2;
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x267BF214A6E4L;
        long l13 = l12 >>> 16;
        int n10 = (int)(l12 << 48 >>> 48);
        long l14 = l11 ^ 0x22C2C6BB69C9L;
        long l15 = l11 ^ 0x72B01A16FF0CL;
        df df3 = new df(this.B.size(), l14);
        Iterator iterator = m44.a("r", (Object)this, (Object)new Object[0], (long)1244424283776254858L, (long)l10).iterator();
        CallSite callSite = m44.a("m", (long)811550235327337845L, (long)l10);
        block0: while (iterator.hasNext()) {
            CallSite callSite2;
            Map.Entry entry = (Map.Entry)iterator.next();
            Object k10 = entry.getKey();
            Object object = entry.getValue();
            block1: while (true) {
                df df4;
                df2 = df4 = (df)object;
                if (callSite != null) return df2;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l15;
                Iterator iterator2 = m44.a("r", (Object)df2, (Object)objectArray2, (long)622867602190538362L, (long)l10).iterator();
                block2: while (iterator2.hasNext()) {
                    callSite2 = iterator2.next();
                    do {
                        CallSite callSite3 = callSite2;
                        df3.L(l13, (char)n10, k10, callSite3);
                        if (callSite != null) continue block0;
                        object = callSite;
                        if (l10 <= 0L) continue block1;
                        if (object == null) continue block2;
                        callSite2 = callSite;
                    } while (l10 <= 0L);
                }
                break;
            }
            if (callSite2 == null) continue;
        }
        df2 = df3;
        return df2;
    }

    public boolean N(Object object, long l10, Object object2, Object object3) {
        df df2;
        int n10;
        long l11;
        block2: {
            df df3;
            block3: {
                long l12 = l10 = a ^ l10;
                long l13 = l12 ^ 0x6FB6C39623DBL;
                int n11 = (int)(l13 >>> 32);
                int n12 = (int)(l13 << 32 >>> 48);
                int n13 = (int)(l13 << 48 >>> 48);
                long l14 = l12 ^ 0xED2D2A6EDB0L;
                l11 = l14 >>> 16;
                n10 = (int)(l14 << 48 >>> 48);
                df3 = (df)this.B.get(object);
                CallSite callSite = m44.a("i", (long)4618190774425640481L, (long)l10);
                try {
                    df2 = df3;
                    if (callSite != null) break block2;
                    if (df2 != null) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("i", (Object)n92, (long)4922018579233667868L, (long)l10);
                }
                df3 = new df((int)m44.a("w", (Object)this, (long)4796367836565690772L, (long)l10), (int)m44.a("w", (Object)this, (long)6835824392195332873L, (long)l10), n11, (short)n12, (short)n13);
                boolean bl2 = df3.L(l11, (char)n10, object2, object3);
                this.B.put(object, df3);
                return bl2;
            }
            df2 = df3;
        }
        return df2.L(l11, (char)n10, object2, object3);
    }

    public Set P(Object[] objectArray) {
        return this.B.entrySet();
    }

    public df O(Object[] objectArray) {
        Object object = objectArray[0];
        return (df)this.B.get(object);
    }

    public nl z(Object[] objectArray) {
        Object object;
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x5FC7CCC0CF8EL;
        long l13 = l11 ^ 0x78DF68064562L;
        fr fr2 = new fr(l12, this.B.size() * 2);
        Iterator iterator = m44.a("s", (Object)this, (Object)new Object[0], (long)-9141100532765092885L, (long)l10).iterator();
        CallSite callSite = m44.a("l", (long)-7268131854661745388L, (long)l10);
        block0: while (true) {
            Iterator iterator2 = iterator;
            block1: while (iterator2.hasNext()) {
                object = iterator.next();
                do {
                    CallSite callSite2;
                    Map.Entry entry = (Map.Entry)object;
                    df df2 = (df)entry.getValue();
                    Iterator iterator3 = m44.a("s", (Object)df2, (Object)new Object[0], (long)-8798721246702539608L, (long)l10).iterator();
                    block3: while (iterator3.hasNext()) {
                        callSite2 = iterator3.next();
                        do {
                            CallSite callSite3;
                            Map.Entry entry2 = (Map.Entry)((Object)callSite2);
                            Object object2 = entry2.getValue();
                            block5: while (true) {
                                iterator2 = ((Set)object2).iterator();
                                if (callSite != null) continue block1;
                                Iterator iterator4 = iterator2;
                                block6: while (iterator4.hasNext()) {
                                    callSite3 = iterator4.next();
                                    do {
                                        CallSite callSite4 = callSite3;
                                        fr2.T(l13, entry.getKey(), entry2.getKey(), callSite4);
                                        if (callSite != null) continue block3;
                                        object2 = callSite;
                                        if (l10 <= 0L) continue block5;
                                        if (object2 == null) continue block6;
                                        callSite3 = callSite;
                                    } while (l10 < 0L);
                                }
                                break;
                            }
                            if (callSite3 == null) continue block3;
                            callSite2 = callSite;
                        } while (l10 < 0L);
                    }
                    if (callSite2 == null) continue block0;
                    object = new nl(fr2);
                } while (l10 <= 0L);
            }
            break;
        }
        return object;
    }

    public ed(int n10, long l10) {
        long l11 = ((long)n10 << 32 | l10 << 32 >>> 32) ^ a;
        long l12 = l11 ^ 0x690F8DE513D1L;
        this(l12, (int)ed.a("s", (int)5493, (long)(0x38A5DE00D1D1B6C6L ^ l11)), (int)ed.a("s", (int)2686, (long)(0x3B5B1154AB1629CFL ^ l11)));
    }

    public ed(int n10, long l10, int n11, int n12) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x727149B39CFL;
        long l13 = l11 ^ 0x43CF18A7562FL;
        int n13 = (int)(l13 >>> 32);
        int n14 = (int)(l13 << 32 >>> 48);
        int n15 = (int)(l13 << 48 >>> 48);
        this.h = n11;
        this.v = n12;
        Object[] objectArray = new Object[2];
        objectArray[1] = l12;
        objectArray[0] = cf.x(n10, n13, (char)n14, (short)n15);
        this.B = m44.a("m", (Object)objectArray, (long)-4823835623167870738L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l10 = a ^ 0xD8A02305D76L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "1\u0013\u00c9\u0003*\u00aeQ\u00e3\u0007\u009f\u00dc\u0011\u00bf\u00e3\u00ef\u00d9\u0094W\u00c4\u0003\u00c4\u00ef\u009b\u00b3";
        int n11 = "1\u0013\u00c9\u0003*\u00aeQ\u00e3\u0007\u009f\u00dc\u0011\u00bf\u00e3\u00ef\u00d9\u0094W\u00c4\u0003\u00c4\u00ef\u009b\u00b3".length();
        int n12 = 0;
        do {
            byte[] byArray3 = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n13] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n12 < n11);
        b = lArray;
        c = new Integer[3];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x1B2B;
        if (c[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ed", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ed.c[n11] = n12;
        }
        return c[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = ed.a(n10, l10);
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
            throw new RuntimeException("com/zelix/ed" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ed.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

