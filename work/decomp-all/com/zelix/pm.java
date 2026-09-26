/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.pp;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class pm
extends pp {
    private static final long d = prr.a((long)-1323134794115585410L, (long)6386407490796282752L, MethodHandles.lookup().lookupClass()).a(110336543623286L);
    private static final String u;

    public pm(int n, long l) {
        long l2 = (l = d ^ l) ^ 0x3D5A9AB24908L;
        int n2 = (int)(l2 >>> 56);
        int n3 = (int)(l2 << 8 >>> 32);
        int n4 = (int)(l2 << 40 >>> 40);
        super((byte)n2, n, n3, n4);
    }

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return u;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = d ^ 0x294B9A233C57L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00ef_h\u0011i\u00fdn\u00b0A\u00c0\u0093w{\u00d4\u008ab\u0019G\u00e0S\u0018\u00d1\u00e4\u00dc".getBytes("ISO-8859-1"));
                u = pm.d(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static String d(byte[] byArray) {
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
