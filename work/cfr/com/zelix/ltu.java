/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.law;
import com.zelix.lmu;
import com.zelix.lpt;
import com.zelix.lqu;
import com.zelix.ly1;
import com.zelix.ly9;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class ltu
extends l7t {
    private static final long a = prr.a(5969978730077450975L, -4293876178621578986L, MethodHandles.lookup().lookupClass()).a(165324269032323L);

    /*
     * Unable to fully structure code
     */
    @Override
    public void M(Object[] var1_1) {
        var3_2 = (lmu)var1_1[0];
        var2_3 = (lqu)var1_1[1];
        var4_4 = (Long)var1_1[2];
        v0 = var4_4;
        var6_5 = v0 ^ 78419313187334L;
        var8_6 = v0 ^ 0L;
        v1 = new Object[1];
        v1[0] = var6_5;
        var11_7 = m44.a("w", (Object)this, (Object)v1, (long)-4972914505230991179L, (long)var4_4);
        var10_8 = m44.a("h", (long)-6823249310977527178L, (long)var4_4);
        var12_9 = 0;
        while (var12_9 < var11_7) {
            v2 = new Object[3];
            v2[2] = var8_6;
            v2[1] = var2_3;
            v2[0] = this;
            m44.a("w", (Object)this.V(var12_9), (Object)v2, (long)-6656114929610942631L, (long)var4_4);
            ++var12_9;
lbl23:
            // 2 sources

            ** while (var10_8 != false)
lbl24:
            // 1 sources

        }
lbl25:
        // 2 sources

        if (var4_4 <= 0L) ** GOTO lbl23
    }

    public int n(Object[] objectArray) {
        int n10;
        block7: {
            long l10 = (Long)objectArray[0];
            long l11 = (l10 = a ^ l10) ^ 0x62CE71AC64FEL;
            int n11 = 0;
            CallSite callSite = m44.a("h", (long)-6938121252508578674L, (long)l10);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l11;
            CallSite callSite2 = m44.a("w", (Object)this, (Object)objectArray2, (long)-8933860699798241715L, (long)l10);
            int n12 = 0;
            while (n12 < callSite2) {
                CallSite callSite3;
                block5: {
                    block6: {
                        block8: {
                            ly9 ly92 = (ly9)this.V(n12);
                            ly1 ly12 = (ly1)ly92.V(0);
                            try {
                                try {
                                    callSite3 = callSite;
                                    if (l10 <= 0L) break block5;
                                    if (callSite3 != false) break block6;
                                    n10 = ly12 instanceof lpt;
                                    if (callSite != false) break block7;
                                }
                                catch (n9 n92) {
                                    throw m44.a("h", (Object)n92, (long)-7491671072288270752L, (long)l10);
                                }
                                if (n10 == 0) break block8;
                            }
                            catch (n9 n93) {
                                throw m44.a("h", (Object)n93, (long)-7491671072288270752L, (long)l10);
                            }
                            ++n11;
                        }
                        ++n12;
                    }
                    callSite3 = callSite;
                }
                if (callSite3 == false) continue;
            }
            n10 = n11;
        }
        return n10;
    }

    public int Z(Object[] objectArray) {
        int n10;
        block7: {
            long l10 = (Long)objectArray[0];
            long l11 = (l10 = a ^ l10) ^ 0x56907E0AE102L;
            int n11 = 0;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l11;
            CallSite callSite = m44.a("s", (Object)this, (Object)objectArray2, (long)142067180099697585L, (long)l10);
            int n12 = 0;
            CallSite callSite2 = m44.a("l", (long)1894576341450606962L, (long)l10);
            while (n12 < callSite) {
                CallSite callSite3;
                block5: {
                    block6: {
                        block8: {
                            ly9 ly92 = (ly9)this.V(n12);
                            ly1 ly12 = (ly1)ly92.V(0);
                            try {
                                try {
                                    callSite3 = callSite2;
                                    if (l10 <= 0L) break block5;
                                    if (callSite3 != false) break block6;
                                    n10 = ly12 instanceof law;
                                    if (callSite2 != false) break block7;
                                }
                                catch (n9 n92) {
                                    throw m44.a("l", (Object)n92, (long)2158359485479293852L, (long)l10);
                                }
                                if (n10 == 0) break block8;
                            }
                            catch (n9 n93) {
                                throw m44.a("l", (Object)n93, (long)2158359485479293852L, (long)l10);
                            }
                            ++n11;
                        }
                        ++n12;
                    }
                    callSite3 = callSite2;
                }
                if (callSite3 == false) continue;
            }
            n10 = n11;
        }
        return n10;
    }

    public ltu(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x283390287C39L;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

