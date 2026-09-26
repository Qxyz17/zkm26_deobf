/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.js;
import com.zelix.lks;
import com.zelix.lq0;
import com.zelix.m44;
import com.zelix.m_;
import com.zelix.n9;
import com.zelix.o6;
import com.zelix.prr;
import com.zelix.xv;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xr
extends xv {
    private static final long a;
    private static final String[] g;
    private static final String[] h;
    private static final Map i;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    xr(long var1_1, o6 var3_2, lks var4_3) {
        block85: {
            block103: {
                block99: {
                    block98: {
                        block97: {
                            block96: {
                                block108: {
                                    block107: {
                                        block86: {
                                            block91: {
                                                block95: {
                                                    block94: {
                                                        block93: {
                                                            block106: {
                                                                block92: {
                                                                    block90: {
                                                                        block105: {
                                                                            block104: {
                                                                                block88: {
                                                                                    block89: {
                                                                                        block87: {
                                                                                            block84: {
                                                                                                v0 = var1_1 = xr.a ^ var1_1;
                                                                                                v1 = v0 ^ 54690637615170L;
                                                                                                var5_4 = v1 >>> 16;
                                                                                                var7_5 = (int)(v1 << 48 >>> 48);
                                                                                                var8_6 = v0 ^ 41579789569345L;
                                                                                                var10_7 = v0 ^ 6086137544841L;
                                                                                                var12_8 = v0 ^ 135344705800887L;
                                                                                                var14_9 = v0 ^ 4104714301059L;
                                                                                                var16_10 = v0 ^ 123530241239517L;
                                                                                                var18_11 = v0 ^ 39824097584586L;
                                                                                                var20_12 = v0 ^ 46255712279765L;
                                                                                                v2 = v0 ^ 99360068056878L;
                                                                                                var22_13 = (int)(v2 >>> 48);
                                                                                                var23_14 = (int)(v2 << 16 >>> 48);
                                                                                                var24_15 = (int)(v2 << 32 >>> 32);
                                                                                                var25_16 = v0 ^ 97751593881216L;
                                                                                                var27_17 = v0 ^ 8711077099709L;
                                                                                                v3 = m44.a("i", (long)7015350438258592295L, (long)var1_1);
                                                                                                super();
                                                                                                var29_18 = v3;
                                                                                                try {
                                                                                                    try {
                                                                                                        m44.a("u", (Object)this, (o6)var3_2, (long)9080814006691807931L, (long)var1_1);
                                                                                                        v4 = new Object[1];
                                                                                                        v4[0] = var12_8;
                                                                                                        v5 = m44.a("v", (Object)var3_2, (Object)v4, (long)7045960146295273829L, (long)var1_1);
                                                                                                        if (var29_18 == false) break block84;
                                                                                                        if (v5 == false) break block85;
                                                                                                    }
                                                                                                    catch (n9 v6) {
                                                                                                        throw m44.a("i", (Object)v6, (long)8976453454824546119L, (long)var1_1);
                                                                                                    }
                                                                                                    v7 = new Object[3];
                                                                                                    v7[2] = var4_3;
                                                                                                    v7[1] = var3_2;
                                                                                                    v7[0] = var18_11;
                                                                                                    m44.a("v", (Object)this, (Object)v7, (long)8937726328272066322L, (long)var1_1);
                                                                                                    v5 = m44.a("w", (Object)this, (long)8920459316670697822L, (long)var1_1);
                                                                                                }
                                                                                                catch (n9 v8) {
                                                                                                    throw m44.a("i", (Object)v8, (long)8976453454824546119L, (long)var1_1);
                                                                                                }
                                                                                            }
                                                                                            if (v5 == false) break block85;
                                                                                            v9 = new Object[1];
                                                                                            v9[0] = var27_17;
                                                                                            var30_19 = m44.a("v", (Object)var3_2, (Object)v9, (long)7388432129703379441L, (long)var1_1);
                                                                                            v10 = new Object[1];
                                                                                            v10[0] = var14_9;
                                                                                            var31_20 = m44.a("v", (Object)var3_2, (Object)v10, (long)7288660555412839087L, (long)var1_1);
                                                                                            try {
                                                                                                v11 = var31_20;
                                                                                                v12 /* !! */  = var29_18;
                                                                                                if (var1_1 < 0L) ** GOTO lbl227
                                                                                                if (v12 /* !! */  == false) break block86;
                                                                                                if (v11 != null) {
                                                                                                }
                                                                                                ** GOTO lbl220
                                                                                            }
                                                                                            catch (n9 v13) {
                                                                                                throw m44.a("i", (Object)v13, (long)8976453454824546119L, (long)var1_1);
                                                                                            }
                                                                                            v14 = new Object[2];
                                                                                            v14[1] = var31_20;
                                                                                            v14[0] = var20_12;
                                                                                            var32_21 = m44.a("i", (Object)v14, (long)7347020855488497652L, (long)var1_1);
                                                                                            var33_22 = new StringBuilder();
                                                                                            v15 = new Object[4];
                                                                                            v15[3] = var4_3;
                                                                                            v15[2] = var33_22;
                                                                                            v15[1] = var32_21;
                                                                                            v15[0] = var8_6;
                                                                                            var34_25 = m44.a("v", (Object)this, (Object)v15, (long)7280728124513148843L, (long)var1_1);
                                                                                            var35_28 = js.E((char)((char)var22_13), (short)((short)var23_14), (String)var31_20, (int)var24_15);
                                                                                            var36_29 = null;
                                                                                            try {
                                                                                                v16 = var35_28;
                                                                                                v17 = var29_18;
                                                                                                if (var1_1 > 0L) {
                                                                                                    if (v17 == false) break block87;
                                                                                                    if (v16 == null) break block88;
                                                                                                }
                                                                                                ** GOTO lbl97
                                                                                            }
                                                                                            catch (n9 v18) {
                                                                                                throw m44.a("i", (Object)v18, (long)8976453454824546119L, (long)var1_1);
                                                                                            }
                                                                                            v16 = var35_28;
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                v17 = var29_18;
lbl97:
                                                                                                // 2 sources

                                                                                                if (v17 == false) break block89;
                                                                                                if (v16.length() <= 0) break block88;
                                                                                            }
                                                                                            catch (n9 v19) {
                                                                                                throw m44.a("i", (Object)v19, (long)8976453454824546119L, (long)var1_1);
                                                                                            }
                                                                                            v20 = new Object[3];
                                                                                            v20[2] = var16_10;
                                                                                            v20[1] = var4_3;
                                                                                            v20[0] = var35_28;
                                                                                            v16 = m44.a("v", (Object)this, (Object)v20, (long)8761591364889353773L, (long)var1_1);
                                                                                        }
                                                                                        catch (n9 v21) {
                                                                                            throw m44.a("i", (Object)v21, (long)8976453454824546119L, (long)var1_1);
                                                                                        }
                                                                                    }
                                                                                    var36_29 = v16;
                                                                                }
                                                                                try {
                                                                                    v22 = var30_19.equals(xr.b("c", (int)19797, (long)(7070933222500328130L ^ var1_1)));
                                                                                    if (var29_18 == false) break block90;
                                                                                    if (v22) {
                                                                                    }
                                                                                    ** GOTO lbl139
                                                                                }
                                                                                catch (n9 v23) {
                                                                                    throw m44.a("i", (Object)v23, (long)8976453454824546119L, (long)var1_1);
                                                                                }
                                                                                var38_30 = m44.a("w", (Object)this, (long)8754105131705466771L, (long)var1_1).lastIndexOf(".");
                                                                                if (var38_30 != -1) break block104;
                                                                                var37_33 = m44.a("w", (Object)this, (long)8754105131705466771L, (long)var1_1);
                                                                                v24 = var29_18;
                                                                                if (var1_1 <= 0L) ** GOTO lbl136
                                                                                if (v24 != false) break block105;
                                                                            }
                                                                            var37_33 = m44.a("w", (Object)this, (long)8754105131705466771L, (long)var1_1).substring(var38_30 + 1);
                                                                        }
                                                                        try {
                                                                            try {
                                                                                m44.a("u", (Object)this, (m_[])new m_[1], (long)7229147610537936738L, (long)var1_1);
                                                                                m44.a("w", (Object)this, (long)7229147610537936738L, (long)var1_1)[0] = new m_((String)var37_33, var10_7, (String[])var34_25);
                                                                                v24 = var29_18;
lbl136:
                                                                                // 2 sources

                                                                                if (var1_1 > 0L) {
                                                                                    if (v24 != false) break block91;
                                                                                }
                                                                                ** GOTO lbl219
lbl139:
                                                                                // 2 sources

                                                                                v25 = var30_19;
                                                                                if (var29_18 == false) break block92;
                                                                            }
                                                                            catch (n9 v26) {
                                                                                throw m44.a("i", (Object)v26, (long)8976453454824546119L, (long)var1_1);
                                                                            }
                                                                            v22 = v25.equals(xr.b("c", (int)16013, (long)(1070272105265074456L ^ var1_1)));
                                                                        }
                                                                        catch (n9 v27) {
                                                                            throw m44.a("i", (Object)v27, (long)8976453454824546119L, (long)var1_1);
                                                                        }
                                                                    }
                                                                    if (!v22) break block106;
                                                                    v25 = xr.b("c", (int)20942, (long)(6018784246069821016L ^ var1_1));
                                                                }
                                                                var37_33 = v25;
                                                                m44.a("u", (Object)this, (m_[])new m_[1], (long)7229147610537936738L, (long)var1_1);
                                                                m44.a("w", (Object)this, (long)7229147610537936738L, (long)var1_1)[0] = new m_((String)var37_33, var10_7, (String[])var34_25);
                                                                v24 = var29_18;
                                                                if (var1_1 < 0L) ** GOTO lbl219
                                                                if (v24 != false) break block91;
                                                            }
                                                            v28 = new Object[6];
                                                            v28[5] = var33_22.toString();
                                                            v28[4] = (int)((char)var7_5);
                                                            v28[3] = var5_4;
                                                            v28[2] = var36_29;
                                                            v28[1] = var30_19;
                                                            v28[0] = m44.a("w", (Object)this, (long)8754105131705466771L, (long)var1_1);
                                                            var38_31 = m44.a("v", (Object)var4_3, (Object)v28, (long)9197645711178255352L, (long)var1_1);
                                                            try {
                                                                v29 = var38_31;
                                                                if (var1_1 <= 0L || var29_18 == false) break block93;
                                                                if (v29 == null) break block94;
                                                            }
                                                            catch (n9 v30) {
                                                                throw m44.a("i", (Object)v30, (long)8976453454824546119L, (long)var1_1);
                                                            }
                                                            v29 = var38_31;
                                                        }
                                                        try {
                                                            v31 = ((CallSite)v29).length;
                                                            if (var29_18 == false) break block95;
                                                            if (v31 == 0) {
                                                            }
                                                            ** GOTO lbl195
                                                        }
                                                        catch (n9 v32) {
                                                            throw m44.a("i", (Object)v32, (long)8976453454824546119L, (long)var1_1);
                                                        }
                                                    }
                                                    var37_33 = var30_19;
                                                    try {
                                                        m44.a("u", (Object)this, (m_[])new m_[1], (long)7229147610537936738L, (long)var1_1);
                                                        m44.a("w", (Object)this, (long)7229147610537936738L, (long)var1_1)[0] = new m_((String)var37_33, var10_7, (String[])var34_25);
                                                        v24 = var29_18;
                                                        if (var1_1 > 0L) {
                                                            if (v24 != false) break block91;
                                                        }
                                                        ** GOTO lbl219
lbl195:
                                                        // 2 sources

                                                        m44.a("u", (Object)this, (m_[])new m_[((CallSite)var38_31).length], (long)7229147610537936738L, (long)var1_1);
                                                        v31 = 0;
                                                    }
                                                    catch (n9 v33) {
                                                        throw m44.a("i", (Object)v33, (long)8976453454824546119L, (long)var1_1);
                                                    }
                                                }
                                                var39_34 = v31;
                                                block50: while (var39_34 < ((CallSite)var38_31).length) {
                                                    try {
                                                        m44.a("w", (Object)this, (long)7229147610537936738L, (long)var1_1)[var39_34] = new m_((String)var38_31[var39_34], var10_7, (String[])var34_25);
                                                        ++var39_34;
                                                        do {
                                                            v34 = var29_18;
                                                            if (var1_1 >= 0L) {
                                                                if (v34 == false) break block85;
                                                                v34 = var29_18;
                                                            }
                                                            if (v34 != false) continue block50;
                                                        } while (var1_1 < 0L);
                                                        break;
                                                    }
                                                    catch (n9 v35) {
                                                        throw m44.a("i", (Object)v35, (long)8976453454824546119L, (long)var1_1);
                                                    }
                                                }
                                            }
                                            try {
                                                v24 = var29_18;
lbl219:
                                                // 4 sources

                                                if (v24 != false) break block85;
lbl220:
                                                // 2 sources

                                                v11 = var30_19;
                                            }
                                            catch (n9 v36) {
                                                throw m44.a("i", (Object)v36, (long)8976453454824546119L, (long)var1_1);
                                            }
                                        }
                                        try {
                                            v12 /* !! */  = (CallSite)26445;
lbl227:
                                            // 2 sources

                                            v37 = v11.equals(xr.b("c", (int)v12 /* !! */ , (long)(4102417360271526111L ^ var1_1)));
                                            if (var1_1 <= 0L || var29_18 == false) break block96;
                                            if (v37 != 0) {
                                            }
                                            ** GOTO lbl250
                                        }
                                        catch (n9 v38) {
                                            throw m44.a("i", (Object)v38, (long)8976453454824546119L, (long)var1_1);
                                        }
                                        m44.a("u", (Object)this, (m_[])new m_[1], (long)7229147610537936738L, (long)var1_1);
                                        var33_23 = m44.a("w", (Object)this, (long)8754105131705466771L, (long)var1_1).lastIndexOf(".");
                                        if (var33_23 != -1) break block107;
                                        var32_21 = m44.a("w", (Object)this, (long)8754105131705466771L, (long)var1_1);
                                        v39 = var29_18;
                                        if (var1_1 < 0L) ** GOTO lbl249
                                        if (v39 != false) break block108;
                                    }
                                    var32_21 = m44.a("w", (Object)this, (long)8754105131705466771L, (long)var1_1).substring(var33_23 + 1);
                                }
                                try {
                                    try {
                                        block109: {
                                            m44.a("w", (Object)this, (long)7229147610537936738L, (long)var1_1)[0] = new m_((String)var32_21, var10_7, null);
                                            if (var1_1 < 0L) break block109;
                                            v39 = var29_18;
lbl249:
                                            // 2 sources

                                            if (v39 != false) break block85;
                                        }
                                        v40 = var30_19;
                                        if (var29_18 == false) break block97;
                                    }
                                    catch (n9 v41) {
                                        throw m44.a("i", (Object)v41, (long)8976453454824546119L, (long)var1_1);
                                    }
                                    v37 = (int)v40.equals(xr.b("c", (int)24048, (long)(8603564589008482912L ^ var1_1)));
                                }
                                catch (n9 v42) {
                                    throw m44.a("i", (Object)v42, (long)8976453454824546119L, (long)var1_1);
                                }
                            }
                            try {
                                if (var1_1 > 0L) {
                                    if (v37 == 0) break block98;
                                    m44.a("u", (Object)this, (m_[])new m_[1], (long)7229147610537936738L, (long)var1_1);
                                    v37 = 12992;
                                }
                                v40 = xr.b("c", (int)v37, (long)(693694460777962835L ^ var1_1));
                            }
                            catch (n9 v43) {
                                throw m44.a("i", (Object)v43, (long)8976453454824546119L, (long)var1_1);
                            }
                        }
                        var32_21 = v40;
                        m44.a("w", (Object)this, (long)7229147610537936738L, (long)var1_1)[0] = new m_((String)var32_21, var10_7, (String[])m44.a("m", (long)7034164028347931043L, (long)var1_1));
                        if (var29_18 != false) break block85;
                    }
                    v44 = new Object[3];
                    v44[2] = var30_19;
                    v44[1] = m44.a("w", (Object)this, (long)8754105131705466771L, (long)var1_1);
                    v44[0] = var25_16;
                    var33_24 = m44.a("v", (Object)var4_3, (Object)v44, (long)8918787101810981289L, (long)var1_1);
                    try {
                        if (var29_18 == false) break block99;
                        if (var33_24 != null) {
                        }
                        ** GOTO lbl337
                    }
                    catch (n9 v45) {
                        throw m44.a("i", (Object)v45, (long)8976453454824546119L, (long)var1_1);
                    }
                    m44.a("u", (Object)this, (m_[])new m_[var33_24.size()], (long)7229147610537936738L, (long)var1_1);
                    var34_26 = 0;
                    while (var34_26 < var33_24.size()) {
                        block100: {
                            block101: {
                                block102: {
                                    var35_28 = (lq0)var33_24.get(var34_26);
                                    var36_29 = m44.a("m", (long)7034164028347931043L, (long)var1_1);
                                    var37_33 = (String)var35_28.D();
                                    try {
                                        try {
                                            v46 = var29_18;
                                            if (var1_1 > 0L) {
                                                if (v46 == false) break block85;
                                                v46 = var29_18;
                                            }
                                            if (var1_1 <= 0L) break block100;
                                            if (v46 == false) break block101;
                                        }
                                        catch (n9 v47) {
                                            throw m44.a("i", (Object)v47, (long)8976453454824546119L, (long)var1_1);
                                        }
                                        if (var37_33 == null) break block102;
                                    }
                                    catch (n9 v48) {
                                        throw m44.a("i", (Object)v48, (long)8976453454824546119L, (long)var1_1);
                                    }
                                    var38_32 = new StringTokenizer((String)var37_33, (String)xr.b("c", (int)24292, (long)(877168925108334960L ^ var1_1)));
                                    var36_29 = new String[var38_32.countTokens()];
                                    var39_34 = 0;
                                    block53: while (var38_32.hasMoreTokens()) {
                                        try {
                                            var36_29[var39_34++] = var38_32.nextToken();
                                            do {
                                                v49 = var29_18;
                                                if (var1_1 >= 0L) {
                                                    if (v49 == false) break block101;
                                                    v49 = var29_18;
                                                }
                                                if (v49 != false) continue block53;
                                            } while (var1_1 <= 0L);
                                            break;
                                        }
                                        catch (n9 v50) {
                                            throw m44.a("i", (Object)v50, (long)8976453454824546119L, (long)var1_1);
                                        }
                                    }
                                }
                                m44.a("w", (Object)this, (long)7229147610537936738L, (long)var1_1)[var34_26] = new m_((String)var35_28.S(), var10_7, var36_29);
                                ++var34_26;
                            }
                            v46 = var29_18;
                        }
                        if (v46 != false) continue;
                    }
                    try {
                        if (var1_1 < 0L) break block85;
                        if (var1_1 < 0L) break block99;
                        if (var29_18 != false) break block85;
lbl337:
                        // 2 sources

                        m44.a("u", (Object)this, (m_[])new m_[1], (long)7229147610537936738L, (long)var1_1);
                    }
                    catch (n9 v51) {
                        throw m44.a("i", (Object)v51, (long)8976453454824546119L, (long)var1_1);
                    }
                }
                v52 = new Object[1];
                v52[0] = var14_9;
                var34_27 = m44.a("v", (Object)var3_2, (Object)v52, (long)7288660555412839087L, (long)var1_1);
                try {
                    v53 = var34_27;
                    if (var29_18 == false) break block103;
                    if (v53 != null) {
                    }
                    ** GOTO lbl366
                }
                catch (n9 v54) {
                    throw m44.a("i", (Object)v54, (long)8976453454824546119L, (long)var1_1);
                }
                v53 = var34_27;
            }
            v55 = new Object[2];
            v55[1] = v53;
            v55[0] = var20_12;
            var35_28 = m44.a("i", (Object)v55, (long)7347020855488497652L, (long)var1_1);
            try {
                m44.a("w", (Object)this, (long)7229147610537936738L, (long)var1_1)[0] = new m_((String)var30_19, var10_7, (String[])m44.a("v", (Object)var35_28, (long)7248333098885119522L, (long)var1_1));
                if (var1_1 <= 0L || var29_18 != false) break block85;
lbl366:
                // 2 sources

                m44.a("w", (Object)this, (long)7229147610537936738L, (long)var1_1)[0] = new m_((String)var30_19, var10_7, null);
            }
            catch (n9 v56) {
                throw m44.a("i", (Object)v56, (long)8976453454824546119L, (long)var1_1);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                xr.a = prr.a((long)-7688124863939119309L, (long)-4171433081478781479L, MethodHandles.lookup().lookupClass()).a(74703422158441L);
                xr.i = new HashMap<K, V>(13);
                var0 = xr.a ^ 55530525456215L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[7];
                var7_4 = 0;
                var6_5 = "\u0097\u00d3\u00f7\u00c4\u00bc\u0016\u00d7kt\u0094u0M\u001b\u00c5V\u0010o\u001e!\u00b4\u00f4\u0019\u00cf[j\u0015\u0006\u00fc\u00d7\u00c6\u0084\u00e6\u0010\u00e6F\u00dfK(4\u0093\u00aaE\u0098n\u00a0\u00d1=\u000ex \u000f\u0015\u00b20\u00e5j,FO\u0092q3$m(\u009f\u00d3\u00d2\u00fb\u00cf\u00f2\u00ac\u00fe\u0001y\u00f7\u00e3\u00ddM\u008b\u009b,\u0010\u00a6\u00b5v\u00da\u00ddUVp|\u00d0\u00e2\u00ae,\u00a8\u00b9\u0080";
                var8_6 = "\u0097\u00d3\u00f7\u00c4\u00bc\u0016\u00d7kt\u0094u0M\u001b\u00c5V\u0010o\u001e!\u00b4\u00f4\u0019\u00cf[j\u0015\u0006\u00fc\u00d7\u00c6\u0084\u00e6\u0010\u00e6F\u00dfK(4\u0093\u00aaE\u0098n\u00a0\u00d1=\u000ex \u000f\u0015\u00b20\u00e5j,FO\u0092q3$m(\u009f\u00d3\u00d2\u00fb\u00cf\u00f2\u00ac\u00fe\u0001y\u00f7\u00e3\u00ddM\u008b\u009b,\u0010\u00a6\u00b5v\u00da\u00ddUVp|\u00d0\u00e2\u00ae,\u00a8\u00b9\u0080".length();
                var5_7 = 16;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = xr.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00b2\u00db\u001ak\u00ef\u00db\u00af\u0006h\u00e27\u00a8Q\u00c8\u00e6, \b&R2\u001e\b\u000bb\u001e\u00a54\u00a1b\u0090\u00f0\u00cb\u00dbE\u0087-K\u0015\u008f0i(+\u0019?\u00e7Z\u00b6";
                    var8_6 = "\u00b2\u00db\u001ak\u00ef\u00db\u00af\u0006h\u00e27\u00a8Q\u00c8\u00e6, \b&R2\u001e\b\u000bb\u001e\u00a54\u00a1b\u0090\u00f0\u00cb\u00dbE\u0087-K\u0015\u008f0i(+\u0019?\u00e7Z\u00b6".length();
                    var5_7 = 16;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = xr.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl51:
                // 1 sources

                ** continue;
            }
        }
        xr.g = var9_3;
        xr.h = new String[7];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4588;
        if (h[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])i.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/xr", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = g[n2].getBytes("ISO-8859-1");
            xr.h[n2] = xr.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = xr.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/xr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xr.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
