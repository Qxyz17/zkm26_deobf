/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.t0;

public class lmi
extends lmc {
    final t0 V;

    lmi(t0 t02) {
        this.V = t02;
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x3E97CD64F2B9L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)6285622031132125291L, (long)l10), (Object)objectArray2, (long)5949297936964547512L, (long)l10);
    }
}

