/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7o;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lt9;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lwk
extends lt9 {
    private static final long a = prr.a((long)3358483307643802534L, (long)3019693321758691917L, MethodHandles.lookup().lookupClass()).a(225217308238937L);

    public lwk(int n, byte by, long l) {
        long l2 = ((long)by << 56 | l << 8 >>> 8) ^ a;
        long l3 = l2 ^ 0x72C23CBE932CL;
        super(n, l3);
    }

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0x302ED0D1C757L;
        l7o l7o2 = (l7o)lmu2;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = m44.a("w", (Object)((Object)this), (Object)new Object[0], (long)-4968184746715213117L, (long)l);
        m44.a("w", (Object)l7o2, (Object)objectArray2, (long)-4633924497614044434L, (long)l);
    }
}
