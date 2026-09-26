/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.mq;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lut
extends lmc {
    final mq p;
    private static final long a = prr.a((long)-4611757425549312093L, (long)-5195636258093770376L, MethodHandles.lookup().lookupClass()).a(5170298755067L);

    public void k(Object[] objectArray) {
        Integer n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x3A1357E7E2F1L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = n;
        objectArray2[0] = l2;
        m44.a("u", (Object)m44.a("t", (Object)((Object)this), (long)2132322260155948849L, (long)l), (Object)objectArray2, (long)103355650939552904L, (long)l);
    }

    public void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        long l2 = l ^ 0x62189BF6EE68L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = (Integer)object;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)2634762821038497227L, (long)l);
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)5876558301295776555L, (long)l), (Object)objectArray2, (long)6119582912316436286L, (long)l);
    }

    lut(mq mq2) {
        this.p = mq2;
    }
}
