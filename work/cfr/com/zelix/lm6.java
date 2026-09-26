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
    private static final long a = prr.a(-473519092763523469L, -3217316196773019709L, MethodHandles.lookup().lookupClass()).a(188763329915622L);
    private static final long b;

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block14: {
            CallSite callSite;
            Object object;
            long l10;
            long l11;
            block15: {
                CallSite callSite2;
                CallSite callSite3;
                long l12;
                block13: {
                    long l13 = l11 = a ^ 0x7B127CEB0B0L;
                    l12 = l13 ^ 0x17B479571F62L;
                    l10 = l13 ^ 0x43FC80B793C2L;
                    callSite3 = m44.a("v", (Object)keyEvent, (long)-1766247339457300014L, (long)l11);
                    callSite2 = m44.a("i", (long)-1967794771357905964L, (long)l11);
                    try {
                        try {
                            object = keyEvent;
                            if (callSite2 == null) break block13;
                            if (m44.a("v", (Object)object, (long)-1814190654652419194L, (long)l11) != (int)b) break block14;
                        }
                        catch (n9 n92) {
                            throw m44.a("i", (Object)n92, (long)-1929602808200346272L, (long)l11);
                        }
                        object = callSite3;
                    }
                    catch (n9 n93) {
                        throw m44.a("i", (Object)n93, (long)-1929602808200346272L, (long)l11);
                    }
                }
                try {
                    block16: {
                        try {
                            try {
                                callSite = m44.a("w", (Object)m44.a("w", (Object)this, (long)-1997134286374526313L, (long)l11), (long)-1875937223310431372L, (long)l11);
                                if (callSite2 == null) break block15;
                                if (object != callSite) break block16;
                            }
                            catch (n9 n94) {
                                throw m44.a("i", (Object)n94, (long)-1929602808200346272L, (long)l11);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l12;
                            m44.a("v", (Object)m44.a("w", (Object)this, (long)-1997134286374526313L, (long)l11), (Object)objectArray, (long)-399617659581568161L, (long)l11);
                            if (callSite2 != null) break block14;
                        }
                        catch (n9 n95) {
                            throw m44.a("i", (Object)n95, (long)-1929602808200346272L, (long)l11);
                        }
                    }
                    object = callSite3;
                    callSite = m44.a("w", (Object)m44.a("w", (Object)this, (long)-1997134286374526313L, (long)l11), (long)-2292257335392488760L, (long)l11);
                }
                catch (n9 n96) {
                    throw m44.a("i", (Object)n96, (long)-1929602808200346272L, (long)l11);
                }
            }
            try {
                if (object == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l10;
                    m44.a("v", (Object)m44.a("w", (Object)this, (long)-1997134286374526313L, (long)l11), (Object)objectArray, (long)-440474164792752556L, (long)l11);
                }
            }
            catch (n9 n97) {
                throw m44.a("i", (Object)n97, (long)-1929602808200346272L, (long)l11);
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
        long l10 = a ^ 0x70ED9564DC81L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = 7859782481925581954L;
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

