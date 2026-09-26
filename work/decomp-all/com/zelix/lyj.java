/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lyj
extends l7e {
    private static final long b = prr.a((long)-1113246134855856608L, (long)8853472048071438872L, MethodHandles.lookup().lookupClass()).a(96245913814045L);

    public lyj(int n, int n2, short s, int n3) {
        long l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        long l2 = l ^ 0x1B59D506243DL;
        super(l2, n3);
    }
}
