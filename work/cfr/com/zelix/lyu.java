/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.dd;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lta;
import com.zelix.lwx;
import com.zelix.lyt;
import com.zelix.lyw;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.uf;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lyu
extends lyw {
    private static final long a = prr.a(8180959492869185272L, -2152636557716197360L, MethodHandles.lookup().lookupClass()).a(44316132031101L);

    @Override
    public void M(Object[] objectArray) {
        block5: {
            lmu lmu2;
            long l10;
            long l11;
            block4: {
                lmu lmu3 = (lmu)objectArray[0];
                lqu lqu2 = (lqu)objectArray[1];
                l11 = (Long)objectArray[2];
                long l12 = l11;
                long l13 = l12 ^ 0L;
                l10 = l12 ^ 0x649CB99BE5FDL;
                CallSite callSite = m44.a("h", (long)-6823249310977527178L, (long)l11);
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = l13;
                objectArray2[1] = lqu2;
                objectArray2[0] = this;
                m44.a("w", (Object)this.V(0), (Object)objectArray2, (long)-6656114929610942631L, (long)l11);
                CallSite callSite2 = callSite;
                try {
                    try {
                        lmu2 = lmu3;
                        if (callSite2 != false) break block4;
                        if (!(lmu2 instanceof lta)) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-5112685919011049093L, (long)l11);
                    }
                    lmu2 = lmu3;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-5112685919011049093L, (long)l11);
                }
            }
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = this;
            objectArray3[0] = l10;
            m44.a("w", (Object)((lta)lmu2), (Object)objectArray3, (long)-5147670899194664077L, (long)l11);
        }
    }

    @Override
    boolean V(Object[] objectArray) {
        boolean bl2;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = l10 ^ 0x37E4BE2A06ABL;
                dd dd2 = (dd)((Object)this.V(0));
                CallSite callSite = m44.a("j", (long)-3018269578021960412L, (long)l10);
                try {
                    try {
                        bl2 = dd2 instanceof lwx;
                        if (callSite != false) break block4;
                        if (!bl2) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)-3576396766618646999L, (long)l10);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l11;
                    return (boolean)m44.a("u", (Object)((lwx)dd2), (Object)objectArray2, (long)-3565213888323211480L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)-3576396766618646999L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public lyu(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x1E09771CBE20L;
        int n11 = (int)(l11 >>> 48);
        long l12 = l11 << 16 >>> 16;
        super((char)n11, n10, l12);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    double u(Object[] var1_1) {
        block53: {
            block63: {
                block62: {
                    block61: {
                        block59: {
                            block60: {
                                block58: {
                                    block55: {
                                        block57: {
                                            block56: {
                                                block54: {
                                                    block52: {
                                                        block49: {
                                                            block64: {
                                                                block51: {
                                                                    block50: {
                                                                        block48: {
                                                                            var6_2 = (uf)var1_1[0];
                                                                            var5_3 = (String)var1_1[1];
                                                                            var2_4 = (lyt)var1_1[2];
                                                                            var3_5 = (Long)var1_1[3];
                                                                            v0 = var3_5 = lyu.a ^ var3_5;
                                                                            var7_6 = v0 ^ 139437186725698L;
                                                                            var9_7 = v0 ^ 92552305285270L;
                                                                            var11_8 = v0 ^ 129384272012820L;
                                                                            var13_9 = v0 ^ 9578052729346L;
                                                                            var15_10 = v0 ^ 99686689120267L;
                                                                            var17_11 = v0 ^ 53142520284249L;
                                                                            var19_12 = v0 ^ 116912358508998L;
                                                                            var21_13 = v0 ^ 17771539806953L;
                                                                            var23_14 = v0 ^ 79170726581693L;
                                                                            var26_15 = 1.0;
                                                                            var25_16 = m44.a("l", (long)-7213942858054416166L, (long)var3_5);
                                                                            var28_17 = (dd)this.V(0);
                                                                            try {
                                                                                try {
                                                                                    v1 = var28_17;
                                                                                    if (var25_16 != false) break block48;
                                                                                    if (!(v1 instanceof lwx)) break block49;
                                                                                }
                                                                                catch (n9 v2) {
                                                                                    throw m44.a("l", (Object)v2, (long)-8962153463194170409L, (long)var3_5);
                                                                                }
                                                                                v1 = var28_17;
                                                                            }
                                                                            catch (n9 v3) {
                                                                                throw m44.a("l", (Object)v3, (long)-8962153463194170409L, (long)var3_5);
                                                                            }
                                                                        }
                                                                        v4 = new Object[1];
                                                                        v4[0] = var13_9;
                                                                        var29_18 = m44.a("s", (Object)v1, (Object)v4, (long)-7013268296092809746L, (long)var3_5);
                                                                        try {
                                                                            v5 = var29_18;
                                                                            v6 /* !! */  = var25_16;
                                                                            if (var3_5 >= 0L) {
                                                                                if (v6 /* !! */  != false) break block50;
                                                                                if (v5 == null) break block49;
                                                                            }
                                                                            ** GOTO lbl52
                                                                        }
                                                                        catch (n9 v7) {
                                                                            throw m44.a("l", (Object)v7, (long)-8962153463194170409L, (long)var3_5);
                                                                        }
                                                                        v5 = var29_18;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            v6 /* !! */  = (CallSite)true;
lbl52:
                                                                            // 2 sources

                                                                            v8 = new Object[v6 /* !! */ ];
                                                                            v8[0] = v5;
                                                                            v9 = m44.a("l", (Object)v8, (long)-9124262517418626669L, (long)var3_5);
                                                                            if (var25_16 != false) break block51;
                                                                            if (v9 != false) break block49;
                                                                        }
                                                                        catch (n9 v10) {
                                                                            throw m44.a("l", (Object)v10, (long)-8962153463194170409L, (long)var3_5);
                                                                        }
                                                                        v11 = new Object[2];
                                                                        v11[1] = var17_11;
                                                                        v11[0] = var29_18;
                                                                        v9 = m44.a("l", (Object)v11, (long)-7251421136745180956L, (long)var3_5);
                                                                    }
                                                                    catch (n9 v12) {
                                                                        throw m44.a("l", (Object)v12, (long)-8962153463194170409L, (long)var3_5);
                                                                    }
                                                                }
                                                                if (v9 != false) break block64;
                                                                var26_15 *= 0.1;
                                                                if (var3_5 < 0L || var25_16 == false) break block49;
                                                            }
                                                            var26_15 *= 0.5;
                                                        }
                                                        try {
                                                            v13 = var6_2;
                                                            if (var3_5 <= 0L || var25_16 != false) break block52;
                                                            if (v13 == null) break block53;
                                                        }
                                                        catch (n9 v14) {
                                                            throw m44.a("l", (Object)v14, (long)-8962153463194170409L, (long)var3_5);
                                                        }
                                                        v13 = var6_2;
                                                    }
                                                    try {
                                                        v15 = new Object[1];
                                                        v15[0] = var15_10;
                                                        v16 = m44.a("s", (Object)v13, (Object)v15, (long)-7134034179941004994L, (long)var3_5);
                                                        v17 = var25_16;
                                                        if (var3_5 < 0L) ** GOTO lbl109
                                                        if (v17 != false) break block54;
                                                        if (v16 != false) {
                                                        }
                                                        ** GOTO lbl102
                                                    }
                                                    catch (n9 v18) {
                                                        throw m44.a("l", (Object)v18, (long)-8962153463194170409L, (long)var3_5);
                                                    }
                                                    var26_15 *= 0.2;
                                                    try {
                                                        v16 = var25_16;
                                                        if (var3_5 <= 0L) break block54;
                                                        if (v16 == false) break block55;
lbl102:
                                                        // 2 sources

                                                        v16 = m44.a("s", (Object)var6_2, (Object)new Object[0], (long)-7307443489044639389L, (long)var3_5);
                                                    }
                                                    catch (n9 v19) {
                                                        throw m44.a("l", (Object)v19, (long)-8962153463194170409L, (long)var3_5);
                                                    }
                                                }
                                                try {
                                                    v17 = var25_16;
lbl109:
                                                    // 2 sources

                                                    if (var3_5 <= 0L) ** GOTO lbl131
                                                    if (v17 != false) break block56;
                                                    if (v16 != false) {
                                                    }
                                                    ** GOTO lbl121
                                                }
                                                catch (n9 v20) {
                                                    throw m44.a("l", (Object)v20, (long)-8962153463194170409L, (long)var3_5);
                                                }
                                                var26_15 *= 0.25;
                                                try {
                                                    v16 = var25_16;
                                                    if (var3_5 < 0L) break block56;
                                                    if (v16 == false) break block55;
lbl121:
                                                    // 2 sources

                                                    v21 = new Object[1];
                                                    v21[0] = var9_7;
                                                    v16 = m44.a("s", (Object)var6_2, (Object)v21, (long)-9211385336291236927L, (long)var3_5);
                                                }
                                                catch (n9 v22) {
                                                    throw m44.a("l", (Object)v22, (long)-8962153463194170409L, (long)var3_5);
                                                }
                                            }
                                            try {
                                                v17 = var25_16;
lbl131:
                                                // 2 sources

                                                if (var3_5 <= 0L) ** GOTO lbl153
                                                if (v17 != false) break block57;
                                                if (v16 != false) {
                                                }
                                                ** GOTO lbl143
                                            }
                                            catch (n9 v23) {
                                                throw m44.a("l", (Object)v23, (long)-8962153463194170409L, (long)var3_5);
                                            }
                                            var26_15 *= 0.25;
                                            try {
                                                v16 = var25_16;
                                                if (var3_5 <= 0L) break block57;
                                                if (v16 == false) break block55;
lbl143:
                                                // 2 sources

                                                v24 = new Object[1];
                                                v24[0] = var7_6;
                                                v16 = m44.a("s", (Object)var6_2, (Object)v24, (long)-9019862852104797029L, (long)var3_5);
                                            }
                                            catch (n9 v25) {
                                                throw m44.a("l", (Object)v25, (long)-8962153463194170409L, (long)var3_5);
                                            }
                                        }
                                        try {
                                            v17 = var25_16;
lbl153:
                                            // 2 sources

                                            if (var3_5 >= 0L) {
                                                if (v17 != false) break block58;
                                                if (v16 == false) break block55;
                                            }
                                            ** GOTO lbl169
                                        }
                                        catch (n9 v26) {
                                            throw m44.a("l", (Object)v26, (long)-8962153463194170409L, (long)var3_5);
                                        }
                                        var26_15 *= 0.25;
                                    }
                                    v27 = new Object[1];
                                    v27[0] = var19_12;
                                    v16 = m44.a("s", (Object)var6_2, (Object)v27, (long)-7125591998767004758L, (long)var3_5);
                                }
                                try {
                                    v17 = var25_16;
lbl169:
                                    // 2 sources

                                    if (var3_5 > 0L) {
                                        if (v17 != false) break block59;
                                        if (v16 == false) break block60;
                                    }
                                    ** GOTO lbl185
                                }
                                catch (n9 v28) {
                                    throw m44.a("l", (Object)v28, (long)-8962153463194170409L, (long)var3_5);
                                }
                                var26_15 *= 0.2;
                            }
                            v29 = new Object[1];
                            v29[0] = var21_13;
                            v16 = m44.a("s", (Object)var6_2, (Object)v29, (long)-7314267902485198917L, (long)var3_5);
                        }
                        try {
                            v17 = var25_16;
lbl185:
                            // 2 sources

                            if (var3_5 < 0L) ** GOTO lbl207
                            if (v17 != false) break block61;
                            if (v16 != false) {
                            }
                            ** GOTO lbl197
                        }
                        catch (n9 v30) {
                            throw m44.a("l", (Object)v30, (long)-8962153463194170409L, (long)var3_5);
                        }
                        var26_15 *= 0.2;
                        try {
                            v16 = var25_16;
                            if (var3_5 < 0L) break block61;
                            if (v16 == false) break block62;
lbl197:
                            // 2 sources

                            v31 = new Object[1];
                            v31[0] = var11_8;
                            v16 = m44.a("s", (Object)var6_2, (Object)v31, (long)-7269624118916473329L, (long)var3_5);
                        }
                        catch (n9 v32) {
                            throw m44.a("l", (Object)v32, (long)-8962153463194170409L, (long)var3_5);
                        }
                    }
                    try {
                        v17 = var25_16;
lbl207:
                        // 2 sources

                        if (v17 != false) break block63;
                        if (v16 == false) break block62;
                    }
                    catch (n9 v33) {
                        throw m44.a("l", (Object)v33, (long)-8962153463194170409L, (long)var3_5);
                    }
                    var26_15 *= 0.01;
                }
                v34 = new Object[1];
                v34[0] = var23_14;
                v16 = m44.a("s", (Object)var6_2, (Object)v34, (long)-9110908246459607838L, (long)var3_5);
            }
            if (v16 != false) {
                var26_15 *= 0.01;
            }
        }
        if (var2_4 != null) {
            var26_15 *= 0.1;
        }
        return var26_15;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

