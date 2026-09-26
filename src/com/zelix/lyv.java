/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ly0;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lyv
extends ly0 {
    private static final long b = prr.a((long)-4655328401264239086L, (long)5030806735667845983L, MethodHandles.lookup().lookupClass()).a(73350779543389L);

    public lyv(long l, int n) {
        long l2 = (l = b ^ l) ^ 0x52B0CA33D932L;
        int n2 = (int)(l2 >>> 48);
        int n3 = (int)(l2 << 16 >>> 48);
        int n4 = (int)(l2 << 32 >>> 32);
        super(n, (short)n2, (char)n3, n4);
    }
}
