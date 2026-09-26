/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.co;
import com.zelix.d;
import com.zelix.iz;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.rq;
import com.zelix.ue;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class cw
extends iz
implements d {
    private String x;
    private List M;
    private static final long a = prr.a((long)-1825459003451514532L, (long)-4647428604852842562L, MethodHandles.lookup().lookupClass()).a(98359970237028L);

    public cw(char c, int n, int n2, short s) {
        long l = ((long)c << 48 | (long)n2 << 32 >>> 16 | (long)s << 48 >>> 48) ^ a;
        long l2 = l ^ 0x130C672B2E47L;
        super(n, l2);
    }

    void l(Object[] objectArray) {
        long l = (Long)objectArray[0];
        List list = (List)objectArray[1];
        l = a ^ l;
        m44.a("r", (Object)((Object)this), (List)list, (long)-6650838418888186067L, (long)l);
    }

    public void o(Object[] objectArray) {
        rq rq2 = (rq)objectArray[0];
        ue ue2 = (ue)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x55CF963A8B9AL;
        long l4 = l2 ^ 0L;
        long l5 = l2 ^ 0xDC8FAA7EAL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l4;
        objectArray2[1] = ue2;
        objectArray2[0] = rq2;
        super.o(objectArray2);
        co co2 = (co)rq2;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = m44.a("r", (Object)((Object)this), (long)-2568332709684182904L, (long)l);
        objectArray3[0] = l5;
        m44.a("s", (Object)co2, (Object)objectArray3, (long)-2856714211193168808L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = m44.a("r", (Object)((Object)this), (long)-4228524543108431409L, (long)l);
        objectArray4[0] = l3;
        m44.a("s", (Object)co2, (Object)objectArray4, (long)-2568001102973727227L, (long)l);
    }

    public void t(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("u", (Object)((Object)this), (String)string, (long)5797833697913769125L, (long)l);
    }
}
