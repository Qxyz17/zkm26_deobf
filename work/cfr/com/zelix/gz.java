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
        a = prr.a(-8375364188333939013L, -2534304180804198935L, MethodHandles.lookup().lookupClass()).a(58800346986099L);
        long l10 = a ^ 0x2130A60F4A7FL;
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
        String[] stringArray = new String[3];
        int n10 = 0;
        String string = "\u00b8n_Cm\u00d4t\u00b8\u0010-\u00dd+E\u00a0\u00ccL\n\u00e7K\u0010\u00eb\u0013\u00c652\b\u00fc\u00e9\u00e2B5\u001f\u0095x";
        int n11 = "\u00b8n_Cm\u00d4t\u00b8\u0010-\u00dd+E\u00a0\u00ccL\n\u00e7K\u0010\u00eb\u0013\u00c652\b\u00fc\u00e9\u00e2B5\u001f\u0095x".length();
        int n12 = 8;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = gz.a(byArray3).intern();
            if ((n13 += n12) >= n11) {
                d = new gz(stringArray[1], 0, "");
                N = new gz(stringArray[2], 1, "-");
                V = new gz(stringArray[0], 2, "+");
                g = new gz[]{m44.a("n", (long)1574440486581499560L, (long)l10), m44.a("n", (long)1444325803460416536L, (long)l10), m44.a("n", (long)1647118009488889731L, (long)l10)};
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    String Y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("s", (Object)((Object)this), (long)7471053512062172009L, (long)l10);
    }

    public static gz[] W(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (gz[])((Enum)((Object)m44.a("m", (long)4952618799441046101L, (long)l10))).clone();
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

