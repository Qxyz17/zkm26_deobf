/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.r9;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ex
extends KeyAdapter {
    final r9 l;
    private static final long a = prr.a((long)1117658044121691599L, (long)5050951065798084241L, MethodHandles.lookup().lookupClass()).a(3279347763744L);
    private static final long b;

    ex(r9 r92) {
        this.l = r92;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        long l = a ^ 0x4DDA9BF43DCCL;
        long l2 = l ^ 0x3B9150A549EAL;
        try {
            if (m44.a("v", (Object)keyEvent, (long)-8700132860481269226L, (long)l) == (int)b) {
                Object[] objectArray = new Object[1];
                objectArray[0] = l2;
                m44.a("v", (Object)m44.a("w", (Object)this, (long)-7281204746962894276L, (long)l), (Object)objectArray, (long)-7315287202396226450L, (long)l);
            }
        }
        catch (n9 n92) {
            throw m44.a("i", (Object)((Object)n92), (long)-7219141325189825375L, (long)l);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x70BB3E3859BAL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -888995974196997462L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
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
}
