/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.t9;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class u
extends KeyAdapter {
    final t9 z;
    private static final long a = prr.a((long)-8628952833375607192L, (long)-5730793721804898626L, MethodHandles.lookup().lookupClass()).a(177538573155470L);
    private static final long b;

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block26: {
            CallSite callSite;
            Object object;
            long l;
            long l2;
            block31: {
                CallSite callSite2;
                long l3;
                block29: {
                    long l4;
                    block27: {
                        long l5;
                        long l6;
                        block25: {
                            long l7 = l2 = a ^ 0x1F08C5964D6DL;
                            l4 = l7 ^ 0x3AE2B93D3B9L;
                            l6 = l7 ^ 0x3FA3B2DD65DCL;
                            l3 = l7 ^ 0x3DE302536966L;
                            l5 = l7 ^ 0x5050C74212E6L;
                            l = l7 ^ 0x6EEB29C4E7D6L;
                            callSite2 = m44.a("l", (long)-3417818316040919455L, (long)l2);
                            try {
                                try {
                                    object = keyEvent;
                                    if (callSite2 != null) break block25;
                                    if (m44.a("s", (Object)object, (long)-3116500245277130261L, (long)l2) != (int)b) break block26;
                                }
                                catch (n9 n92) {
                                    throw m44.a("l", (Object)((Object)n92), (long)-3501874194070388716L, (long)l2);
                                }
                                object = m44.a("s", (Object)keyEvent, (long)-3093898345766843457L, (long)l2);
                            }
                            catch (n9 n93) {
                                throw m44.a("l", (Object)((Object)n93), (long)-3501874194070388716L, (long)l2);
                            }
                        }
                        try {
                            block28: {
                                try {
                                    try {
                                        Object[] objectArray = new Object[2];
                                        objectArray[1] = l5;
                                        objectArray[0] = m44.a("r", (Object)this, (long)-3720596093217061687L, (long)l2);
                                        callSite = m44.a("l", (Object)objectArray, (long)-3169144087308730486L, (long)l2);
                                        if (callSite2 != null) break block27;
                                        if (object != callSite) break block28;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("l", (Object)((Object)n94), (long)-3501874194070388716L, (long)l2);
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l6;
                                    m44.a("s", (Object)m44.a("r", (Object)this, (long)-3720596093217061687L, (long)l2), (Object)objectArray, (long)-2932800995859212027L, (long)l2);
                                    if (callSite2 == null) break block26;
                                }
                                catch (n9 n95) {
                                    throw m44.a("l", (Object)((Object)n95), (long)-3501874194070388716L, (long)l2);
                                }
                            }
                            object = m44.a("s", (Object)keyEvent, (long)-3093898345766843457L, (long)l2);
                            callSite = m44.a("r", (Object)m44.a("r", (Object)this, (long)-3720596093217061687L, (long)l2), (long)-3907860222026369775L, (long)l2);
                        }
                        catch (n9 n96) {
                            throw m44.a("l", (Object)((Object)n96), (long)-3501874194070388716L, (long)l2);
                        }
                    }
                    try {
                        block30: {
                            try {
                                try {
                                    if (callSite2 != null) break block29;
                                    if (object != callSite) break block30;
                                }
                                catch (n9 n97) {
                                    throw m44.a("l", (Object)((Object)n97), (long)-3501874194070388716L, (long)l2);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l4;
                                m44.a("s", (Object)m44.a("r", (Object)this, (long)-3720596093217061687L, (long)l2), (Object)objectArray, (long)-3748549490236139922L, (long)l2);
                                if (callSite2 == null) break block26;
                            }
                            catch (n9 n98) {
                                throw m44.a("l", (Object)((Object)n98), (long)-3501874194070388716L, (long)l2);
                            }
                        }
                        object = m44.a("s", (Object)keyEvent, (long)-3093898345766843457L, (long)l2);
                        callSite = m44.a("r", (Object)m44.a("r", (Object)this, (long)-3720596093217061687L, (long)l2), (long)-3259293705817661288L, (long)l2);
                    }
                    catch (n9 n99) {
                        throw m44.a("l", (Object)((Object)n99), (long)-3501874194070388716L, (long)l2);
                    }
                }
                try {
                    block32: {
                        try {
                            try {
                                if (callSite2 != null) break block31;
                                if (object != callSite) break block32;
                            }
                            catch (n9 n910) {
                                throw m44.a("l", (Object)((Object)n910), (long)-3501874194070388716L, (long)l2);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l3;
                            m44.a("s", (Object)m44.a("r", (Object)this, (long)-3720596093217061687L, (long)l2), (Object)objectArray, (long)-2949353788110665252L, (long)l2);
                            if (callSite2 == null) break block26;
                        }
                        catch (n9 n911) {
                            throw m44.a("l", (Object)((Object)n911), (long)-3501874194070388716L, (long)l2);
                        }
                    }
                    object = m44.a("s", (Object)keyEvent, (long)-3093898345766843457L, (long)l2);
                    callSite = m44.a("r", (Object)m44.a("r", (Object)this, (long)-3720596093217061687L, (long)l2), (long)-3742829396648697416L, (long)l2);
                }
                catch (n9 n912) {
                    throw m44.a("l", (Object)((Object)n912), (long)-3501874194070388716L, (long)l2);
                }
            }
            try {
                if (object == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l;
                    m44.a("s", (Object)m44.a("r", (Object)this, (long)-3720596093217061687L, (long)l2), (Object)objectArray, (long)-3309572482595066356L, (long)l2);
                }
            }
            catch (n9 n913) {
                throw m44.a("l", (Object)((Object)n913), (long)-3501874194070388716L, (long)l2);
            }
        }
    }

    u(t9 t92) {
        this.z = t92;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x16AAEA48B7EBL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 3453946997534016040L;
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
