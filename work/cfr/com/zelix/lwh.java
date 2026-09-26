/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lt9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lwh
extends lt9 {
    private static final long a = prr.a(3527449284015356827L, 7078606409299332897L, MethodHandles.lookup().lookupClass()).a(200433210462737L);

    public lwh(int n10, long l10, byte by2) {
        long l11 = (l10 << 8 | (long)by2 << 56 >>> 56) ^ a;
        long l12 = l11 ^ 0x352C2270D658L;
        super(n10, l12);
    }
}

