/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lt9;
import com.zelix.ltv;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lwq
extends lt9 {
    private static final long a = prr.a(9196044290429060799L, -2370812347720434809L, MethodHandles.lookup().lookupClass()).a(31849912967103L);

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0x676FEC32126BL;
        ltv ltv2 = (ltv)lmu2;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = m44.a("w", (Object)this, (Object)new Object[0], (long)-4968184746715213117L, (long)l10);
        m44.a("w", (Object)ltv2, (Object)objectArray2, (long)-4948380506849428018L, (long)l10);
    }

    public lwq(int n10, short s10, int n11, int n12) {
        long l10 = ((long)s10 << 48 | (long)n11 << 32 >>> 16 | (long)n12 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x6136B07AB74EL;
        super(n10, l11);
    }
}

