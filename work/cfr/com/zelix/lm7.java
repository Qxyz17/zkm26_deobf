/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lkp;
import com.zelix.loz;
import com.zelix.lqe;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lm7
implements lkp,
loz {
    private lqe x;
    private int R;
    private static final long a = prr.a(2114836737545154514L, -2294143690730023421L, MethodHandles.lookup().lookupClass()).a(23368690966989L);

    @Override
    public void b(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
    }

    lm7(lqe lqe2, int n10, long l10) {
        l10 = a ^ l10;
        m44.a("p", (Object)this, (lqe)lqe2, (long)4267728951142042022L, (long)l10);
        m44.a("p", (Object)this, (int)n10, (long)4343642880209571794L, (long)l10);
    }

    @Override
    public String v(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return null;
    }

    @Override
    public int u(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x3EDA806E05DEL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = (int)m44.a("w", (Object)this, (long)-2838751229363279089L, (long)l10);
        objectArray2[0] = l11;
        return (int)m44.a("v", (Object)m44.a("w", (Object)this, (long)-2312873024024859269L, (long)l10), (Object)objectArray2, (long)-2667278637087635317L, (long)l10);
    }

    @Override
    public boolean t(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    @Override
    public boolean m(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    @Override
    public boolean s(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    @Override
    public boolean P(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    @Override
    public boolean k(Object[] objectArray) {
        boolean bl2 = (Boolean)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10 ^ 0x17E636692EF6L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = (int)m44.a("r", (Object)this, (long)3692923406818328746L, (long)l10);
        return (boolean)m44.a("s", (Object)m44.a("r", (Object)this, (long)3765671971842606814L, (long)l10), (Object)objectArray2, (long)3379603323468226410L, (long)l10);
    }
}

