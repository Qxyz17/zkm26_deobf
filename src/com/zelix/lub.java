/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.mq;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lub
extends lmc {
    final mq O;
    private static final long a = prr.a((long)-3041609706372696271L, (long)-4331923184604665316L, MethodHandles.lookup().lookupClass()).a(43841963271774L);

    public void K(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Integer n = (Integer)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x1A9FD7AFEE93L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n;
        objectArray2[1] = m44.a("t", (Object)((Object)this), (long)-517530931848717899L, (long)l);
        objectArray2[0] = l2;
        m44.a("j", (Object)objectArray2, (long)-2135414035977570820L, (long)l);
    }

    lub(mq mq2) {
        this.O = mq2;
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)5974960906110694287L, (long)l), (Object)objectArray2, (long)6119582912316436286L, (long)l);
    }

    public void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        long l2 = l ^ 0x3525784F6119L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = (Integer)object;
        objectArray2[0] = l2;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)2723070585390044997L, (long)l);
    }
}
