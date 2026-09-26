/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.i0;
import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public abstract class lyp
extends l7t {
    private static final long b = prr.a(4839656953422376404L, 8004364953935413326L, MethodHandles.lookup().lookupClass()).a(273131764542674L);

    public String e(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0L;
        i0 i02 = (i0)((Object)this.V(0));
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("q", (Object)i02, (Object)objectArray2, (long)-6581495104713834516L, (long)l10);
    }

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

    abstract boolean V(Object[] var1);

    public lyp(short s10, short s11, int n10, int n11) {
        long l10 = ((long)s10 << 48 | (long)s11 << 48 >>> 16 | (long)n11 << 32 >>> 32) ^ b;
        long l11 = l10 ^ 0x30F7741CF2C9L;
        int n12 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n12, n10, l12);
    }

    public final String g(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = b ^ l10) ^ 0x5743A4F5C911L;
        i0 i02 = (i0)((Object)this.V(0));
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("p", (Object)i02, (Object)objectArray2, (long)7906212431133341437L, (long)l10);
    }
}

