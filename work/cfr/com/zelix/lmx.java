/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.ti;
import java.lang.invoke.MethodHandles;

public class lmx
extends lmc {
    final ti u;
    private static final long a = prr.a(-1626146895262055969L, -6576075337048240050L, MethodHandles.lookup().lookupClass()).a(206794429502240L);

    @Override
    public void h(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        long l11 = l10 ^ 0x147A14AB23AEL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = (String)object;
        m44.a("u", (Object)this, (Object)objectArray2, (long)2582979999136253777L, (long)l10);
    }

    public void T(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x2C4479B317D6L;
        long l13 = l11 ^ 0x52B1E0693BC2L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l13;
        objectArray2[0] = string;
        m44.a("t", (Object)m44.a("u", (Object)this, (long)7947790384713632950L, (long)l10), (Object)objectArray2, (long)8345070969870609181L, (long)l10);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l12;
        m44.a("t", (Object)m44.a("u", (Object)this, (long)7947790384713632950L, (long)l10), (Object)objectArray3, (long)8392348066669935500L, (long)l10);
        m44.a("t", (Object)m44.a("u", (Object)this, (long)7947790384713632950L, (long)l10), (long)7767833457505245402L, (long)l10);
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        m44.a("w", (Object)m44.a("v", (Object)this, (long)5829699411604943389L, (long)l10), (long)6154057681262192241L, (long)l10);
    }

    lmx(ti ti2) {
        this.u = ti2;
    }
}

