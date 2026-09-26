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

public class z9
implements ActionListener,
KeyListener {
    final tn S;
    private static final long a = prr.a((long)-9054292719880638379L, (long)-5805754078248568040L, MethodHandles.lookup().lookupClass()).a(236059908441194L);
    private static final long b;

    z9(tn tn2) {
        this.S = tn2;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block9: {
            Object object;
            CallSite callSite;
            long l;
            long l2;
            long l3;
            long l4;
            long l5;
            block8: {
                long l6 = l5 = a ^ 0x86948544FA8L;
                l4 = l6 ^ 0x1FBBCACD06E9L;
                l3 = l6 ^ 0x5EB36B64C138L;
                l2 = l6 ^ 0x2F063BCB86L;
                l = l6 ^ 0x422E826C0231L;
                callSite = m44.a("n", (long)773219421802626123L, (long)l5);
                try {
                    try {
                        object = keyEvent;
                        if (callSite != null) break block8;
                        if (m44.a("q", (Object)object, (long)1050896892107561921L, (long)l5) != (int)b) break block9;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)1545577829900915804L, (long)l5);
                    }
                    object = m44.a("q", (Object)keyEvent, (long)1097257040479441301L, (long)l5);
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)1545577829900915804L, (long)l5);
                }
            }
            try {
                block10: {
                    try {
                        if (object != m44.a("p", (Object)m44.a("p", (Object)this, (long)1396400319912975397L, (long)l5), (long)744946140976974513L, (long)l5)) break block10;
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l4;
                        m44.a("q", (Object)m44.a("p", (Object)this, (long)1396400319912975397L, (long)l5), (Object)objectArray, (long)1102813532403225875L, (long)l5);
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l3;
                        m44.a("q", (Object)m44.a("p", (Object)this, (long)1396400319912975397L, (long)l5), (Object)objectArray2, (long)1208414878547020805L, (long)l5);
                        if (callSite == null) break block9;
                    }
                    catch (n9 n94) {
                        throw m44.a("n", (Object)((Object)n94), (long)1545577829900915804L, (long)l5);
                    }
                }
                Object[] objectArray = new Object[1];
                objectArray[0] = l2;
                m44.a("q", (Object)m44.a("p", (Object)this, (long)1396400319912975397L, (long)l5), (Object)objectArray, (long)1245438744695580923L, (long)l5);
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l;
                m44.a("q", (Object)m44.a("p", (Object)this, (long)1396400319912975397L, (long)l5), (Object)objectArray3, (long)1551778608550264359L, (long)l5);
            }
            catch (n9 n95) {
                throw m44.a("n", (Object)((Object)n95), (long)1545577829900915804L, (long)l5);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block8: {
            long l;
            long l2;
            block6: {
                long l3 = l2 = a ^ 0x1123F1F57D95L;
                long l4 = l3 ^ 0x6F1736C34D4L;
                long l5 = l3 ^ 0x47F9D2C5F305L;
                long l6 = l3 ^ 0x1965BF9AF9BBL;
                l = l3 ^ 0x5B643BCD300CL;
                CallSite callSite = m44.a("k", (long)4072977809886891638L, (long)l2);
                try {
                    block7: {
                        try {
                            try {
                                if (callSite != null) break block6;
                                if (m44.a("t", (Object)actionEvent, (long)2323353293226644522L, (long)l2) != m44.a("u", (Object)m44.a("u", (Object)this, (long)2403827070003490328L, (long)l2), (long)4065499063659411596L, (long)l2)) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("k", (Object)((Object)n92), (long)2832737306137831009L, (long)l2);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l4;
                            m44.a("t", (Object)m44.a("u", (Object)this, (long)2403827070003490328L, (long)l2), (Object)objectArray, (long)4427287310647846702L, (long)l2);
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l5;
                            m44.a("t", (Object)m44.a("u", (Object)this, (long)2403827070003490328L, (long)l2), (Object)objectArray2, (long)2519833979091598904L, (long)l2);
                            if (callSite == null) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("k", (Object)((Object)n93), (long)2832737306137831009L, (long)l2);
                        }
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l6;
                    m44.a("t", (Object)m44.a("u", (Object)this, (long)2403827070003490328L, (long)l2), (Object)objectArray, (long)2555149274500799174L, (long)l2);
                }
                catch (n9 n94) {
                    throw m44.a("k", (Object)((Object)n94), (long)2832737306137831009L, (long)l2);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l;
            m44.a("t", (Object)m44.a("u", (Object)this, (long)2403827070003490328L, (long)l2), (Object)objectArray, (long)2860945913588812826L, (long)l2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x5A79896F942BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 1355533631590406181L;
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
