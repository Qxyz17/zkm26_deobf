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
    private static final long a = prr.a((long)9183906564244202386L, (long)9120126049505485226L, MethodHandles.lookup().lookupClass()).a(228069989350210L);

    lm0(mu mu2) {
        this.F = mu2;
    }

    public void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        long l2 = l ^ 0xA32CCA9AEF6L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = (Integer)object;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)4539113893829929332L, (long)l);
    }

    public void a(Object[] objectArray) {
        Integer n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x29CA43C7405DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = n;
        objectArray2[0] = l2;
        m44.a("q", (Object)m44.a("p", (Object)((Object)this), (long)-5002374897192129794L, (long)l), (Object)objectArray2, (long)-4921101746077736987L, (long)l);
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)6063481440085197896L, (long)l), (Object)objectArray2, (long)5340913355038057039L, (long)l);
    }
}
