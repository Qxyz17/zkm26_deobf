/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lj3
extends l7e {
    private static final long b = prr.a(-6518296317807773898L, -5176389180313092179L, MethodHandles.lookup().lookupClass()).a(271162182155299L);

    public lj3(int n10, char c10, int n11, short s10) {
        long l10 = ((long)n10 << 32 | (long)c10 << 48 >>> 32 | (long)s10 << 48 >>> 48) ^ b;
        long l11 = l10 ^ 0xB241EB9CD1FL;
        super(l11, n11);
    }
}

