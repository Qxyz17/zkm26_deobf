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
    private static final long a = prr.a(-4410559327367834887L, 6902134093113074766L, MethodHandles.lookup().lookupClass()).a(69117595831169L);

    public c7(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x9C0262E60D0L;
        super(n10, l11);
    }

    public final void F(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l10 = a ^ l10;
        m44.a("v", (Object)this, (String)string.trim(), (long)1249410098285553619L, (long)l10);
    }
}

