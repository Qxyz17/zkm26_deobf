/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.t4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class a0
implements ActionListener {
    final t4 f;
    private static final long a = prr.a(4927880931403805056L, 8640389369372384938L, MethodHandles.lookup().lookupClass()).a(102821383290522L);

    a0(t4 t42) {
        this.f = t42;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block23: {
            CallSite callSite;
            CallSite callSite2;
            long l10;
            long l11;
            block26: {
                CallSite callSite3;
                CallSite callSite4;
                long l12;
                block24: {
                    long l13;
                    block21: {
                        long l14 = l11 = a ^ 0x3DFACD0EF58EL;
                        l10 = l14 ^ 0x3A6422F53D58L;
                        long l15 = l14 ^ 0x572120A20937L;
                        l12 = l14 ^ 0x696C0962B3E8L;
                        l13 = l14 ^ 0x7597DCEA353AL;
                        callSite4 = m44.a("u", (Object)actionEvent, (long)1344050612603856563L, (long)l11);
                        callSite3 = m44.a("j", (long)729350964955282671L, (long)l11);
                        try {
                            block22: {
                                try {
                                    try {
                                        callSite2 = callSite4;
                                        callSite = m44.a("t", (Object)m44.a("t", (Object)this, (long)1042563101991305435L, (long)l11), (long)1389968902478163871L, (long)l11);
                                        if (callSite3 != null) break block21;
                                        if (callSite2 != callSite) break block22;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("j", (Object)n92, (long)878915465625375381L, (long)l11);
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l15;
                                    m44.a("u", (Object)m44.a("t", (Object)this, (long)1042563101991305435L, (long)l11), (Object)objectArray, (long)1257681419345399008L, (long)l11);
                                    if (callSite3 == null) break block23;
                                }
                                catch (n9 n93) {
                                    throw m44.a("j", (Object)n93, (long)878915465625375381L, (long)l11);
                                }
                            }
                            callSite2 = callSite4;
                            callSite = m44.a("t", (Object)m44.a("t", (Object)this, (long)1042563101991305435L, (long)l11), (long)1183191944433161078L, (long)l11);
                        }
                        catch (n9 n94) {
                            throw m44.a("j", (Object)n94, (long)878915465625375381L, (long)l11);
                        }
                    }
                    try {
                        block25: {
                            try {
                                try {
                                    if (callSite3 != null) break block24;
                                    if (callSite2 != callSite) break block25;
                                }
                                catch (n9 n95) {
                                    throw m44.a("j", (Object)n95, (long)878915465625375381L, (long)l11);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l13;
                                m44.a("u", (Object)m44.a("t", (Object)this, (long)1042563101991305435L, (long)l11), (Object)objectArray, (long)1116205406501408266L, (long)l11);
                                if (callSite3 == null) break block23;
                            }
                            catch (n9 n96) {
                                throw m44.a("j", (Object)n96, (long)878915465625375381L, (long)l11);
                            }
                        }
                        callSite2 = callSite4;
                        callSite = m44.a("t", (Object)m44.a("t", (Object)this, (long)1042563101991305435L, (long)l11), (long)597568264207579670L, (long)l11);
                    }
                    catch (n9 n97) {
                        throw m44.a("j", (Object)n97, (long)878915465625375381L, (long)l11);
                    }
                }
                try {
                    block27: {
                        try {
                            try {
                                if (callSite3 != null) break block26;
                                if (callSite2 != callSite) break block27;
                            }
                            catch (n9 n98) {
                                throw m44.a("j", (Object)n98, (long)878915465625375381L, (long)l11);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l12;
                            m44.a("u", (Object)m44.a("t", (Object)this, (long)1042563101991305435L, (long)l11), (Object)objectArray, (long)981677877924189010L, (long)l11);
                            if (callSite3 == null) break block23;
                        }
                        catch (n9 n99) {
                            throw m44.a("j", (Object)n99, (long)878915465625375381L, (long)l11);
                        }
                    }
                    callSite2 = callSite4;
                    callSite = m44.a("t", (Object)m44.a("t", (Object)this, (long)1042563101991305435L, (long)l11), (long)1621464028703144758L, (long)l11);
                }
                catch (n9 n910) {
                    throw m44.a("j", (Object)n910, (long)878915465625375381L, (long)l11);
                }
            }
            try {
                if (callSite2 == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l10;
                    m44.a("u", (Object)m44.a("t", (Object)this, (long)1042563101991305435L, (long)l11), (Object)objectArray, (long)1271970848445413213L, (long)l11);
                }
            }
            catch (n9 n911) {
                throw m44.a("j", (Object)n911, (long)878915465625375381L, (long)l11);
            }
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

