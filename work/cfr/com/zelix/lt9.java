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
    private static final long e = prr.a(7805652656321237425L, -654122375404979542L, MethodHandles.lookup().lookupClass()).a(91641464993378L);

    public final void b(Object[] objectArray) {
        String string = (String)objectArray[0];
        this.b = string;
    }

    public lt9(int n10, long l10) {
        long l11 = (l10 = e ^ l10) ^ 0x14B504255C65L;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
    }

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
    }

    public final String A(Object[] objectArray) {
        return this.b;
    }
}

