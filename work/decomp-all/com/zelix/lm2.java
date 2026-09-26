/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lm3;
import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.oq;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lm2
extends lmc {
    final oq h;
    private static final long a = prr.a((long)-4560422936466487153L, (long)3383762449106298638L, MethodHandles.lookup().lookupClass()).a(239260731584432L);

    lm2(oq oq2) {
        this.h = oq2;
    }

    public void p(Object[] objectArray) {
        Integer n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x1C707FB06533L;
        lm3 lm32 = new lm3(this);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = lm32;
        objectArray2[1] = l2;
        objectArray2[0] = n;
        m44.a("s", (Object)m44.a("r", (Object)((Object)this), (long)7738623856408992725L, (long)l), (Object)objectArray2, (long)8501118303120836838L, (long)l);
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x1E94770DADBFL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)5769475660157362337L, (long)l), (Object)objectArray2, (long)5750894493690777581L, (long)l);
    }

    public void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        long l2 = l ^ 0x12CB0784BA22L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = (Integer)object;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)2784816062391628335L, (long)l);
    }
}
