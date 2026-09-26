/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lkf {
    private final String H;
    private final boolean e;
    private final boolean D;
    private static final long a = prr.a(9187775597947247009L, -5188810901453444478L, MethodHandles.lookup().lookupClass()).a(31520817010804L);

    lkf(String string, boolean bl2, boolean bl3) {
        this.H = string;
        this.D = bl2;
        this.e = bl3;
    }

    boolean f(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (boolean)m44.a("u", (Object)this, (long)5222055768740061210L, (long)l10);
    }

    String M(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("v", (Object)this, (long)4854419828291018914L, (long)l10);
    }
}

