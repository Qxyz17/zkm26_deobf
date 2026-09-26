/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.mu;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lmv
extends lmc {
    final mu l;
    private static final long a = prr.a(8727972006960972479L, 7495556810076268714L, MethodHandles.lookup().lookupClass()).a(171714215809214L);
    private static final String b;

    @Override
    public void h(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        long l11 = l10 ^ 0x5DA1281310ACL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = (Integer)object;
        m44.a("u", (Object)this, (Object)objectArray2, (long)4598501404237930889L, (long)l10);
    }

    public void x(Object[] objectArray) {
        Integer n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x7E28A5607340L;
        long l13 = l11 ^ 0x74BDFDAB2B9CL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = m44.a("p", (Object)m44.a("p", (Object)this, (long)4008383189778824839L, (long)l10), (long)3156241352896997193L, (long)l10);
        objectArray2[1] = b;
        objectArray2[0] = l12;
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = m44.a("q", (Object)m44.a("p", (Object)this, (long)4008383189778824839L, (long)l10), (Object)objectArray2, (long)3246760739486843106L, (long)l10);
        objectArray3[1] = l13;
        objectArray3[0] = m44.a("p", (Object)this, (long)4008383189778824839L, (long)l10);
        m44.a("n", (Object)objectArray3, (long)3547014218487364028L, (long)l10);
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)6302441407617277521L, (long)l10), (Object)objectArray2, (long)5340913355038057039L, (long)l10);
    }

    lmv(mu mu2) {
        this.l = mu2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x2A3741CDE948L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("U\u0014\u00d8RCz\u00cd\u0092A\u00bb\u00fd\u0002\u00ed\u0000w\u001b".getBytes("ISO-8859-1"));
                b = lmv.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
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

