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
import com.zelix.x8;
import java.lang.invoke.MethodHandles;

public class bl
extends kw {
    private static final long a = prr.a((long)1434377058986753395L, (long)1676606541744722085L, MethodHandles.lookup().lookupClass()).a(19012777270456L);

    void z(gu gu2, long l) {
        long l2 = l ^ 0x66FDF08525FDL;
        gu2.K((js)this.b, (Object)this, l2, (Object)this.H());
    }

    bl(_4 _42, x8 x82) {
        super(_42, x82, 0);
    }

    bl(short s, char c, _4 _42, int n, String string, int n2, h1 h12, l6q l6q2) {
        long l = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n2 << 32 >>> 32) ^ a;
        long l2 = l ^ 0x5DD0118D7E78L;
        super(_42, n, string, l2, h12, l6q2);
    }
}
