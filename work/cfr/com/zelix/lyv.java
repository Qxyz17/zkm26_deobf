/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ly0;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lyv
extends ly0 {
    private static final long b = prr.a(-4655328401264239086L, 5030806735667845983L, MethodHandles.lookup().lookupClass()).a(73350779543389L);

    public lyv(long l10, int n10) {
        long l11 = (l10 = b ^ l10) ^ 0x52B0CA33D932L;
        int n11 = (int)(l11 >>> 48);
        int n12 = (int)(l11 << 16 >>> 48);
        int n13 = (int)(l11 << 32 >>> 32);
        super(n10, (short)n11, (char)n12, n13);
    }
}

