/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.t1;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class yo
extends KeyAdapter {
    final t1 p;
    private static final long a = prr.a((long)-1354294040519011927L, (long)6473142389160360691L, MethodHandles.lookup().lookupClass()).a(176684682538285L);
    private static final long b;

    yo(t1 t12) {
        this.p = t12;
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
                            long l6 = l2 = a ^ 0x483A6710EDC6L;
                            l4 = l6 ^ 0x118D4ED81D57L;
                            l3 = l6 ^ 0x2FC06718A788L;
                            l5 = l6 ^ 0x1ABF7C5096ACL;
                            l = l6 ^ 0x7CC84C8F2938L;
                            callSite2 = m44.a("j", (long)2197592219438114959L, (long)l2);
                            try {
                                try {
                                    object = keyEvent;
                                    if (callSite2 != null) break block25;
                                    if (m44.a("u", (Object)object, (long)1896549438900211461L, (long)l2) != (int)b) break block26;
                                }
                                catch (n9 n92) {
                                    throw m44.a("j", (Object)((Object)n92), (long)135247505603198842L, (long)l2);
                                }
                                object = m44.a("u", (Object)keyEvent, (long)2017139824341665105L, (long)l2);
                            }
                            catch (n9 n93) {
                                throw m44.a("j", (Object)((Object)n93), (long)135247505603198842L, (long)l2);
                            }
                        }
                        try {
                            block28: {
                                try {
                                    try {
                                        callSite = m44.a("t", (Object)m44.a("t", (Object)this, (long)172989762604010353L, (long)l2), (long)1867759449962957037L, (long)l2);
                                        if (callSite2 != null) break block27;
                                        if (object != callSite) break block28;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("j", (Object)((Object)n94), (long)135247505603198842L, (long)l2);
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l5;
                                    m44.a("u", (Object)m44.a("t", (Object)this, (long)172989762604010353L, (long)l2), (Object)objectArray, (long)1791302918285469350L, (long)l2);
                                    if (callSite2 == null) break block26;
                                }
                                catch (n9 n95) {
                                    throw m44.a("j", (Object)((Object)n95), (long)135247505603198842L, (long)l2);
                                }
                            }
                            object = m44.a("u", (Object)keyEvent, (long)2017139824341665105L, (long)l2);
                            callSite = m44.a("t", (Object)m44.a("t", (Object)this, (long)172989762604010353L, (long)l2), (long)516348211107396607L, (long)l2);
                        }
                        catch (n9 n96) {
                            throw m44.a("j", (Object)((Object)n96), (long)135247505603198842L, (long)l2);
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
                                    throw m44.a("j", (Object)((Object)n97), (long)135247505603198842L, (long)l2);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l4;
                                m44.a("u", (Object)m44.a("t", (Object)this, (long)172989762604010353L, (long)l2), (Object)objectArray, (long)366032068289435776L, (long)l2);
                                if (callSite2 == null) break block26;
                            }
                            catch (n9 n98) {
                                throw m44.a("j", (Object)((Object)n98), (long)135247505603198842L, (long)l2);
                            }
                        }
                        object = m44.a("u", (Object)keyEvent, (long)2017139824341665105L, (long)l2);
                        callSite = m44.a("t", (Object)m44.a("t", (Object)this, (long)172989762604010353L, (long)l2), (long)2029640774795767414L, (long)l2);
                    }
                    catch (n9 n99) {
                        throw m44.a("j", (Object)((Object)n99), (long)135247505603198842L, (long)l2);
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
                                throw m44.a("j", (Object)((Object)n910), (long)135247505603198842L, (long)l2);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l3;
                            m44.a("u", (Object)m44.a("t", (Object)this, (long)172989762604010353L, (long)l2), (Object)objectArray, (long)1873453981057795890L, (long)l2);
                            if (callSite2 == null) break block26;
                        }
                        catch (n9 n911) {
                            throw m44.a("j", (Object)((Object)n911), (long)135247505603198842L, (long)l2);
                        }
                    }
                    object = m44.a("u", (Object)keyEvent, (long)2017139824341665105L, (long)l2);
                    callSite = m44.a("t", (Object)m44.a("t", (Object)this, (long)172989762604010353L, (long)l2), (long)207410074284896086L, (long)l2);
                }
                catch (n9 n912) {
                    throw m44.a("j", (Object)((Object)n912), (long)135247505603198842L, (long)l2);
                }
            }
            try {
                if (object == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l;
                    m44.a("u", (Object)m44.a("t", (Object)this, (long)172989762604010353L, (long)l2), (Object)objectArray, (long)2049635742033156604L, (long)l2);
                }
            }
            catch (n9 n913) {
                throw m44.a("j", (Object)((Object)n913), (long)135247505603198842L, (long)l2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x64150502B74AL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 5739586795730809540L;
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
