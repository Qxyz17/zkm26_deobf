/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.lq8;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.uw;
import com.zelix.vd;
import com.zelix.zt;
import java.lang.invoke.MethodHandles;

public class qh
extends vd
implements lq8 {
    private String A;
    private static final long a = prr.a((long)-3149288151476189541L, (long)-7412910682208319611L, MethodHandles.lookup().lookupClass()).a(5518937750679L);

    public void b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("q", (Object)((Object)this), (String)string, (long)1514750900779182380L, (long)l);
    }

    public qh(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x56701857933EL;
        super(l2, n);
    }

    public final void X(Object[] objectArray) {
        fu fu2 = (fu)objectArray[0];
        long l = (Long)objectArray[1];
        lqq lqq2 = (lqq)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x11C7289DCC51L;
        long l4 = l2 ^ 0x69F43366FE2CL;
        long l5 = l2 ^ 0x6FA91C253D16L;
        long l6 = l2 ^ 0L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l5;
        objectArray2[0] = 0;
        zt zt2 = (zt)m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-1931359190408154321L, (long)l);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = lqq2;
        objectArray3[1] = l6;
        objectArray3[0] = this;
        m44.a("r", (Object)zt2, (Object)objectArray3, (long)-1785880816923864518L, (long)l);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l3;
        uw uw2 = (uw)m44.a("r", (Object)((Object)this), (Object)objectArray4, (long)-1797704930665120443L, (long)l);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = m44.a("s", (Object)((Object)this), (long)-311504665416464508L, (long)l);
        objectArray5[0] = l4;
        m44.a("r", (Object)uw2, (Object)objectArray5, (long)-1780915045144000185L, (long)l);
    }
}
