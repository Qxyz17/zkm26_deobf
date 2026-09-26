/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.jj;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.zn;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public abstract class ja
extends jj {
    List I;
    String y;
    private static final long a = prr.a(-7009851904721308837L, 8652805202417015082L, MethodHandles.lookup().lookupClass()).a(217998437954950L);

    public ja(int n10, long l10) {
        l10 = a ^ l10;
        super(n10);
        m44.a("v", (Object)this, new ArrayList(), (long)-5610290952609175617L, (long)l10);
    }

    final void a(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l10 = a ^ l10;
        m44.a("q", (Object)this, (String)string, (long)9179874092689842677L, (long)l10);
    }

    @Override
    protected final void O(Object[] objectArray) {
        zn zn2 = (zn)objectArray[0];
        lkc lkc2 = (lkc)objectArray[1];
        int n10 = (Integer)objectArray[2];
        long l10 = (Long)objectArray[3];
    }

    final void p(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l10 = a ^ l10;
        m44.a("p", (Object)this, (long)1083163760770800275L, (long)l10).add(string);
    }
}

