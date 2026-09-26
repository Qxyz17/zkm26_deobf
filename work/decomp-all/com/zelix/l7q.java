/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ir;
import com.zelix.l7t;
import com.zelix.lyt;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public abstract class l7q
extends l7t {
    ir Z;
    lyt[] o;
    private static final long a = prr.a((long)7966642399004202999L, (long)-4084210445543778237L, MethodHandles.lookup().lookupClass()).a(42823059093824L);

    final void A(Object[] objectArray) {
        long l = (Long)objectArray[0];
        ir ir2 = (ir)objectArray[1];
        l = a ^ l;
        m44.a("v", (Object)((Object)this), (ir)ir2, (long)7874384105073233145L, (long)l);
    }

    public l7q(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x1C12350B37E3L;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
    }

    public final void a(Object[] objectArray) {
        lyt[] lytArray = (lyt[])objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        m44.a("q", (Object)((Object)this), (lyt[])lytArray, (long)46382497133935190L, (long)l);
    }
}
