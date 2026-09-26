/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.s4;
import com.zelix.wf;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lu8
extends lmc {
    final wf t;
    private static final long a = prr.a(-82426633613205797L, -8984626020333102169L, MethodHandles.lookup().lookupClass()).a(77467369602286L);

    lu8(wf wf2) {
        this.t = wf2;
    }

    @Override
    public void H(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0x23A587B42B29L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (Integer)object2;
        objectArray2[1] = l11;
        objectArray2[0] = (s4)object;
        m44.a("u", (Object)this, (Object)objectArray2, (long)5709770760711687065L, (long)l10);
    }

    public void K(Object[] objectArray) {
        block3: {
            s4 s42;
            long l10;
            long l11;
            block2: {
                s4 s43 = (s4)objectArray[0];
                l11 = (Long)objectArray[1];
                Integer n10 = (Integer)objectArray[2];
                l10 = (l11 = a ^ l11) ^ 0x43E1F8DC0247L;
                CallSite callSite = m44.a("n", (long)-8889158065016737197L, (long)l11);
                try {
                    s42 = s43;
                    if (callSite != null) break block2;
                    if (s42 == null) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)n92, (long)-8744385060361547269L, (long)l11);
                }
                s42 = s43;
            }
            s4 s44 = s42;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l10;
            m44.a("q", (Object)m44.a("p", (Object)m44.a("p", (Object)this, (long)-9196266048412970441L, (long)l11), (long)-6918496329720827991L, (long)l11), (Object)m44.a("q", (Object)s44, (Object)objectArray2, (long)-9041600115003425814L, (long)l11), (long)-9089994667061455094L, (long)l11);
            m44.a("q", (Object)m44.a("p", (Object)m44.a("p", (Object)this, (long)-9196266048412970441L, (long)l11), (long)-6918496329720827991L, (long)l11), (int)0, (long)-9146172951841718953L, (long)l11);
        }
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

