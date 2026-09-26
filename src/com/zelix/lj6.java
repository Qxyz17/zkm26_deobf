/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lj6
extends l7e {
    private static final long b = prr.a((long)-3566785872023445289L, (long)4402715728818226687L, MethodHandles.lookup().lookupClass()).a(107229803657686L);

    public lj6(int n, short s, int n2, short s2) {
        long l = ((long)s << 48 | (long)n2 << 32 >>> 16 | (long)s2 << 48 >>> 48) ^ b;
        long l2 = l ^ 0x1D81C0B4FEDEL;
        super(l2, n);
    }
}
