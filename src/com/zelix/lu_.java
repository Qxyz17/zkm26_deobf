/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.mq;
import com.zelix.prr;
import com.zelix.sp;
import java.lang.invoke.MethodHandles;

public class lu_
extends lmc {
    final mq T;
    private static final long a = prr.a((long)3599723863864699580L, (long)-4012264780356104741L, MethodHandles.lookup().lookupClass()).a(151989982123908L);

    public void n(Object[] objectArray) {
        sp sp2 = (sp)objectArray[0];
        long l = (Long)objectArray[1];
        Integer n = (Integer)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x9EFAE946A86L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = n;
        objectArray2[2] = l2;
        objectArray2[1] = sp2;
        objectArray2[0] = m44.a("r", (Object)((Object)this), (long)-1802989817090074433L, (long)l);
        m44.a("l", (Object)objectArray2, (long)-523351896342387643L, (long)l);
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)5189839682573416003L, (long)l), (Object)objectArray2, (long)6119582912316436286L, (long)l);
    }

    lu_(mq mq2) {
        this.T = mq2;
    }

    public void H(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0x7269CC030E7EL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (Integer)object2;
        objectArray2[1] = l2;
        objectArray2[0] = (sp)object;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)5945174485141298058L, (long)l);
    }
}
