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
    private static final long a = prr.a((long)623884589375179421L, (long)5929453950367114766L, MethodHandles.lookup().lookupClass()).a(30404201201055L);
    private static final long b;

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block11: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            long l2;
            block9: {
                long l3 = l2 = a ^ 0x7C20D3A361F5L;
                long l4 = l3 ^ 0x26DFE4707874L;
                long l5 = l3 ^ 0x5390B0F8AF87L;
                long l6 = l3 ^ 0x458322DBB909L;
                l = l3 ^ 0x6394CFB7C9B7L;
                CallSite callSite3 = m44.a("j", (long)5484113821316860060L, (long)l2);
                try {
                    block10: {
                        try {
                            try {
                                callSite2 = m44.a("u", (Object)actionEvent, (long)5798124215863567459L, (long)l2);
                                Object[] objectArray = new Object[2];
                                objectArray[1] = m44.a("t", (Object)this, (long)5486476974713037717L, (long)l2);
                                objectArray[0] = l4;
                                callSite = m44.a("j", (Object)objectArray, (long)5986198479269162639L, (long)l2);
                                if (callSite3 != null) break block9;
                                if (callSite2 != callSite) break block10;
                            }
                            catch (n9 n92) {
                                throw m44.a("j", (Object)((Object)n92), (long)6057766947723214671L, (long)l2);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l5;
                            m44.a("u", (Object)m44.a("t", (Object)this, (long)5486476974713037717L, (long)l2), (Object)objectArray, (long)6162846745197823948L, (long)l2);
                            if (callSite3 == null) break block11;
                        }
                        catch (n9 n93) {
                            throw m44.a("j", (Object)((Object)n93), (long)6057766947723214671L, (long)l2);
                        }
                    }
                    callSite2 = m44.a("u", (Object)actionEvent, (long)5798124215863567459L, (long)l2);
                    Object[] objectArray = new Object[2];
                    objectArray[1] = m44.a("t", (Object)this, (long)5486476974713037717L, (long)l2);
                    objectArray[0] = l6;
                    callSite = m44.a("j", (Object)objectArray, (long)5242858757094831093L, (long)l2);
                }
                catch (n9 n94) {
                    throw m44.a("j", (Object)((Object)n94), (long)6057766947723214671L, (long)l2);
                }
            }
            try {
                if (callSite2 == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l;
                    m44.a("u", (Object)m44.a("t", (Object)this, (long)5486476974713037717L, (long)l2), (Object)objectArray, (long)6195878638741260909L, (long)l2);
                }
            }
            catch (n9 n95) {
                throw m44.a("j", (Object)((Object)n95), (long)6057766947723214671L, (long)l2);
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
            long l;
            long l2;
            block15: {
                CallSite callSite2;
                long l3;
                long l4;
                long l5;
                block13: {
                    long l6 = l2 = a ^ 0x4077578476A7L;
                    l5 = l6 ^ 0x1A8860576F26L;
                    l4 = l6 ^ 0x6FC734DFB8D5L;
                    l3 = l6 ^ 0x79D4A6FCAE5BL;
                    l = l6 ^ 0x5FC34B90DEE5L;
                    callSite2 = m44.a("h", (long)6577859242961788878L, (long)l2);
                    try {
                        try {
                            object = keyEvent;
                            if (callSite2 != null) break block13;
                            if (m44.a("w", (Object)object, (long)6607777882087706343L, (long)l2) != (int)b) break block14;
                        }
                        catch (n9 n92) {
                            throw m44.a("h", (Object)((Object)n92), (long)4846927244406548509L, (long)l2);
                        }
                        object = m44.a("w", (Object)keyEvent, (long)6493133655516742835L, (long)l2);
                    }
                    catch (n9 n93) {
                        throw m44.a("h", (Object)((Object)n93), (long)4846927244406548509L, (long)l2);
                    }
                }
                try {
                    block16: {
                        try {
                            try {
                                Object[] objectArray = new Object[2];
                                objectArray[1] = m44.a("v", (Object)this, (long)6589291730905232583L, (long)l2);
                                objectArray[0] = l5;
                                callSite = m44.a("h", (Object)objectArray, (long)4918216234265573853L, (long)l2);
                                if (callSite2 != null) break block15;
                                if (object != callSite) break block16;
                            }
                            catch (n9 n94) {
                                throw m44.a("h", (Object)((Object)n94), (long)4846927244406548509L, (long)l2);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l4;
                            m44.a("w", (Object)m44.a("v", (Object)this, (long)6589291730905232583L, (long)l2), (Object)objectArray, (long)4815729133899698334L, (long)l2);
                            if (callSite2 == null) break block14;
                        }
                        catch (n9 n95) {
                            throw m44.a("h", (Object)((Object)n95), (long)4846927244406548509L, (long)l2);
                        }
                    }
                    object = m44.a("w", (Object)keyEvent, (long)6493133655516742835L, (long)l2);
                    Object[] objectArray = new Object[2];
                    objectArray[1] = m44.a("v", (Object)this, (long)6589291730905232583L, (long)l2);
                    objectArray[0] = l3;
                    callSite = m44.a("h", (Object)objectArray, (long)6886105073433830567L, (long)l2);
                }
                catch (n9 n96) {
                    throw m44.a("h", (Object)((Object)n96), (long)4846927244406548509L, (long)l2);
                }
            }
            try {
                if (object == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l;
                    m44.a("w", (Object)m44.a("v", (Object)this, (long)6589291730905232583L, (long)l2), (Object)objectArray, (long)4804798317730831679L, (long)l2);
                }
            }
            catch (n9 n97) {
                throw m44.a("h", (Object)((Object)n97), (long)4846927244406548509L, (long)l2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0xD94F79ADA24L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -2093334127522589177L;
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
