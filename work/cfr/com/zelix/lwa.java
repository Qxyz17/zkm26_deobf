/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lt9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lwa
extends lt9 {
    private static final long a = prr.a(9126521054842147133L, 3361043568501670136L, MethodHandles.lookup().lookupClass()).a(236739755409099L);

    public lwa(int n10, byte by2, int n11, int n12) {
        long l10 = ((long)by2 << 56 | (long)n11 << 32 >>> 8 | (long)n12 << 40 >>> 40) ^ a;
        long l11 = l10 ^ 0x56CC85FB8973L;
        super(n10, l11);
    }
}

