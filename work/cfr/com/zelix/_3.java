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

public class _3
extends _z {
    private final int o;
    private final int f;
    private static final long a = prr.a(2365683598674134516L, -4294100749387554389L, MethodHandles.lookup().lookupClass()).a(102108195059134L);

    @Override
    public int K(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return (int)m44.a("t", (Object)this, (long)-407557090828526440L, (long)l10);
    }

    @Override
    protected void o(long l10, DataOutputStream dataOutputStream, lb6 lb62, Map map) {
        dataOutputStream.writeByte((int)m44.a("v", (Object)this, (long)7442763792160506250L, (long)l10));
        dataOutputStream.writeShort((int)m44.a("v", (Object)this, (long)7214490572952241814L, (long)l10));
    }

    @Override
    public int y(char c10, long l10) {
        int n10 = 1;
        return n10 += 2;
    }

    /*
     * Unable to fully structure code
     */
    _3(int var1_1, _4 var2_2, h1 var3_3, l6q var4_4, long var5_5, l6q var7_6, PrintWriter var8_7, lb6 var9_8, Map var10_9, Map var11_10) {
        block9: {
            block10: {
                block8: {
                    v0 = var5_5 = _3.a ^ var5_5;
                    var12_11 = v0 ^ 75646545218071L;
                    var14_12 = v0 ^ 131411459428097L;
                    var16_13 = v0 ^ 128814477547313L;
                    var18_14 = v0 ^ 16123595228476L;
                    v1 = m44.a("k", (long)-904518443345795179L, (long)var5_5);
                    super(var2_2);
                    this.f = var1_1;
                    var21_15 = o9.f(var12_11);
                    this.o = var3_3.readUnsignedShort();
                    var22_16 = var9_8.U(var16_13);
                    var20_17 = v1;
                    try {
                        try {
                            if (var20_17 != false) break block8;
                            if (var22_16 == -1) {
                            }
                            ** GOTO lbl30
                        }
                        catch (n9 v2) {
                            throw m44.a("k", (Object)v2, (long)-1443520939086717158L, (long)var5_5);
                        }
                        this.H = (int)m44.a("u", (Object)this, (long)-1018810734318349483L, (long)var5_5);
                    }
                    catch (n9 v3) {
                        throw m44.a("k", (Object)v3, (long)-1443520939086717158L, (long)var5_5);
                    }
                }
                try {
                    if (var5_5 < 0L) break block9;
                    if (var20_17 == false) break block10;
lbl30:
                    // 2 sources

                    this.H = var22_16 + 1 + m44.a("u", (Object)this, (long)-1018810734318349483L, (long)var5_5);
                }
                catch (n9 v4) {
                    throw m44.a("k", (Object)v4, (long)-1443520939086717158L, (long)var5_5);
                }
            }
            var9_8.P(this.H);
            var4_4.t(var21_15.e(var14_12, this.H), this, var18_14);
        }
    }

    @Override
    final void z(gu gu2, long l10) {
    }

    public _3(k6 k62, int n10, int n11, iq iq2) {
        super(k62);
        this.f = n10;
        this.k = iq2;
        this.o = n11;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

