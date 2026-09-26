/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lt9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lw_
extends lt9 {
    private static final long a = prr.a(1173538969160522220L, 3395763952252521455L, MethodHandles.lookup().lookupClass()).a(264297728121508L);

    public lw_(int n10, char c10, char c11, int n11) {
        long l10 = ((long)c10 << 48 | (long)c11 << 48 >>> 16 | (long)n11 << 32 >>> 32) ^ a;
        long l11 = l10 ^ 0x2A29EABDA3FFL;
        super(n10, l11);
    }
}

