/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.dd;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.ltc;
import com.zelix.ltv;
import com.zelix.ltx;
import com.zelix.lyw;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lyo
extends lyw {
    private boolean a;
    private static final long d = prr.a((long)-2411815389594363053L, (long)677907535205208526L, MethodHandles.lookup().lookupClass()).a(211091991004215L);

    public lyo(byte by, int n, int n2, int n3) {
        long l = ((long)by << 56 | (long)n2 << 32 >>> 8 | (long)n3 << 40 >>> 40) ^ d;
        long l2 = l ^ 0x122AAFDFFC3AL;
        int n4 = (int)(l2 >>> 48);
        long l3 = l2 << 16 >>> 16;
        super((char)n4, n, l3);
    }

    boolean V(Object[] objectArray) {
        boolean bl;
        block4: {
            block5: {
                long l = (Long)objectArray[0];
                long l2 = l ^ 0x7BCBE1EB7FBEL;
                dd dd2 = (dd)this.V(0);
                CallSite callSite = m44.a("j", (long)-3018269578021960412L, (long)l);
                try {
                    try {
                        bl = dd2 instanceof ltc;
                        if (callSite != false) break block4;
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)-3487292589086167314L, (long)l);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l2;
                    return (boolean)m44.a("u", (Object)((ltx)dd2), (Object)objectArray2, (long)-3317556474969303560L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)-3487292589086167314L, (long)l);
                }
            }
            bl = false;
        }
        return bl;
    }

    void J(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = d ^ l;
        m44.a("w", (Object)((Object)this), (boolean)true, (long)7226525480123340862L, (long)l);
    }

    public String e(Object[] objectArray) {
        Object object;
        StringBuilder stringBuilder;
        block4: {
            block5: {
                long l = (Long)objectArray[0];
                long l2 = l ^ 0L;
                CallSite callSite = m44.a("n", (long)-6782168670771776808L, (long)l);
                try {
                    try {
                        stringBuilder = new StringBuilder();
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l2;
                        object = m44.a("q", (Object)((dd)this.V(0)), (Object)objectArray2, (long)-6581495104713834516L, (long)l);
                        if (callSite != false) break block4;
                        stringBuilder = stringBuilder.append((String)object);
                        if (m44.a("p", (Object)((Object)this), (long)-6483817220420576653L, (long)l) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)-5159238867591243502L, (long)l);
                    }
                    object = "^";
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)-5159238867591243502L, (long)l);
                }
            }
            object = "";
        }
        return stringBuilder.append((String)object).toString();
    }

    public void M(Object[] objectArray) {
        block5: {
            lmu lmu2;
            long l;
            long l2;
            block4: {
                lmu lmu3 = (lmu)objectArray[0];
                lqu lqu2 = (lqu)objectArray[1];
                l2 = (Long)objectArray[2];
                long l3 = l2;
                l = l3 ^ 0x3D609BFDEC13L;
                long l4 = l3 ^ 0L;
                CallSite callSite = m44.a("h", (long)-6823249310977527178L, (long)l2);
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = l4;
                objectArray2[1] = lqu2;
                objectArray2[0] = this;
                m44.a("w", (Object)this.V(0), (Object)objectArray2, (long)-6656114929610942631L, (long)l2);
                CallSite callSite2 = callSite;
                try {
                    try {
                        lmu2 = lmu3;
                        if (callSite2 != false) break block4;
                        if (!(lmu2 instanceof ltv)) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)-5131670400273884740L, (long)l2);
                    }
                    lmu2 = lmu3;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)-5131670400273884740L, (long)l2);
                }
            }
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = this;
            objectArray3[0] = l;
            m44.a("w", (Object)((ltv)lmu2), (Object)objectArray3, (long)-6605286206070461434L, (long)l2);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public double j(Object[] var1_1) {
        block23: {
            block18: {
                block22: {
                    block20: {
                        block21: {
                            block19: {
                                block17: {
                                    var2_2 = (Long)var1_1[0];
                                    var4_3 = (var2_2 = lyo.d ^ var2_2) ^ 49167352266484L;
                                    var7_4 = 1.0;
                                    var6_5 = m44.a("i", (long)1738817746552789223L, (long)var2_2);
                                    var9_6 = (dd)this.V(0);
                                    try {
                                        try {
                                            v0 = var9_6;
                                            if (var6_5 == false) break block17;
                                            if (!(v0 instanceof ltc)) break block18;
                                        }
                                        catch (n9 v1) {
                                            throw m44.a("i", (Object)v1, (long)1864946742889904277L, (long)var2_2);
                                        }
                                        v0 = var9_6;
                                    }
                                    catch (n9 v2) {
                                        throw m44.a("i", (Object)v2, (long)1864946742889904277L, (long)var2_2);
                                    }
                                }
                                v3 = new Object[1];
                                v3[0] = var4_3;
                                var10_7 = m44.a("v", (Object)((ltc)v0), (Object)v3, (long)101654791994188901L, (long)var2_2);
                                try {
                                    try {
                                        v4 /* !! */  = var10_7.size();
                                        v5 /* !! */  = var6_5;
                                        if (var2_2 > 0L) {
                                            if (v5 /* !! */  == false) break block19;
                                            if (v4 /* !! */  <= 0) break block18;
                                        }
                                        ** GOTO lbl44
                                    }
                                    catch (n9 v6) {
                                        throw m44.a("i", (Object)v6, (long)1864946742889904277L, (long)var2_2);
                                    }
                                    v4 /* !! */  = (int)m44.a("i", (Object)new Object[]{(String)var10_7.get(var10_7.size() - 1)}, (long)1938025137066174998L, (long)var2_2);
                                }
                                catch (n9 v7) {
                                    throw m44.a("i", (Object)v7, (long)1864946742889904277L, (long)var2_2);
                                }
                            }
                            try {
                                try {
                                    v5 /* !! */  = var6_5;
lbl44:
                                    // 2 sources

                                    if (var2_2 < 0L) break block20;
                                    if (v5 /* !! */  == false) break block21;
                                    if (v4 /* !! */  == 0) break block22;
                                }
                                catch (n9 v8) {
                                    throw m44.a("i", (Object)v8, (long)1864946742889904277L, (long)var2_2);
                                }
                                v4 /* !! */  = var10_7.size();
                            }
                            catch (n9 v9) {
                                throw m44.a("i", (Object)v9, (long)1864946742889904277L, (long)var2_2);
                            }
                        }
                        v5 /* !! */  = (CallSite)true;
                    }
                    if (v4 /* !! */  <= v5 /* !! */ ) break block18;
                    v10 = var7_4 * 0.25;
                    if (var2_2 <= 0L) break block23;
                    var7_4 = v10;
                    if (var6_5 != false) break block18;
                }
                var7_4 *= 0.1;
            }
            v10 = var7_4;
        }
        return v10;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
