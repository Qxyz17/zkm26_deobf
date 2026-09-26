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

public class qq
extends qy {
    private static final long a = prr.a((long)-240912630993386551L, (long)-5516732577481999463L, MethodHandles.lookup().lookupClass()).a(150196849920513L);
    private static final String h;

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return h;
    }

    public qq(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x133CD55C47E6L;
        super(l2, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x3BE76702C74L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00b6\u009b\u00dc\u008a\u00a5\u00c4\u0083\u0000\u0081\u00cf\u00fd\u00d4\u00ceQ\u00ac\u0082\u00b0\u00e7x\u0001\u0082U8\u0087\u00af\u0099\u00cf\u00ed\u00b6\u00e55\u00cb".getBytes("ISO-8859-1"));
                h = qq.b(byArray3).intern();
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
