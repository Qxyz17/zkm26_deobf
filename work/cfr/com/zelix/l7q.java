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
    private static final long a = prr.a(7966642399004202999L, -4084210445543778237L, MethodHandles.lookup().lookupClass()).a(42823059093824L);

    final void A(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        ir ir2 = (ir)objectArray[1];
        l10 = a ^ l10;
        m44.a("v", (Object)this, (ir)ir2, (long)7874384105073233145L, (long)l10);
    }

    public l7q(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x1C12350B37E3L;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
    }

    public final void a(Object[] objectArray) {
        lyt[] lytArray = (lyt[])objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        m44.a("q", (Object)this, (lyt[])lytArray, (long)46382497133935190L, (long)l10);
    }
}

