/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.e_;
import com.zelix.law;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.sh;
import com.zelix.yf;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lam
extends law {
    private static final long f = prr.a(-4132240162669048420L, 5929193517401458823L, MethodHandles.lookup().lookupClass()).a(148554467476386L);
    private static final String s;

    public lam(int n10, long l10) {
        long l11 = (l10 = f ^ l10) ^ 0x649BA3ACDD23L;
        super(l11, n10);
    }

    @Override
    void Y(Object[] objectArray) {
        sh sh2 = (sh)objectArray[0];
        File file = (File)objectArray[1];
        yf yf2 = (yf)objectArray[2];
        lqu lqu2 = (lqu)objectArray[3];
        long l10 = (Long)objectArray[4];
        e_ e_2 = (e_)objectArray[5];
        long l11 = l10;
        long l12 = l11 ^ 0x4D1CD9010BF9L;
        long l13 = l11 ^ 0x500983CFCFA1L;
        long l14 = l11 ^ 0x797BA803AA26L;
        long l15 = l11 ^ 0x7F8F68037BFBL;
        long l16 = l11 ^ 0x30F272F33439L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l13;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l16;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l15;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l14;
        Object[] objectArray6 = new Object[9];
        objectArray6[8] = l12;
        objectArray6[7] = e_2;
        objectArray6[6] = lqu2;
        objectArray6[5] = yf2;
        objectArray6[4] = file;
        objectArray6[3] = m44.a("p", (Object)this, (Object)objectArray5, (long)368114741630734281L, (long)l10);
        objectArray6[2] = (boolean)m44.a("p", (Object)this, (Object)objectArray4, (long)412805188502826508L, (long)l10);
        objectArray6[1] = (boolean)m44.a("p", (Object)this, (Object)objectArray3, (long)1973595385181068481L, (long)l10);
        objectArray6[0] = (int)m44.a("p", (Object)this, (Object)objectArray2, (long)439976344790539639L, (long)l10);
        m44.a("p", (Object)sh2, (Object)objectArray6, (long)2212220083423605115L, (long)l10);
    }

    @Override
    public String N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return s;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = f ^ 0x1F1DAB5170ABL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00d6\u0087\u0005\u00ce\u0010\u00ec\u00bc\u00c5".getBytes("ISO-8859-1"));
                s = lam.e(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static String e(byte[] byArray) {
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

