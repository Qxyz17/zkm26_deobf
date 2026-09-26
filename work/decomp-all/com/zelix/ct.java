/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cw;
import com.zelix.iz;
import com.zelix.m44;
import com.zelix.nq;
import com.zelix.prr;
import com.zelix.rq;
import com.zelix.ue;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class ct
extends iz
implements nq {
    private List Y;
    private static final long a = prr.a((long)-3478446570063356427L, (long)-8268218448416540861L, MethodHandles.lookup().lookupClass()).a(17863147069139L);

    public void o(Object[] objectArray) {
        rq rq2 = (rq)objectArray[0];
        ue ue2 = (ue)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0L;
        long l4 = l2 ^ 0x61C3DCE9B167L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l3;
        objectArray2[1] = ue2;
        objectArray2[0] = rq2;
        super.o(objectArray2);
        cw cw2 = (cw)rq2;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = m44.a("r", (Object)((Object)this), (long)-4134083649607329438L, (long)l);
        objectArray3[0] = l4;
        m44.a("s", (Object)cw2, (Object)objectArray3, (long)-4311003753095154554L, (long)l);
    }

    public ct(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x6FC3426146ABL;
        super(n, l2);
        m44.a("u", (Object)((Object)this), new ArrayList(), (long)3509981891550736247L, (long)l);
    }

    public void A(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        m44.a("r", (Object)((Object)this), (long)4931654704245316530L, (long)l).add(string);
    }
}
