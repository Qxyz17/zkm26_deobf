/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7l;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class l78
extends l7l {
    private static final long b = prr.a((long)1458859063659705175L, (long)7732904250457158077L, MethodHandles.lookup().lookupClass()).a(170665852045687L);

    public l78(long l, int n) {
        long l2 = (l = b ^ l) ^ 0x52DF7B54CDA6L;
        int n2 = (int)(l2 >>> 32);
        int n3 = (int)(l2 << 32 >>> 56);
        int n4 = (int)(l2 << 40 >>> 40);
        super(n, n2, (byte)n3, n4);
    }
}
