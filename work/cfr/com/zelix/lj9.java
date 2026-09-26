/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lj9
extends l7e {
    private static final long b = prr.a(-1142280997108691596L, -252986587827364118L, MethodHandles.lookup().lookupClass()).a(238135450807240L);

    public lj9(short s10, int n10, int n11, char c10) {
        long l10 = ((long)s10 << 48 | (long)n11 << 32 >>> 16 | (long)c10 << 48 >>> 48) ^ b;
        long l11 = l10 ^ 0x56EE47D0CEC5L;
        super(l11, n10);
    }
}

