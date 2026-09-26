/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lt9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lwp
extends lt9 {
    private static final long a = prr.a((long)4080197298470982406L, (long)5903478411895271697L, MethodHandles.lookup().lookupClass()).a(101463535552978L);

    public lwp(long l, int n, int n2) {
        long l2 = (l << 32 | (long)n2 << 32 >>> 32) ^ a;
        long l3 = l2 ^ 0x377257AF8C03L;
        super(n, l3);
    }
}
