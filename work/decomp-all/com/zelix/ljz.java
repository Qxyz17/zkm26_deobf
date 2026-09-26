/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class ljz
extends l7e {
    private static final long b = prr.a((long)1025092310141190470L, (long)1415317023829550173L, MethodHandles.lookup().lookupClass()).a(182168720686523L);

    public ljz(int n, char c, long l) {
        long l2 = ((long)c << 48 | l << 16 >>> 16) ^ b;
        long l3 = l2 ^ 0x35FCE15A8291L;
        super(l3, n);
    }
}
