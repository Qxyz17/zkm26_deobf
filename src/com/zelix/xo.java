/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._6;
import com.zelix._u;
import com.zelix.b1;
import com.zelix.jf;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.to;
import com.zelix.va;
import com.zelix.xb;
import com.zelix.xc;
import com.zelix.xu;
import java.lang.invoke.MethodHandles;

public class xo
extends xu {
    static final va jc;
    private static final long cb;

    static {
        cb = prr.a((long)-912772886832350284L, (long)8289279939211102010L, MethodHandles.lookup().lookupClass()).a(230331111489129L);
        long l = cb ^ 0x4B4D66640D0FL;
        jc = m44.a("l", (long)8023363238667888472L, (long)l);
    }

    xo(int n, to to2, jf jf2, xb xb2, _u _u2, _6 _62, long l) {
        long l2 = (l = cb ^ l) ^ 0x4C199CCE450BL;
        super(l2, n, to2, jf2, xb2, _u2, _62);
    }

    xo(int n, to to2, jf jf2, xb xb2, b1 b12) {
        super(n, to2, jf2, xb2, b12);
    }

    public va A(long l) {
        return jc;
    }

    xo(long l, xc xc2, jf jf2, xb xb2, l6q l6q2) {
        long l2 = (l = cb ^ l) ^ 0x2C92C047222EL;
        super(xc2, l2, jf2, xb2, l6q2);
    }
}
