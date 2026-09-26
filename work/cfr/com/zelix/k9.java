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
    private static final long d = prr.a(2061048733457132728L, -1231601432137185746L, MethodHandles.lookup().lookupClass()).a(54545145264120L);
    private static final String k;

    k9(_4 _42, int n10, short s10, String string, h1 h12, int n11, char c10, l6q l6q2, l6q l6q3, PrintWriter printWriter) {
        long l10 = ((long)s10 << 48 | (long)n11 << 32 >>> 16 | (long)c10 << 48 >>> 48) ^ d;
        long l11 = l10 ^ 0x515D841FDA13L;
        super(_42, n10, l11, string, h12, l6q2, l6q3, printWriter, k);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = d ^ 0x5F31161AE19AL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0085\u00a5\u007f\u00d1\u0017\u0092\u001e\u00d7\u00e0\u009eOU:nH\u001ag\u0093y\u00cav\u00f8\u00d0mY\u008cU\u00b7H\u00f7v8".getBytes("ISO-8859-1"));
                k = k9.d(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static String d(byte[] byArray) {
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

