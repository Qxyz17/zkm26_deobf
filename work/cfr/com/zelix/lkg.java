/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lbc;
import com.zelix.m44;
import com.zelix.prr;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.invoke.MethodHandles;

public class lkg
extends WindowAdapter {
    final lbc d;
    private static final long a = prr.a(6961417427265230361L, 5629920576544805880L, MethodHandles.lookup().lookupClass()).a(183629629070644L);

    lkg(lbc lbc2) {
        this.d = lbc2;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        long l10 = a ^ 0x23F54A9A4987L;
        long l11 = l10 ^ 0x59748F42F6AEL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        m44.a("r", (Object)m44.a("s", (Object)this, (long)1367155125732355711L, (long)l10), (Object)objectArray, (long)1420897896999355027L, (long)l10);
    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {
        long l10 = a ^ 0x4A23B8F4903CL;
        long l11 = l10 ^ 0x6100D6BBEA1L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l11;
        objectArray[0] = m44.a("p", (Object)m44.a("p", (Object)this, (long)-3800345938295294012L, (long)l10), (long)-3062322269882868989L, (long)l10);
        m44.a("n", (Object)objectArray, (long)-3109380376350967258L, (long)l10);
    }
}

