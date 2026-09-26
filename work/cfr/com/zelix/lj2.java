/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lj2
extends l7e {
    private static final long b = prr.a(102269475857625295L, 4628885384737644784L, MethodHandles.lookup().lookupClass()).a(74600292441405L);

    public lj2(int n10, short s10, int n11, short s11) {
        long l10 = ((long)s10 << 48 | (long)n11 << 32 >>> 16 | (long)s11 << 48 >>> 48) ^ b;
        long l11 = l10 ^ 0x68BABD51AD81L;
        super(l11, n10);
    }
}

