/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class l7z
extends l7e {
    private static final long b = prr.a(-6825221337010545288L, -7886459887626198640L, MethodHandles.lookup().lookupClass()).a(67037186941851L);

    public l7z(int n10, int n11, byte by2, int n12) {
        long l10 = ((long)n11 << 32 | (long)by2 << 56 >>> 32 | (long)n12 << 40 >>> 40) ^ b;
        long l11 = l10 ^ 0x14D318990C3EL;
        super(l11, n10);
    }
}

