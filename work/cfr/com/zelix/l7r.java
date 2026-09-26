/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class l7r
extends l7e {
    private static final long b = prr.a(-9099142374250714878L, -4165547389487851887L, MethodHandles.lookup().lookupClass()).a(26983581236810L);

    public l7r(int n10, short s10, int n11, int n12) {
        long l10 = ((long)s10 << 48 | (long)n11 << 32 >>> 16 | (long)n12 << 48 >>> 48) ^ b;
        long l11 = l10 ^ 0x13BB35F91593L;
        super(l11, n10);
    }
}

