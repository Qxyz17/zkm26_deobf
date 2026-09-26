/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lwe;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lws
extends lwe {
    private static final long a = prr.a((long)477145512169730994L, (long)-1972318347299338840L, MethodHandles.lookup().lookupClass()).a(30698422138893L);

    public lws(int n, int n2, char c, int n3) {
        long l = ((long)n2 << 32 | (long)c << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x2F766A49E44FL;
        super(n, l2);
    }
}
