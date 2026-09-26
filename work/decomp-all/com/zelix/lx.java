/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.jm;
import com.zelix.le;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.zn;

public class lx
extends le {
    public void z(Object[] objectArray) {
        long l = (Long)objectArray[0];
        zn zn2 = (zn)objectArray[1];
        lkc lkc2 = (lkc)objectArray[2];
        long l2 = l ^ 0x47CA8F3C709DL;
        jm jm2 = (jm)zn2;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = m44.a("v", (Object)((Object)this), (long)-3827577071898491805L, (long)l);
        m44.a("w", (Object)jm2, (Object)objectArray2, (long)-2914101492506939287L, (long)l);
    }

    public lx(int n) {
        super(n);
    }
}
