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

public class kf
extends k4 {
    private static final long d = prr.a(7173990486452388900L, 1842474659957883045L, MethodHandles.lookup().lookupClass()).a(114424468236540L);
    private static final String l;

    kf(_4 _42, int n10, String string, h1 h12, long l10, l6q l6q2, PrintWriter printWriter) {
        long l11 = (l10 = d ^ l10) ^ 0x30B985C05A0EL;
        int n11 = (int)(l11 >>> 48);
        int n12 = (int)(l11 << 16 >>> 32);
        int n13 = (int)(l11 << 48 >>> 48);
        super(_42, n10, (char)n11, n12, string, h12, l6q2, printWriter, l, n13);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = d ^ 0x7DB06C8A7E53L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("M\u0005K\u00ddz\u00a5\u0088\u00f4\u0098|\u000b\u00c3\u00f2\r\\\u00ab\u0015\u00faj\u0006\u008c\n\u00fak\u0017J=,\u00af\u001a\u00fb[\u00b7\u001c'\u0017\u00cbU(\u0014".getBytes("ISO-8859-1"));
                l = kf.d(byArray3).intern();
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

