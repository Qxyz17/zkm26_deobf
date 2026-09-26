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
    public jg(int n) {
        super(n);
    }

    public void F(zn zn2, lkc lkc2, long l) {
        long l2 = l ^ 0x5FE6E3F4DAF8L;
        fq fq2 = (fq)zn2;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this.A();
        m44.a("w", (Object)fq2, (Object)objectArray, (long)-4026298791907527947L, (long)l);
    }
}
