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
    private static final long a = prr.a((long)8727972006960972479L, (long)7495556810076268714L, MethodHandles.lookup().lookupClass()).a(171714215809214L);
    private static final String b;

    public void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        long l2 = l ^ 0x5DA1281310ACL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = (Integer)object;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)4598501404237930889L, (long)l);
    }

    public void x(Object[] objectArray) {
        Integer n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x7E28A5607340L;
        long l4 = l2 ^ 0x74BDFDAB2B9CL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = m44.a("p", (Object)m44.a("p", (Object)((Object)this), (long)4008383189778824839L, (long)l), (long)3156241352896997193L, (long)l);
        objectArray2[1] = b;
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = m44.a("q", (Object)m44.a("p", (Object)((Object)this), (long)4008383189778824839L, (long)l), (Object)objectArray2, (long)3246760739486843106L, (long)l);
        objectArray3[1] = l4;
        objectArray3[0] = m44.a("p", (Object)((Object)this), (long)4008383189778824839L, (long)l);
        m44.a("n", (Object)objectArray3, (long)3547014218487364028L, (long)l);
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)6302441407617277521L, (long)l), (Object)objectArray2, (long)5340913355038057039L, (long)l);
    }

    lmv(mu mu2) {
        this.l = mu2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x2A3741CDE948L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("U\u0014\u00d8RCz\u00cd\u0092A\u00bb\u00fd\u0002\u00ed\u0000w\u001b".getBytes("ISO-8859-1"));
                b = lmv.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
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
