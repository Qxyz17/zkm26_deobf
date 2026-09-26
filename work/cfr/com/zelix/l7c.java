/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7l;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class l7c
extends l7l {
    private static final long b = prr.a(-2304930656169154474L, -1665861303628251593L, MethodHandles.lookup().lookupClass()).a(277785891925030L);

    public l7c(int n10, long l10) {
        long l11 = (l10 = b ^ l10) ^ 0x1D159E381D75L;
        int n11 = (int)(l11 >>> 32);
        int n12 = (int)(l11 << 32 >>> 56);
        int n13 = (int)(l11 << 40 >>> 40);
        super(n10, n11, (byte)n12, n13);
    }
}

