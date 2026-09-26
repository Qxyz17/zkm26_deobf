/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fq;
import com.zelix.l7;
import com.zelix.m44;
import com.zelix.vx;

public abstract class lj
extends l7
implements vx,
fq {
    String d;
    String J;

    public lj(int n) {
        super(n);
    }

    public final void v(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("q", (Object)((Object)this), (String)string, (long)-5050400574644409577L, (long)l);
    }

    public final void e(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        m44.a("t", (Object)((Object)this), (String)string, (long)1458470694664570374L, (long)l);
    }
}
