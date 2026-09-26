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
    private static final long a = prr.a((long)3387923959692425219L, (long)1751302069929175211L, MethodHandles.lookup().lookupClass()).a(251171847766226L);
    private static final long b;

    public Map i(Object[] objectArray) {
        ol ol2;
        Object object;
        block4: {
            ol ol3;
            block5: {
                Object object2 = objectArray[0];
                object = objectArray[1];
                long l = (Long)objectArray[2];
                l = a ^ l;
                ol3 = (ol)this.H.get(object2);
                CallSite callSite = m44.a("l", (long)4970411512522955468L, (long)l);
                try {
                    try {
                        ol2 = ol3;
                        if (callSite != null) break block4;
                        if (ol2 != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)((Object)n92), (long)4721139064557737329L, (long)l);
                    }
                    return null;
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)((Object)n93), (long)4721139064557737329L, (long)l);
                }
            }
            ol2 = ol3;
        }
        return ol2.T(object);
    }

    public ol F(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return (ol)m44.a("r", (Object)this.H, (Object)object, (long)4425562876161717042L, (long)l);
    }

    public boolean Z(Object[] objectArray) {
        ol ol2;
        Object object;
        block4: {
            ol ol3;
            block5: {
                Object object2 = objectArray[0];
                object = objectArray[1];
                long l = (Long)objectArray[2];
                l = a ^ l;
                ol3 = (ol)this.H.get(object2);
                CallSite callSite = m44.a("n", (long)-1222638788434071234L, (long)l);
                try {
                    try {
                        ol2 = ol3;
                        if (callSite != null) break block4;
                        if (ol2 != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)-1551779898444759421L, (long)l);
                    }
                    return false;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)-1551779898444759421L, (long)l);
                }
            }
            ol2 = ol3;
        }
        return ol2.I(object);
    }

    public boolean g(Object[] objectArray) {
        ol ol2;
        long l;
        Object object;
        Object object2;
        long l2;
        block4: {
            ol ol3;
            block5: {
                l2 = (Long)objectArray[0];
                Object object3 = objectArray[1];
                object2 = objectArray[2];
                object = objectArray[3];
                l = (l2 = a ^ l2) ^ 0x8550200144CL;
                ol3 = (ol)this.H.get(object3);
                CallSite callSite = m44.a("o", (long)2655222415229401839L, (long)l2);
                try {
                    try {
                        ol2 = ol3;
                        if (callSite != null) break block4;
                        if (ol2 != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)((Object)n92), (long)2425072604776330578L, (long)l2);
                    }
                    return false;
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)((Object)n93), (long)2425072604776330578L, (long)l2);
                }
            }
            ol2 = ol3;
        }
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = object;
        objectArray2[1] = object2;
        objectArray2[0] = l;
        return (boolean)m44.a("p", (Object)ol2, (Object)objectArray2, (long)4394349643103784406L, (long)l2);
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
                long l;
                block8: {
                    ol ol3;
                    block9: {
                        Object object3 = objectArray[0];
                        l = (Long)objectArray[1];
                        object2 = objectArray[2];
                        object = objectArray[3];
                        l = a ^ l;
                        ol3 = (ol)this.H.get(object3);
                        callSite = m44.a("m", (long)8818956711181378645L, (long)l);
                        try {
                            try {
                                ol2 = ol3;
                                if (callSite != null) break block8;
                                if (ol2 != null) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("m", (Object)((Object)n92), (long)9159638295240322024L, (long)l);
                            }
                            return null;
                        }
                        catch (n9 n93) {
                            throw m44.a("m", (Object)((Object)n93), (long)9159638295240322024L, (long)l);
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
                        throw m44.a("m", (Object)((Object)n94), (long)9159638295240322024L, (long)l);
                    }
                    return null;
                }
                catch (n9 n95) {
                    throw m44.a("m", (Object)((Object)n95), (long)9159638295240322024L, (long)l);
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
                    long l;
                    block8: {
                        l = (Long)objectArray[0];
                        object2 = objectArray[1];
                        Object object3 = objectArray[2];
                        Object object4 = objectArray[3];
                        long l2 = (l = a ^ l) ^ 0x6EE5D4E0804AL;
                        ol4 = (ol)this.H.get(object2);
                        callSite = m44.a("n", (long)-1938669642410165458L, (long)l);
                        try {
                            try {
                                object = ol4;
                                if (callSite != null) break block8;
                                if (object == null) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("n", (Object)((Object)n92), (long)-2276888316159675245L, (long)l);
                            }
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = object4;
                            objectArray2[1] = object3;
                            objectArray2[0] = l2;
                            object = m44.a("q", (Object)ol4, (Object)objectArray2, (long)-2181419997055671826L, (long)l);
                        }
                        catch (n9 n93) {
                            throw m44.a("n", (Object)((Object)n93), (long)-2276888316159675245L, (long)l);
                        }
                    }
                    ol3 = object;
                    try {
                        try {
                            ol2 = ol4;
                            if (callSite != null) break block10;
                            if (m44.a("q", (Object)ol2, (Object)new Object[0], (long)-1984232644282633416L, (long)l) != false) break block11;
                        }
                        catch (n9 n94) {
                            throw m44.a("n", (Object)((Object)n94), (long)-2276888316159675245L, (long)l);
                        }
                        m44.a("q", (Object)this.H, (Object)object2, (long)-416098054941199263L, (long)l);
                    }
                    catch (n9 n95) {
                        throw m44.a("n", (Object)((Object)n95), (long)-2276888316159675245L, (long)l);
                    }
                }
                ol2 = ol3;
            }
            return ol2;
        }
        return null;
    }

    public Object k(Object object, Object object2, Object object3, Object object4, long l) {
        Object object5;
        block2: {
            ol ol2;
            int n;
            int n2;
            int n3;
            block3: {
                long l2 = l = a ^ l;
                long l3 = l2 ^ 0x102A3B9C43F7L;
                n3 = (int)(l3 >>> 48);
                n2 = (int)(l3 << 16 >>> 48);
                n = (int)(l3 << 32 >>> 32);
                long l4 = l2 ^ 0x1CE9F19E1B38L;
                int n4 = (int)(l4 >>> 32);
                int n5 = (int)(l4 << 32 >>> 48);
                int n6 = (int)(l4 << 48 >>> 48);
                ol2 = (ol)this.H.get(object);
                CallSite callSite = m44.a("h", (long)7234606923800083024L, (long)l);
                try {
                    object5 = ol2;
                    if (callSite != null) break block2;
                    if (object5 != null) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)6996575882759452141L, (long)l);
                }
                ol2 = new ol((int)m44.a("v", (Object)this, (long)9197563815325836286L, (long)l), (int)m44.a("v", (Object)this, (long)8756985503918417587L, (long)l), n4, (char)n5, (short)n6);
                Object object6 = ol2.h((short)n3, (char)n2, object2, n, object3, object4);
                m44.a("w", (Object)this.H, (Object)object, (Object)ol2, (long)8954067703990361827L, (long)l);
                return object6;
            }
            object5 = ol2.h((short)n3, (char)n2, object2, n, object3, object4);
        }
        return object5;
    }

    public ol v(Object[] objectArray) {
        Object object = objectArray[0];
        return (ol)this.H.get(object);
    }

    public Enumeration c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("s", (Object)this.H, (long)5734338601913636082L, (long)l);
    }

    public gp(short s, short s2, int n, int n2) {
        long l = ((long)s << 48 | (long)s2 << 48 >>> 16 | (long)n2 << 32 >>> 32) ^ a;
        long l2 = l ^ 0x379AC811536DL;
        long l3 = l2 >>> 32;
        int n3 = (int)(l2 << 32 >>> 32);
        this(l3, n, (int)b, 5, n3);
    }

    public gp(long l, int n, int n2, int n3, int n4) {
        long l2 = (l << 32 | (long)n4 << 32 >>> 32) ^ a;
        long l3 = l2 ^ 0x35F930C4EFAEL;
        int n5 = (int)(l3 >>> 32);
        int n6 = (int)(l3 << 32 >>> 48);
        int n7 = (int)(l3 << 48 >>> 48);
        m44.a("p", (Object)this, (int)n2, (long)2112230772346372362L, (long)l2);
        m44.a("p", (Object)this, (int)n3, (long)1978037731567862855L, (long)l2);
        this.H = new ConcurrentHashMap(cf.x((int)n, (int)n5, (char)((char)n6), (short)((short)n7)));
    }

    public gp(int n, long l, int n2) {
        long l2 = (l = a ^ l) ^ 0x79795FFF9988L;
        long l3 = l2 >>> 32;
        int n3 = (int)(l2 << 32 >>> 32);
        this(l3, n, n2, 5, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x7F87F6C136CFL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -401122631094191216L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
