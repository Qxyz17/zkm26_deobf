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
        a = prr.a((long)4629009211230037681L, (long)-2925839782322160408L, MethodHandles.lookup().lookupClass()).a(252865449366453L);
        long l = a ^ 0x7BF1830CFAF3L;
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
        String string = "\u00caA-\u00ee\u00efzSX\b?Hc\u00f6\u009e\u00b1\u00afL\u0010\u00f8{!\u009a3_\u008f\u0016\u001bi[\u009b\u008e\u0092\u00d5\u0019";
        int n2 = "\u00caA-\u00ee\u00efzSX\b?Hc\u00f6\u009e\u00b1\u00afL\u0010\u00f8{!\u009a3_\u008f\u0016\u001bi[\u009b\u008e\u0092\u00d5\u0019".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = nf.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                i = new nf(stringArray[2], 0);
                H = new nf(stringArray[1], 1);
                Y = new nf(stringArray[0], 2);
                F = new nf[]{m44.a("i", (long)8816761836499157048L, (long)l), m44.a("i", (long)8795522209048679806L, (long)l), m44.a("i", (long)7438294640015858307L, (long)l)};
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public static nf[] o(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (nf[])((Enum)((Object)m44.a("j", (long)8061768476359806812L, (long)l))).clone();
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
