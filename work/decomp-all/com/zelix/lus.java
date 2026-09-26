/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.s4;
import com.zelix.wa;
import java.lang.invoke.MethodHandles;

public class lus
extends lmc {
    final wa J;
    private static final long a = prr.a((long)-1742674313392981009L, (long)-8481257850231871243L, MethodHandles.lookup().lookupClass()).a(33071231281607L);

    lus(wa wa2) {
        this.J = wa2;
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x56B22D5AB9DEL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = false;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)5365113413485751072L, (long)l), (Object)objectArray2, (long)6230706247764054053L, (long)l);
    }

    public void H(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0x2E2B2941F0BDL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = (Integer)object2;
        objectArray2[0] = (s4)object;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)6329004639639590938L, (long)l);
    }

    public void G(Object[] objectArray) {
        s4 s42 = (s4)objectArray[0];
        Integer n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x3A26D86C393FL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = false;
        m44.a("v", (Object)m44.a("w", (Object)((Object)this), (long)-3848929867207349311L, (long)l), (Object)objectArray2, (long)-2984049514349981500L, (long)l);
    }
}
