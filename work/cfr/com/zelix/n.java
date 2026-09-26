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

public class n
extends Enum {
    public static final n R;
    public static final n J;
    public static final n f;
    private static final n[] v;
    private static final long a;

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = prr.a(-4184512124960110908L, 5483418663730582911L, MethodHandles.lookup().lookupClass()).a(219769041945880L);
        long l10 = a ^ 0x43BB14C0CC0DL;
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
        String string = "\u0085\u009d\u00f7y;\"\u00b2e\u0003\u00ec\u0088\u00a3\u00f1\u00bdp\u0017\u0010\u00fbpB[\u00aa7\u00c0\u00df\u008c\u00a7\u00902\u00e7\u00e5\u001c\u0011\b\u00ad3\u00c4\u00d1v\u00d7\u00e7\u00ab";
        int n11 = "\u0085\u009d\u00f7y;\"\u00b2e\u0003\u00ec\u0088\u00a3\u00f1\u00bdp\u0017\u0010\u00fbpB[\u00aa7\u00c0\u00df\u008c\u00a7\u00902\u00e7\u00e5\u001c\u0011\b\u00ad3\u00c4\u00d1v\u00d7\u00e7\u00ab".length();
        int n12 = 16;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = n.a(byArray3).intern();
            if ((n13 += n12) >= n11) {
                f = new n(stringArray[0], 0);
                R = new n(stringArray[2], 1);
                J = new n(stringArray[1], 2);
                v = new n[]{f, R, J};
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private n() {
        void var2_-1;
        void var1_-1;
    }

    public static n[] D(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (n[])((Enum)((Object)m44.a("j", (long)-1207065325503449842L, (long)l10))).clone();
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

