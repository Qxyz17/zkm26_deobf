/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.ti;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class d9
implements ActionListener {
    final ti J;
    private static final long a = prr.a((long)4524052522331575L, (long)-2730916698425483755L, MethodHandles.lookup().lookupClass()).a(83193632290581L);

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block17: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            long l2;
            block18: {
                CallSite callSite3;
                CallSite callSite4;
                long l3;
                block15: {
                    long l4 = l2 = a ^ 0x1B222AC09CF1L;
                    l3 = l4 ^ 0x220E6AF89861L;
                    l = l4 ^ 0x6627D4499658L;
                    long l5 = l4 ^ 0x3A425340EF17L;
                    callSite4 = m44.a("u", (Object)actionEvent, (long)4451618148043917779L, (long)l2);
                    callSite3 = m44.a("j", (long)2702011484473283471L, (long)l2);
                    try {
                        block16: {
                            try {
                                try {
                                    callSite2 = callSite4;
                                    callSite = m44.a("t", (Object)m44.a("t", (Object)this, (long)4102314608976290708L, (long)l2), (long)2413789493588579606L, (long)l2);
                                    if (callSite3 != null) break block15;
                                    if (callSite2 != callSite) break block16;
                                }
                                catch (n9 n92) {
                                    throw m44.a("j", (Object)((Object)n92), (long)4159797983039762208L, (long)l2);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l5;
                                m44.a("u", (Object)m44.a("t", (Object)this, (long)4102314608976290708L, (long)l2), (Object)objectArray, (long)2441997855238877412L, (long)l2);
                                if (callSite3 == null) break block17;
                            }
                            catch (n9 n93) {
                                throw m44.a("j", (Object)((Object)n93), (long)4159797983039762208L, (long)l2);
                            }
                        }
                        callSite2 = callSite4;
                        callSite = m44.a("t", (Object)m44.a("t", (Object)this, (long)4102314608976290708L, (long)l2), (long)4076655395388793550L, (long)l2);
                    }
                    catch (n9 n94) {
                        throw m44.a("j", (Object)((Object)n94), (long)4159797983039762208L, (long)l2);
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
                                throw m44.a("j", (Object)((Object)n95), (long)4159797983039762208L, (long)l2);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l3;
                            m44.a("u", (Object)m44.a("t", (Object)this, (long)4102314608976290708L, (long)l2), (Object)objectArray, (long)4457505961853635287L, (long)l2);
                            if (callSite3 == null) break block17;
                        }
                        catch (n9 n96) {
                            throw m44.a("j", (Object)((Object)n96), (long)4159797983039762208L, (long)l2);
                        }
                    }
                    callSite2 = callSite4;
                    callSite = m44.a("t", (Object)m44.a("t", (Object)this, (long)4102314608976290708L, (long)l2), (long)4611528213913623100L, (long)l2);
                }
                catch (n9 n97) {
                    throw m44.a("j", (Object)((Object)n97), (long)4159797983039762208L, (long)l2);
                }
            }
            try {
                if (callSite2 == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l;
                    m44.a("u", (Object)m44.a("t", (Object)this, (long)4102314608976290708L, (long)l2), (Object)objectArray, (long)4103480966002900854L, (long)l2);
                }
            }
            catch (n9 n98) {
                throw m44.a("j", (Object)((Object)n98), (long)4159797983039762208L, (long)l2);
            }
        }
    }

    d9(ti ti2) {
        this.J = ti2;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
