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

public class uu
implements Comparator {
    final bc G;
    private static final long a = prr.a((long)332907350175149187L, (long)123023642404110278L, MethodHandles.lookup().lookupClass()).a(14269285282119L);

    public int compare(Object object, Object object2) {
        long l = a ^ 0x4057A867532L;
        long l2 = l ^ 0x4ABC2460A925L;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 48);
        int n3 = (int)(l2 << 48 >>> 48);
        Object[] objectArray = new Object[5];
        objectArray[4] = (lq0)object2;
        objectArray[3] = (int)((short)n3);
        objectArray[2] = (lq0)object;
        objectArray[1] = n2;
        objectArray[0] = n;
        return (int)m44.a("t", (Object)this, (Object)objectArray, (long)-789595332238484874L, (long)l);
    }

    public int I(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        lq0 lq02 = (lq0)objectArray[2];
        int n3 = (Integer)objectArray[3];
        lq0 lq03 = (lq0)objectArray[4];
        long l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x6329459EED29L;
        return ((lk9)lq02.S()).C(l2, (lk9)lq03.S());
    }

    uu(bc bc2) {
        this.G = bc2;
    }
}
