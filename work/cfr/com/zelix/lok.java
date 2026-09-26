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

public class lok
implements Comparator {
    final lk6 v;
    private static final long a = prr.a(-8917916907451163049L, 3685219068059665181L, MethodHandles.lookup().lookupClass()).a(145283352269759L);

    public int compare(Object object, Object object2) {
        long l10 = a ^ 0x7ACC7C72E242L;
        long l11 = l10 ^ 0x7513EC49C22CL;
        Object[] objectArray = new Object[3];
        objectArray[2] = (_f)object2;
        objectArray[1] = (_f)object;
        objectArray[0] = l11;
        return (int)m44.a("v", (Object)this, (Object)objectArray, (long)-2237770905257740069L, (long)l10);
    }

    lok(lk6 lk62) {
        this.v = lk62;
    }

    public int Y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        _f _f2 = (_f)objectArray[1];
        _f _f3 = (_f)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x3067C23AB227L;
        return _f2.j(l11).compareTo(_f3.j(l11));
    }
}

