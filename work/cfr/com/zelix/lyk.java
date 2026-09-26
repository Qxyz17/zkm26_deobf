/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.dd;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.ltv;
import com.zelix.ltx;
import com.zelix.lyw;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.t_;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class lyk
extends lyw
implements t_ {
    private boolean a;
    private boolean j;
    private static final long d = prr.a(-179720511551942200L, 5679200609233742092L, MethodHandles.lookup().lookupClass()).a(259809032557690L);

    @Override
    public void M(Object[] objectArray) {
        block5: {
            lmu lmu2;
            long l10;
            block4: {
                lmu lmu3 = (lmu)objectArray[0];
                lqu lqu2 = (lqu)objectArray[1];
                l10 = (Long)objectArray[2];
                long l11 = l10 ^ 0L;
                CallSite callSite = m44.a("h", (long)-5113628074367501874L, (long)l10);
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = l11;
                objectArray2[1] = lqu2;
                objectArray2[0] = this;
                m44.a("w", (Object)this.V(0), (Object)objectArray2, (long)-6656114929610942631L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    try {
                        lmu2 = lmu3;
                        if (callSite2 == false) break block4;
                        if (!(lmu2 instanceof ltv)) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-6866783102042820089L, (long)l10);
                    }
                    lmu2 = lmu3;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-6866783102042820089L, (long)l10);
                }
            }
            m44.a("w", (Object)((ltv)lmu2), (Object)new Object[]{this}, (long)-4970424352409412414L, (long)l10);
        }
    }

    @Override
    public String e(Object[] objectArray) {
        Object object;
        StringBuilder stringBuilder;
        long l10;
        block7: {
            block8: {
                l10 = (Long)objectArray[0];
                long l11 = l10 ^ 0L;
                CallSite callSite = m44.a("n", (long)-5069178255005697696L, (long)l10);
                try {
                    try {
                        stringBuilder = new StringBuilder();
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l11;
                        object = m44.a("q", (Object)((dd)((Object)this.V(0))), (Object)objectArray2, (long)-6581495104713834516L, (long)l10);
                        if (callSite == false) break block7;
                        stringBuilder = stringBuilder.append((String)object);
                        if (m44.a("p", (Object)this, (long)-6449224973212933040L, (long)l10) == false) break block8;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)-6910107020896423255L, (long)l10);
                    }
                    object = ".";
                    break block7;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)-6910107020896423255L, (long)l10);
                }
            }
            object = "";
        }
        try {
            if (l10 > 0L) {
                stringBuilder = stringBuilder.append((String)object);
                object = m44.a("p", (Object)this, (long)-4715094841192234952L, (long)l10) != false ? "^" : "";
            }
        }
        catch (n9 n94) {
            throw m44.a("n", (Object)n94, (long)-6910107020896423255L, (long)l10);
        }
        return stringBuilder.append((String)object).toString();
    }

    @Override
    public boolean V(Object[] objectArray) {
        Object object;
        block8: {
            block9: {
                long l10 = (Long)objectArray[0];
                long l11 = l10 ^ 0x7BCBE1EB7FBEL;
                dd dd2 = (dd)((Object)this.V(0));
                CallSite callSite = m44.a("j", (long)-3018269578021960412L, (long)l10);
                try {
                    try {
                        try {
                            try {
                                object = m44.a("t", (Object)this, (long)-3349598101606247508L, (long)l10);
                                if (callSite != false) break block8;
                                if (object != false) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("j", (Object)n92, (long)-2889542881818294955L, (long)l10);
                            }
                            object = dd2 instanceof ltx;
                            if (callSite != false) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("j", (Object)n93, (long)-2889542881818294955L, (long)l10);
                        }
                        if (object == false) break block9;
                    }
                    catch (n9 n94) {
                        throw m44.a("j", (Object)n94, (long)-2889542881818294955L, (long)l10);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l11;
                    return (boolean)m44.a("u", (Object)((ltx)dd2), (Object)objectArray2, (long)-3317556474969303560L, (long)l10);
                }
                catch (n9 n95) {
                    throw m44.a("j", (Object)n95, (long)-2889542881818294955L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    @Override
    public boolean c(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return (boolean)m44.a("v", (Object)this, (long)-7843333699881341554L, (long)l10);
    }

    @Override
    public String Y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x2EEE0D7ABCFCL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("u", (Object)((dd)((Object)this.V(0))), (Object)objectArray2, (long)1753584692331119376L, (long)l10);
    }

    public lyk(byte by2, int n10, long l10) {
        long l11 = ((long)by2 << 56 | l10 << 8 >>> 8) ^ d;
        long l12 = l11 ^ 0x79F888998178L;
        int n11 = (int)(l12 >>> 48);
        long l13 = l12 << 16 >>> 16;
        super((char)n11, n10, l13);
    }

    @Override
    public boolean T(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return (boolean)m44.a("w", (Object)this, (long)-483971296152913049L, (long)l10);
    }

    @Override
    public List a(Object[] objectArray) {
        block5: {
            dd dd2;
            long l10;
            long l11;
            block4: {
                l11 = (Long)objectArray[0];
                l10 = l11 ^ 0x199567070E8FL;
                dd dd3 = (dd)((Object)this.V(0));
                CallSite callSite = m44.a("o", (long)-4253774822545800143L, (long)l11);
                try {
                    try {
                        dd2 = dd3;
                        if (callSite == false) break block4;
                        if (!(dd2 instanceof ltx)) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)-2500771935648919560L, (long)l11);
                    }
                    dd2 = dd3;
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)n93, (long)-2500771935648919560L, (long)l11);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l10;
            return m44.a("p", (Object)((ltx)dd2), (Object)objectArray2, (long)-4274158699431040713L, (long)l11);
        }
        return new ArrayList();
    }

    public final void Q(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = d ^ l10;
        m44.a("u", (Object)this, (boolean)true, (long)-6766732235054392129L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public double p(Object[] var1_1) {
        block28: {
            block22: {
                block27: {
                    block26: {
                        block24: {
                            block23: {
                                block21: {
                                    var2_2 = (Long)var1_1[0];
                                    var4_3 = var2_2 ^ 57164172644073L;
                                    var7_4 = 1.0;
                                    var6_5 = m44.a("i", (long)-7144986621676990481L, (long)var2_2);
                                    var9_6 = (dd)this.V(0);
                                    try {
                                        try {
                                            v0 = var9_6;
                                            if (var6_5 != false) break block21;
                                            if (!(v0 instanceof ltx)) break block22;
                                        }
                                        catch (n9 v1) {
                                            throw m44.a("i", (Object)v1, (long)-7120943882630459490L, (long)var2_2);
                                        }
                                        v0 = var9_6;
                                    }
                                    catch (n9 v2) {
                                        throw m44.a("i", (Object)v2, (long)-7120943882630459490L, (long)var2_2);
                                    }
                                }
                                v3 = new Object[1];
                                v3[0] = var4_3;
                                var10_7 = m44.a("v", (Object)((ltx)v0), (Object)v3, (long)-8878555131101632175L, (long)var2_2);
                                try {
                                    try {
                                        v4 /* !! */  = var10_7.size();
                                        v5 = var6_5;
                                        if (var2_2 > 0L) {
                                            if (v5 != false) break block23;
                                            if (v4 /* !! */  <= 0) break block22;
                                        }
                                        ** GOTO lbl46
                                    }
                                    catch (n9 v6) {
                                        throw m44.a("i", (Object)v6, (long)-7120943882630459490L, (long)var2_2);
                                    }
                                    v4 /* !! */  = (int)m44.a("i", (Object)new Object[]{(String)var10_7.get(var10_7.size() - 1)}, (long)-8767067968859474266L, (long)var2_2);
                                }
                                catch (n9 v7) {
                                    throw m44.a("i", (Object)v7, (long)-7120943882630459490L, (long)var2_2);
                                }
                            }
                            try {
                                block25: {
                                    try {
                                        try {
                                            try {
                                                v5 = var6_5;
lbl46:
                                                // 2 sources

                                                if (v5 != false) break block24;
                                                if (v4 /* !! */  != 0) break block25;
                                            }
                                            catch (n9 v8) {
                                                throw m44.a("i", (Object)v8, (long)-7120943882630459490L, (long)var2_2);
                                            }
                                            v4 /* !! */  = (int)m44.a("w", (Object)this, (long)-7257325345621436057L, (long)var2_2);
                                            v9 /* !! */  = (int)var6_5;
                                            if (var2_2 < 0L) break block26;
                                            if (v9 /* !! */  != 0) break block24;
                                        }
                                        catch (n9 v10) {
                                            throw m44.a("i", (Object)v10, (long)-7120943882630459490L, (long)var2_2);
                                        }
                                        if (v4 /* !! */  == 0) break block27;
                                    }
                                    catch (n9 v11) {
                                        throw m44.a("i", (Object)v11, (long)-7120943882630459490L, (long)var2_2);
                                    }
                                }
                                v4 /* !! */  = var10_7.size();
                            }
                            catch (n9 v12) {
                                throw m44.a("i", (Object)v12, (long)-7120943882630459490L, (long)var2_2);
                            }
                        }
                        v9 /* !! */  = 1;
                    }
                    if (v4 /* !! */  <= v9 /* !! */ ) break block22;
                    v13 = var7_4 * 0.25;
                    if (var2_2 < 0L) break block28;
                    var7_4 = v13;
                    if (var6_5 == false) break block22;
                }
                var7_4 *= 0.1;
            }
            v13 = var7_4;
        }
        return v13;
    }

    public final void I(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = d ^ l10;
        m44.a("u", (Object)this, (boolean)true, (long)4330462523238727223L, (long)l10);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

