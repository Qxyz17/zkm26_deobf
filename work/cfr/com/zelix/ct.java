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
    private static final long a = prr.a(-3478446570063356427L, -8268218448416540861L, MethodHandles.lookup().lookupClass()).a(17863147069139L);

    @Override
    public void o(Object[] objectArray) {
        rq rq2 = (rq)objectArray[0];
        ue ue2 = (ue)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0L;
        long l13 = l11 ^ 0x61C3DCE9B167L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l12;
        objectArray2[1] = ue2;
        objectArray2[0] = rq2;
        super.o(objectArray2);
        cw cw2 = (cw)rq2;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = m44.a("r", (Object)this, (long)-4134083649607329438L, (long)l10);
        objectArray3[0] = l13;
        m44.a("s", (Object)cw2, (Object)objectArray3, (long)-4311003753095154554L, (long)l10);
    }

    public ct(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x6FC3426146ABL;
        super(n10, l11);
        m44.a("u", (Object)this, new ArrayList(), (long)3509981891550736247L, (long)l10);
    }

    @Override
    public void A(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        m44.a("r", (Object)this, (long)4931654704245316530L, (long)l10).add(string);
    }
}

