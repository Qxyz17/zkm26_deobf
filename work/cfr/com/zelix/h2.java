/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l6c;
import com.zelix.lkv;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class h2 {
    private int s;
    private final ArrayList S;
    private l6c[] m;
    private final lkv v;
    private static final long a = prr.a(531971709687392540L, -389252022037004528L, MethodHandles.lookup().lookupClass()).a(272962699947559L);
    private static final String b;

    h2(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x6539FB77B178L;
        this.S = new ArrayList(n10);
        m44.a("u", (Object)this, (l6c[])new l6c[0], (long)-8079653962077177891L, (long)l10);
        this.v = new lkv(true, l11, b, 5);
    }

    ArrayList I(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("s", (Object)this, (long)-8804518451411904219L, (long)l10);
    }

    int x(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("p", (Object)this, (long)748956057433278872L, (long)l10);
    }

    int h(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        h2 h22 = this;
        CallSite callSite = m44.a("q", (Object)h22, (long)8263532707050320209L, (long)l10);
        m44.a("s", (Object)h22, (int)(callSite + true), (long)8263532707050320209L, (long)l10);
        return (int)callSite;
    }

    void s(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        l6c[] l6cArray = (l6c[])objectArray[1];
        int n11 = (Integer)objectArray[2];
        int n12 = (Integer)objectArray[3];
        long l10 = ((long)n10 << 56 | (long)n11 << 32 >>> 8 | (long)n12 << 40 >>> 40) ^ a;
        m44.a("t", (Object)this, (l6c[])l6cArray, (long)58122955981879500L, (long)l10);
    }

    lkv s(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("s", (Object)this, (long)-4614337475253905670L, (long)l10);
    }

    l6c[] F(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("u", (Object)this, (long)-5855491631694555457L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x3F1C2C2B9848L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0012\u00bbq\u0096vil1".getBytes("ISO-8859-1"));
                b = h2.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
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

