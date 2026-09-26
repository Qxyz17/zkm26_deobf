/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class l71
extends l7e {
    private static final long b = prr.a(2503627226724237369L, 6939147046354639947L, MethodHandles.lookup().lookupClass()).a(86153358817620L);

    public l71(int n10, byte by2, int n11, int n12) {
        long l10 = ((long)n10 << 32 | (long)by2 << 56 >>> 32 | (long)n12 << 40 >>> 40) ^ b;
        long l11 = l10 ^ 0x7AEE83A323A9L;
        super(l11, n11);
    }
}

