/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class f3
implements List {
    private ArrayList I;
    private static final long a = prr.a((long)-3779114135019613467L, (long)-72664243880411082L, MethodHandles.lookup().lookupClass()).a(90785710619574L);

    @Override
    public boolean contains(Object object) {
        long l = a ^ 0x56E184162F37L;
        return (boolean)m44.a("w", (Object)this.I, (Object)object, (long)-8357947604908901480L, (long)l);
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public Object set(int n, Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection collection) {
        long l = a ^ 0x418A475E3C16L;
        return (boolean)m44.a("v", (Object)this.I, (Object)collection, (long)-7110235094544485190L, (long)l);
    }

    public Object remove(int n) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        long l = a ^ 0x3DDAF67B063DL;
        return (boolean)m44.a("u", (Object)this.I, (long)-5093090718682329976L, (long)l);
    }

    @Override
    public int lastIndexOf(Object object) {
        long l = a ^ 0x265B6E13D27CL;
        return (int)m44.a("t", (Object)this.I, (Object)object, (long)7591559975232164112L, (long)l);
    }

    @Override
    public int size() {
        return this.I.size();
    }

    @Override
    public boolean equals(Object object) {
        return this.I.equals(object);
    }

    @Override
    public int hashCode() {
        return this.I.hashCode();
    }

    public List subList(int n, int n2) {
        long l = a ^ 0x64ACB2AA9A18L;
        return m44.a("p", (Object)this.I, (int)n, (int)n2, (long)4574481365599701363L, (long)l);
    }

    public boolean addAll(int n, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public ListIterator listIterator() {
        return this.I.listIterator();
    }

    @Override
    public Object[] toArray(Object[] objectArray) {
        return this.I.toArray(objectArray);
    }

    /*
     * Unable to fully structure code
     */
    public f3(Enumeration var1_1, long var2_2) {
        var2_2 = f3.a ^ var2_2;
        v0 = m44.a("o", (long)4600754071887618543L, (long)var2_2);
        super();
        var4_3 = v0;
        this.I = new ArrayList<E>();
        while (var1_1.hasMoreElements()) {
            this.I.add(var1_1.nextElement());
lbl9:
            // 2 sources

            ** while (var4_3 != null)
lbl10:
            // 1 sources

        }
lbl11:
        // 2 sources

        if (var2_2 <= 0L) ** GOTO lbl9
    }

    public ListIterator listIterator(int n) {
        long l = a ^ 0x405F4A1E13B2L;
        return m44.a("r", (Object)this.I, (int)n, (long)-5613176569970451340L, (long)l);
    }

    @Override
    public Object[] toArray() {
        long l = a ^ 0x9081DD5FFA0L;
        return m44.a("p", (Object)this.I, (long)4718161294975808667L, (long)l);
    }

    @Override
    public Iterator iterator() {
        return this.I.iterator();
    }

    @Override
    public boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public Object get(int n) {
        return this.I.get(n);
    }

    public void add(int n, Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object object) {
        return this.I.indexOf(object);
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }
}
