/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lth;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lar
extends l7t {
    private static final long a = prr.a(6567625520077906796L, 1040369615356187699L, MethodHandles.lookup().lookupClass()).a(227713540018729L);

    public lar(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x7FEF81A30A40L;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
    }

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0x12AC37020BEAL;
        lth lth2 = (lth)lmu2;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("w", (Object)lth2, (Object)objectArray2, (long)-4653866440501808349L, (long)l10);
    }
}

