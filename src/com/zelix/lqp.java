/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.e;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.ListIterator;

public class lqp
implements ListIterator {
    private ListIterator w;
    final e u;
    private static final long a = prr.a((long)-2867506140664513350L, (long)-6610779110231560607L, MethodHandles.lookup().lookupClass()).a(279394187629460L);

    @Override
    public boolean hasNext() {
        long l = a ^ 0x73B6817AC4A9L;
        return m44.a("r", (Object)this, (long)6231538894813277502L, (long)l).hasNext();
    }

    @Override
    public boolean hasPrevious() {
        long l = a ^ 0x3A47D0A046E1L;
        return m44.a("r", (Object)this, (long)-3156295004595769482L, (long)l).hasPrevious();
    }

    @Override
    public int previousIndex() {
        long l = a ^ 0x16772B4CC863L;
        return (int)m44.a("q", (Object)m44.a("p", (Object)this, (long)6534927957160763892L, (long)l), (long)6897086859562517795L, (long)l);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public void set(Object object) {
        throw new UnsupportedOperationException();
    }

    public lqp(e e2, int n, long l) {
        l = a ^ l;
        this.u = e2;
        m44.a("q", (Object)this, (ListIterator)((Object)m44.a("r", (Object)m44.a("m", (Object)new Object[]{m44.a("s", (Object)this, (long)7787502602977399378L, (long)l)}, (long)8263873634765926490L, (long)l), (long)7966964686642208962L, (long)l)), (long)7907190187931604735L, (long)l);
        m44.a("q", (Object)this, (ListIterator)((Object)m44.a("r", (Object)m44.a("m", (Object)new Object[]{e2}, (long)8263873634765926490L, (long)l), (int)n, (long)7800881399169083613L, (long)l)), (long)7907190187931604735L, (long)l);
    }

    @Override
    public int nextIndex() {
        long l = a ^ 0x40FAD170B283L;
        return (int)m44.a("q", (Object)m44.a("p", (Object)this, (long)2328621417751010068L, (long)l), (long)2405248409480232032L, (long)l);
    }

    public Object previous() {
        long l = a ^ 0x52756C21A54DL;
        return m44.a("v", (Object)this, (long)4007920373260307674L, (long)l).previous();
    }

    public lqp(long l, e e2) {
        l = a ^ l;
        this.u = e2;
        m44.a("s", (Object)this, (ListIterator)((Object)m44.a("p", (Object)m44.a("o", (Object)new Object[]{m44.a("q", (Object)this, (long)-7971143000058220768L, (long)l)}, (long)-8080259557493469912L, (long)l), (long)-7790572197428978256L, (long)l)), (long)-8013609750425244787L, (long)l);
        m44.a("s", (Object)this, (ListIterator)((Object)m44.a("p", (Object)m44.a("o", (Object)new Object[]{e2}, (long)-8080259557493469912L, (long)l), (long)-7790572197428978256L, (long)l)), (long)-8013609750425244787L, (long)l);
    }

    public void add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object next() {
        long l = a ^ 0x2AF84C81CAF6L;
        return m44.a("u", (Object)this, (long)6351631099274928993L, (long)l).next();
    }
}
