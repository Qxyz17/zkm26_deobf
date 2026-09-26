/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lj9
extends l7e {
    private static final long b = prr.a((long)-1142280997108691596L, (long)-252986587827364118L, MethodHandles.lookup().lookupClass()).a(238135450807240L);

    public lj9(short s, int n, int n2, char c) {
        long l = ((long)s << 48 | (long)n2 << 32 >>> 16 | (long)c << 48 >>> 48) ^ b;
        long l2 = l ^ 0x56EE47D0CEC5L;
        super(l2, n);
    }
}
