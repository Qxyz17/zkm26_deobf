/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._v;
import com.zelix.b0;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lky {
    private final _v k;
    private final int i;
    private final b0 a;
    private static final long b = prr.a(-688883481316025547L, 5661337989622164901L, MethodHandles.lookup().lookupClass()).a(167736380801436L);

    public boolean r(Object[] objectArray) {
        return this.a.J();
    }

    public _v g(Object[] objectArray) {
        return this.k;
    }

    public boolean equals(Object object) {
        boolean bl2;
        block8: {
            block9: {
                boolean bl3;
                block12: {
                    block11: {
                        lky lky2;
                        lky lky3;
                        long l10;
                        block10: {
                            l10 = b ^ 0x6F5AAB304248L;
                            CallSite callSite = m44.a("n", (long)-5884041431207387361L, (long)l10);
                            try {
                                bl2 = object instanceof lky;
                                if (callSite == false) break block8;
                                if (!bl2) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("n", (Object)n92, (long)-6212010137364355118L, (long)l10);
                            }
                            lky3 = (lky)object;
                            try {
                                try {
                                    lky2 = this;
                                    if (callSite == false) break block10;
                                    if (lky2.a != lky3.a) break block11;
                                }
                                catch (n9 n93) {
                                    throw m44.a("n", (Object)n93, (long)-6212010137364355118L, (long)l10);
                                }
                                lky2 = this;
                            }
                            catch (n9 n94) {
                                throw m44.a("n", (Object)n94, (long)-6212010137364355118L, (long)l10);
                            }
                        }
                        try {
                            if (lky2.k != lky3.k) break block11;
                            bl3 = true;
                            break block12;
                        }
                        catch (n9 n95) {
                            throw m44.a("n", (Object)n95, (long)-6212010137364355118L, (long)l10);
                        }
                    }
                    bl3 = false;
                }
                return bl3;
            }
            bl2 = false;
        }
        return bl2;
    }

    public String w(Object[] objectArray) {
        return this.a.V();
    }

    public b0 v() {
        return this.a;
    }

    public lky(b0 b02, _v _v2) {
        this.a = b02;
        this.k = _v2;
        this.i = b02.hashCode() ^ _v2.hashCode();
    }

    public String X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = b ^ l10) ^ 0xD371F69E089L;
        return this.a.d(l11);
    }

    public String T(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = b ^ l10;
        long l12 = l11 ^ 0x4818A31FFA9AL;
        long l13 = l11 ^ 0x7B186C7F33EAL;
        return this.a.G(l13).T(l12);
    }

    public boolean f() {
        return this.a.e();
    }

    public String f(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = b ^ l10;
        long l12 = l11 ^ 0x4F82C1145F18L;
        long l13 = l11 ^ 0x5BF7AA23103DL;
        return this.a.G(l12).j(l13);
    }

    public int hashCode() {
        return this.i;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

