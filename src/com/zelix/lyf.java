/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ly0;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lyf
extends ly0 {
    private static final long b = prr.a((long)6759969045516630190L, (long)5217802990977282649L, MethodHandles.lookup().lookupClass()).a(234699110430637L);

    public lyf(long l, int n) {
        long l2 = (l = b ^ l) ^ 0xBD76DD75886L;
        int n2 = (int)(l2 >>> 48);
        int n3 = (int)(l2 << 16 >>> 48);
        int n4 = (int)(l2 << 32 >>> 32);
        super(n, (short)n2, (char)n3, n4);
    }
}
