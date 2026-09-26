/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.tv;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class n5
extends KeyAdapter {
    final tv S;
    private static final long a = prr.a(7997452655889736356L, 2012044808972862541L, MethodHandles.lookup().lookupClass()).a(107137917760956L);
    private static final long b;

    n5(tv tv2) {
        this.S = tv2;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block32: {
            CallSite callSite;
            Object object;
            long l10;
            long l11;
            block39: {
                CallSite callSite2;
                long l12;
                block37: {
                    long l13;
                    block35: {
                        long l14;
                        block33: {
                            long l15;
                            block31: {
                                long l16 = l11 = a ^ 0x7D10C1CF0A29L;
                                l10 = l16 ^ 0x1E06938EE56L;
                                l15 = l16 ^ 0x522B7444CED3L;
                                l14 = l16 ^ 0x6CA56B6FDA39L;
                                l12 = l16 ^ 0x52E842AF60E6L;
                                l13 = l16 ^ 0x26887FAFF98CL;
                                callSite2 = m44.a("l", (long)-2805435448339288095L, (long)l11);
                                try {
                                    try {
                                        object = keyEvent;
                                        if (callSite2 != null) break block31;
                                        if (m44.a("s", (Object)object, (long)-2504115180709164949L, (long)l11) != (int)b) break block32;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("l", (Object)n92, (long)-4367971247423476531L, (long)l11);
                                    }
                                    object = m44.a("s", (Object)keyEvent, (long)-2553491701794995649L, (long)l11);
                                }
                                catch (n9 n93) {
                                    throw m44.a("l", (Object)n93, (long)-4367971247423476531L, (long)l11);
                                }
                            }
                            try {
                                block34: {
                                    try {
                                        try {
                                            callSite = m44.a("r", (Object)m44.a("r", (Object)this, (long)-4372163676360731037L, (long)l11), (long)-2558926750558911715L, (long)l11);
                                            if (callSite2 != null) break block33;
                                            if (object != callSite) break block34;
                                        }
                                        catch (n9 n94) {
                                            throw m44.a("l", (Object)n94, (long)-4367971247423476531L, (long)l11);
                                        }
                                        Object[] objectArray = new Object[1];
                                        objectArray[0] = l15;
                                        m44.a("s", (Object)m44.a("r", (Object)this, (long)-4372163676360731037L, (long)l11), (Object)objectArray, (long)-2329870912249287663L, (long)l11);
                                        if (callSite2 == null) break block32;
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("l", (Object)n95, (long)-4367971247423476531L, (long)l11);
                                    }
                                }
                                object = m44.a("s", (Object)keyEvent, (long)-2553491701794995649L, (long)l11);
                                callSite = m44.a("r", (Object)m44.a("r", (Object)this, (long)-4372163676360731037L, (long)l11), (long)-4592524973393757039L, (long)l11);
                            }
                            catch (n9 n96) {
                                throw m44.a("l", (Object)n96, (long)-4367971247423476531L, (long)l11);
                            }
                        }
                        try {
                            block36: {
                                try {
                                    try {
                                        if (callSite2 != null) break block35;
                                        if (object != callSite) break block36;
                                    }
                                    catch (n9 n97) {
                                        throw m44.a("l", (Object)n97, (long)-4367971247423476531L, (long)l11);
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l14;
                                    m44.a("s", (Object)m44.a("r", (Object)this, (long)-4372163676360731037L, (long)l11), (Object)objectArray, (long)-4433207715409633298L, (long)l11);
                                    if (callSite2 == null) break block32;
                                }
                                catch (n9 n98) {
                                    throw m44.a("l", (Object)n98, (long)-4367971247423476531L, (long)l11);
                                }
                            }
                            object = m44.a("s", (Object)keyEvent, (long)-2553491701794995649L, (long)l11);
                            callSite = m44.a("r", (Object)m44.a("r", (Object)this, (long)-4372163676360731037L, (long)l11), (long)-4439280441472854738L, (long)l11);
                        }
                        catch (n9 n99) {
                            throw m44.a("l", (Object)n99, (long)-4367971247423476531L, (long)l11);
                        }
                    }
                    try {
                        block38: {
                            try {
                                try {
                                    if (callSite2 != null) break block37;
                                    if (object != callSite) break block38;
                                }
                                catch (n9 n910) {
                                    throw m44.a("l", (Object)n910, (long)-4367971247423476531L, (long)l11);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l13;
                                m44.a("s", (Object)m44.a("r", (Object)this, (long)-4372163676360731037L, (long)l11), (Object)objectArray, (long)-2572440078402958547L, (long)l11);
                                if (callSite2 == null) break block32;
                            }
                            catch (n9 n911) {
                                throw m44.a("l", (Object)n911, (long)-4367971247423476531L, (long)l11);
                            }
                        }
                        object = m44.a("s", (Object)keyEvent, (long)-2553491701794995649L, (long)l11);
                        callSite = m44.a("r", (Object)m44.a("r", (Object)this, (long)-4372163676360731037L, (long)l11), (long)-2646772222325266152L, (long)l11);
                    }
                    catch (n9 n912) {
                        throw m44.a("l", (Object)n912, (long)-4367971247423476531L, (long)l11);
                    }
                }
                try {
                    block40: {
                        try {
                            try {
                                if (callSite2 != null) break block39;
                                if (object != callSite) break block40;
                            }
                            catch (n9 n913) {
                                throw m44.a("l", (Object)n913, (long)-4367971247423476531L, (long)l11);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l12;
                            m44.a("s", (Object)m44.a("r", (Object)this, (long)-4372163676360731037L, (long)l11), (Object)objectArray, (long)-2408962560934412196L, (long)l11);
                            if (callSite2 == null) break block32;
                        }
                        catch (n9 n914) {
                            throw m44.a("l", (Object)n914, (long)-4367971247423476531L, (long)l11);
                        }
                    }
                    object = m44.a("s", (Object)keyEvent, (long)-2553491701794995649L, (long)l11);
                    callSite = m44.a("r", (Object)m44.a("r", (Object)this, (long)-4372163676360731037L, (long)l11), (long)-4211248877612734408L, (long)l11);
                }
                catch (n9 n915) {
                    throw m44.a("l", (Object)n915, (long)-4367971247423476531L, (long)l11);
                }
            }
            try {
                if (object == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l10;
                    m44.a("s", (Object)m44.a("r", (Object)this, (long)-4372163676360731037L, (long)l11), (Object)objectArray, (long)-4420061778722921389L, (long)l11);
                }
            }
            catch (n9 n916) {
                throw m44.a("l", (Object)n916, (long)-4367971247423476531L, (long)l11);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x1F9917E4D6C5L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = 2071993235682568676L;
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

