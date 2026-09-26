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
    private static final long d = prr.a(7635751961552013828L, 9164251486107663918L, MethodHandles.lookup().lookupClass()).a(120883695581869L);

    @Override
    public final boolean q(short s10, Set set, int n10, int n11) {
        long l10 = (long)s10 << 48 | (long)n10 << 32 >>> 16 | (long)n11 << 48 >>> 48;
        long l11 = l10 ^ 0L;
        int n12 = (int)(l11 >>> 48);
        int n13 = (int)(l11 << 16 >>> 32);
        int n14 = (int)(l11 << 48 >>> 48);
        h h10 = (h)((Object)this.V(0));
        boolean bl2 = h10.q((short)n12, set, n13, n14);
        return bl2;
    }

    public lya(long l10, int n10, int n11) {
        long l11 = (l10 << 32 | (long)n11 << 32 >>> 32) ^ d;
        long l12 = l11 ^ 0x4971EC3B60F7L;
        int n12 = (int)(l12 >>> 48);
        int n13 = (int)(l12 << 16 >>> 48);
        int n14 = (int)(l12 << 32 >>> 32);
        super((short)n12, (short)n13, n10, n14);
    }
}

