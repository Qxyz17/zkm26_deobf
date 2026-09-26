/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.az;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class ox {
    private final int d;
    private final az m;
    private static final long a = prr.a((long)6385358172723293376L, (long)4776127559925184968L, MethodHandles.lookup().lookupClass()).a(195282129239097L);

    ox(az az2, int n) {
        this.m = az2;
        this.d = n;
    }

    public az U(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("q", (Object)this, (long)-3773410071781447730L, (long)l);
    }
}
