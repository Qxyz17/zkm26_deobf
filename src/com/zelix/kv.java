/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.h1;
import com.zelix.k4;
import com.zelix.l6q;
import com.zelix.prr;
import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class kv
extends k4 {
    private static final long d = prr.a((long)92209427805648837L, (long)2102407285070680577L, MethodHandles.lookup().lookupClass()).a(78117371045776L);
    private static final String l;

    kv(_4 _42, int n, long l, String string, h1 h12, l6q l6q2, PrintWriter printWriter) {
        long l2 = (l = d ^ l) ^ 0x58FE1B0AC158L;
        int n2 = (int)(l2 >>> 48);
        int n3 = (int)(l2 << 16 >>> 32);
        int n4 = (int)(l2 << 48 >>> 48);
        super(_42, n, (char)n2, n3, string, h12, l6q2, printWriter, kv.l, n4);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = d ^ 0x3E695FD6CA15L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("20\u008f\u0016\u00846G\u00ba\u00c1\u00e1\u00c7\u0095,\u00d4\u00fc\u0016\u00fd\u00adE\u00b5\u00c11u\u009a\u00f6\fh\u00c1v8\u00de\u0004\u00d6\u0001\u00a0\u00fa_\u000f\u00e1\u0010".getBytes("ISO-8859-1"));
                kv.l = kv.d(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static String d(byte[] byArray) {
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
