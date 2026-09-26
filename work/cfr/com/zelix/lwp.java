/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lt9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lwp
extends lt9 {
    private static final long a = prr.a(4080197298470982406L, 5903478411895271697L, MethodHandles.lookup().lookupClass()).a(101463535552978L);

    public lwp(long l10, int n10, int n11) {
        long l11 = (l10 << 32 | (long)n11 << 32 >>> 32) ^ a;
        long l12 = l11 ^ 0x377257AF8C03L;
        super(n10, l12);
    }
}

