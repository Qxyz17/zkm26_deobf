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
import com.zelix.xk;
import com.zelix.xm;
import java.lang.invoke.MethodHandles;

public class xe
extends xc
implements lkh {
    static final va N;

    public va A(long l) {
        return m44.a("i", (long)-6229050732335234077L, (long)l);
    }

    static {
        long l = prr.a((long)-2834172542479643572L, (long)8213715634896413525L, MethodHandles.lookup().lookupClass()).a(227793439984449L) ^ 0x49A8A375BC0EL;
        N = m44.a("n", (long)1541998215226909475L, (long)l);
    }

    xm P(Object[] objectArray) {
        xc xc2 = (xc)objectArray[0];
        jf jf2 = (jf)objectArray[1];
        xb xb2 = (xb)objectArray[2];
        long l = (Long)objectArray[3];
        l6q l6q2 = (l6q)objectArray[4];
        long l2 = l ^ 0x1AB761D655C0L;
        return new xk(xc2, jf2, xb2, l6q2, l2);
    }

    xe(int n, h1 h12, to to2) {
        super(n, h12, to2);
    }
}
