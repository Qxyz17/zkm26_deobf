/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.dd;
import com.zelix.lyx;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public abstract class ly0
extends lyx
implements dd {
    private static final long d = prr.a((long)2271620629508856775L, (long)-8882222369816022959L, MethodHandles.lookup().lookupClass()).a(109249961963037L);

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean i(char var1_1, int var2_2, short var3_3, String var4_4) {
        block17: {
            block18: {
                var5_5 = (long)var1_1 << 48 | (long)var2_2 << 32 >>> 16 | (long)var3_3 << 48 >>> 48;
                v0 = var5_5 ^ 0L;
                var7_6 = (int)(v0 >>> 48);
                var8_7 = (int)(v0 << 16 >>> 32);
                var9_8 = (int)(v0 << 48 >>> 48);
                var11_9 = 0;
                var10_10 = m44.a("i", (long)4736006086195462527L, (long)var5_5);
                var12_11 = this.r.length;
                var13_12 = 0;
                while (var13_12 < var12_11) {
                    block15: {
                        block16: {
                            var14_13 = (dd)this.r[var13_12];
                            try {
                                try {
                                    v1 = var10_10;
                                    if (var2_2 < 0) break block15;
                                    if (v1 == false) break block16;
                                    v2 /* !! */  = (CallSite)var14_13.i((char)var7_6, var8_7, (short)var9_8, var4_4);
                                    if (var10_10 == false) break block17;
                                }
                                catch (n9 v3) {
                                    throw m44.a("i", (Object)v3, (long)6862793214814465642L, (long)var5_5);
                                }
                                if (v2 /* !! */  != false) {
                                }
                                ** GOTO lbl35
                            }
                            catch (n9 v4) {
                                throw m44.a("i", (Object)v4, (long)6862793214814465642L, (long)var5_5);
                            }
                            var11_9 = 1;
                            try {
                                v2 /* !! */  = var10_10;
                                if (var2_2 > 0) {
                                    if (v2 /* !! */  != false) break;
                                }
                                break block18;
lbl35:
                                // 2 sources

                                ++var13_12;
                            }
                            catch (n9 v5) {
                                throw m44.a("i", (Object)v5, (long)6862793214814465642L, (long)var5_5);
                            }
                        }
                        v1 = var10_10;
                    }
                    if (v1 != false) continue;
                }
                v2 /* !! */  = m44.a("w", (Object)this, (long)6572663057852074306L, (long)var5_5);
                if (var2_2 <= 0) break block17;
            }
            v2 /* !! */  = (CallSite)(v2 /* !! */  ^ var11_9);
        }
        return (boolean)v2 /* !! */ ;
    }

    public ly0(int n, short s, char c, int n2) {
        long l = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n2 << 32 >>> 32) ^ d;
        long l2 = l ^ 0x57EF86A892CAL;
        super(l2, n);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
