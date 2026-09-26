/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.rh;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.invoke.MethodHandles;

public class lqr
extends WindowAdapter {
    final rh f;
    private static final long a = prr.a(-8921447819968229493L, -5500648741975447425L, MethodHandles.lookup().lookupClass()).a(222320063651987L);

    lqr(rh rh2) {
        this.f = rh2;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        long l10 = a ^ 0xFFB72EC44DBL;
        long l11 = l10 ^ 0x6490F6C9A11CL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        m44.a("p", (Object)m44.a("q", (Object)this, (long)8284503440401681862L, (long)l10), (Object)objectArray, (long)8103939810901619916L, (long)l10);
    }
}

