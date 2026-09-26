/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.lq5;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.vd;
import java.lang.invoke.MethodHandles;

public class zx
extends vd {
    private static final long a = prr.a((long)-8338458266474310153L, (long)1352384892041478531L, MethodHandles.lookup().lookupClass()).a(216357358745035L);

    public zx(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x389FE5BDD149L;
        super(l2, n);
    }

    public final void X(Object[] objectArray) {
        fu fu2 = (fu)objectArray[0];
        long l = (Long)objectArray[1];
        lqq lqq2 = (lqq)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x11C7289DCC51L;
        long l4 = l2 ^ 0x3D6BC658C4BAL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        lq5 lq52 = (lq5)m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-1797704930665120443L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        m44.a("r", (Object)lq52, (Object)objectArray3, (long)-12674111401768136L, (long)l);
    }
}
