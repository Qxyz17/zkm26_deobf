/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.g;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class m8 {
    final g b;
    private static final long a = prr.a((long)-1256455726475238916L, (long)-3416842426636466897L, MethodHandles.lookup().lookupClass()).a(74199265969603L);

    public m8(g g2) {
        this.b = g2;
    }

    public String toString() {
        long l = a ^ 0xB1B267AF47DL;
        long l2 = l ^ 0x420735ACE227L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return m44.a("s", (Object)m44.a("r", (Object)this, (long)-4531038771711175315L, (long)l), (Object)objectArray, (long)-4445508356648518678L, (long)l);
    }
}
