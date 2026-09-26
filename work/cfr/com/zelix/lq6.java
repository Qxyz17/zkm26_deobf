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

    @Override
    public String x(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return m44.a("n", (long)1692939408112786685L, (long)l10);
    }

    @Override
    public boolean accept(File file) {
        long l10 = b ^ 0x2163DE33B19AL;
        return (boolean)m44.a("t", (Object)file, (long)437803878556814697L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = prr.a(-1746730572684644620L, 5819116298645953765L, MethodHandles.lookup().lookupClass()).a(253607786474599L);
        long l10 = b ^ 0x1FB9709CB3ACL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("/\u00ca\u0096\u0003\u0006\u00d9J\u0094\u008c\u000b\u00c5\u00b5\u00df\u00cf\u00a3\u00a5".getBytes("ISO-8859-1"));
                String string = lq6.a(byArray3).intern();
                m44.a("n", string, (long)549894737211853858L, (long)l10);
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
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

