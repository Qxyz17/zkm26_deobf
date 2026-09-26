/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.wa;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.invoke.MethodHandles;

public class fl
extends WindowAdapter {
    final wa p;
    private static final long a = prr.a(2169573093209344328L, -8054613018090403503L, MethodHandles.lookup().lookupClass()).a(116668949174122L);

    @Override
    public void windowClosed(WindowEvent windowEvent) {
        long l10 = a ^ 0x4A6F868447E9L;
        m44.a("l", (long)-8730994205941573607L, (long)l10);
    }

    fl(wa wa2) {
        this.p = wa2;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        long l10 = a ^ 0x14BBAF528CA0L;
        long l11 = l10 ^ 0x6DEA26FDCB7BL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        m44.a("r", (Object)m44.a("s", (Object)this, (long)5493543324216032106L, (long)l10), (Object)objectArray, (long)6036407392741933956L, (long)l10);
    }
}

