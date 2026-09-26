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

public class lwv
extends lt9 {
    private static final long a = prr.a(-3165294874486978405L, 4243786472611673761L, MethodHandles.lookup().lookupClass()).a(198288621816780L);

    public lwv(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x59E53869D029L;
        super(n10, l11);
    }

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0x7A4D43E1CC9L;
        ltv ltv2 = (ltv)lmu2;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = this.b;
        m44.a("w", (Object)ltv2, (Object)objectArray2, (long)-5171572957169260328L, (long)l10);
    }
}

