/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lt9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lwm
extends lt9 {
    private static final long a = prr.a((long)4959388091922197601L, (long)8098971675981124750L, MethodHandles.lookup().lookupClass()).a(153804769590916L);

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
    }

    public lwm(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x42058733C07DL;
        super(n, l2);
    }
}
