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
    private static final long a = prr.a(-1119910424561374166L, 6712761527080025061L, MethodHandles.lookup().lookupClass()).a(201529363074441L);
    private static final String b;

    public String toString() {
        CallSite callSite;
        block4: {
            long l10;
            block5: {
                l10 = a ^ 0x4B9CB3581773L;
                long l11 = l10 ^ 0x65E5585DB06BL;
                CallSite callSite2 = m44.a("j", (long)8862823897792945090L, (long)l10);
                try {
                    try {
                        callSite = m44.a("t", (Object)this, (long)9123816566300468303L, (long)l10);
                        if (callSite2 != false) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)7063582587225133365L, (long)l10);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = this;
                    objectArray[0] = l11;
                    return "<" + (String)((Object)m44.a("j", (Object)objectArray, (long)9089583032383349335L, (long)l10)) + b;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)7063582587225133365L, (long)l10);
                }
            }
            callSite = m44.a("t", (Object)this, (long)9123816566300468303L, (long)l10);
        }
        return callSite;
    }

    public static gy x(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string = (String)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x73107DE10B0BL;
        switch (n10) {
            default: 
        }
        return new gy(l11, n10, string);
    }

    public gy(long l10, int n10, String string) {
        l10 = a ^ l10;
        m44.a("v", (Object)this, (int)n10, (long)4250310005815159834L, (long)l10);
        m44.a("v", (Object)this, (String)string, (long)4460386845974046519L, (long)l10);
    }

    public gy() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x6EBF5C4EEC71L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00ee2\u0097\u0013)dkS".getBytes("ISO-8859-1"));
                b = gy.a(byArray3).intern();
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

