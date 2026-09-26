/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._g;
import com.zelix.h5;
import com.zelix.l6q;
import com.zelix.lke;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ol;
import com.zelix.prr;
import com.zelix.zy;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Set;

public abstract class l60 {
    private boolean I;
    _g J;
    private final zy i;
    private static final long b = prr.a((long)-2755959076811960282L, (long)2335565480285117059L, MethodHandles.lookup().lookupClass()).a(4413278146096L);

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    final boolean V(Object[] var1_1) {
        block64: {
            block65: {
                block62: {
                    block63: {
                        block61: {
                            block60: {
                                block59: {
                                    block58: {
                                        block57: {
                                            block56: {
                                                block55: {
                                                    block54: {
                                                        block52: {
                                                            block53: {
                                                                block51: {
                                                                    block50: {
                                                                        block48: {
                                                                            block49: {
                                                                                var5_2 = (String)var1_1[0];
                                                                                var11_3 = (String)var1_1[1];
                                                                                var9_4 = (Boolean)var1_1[2];
                                                                                var8_5 = (l6q)var1_1[3];
                                                                                var3_6 = (ol)var1_1[4];
                                                                                var2_7 = (Set)var1_1[5];
                                                                                var10_8 = (lke)var1_1[6];
                                                                                var6_9 = (Long)var1_1[7];
                                                                                var4_10 = (h5)var1_1[8];
                                                                                v0 = var6_9 = l60.b ^ var6_9;
                                                                                v1 = v0 ^ 85148309795556L;
                                                                                var12_11 = (int)(v1 >>> 48);
                                                                                var13_12 = (int)(v1 << 16 >>> 32);
                                                                                var14_13 = (int)(v1 << 48 >>> 48);
                                                                                var15_14 = v0 ^ 80127145563168L;
                                                                                var17_15 = v0 ^ 73141813980130L;
                                                                                var19_16 = v0 ^ 66911864226933L;
                                                                                var21_17 = v0 ^ 133328471247030L;
                                                                                var23_18 = v0 ^ 16169622276902L;
                                                                                var25_19 = m44.a("m", (long)-185643554928026336L, (long)var6_9);
                                                                                try {
                                                                                    try {
                                                                                        v2 = new StringBuilder().append(var11_3);
                                                                                        v3 = var11_3;
                                                                                        if (var25_19 != null) break block48;
                                                                                        if (v3.length() <= 0) break block49;
                                                                                    }
                                                                                    catch (n9 v4) {
                                                                                        throw m44.a("m", (Object)v4, (long)-162726123855162947L, (long)var6_9);
                                                                                    }
                                                                                    v3 = "/";
                                                                                    break block48;
                                                                                }
                                                                                catch (n9 v5) {
                                                                                    throw m44.a("m", (Object)v5, (long)-162726123855162947L, (long)var6_9);
                                                                                }
                                                                            }
                                                                            v3 = "";
                                                                        }
                                                                        var26_20 = v2.append(v3).append(var5_2).toString();
                                                                        try {
                                                                            v6 = var8_5.J((short)var12_11, (Object)var26_20, var13_12, (char)var14_13);
                                                                            if (var25_19 != null) break block50;
                                                                            if (!v6) break block51;
                                                                        }
                                                                        catch (n9 v7) {
                                                                            throw m44.a("m", (Object)v7, (long)-162726123855162947L, (long)var6_9);
                                                                        }
                                                                        v6 = false;
                                                                    }
                                                                    return v6;
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v8 = var10_8;
                                                                                if (var25_19 != null) break block52;
                                                                                if (v8 == null) break block53;
                                                                            }
                                                                            catch (n9 v9) {
                                                                                throw m44.a("m", (Object)v9, (long)-162726123855162947L, (long)var6_9);
                                                                            }
                                                                            v8 = var10_8;
                                                                            v10 = var25_19;
                                                                            if (var6_9 >= 0L) {
                                                                                if (v10 != null) break block52;
                                                                            }
                                                                            ** GOTO lbl87
                                                                        }
                                                                        catch (n9 v11) {
                                                                            throw m44.a("m", (Object)v11, (long)-162726123855162947L, (long)var6_9);
                                                                        }
                                                                        v12 = new Object[2];
                                                                        v12[1] = var26_20;
                                                                        v12[0] = var19_16;
                                                                        if (m44.a("r", (Object)v8, (Object)v12, (long)-412697752030670408L, (long)var6_9) == false) break block53;
                                                                    }
                                                                    catch (n9 v13) {
                                                                        throw m44.a("m", (Object)v13, (long)-162726123855162947L, (long)var6_9);
                                                                    }
                                                                    return false;
                                                                }
                                                                catch (n9 v14) {
                                                                    throw m44.a("m", (Object)v14, (long)-162726123855162947L, (long)var6_9);
                                                                }
                                                            }
                                                            v8 = var10_8;
                                                        }
                                                        try {
                                                            if (var6_9 < 0L) break block54;
                                                            v10 = var25_19;
lbl87:
                                                            // 2 sources

                                                            if (v10 != null) break block54;
                                                            if (v8 == null) break block55;
                                                        }
                                                        catch (n9 v15) {
                                                            throw m44.a("m", (Object)v15, (long)-162726123855162947L, (long)var6_9);
                                                        }
                                                        v8 = var10_8;
                                                    }
                                                    try {
                                                        try {
                                                            v16 = new Object[2];
                                                            v16[1] = var26_20;
                                                            v16[0] = var17_15;
                                                            v17 /* !! */  = m44.a("r", (Object)v8, (Object)v16, (long)-2156260089265837037L, (long)var6_9);
                                                            v18 = var25_19;
                                                            if (var6_9 > 0L) {
                                                                if (v18 != null) break block56;
                                                                if (v17 /* !! */  == false) break block55;
                                                            }
                                                            ** GOTO lbl122
                                                        }
                                                        catch (n9 v19) {
                                                            throw m44.a("m", (Object)v19, (long)-162726123855162947L, (long)var6_9);
                                                        }
                                                        return false;
                                                    }
                                                    catch (n9 v20) {
                                                        throw m44.a("m", (Object)v20, (long)-162726123855162947L, (long)var6_9);
                                                    }
                                                }
                                                v21 = new Object[3];
                                                v21[2] = var5_2;
                                                v21[1] = var11_3;
                                                v21[0] = var21_17;
                                                v17 /* !! */  = m44.a("r", (Object)var3_6, (Object)v21, (long)-2305371730266681044L, (long)var6_9);
                                            }
                                            try {
                                                v18 = var25_19;
lbl122:
                                                // 2 sources

                                                if (v18 != null) break block57;
                                                if (v17 /* !! */  == false) break block58;
                                            }
                                            catch (n9 v22) {
                                                throw m44.a("m", (Object)v22, (long)-162726123855162947L, (long)var6_9);
                                            }
                                            v17 /* !! */  = (CallSite)false;
                                        }
                                        return (boolean)v17 /* !! */ ;
                                    }
                                    try {
                                        v23 = var2_7;
                                        if (var6_9 < 0L || var25_19 != null) break block59;
                                        if (v23 == null) break block60;
                                    }
                                    catch (n9 v24) {
                                        throw m44.a("m", (Object)v24, (long)-162726123855162947L, (long)var6_9);
                                    }
                                    v23 = var2_7;
                                }
                                try {
                                    try {
                                        v25 /* !! */  = v23.contains(var5_2);
                                        v26 = var25_19;
                                        if (var6_9 > 0L) {
                                            if (v26 != null) break block61;
                                            if (!v25 /* !! */ ) break block60;
                                        }
                                        ** GOTO lbl162
                                    }
                                    catch (n9 v27) {
                                        throw m44.a("m", (Object)v27, (long)-162726123855162947L, (long)var6_9);
                                    }
                                    return false;
                                }
                                catch (n9 v28) {
                                    throw m44.a("m", (Object)v28, (long)-162726123855162947L, (long)var6_9);
                                }
                            }
                            v25 /* !! */  = var9_4;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        v26 = var25_19;
lbl162:
                                        // 2 sources

                                        if (v26 != null) break block62;
                                        if (!v25 /* !! */ ) break block63;
                                    }
                                    catch (n9 v29) {
                                        throw m44.a("m", (Object)v29, (long)-162726123855162947L, (long)var6_9);
                                    }
                                    v25 /* !! */  = m44.a("m", (char)var5_2.charAt(0), (long)-353656575440450819L, (long)var6_9);
                                    v30 = var25_19;
                                    if (var6_9 >= 0L) {
                                        if (v30 != null) break block62;
                                    }
                                    ** GOTO lbl194
                                }
                                catch (n9 v31) {
                                    throw m44.a("m", (Object)v31, (long)-162726123855162947L, (long)var6_9);
                                }
                                if (v25 /* !! */ ) break block63;
                            }
                            catch (n9 v32) {
                                throw m44.a("m", (Object)v32, (long)-162726123855162947L, (long)var6_9);
                            }
                            return false;
                        }
                        catch (n9 v33) {
                            throw m44.a("m", (Object)v33, (long)-162726123855162947L, (long)var6_9);
                        }
                    }
                    v34 = new Object[2];
                    v34[1] = var15_14;
                    v34[0] = var26_20;
                    v25 /* !! */  = m44.a("r", (Object)var4_10, (Object)v34, (long)-524937819588755576L, (long)var6_9);
                }
                try {
                    try {
                        try {
                            try {
                                v30 = var25_19;
lbl194:
                                // 2 sources

                                if (v30 != null) break block64;
                                if (!v25 /* !! */ ) break block65;
                            }
                            catch (n9 v35) {
                                throw m44.a("m", (Object)v35, (long)-162726123855162947L, (long)var6_9);
                            }
                            v36 = new Object[2];
                            v36[1] = var26_20;
                            v36[0] = var23_18;
                            v25 /* !! */  = m44.a("r", (Object)m44.a("s", (Object)this, (long)-331930867820245702L, (long)var6_9), (Object)v36, (long)-556151121034981821L, (long)var6_9);
                            if (var25_19 != null) break block64;
                        }
                        catch (n9 v37) {
                            throw m44.a("m", (Object)v37, (long)-162726123855162947L, (long)var6_9);
                        }
                        if (!v25 /* !! */ ) break block65;
                    }
                    catch (n9 v38) {
                        throw m44.a("m", (Object)v38, (long)-162726123855162947L, (long)var6_9);
                    }
                    return false;
                }
                catch (n9 v39) {
                    throw m44.a("m", (Object)v39, (long)-162726123855162947L, (long)var6_9);
                }
            }
            v25 /* !! */  = true;
        }
        return v25 /* !! */ ;
    }

    l60(int n, _g _g2, zy zy2, int n2, boolean bl, char c) {
        long l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        m44.a("s", (Object)this, (_g)_g2, (long)-187203430300169416L, (long)l);
        this.i = zy2;
        m44.a("s", (Object)this, (boolean)bl, (long)-124680652273002251L, (long)l);
    }

    abstract String o(Object[] var1);

    boolean Z(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return (boolean)m44.a("w", (Object)this, (long)6769877876025981763L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
