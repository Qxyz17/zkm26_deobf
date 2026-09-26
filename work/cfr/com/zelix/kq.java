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
    private static final long c = prr.a(-7513067320970183194L, -509992025370766718L, MethodHandles.lookup().lookupClass()).a(170423083272112L);
    private static final String i;

    @Override
    final b5 j(Object[] objectArray) {
        h1 h12 = (h1)objectArray[0];
        lkv lkv2 = (lkv)objectArray[1];
        l6q l6q2 = (l6q)objectArray[2];
        l6q l6q3 = (l6q)objectArray[3];
        long l10 = (Long)objectArray[4];
        long l11 = l10 ^ 0x380402CA8C64L;
        int n10 = (int)(l11 >>> 48);
        int n11 = (int)(l11 << 16 >>> 32);
        int n12 = (int)(l11 << 48 >>> 48);
        return new bd((_4)this, h12, (short)n10, n11, lkv2, l6q2, l6q3, (short)n12);
    }

    kq(_4 _42, int n10, String string, h1 h12, lkv lkv2, l6q l6q2, PrintWriter printWriter, long l10, l6q l6q3) {
        long l11 = (l10 = c ^ l10) ^ 0x5633B1630BACL;
        super(l11, _42, n10, string, h12, lkv2, l6q2, printWriter, l6q3, i);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = c ^ 0x4129560DDEB3L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00ac\\\u00d6\u00f7eR\u0000@\u00bdSF\u0095\u0012\u00e4v\u00a1\u00b2\u00adG\u0016\u00a0\\\u0097&\u00a8\u00d63j>\u000b\u0091\u00d2W\u000ew.\u0086\u0081\u00b2\u0012\u000f\u009e\u00af\u00127\u00b4\u00e9\u0000".getBytes("ISO-8859-1"));
                i = kq.d(byArray3).intern();
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

