/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.t1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lk8
implements ActionListener {
    final t1 X;
    private static final long a = prr.a(-5079138002312939377L, -3830199927987123006L, MethodHandles.lookup().lookupClass()).a(29102034832663L);

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
                        long l14 = l11 = a ^ 0x44027B19BE2EL;
                        l13 = l14 ^ 0x7C39628F00D8L;
                        l12 = l14 ^ 0x42744B4FBA07L;
                        long l15 = l14 ^ 0x770B50078B23L;
                        l10 = l14 ^ 0x117C60D834B7L;
                        callSite4 = m44.a("r", (Object)actionEvent, (long)1965871752576446300L, (long)l11);
                        callSite3 = m44.a("m", (long)283735361569584384L, (long)l11);
                        try {
                            block22: {
                                try {
                                    try {
                                        callSite2 = callSite4;
                                        callSite = m44.a("s", (Object)m44.a("s", (Object)this, (long)2188311864287530918L, (long)l11), (long)316642747689522530L, (long)l11);
                                        if (callSite3 != null) break block21;
                                        if (callSite2 != callSite) break block22;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("m", (Object)n92, (long)1816606204379504525L, (long)l11);
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l15;
                                    m44.a("r", (Object)m44.a("s", (Object)this, (long)2188311864287530918L, (long)l11), (Object)objectArray, (long)384091535216589609L, (long)l11);
                                    if (callSite3 == null) break block23;
                                }
                                catch (n9 n93) {
                                    throw m44.a("m", (Object)n93, (long)1816606204379504525L, (long)l11);
                                }
                            }
                            callSite2 = callSite4;
                            callSite = m44.a("s", (Object)m44.a("s", (Object)this, (long)2188311864287530918L, (long)l11), (long)1919943300700300912L, (long)l11);
                        }
                        catch (n9 n94) {
                            throw m44.a("m", (Object)n94, (long)1816606204379504525L, (long)l11);
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
                                    throw m44.a("m", (Object)n95, (long)1816606204379504525L, (long)l11);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l13;
                                m44.a("r", (Object)m44.a("s", (Object)this, (long)2188311864287530918L, (long)l11), (Object)objectArray, (long)1773016986324567311L, (long)l11);
                                if (callSite3 == null) break block23;
                            }
                            catch (n9 n96) {
                                throw m44.a("m", (Object)n96, (long)1816606204379504525L, (long)l11);
                            }
                        }
                        callSite2 = callSite4;
                        callSite = m44.a("s", (Object)m44.a("s", (Object)this, (long)2188311864287530918L, (long)l11), (long)118736483334927353L, (long)l11);
                    }
                    catch (n9 n97) {
                        throw m44.a("m", (Object)n97, (long)1816606204379504525L, (long)l11);
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
                                throw m44.a("m", (Object)n98, (long)1816606204379504525L, (long)l11);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l12;
                            m44.a("r", (Object)m44.a("s", (Object)this, (long)2188311864287530918L, (long)l11), (Object)objectArray, (long)319955463194729149L, (long)l11);
                            if (callSite3 == null) break block23;
                        }
                        catch (n9 n99) {
                            throw m44.a("m", (Object)n99, (long)1816606204379504525L, (long)l11);
                        }
                    }
                    callSite2 = callSite4;
                    callSite = m44.a("s", (Object)m44.a("s", (Object)this, (long)2188311864287530918L, (long)l11), (long)2265226951784510169L, (long)l11);
                }
                catch (n9 n910) {
                    throw m44.a("m", (Object)n910, (long)1816606204379504525L, (long)l11);
                }
            }
            try {
                if (callSite2 == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l10;
                    m44.a("r", (Object)m44.a("s", (Object)this, (long)2188311864287530918L, (long)l11), (Object)objectArray, (long)143738524787770483L, (long)l11);
                }
            }
            catch (n9 n911) {
                throw m44.a("m", (Object)n911, (long)1816606204379504525L, (long)l11);
            }
        }
    }

    lk8(t1 t12) {
        this.X = t12;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

