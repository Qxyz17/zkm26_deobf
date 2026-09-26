/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lj1
extends l7e {
    private static final long b = prr.a((long)-9151491075942761512L, (long)4602877227697032559L, MethodHandles.lookup().lookupClass()).a(224754766541818L);

    public lj1(int n, short s, int n2, int n3) {
        long l = ((long)s << 48 | (long)n2 << 32 >>> 16 | (long)n3 << 48 >>> 48) ^ b;
        long l2 = l ^ 0x2312FD495E19L;
        super(l2, n);
    }
}
