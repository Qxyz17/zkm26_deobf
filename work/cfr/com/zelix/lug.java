/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.luc;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.uq;
import java.lang.invoke.MethodHandles;

public class lug
extends lmc {
    final uq O;
    private static final long a = prr.a(3879771085301415620L, -1235071845664222166L, MethodHandles.lookup().lookupClass()).a(225129519454095L);

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x5D4B166E4749L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)6257587963210532499L, (long)l10), (Object)objectArray2, (long)5440721018187912544L, (long)l10);
    }

    @Override
    public void h(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        long l11 = l10 ^ 0x3098438CDAAAL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = (Integer)object;
        m44.a("u", (Object)this, (Object)objectArray2, (long)2557373903866383496L, (long)l10);
    }

    public void Q(Object[] objectArray) {
        Integer n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x3477CB70D307L;
        luc luc2 = new luc(this);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l11;
        objectArray2[1] = luc2;
        objectArray2[0] = n10;
        m44.a("r", (Object)m44.a("s", (Object)this, (long)-4759709037475304010L, (long)l10), (Object)objectArray2, (long)-6757879360170736559L, (long)l10);
    }

    lug(uq uq2) {
        this.O = uq2;
    }
}

