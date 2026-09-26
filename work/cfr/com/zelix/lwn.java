/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.r5;
import java.lang.invoke.MethodHandles;

public class lwn
extends l7t {
    private static final long a = prr.a(801902598622742147L, -5926715566772376226L, MethodHandles.lookup().lookupClass()).a(273179412430189L);

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0x6352E8763037L;
        r5 r52 = (r5)((Object)lmu2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = "*";
        objectArray2[0] = l11;
        m44.a("w", (Object)r52, (Object)objectArray2, (long)-4956867482493701791L, (long)l10);
    }

    public lwn(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x83F7AA0D20FL;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
    }
}

