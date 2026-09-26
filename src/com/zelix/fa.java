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
    private static final long a = prr.a((long)1294101965999473396L, (long)9044642952739847345L, MethodHandles.lookup().lookupClass()).a(219105463446843L);
    private static final long b;

    fa(t2 t22) {
        this.k = t22;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block40: {
            CallSite callSite;
            KeyEvent keyEvent2;
            long l;
            long l2;
            block49: {
                KeyEvent keyEvent3;
                CallSite callSite2;
                long l3;
                block47: {
                    long l4;
                    block45: {
                        long l5;
                        block43: {
                            long l6;
                            block41: {
                                Object object;
                                long l7;
                                block39: {
                                    long l8 = l2 = a ^ 0x5886A13FBC9FL;
                                    l4 = l8 ^ 0x669469353F20L;
                                    l = l8 ^ 0x1F1C2D07EB89L;
                                    l7 = l8 ^ 0x258FC57B1CA8L;
                                    l5 = l8 ^ 0x568C7E5C4A6BL;
                                    l6 = l8 ^ 0x5189D5DDC3A3L;
                                    l3 = l8 ^ 0x7F9A2F901DC7L;
                                    callSite2 = m44.a("h", (long)-6400381065894309411L, (long)l2);
                                    try {
                                        try {
                                            object = keyEvent;
                                            if (callSite2 != null) break block39;
                                            if (m44.a("w", (Object)object, (long)-6700291348510820777L, (long)l2) != (int)b) break block40;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("h", (Object)((Object)n92), (long)-6583368823817567683L, (long)l2);
                                        }
                                        object = m44.a("w", (Object)keyEvent, (long)-6724862886737118205L, (long)l2);
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("h", (Object)((Object)n93), (long)-6583368823817567683L, (long)l2);
                                    }
                                }
                                keyEvent3 = object;
                                try {
                                    block42: {
                                        try {
                                            try {
                                                keyEvent2 = keyEvent3;
                                                callSite = m44.a("v", (Object)m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l2), (long)-4932261128016311925L, (long)l2);
                                                if (callSite2 != null) break block41;
                                                if (keyEvent2 == callSite) {
                                                }
                                                break block42;
                                            }
                                            catch (n9 n94) {
                                                throw m44.a("h", (Object)((Object)n94), (long)-6583368823817567683L, (long)l2);
                                            }
                                            Object[] objectArray = new Object[2];
                                            objectArray[1] = m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l2);
                                            objectArray[0] = l7;
                                            m44.a("h", (Object)objectArray, (long)-6593667585427405546L, (long)l2);
                                            if (callSite2 == null) break block40;
                                        }
                                        catch (n9 n95) {
                                            throw m44.a("h", (Object)((Object)n95), (long)-6583368823817567683L, (long)l2);
                                        }
                                    }
                                    keyEvent2 = keyEvent3;
                                    callSite = m44.a("v", (Object)m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l2), (long)-4628728307595109280L, (long)l2);
                                }
                                catch (n9 n96) {
                                    throw m44.a("h", (Object)((Object)n96), (long)-6583368823817567683L, (long)l2);
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
                                            throw m44.a("h", (Object)((Object)n97), (long)-6583368823817567683L, (long)l2);
                                        }
                                        Object[] objectArray = new Object[2];
                                        objectArray[1] = m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l2);
                                        objectArray[0] = l6;
                                        m44.a("h", (Object)objectArray, (long)-6563119755601705265L, (long)l2);
                                        if (callSite2 == null) break block40;
                                    }
                                    catch (n9 n98) {
                                        throw m44.a("h", (Object)((Object)n98), (long)-6583368823817567683L, (long)l2);
                                    }
                                }
                                keyEvent2 = keyEvent3;
                                callSite = m44.a("v", (Object)m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l2), (long)-6821841725910065542L, (long)l2);
                            }
                            catch (n9 n99) {
                                throw m44.a("h", (Object)((Object)n99), (long)-6583368823817567683L, (long)l2);
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
                                        throw m44.a("h", (Object)((Object)n910), (long)-6583368823817567683L, (long)l2);
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l5;
                                    m44.a("w", (Object)m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l2), (Object)objectArray, (long)-4857266273907826741L, (long)l2);
                                    if (callSite2 == null) break block40;
                                }
                                catch (n9 n911) {
                                    throw m44.a("h", (Object)((Object)n911), (long)-6583368823817567683L, (long)l2);
                                }
                            }
                            keyEvent2 = keyEvent3;
                            callSite = m44.a("v", (Object)m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l2), (long)-6522567375607587519L, (long)l2);
                        }
                        catch (n9 n912) {
                            throw m44.a("h", (Object)((Object)n912), (long)-6583368823817567683L, (long)l2);
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
                                    throw m44.a("h", (Object)((Object)n913), (long)-6583368823817567683L, (long)l2);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l4;
                                m44.a("w", (Object)m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l2), (Object)objectArray, (long)-6490076347936616751L, (long)l2);
                                if (callSite2 == null) break block40;
                            }
                            catch (n9 n914) {
                                throw m44.a("h", (Object)((Object)n914), (long)-6583368823817567683L, (long)l2);
                            }
                        }
                        keyEvent2 = keyEvent3;
                        callSite = m44.a("v", (Object)m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l2), (long)-4769400541504659280L, (long)l2);
                    }
                    catch (n9 n915) {
                        throw m44.a("h", (Object)((Object)n915), (long)-6583368823817567683L, (long)l2);
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
                                throw m44.a("h", (Object)((Object)n916), (long)-6583368823817567683L, (long)l2);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l3;
                            m44.a("w", (Object)m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l2), (Object)objectArray, (long)-4775775482797096690L, (long)l2);
                            if (callSite2 == null) break block40;
                        }
                        catch (n9 n917) {
                            throw m44.a("h", (Object)((Object)n917), (long)-6583368823817567683L, (long)l2);
                        }
                    }
                    keyEvent2 = keyEvent3;
                    callSite = m44.a("v", (Object)m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l2), (long)-6752434570281455290L, (long)l2);
                }
                catch (n9 n918) {
                    throw m44.a("h", (Object)((Object)n918), (long)-6583368823817567683L, (long)l2);
                }
            }
            try {
                if (keyEvent2 == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l;
                    m44.a("w", (Object)m44.a("v", (Object)this, (long)-6797526947591480220L, (long)l2), (Object)objectArray, (long)-6659836674436349799L, (long)l2);
                }
            }
            catch (n9 n919) {
                throw m44.a("h", (Object)((Object)n919), (long)-6583368823817567683L, (long)l2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x1E4579F8AF83L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -7937598369332917425L;
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
