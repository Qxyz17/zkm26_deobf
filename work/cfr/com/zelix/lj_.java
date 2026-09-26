/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lj_
extends l7e {
    private static final long b = prr.a(-8794078428044614084L, -3724427106852010614L, MethodHandles.lookup().lookupClass()).a(256631189163068L);

    public lj_(int n10, int n11, int n12, byte by2) {
        long l10 = ((long)n11 << 32 | (long)n12 << 40 >>> 32 | (long)by2 << 56 >>> 56) ^ b;
        long l11 = l10 ^ 0x25AC469CD0BBL;
        super(l11, n10);
    }
}

