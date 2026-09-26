/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.g7;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.awt.Color;
import java.awt.Component;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.JList;

public class gj
extends g7 {
    private boolean B;
    private static final long b = prr.a((long)9055008336347745231L, (long)2203774715937882618L, MethodHandles.lookup().lookupClass()).a(218508198679371L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long f;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void D(Object[] var1_1) {
        block196: {
            block186: {
                block187: {
                    block197: {
                        block180: {
                            block181: {
                                block182: {
                                    block183: {
                                        block184: {
                                            block185: {
                                                block178: {
                                                    block179: {
                                                        block176: {
                                                            block177: {
                                                                block167: {
                                                                    block175: {
                                                                        block173: {
                                                                            block174: {
                                                                                block171: {
                                                                                    block172: {
                                                                                        block169: {
                                                                                            block170: {
                                                                                                block168: {
                                                                                                    block166: {
                                                                                                        block156: {
                                                                                                            block158: {
                                                                                                                block157: {
                                                                                                                    block165: {
                                                                                                                        block163: {
                                                                                                                            block161: {
                                                                                                                                block159: {
                                                                                                                                    var6_2 = (Long)var1_1[0];
                                                                                                                                    var3_3 = (Component)var1_1[1];
                                                                                                                                    var5_4 = (JList)var1_1[2];
                                                                                                                                    var9_5 = var1_1[3];
                                                                                                                                    var8_6 = (Integer)var1_1[4];
                                                                                                                                    var2_7 = ((Boolean)var1_1[5]).booleanValue();
                                                                                                                                    var4_8 = (Boolean)var1_1[6];
                                                                                                                                    v0 = var6_2;
                                                                                                                                    var10_9 = v0 ^ 67573637373290L;
                                                                                                                                    var12_10 = v0 ^ 67504805655373L;
                                                                                                                                    var14_11 = v0 ^ 77884965162370L;
                                                                                                                                    var16_12 = v0 ^ 98998930774878L;
                                                                                                                                    var18_13 = v0 ^ 94235249503199L;
                                                                                                                                    var20_14 = v0 ^ 48317455616626L;
                                                                                                                                    var22_15 = m44.a("k", (long)1716661678756116662L, (long)var6_2);
                                                                                                                                    if (m44.a("u", (Object)this, (long)1257381671039816887L, (long)var6_2) == false) break block196;
                                                                                                                                    var23_16 = m44.a("t", (Object)var3_3, (long)604086904339436572L, (long)var6_2);
                                                                                                                                    var24_17 = m44.a("t", (Object)var3_3, (long)1289755767230024536L, (long)var6_2);
                                                                                                                                    var25_18 = m44.a("t", (Object)var5_4, (long)954533562839072551L, (long)var6_2);
                                                                                                                                    var26_19 = m44.a("t", (Object)var5_4, (long)577624172155199558L, (long)var6_2);
                                                                                                                                    var27_20 = m44.a("k", (Object)gj.a("m", (int)24556, (long)(3581180205340837596L ^ var6_2)), (long)1011709451395957627L, (long)var6_2);
                                                                                                                                    try {
                                                                                                                                        block160: {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        v1 = var27_20;
                                                                                                                                                                        if (var22_15 == null) break block156;
                                                                                                                                                                        if (v1 == null) break block157;
                                                                                                                                                                    }
                                                                                                                                                                    catch (n9 v2) {
                                                                                                                                                                        throw m44.a("k", (Object)v2, (long)746585287496301182L, (long)var6_2);
                                                                                                                                                                    }
                                                                                                                                                                    v1 = var27_20;
                                                                                                                                                                    if (var22_15 == null) break block156;
                                                                                                                                                                }
                                                                                                                                                                catch (n9 v3) {
                                                                                                                                                                    throw m44.a("k", (Object)v3, (long)746585287496301182L, (long)var6_2);
                                                                                                                                                                }
                                                                                                                                                                v4 /* !! */  = v1 instanceof Color;
                                                                                                                                                                if (var6_2 <= 0L) break block158;
                                                                                                                                                                if (v4 /* !! */  == 0) break block157;
                                                                                                                                                            }
                                                                                                                                                            catch (n9 v5) {
                                                                                                                                                                throw m44.a("k", (Object)v5, (long)746585287496301182L, (long)var6_2);
                                                                                                                                                            }
                                                                                                                                                            v4 /* !! */  = var2_7;
                                                                                                                                                            v6 = var22_15;
                                                                                                                                                            if (var6_2 >= 0L) {
                                                                                                                                                                if (v6 == null) break block159;
                                                                                                                                                            }
                                                                                                                                                            ** GOTO lbl89
                                                                                                                                                        }
                                                                                                                                                        catch (n9 v7) {
                                                                                                                                                            throw m44.a("k", (Object)v7, (long)746585287496301182L, (long)var6_2);
                                                                                                                                                        }
                                                                                                                                                        if (var6_2 < 0L) break block159;
                                                                                                                                                        if (v4 /* !! */  != 0) break block160;
                                                                                                                                                    }
                                                                                                                                                    catch (n9 v8) {
                                                                                                                                                        throw m44.a("k", (Object)v8, (long)746585287496301182L, (long)var6_2);
                                                                                                                                                    }
                                                                                                                                                    v1 = var23_16;
                                                                                                                                                    if (var22_15 == null) break block156;
                                                                                                                                                }
                                                                                                                                                catch (n9 v9) {
                                                                                                                                                    throw m44.a("k", (Object)v9, (long)746585287496301182L, (long)var6_2);
                                                                                                                                                }
                                                                                                                                                v10 = new Object[3];
                                                                                                                                                v10[2] = (Color)var27_20;
                                                                                                                                                v10[1] = var10_9;
                                                                                                                                                v10[0] = v1;
                                                                                                                                                v4 /* !! */  = (int)m44.a("k", (Object)v10, (long)1333553745300135156L, (long)var6_2);
                                                                                                                                                if (var6_2 <= 0L) break block158;
                                                                                                                                                if (v4 /* !! */  == 0) break block157;
                                                                                                                                            }
                                                                                                                                            catch (n9 v11) {
                                                                                                                                                throw m44.a("k", (Object)v11, (long)746585287496301182L, (long)var6_2);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        v4 /* !! */  = var2_7;
                                                                                                                                    }
                                                                                                                                    catch (n9 v12) {
                                                                                                                                        throw m44.a("k", (Object)v12, (long)746585287496301182L, (long)var6_2);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    block162: {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    v6 = var22_15;
lbl89:
                                                                                                                                                    // 2 sources

                                                                                                                                                    if (var6_2 >= 0L) {
                                                                                                                                                        if (v6 == null) break block161;
                                                                                                                                                        if (v4 /* !! */  != 0) break block162;
                                                                                                                                                    }
                                                                                                                                                    ** GOTO lbl123
                                                                                                                                                }
                                                                                                                                                catch (n9 v13) {
                                                                                                                                                    throw m44.a("k", (Object)v13, (long)746585287496301182L, (long)var6_2);
                                                                                                                                                }
                                                                                                                                                v1 = var24_17;
                                                                                                                                                if (var22_15 == null) break block156;
                                                                                                                                            }
                                                                                                                                            catch (n9 v14) {
                                                                                                                                                throw m44.a("k", (Object)v14, (long)746585287496301182L, (long)var6_2);
                                                                                                                                            }
                                                                                                                                            v15 = new Object[3];
                                                                                                                                            v15[2] = (Color)var27_20;
                                                                                                                                            v15[1] = var10_9;
                                                                                                                                            v15[0] = v1;
                                                                                                                                            v4 /* !! */  = (int)m44.a("k", (Object)v15, (long)1333553745300135156L, (long)var6_2);
                                                                                                                                            if (var6_2 < 0L) break block158;
                                                                                                                                            if (v4 /* !! */  == 0) break block157;
                                                                                                                                        }
                                                                                                                                        catch (n9 v16) {
                                                                                                                                            throw m44.a("k", (Object)v16, (long)746585287496301182L, (long)var6_2);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    v4 /* !! */  = var2_7;
                                                                                                                                }
                                                                                                                                catch (n9 v17) {
                                                                                                                                    throw m44.a("k", (Object)v17, (long)746585287496301182L, (long)var6_2);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                block164: {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                v6 = var22_15;
lbl123:
                                                                                                                                                // 2 sources

                                                                                                                                                if (var6_2 >= 0L) {
                                                                                                                                                    if (v6 == null) break block163;
                                                                                                                                                    if (v4 /* !! */  == 0) break block164;
                                                                                                                                                }
                                                                                                                                                ** GOTO lbl157
                                                                                                                                            }
                                                                                                                                            catch (n9 v18) {
                                                                                                                                                throw m44.a("k", (Object)v18, (long)746585287496301182L, (long)var6_2);
                                                                                                                                            }
                                                                                                                                            v1 = var25_18;
                                                                                                                                            if (var22_15 == null) break block156;
                                                                                                                                        }
                                                                                                                                        catch (n9 v19) {
                                                                                                                                            throw m44.a("k", (Object)v19, (long)746585287496301182L, (long)var6_2);
                                                                                                                                        }
                                                                                                                                        v20 = new Object[3];
                                                                                                                                        v20[2] = (Color)var27_20;
                                                                                                                                        v20[1] = var10_9;
                                                                                                                                        v20[0] = v1;
                                                                                                                                        v4 /* !! */  = (int)m44.a("k", (Object)v20, (long)1333553745300135156L, (long)var6_2);
                                                                                                                                        if (var6_2 < 0L) break block158;
                                                                                                                                        if (v4 /* !! */  == 0) break block157;
                                                                                                                                    }
                                                                                                                                    catch (n9 v21) {
                                                                                                                                        throw m44.a("k", (Object)v21, (long)746585287496301182L, (long)var6_2);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                v4 /* !! */  = var2_7;
                                                                                                                            }
                                                                                                                            catch (n9 v22) {
                                                                                                                                throw m44.a("k", (Object)v22, (long)746585287496301182L, (long)var6_2);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    if (var6_2 <= 0L) break block165;
                                                                                                                                    v6 = var22_15;
lbl157:
                                                                                                                                    // 2 sources

                                                                                                                                    if (v6 == null) break block165;
                                                                                                                                    if (v4 /* !! */  != 0) {
                                                                                                                                    }
                                                                                                                                    ** GOTO lbl184
                                                                                                                                }
                                                                                                                                catch (n9 v23) {
                                                                                                                                    throw m44.a("k", (Object)v23, (long)746585287496301182L, (long)var6_2);
                                                                                                                                }
                                                                                                                                v1 = var26_19;
                                                                                                                                v24 = var22_15;
                                                                                                                                if (var6_2 >= 0L) {
                                                                                                                                    if (v24 == null) break block156;
                                                                                                                                }
                                                                                                                                ** GOTO lbl196
                                                                                                                            }
                                                                                                                            catch (n9 v25) {
                                                                                                                                throw m44.a("k", (Object)v25, (long)746585287496301182L, (long)var6_2);
                                                                                                                            }
                                                                                                                            v26 = new Object[3];
                                                                                                                            v26[2] = (Color)var27_20;
                                                                                                                            v26[1] = var10_9;
                                                                                                                            v26[0] = v1;
                                                                                                                            v4 /* !! */  = (int)m44.a("k", (Object)v26, (long)1333553745300135156L, (long)var6_2);
                                                                                                                        }
                                                                                                                        catch (n9 v27) {
                                                                                                                            throw m44.a("k", (Object)v27, (long)746585287496301182L, (long)var6_2);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        if (var6_2 <= 0L) break block158;
                                                                                                                        if (v4 /* !! */  == 0) break block157;
lbl184:
                                                                                                                        // 2 sources

                                                                                                                        m44.a("t", (Object)var3_3, (Object)((Color)var27_20), (long)806817836145251733L, (long)var6_2);
                                                                                                                        return;
                                                                                                                    }
                                                                                                                    catch (n9 v28) {
                                                                                                                        throw m44.a("k", (Object)v28, (long)746585287496301182L, (long)var6_2);
                                                                                                                    }
                                                                                                                }
                                                                                                                v4 /* !! */  = 26885;
                                                                                                            }
                                                                                                            v1 = var27_20 = m44.a("k", (Object)gj.a("m", (int)v4 /* !! */ , (long)(7857451137096839220L ^ var6_2)), (long)1011709451395957627L, (long)var6_2);
                                                                                                        }
                                                                                                        try {
                                                                                                            if (var6_2 < 0L) break block166;
                                                                                                            v24 = var22_15;
lbl196:
                                                                                                            // 2 sources

                                                                                                            if (v24 == null) break block166;
                                                                                                            if (v1 == null) break block167;
                                                                                                        }
                                                                                                        catch (n9 v29) {
                                                                                                            throw m44.a("k", (Object)v29, (long)746585287496301182L, (long)var6_2);
                                                                                                        }
                                                                                                        v1 = var27_20;
                                                                                                    }
                                                                                                    try {
                                                                                                        v30 /* !! */  = v1 instanceof Color;
                                                                                                        v31 = var22_15;
                                                                                                        if (var6_2 > 0L) {
                                                                                                            if (v31 == null) break block168;
                                                                                                            if (v30 /* !! */  == 0) break block167;
                                                                                                        }
                                                                                                        ** GOTO lbl219
                                                                                                    }
                                                                                                    catch (n9 v32) {
                                                                                                        throw m44.a("k", (Object)v32, (long)746585287496301182L, (long)var6_2);
                                                                                                    }
                                                                                                    v30 /* !! */  = var2_7;
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            v31 = var22_15;
lbl219:
                                                                                                            // 2 sources

                                                                                                            if (v31 == null) break block169;
                                                                                                            if (v30 /* !! */  != 0) break block170;
                                                                                                        }
                                                                                                        catch (n9 v33) {
                                                                                                            throw m44.a("k", (Object)v33, (long)746585287496301182L, (long)var6_2);
                                                                                                        }
                                                                                                        v34 = new Object[3];
                                                                                                        v34[2] = (Color)var27_20;
                                                                                                        v34[1] = var10_9;
                                                                                                        v34[0] = var23_16;
                                                                                                        v30 /* !! */  = m44.a("k", (Object)v34, (long)1333553745300135156L, (long)var6_2);
                                                                                                        v35 = var22_15;
                                                                                                        if (var6_2 >= 0L) {
                                                                                                            if (v35 == null) break block169;
                                                                                                        }
                                                                                                        ** GOTO lbl248
                                                                                                    }
                                                                                                    catch (n9 v36) {
                                                                                                        throw m44.a("k", (Object)v36, (long)746585287496301182L, (long)var6_2);
                                                                                                    }
                                                                                                    if (v30 /* !! */  == 0) break block167;
                                                                                                }
                                                                                                catch (n9 v37) {
                                                                                                    throw m44.a("k", (Object)v37, (long)746585287496301182L, (long)var6_2);
                                                                                                }
                                                                                            }
                                                                                            v30 /* !! */  = var2_7;
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    v35 = var22_15;
lbl248:
                                                                                                    // 2 sources

                                                                                                    if (v35 == null) break block171;
                                                                                                    if (v30 /* !! */  != 0) break block172;
                                                                                                }
                                                                                                catch (n9 v38) {
                                                                                                    throw m44.a("k", (Object)v38, (long)746585287496301182L, (long)var6_2);
                                                                                                }
                                                                                                v39 = new Object[3];
                                                                                                v39[2] = (Color)var27_20;
                                                                                                v39[1] = var10_9;
                                                                                                v39[0] = var24_17;
                                                                                                v30 /* !! */  = m44.a("k", (Object)v39, (long)1333553745300135156L, (long)var6_2);
                                                                                                v40 = var22_15;
                                                                                                if (var6_2 > 0L) {
                                                                                                    if (v40 == null) break block171;
                                                                                                }
                                                                                                ** GOTO lbl277
                                                                                            }
                                                                                            catch (n9 v41) {
                                                                                                throw m44.a("k", (Object)v41, (long)746585287496301182L, (long)var6_2);
                                                                                            }
                                                                                            if (v30 /* !! */  == 0) break block167;
                                                                                        }
                                                                                        catch (n9 v42) {
                                                                                            throw m44.a("k", (Object)v42, (long)746585287496301182L, (long)var6_2);
                                                                                        }
                                                                                    }
                                                                                    v30 /* !! */  = var2_7;
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            v40 = var22_15;
lbl277:
                                                                                            // 2 sources

                                                                                            if (v40 == null) break block173;
                                                                                            if (v30 /* !! */  == 0) break block174;
                                                                                        }
                                                                                        catch (n9 v43) {
                                                                                            throw m44.a("k", (Object)v43, (long)746585287496301182L, (long)var6_2);
                                                                                        }
                                                                                        v44 = new Object[3];
                                                                                        v44[2] = (Color)var27_20;
                                                                                        v44[1] = var10_9;
                                                                                        v44[0] = var25_18;
                                                                                        v30 /* !! */  = m44.a("k", (Object)v44, (long)1333553745300135156L, (long)var6_2);
                                                                                        v45 = var22_15;
                                                                                        if (var6_2 > 0L) {
                                                                                            if (v45 == null) break block173;
                                                                                        }
                                                                                        ** GOTO lbl306
                                                                                    }
                                                                                    catch (n9 v46) {
                                                                                        throw m44.a("k", (Object)v46, (long)746585287496301182L, (long)var6_2);
                                                                                    }
                                                                                    if (v30 /* !! */  == 0) break block167;
                                                                                }
                                                                                catch (n9 v47) {
                                                                                    throw m44.a("k", (Object)v47, (long)746585287496301182L, (long)var6_2);
                                                                                }
                                                                            }
                                                                            v30 /* !! */  = var2_7;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (var6_2 <= 0L) break block175;
                                                                                v45 = var22_15;
lbl306:
                                                                                // 2 sources

                                                                                if (v45 == null) break block175;
                                                                                if (v30 /* !! */  != 0) {
                                                                                }
                                                                                ** GOTO lbl324
                                                                            }
                                                                            catch (n9 v48) {
                                                                                throw m44.a("k", (Object)v48, (long)746585287496301182L, (long)var6_2);
                                                                            }
                                                                            v49 = new Object[3];
                                                                            v49[2] = (Color)var27_20;
                                                                            v49[1] = var10_9;
                                                                            v49[0] = var26_19;
                                                                            v30 /* !! */  = m44.a("k", (Object)v49, (long)1333553745300135156L, (long)var6_2);
                                                                        }
                                                                        catch (n9 v50) {
                                                                            throw m44.a("k", (Object)v50, (long)746585287496301182L, (long)var6_2);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (v30 /* !! */  == 0) break block167;
lbl324:
                                                                        // 2 sources

                                                                        m44.a("t", (Object)var3_3, (Object)((Color)var27_20), (long)806817836145251733L, (long)var6_2);
                                                                        return;
                                                                    }
                                                                    catch (n9 v51) {
                                                                        throw m44.a("k", (Object)v51, (long)746585287496301182L, (long)var6_2);
                                                                    }
                                                                }
                                                                var28_21 = null;
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    v52 /* !! */  = var2_7;
                                                                                    v53 = var22_15;
                                                                                    if (var6_2 >= 0L) {
                                                                                        if (v53 == null) break block176;
                                                                                        if (v52 /* !! */  != 0) break block177;
                                                                                    }
                                                                                    ** GOTO lbl379
                                                                                }
                                                                                catch (n9 v54) {
                                                                                    throw m44.a("k", (Object)v54, (long)746585287496301182L, (long)var6_2);
                                                                                }
                                                                                v55 = new Object[2];
                                                                                v55[1] = var23_16;
                                                                                v55[0] = var18_13;
                                                                                v56 /* !! */  = m44.a("k", (Object)v55, (long)1725678498538028030L, (long)var6_2);
                                                                                if (var22_15 == null) break block178;
                                                                            }
                                                                            catch (n9 v57) {
                                                                                throw m44.a("k", (Object)v57, (long)746585287496301182L, (long)var6_2);
                                                                            }
                                                                            if (v56 /* !! */  != false) break block179;
                                                                        }
                                                                        catch (n9 v58) {
                                                                            throw m44.a("k", (Object)v58, (long)746585287496301182L, (long)var6_2);
                                                                        }
                                                                        v59 = new Object[2];
                                                                        v59[1] = var20_14;
                                                                        v59[0] = var23_16;
                                                                        v56 /* !! */  = m44.a("k", (Object)v59, (long)1544303965252250136L, (long)var6_2);
                                                                        if (var22_15 == null) break block178;
                                                                    }
                                                                    catch (n9 v60) {
                                                                        throw m44.a("k", (Object)v60, (long)746585287496301182L, (long)var6_2);
                                                                    }
                                                                    if (v56 /* !! */  != false) break block179;
                                                                }
                                                                catch (n9 v61) {
                                                                    throw m44.a("k", (Object)v61, (long)746585287496301182L, (long)var6_2);
                                                                }
                                                            }
                                                            v52 /* !! */  = var2_7;
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v53 = var22_15;
lbl379:
                                                                            // 2 sources

                                                                            if (v53 == null) break block180;
                                                                            if (v52 /* !! */  == 0) break block181;
                                                                        }
                                                                        catch (n9 v62) {
                                                                            throw m44.a("k", (Object)v62, (long)746585287496301182L, (long)var6_2);
                                                                        }
                                                                        v63 = new Object[2];
                                                                        v63[1] = var24_17;
                                                                        v63[0] = var18_13;
                                                                        v56 /* !! */  = m44.a("k", (Object)v63, (long)1725678498538028030L, (long)var6_2);
                                                                        v64 = var22_15;
                                                                        if (var6_2 >= 0L) {
                                                                            if (v64 == null) break block178;
                                                                        }
                                                                        ** GOTO lbl420
                                                                    }
                                                                    catch (n9 v65) {
                                                                        throw m44.a("k", (Object)v65, (long)746585287496301182L, (long)var6_2);
                                                                    }
                                                                    if (v56 /* !! */  != false) break block179;
                                                                }
                                                                catch (n9 v66) {
                                                                    throw m44.a("k", (Object)v66, (long)746585287496301182L, (long)var6_2);
                                                                }
                                                                v67 = new Object[2];
                                                                v67[1] = var20_14;
                                                                v67[0] = var25_18;
                                                                v52 /* !! */  = m44.a("k", (Object)v67, (long)1544303965252250136L, (long)var6_2);
                                                                if (var22_15 == null) break block180;
                                                            }
                                                            catch (n9 v68) {
                                                                throw m44.a("k", (Object)v68, (long)746585287496301182L, (long)var6_2);
                                                            }
                                                            if (v52 /* !! */  == 0) break block181;
                                                        }
                                                        catch (n9 v69) {
                                                            throw m44.a("k", (Object)v69, (long)746585287496301182L, (long)var6_2);
                                                        }
                                                    }
                                                    v56 /* !! */  = (CallSite)var2_7;
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            v64 = var22_15;
lbl420:
                                                            // 2 sources

                                                            if (v64 == null) break block182;
                                                            if (v56 /* !! */  != false) break block183;
                                                        }
                                                        catch (n9 v70) {
                                                            throw m44.a("k", (Object)v70, (long)746585287496301182L, (long)var6_2);
                                                        }
                                                        v71 = var26_19;
                                                        if (var22_15 == null) break block184;
                                                    }
                                                    catch (n9 v72) {
                                                        throw m44.a("k", (Object)v72, (long)746585287496301182L, (long)var6_2);
                                                    }
                                                    v73 = new Object[2];
                                                    v73[1] = var12_10;
                                                    v73[0] = v71;
                                                    if (m44.a("k", (Object)v73, (long)1659381986905052091L, (long)var6_2) == false) break block185;
                                                }
                                                catch (n9 v74) {
                                                    throw m44.a("k", (Object)v74, (long)746585287496301182L, (long)var6_2);
                                                }
                                                var28_21 = m44.a("o", (long)916313487409425982L, (long)var6_2);
                                                break block197;
                                            }
                                            v71 = m44.a("o", (long)1630000066692677685L, (long)var6_2);
                                        }
                                        var28_21 = v71;
                                        break block197;
                                    }
                                    try {
                                        block198: {
                                            v75 = var24_17;
                                            v76 = var22_15;
                                            if (var6_2 < 0L) break block198;
                                            if (v76 == null) ** GOTO lbl467
                                            v77 = new Object[2];
                                            v76 = v77;
                                            v77[1] = var12_10;
                                        }
                                        v76[0] = v75;
                                        v56 /* !! */  = m44.a("k", (Object)v76, (long)1659381986905052091L, (long)var6_2);
                                    }
                                    catch (n9 v78) {
                                        throw m44.a("k", (Object)v78, (long)746585287496301182L, (long)var6_2);
                                    }
                                }
                                if (v56 /* !! */  != false) {
                                    var28_21 = m44.a("o", (long)916313487409425982L, (long)var6_2);
                                } else {
                                    v75 = m44.a("o", (long)1630000066692677685L, (long)var6_2);
lbl467:
                                    // 2 sources

                                    var28_21 = v75;
                                }
                                break block197;
                            }
                            v52 /* !! */  = var2_7;
                        }
                        if (v52 /* !! */  != 0) {
                            v79 = new Object[3];
                            v79[2] = var25_18;
                            v79[1] = var14_11;
                            v79[0] = var25_18;
                            var28_21 = m44.a("j", (Object)this, (Object)v79, (long)951122796121824585L, (long)var6_2);
                        } else {
                            v80 = new Object[3];
                            v80[2] = var23_16;
                            v80[1] = var14_11;
                            v80[0] = var23_16;
                            var28_21 = m44.a("j", (Object)this, (Object)v80, (long)951122796121824585L, (long)var6_2);
                        }
                    }
                    try {
                        try {
                            v81 = new Object[3];
                            v81[2] = var28_21;
                            v81[1] = var10_9;
                            v81[0] = var24_17;
                            v82 = m44.a("k", (Object)v81, (long)1333553745300135156L, (long)var6_2);
                            if (var22_15 == null) break block186;
                            if (v82 == false) break block187;
                        }
                        catch (n9 v83) {
                            throw m44.a("k", (Object)v83, (long)746585287496301182L, (long)var6_2);
                        }
                        m44.a("t", (Object)var3_3, (Object)var28_21, (long)806817836145251733L, (long)var6_2);
                        return;
                    }
                    catch (n9 v84) {
                        throw m44.a("k", (Object)v84, (long)746585287496301182L, (long)var6_2);
                    }
                }
                v82 = (int)gj.f;
            }
            var29_22 = v82;
            var30_23 = 0;
            do {
                block190: {
                    block195: {
                        block193: {
                            block194: {
                                block191: {
                                    block192: {
                                        block188: {
                                            block189: {
                                                block200: {
                                                    block199: {
                                                        if (var2_7 == 0) break block199;
                                                        v85 = new Object[3];
                                                        v85[2] = var25_18;
                                                        v85[1] = var14_11;
                                                        v85[0] = var28_21;
                                                        var28_21 = m44.a("j", (Object)this, (Object)v85, (long)951122796121824585L, (long)var6_2);
                                                        if (var6_2 <= 0L || var22_15 != null) break block200;
                                                    }
                                                    v86 = new Object[3];
                                                    v86[2] = var23_16;
                                                    v86[1] = var14_11;
                                                    v86[0] = var28_21;
                                                    var28_21 = m44.a("j", (Object)this, (Object)v86, (long)951122796121824585L, (long)var6_2);
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            v87 /* !! */  = var2_7;
                                                            v88 = var22_15;
                                                            if (var6_2 > 0L) {
                                                                if (v88 == null) break block188;
                                                                if (v87 /* !! */  != 0) break block189;
                                                            }
                                                            ** GOTO lbl560
                                                        }
                                                        catch (n9 v89) {
                                                            throw m44.a("k", (Object)v89, (long)746585287496301182L, (long)var6_2);
                                                        }
                                                        v90 = new Object[4];
                                                        v90[3] = (int)var29_22;
                                                        v90[2] = var16_12;
                                                        v90[1] = var28_21;
                                                        v90[0] = var23_16;
                                                        v87 /* !! */  = (int)m44.a("k", (Object)v90, (long)1580155470540163630L, (long)var6_2);
                                                        if (var22_15 == null) continue;
                                                    }
                                                    catch (n9 v91) {
                                                        throw m44.a("k", (Object)v91, (long)746585287496301182L, (long)var6_2);
                                                    }
                                                    if (v87 /* !! */  == 0) break block190;
                                                }
                                                catch (n9 v92) {
                                                    throw m44.a("k", (Object)v92, (long)746585287496301182L, (long)var6_2);
                                                }
                                            }
                                            v87 /* !! */  = var2_7;
                                        }
                                        try {
                                            try {
                                                try {
                                                    v88 = var22_15;
lbl560:
                                                    // 2 sources

                                                    if (var6_2 > 0L) {
                                                        if (v88 == null) break block191;
                                                        if (v87 /* !! */  != 0) break block192;
                                                    }
                                                    ** GOTO lbl589
                                                }
                                                catch (n9 v93) {
                                                    throw m44.a("k", (Object)v93, (long)746585287496301182L, (long)var6_2);
                                                }
                                                v94 = new Object[4];
                                                v94[3] = (int)var29_22;
                                                v94[2] = var16_12;
                                                v94[1] = var28_21;
                                                v94[0] = var24_17;
                                                v87 /* !! */  = (int)m44.a("k", (Object)v94, (long)1580155470540163630L, (long)var6_2);
                                                if (var22_15 == null) continue;
                                            }
                                            catch (n9 v95) {
                                                throw m44.a("k", (Object)v95, (long)746585287496301182L, (long)var6_2);
                                            }
                                            if (v87 /* !! */  == 0) break block190;
                                        }
                                        catch (n9 v96) {
                                            throw m44.a("k", (Object)v96, (long)746585287496301182L, (long)var6_2);
                                        }
                                    }
                                    v87 /* !! */  = var2_7;
                                }
                                try {
                                    try {
                                        try {
                                            v88 = var22_15;
lbl589:
                                            // 2 sources

                                            if (var6_2 >= 0L) {
                                                if (v88 == null) break block193;
                                                if (v87 /* !! */  == 0) break block194;
                                            }
                                            ** GOTO lbl617
                                        }
                                        catch (n9 v97) {
                                            throw m44.a("k", (Object)v97, (long)746585287496301182L, (long)var6_2);
                                        }
                                        v98 = new Object[4];
                                        v98[3] = (int)var29_22;
                                        v98[2] = var16_12;
                                        v98[1] = var28_21;
                                        v98[0] = var25_18;
                                        v87 /* !! */  = (int)m44.a("k", (Object)v98, (long)1580155470540163630L, (long)var6_2);
                                        if (var22_15 == null) continue;
                                    }
                                    catch (n9 v99) {
                                        throw m44.a("k", (Object)v99, (long)746585287496301182L, (long)var6_2);
                                    }
                                    if (v87 /* !! */  == 0) break block190;
                                }
                                catch (n9 v100) {
                                    throw m44.a("k", (Object)v100, (long)746585287496301182L, (long)var6_2);
                                }
                            }
                            v87 /* !! */  = var2_7;
                        }
                        try {
                            try {
                                v88 = var22_15;
lbl617:
                                // 2 sources

                                if (var6_2 < 0L) ** GOTO lbl638
                                if (v88 == null) break block195;
                                if (v87 /* !! */  != 0) {
                                }
                                ** GOTO lbl643
                            }
                            catch (n9 v101) {
                                throw m44.a("k", (Object)v101, (long)746585287496301182L, (long)var6_2);
                            }
                            v102 = new Object[4];
                            v102[3] = (int)var29_22;
                            v102[2] = var16_12;
                            v102[1] = var28_21;
                            v102[0] = var26_19;
                            v87 /* !! */  = (int)m44.a("k", (Object)v102, (long)1580155470540163630L, (long)var6_2);
                        }
                        catch (n9 v103) {
                            throw m44.a("k", (Object)v103, (long)746585287496301182L, (long)var6_2);
                        }
                    }
                    try {
                        try {
                            v88 = var22_15;
lbl638:
                            // 2 sources

                            if (v88 == null) continue;
                            if (v87 /* !! */  == 0) break block190;
                        }
                        catch (n9 v104) {
                            throw m44.a("k", (Object)v104, (long)746585287496301182L, (long)var6_2);
                        }
lbl643:
                        // 2 sources

                        m44.a("t", (Object)var3_3, (Object)var28_21, (long)806817836145251733L, (long)var6_2);
                        return;
                    }
                    catch (n9 v105) {
                        throw m44.a("k", (Object)v105, (long)746585287496301182L, (long)var6_2);
                    }
                }
                v87 /* !! */  = var30_23++;
            } while (v87 /* !! */  < 3);
        }
    }

    public gj(Object object, long l, boolean bl) {
        long l2 = (l = b ^ l) ^ 0x2279711CF9C8L;
        super(object, l2);
        m44.a("v", (Object)((Object)this), (boolean)bl, (long)-6540790573274963714L, (long)l);
    }

    private Color u(Object[] objectArray) {
        Object object;
        block4: {
            Color color;
            long l;
            long l2;
            block5: {
                Color color2;
                block6: {
                    color2 = (Color)objectArray[0];
                    l2 = (Long)objectArray[1];
                    Color color3 = (Color)objectArray[2];
                    long l3 = (l2 = b ^ l2) ^ 0x423DCC481BC0L;
                    CallSite callSite = m44.a("i", (long)5071237346960599300L, (long)l2);
                    try {
                        try {
                            object = color3;
                            if (callSite == null) break block4;
                            l = l3;
                            if (l2 < 0L) break block5;
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l;
                            objectArray2[0] = object;
                            if (m44.a("i", (Object)objectArray2, (long)4961860174908832682L, (long)l2) != false) break block6;
                        }
                        catch (n9 n92) {
                            throw m44.a("i", (Object)((Object)n92), (long)6624248117895146444L, (long)l2);
                        }
                        return m44.a("v", (Object)color2, (long)6720782388394958965L, (long)l2);
                    }
                    catch (n9 n93) {
                        throw m44.a("i", (Object)((Object)n93), (long)6624248117895146444L, (long)l2);
                    }
                }
                color = color2;
                l = 4905964140653579226L;
            }
            object = m44.a("v", (Object)color, (long)l, (long)l2);
        }
        return object;
    }

    public boolean equals(Object object) {
        boolean bl;
        block4: {
            block5: {
                long l = b ^ 0x7B9F95D0FB9DL;
                CallSite callSite = m44.a("j", (long)2912624442023642895L, (long)l);
                try {
                    try {
                        bl = object instanceof gj;
                        if (callSite == null) break block4;
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)3883529568422184391L, (long)l);
                    }
                    return m44.a("t", (Object)((Object)this), (long)3806640280277566148L, (long)l).equals(m44.a("t", (Object)((Object)((gj)((Object)object))), (long)3806640280277566148L, (long)l));
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)3883529568422184391L, (long)l);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean s(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return (boolean)m44.a("p", (Object)((Object)this), (long)-6845974634518223558L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l = b ^ 0x1E091DDEE7A5L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u00adm\u0093\u00a35\u0085\u00a4\u00cd\u00c4\u00f9q\u008cl\u00a7A\u00a6\u0005\u0014K\u0013\u00ad\u00f9\u00f2\u0014s9\u00ac\u00fb\u0013\u009f\u00d4l\u0010\u00b3\u0086\u0099W}\u00f1m!\u00del~Otrs{I\u00013\u00efD\u009c\u0007(\u0006\u0094r\u00f7.\u0017\u0092\u00e1sr\u001c\u00a3\u0083\u0080\u008eL\u0081-\u0002p\u009e\u00aa\u00eb\u00c3\u00e7|\u009f\u00e9H\u00f8\u00f5;sT\u00b16\u0086vp\u00cf";
        int n2 = "\u00adm\u0093\u00a35\u0085\u00a4\u00cd\u00c4\u00f9q\u008cl\u00a7A\u00a6\u0005\u0014K\u0013\u00ad\u00f9\u00f2\u0014s9\u00ac\u00fb\u0013\u009f\u00d4l\u0010\u00b3\u0086\u0099W}\u00f1m!\u00del~Otrs{I\u00013\u00efD\u009c\u0007(\u0006\u0094r\u00f7.\u0017\u0092\u00e1sr\u001c\u00a3\u0083\u0080\u008eL\u0081-\u0002p\u009e\u00aa\u00eb\u00c3\u00e7|\u009f\u00e9H\u00f8\u00f5;sT\u00b16\u0086vp\u00cf".length();
        int n3 = 56;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = gj.a(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        c = stringArray;
        d = new String[2];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n6 = 1;
        while (true) {
            if (n6 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = -1826989365100699801L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                f = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n6] = (byte)(l << n6 * 8 >>> 56);
            ++n6;
        }
    }

    private static n9 b(n9 n92) {
        return n92;
    }

    private static String a(byte[] byArray) {
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x124;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/gj", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            gj.d[n2] = gj.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = gj.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/gj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(gj.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
