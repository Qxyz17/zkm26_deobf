/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.h1;
import com.zelix.jf;
import com.zelix.l6q;
import com.zelix.lkh;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.to;
import com.zelix.va;
import com.zelix.xb;
import com.zelix.xc;
import com.zelix.xm;
import com.zelix.xo;
import java.lang.invoke.MethodHandles;

public class xi
extends xc
implements lkh {
    static final va K;

    xm P(Object[] objectArray) {
        xc xc2 = (xc)objectArray[0];
        jf jf2 = (jf)objectArray[1];
        xb xb2 = (xb)objectArray[2];
        long l = (Long)objectArray[3];
        l6q l6q2 = (l6q)objectArray[4];
        long l2 = l ^ 0xE156E552D8CL;
        return new xo(l2, xc2, jf2, xb2, l6q2);
    }

    static {
        long l = prr.a((long)-160553223101631596L, (long)-7211377053249171436L, MethodHandles.lookup().lookupClass()).a(119794583476860L) ^ 0x256BF86375A3L;
        K = m44.a("m", (long)-382253090705198415L, (long)l);
    }

    xi(int n, h1 h12, to to2) {
        super(n, h12, to2);
    }

    public va A(long l) {
        return m44.a("i", (long)-5865863780199394419L, (long)l);
    }
}
