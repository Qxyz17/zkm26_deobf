/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lj1
extends l7e {
    private static final long b = prr.a(-9151491075942761512L, 4602877227697032559L, MethodHandles.lookup().lookupClass()).a(224754766541818L);

    public lj1(int n10, short s10, int n11, int n12) {
        long l10 = ((long)s10 << 48 | (long)n11 << 32 >>> 16 | (long)n12 << 48 >>> 48) ^ b;
        long l11 = l10 ^ 0x2312FD495E19L;
        super(l11, n10);
    }
}

