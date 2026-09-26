/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lqo;
import com.zelix.m44;
import com.zelix.prr;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lq6
extends lqo {
    private static String w;
    private static final long b;

    public String x(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("n", (long)1692939408112786685L, (long)l);
    }

    public boolean accept(File file) {
        long l = b ^ 0x2163DE33B19AL;
        return (boolean)m44.a("t", (Object)file, (long)437803878556814697L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = prr.a((long)-1746730572684644620L, (long)5819116298645953765L, MethodHandles.lookup().lookupClass()).a(253607786474599L);
        long l = b ^ 0x1FB9709CB3ACL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("/\u00ca\u0096\u0003\u0006\u00d9J\u0094\u008c\u000b\u00c5\u00b5\u00df\u00cf\u00a3\u00a5".getBytes("ISO-8859-1"));
                String string = lq6.a(byArray3).intern();
                m44.a("n", (String)string, (long)549894737211853858L, (long)l);
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
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
