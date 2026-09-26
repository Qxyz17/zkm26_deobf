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
        a = prr.a((long)-4184512124960110908L, (long)5483418663730582911L, MethodHandles.lookup().lookupClass()).a(219769041945880L);
        long l = a ^ 0x43BB14C0CC0DL;
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
        int n2 = 0;
        String string = "\u0085\u009d\u00f7y;\"\u00b2e\u0003\u00ec\u0088\u00a3\u00f1\u00bdp\u0017\u0010\u00fbpB[\u00aa7\u00c0\u00df\u008c\u00a7\u00902\u00e7\u00e5\u001c\u0011\b\u00ad3\u00c4\u00d1v\u00d7\u00e7\u00ab";
        int n3 = "\u0085\u009d\u00f7y;\"\u00b2e\u0003\u00ec\u0088\u00a3\u00f1\u00bdp\u0017\u0010\u00fbpB[\u00aa7\u00c0\u00df\u008c\u00a7\u00902\u00e7\u00e5\u001c\u0011\b\u00ad3\u00c4\u00d1v\u00d7\u00e7\u00ab".length();
        int n4 = 16;
        int n5 = -1;
        while (true) {
            int n6 = ++n5;
            byte[] byArray3 = cipher.doFinal(string.substring(n6, n6 + n4).getBytes("ISO-8859-1"));
            stringArray[n2++] = n.a(byArray3).intern();
            if ((n5 += n4) >= n3) {
                f = new n(stringArray[0], 0);
                R = new n(stringArray[2], 1);
                J = new n(stringArray[1], 2);
                v = new n[]{f, R, J};
                return;
            }
            n4 = string.charAt(n5);
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
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (n[])((Enum)((Object)m44.a("j", (long)-1207065325503449842L, (long)l))).clone();
    }

    private static String a(byte[] byArray) {
        int n2 = 0;
        int n3 = byArray.length;
        char[] cArray = new char[n3];
        for (int i = 0; i < n3; ++i) {
            char c;
            int n4 = 0xFF & byArray[i];
            if (n4 < 192) {
                cArray[n2++] = (char)n4;
                continue;
            }
            if (n4 < 224) {
                c = (char)((char)(n4 & 0x1F) << 6);
                n4 = byArray[++i];
                c = (char)(c | (char)(n4 & 0x3F));
                cArray[n2++] = c;
                continue;
            }
            if (i >= n3 - 2) continue;
            c = (char)((char)(n4 & 0xF) << 12);
            n4 = byArray[++i];
            c = (char)(c | (char)(n4 & 0x3F) << 6);
            n4 = byArray[++i];
            c = (char)(c | (char)(n4 & 0x3F));
            cArray[n2++] = c;
        }
        return new String(cArray, 0, n2);
    }
}
