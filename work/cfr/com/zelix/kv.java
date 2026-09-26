/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.h1;
import com.zelix.k4;
import com.zelix.l6q;
import com.zelix.prr;
import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class kv
extends k4 {
    private static final long d = prr.a(92209427805648837L, 2102407285070680577L, MethodHandles.lookup().lookupClass()).a(78117371045776L);
    private static final String l;

    kv(_4 _42, int n10, long l10, String string, h1 h12, l6q l6q2, PrintWriter printWriter) {
        long l11 = (l10 = d ^ l10) ^ 0x58FE1B0AC158L;
        int n11 = (int)(l11 >>> 48);
        int n12 = (int)(l11 << 16 >>> 32);
        int n13 = (int)(l11 << 48 >>> 48);
        super(_42, n10, (char)n11, n12, string, h12, l6q2, printWriter, l, n13);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = d ^ 0x3E695FD6CA15L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("20\u008f\u0016\u00846G\u00ba\u00c1\u00e1\u00c7\u0095,\u00d4\u00fc\u0016\u00fd\u00adE\u00b5\u00c11u\u009a\u00f6\fh\u00c1v8\u00de\u0004\u00d6\u0001\u00a0\u00fa_\u000f\u00e1\u0010".getBytes("ISO-8859-1"));
                l = kv.d(byArray3).intern();
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

