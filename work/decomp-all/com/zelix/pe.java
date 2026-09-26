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

public class pe
extends v2 {
    private static final long a = prr.a((long)4218008070162133789L, (long)2355840549318582879L, MethodHandles.lookup().lookupClass()).a(133533372457180L);
    private static final String c;

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return c;
    }

    public pe(char c, int n, int n2, short s) {
        long l = ((long)c << 48 | (long)n2 << 32 >>> 16 | (long)s << 48 >>> 48) ^ a;
        long l2 = l ^ 0x19E0D5C8B964L;
        super(l2, n);
    }

    protected void O(Object[] objectArray) {
        long l = (Long)objectArray[0];
        lqq lqq2 = (lqq)objectArray[1];
        int n = (Integer)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l ^ 0x2F724526D13L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("u", (Object)lqq2, (Object)objectArray2, (long)-4487694460687647279L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x344ED9E2DF50L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("Y,i\u008e\u00de_G\u001edw\u00ca=\u0099]R\u0006".getBytes("ISO-8859-1"));
                c = pe.b(byArray3).intern();
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
