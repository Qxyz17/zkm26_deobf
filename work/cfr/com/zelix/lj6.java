/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lj6
extends l7e {
    private static final long b = prr.a(-3566785872023445289L, 4402715728818226687L, MethodHandles.lookup().lookupClass()).a(107229803657686L);

    public lj6(int n10, short s10, int n11, short s11) {
        long l10 = ((long)s10 << 48 | (long)n11 << 32 >>> 16 | (long)s11 << 48 >>> 48) ^ b;
        long l11 = l10 ^ 0x1D81C0B4FEDEL;
        super(l11, n10);
    }
}

