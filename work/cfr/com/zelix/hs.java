/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.h8;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.sh;
import java.lang.invoke.MethodHandles;
import java.util.List;

public abstract class hs
extends h8 {
    protected List c;
    private static final long U = prr.a(-8293428372189141399L, 3068242262042300860L, MethodHandles.lookup().lookupClass()).a(13431465155546L);

    public abstract void q(Object[] var1);

    public hs(long l10, sh sh2, List list, List list2, lqu lqu2) {
        long l11 = (l10 = U ^ l10) ^ 0x4B58627BCFF4L;
        super(sh2, list, l11, lqu2);
        m44.a("q", (Object)this, (List)list2, (long)6111661420679904865L, (long)l10);
    }
}

