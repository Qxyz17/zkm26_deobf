/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lbg;
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

public class i5
extends KeyAdapter {
    final lbg n;
    private static final long a = prr.a(5717383600575271085L, -5022077053170484835L, MethodHandles.lookup().lookupClass()).a(72195174984792L);
    private static final long b;

    i5(lbg lbg2) {
        this.n = lbg2;
    }

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
                    long l13 = l11 = a ^ 0x361EC33BF826L;
                    l12 = l13 ^ 0x11A31CA34B50L;
                    l10 = l13 ^ 0x2D331C794681L;
                    callSite3 = m44.a("t", (Object)keyEvent, (long)-5526196635066995232L, (long)l11);
                    callSite2 = m44.a("k", (long)-5727739782878781466L, (long)l11);
                    try {
                        try {
                            object = keyEvent;
                            if (callSite2 == null) break block13;
                            if (m44.a("t", (Object)object, (long)-5557242785503926348L, (long)l11) != (int)b) break block14;
                        }
                        catch (n9 n92) {
                            throw m44.a("k", (Object)n92, (long)-6203156219221162775L, (long)l11);
                        }
                        object = callSite3;
                    }
                    catch (n9 n93) {
                        throw m44.a("k", (Object)n93, (long)-6203156219221162775L, (long)l11);
                    }
                }
                try {
                    block16: {
                        try {
                            try {
                                callSite = m44.a("u", (Object)m44.a("u", (Object)this, (long)-5635906638203900195L, (long)l11), (long)-5617769392882170482L, (long)l11);
                                if (callSite2 == null) break block15;
                                if (object != callSite) break block16;
                            }
                            catch (n9 n94) {
                                throw m44.a("k", (Object)n94, (long)-6203156219221162775L, (long)l11);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l12;
                            m44.a("t", (Object)m44.a("u", (Object)this, (long)-5635906638203900195L, (long)l11), (Object)objectArray, (long)-6202661928377796719L, (long)l11);
                            if (callSite2 != null) break block14;
                        }
                        catch (n9 n95) {
                            throw m44.a("k", (Object)n95, (long)-6203156219221162775L, (long)l11);
                        }
                    }
                    object = callSite3;
                    callSite = m44.a("u", (Object)m44.a("u", (Object)this, (long)-5635906638203900195L, (long)l11), (long)-5999438872733717452L, (long)l11);
                }
                catch (n9 n96) {
                    throw m44.a("k", (Object)n96, (long)-6203156219221162775L, (long)l11);
                }
            }
            try {
                if (object == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l10;
                    m44.a("t", (Object)m44.a("u", (Object)this, (long)-5635906638203900195L, (long)l11), (Object)objectArray, (long)-6259355463964911283L, (long)l11);
                }
            }
            catch (n9 n97) {
                throw m44.a("k", (Object)n97, (long)-6203156219221162775L, (long)l11);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x6082ADA91105L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = 8758445900691485948L;
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

