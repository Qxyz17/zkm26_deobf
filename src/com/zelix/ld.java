/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lbq;
import com.zelix.le;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.zn;

public class ld
extends le {
    public void z(Object[] objectArray) {
        long l = (Long)objectArray[0];
        zn zn2 = (zn)objectArray[1];
        lkc lkc2 = (lkc)objectArray[2];
        long l2 = l ^ 0x6EF77B883807L;
        lbq lbq2 = (lbq)zn2;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = m44.a("v", (Object)((Object)this), (long)-3827577071898491805L, (long)l);
        objectArray2[0] = l2;
        m44.a("w", (Object)lbq2, (Object)objectArray2, (long)-2902526775963014872L, (long)l);
    }

    public ld(int n) {
        super(n);
    }
}
