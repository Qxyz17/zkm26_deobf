/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lm2;
import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.sp;
import java.lang.invoke.MethodHandles;

public class lm3
extends lmc {
    final lm2 I;
    private static final long a = prr.a(677331652043935662L, 3661647630325563661L, MethodHandles.lookup().lookupClass()).a(146885275560033L);

    lm3(lm2 lm22) {
        this.I = lm22;
    }

    public void m(Object[] objectArray) {
        sp sp2 = (sp)objectArray[0];
        Integer n10 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x6B7C21304AC4L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l11;
        objectArray2[1] = n10;
        objectArray2[0] = sp2;
        m44.a("s", (Object)m44.a("r", (Object)m44.a("r", (Object)this, (long)-3283234841695856210L, (long)l10), (long)-3184888974249712771L, (long)l10), (Object)objectArray2, (long)-3653997525316751365L, (long)l10);
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x1E94770DADBFL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("w", (Object)m44.a("v", (Object)m44.a("v", (Object)this, (long)5887278522941102706L, (long)l10), (long)5769475660157362337L, (long)l10), (Object)objectArray2, (long)5750894493690777581L, (long)l10);
    }

    @Override
    public void H(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0x570978C539E9L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l11;
        objectArray2[1] = (Integer)object2;
        objectArray2[0] = (sp)object;
        m44.a("u", (Object)this, (Object)objectArray2, (long)6180238128811389680L, (long)l10);
    }
}

