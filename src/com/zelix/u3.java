/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.prr;
import com.zelix.u2;
import java.lang.invoke.MethodHandles;

public class u3
extends u2 {
    private static final long a = prr.a((long)-5810708490510144844L, (long)1846576319251792647L, MethodHandles.lookup().lookupClass()).a(58513311842256L);

    public u3(int n, int n2, String string, String string2, short s) {
        long l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)s << 48 >>> 48) ^ a;
        long l2 = l ^ 0x7A40A3B483EBL;
        int n3 = (int)(l2 >>> 32);
        int n4 = (int)(l2 << 32 >>> 48);
        int n5 = (int)(l2 << 48 >>> 48);
        super(n3, (short)n4, string, (short)n5, string2);
    }
}
