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
    private static final long a = prr.a((long)9187775597947247009L, (long)-5188810901453444478L, MethodHandles.lookup().lookupClass()).a(31520817010804L);

    lkf(String string, boolean bl, boolean bl2) {
        this.H = string;
        this.D = bl;
        this.e = bl2;
    }

    boolean f(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (boolean)m44.a("u", (Object)this, (long)5222055768740061210L, (long)l);
    }

    String M(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("v", (Object)this, (long)4854419828291018914L, (long)l);
    }
}
