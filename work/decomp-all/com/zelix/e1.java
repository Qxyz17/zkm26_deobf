/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.bc;
import com.zelix.m44;
import com.zelix.n8;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.xt;
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

public class e1 {
    n8 C;
    int z;
    private bc G;
    private String O;
    private xt e;
    private static final long a = prr.a((long)2701532500680535281L, (long)-8037504701453122418L, MethodHandles.lookup().lookupClass()).a(70934155478440L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public boolean E(Object[] objectArray) {
        boolean bl;
        long l = (Long)objectArray[0];
        l = a ^ l;
        try {
            bl = m44.a("u", (Object)this, (long)4724311541514782704L, (long)l) != null;
        }
        catch (n9 n92) {
            throw m44.a("k", (Object)((Object)n92), (long)5087032176746830524L, (long)l);
        }
        return bl;
    }

    public e1(xt xt2, bc bc2, long l) {
        l = a ^ l;
        m44.a("q", (Object)this, (int)e1.a("j", (int)1076, (long)(0x1C1A2D197F09AE87L ^ l)), (long)585636206760167414L, (long)l);
        m44.a("q", (Object)this, (xt)xt2, (long)1545906136545550933L, (long)l);
        m44.a("q", (Object)this, (bc)bc2, (long)749756094859128323L, (long)l);
    }

    public e1(String string, bc bc2, long l) {
        l = a ^ l;
        m44.a("v", (Object)this, (int)e1.a("j", (int)9233, (long)(0x5F9AC2BB36889B44L ^ l)), (long)-7077465301770202607L, (long)l);
        m44.a("v", (Object)this, (String)string, (long)-9074469369909115791L, (long)l);
        m44.a("v", (Object)this, (bc)bc2, (long)-6953284069751079964L, (long)l);
    }

    public n8 Z(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("q", (Object)this, (long)134501311823014088L, (long)l);
    }

    public e1(n8 n82, bc bc2, long l) {
        l = a ^ l;
        m44.a("q", (Object)this, (int)e1.a("j", (int)1076, (long)(0x1C1A6D3B86FE62F7L ^ l)), (long)-4300698895253779578L, (long)l);
        m44.a("q", (Object)this, (n8)n82, (long)-2328403808858786118L, (long)l);
        m44.a("q", (Object)this, (bc)bc2, (long)-4172608072030297485L, (long)l);
    }

    public int S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (int)m44.a("v", (Object)this, (long)2964969313535928051L, (long)l);
    }

    public boolean d(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l = (Long)objectArray[0];
                l = a ^ l;
                CallSite callSite = m44.a("j", (long)9045633737718729048L, (long)l);
                try {
                    try {
                        object = m44.a("t", (Object)this, (long)8809027052173751785L, (long)l);
                        if (callSite != null) break block4;
                        if (object == e1.a("j", (int)1076, (long)(0x1C1A47710D1ADC98L ^ l))) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)7125221353385574085L, (long)l);
                    }
                    object = true;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)7125221353385574085L, (long)l);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    public String D(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("v", (Object)this, (long)-350375325933568701L, (long)l);
    }

    public xt V(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("v", (Object)this, (long)-5257668086071476184L, (long)l);
    }

    public bc j(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("v", (Object)this, (long)-1971847490005581626L, (long)l);
    }

    public boolean m(Object[] objectArray) {
        boolean bl;
        long l = (Long)objectArray[0];
        l = a ^ l;
        try {
            bl = m44.a("p", (Object)this, (long)5775725569516480262L, (long)l) != null;
        }
        catch (n9 n92) {
            throw m44.a("n", (Object)((Object)n92), (long)6173841098223323529L, (long)l);
        }
        return bl;
    }

    public boolean H(Object[] objectArray) {
        boolean bl;
        long l = (Long)objectArray[0];
        l = a ^ l;
        try {
            bl = m44.a("u", (Object)this, (long)5985757336389663236L, (long)l) != null;
        }
        catch (n9 n92) {
            throw m44.a("k", (Object)((Object)n92), (long)5778262205284224020L, (long)l);
        }
        return bl;
    }

    public e1(int n, long l, bc bc2) {
        l = a ^ l;
        m44.a("t", (Object)this, (int)e1.a("j", (int)1076, (long)(0x1C1A59A5C04033FAL ^ l)), (long)-7683724004883588469L, (long)l);
        m44.a("t", (Object)this, (int)n, (long)-7683724004883588469L, (long)l);
        m44.a("t", (Object)this, (bc)bc2, (long)-7558483221041990786L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x6913C7B2E777L;
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
        String string = "\u008e\u00f0\u0094E\u009a\u0092+\u0084\u00b7NcLM\u00d9\n\u00df";
        int n2 = "\u008e\u00f0\u0094E\u009a\u0092+\u0084\u00b7NcLM\u00d9\n\u00df".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3658;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/e1", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            e1.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = e1.a(n, l);
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
            throw new RuntimeException("com/zelix/e1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e1.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
