/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cg;
import com.zelix.iz;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.rq;
import com.zelix.ue;
import java.lang.invoke.MethodHandles;

public class i2
extends iz {
    private static final long a = prr.a((long)7074961020143484120L, (long)6607090939332524360L, MethodHandles.lookup().lookupClass()).a(124083727804523L);

    public void o(Object[] objectArray) {
        rq rq2 = (rq)objectArray[0];
        ue ue2 = (ue)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0L;
        long l4 = l2 ^ 0x522E5424990EL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l3;
        objectArray2[1] = ue2;
        objectArray2[0] = rq2;
        super.o(objectArray2);
        cg cg2 = (cg)rq2;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        m44.a("s", (Object)cg2, (Object)objectArray3, (long)-4348826561754627138L, (long)l);
    }

    public i2(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x153BDC04FB85L;
        super(n, l2);
    }
}
