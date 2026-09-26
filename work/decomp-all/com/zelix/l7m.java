/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7w;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class l7m
extends l7w {
    private static final long b = prr.a((long)2355128395835174518L, (long)-3734063171737858207L, MethodHandles.lookup().lookupClass()).a(77413263837811L);

    public l7m(long l, int n) {
        long l2 = (l = b ^ l) ^ 0xF6A9D44DB59L;
        super(n, false, l2);
    }
}
