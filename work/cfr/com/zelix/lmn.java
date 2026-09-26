/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.mu;
import com.zelix.prr;
import com.zelix.qr;
import java.lang.invoke.MethodHandles;

public class lmn
extends lmc {
    final mu M;
    private static final long a = prr.a(-4832160445391021999L, 2700310012980198614L, MethodHandles.lookup().lookupClass()).a(136153092383387L);

    lmn(mu mu2) {
        this.M = mu2;
    }

    public void D(Object[] objectArray) {
        qr qr2 = (qr)objectArray[0];
        Integer n10 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x397DAC77DD62L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l11;
        objectArray2[2] = n10;
        objectArray2[1] = qr2;
        objectArray2[0] = m44.a("p", (Object)this, (long)-6725793553865566667L, (long)l10);
        m44.a("n", (Object)objectArray2, (long)-4651006349274250337L, (long)l10);
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)5606762276504336723L, (long)l10), (Object)objectArray2, (long)5340913355038057039L, (long)l10);
    }

    @Override
    public void H(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0x1CCC6D56E2A9L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l11;
        objectArray2[1] = (Integer)object2;
        objectArray2[0] = (qr)object;
        m44.a("u", (Object)this, (Object)objectArray2, (long)5206784191408853080L, (long)l10);
    }
}

