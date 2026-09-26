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
    private static final long a = prr.a(-2071175524122557726L, 2432077463679233769L, MethodHandles.lookup().lookupClass()).a(151444195327274L);

    @Override
    public boolean add(Object object) {
        boolean bl2;
        long l10 = a ^ 0x50A8AE5BFD0DL;
        long l11 = l10 ^ 0x3702CB9E415DL;
        int n10 = (int)(l11 >>> 48);
        int n11 = (int)(l11 << 16 >>> 32);
        int n12 = (int)(l11 << 48 >>> 48);
        Object[] objectArray = new Object[5];
        objectArray[4] = n12;
        objectArray[3] = object;
        objectArray[2] = n11;
        objectArray[1] = (int)((short)n10);
        objectArray[0] = object;
        CallSite callSite = m44.a("p", (Object)this.H, (Object)objectArray, (long)2703034768195071649L, (long)l10);
        try {
            bl2 = callSite == null;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw m44.a("o", (Object)unsupportedOperationException, (long)4249069502493877331L, (long)l10);
        }
        return bl2;
    }

    @Override
    public boolean remove(Object object) {
        boolean bl2;
        long l10 = a ^ 0xF60654AC816L;
        long l11 = l10 ^ 0x4F639268AA34L;
        Object[] objectArray = new Object[2];
        objectArray[1] = object;
        objectArray[0] = l11;
        CallSite callSite = m44.a("s", (Object)this.H, (Object)objectArray, (long)1466966951697175533L, (long)l10);
        try {
            bl2 = callSite != null;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw m44.a("l", (Object)unsupportedOperationException, (long)1147544875450159432L, (long)l10);
        }
        return bl2;
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

    public lon(int n10) {
    }

    @Override
    public boolean isEmpty() {
        long l10 = a ^ 0x5BD491E349CCL;
        long l11 = l10 ^ 0x428821158D93L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        return (boolean)m44.a("q", (Object)this.H, (Object)objectArray, (long)-8320287879735614514L, (long)l10);
    }

    @Override
    public Iterator iterator() {
        long l10 = a ^ 0x29AFC61D1AD3L;
        long l11 = l10 ^ 0x19786FF69DBL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        return m44.a("v", (Object)this.H, (Object)objectArray, (long)-2430954378764369997L, (long)l10).iterator();
    }

    @Override
    public int size() {
        long l10 = a ^ 0x314FA637037DL;
        long l11 = l10 ^ 0x2040F9A91992L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        return (int)m44.a("p", (Object)this.H, (Object)objectArray, (long)-4357029710364735004L, (long)l10);
    }

    @Override
    public boolean addAll(Collection collection) {
        long l10 = a ^ 0x18D589803CA1L;
        long l11 = l10 ^ 0x7F7FEC4580F1L;
        int n10 = (int)(l11 >>> 48);
        int n11 = (int)(l11 << 16 >>> 32);
        int n12 = (int)(l11 << 48 >>> 48);
        boolean bl2 = false;
        Iterator iterator = collection.iterator();
        CallSite callSite = m44.a("k", (long)-1779719217221273221L, (long)l10);
        while (iterator.hasNext()) {
            Object e10 = iterator.next();
            Object[] objectArray = new Object[5];
            objectArray[4] = n12;
            objectArray[3] = e10;
            objectArray[2] = n11;
            objectArray[1] = (int)((short)n10);
            objectArray[0] = e10;
            CallSite callSite2 = m44.a("t", (Object)this.H, (Object)objectArray, (long)-2004291286225916147L, (long)l10);
            if (callSite2 == null) {
                bl2 = true;
            }
            if (callSite == null) continue;
        }
        return bl2;
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection collection) {
        boolean bl2;
        block5: {
            long l10 = a ^ 0x878B6804C28L;
            Iterator iterator = collection.iterator();
            CallSite callSite = m44.a("j", (long)-7510814094042691086L, (long)l10);
            while (iterator.hasNext()) {
                block7: {
                    boolean bl3;
                    block6: {
                        Object e10 = iterator.next();
                        try {
                            try {
                                bl2 = this.H.E(e10);
                                if (callSite != null) break block5;
                                if (callSite != null) break block6;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw m44.a("j", (Object)unsupportedOperationException, (long)-8371379292024842890L, (long)l10);
                            }
                            if (bl2) break block7;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw m44.a("j", (Object)unsupportedOperationException, (long)-8371379292024842890L, (long)l10);
                        }
                        bl3 = false;
                    }
                    return bl3;
                }
                if (callSite == null) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public Object[] toArray(Object[] objectArray) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        long l10 = a ^ 0x47EF6506CD33L;
        long l11 = l10 ^ 0x430E026E8D04L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        m44.a("v", (Object)this.H, (Object)objectArray, (long)1436397511703263110L, (long)l10);
    }

    @Override
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }
}

