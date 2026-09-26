/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lt9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lw0
extends lt9 {
    private static final long a = prr.a(2853385957720649476L, -7068076930185796502L, MethodHandles.lookup().lookupClass()).a(231722004268380L);

    public lw0(int n10, int n11, short s10, short s11) {
        long l10 = ((long)n11 << 32 | (long)s10 << 48 >>> 32 | (long)s11 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x693AD9CC4DD9L;
        super(n10, l11);
    }
}

