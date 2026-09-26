/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.rq;
import com.zelix.ue;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public abstract class iz
implements rq {
    protected rq[] X;
    protected rq B;
    private static int C;
    protected int K;
    private static final long c;

    @Override
    public void b(Object[] objectArray) {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void n(Object[] var1_1) {
        block12: {
            block13: {
                block14: {
                    block15: {
                        block11: {
                            var3_2 = (Long)var1_1[0];
                            var5_3 = (rq)var1_1[1];
                            var2_4 = (Integer)var1_1[2];
                            var6_5 = m44.a("n", (long)-6548823751919798434L, (long)var3_2);
                            try {
                                try {
                                    v0 = this;
                                    v1 /* !! */  = var6_5;
                                    if (var3_2 <= 0L) ** GOTO lbl26
                                    if (v1 /* !! */  == false) break block11;
                                    if (m44.a("p", (Object)v0, (long)-4731915206604747498L, (long)var3_2) == null) {
                                    }
                                    ** GOTO lbl29
                                }
                                catch (n9 v2) {
                                    throw m44.a("n", (Object)v2, (long)-6478672592757889746L, (long)var3_2);
                                }
                                v0 = this;
                            }
                            catch (n9 v3) {
                                throw m44.a("n", (Object)v3, (long)-6478672592757889746L, (long)var3_2);
                            }
                        }
                        try {
                            try {
                                try {
                                    v1 /* !! */  = (CallSite)(var2_4 + 1);
lbl26:
                                    // 2 sources

                                    m44.a("r", (Object)v0, (rq[])new rq[v1 /* !! */ ], (long)-4731915206604747498L, (long)var3_2);
                                    if (var3_2 < 0L) break block12;
                                    if (var6_5 != false) break block13;
lbl29:
                                    // 2 sources

                                    v4 = var2_4;
                                    if (var3_2 < 0L) break block14;
                                    v5 = ((CallSite)m44.a("p", (Object)this, (long)-4731915206604747498L, (long)var3_2)).length;
                                    if (var6_5 == false) break block15;
                                }
                                catch (n9 v6) {
                                    throw m44.a("n", (Object)v6, (long)-6478672592757889746L, (long)var3_2);
                                }
                                if (v4 < v5) break block13;
                            }
                            catch (n9 v7) {
                                throw m44.a("n", (Object)v7, (long)-6478672592757889746L, (long)var3_2);
                            }
                            v8 = var2_4;
                            v5 = 1;
                        }
                        catch (n9 v9) {
                            throw m44.a("n", (Object)v9, (long)-6478672592757889746L, (long)var3_2);
                        }
                    }
                    v4 = v8 + v5;
                }
                var7_6 = new rq[v4];
                System.arraycopy(m44.a("p", (Object)this, (long)-4731915206604747498L, (long)var3_2), 0, var7_6, 0, ((CallSite)m44.a("p", (Object)this, (long)-4731915206604747498L, (long)var3_2)).length);
                m44.a("r", (Object)this, (rq[])var7_6, (long)-4731915206604747498L, (long)var3_2);
            }
            m44.a("p", (Object)this, (long)-4731915206604747498L, (long)var3_2)[var2_4] = var5_3;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void o(Object[] var1_1) {
        var2_2 = (rq)var1_1[0];
        var3_3 = (ue)var1_1[1];
        var4_4 = (Long)var1_1[2];
        v0 = var4_4;
        var6_5 = v0 ^ 0L;
        var8_6 = v0 ^ 38692550660696L;
        var10_7 = v0 ^ 14367989759768L;
        v1 = new Object[1];
        v1[0] = var10_7;
        var13_8 = m44.a("s", (Object)this, (Object)v1, (long)-2335512638144966344L, (long)var4_4);
        var12_9 = m44.a("l", (long)-4095607560726895084L, (long)var4_4);
        var14_10 = 0;
        while (var14_10 < var13_8) {
            v2 = new Object[2];
            v2[1] = var8_6;
            v2[0] = var14_10;
            v3 = new Object[3];
            v3[2] = var6_5;
            v3[1] = var3_3;
            v3[0] = this;
            m44.a("s", (Object)m44.a("s", (Object)this, (Object)v2, (long)-4291289277163198093L, (long)var4_4), (Object)v3, (long)-4371303987972835132L, (long)var4_4);
            ++var14_10;
lbl28:
            // 2 sources

            ** while (var12_9 != false)
lbl29:
            // 1 sources

        }
lbl30:
        // 2 sources

        if (var4_4 <= 0L) ** GOTO lbl28
    }

    public String toString() {
        long l10 = c ^ 0x458D8422B75FL;
        return m44.a("h", (long)4779805266936146958L, (long)l10)[m44.a("r", (Object)this, (long)5140252981972204967L, (long)l10)];
    }

    public static int t() {
        return C;
    }

    public static void H(int n10) {
        C = n10;
    }

    @Override
    public rq P(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        return m44.a("r", (Object)this, (long)1031004776860073228L, (long)l10)[n10];
    }

    public static int q() {
        int n10 = iz.t();
        if (n10 == 0) {
            return 63;
        }
        return 0;
    }

    public iz(int n10, long l10) {
        l10 = c ^ l10;
        m44.a("r", (Object)this, (int)n10, (long)-7586450688500847547L, (long)l10);
    }

    @Override
    public void v(Object[] objectArray) {
    }

    @Override
    public int u(Object[] objectArray) {
        int n10;
        block6: {
            CallSite callSite;
            block4: {
                long l10;
                block5: {
                    l10 = (Long)objectArray[0];
                    CallSite callSite2 = m44.a("l", (long)4055429953503259140L, (long)l10);
                    try {
                        try {
                            callSite = m44.a("r", (Object)this, (long)2526223898533007436L, (long)l10);
                            if (callSite2 == false) break block4;
                            if (callSite != null) break block5;
                        }
                        catch (n9 n92) {
                            throw m44.a("l", (Object)n92, (long)4273088022863214708L, (long)l10);
                        }
                        n10 = 0;
                        break block6;
                    }
                    catch (n9 n93) {
                        throw m44.a("l", (Object)n93, (long)4273088022863214708L, (long)l10);
                    }
                }
                callSite = m44.a("r", (Object)this, (long)2526223898533007436L, (long)l10);
            }
            n10 = ((CallSite)callSite).length;
        }
        return n10;
    }

    @Override
    public void r(Object[] objectArray) {
        rq rq2 = (rq)objectArray[0];
        long l10 = (Long)objectArray[1];
        m44.a("u", (Object)this, (rq)rq2, (long)-1915290596567422985L, (long)l10);
    }

    static {
        c = prr.a(-7128836856104687578L, 5466675310360324526L, MethodHandles.lookup().lookupClass()).a(17135088517374L);
        long l10 = c ^ 0x24D5DEFE9267L;
        if (m44.a("l", (long)9223304097116007868L, (long)l10) == false) {
            m44.a("l", (int)17, (long)7004117415758415443L, (long)l10);
        }
    }

    private static n9 b(n9 n92) {
        return n92;
    }
}

