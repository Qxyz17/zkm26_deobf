/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.om;
import com.zelix.prr;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.lang.invoke.MethodHandles;

public class lbl
extends MouseMotionAdapter {
    final om O;
    private static final long a = prr.a((long)-2757888945643388013L, (long)4681849895620469887L, MethodHandles.lookup().lookupClass()).a(251423156100038L);

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        long l = a ^ 0x560B2174100AL;
        long l2 = l ^ 0x1562541797D8L;
        m44.a("u", (Object)m44.a("w", (Object)this, (long)1037153116541199267L, (long)l), (boolean)true, (long)1065471489916773945L, (long)l);
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = m44.a("v", (Object)mouseEvent, (long)946374664216630984L, (long)l);
        m44.a("v", (Object)m44.a("w", (Object)m44.a("w", (Object)this, (long)1037153116541199267L, (long)l), (long)1221830115006980913L, (long)l), (Object)objectArray, (long)1278487674082833610L, (long)l);
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
    }

    lbl(om om2) {
        this.O = om2;
    }
}
