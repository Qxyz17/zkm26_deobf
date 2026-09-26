/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lq0
implements Serializable {
    private Object q;
    private Object H;
    private static final long a = prr.a((long)-8358265260801344659L, (long)8020972406874655309L, MethodHandles.lookup().lookupClass()).a(54936012026066L);

    public boolean equals(Object object) {
        boolean bl;
        block24: {
            block25: {
                boolean bl2;
                block33: {
                    block27: {
                        block30: {
                            Object object2;
                            lq0 lq02;
                            CallSite callSite;
                            long l;
                            block32: {
                                block31: {
                                    block28: {
                                        block26: {
                                            l = a ^ 0x1821FDBBAE37L;
                                            callSite = m44.a("i", (long)-2474942788991728751L, (long)l);
                                            try {
                                                bl = object instanceof lq0;
                                                if (callSite != null) break block24;
                                                if (!bl) break block25;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw m44.a("i", (Object)illegalArgumentException, (long)-2478308563932757771L, (long)l);
                                            }
                                            lq02 = (lq0)object;
                                            try {
                                                try {
                                                    object2 = this.q;
                                                    if (callSite != null) break block26;
                                                    if (!object2.equals(lq02.q)) break block27;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw m44.a("i", (Object)illegalArgumentException, (long)-2478308563932757771L, (long)l);
                                                }
                                                object2 = this.H;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw m44.a("i", (Object)illegalArgumentException, (long)-2478308563932757771L, (long)l);
                                            }
                                        }
                                        try {
                                            block29: {
                                                try {
                                                    try {
                                                        try {
                                                            if (callSite != null) break block28;
                                                            if (object2 != null) break block29;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw m44.a("i", (Object)illegalArgumentException, (long)-2478308563932757771L, (long)l);
                                                        }
                                                        object2 = lq02.H;
                                                        if (callSite != null) break block28;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw m44.a("i", (Object)illegalArgumentException, (long)-2478308563932757771L, (long)l);
                                                    }
                                                    if (object2 == null) break block30;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw m44.a("i", (Object)illegalArgumentException, (long)-2478308563932757771L, (long)l);
                                                }
                                            }
                                            object2 = this.H;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("i", (Object)illegalArgumentException, (long)-2478308563932757771L, (long)l);
                                        }
                                    }
                                    try {
                                        try {
                                            if (callSite != null) break block31;
                                            if (object2 == null) break block27;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("i", (Object)illegalArgumentException, (long)-2478308563932757771L, (long)l);
                                        }
                                        object2 = lq02.H;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("i", (Object)illegalArgumentException, (long)-2478308563932757771L, (long)l);
                                    }
                                }
                                try {
                                    try {
                                        if (callSite != null) break block32;
                                        if (object2 == null) break block27;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("i", (Object)illegalArgumentException, (long)-2478308563932757771L, (long)l);
                                    }
                                    object2 = this.H;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("i", (Object)illegalArgumentException, (long)-2478308563932757771L, (long)l);
                                }
                            }
                            try {
                                bl2 = object2.equals(lq02.H);
                                if (callSite != null) break block33;
                                if (!bl2) break block27;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("i", (Object)illegalArgumentException, (long)-2478308563932757771L, (long)l);
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

    public int hashCode() {
        Object object;
        block4: {
            block5: {
                long l = a ^ 0x6D0BA4AD62EAL;
                CallSite callSite = m44.a("l", (long)1259399925266714444L, (long)l);
                try {
                    try {
                        object = this.H;
                        if (callSite != null) break block4;
                        if (object != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)1244737699410873384L, (long)l);
                    }
                    return this.q.hashCode();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)1244737699410873384L, (long)l);
                }
            }
            object = this.q;
        }
        return object.hashCode() ^ this.H.hashCode();
    }

    public Object Z(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = this.H;
        this.H = object;
        return object2;
    }

    public Object S() {
        return this.q;
    }

    public lq0(Object object, int n, long l, Object object2) {
        block4: {
            block5: {
                long l2 = ((long)n << 32 | l << 32 >>> 32) ^ a;
                CallSite callSite = m44.a("k", (long)-705565545273038845L, (long)l2);
                CallSite callSite2 = callSite;
                try {
                    try {
                        if (callSite2 != null) break block4;
                        if (object != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("k", (Object)illegalArgumentException, (long)-717998653037352089L, (long)l2);
                    }
                    throw new IllegalArgumentException(this.getClass().getName());
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("k", (Object)illegalArgumentException, (long)-717998653037352089L, (long)l2);
                }
            }
            this.q = object;
            this.H = object2;
        }
    }

    public Object D() {
        return this.H;
    }

    public Object x(Object[] objectArray) {
        Object object;
        Object object2;
        block4: {
            block5: {
                object2 = objectArray[0];
                long l = (Long)objectArray[1];
                l = a ^ l;
                CallSite callSite = m44.a("l", (long)5522110086136943252L, (long)l);
                try {
                    try {
                        object = object2;
                        if (callSite != null) break block4;
                        if (object != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)5520852414280389104L, (long)l);
                    }
                    throw new IllegalArgumentException(this.getClass().getName());
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)5520852414280389104L, (long)l);
                }
            }
            object = this.q;
        }
        Object object3 = object;
        this.q = object2;
        return object3;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}
