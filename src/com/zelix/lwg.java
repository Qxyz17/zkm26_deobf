/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lt9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lwg
extends lt9 {
    private static final long a = prr.a((long)-2327565015730904641L, (long)825583684296566226L, MethodHandles.lookup().lookupClass()).a(96231958231986L);

    public lwg(int n, char c, char c2, int n2) {
        long l = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n2 << 32 >>> 32) ^ a;
        long l2 = l ^ 0x785545776556L;
        super(n, l2);
    }
}
