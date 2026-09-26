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
    private static final long a = prr.a(5538580337692974774L, -7588203863156575928L, MethodHandles.lookup().lookupClass()).a(158441780502520L);

    public int compareTo(Object object) {
        long l10 = a ^ 0x68385345569FL;
        long l11 = l10 ^ 0x4B377BEABCEL;
        Object[] objectArray = new Object[2];
        objectArray[1] = (lb6)object;
        objectArray[0] = l11;
        return (int)m44.a("r", (Object)this, (Object)objectArray, (long)-6803270844168144026L, (long)l10);
    }

    public int q(Object[] objectArray) {
        int n10;
        block11: {
            int n11;
            long l10;
            block9: {
                CallSite callSite;
                lb6 lb62;
                block10: {
                    l10 = (Long)objectArray[0];
                    lb62 = (lb6)objectArray[1];
                    l10 = a ^ l10;
                    callSite = m44.a("n", (long)-932158360854401754L, (long)l10);
                    try {
                        try {
                            n10 = this.T;
                            n11 = lb62.T;
                            if (callSite != null) break block9;
                            if (n10 >= n11) break block10;
                        }
                        catch (n9 n92) {
                            throw m44.a("n", (Object)n92, (long)-1409217370116218809L, (long)l10);
                        }
                        return -1;
                    }
                    catch (n9 n93) {
                        throw m44.a("n", (Object)n93, (long)-1409217370116218809L, (long)l10);
                    }
                }
                try {
                    n10 = this.T;
                    if (callSite != null) break block11;
                    n11 = lb62.T;
                }
                catch (n9 n94) {
                    throw m44.a("n", (Object)n94, (long)-1409217370116218809L, (long)l10);
                }
            }
            try {
                if (n10 == n11) {
                    return 0;
                }
            }
            catch (n9 n95) {
                throw m44.a("n", (Object)n95, (long)-1409217370116218809L, (long)l10);
            }
            n10 = 1;
        }
        return n10;
    }

    @Override
    public int V(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        this.T += n10;
        return this.T;
    }

    @Override
    public int f(long l10) {
        return ++this.T;
    }

    public lb6(int n10) {
        this.T = n10;
    }

    @Override
    public int b(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return this.T++;
    }

    public boolean equals(Object object) {
        boolean bl2;
        block12: {
            block11: {
                int n10;
                block13: {
                    block14: {
                        Object object2;
                        CallSite callSite;
                        long l10;
                        block10: {
                            l10 = a ^ 0x4AF00E61169AL;
                            callSite = m44.a("h", (long)-5034846228717096L, (long)l10);
                            try {
                                object2 = object;
                                if (callSite != null) break block10;
                                if (object2 == null) break block11;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)n92, (long)-2265549782330331975L, (long)l10);
                            }
                            object2 = object;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        bl2 = object2 instanceof lb6;
                                        if (callSite != null) break block12;
                                        if (!bl2) break block11;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("h", (Object)n93, (long)-2265549782330331975L, (long)l10);
                                    }
                                    n10 = this.T;
                                    if (callSite != null) break block13;
                                }
                                catch (n9 n94) {
                                    throw m44.a("h", (Object)n94, (long)-2265549782330331975L, (long)l10);
                                }
                                if (n10 != ((lb6)object).T) break block14;
                            }
                            catch (n9 n95) {
                                throw m44.a("h", (Object)n95, (long)-2265549782330331975L, (long)l10);
                            }
                            n10 = 1;
                            break block13;
                        }
                        catch (n9 n96) {
                            throw m44.a("h", (Object)n96, (long)-2265549782330331975L, (long)l10);
                        }
                    }
                    n10 = 0;
                }
                return n10 != 0;
            }
            bl2 = false;
        }
        return bl2;
    }

    public int J(Object[] objectArray) {
        --this.T;
        return this.T;
    }

    public void P(int n10) {
        this.T = n10;
    }

    public int hashCode() {
        return this.T;
    }

    @Override
    public int U(long l10) {
        return this.T;
    }

    public lb6() {
        this(0);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

