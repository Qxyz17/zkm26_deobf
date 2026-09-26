/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.tr;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class ej
implements ActionListener {
    final tr c;
    private static final long a = prr.a(636559346244680488L, 1368376592992976736L, MethodHandles.lookup().lookupClass()).a(19711267727361L);

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block17: {
            CallSite callSite;
            CallSite callSite2;
            long l10;
            long l11;
            block18: {
                CallSite callSite3;
                CallSite callSite4;
                long l12;
                block15: {
                    long l13 = l11 = a ^ 0x77CEB9720FF3L;
                    long l14 = l13 ^ 0x81F9D5EE545L;
                    l12 = l13 ^ 0x3652B49E5F9AL;
                    l10 = l13 ^ 0x655A9F09D12AL;
                    callSite4 = m44.a("w", (Object)actionEvent, (long)-84062235909240127L, (long)l11);
                    callSite3 = m44.a("h", (long)-1842689231663427427L, (long)l11);
                    try {
                        block16: {
                            try {
                                try {
                                    callSite2 = callSite4;
                                    callSite = m44.a("v", (Object)m44.a("v", (Object)this, (long)-2152880444247227227L, (long)l11), (long)-56164821243001875L, (long)l11);
                                    if (callSite3 != null) break block15;
                                    if (callSite2 != callSite) break block16;
                                }
                                catch (n9 n92) {
                                    throw m44.a("h", (Object)n92, (long)-2266712041036943446L, (long)l11);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l14;
                                m44.a("w", (Object)m44.a("v", (Object)this, (long)-2152880444247227227L, (long)l11), (Object)objectArray, (long)-214358962172206958L, (long)l11);
                                if (callSite3 == null) break block17;
                            }
                            catch (n9 n93) {
                                throw m44.a("h", (Object)n93, (long)-2266712041036943446L, (long)l11);
                            }
                        }
                        callSite2 = callSite4;
                        callSite = m44.a("v", (Object)m44.a("v", (Object)this, (long)-2152880444247227227L, (long)l11), (long)-2001671822602447260L, (long)l11);
                    }
                    catch (n9 n94) {
                        throw m44.a("h", (Object)n94, (long)-2266712041036943446L, (long)l11);
                    }
                }
                try {
                    block19: {
                        try {
                            try {
                                if (callSite3 != null) break block18;
                                if (callSite2 != callSite) break block19;
                            }
                            catch (n9 n95) {
                                throw m44.a("h", (Object)n95, (long)-2266712041036943446L, (long)l11);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l12;
                            m44.a("w", (Object)m44.a("v", (Object)this, (long)-2152880444247227227L, (long)l11), (Object)objectArray, (long)-2166862632504836320L, (long)l11);
                            if (callSite3 == null) break block17;
                        }
                        catch (n9 n96) {
                            throw m44.a("h", (Object)n96, (long)-2266712041036943446L, (long)l11);
                        }
                    }
                    callSite2 = callSite4;
                    callSite = m44.a("v", (Object)m44.a("v", (Object)this, (long)-2152880444247227227L, (long)l11), (long)-364008924584585404L, (long)l11);
                }
                catch (n9 n97) {
                    throw m44.a("h", (Object)n97, (long)-2266712041036943446L, (long)l11);
                }
            }
            try {
                if (callSite2 == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l10;
                    m44.a("w", (Object)m44.a("v", (Object)this, (long)-2152880444247227227L, (long)l11), (Object)objectArray, (long)-1989503292931939858L, (long)l11);
                }
            }
            catch (n9 n98) {
                throw m44.a("h", (Object)n98, (long)-2266712041036943446L, (long)l11);
            }
        }
    }

    ej(tr tr2) {
        this.c = tr2;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

