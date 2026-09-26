/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.lqd;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.s4;
import java.lang.invoke.MethodHandles;

public class lu7
extends lmc {
    final lqd q;
    private static final long a = prr.a(-4060386543645070798L, 1581106432538053593L, MethodHandles.lookup().lookupClass()).a(155237297977238L);

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x3CEF0F11CCFL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)5688417014059312193L, (long)l10), (Object)objectArray2, (long)5437079250985013231L, (long)l10);
    }

    lu7(lqd lqd2) {
        this.q = lqd2;
    }

    public void k(Object[] objectArray) {
        s4 s42 = (s4)objectArray[0];
        Integer n10 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x661992B3B065L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = n10;
        objectArray2[2] = l11;
        objectArray2[1] = s42;
        objectArray2[0] = m44.a("s", (Object)this, (long)2072917416981067380L, (long)l10);
        m44.a("m", (Object)objectArray2, (long)417962028088585744L, (long)l10);
    }

    @Override
    public void H(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0x36E94CF7065FL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l11;
        objectArray2[1] = (Integer)object2;
        objectArray2[0] = (s4)object;
        m44.a("u", (Object)this, (Object)objectArray2, (long)5242183000141088060L, (long)l10);
    }
}

