/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fq;
import com.zelix.l7;
import com.zelix.l_;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.zn;

public class lr
extends l7
implements fq {
    private String s;

    @Override
    public void e(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        m44.a("t", (Object)this, (String)string, (long)627952078726853425L, (long)l10);
    }

    @Override
    public void F(zn zn2, lkc lkc2, long l10) {
        long l11 = l10;
        long l12 = l11 ^ 0L;
        long l13 = l11 ^ 0x322078C95170L;
        int n10 = (int)(l13 >>> 32);
        int n11 = (int)(l13 << 32 >>> 48);
        int n12 = (int)(l13 << 48 >>> 48);
        this.g(0).F(this, lkc2, l12);
        Object[] objectArray = new Object[4];
        objectArray[3] = (int)((char)n12);
        objectArray[2] = n11;
        objectArray[1] = m44.a("v", (Object)this, (long)-3292499731387799095L, (long)l10);
        objectArray[0] = n10;
        m44.a("w", (Object)((l_)zn2), (Object)objectArray, (long)-3291297270823624882L, (long)l10);
    }

    public lr(int n10) {
        super(n10);
    }
}

