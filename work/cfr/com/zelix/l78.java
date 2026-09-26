/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7l;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class l78
extends l7l {
    private static final long b = prr.a(1458859063659705175L, 7732904250457158077L, MethodHandles.lookup().lookupClass()).a(170665852045687L);

    public l78(long l10, int n10) {
        long l11 = (l10 = b ^ l10) ^ 0x52DF7B54CDA6L;
        int n11 = (int)(l11 >>> 32);
        int n12 = (int)(l11 << 32 >>> 56);
        int n13 = (int)(l11 << 40 >>> 40);
        super(n10, n11, (byte)n12, n13);
    }
}

