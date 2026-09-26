/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.lms;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.ti;
import java.lang.invoke.MethodHandles;

public class lme
extends lmc {
    final ti V;
    private static final long a = prr.a(-4706229629426988295L, 5596089436743012514L, MethodHandles.lookup().lookupClass()).a(263174614317547L);

    public void S(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x565D8F8821CBL;
        lms lms2 = new lms(this);
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l11;
        objectArray2[2] = lms2;
        objectArray2[1] = null;
        objectArray2[0] = string;
        m44.a("r", (Object)m44.a("s", (Object)this, (long)4003371917539752543L, (long)l10), (Object)objectArray2, (long)3193070518372395330L, (long)l10);
    }

    @Override
    public void h(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        long l11 = l10 ^ 0x2378D3B92EC6L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = (String)object;
        objectArray2[0] = l11;
        m44.a("u", (Object)this, (Object)objectArray2, (long)4608846339628364205L, (long)l10);
    }

    lme(ti ti2) {
        this.V = ti2;
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
    }
}

