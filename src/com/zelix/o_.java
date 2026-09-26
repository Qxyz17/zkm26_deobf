/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class o_ {
    private final int t;
    private final String U;
    private final String J;
    private final String B;
    private static final long a = prr.a((long)3719361599454365576L, (long)8115489593014856860L, MethodHandles.lookup().lookupClass()).a(47088108812535L);

    public boolean equals(Object object) {
        boolean bl;
        block16: {
            block17: {
                boolean bl2;
                block22: {
                    block19: {
                        CallSite callSite;
                        long l;
                        block21: {
                            o_ o_2;
                            block20: {
                                block18: {
                                    l = a ^ 0x2FD0F70EBEFBL;
                                    callSite = m44.a("j", (long)-7968218595690024665L, (long)l);
                                    try {
                                        bl = object instanceof o_;
                                        if (callSite != null) break block16;
                                        if (!bl) break block17;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("j", (Object)((Object)n92), (long)-7802263194565669248L, (long)l);
                                    }
                                    o_2 = (o_)object;
                                    try {
                                        try {
                                            bl2 = this.t;
                                            if (callSite != null) break block18;
                                            if (bl2 != o_2.t) break block19;
                                        }
                                        catch (n9 n93) {
                                            throw m44.a("j", (Object)((Object)n93), (long)-7802263194565669248L, (long)l);
                                        }
                                        bl2 = this.B.equals(o_2.B);
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("j", (Object)((Object)n94), (long)-7802263194565669248L, (long)l);
                                    }
                                }
                                try {
                                    try {
                                        if (callSite != null) break block20;
                                        if (!bl2) break block19;
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("j", (Object)((Object)n95), (long)-7802263194565669248L, (long)l);
                                    }
                                    bl2 = this.U.equals(o_2.U);
                                }
                                catch (n9 n96) {
                                    throw m44.a("j", (Object)((Object)n96), (long)-7802263194565669248L, (long)l);
                                }
                            }
                            try {
                                try {
                                    if (callSite != null) break block21;
                                    if (!bl2) break block19;
                                }
                                catch (n9 n97) {
                                    throw m44.a("j", (Object)((Object)n97), (long)-7802263194565669248L, (long)l);
                                }
                                bl2 = this.J.equals(o_2.J);
                            }
                            catch (n9 n98) {
                                throw m44.a("j", (Object)((Object)n98), (long)-7802263194565669248L, (long)l);
                            }
                        }
                        try {
                            if (callSite != null) break block22;
                            if (!bl2) break block19;
                        }
                        catch (n9 n99) {
                            throw m44.a("j", (Object)((Object)n99), (long)-7802263194565669248L, (long)l);
                        }
                        bl2 = true;
                        break block22;
                    }
                    bl2 = false;
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    public o_(String string, String string2, String string3) {
        this.B = string;
        this.U = string2;
        this.J = string3;
        this.t = string.hashCode() ^ string2.hashCode() ^ string3.hashCode();
    }

    public int hashCode() {
        return this.t;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
