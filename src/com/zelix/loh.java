/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class loh
implements Comparable {
    private Object A;
    private String u;
    private Object g;
    private Object I;
    private static final long a = prr.a((long)-7455505310969982007L, (long)7807036686836285793L, MethodHandles.lookup().lookupClass()).a(112991343481829L);

    public Object G(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("p", (Object)this, (long)3455941509920630160L, (long)l);
    }

    public Object x(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("v", (Object)this, (long)-6296144297969999203L, (long)l);
    }

    public loh(String string, Object object, long l) {
        long l2 = (l = a ^ l) ^ 0x5F7B4808F620L;
        this(string, object, null, null, l2);
    }

    public String B() {
        return this.u;
    }

    public int compareTo(Object object) {
        long l = a ^ 0x5D8A38BA7BC0L;
        return (int)m44.a("p", (Object)this, (Object)new Object[]{(loh)object}, (long)5393805905851444649L, (long)l);
    }

    public loh(String string, long l, Object object, Object object2) {
        long l2 = (l = a ^ l) ^ 0x2C852BF25E2EL;
        this(string, object, object2, null, l2);
    }

    public Object M(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("u", (Object)this, (long)2186917725885056480L, (long)l);
    }

    public int i(Object[] objectArray) {
        loh loh2 = (loh)objectArray[0];
        return this.u.compareTo(loh2.u);
    }

    public loh(String string, Object object, Object object2, Object object3, long l) {
        l = a ^ l;
        this.u = string;
        m44.a("v", (Object)this, (Object)object, (long)-1248094807320238929L, (long)l);
        m44.a("v", (Object)this, (Object)object2, (long)-1188393365909117468L, (long)l);
        m44.a("v", (Object)this, (Object)object3, (long)-1675238711216721031L, (long)l);
    }
}
