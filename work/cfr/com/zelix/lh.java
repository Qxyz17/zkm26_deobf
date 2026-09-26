/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.jk;
import com.zelix.le;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.zn;

public class lh
extends le {
    @Override
    public void z(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        zn zn2 = (zn)objectArray[1];
        lkc lkc2 = (lkc)objectArray[2];
        long l11 = l10 ^ 0x487959FBCBEFL;
        jk jk2 = (jk)zn2;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = m44.a("v", (Object)this, (long)-3827577071898491805L, (long)l10);
        objectArray2[0] = l11;
        m44.a("w", (Object)jk2, (Object)objectArray2, (long)-3371993374915244049L, (long)l10);
    }

    public lh(int n10) {
        super(n10);
    }
}

