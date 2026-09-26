/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ly0;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lyr
extends ly0 {
    private static final long b = prr.a((long)1600277474102956086L, (long)-8954124701055098395L, MethodHandles.lookup().lookupClass()).a(207106496470195L);

    public lyr(int n, long l) {
        long l2 = (l = b ^ l) ^ 0x64B69B44012FL;
        int n2 = (int)(l2 >>> 48);
        int n3 = (int)(l2 << 16 >>> 48);
        int n4 = (int)(l2 << 32 >>> 32);
        super(n, (short)n2, (char)n3, n4);
    }
}
