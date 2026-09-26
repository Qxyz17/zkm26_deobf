/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.awt.Component;
import java.lang.invoke.MethodHandles;

public class e8
implements Runnable {
    final Component K;
    private static final long a = prr.a((long)4948348466446783106L, (long)-2819009237621070644L, MethodHandles.lookup().lookupClass()).a(65021707451076L);

    @Override
    public void run() {
        long l = a ^ 0x43B8A2051155L;
        long l2 = l ^ 0x3573B1AC445DL;
        Object[] objectArray = new Object[2];
        objectArray[1] = m44.a("w", (Object)this, (long)5485974502867729610L, (long)l);
        objectArray[0] = l2;
        m44.a("i", (Object)objectArray, (long)5274827091048860124L, (long)l);
    }

    e8(Component component) {
        this.K = component;
    }
}
