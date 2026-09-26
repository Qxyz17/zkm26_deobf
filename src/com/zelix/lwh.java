/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lt9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lwh
extends lt9 {
    private static final long a = prr.a((long)3527449284015356827L, (long)7078606409299332897L, MethodHandles.lookup().lookupClass()).a(200433210462737L);

    public lwh(int n, long l, byte by) {
        long l2 = (l << 8 | (long)by << 56 >>> 56) ^ a;
        long l3 = l2 ^ 0x352C2270D658L;
        super(n, l3);
    }
}
