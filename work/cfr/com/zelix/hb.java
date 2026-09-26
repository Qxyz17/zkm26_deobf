/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.h6;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.sh;
import java.lang.invoke.MethodHandles;
import java.util.List;

public abstract class hb
extends h6 {
    protected List N;
    private static final long d = prr.a(1841723518167185864L, -767307745214015459L, MethodHandles.lookup().lookupClass()).a(11832482730454L);

    public hb(sh sh2, int n10, int n11, List list, byte by2, List list2, lqu lqu2) {
        long l10 = ((long)n10 << 32 | (long)n11 << 40 >>> 32 | (long)by2 << 56 >>> 56) ^ d;
        long l11 = l10 ^ 0x8A5342F9DE7L;
        int n12 = (int)(l11 >>> 32);
        int n13 = (int)(l11 << 32 >>> 48);
        int n14 = (int)(l11 << 48 >>> 48);
        super(n12, sh2, (short)n13, list, (short)n14, lqu2);
        m44.a("s", (Object)this, (List)list2, (long)-5366621671458324855L, (long)l10);
    }
}

