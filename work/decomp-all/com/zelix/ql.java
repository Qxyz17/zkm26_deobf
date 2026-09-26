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

public class ql
extends qy {
    private static final long a = prr.a((long)2786895088643883366L, (long)546355213392304432L, MethodHandles.lookup().lookupClass()).a(274845451462584L);
    private static final String h;

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return h;
    }

    public ql(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x63DEC2617929L;
        super(l2, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x71C1C2691A2L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00a3\u00b0\u00f7\u0097\u00e1\u008e6\u0001\u0000\u00a16E_\u0004\u00d6\u0010_\u00benq\u0017c\u00e9R".getBytes("ISO-8859-1"));
                h = ql.b(byArray3).intern();
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
