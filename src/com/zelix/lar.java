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
    private static final long a = prr.a((long)6567625520077906796L, (long)1040369615356187699L, MethodHandles.lookup().lookupClass()).a(227713540018729L);

    public lar(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x7FEF81A30A40L;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
    }

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0x12AC37020BEAL;
        lth lth2 = (lth)lmu2;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("w", (Object)lth2, (Object)objectArray2, (long)-4653866440501808349L, (long)l);
    }
}
