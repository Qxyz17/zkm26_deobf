/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class ljo
extends l7e {
    private static final long b = prr.a(-5737514012844860280L, 5535058813576568451L, MethodHandles.lookup().lookupClass()).a(1816768282187L);

    public ljo(int n10, byte by2, long l10) {
        long l11 = ((long)by2 << 56 | l10 << 8 >>> 8) ^ b;
        long l12 = l11 ^ 0x582C39FD1D2DL;
        super(l12, n10);
    }
}

