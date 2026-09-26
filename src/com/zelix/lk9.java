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
    private static final long a = prr.a((long)-2787700652952323039L, (long)6400161261839597553L, MethodHandles.lookup().lookupClass()).a(170685333712521L);

    public lk9(int n, Object object) {
        this.y = n;
        this.D = object;
    }

    public int C(long l, lk9 lk92) {
        int n;
        block18: {
            block19: {
                int n2;
                block20: {
                    block21: {
                        int n3;
                        CallSite callSite;
                        block16: {
                            block17: {
                                l = a ^ l;
                                callSite = m44.a("j", (long)-7008680781540523894L, (long)l);
                                try {
                                    try {
                                        n = this.y;
                                        n3 = lk92.y;
                                        if (callSite != null) break block16;
                                        if (n >= n3) break block17;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("j", (Object)((Object)n92), (long)-9071183274798489111L, (long)l);
                                    }
                                    return -1;
                                }
                                catch (n9 n93) {
                                    throw m44.a("j", (Object)((Object)n93), (long)-9071183274798489111L, (long)l);
                                }
                            }
                            try {
                                n = this.y;
                                if (callSite != null) break block18;
                                n3 = lk92.y;
                            }
                            catch (n9 n94) {
                                throw m44.a("j", (Object)((Object)n94), (long)-9071183274798489111L, (long)l);
                            }
                        }
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (n != n3) break block19;
                                            n2 = this.D instanceof Comparable;
                                            if (callSite != null) break block20;
                                        }
                                        catch (n9 n95) {
                                            throw m44.a("j", (Object)((Object)n95), (long)-9071183274798489111L, (long)l);
                                        }
                                        if (n2 == 0) break block21;
                                    }
                                    catch (n9 n96) {
                                        throw m44.a("j", (Object)((Object)n96), (long)-9071183274798489111L, (long)l);
                                    }
                                    n2 = lk92.D instanceof Comparable;
                                    if (callSite != null) break block20;
                                }
                                catch (n9 n97) {
                                    throw m44.a("j", (Object)((Object)n97), (long)-9071183274798489111L, (long)l);
                                }
                                if (n2 == 0) break block21;
                            }
                            catch (n9 n98) {
                                throw m44.a("j", (Object)((Object)n98), (long)-9071183274798489111L, (long)l);
                            }
                            return (int)m44.a("u", (Object)((Comparable)this.D), (Object)((Comparable)lk92.D), (long)-9093403080260307614L, (long)l);
                        }
                        catch (n9 n99) {
                            throw m44.a("j", (Object)((Object)n99), (long)-9071183274798489111L, (long)l);
                        }
                    }
                    n2 = 0;
                }
                return n2;
            }
            n = 1;
        }
        return n;
    }

    public int compareTo(Object object) {
        long l = a ^ 0x1B4B5B5B6460L;
        long l2 = l ^ 0x10DEDD57F49DL;
        return this.C(l2, (lk9)object);
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
