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
    private static final long a = prr.a(4959388091922197601L, 8098971675981124750L, MethodHandles.lookup().lookupClass()).a(153804769590916L);

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
    }

    public lwm(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x42058733C07DL;
        super(n10, l11);
    }
}

