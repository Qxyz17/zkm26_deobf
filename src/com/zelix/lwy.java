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

public class lwy
extends lt9 {
    private static final long a = prr.a((long)-2719035910638502938L, (long)-6972648086749176606L, MethodHandles.lookup().lookupClass()).a(119651664608972L);

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0x7CB5B7F16076L;
        ltv ltv2 = (ltv)lmu2;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this.b;
        objectArray2[0] = l2;
        m44.a("w", (Object)ltv2, (Object)objectArray2, (long)-6595143417819150615L, (long)l);
    }

    public lwy(char c, int n, char c2, int n2) {
        long l = ((long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x397842D2A3C6L;
        super(n2, l2);
    }
}
