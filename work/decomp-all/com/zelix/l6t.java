/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.t4;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class l6t
extends KeyAdapter {
    final t4 i;
    private static final long a = prr.a((long)-6745426501615069003L, (long)5921243670246468870L, MethodHandles.lookup().lookupClass()).a(253984540293732L);
    private static final long b;

    l6t(t4 t42) {
        this.i = t42;
    }

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
                        block25: {
                            long l6 = l2 = a ^ 0x3CEB0D2176A5L;
                            l = l6 ^ 0x6AA360AF1C22L;
                            l5 = l6 ^ 0x7E662F8284DL;
                            l3 = l6 ^ 0x39AB4B389292L;
                            l4 = l6 ^ 0x25509EB01440L;
                            callSite2 = m44.a("h", (long)3127041932440984981L, (long)l2);
                            try {
                                try {
                                    object = keyEvent;
                                    if (callSite2 != null) break block25;
                                    if (m44.a("w", (Object)object, (long)3408085556389558815L, (long)l2) != (int)b) break block26;
                                }
                                catch (n9 n92) {
                                    throw m44.a("h", (Object)((Object)n92), (long)3271844745880683516L, (long)l2);
                                }
                                object = m44.a("w", (Object)keyEvent, (long)3378904306518192203L, (long)l2);
                            }
                            catch (n9 n93) {
                                throw m44.a("h", (Object)((Object)n93), (long)3271844745880683516L, (long)l2);
                            }
                        }
                        try {
                            block28: {
                                try {
                                    try {
                                        callSite = m44.a("v", (Object)m44.a("v", (Object)this, (long)3358959717277026083L, (long)l2), (long)3616524218064621285L, (long)l2);
                                        if (callSite2 != null) break block27;
                                        if (object != callSite) break block28;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("h", (Object)((Object)n94), (long)3271844745880683516L, (long)l2);
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l5;
                                    m44.a("w", (Object)m44.a("v", (Object)this, (long)3358959717277026083L, (long)l2), (Object)objectArray, (long)3462844050437778842L, (long)l2);
                                    if (callSite2 == null) break block26;
                                }
                                catch (n9 n95) {
                                    throw m44.a("h", (Object)((Object)n95), (long)3271844745880683516L, (long)l2);
                                }
                            }
                            object = m44.a("w", (Object)keyEvent, (long)3378904306518192203L, (long)l2);
                            callSite = m44.a("v", (Object)m44.a("v", (Object)this, (long)3358959717277026083L, (long)l2), (long)3535846922156831244L, (long)l2);
                        }
                        catch (n9 n96) {
                            throw m44.a("h", (Object)((Object)n96), (long)3271844745880683516L, (long)l2);
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
                                    throw m44.a("h", (Object)((Object)n97), (long)3271844745880683516L, (long)l2);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l4;
                                m44.a("w", (Object)m44.a("v", (Object)this, (long)3358959717277026083L, (long)l2), (Object)objectArray, (long)3316863881694490480L, (long)l2);
                                if (callSite2 == null) break block26;
                            }
                            catch (n9 n98) {
                                throw m44.a("h", (Object)((Object)n98), (long)3271844745880683516L, (long)l2);
                            }
                        }
                        object = m44.a("w", (Object)keyEvent, (long)3378904306518192203L, (long)l2);
                        callSite = m44.a("v", (Object)m44.a("v", (Object)this, (long)3358959717277026083L, (long)l2), (long)2968063387176115052L, (long)l2);
                    }
                    catch (n9 n99) {
                        throw m44.a("h", (Object)((Object)n99), (long)3271844745880683516L, (long)l2);
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
                                throw m44.a("h", (Object)((Object)n910), (long)3271844745880683516L, (long)l2);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l3;
                            m44.a("w", (Object)m44.a("v", (Object)this, (long)3358959717277026083L, (long)l2), (Object)objectArray, (long)3235218490212086312L, (long)l2);
                            if (callSite2 == null) break block26;
                        }
                        catch (n9 n911) {
                            throw m44.a("h", (Object)((Object)n911), (long)3271844745880683516L, (long)l2);
                        }
                    }
                    object = m44.a("w", (Object)keyEvent, (long)3378904306518192203L, (long)l2);
                    callSite = m44.a("v", (Object)m44.a("v", (Object)this, (long)3358959717277026083L, (long)l2), (long)4033756551401871948L, (long)l2);
                }
                catch (n9 n912) {
                    throw m44.a("h", (Object)((Object)n912), (long)3271844745880683516L, (long)l2);
                }
            }
            try {
                if (object == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l;
                    m44.a("w", (Object)m44.a("v", (Object)this, (long)3358959717277026083L, (long)l2), (Object)objectArray, (long)3520867645386102311L, (long)l2);
                }
            }
            catch (n9 n913) {
                throw m44.a("h", (Object)((Object)n913), (long)3271844745880683516L, (long)l2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x3ED0D62C8211L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -6115610864163980152L;
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
