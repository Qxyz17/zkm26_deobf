/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.q9;
import com.zelix.vd;
import java.lang.invoke.MethodHandles;

public abstract class v0
extends vd {
    protected int S;
    private static final long f = prr.a((long)-1691043440534513449L, (long)6882899919986284191L, MethodHandles.lookup().lookupClass()).a(71551413644062L);

    public int M(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = f ^ l;
        return (int)m44.a("v", (Object)((Object)this), (long)4670397780625064939L, (long)l);
    }

    public v0(long l, int n) {
        long l2 = (l = f ^ l) ^ 0x27B40189635BL;
        super(l2, n);
    }

    v0 E(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = f ^ l;
        long l3 = l2 ^ 0x99A3A5B3733L;
        long l4 = l2 ^ 0x470B5202AD1L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        return m44.a("p", (Object)((q9)m44.a("p", (Object)((Object)this), (Object)objectArray2, (long)2048958330725615143L, (long)l)), (Object)objectArray3, (long)1887961951611100832L, (long)l);
    }

    public void o(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        l = f ^ l;
        m44.a("r", (Object)((Object)this), (int)n, (long)5181026585645745373L, (long)l);
    }

    protected abstract void O(Object[] var1);

    public abstract void X(Object[] var1);

    public abstract String m(Object[] var1);
}
