/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.ww;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.invoke.MethodHandles;

public class vs
extends WindowAdapter {
    final ww e;
    private static final long a = prr.a((long)3396285715761445445L, (long)3697962610253068803L, MethodHandles.lookup().lookupClass()).a(21873787023649L);

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        long l = a ^ 0x151977E69FABL;
        long l2 = l ^ 0x5DB02B95270DL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        m44.a("t", (Object)m44.a("u", (Object)this, (long)-6849748421364114304L, (long)l), (Object)objectArray, (long)-6814490551511998920L, (long)l);
    }

    vs(ww ww2) {
        this.e = ww2;
    }
}
