/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class ljs
extends l7e {
    private static final long b = prr.a((long)4231181795392897251L, (long)5054334937488664026L, MethodHandles.lookup().lookupClass()).a(158069499506787L);

    public ljs(int n, short s, short s2, int n2) {
        long l = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s2 << 48 >>> 48) ^ b;
        long l2 = l ^ 0x6D519729F099L;
        super(l2, n2);
    }
}
