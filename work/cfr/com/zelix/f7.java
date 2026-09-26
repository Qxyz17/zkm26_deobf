/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class f7
implements Serializable {
    public String g;
    public int a;
    public int d;
    public int M;
    public f7 Y;
    public int P;
    public f7 X;
    public int v;
    private static final long b = prr.a(-8638967115964214634L, -2569222958563735003L, MethodHandles.lookup().lookupClass()).a(213255375856396L);
    private static final String c;

    public static f7 C(long l10, int n10, String string) {
        l10 = b ^ l10;
        switch (n10) {
            default: 
        }
        return new f7(n10, string);
    }

    public f7(int n10, String string) {
        this.v = n10;
        this.g = string;
    }

    public f7() {
    }

    public static f7 S(int n10, long l10) {
        long l11 = (l10 = b ^ l10) ^ 0x2D4F5FCDA756L;
        return f7.C(l11, n10, null);
    }

    public String toString() {
        String string;
        block4: {
            block5: {
                long l10 = b ^ 0x22FCB2E4FC8L;
                long l11 = l10 ^ 0x7C2C0F946B9DL;
                CallSite callSite = m44.a("l", (long)-4631870979797014538L, (long)l10);
                try {
                    try {
                        string = this.g;
                        if (callSite != null) break block4;
                        if (string != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)-6484158958525766220L, (long)l10);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = this;
                    objectArray[0] = l11;
                    return "<" + (String)((Object)m44.a("l", (Object)objectArray, (long)-6497930846112482911L, (long)l10)) + c;
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)-6484158958525766220L, (long)l10);
                }
            }
            string = this.g;
        }
        return string;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = b ^ 0x6278E696F2AAL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00f1\u0080\u00fe\u00dd2\u00ee\u00ab\u0011".getBytes("ISO-8859-1"));
                c = f7.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
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

