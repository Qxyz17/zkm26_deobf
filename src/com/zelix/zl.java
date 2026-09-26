/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.prr;
import com.zelix.zj;
import java.lang.invoke.MethodHandles;

public class zl
extends zj {
    private static final long a = prr.a((long)-3757584246065176279L, (long)-1109894446719796482L, MethodHandles.lookup().lookupClass()).a(25317841337780L);

    public zl(short s, int n, int n2, int n3) {
        long l = ((long)s << 48 | (long)n2 << 32 >>> 16 | (long)n3 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x4E656D927FF4L;
        super(l2, n);
    }
}
