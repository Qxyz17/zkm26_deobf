/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.ltb;
import com.zelix.lwl;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class ltl
extends l7t {
    private static final long a = prr.a((long)-1780933815867403218L, (long)6345003572001360395L, MethodHandles.lookup().lookupClass()).a(14186201225613L);

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x3C212F01A890L;
        long l4 = l2 ^ 0L;
        lwl lwl2 = (lwl)this.V(0);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l4;
        objectArray2[1] = lqu2;
        objectArray2[0] = this;
        m44.a("w", (Object)lwl2, (Object)objectArray2, (long)-6393942317858302839L, (long)l);
        CallSite callSite = m44.a("w", (Object)lwl2, (Object)new Object[0], (long)-4968184746715213117L, (long)l);
        ltb ltb2 = (ltb)lmu2;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = callSite;
        objectArray3[0] = l3;
        m44.a("w", (Object)ltb2, (Object)objectArray3, (long)-6504114854036947639L, (long)l);
    }

    public ltl(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x24764DD17AF0L;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
    }
}
