/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.c7;
import com.zelix.cg;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.rq;
import com.zelix.ue;
import java.lang.invoke.MethodHandles;

public class cp
extends c7 {
    private static final long b = prr.a((long)-3088331006422658525L, (long)1248783061200373393L, MethodHandles.lookup().lookupClass()).a(90985716658556L);

    public void o(Object[] objectArray) {
        rq rq2 = (rq)objectArray[0];
        ue ue2 = (ue)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x7B43F99C425EL;
        long l4 = l2 ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l4;
        objectArray2[1] = ue2;
        objectArray2[0] = rq2;
        super.o(objectArray2);
        cg cg2 = (cg)rq2;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = m44.a("r", (Object)((Object)this), (long)-4048576637368438443L, (long)l);
        m44.a("s", (Object)cg2, (Object)objectArray3, (long)-2697129137186016559L, (long)l);
    }

    public cp(int n, long l) {
        long l2 = (l = b ^ l) ^ 0x42B61A9C5883L;
        super(n, l2);
    }
}
