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

public class lw5
extends lt9 {
    private static final long a = prr.a((long)2560256197302753187L, (long)3913632734638343951L, MethodHandles.lookup().lookupClass()).a(189512573535048L);

    public lw5(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x3422501BCB46L;
        super(n, l2);
    }

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0x7CB5B7F16076L;
        ltv ltv2 = (ltv)lmu2;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = (String)((Object)m44.a("l", (long)-5178602363818409232L, (long)l)) + this.b;
        objectArray2[0] = l2;
        m44.a("w", (Object)ltv2, (Object)objectArray2, (long)-6595143417819150615L, (long)l);
    }
}
