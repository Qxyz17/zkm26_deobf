/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.laz;
import com.zelix.lpm;
import com.zelix.lqu;
import com.zelix.ltv;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public abstract class lpc
extends lpm {
    private static final long a = prr.a((long)-5697069421192808315L, (long)3873165058124944160L, MethodHandles.lookup().lookupClass()).a(66822987771472L);

    /*
     * Unable to fully structure code
     */
    public void e(Object[] var1_1) {
        var3_2 = (Long)var1_1[0];
        var2_3 = (Integer)var1_1[1];
        var5_4 = (lqu)var1_1[2];
        v0 = var3_2;
        var6_5 = v0 ^ 23077363084791L;
        var8_6 = v0 ^ 50788629478467L;
        var11_7 = null;
        var10_8 = m44.a("o", (long)-3694669019882315903L, (long)var3_2);
        var12_9 = 0;
        while (var12_9 < var2_3) {
            block11: {
                block12: {
                    block14: {
                        block13: {
                            block10: {
                                var13_10 = this.V(var12_9);
                                try {
                                    v1 = var13_10;
                                    if (var10_8 != false) break block10;
                                    if (v1 instanceof laz) {
                                    }
                                    ** GOTO lbl27
                                }
                                catch (n9 v2) {
                                    throw m44.a("o", (Object)v2, (long)-3968053397536505445L, (long)var3_2);
                                }
                                var11_7 = (laz)var13_10;
                                try {
                                    v3 = var10_8;
                                    if (var3_2 <= 0L) break block11;
                                    if (v3 == false) break block12;
lbl27:
                                    // 2 sources

                                    v1 = var13_10;
                                }
                                catch (n9 v4) {
                                    throw m44.a("o", (Object)v4, (long)-3968053397536505445L, (long)var3_2);
                                }
                            }
                            var14_11 = (ltv)v1;
                            try {
                                try {
                                    if (var10_8 != false) break block13;
                                    if (var11_7 == null) break block14;
                                }
                                catch (n9 v5) {
                                    throw m44.a("o", (Object)v5, (long)-3968053397536505445L, (long)var3_2);
                                }
                                v6 = new Object[2];
                                v6[1] = var11_7;
                                v6[0] = var8_6;
                                m44.a("p", (Object)var14_11, (Object)v6, (long)-2944441809425585815L, (long)var3_2);
                            }
                            catch (n9 v7) {
                                throw m44.a("o", (Object)v7, (long)-3968053397536505445L, (long)var3_2);
                            }
                        }
                        var11_7 = null;
                    }
                    m44.a("q", (Object)this, (long)-3576477240636909745L, (long)var3_2).add(var14_11);
                }
                v8 = new Object[3];
                v8[2] = var6_5;
                v8[1] = var5_4;
                v8[0] = this;
                m44.a("p", (Object)var13_10, (Object)v8, (long)-3578199781868373330L, (long)var3_2);
                ++var12_9;
                v3 = var10_8;
            }
            if (v3 == false) continue;
        }
    }

    public lpc(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x7EEE7550E3AL;
        super(n, l2);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
