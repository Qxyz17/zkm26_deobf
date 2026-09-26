/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.nt;
import com.zelix.prr;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _d
extends KeyAdapter {
    final nt J;
    private static final long a = prr.a(-5380166956485809858L, 2497744485703009784L, MethodHandles.lookup().lookupClass()).a(257989019859024L);
    private static final long b;

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block14: {
            CallSite callSite;
            Object object;
            long l10;
            long l11;
            long l12;
            block15: {
                CallSite callSite2;
                long l13;
                long l14;
                block13: {
                    long l15 = l12 = a ^ 0x552190A3BBD1L;
                    l11 = l15 ^ 0x2511372D007BL;
                    l14 = l15 ^ 0x60E1F610428FL;
                    l13 = l15 ^ 0x353BB3B52FEAL;
                    l10 = l15 ^ 0xCBC2ACF46EL;
                    callSite2 = m44.a("n", (long)-4870884499074631456L, (long)l12);
                    try {
                        try {
                            object = keyEvent;
                            if (callSite2 != null) break block13;
                            if (m44.a("q", (Object)object, (long)-4855462577272542775L, (long)l12) != (int)b) break block14;
                        }
                        catch (n9 n92) {
                            throw m44.a("n", (Object)n92, (long)-5025531929266125799L, (long)l12);
                        }
                        object = m44.a("q", (Object)keyEvent, (long)-4813685185834425443L, (long)l12);
                    }
                    catch (n9 n93) {
                        throw m44.a("n", (Object)n93, (long)-5025531929266125799L, (long)l12);
                    }
                }
                try {
                    block16: {
                        try {
                            try {
                                callSite = m44.a("p", (Object)this, (long)-6870032925056896371L, (long)l12);
                                if (callSite2 != null) break block15;
                                Object[] objectArray = new Object[2];
                                objectArray[1] = l14;
                                objectArray[0] = callSite;
                                if (object != m44.a("n", (Object)objectArray, (long)-4896806016637852268L, (long)l12)) break block16;
                            }
                            catch (n9 n94) {
                                throw m44.a("n", (Object)n94, (long)-5025531929266125799L, (long)l12);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l13;
                            m44.a("q", (Object)m44.a("p", (Object)this, (long)-6870032925056896371L, (long)l12), (Object)objectArray, (long)-6741905927301298706L, (long)l12);
                            if (callSite2 == null) break block14;
                        }
                        catch (n9 n95) {
                            throw m44.a("n", (Object)n95, (long)-5025531929266125799L, (long)l12);
                        }
                    }
                    object = m44.a("q", (Object)keyEvent, (long)-4813685185834425443L, (long)l12);
                    callSite = m44.a("p", (Object)this, (long)-6870032925056896371L, (long)l12);
                }
                catch (n9 n96) {
                    throw m44.a("n", (Object)n96, (long)-5025531929266125799L, (long)l12);
                }
            }
            try {
                Object[] objectArray = new Object[2];
                objectArray[1] = callSite;
                objectArray[0] = l11;
                if (object == m44.a("n", (Object)objectArray, (long)-6613097302863805620L, (long)l12)) {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l10;
                    m44.a("q", (Object)m44.a("p", (Object)this, (long)-6870032925056896371L, (long)l12), (Object)objectArray2, (long)-4756964100046824519L, (long)l12);
                }
            }
            catch (n9 n97) {
                throw m44.a("n", (Object)n97, (long)-5025531929266125799L, (long)l12);
            }
        }
    }

    _d(nt nt2) {
        this.J = nt2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x88D1B0B0B1FL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = 3143030520234764789L;
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

