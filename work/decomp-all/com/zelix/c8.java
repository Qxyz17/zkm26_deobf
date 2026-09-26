/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cq;
import com.zelix.d;
import com.zelix.iz;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.rq;
import com.zelix.ue;
import java.lang.invoke.MethodHandles;

public class c8
extends iz
implements d {
    private String U;
    private static final long a = prr.a((long)-2087194682770244793L, (long)-8742474834785385328L, MethodHandles.lookup().lookupClass()).a(266904031245072L);

    public void o(Object[] objectArray) {
        rq rq2 = (rq)objectArray[0];
        ue ue2 = (ue)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0L;
        long l4 = l2 ^ 0xDC8FAA7EAL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l3;
        objectArray2[1] = ue2;
        objectArray2[0] = rq2;
        super.o(objectArray2);
        cq cq2 = (cq)rq2;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = m44.a("r", (Object)((Object)this), (long)-4131983131112137644L, (long)l);
        objectArray3[0] = l4;
        m44.a("s", (Object)cq2, (Object)objectArray3, (long)-2856714211193168808L, (long)l);
    }

    public void t(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("u", (Object)((Object)this), (String)string, (long)5369776444011778169L, (long)l);
    }

    public c8(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x485F9C579960L;
        super(n, l2);
    }
}
