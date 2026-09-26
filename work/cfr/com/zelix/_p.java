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
    private static final long a = prr.a(7171112355744454412L, -2708394031745740629L, MethodHandles.lookup().lookupClass()).a(263576466886989L);
    private static final String b;

    public final Object m(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x3735B4F8A9BEL;
        return ((ol)((Object)m44.a("w", (Object)this, (long)-7865180610949545082L, (long)l10))).m(l11, object, object2);
    }

    public _p(long l10, ol ol2) {
        block4: {
            block5: {
                l10 = a ^ l10;
                CallSite callSite = m44.a("l", (long)3139653377474442660L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    try {
                        if (callSite2 != null) break block4;
                        if (ol2 != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)3518650675912688116L, (long)l10);
                    }
                    throw new IllegalArgumentException(b);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)3518650675912688116L, (long)l10);
                }
            }
            m44.a("p", (Object)this, (ol)ol2, (long)3169441009409505955L, (long)l10);
        }
    }

    public final int d(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("s", (Object)m44.a("r", (Object)this, (long)-5445945993795525325L, (long)l10), (Object)new Object[0], (long)-5373731150516067806L, (long)l10);
    }

    public v8 e(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x774778FFA308L;
        Map map = ((ol)((Object)m44.a("v", (Object)this, (long)-4267068344552565353L, (long)l10))).T(object);
        try {
            if (map != null) {
                return new v8(map, l11);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("h", (Object)illegalArgumentException, (long)-2314696168279429440L, (long)l10);
        }
        return null;
    }

    public final Object clone() {
        long l10;
        long l11 = l10 = a ^ 0x451CD6C57D17L;
        long l12 = l11 ^ 0x2D6392DA58C4L;
        long l13 = l11 ^ 0x50D407B663D5L;
        Object[] objectArray = new Object[2];
        objectArray[1] = m44.a("p", (Object)this, (long)3820768028616336473L, (long)l10);
        objectArray[0] = l13;
        return new _p(l12, (ol)((Object)m44.a("n", (Object)objectArray, (long)3926857327261155644L, (long)l10)));
    }

    public final synchronized Enumeration E(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("t", (Object)m44.a("u", (Object)this, (long)-285001211563643564L, (long)l10), (Object)new Object[0], (long)-1967771873884772545L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0xB33B16E6E3EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0085\u00af\u00fc\u00918\u009f \u00cd\u00cbq\u00ed~U9F\\g@\u00d0\u00823\u0087\u00d7\fQf\u0011i]/\u00996".getBytes("ISO-8859-1"));
                b = _p.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static String a(byte[] byArray) {
        int n10 = 0;
        int n11 = byArray.length;
        char[] cArray = new char[n11];
        for (int i10 = 0; i10 < n11; ++i10) {
            char c10;
            int n12 = 0xFF & byArray[i10];
            if (n12 < 192) {
                cArray[n10++] = (char)n12;
                continue;
            }
            if (n12 < 224) {
                c10 = (char)((char)(n12 & 0x1F) << 6);
                n12 = byArray[++i10];
                c10 = (char)(c10 | (char)(n12 & 0x3F));
                cArray[n10++] = c10;
                continue;
            }
            if (i10 >= n11 - 2) continue;
            c10 = (char)((char)(n12 & 0xF) << 12);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F) << 6);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F));
            cArray[n10++] = c10;
        }
        return new String(cArray, 0, n10);
    }
}

