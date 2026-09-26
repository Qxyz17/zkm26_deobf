/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.bn;
import com.zelix.lml;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class ek {
    private boolean b;
    private bn t;
    private int O;
    private lml D;
    private static final long a = prr.a((long)7439022673622554622L, (long)6892831334745602691L, MethodHandles.lookup().lookupClass()).a(138224271297169L);

    boolean i(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (boolean)m44.a("t", (Object)this, (long)6141976192614168589L, (long)l);
    }

    public int hashCode() {
        long l = a ^ 0x75E6879A2BCDL;
        return (int)m44.a("v", (Object)this, (long)7339917298759486170L, (long)l);
    }

    ek(lml lml2, long l, bn bn2, boolean bl) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x6640A3A9C278L;
        long l4 = l2 ^ 0x4F1CC84074D4L;
        long l5 = l2 ^ 0x5BC74F9D051L;
        m44.a("v", (Object)this, (boolean)false, (long)-8945118825360085267L, (long)l);
        m44.a("v", (Object)this, (lml)lml2, (long)-6994069322078156545L, (long)l);
        m44.a("v", (Object)this, (bn)bn2, (long)-8815773112378919623L, (long)l);
        m44.a("v", (Object)this, (boolean)bl, (long)-8945118825360085267L, (long)l);
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        m44.a("v", (Object)this, (int)(((String)((Object)m44.a("u", (Object)lml2, (Object)objectArray, (long)-7305894262060362864L, (long)l))).hashCode() ^ ((String)((Object)m44.a("u", (Object)bn2, (Object)objectArray2, (long)-8820486693937501025L, (long)l))).hashCode() ^ bn2.h(l4).hashCode()), (long)-7181347522843954352L, (long)l);
    }

    bn k(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("p", (Object)this, (long)6857983911956983741L, (long)l);
    }

    ek(lml lml2, boolean bl, char c, int n, char c2) {
        long l = ((long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x3A2EF5047D90L;
        m44.a("v", (Object)this, (boolean)false, (long)4338322946489389317L, (long)l);
        m44.a("v", (Object)this, (lml)lml2, (long)2384743343767598871L, (long)l);
        m44.a("v", (Object)this, null, (long)4197435536465152721L, (long)l);
        m44.a("v", (Object)this, (boolean)bl, (long)4338322946489389317L, (long)l);
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        m44.a("v", (Object)this, (int)((String)((Object)m44.a("u", (Object)lml2, (Object)objectArray, (long)2698891538942815352L, (long)l))).hashCode(), (long)2575749026094550200L, (long)l);
    }

    lml V(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("s", (Object)this, (long)-5059977343290036280L, (long)l);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        Object object2;
        block44: {
            CallSite callSite;
            ek ek2;
            CallSite callSite2;
            long l;
            long l2;
            block54: {
                block53: {
                    block51: {
                        ek ek3;
                        block47: {
                            block48: {
                                CallSite callSite3;
                                long l3;
                                block50: {
                                    block49: {
                                        block45: {
                                            long l4 = l2 = a ^ 0x7123D42FF026L;
                                            l3 = l4 ^ 0x47190D10E019L;
                                            l = l4 ^ 0x1D73EAC0C32AL;
                                            callSite2 = m44.a("k", (long)-6790915326639666499L, (long)l2);
                                            try {
                                                boolean bl = object instanceof ek;
                                                if (callSite2 == false) return bl;
                                                if (!bl) return false;
                                            }
                                            catch (n9 n92) {
                                                throw m44.a("k", (Object)((Object)n92), (long)-5176808691819001300L, (long)l2);
                                            }
                                            ek2 = (ek)object;
                                            try {
                                                block46: {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        object2 = m44.a("u", (Object)this, (long)-4740149519516692175L, (long)l2);
                                                                        if (callSite2 == false) return (boolean)object2;
                                                                        if (object2 != m44.a("u", (Object)ek2, (long)-4740149519516692175L, (long)l2)) break block44;
                                                                    }
                                                                    catch (n9 n93) {
                                                                        throw m44.a("k", (Object)((Object)n93), (long)-5176808691819001300L, (long)l2);
                                                                    }
                                                                    callSite3 = m44.a("u", (Object)this, (long)-4859047167980328290L, (long)l2);
                                                                    if (callSite2 == false) break block45;
                                                                }
                                                                catch (n9 n94) {
                                                                    throw m44.a("k", (Object)((Object)n94), (long)-5176808691819001300L, (long)l2);
                                                                }
                                                                if (callSite3 != null) break block46;
                                                            }
                                                            catch (n9 n95) {
                                                                throw m44.a("k", (Object)((Object)n95), (long)-5176808691819001300L, (long)l2);
                                                            }
                                                            ek3 = ek2;
                                                            if (callSite2 == false) break block47;
                                                        }
                                                        catch (n9 n96) {
                                                            throw m44.a("k", (Object)((Object)n96), (long)-5176808691819001300L, (long)l2);
                                                        }
                                                        if (m44.a("u", (Object)ek3, (long)-4859047167980328290L, (long)l2) == null) break block48;
                                                    }
                                                    catch (n9 n97) {
                                                        throw m44.a("k", (Object)((Object)n97), (long)-5176808691819001300L, (long)l2);
                                                    }
                                                }
                                                callSite3 = m44.a("u", (Object)this, (long)-4859047167980328290L, (long)l2);
                                            }
                                            catch (n9 n98) {
                                                throw m44.a("k", (Object)((Object)n98), (long)-5176808691819001300L, (long)l2);
                                            }
                                        }
                                        try {
                                            try {
                                                if (callSite2 == false) break block49;
                                                if (callSite3 == null) break block44;
                                            }
                                            catch (n9 n99) {
                                                throw m44.a("k", (Object)((Object)n99), (long)-5176808691819001300L, (long)l2);
                                            }
                                            callSite3 = m44.a("u", (Object)ek2, (long)-4859047167980328290L, (long)l2);
                                        }
                                        catch (n9 n910) {
                                            throw m44.a("k", (Object)((Object)n910), (long)-5176808691819001300L, (long)l2);
                                        }
                                    }
                                    try {
                                        try {
                                            if (callSite2 == false) break block50;
                                            if (callSite3 == null) break block44;
                                        }
                                        catch (n9 n911) {
                                            throw m44.a("k", (Object)((Object)n911), (long)-5176808691819001300L, (long)l2);
                                        }
                                        callSite3 = m44.a("u", (Object)this, (long)-4859047167980328290L, (long)l2);
                                    }
                                    catch (n9 n912) {
                                        throw m44.a("k", (Object)((Object)n912), (long)-5176808691819001300L, (long)l2);
                                    }
                                }
                                try {
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l3;
                                    Object[] objectArray2 = new Object[1];
                                    objectArray2[0] = l3;
                                    object2 = ((String)((Object)m44.a("t", (Object)callSite3, (Object)objectArray, (long)-5116899818183396879L, (long)l2))).equals(m44.a("t", (Object)m44.a("u", (Object)ek2, (long)-4859047167980328290L, (long)l2), (Object)objectArray2, (long)-5116899818183396879L, (long)l2));
                                    if (callSite2 == false) return (boolean)object2;
                                    if (object2 == false) break block44;
                                }
                                catch (n9 n913) {
                                    throw m44.a("k", (Object)((Object)n913), (long)-5176808691819001300L, (long)l2);
                                }
                            }
                            ek3 = this;
                        }
                        try {
                            block52: {
                                try {
                                    try {
                                        try {
                                            callSite = m44.a("u", (Object)ek3, (long)-6356491853498427560L, (long)l2);
                                            if (callSite2 == false) break block51;
                                            if (callSite != null) break block52;
                                        }
                                        catch (n9 n914) {
                                            throw m44.a("k", (Object)((Object)n914), (long)-5176808691819001300L, (long)l2);
                                        }
                                        callSite = m44.a("u", (Object)ek2, (long)-6356491853498427560L, (long)l2);
                                        if (callSite2 == false) break block51;
                                    }
                                    catch (n9 n915) {
                                        throw m44.a("k", (Object)((Object)n915), (long)-5176808691819001300L, (long)l2);
                                    }
                                    if (callSite == null) return true;
                                }
                                catch (n9 n916) {
                                    throw m44.a("k", (Object)((Object)n916), (long)-5176808691819001300L, (long)l2);
                                }
                            }
                            callSite = m44.a("u", (Object)this, (long)-6356491853498427560L, (long)l2);
                        }
                        catch (n9 n917) {
                            throw m44.a("k", (Object)((Object)n917), (long)-5176808691819001300L, (long)l2);
                        }
                    }
                    try {
                        try {
                            if (callSite2 == false) break block53;
                            if (callSite == null) return false;
                        }
                        catch (n9 n918) {
                            throw m44.a("k", (Object)((Object)n918), (long)-5176808691819001300L, (long)l2);
                        }
                        callSite = m44.a("u", (Object)ek2, (long)-6356491853498427560L, (long)l2);
                    }
                    catch (n9 n919) {
                        throw m44.a("k", (Object)((Object)n919), (long)-5176808691819001300L, (long)l2);
                    }
                }
                try {
                    try {
                        if (callSite2 == false) break block54;
                        if (callSite == null) return false;
                    }
                    catch (n9 n920) {
                        throw m44.a("k", (Object)((Object)n920), (long)-5176808691819001300L, (long)l2);
                    }
                    callSite = m44.a("u", (Object)this, (long)-6356491853498427560L, (long)l2);
                }
                catch (n9 n921) {
                    throw m44.a("k", (Object)((Object)n921), (long)-5176808691819001300L, (long)l2);
                }
            }
            try {
                try {
                    Object[] objectArray = new Object[2];
                    objectArray[1] = m44.a("u", (Object)ek2, (long)-6356491853498427560L, (long)l2);
                    objectArray[0] = l;
                    Object object3 = m44.a("t", (Object)callSite, (Object)objectArray, (long)-5023938278487914835L, (long)l2);
                    if (callSite2 == false) return object3;
                    if (!object3) return false;
                    return true;
                }
                catch (n9 n922) {
                    throw m44.a("k", (Object)((Object)n922), (long)-5176808691819001300L, (long)l2);
                }
            }
            catch (n9 n923) {
                throw m44.a("k", (Object)((Object)n923), (long)-5176808691819001300L, (long)l2);
            }
        }
        object2 = false;
        return (boolean)object2;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
