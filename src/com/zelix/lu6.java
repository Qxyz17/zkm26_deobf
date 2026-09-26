/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.mq;
import com.zelix.prr;
import com.zelix.qr;
import java.lang.invoke.MethodHandles;

public class lu6
extends lmc {
    final mq I;
    private static final long a = prr.a((long)-4503657800320283381L, (long)749991347832419283L, MethodHandles.lookup().lookupClass()).a(108297973410980L);

    public void P(Object[] objectArray) {
        long l = (Long)objectArray[0];
        qr qr2 = (qr)objectArray[1];
        Integer n = (Integer)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x5CE4F8F15F75L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = n;
        objectArray2[1] = qr2;
        objectArray2[0] = m44.a("t", (Object)((Object)this), (long)-201075401813457548L, (long)l);
        m44.a("j", (Object)objectArray2, (long)-67172254874965276L, (long)l);
    }

    lu6(mq mq2) {
        this.I = mq2;
    }

    public void H(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0x3ADB09E60004L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (Integer)object2;
        objectArray2[1] = (qr)object;
        objectArray2[0] = l2;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)6286303003369686412L, (long)l);
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)5814036794161670382L, (long)l), (Object)objectArray2, (long)6119582912316436286L, (long)l);
    }
}
