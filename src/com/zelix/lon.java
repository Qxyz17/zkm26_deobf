/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.dl;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class lon
implements Set {
    private final dl H = new dl();
    private static final long a = prr.a((long)-2071175524122557726L, (long)2432077463679233769L, MethodHandles.lookup().lookupClass()).a(151444195327274L);

    @Override
    public boolean add(Object object) {
        boolean bl;
        long l = a ^ 0x50A8AE5BFD0DL;
        long l2 = l ^ 0x3702CB9E415DL;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 32);
        int n3 = (int)(l2 << 48 >>> 48);
        Object[] objectArray = new Object[5];
        objectArray[4] = n3;
        objectArray[3] = object;
        objectArray[2] = n2;
        objectArray[1] = (int)((short)n);
        objectArray[0] = object;
        CallSite callSite = m44.a("p", (Object)this.H, (Object)objectArray, (long)2703034768195071649L, (long)l);
        try {
            bl = callSite == null;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw m44.a("o", (Object)unsupportedOperationException, (long)4249069502493877331L, (long)l);
        }
        return bl;
    }

    @Override
    public boolean remove(Object object) {
        boolean bl;
        long l = a ^ 0xF60654AC816L;
        long l2 = l ^ 0x4F639268AA34L;
        Object[] objectArray = new Object[2];
        objectArray[1] = object;
        objectArray[0] = l2;
        CallSite callSite = m44.a("s", (Object)this.H, (Object)objectArray, (long)1466966951697175533L, (long)l);
        try {
            bl = callSite != null;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw m44.a("l", (Object)unsupportedOperationException, (long)1147544875450159432L, (long)l);
        }
        return bl;
    }

    public lon() {
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object object) {
        return this.H.E(object);
    }

    public lon(int n) {
    }

    @Override
    public boolean isEmpty() {
        long l = a ^ 0x5BD491E349CCL;
        long l2 = l ^ 0x428821158D93L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)m44.a("q", (Object)this.H, (Object)objectArray, (long)-8320287879735614514L, (long)l);
    }

    @Override
    public Iterator iterator() {
        long l = a ^ 0x29AFC61D1AD3L;
        long l2 = l ^ 0x19786FF69DBL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return m44.a("v", (Object)this.H, (Object)objectArray, (long)-2430954378764369997L, (long)l).iterator();
    }

    @Override
    public int size() {
        long l = a ^ 0x314FA637037DL;
        long l2 = l ^ 0x2040F9A91992L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (int)m44.a("p", (Object)this.H, (Object)objectArray, (long)-4357029710364735004L, (long)l);
    }

    @Override
    public boolean addAll(Collection collection) {
        long l = a ^ 0x18D589803CA1L;
        long l2 = l ^ 0x7F7FEC4580F1L;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 32);
        int n3 = (int)(l2 << 48 >>> 48);
        boolean bl = false;
        Iterator iterator = collection.iterator();
        CallSite callSite = m44.a("k", (long)-1779719217221273221L, (long)l);
        while (iterator.hasNext()) {
            Object e = iterator.next();
            Object[] objectArray = new Object[5];
            objectArray[4] = n3;
            objectArray[3] = e;
            objectArray[2] = n2;
            objectArray[1] = (int)((short)n);
            objectArray[0] = e;
            CallSite callSite2 = m44.a("t", (Object)this.H, (Object)objectArray, (long)-2004291286225916147L, (long)l);
            if (callSite2 == null) {
                bl = true;
            }
            if (callSite == null) continue;
        }
        return bl;
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection collection) {
        boolean bl;
        block5: {
            long l = a ^ 0x878B6804C28L;
            Iterator iterator = collection.iterator();
            CallSite callSite = m44.a("j", (long)-7510814094042691086L, (long)l);
            while (iterator.hasNext()) {
                block7: {
                    boolean bl2;
                    block6: {
                        Object e = iterator.next();
                        try {
                            try {
                                bl = this.H.E(e);
                                if (callSite != null) break block5;
                                if (callSite != null) break block6;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw m44.a("j", (Object)unsupportedOperationException, (long)-8371379292024842890L, (long)l);
                            }
                            if (bl) break block7;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw m44.a("j", (Object)unsupportedOperationException, (long)-8371379292024842890L, (long)l);
                        }
                        bl2 = false;
                    }
                    return bl2;
                }
                if (callSite == null) continue;
            }
            bl = true;
        }
        return bl;
    }

    @Override
    public Object[] toArray(Object[] objectArray) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        long l = a ^ 0x47EF6506CD33L;
        long l2 = l ^ 0x430E026E8D04L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        m44.a("v", (Object)this.H, (Object)objectArray, (long)1436397511703263110L, (long)l);
    }

    @Override
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }
}
