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
    private static final long a = prr.a((long)3879771085301415620L, (long)-1235071845664222166L, MethodHandles.lookup().lookupClass()).a(225129519454095L);

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x5D4B166E4749L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)6257587963210532499L, (long)l), (Object)objectArray2, (long)5440721018187912544L, (long)l);
    }

    public void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        long l2 = l ^ 0x3098438CDAAAL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = (Integer)object;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)2557373903866383496L, (long)l);
    }

    public void Q(Object[] objectArray) {
        Integer n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x3477CB70D307L;
        luc luc2 = new luc(this);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = luc2;
        objectArray2[0] = n;
        m44.a("r", (Object)m44.a("s", (Object)((Object)this), (long)-4759709037475304010L, (long)l), (Object)objectArray2, (long)-6757879360170736559L, (long)l);
    }

    lug(uq uq2) {
        this.O = uq2;
    }
}
