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
    private static final long a = prr.a((long)-5347615437555011656L, (long)7690112349808975805L, MethodHandles.lookup().lookupClass()).a(210338544367748L);

    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Integer n = (Integer)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x379B1D9AB706L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = n;
        objectArray2[0] = m44.a("s", (Object)((Object)this), (long)-413627390007833316L, (long)l);
        m44.a("m", (Object)objectArray2, (long)-1738331971557314074L, (long)l);
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)6091104326755263449L, (long)l), (Object)objectArray2, (long)5340913355038057039L, (long)l);
    }

    lmz(mu mu2) {
        this.c = mu2;
    }

    public void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        long l2 = l ^ 0x2EA131BE610DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = (Integer)object;
        objectArray2[0] = l2;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)2463693048458191387L, (long)l);
    }
}
