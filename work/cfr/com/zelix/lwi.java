/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lwe;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lwi
extends lwe {
    private static final long a = prr.a(-4530611628246934226L, 2921872514944692417L, MethodHandles.lookup().lookupClass()).a(156907306129394L);

    public lwi(short s10, int n10, char c10, int n11) {
        long l10 = ((long)s10 << 48 | (long)c10 << 48 >>> 16 | (long)n11 << 32 >>> 32) ^ a;
        long l11 = l10 ^ 0x32C00A08638FL;
        super(n10, l11);
    }
}

