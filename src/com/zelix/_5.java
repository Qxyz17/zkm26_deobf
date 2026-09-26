/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.b5;
import com.zelix.lmt;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class _5
implements Comparator {
    private static final long a = prr.a((long)-2873016747292546945L, (long)-4765673120401688228L, MethodHandles.lookup().lookupClass()).a(192185765535725L);

    public int compare(Object object, Object object2) {
        long l = a ^ 0x3B15EF5DB8E6L;
        long l2 = l ^ 0x3848FD67EC62L;
        Object[] objectArray = new Object[3];
        objectArray[2] = l2;
        objectArray[1] = (lmt)object2;
        objectArray[0] = (lmt)object;
        return (int)m44.a("v", (Object)this, (Object)objectArray, (long)7352956708483877995L, (long)l);
    }

    public int O(Object[] objectArray) {
        int n;
        block16: {
            block17: {
                CallSite callSite;
                long l;
                block12: {
                    lmt lmt2;
                    block13: {
                        int n2;
                        block14: {
                            block15: {
                                lmt lmt3 = (lmt)objectArray[0];
                                lmt2 = (lmt)objectArray[1];
                                l = (Long)objectArray[2];
                                l = a ^ l;
                                callSite = m44.a("k", (long)6900224904458472229L, (long)l);
                                try {
                                    try {
                                        try {
                                            try {
                                                n = lmt3 instanceof b5;
                                                if (callSite != false) break block12;
                                                if (n == 0) break block13;
                                            }
                                            catch (n9 n92) {
                                                throw m44.a("k", (Object)((Object)n92), (long)6386280388811816188L, (long)l);
                                            }
                                            n2 = lmt2 instanceof b5;
                                            if (callSite != false) break block14;
                                        }
                                        catch (n9 n93) {
                                            throw m44.a("k", (Object)((Object)n93), (long)6386280388811816188L, (long)l);
                                        }
                                        if (n2 == 0) break block15;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("k", (Object)((Object)n94), (long)6386280388811816188L, (long)l);
                                    }
                                    return 0;
                                }
                                catch (n9 n95) {
                                    throw m44.a("k", (Object)((Object)n95), (long)6386280388811816188L, (long)l);
                                }
                            }
                            n2 = -1;
                        }
                        return n2;
                    }
                    n = lmt2 instanceof b5;
                }
                try {
                    try {
                        if (callSite != false) break block16;
                        if (n == 0) break block17;
                    }
                    catch (n9 n96) {
                        throw m44.a("k", (Object)((Object)n96), (long)6386280388811816188L, (long)l);
                    }
                    return 1;
                }
                catch (n9 n97) {
                    throw m44.a("k", (Object)((Object)n97), (long)6386280388811816188L, (long)l);
                }
            }
            n = 0;
        }
        return n;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
