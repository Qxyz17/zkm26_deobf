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
    private static final long f = prr.a((long)-4132240162669048420L, (long)5929193517401458823L, MethodHandles.lookup().lookupClass()).a(148554467476386L);
    private static final String s;

    public lam(int n, long l) {
        long l2 = (l = f ^ l) ^ 0x649BA3ACDD23L;
        super(l2, n);
    }

    void Y(Object[] objectArray) {
        sh sh2 = (sh)objectArray[0];
        File file = (File)objectArray[1];
        yf yf2 = (yf)objectArray[2];
        lqu lqu2 = (lqu)objectArray[3];
        long l = (Long)objectArray[4];
        e_ e_2 = (e_)objectArray[5];
        long l2 = l;
        long l3 = l2 ^ 0x4D1CD9010BF9L;
        long l4 = l2 ^ 0x500983CFCFA1L;
        long l5 = l2 ^ 0x797BA803AA26L;
        long l6 = l2 ^ 0x7F8F68037BFBL;
        long l7 = l2 ^ 0x30F272F33439L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l7;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l6;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l5;
        Object[] objectArray6 = new Object[9];
        objectArray6[8] = l3;
        objectArray6[7] = e_2;
        objectArray6[6] = lqu2;
        objectArray6[5] = yf2;
        objectArray6[4] = file;
        objectArray6[3] = m44.a("p", (Object)((Object)this), (Object)objectArray5, (long)368114741630734281L, (long)l);
        objectArray6[2] = (boolean)m44.a("p", (Object)((Object)this), (Object)objectArray4, (long)412805188502826508L, (long)l);
        objectArray6[1] = (boolean)m44.a("p", (Object)((Object)this), (Object)objectArray3, (long)1973595385181068481L, (long)l);
        objectArray6[0] = (int)m44.a("p", (Object)((Object)this), (Object)objectArray2, (long)439976344790539639L, (long)l);
        m44.a("p", (Object)sh2, (Object)objectArray6, (long)2212220083423605115L, (long)l);
    }

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return s;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = f ^ 0x1F1DAB5170ABL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00d6\u0087\u0005\u00ce\u0010\u00ec\u00bc\u00c5".getBytes("ISO-8859-1"));
                s = lam.e(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static String e(byte[] byArray) {
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
