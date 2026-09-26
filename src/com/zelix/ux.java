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

public class ux
extends Enum {
    private static final ux[] J;
    public static final ux l;
    public static final ux R;
    public static final ux V;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ux() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = prr.a((long)-7720071210312276533L, (long)8280121475201814144L, MethodHandles.lookup().lookupClass()).a(92111150674192L) ^ 0x63DD3ECB2A96L;
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
        String string = "\u00a5\u0097\u00b6\u0096|\u00b6\u0087\u001b\u00d2\u009c\u00f3\u0013\u001dY\u00a6:\u0010\u0098n\u0013\u00a5o\u00a4`\u0016c\u0017\u0003\u00d2$i\u009f)\u0010\u0000\u00a5@\u001d\u00a4\u0081\u00e1\u00b3\u00d2\u0096\u00da|`\u00eb\u00bc\u00c6";
        int n2 = "\u00a5\u0097\u00b6\u0096|\u00b6\u0087\u001b\u00d2\u009c\u00f3\u0013\u001dY\u00a6:\u0010\u0098n\u0013\u00a5o\u00a4`\u0016c\u0017\u0003\u00d2$i\u009f)\u0010\u0000\u00a5@\u001d\u00a4\u0081\u00e1\u00b3\u00d2\u0096\u00da|`\u00eb\u00bc\u00c6".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = ux.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                ux.l = new ux(stringArray[0], 0);
                R = new ux(stringArray[1], 1);
                V = new ux(stringArray[2], 2);
                J = new ux[]{m44.a("o", (long)4797651893038989564L, (long)l), m44.a("o", (long)6502607897501235426L, (long)l), m44.a("o", (long)4703944201493190863L, (long)l)};
                return;
            }
            n3 = string.charAt(n4);
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
