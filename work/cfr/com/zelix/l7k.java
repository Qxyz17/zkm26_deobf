/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7q;
import com.zelix.lqj;
import com.zelix.lyq;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public abstract class l7k
extends l7q {
    lyq s;
    private static final long d = prr.a(-5733766050052924763L, -7195553472023250791L, MethodHandles.lookup().lookupClass()).a(211493757871359L);

    public void S(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        lyq lyq2 = (lyq)objectArray[1];
        l10 = d ^ l10;
        m44.a("p", (Object)this, (lyq)lyq2, (long)7957172725858089691L, (long)l10);
    }

    void U(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10 = d ^ l10;
        long l12 = l11 ^ 0x19C8F16E51DL;
        long l13 = l11 ^ 0x12583E0A4B2DL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l13;
        lqj lqj2 = (lqj)((Object)m44.a("s", (Object)this, (Object)objectArray2, (long)-6415970355999341507L, (long)l10));
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = string;
        objectArray3[0] = l12;
        m44.a("s", (Object)lqj2, (Object)objectArray3, (long)-5158030736890146424L, (long)l10);
    }

    public l7k(long l10, int n10) {
        long l11 = (l10 = d ^ l10) ^ 0x69A7BEE7F144L;
        super(n10, l11);
    }
}

