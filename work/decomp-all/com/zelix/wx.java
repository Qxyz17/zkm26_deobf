/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.as;
import com.zelix.e_;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.s4;
import com.zelix.we;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.JFrame;

public class wx
extends we {
    private static final long g = prr.a((long)-5542442267622384929L, (long)-8600473800804424161L, MethodHandles.lookup().lookupClass()).a(88975572937081L);
    private static final String t;

    void c(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        m44.a("t", (Object)m44.a("u", (Object)((Object)this), (long)5909318934659889626L, (long)l), (Object)string, (long)5375534165255695773L, (long)l);
        m44.a("t", (Object)m44.a("u", (Object)((Object)this), (long)5909318934659889626L, (long)l), (long)6212285030311376188L, (long)l);
    }

    wx(JFrame jFrame, long l, String string, s4 s42, String string2, String string3, String string4, as as2, e_ e_2) {
        long l2 = (l = g ^ l) ^ 0x2B79B299B7FBL;
        super(jFrame, string, s42, string2, l2, string3, string4, as2, e_2);
    }

    protected void t(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x12F773D3DD6FL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = t;
        objectArray2[0] = l2;
        m44.a("m", (Object)objectArray2, (long)-6243376261779347484L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = g ^ 0x5CB92BA26A53L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00c91\b\u001c\u00e2zHU".getBytes("ISO-8859-1"));
                t = wx.d(byArray3).intern();
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
