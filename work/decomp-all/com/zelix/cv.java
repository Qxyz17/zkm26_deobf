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
    private static final long a = prr.a((long)-2501361569078987767L, (long)1198343235047449835L, MethodHandles.lookup().lookupClass()).a(168787215119358L);

    public cv(String string, Map map, long l) {
        long l2 = (l = a ^ l) ^ 0x41A675E086D1L;
        this(l2, string, map.keySet());
    }

    public cv(Collection collection) {
        super(collection);
    }

    public String y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("p", (Object)this, (long)4212325039934701782L, (long)l);
    }

    @Override
    public Object clone() {
        return super.clone();
    }

    public cv() {
    }

    public cv(long l, String string, Collection collection) {
        l = a ^ l;
        super(collection);
        m44.a("p", (Object)this, (String)string, (long)5559452662973921156L, (long)l);
    }
}
