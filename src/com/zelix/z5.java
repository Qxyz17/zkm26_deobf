/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.r;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;

public class z5
extends LinkedHashSet
implements r {
    private String M;
    private static final long a = prr.a((long)4888068272174923970L, (long)-5343163682125136220L, MethodHandles.lookup().lookupClass()).a(63099986866301L);

    public z5() {
    }

    public z5(String string, long l, Collection collection) {
        l = a ^ l;
        super(collection);
        m44.a("r", (Object)this, (String)string, (long)-3699400926815036543L, (long)l);
    }

    public String y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("p", (Object)this, (long)2531384031419216905L, (long)l);
    }

    @Override
    public Object clone() {
        return super.clone();
    }

    public z5(Collection collection) {
        super(collection);
    }

    public z5(int n, char c, String string, Map map, short s) {
        long l = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ a;
        long l2 = l ^ 0x7368FC769FCL;
        this(string, l2, map.keySet());
    }
}
