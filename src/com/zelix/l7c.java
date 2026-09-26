/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7l;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class l7c
extends l7l {
    private static final long b = prr.a((long)-2304930656169154474L, (long)-1665861303628251593L, MethodHandles.lookup().lookupClass()).a(277785891925030L);

    public l7c(int n, long l) {
        long l2 = (l = b ^ l) ^ 0x1D159E381D75L;
        int n2 = (int)(l2 >>> 32);
        int n3 = (int)(l2 << 32 >>> 56);
        int n4 = (int)(l2 << 40 >>> 40);
        super(n, n2, (byte)n3, n4);
    }
}
