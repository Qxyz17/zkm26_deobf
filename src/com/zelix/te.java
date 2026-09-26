/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmw;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class te
implements lmw {
    private final String Q;
    private static final long a = prr.a((long)8492839643548532342L, (long)7085357411040579117L, MethodHandles.lookup().lookupClass()).a(171664610041088L);

    public boolean Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return true;
    }

    public boolean S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public int hashCode() {
        block5: {
            CallSite callSite;
            block4: {
                long l = a ^ 0x44CBC4A44E1FL;
                CallSite callSite2 = m44.a("k", (long)2105898349756606953L, (long)l);
                try {
                    try {
                        callSite = m44.a("u", (Object)this, (long)289330320806369652L, (long)l);
                        if (callSite2 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)((Object)n92), (long)382555221915386433L, (long)l);
                    }
                    callSite = m44.a("u", (Object)this, (long)289330320806369652L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)((Object)n93), (long)382555221915386433L, (long)l);
                }
            }
            return ((String)((Object)callSite)).hashCode();
        }
        return 0;
    }

    public int n(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return -1;
    }

    public String D(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("r", (Object)this, (long)8535656577986439939L, (long)l);
    }

    public String U(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x2AABF27F19E1L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("r", (Object)this, (Object)objectArray2, (long)8507838590238875078L, (long)l);
    }

    public String B(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0xF10DCA4132EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("u", (Object)this, (Object)objectArray2, (long)8997857409877104393L, (long)l);
    }

    public boolean equals(Object object) {
        boolean bl;
        block12: {
            block13: {
                boolean bl2;
                CallSite callSite;
                long l;
                block14: {
                    te te2;
                    block15: {
                        block17: {
                            CallSite callSite2;
                            block16: {
                                l = a ^ 0x54657C637501L;
                                CallSite callSite3 = m44.a("m", (long)2749368178002219767L, (long)l);
                                try {
                                    bl = object instanceof te;
                                    if (callSite3 != null) break block12;
                                    if (!bl) break block13;
                                }
                                catch (n9 n92) {
                                    throw m44.a("m", (Object)((Object)n92), (long)4490382794135697759L, (long)l);
                                }
                                te2 = (te)object;
                                try {
                                    try {
                                        try {
                                            try {
                                                callSite = m44.a("s", (Object)this, (long)4548064746970997354L, (long)l);
                                                if (callSite3 != null) break block14;
                                                if (callSite == null) break block15;
                                            }
                                            catch (n9 n93) {
                                                throw m44.a("m", (Object)((Object)n93), (long)4490382794135697759L, (long)l);
                                            }
                                            callSite2 = m44.a("s", (Object)te2, (long)4548064746970997354L, (long)l);
                                            if (callSite3 != null) break block16;
                                        }
                                        catch (n9 n94) {
                                            throw m44.a("m", (Object)((Object)n94), (long)4490382794135697759L, (long)l);
                                        }
                                        if (callSite2 == null) break block17;
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("m", (Object)((Object)n95), (long)4490382794135697759L, (long)l);
                                    }
                                    callSite2 = m44.a("s", (Object)this, (long)4548064746970997354L, (long)l);
                                }
                                catch (n9 n96) {
                                    throw m44.a("m", (Object)((Object)n96), (long)4490382794135697759L, (long)l);
                                }
                            }
                            return ((String)((Object)callSite2)).equals(m44.a("s", (Object)te2, (long)4548064746970997354L, (long)l));
                        }
                        return false;
                    }
                    callSite = m44.a("s", (Object)te2, (long)4548064746970997354L, (long)l);
                }
                try {
                    bl2 = callSite == null;
                }
                catch (n9 n97) {
                    throw m44.a("m", (Object)((Object)n97), (long)4490382794135697759L, (long)l);
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    public te(String string) {
        this.Q = string;
    }

    public String x(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("p", (Object)this, (long)220358351264800377L, (long)l);
    }

    public boolean a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return true;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
