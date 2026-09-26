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
import com.zelix.x8;
import java.lang.invoke.MethodHandles;

public class bl
extends kw {
    private static final long a = prr.a(1434377058986753395L, 1676606541744722085L, MethodHandles.lookup().lookupClass()).a(19012777270456L);

    @Override
    void z(gu gu2, long l10) {
        long l11 = l10 ^ 0x66FDF08525FDL;
        gu2.K(this.b, this, l11, this.H());
    }

    bl(_4 _42, x8 x82) {
        super(_42, x82, 0);
    }

    bl(short s10, char c10, _4 _42, int n10, String string, int n11, h1 h12, l6q l6q2) {
        long l10 = ((long)s10 << 48 | (long)c10 << 48 >>> 16 | (long)n11 << 32 >>> 32) ^ a;
        long l11 = l10 ^ 0x5DD0118D7E78L;
        super(_42, n10, string, l11, h12, l6q2);
    }
}

