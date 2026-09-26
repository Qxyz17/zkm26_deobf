/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.co;
import com.zelix.d;
import com.zelix.iz;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.rq;
import com.zelix.ue;
import java.lang.invoke.MethodHandles;

public class c_
extends iz
implements d {
    private String a;
    private static final long b = prr.a(-2746755074270193392L, -8154658083723379029L, MethodHandles.lookup().lookupClass()).a(224132438794278L);

    @Override
    public void o(Object[] objectArray) {
        rq rq2 = (rq)objectArray[0];
        ue ue2 = (ue)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0x2223FC2B722DL;
        long l13 = l11 ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l13;
        objectArray2[1] = ue2;
        objectArray2[0] = rq2;
        super.o(objectArray2);
        co co2 = (co)rq2;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l12;
        objectArray3[0] = m44.a("r", (Object)this, (long)-4200853823424499911L, (long)l10);
        m44.a("s", (Object)co2, (Object)objectArray3, (long)-4189590524115729973L, (long)l10);
    }

    public c_(char c10, int n10, int n11, int n12) {
        long l10 = ((long)c10 << 48 | (long)n11 << 32 >>> 16 | (long)n12 << 48 >>> 48) ^ b;
        long l11 = l10 ^ 0x438E96727E5FL;
        super(n10, l11);
    }

    @Override
    public void t(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("u", (Object)this, (String)string, (long)5304934361228010260L, (long)l10);
    }
}

