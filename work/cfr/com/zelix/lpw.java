/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lyn;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public abstract class lpw
extends lyn {
    protected List B;
    private static final long f = prr.a(-6319922573117676038L, 649692586846621887L, MethodHandles.lookup().lookupClass()).a(201431399034316L);

    public void e(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        lqu lqu2 = (lqu)objectArray[2];
        long l11 = l10 ^ 0x14FD1E076DF7L;
        CallSite callSite = m44.a("o", (long)-3694669019882315903L, (long)l10);
        for (int i10 = 0; i10 < n10; ++i10) {
            lmu lmu2 = this.V(i10);
            m44.a("q", (Object)this, (long)-3576477240636909745L, (long)l10).add(lmu2);
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = l11;
            objectArray2[1] = lqu2;
            objectArray2[0] = this;
            m44.a("p", (Object)lmu2, (Object)objectArray2, (long)-3578199781868373330L, (long)l10);
            if (callSite == false) continue;
        }
    }

    protected abstract void l(Object[] var1);

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0x43EA633718BEL;
        long l13 = l11 ^ 0x520E4DC19516L;
        long l14 = l11 ^ 0x14FD1E076DF7L;
        long l15 = l11 ^ 0x408CF84350F9L;
        long l16 = l11 ^ 0x1A86BD711C75L;
        long l17 = l11 ^ 0x2C69CF006FB0L;
        long l18 = l11 ^ 0x47526B4E5A06L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l17;
        CallSite callSite = m44.a("w", (Object)lqu2, (Object)objectArray2, (long)-6410373196425327712L, (long)l10);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l12;
        CallSite callSite2 = m44.a("w", (Object)lqu2, (Object)objectArray3, (long)-5092376014320582940L, (long)l10);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l15;
        CallSite callSite3 = m44.a("w", (Object)lqu2, (Object)objectArray4, (long)-5139488470093813520L, (long)l10);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l13;
        objectArray5[0] = lqu2;
        m44.a("w", (Object)this, (Object)objectArray5, (long)-6812385692037393789L, (long)l10);
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l18;
        CallSite callSite4 = m44.a("w", (Object)this, (Object)objectArray6, (long)-4972914505230991179L, (long)l10);
        Object[] objectArray7 = new Object[3];
        objectArray7[2] = lqu2;
        objectArray7[1] = (int)callSite4;
        objectArray7[0] = l14;
        m44.a("w", (Object)this, (Object)objectArray7, (long)-6807348192378925840L, (long)l10);
        Object[] objectArray8 = new Object[5];
        objectArray8[4] = (int)callSite3;
        objectArray8[3] = (int)callSite2;
        objectArray8[2] = l16;
        objectArray8[1] = (int)callSite;
        objectArray8[0] = lqu2;
        m44.a("w", (Object)this, (Object)objectArray8, (long)-5002077808259172358L, (long)l10);
    }

    public lpw(int n10, long l10) {
        long l11 = (l10 = f ^ l10) ^ 0x87E260849FBL;
        super(l11, n10);
        m44.a("w", (Object)this, new ArrayList(), (long)-4847585083103369813L, (long)l10);
    }
}

