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
    private static final long b = prr.a(-4304536651935871610L, -6816176531583041930L, MethodHandles.lookup().lookupClass()).a(274004492423602L);

    public cy(int n10, int n11, int n12, short s10) {
        long l10 = ((long)n11 << 32 | (long)n12 << 48 >>> 32 | (long)s10 << 48 >>> 48) ^ b;
        long l11 = l10 ^ 0x558E9EEAD48CL;
        super(n10, l11);
    }

    @Override
    public void o(Object[] objectArray) {
        rq rq2 = (rq)objectArray[0];
        ue ue2 = (ue)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0L;
        long l13 = l11 ^ 0x7805B8B28C2DL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l12;
        objectArray2[1] = ue2;
        objectArray2[0] = rq2;
        super.o(objectArray2);
        d d10 = (d)((Object)rq2);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = m44.a("r", (Object)this, (long)-4048576637368438443L, (long)l10);
        objectArray3[0] = l13;
        m44.a("s", (Object)d10, (Object)objectArray3, (long)-2838901962873148324L, (long)l10);
    }
}

