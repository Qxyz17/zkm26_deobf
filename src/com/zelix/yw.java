/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.k0;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class yw {
    k0 N;
    private HashMap X;
    private static final long a = prr.a((long)3550204257675554621L, (long)-3952559593323576199L, MethodHandles.lookup().lookupClass()).a(199491358234561L);
    private static final long b;

    public k0 y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("s", (Object)this, (long)352632744011392750L, (long)l);
    }

    public String B(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l = a ^ l;
        return (String)((HashMap)((Object)m44.a("w", (Object)this, (long)-4677896453037934808L, (long)l))).get(string);
    }

    public yw(long l, k0 k02) {
        l = a ^ l;
        m44.a("r", (Object)this, new HashMap((int)b), (long)-6218385495410335345L, (long)l);
        m44.a("r", (Object)this, (k0)k02, (long)-6115935925906257643L, (long)l);
    }

    public boolean c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l = a ^ l;
        return (boolean)m44.a("u", (Object)m44.a("t", (Object)this, (long)2945283745654612195L, (long)l), (Object)string, (long)3556107214541330723L, (long)l);
    }

    public void e(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = (String)objectArray[2];
        l = a ^ l;
        ((HashMap)((Object)m44.a("v", (Object)this, (long)-6562419066732335919L, (long)l))).put(string, string2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x5A9C3E7CDBD8L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 4359895980105180772L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }
}
