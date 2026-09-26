/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.prr;
import com.zelix.pu;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class po
extends pu {
    private static final long i = prr.a((long)-6668084321149782396L, (long)-5207076186464864186L, MethodHandles.lookup().lookupClass()).a(42447144342788L);
    private static final String x;

    public po(long l, int n) {
        long l2 = (l = i ^ l) ^ 0xE1D9B2512E0L;
        super(n, l2);
    }

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return x;
    }

    boolean D(Object[] objectArray) {
        return false;
    }

    boolean v(Object[] objectArray) {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = i ^ 0x592BE0EF0ACBL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00e7e\u008dd\u00cd\u0089\u00c8\u00f2p\u0005H;\u00e7\u00b6\u00c3\u00f7B\u0092\u00fe\u00a9\u00b2\u00d5Y\u00a9".getBytes("ISO-8859-1"));
                x = po.d(byArray3).intern();
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
