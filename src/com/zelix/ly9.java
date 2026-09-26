/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.ly1;
import com.zelix.lyn;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class ly9
extends ly1 {
    protected lyn M;
    private static final long a = prr.a((long)-695114478575931750L, (long)-8262444989665014497L, MethodHandles.lookup().lookupClass()).a(253957734946960L);

    public ly9(byte by, int n, long l) {
        long l2 = ((long)by << 56 | l << 8 >>> 8) ^ a;
        long l3 = l2 ^ 0x223BCF0889CDL;
        super(l3, n);
    }

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0L;
        m44.a("t", (Object)((Object)this), (lyn)((lyn)this.V(0)), (long)-6408542824077833238L, (long)l);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = lqu2;
        objectArray2[0] = this;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)-6408542824077833238L, (long)l), (Object)objectArray2, (long)-6402349034717016921L, (long)l);
    }
}
