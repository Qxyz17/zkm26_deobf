/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix.lk6;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class ml
implements Comparator {
    final lk6 H;
    private static final long a = prr.a(-8314901965148779737L, -4343187518616263681L, MethodHandles.lookup().lookupClass()).a(153308537456766L);

    public int compare(Object object, Object object2) {
        long l10 = a ^ 0x16932B039A16L;
        long l11 = l10 ^ 0x56E32DC8B85AL;
        Object[] objectArray = new Object[3];
        objectArray[2] = (_f)object2;
        objectArray[1] = (_f)object;
        objectArray[0] = l11;
        return (int)m44.a("t", (Object)this, (Object)objectArray, (long)-4690766365102159585L, (long)l10);
    }

    public int v(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        _f _f2 = (_f)objectArray[1];
        _f _f3 = (_f)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x7FC854CAB005L;
        return _f2.j(l11).compareTo(_f3.j(l11));
    }

    ml(lk6 lk62) {
        this.H = lk62;
    }
}

