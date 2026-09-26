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
    private static final long d = prr.a((long)7173990486452388900L, (long)1842474659957883045L, MethodHandles.lookup().lookupClass()).a(114424468236540L);
    private static final String l;

    kf(_4 _42, int n, String string, h1 h12, long l, l6q l6q2, PrintWriter printWriter) {
        long l2 = (l = d ^ l) ^ 0x30B985C05A0EL;
        int n2 = (int)(l2 >>> 48);
        int n3 = (int)(l2 << 16 >>> 32);
        int n4 = (int)(l2 << 48 >>> 48);
        super(_42, n, (char)n2, n3, string, h12, l6q2, printWriter, kf.l, n4);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = d ^ 0x7DB06C8A7E53L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("M\u0005K\u00ddz\u00a5\u0088\u00f4\u0098|\u000b\u00c3\u00f2\r\\\u00ab\u0015\u00faj\u0006\u008c\n\u00fak\u0017J=,\u00af\u001a\u00fb[\u00b7\u001c'\u0017\u00cbU(\u0014".getBytes("ISO-8859-1"));
                kf.l = kf.d(byArray3).intern();
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
