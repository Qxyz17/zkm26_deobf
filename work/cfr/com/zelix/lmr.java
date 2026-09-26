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
    private static final long a = prr.a(-8476432844370190043L, -2405491086460055701L, MethodHandles.lookup().lookupClass()).a(139132137233991L);

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)5558726218644576233L, (long)l10), (Object)objectArray2, (long)5340913355038057039L, (long)l10);
    }

    @Override
    public void H(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0x6F91B78FEB5AL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (Integer)object2;
        objectArray2[1] = (s4)object;
        objectArray2[0] = l11;
        m44.a("u", (Object)this, (Object)objectArray2, (long)5783116163003388158L, (long)l10);
    }

    lmr(mu mu2) {
        this.S = mu2;
    }

    public void m(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        s4 s42 = (s4)objectArray[1];
        Integer n10 = (Integer)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x6DF35776A0B7L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l11;
        objectArray2[2] = n10;
        objectArray2[1] = s42;
        objectArray2[0] = m44.a("w", (Object)this, (long)-4632526987772025480L, (long)l10);
        m44.a("i", (Object)objectArray2, (long)-5047060702028665182L, (long)l10);
    }
}

