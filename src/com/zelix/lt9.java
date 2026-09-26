/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public abstract class lt9
extends l7t {
    protected String b;
    private static final long e = prr.a((long)7805652656321237425L, (long)-654122375404979542L, MethodHandles.lookup().lookupClass()).a(91641464993378L);

    public final void b(Object[] objectArray) {
        String string = (String)objectArray[0];
        this.b = string;
    }

    public lt9(int n, long l) {
        long l2 = (l = e ^ l) ^ 0x14B504255C65L;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
    }

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
    }

    public final String A(Object[] objectArray) {
        return this.b;
    }
}
