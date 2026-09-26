/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.tn;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.invoke.MethodHandles;

public class lmk
extends WindowAdapter {
    final tn H;
    private static final long a = prr.a((long)5341454248432057804L, (long)4075940763461274899L, MethodHandles.lookup().lookupClass()).a(138995240887856L);

    lmk(tn tn2) {
        this.H = tn2;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        long l = a ^ 0x4059BE1FBD8FL;
        long l2 = l ^ 0x241922C09EFFL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        m44.a("v", (Object)m44.a("w", (Object)this, (long)2168857038675117231L, (long)l), (Object)objectArray, (long)2292079812752443845L, (long)l);
    }
}
