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
    private static final long a = prr.a(-2313027487774818518L, 7548573002837333664L, MethodHandles.lookup().lookupClass()).a(7752973635503L);

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l11;
        objectArray2[1] = lqu2;
        objectArray2[0] = this;
        m44.a("w", (Object)this.V(0), (Object)objectArray2, (long)-6656114929610942631L, (long)l10);
    }

    @Override
    public final boolean k(Object[] objectArray) {
        _v _v2 = (_v)objectArray[0];
        long l10 = (Long)objectArray[1];
        ai ai2 = (ai)objectArray[2];
        long l11 = l10 ^ 0L;
        z1 z12 = (z1)((Object)this.V(0));
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = ai2;
        objectArray2[1] = l11;
        objectArray2[0] = _v2;
        CallSite callSite = m44.a("r", (Object)z12, (Object)objectArray2, (long)-2005823465454324656L, (long)l10);
        return (boolean)callSite;
    }

    @Override
    public String e(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0L;
        StringBuffer stringBuffer = new StringBuffer();
        z1 z12 = (z1)((Object)this.V(0));
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        CallSite callSite = m44.a("q", (Object)z12, (Object)objectArray2, (long)-6581495104713834516L, (long)l10);
        return callSite;
    }

    public lan(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0xE3351B6D9A8L;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
    }
}

