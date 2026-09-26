/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.kt;
import com.zelix.m44;
import com.zelix.prr;
import java.io.Serializable;
import java.lang.invoke.MethodHandles;

public abstract class loi
implements Serializable {
    final String D;
    final int e;
    final String w;
    private static final long b = prr.a(-6870810034007510865L, -8284368286130931922L, MethodHandles.lookup().lookupClass()).a(114193072213479L);

    public String h(Object[] objectArray) {
        return this.w;
    }

    loi(String string, String string2, int n10) {
        this.w = string;
        this.D = string2;
        this.e = n10;
    }

    boolean b(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = b ^ l10) ^ 0x38ED046E3D9FL;
        return kt.l(l11, (int)m44.a("r", (Object)this, (long)-8765917021292741564L, (long)l10));
    }

    public String F(Object[] objectArray) {
        return this.D;
    }
}

