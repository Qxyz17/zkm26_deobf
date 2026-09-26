/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.js;
import com.zelix.kw;
import com.zelix.l6q;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class kb
extends kw {
    private static final long a = prr.a((long)-2694101134327621171L, (long)-1599838526676117217L, MethodHandles.lookup().lookupClass()).a(185391618461686L);

    kb(_4 _42, int n, int n2, short s, String string, h1 h12, l6q l6q2, int n3) {
        long l = ((long)n2 << 32 | (long)s << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x7C9B4318BA6BL;
        super(_42, n, string, l2, h12, l6q2);
    }

    void z(gu gu2, long l) {
        long l2 = l ^ 0x66FDF08525FDL;
        gu2.K((js)this.b, (Object)this, l2, (Object)this.H());
    }
}
