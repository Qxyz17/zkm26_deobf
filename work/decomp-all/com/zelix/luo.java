/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.mq;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class luo
extends lmc {
    final mq q;
    private static final long a = prr.a((long)-3641031019740209476L, (long)1568595992736866247L, MethodHandles.lookup().lookupClass()).a(44488963747123L);

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)6249705028908683176L, (long)l), (Object)objectArray2, (long)6119582912316436286L, (long)l);
    }

    public void n(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Integer n = (Integer)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x52528013A4C6L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n;
        objectArray2[1] = l2;
        objectArray2[0] = m44.a("q", (Object)((Object)this), (long)-4727652910934595721L, (long)l);
        m44.a("o", (Object)objectArray2, (long)-4695784869592423590L, (long)l);
    }

    luo(mq mq2) {
        this.q = mq2;
    }

    public void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        long l2 = l ^ 0x779E16FE68FFL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = (Integer)object;
        objectArray2[0] = l2;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)4468999205302872798L, (long)l);
    }
}
