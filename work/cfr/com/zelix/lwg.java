/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lt9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lwg
extends lt9 {
    private static final long a = prr.a(-2327565015730904641L, 825583684296566226L, MethodHandles.lookup().lookupClass()).a(96231958231986L);

    public lwg(int n10, char c10, char c11, int n11) {
        long l10 = ((long)c10 << 48 | (long)c11 << 48 >>> 16 | (long)n11 << 32 >>> 32) ^ a;
        long l11 = l10 ^ 0x785545776556L;
        super(n10, l11);
    }
}

