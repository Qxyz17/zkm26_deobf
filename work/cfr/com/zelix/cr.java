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
    private static final long a = prr.a(7622415021856268049L, -2064663271495393827L, MethodHandles.lookup().lookupClass()).a(84864957053510L);
    private static final long b;

    cr(r1 r12) {
        this.f = r12;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        long l10 = a ^ 0x42C559351640L;
        long l11 = l10 ^ 0x38F4099B405EL;
        try {
            if (m44.a("r", (Object)keyEvent, (long)-8145067620216759390L, (long)l10) == (int)b) {
                Object[] objectArray = new Object[1];
                objectArray[0] = l11;
                m44.a("r", (Object)m44.a("s", (Object)this, (long)-8224465048084277358L, (long)l10), (Object)objectArray, (long)-7796044962217839142L, (long)l10);
            }
        }
        catch (n9 n92) {
            throw m44.a("m", (Object)n92, (long)-7639062647096441450L, (long)l10);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x81C7C41FD8DL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = 6333376738969080414L;
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

