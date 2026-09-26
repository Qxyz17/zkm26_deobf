/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.t2;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.invoke.MethodHandles;

public class ew
extends WindowAdapter {
    final t2 J;
    private static final long a = prr.a((long)-5898474800606720087L, (long)-2745566538625252190L, MethodHandles.lookup().lookupClass()).a(22540995076996L);

    ew(t2 t22) {
        this.J = t22;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        long l;
        long l2 = l = a ^ 0x5FF05F4F77EAL;
        long l3 = l2 ^ 0xEE93497D573L;
        long l4 = l2 ^ 0x5897843302F5L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        m44.a("r", (Object)m44.a("s", (Object)this, (long)5229564783042520916L, (long)l), (Object)objectArray, (long)5440677290372216908L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        m44.a("r", (Object)m44.a("s", (Object)m44.a("s", (Object)this, (long)5229564783042520916L, (long)l), (long)5256685390033364700L, (long)l), (Object)objectArray2, (long)5219046112764154657L, (long)l);
    }
}
