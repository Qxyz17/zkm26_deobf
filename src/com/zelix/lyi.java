/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._v;
import com.zelix.ai;
import com.zelix.lyx;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.z1;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lyi
extends lyx
implements z1 {
    private static final long b = prr.a((long)2497385080074537629L, (long)8655105001972218309L, MethodHandles.lookup().lookupClass()).a(50431952433287L);

    public lyi(long l, int n) {
        long l2 = (l = b ^ l) ^ 0xAB3F4515E19L;
        super(l2, n);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean k(Object[] var1_1) {
        block17: {
            block18: {
                var4_2 = (_v)var1_1[0];
                var2_3 = (Long)var1_1[1];
                var5_4 = (ai)var1_1[2];
                var6_5 = var2_3 ^ 0L;
                var9_6 = 0;
                var10_7 = this.r.length;
                var11_8 = 0;
                var8_9 = m44.a("m", (long)-2241803378904648741L, (long)var2_3);
                while (var11_8 < var10_7) {
                    block15: {
                        block16: {
                            var12_10 = (z1)this.r[var11_8];
                            try {
                                try {
                                    v0 = var8_9;
                                    if (var2_3 < 0L) break block15;
                                    if (v0 != false) break block16;
                                    v1 = new Object[3];
                                    v1[2] = var5_4;
                                    v1[1] = var6_5;
                                    v1[0] = var4_2;
                                    v2 /* !! */  = m44.a("r", (Object)var12_10, (Object)v1, (long)-2005823465454324656L, (long)var2_3);
                                    if (var8_9 != false) break block17;
                                }
                                catch (n9 v3) {
                                    throw m44.a("m", (Object)v3, (long)-317295670757800199L, (long)var2_3);
                                }
                                if (v2 /* !! */  != false) {
                                }
                                ** GOTO lbl39
                            }
                            catch (n9 v4) {
                                throw m44.a("m", (Object)v4, (long)-317295670757800199L, (long)var2_3);
                            }
                            var9_6 = 1;
                            try {
                                v2 /* !! */  = var8_9;
                                if (var2_3 > 0L) {
                                    if (v2 /* !! */  == false) break;
                                }
                                break block18;
lbl39:
                                // 2 sources

                                ++var11_8;
                            }
                            catch (n9 v5) {
                                throw m44.a("m", (Object)v5, (long)-317295670757800199L, (long)var2_3);
                            }
                        }
                        v0 = var8_9;
                    }
                    if (v0 == false) continue;
                }
                v2 /* !! */  = m44.a("s", (Object)this, (long)-2149719760733163426L, (long)var2_3);
                if (var2_3 < 0L) break block17;
            }
            v2 /* !! */  = (CallSite)(v2 /* !! */  ^ var9_6);
        }
        return (boolean)v2 /* !! */ ;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
