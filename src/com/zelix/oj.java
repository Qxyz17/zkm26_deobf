/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ae;
import com.zelix.bg;
import com.zelix.js;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.xt;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class oj {
    private final bg z;
    private final List k;
    private final List Z;
    private final int D;
    private final String A;
    private final js[] T;
    private String m;
    private final xt e;
    private static final long a = prr.a((long)-218283611236714969L, (long)736469464826788099L, MethodHandles.lookup().lookupClass()).a(198021075782143L);

    String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("w", (Object)this, (long)-5840597784518983453L, (long)l);
    }

    List f(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("w", (Object)this, (long)6311196639330263092L, (long)l);
    }

    List k(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("t", (Object)this, (long)-7578050152775201707L, (long)l);
    }

    xt L(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("q", (Object)this, (long)-5009689685154615622L, (long)l);
    }

    public void z(Object[] objectArray) {
        ae ae2 = (ae)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        m44.a("q", (Object)this, (long)-7559253145336656488L, (long)l).add(ae2);
    }

    bg q(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("p", (Object)this, (long)3937940966522089168L, (long)l);
    }

    public oj(bg bg2, long l, List list, int n) {
        long l2 = (l = a ^ l) ^ 0x9397F970402L;
        int n2 = (int)(l2 >>> 48);
        int n3 = (int)(l2 << 16 >>> 32);
        int n4 = (int)(l2 << 48 >>> 48);
        this.Z = new ArrayList();
        this.z = bg2;
        this.k = list;
        this.D = n;
        CallSite callSite = m44.a("p", (Object)m44.a("q", (Object)this, (long)-1371593819679935359L, (long)l), (Object)new Object[0], (long)-1504018301712139630L, (long)l);
        this.e = (xt)callSite[0];
        this.A = m44.a("p", (Object)m44.a("q", (Object)this, (long)-1508107276102533166L, (long)l), (char)((char)n2), (int)n3, (short)((short)n4), (long)-615662743477714910L, (long)l);
        this.T = new js[((CallSite)callSite).length - 1];
        System.arraycopy(callSite, 1, m44.a("q", (Object)this, (long)-777348585526293867L, (long)l), 0, ((CallSite)m44.a("q", (Object)this, (long)-777348585526293867L, (long)l)).length);
    }

    js[] E(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("v", (Object)this, (long)2018018826507150242L, (long)l);
    }

    void v(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l = a ^ l;
        m44.a("t", (Object)this, (String)string, (long)-6889645880773505422L, (long)l);
    }
}
