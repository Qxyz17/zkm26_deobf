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
    private static final long a = prr.a((long)-2207768734194708491L, (long)-5069390222995352700L, MethodHandles.lookup().lookupClass()).a(143634399966489L);
    private static final long b;

    l7y(wp wp2) {
        this.q = wp2;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block32: {
            CallSite callSite;
            KeyEvent keyEvent2;
            long l;
            long l2;
            block39: {
                KeyEvent keyEvent3;
                CallSite callSite2;
                long l3;
                block37: {
                    long l4;
                    block35: {
                        long l5;
                        block33: {
                            Object object;
                            long l6;
                            block31: {
                                long l7 = l2 = a ^ 0x66EAE6E4A224L;
                                l = l7 ^ 0x3C35C3C3CD0FL;
                                l3 = l7 ^ 0x167FA9A64AFDL;
                                l5 = l7 ^ 0x47EE26BE6CFBL;
                                l4 = l7 ^ 0x779F7C77E383L;
                                l6 = l7 ^ 0x19A272BA3E16L;
                                callSite2 = m44.a("j", (long)-7039301684198643521L, (long)l2);
                                try {
                                    try {
                                        object = keyEvent;
                                        if (callSite2 != null) break block31;
                                        if (m44.a("u", (Object)object, (long)-7322307938681385163L, (long)l2) != (int)b) break block32;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("j", (Object)((Object)n92), (long)-7367767334624903422L, (long)l2);
                                    }
                                    object = m44.a("u", (Object)keyEvent, (long)-7219732097778367135L, (long)l2);
                                }
                                catch (n9 n93) {
                                    throw m44.a("j", (Object)((Object)n93), (long)-7367767334624903422L, (long)l2);
                                }
                            }
                            keyEvent3 = object;
                            try {
                                block34: {
                                    try {
                                        try {
                                            keyEvent2 = keyEvent3;
                                            callSite = m44.a("t", (Object)m44.a("t", (Object)this, (long)-8814779645045782036L, (long)l2), (long)-8843554154066536997L, (long)l2);
                                            if (callSite2 != null) break block33;
                                            if (keyEvent2 != callSite) break block34;
                                        }
                                        catch (n9 n94) {
                                            throw m44.a("j", (Object)((Object)n94), (long)-7367767334624903422L, (long)l2);
                                        }
                                        Object[] objectArray = new Object[1];
                                        objectArray[0] = l6;
                                        m44.a("u", (Object)m44.a("t", (Object)this, (long)-8814779645045782036L, (long)l2), (Object)objectArray, (long)-7320074226446764026L, (long)l2);
                                        if (callSite2 == null) break block32;
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("j", (Object)((Object)n95), (long)-7367767334624903422L, (long)l2);
                                    }
                                }
                                keyEvent2 = keyEvent3;
                                callSite = m44.a("t", (Object)m44.a("t", (Object)this, (long)-8814779645045782036L, (long)l2), (long)-8775588307255573503L, (long)l2);
                            }
                            catch (n9 n96) {
                                throw m44.a("j", (Object)((Object)n96), (long)-7367767334624903422L, (long)l2);
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
                                        throw m44.a("j", (Object)((Object)n97), (long)-7367767334624903422L, (long)l2);
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l5;
                                    m44.a("u", (Object)m44.a("t", (Object)this, (long)-8814779645045782036L, (long)l2), (Object)objectArray, (long)-9022248035311719471L, (long)l2);
                                    if (callSite2 == null) break block32;
                                }
                                catch (n9 n98) {
                                    throw m44.a("j", (Object)((Object)n98), (long)-7367767334624903422L, (long)l2);
                                }
                            }
                            keyEvent2 = keyEvent3;
                            callSite = m44.a("t", (Object)m44.a("t", (Object)this, (long)-8814779645045782036L, (long)l2), (long)-8778537890955017119L, (long)l2);
                        }
                        catch (n9 n99) {
                            throw m44.a("j", (Object)((Object)n99), (long)-7367767334624903422L, (long)l2);
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
                                    throw m44.a("j", (Object)((Object)n910), (long)-7367767334624903422L, (long)l2);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l4;
                                m44.a("u", (Object)m44.a("t", (Object)this, (long)-8814779645045782036L, (long)l2), (Object)objectArray, (long)-8932618031151023338L, (long)l2);
                                if (callSite2 == null) break block32;
                            }
                            catch (n9 n911) {
                                throw m44.a("j", (Object)((Object)n911), (long)-7367767334624903422L, (long)l2);
                            }
                        }
                        keyEvent2 = keyEvent3;
                        callSite = m44.a("t", (Object)m44.a("t", (Object)this, (long)-8814779645045782036L, (long)l2), (long)-8921188105764754611L, (long)l2);
                    }
                    catch (n9 n912) {
                        throw m44.a("j", (Object)((Object)n912), (long)-7367767334624903422L, (long)l2);
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
                                throw m44.a("j", (Object)((Object)n913), (long)-7367767334624903422L, (long)l2);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l3;
                            m44.a("u", (Object)m44.a("t", (Object)this, (long)-8814779645045782036L, (long)l2), (Object)objectArray, (long)-9024154951992457081L, (long)l2);
                            if (callSite2 == null) break block32;
                        }
                        catch (n9 n914) {
                            throw m44.a("j", (Object)((Object)n914), (long)-7367767334624903422L, (long)l2);
                        }
                    }
                    keyEvent2 = keyEvent3;
                    callSite = m44.a("t", (Object)m44.a("t", (Object)this, (long)-8814779645045782036L, (long)l2), (long)-7342212580417152010L, (long)l2);
                }
                catch (n9 n915) {
                    throw m44.a("j", (Object)((Object)n915), (long)-7367767334624903422L, (long)l2);
                }
            }
            try {
                if (keyEvent2 == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l;
                    m44.a("u", (Object)m44.a("t", (Object)this, (long)-8814779645045782036L, (long)l2), (Object)objectArray, (long)-7182021594801966467L, (long)l2);
                }
            }
            catch (n9 n916) {
                throw m44.a("j", (Object)((Object)n916), (long)-7367767334624903422L, (long)l2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x491D7131CDDFL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 8631784301470895942L;
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
