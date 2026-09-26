/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.h;
import com.zelix.lyp;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.Set;

public abstract class lya
extends lyp
implements h {
    private static final long d = prr.a((long)7635751961552013828L, (long)9164251486107663918L, MethodHandles.lookup().lookupClass()).a(120883695581869L);

    public final boolean q(short s, Set set, int n, int n2) {
        long l = (long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48;
        long l2 = l ^ 0L;
        int n3 = (int)(l2 >>> 48);
        int n4 = (int)(l2 << 16 >>> 32);
        int n5 = (int)(l2 << 48 >>> 48);
        h h2 = (h)this.V(0);
        boolean bl = h2.q((short)n3, set, n4, n5);
        return bl;
    }

    public lya(long l, int n, int n2) {
        long l2 = (l << 32 | (long)n2 << 32 >>> 32) ^ d;
        long l3 = l2 ^ 0x4971EC3B60F7L;
        int n3 = (int)(l3 >>> 48);
        int n4 = (int)(l3 << 16 >>> 48);
        int n5 = (int)(l3 << 32 >>> 32);
        super((short)n3, (short)n4, n, n5);
    }
}
