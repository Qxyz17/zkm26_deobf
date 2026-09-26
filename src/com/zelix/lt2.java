/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lt9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lt2
extends lt9 {
    private static final long a = prr.a((long)-8981712671230081204L, (long)2739769120701491668L, MethodHandles.lookup().lookupClass()).a(218549494184221L);

    public lt2(char c, int n, char c2, int n2) {
        long l = ((long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x7EA561F75BB5L;
        super(n2, l2);
    }
}
