/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.wp;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class l7y
extends KeyAdapter {
    final wp q;
    private static final long a = prr.a(-2207768734194708491L, -5069390222995352700L, MethodHandles.lookup().lookupClass()).a(143634399966489L);
    private static final long b;

    l7y(wp wp2) {
        this.q = wp2;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block32: {
            CallSite callSite;
            KeyEvent keyEvent2;
            long l10;
            long l11;
            block39: {
                KeyEvent keyEvent3;
                CallSite callSite2;
                long l12;
                block37: {
                    long l13;
                    block35: {
                        long l14;
                        block33: {
                            Object object;
                            long l15;
                            block31: {
                                long l16 = l11 = a ^ 0x66EAE6E4A224L;
                                l10 = l16 ^ 0x3C35C3C3CD0FL;
                                l12 = l16 ^ 0x167FA9A64AFDL;
                                l14 = l16 ^ 0x47EE26BE6CFBL;
                                l13 = l16 ^ 0x779F7C77E383L;
                                l15 = l16 ^ 0x19A272BA3E16L;
                                callSite2 = m44.a("j", (long)-7039301684198643521L, (long)l11);
                                try {
                                    try {
                                        object = keyEvent;
                                        if (callSite2 != null) break block31;
                                        if (m44.a("u", (Object)object, (long)-7322307938681385163L, (long)l11) != (int)b) break block32;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("j", (Object)n92, (long)-7367767334624903422L, (long)l11);
                                    }
                                    object = m44.a("u", (Object)keyEvent, (long)-7219732097778367135L, (long)l11);
                                }
                                catch (n9 n93) {
                                    throw m44.a("j", (Object)n93, (long)-7367767334624903422L, (long)l11);
                                }
                            }
                            keyEvent3 = object;
                            try {
                                block34: {
                                    try {
                                        try {
                                            keyEvent2 = keyEvent3;
                                            callSite = m44.a("t", (Object)m44.a("t", (Object)this, (long)-8814779645045782036L, (long)l11), (long)-8843554154066536997L, (long)l11);
                                            if (callSite2 != null) break block33;
                                            if (keyEvent2 != callSite) break block34;
                                        }
                                        catch (n9 n94) {
                                            throw m44.a("j", (Object)n94, (long)-7367767334624903422L, (long)l11);
                                        }
                                        Object[] objectArray = new Object[1];
                                        objectArray[0] = l15;
                                        m44.a("u", (Object)m44.a("t", (Object)this, (long)-8814779645045782036L, (long)l11), (Object)objectArray, (long)-7320074226446764026L, (long)l11);
                                        if (callSite2 == null) break block32;
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("j", (Object)n95, (long)-7367767334624903422L, (long)l11);
                                    }
                                }
                                keyEvent2 = keyEvent3;
                                callSite = m44.a("t", (Object)m44.a("t", (Object)this, (long)-8814779645045782036L, (long)l11), (long)-8775588307255573503L, (long)l11);
                            }
                            catch (n9 n96) {
                                throw m44.a("j", (Object)n96, (long)-7367767334624903422L, (long)l11);
                            }
                        }
                        try {
                            block36: {
                                try {
                                    try {
                                        if (callSite2 != null) break block35;
                                        if (keyEvent2 != callSite) break block36;
                                    }
                                    catch (n9 n97) {
                                        throw m44.a("j", (Object)n97, (long)-7367767334624903422L, (long)l11);
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l14;
                                    m44.a("u", (Object)m44.a("t", (Object)this, (long)-8814779645045782036L, (long)l11), (Object)objectArray, (long)-9022248035311719471L, (long)l11);
                                    if (callSite2 == null) break block32;
                                }
                                catch (n9 n98) {
                                    throw m44.a("j", (Object)n98, (long)-7367767334624903422L, (long)l11);
                                }
                            }
                            keyEvent2 = keyEvent3;
                            callSite = m44.a("t", (Object)m44.a("t", (Object)this, (long)-8814779645045782036L, (long)l11), (long)-8778537890955017119L, (long)l11);
                        }
                        catch (n9 n99) {
                            throw m44.a("j", (Object)n99, (long)-7367767334624903422L, (long)l11);
                        }
                    }
                    try {
                        block38: {
                            try {
                                try {
                                    if (callSite2 != null) break block37;
                                    if (keyEvent2 != callSite) break block38;
                                }
                                catch (n9 n910) {
                                    throw m44.a("j", (Object)n910, (long)-7367767334624903422L, (long)l11);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l13;
                                m44.a("u", (Object)m44.a("t", (Object)this, (long)-8814779645045782036L, (long)l11), (Object)objectArray, (long)-8932618031151023338L, (long)l11);
                                if (callSite2 == null) break block32;
                            }
                            catch (n9 n911) {
                                throw m44.a("j", (Object)n911, (long)-7367767334624903422L, (long)l11);
                            }
                        }
                        keyEvent2 = keyEvent3;
                        callSite = m44.a("t", (Object)m44.a("t", (Object)this, (long)-8814779645045782036L, (long)l11), (long)-8921188105764754611L, (long)l11);
                    }
                    catch (n9 n912) {
                        throw m44.a("j", (Object)n912, (long)-7367767334624903422L, (long)l11);
                    }
                }
                try {
                    block40: {
                        try {
                            try {
                                if (callSite2 != null) break block39;
                                if (keyEvent2 != callSite) break block40;
                            }
                            catch (n9 n913) {
                                throw m44.a("j", (Object)n913, (long)-7367767334624903422L, (long)l11);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l12;
                            m44.a("u", (Object)m44.a("t", (Object)this, (long)-8814779645045782036L, (long)l11), (Object)objectArray, (long)-9024154951992457081L, (long)l11);
                            if (callSite2 == null) break block32;
                        }
                        catch (n9 n914) {
                            throw m44.a("j", (Object)n914, (long)-7367767334624903422L, (long)l11);
                        }
                    }
                    keyEvent2 = keyEvent3;
                    callSite = m44.a("t", (Object)m44.a("t", (Object)this, (long)-8814779645045782036L, (long)l11), (long)-7342212580417152010L, (long)l11);
                }
                catch (n9 n915) {
                    throw m44.a("j", (Object)n915, (long)-7367767334624903422L, (long)l11);
                }
            }
            try {
                if (keyEvent2 == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l10;
                    m44.a("u", (Object)m44.a("t", (Object)this, (long)-8814779645045782036L, (long)l11), (Object)objectArray, (long)-7182021594801966467L, (long)l11);
                }
            }
            catch (n9 n916) {
                throw m44.a("j", (Object)n916, (long)-7367767334624903422L, (long)l11);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x491D7131CDDFL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = 8631784301470895942L;
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

