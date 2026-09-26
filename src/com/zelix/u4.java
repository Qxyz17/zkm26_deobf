/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.rv;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.invoke.MethodHandles;

public class u4
extends WindowAdapter {
    final rv d;
    private static final long a = prr.a((long)-8069766832275365611L, (long)-3909115450535678033L, MethodHandles.lookup().lookupClass()).a(146267907800447L);

    u4(rv rv2) {
        this.d = rv2;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        long l;
        long l2 = l = a ^ 0x1F5AD58FABB2L;
        long l3 = l2 ^ 0x4454109B18E1L;
        long l4 = l2 ^ 0x32699ECF9F4AL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        m44.a("u", (Object)m44.a("t", (Object)this, (long)-3582426438302931089L, (long)l), (Object)objectArray, (long)-3112445175842250813L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        m44.a("u", (Object)m44.a("t", (Object)m44.a("t", (Object)this, (long)-3582426438302931089L, (long)l), (long)-3278873515305791974L, (long)l), (Object)objectArray2, (long)-3039177443424579938L, (long)l);
    }
}
