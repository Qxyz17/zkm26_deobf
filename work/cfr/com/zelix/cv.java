/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.r;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

public class cv
extends HashSet
implements r {
    private String u;
    private static final long a = prr.a(-2501361569078987767L, 1198343235047449835L, MethodHandles.lookup().lookupClass()).a(168787215119358L);

    public cv(String string, Map map, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x41A675E086D1L;
        this(l11, string, map.keySet());
    }

    public cv(Collection collection) {
        super(collection);
    }

    @Override
    public String y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return m44.a("p", (Object)this, (long)4212325039934701782L, (long)l10);
    }

    @Override
    public Object clone() {
        return super.clone();
    }

    public cv() {
    }

    public cv(long l10, String string, Collection collection) {
        l10 = a ^ l10;
        super(collection);
        m44.a("p", (Object)this, (String)string, (long)5559452662973921156L, (long)l10);
    }
}

