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

public class pt
extends pp {
    private static final long d = prr.a((long)8852666308593242463L, (long)-1366427309500015183L, MethodHandles.lookup().lookupClass()).a(47792688964217L);
    private static final String u;

    public pt(short s, short s2, int n, int n2) {
        long l = ((long)s << 48 | (long)s2 << 48 >>> 16 | (long)n2 << 32 >>> 32) ^ d;
        long l2 = l ^ 0x4221D2000FADL;
        int n3 = (int)(l2 >>> 56);
        int n4 = (int)(l2 << 8 >>> 32);
        int n5 = (int)(l2 << 40 >>> 40);
        super((byte)n3, n, n4, n5);
    }

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return u;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = d ^ 0x4E149890E790L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("h\u0087\u00a6\t\u00bd\u00f4\u0001\u00db\u008e\u00b7\u00e6\u0081\u0007\u00c3\u00a2\u00f1=\u009d\u00e1\u00e2\u0012o\u00eb\u0087\u00dc\u00d9\u00ce{#w\u00c5\u00ff".getBytes("ISO-8859-1"));
                u = pt.d(byArray3).intern();
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
