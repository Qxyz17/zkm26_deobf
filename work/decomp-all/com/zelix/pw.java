/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.pp;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class pw
extends pp {
    private static final long d = prr.a((long)-3202506922201489500L, (long)8487279212384763021L, MethodHandles.lookup().lookupClass()).a(220802229060052L);
    private static final String u;

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return u;
    }

    public pw(int n, long l) {
        long l2 = (l = d ^ l) ^ 0x368F7E2DC445L;
        int n2 = (int)(l2 >>> 56);
        int n3 = (int)(l2 << 8 >>> 32);
        int n4 = (int)(l2 << 40 >>> 40);
        super((byte)n2, n, n3, n4);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = d ^ 0x4EEA8FB8A303L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("qDx\u00a8\u0095\u0002Z\u00e1h\u00d5(HC\u00c5\u00c9\u00a7\u0016\u00c9Z4)\u00bcu9\u00bd\u00dfM\u00bcA?\u00ca\u00a3".getBytes("ISO-8859-1"));
                u = pw.d(byArray3).intern();
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
