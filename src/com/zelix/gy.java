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

public class gy
implements Serializable {
    public String J;
    public gy X;
    public int E;
    public gy G;
    public int F;
    public int V;
    public int o;
    public int D;
    private static final long a = prr.a((long)-1119910424561374166L, (long)6712761527080025061L, MethodHandles.lookup().lookupClass()).a(201529363074441L);
    private static final String b;

    public String toString() {
        CallSite callSite;
        block4: {
            long l;
            block5: {
                l = a ^ 0x4B9CB3581773L;
                long l2 = l ^ 0x65E5585DB06BL;
                CallSite callSite2 = m44.a("j", (long)8862823897792945090L, (long)l);
                try {
                    try {
                        callSite = m44.a("t", (Object)this, (long)9123816566300468303L, (long)l);
                        if (callSite2 != false) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)7063582587225133365L, (long)l);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = this;
                    objectArray[0] = l2;
                    return "<" + (String)((Object)m44.a("j", (Object)objectArray, (long)9089583032383349335L, (long)l)) + b;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)7063582587225133365L, (long)l);
                }
            }
            callSite = m44.a("t", (Object)this, (long)9123816566300468303L, (long)l);
        }
        return callSite;
    }

    public static gy x(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string = (String)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x73107DE10B0BL;
        switch (n) {
            default: 
        }
        return new gy(l2, n, string);
    }

    public gy(long l, int n, String string) {
        l = a ^ l;
        m44.a("v", (Object)this, (int)n, (long)4250310005815159834L, (long)l);
        m44.a("v", (Object)this, (String)string, (long)4460386845974046519L, (long)l);
    }

    public gy() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x6EBF5C4EEC71L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00ee2\u0097\u0013)dkS".getBytes("ISO-8859-1"));
                b = gy.a(byArray3).intern();
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
