/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.mu;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lm9
extends lmc {
    final mu J;
    private static final long a = prr.a(2778910059421631504L, -5577216530987635017L, MethodHandles.lookup().lookupClass()).a(56732629079041L);

    public void X(Object[] objectArray) {
        Integer n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x232674C22620L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n10;
        objectArray2[1] = m44.a("v", (Object)this, (long)8617958976977743563L, (long)l10);
        objectArray2[0] = l11;
        m44.a("h", (Object)objectArray2, (long)7886500793033775218L, (long)l10);
    }

    @Override
    public void h(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        long l11 = l10 ^ 0x51DB1014027CL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = (Integer)object;
        m44.a("u", (Object)this, (Object)objectArray2, (long)4236633270138183454L, (long)l10);
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)5413694337342214771L, (long)l10), (Object)objectArray2, (long)5340913355038057039L, (long)l10);
    }

    lm9(mu mu2) {
        this.J = mu2;
    }
}

