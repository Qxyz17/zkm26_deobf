/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._v;
import com.zelix.b0;
import com.zelix.bn;
import com.zelix.bo;
import com.zelix.e9;
import com.zelix.h1;
import com.zelix.k_;
import com.zelix.kx;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sa;
import java.lang.invoke.MethodHandles;

public abstract class ki
extends kx
implements e9 {
    private static final long a = prr.a((long)-418736048132929912L, (long)1493025072342601216L, MethodHandles.lookup().lookupClass()).a(273136358199540L);

    ki(_4 _42, int n, String string, h1 h12, long l, l6q l6q2) {
        long l2 = (l = a ^ l) ^ 0x15311A53F28BL;
        super(_42, n, l2, string, h12, l6q2);
    }

    boolean Z(Object[] objectArray) {
        return this.H() instanceof _v;
    }

    /*
     * Unable to fully structure code
     */
    public String i(Object[] var1_1) {
        block24: {
            block23: {
                block21: {
                    block22: {
                        block19: {
                            block20: {
                                block17: {
                                    block18: {
                                        var2_2 = (Long)var1_1[0];
                                        v0 = var2_2;
                                        var4_3 = v0 ^ 64139834831619L;
                                        var6_4 = v0 ^ 64139834831619L;
                                        var8_5 = v0 ^ 55195906578940L;
                                        var10_6 = v0 ^ 55195906578940L;
                                        var13_7 = this.H();
                                        var12_8 = m44.a("j", (long)6204804572554667859L, (long)var2_2);
                                        try {
                                            try {
                                                v1 = var13_7 instanceof _v;
                                                if (var12_8 == false) break block17;
                                                if (!v1) break block18;
                                            }
                                            catch (n9 v2) {
                                                throw m44.a("j", (Object)v2, (long)5679386004284681316L, (long)var2_2);
                                            }
                                            return m44.a("u", (Object)((_v)var13_7), (long)var4_3, (long)6079598567198336255L, (long)var2_2);
                                        }
                                        catch (n9 v3) {
                                            throw m44.a("j", (Object)v3, (long)5679386004284681316L, (long)var2_2);
                                        }
                                    }
                                    v1 = var13_7 instanceof b0;
                                }
                                try {
                                    try {
                                        v4 = var12_8;
                                        if (var2_2 >= 0L) {
                                            if (v4 == false) break block19;
                                            if (!v1) break block20;
                                        }
                                        ** GOTO lbl48
                                    }
                                    catch (n9 v5) {
                                        throw m44.a("j", (Object)v5, (long)5679386004284681316L, (long)var2_2);
                                    }
                                    v6 = new Object[1];
                                    v6[0] = var8_5;
                                    return m44.a("u", (Object)((b0)var13_7), (Object)v6, (long)5210246082538299338L, (long)var2_2);
                                }
                                catch (n9 v7) {
                                    throw m44.a("j", (Object)v7, (long)5679386004284681316L, (long)var2_2);
                                }
                            }
                            v1 = var13_7 instanceof k_;
                        }
                        try {
                            try {
                                if (var2_2 <= 0L) break block21;
                                v4 = var12_8;
lbl48:
                                // 2 sources

                                if (v4 == false) break block21;
                                if (!v1) break block22;
                            }
                            catch (n9 v8) {
                                throw m44.a("j", (Object)v8, (long)5679386004284681316L, (long)var2_2);
                            }
                            v9 = new Object[1];
                            v9[0] = var10_6;
                            return m44.a("u", (Object)((bn)((k_)var13_7).H()), (Object)v9, (long)6013031065720567548L, (long)var2_2);
                        }
                        catch (n9 v10) {
                            throw m44.a("j", (Object)v10, (long)5679386004284681316L, (long)var2_2);
                        }
                    }
                    try {
                        v11 = var13_7;
                        if (var12_8 == false) break block23;
                        v1 = v11 instanceof sa;
                    }
                    catch (n9 v12) {
                        throw m44.a("j", (Object)v12, (long)5679386004284681316L, (long)var2_2);
                    }
                }
                try {
                    if (!v1) break block24;
                    v11 = ((sa)var13_7).H();
                }
                catch (n9 v13) {
                    throw m44.a("j", (Object)v13, (long)5679386004284681316L, (long)var2_2);
                }
            }
            return ((bo)v11).f(var6_4);
        }
        return "";
    }

    private static n9 d(n9 n92) {
        return n92;
    }
}
