/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.mq;
import com.zelix.prr;
import java.io.File;
import java.lang.invoke.MethodHandles;

public class luw
extends lmc {
    final mq b;
    private static final long a = prr.a((long)798525078822137553L, (long)4602856756537508554L, MethodHandles.lookup().lookupClass()).a(205017049970323L);

    public void H(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0x762754A9130BL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = (Integer)object2;
        objectArray2[0] = (File)object;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)5331736503462125991L, (long)l);
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)6182521569287923902L, (long)l), (Object)objectArray2, (long)6119582912316436286L, (long)l);
    }

    luw(mq mq2) {
        this.b = mq2;
    }

    public void Y(Object[] objectArray) {
        File file = (File)objectArray[0];
        Integer n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x2ADC1E958CD0L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = n;
        objectArray2[1] = file;
        objectArray2[0] = m44.a("t", (Object)((Object)this), (long)-8926536951177266836L, (long)l);
        m44.a("j", (Object)objectArray2, (long)-8899701633847884180L, (long)l);
    }
}
