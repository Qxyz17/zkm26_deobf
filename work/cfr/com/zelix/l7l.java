/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7_;
import com.zelix.l7e;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public abstract class l7l
extends l7_ {
    l7e F;
    private static final long d = prr.a(-7185959459708478627L, 6302113964679065899L, MethodHandles.lookup().lookupClass()).a(185824989145171L);

    public l7l(int n10, int n11, byte by2, int n12) {
        long l10 = ((long)n11 << 32 | (long)by2 << 56 >>> 32 | (long)n12 << 40 >>> 40) ^ d;
        long l11 = l10 ^ 0x3F0CA371A3E8L;
        super(l11, n10);
    }

    @Override
    protected int d(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (int)m44.a("v", (Object)m44.a("w", (Object)this, (long)-4060670304707010262L, (long)l10), (Object)objectArray2, (long)-4106350469297797885L, (long)l10);
    }

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0L;
        m44.a("t", (Object)this, (l7e)((l7e)this.V(0)), (long)-4925567414628426453L, (long)l10);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l11;
        objectArray2[1] = lqu2;
        objectArray2[0] = this;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)-4925567414628426453L, (long)l10), (Object)objectArray2, (long)-6357810452925924367L, (long)l10);
    }

    @Override
    protected String n(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("v", (Object)m44.a("w", (Object)this, (long)-1642125723378446406L, (long)l10), (Object)objectArray2, (long)-678822119101433067L, (long)l10);
    }

    @Override
    protected String y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = n10;
        objectArray2[0] = l11;
        return m44.a("v", (Object)m44.a("w", (Object)this, (long)8783598381052567402L, (long)l10), (Object)objectArray2, (long)7261414645153109704L, (long)l10);
    }
}

