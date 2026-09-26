/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.bc;
import com.zelix.lk9;
import com.zelix.lq0;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class ep
implements Comparator {
    final bc A;
    private static final long a = prr.a((long)276097434895480671L, (long)1980773478787815490L, MethodHandles.lookup().lookupClass()).a(275376016820007L);

    public int N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        lq0 lq02 = (lq0)objectArray[1];
        lq0 lq03 = (lq0)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x1557C396D8E5L;
        return ((lk9)lq02.S()).C(l2, (lk9)lq03.S());
    }

    public int compare(Object object, Object object2) {
        long l = a ^ 0x542A271A9C6L;
        long l2 = l ^ 0x3D857A9F401DL;
        Object[] objectArray = new Object[3];
        objectArray[2] = (lq0)object2;
        objectArray[1] = (lq0)object;
        objectArray[0] = l2;
        return (int)m44.a("s", (Object)this, (Object)objectArray, (long)-3024292341831374252L, (long)l);
    }

    ep(bc bc2) {
        this.A = bc2;
    }
}
