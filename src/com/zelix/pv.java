/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.v2;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class pv
extends v2 {
    private static final long a = prr.a((long)1853512363043344759L, (long)-6132311197911564382L, MethodHandles.lookup().lookupClass()).a(134959851188417L);
    private static final String c;

    protected void O(Object[] objectArray) {
        long l = (Long)objectArray[0];
        lqq lqq2 = (lqq)objectArray[1];
        int n = (Integer)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l ^ 0x18799A6A2BDL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("u", (Object)lqq2, (Object)objectArray2, (long)-4372815446475910811L, (long)l);
    }

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return c;
    }

    public pv(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x69EF3FA4E7FFL;
        super(l2, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x6D6386458838L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00e0W\u00c4\u00cc_En\u00ff\u0083*\u000e\u00aa\u00c7\u00fa\u0090\u00e5\u001cY8\u001eY\u0097\u00bd\u00bd".getBytes("ISO-8859-1"));
                c = pv.b(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static String b(byte[] byArray) {
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
