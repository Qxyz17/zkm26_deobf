/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lt9;
import com.zelix.ltv;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lto
extends l7t {
    private static final long a = prr.a(1582909538730021529L, 5450937825553137961L, MethodHandles.lookup().lookupClass()).a(271386685829429L);

    public lto(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x725A0471970DL;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void M(Object[] var1_1) {
        block9: {
            var3_2 = (lmu)var1_1[0];
            var2_3 = (lqu)var1_1[1];
            var4_4 = (Long)var1_1[2];
            v0 = var4_4;
            var6_5 = v0 ^ 101299168815897L;
            var8_6 = v0 ^ 78419313187334L;
            var11_7 = (ltv)var3_2;
            v1 = new Object[1];
            v1[0] = var8_6;
            var12_8 = m44.a("w", (Object)this, (Object)v1, (long)-4972914505230991179L, (long)var4_4);
            var13_9 = new StringBuffer();
            var10_10 = m44.a("h", (long)-5113628074367501874L, (long)var4_4);
            var14_11 = 0;
            while (var14_11 < var12_8) {
                block10: {
                    block11: {
                        block12: {
                            try {
                                try {
                                    try {
                                        var13_9.append((String)m44.a("w", (Object)((lt9)this.V(var14_11)), (Object)new Object[0], (long)-4968184746715213117L, (long)var4_4));
lbl23:
                                        // 2 sources

                                        while (true) {
                                            v2 = var10_10;
                                            if (var4_4 > 0L) {
                                                if (v2 == false) break block9;
                                                v2 = var10_10;
                                            }
                                            if (var4_4 <= 0L) break block10;
                                            if (v2 == false) break block11;
                                            break;
                                        }
                                    }
                                    catch (n9 v3) {
                                        throw m44.a("h", (Object)v3, (long)-6867954684402736907L, (long)var4_4);
                                    }
                                    if (var14_11 >= var12_8 - true) break block12;
                                }
                                catch (n9 v4) {
                                    throw m44.a("h", (Object)v4, (long)-6867954684402736907L, (long)var4_4);
                                }
                                var13_9.append("/");
                            }
                            catch (n9 v5) {
                                throw m44.a("h", (Object)v5, (long)-6867954684402736907L, (long)var4_4);
                            }
                        }
                        ++var14_11;
                    }
                    v2 = var10_10;
                }
                if (v2 != false) continue;
            }
            v6 = new Object[2];
            v6[1] = var13_9.toString();
            v6[0] = var6_5;
            m44.a("w", (Object)var11_7, (Object)v6, (long)-4937892927434969261L, (long)var4_4);
            ** while (var4_4 <= 0L)
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

