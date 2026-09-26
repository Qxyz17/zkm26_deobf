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
    private static final long a = prr.a((long)531971709687392540L, (long)-389252022037004528L, MethodHandles.lookup().lookupClass()).a(272962699947559L);
    private static final String b;

    h2(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x6539FB77B178L;
        this.S = new ArrayList(n);
        m44.a("u", (Object)this, (l6c[])new l6c[0], (long)-8079653962077177891L, (long)l);
        this.v = new lkv(true, l2, b, 5);
    }

    ArrayList I(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("s", (Object)this, (long)-8804518451411904219L, (long)l);
    }

    int x(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (int)m44.a("p", (Object)this, (long)748956057433278872L, (long)l);
    }

    int h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        h2 h22 = this;
        CallSite callSite = m44.a("q", (Object)h22, (long)8263532707050320209L, (long)l);
        m44.a("s", (Object)h22, (int)(callSite + true), (long)8263532707050320209L, (long)l);
        return (int)callSite;
    }

    void s(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        l6c[] l6cArray = (l6c[])objectArray[1];
        int n2 = (Integer)objectArray[2];
        int n3 = (Integer)objectArray[3];
        long l = ((long)n << 56 | (long)n2 << 32 >>> 8 | (long)n3 << 40 >>> 40) ^ a;
        m44.a("t", (Object)this, (l6c[])l6cArray, (long)58122955981879500L, (long)l);
    }

    lkv s(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("s", (Object)this, (long)-4614337475253905670L, (long)l);
    }

    l6c[] F(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("u", (Object)this, (long)-5855491631694555457L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x3F1C2C2B9848L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0012\u00bbq\u0096vil1".getBytes("ISO-8859-1"));
                b = h2.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static String a(byte[] byArray) {
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
