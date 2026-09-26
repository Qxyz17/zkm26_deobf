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

public class nf
extends Enum {
    public static final nf H;
    private static final nf[] F;
    public static final nf i;
    public static final nf Y;
    private static final long a;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private nf() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = prr.a(4629009211230037681L, -2925839782322160408L, MethodHandles.lookup().lookupClass()).a(252865449366453L);
        long l10 = a ^ 0x7BF1830CFAF3L;
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
        String string = "\u00caA-\u00ee\u00efzSX\b?Hc\u00f6\u009e\u00b1\u00afL\u0010\u00f8{!\u009a3_\u008f\u0016\u001bi[\u009b\u008e\u0092\u00d5\u0019";
        int n11 = "\u00caA-\u00ee\u00efzSX\b?Hc\u00f6\u009e\u00b1\u00afL\u0010\u00f8{!\u009a3_\u008f\u0016\u001bi[\u009b\u008e\u0092\u00d5\u0019".length();
        int n12 = 8;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = nf.a(byArray3).intern();
            if ((n13 += n12) >= n11) {
                i = new nf(stringArray[2], 0);
                H = new nf(stringArray[1], 1);
                Y = new nf(stringArray[0], 2);
                F = new nf[]{m44.a("i", (long)8816761836499157048L, (long)l10), m44.a("i", (long)8795522209048679806L, (long)l10), m44.a("i", (long)7438294640015858307L, (long)l10)};
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    public static nf[] o(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (nf[])((Enum)((Object)m44.a("j", (long)8061768476359806812L, (long)l10))).clone();
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

