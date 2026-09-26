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
    private static final long a = prr.a(-2087194682770244793L, -8742474834785385328L, MethodHandles.lookup().lookupClass()).a(266904031245072L);

    @Override
    public void o(Object[] objectArray) {
        rq rq2 = (rq)objectArray[0];
        ue ue2 = (ue)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0L;
        long l13 = l11 ^ 0xDC8FAA7EAL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l12;
        objectArray2[1] = ue2;
        objectArray2[0] = rq2;
        super.o(objectArray2);
        cq cq2 = (cq)rq2;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = m44.a("r", (Object)this, (long)-4131983131112137644L, (long)l10);
        objectArray3[0] = l13;
        m44.a("s", (Object)cq2, (Object)objectArray3, (long)-2856714211193168808L, (long)l10);
    }

    @Override
    public void t(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("u", (Object)this, (String)string, (long)5369776444011778169L, (long)l10);
    }

    public c8(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x485F9C579960L;
        super(n10, l11);
    }
}

