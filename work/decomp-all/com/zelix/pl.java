/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.py;
import com.zelix.q1;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class pl
extends py {
    private static final long c = prr.a((long)-1461848386743336143L, (long)-5598982734956162610L, MethodHandles.lookup().lookupClass()).a(260072760941399L);
    private static final String d;

    public pl(long l, int n) {
        long l2 = (l = c ^ l) ^ 0x259EDDCDC2C7L;
        super(l2, n);
    }

    protected void O(Object[] objectArray) {
        long l = (Long)objectArray[0];
        lqq lqq2 = (lqq)objectArray[1];
        int n = (Integer)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l ^ 0x48EF352C0649L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = 0;
        q1 q12 = (q1)m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)-2419197939025966992L, (long)l);
    }

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return d;
    }

    public void X(Object[] objectArray) {
        fu fu2 = (fu)objectArray[0];
        long l = (Long)objectArray[1];
        lqq lqq2 = (lqq)objectArray[2];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = lqq2;
        objectArray2[1] = l2;
        objectArray2[0] = fu2;
        super.X(objectArray2);
    }

    q1 E(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = c ^ l) ^ 0x64D21825D4FDL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = 0;
        return (q1)m44.a("q", (Object)((Object)this), (Object)objectArray2, (long)925881663182461636L, (long)l);
    }

    boolean D(Object[] objectArray) {
        return false;
    }

    boolean v(Object[] objectArray) {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = c ^ 0x29EE8B48394EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00bf6\u00dcS\u00e5\u00aeg\u00aa".getBytes("ISO-8859-1"));
                d = pl.c(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static String c(byte[] byArray) {
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
