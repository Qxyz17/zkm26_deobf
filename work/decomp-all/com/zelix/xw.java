/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.js;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.va;
import java.io.DataOutputStream;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xw
extends js {
    private va s;
    byte[] B;
    int O;
    private static final String a;

    public va A(long l) {
        return m44.a("s", (Object)((Object)this), (long)-5443377408583825939L, (long)l);
    }

    protected void O(DataOutputStream dataOutputStream, long l) {
        dataOutputStream.write((byte[])m44.a("w", (Object)((Object)this), (long)-518556406730725026L, (long)l));
    }

    protected boolean Z(Object[] objectArray) {
        return false;
    }

    int x(long l) {
        return (int)m44.a("v", (Object)((Object)this), (long)9071248417239652923L, (long)l);
    }

    public String z(char c, int n, short s) {
        long l = (long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48;
        return ((Object)((Object)this)).getClass().getName() + a + m44.a("s", (Object)((Object)this), (long)-1164924830646149555L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = prr.a((long)-743527924663373026L, (long)927925185656625315L, MethodHandles.lookup().lookupClass()).a(23628897109672L) ^ 0x16EEC3A862L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00c0\u009eR\u00f0\f\u00db\u0085\u0003".getBytes("ISO-8859-1"));
                a = xw.b(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static String b(byte[] byArray) {
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
