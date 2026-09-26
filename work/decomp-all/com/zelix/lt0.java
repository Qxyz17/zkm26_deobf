/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.dd;
import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.r5;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lt0
extends l7t {
    private StringBuilder g;
    private static final long a = prr.a((long)8644562066180524757L, (long)-4881807408849133771L, MethodHandles.lookup().lookupClass()).a(161844829790897L);
    private static final long[] b;
    private static final Integer[] d;
    private static final Map e;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void M(Object[] objectArray) {
        Object object;
        long l;
        long l2;
        long l3;
        block6: {
            lmu lmu2 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            l3 = (Long)objectArray[2];
            long l4 = l3;
            l2 = l4 ^ 0x6352E8763037L;
            l = l4 ^ 0x241D5E0E82EDL;
            long l5 = l4 ^ 0x17601E9C00AEL;
            long l6 = l4 ^ 0x47526B4E5A06L;
            long l7 = l4 ^ 0L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l6;
            CallSite callSite = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l3);
            int n = 0;
            CallSite callSite2 = m44.a("h", (long)-6823249310977527178L, (long)l3);
            block2: while (n < callSite) {
                lmu lmu3 = this.V(n);
                Object[] objectArray3 = new Object[3];
                objectArray3[2] = l7;
                objectArray3[1] = lqu2;
                objectArray3[0] = this;
                m44.a("w", (Object)lmu3, (Object)objectArray3, (long)-6656114929610942631L, (long)l3);
                dd dd2 = (dd)lmu3;
                try {
                    do {
                        if (l3 >= 0L) {
                            object = this;
                            if (callSite2 != false) break block6;
                            Object[] objectArray4 = new Object[1];
                            objectArray4[0] = l5;
                            ((StringBuilder)((Object)m44.a("v", (Object)object, (long)-5152266541924811180L, (long)l3))).append((String)((Object)m44.a("w", (Object)dd2, (Object)objectArray4, (long)-6627114529386709182L, (long)l3)));
                            ++n;
                        }
                        if (callSite2 == false) continue block2;
                    } while (l3 < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)-6372736847315421864L, (long)l3);
                }
            }
            object = lmu2;
        }
        r5 r52 = (r5)object;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l;
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = m44.a("w", (Object)((Object)this), (Object)objectArray5, (long)-6608618277549738628L, (long)l3);
        objectArray6[0] = l2;
        m44.a("w", (Object)r52, (Object)objectArray6, (long)-4956867482493701791L, (long)l3);
    }

    public lt0(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x1BA14EEAFA87L;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
        m44.a("w", (Object)((Object)this), (StringBuilder)new StringBuilder(), (long)-435607199059755041L, (long)l);
    }

    public String M(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return ((StringBuilder)((Object)m44.a("s", (Object)((Object)this), (long)-4435350527920339879L, (long)l))).toString().replace((char)lt0.a("c", (int)27813, (long)(0x1E5C05616A8A6479L ^ l)), (char)lt0.a("c", (int)23670, (long)(0x10721115F250D4ABL ^ l)));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l = a ^ 0x1EDBB1A1B59BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u00bd)\u00ce\u00f4\u00db\u00e4\u008c\n\u000b\u00de\u00f6\u0080\u00e0%\u00ee\u00a3";
        int n2 = "\u00bd)\u00ce\u00f4\u00db\u00e4\u008c\n\u000b\u00de\u00f6\u0080\u00e0%\u00ee\u00a3".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        d = new Integer[2];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4746;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lt0", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lt0.d[n2] = n3;
        }
        return d[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = lt0.a(n, l);
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
            throw new RuntimeException("com/zelix/lt0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lt0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
