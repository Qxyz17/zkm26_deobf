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
    private static final long a = prr.a((long)7889084403292786521L, (long)1001304214026102122L, MethodHandles.lookup().lookupClass()).a(23891106900054L);

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x4D49BEF22C7L;
        long l4 = l2 ^ 0L;
        lwl lwl2 = (lwl)this.V(0);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l4;
        objectArray2[1] = lqu2;
        objectArray2[0] = this;
        m44.a("w", (Object)lwl2, (Object)objectArray2, (long)-6393942317858302839L, (long)l);
        CallSite callSite = m44.a("w", (Object)lwl2, (Object)new Object[0], (long)-4968184746715213117L, (long)l);
        ltv ltv2 = (ltv)lmu2;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = (String)((Object)m44.a("l", (long)-5178602363818409232L, (long)l)) + (String)((Object)callSite);
        m44.a("w", (Object)ltv2, (Object)objectArray3, (long)-5174687364662623911L, (long)l);
    }

    public lte(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x68F759A70F23L;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
    }
}
