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

public class qo
extends qy {
    private static final long a = prr.a((long)425196851919785593L, (long)3843836275437625907L, MethodHandles.lookup().lookupClass()).a(38795761386185L);
    private static final String h;

    public qo(short s, long l, int n) {
        long l2 = ((long)s << 48 | l << 16 >>> 16) ^ a;
        long l3 = l2 ^ 0x11116A431E67L;
        super(l3, n);
    }

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return h;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x6D8003C058EDL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u009e4]U\u008b\u00ab\u00fb\u001b\u00aa\u0099{\u00a7\u00e5\u00869Q\u0087\u0011\u0091V bQ\u00b6\u0094@\u00bf\u008d^0&\b\u0092Z\u0002\u00b7\u00e5p\u00029".getBytes("ISO-8859-1"));
                h = qo.b(byArray3).intern();
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
