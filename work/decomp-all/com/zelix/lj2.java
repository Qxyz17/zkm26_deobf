/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lj2
extends l7e {
    private static final long b = prr.a((long)102269475857625295L, (long)4628885384737644784L, MethodHandles.lookup().lookupClass()).a(74600292441405L);

    public lj2(int n, short s, int n2, short s2) {
        long l = ((long)s << 48 | (long)n2 << 32 >>> 16 | (long)s2 << 48 >>> 48) ^ b;
        long l2 = l ^ 0x68BABD51AD81L;
        super(l2, n);
    }
}
