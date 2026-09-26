/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cu;
import com.zelix.d;
import com.zelix.iz;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.rq;
import com.zelix.ue;
import java.lang.invoke.MethodHandles;

public class c6
extends iz
implements d {
    private String V;
    private static final long a = prr.a(-2167298540693557963L, 8823951354463941453L, MethodHandles.lookup().lookupClass()).a(251576753186471L);

    @Override
    public void t(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("u", (Object)this, (String)string, (long)5709444534091293904L, (long)l10);
    }

    public c6(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x164D89444A2CL;
        super(n10, l11);
    }

    @Override
    public void o(Object[] objectArray) {
        rq rq2 = (rq)objectArray[0];
        ue ue2 = (ue)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0x2223FC2B722DL;
        long l13 = l11 ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l13;
        objectArray2[1] = ue2;
        objectArray2[0] = rq2;
        super.o(objectArray2);
        cu cu2 = (cu)rq2;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l12;
        objectArray3[0] = m44.a("r", (Object)this, (long)-4390590136493266691L, (long)l10);
        m44.a("s", (Object)cu2, (Object)objectArray3, (long)-4189590524115729973L, (long)l10);
    }
}

