/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.mq;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lum
extends lmc {
    final mq S;
    private static final long a = prr.a((long)7337360744699191812L, (long)4384614838314559708L, MethodHandles.lookup().lookupClass()).a(95965774335141L);

    lum(mq mq2) {
        this.S = mq2;
    }

    public void D(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Integer n = (Integer)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x724E5796E332L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n;
        objectArray2[1] = m44.a("p", (Object)((Object)this), (long)7135150432645142406L, (long)l);
        objectArray2[0] = l2;
        m44.a("n", (Object)objectArray2, (long)7136872404725396206L, (long)l);
    }

    public void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        long l2 = l ^ 0x70309F85E668L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = (Integer)object;
        objectArray2[0] = l2;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)4502998049304007949L, (long)l);
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)5231811826106629144L, (long)l), (Object)objectArray2, (long)6119582912316436286L, (long)l);
    }
}
