/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public abstract class l7_
extends l7t {
    private static final long a = prr.a(-7618742801871685541L, -5634980439604583612L, MethodHandles.lookup().lookupClass()).a(245907895421439L);

    public l7_(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x165401905512L;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
    }

    protected abstract String n(Object[] var1);

    protected abstract int d(Object[] var1);

    protected abstract String y(Object[] var1);
}

