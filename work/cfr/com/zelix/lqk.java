/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lqo;
import com.zelix.m44;
import com.zelix.prr;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lqk
extends lqo {
    private static String r;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = prr.a(-8429103650776909769L, 8133984741930161674L, MethodHandles.lookup().lookupClass()).a(226207199327392L) ^ 0x576EF14BE76BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("/\u00e5\u0007\u008b\u00c4\u008e\u0098I\u0002\u008a\u000e5q\u0084B\u00ed\f\t\u00aa\u001b\\v\u0083\u0000".getBytes("ISO-8859-1"));
                String string = lqk.a(byArray3).intern();
                m44.a("h", string, (long)-5151725249228267895L, (long)l10);
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    @Override
    public boolean accept(File file) {
        return true;
    }

    @Override
    public String x(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return m44.a("n", (long)1328619363086972024L, (long)l10);
    }

    private static String a(byte[] byArray) {
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

