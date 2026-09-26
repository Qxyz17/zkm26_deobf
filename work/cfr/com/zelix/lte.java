/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.ltv;
import com.zelix.lwl;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lte
extends l7t {
    private static final long a = prr.a(7889084403292786521L, 1001304214026102122L, MethodHandles.lookup().lookupClass()).a(23891106900054L);

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0x4D49BEF22C7L;
        long l13 = l11 ^ 0L;
        lwl lwl2 = (lwl)this.V(0);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l13;
        objectArray2[1] = lqu2;
        objectArray2[0] = this;
        m44.a("w", (Object)lwl2, (Object)objectArray2, (long)-6393942317858302839L, (long)l10);
        CallSite callSite = m44.a("w", (Object)lwl2, (Object)new Object[0], (long)-4968184746715213117L, (long)l10);
        ltv ltv2 = (ltv)lmu2;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l12;
        objectArray3[0] = (String)((Object)m44.a("l", (long)-5178602363818409232L, (long)l10)) + (String)((Object)callSite);
        m44.a("w", (Object)ltv2, (Object)objectArray3, (long)-5174687364662623911L, (long)l10);
    }

    public lte(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x68F759A70F23L;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
    }
}

