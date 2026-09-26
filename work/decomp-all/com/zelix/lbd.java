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

public class lbd
implements Serializable {
    public int B;
    public lbd g;
    public lbd K;
    public String q;
    public int N;
    public int t;
    public int T;
    public int U;
    private static final long a = prr.a((long)-8484528708876415271L, (long)3344241494955548256L, MethodHandles.lookup().lookupClass()).a(176456215072826L);
    private static final String b;

    public lbd(int n, long l, String string) {
        l = a ^ l;
        m44.a("w", (Object)this, (int)n, (long)-6734754737788974708L, (long)l);
        m44.a("w", (Object)this, (String)string, (long)-6418637378698401835L, (long)l);
    }

    public static lbd S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x6FF8CC51B780L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = null;
        objectArray2[1] = l2;
        objectArray2[0] = n;
        return m44.a("i", (Object)objectArray2, (long)-7071733556113070219L, (long)l);
    }

    public String toString() {
        CallSite callSite;
        block4: {
            long l;
            block5: {
                l = a ^ 0x7E36F6626262L;
                long l2 = l ^ 0x1CB7CFA4EC1AL;
                CallSite callSite2 = m44.a("k", (long)2801342274590275810L, (long)l);
                try {
                    try {
                        callSite = m44.a("u", (Object)this, (long)4410233367168531469L, (long)l);
                        if (callSite2 != null) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)((Object)n92), (long)2857793420622150254L, (long)l);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = this;
                    objectArray[0] = l2;
                    return "<" + (String)((Object)m44.a("k", (Object)objectArray, (long)2474119730938117670L, (long)l)) + b;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)((Object)n93), (long)2857793420622150254L, (long)l);
                }
            }
            callSite = m44.a("u", (Object)this, (long)4410233367168531469L, (long)l);
        }
        return callSite;
    }

    public static lbd i(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string = (String)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x90E3E6B8BBAL;
        switch (n) {
            default: 
        }
        return new lbd(n, l2, string);
    }

    public lbd() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x72EF46C145B4L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0082\u0092m\u00a8*\u00b8\u00efK".getBytes("ISO-8859-1"));
                b = lbd.a(byArray3).intern();
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
