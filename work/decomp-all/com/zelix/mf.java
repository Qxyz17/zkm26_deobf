/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.o4;
import com.zelix.prr;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
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

public class mf
implements MouseMotionListener {
    final o4 J;
    private static final long a = prr.a((long)1484017231686946667L, (long)6867077900988002724L, MethodHandles.lookup().lookupClass()).a(99936403760144L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        block10: {
            CallSite callSite;
            long l;
            block11: {
                reference v2;
                block9: {
                    long l2 = l = a ^ 0x2BDF5814C0FBL;
                    long l3 = l2 ^ 0x526A1054E71DL;
                    long l4 = l2 ^ 0x63FEE89BCAFL;
                    CallSite callSite2 = m44.a("l", (long)-1135525775591776423L, (long)l);
                    try {
                        try {
                            try {
                                Object[] objectArray = new Object[2];
                                objectArray[1] = m44.a("r", (Object)this, (long)-1563887069436366032L, (long)l);
                                objectArray[0] = l3;
                                v2 = m44.a("l", (Object)objectArray, (long)-1484276073128228998L, (long)l);
                                if (callSite2 == null) break block9;
                                if (v2 == false) break block10;
                            }
                            catch (n9 n92) {
                                throw m44.a("l", (Object)((Object)n92), (long)-1454569293383970182L, (long)l);
                            }
                            callSite = m44.a("r", (Object)this, (long)-1563887069436366032L, (long)l);
                            if (callSite2 != null) {
                            }
                            break block11;
                        }
                        catch (n9 n93) {
                            throw m44.a("l", (Object)((Object)n93), (long)-1454569293383970182L, (long)l);
                        }
                        Object[] objectArray = new Object[2];
                        objectArray[1] = callSite;
                        objectArray[0] = l4;
                        v2 = m44.a("l", (Object)objectArray, (long)-981679556274542416L, (long)l) % mf.a("k", (int)158, (long)(0x469E4638ADD7D12FL ^ l));
                    }
                    catch (n9 n94) {
                        throw m44.a("l", (Object)((Object)n94), (long)-1454569293383970182L, (long)l);
                    }
                }
                try {
                    if (v2 != false) break block10;
                    callSite = m44.a("r", (Object)this, (long)-1563887069436366032L, (long)l);
                }
                catch (n9 n95) {
                    throw m44.a("l", (Object)((Object)n95), (long)-1454569293383970182L, (long)l);
                }
            }
            m44.a("s", (Object)callSite, (long)-1051466200736872986L, (long)l);
        }
    }

    mf(o4 o42) {
        this.J = o42;
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        block10: {
            CallSite callSite;
            long l;
            block11: {
                reference v2;
                block9: {
                    long l2 = l = a ^ 0x3DE94892A41EL;
                    long l3 = l2 ^ 0x445C00D283F8L;
                    long l4 = l2 ^ 0x1009FE0FD84AL;
                    CallSite callSite2 = m44.a("i", (long)-7721180334958888004L, (long)l);
                    try {
                        try {
                            try {
                                Object[] objectArray = new Object[2];
                                objectArray[1] = m44.a("w", (Object)this, (long)-8165339721091950635L, (long)l);
                                objectArray[0] = l3;
                                v2 = m44.a("i", (Object)objectArray, (long)-8105391978435124321L, (long)l);
                                if (callSite2 == null) break block9;
                                if (v2 == false) break block10;
                            }
                            catch (n9 n92) {
                                throw m44.a("i", (Object)((Object)n92), (long)-8127516451701639521L, (long)l);
                            }
                            callSite = m44.a("w", (Object)this, (long)-8165339721091950635L, (long)l);
                            if (callSite2 != null) {
                            }
                            break block11;
                        }
                        catch (n9 n93) {
                            throw m44.a("i", (Object)((Object)n93), (long)-8127516451701639521L, (long)l);
                        }
                        Object[] objectArray = new Object[2];
                        objectArray[1] = callSite;
                        objectArray[0] = l4;
                        v2 = m44.a("i", (Object)objectArray, (long)-7600587899931177899L, (long)l) % mf.a("k", (int)13793, (long)(0x21886ABE06F80B4L ^ l));
                    }
                    catch (n9 n94) {
                        throw m44.a("i", (Object)((Object)n94), (long)-8127516451701639521L, (long)l);
                    }
                }
                try {
                    if (v2 != false) break block10;
                    callSite = m44.a("w", (Object)this, (long)-8165339721091950635L, (long)l);
                }
                catch (n9 n95) {
                    throw m44.a("i", (Object)((Object)n95), (long)-8127516451701639521L, (long)l);
                }
            }
            m44.a("v", (Object)callSite, (long)-7670361093092826877L, (long)l);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x431ECDC3E469L;
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
        String string = "\u00a9\u00c8\u00d8\u008as\u00e1\u0099j)\u00a9\u0096U\u00f7k\u00cc\u008b";
        int n2 = "\u00a9\u00c8\u00d8\u008as\u00e1\u0099j)\u00a9\u0096U\u00f7k\u00cc\u008b".length();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2E4B;
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
                throw new RuntimeException("com/zelix/mf", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            mf.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = mf.a(n, l);
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
            throw new RuntimeException("com/zelix/mf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(mf.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
