/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class a2
implements Set {
    private final Set s;
    private static final long a = prr.a(3392381656648208220L, -6001657787138808332L, MethodHandles.lookup().lookupClass()).a(137836523691128L);

    @Override
    public Object[] toArray() {
        long l10 = a ^ 0x36814D45CDD4L;
        return m44.a("r", (Object)m44.a("s", (Object)this, (long)1375998197300357892L, (long)l10), (long)615913049799441635L, (long)l10);
    }

    @Override
    public boolean retainAll(Collection collection) {
        long l10 = a ^ 0x728DB48BA31DL;
        return (boolean)m44.a("s", (Object)m44.a("r", (Object)this, (long)9066242054335759821L, (long)l10), (Object)collection, (long)7394470190020068125L, (long)l10);
    }

    @Override
    public boolean add(Object object) {
        long l10 = a ^ 0x5D1DD0998E8L;
        return m44.a("w", (Object)this, (long)5054362874724892216L, (long)l10).add(object);
    }

    @Override
    public boolean remove(Object object) {
        long l10 = a ^ 0x5473A7877A7BL;
        return m44.a("t", (Object)this, (long)-6577535967171126101L, (long)l10).remove(object);
    }

    @Override
    public boolean addAll(Collection collection) {
        long l10 = a ^ 0xE5D8AE3AAFCL;
        return m44.a("s", (Object)this, (long)8372402595377712172L, (long)l10).addAll(collection);
    }

    @Override
    public boolean equals(Object object) {
        boolean bl2;
        long l10;
        long l11;
        block11: {
            boolean bl3;
            block10: {
                Object object2;
                CallSite callSite;
                block8: {
                    block9: {
                        l11 = a ^ 0x50CBF74C691CL;
                        l10 = l11 ^ 0x243769548F4DL;
                        callSite = m44.a("m", (long)-5995660915123047683L, (long)l11);
                        try {
                            try {
                                object2 = object;
                                if (callSite != null) break block8;
                                if (object2 != null) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("m", (Object)n92, (long)-5279827993999404586L, (long)l11);
                            }
                            return false;
                        }
                        catch (n9 n93) {
                            throw m44.a("m", (Object)n93, (long)-5279827993999404586L, (long)l11);
                        }
                    }
                    object2 = object;
                }
                try {
                    bl3 = object2 instanceof a2;
                    if (callSite != null) break block10;
                    if (bl3) break block11;
                }
                catch (n9 n94) {
                    throw m44.a("m", (Object)n94, (long)-5279827993999404586L, (long)l11);
                }
                bl3 = false;
            }
            return bl3;
        }
        try {
            Object[] objectArray = new Object[1];
            objectArray[0] = l10;
            bl2 = m44.a("s", (Object)this, (long)-5201409787385622580L, (long)l11) == m44.a("l", (Object)((a2)object), (Object)objectArray, (long)-6304882719691883151L, (long)l11);
        }
        catch (n9 n95) {
            throw m44.a("m", (Object)n95, (long)-5279827993999404586L, (long)l11);
        }
        return bl2;
    }

    @Override
    public void clear() {
        long l10 = a ^ 0xDC5272B8237L;
        m44.a("p", (Object)this, (long)6700155946515309799L, (long)l10).clear();
    }

    @Override
    public int size() {
        long l10 = a ^ 0x6EF59AA5108L;
        return m44.a("w", (Object)this, (long)-8087137270915270696L, (long)l10).size();
    }

    @Override
    public boolean removeAll(Collection collection) {
        long l10 = a ^ 0x58A850E19D44L;
        return (boolean)m44.a("r", (Object)m44.a("s", (Object)this, (long)4866395828061617044L, (long)l10), (Object)collection, (long)6430859993463885764L, (long)l10);
    }

    @Override
    public boolean isEmpty() {
        long l10 = a ^ 0xE36F84E57C4L;
        return (boolean)m44.a("r", (Object)m44.a("s", (Object)this, (long)-8572391169862799084L, (long)l10), (long)-7550614368410356414L, (long)l10);
    }

    @Override
    public boolean contains(Object object) {
        long l10 = a ^ 0x6BCB2ED405ECL;
        return m44.a("s", (Object)this, (long)-2656883693318331588L, (long)l10).contains(object);
    }

    public a2(char c10, long l10) {
        long l11 = ((long)c10 << 48 | l10 << 16 >>> 16) ^ a;
        long l12 = l11 ^ 0x22EB84E3B0A6L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l12;
        this.s = m44.a("i", (Object)objectArray, (long)2054460570706339073L, (long)l11);
    }

    @Override
    public Object[] toArray(Object[] objectArray) {
        long l10 = a ^ 0x44D4F1D0403FL;
        return m44.a("q", (Object)m44.a("p", (Object)this, (long)-6992976122673633553L, (long)l10), (Object)objectArray, (long)-8865345155919002742L, (long)l10);
    }

    @Override
    public Iterator iterator() {
        long l10 = a ^ 0x32C15C7C4639L;
        return m44.a("v", (Object)this, (long)-7424884022967017239L, (long)l10).iterator();
    }

    @Override
    public int hashCode() {
        long l10 = a ^ 0x161E233EF265L;
        return System.identityHashCode(m44.a("r", (Object)this, (long)3218287639741420725L, (long)l10));
    }

    private Set k(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("p", (Object)this, (long)-933487647576716521L, (long)l10);
    }

    @Override
    public boolean containsAll(Collection collection) {
        long l10 = a ^ 0xE0A7E1B58F3L;
        return (boolean)m44.a("u", (Object)m44.a("t", (Object)this, (long)-8773082877677732317L, (long)l10), (Object)collection, (long)-8991580194490166407L, (long)l10);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

