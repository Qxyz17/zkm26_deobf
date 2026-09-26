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
    private static final long a = prr.a((long)9196044290429060799L, (long)-2370812347720434809L, MethodHandles.lookup().lookupClass()).a(31849912967103L);

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0x676FEC32126BL;
        ltv ltv2 = (ltv)lmu2;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = m44.a("w", (Object)((Object)this), (Object)new Object[0], (long)-4968184746715213117L, (long)l);
        m44.a("w", (Object)ltv2, (Object)objectArray2, (long)-4948380506849428018L, (long)l);
    }

    public lwq(int n, short s, int n2, int n3) {
        long l = ((long)s << 48 | (long)n2 << 32 >>> 16 | (long)n3 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x6136B07AB74EL;
        super(n, l2);
    }
}
