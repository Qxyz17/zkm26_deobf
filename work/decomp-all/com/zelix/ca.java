/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.iz;
import com.zelix.prr;
import com.zelix.rq;
import com.zelix.ue;
import java.lang.invoke.MethodHandles;

public class ca
extends iz {
    private static final long a = prr.a((long)3642073592834246875L, (long)2141499011786223545L, MethodHandles.lookup().lookupClass()).a(209765440173274L);

    public void o(Object[] objectArray) {
        rq rq2 = (rq)objectArray[0];
        ue ue2 = (ue)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = ue2;
        objectArray2[0] = rq2;
        super.o(objectArray2);
    }

    public ca(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x6711B5F7E903L;
        super(n, l2);
    }
}
