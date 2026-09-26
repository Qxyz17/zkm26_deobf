/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.ltv;
import com.zelix.lwr;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class ltq
extends l7t {
    private static final long a = prr.a((long)6674504385473360169L, (long)8648069035670028282L, MethodHandles.lookup().lookupClass()).a(261348237874997L);

    public ltq(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x4C3EEB97460DL;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
    }

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x283A4D9B9A01L;
        long l4 = l3 >>> 16;
        int n = (int)(l3 << 48 >>> 48);
        long l5 = l2 ^ 0x47526B4E5A06L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        CallSite callSite = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l);
        lwr lwr2 = (lwr)this.V(0);
        CallSite callSite2 = m44.a("w", (Object)lwr2, (Object)new Object[0], (long)-4968184746715213117L, (long)l);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = callSite2;
        objectArray3[1] = (int)((char)n);
        objectArray3[0] = l4;
        m44.a("w", (Object)((ltv)lmu2), (Object)objectArray3, (long)-4733942013270636267L, (long)l);
    }
}
