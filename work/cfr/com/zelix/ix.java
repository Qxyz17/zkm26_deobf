/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.tn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ix
implements ActionListener,
KeyListener {
    final tn o;
    private static final long a = prr.a(-8278285522385650535L, 6084845941051029442L, MethodHandles.lookup().lookupClass()).a(211754141437493L);
    private static final long b;

    ix(tn tn2) {
        this.o = tn2;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block9: {
            Object object;
            CallSite callSite;
            long l10;
            long l11;
            long l12;
            long l13;
            long l14;
            block8: {
                long l15 = l14 = a ^ 0x217433B8590DL;
                l13 = l15 ^ 0x4665257CDA6FL;
                l12 = l15 ^ 0x1D7D59069A38L;
                l11 = l15 ^ 0x47C9172F7AECL;
                l10 = l15 ^ 0x64031C478568L;
                callSite = m44.a("j", (long)4444812714746792799L, (long)l14);
                try {
                    try {
                        object = keyEvent;
                        if (callSite != null) break block8;
                        if (m44.a("u", (Object)object, (long)4143780380648352981L, (long)l14) != (int)b) break block9;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)2671998701958473581L, (long)l14);
                    }
                    object = m44.a("u", (Object)keyEvent, (long)4048206221188523649L, (long)l14);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)2671998701958473581L, (long)l14);
                }
            }
            try {
                block10: {
                    try {
                        if (object != m44.a("t", (Object)m44.a("t", (Object)this, (long)4561318080462443887L, (long)l14), (long)4577347438411048458L, (long)l14)) break block10;
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l11;
                        m44.a("u", (Object)m44.a("t", (Object)this, (long)4561318080462443887L, (long)l14), (Object)objectArray, (long)2814648886163520504L, (long)l14);
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l13;
                        m44.a("u", (Object)m44.a("t", (Object)this, (long)4561318080462443887L, (long)l14), (Object)objectArray2, (long)2775149290605854695L, (long)l14);
                        if (callSite == null) break block9;
                    }
                    catch (n9 n94) {
                        throw m44.a("j", (Object)n94, (long)2671998701958473581L, (long)l14);
                    }
                }
                Object[] objectArray = new Object[1];
                objectArray[0] = l12;
                m44.a("u", (Object)m44.a("t", (Object)this, (long)4561318080462443887L, (long)l14), (Object)objectArray, (long)4214786426511510011L, (long)l14);
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l10;
                m44.a("u", (Object)m44.a("t", (Object)this, (long)4561318080462443887L, (long)l14), (Object)objectArray3, (long)4291229517053203334L, (long)l14);
            }
            catch (n9 n95) {
                throw m44.a("j", (Object)n95, (long)2671998701958473581L, (long)l14);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block8: {
            long l10;
            long l11;
            block6: {
                long l12 = l11 = a ^ 0x5BB5E7EAAF26L;
                long l13 = l12 ^ 0x3CA4F12E2C44L;
                long l14 = l12 ^ 0x67BC8D546C13L;
                long l15 = l12 ^ 0x3D08C37D8CC7L;
                l10 = l12 ^ 0x1EC2C8157343L;
                CallSite callSite = m44.a("i", (long)-3781792935661683340L, (long)l11);
                try {
                    block7: {
                        try {
                            try {
                                if (callSite != null) break block6;
                                if (m44.a("v", (Object)actionEvent, (long)-3225574164017125592L, (long)l11) != m44.a("w", (Object)m44.a("w", (Object)this, (long)-3934329263396412604L, (long)l11), (long)-3914336163747721183L, (long)l11)) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("i", (Object)n92, (long)-3224680239357963962L, (long)l11);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l15;
                            m44.a("v", (Object)m44.a("w", (Object)this, (long)-3934329263396412604L, (long)l11), (Object)objectArray, (long)-3376328637993497133L, (long)l11);
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l13;
                            m44.a("v", (Object)m44.a("w", (Object)this, (long)-3934329263396412604L, (long)l11), (Object)objectArray2, (long)-3411418090264606260L, (long)l11);
                            if (callSite == null) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("i", (Object)n93, (long)-3224680239357963962L, (long)l11);
                        }
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l14;
                    m44.a("v", (Object)m44.a("w", (Object)this, (long)-3934329263396412604L, (long)l11), (Object)objectArray, (long)-3722621820968779824L, (long)l11);
                }
                catch (n9 n94) {
                    throw m44.a("i", (Object)n94, (long)-3224680239357963962L, (long)l11);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l10;
            m44.a("v", (Object)m44.a("w", (Object)this, (long)-3934329263396412604L, (long)l11), (Object)objectArray, (long)-3627939481779018323L, (long)l11);
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x7E14A9C58C87L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = -2955416412277730476L;
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

