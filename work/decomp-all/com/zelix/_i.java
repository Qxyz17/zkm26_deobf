/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.ti;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.invoke.MethodHandles;

public class _i
extends WindowAdapter {
    final ti X;
    private static final long a = prr.a((long)7582518835301305737L, (long)4633218318084287530L, MethodHandles.lookup().lookupClass()).a(116864009692472L);

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        long l;
        long l2 = l = a ^ 0x5B6EDD2B25B4L;
        long l3 = l2 ^ 0xBD056B66FD3L;
        long l4 = l2 ^ 0x5DAEE612B855L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        m44.a("r", (Object)m44.a("s", (Object)this, (long)-1543228423047783976L, (long)l), (Object)objectArray, (long)-1648359296014799776L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        m44.a("r", (Object)m44.a("s", (Object)m44.a("s", (Object)this, (long)-1543228423047783976L, (long)l), (long)-1528120127531464714L, (long)l), (Object)objectArray2, (long)-950888507196216959L, (long)l);
    }

    _i(ti ti2) {
        this.X = ti2;
    }
}
