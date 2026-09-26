/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.mq;
import com.zelix.prr;
import com.zelix.s4;
import java.lang.invoke.MethodHandles;

public class luu
extends lmc {
    final mq D;
    private static final long a = prr.a((long)4657848220593981316L, (long)-5674497659069199005L, MethodHandles.lookup().lookupClass()).a(9867832532331L);

    public void i(Object[] objectArray) {
        s4 s42 = (s4)objectArray[0];
        long l = (Long)objectArray[1];
        Integer n = (Integer)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x75E36AA224B9L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = n;
        objectArray2[2] = s42;
        objectArray2[1] = m44.a("u", (Object)((Object)this), (long)-6366433560020082915L, (long)l);
        objectArray2[0] = l2;
        m44.a("k", (Object)objectArray2, (long)-6352982248914390185L, (long)l);
    }

    luu(mq mq2) {
        this.D = mq2;
    }

    public void H(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0x4901296474B2L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (Integer)object2;
        objectArray2[1] = l2;
        objectArray2[0] = (s4)object;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)5390141618516228226L, (long)l);
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)5329596624942428494L, (long)l), (Object)objectArray2, (long)6119582912316436286L, (long)l);
    }
}
