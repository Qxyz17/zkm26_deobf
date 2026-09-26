/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.mu;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lmz
extends lmc {
    final mu c;
    private static final long a = prr.a(-5347615437555011656L, 7690112349808975805L, MethodHandles.lookup().lookupClass()).a(210338544367748L);

    public void e(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Integer n10 = (Integer)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x379B1D9AB706L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l11;
        objectArray2[1] = n10;
        objectArray2[0] = m44.a("s", (Object)this, (long)-413627390007833316L, (long)l10);
        m44.a("m", (Object)objectArray2, (long)-1738331971557314074L, (long)l10);
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)6091104326755263449L, (long)l10), (Object)objectArray2, (long)5340913355038057039L, (long)l10);
    }

    lmz(mu mu2) {
        this.c = mu2;
    }

    @Override
    public void h(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        long l11 = l10 ^ 0x2EA131BE610DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = (Integer)object;
        objectArray2[0] = l11;
        m44.a("u", (Object)this, (Object)objectArray2, (long)2463693048458191387L, (long)l10);
    }
}

