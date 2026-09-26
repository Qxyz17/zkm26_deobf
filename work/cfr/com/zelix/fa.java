/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.t2;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fa
extends KeyAdapter {
    final t2 k;
    private static final long a = prr.a(1294101965999473396L, 9044642952739847345L, MethodHandles.lookup().lookupClass()).a(219105463446843L);
    private static final long b;

    fa(t2 t22) {
        this.k = t22;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block40: {
            CallSite callSite;
            KeyEvent keyEvent2;
            long l10;
            long l11;
            block49: {
                KeyEvent keyEvent3;
                CallSite callSite2;
                long l12;
                block47: {
                    long l13;
                    block45: {
                        long l14;
                        block43: {
                            long l15;
                            block41: {
                                Object object;
                                long l16;
                                block39: {
                                    long l17 = l11 = a ^ 0x5886A13FBC9FL;
                                    l13 = l17 ^ 0x669469353F20L;
                                    l10 = l17 ^ 0x1F1C2D07EB89L;
                                    l16 = l17 ^ 0x258FC57B1CA8L;
                                    l14 = l17 ^ 0x568C7E5C4A6BL;
                                    l15 = l17 ^ 0x5189D5DDC3A3L;
                                    l12 = l17 ^ 0x7F9A2F901DC7L;
                                    callSite2 = m44.a("h", (long)-6400381065894309411L, (long)l11);
                                    try {
                                        try {
                                            object = keyEvent;
                                            if (callSite2 != null) break block39;
                                            if (m44.a("w", (Object)object, (long)-6700291348510820777L, (long)l11) != (int)b) break block40;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("h", (Object)n92, (long)-6583368823817567683L, (long)l11);
                                        }
                                        object = m44.a("w", (Object)keyEvent, (long)-6724862886737118205L, (long)l11);
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("h", (Object)n93, (long)-6583368823817567683L, (long)l11);
                                    }
                                }
                                keyEvent3 = object;
                                try {
                                    block42: {
                                        try {
                                            try {
                                                keyEvent2 = keyEvent3;
                                                callSite = m44.a("v", (Object)m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l11), (long)-4932261128016311925L, (long)l11);
                                                if (callSite2 != null) break block41;
                                                if (keyEvent2 == callSite) {
                                                }
                                                break block42;
                                            }
                                            catch (n9 n94) {
                                                throw m44.a("h", (Object)n94, (long)-6583368823817567683L, (long)l11);
                                            }
                                            Object[] objectArray = new Object[2];
                                            objectArray[1] = m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l11);
                                            objectArray[0] = l16;
                                            m44.a("h", (Object)objectArray, (long)-6593667585427405546L, (long)l11);
                                            if (callSite2 == null) break block40;
                                        }
                                        catch (n9 n95) {
                                            throw m44.a("h", (Object)n95, (long)-6583368823817567683L, (long)l11);
                                        }
                                    }
                                    keyEvent2 = keyEvent3;
                                    callSite = m44.a("v", (Object)m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l11), (long)-4628728307595109280L, (long)l11);
                                }
                                catch (n9 n96) {
                                    throw m44.a("h", (Object)n96, (long)-6583368823817567683L, (long)l11);
                                }
                            }
                            try {
                                block44: {
                                    try {
                                        try {
                                            if (callSite2 != null) break block43;
                                            if (keyEvent2 == callSite) {
                                            }
                                            break block44;
                                        }
                                        catch (n9 n97) {
                                            throw m44.a("h", (Object)n97, (long)-6583368823817567683L, (long)l11);
                                        }
                                        Object[] objectArray = new Object[2];
                                        objectArray[1] = m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l11);
                                        objectArray[0] = l15;
                                        m44.a("h", (Object)objectArray, (long)-6563119755601705265L, (long)l11);
                                        if (callSite2 == null) break block40;
                                    }
                                    catch (n9 n98) {
                                        throw m44.a("h", (Object)n98, (long)-6583368823817567683L, (long)l11);
                                    }
                                }
                                keyEvent2 = keyEvent3;
                                callSite = m44.a("v", (Object)m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l11), (long)-6821841725910065542L, (long)l11);
                            }
                            catch (n9 n99) {
                                throw m44.a("h", (Object)n99, (long)-6583368823817567683L, (long)l11);
                            }
                        }
                        try {
                            block46: {
                                try {
                                    try {
                                        if (callSite2 != null) break block45;
                                        if (keyEvent2 != callSite) break block46;
                                    }
                                    catch (n9 n910) {
                                        throw m44.a("h", (Object)n910, (long)-6583368823817567683L, (long)l11);
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l14;
                                    m44.a("w", (Object)m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l11), (Object)objectArray, (long)-4857266273907826741L, (long)l11);
                                    if (callSite2 == null) break block40;
                                }
                                catch (n9 n911) {
                                    throw m44.a("h", (Object)n911, (long)-6583368823817567683L, (long)l11);
                                }
                            }
                            keyEvent2 = keyEvent3;
                            callSite = m44.a("v", (Object)m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l11), (long)-6522567375607587519L, (long)l11);
                        }
                        catch (n9 n912) {
                            throw m44.a("h", (Object)n912, (long)-6583368823817567683L, (long)l11);
                        }
                    }
                    try {
                        block48: {
                            try {
                                try {
                                    if (callSite2 != null) break block47;
                                    if (keyEvent2 != callSite) break block48;
                                }
                                catch (n9 n913) {
                                    throw m44.a("h", (Object)n913, (long)-6583368823817567683L, (long)l11);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l13;
                                m44.a("w", (Object)m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l11), (Object)objectArray, (long)-6490076347936616751L, (long)l11);
                                if (callSite2 == null) break block40;
                            }
                            catch (n9 n914) {
                                throw m44.a("h", (Object)n914, (long)-6583368823817567683L, (long)l11);
                            }
                        }
                        keyEvent2 = keyEvent3;
                        callSite = m44.a("v", (Object)m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l11), (long)-4769400541504659280L, (long)l11);
                    }
                    catch (n9 n915) {
                        throw m44.a("h", (Object)n915, (long)-6583368823817567683L, (long)l11);
                    }
                }
                try {
                    block50: {
                        try {
                            try {
                                if (callSite2 != null) break block49;
                                if (keyEvent2 != callSite) break block50;
                            }
                            catch (n9 n916) {
                                throw m44.a("h", (Object)n916, (long)-6583368823817567683L, (long)l11);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l12;
                            m44.a("w", (Object)m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l11), (Object)objectArray, (long)-4775775482797096690L, (long)l11);
                            if (callSite2 == null) break block40;
                        }
                        catch (n9 n917) {
                            throw m44.a("h", (Object)n917, (long)-6583368823817567683L, (long)l11);
                        }
                    }
                    keyEvent2 = keyEvent3;
                    callSite = m44.a("v", (Object)m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l11), (long)-6752434570281455290L, (long)l11);
                }
                catch (n9 n918) {
                    throw m44.a("h", (Object)n918, (long)-6583368823817567683L, (long)l11);
                }
            }
            try {
                if (keyEvent2 == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l10;
                    m44.a("w", (Object)m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l11), (Object)objectArray, (long)-6659836674436349799L, (long)l11);
                }
            }
            catch (n9 n919) {
                throw m44.a("h", (Object)n919, (long)-6583368823817567683L, (long)l11);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x1E4579F8AF83L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = -7937598369332917425L;
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

