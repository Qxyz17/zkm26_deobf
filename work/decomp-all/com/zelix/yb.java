/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lq0;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.sh;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class yb
implements Comparator {
    final sh H;
    private static final long a = prr.a((long)4696614340145541537L, (long)-416197552977866685L, MethodHandles.lookup().lookupClass()).a(84699324898993L);

    yb(sh sh2) {
        this.H = sh2;
    }

    public int O(Object[] objectArray) {
        lq0 lq02 = (lq0)objectArray[0];
        lq0 lq03 = (lq0)objectArray[1];
        return (Integer)lq02.D() - (Integer)lq03.D();
    }

    public int compare(Object object, Object object2) {
        long l = a ^ 0x29D3B9452AC0L;
        Object[] objectArray = new Object[2];
        objectArray[1] = (lq0)object2;
        objectArray[0] = (lq0)object;
        return (int)m44.a("t", (Object)this, (Object)objectArray, (long)-3192561193288390773L, (long)l);
    }
}
