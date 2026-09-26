/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.i_;
import com.zelix.l6e;
import com.zelix.prr;
import com.zelix.xo;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class mw
implements l6e {
    private static final String a;
    private static final long b;

    @Override
    public List m(Object[] objectArray) {
        xo xo2 = (xo)objectArray[0];
        long l10 = (Long)objectArray[1];
        xo[] xoArray = (xo[])objectArray[2];
        ArrayList<i_> arrayList = new ArrayList<i_>();
        arrayList.add(new i_((int)b, xo2));
        return arrayList;
    }

    @Override
    public String w(Object[] objectArray) {
        return "a";
    }

    @Override
    public int r(Object[] objectArray) {
        return 0;
    }

    @Override
    public String[] b(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return null;
    }

    @Override
    public String B(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return a;
    }

    @Override
    public String[] f(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return null;
    }

    @Override
    public String[] J(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = prr.a(-1289979445969859699L, 1707026527122068901L, MethodHandles.lookup().lookupClass()).a(235075080074983L) ^ 0x272325EB97CL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        byte[] byArray3 = cipher.doFinal("\u00b9\u00d2`$\u0081q\u0007\u00e55\u0002\u00feyoes<S\u00a0\u00e9!\u00e5.\u009c\u00a0\u00a64\u008c\u000b\t\u00fe\u0099w\u0092\u00a4Q[\u00dc\u001fM\u00ab".getBytes("ISO-8859-1"));
        a = mw.b(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l11 = -1161482446209499188L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                b = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static String b(byte[] byArray) {
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

