/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.me;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class uh
implements me {
    private final l6q l;

    public void t(Object object, Object object2, long l) {
        throw new UnsupportedOperationException();
    }

    public uh(l6q l6q2) {
        this.l = l6q2;
    }

    public boolean w(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        Object object2 = objectArray[2];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = object2;
        objectArray2[1] = l2;
        objectArray2[0] = object;
        return (boolean)m44.a("p", (Object)m44.a("q", (Object)this, (long)1529854035654182706L, (long)l), (Object)objectArray2, (long)1517413040050766723L, (long)l);
    }

    public synchronized Set H(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l;
        long l3 = l2 ^ 0L;
        long l4 = l2 ^ 0x76D4516F4E9L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = m44.a("q", (Object)m44.a("p", (Object)this, (long)8001281972402781443L, (long)l), (Object)objectArray2, (long)7615137419689158742L, (long)l);
        return m44.a("n", (Object)objectArray3, (long)7577507576193448250L, (long)l);
    }

    public int Q(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return (int)m44.a("p", (Object)m44.a("q", (Object)this, (long)-4025272850454259158L, (long)l), (Object)objectArray2, (long)-3113255579406101258L, (long)l);
    }

    public List t(char c, Object object, int n, short s) {
        long l = (long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48;
        long l2 = l ^ 0L;
        int n2 = (int)(l2 >>> 48);
        int n3 = (int)(l2 << 16 >>> 32);
        int n4 = (int)(l2 << 48 >>> 48);
        List list = m44.a("p", (Object)this, (long)-8493168694433933269L, (long)l).t((char)n2, object, n3, (short)n4);
        try {
            if (list != null) {
                return new ArrayList(list);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw m44.a("n", (Object)unsupportedOperationException, (long)-7903814247806258085L, (long)l);
        }
        return null;
    }

    public Set D(long l) {
        long l2 = l;
        long l3 = l2 ^ 0x1A31F85906B0L;
        long l4 = l2 ^ 0L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = m44.a("q", (Object)this, (long)-7110235126130143398L, (long)l).D(l4);
        return m44.a("o", (Object)objectArray, (long)-7245821608951510173L, (long)l);
    }

    public int w(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return (int)m44.a("w", (Object)m44.a("v", (Object)this, (long)-3624256750728552515L, (long)l), (Object)objectArray2, (long)-3348347669332135288L, (long)l);
    }

    public boolean R(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        Object object2 = objectArray[2];
        throw new UnsupportedOperationException();
    }

    public Enumeration H(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = object;
        objectArray2[0] = l2;
        return m44.a("q", (Object)m44.a("p", (Object)this, (long)1876401656568055811L, (long)l), (Object)objectArray2, (long)526071451747224275L, (long)l);
    }

    public List u(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        throw new UnsupportedOperationException();
    }

    public boolean J(short s, Object object, int n, char c) {
        long l = (long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48;
        long l2 = l ^ 0L;
        int n2 = (int)(l2 >>> 48);
        int n3 = (int)(l2 << 16 >>> 32);
        int n4 = (int)(l2 << 48 >>> 48);
        return m44.a("w", (Object)this, (long)-3004635142799604668L, (long)l).J((short)n2, object, n3, (char)n4);
    }

    public boolean e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return (boolean)m44.a("u", (Object)m44.a("t", (Object)this, (long)6736829793616383863L, (long)l), (Object)objectArray2, (long)4640172020388202484L, (long)l);
    }

    public void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        throw new UnsupportedOperationException();
    }

    public Enumeration p(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("r", (Object)m44.a("s", (Object)this, (long)-5651682570026081384L, (long)l), (Object)objectArray2, (long)-6233074108681497370L, (long)l);
    }

    public synchronized Enumeration U(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("w", (Object)m44.a("v", (Object)this, (long)7943281149567171637L, (long)l), (Object)objectArray2, (long)7679849877586365603L, (long)l);
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }
}
