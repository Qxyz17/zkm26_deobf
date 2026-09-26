/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.th;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class l7p
extends KeyAdapter {
    final th E;
    private static final long a = prr.a(2109517496389573156L, -2378560544458055214L, MethodHandles.lookup().lookupClass()).a(194473049549446L);
    private static final long b;

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block38: {
            CallSite callSite;
            Object object;
            long l10;
            long l11;
            block47: {
                KeyEvent keyEvent2;
                CallSite callSite2;
                long l12;
                block45: {
                    long l13;
                    block43: {
                        long l14;
                        block41: {
                            long l15;
                            block39: {
                                Object object2;
                                long l16;
                                block37: {
                                    long l17 = l11 = a ^ 0x38F93D4B7379L;
                                    l10 = l17 ^ 0x31E6476325A7L;
                                    l15 = l17 ^ 0x5CA3453411C8L;
                                    l12 = l17 ^ 0x62EE6CF4AB17L;
                                    l13 = l17 ^ 0xC487F610FFDL;
                                    l14 = l17 ^ 0x7E15B97C2DC5L;
                                    l16 = l17 ^ 0x56053794772L;
                                    callSite2 = m44.a("m", (long)1360130333410419728L, (long)l11);
                                    try {
                                        try {
                                            object2 = keyEvent;
                                            if (callSite2 != null) break block37;
                                            if (m44.a("r", (Object)object2, (long)1643436201600943002L, (long)l11) != (int)b) break block38;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("m", (Object)n92, (long)845294668780623245L, (long)l11);
                                        }
                                        object2 = m44.a("r", (Object)keyEvent, (long)1684659439715600846L, (long)l11);
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("m", (Object)n93, (long)845294668780623245L, (long)l11);
                                    }
                                }
                                keyEvent2 = object2;
                                try {
                                    block40: {
                                        try {
                                            try {
                                                object = m44.a("r", (Object)keyEvent, (long)1684659439715600846L, (long)l11);
                                                callSite = m44.a("s", (Object)m44.a("s", (Object)this, (long)1010654905191390387L, (long)l11), (long)1243761168038766471L, (long)l11);
                                                if (callSite2 != null) break block39;
                                                if (object != callSite) break block40;
                                            }
                                            catch (n9 n94) {
                                                throw m44.a("m", (Object)n94, (long)845294668780623245L, (long)l11);
                                            }
                                            Object[] objectArray = new Object[1];
                                            objectArray[0] = l16;
                                            m44.a("r", (Object)m44.a("s", (Object)this, (long)1010654905191390387L, (long)l11), (Object)objectArray, (long)583354551532396756L, (long)l11);
                                            if (callSite2 == null) break block38;
                                        }
                                        catch (n9 n95) {
                                            throw m44.a("m", (Object)n95, (long)845294668780623245L, (long)l11);
                                        }
                                    }
                                    object = keyEvent2;
                                    callSite = m44.a("s", (Object)m44.a("s", (Object)this, (long)1010654905191390387L, (long)l11), (long)843618817863776096L, (long)l11);
                                }
                                catch (n9 n96) {
                                    throw m44.a("m", (Object)n96, (long)845294668780623245L, (long)l11);
                                }
                            }
                            try {
                                block42: {
                                    try {
                                        try {
                                            if (callSite2 != null) break block41;
                                            if (object != callSite) break block42;
                                        }
                                        catch (n9 n97) {
                                            throw m44.a("m", (Object)n97, (long)845294668780623245L, (long)l11);
                                        }
                                        Object[] objectArray = new Object[1];
                                        objectArray[0] = l15;
                                        m44.a("r", (Object)m44.a("s", (Object)this, (long)1010654905191390387L, (long)l11), (Object)objectArray, (long)687684136020153375L, (long)l11);
                                        if (callSite2 == null) break block38;
                                    }
                                    catch (n9 n98) {
                                        throw m44.a("m", (Object)n98, (long)845294668780623245L, (long)l11);
                                    }
                                }
                                object = keyEvent2;
                                callSite = m44.a("s", (Object)m44.a("s", (Object)this, (long)1010654905191390387L, (long)l11), (long)618261227719412617L, (long)l11);
                            }
                            catch (n9 n99) {
                                throw m44.a("m", (Object)n99, (long)845294668780623245L, (long)l11);
                            }
                        }
                        try {
                            block44: {
                                try {
                                    try {
                                        if (callSite2 != null) break block43;
                                        if (object != callSite) break block44;
                                    }
                                    catch (n9 n910) {
                                        throw m44.a("m", (Object)n910, (long)845294668780623245L, (long)l11);
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l14;
                                    m44.a("r", (Object)m44.a("s", (Object)this, (long)1010654905191390387L, (long)l11), (Object)objectArray, (long)1694063080217319157L, (long)l11);
                                    if (callSite2 == null) break block38;
                                }
                                catch (n9 n911) {
                                    throw m44.a("m", (Object)n911, (long)845294668780623245L, (long)l11);
                                }
                            }
                            object = keyEvent2;
                            callSite = m44.a("s", (Object)m44.a("s", (Object)this, (long)1010654905191390387L, (long)l11), (long)1477479997439505094L, (long)l11);
                        }
                        catch (n9 n912) {
                            throw m44.a("m", (Object)n912, (long)845294668780623245L, (long)l11);
                        }
                    }
                    try {
                        block46: {
                            try {
                                try {
                                    if (callSite2 != null) break block45;
                                    if (object != callSite) break block46;
                                }
                                catch (n9 n913) {
                                    throw m44.a("m", (Object)n913, (long)845294668780623245L, (long)l11);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l13;
                                m44.a("r", (Object)m44.a("s", (Object)this, (long)1010654905191390387L, (long)l11), (Object)objectArray, (long)993976540118860358L, (long)l11);
                                if (callSite2 == null) break block38;
                            }
                            catch (n9 n914) {
                                throw m44.a("m", (Object)n914, (long)845294668780623245L, (long)l11);
                            }
                        }
                        object = keyEvent2;
                        callSite = m44.a("s", (Object)m44.a("s", (Object)this, (long)1010654905191390387L, (long)l11), (long)1204139685139817193L, (long)l11);
                    }
                    catch (n9 n915) {
                        throw m44.a("m", (Object)n915, (long)845294668780623245L, (long)l11);
                    }
                }
                try {
                    block48: {
                        try {
                            try {
                                if (callSite2 != null) break block47;
                                if (object != callSite) break block48;
                            }
                            catch (n9 n916) {
                                throw m44.a("m", (Object)n916, (long)845294668780623245L, (long)l11);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l12;
                            m44.a("r", (Object)m44.a("s", (Object)this, (long)1010654905191390387L, (long)l11), (Object)objectArray, (long)1540395270369561517L, (long)l11);
                            if (callSite2 == null) break block38;
                        }
                        catch (n9 n917) {
                            throw m44.a("m", (Object)n917, (long)845294668780623245L, (long)l11);
                        }
                    }
                    object = keyEvent2;
                    callSite = m44.a("s", (Object)m44.a("s", (Object)this, (long)1010654905191390387L, (long)l11), (long)1044715761030570953L, (long)l11);
                }
                catch (n9 n918) {
                    throw m44.a("m", (Object)n918, (long)845294668780623245L, (long)l11);
                }
            }
            try {
                if (object == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l10;
                    m44.a("r", (Object)m44.a("s", (Object)this, (long)1010654905191390387L, (long)l11), (Object)objectArray, (long)673843660725137314L, (long)l11);
                }
            }
            catch (n9 n919) {
                throw m44.a("m", (Object)n919, (long)845294668780623245L, (long)l11);
            }
        }
    }

    l7p(th th2) {
        this.E = th2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x279D8848A9CL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = -1777468062970006233L;
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

