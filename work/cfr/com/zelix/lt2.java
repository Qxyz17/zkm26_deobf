/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lt9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lt2
extends lt9 {
    private static final long a = prr.a(-8981712671230081204L, 2739769120701491668L, MethodHandles.lookup().lookupClass()).a(218549494184221L);

    public lt2(char c10, int n10, char c11, int n11) {
        long l10 = ((long)c10 << 48 | (long)n10 << 32 >>> 16 | (long)c11 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x7EA561F75BB5L;
        super(n11, l11);
    }
}

