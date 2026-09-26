/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lwe;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lwi
extends lwe {
    private static final long a = prr.a((long)-4530611628246934226L, (long)2921872514944692417L, MethodHandles.lookup().lookupClass()).a(156907306129394L);

    public lwi(short s, int n, char c, int n2) {
        long l = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n2 << 32 >>> 32) ^ a;
        long l2 = l ^ 0x32C00A08638FL;
        super(n, l2);
    }
}
