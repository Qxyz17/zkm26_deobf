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
        long l = prr.a((long)9186384277329139361L, (long)3180951269003927877L, MethodHandles.lookup().lookupClass()).a(208947767650373L) ^ 0x668FCE4F263CL;
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
        String string = "\u00a3\u00ed\u00b2s\u00c4\u0080m\u00e7\b\u00c0~p\u00f4\u00cd\u0089\u0004\u00aa\bJsW\u00f2\u00b18\u00e64";
        int n2 = "\u00a3\u00ed\u00b2s\u00c4\u0080m\u00e7\b\u00c0~p\u00f4\u00cd\u0089\u0004\u00aa\bJsW\u00f2\u00b18\u00e64".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = m1.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                D = new m1(stringArray[1], 0);
                w = new m1(stringArray[0], 1);
                i = new m1(stringArray[2], 2);
                T = new m1[]{m44.a("k", (long)8163506059729554981L, (long)l), m44.a("k", (long)8563802272721475758L, (long)l), m44.a("k", (long)7564928838275239598L, (long)l)};
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
