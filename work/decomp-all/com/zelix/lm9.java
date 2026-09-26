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
    private static final long a = prr.a((long)2778910059421631504L, (long)-5577216530987635017L, MethodHandles.lookup().lookupClass()).a(56732629079041L);

    public void X(Object[] objectArray) {
        Integer n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x232674C22620L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n;
        objectArray2[1] = m44.a("v", (Object)((Object)this), (long)8617958976977743563L, (long)l);
        objectArray2[0] = l2;
        m44.a("h", (Object)objectArray2, (long)7886500793033775218L, (long)l);
    }

    public void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        long l2 = l ^ 0x51DB1014027CL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = (Integer)object;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)4236633270138183454L, (long)l);
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)5413694337342214771L, (long)l), (Object)objectArray2, (long)5340913355038057039L, (long)l);
    }

    lm9(mu mu2) {
        this.J = mu2;
    }
}
