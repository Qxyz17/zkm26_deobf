/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lt9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class ltz
extends lt9 {
    private static final long a = prr.a(-5386392153548088559L, -4112846468953318657L, MethodHandles.lookup().lookupClass()).a(275427853810350L);

    public ltz(int n10, short s10, int n11, int n12) {
        long l10 = ((long)n10 << 32 | (long)s10 << 48 >>> 32 | (long)n12 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x51BCD414C823L;
        super(n11, l11);
    }
}

