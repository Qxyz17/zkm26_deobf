/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class l71
extends l7e {
    private static final long b = prr.a((long)2503627226724237369L, (long)6939147046354639947L, MethodHandles.lookup().lookupClass()).a(86153358817620L);

    public l71(int n, byte by, int n2, int n3) {
        long l = ((long)n << 32 | (long)by << 56 >>> 32 | (long)n3 << 40 >>> 40) ^ b;
        long l2 = l ^ 0x7AEE83A323A9L;
        super(l2, n2);
    }
}
