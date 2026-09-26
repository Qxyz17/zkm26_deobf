/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class ljs
extends l7e {
    private static final long b = prr.a(4231181795392897251L, 5054334937488664026L, MethodHandles.lookup().lookupClass()).a(158069499506787L);

    public ljs(int n10, short s10, short s11, int n11) {
        long l10 = ((long)n10 << 32 | (long)s10 << 48 >>> 32 | (long)s11 << 48 >>> 48) ^ b;
        long l11 = l10 ^ 0x6D519729F099L;
        super(l11, n11);
    }
}

