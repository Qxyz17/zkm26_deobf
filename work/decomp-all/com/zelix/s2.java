/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sz;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class s2
extends sz {
    private static final long b = prr.a((long)7089877152798650801L, (long)-3885187735538274684L, MethodHandles.lookup().lookupClass()).a(186196105980637L);

    public s2(Object object, long l) {
        long l2 = (l = b ^ l) ^ 0xA7178848616L;
        super(object, l2);
    }

    public s2(long l, char c) {
        long l2 = (l << 16 | (long)c << 48 >>> 48) ^ b;
        long l3 = l2 ^ 0x452E58116F97L;
        super(null, l3);
    }

    public int hashCode() {
        block5: {
            Object object;
            block4: {
                long l = b ^ 0x5AF46E3D84EFL;
                CallSite callSite = m44.a("i", (long)-6712829188652942111L, (long)l);
                try {
                    try {
                        object = this.i;
                        if (callSite != null) break block4;
                        if (object == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)((Object)n92), (long)-4798016044161227573L, (long)l);
                    }
                    object = this.i;
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)((Object)n93), (long)-4798016044161227573L, (long)l);
                }
            }
            return System.identityHashCode(object);
        }
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl;
        Object object2;
        long l;
        block14: {
            block15: {
                boolean bl2;
                block17: {
                    block16: {
                        CallSite callSite;
                        block12: {
                            block13: {
                                l = b ^ 0x7D678C1122D0L;
                                callSite = m44.a("n", (long)353562225993784030L, (long)l);
                                try {
                                    try {
                                        object2 = object;
                                        if (callSite != null) break block12;
                                        if (object2 instanceof s2) break block13;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("n", (Object)((Object)n92), (long)1969518103855989492L, (long)l);
                                    }
                                    return false;
                                }
                                catch (n9 n93) {
                                    throw m44.a("n", (Object)((Object)n93), (long)1969518103855989492L, (long)l);
                                }
                            }
                            object2 = this.i;
                        }
                        try {
                            try {
                                try {
                                    if (callSite != null) break block14;
                                    if (object2 == null) break block15;
                                }
                                catch (n9 n94) {
                                    throw m44.a("n", (Object)((Object)n94), (long)1969518103855989492L, (long)l);
                                }
                                if (this.i != ((s2)((Object)object)).t()) break block16;
                            }
                            catch (n9 n95) {
                                throw m44.a("n", (Object)((Object)n95), (long)1969518103855989492L, (long)l);
                            }
                            bl2 = true;
                            break block17;
                        }
                        catch (n9 n96) {
                            throw m44.a("n", (Object)((Object)n96), (long)1969518103855989492L, (long)l);
                        }
                    }
                    bl2 = false;
                }
                return bl2;
            }
            object2 = object;
        }
        try {
            bl = object2 == null;
        }
        catch (n9 n97) {
            throw m44.a("n", (Object)((Object)n97), (long)1969518103855989492L, (long)l);
        }
        return bl;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
