/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.lug;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.qr;
import java.lang.invoke.MethodHandles;

public class luc
extends lmc {
    final lug X;
    private static final long a = prr.a((long)1775803091101660288L, (long)3577445909685848346L, MethodHandles.lookup().lookupClass()).a(149405514737784L);

    public void H(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0x40C534F84F42L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (Integer)object2;
        objectArray2[1] = (qr)object;
        objectArray2[0] = l2;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)6017186890225225114L, (long)l);
    }

    public void A(Object[] objectArray) {
        long l = (Long)objectArray[0];
        qr qr2 = (qr)objectArray[1];
        Integer n = (Integer)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x6A980103328AL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n;
        objectArray2[1] = qr2;
        objectArray2[0] = l2;
        m44.a("t", (Object)m44.a("u", (Object)m44.a("u", (Object)((Object)this), (long)1191839317886544669L, (long)l), (long)987537166708825584L, (long)l), (Object)objectArray2, (long)1579897575660597407L, (long)l);
    }

    luc(lug lug2) {
        this.X = lug2;
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x5D4B166E4749L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("v", (Object)m44.a("v", (Object)((Object)this), (long)5469981565209079934L, (long)l), (long)6257587963210532499L, (long)l), (Object)objectArray2, (long)5440721018187912544L, (long)l);
    }
}
