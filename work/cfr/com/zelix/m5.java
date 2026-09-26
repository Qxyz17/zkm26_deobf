/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.nt;
import com.zelix.prr;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class m5
extends KeyAdapter
implements ActionListener {
    final nt p;
    private static final long a = prr.a(623884589375179421L, 5929453950367114766L, MethodHandles.lookup().lookupClass()).a(30404201201055L);
    private static final long b;

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block11: {
            CallSite callSite;
            CallSite callSite2;
            long l10;
            long l11;
            block9: {
                long l12 = l11 = a ^ 0x7C20D3A361F5L;
                long l13 = l12 ^ 0x26DFE4707874L;
                long l14 = l12 ^ 0x5390B0F8AF87L;
                long l15 = l12 ^ 0x458322DBB909L;
                l10 = l12 ^ 0x6394CFB7C9B7L;
                CallSite callSite3 = m44.a("j", (long)5484113821316860060L, (long)l11);
                try {
                    block10: {
                        try {
                            try {
                                callSite2 = m44.a("u", (Object)actionEvent, (long)5798124215863567459L, (long)l11);
                                Object[] objectArray = new Object[2];
                                objectArray[1] = m44.a("t", (Object)this, (long)5486476974713037717L, (long)l11);
                                objectArray[0] = l13;
                                callSite = m44.a("j", (Object)objectArray, (long)5986198479269162639L, (long)l11);
                                if (callSite3 != null) break block9;
                                if (callSite2 != callSite) break block10;
                            }
                            catch (n9 n92) {
                                throw m44.a("j", (Object)n92, (long)6057766947723214671L, (long)l11);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l14;
                            m44.a("u", (Object)m44.a("t", (Object)this, (long)5486476974713037717L, (long)l11), (Object)objectArray, (long)6162846745197823948L, (long)l11);
                            if (callSite3 == null) break block11;
                        }
                        catch (n9 n93) {
                            throw m44.a("j", (Object)n93, (long)6057766947723214671L, (long)l11);
                        }
                    }
                    callSite2 = m44.a("u", (Object)actionEvent, (long)5798124215863567459L, (long)l11);
                    Object[] objectArray = new Object[2];
                    objectArray[1] = m44.a("t", (Object)this, (long)5486476974713037717L, (long)l11);
                    objectArray[0] = l15;
                    callSite = m44.a("j", (Object)objectArray, (long)5242858757094831093L, (long)l11);
                }
                catch (n9 n94) {
                    throw m44.a("j", (Object)n94, (long)6057766947723214671L, (long)l11);
                }
            }
            try {
                if (callSite2 == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l10;
                    m44.a("u", (Object)m44.a("t", (Object)this, (long)5486476974713037717L, (long)l11), (Object)objectArray, (long)6195878638741260909L, (long)l11);
                }
            }
            catch (n9 n95) {
                throw m44.a("j", (Object)n95, (long)6057766947723214671L, (long)l11);
            }
        }
    }

    m5(nt nt2) {
        this.p = nt2;
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
                long l12;
                long l13;
                long l14;
                block13: {
                    long l15 = l11 = a ^ 0x4077578476A7L;
                    l14 = l15 ^ 0x1A8860576F26L;
                    l13 = l15 ^ 0x6FC734DFB8D5L;
                    l12 = l15 ^ 0x79D4A6FCAE5BL;
                    l10 = l15 ^ 0x5FC34B90DEE5L;
                    callSite2 = m44.a("h", (long)6577859242961788878L, (long)l11);
                    try {
                        try {
                            object = keyEvent;
                            if (callSite2 != null) break block13;
                            if (m44.a("w", (Object)object, (long)6607777882087706343L, (long)l11) != (int)b) break block14;
                        }
                        catch (n9 n92) {
                            throw m44.a("h", (Object)n92, (long)4846927244406548509L, (long)l11);
                        }
                        object = m44.a("w", (Object)keyEvent, (long)6493133655516742835L, (long)l11);
                    }
                    catch (n9 n93) {
                        throw m44.a("h", (Object)n93, (long)4846927244406548509L, (long)l11);
                    }
                }
                try {
                    block16: {
                        try {
                            try {
                                Object[] objectArray = new Object[2];
                                objectArray[1] = m44.a("v", (Object)this, (long)6589291730905232583L, (long)l11);
                                objectArray[0] = l14;
                                callSite = m44.a("h", (Object)objectArray, (long)4918216234265573853L, (long)l11);
                                if (callSite2 != null) break block15;
                                if (object != callSite) break block16;
                            }
                            catch (n9 n94) {
                                throw m44.a("h", (Object)n94, (long)4846927244406548509L, (long)l11);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l13;
                            m44.a("w", (Object)m44.a("v", (Object)this, (long)6589291730905232583L, (long)l11), (Object)objectArray, (long)4815729133899698334L, (long)l11);
                            if (callSite2 == null) break block14;
                        }
                        catch (n9 n95) {
                            throw m44.a("h", (Object)n95, (long)4846927244406548509L, (long)l11);
                        }
                    }
                    object = m44.a("w", (Object)keyEvent, (long)6493133655516742835L, (long)l11);
                    Object[] objectArray = new Object[2];
                    objectArray[1] = m44.a("v", (Object)this, (long)6589291730905232583L, (long)l11);
                    objectArray[0] = l12;
                    callSite = m44.a("h", (Object)objectArray, (long)6886105073433830567L, (long)l11);
                }
                catch (n9 n96) {
                    throw m44.a("h", (Object)n96, (long)4846927244406548509L, (long)l11);
                }
            }
            try {
                if (object == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l10;
                    m44.a("w", (Object)m44.a("v", (Object)this, (long)6589291730905232583L, (long)l11), (Object)objectArray, (long)4804798317730831679L, (long)l11);
                }
            }
            catch (n9 n97) {
                throw m44.a("h", (Object)n97, (long)4846927244406548509L, (long)l11);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0xD94F79ADA24L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = -2093334127522589177L;
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

