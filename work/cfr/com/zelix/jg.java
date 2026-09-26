/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fq;
import com.zelix.j6;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.zn;

public class jg
extends j6 {
    public jg(int n10) {
        super(n10);
    }

    @Override
    public void F(zn zn2, lkc lkc2, long l10) {
        long l11 = l10 ^ 0x5FE6E3F4DAF8L;
        fq fq2 = (fq)((Object)zn2);
        Object[] objectArray = new Object[2];
        objectArray[1] = l11;
        objectArray[0] = this.A();
        m44.a("w", (Object)fq2, (Object)objectArray, (long)-4026298791907527947L, (long)l10);
    }
}

