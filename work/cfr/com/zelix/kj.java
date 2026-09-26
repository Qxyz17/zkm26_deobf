/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._z;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.iq;
import com.zelix.k6;
import com.zelix.l6q;
import com.zelix.lb6;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.o9;
import com.zelix.prr;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public class kj
extends _z {
    final int W;
    private static final long a = prr.a(-2897704339657537966L, 4788898611662299408L, MethodHandles.lookup().lookupClass()).a(129884558161230L);

    @Override
    final void z(gu gu2, long l10) {
    }

    @Override
    public int K(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return (int)m44.a("t", (Object)this, (long)-2279795074545476805L, (long)l10);
    }

    public kj(k6 k62, int n10, iq iq2) {
        super(k62);
        this.W = n10;
        this.k = iq2;
        this.H = iq2.B();
        this.M = true;
    }

    /*
     * Unable to fully structure code
     */
    kj(int var1_1, _4 var2_2, h1 var3_3, l6q var4_4, l6q var5_5, PrintWriter var6_6, lb6 var7_7, long var8_8, Map var10_9, Map var11_10) {
        block9: {
            block10: {
                block8: {
                    v0 = var8_8 = kj.a ^ var8_8;
                    var12_11 = v0 ^ 61270614572362L;
                    var14_12 = v0 ^ 5436977215580L;
                    var16_13 = v0 ^ 6951629922412L;
                    var18_14 = v0 ^ 138398499680865L;
                    super(var2_2);
                    this.W = var1_1;
                    var20_15 = m44.a("n", (long)6662937580164492607L, (long)var8_8);
                    var22_16 = o9.f(var12_11);
                    var21_17 = m44.a("p", (Object)this, (long)6904187807679358135L, (long)var8_8);
                    var23_18 = var7_7.U(var16_13);
                    try {
                        try {
                            if (var20_15 == false) break block8;
                            if (var23_18 == -1) {
                            }
                            ** GOTO lbl29
                        }
                        catch (n9 v1) {
                            throw m44.a("n", (Object)v1, (long)6620399077780490052L, (long)var8_8);
                        }
                        this.H = (int)var21_17;
                    }
                    catch (n9 v2) {
                        throw m44.a("n", (Object)v2, (long)6620399077780490052L, (long)var8_8);
                    }
                }
                try {
                    if (var8_8 < 0L) break block9;
                    if (var20_15 != false) break block10;
lbl29:
                    // 2 sources

                    this.H = var23_18 + 1 + var21_17;
                }
                catch (n9 v3) {
                    throw m44.a("n", (Object)v3, (long)6620399077780490052L, (long)var8_8);
                }
            }
            var7_7.P(this.H);
            var4_4.t(var22_16.e(var14_12, this.H), this, var18_14);
        }
    }

    @Override
    protected void o(long l10, DataOutputStream dataOutputStream, lb6 lb62, Map map) {
        dataOutputStream.writeByte((int)m44.a("v", (Object)this, (long)9029322206494885417L, (long)l10));
    }

    @Override
    public int y(char c10, long l10) {
        int n10 = 1;
        return n10;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

