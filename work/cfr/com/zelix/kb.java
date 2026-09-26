/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.kw;
import com.zelix.l6q;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class kb
extends kw {
    private static final long a = prr.a(-2694101134327621171L, -1599838526676117217L, MethodHandles.lookup().lookupClass()).a(185391618461686L);

    kb(_4 _42, int n10, int n11, short s10, String string, h1 h12, l6q l6q2, int n12) {
        long l10 = ((long)n11 << 32 | (long)s10 << 48 >>> 32 | (long)n12 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x7C9B4318BA6BL;
        super(_42, n10, string, l11, h12, l6q2);
    }

    @Override
    void z(gu gu2, long l10) {
        long l11 = l10 ^ 0x66FDF08525FDL;
        gu2.K(this.b, this, l11, this.H());
    }
}

