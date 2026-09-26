/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lt9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lw_
extends lt9 {
    private static final long a = prr.a((long)1173538969160522220L, (long)3395763952252521455L, MethodHandles.lookup().lookupClass()).a(264297728121508L);

    public lw_(int n, char c, char c2, int n2) {
        long l = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n2 << 32 >>> 32) ^ a;
        long l2 = l ^ 0x2A29EABDA3FFL;
        super(n, l2);
    }
}
