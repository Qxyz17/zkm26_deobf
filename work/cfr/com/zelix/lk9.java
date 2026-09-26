/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lk9
implements Comparable {
    private Object D;
    private int y;
    private static final long a = prr.a(-2787700652952323039L, 6400161261839597553L, MethodHandles.lookup().lookupClass()).a(170685333712521L);

    public lk9(int n10, Object object) {
        this.y = n10;
        this.D = object;
    }

    public int C(long l10, lk9 lk92) {
        int n10;
        block18: {
            block19: {
                int n11;
                block20: {
                    block21: {
                        int n12;
                        CallSite callSite;
                        block16: {
                            block17: {
                                l10 = a ^ l10;
                                callSite = m44.a("j", (long)-7008680781540523894L, (long)l10);
                                try {
                                    try {
                                        n10 = this.y;
                                        n12 = lk92.y;
                                        if (callSite != null) break block16;
                                        if (n10 >= n12) break block17;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("j", (Object)n92, (long)-9071183274798489111L, (long)l10);
                                    }
                                    return -1;
                                }
                                catch (n9 n93) {
                                    throw m44.a("j", (Object)n93, (long)-9071183274798489111L, (long)l10);
                                }
                            }
                            try {
                                n10 = this.y;
                                if (callSite != null) break block18;
                                n12 = lk92.y;
                            }
                            catch (n9 n94) {
                                throw m44.a("j", (Object)n94, (long)-9071183274798489111L, (long)l10);
                            }
                        }
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (n10 != n12) break block19;
                                            n11 = this.D instanceof Comparable;
                                            if (callSite != null) break block20;
                                        }
                                        catch (n9 n95) {
                                            throw m44.a("j", (Object)n95, (long)-9071183274798489111L, (long)l10);
                                        }
                                        if (n11 == 0) break block21;
                                    }
                                    catch (n9 n96) {
                                        throw m44.a("j", (Object)n96, (long)-9071183274798489111L, (long)l10);
                                    }
                                    n11 = lk92.D instanceof Comparable;
                                    if (callSite != null) break block20;
                                }
                                catch (n9 n97) {
                                    throw m44.a("j", (Object)n97, (long)-9071183274798489111L, (long)l10);
                                }
                                if (n11 == 0) break block21;
                            }
                            catch (n9 n98) {
                                throw m44.a("j", (Object)n98, (long)-9071183274798489111L, (long)l10);
                            }
                            return (int)m44.a("u", (Object)((Comparable)this.D), (Object)((Comparable)lk92.D), (long)-9093403080260307614L, (long)l10);
                        }
                        catch (n9 n99) {
                            throw m44.a("j", (Object)n99, (long)-9071183274798489111L, (long)l10);
                        }
                    }
                    n11 = 0;
                }
                return n11;
            }
            n10 = 1;
        }
        return n10;
    }

    public int compareTo(Object object) {
        long l10 = a ^ 0x1B4B5B5B6460L;
        long l11 = l10 ^ 0x10DEDD57F49DL;
        return this.C(l11, (lk9)object);
    }

    public final int n() {
        return this.y;
    }

    public final Object W() {
        return this.D;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

