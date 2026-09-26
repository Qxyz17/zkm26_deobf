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
    private static final long a = prr.a(-2719035910638502938L, -6972648086749176606L, MethodHandles.lookup().lookupClass()).a(119651664608972L);

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0x7CB5B7F16076L;
        ltv ltv2 = (ltv)lmu2;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this.b;
        objectArray2[0] = l11;
        m44.a("w", (Object)ltv2, (Object)objectArray2, (long)-6595143417819150615L, (long)l10);
    }

    public lwy(char c10, int n10, char c11, int n11) {
        long l10 = ((long)c10 << 48 | (long)n10 << 32 >>> 16 | (long)c11 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x397842D2A3C6L;
        super(n11, l11);
    }
}

