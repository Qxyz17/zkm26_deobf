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

public class pa
extends pp {
    private static final long d = prr.a((long)6948503551026384638L, (long)2969231641965609258L, MethodHandles.lookup().lookupClass()).a(35293786042394L);
    private static final String u;

    public pa(long l, int n, byte by) {
        long l2 = (l << 8 | (long)by << 56 >>> 56) ^ d;
        long l3 = l2 ^ 0x19D576A4A116L;
        int n2 = (int)(l3 >>> 56);
        int n3 = (int)(l3 << 8 >>> 32);
        int n4 = (int)(l3 << 40 >>> 40);
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
        long l = d ^ 0x2B8ECF83818DL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0098\u00ca\u00ce\u009au>\u0092\u001d\u001c'T\u00fb\u00b7&\u00a7\u008c\u007f\u008b\u0089\u00b8R\u00caI\u0010\u0000ezO\u00d1\u00d2C\u00c7".getBytes("ISO-8859-1"));
                u = pa.d(byArray3).intern();
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
