/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cm;
import com.zelix.eg;
import com.zelix.m44;
import com.zelix.nq;
import com.zelix.prr;
import com.zelix.rq;
import com.zelix.ue;
import java.lang.invoke.MethodHandles;

public class cq
extends cm
implements nq,
eg {
    private String F;
    private static final long a = prr.a((long)5872543379861856155L, (long)-8151158543584215974L, MethodHandles.lookup().lookupClass()).a(9344590955629L);

    public void A(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        m44.a("p", (Object)((Object)this), (String)string, (long)6810618055670256404L, (long)l);
    }

    public void o(Object[] objectArray) {
        rq rq2 = (rq)objectArray[0];
        ue ue2 = (ue)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = ue2;
        objectArray2[0] = rq2;
        super.o(objectArray2);
    }

    public cq(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x331558372237L;
        int n2 = (int)(l2 >>> 32);
        long l3 = l2 << 32 >>> 32;
        super(n, n2, l3);
    }

    public void k(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        ue ue2 = (ue)objectArray[2];
        long l2 = l ^ 0x7F96CB1BD484L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = m44.a("p", (Object)((Object)this), (long)663508757875370087L, (long)l);
        objectArray2[3] = m44.a("p", (Object)((Object)this), (long)593349451663564056L, (long)l);
        objectArray2[2] = l2;
        objectArray2[1] = m44.a("p", (Object)((Object)this), (long)988050177621557286L, (long)l);
        objectArray2[0] = string;
        m44.a("q", (Object)ue2, (Object)objectArray2, (long)1673996350158906055L, (long)l);
    }
}
