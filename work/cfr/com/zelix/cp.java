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
    private static final long b = prr.a(-3088331006422658525L, 1248783061200373393L, MethodHandles.lookup().lookupClass()).a(90985716658556L);

    @Override
    public void o(Object[] objectArray) {
        rq rq2 = (rq)objectArray[0];
        ue ue2 = (ue)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0x7B43F99C425EL;
        long l13 = l11 ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l13;
        objectArray2[1] = ue2;
        objectArray2[0] = rq2;
        super.o(objectArray2);
        cg cg2 = (cg)rq2;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l12;
        objectArray3[0] = m44.a("r", (Object)this, (long)-4048576637368438443L, (long)l10);
        m44.a("s", (Object)cg2, (Object)objectArray3, (long)-2697129137186016559L, (long)l10);
    }

    public cp(int n10, long l10) {
        long l11 = (l10 = b ^ l10) ^ 0x42B61A9C5883L;
        super(n10, l11);
    }
}

