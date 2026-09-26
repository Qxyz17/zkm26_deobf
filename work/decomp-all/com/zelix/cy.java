/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.c7;
import com.zelix.d;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.rq;
import com.zelix.ue;
import java.lang.invoke.MethodHandles;

public class cy
extends c7 {
    private static final long b = prr.a((long)-4304536651935871610L, (long)-6816176531583041930L, MethodHandles.lookup().lookupClass()).a(274004492423602L);

    public cy(int n, int n2, int n3, short s) {
        long l = ((long)n2 << 32 | (long)n3 << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        long l2 = l ^ 0x558E9EEAD48CL;
        super(n, l2);
    }

    public void o(Object[] objectArray) {
        rq rq2 = (rq)objectArray[0];
        ue ue2 = (ue)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0L;
        long l4 = l2 ^ 0x7805B8B28C2DL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l3;
        objectArray2[1] = ue2;
        objectArray2[0] = rq2;
        super.o(objectArray2);
        d d2 = (d)rq2;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = m44.a("r", (Object)((Object)this), (long)-4048576637368438443L, (long)l);
        objectArray3[0] = l4;
        m44.a("s", (Object)d2, (Object)objectArray3, (long)-2838901962873148324L, (long)l);
    }
}
