/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.mu;
import com.zelix.prr;
import java.io.File;
import java.lang.invoke.MethodHandles;

public class lmh
extends lmc {
    final mu n;
    private static final long a = prr.a(-2452177339376889275L, 7855735340504086049L, MethodHandles.lookup().lookupClass()).a(86624970773699L);

    lmh(mu mu2) {
        this.n = mu2;
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)5707136757934450706L, (long)l10), (Object)objectArray2, (long)5340913355038057039L, (long)l10);
    }

    public void Y(Object[] objectArray) {
        File file = (File)objectArray[0];
        Integer n10 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x6E543C17AFBBL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = n10;
        objectArray2[2] = file;
        objectArray2[1] = m44.a("r", (Object)this, (long)-4494601357803952450L, (long)l10);
        objectArray2[0] = l11;
        m44.a("l", (Object)objectArray2, (long)-2555507446512214919L, (long)l10);
    }

    @Override
    public void H(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0x5A88810C8C4FL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l11;
        objectArray2[1] = (Integer)object2;
        objectArray2[0] = (File)object;
        m44.a("u", (Object)this, (Object)objectArray2, (long)5387540090137692655L, (long)l10);
    }
}

