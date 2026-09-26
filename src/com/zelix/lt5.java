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

public class lt5
extends l7t {
    private static final long a = prr.a((long)-3244365966241202894L, (long)-3776088078990023800L, MethodHandles.lookup().lookupClass()).a(217015000287547L);

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0x6352E8763037L;
        r5 r52 = (r5)lmu2;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = "?";
        objectArray2[0] = l2;
        m44.a("w", (Object)r52, (Object)objectArray2, (long)-4956867482493701791L, (long)l);
    }

    public lt5(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x701053F7F24FL;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
    }
}
