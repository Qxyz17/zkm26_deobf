/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.wt;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class y
extends KeyAdapter {
    final wt Z;
    private static final long a = prr.a((long)4758291660684099447L, (long)-4543637249550953893L, MethodHandles.lookup().lookupClass()).a(255898403996208L);
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
                        long l5 = l2 = a ^ 0x1E8BE7721284L;
                        l3 = l5 ^ 0x535F06DF3058L;
                        l4 = l5 ^ 0x7BC8605496CL;
                        l = l5 ^ 0x7A4B7767EEFEL;
                        callSite2 = m44.a("n", (long)-5217115883961615017L, (long)l2);
                        try {
                            try {
                                object = keyEvent;
                                if (callSite2 == null) break block19;
                                if (m44.a("q", (Object)object, (long)-5846336630448342135L, (long)l2) != (int)b) break block20;
                            }
                            catch (n9 n92) {
                                throw m44.a("n", (Object)((Object)n92), (long)-5767369367710117254L, (long)l2);
                            }
                            object = m44.a("q", (Object)keyEvent, (long)-5804551000736566819L, (long)l2);
                        }
                        catch (n9 n93) {
                            throw m44.a("n", (Object)((Object)n93), (long)-5767369367710117254L, (long)l2);
                        }
                    }
                    try {
                        block22: {
                            try {
                                try {
                                    callSite = m44.a("p", (Object)m44.a("p", (Object)this, (long)-5969730379558224053L, (long)l2), (long)-5747859263072821072L, (long)l2);
                                    if (callSite2 == null) break block21;
                                    if (object != callSite) break block22;
                                }
                                catch (n9 n94) {
                                    throw m44.a("n", (Object)((Object)n94), (long)-5767369367710117254L, (long)l2);
                                }
                                Object[] objectArray = new Object[2];
                                objectArray[1] = l4;
                                objectArray[0] = m44.a("p", (Object)this, (long)-5969730379558224053L, (long)l2);
                                m44.a("n", (Object)objectArray, (long)-5980352797021593498L, (long)l2);
                                if (callSite2 != null) break block20;
                            }
                            catch (n9 n95) {
                                throw m44.a("n", (Object)((Object)n95), (long)-5767369367710117254L, (long)l2);
                            }
                        }
                        object = m44.a("q", (Object)keyEvent, (long)-5804551000736566819L, (long)l2);
                        callSite = m44.a("p", (Object)m44.a("p", (Object)this, (long)-5969730379558224053L, (long)l2), (long)-6033994193553372845L, (long)l2);
                    }
                    catch (n9 n96) {
                        throw m44.a("n", (Object)((Object)n96), (long)-5767369367710117254L, (long)l2);
                    }
                }
                try {
                    block24: {
                        try {
                            try {
                                if (callSite2 == null) break block23;
                                if (object != callSite) break block24;
                            }
                            catch (n9 n97) {
                                throw m44.a("n", (Object)((Object)n97), (long)-5767369367710117254L, (long)l2);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l3;
                            m44.a("q", (Object)m44.a("p", (Object)this, (long)-5969730379558224053L, (long)l2), (Object)objectArray, (long)-5209366483273267861L, (long)l2);
                            if (callSite2 != null) break block20;
                        }
                        catch (n9 n98) {
                            throw m44.a("n", (Object)((Object)n98), (long)-5767369367710117254L, (long)l2);
                        }
                    }
                    object = m44.a("q", (Object)keyEvent, (long)-5804551000736566819L, (long)l2);
                    callSite = m44.a("p", (Object)m44.a("p", (Object)this, (long)-5969730379558224053L, (long)l2), (long)-5225332863867410081L, (long)l2);
                }
                catch (n9 n99) {
                    throw m44.a("n", (Object)((Object)n99), (long)-5767369367710117254L, (long)l2);
                }
            }
            try {
                if (object == callSite) {
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l;
                    objectArray[0] = m44.a("p", (Object)this, (long)-5969730379558224053L, (long)l2);
                    m44.a("n", (Object)objectArray, (long)-5236484016673897090L, (long)l2);
                }
            }
            catch (n9 n910) {
                throw m44.a("n", (Object)((Object)n910), (long)-5767369367710117254L, (long)l2);
            }
        }
    }

    y(wt wt2) {
        this.Z = wt2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x1FAFBF54F3EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -1715362886766185822L;
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
