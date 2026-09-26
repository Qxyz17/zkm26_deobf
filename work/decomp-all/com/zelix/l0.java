/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.le;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.rt;
import com.zelix.zn;

public class l0
extends le {
    public void z(Object[] objectArray) {
        long l = (Long)objectArray[0];
        zn zn2 = (zn)objectArray[1];
        lkc lkc2 = (lkc)objectArray[2];
        long l2 = l ^ 0x5FC9811E80DEL;
        rt rt2 = (rt)zn2;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = m44.a("v", (Object)((Object)this), (long)-3827577071898491805L, (long)l);
        m44.a("w", (Object)rt2, (Object)objectArray2, (long)-3879369996215122763L, (long)l);
    }

    public l0(int n) {
        super(n);
    }
}
