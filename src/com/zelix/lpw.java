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
    private static final long f = prr.a((long)-6319922573117676038L, (long)649692586846621887L, MethodHandles.lookup().lookupClass()).a(201431399034316L);

    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        lqu lqu2 = (lqu)objectArray[2];
        long l2 = l ^ 0x14FD1E076DF7L;
        CallSite callSite = m44.a("o", (long)-3694669019882315903L, (long)l);
        for (int i = 0; i < n; ++i) {
            lmu lmu2 = this.V(i);
            m44.a("q", (Object)((Object)this), (long)-3576477240636909745L, (long)l).add(lmu2);
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = l2;
            objectArray2[1] = lqu2;
            objectArray2[0] = this;
            m44.a("p", (Object)lmu2, (Object)objectArray2, (long)-3578199781868373330L, (long)l);
            if (callSite == false) continue;
        }
    }

    protected abstract void l(Object[] var1);

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x43EA633718BEL;
        long l4 = l2 ^ 0x520E4DC19516L;
        long l5 = l2 ^ 0x14FD1E076DF7L;
        long l6 = l2 ^ 0x408CF84350F9L;
        long l7 = l2 ^ 0x1A86BD711C75L;
        long l8 = l2 ^ 0x2C69CF006FB0L;
        long l9 = l2 ^ 0x47526B4E5A06L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l8;
        CallSite callSite = m44.a("w", (Object)lqu2, (Object)objectArray2, (long)-6410373196425327712L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        CallSite callSite2 = m44.a("w", (Object)lqu2, (Object)objectArray3, (long)-5092376014320582940L, (long)l);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l6;
        CallSite callSite3 = m44.a("w", (Object)lqu2, (Object)objectArray4, (long)-5139488470093813520L, (long)l);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l4;
        objectArray5[0] = lqu2;
        m44.a("w", (Object)((Object)this), (Object)objectArray5, (long)-6812385692037393789L, (long)l);
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l9;
        CallSite callSite4 = m44.a("w", (Object)((Object)this), (Object)objectArray6, (long)-4972914505230991179L, (long)l);
        Object[] objectArray7 = new Object[3];
        objectArray7[2] = lqu2;
        objectArray7[1] = (int)callSite4;
        objectArray7[0] = l5;
        m44.a("w", (Object)((Object)this), (Object)objectArray7, (long)-6807348192378925840L, (long)l);
        Object[] objectArray8 = new Object[5];
        objectArray8[4] = (int)callSite3;
        objectArray8[3] = (int)callSite2;
        objectArray8[2] = l7;
        objectArray8[1] = (int)callSite;
        objectArray8[0] = lqu2;
        m44.a("w", (Object)((Object)this), (Object)objectArray8, (long)-5002077808259172358L, (long)l);
    }

    public lpw(int n, long l) {
        long l2 = (l = f ^ l) ^ 0x87E260849FBL;
        super(l2, n);
        m44.a("w", (Object)((Object)this), new ArrayList(), (long)-4847585083103369813L, (long)l);
    }
}
