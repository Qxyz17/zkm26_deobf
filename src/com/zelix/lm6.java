/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lbc;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lm6
extends KeyAdapter {
    final lbc i;
    private static final long a = prr.a((long)-473519092763523469L, (long)-3217316196773019709L, MethodHandles.lookup().lookupClass()).a(188763329915622L);
    private static final long b;

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block14: {
            CallSite callSite;
            Object object;
            long l;
            long l2;
            block15: {
                CallSite callSite2;
                CallSite callSite3;
                long l3;
                block13: {
                    long l4 = l2 = a ^ 0x7B127CEB0B0L;
                    l3 = l4 ^ 0x17B479571F62L;
                    l = l4 ^ 0x43FC80B793C2L;
                    callSite3 = m44.a("v", (Object)keyEvent, (long)-1766247339457300014L, (long)l2);
                    callSite2 = m44.a("i", (long)-1967794771357905964L, (long)l2);
                    try {
                        try {
                            object = keyEvent;
                            if (callSite2 == null) break block13;
                            if (m44.a("v", (Object)object, (long)-1814190654652419194L, (long)l2) != (int)b) break block14;
                        }
                        catch (n9 n92) {
                            throw m44.a("i", (Object)((Object)n92), (long)-1929602808200346272L, (long)l2);
                        }
                        object = callSite3;
                    }
                    catch (n9 n93) {
                        throw m44.a("i", (Object)((Object)n93), (long)-1929602808200346272L, (long)l2);
                    }
                }
                try {
                    block16: {
                        try {
                            try {
                                callSite = m44.a("w", (Object)m44.a("w", (Object)this, (long)-1997134286374526313L, (long)l2), (long)-1875937223310431372L, (long)l2);
                                if (callSite2 == null) break block15;
                                if (object != callSite) break block16;
                            }
                            catch (n9 n94) {
                                throw m44.a("i", (Object)((Object)n94), (long)-1929602808200346272L, (long)l2);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l3;
                            m44.a("v", (Object)m44.a("w", (Object)this, (long)-1997134286374526313L, (long)l2), (Object)objectArray, (long)-399617659581568161L, (long)l2);
                            if (callSite2 != null) break block14;
                        }
                        catch (n9 n95) {
                            throw m44.a("i", (Object)((Object)n95), (long)-1929602808200346272L, (long)l2);
                        }
                    }
                    object = callSite3;
                    callSite = m44.a("w", (Object)m44.a("w", (Object)this, (long)-1997134286374526313L, (long)l2), (long)-2292257335392488760L, (long)l2);
                }
                catch (n9 n96) {
                    throw m44.a("i", (Object)((Object)n96), (long)-1929602808200346272L, (long)l2);
                }
            }
            try {
                if (object == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l;
                    m44.a("v", (Object)m44.a("w", (Object)this, (long)-1997134286374526313L, (long)l2), (Object)objectArray, (long)-440474164792752556L, (long)l2);
                }
            }
            catch (n9 n97) {
                throw m44.a("i", (Object)((Object)n97), (long)-1929602808200346272L, (long)l2);
            }
        }
    }

    lm6(lbc lbc2) {
        this.i = lbc2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x70ED9564DC81L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 7859782481925581954L;
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
