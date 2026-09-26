/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.wy;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.invoke.MethodHandles;

public class nx
extends WindowAdapter {
    final wy s;
    private static final long a = prr.a((long)-8499570420581693210L, (long)5205308580057855151L, MethodHandles.lookup().lookupClass()).a(148199616810274L);

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        long l;
        long l2 = l = a ^ 0xB78A277C587L;
        long l3 = l2 ^ 0xF87B00150A1L;
        long l4 = l2 ^ 0x59F900A58727L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        m44.a("p", (Object)m44.a("q", (Object)this, (long)-2932251780659817225L, (long)l), (Object)objectArray, (long)-4027727710140778055L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        m44.a("p", (Object)m44.a("q", (Object)m44.a("q", (Object)this, (long)-2932251780659817225L, (long)l), (long)-2989767436545920232L, (long)l), (Object)objectArray2, (long)-3620956054417418509L, (long)l);
    }

    nx(wy wy2) {
        this.s = wy2;
    }
}
