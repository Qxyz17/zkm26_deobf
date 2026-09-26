/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l6x;
import com.zelix.m44;
import com.zelix.os;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class u0
implements Iterator {
    private l6x U;
    private l6x G;
    final os b;
    private boolean N;
    private os T;
    private static final long a = prr.a((long)4183082796158303629L, (long)1197333471007376257L, MethodHandles.lookup().lookupClass()).a(109928192141263L);

    @Override
    public boolean hasNext() {
        boolean bl;
        long l = a ^ 0x771F8720D435L;
        long l2 = l ^ 0x6C09DA5585F7L;
        try {
            this.G = this.R(l2);
            bl = this.G != null;
        }
        catch (NoSuchElementException noSuchElementException) {
            throw m44.a("h", (Object)noSuchElementException, (long)2483084938888439230L, (long)l);
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    private l6x R(long var1_1) {
        block28: {
            block29: {
                block24: {
                    block25: {
                        block27: {
                            block26: {
                                block22: {
                                    block23: {
                                        block20: {
                                            block21: {
                                                var3_2 = (var1_1 = u0.a ^ var1_1) ^ 56156122502250L;
                                                var5_3 = m44.a("m", (long)6882407832966283701L, (long)var1_1);
                                                try {
                                                    try {
                                                        try {
                                                            v0 = this;
                                                            if (var5_3 != null) break block20;
                                                            if (v0.N) break block21;
                                                        }
                                                        catch (NoSuchElementException v1) {
                                                            throw m44.a("m", (Object)v1, (long)6541690890089274627L, (long)var1_1);
                                                        }
                                                        v2 = this.G;
                                                        v3 = var5_3;
                                                        if (var1_1 > 0L) {
                                                            if (v3 != null) break block22;
                                                        }
                                                        ** GOTO lbl37
                                                    }
                                                    catch (NoSuchElementException v4) {
                                                        throw m44.a("m", (Object)v4, (long)6541690890089274627L, (long)var1_1);
                                                    }
                                                    if (v2 == null) break block23;
                                                }
                                                catch (NoSuchElementException v5) {
                                                    throw m44.a("m", (Object)v5, (long)6541690890089274627L, (long)var1_1);
                                                }
                                            }
                                            v0 = this;
                                        }
                                        return v0.G;
                                    }
                                    v2 = this.U;
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                v3 = var5_3;
lbl37:
                                                // 2 sources

                                                if (var1_1 >= 0L) {
                                                    if (v3 != null) break block24;
                                                    if (v2 != null) break block25;
                                                }
                                                ** GOTO lbl67
                                            }
                                            catch (NoSuchElementException v6) {
                                                throw m44.a("m", (Object)v6, (long)6541690890089274627L, (long)var1_1);
                                            }
                                            v7 = os.f((os)this.T);
                                            if (var5_3 != null) break block26;
                                        }
                                        catch (NoSuchElementException v8) {
                                            throw m44.a("m", (Object)v8, (long)6541690890089274627L, (long)var1_1);
                                        }
                                        if (v7 == null) break block27;
                                    }
                                    catch (NoSuchElementException v9) {
                                        throw m44.a("m", (Object)v9, (long)6541690890089274627L, (long)var1_1);
                                    }
                                    v7 = os.f((os)this.T);
                                }
                                catch (NoSuchElementException v10) {
                                    throw m44.a("m", (Object)v10, (long)6541690890089274627L, (long)var1_1);
                                }
                            }
                            return v7;
                        }
                        return null;
                    }
                    v2 = this.U;
                }
                try {
                    try {
                        v3 = var5_3;
lbl67:
                        // 2 sources

                        if (v3 != null) break block28;
                        if (l6x.J((l6x)v2).size() <= 0) break block29;
                    }
                    catch (NoSuchElementException v11) {
                        throw m44.a("m", (Object)v11, (long)6541690890089274627L, (long)var1_1);
                    }
                    return (l6x)l6x.J((l6x)this.U).get(0);
                }
                catch (NoSuchElementException v12) {
                    throw m44.a("m", (Object)v12, (long)6541690890089274627L, (long)var1_1);
                }
            }
            v2 = this.a(var3_2, this.U);
        }
        var6_4 = v2;
        return var6_4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void remove() {
        CallSite callSite;
        long l;
        block11: {
            u0 u02;
            long l2;
            long l3;
            block10: {
                long l4 = l = a ^ 0x5D359B8943E5L;
                l3 = l4 ^ 0x6894D6AD3B07L;
                l2 = l4 ^ 0x2BDBC52CE25DL;
                callSite = m44.a("h", (long)-5697507679937450280L, (long)l);
                try {
                    try {
                        u02 = this;
                        if (callSite != null) break block10;
                        if (u02.U == null) throw new IllegalStateException();
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        throw m44.a("h", (Object)noSuchElementException, (long)-5357706090023161234L, (long)l);
                    }
                    u02 = this;
                }
                catch (NoSuchElementException noSuchElementException) {
                    throw m44.a("h", (Object)noSuchElementException, (long)-5357706090023161234L, (long)l);
                }
            }
            try {
                try {
                    if (callSite != null) break block11;
                    if (u02.N) throw new IllegalStateException();
                }
                catch (NoSuchElementException noSuchElementException) {
                    throw m44.a("h", (Object)noSuchElementException, (long)-5357706090023161234L, (long)l);
                }
                this.N = true;
                this.G = null;
                this.G = this.a(l3, this.U);
                Object[] objectArray = new Object[3];
                objectArray[2] = l2;
                objectArray[1] = this.U;
                objectArray[0] = this.T;
                m44.a("h", (Object)objectArray, (long)-6056627729467443513L, (long)l);
                u02 = this;
            }
            catch (NoSuchElementException noSuchElementException) {
                throw m44.a("h", (Object)noSuchElementException, (long)-5357706090023161234L, (long)l);
            }
        }
        try {
            u02.U = null;
            if (callSite == null) return;
            throw new IllegalStateException();
        }
        catch (NoSuchElementException noSuchElementException) {
            throw m44.a("h", (Object)noSuchElementException, (long)-5357706090023161234L, (long)l);
        }
    }

    private l6x a(long l, l6x l6x2) {
        l6x l6x3;
        l6x l6x4;
        long l2;
        block7: {
            block8: {
                l2 = (l = a ^ l) ^ 0x1DA5CDEAFD4AL;
                l6x4 = l6x.Y((l6x)l6x2);
                CallSite callSite = m44.a("m", (long)8548702642673772693L, (long)l);
                try {
                    try {
                        l6x3 = l6x4;
                        if (callSite != null) break block7;
                        if (l6x3 != null) break block8;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        throw m44.a("m", (Object)noSuchElementException, (long)8352188857403257891L, (long)l);
                    }
                    return null;
                }
                catch (NoSuchElementException noSuchElementException) {
                    throw m44.a("m", (Object)noSuchElementException, (long)8352188857403257891L, (long)l);
                }
            }
            l6x3 = l6x4;
        }
        int n = l6x.J((l6x)l6x3).indexOf(l6x2);
        try {
            if (n < l6x.J((l6x)l6x4).size() - 1) {
                return (l6x)l6x.J((l6x)l6x4).get(n + 1);
            }
        }
        catch (NoSuchElementException noSuchElementException) {
            throw m44.a("m", (Object)noSuchElementException, (long)8352188857403257891L, (long)l);
        }
        return this.a(l2, l6x4);
    }

    u0(os os2, os os3) {
        this.b = os2;
        this.T = os3;
    }

    public Object next() {
        long l = a ^ 0x45151F4FD50EL;
        long l2 = l ^ 0xC4EE840DF0FL;
        long l3 = l2 >>> 32;
        int n = (int)(l2 << 32 >>> 32);
        return this.i(l3, n);
    }

    public l6x i(long l, int n) {
        l6x l6x2;
        block4: {
            block5: {
                long l2 = (l << 32 | (long)n << 32 >>> 32) ^ a;
                long l3 = l2 ^ 0x4FE86790A689L;
                this.U = this.R(l3);
                this.N = false;
                CallSite callSite = m44.a("n", (long)306362663077157494L, (long)l2);
                try {
                    try {
                        this.G = null;
                        l6x2 = this.U;
                        if (callSite != null) break block4;
                        if (l6x2 != null) break block5;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        throw m44.a("n", (Object)noSuchElementException, (long)75315967425791680L, (long)l2);
                    }
                    throw new NoSuchElementException();
                }
                catch (NoSuchElementException noSuchElementException) {
                    throw m44.a("n", (Object)noSuchElementException, (long)75315967425791680L, (long)l2);
                }
            }
            l6x2 = this.U;
        }
        return l6x2;
    }

    private static NoSuchElementException a(NoSuchElementException noSuchElementException) {
        return noSuchElementException;
    }
}
