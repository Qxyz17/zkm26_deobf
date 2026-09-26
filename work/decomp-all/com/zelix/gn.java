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

public class gn
implements Comparator {
    final bc t;
    private static final long a = prr.a((long)-3156991020282990691L, (long)7274669752395031333L, MethodHandles.lookup().lookupClass()).a(215614727243139L);

    gn(bc bc2) {
        this.t = bc2;
    }

    public int m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        lq0 lq02 = (lq0)objectArray[1];
        lq0 lq03 = (lq0)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x53CE948AC9D3L;
        return ((lk9)lq02.S()).C(l2, (lk9)lq03.S());
    }

    public int compare(Object object, Object object2) {
        long l = a ^ 0x765BEEA603C5L;
        long l2 = l ^ 0x8056154FB28L;
        Object[] objectArray = new Object[3];
        objectArray[2] = (lq0)object2;
        objectArray[1] = (lq0)object;
        objectArray[0] = l2;
        return (int)m44.a("p", (Object)this, (Object)objectArray, (long)-8383683904356909017L, (long)l);
    }
}
