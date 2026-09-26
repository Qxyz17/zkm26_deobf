/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.mu;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lmf
extends lmc {
    final mu f;
    private static final long a = prr.a((long)1945663035182748026L, (long)1274757864959465163L, MethodHandles.lookup().lookupClass()).a(61142880441152L);

    lmf(mu mu2) {
        this.f = mu2;
    }

    public void m(Object[] objectArray) {
        Integer n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0xC4EDC19027BL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n;
        objectArray2[1] = l2;
        objectArray2[0] = m44.a("v", (Object)((Object)this), (long)-3806665918917984748L, (long)l);
        m44.a("h", (Object)objectArray2, (long)-3609283546253176328L, (long)l);
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)5925699167760164612L, (long)l), (Object)objectArray2, (long)5340913355038057039L, (long)l);
    }

    public void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        long l2 = l ^ 0x1738342B795L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = (Integer)object;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)4390901299972447284L, (long)l);
    }
}
