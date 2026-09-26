/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public abstract class l7_
extends l7t {
    private static final long a = prr.a((long)-7618742801871685541L, (long)-5634980439604583612L, MethodHandles.lookup().lookupClass()).a(245907895421439L);

    public l7_(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x165401905512L;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
    }

    protected abstract String n(Object[] var1);

    protected abstract int d(Object[] var1);

    protected abstract String y(Object[] var1);
}
