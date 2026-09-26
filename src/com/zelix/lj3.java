/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lj3
extends l7e {
    private static final long b = prr.a((long)-6518296317807773898L, (long)-5176389180313092179L, MethodHandles.lookup().lookupClass()).a(271162182155299L);

    public lj3(int n, char c, int n2, short s) {
        long l = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        long l2 = l ^ 0xB241EB9CD1FL;
        super(l2, n2);
    }
}
