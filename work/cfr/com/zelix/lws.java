/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lwe;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lws
extends lwe {
    private static final long a = prr.a(477145512169730994L, -1972318347299338840L, MethodHandles.lookup().lookupClass()).a(30698422138893L);

    public lws(int n10, int n11, char c10, int n12) {
        long l10 = ((long)n11 << 32 | (long)c10 << 48 >>> 32 | (long)n12 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x2F766A49E44FL;
        super(n10, l11);
    }
}

