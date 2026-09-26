/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.tr;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ty
extends KeyAdapter {
    final tr k;
    private static final long a = prr.a((long)8735915523010097777L, (long)3807177192096203012L, MethodHandles.lookup().lookupClass()).a(45674090587563L);
    private static final long b;

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block20: {
            CallSite callSite;
            Object object;
            long l;
            long l2;
            block23: {
                CallSite callSite2;
                long l3;
                block21: {
                    long l4;
                    block19: {
                        long l5 = l2 = a ^ 0x43068B644EA8L;
                        l4 = l5 ^ 0x4A114D844BA2L;
                        l3 = l5 ^ 0x745C6444F17DL;
                        l = l5 ^ 0x27544FD37FCDL;
                        callSite2 = m44.a("o", (long)5227045185516027514L, (long)l2);
                        try {
                            try {
                                object = keyEvent;
                                if (callSite2 != null) break block19;
                                if (m44.a("p", (Object)object, (long)5522748184746613232L, (long)l2) != (int)b) break block20;
                            }
                            catch (n9 n92) {
                                throw m44.a("o", (Object)((Object)n92), (long)5647451192261371118L, (long)l2);
                            }
                            object = m44.a("p", (Object)keyEvent, (long)5551542405971415972L, (long)l2);
                        }
                        catch (n9 n93) {
                            throw m44.a("o", (Object)((Object)n93), (long)5647451192261371118L, (long)l2);
                        }
                    }
                    try {
                        block22: {
                            try {
                                try {
                                    callSite = m44.a("q", (Object)m44.a("q", (Object)this, (long)5755231670113800556L, (long)l2), (long)5899491668161899786L, (long)l2);
                                    if (callSite2 != null) break block21;
                                    if (object != callSite) break block22;
                                }
                                catch (n9 n94) {
                                    throw m44.a("o", (Object)((Object)n94), (long)5647451192261371118L, (long)l2);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l4;
                                m44.a("p", (Object)m44.a("q", (Object)this, (long)5755231670113800556L, (long)l2), (Object)objectArray, (long)6044168963193523829L, (long)l2);
                                if (callSite2 == null) break block20;
                            }
                            catch (n9 n95) {
                                throw m44.a("o", (Object)((Object)n95), (long)5647451192261371118L, (long)l2);
                            }
                        }
                        object = m44.a("p", (Object)keyEvent, (long)5551542405971415972L, (long)l2);
                        callSite = m44.a("q", (Object)m44.a("q", (Object)this, (long)5755231670113800556L, (long)l2), (long)5395277289343023235L, (long)l2);
                    }
                    catch (n9 n96) {
                        throw m44.a("o", (Object)((Object)n96), (long)5647451192261371118L, (long)l2);
                    }
                }
                try {
                    block24: {
                        try {
                            try {
                                if (callSite2 != null) break block23;
                                if (object != callSite) break block24;
                            }
                            catch (n9 n97) {
                                throw m44.a("o", (Object)((Object)n97), (long)5647451192261371118L, (long)l2);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l3;
                            m44.a("p", (Object)m44.a("q", (Object)this, (long)5755231670113800556L, (long)l2), (Object)objectArray, (long)5695509695123526087L, (long)l2);
                            if (callSite2 == null) break block20;
                        }
                        catch (n9 n98) {
                            throw m44.a("o", (Object)((Object)n98), (long)5647451192261371118L, (long)l2);
                        }
                    }
                    object = m44.a("p", (Object)keyEvent, (long)5551542405971415972L, (long)l2);
                    callSite = m44.a("q", (Object)m44.a("q", (Object)this, (long)5755231670113800556L, (long)l2), (long)6058895938138339747L, (long)l2);
                }
                catch (n9 n99) {
                    throw m44.a("o", (Object)((Object)n99), (long)5647451192261371118L, (long)l2);
                }
            }
            try {
                if (object == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l;
                    m44.a("p", (Object)m44.a("q", (Object)this, (long)5755231670113800556L, (long)l2), (Object)objectArray, (long)5369591774728212233L, (long)l2);
                }
            }
            catch (n9 n910) {
                throw m44.a("o", (Object)((Object)n910), (long)5647451192261371118L, (long)l2);
            }
        }
    }

    ty(tr tr2) {
        this.k = tr2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x7A8289BA4E76L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 3905334215914459877L;
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
