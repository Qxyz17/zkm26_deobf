/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.ol;
import com.zelix.prr;
import com.zelix.v8;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Enumeration;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _p {
    private ol k;
    private static final long a = prr.a((long)7171112355744454412L, (long)-2708394031745740629L, MethodHandles.lookup().lookupClass()).a(263576466886989L);
    private static final String b;

    public final Object m(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x3735B4F8A9BEL;
        return m44.a("w", (Object)this, (long)-7865180610949545082L, (long)l).m(l2, object, object2);
    }

    public _p(long l, ol ol2) {
        block4: {
            block5: {
                l = a ^ l;
                CallSite callSite = m44.a("l", (long)3139653377474442660L, (long)l);
                CallSite callSite2 = callSite;
                try {
                    try {
                        if (callSite2 != null) break block4;
                        if (ol2 != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)3518650675912688116L, (long)l);
                    }
                    throw new IllegalArgumentException(b);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)3518650675912688116L, (long)l);
                }
            }
            m44.a("p", (Object)this, (ol)ol2, (long)3169441009409505955L, (long)l);
        }
    }

    public final int d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (int)m44.a("s", (Object)m44.a("r", (Object)this, (long)-5445945993795525325L, (long)l), (Object)new Object[0], (long)-5373731150516067806L, (long)l);
    }

    public v8 e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        long l2 = (l = a ^ l) ^ 0x774778FFA308L;
        Map map = m44.a("v", (Object)this, (long)-4267068344552565353L, (long)l).T(object);
        try {
            if (map != null) {
                return new v8(map, l2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("h", (Object)illegalArgumentException, (long)-2314696168279429440L, (long)l);
        }
        return null;
    }

    public final Object clone() {
        long l;
        long l2 = l = a ^ 0x451CD6C57D17L;
        long l3 = l2 ^ 0x2D6392DA58C4L;
        long l4 = l2 ^ 0x50D407B663D5L;
        Object[] objectArray = new Object[2];
        objectArray[1] = m44.a("p", (Object)this, (long)3820768028616336473L, (long)l);
        objectArray[0] = l4;
        return new _p(l3, (ol)m44.a("n", (Object)objectArray, (long)3926857327261155644L, (long)l));
    }

    public final synchronized Enumeration E(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("t", (Object)m44.a("u", (Object)this, (long)-285001211563643564L, (long)l), (Object)new Object[0], (long)-1967771873884772545L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0xB33B16E6E3EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0085\u00af\u00fc\u00918\u009f \u00cd\u00cbq\u00ed~U9F\\g@\u00d0\u00823\u0087\u00d7\fQf\u0011i]/\u00996".getBytes("ISO-8859-1"));
                b = _p.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }
}
