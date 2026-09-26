/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.mu;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lm0
extends lmc {
    final mu F;
    private static final long a = prr.a(9183906564244202386L, 9120126049505485226L, MethodHandles.lookup().lookupClass()).a(228069989350210L);

    lm0(mu mu2) {
        this.F = mu2;
    }

    @Override
    public void h(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        long l11 = l10 ^ 0xA32CCA9AEF6L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = (Integer)object;
        m44.a("u", (Object)this, (Object)objectArray2, (long)4539113893829929332L, (long)l10);
    }

    public void a(Object[] objectArray) {
        Integer n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x29CA43C7405DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = n10;
        objectArray2[0] = l11;
        m44.a("q", (Object)m44.a("p", (Object)this, (long)-5002374897192129794L, (long)l10), (Object)objectArray2, (long)-4921101746077736987L, (long)l10);
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)6063481440085197896L, (long)l10), (Object)objectArray2, (long)5340913355038057039L, (long)l10);
    }
}

