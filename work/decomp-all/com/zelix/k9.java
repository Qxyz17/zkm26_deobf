/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.h1;
import com.zelix.kr;
import com.zelix.l6q;
import com.zelix.prr;
import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class k9
extends kr {
    private static final long d = prr.a((long)2061048733457132728L, (long)-1231601432137185746L, MethodHandles.lookup().lookupClass()).a(54545145264120L);
    private static final String k;

    k9(_4 _42, int n, short s, String string, h1 h12, int n2, char c, l6q l6q2, l6q l6q3, PrintWriter printWriter) {
        long l = ((long)s << 48 | (long)n2 << 32 >>> 16 | (long)c << 48 >>> 48) ^ d;
        long l2 = l ^ 0x515D841FDA13L;
        super(_42, n, l2, string, h12, l6q2, l6q3, printWriter, k);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = d ^ 0x5F31161AE19AL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0085\u00a5\u007f\u00d1\u0017\u0092\u001e\u00d7\u00e0\u009eOU:nH\u001ag\u0093y\u00cav\u00f8\u00d0mY\u008cU\u00b7H\u00f7v8".getBytes("ISO-8859-1"));
                k = k9.d(byArray3).intern();
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
