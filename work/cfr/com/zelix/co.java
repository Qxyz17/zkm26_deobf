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
import java.util.List;

public class co
extends cm
implements nq,
eg {
    List A;
    private String L;
    private static final long a = prr.a(-8590576398518822663L, 1633799342949263913L, MethodHandles.lookup().lookupClass()).a(227249499612475L);

    void d(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        List list = (List)objectArray[1];
        l10 = a ^ l10;
        m44.a("p", (Object)this, (List)list, (long)6691928969505638135L, (long)l10);
    }

    public co(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x212A69914FF3L;
        int n11 = (int)(l11 >>> 32);
        long l12 = l11 << 32 >>> 32;
        super(n10, n11, l12);
    }

    @Override
    public void A(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        m44.a("p", (Object)this, (String)string, (long)6752090237241416763L, (long)l10);
    }

    @Override
    public void k(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        ue ue2 = (ue)objectArray[2];
        long l11 = l10 ^ 0x2B44A800078DL;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = m44.a("p", (Object)this, (long)843510369032589725L, (long)l10);
        objectArray2[4] = m44.a("p", (Object)this, (long)663508757875370087L, (long)l10);
        objectArray2[3] = m44.a("p", (Object)this, (long)593349451663564056L, (long)l10);
        objectArray2[2] = m44.a("p", (Object)this, (long)1046613181530312457L, (long)l10);
        objectArray2[1] = string;
        objectArray2[0] = l11;
        m44.a("q", (Object)ue2, (Object)objectArray2, (long)1546071008626530485L, (long)l10);
    }

    @Override
    public void o(Object[] objectArray) {
        rq rq2 = (rq)objectArray[0];
        ue ue2 = (ue)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l11;
        objectArray2[1] = ue2;
        objectArray2[0] = rq2;
        super.o(objectArray2);
    }
}

