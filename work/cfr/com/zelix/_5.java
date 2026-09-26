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
    private static final long a = prr.a(-2873016747292546945L, -4765673120401688228L, MethodHandles.lookup().lookupClass()).a(192185765535725L);

    public int compare(Object object, Object object2) {
        long l10 = a ^ 0x3B15EF5DB8E6L;
        long l11 = l10 ^ 0x3848FD67EC62L;
        Object[] objectArray = new Object[3];
        objectArray[2] = l11;
        objectArray[1] = (lmt)object2;
        objectArray[0] = (lmt)object;
        return (int)m44.a("v", (Object)this, (Object)objectArray, (long)7352956708483877995L, (long)l10);
    }

    public int O(Object[] objectArray) {
        int n10;
        block16: {
            block17: {
                CallSite callSite;
                long l10;
                block12: {
                    lmt lmt2;
                    block13: {
                        int n11;
                        block14: {
                            block15: {
                                lmt lmt3 = (lmt)objectArray[0];
                                lmt2 = (lmt)objectArray[1];
                                l10 = (Long)objectArray[2];
                                l10 = a ^ l10;
                                callSite = m44.a("k", (long)6900224904458472229L, (long)l10);
                                try {
                                    try {
                                        try {
                                            try {
                                                n10 = lmt3 instanceof b5;
                                                if (callSite != false) break block12;
                                                if (n10 == 0) break block13;
                                            }
                                            catch (n9 n92) {
                                                throw m44.a("k", (Object)n92, (long)6386280388811816188L, (long)l10);
                                            }
                                            n11 = lmt2 instanceof b5;
                                            if (callSite != false) break block14;
                                        }
                                        catch (n9 n93) {
                                            throw m44.a("k", (Object)n93, (long)6386280388811816188L, (long)l10);
                                        }
                                        if (n11 == 0) break block15;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("k", (Object)n94, (long)6386280388811816188L, (long)l10);
                                    }
                                    return 0;
                                }
                                catch (n9 n95) {
                                    throw m44.a("k", (Object)n95, (long)6386280388811816188L, (long)l10);
                                }
                            }
                            n11 = -1;
                        }
                        return n11;
                    }
                    n10 = lmt2 instanceof b5;
                }
                try {
                    try {
                        if (callSite != false) break block16;
                        if (n10 == 0) break block17;
                    }
                    catch (n9 n96) {
                        throw m44.a("k", (Object)n96, (long)6386280388811816188L, (long)l10);
                    }
                    return 1;
                }
                catch (n9 n97) {
                    throw m44.a("k", (Object)n97, (long)6386280388811816188L, (long)l10);
                }
            }
            n10 = 0;
        }
        return n10;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

