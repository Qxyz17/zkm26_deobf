/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.r9;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.invoke.MethodHandles;

public class lbp
extends WindowAdapter {
    final r9 d;
    private static final long a = prr.a(-3106856547693921261L, 233259149515741296L, MethodHandles.lookup().lookupClass()).a(90527184666419L);

    lbp(r9 r92) {
        this.d = r92;
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {
    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {
        long l10 = a ^ 0x3A458D37949FL;
        long l11 = l10 ^ 0x5216DDB97B7AL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l11;
        objectArray[0] = m44.a("s", (Object)m44.a("s", (Object)this, (long)981261793945800229L, (long)l10), (long)1556423646102011557L, (long)l10);
        m44.a("m", (Object)objectArray, (long)1225567351539597309L, (long)l10);
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        long l10 = a ^ 0x798846A5FE32L;
        long l11 = l10 ^ 0x53385D4AB77BL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)7436401393191036040L, (long)l10), (Object)objectArray, (long)7272057365801321215L, (long)l10);
    }
}

