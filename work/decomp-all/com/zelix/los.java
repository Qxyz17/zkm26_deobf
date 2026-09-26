/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.loe;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class los
extends loe {
    private final boolean b;
    private static final long f = prr.a((long)8446385152103738004L, (long)-4700434078615901100L, MethodHandles.lookup().lookupClass()).a(91670721097850L);

    public boolean d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = f ^ l;
        return (boolean)m44.a("q", (Object)((Object)this), (long)5514070516370265114L, (long)l);
    }

    public los(String string, String string2, String string3, boolean bl) {
        super(string, string2, string3);
        this.b = bl;
    }
}
