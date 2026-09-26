/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.lme;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lms
extends lmc {
    final lme R;
    private static final long a = prr.a(-1342411652887302177L, 4559106548099242358L, MethodHandles.lookup().lookupClass()).a(208119997986115L);

    public void p(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x2615D616F022L;
        long l13 = l11 ^ 0x18781E86F226L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = string;
        objectArray2[0] = l12;
        m44.a("t", (Object)m44.a("u", (Object)m44.a("u", (Object)this, (long)-8072360031405638770L, (long)l10), (long)-8097300984994364815L, (long)l10), (Object)objectArray2, (long)-8391274000402399077L, (long)l10);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l13;
        m44.a("t", (Object)m44.a("u", (Object)m44.a("u", (Object)this, (long)-8072360031405638770L, (long)l10), (long)-8097300984994364815L, (long)l10), (Object)objectArray3, (long)-7960208934009446788L, (long)l10);
        m44.a("t", (Object)m44.a("u", (Object)m44.a("u", (Object)m44.a("u", (Object)this, (long)-8072360031405638770L, (long)l10), (long)-8097300984994364815L, (long)l10), (long)-7847585523546489367L, (long)l10), (int)(m44.a("t", (Object)m44.a("u", (Object)m44.a("u", (Object)m44.a("u", (Object)this, (long)-8072360031405638770L, (long)l10), (long)-8097300984994364815L, (long)l10), (long)-8508664620295133977L, (long)l10), (long)-7926297660319145537L, (long)l10) - true), (long)-7781557092025988467L, (long)l10);
        m44.a("t", (Object)m44.a("u", (Object)m44.a("u", (Object)this, (long)-8072360031405638770L, (long)l10), (long)-8097300984994364815L, (long)l10), (long)-8197440397966082774L, (long)l10);
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        m44.a("w", (Object)m44.a("v", (Object)m44.a("v", (Object)this, (long)6098571994145464533L, (long)l10), (long)6123723547456264490L, (long)l10), (long)6154057681262192241L, (long)l10);
    }

    lms(lme lme2) {
        this.R = lme2;
    }

    @Override
    public void h(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        long l11 = l10 ^ 0x4D70C889E34FL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = (String)object;
        m44.a("u", (Object)this, (Object)objectArray2, (long)4563099959038152003L, (long)l10);
    }
}

