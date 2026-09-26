/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.prr;
import com.zelix.qy;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class qu
extends qy {
    private static final long a = prr.a((long)-8362446512680601414L, (long)-7926117175870410560L, MethodHandles.lookup().lookupClass()).a(228355503063323L);
    private static final String h;

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return h;
    }

    public qu(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x1BB3E435745EL;
        super(l2, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x5937BDB2FEC5L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00aa\u0086\u00f3=\u0007\u0098T\u008a^\u0085\u00fb\n\u00ec\u0014\u0098\u00d3".getBytes("ISO-8859-1"));
                h = qu.b(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static String b(byte[] byArray) {
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
