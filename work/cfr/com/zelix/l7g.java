/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7l;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class l7g
extends l7l {
    private static final long b = prr.a(-7713020944580393087L, 3257318010704203754L, MethodHandles.lookup().lookupClass()).a(86011154655129L);

    public l7g(int n10, long l10) {
        long l11 = (l10 = b ^ l10) ^ 0x4FDB60518786L;
        int n11 = (int)(l11 >>> 32);
        int n12 = (int)(l11 << 32 >>> 56);
        int n13 = (int)(l11 << 40 >>> 40);
        super(n10, n11, (byte)n12, n13);
    }
}

