/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.pu;
import com.zelix.zj;
import java.lang.invoke.MethodHandles;

public class zo
extends zj {
    private static final long a = prr.a((long)-8499015497946536397L, (long)-1850475607238736163L, MethodHandles.lookup().lookupClass()).a(137837312465645L);

    public zo(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x692047F1975L;
        super(l2, n);
    }

    public void X(Object[] objectArray) {
        fu fu2 = (fu)objectArray[0];
        long l = (Long)objectArray[1];
        lqq lqq2 = (lqq)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x11C7289DCC51L;
        long l4 = l2 ^ 0x707565519BDBL;
        long l5 = l2 ^ 0x4D8052C494B9L;
        long l6 = l2 ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = lqq2;
        objectArray2[1] = l6;
        objectArray2[0] = fu2;
        super.X(objectArray2);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        pu pu2 = (pu)m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-1797704930665120443L, (long)l);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l5;
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l4;
        objectArray5[0] = m44.a("r", (Object)((Object)this), (Object)objectArray4, (long)-1785247222142810516L, (long)l);
        m44.a("r", (Object)pu2, (Object)objectArray5, (long)-1869309732353598459L, (long)l);
    }
}
