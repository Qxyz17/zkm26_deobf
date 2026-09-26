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
    private static final long d = prr.a((long)1841723518167185864L, (long)-767307745214015459L, MethodHandles.lookup().lookupClass()).a(11832482730454L);

    public hb(sh sh2, int n, int n2, List list, byte by, List list2, lqu lqu2) {
        long l = ((long)n << 32 | (long)n2 << 40 >>> 32 | (long)by << 56 >>> 56) ^ d;
        long l2 = l ^ 0x8A5342F9DE7L;
        int n3 = (int)(l2 >>> 32);
        int n4 = (int)(l2 << 32 >>> 48);
        int n5 = (int)(l2 << 48 >>> 48);
        super(n3, sh2, (short)n4, list, (short)n5, lqu2);
        m44.a("s", (Object)((Object)this), (List)list2, (long)-5366621671458324855L, (long)l);
    }
}
