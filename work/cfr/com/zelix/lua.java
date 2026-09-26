/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.mq;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lua
extends lmc {
    final mq b;
    private static final long a = prr.a(6009783529757275280L, 821342915707164982L, MethodHandles.lookup().lookupClass()).a(215222413336914L);

    lua(mq mq2) {
        this.b = mq2;
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)5380621204000011501L, (long)l10), (Object)objectArray2, (long)6119582912316436286L, (long)l10);
    }

    public void k(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Integer n10 = (Integer)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x622AE92A403BL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n10;
        objectArray2[1] = l11;
        objectArray2[0] = m44.a("w", (Object)this, (long)921715871273366156L, (long)l10);
        m44.a("i", (Object)objectArray2, (long)1629383860919865870L, (long)l10);
    }

    @Override
    public void h(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        long l11 = l10 ^ 0x7196A2802756L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = (Integer)object;
        objectArray2[0] = l11;
        m44.a("u", (Object)this, (Object)objectArray2, (long)2410282163807887908L, (long)l10);
    }
}

