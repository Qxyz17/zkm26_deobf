/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lt9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class ltz
extends lt9 {
    private static final long a = prr.a((long)-5386392153548088559L, (long)-4112846468953318657L, MethodHandles.lookup().lookupClass()).a(275427853810350L);

    public ltz(int n, short s, int n2, int n3) {
        long l = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x51BCD414C823L;
        super(n2, l2);
    }
}
