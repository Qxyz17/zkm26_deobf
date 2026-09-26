/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.e;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;

public class lou
implements Iterator {
    private Iterator d;
    final e M;
    private static final long a = prr.a((long)8878180115924575190L, (long)-1364470695563925653L, MethodHandles.lookup().lookupClass()).a(213279670676439L);

    @Override
    public boolean hasNext() {
        return this.d.hasNext();
    }

    public Object next() {
        return this.d.next();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    lou(e e2, long l) {
        l = a ^ l;
        this.M = e2;
        this.d = m44.a("o", (Object)new Object[]{m44.a("q", (Object)this, (long)-1993873313747969788L, (long)l)}, (long)-311540730390972072L, (long)l).iterator();
    }
}
