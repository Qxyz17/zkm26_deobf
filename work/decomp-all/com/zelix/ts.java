/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.g5;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

public class ts
implements Collection {
    private Object[] G;
    private static final long a = prr.a((long)-7260883364182962324L, (long)3354340986814865144L, MethodHandles.lookup().lookupClass()).a(202289023418095L);

    @Override
    public boolean isEmpty() {
        boolean bl;
        block2: {
            block3: {
                long l = a ^ 0x6A63B8826BAAL;
                CallSite callSite = m44.a("h", (long)1881983291329283112L, (long)l);
                try {
                    bl = ((CallSite)m44.a("v", (Object)this, (long)2194694031242406592L, (long)l)).length;
                    if (callSite != null) break block2;
                    if (bl) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("h", (Object)illegalArgumentException, (long)85520775714592906L, (long)l);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public Object[] toArray(Object[] objectArray) {
        Object[] objectArray2;
        block9: {
            int n;
            int n2;
            long l;
            block7: {
                CallSite callSite;
                block8: {
                    l = a ^ 0x389A6E8BCE26L;
                    callSite = m44.a("l", (long)-4642517231665765980L, (long)l);
                    try {
                        n2 = objectArray.length;
                        n = ((CallSite)m44.a("r", (Object)this, (long)-4901802683065299124L, (long)l)).length;
                        if (callSite != null) break block7;
                        if (n2 >= n) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)-6583270583949329146L, (long)l);
                    }
                    objectArray = (Object[])Array.newInstance(objectArray.getClass().getComponentType(), ((CallSite)m44.a("r", (Object)this, (long)-4901802683065299124L, (long)l)).length);
                }
                try {
                    System.arraycopy(m44.a("r", (Object)this, (long)-4901802683065299124L, (long)l), 0, objectArray, 0, ((CallSite)m44.a("r", (Object)this, (long)-4901802683065299124L, (long)l)).length);
                    objectArray2 = objectArray;
                    if (callSite != null) break block9;
                    n2 = objectArray2.length;
                    n = ((CallSite)m44.a("r", (Object)this, (long)-4901802683065299124L, (long)l)).length;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)-6583270583949329146L, (long)l);
                }
            }
            try {
                if (n2 > n) {
                    objectArray[((CallSite)m44.a("r", (Object)this, (long)-4901802683065299124L, (long)l)).length] = null;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("l", (Object)illegalArgumentException, (long)-6583270583949329146L, (long)l);
            }
            objectArray2 = objectArray;
        }
        return objectArray2;
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object object) {
        boolean bl;
        block5: {
            long l = a ^ 0x50F4058B9FE6L;
            CallSite callSite = m44.a("l", (long)-1273921373346008988L, (long)l);
            for (int i = 0; i < ((CallSite)m44.a("r", (Object)this, (long)-1569183411269640564L, (long)l)).length; ++i) {
                boolean bl2;
                block6: {
                    try {
                        try {
                            bl = m44.a("r", (Object)this, (long)-1569183411269640564L, (long)l)[i].equals(object);
                            if (callSite != null) break block5;
                            if (callSite != null) break block6;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("l", (Object)illegalArgumentException, (long)-764505660511769402L, (long)l);
                        }
                        if (!bl) continue;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)-764505660511769402L, (long)l);
                    }
                    bl2 = true;
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    static /* synthetic */ Object[] d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        ts ts2 = (ts)objectArray[1];
        l = a ^ l;
        return m44.a("r", (Object)ts2, (long)2603402803948327060L, (long)l);
    }

    public boolean containsAll(Collection collection) {
        long l = a ^ 0x3DF96CE4123L;
        Iterator iterator = collection.iterator();
        CallSite callSite = m44.a("i", (long)3501351250210533025L, (long)l);
        while (iterator.hasNext()) {
            Object object = m44.a("v", (Object)this, iterator.next(), (long)2908592319010759179L, (long)l);
            while (object == false) {
                object = false;
                if (callSite != null) continue;
                return (boolean)object;
            }
        }
        return true;
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        long l = a ^ 0x43816E5181DL;
        return ((CallSite)m44.a("q", (Object)this, (long)7909007918244616567L, (long)l)).length;
    }

    public boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        long l = a ^ 0x4A8220229F50L;
        return m44.a("j", (Object)new Object[]{m44.a("t", (Object)this, (long)-1544947468716777926L, (long)l)}, (long)-1525785969277758747L, (long)l);
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public ts(long l, Object[] objectArray) {
        l = a ^ l;
        if (objectArray == null) {
            throw new IllegalArgumentException();
        }
        m44.a("u", (Object)this, (Object[])objectArray, (long)-4975253136570773951L, (long)l);
    }

    @Override
    public Iterator iterator() {
        return new g5(this);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}
