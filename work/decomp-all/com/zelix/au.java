/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.un;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class au
extends un {
    private final String Y;
    private static final long a = prr.a((long)-2779430999009309828L, (long)-5486057182961105793L, MethodHandles.lookup().lookupClass()).a(157168792918999L);
    private static final String b;

    public String e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("u", (Object)((Object)this), (long)8634607838892063567L, (long)l);
    }

    public String getMessage() {
        long l = a ^ 0x4A7BC6425D88L;
        long l2 = l ^ 0x13868527218CL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return super.getMessage() + b + (String)((Object)m44.a("q", (Object)((Object)this), (Object)objectArray, (long)397709515471389471L, (long)l)) + "'";
    }

    public au(String string, String string2) {
        super(string);
        this.Y = string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x116A7358D3E6L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0016A\u001c\u00de\u00978\u00b4$".getBytes("ISO-8859-1"));
                b = au.a(byArray3).intern();
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
