/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.jp;
import com.zelix.le;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.zn;

public class li
extends le {
    @Override
    public void z(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        zn zn2 = (zn)objectArray[1];
        lkc lkc2 = (lkc)objectArray[2];
        long l11 = l10 ^ 0x2A3B4253A8BDL;
        jp jp2 = (jp)zn2;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = m44.a("v", (Object)this, (long)-3827577071898491805L, (long)l10);
        m44.a("w", (Object)jp2, (Object)objectArray2, (long)-2918762488688908367L, (long)l10);
    }

    public li(int n10) {
        super(n10);
    }
}

