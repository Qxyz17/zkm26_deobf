/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._v;
import com.zelix.ai;
import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.z1;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lan
extends l7t
implements z1 {
    private static final long a = prr.a((long)-2313027487774818518L, (long)7548573002837333664L, MethodHandles.lookup().lookupClass()).a(7752973635503L);

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = lqu2;
        objectArray2[0] = this;
        m44.a("w", (Object)this.V(0), (Object)objectArray2, (long)-6656114929610942631L, (long)l);
    }

    public final boolean k(Object[] objectArray) {
        _v _v2 = (_v)objectArray[0];
        long l = (Long)objectArray[1];
        ai ai2 = (ai)objectArray[2];
        long l2 = l ^ 0L;
        z1 z12 = (z1)this.V(0);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = ai2;
        objectArray2[1] = l2;
        objectArray2[0] = _v2;
        CallSite callSite = m44.a("r", (Object)z12, (Object)objectArray2, (long)-2005823465454324656L, (long)l);
        return (boolean)callSite;
    }

    public String e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0L;
        StringBuffer stringBuffer = new StringBuffer();
        z1 z12 = (z1)this.V(0);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        CallSite callSite = m44.a("q", (Object)z12, (Object)objectArray2, (long)-6581495104713834516L, (long)l);
        return callSite;
    }

    public lan(long l, int n) {
        long l2 = (l = a ^ l) ^ 0xE3351B6D9A8L;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
    }
}
