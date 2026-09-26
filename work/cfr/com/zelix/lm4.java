/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.mu;

public class lm4
extends lmc {
    final mu Y;

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x6E04D0CA93ECL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = m44.a("v", (Object)this, (long)6085486209835534607L, (long)l10);
        m44.a("h", (Object)objectArray2, (long)5467830043550421481L, (long)l10);
    }

    lm4(mu mu2) {
        this.Y = mu2;
    }
}

