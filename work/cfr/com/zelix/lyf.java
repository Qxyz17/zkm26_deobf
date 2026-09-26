/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ly0;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lyf
extends ly0 {
    private static final long b = prr.a(6759969045516630190L, 5217802990977282649L, MethodHandles.lookup().lookupClass()).a(234699110430637L);

    public lyf(long l10, int n10) {
        long l11 = (l10 = b ^ l10) ^ 0xBD76DD75886L;
        int n11 = (int)(l11 >>> 48);
        int n12 = (int)(l11 << 16 >>> 48);
        int n13 = (int)(l11 << 32 >>> 32);
        super(n10, (short)n11, (char)n12, n13);
    }
}

