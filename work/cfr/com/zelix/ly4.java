/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ly0;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class ly4
extends ly0 {
    private static final long b = prr.a(2012804045160038034L, 8866490825683282214L, MethodHandles.lookup().lookupClass()).a(209806672008004L);

    public ly4(long l10, int n10) {
        long l11 = (l10 = b ^ l10) ^ 0x66EABF511B78L;
        int n11 = (int)(l11 >>> 48);
        int n12 = (int)(l11 << 16 >>> 48);
        int n13 = (int)(l11 << 32 >>> 32);
        super(n10, (short)n11, (char)n12, n13);
    }
}

