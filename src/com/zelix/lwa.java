/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lt9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lwa
extends lt9 {
    private static final long a = prr.a((long)9126521054842147133L, (long)3361043568501670136L, MethodHandles.lookup().lookupClass()).a(236739755409099L);

    public lwa(int n, byte by, int n2, int n3) {
        long l = ((long)by << 56 | (long)n2 << 32 >>> 8 | (long)n3 << 40 >>> 40) ^ a;
        long l2 = l ^ 0x56CC85FB8973L;
        super(n, l2);
    }
}
