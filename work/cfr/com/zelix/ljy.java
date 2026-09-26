/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class ljy
extends l7e {
    private static final long b = prr.a(-7307149741307266098L, 5131928449710306842L, MethodHandles.lookup().lookupClass()).a(256844553545697L);

    public ljy(int n10, int n11, int n12, int n13) {
        long l10 = ((long)n11 << 32 | (long)n12 << 48 >>> 32 | (long)n13 << 48 >>> 48) ^ b;
        long l11 = l10 ^ 0x7B79A8F19ADBL;
        super(l11, n10);
    }
}

