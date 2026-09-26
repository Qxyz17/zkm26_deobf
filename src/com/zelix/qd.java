/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.lq8;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.vd;
import java.lang.invoke.MethodHandles;

public class qd
extends vd {
    private static final long a = prr.a((long)-4802038720021937082L, (long)-2394584186756622893L, MethodHandles.lookup().lookupClass()).a(156684268004324L);

    public qd(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x60A0D51FAF03L;
        super(l2, n);
    }

    public void X(Object[] objectArray) {
        fu fu2 = (fu)objectArray[0];
        long l = (Long)objectArray[1];
        lqq lqq2 = (lqq)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x11C7289DCC51L;
        long l4 = l2 ^ 0x29C30BDCEEA8L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        lq8 lq82 = (lq8)m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-1797704930665120443L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = "*";
        objectArray3[0] = l4;
        m44.a("r", (Object)lq82, (Object)objectArray3, (long)-135669606596125948L, (long)l);
    }
}
