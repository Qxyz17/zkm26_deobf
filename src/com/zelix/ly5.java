/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.h;
import com.zelix.lyx;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Set;

public abstract class ly5
extends lyx
implements h {
    private static final long d = prr.a((long)-4283669262108519102L, (long)1659878395665182547L, MethodHandles.lookup().lookupClass()).a(73381535501727L);

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean q(short var1_1, Set var2_2, int var3_3, int var4_4) {
        block17: {
            block18: {
                var5_5 = (long)var1_1 << 48 | (long)var3_3 << 32 >>> 16 | (long)var4_4 << 48 >>> 48;
                v0 = var5_5 ^ 0L;
                var7_6 = (int)(v0 >>> 48);
                var8_7 = (int)(v0 << 16 >>> 32);
                var9_8 = (int)(v0 << 48 >>> 48);
                var11_9 = 0;
                var12_10 = this.r.length;
                var10_11 = m44.a("o", (long)5066487601049749129L, (long)var5_5);
                var13_12 = 0;
                while (var13_12 < var12_10) {
                    block15: {
                        block16: {
                            var14_13 = (h)this.r[var13_12];
                            try {
                                try {
                                    v1 = var10_11;
                                    if (var3_3 <= 0) break block15;
                                    if (v1 == false) break block16;
                                    v2 /* !! */  = (CallSite)var14_13.q((short)var7_6, var2_2, var8_7, var9_8);
                                    if (var10_11 == false) break block17;
                                }
                                catch (n9 v3) {
                                    throw m44.a("o", (Object)v3, (long)4623476500217486065L, (long)var5_5);
                                }
                                if (v2 /* !! */  != false) {
                                }
                                ** GOTO lbl35
                            }
                            catch (n9 v4) {
                                throw m44.a("o", (Object)v4, (long)4623476500217486065L, (long)var5_5);
                            }
                            var11_9 = 1;
                            try {
                                v2 /* !! */  = var10_11;
                                if (var1_1 >= 0) {
                                    if (v2 /* !! */  != false) break;
                                }
                                break block18;
lbl35:
                                // 2 sources

                                ++var13_12;
                            }
                            catch (n9 v5) {
                                throw m44.a("o", (Object)v5, (long)4623476500217486065L, (long)var5_5);
                            }
                        }
                        v1 = var10_11;
                    }
                    if (v1 != false) continue;
                }
                v2 /* !! */  = m44.a("q", (Object)this, (long)6683519873766788788L, (long)var5_5);
                if (var3_3 < 0) break block17;
            }
            v2 /* !! */  = (CallSite)(v2 /* !! */  ^ var11_9);
        }
        return (boolean)v2 /* !! */ ;
    }

    public ly5(long l, int n) {
        long l2 = (l = d ^ l) ^ 0x3D1258D9E08BL;
        super(l2, n);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
