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
    private static final long a = prr.a((long)6009783529757275280L, (long)821342915707164982L, MethodHandles.lookup().lookupClass()).a(215222413336914L);

    lua(mq mq2) {
        this.b = mq2;
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)5380621204000011501L, (long)l), (Object)objectArray2, (long)6119582912316436286L, (long)l);
    }

    public void k(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Integer n = (Integer)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x622AE92A403BL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n;
        objectArray2[1] = l2;
        objectArray2[0] = m44.a("w", (Object)((Object)this), (long)921715871273366156L, (long)l);
        m44.a("i", (Object)objectArray2, (long)1629383860919865870L, (long)l);
    }

    public void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        long l2 = l ^ 0x7196A2802756L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = (Integer)object;
        objectArray2[0] = l2;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)2410282163807887908L, (long)l);
    }
}
