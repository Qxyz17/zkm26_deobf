/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lu4;
import com.zelix.m44;
import com.zelix.mu;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lu1
extends lu4 {
    final mu Q;
    private static final long a = prr.a(7358004016568556809L, 7126998236689531670L, MethodHandles.lookup().lookupClass()).a(243748581661705L);

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)6107428293875348035L, (long)l10), (Object)objectArray2, (long)5340913355038057039L, (long)l10);
    }

    lu1(mu mu2, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x5845E87478BAL;
        this.Q = mu2;
        super(l11);
    }

    @Override
    public void h(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        long l11 = l10 ^ 0x1F0C0345BBF1L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = (Integer)object;
        m44.a("u", (Object)this, (Object)objectArray2, (long)2415412770982403367L, (long)l10);
    }

    public void i(Object[] objectArray) {
        Integer n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x69FCE808B623L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n10;
        objectArray2[1] = l11;
        objectArray2[0] = m44.a("v", (Object)this, (long)7627296678603460443L, (long)l10);
        m44.a("h", (Object)objectArray2, (long)8417346624030764311L, (long)l10);
    }
}

