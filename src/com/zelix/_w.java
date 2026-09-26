/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.r1;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.invoke.MethodHandles;

public class _w
extends WindowAdapter {
    final r1 m;
    private static final long a = prr.a((long)8073402628101821251L, (long)3790053457861117541L, MethodHandles.lookup().lookupClass()).a(35513692506315L);

    @Override
    public void windowClosed(WindowEvent windowEvent) {
    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {
        long l = a ^ 0x51E0A0A6946AL;
        long l2 = l ^ 0x6EABF8AEC42EL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = m44.a("w", (Object)m44.a("w", (Object)this, (long)-5921614375142841907L, (long)l), (long)-6139044341895003663L, (long)l);
        m44.a("i", (Object)objectArray, (long)-5884467766294822743L, (long)l);
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        long l = a ^ 0x11632F326A2CL;
        long l2 = l ^ 0x6CCB3C5B9CC4L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        m44.a("p", (Object)m44.a("q", (Object)this, (long)6022565707489173387L, (long)l), (Object)objectArray, (long)5716394308794902848L, (long)l);
    }

    _w(r1 r12) {
        this.m = r12;
    }
}
