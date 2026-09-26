/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lyj
extends l7e {
    private static final long b = prr.a(-1113246134855856608L, 8853472048071438872L, MethodHandles.lookup().lookupClass()).a(96245913814045L);

    public lyj(int n10, int n11, short s10, int n12) {
        long l10 = ((long)n10 << 32 | (long)n11 << 48 >>> 32 | (long)s10 << 48 >>> 48) ^ b;
        long l11 = l10 ^ 0x1B59D506243DL;
        super(l11, n12);
    }
}

