/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.vd;
import java.lang.invoke.MethodHandles;

public abstract class zj
extends vd {
    protected String V;
    private static final long c = prr.a((long)764202251170145718L, (long)-2723293644160935370L, MethodHandles.lookup().lookupClass()).a(201418093702796L);

    public final String K(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = c ^ l;
        return m44.a("v", (Object)((Object)this), (long)-2070985998426292444L, (long)l);
    }

    public void X(Object[] objectArray) {
        fu fu2 = (fu)objectArray[0];
        long l = (Long)objectArray[1];
        lqq lqq2 = (lqq)objectArray[2];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = lqq2;
        objectArray2[1] = l2;
        objectArray2[0] = fu2;
        super.X(objectArray2);
    }

    public final void Z(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        l = c ^ l;
        m44.a("p", (Object)((Object)this), (String)string.trim(), (long)-7467483524790664136L, (long)l);
    }

    public zj(long l, int n) {
        long l2 = (l = c ^ l) ^ 0x55B89E0E9CC6L;
        super(l2, n);
    }
}
