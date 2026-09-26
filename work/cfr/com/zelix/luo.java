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
    private static final long a = prr.a(-3641031019740209476L, 1568595992736866247L, MethodHandles.lookup().lookupClass()).a(44488963747123L);

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)6249705028908683176L, (long)l10), (Object)objectArray2, (long)6119582912316436286L, (long)l10);
    }

    public void n(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Integer n10 = (Integer)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x52528013A4C6L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n10;
        objectArray2[1] = l11;
        objectArray2[0] = m44.a("q", (Object)this, (long)-4727652910934595721L, (long)l10);
        m44.a("o", (Object)objectArray2, (long)-4695784869592423590L, (long)l10);
    }

    luo(mq mq2) {
        this.q = mq2;
    }

    @Override
    public void h(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        long l11 = l10 ^ 0x779E16FE68FFL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = (Integer)object;
        objectArray2[0] = l11;
        m44.a("u", (Object)this, (Object)objectArray2, (long)4468999205302872798L, (long)l10);
    }
}

