/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.g;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class vl {
    private final g p;
    private final List k = new ArrayList();
    private final g S;
    private static final long a = prr.a((long)8204643494875201718L, (long)2629090365121684159L, MethodHandles.lookup().lookupClass()).a(39623581893883L);

    List Z(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("v", (Object)this, (long)-4701341750514299244L, (long)l);
    }

    g x(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("u", (Object)this, (long)-7103069030724733655L, (long)l);
    }

    vl(g g2, g g3) {
        this.p = g2;
        this.S = g3;
    }

    void z(Object[] objectArray) {
        g g2 = (g)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        m44.a("t", (Object)this, (long)-5376324016811686602L, (long)l).add(g2);
    }

    g O(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("p", (Object)this, (long)7434888526626957438L, (long)l);
    }
}
