/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.wa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.MethodHandles;

public class rj
implements ActionListener {
    final wa F;
    private static final long a = prr.a((long)999951781847604746L, (long)-7466854992051630457L, MethodHandles.lookup().lookupClass()).a(215010969808743L);

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        long l = a ^ 0x25C7C879D470L;
        long l2 = l ^ 0x717D3690A79CL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = actionEvent;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)-1727353446055956378L, (long)l), (Object)objectArray, (long)-1672459731663531418L, (long)l);
    }

    rj(wa wa2) {
        this.F = wa2;
    }
}
