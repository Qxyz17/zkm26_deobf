/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.v0;
import com.zelix.vd;
import com.zelix.zg;
import java.lang.invoke.MethodHandles;

public class q9
extends vd {
    private static final long a = prr.a((long)2822697058262981009L, (long)7171343483924221884L, MethodHandles.lookup().lookupClass()).a(93945598509831L);

    public q9(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x7A1343EF7E5BL;
        super(l2, n);
    }

    v0 T(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x2C2F7F077EBAL;
        long l4 = l2 ^ 0x2886DF5DCAAAL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        return m44.a("q", (Object)((zg)m44.a("q", (Object)((Object)this), (Object)objectArray2, (long)6189767829024542638L, (long)l)), (Object)objectArray3, (long)5536146150972950165L, (long)l);
    }

    public void X(Object[] objectArray) {
        fu fu2 = (fu)objectArray[0];
        long l = (Long)objectArray[1];
        lqq lqq2 = (lqq)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x6FA91C253D16L;
        long l4 = l2 ^ 0L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = 0;
        v0 v02 = (v0)m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-1931359190408154321L, (long)l);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = lqq2;
        objectArray3[1] = l4;
        objectArray3[0] = this;
        m44.a("r", (Object)v02, (Object)objectArray3, (long)-85929487438166395L, (long)l);
    }
}
