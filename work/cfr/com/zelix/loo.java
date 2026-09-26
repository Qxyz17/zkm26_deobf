/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ZKMChangeLog;
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

public class loo {
    String O;
    final ZKMChangeLog F;
    String H;
    String[] R;
    private static final long a = prr.a(-2663715687354461425L, -665183156799469177L, MethodHandles.lookup().lookupClass()).a(261152374415863L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    loo(ZKMChangeLog zKMChangeLog, String string, String string2, String[] stringArray, long l10) {
        l10 = a ^ l10;
        this.F = zKMChangeLog;
        m44.a("u", (Object)this, (String)string, (long)-1849471399075661271L, (long)l10);
        m44.a("u", (Object)this, (String)string2, (long)-2141517503150193642L, (long)l10);
        m44.a("u", (Object)this, (String[])stringArray, (long)-247794244771817772L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    String g(Object[] objectArray) {
        StringBuilder stringBuilder;
        block11: {
            long l10 = (Long)objectArray[0];
            l10 = a ^ l10;
            StringBuilder stringBuilder2 = new StringBuilder();
            CallSite callSite = m44.a("n", (long)5761329483445638527L, (long)l10);
            stringBuilder2.append((String)((Object)m44.a("p", (Object)this, (long)5904788193853574542L, (long)l10)));
            CallSite callSite2 = callSite;
            stringBuilder2.append((char)loo.a("a", (int)11311, (long)(0x2E3075CC6BCE161DL ^ l10)));
            stringBuilder2.append((String)((Object)m44.a("p", (Object)this, (long)6188107727529194417L, (long)l10)));
            stringBuilder2.append((char)loo.a("a", (int)17627, (long)(0x22CCB97138617EEBL ^ l10)));
            int n10 = 0;
            block6: while (n10 < ((CallSite)m44.a("p", (Object)this, (long)5415849504584032627L, (long)l10)).length) {
                try {
                    try {
                        try {
                            stringBuilder = stringBuilder2.append((String)((Object)m44.a("p", (Object)this, (long)5415849504584032627L, (long)l10)[n10]));
                            if (l10 < 0L) break block11;
                        }
                        catch (n9 n92) {
                            throw m44.a("n", (Object)n92, (long)5480985307968451760L, (long)l10);
                        }
                    }
                    catch (n9 n93) {
                        throw m44.a("n", (Object)n93, (long)5480985307968451760L, (long)l10);
                    }
                }
                catch (n9 n94) {
                    throw m44.a("n", (Object)n94, (long)5480985307968451760L, (long)l10);
                }
                while (callSite2 != false) {
                    CallSite callSite3 = callSite2;
                    if (l10 >= 0L) {
                        if (callSite3 != false) {
                            if (n10 < ((CallSite)m44.a("p", (Object)this, (long)5415849504584032627L, (long)l10)).length - 1) {
                                stringBuilder2.append(",");
                            }
                            ++n10;
                        }
                        callSite3 = callSite2;
                    }
                    if (callSite3 != false) continue block6;
                    stringBuilder2.append((char)loo.a("a", (int)29530, (long)(0x2D2F6F07B2684969L ^ l10)));
                    if (l10 <= 0L) continue;
                }
                break block6;
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l10 = a ^ 0x57DA0CC339ABL;
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
        String string = "\u0000\u00c6{\u0001\u000f\u00b2\u00ee\u0003\u00af\u00c8\u00e0\u00db\u00fd\u0094\u0011A\u0010xiQ1\u00e2\u00dc\u00e2";
        int n11 = "\u0000\u00c6{\u0001\u000f\u00b2\u00ee\u0003\u00af\u00c8\u00e0\u00db\u00fd\u0094\u0011A\u0010xiQ1\u00e2\u00dc\u00e2".length();
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x6093;
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
                throw new RuntimeException("com/zelix/loo", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            loo.c[n11] = n12;
        }
        return c[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = loo.a(n10, l10);
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
            throw new RuntimeException("com/zelix/loo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(loo.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

