/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lbg;
import com.zelix.m44;
import com.zelix.prr;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.invoke.MethodHandles;

public class gq
extends WindowAdapter {
    final lbg l;
    private static final long a = prr.a((long)657598794710299634L, (long)283996082978413213L, MethodHandles.lookup().lookupClass()).a(19398512242330L);

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        long l = a ^ 0x6BC1025D374AL;
        long l2 = l ^ 0x65D89A745512L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        m44.a("v", (Object)m44.a("w", (Object)this, (long)-5813201465537164158L, (long)l), (Object)objectArray, (long)-5212419944299058733L, (long)l);
    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {
        long l = a ^ 0x5F37CC3F4FC6L;
        long l2 = l ^ 0x679C2451BC2AL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = m44.a("s", (Object)m44.a("s", (Object)this, (long)-2891477090769374194L, (long)l), (long)-3114261076397055168L, (long)l);
        m44.a("m", (Object)objectArray, (long)-3003300026656114515L, (long)l);
    }

    gq(lbg lbg2) {
        this.l = lbg2;
    }
}
