/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.e_;
import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.mq;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class luk
extends lmc {
    final mq v;
    private static final long a = prr.a((long)-8200156889911970688L, (long)-8669236412187225522L, MethodHandles.lookup().lookupClass()).a(149793740250038L);

    public void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        long l2 = l ^ 0x30D55FD2818EL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = (e_)object;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)2482467278494850554L, (long)l);
    }

    luk(mq mq2) {
        this.v = mq2;
    }

    public void S(Object[] objectArray) {
        e_ e_2 = (e_)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x3C36AE202FCEL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = e_2;
        objectArray2[0] = m44.a("v", (Object)((Object)this), (long)6170399777433655491L, (long)l);
        m44.a("h", (Object)objectArray2, (long)6265087516108161012L, (long)l);
    }
}
