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
import com.zelix.xq;
import java.lang.invoke.MethodHandles;

public class xs
extends xc
implements lkh {
    static final va o;

    xm P(Object[] objectArray) {
        xc xc2 = (xc)objectArray[0];
        jf jf2 = (jf)objectArray[1];
        xb xb2 = (xb)objectArray[2];
        long l = (Long)objectArray[3];
        l6q l6q2 = (l6q)objectArray[4];
        long l2 = l ^ 0x10F3AF58991DL;
        return new xq(xc2, l2, jf2, xb2, l6q2);
    }

    public va A(long l) {
        return m44.a("i", (long)-6154331652172858731L, (long)l);
    }

    xs(int n, h1 h12, to to2) {
        super(n, h12, to2);
    }

    static {
        long l = prr.a((long)-5468532810340438932L, (long)-7591827687789174261L, MethodHandles.lookup().lookupClass()).a(231088571624813L) ^ 0x7831BBB32068L;
        o = m44.a("h", (long)-9022543631085592325L, (long)l);
    }
}
