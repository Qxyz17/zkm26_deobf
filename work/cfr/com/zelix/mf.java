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
    private static final long a = prr.a(1484017231686946667L, 6867077900988002724L, MethodHandles.lookup().lookupClass()).a(99936403760144L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        block10: {
            CallSite callSite;
            long l10;
            block11: {
                reference v22;
                block9: {
                    long l11 = l10 = a ^ 0x2BDF5814C0FBL;
                    long l12 = l11 ^ 0x526A1054E71DL;
                    long l13 = l11 ^ 0x63FEE89BCAFL;
                    CallSite callSite2 = m44.a("l", (long)-1135525775591776423L, (long)l10);
                    try {
                        try {
                            try {
                                Object[] objectArray = new Object[2];
                                objectArray[1] = m44.a("r", (Object)this, (long)-1563887069436366032L, (long)l10);
                                objectArray[0] = l12;
                                v22 = m44.a("l", (Object)objectArray, (long)-1484276073128228998L, (long)l10);
                                if (callSite2 == null) break block9;
                                if (v22 == false) break block10;
                            }
                            catch (n9 n92) {
                                throw m44.a("l", (Object)n92, (long)-1454569293383970182L, (long)l10);
                            }
                            callSite = m44.a("r", (Object)this, (long)-1563887069436366032L, (long)l10);
                            if (callSite2 != null) {
                            }
                            break block11;
                        }
                        catch (n9 n93) {
                            throw m44.a("l", (Object)n93, (long)-1454569293383970182L, (long)l10);
                        }
                        Object[] objectArray = new Object[2];
                        objectArray[1] = callSite;
                        objectArray[0] = l13;
                        v22 = m44.a("l", (Object)objectArray, (long)-981679556274542416L, (long)l10) % mf.a("k", (int)158, (long)(0x469E4638ADD7D12FL ^ l10));
                    }
                    catch (n9 n94) {
                        throw m44.a("l", (Object)n94, (long)-1454569293383970182L, (long)l10);
                    }
                }
                try {
                    if (v22 != false) break block10;
                    callSite = m44.a("r", (Object)this, (long)-1563887069436366032L, (long)l10);
                }
                catch (n9 n95) {
                    throw m44.a("l", (Object)n95, (long)-1454569293383970182L, (long)l10);
                }
            }
            m44.a("s", (Object)callSite, (long)-1051466200736872986L, (long)l10);
        }
    }

    mf(o4 o42) {
        this.J = o42;
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        block10: {
            CallSite callSite;
            long l10;
            block11: {
                reference v22;
                block9: {
                    long l11 = l10 = a ^ 0x3DE94892A41EL;
                    long l12 = l11 ^ 0x445C00D283F8L;
                    long l13 = l11 ^ 0x1009FE0FD84AL;
                    CallSite callSite2 = m44.a("i", (long)-7721180334958888004L, (long)l10);
                    try {
                        try {
                            try {
                                Object[] objectArray = new Object[2];
                                objectArray[1] = m44.a("w", (Object)this, (long)-8165339721091950635L, (long)l10);
                                objectArray[0] = l12;
                                v22 = m44.a("i", (Object)objectArray, (long)-8105391978435124321L, (long)l10);
                                if (callSite2 == null) break block9;
                                if (v22 == false) break block10;
                            }
                            catch (n9 n92) {
                                throw m44.a("i", (Object)n92, (long)-8127516451701639521L, (long)l10);
                            }
                            callSite = m44.a("w", (Object)this, (long)-8165339721091950635L, (long)l10);
                            if (callSite2 != null) {
                            }
                            break block11;
                        }
                        catch (n9 n93) {
                            throw m44.a("i", (Object)n93, (long)-8127516451701639521L, (long)l10);
                        }
                        Object[] objectArray = new Object[2];
                        objectArray[1] = callSite;
                        objectArray[0] = l13;
                        v22 = m44.a("i", (Object)objectArray, (long)-7600587899931177899L, (long)l10) % mf.a("k", (int)13793, (long)(0x21886ABE06F80B4L ^ l10));
                    }
                    catch (n9 n94) {
                        throw m44.a("i", (Object)n94, (long)-8127516451701639521L, (long)l10);
                    }
                }
                try {
                    if (v22 != false) break block10;
                    callSite = m44.a("w", (Object)this, (long)-8165339721091950635L, (long)l10);
                }
                catch (n9 n95) {
                    throw m44.a("i", (Object)n95, (long)-8127516451701639521L, (long)l10);
                }
            }
            m44.a("v", (Object)callSite, (long)-7670361093092826877L, (long)l10);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l10 = a ^ 0x431ECDC3E469L;
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
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00a9\u00c8\u00d8\u008as\u00e1\u0099j)\u00a9\u0096U\u00f7k\u00cc\u008b";
        int n11 = "\u00a9\u00c8\u00d8\u008as\u00e1\u0099j)\u00a9\u0096U\u00f7k\u00cc\u008b".length();
        int n12 = 0;
        do {
            byte[] byArray3 = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n13] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n12 < n11);
        b = lArray;
        c = new Integer[2];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x2E4B;
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
                throw new RuntimeException("com/zelix/mf", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            mf.c[n11] = n12;
        }
        return c[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = mf.a(n10, l10);
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

