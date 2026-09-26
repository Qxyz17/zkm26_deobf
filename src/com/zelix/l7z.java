/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class l7z
extends l7e {
    private static final long b = prr.a((long)-6825221337010545288L, (long)-7886459887626198640L, MethodHandles.lookup().lookupClass()).a(67037186941851L);

    public l7z(int n, int n2, byte by, int n3) {
        long l = ((long)n2 << 32 | (long)by << 56 >>> 32 | (long)n3 << 40 >>> 40) ^ b;
        long l2 = l ^ 0x14D318990C3EL;
        super(l2, n);
    }
}
