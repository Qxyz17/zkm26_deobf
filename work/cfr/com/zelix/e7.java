/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.gk;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;

public class e7
implements Iterator {
    final gk p;
    private Iterator x;
    private static final long a = prr.a(6785906255855273581L, -7288538998728683735L, MethodHandles.lookup().lookupClass()).a(40934536842822L);

    e7(long l10, gk gk2) {
        l10 = a ^ l10;
        this.p = gk2;
        this.x = m44.a("i", (Object)new Object[]{m44.a("w", (Object)this, (long)-248325816624677893L, (long)l10)}, (long)-2242182167054310725L, (long)l10).iterator();
    }

    @Override
    public boolean hasNext() {
        return this.x.hasNext();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public Object next() {
        return this.x.next();
    }
}

