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

public class m1
extends Enum {
    public static final m1 i;
    public static final m1 D;
    public static final m1 w;
    private static final m1[] T;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private m1() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = prr.a(9186384277329139361L, 3180951269003927877L, MethodHandles.lookup().lookupClass()).a(208947767650373L) ^ 0x668FCE4F263CL;
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
        String string = "\u00a3\u00ed\u00b2s\u00c4\u0080m\u00e7\b\u00c0~p\u00f4\u00cd\u0089\u0004\u00aa\bJsW\u00f2\u00b18\u00e64";
        int n11 = "\u00a3\u00ed\u00b2s\u00c4\u0080m\u00e7\b\u00c0~p\u00f4\u00cd\u0089\u0004\u00aa\bJsW\u00f2\u00b18\u00e64".length();
        int n12 = 8;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = m1.a(byArray3).intern();
            if ((n13 += n12) >= n11) {
                D = new m1(stringArray[1], 0);
                w = new m1(stringArray[0], 1);
                i = new m1(stringArray[2], 2);
                T = new m1[]{m44.a("k", (long)8163506059729554981L, (long)l10), m44.a("k", (long)8563802272721475758L, (long)l10), m44.a("k", (long)7564928838275239598L, (long)l10)};
                return;
            }
            n12 = string.charAt(n13);
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

