/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lk7;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lb6
implements lk7,
Comparable,
Serializable {
    private int T;
    private static final long a = prr.a((long)5538580337692974774L, (long)-7588203863156575928L, MethodHandles.lookup().lookupClass()).a(158441780502520L);

    public int compareTo(Object object) {
        long l = a ^ 0x68385345569FL;
        long l2 = l ^ 0x4B377BEABCEL;
        Object[] objectArray = new Object[2];
        objectArray[1] = (lb6)object;
        objectArray[0] = l2;
        return (int)m44.a("r", (Object)this, (Object)objectArray, (long)-6803270844168144026L, (long)l);
    }

    public int q(Object[] objectArray) {
        int n;
        block11: {
            int n2;
            long l;
            block9: {
                CallSite callSite;
                lb6 lb62;
                block10: {
                    l = (Long)objectArray[0];
                    lb62 = (lb6)objectArray[1];
                    l = a ^ l;
                    callSite = m44.a("n", (long)-932158360854401754L, (long)l);
                    try {
                        try {
                            n = this.T;
                            n2 = lb62.T;
                            if (callSite != null) break block9;
                            if (n >= n2) break block10;
                        }
                        catch (n9 n92) {
                            throw m44.a("n", (Object)((Object)n92), (long)-1409217370116218809L, (long)l);
                        }
                        return -1;
                    }
                    catch (n9 n93) {
                        throw m44.a("n", (Object)((Object)n93), (long)-1409217370116218809L, (long)l);
                    }
                }
                try {
                    n = this.T;
                    if (callSite != null) break block11;
                    n2 = lb62.T;
                }
                catch (n9 n94) {
                    throw m44.a("n", (Object)((Object)n94), (long)-1409217370116218809L, (long)l);
                }
            }
            try {
                if (n == n2) {
                    return 0;
                }
            }
            catch (n9 n95) {
                throw m44.a("n", (Object)((Object)n95), (long)-1409217370116218809L, (long)l);
            }
            n = 1;
        }
        return n;
    }

    public int V(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        this.T += n;
        return this.T;
    }

    public int f(long l) {
        return ++this.T;
    }

    public lb6(int n) {
        this.T = n;
    }

    public int b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return this.T++;
    }

    public boolean equals(Object object) {
        boolean bl;
        block12: {
            block11: {
                int n;
                block13: {
                    block14: {
                        Object object2;
                        CallSite callSite;
                        long l;
                        block10: {
                            l = a ^ 0x4AF00E61169AL;
                            callSite = m44.a("h", (long)-5034846228717096L, (long)l);
                            try {
                                object2 = object;
                                if (callSite != null) break block10;
                                if (object2 == null) break block11;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)((Object)n92), (long)-2265549782330331975L, (long)l);
                            }
                            object2 = object;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        bl = object2 instanceof lb6;
                                        if (callSite != null) break block12;
                                        if (!bl) break block11;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("h", (Object)((Object)n93), (long)-2265549782330331975L, (long)l);
                                    }
                                    n = this.T;
                                    if (callSite != null) break block13;
                                }
                                catch (n9 n94) {
                                    throw m44.a("h", (Object)((Object)n94), (long)-2265549782330331975L, (long)l);
                                }
                                if (n != ((lb6)object).T) break block14;
                            }
                            catch (n9 n95) {
                                throw m44.a("h", (Object)((Object)n95), (long)-2265549782330331975L, (long)l);
                            }
                            n = 1;
                            break block13;
                        }
                        catch (n9 n96) {
                            throw m44.a("h", (Object)((Object)n96), (long)-2265549782330331975L, (long)l);
                        }
                    }
                    n = 0;
                }
                return n != 0;
            }
            bl = false;
        }
        return bl;
    }

    public int J(Object[] objectArray) {
        --this.T;
        return this.T;
    }

    public void P(int n) {
        this.T = n;
    }

    public int hashCode() {
        return this.T;
    }

    public int U(long l) {
        return this.T;
    }

    public lb6() {
        this(0);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
