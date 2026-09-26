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

public class q
implements Comparator {
    final lk6 a;
    private static final long b = prr.a((long)4614481536101335891L, (long)6078782562646332729L, MethodHandles.lookup().lookupClass()).a(66641889607993L);

    q(lk6 lk62) {
        this.a = lk62;
    }

    public int compare(Object object, Object object2) {
        long l = b ^ 0x101CBAF0B0C0L;
        long l2 = l ^ 0x78DCBC386F30L;
        Object[] objectArray = new Object[3];
        objectArray[2] = (_f)object2;
        objectArray[1] = (_f)object;
        objectArray[0] = l2;
        return (int)m44.a("u", (Object)this, (Object)objectArray, (long)-1611487724341513282L, (long)l);
    }

    public int t(Object[] objectArray) {
        long l = (Long)objectArray[0];
        _f _f2 = (_f)objectArray[1];
        _f _f3 = (_f)objectArray[2];
        long l2 = (l = b ^ l) ^ 0x577854C94DB9L;
        return _f2.j(l2).compareTo(_f3.j(l2));
    }
}
