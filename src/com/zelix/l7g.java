/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7l;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class l7g
extends l7l {
    private static final long b = prr.a((long)-7713020944580393087L, (long)3257318010704203754L, MethodHandles.lookup().lookupClass()).a(86011154655129L);

    public l7g(int n, long l) {
        long l2 = (l = b ^ l) ^ 0x4FDB60518786L;
        int n2 = (int)(l2 >>> 32);
        int n3 = (int)(l2 << 32 >>> 56);
        int n4 = (int)(l2 << 40 >>> 40);
        super(n, n2, (byte)n3, n4);
    }
}
