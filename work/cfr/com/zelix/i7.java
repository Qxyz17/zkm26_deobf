/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.hz;
import com.zelix.m44;
import com.zelix.o2;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class i7
extends o2 {
    private static final long b = prr.a(186957300336965877L, -8826987313407834562L, MethodHandles.lookup().lookupClass()).a(271807534443841L);
    private static final long d;

    @Override
    void u(Object[] objectArray) {
        hz hz2 = (hz)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10 ^ 0x430063BAC219L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = this;
        CallSite callSite = m44.a("s", (Object)hz2, (Object)objectArray2, (long)6985164436748347644L, (long)l10);
    }

    public i7(long l10) {
        l10 = b ^ l10;
        super((int)d);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = b ^ 0x2D81B7780735L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = 9108509100233051728L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                d = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }
}

