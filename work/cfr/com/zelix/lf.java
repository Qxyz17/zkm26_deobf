/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fq;
import com.zelix.l7;
import com.zelix.lkc;
import com.zelix.ll;
import com.zelix.m44;
import com.zelix.zn;

public class lf
extends l7
implements fq {
    private String q;

    public lf(int n10) {
        super(n10);
    }

    @Override
    public void F(zn zn2, lkc lkc2, long l10) {
        long l11 = l10;
        long l12 = l11 ^ 0L;
        long l13 = l11 ^ 0x65F3B9619432L;
        this.g(0).F(this, lkc2, l12);
        Object[] objectArray = new Object[2];
        objectArray[1] = l13;
        objectArray[0] = m44.a("v", (Object)this, (long)-3513378138356164200L, (long)l10);
        m44.a("w", (Object)((ll)zn2), (Object)objectArray, (long)-4000895254596566013L, (long)l10);
    }

    @Override
    public void e(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        m44.a("t", (Object)this, (String)string, (long)1568843475852231520L, (long)l10);
    }
}

