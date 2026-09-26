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
    private static final long a = prr.a((long)2114836737545154514L, (long)-2294143690730023421L, MethodHandles.lookup().lookupClass()).a(23368690966989L);

    public void b(Object[] objectArray) {
        long l = (Long)objectArray[0];
    }

    lm7(lqe lqe2, int n, long l) {
        l = a ^ l;
        m44.a("p", (Object)this, (lqe)lqe2, (long)4267728951142042022L, (long)l);
        m44.a("p", (Object)this, (int)n, (long)4343642880209571794L, (long)l);
    }

    public String v(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return null;
    }

    public int u(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x3EDA806E05DEL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = (int)m44.a("w", (Object)this, (long)-2838751229363279089L, (long)l);
        objectArray2[0] = l2;
        return (int)m44.a("v", (Object)m44.a("w", (Object)this, (long)-2312873024024859269L, (long)l), (Object)objectArray2, (long)-2667278637087635317L, (long)l);
    }

    public boolean t(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public boolean m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public boolean s(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public boolean P(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public boolean k(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l ^ 0x17E636692EF6L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = (int)m44.a("r", (Object)this, (long)3692923406818328746L, (long)l);
        return (boolean)m44.a("s", (Object)m44.a("r", (Object)this, (long)3765671971842606814L, (long)l), (Object)objectArray2, (long)3379603323468226410L, (long)l);
    }
}
