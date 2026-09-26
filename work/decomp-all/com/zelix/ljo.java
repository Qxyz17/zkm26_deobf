/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class ljo
extends l7e {
    private static final long b = prr.a((long)-5737514012844860280L, (long)5535058813576568451L, MethodHandles.lookup().lookupClass()).a(1816768282187L);

    public ljo(int n, byte by, long l) {
        long l2 = ((long)by << 56 | l << 8 >>> 8) ^ b;
        long l3 = l2 ^ 0x582C39FD1D2DL;
        super(l3, n);
    }
}
