/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lby {
    private static String e;
    private final String G;
    private int J;
    private static final long a;
    private static final long b;

    public static String V() {
        return e;
    }

    public lby(long l10, String string, byte by2) {
        long l11 = (l10 << 8 | (long)by2 << 56 >>> 56) ^ a;
        CallSite callSite = m44.a("l", (long)8253452677921611310L, (long)l11);
        CallSite callSite2 = callSite;
        try {
            this.J = (int)b;
            this.G = string;
            if (callSite2 == null) {
                m44.a("l", "yWhKVb", (long)8235760348708180936L, (long)l11);
            }
        }
        catch (n9 n92) {
            throw m44.a("l", (Object)n92, (long)7624282078716353458L, (long)l11);
        }
    }

    public static void N(String string) {
        e = string;
    }

    public String toString() {
        CallSite callSite;
        block4: {
            long l10;
            block5: {
                l10 = a ^ 0x58D455D975BFL;
                long l11 = l10 ^ 0x3537F15EFAF0L;
                CallSite callSite2 = m44.a("h", (long)217946079579860898L, (long)l10);
                try {
                    try {
                        callSite = m44.a("v", (Object)this, (long)153113878582784548L, (long)l10);
                        if (callSite2 == null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)1748117460097935934L, (long)l10);
                    }
                    Object[] objectArray = new Object[3];
                    objectArray[2] = l11;
                    objectArray[1] = this.J;
                    objectArray[0] = m44.a("v", (Object)this, (long)153113878582784548L, (long)l10);
                    return m44.a("h", (Object)objectArray, (long)1736617533823693632L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)1748117460097935934L, (long)l10);
                }
            }
            callSite = m44.a("v", (Object)this, (long)153113878582784548L, (long)l10);
        }
        return callSite;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = prr.a(2539465550785464688L, -6219323145339511184L, MethodHandles.lookup().lookupClass()).a(250301131822584L);
        long l10 = a ^ 0x67E725F31D46L;
        if (m44.a("i", (long)7782066218254567259L, (long)l10) == null) {
            m44.a("i", "CEQwWb", (long)7907127498797066641L, (long)l10);
        }
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = -6428063880055194490L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
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
}

