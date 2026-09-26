/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lt9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lw0
extends lt9 {
    private static final long a = prr.a((long)2853385957720649476L, (long)-7068076930185796502L, MethodHandles.lookup().lookupClass()).a(231722004268380L);

    public lw0(int n, int n2, short s, short s2) {
        long l = ((long)n2 << 32 | (long)s << 48 >>> 32 | (long)s2 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x693AD9CC4DD9L;
        super(n, l2);
    }
}
