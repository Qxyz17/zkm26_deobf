/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class gz
extends Enum {
    public static final gz V;
    private final String A;
    private static final gz[] g;
    public static final gz d;
    public static final gz N;
    private static final long a;

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = prr.a((long)-8375364188333939013L, (long)-2534304180804198935L, MethodHandles.lookup().lookupClass()).a(58800346986099L);
        long l = a ^ 0x2130A60F4A7FL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\u00b8n_Cm\u00d4t\u00b8\u0010-\u00dd+E\u00a0\u00ccL\n\u00e7K\u0010\u00eb\u0013\u00c652\b\u00fc\u00e9\u00e2B5\u001f\u0095x";
        int n2 = "\u00b8n_Cm\u00d4t\u00b8\u0010-\u00dd+E\u00a0\u00ccL\n\u00e7K\u0010\u00eb\u0013\u00c652\b\u00fc\u00e9\u00e2B5\u001f\u0095x".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = gz.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                d = new gz(stringArray[1], 0, "");
                N = new gz(stringArray[2], 1, "-");
                V = new gz(stringArray[0], 2, "+");
                g = new gz[]{m44.a("n", (long)1574440486581499560L, (long)l), m44.a("n", (long)1444325803460416536L, (long)l), m44.a("n", (long)1647118009488889731L, (long)l)};
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    String Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("s", (Object)((Object)this), (long)7471053512062172009L, (long)l);
    }

    public static gz[] W(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (gz[])((Enum)((Object)m44.a("m", (long)4952618799441046101L, (long)l))).clone();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gz() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.A = var3_1;
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
