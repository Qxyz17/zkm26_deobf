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
    private static final long a = prr.a((long)-8917916907451163049L, (long)3685219068059665181L, MethodHandles.lookup().lookupClass()).a(145283352269759L);

    public int compare(Object object, Object object2) {
        long l = a ^ 0x7ACC7C72E242L;
        long l2 = l ^ 0x7513EC49C22CL;
        Object[] objectArray = new Object[3];
        objectArray[2] = (_f)object2;
        objectArray[1] = (_f)object;
        objectArray[0] = l2;
        return (int)m44.a("v", (Object)this, (Object)objectArray, (long)-2237770905257740069L, (long)l);
    }

    lok(lk6 lk62) {
        this.v = lk62;
    }

    public int Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        _f _f2 = (_f)objectArray[1];
        _f _f3 = (_f)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x3067C23AB227L;
        return _f2.j(l2).compareTo(_f3.j(l2));
    }
}
