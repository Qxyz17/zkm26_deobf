/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.iz;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public abstract class c7
extends iz {
    protected String I;
    private static final long a = prr.a((long)-4410559327367834887L, (long)6902134093113074766L, MethodHandles.lookup().lookupClass()).a(69117595831169L);

    public c7(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x9C0262E60D0L;
        super(n, l2);
    }

    public final void F(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l = a ^ l;
        m44.a("v", (Object)((Object)this), (String)string.trim(), (long)1249410098285553619L, (long)l);
    }
}
