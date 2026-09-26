/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.mu;
import com.zelix.prr;
import com.zelix.s4;
import java.lang.invoke.MethodHandles;

public class lmr
extends lmc {
    final mu S;
    private static final long a = prr.a((long)-8476432844370190043L, (long)-2405491086460055701L, MethodHandles.lookup().lookupClass()).a(139132137233991L);

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)5558726218644576233L, (long)l), (Object)objectArray2, (long)5340913355038057039L, (long)l);
    }

    public void H(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0x6F91B78FEB5AL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (Integer)object2;
        objectArray2[1] = (s4)object;
        objectArray2[0] = l2;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)5783116163003388158L, (long)l);
    }

    lmr(mu mu2) {
        this.S = mu2;
    }

    public void m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        s4 s42 = (s4)objectArray[1];
        Integer n = (Integer)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x6DF35776A0B7L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = n;
        objectArray2[1] = s42;
        objectArray2[0] = m44.a("w", (Object)((Object)this), (long)-4632526987772025480L, (long)l);
        m44.a("i", (Object)objectArray2, (long)-5047060702028665182L, (long)l);
    }
}
