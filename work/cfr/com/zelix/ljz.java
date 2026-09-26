/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class ljz
extends l7e {
    private static final long b = prr.a(1025092310141190470L, 1415317023829550173L, MethodHandles.lookup().lookupClass()).a(182168720686523L);

    public ljz(int n10, char c10, long l10) {
        long l11 = ((long)c10 << 48 | l10 << 16 >>> 16) ^ b;
        long l12 = l11 ^ 0x35FCE15A8291L;
        super(l12, n10);
    }
}

