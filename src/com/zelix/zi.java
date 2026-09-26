/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.or;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class zi
implements ListSelectionListener {
    final or C;
    private static final long a = prr.a((long)3650217091707742589L, (long)7890682211163237343L, MethodHandles.lookup().lookupClass()).a(55481042735928L);

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        long l = a ^ 0x75953FB7A68L;
        long l2 = l ^ 0x77FCC0292AB4L;
        Object[] objectArray = new Object[3];
        objectArray[2] = listSelectionEvent;
        objectArray[1] = m44.a("r", (Object)this, (long)4916606791265123319L, (long)l);
        objectArray[0] = l2;
        m44.a("l", (Object)objectArray, (long)6834586751103617529L, (long)l);
    }

    zi(or or2) {
        this.C = or2;
    }
}
