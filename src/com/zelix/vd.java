/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class vd
implements fu {
    protected fu[] F;
    protected int N;
    protected fu n;
    private static String[] b;
    private static final long l;

    /*
     * Unable to fully structure code
     */
    public void n(Object[] var1_1) {
        block12: {
            block13: {
                block14: {
                    block15: {
                        block11: {
                            var4_2 = (Long)var1_1[0];
                            var3_3 = (fu)var1_1[1];
                            var2_4 = (Integer)var1_1[2];
                            var6_5 = m44.a("m", (long)4973697094158097156L, (long)var4_2);
                            try {
                                try {
                                    v0 = this;
                                    if (var4_2 <= 0L || var6_5 != null) break block11;
                                    if (m44.a("s", (Object)v0, (long)5110351060106236674L, (long)var4_2) == null) {
                                    }
                                    ** GOTO lbl26
                                }
                                catch (n9 v1) {
                                    throw m44.a("m", (Object)v1, (long)4648640129816886316L, (long)var4_2);
                                }
                                v0 = this;
                            }
                            catch (n9 v2) {
                                throw m44.a("m", (Object)v2, (long)4648640129816886316L, (long)var4_2);
                            }
                        }
                        try {
                            try {
                                try {
                                    m44.a("q", (Object)v0, (fu[])new fu[var2_4 + 1], (long)5110351060106236674L, (long)var4_2);
                                    if (var4_2 <= 0L) break block12;
                                    if (var6_5 == null) break block13;
lbl26:
                                    // 2 sources

                                    v3 = var2_4;
                                    if (var4_2 < 0L) break block14;
                                    v4 = ((CallSite)m44.a("s", (Object)this, (long)5110351060106236674L, (long)var4_2)).length;
                                    if (var6_5 != null) break block15;
                                }
                                catch (n9 v5) {
                                    throw m44.a("m", (Object)v5, (long)4648640129816886316L, (long)var4_2);
                                }
                                if (v3 < v4) break block13;
                            }
                            catch (n9 v6) {
                                throw m44.a("m", (Object)v6, (long)4648640129816886316L, (long)var4_2);
                            }
                            v7 = var2_4;
                            v4 = 1;
                        }
                        catch (n9 v8) {
                            throw m44.a("m", (Object)v8, (long)4648640129816886316L, (long)var4_2);
                        }
                    }
                    v3 = v7 + v4;
                }
                var7_6 = new fu[v3];
                System.arraycopy(m44.a("s", (Object)this, (long)5110351060106236674L, (long)var4_2), 0, var7_6, 0, ((CallSite)m44.a("s", (Object)this, (long)5110351060106236674L, (long)var4_2)).length);
                m44.a("q", (Object)this, (fu[])var7_6, (long)5110351060106236674L, (long)var4_2);
            }
            m44.a("s", (Object)this, (long)5110351060106236674L, (long)var4_2)[var2_4] = var3_3;
        }
    }

    public static void S(String[] stringArray) {
        b = stringArray;
    }

    public fu c(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        return m44.a("u", (Object)this, (long)-2617188846763782588L, (long)l)[n];
    }

    public fu z(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("r", (Object)this, (long)4033323655461189289L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    public void X(Object[] var1_1) {
        var5_2 = (fu)var1_1[0];
        var2_3 = (Long)var1_1[1];
        var4_4 = (lqq)var1_1[2];
        v0 = var2_3;
        var6_5 = v0 ^ 122772112358678L;
        var8_6 = v0 ^ 0L;
        var10_7 = v0 ^ 94038206132601L;
        v1 = new Object[1];
        v1[0] = var10_7;
        var13_8 = m44.a("r", (Object)this, (Object)v1, (long)-2296489199898713612L, (long)var2_3);
        var14_9 = 0;
        var12_10 = m44.a("m", (long)-1921333740741510316L, (long)var2_3);
        while (var14_9 < var13_8) {
            v2 = new Object[2];
            v2[1] = var6_5;
            v2[0] = var14_9;
            v3 = new Object[3];
            v3[2] = var4_4;
            v3[1] = var8_6;
            v3[0] = this;
            m44.a("r", (Object)m44.a("r", (Object)this, (Object)v2, (long)-1931359190408154321L, (long)var2_3), (Object)v3, (long)-1954679020144143401L, (long)var2_3);
            ++var14_9;
lbl28:
            // 2 sources

            ** while (var12_10 != null)
lbl29:
            // 1 sources

        }
lbl30:
        // 2 sources

        if (var2_3 < 0L) ** GOTO lbl28
    }

    public void i(Object[] objectArray) {
    }

    public vd(long l, int n) {
        l = vd.l ^ l;
        m44.a("q", (Object)this, (int)n, (long)-40830217559807838L, (long)l);
    }

    public void W(Object[] objectArray) {
        long l = (Long)objectArray[0];
        fu fu2 = (fu)objectArray[1];
        m44.a("q", (Object)this, (fu)fu2, (long)6039437968608973440L, (long)l);
    }

    public void a(Object[] objectArray) {
    }

    public static String[] M() {
        return b;
    }

    public int D(Object[] objectArray) {
        int n;
        block6: {
            CallSite callSite;
            block4: {
                long l;
                block5: {
                    l = (Long)objectArray[0];
                    CallSite callSite2 = m44.a("l", (long)-3157207358774572499L, (long)l);
                    try {
                        try {
                            callSite = m44.a("r", (Object)this, (long)-2899514744056724949L, (long)l);
                            if (callSite2 != null) break block4;
                            if (callSite != null) break block5;
                        }
                        catch (n9 n92) {
                            throw m44.a("l", (Object)((Object)n92), (long)-3338840691222647547L, (long)l);
                        }
                        n = 0;
                        break block6;
                    }
                    catch (n9 n93) {
                        throw m44.a("l", (Object)((Object)n93), (long)-3338840691222647547L, (long)l);
                    }
                }
                callSite = m44.a("r", (Object)this, (long)-2899514744056724949L, (long)l);
            }
            n = ((CallSite)callSite).length;
        }
        return n;
    }

    static {
        l = prr.a((long)8110363023624494440L, (long)5584832050376132032L, MethodHandles.lookup().lookupClass()).a(41753375775384L);
        long l = vd.l ^ 0x34A1B9DE1126L;
        if (m44.a("j", (long)8268974255650155715L, (long)l) != null) {
            m44.a("j", (Object)new String[5], (long)8057946745696891164L, (long)l);
        }
    }

    private static n9 d(n9 n92) {
        return n92;
    }
}
