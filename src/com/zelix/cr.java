/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.r1;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class cr
extends KeyAdapter {
    final r1 f;
    private static final long a = prr.a((long)7622415021856268049L, (long)-2064663271495393827L, MethodHandles.lookup().lookupClass()).a(84864957053510L);
    private static final long b;

    cr(r1 r12) {
        this.f = r12;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        long l = a ^ 0x42C559351640L;
        long l2 = l ^ 0x38F4099B405EL;
        try {
            if (m44.a("r", (Object)keyEvent, (long)-8145067620216759390L, (long)l) == (int)b) {
                Object[] objectArray = new Object[1];
                objectArray[0] = l2;
                m44.a("r", (Object)m44.a("s", (Object)this, (long)-8224465048084277358L, (long)l), (Object)objectArray, (long)-7796044962217839142L, (long)l);
            }
        }
        catch (n9 n92) {
            throw m44.a("m", (Object)((Object)n92), (long)-7639062647096441450L, (long)l);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x81C7C41FD8DL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 6333376738969080414L;
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
