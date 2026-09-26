/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmj;
import com.zelix.m44;
import com.zelix.os;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class l6x {
    private l6x y;
    private Object S;
    private ArrayList N;
    final os O;
    private static final long a = prr.a((long)8077662951522094027L, (long)438085291248614551L, MethodHandles.lookup().lookupClass()).a(14445087565286L);

    l6x(os os2, Object object, l6x l6x2, lmj lmj2) {
        this(os2, object, l6x2);
    }

    public Object W() {
        return this.S;
    }

    private boolean I(Object[] objectArray) {
        l6x l6x2 = (l6x)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return (boolean)m44.a("q", (Object)this.N, (Object)l6x2, (long)-25456132966326884L, (long)l);
    }

    static boolean A(Object[] objectArray) {
        l6x l6x2 = (l6x)objectArray[0];
        l6x l6x3 = (l6x)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x656C592E27D5L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = l6x3;
        return (boolean)m44.a("m", (Object)l6x2, (Object)objectArray2, (long)-1706992711974822818L, (long)l);
    }

    private l6x(os os2, Object object, l6x l6x2) {
        this.O = os2;
        this.N = new ArrayList();
        this.S = object;
        this.y = l6x2;
    }

    private l6x G(Object object) {
        l6x l6x2 = new l6x(this.O, object, this);
        this.N.add(l6x2);
        return l6x2;
    }

    static ArrayList J(l6x l6x2) {
        return l6x2.N;
    }

    static l6x L(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l6x l6x2 = (l6x)objectArray[1];
        l = a ^ l;
        return m44.a("n", (Object)l6x2, (Object)new Object[0], (long)4096683107155325110L, (long)l);
    }

    static l6x f(l6x l6x2, Object object) {
        return l6x2.G(object);
    }

    private l6x U(Object[] objectArray) {
        return this.y;
    }

    public Enumeration J() {
        return Collections.enumeration(this.N);
    }

    static l6x Y(l6x l6x2) {
        return l6x2.y;
    }
}
