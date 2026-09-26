/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.b5;
import com.zelix.bd;
import com.zelix.h1;
import com.zelix.km;
import com.zelix.l6q;
import com.zelix.lkv;
import com.zelix.prr;
import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class kq
extends km {
    private static final long c = prr.a((long)-7513067320970183194L, (long)-509992025370766718L, MethodHandles.lookup().lookupClass()).a(170423083272112L);
    private static final String i;

    final b5 j(Object[] objectArray) {
        h1 h12 = (h1)objectArray[0];
        lkv lkv2 = (lkv)objectArray[1];
        l6q l6q2 = (l6q)objectArray[2];
        l6q l6q3 = (l6q)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = l ^ 0x380402CA8C64L;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 32);
        int n3 = (int)(l2 << 48 >>> 48);
        return new bd((_4)this, h12, (short)n, n2, lkv2, l6q2, l6q3, (short)n3);
    }

    kq(_4 _42, int n, String string, h1 h12, lkv lkv2, l6q l6q2, PrintWriter printWriter, long l, l6q l6q3) {
        long l2 = (l = c ^ l) ^ 0x5633B1630BACL;
        super(l2, _42, n, string, h12, lkv2, l6q2, printWriter, l6q3, i);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = c ^ 0x4129560DDEB3L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00ac\\\u00d6\u00f7eR\u0000@\u00bdSF\u0095\u0012\u00e4v\u00a1\u00b2\u00adG\u0016\u00a0\\\u0097&\u00a8\u00d63j>\u000b\u0091\u00d2W\u000ew.\u0086\u0081\u00b2\u0012\u000f\u009e\u00af\u00127\u00b4\u00e9\u0000".getBytes("ISO-8859-1"));
                i = kq.d(byArray3).intern();
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
