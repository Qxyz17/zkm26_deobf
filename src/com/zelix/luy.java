/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.oo;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class luy
extends lmc {
    final oo R;
    private static final long a = prr.a((long)-250065320840540672L, (long)-4658769366093166313L, MethodHandles.lookup().lookupClass()).a(200871976466646L);

    luy(oo oo2) {
        this.R = oo2;
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x1E94770DADBFL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)5264128759563630902L, (long)l), (Object)objectArray2, (long)5750894493690777581L, (long)l);
    }

    public void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        long l2 = l ^ 0x5E25607B8A43L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = (Integer)object;
        objectArray2[0] = l2;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)2514949016080985211L, (long)l);
    }

    public void N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Integer n = (Integer)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x12CB215E00E1L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n;
        objectArray2[1] = l2;
        objectArray2[0] = m44.a("v", (Object)((Object)this), (long)-7285237912761603362L, (long)l);
        m44.a("h", (Object)objectArray2, (long)-9031557202023836959L, (long)l);
    }
}
