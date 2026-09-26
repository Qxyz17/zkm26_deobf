/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ol;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class gp {
    int M;
    ConcurrentHashMap H;
    int L;
    private static final long a = prr.a(3387923959692425219L, 1751302069929175211L, MethodHandles.lookup().lookupClass()).a(251171847766226L);
    private static final long b;

    public Map i(Object[] objectArray) {
        ol ol2;
        Object object;
        block4: {
            ol ol3;
            block5: {
                Object object2 = objectArray[0];
                object = objectArray[1];
                long l10 = (Long)objectArray[2];
                l10 = a ^ l10;
                ol3 = (ol)this.H.get(object2);
                CallSite callSite = m44.a("l", (long)4970411512522955468L, (long)l10);
                try {
                    try {
                        ol2 = ol3;
                        if (callSite != null) break block4;
                        if (ol2 != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)4721139064557737329L, (long)l10);
                    }
                    return null;
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)4721139064557737329L, (long)l10);
                }
            }
            ol2 = ol3;
        }
        return ol2.T(object);
    }

    public ol F(Object[] objectArray) {
        Object object = objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        return (ol)((Object)m44.a("r", (Object)this.H, (Object)object, (long)4425562876161717042L, (long)l10));
    }

    public boolean Z(Object[] objectArray) {
        ol ol2;
        Object object;
        block4: {
            ol ol3;
            block5: {
                Object object2 = objectArray[0];
                object = objectArray[1];
                long l10 = (Long)objectArray[2];
                l10 = a ^ l10;
                ol3 = (ol)this.H.get(object2);
                CallSite callSite = m44.a("n", (long)-1222638788434071234L, (long)l10);
                try {
                    try {
                        ol2 = ol3;
                        if (callSite != null) break block4;
                        if (ol2 != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)-1551779898444759421L, (long)l10);
                    }
                    return false;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)-1551779898444759421L, (long)l10);
                }
            }
            ol2 = ol3;
        }
        return ol2.I(object);
    }

    public boolean g(Object[] objectArray) {
        ol ol2;
        long l10;
        Object object;
        Object object2;
        long l11;
        block4: {
            ol ol3;
            block5: {
                l11 = (Long)objectArray[0];
                Object object3 = objectArray[1];
                object2 = objectArray[2];
                object = objectArray[3];
                l10 = (l11 = a ^ l11) ^ 0x8550200144CL;
                ol3 = (ol)this.H.get(object3);
                CallSite callSite = m44.a("o", (long)2655222415229401839L, (long)l11);
                try {
                    try {
                        ol2 = ol3;
                        if (callSite != null) break block4;
                        if (ol2 != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)2425072604776330578L, (long)l11);
                    }
                    return false;
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)n93, (long)2425072604776330578L, (long)l11);
                }
            }
            ol2 = ol3;
        }
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = object;
        objectArray2[1] = object2;
        objectArray2[0] = l10;
        return (boolean)m44.a("p", (Object)ol2, (Object)objectArray2, (long)4394349643103784406L, (long)l11);
    }

    public Object f(Object[] objectArray) {
        Map map;
        block10: {
            Map map2;
            Object object;
            block11: {
                ol ol2;
                CallSite callSite;
                Object object2;
                long l10;
                block8: {
                    ol ol3;
                    block9: {
                        Object object3 = objectArray[0];
                        l10 = (Long)objectArray[1];
                        object2 = objectArray[2];
                        object = objectArray[3];
                        l10 = a ^ l10;
                        ol3 = (ol)this.H.get(object3);
                        callSite = m44.a("m", (long)8818956711181378645L, (long)l10);
                        try {
                            try {
                                ol2 = ol3;
                                if (callSite != null) break block8;
                                if (ol2 != null) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("m", (Object)n92, (long)9159638295240322024L, (long)l10);
                            }
                            return null;
                        }
                        catch (n9 n93) {
                            throw m44.a("m", (Object)n93, (long)9159638295240322024L, (long)l10);
                        }
                    }
                    ol2 = ol3;
                }
                map2 = ol2.T(object2);
                try {
                    try {
                        map = map2;
                        if (callSite != null) break block10;
                        if (map != null) break block11;
                    }
                    catch (n9 n94) {
                        throw m44.a("m", (Object)n94, (long)9159638295240322024L, (long)l10);
                    }
                    return null;
                }
                catch (n9 n95) {
                    throw m44.a("m", (Object)n95, (long)9159638295240322024L, (long)l10);
                }
            }
            map = map2.get(object);
        }
        return map;
    }

    public Object X(Object[] objectArray) {
        block9: {
            ol ol2;
            block10: {
                ol ol3;
                block11: {
                    Object object;
                    CallSite callSite;
                    ol ol4;
                    Object object2;
                    long l10;
                    block8: {
                        l10 = (Long)objectArray[0];
                        object2 = objectArray[1];
                        Object object3 = objectArray[2];
                        Object object4 = objectArray[3];
                        long l11 = (l10 = a ^ l10) ^ 0x6EE5D4E0804AL;
                        ol4 = (ol)this.H.get(object2);
                        callSite = m44.a("n", (long)-1938669642410165458L, (long)l10);
                        try {
                            try {
                                object = ol4;
                                if (callSite != null) break block8;
                                if (object == null) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("n", (Object)n92, (long)-2276888316159675245L, (long)l10);
                            }
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = object4;
                            objectArray2[1] = object3;
                            objectArray2[0] = l11;
                            object = m44.a("q", (Object)ol4, (Object)objectArray2, (long)-2181419997055671826L, (long)l10);
                        }
                        catch (n9 n93) {
                            throw m44.a("n", (Object)n93, (long)-2276888316159675245L, (long)l10);
                        }
                    }
                    ol3 = object;
                    try {
                        try {
                            ol2 = ol4;
                            if (callSite != null) break block10;
                            if (m44.a("q", (Object)ol2, (Object)new Object[0], (long)-1984232644282633416L, (long)l10) != false) break block11;
                        }
                        catch (n9 n94) {
                            throw m44.a("n", (Object)n94, (long)-2276888316159675245L, (long)l10);
                        }
                        m44.a("q", (Object)this.H, (Object)object2, (long)-416098054941199263L, (long)l10);
                    }
                    catch (n9 n95) {
                        throw m44.a("n", (Object)n95, (long)-2276888316159675245L, (long)l10);
                    }
                }
                ol2 = ol3;
            }
            return ol2;
        }
        return null;
    }

    public Object k(Object object, Object object2, Object object3, Object object4, long l10) {
        Object object5;
        block2: {
            ol ol2;
            int n10;
            int n11;
            int n12;
            block3: {
                long l11 = l10 = a ^ l10;
                long l12 = l11 ^ 0x102A3B9C43F7L;
                n12 = (int)(l12 >>> 48);
                n11 = (int)(l12 << 16 >>> 48);
                n10 = (int)(l12 << 32 >>> 32);
                long l13 = l11 ^ 0x1CE9F19E1B38L;
                int n13 = (int)(l13 >>> 32);
                int n14 = (int)(l13 << 32 >>> 48);
                int n15 = (int)(l13 << 48 >>> 48);
                ol2 = (ol)this.H.get(object);
                CallSite callSite = m44.a("h", (long)7234606923800083024L, (long)l10);
                try {
                    object5 = ol2;
                    if (callSite != null) break block2;
                    if (object5 != null) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)6996575882759452141L, (long)l10);
                }
                ol2 = new ol((int)m44.a("v", (Object)this, (long)9197563815325836286L, (long)l10), (int)m44.a("v", (Object)this, (long)8756985503918417587L, (long)l10), n13, (char)n14, (short)n15);
                Object object6 = ol2.h((short)n12, (char)n11, object2, n10, object3, object4);
                m44.a("w", (Object)this.H, (Object)object, (Object)ol2, (long)8954067703990361827L, (long)l10);
                return object6;
            }
            object5 = ol2.h((short)n12, (char)n11, object2, n10, object3, object4);
        }
        return object5;
    }

    public ol v(Object[] objectArray) {
        Object object = objectArray[0];
        return (ol)this.H.get(object);
    }

    public Enumeration c(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("s", (Object)this.H, (long)5734338601913636082L, (long)l10);
    }

    public gp(short s10, short s11, int n10, int n11) {
        long l10 = ((long)s10 << 48 | (long)s11 << 48 >>> 16 | (long)n11 << 32 >>> 32) ^ a;
        long l11 = l10 ^ 0x379AC811536DL;
        long l12 = l11 >>> 32;
        int n12 = (int)(l11 << 32 >>> 32);
        this(l12, n10, (int)b, 5, n12);
    }

    public gp(long l10, int n10, int n11, int n12, int n13) {
        long l11 = (l10 << 32 | (long)n13 << 32 >>> 32) ^ a;
        long l12 = l11 ^ 0x35F930C4EFAEL;
        int n14 = (int)(l12 >>> 32);
        int n15 = (int)(l12 << 32 >>> 48);
        int n16 = (int)(l12 << 48 >>> 48);
        m44.a("p", (Object)this, (int)n11, (long)2112230772346372362L, (long)l11);
        m44.a("p", (Object)this, (int)n12, (long)1978037731567862855L, (long)l11);
        this.H = new ConcurrentHashMap(cf.x(n10, n14, (char)n15, (short)n16));
    }

    public gp(int n10, long l10, int n11) {
        long l11 = (l10 = a ^ l10) ^ 0x79795FFF9988L;
        long l12 = l11 >>> 32;
        int n12 = (int)(l11 << 32 >>> 32);
        this(l12, n10, n11, 5, n12);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x7F87F6C136CFL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = -401122631094191216L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

