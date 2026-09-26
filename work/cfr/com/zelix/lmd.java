/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.mu;
import com.zelix.prr;
import com.zelix.sp;
import java.lang.invoke.MethodHandles;

public class lmd
extends lmc {
    final mu Z;
    private static final long a = prr.a(8391273565358002068L, 2273580708794637722L, MethodHandles.lookup().lookupClass()).a(110790954240572L);

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)6121465332494307676L, (long)l10), (Object)objectArray2, (long)5340913355038057039L, (long)l10);
    }

    @Override
    public void H(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0x1757DE7AD8B0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (Integer)object2;
        objectArray2[1] = (sp)object;
        objectArray2[0] = l11;
        m44.a("u", (Object)this, (Object)objectArray2, (long)6155267574803369327L, (long)l10);
    }

    public void b(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        sp sp2 = (sp)objectArray[1];
        Integer n10 = (Integer)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x44CCA3CC2E21L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = n10;
        objectArray2[2] = sp2;
        objectArray2[1] = l11;
        objectArray2[0] = m44.a("w", (Object)this, (long)-7923367465536137307L, (long)l10);
        m44.a("i", (Object)objectArray2, (long)-8036655313112112722L, (long)l10);
    }

    lmd(mu mu2) {
        this.Z = mu2;
    }
}

