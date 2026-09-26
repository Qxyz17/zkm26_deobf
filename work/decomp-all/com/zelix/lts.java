/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.l7w;
import com.zelix.lkx;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.ltt;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lts
extends l7t
implements lkx {
    private static final long a = prr.a((long)5514494196496554620L, (long)-3796010823705569634L, MethodHandles.lookup().lookupClass()).a(268865197041828L);

    public lts(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x331981796BF7L;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
    }

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0L;
        long l4 = l2 ^ 0x47526B4E5A06L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        CallSite callSite = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l);
        l7w l7w2 = (l7w)this.V(0);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l3;
        objectArray3[1] = lqu2;
        objectArray3[0] = this;
        m44.a("w", (Object)l7w2, (Object)objectArray3, (long)-6602119905102302105L, (long)l);
    }

    public void z(Object[] objectArray) {
        l7w l7w2 = (l7w)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l;
        long l3 = l2 ^ 0x2F94F4896091L;
        long l4 = l2 ^ 0x66D68EA4626EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l7w2;
        objectArray3[0] = l3;
        m44.a("p", (Object)((ltt)m44.a("p", (Object)((Object)this), (Object)objectArray2, (long)-8091120822945108610L, (long)l)), (Object)objectArray3, (long)-7867683872687975980L, (long)l);
    }
}
