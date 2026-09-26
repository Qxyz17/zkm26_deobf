/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lj_
extends l7e {
    private static final long b = prr.a((long)-8794078428044614084L, (long)-3724427106852010614L, MethodHandles.lookup().lookupClass()).a(256631189163068L);

    public lj_(int n, int n2, int n3, byte by) {
        long l = ((long)n2 << 32 | (long)n3 << 40 >>> 32 | (long)by << 56 >>> 56) ^ b;
        long l2 = l ^ 0x25AC469CD0BBL;
        super(l2, n);
    }
}
