/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class ljy
extends l7e {
    private static final long b = prr.a((long)-7307149741307266098L, (long)5131928449710306842L, MethodHandles.lookup().lookupClass()).a(256844553545697L);

    public ljy(int n, int n2, int n3, int n4) {
        long l = ((long)n2 << 32 | (long)n3 << 48 >>> 32 | (long)n4 << 48 >>> 48) ^ b;
        long l2 = l ^ 0x7B79A8F19ADBL;
        super(l2, n);
    }
}
