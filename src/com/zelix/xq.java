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

public class xq
extends xu {
    static final va rW;
    private static final long cb;

    xq(int n, to to2, jf jf2, xb xb2, b1 b12) {
        super(n, to2, jf2, xb2, b12);
    }

    xq(int n, to to2, jf jf2, long l, xb xb2, _u _u2, _6 _62) {
        long l2 = (l = cb ^ l) ^ 0x123D4FEAE8CAL;
        super(l2, n, to2, jf2, xb2, _u2, _62);
    }

    public va A(long l) {
        return m44.a("i", (long)-5504660692291219229L, (long)l);
    }

    xq(xc xc2, long l, jf jf2, xb xb2, l6q l6q2) {
        long l2 = (l = cb ^ l) ^ 0x72FF1DB64CADL;
        super(xc2, l2, jf2, xb2, l6q2);
    }

    static {
        cb = prr.a((long)-8560667868048360171L, (long)5529696097961046578L, MethodHandles.lookup().lookupClass()).a(13808223634987L);
        long l = cb ^ 0x40D9932BCCF1L;
        rW = m44.a("h", (long)7710543682235779379L, (long)l);
    }
}
