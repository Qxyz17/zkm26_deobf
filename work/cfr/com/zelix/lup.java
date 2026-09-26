/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.oo;
import com.zelix.prr;
import com.zelix.sp;
import java.lang.invoke.MethodHandles;

public class lup
extends lmc {
    final oo o;
    private static final long a = prr.a(7012044928825430745L, 2399728678157869217L, MethodHandles.lookup().lookupClass()).a(213350849874854L);

    public void J(Object[] objectArray) {
        sp sp2 = (sp)objectArray[0];
        long l10 = (Long)objectArray[1];
        Integer n10 = (Integer)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x7BE3D880110AL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l11;
        objectArray2[1] = n10;
        objectArray2[0] = sp2;
        m44.a("u", (Object)m44.a("t", (Object)this, (long)-8524282658976604774L, (long)l10), (Object)objectArray2, (long)-8036366060605956061L, (long)l10);
    }

    lup(oo oo2) {
        this.o = oo2;
    }

    @Override
    public void H(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0x690C3D2B5DAEL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (Integer)object2;
        objectArray2[1] = l11;
        objectArray2[0] = (sp)object;
        m44.a("u", (Object)this, (Object)objectArray2, (long)6329158142144496580L, (long)l10);
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x1E94770DADBFL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)5882247963549730184L, (long)l10), (Object)objectArray2, (long)5750894493690777581L, (long)l10);
    }
}

