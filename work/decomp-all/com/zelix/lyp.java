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
    private static final long b = prr.a((long)4839656953422376404L, (long)8004364953935413326L, MethodHandles.lookup().lookupClass()).a(273131764542674L);

    public String e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0L;
        i0 i02 = (i0)this.V(0);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("q", (Object)i02, (Object)objectArray2, (long)-6581495104713834516L, (long)l);
    }

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

    abstract boolean V(Object[] var1);

    public lyp(short s, short s2, int n, int n2) {
        long l = ((long)s << 48 | (long)s2 << 48 >>> 16 | (long)n2 << 32 >>> 32) ^ b;
        long l2 = l ^ 0x30F7741CF2C9L;
        int n3 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n3, n, l3);
    }

    public final String g(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = b ^ l) ^ 0x5743A4F5C911L;
        i0 i02 = (i0)this.V(0);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("p", (Object)i02, (Object)objectArray2, (long)7906212431133341437L, (long)l);
    }
}
