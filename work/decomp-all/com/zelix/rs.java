/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class rs
implements Comparable,
Serializable {
    protected long I;
    private static final long a = prr.a((long)-451073497697517577L, (long)7268819845695121126L, MethodHandles.lookup().lookupClass()).a(92902651641090L);

    public rs(long l, long l2) {
        l2 = a ^ l2;
        m44.a("t", (Object)this, (long)l, (long)2924542511787151761L, (long)l2);
    }

    public int hashCode() {
        long l = a ^ 0x26324E5041D7L;
        return (int)m44.a("r", (Object)this, (long)-7691447475596645307L, (long)l);
    }

    public boolean equals(Object object) {
        boolean bl;
        block10: {
            block9: {
                Object object2;
                block11: {
                    block12: {
                        Object object3;
                        CallSite callSite;
                        long l;
                        block8: {
                            l = a ^ 0x2519AB1B89F4L;
                            callSite = m44.a("o", (long)4990303533607574391L, (long)l);
                            try {
                                object3 = object;
                                if (callSite != null) break block8;
                                if (object3 == null) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("o", (Object)((Object)n92), (long)4706549112080477177L, (long)l);
                            }
                            object3 = object;
                        }
                        try {
                            try {
                                try {
                                    bl = object3 instanceof rs;
                                    if (callSite != null) break block10;
                                    if (!bl) break block9;
                                }
                                catch (n9 n93) {
                                    throw m44.a("o", (Object)((Object)n93), (long)4706549112080477177L, (long)l);
                                }
                                reference cfr_temp_0 = m44.a("q", (Object)this, (long)6728798330340992102L, (long)l) - m44.a("q", (Object)((rs)object), (long)6728798330340992102L, (long)l);
                                object2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                if (callSite != null) break block11;
                            }
                            catch (n9 n94) {
                                throw m44.a("o", (Object)((Object)n94), (long)4706549112080477177L, (long)l);
                            }
                            if (object2 != false) break block12;
                        }
                        catch (n9 n95) {
                            throw m44.a("o", (Object)((Object)n95), (long)4706549112080477177L, (long)l);
                        }
                        object2 = true;
                        break block11;
                    }
                    object2 = false;
                }
                return (boolean)object2;
            }
            bl = false;
        }
        return bl;
    }

    public void j(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        m44.a("p", (Object)this, (long)l, (long)-3057254967810921323L, (long)l2);
    }

    public long p(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (long)m44.a("s", (Object)this, (long)4301877118026056372L, (long)l);
    }

    public rs(long l) {
        long l2 = (l = a ^ l) ^ 0x291336943F51L;
        this(0L, l2);
    }

    public int k(Object[] objectArray) {
        reference v0;
        block10: {
            block11: {
                CallSite callSite;
                long l;
                block8: {
                    rs rs2;
                    block9: {
                        l = (Long)objectArray[0];
                        rs2 = (rs)objectArray[1];
                        l = a ^ l;
                        callSite = m44.a("i", (long)-2204769850902511791L, (long)l);
                        try {
                            try {
                                reference v0 = m44.a("w", (Object)this, (long)-484289306621394880L, (long)l) - m44.a("w", (Object)rs2, (long)-484289306621394880L, (long)l);
                                v0 = v0 == 0 ? 0 : (v0 < 0 ? -1 : 1);
                                if (callSite != null) break block8;
                                if (v0 >= 0) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("i", (Object)((Object)n92), (long)-1912043692457979937L, (long)l);
                            }
                            return -1;
                        }
                        catch (n9 n93) {
                            throw m44.a("i", (Object)((Object)n93), (long)-1912043692457979937L, (long)l);
                        }
                    }
                    reference v0 = m44.a("w", (Object)this, (long)-484289306621394880L, (long)l) - m44.a("w", (Object)rs2, (long)-484289306621394880L, (long)l);
                    v0 = v0 == 0 ? 0 : (v0 < 0 ? -1 : 1);
                }
                try {
                    try {
                        if (callSite != null) break block10;
                        if (v0 != false) break block11;
                    }
                    catch (n9 n94) {
                        throw m44.a("i", (Object)((Object)n94), (long)-1912043692457979937L, (long)l);
                    }
                    return 0;
                }
                catch (n9 n95) {
                    throw m44.a("i", (Object)((Object)n95), (long)-1912043692457979937L, (long)l);
                }
            }
            v0 = (reference)true;
        }
        return (int)v0;
    }

    public int compareTo(Object object) {
        long l = a ^ 0x1BAEFBBBD7F4L;
        long l2 = l ^ 0x2C4D84EA38D2L;
        Object[] objectArray = new Object[2];
        objectArray[1] = (rs)object;
        objectArray[0] = l2;
        return (int)m44.a("p", (Object)this, (Object)objectArray, (long)1811984203102036517L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
