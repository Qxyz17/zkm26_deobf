/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public abstract class ly1
extends l7t {
    private static final long b = prr.a((long)-5034174535742603167L, (long)-3325487392405676392L, MethodHandles.lookup().lookupClass()).a(176329147890686L);

    public ly1(long l, int n) {
        long l2 = (l = b ^ l) ^ 0x472D05A6359EL;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
    }
}
