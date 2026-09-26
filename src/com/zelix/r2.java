/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.wy;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class r2
extends KeyAdapter {
    final wy M;
    private static final long a = prr.a((long)-6359195138010249178L, (long)-7001757938972371355L, MethodHandles.lookup().lookupClass()).a(152656111259626L);
    private static final long b;

    r2(wy wy2) {
        this.M = wy2;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block26: {
            CallSite callSite;
            KeyEvent keyEvent2;
            long l;
            long l2;
            block31: {
                KeyEvent keyEvent3;
                CallSite callSite2;
                long l3;
                block29: {
                    long l4;
                    block27: {
                        Object object;
                        long l5;
                        block25: {
                            long l6 = l2 = a ^ 0x4E155C6921FBL;
                            l = l6 ^ 0x307204612E99L;
                            l3 = l6 ^ 0x1A386E04A96BL;
                            l4 = l6 ^ 0x4BA9E11C8F6DL;
                            l5 = l6 ^ 0x15E5B518DD80L;
                            callSite2 = m44.a("l", (long)9068398270470228777L, (long)l2);
                            try {
                                try {
                                    object = keyEvent;
                                    if (callSite2 != null) break block25;
                                    if (m44.a("s", (Object)object, (long)8788743879466511523L, (long)l2) != (int)b) break block26;
                                }
                                catch (n9 n92) {
                                    throw m44.a("l", (Object)((Object)n92), (long)8856935213531322510L, (long)l2);
                                }
                                object = m44.a("s", (Object)keyEvent, (long)8671777493474977527L, (long)l2);
                            }
                            catch (n9 n93) {
                                throw m44.a("l", (Object)((Object)n93), (long)8856935213531322510L, (long)l2);
                            }
                        }
                        keyEvent3 = object;
                        try {
                            block28: {
                                try {
                                    try {
                                        keyEvent2 = keyEvent3;
                                        callSite = m44.a("r", (Object)m44.a("r", (Object)this, (long)9183866822585133565L, (long)l2), (long)7409386886433470029L, (long)l2);
                                        if (callSite2 != null) break block27;
                                        if (keyEvent2 != callSite) break block28;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("l", (Object)((Object)n94), (long)8856935213531322510L, (long)l2);
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l5;
                                    m44.a("s", (Object)m44.a("r", (Object)this, (long)9183866822585133565L, (long)l2), (Object)objectArray, (long)8790977001122372496L, (long)l2);
                                    if (callSite2 == null) break block26;
                                }
                                catch (n9 n95) {
                                    throw m44.a("l", (Object)((Object)n95), (long)8856935213531322510L, (long)l2);
                                }
                            }
                            keyEvent2 = keyEvent3;
                            callSite = m44.a("r", (Object)m44.a("r", (Object)this, (long)9183866822585133565L, (long)l2), (long)7323086821743077271L, (long)l2);
                        }
                        catch (n9 n96) {
                            throw m44.a("l", (Object)((Object)n96), (long)8856935213531322510L, (long)l2);
                        }
                    }
                    try {
                        block30: {
                            try {
                                try {
                                    if (callSite2 != null) break block29;
                                    if (keyEvent2 != callSite) break block30;
                                }
                                catch (n9 n97) {
                                    throw m44.a("l", (Object)((Object)n97), (long)8856935213531322510L, (long)l2);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l4;
                                m44.a("s", (Object)m44.a("r", (Object)this, (long)9183866822585133565L, (long)l2), (Object)objectArray, (long)7015629042001217607L, (long)l2);
                                if (callSite2 == null) break block26;
                            }
                            catch (n9 n98) {
                                throw m44.a("l", (Object)((Object)n98), (long)8856935213531322510L, (long)l2);
                            }
                        }
                        keyEvent2 = keyEvent3;
                        callSite = m44.a("r", (Object)m44.a("r", (Object)this, (long)9183866822585133565L, (long)l2), (long)7469113230226442459L, (long)l2);
                    }
                    catch (n9 n99) {
                        throw m44.a("l", (Object)((Object)n99), (long)8856935213531322510L, (long)l2);
                    }
                }
                try {
                    block32: {
                        try {
                            try {
                                if (callSite2 != null) break block31;
                                if (keyEvent2 != callSite) break block32;
                            }
                            catch (n9 n910) {
                                throw m44.a("l", (Object)((Object)n910), (long)8856935213531322510L, (long)l2);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l3;
                            m44.a("s", (Object)m44.a("r", (Object)this, (long)9183866822585133565L, (long)l2), (Object)objectArray, (long)7013739206518942481L, (long)l2);
                            if (callSite2 == null) break block26;
                        }
                        catch (n9 n911) {
                            throw m44.a("l", (Object)((Object)n911), (long)8856935213531322510L, (long)l2);
                        }
                    }
                    keyEvent2 = keyEvent3;
                    callSite = m44.a("r", (Object)m44.a("r", (Object)this, (long)9183866822585133565L, (long)l2), (long)8758714887283554400L, (long)l2);
                }
                catch (n9 n912) {
                    throw m44.a("l", (Object)((Object)n912), (long)8856935213531322510L, (long)l2);
                }
            }
            try {
                if (keyEvent2 == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l;
                    m44.a("s", (Object)m44.a("r", (Object)this, (long)9183866822585133565L, (long)l2), (Object)objectArray, (long)9206018645070057963L, (long)l2);
                }
            }
            catch (n9 n913) {
                throw m44.a("l", (Object)((Object)n913), (long)8856935213531322510L, (long)l2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x7308C16849AEL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 3626746423667216730L;
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
