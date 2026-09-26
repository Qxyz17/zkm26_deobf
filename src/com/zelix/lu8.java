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
    private static final long a = prr.a((long)-82426633613205797L, (long)-8984626020333102169L, MethodHandles.lookup().lookupClass()).a(77467369602286L);

    lu8(wf wf2) {
        this.t = wf2;
    }

    public void H(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0x23A587B42B29L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (Integer)object2;
        objectArray2[1] = l2;
        objectArray2[0] = (s4)object;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)5709770760711687065L, (long)l);
    }

    public void K(Object[] objectArray) {
        block3: {
            s4 s42;
            long l;
            long l2;
            block2: {
                s4 s43 = (s4)objectArray[0];
                l2 = (Long)objectArray[1];
                Integer n = (Integer)objectArray[2];
                l = (l2 = a ^ l2) ^ 0x43E1F8DC0247L;
                CallSite callSite = m44.a("n", (long)-8889158065016737197L, (long)l2);
                try {
                    s42 = s43;
                    if (callSite != null) break block2;
                    if (s42 == null) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)((Object)n92), (long)-8744385060361547269L, (long)l2);
                }
                s42 = s43;
            }
            s4 s44 = s42;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l;
            m44.a("q", (Object)m44.a("p", (Object)m44.a("p", (Object)((Object)this), (long)-9196266048412970441L, (long)l2), (long)-6918496329720827991L, (long)l2), (Object)m44.a("q", (Object)s44, (Object)objectArray2, (long)-9041600115003425814L, (long)l2), (long)-9089994667061455094L, (long)l2);
            m44.a("q", (Object)m44.a("p", (Object)m44.a("p", (Object)((Object)this), (long)-9196266048412970441L, (long)l2), (long)-6918496329720827991L, (long)l2), (int)0, (long)-9146172951841718953L, (long)l2);
        }
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
