/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.awt.Component;
import java.awt.Graphics;
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
import javax.swing.Icon;

public class g0
implements Icon {
    int n;
    Icon K;
    private static final long a = prr.a((long)-5789040429722188952L, (long)-1360913368481135818L, MethodHandles.lookup().lookupClass()).a(272394220439359L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    g0(long l) {
        l = a ^ l;
        m44.a("t", (Object)this, null, (long)-3235049873666188870L, (long)l);
        m44.a("t", (Object)this, (int)0, (long)-3458586859811774257L, (long)l);
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int n, int n2) {
        CallSite callSite;
        long l;
        block2: {
            block3: {
                l = a ^ 0x3250B0E71374L;
                CallSite callSite2 = m44.a("k", (long)6596176760133050125L, (long)l);
                try {
                    callSite = m44.a("u", (Object)this, (long)6607222640419328273L, (long)l);
                    if (callSite2 != null) break block2;
                    if (callSite != null) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("k", (Object)((Object)n92), (long)6872826815868074312L, (long)l);
                }
                return;
            }
            callSite = m44.a("u", (Object)this, (long)6607222640419328273L, (long)l);
        }
        m44.a("t", (Object)callSite, (Object)component, (Object)graphics, (int)(n + m44.a("u", (Object)this, (long)6389476648919328868L, (long)l) * g0.a("r", (int)14508, (long)(0x3507D6ED4603BF30L ^ l))), (int)n2, (long)4921756148499864729L, (long)l);
    }

    @Override
    public int getIconHeight() {
        CallSite callSite;
        long l;
        block4: {
            block5: {
                l = a ^ 0x1DA56C602AD8L;
                CallSite callSite2 = m44.a("o", (long)7072476764998330017L, (long)l);
                try {
                    try {
                        callSite = m44.a("q", (Object)this, (long)7070015940177160381L, (long)l);
                        if (callSite2 != null) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)((Object)n92), (long)7407577402833846500L, (long)l);
                    }
                    return 0;
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)((Object)n93), (long)7407577402833846500L, (long)l);
                }
            }
            callSite = m44.a("q", (Object)this, (long)7070015940177160381L, (long)l);
        }
        return (int)m44.a("p", (Object)callSite, (long)8836325386824182851L, (long)l);
    }

    @Override
    public int getIconWidth() {
        CallSite callSite;
        long l;
        block4: {
            block5: {
                l = a ^ 0x38E355587564L;
                CallSite callSite2 = m44.a("k", (long)4438958665853417757L, (long)l);
                try {
                    try {
                        callSite = m44.a("u", (Object)this, (long)4441001474518136577L, (long)l);
                        if (callSite2 != null) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)((Object)n92), (long)4139130354703736664L, (long)l);
                    }
                    return 0;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)((Object)n93), (long)4139130354703736664L, (long)l);
                }
            }
            callSite = m44.a("u", (Object)this, (long)4441001474518136577L, (long)l);
        }
        return (int)(m44.a("t", (Object)callSite, (long)4597947358535261845L, (long)l) + m44.a("u", (Object)this, (long)4520472299601792628L, (long)l) * g0.a("r", (int)22139, (long)(0x47B787805916B7F6L ^ l)));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x2731EEAD70D4L;
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
        String string = "]$t\u001cr\u00812\u00d5\u0090[\u00fd\u00ec\u0019\u00b8o\u00a7";
        int n2 = "]$t\u001cr\u00812\u00d5\u0090[\u00fd\u00ec\u0019\u00b8o\u00a7".length();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5148;
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
                throw new RuntimeException("com/zelix/g0", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            g0.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = g0.a(n, l);
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
            throw new RuntimeException("com/zelix/g0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(g0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
