/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.hz;
import com.zelix.m44;
import com.zelix.o2;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class o3
extends o2 {
    private static final long b = prr.a((long)-3148150368084885585L, (long)724171158760097669L, MethodHandles.lookup().lookupClass()).a(63383152348054L);
    private static final long d;

    void u(Object[] objectArray) {
        hz hz2 = (hz)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l ^ 0x624D17C88CB9L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this;
        objectArray2[0] = l2;
        m44.a("s", (Object)hz2, (Object)objectArray2, (long)8684547998179585715L, (long)l);
    }

    public o3(long l) {
        l = b ^ l;
        super((int)d);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x73FF220785BCL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -2760181826237687003L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                d = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }
}
