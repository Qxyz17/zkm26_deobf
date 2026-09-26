/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class l7r
extends l7e {
    private static final long b = prr.a((long)-9099142374250714878L, (long)-4165547389487851887L, MethodHandles.lookup().lookupClass()).a(26983581236810L);

    public l7r(int n, short s, int n2, int n3) {
        long l = ((long)s << 48 | (long)n2 << 32 >>> 16 | (long)n3 << 48 >>> 48) ^ b;
        long l2 = l ^ 0x13BB35F91593L;
        super(l2, n);
    }
}
