/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ly0;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class ly4
extends ly0 {
    private static final long b = prr.a((long)2012804045160038034L, (long)8866490825683282214L, MethodHandles.lookup().lookupClass()).a(209806672008004L);

    public ly4(long l, int n) {
        long l2 = (l = b ^ l) ^ 0x66EABF511B78L;
        int n2 = (int)(l2 >>> 48);
        int n3 = (int)(l2 << 16 >>> 48);
        int n4 = (int)(l2 << 32 >>> 32);
        super(n, (short)n2, (char)n3, n4);
    }
}
