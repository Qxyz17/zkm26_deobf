/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c0
implements Comparable,
Serializable {
    Object y;
    Comparable j;
    private static final long a = prr.a((long)7967362908787158923L, (long)8952298391535667179L, MethodHandles.lookup().lookupClass()).a(108641898811652L);

    public int hashCode() {
        Object object;
        long l;
        block4: {
            block5: {
                l = a ^ 0x12F94C491F61L;
                CallSite callSite = m44.a("h", (long)8105932192450113096L, (long)l);
                try {
                    try {
                        object = this;
                        if (callSite != null) break block4;
                        if (m44.a("v", (Object)object, (long)8052982702676204648L, (long)l) != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("h", (Object)illegalArgumentException, (long)8171790208732000390L, (long)l);
                    }
                    return m44.a("v", (Object)this, (long)8300991580315982583L, (long)l).hashCode();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("h", (Object)illegalArgumentException, (long)8171790208732000390L, (long)l);
                }
            }
            object = m44.a("v", (Object)this, (long)8300991580315982583L, (long)l);
        }
        return object.hashCode() ^ m44.a("v", (Object)this, (long)8052982702676204648L, (long)l).hashCode();
    }

    public Comparable Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("s", (Object)this, (long)-7352568386007994318L, (long)l);
    }

    public int Y(Object[] objectArray) {
        c0 c02 = (c0)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return (int)m44.a("q", (Object)m44.a("p", (Object)this, (long)7486393595349896737L, (long)l), (Object)m44.a("p", (Object)c02, (long)7486393595349896737L, (long)l), (long)8924323666968366966L, (long)l);
    }

    public c0(Comparable comparable, Object object, long l) {
        block4: {
            block5: {
                l = a ^ l;
                CallSite callSite = m44.a("k", (long)-2338127481409453637L, (long)l);
                CallSite callSite2 = callSite;
                try {
                    try {
                        if (callSite2 != null) break block4;
                        if (comparable != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("k", (Object)illegalArgumentException, (long)-2406253750984712331L, (long)l);
                    }
                    throw new IllegalArgumentException(this.getClass().getName());
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("k", (Object)illegalArgumentException, (long)-2406253750984712331L, (long)l);
                }
            }
            m44.a("w", (Object)this, (Comparable)comparable, (long)-2539950145146407676L, (long)l);
            m44.a("w", (Object)this, (Object)object, (long)-4597416514779876453L, (long)l);
        }
    }

    public boolean equals(Object object) {
        boolean bl;
        block24: {
            block25: {
                boolean bl2;
                block33: {
                    block27: {
                        block30: {
                            CallSite callSite;
                            c0 c02;
                            CallSite callSite2;
                            long l;
                            block32: {
                                block31: {
                                    block28: {
                                        block26: {
                                            l = a ^ 0x16D9FED4CB07L;
                                            callSite2 = m44.a("n", (long)-6622531975695975890L, (long)l);
                                            try {
                                                bl = object instanceof c0;
                                                if (callSite2 != null) break block24;
                                                if (!bl) break block25;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw m44.a("n", (Object)illegalArgumentException, (long)-6553296256005724960L, (long)l);
                                            }
                                            c02 = (c0)object;
                                            try {
                                                try {
                                                    callSite = m44.a("p", (Object)this, (long)-6389182920566518127L, (long)l);
                                                    if (callSite2 != null) break block26;
                                                    if (!callSite.equals(m44.a("p", (Object)c02, (long)-6389182920566518127L, (long)l))) break block27;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw m44.a("n", (Object)illegalArgumentException, (long)-6553296256005724960L, (long)l);
                                                }
                                                callSite = m44.a("p", (Object)this, (long)-4924698041036011506L, (long)l);
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw m44.a("n", (Object)illegalArgumentException, (long)-6553296256005724960L, (long)l);
                                            }
                                        }
                                        try {
                                            block29: {
                                                try {
                                                    try {
                                                        try {
                                                            if (callSite2 != null) break block28;
                                                            if (callSite != null) break block29;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw m44.a("n", (Object)illegalArgumentException, (long)-6553296256005724960L, (long)l);
                                                        }
                                                        callSite = m44.a("p", (Object)c02, (long)-4924698041036011506L, (long)l);
                                                        if (callSite2 != null) break block28;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw m44.a("n", (Object)illegalArgumentException, (long)-6553296256005724960L, (long)l);
                                                    }
                                                    if (callSite == null) break block30;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw m44.a("n", (Object)illegalArgumentException, (long)-6553296256005724960L, (long)l);
                                                }
                                            }
                                            callSite = m44.a("p", (Object)this, (long)-4924698041036011506L, (long)l);
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("n", (Object)illegalArgumentException, (long)-6553296256005724960L, (long)l);
                                        }
                                    }
                                    try {
                                        try {
                                            if (callSite2 != null) break block31;
                                            if (callSite == null) break block27;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("n", (Object)illegalArgumentException, (long)-6553296256005724960L, (long)l);
                                        }
                                        callSite = m44.a("p", (Object)c02, (long)-4924698041036011506L, (long)l);
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("n", (Object)illegalArgumentException, (long)-6553296256005724960L, (long)l);
                                    }
                                }
                                try {
                                    try {
                                        if (callSite2 != null) break block32;
                                        if (callSite == null) break block27;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("n", (Object)illegalArgumentException, (long)-6553296256005724960L, (long)l);
                                    }
                                    callSite = m44.a("p", (Object)this, (long)-4924698041036011506L, (long)l);
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("n", (Object)illegalArgumentException, (long)-6553296256005724960L, (long)l);
                                }
                            }
                            try {
                                bl2 = callSite.equals(m44.a("p", (Object)c02, (long)-4924698041036011506L, (long)l));
                                if (callSite2 != null) break block33;
                                if (!bl2) break block27;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("n", (Object)illegalArgumentException, (long)-6553296256005724960L, (long)l);
                            }
                        }
                        bl2 = true;
                        break block33;
                    }
                    bl2 = false;
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    public int compareTo(Object object) {
        long l = a ^ 0x317425BD22FFL;
        long l2 = l ^ 0x15E5FC574816L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = (c0)object;
        return (int)m44.a("q", (Object)this, (Object)objectArray, (long)5198489708181639126L, (long)l);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}
