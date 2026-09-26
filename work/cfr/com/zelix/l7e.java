/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7_;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lt9;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public abstract class l7e
extends l7_ {
    private lt9 X;
    private String F;
    private static final long d = prr.a(5246925231823524399L, -2141001447498946624L, MethodHandles.lookup().lookupClass()).a(168542636213522L);

    protected void Y(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = d ^ l10;
        m44.a("t", (Object)this, (String)string, (long)-1715801011492792833L, (long)l10);
    }

    @Override
    protected String y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        try {
            if (n10 == 0) {
                return m44.a("v", (Object)m44.a("w", (Object)this, (long)8723374816936127742L, (long)l10), (Object)new Object[0], (long)8740419197047558274L, (long)l10);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("i", (Object)illegalArgumentException, (long)7281569698715735971L, (long)l10);
        }
        throw new IllegalArgumentException((String)((Object)m44.a("i", (int)n10, (long)9112152124006700027L, (long)l10)));
    }

    public l7e(long l10, int n10) {
        long l11 = (l10 = d ^ l10) ^ 0x44711B6CD5B1L;
        super(l11, n10);
    }

    @Override
    protected String n(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return m44.a("w", (Object)this, (long)-605415931362522538L, (long)l10);
    }

    @Override
    protected int d(Object[] objectArray) {
        int n10;
        long l10 = (Long)objectArray[0];
        try {
            n10 = m44.a("w", (Object)this, (long)-4084867380349283650L, (long)l10) != null ? 1 : 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("i", (Object)illegalArgumentException, (long)-2644368482613810717L, (long)l10);
        }
        return n10;
    }

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        m44.a("t", (Object)this, (lt9)((lt9)this.V(0)), (long)-4949766509576573249L, (long)l10);
    }

    private static IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}

