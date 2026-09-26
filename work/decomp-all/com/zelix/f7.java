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
    private static final long b = prr.a((long)-8638967115964214634L, (long)-2569222958563735003L, MethodHandles.lookup().lookupClass()).a(213255375856396L);
    private static final String c;

    public static f7 C(long l, int n, String string) {
        l = b ^ l;
        switch (n) {
            default: 
        }
        return new f7(n, string);
    }

    public f7(int n, String string) {
        this.v = n;
        this.g = string;
    }

    public f7() {
    }

    public static f7 S(int n, long l) {
        long l2 = (l = b ^ l) ^ 0x2D4F5FCDA756L;
        return f7.C(l2, n, null);
    }

    public String toString() {
        String string;
        block4: {
            block5: {
                long l = b ^ 0x22FCB2E4FC8L;
                long l2 = l ^ 0x7C2C0F946B9DL;
                CallSite callSite = m44.a("l", (long)-4631870979797014538L, (long)l);
                try {
                    try {
                        string = this.g;
                        if (callSite != null) break block4;
                        if (string != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)((Object)n92), (long)-6484158958525766220L, (long)l);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = this;
                    objectArray[0] = l2;
                    return "<" + (String)((Object)m44.a("l", (Object)objectArray, (long)-6497930846112482911L, (long)l)) + c;
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)((Object)n93), (long)-6484158958525766220L, (long)l);
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
        long l = b ^ 0x6278E696F2AAL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00f1\u0080\u00fe\u00dd2\u00ee\u00ab\u0011".getBytes("ISO-8859-1"));
                c = f7.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
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
