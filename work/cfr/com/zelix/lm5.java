/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.mu;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lm5
extends lmc {
    final mu I;
    private static final long a = prr.a(7051819215953896485L, -2654777127476226456L, MethodHandles.lookup().lookupClass()).a(276996134212824L);

    public void s(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Integer n10 = (Integer)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x7202146FC0A9L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n10;
        objectArray2[1] = l11;
        objectArray2[0] = m44.a("v", (Object)this, (long)-911765209059557233L, (long)l10);
        m44.a("h", (Object)objectArray2, (long)-1565960214153989310L, (long)l10);
    }

    @Override
    public void h(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        long l11 = l10 ^ 0x13E0A7CF7D37L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = (Integer)object;
        objectArray2[0] = l11;
        m44.a("u", (Object)this, (Object)objectArray2, (long)2325918099030500272L, (long)l10);
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)5273861296129293031L, (long)l10), (Object)objectArray2, (long)5340913355038057039L, (long)l10);
    }

    lm5(mu mu2) {
        this.I = mu2;
    }
}

