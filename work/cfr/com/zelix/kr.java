/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._6;
import com.zelix._u;
import com.zelix.df;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.hf;
import com.zelix.ki;
import com.zelix.l6q;
import com.zelix.l6z;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sc;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class kr
extends ki {
    sc[] p;
    private static final long c;
    private static final String[] g;
    private static final String[] i;
    private static final Map j;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    boolean y(Object[] var1_1) {
        block23: {
            block24: {
                block18: {
                    var2_2 = (Long)var1_1[0];
                    var4_3 = (var2_2 = kr.c ^ var2_2) ^ 17021130213498L;
                    var7_4 = 0;
                    var8_5 = new ArrayList<CallSite>(((CallSite)m44.a("w", (Object)this, (long)3004090775026773964L, (long)var2_2)).length);
                    var9_6 = m44.a("w", (Object)this, (long)3004090775026773964L, (long)var2_2);
                    var10_7 = ((CallSite)var9_6).length;
                    var6_8 = m44.a("i", (long)3477017882444251400L, (long)var2_2);
                    var11_9 = 0;
                    while (var11_9 < var10_7) {
                        block21: {
                            block22: {
                                block19: {
                                    var12_10 = var9_6[var11_9];
                                    try {
                                        block20: {
                                            try {
                                                try {
                                                    try {
                                                        v0 = new Object[1];
                                                        v0[0] = var4_3;
                                                        v1 /* !! */  = (int)m44.a("v", (Object)var12_10, (Object)v0, (long)3493705752091363735L, (long)var2_2);
                                                        v2 /* !! */  = var6_8;
                                                        if (var2_2 > 0L) {
                                                            if (v2 /* !! */  == false) break block18;
                                                            if (var6_8 == false) break block19;
                                                        }
                                                        ** GOTO lbl60
                                                    }
                                                    catch (n9 v3) {
                                                        throw m44.a("i", (Object)v3, (long)3177543171829022808L, (long)var2_2);
                                                    }
                                                    if (var2_2 <= 0L) break block19;
                                                    if (v1 /* !! */  != 0) break block20;
                                                }
                                                catch (n9 v4) {
                                                    throw m44.a("i", (Object)v4, (long)3177543171829022808L, (long)var2_2);
                                                }
                                                var8_5.add(var12_10);
                                                v5 = var6_8;
                                                if (var2_2 < 0L) break block21;
                                                if (v5 != false) break block22;
                                            }
                                            catch (n9 v6) {
                                                throw m44.a("i", (Object)v6, (long)3177543171829022808L, (long)var2_2);
                                            }
                                        }
                                        v7 = true;
                                    }
                                    catch (n9 v8) {
                                        throw m44.a("i", (Object)v8, (long)3177543171829022808L, (long)var2_2);
                                    }
                                }
                                var7_4 = v7;
                            }
                            ++var11_9;
                            v5 = var6_8;
                        }
                        if (v5 != false) continue;
                    }
                    if (var2_2 < 0L) break block24;
                    v1 /* !! */  = var8_5.size();
                }
                try {
                    try {
                        v2 /* !! */  = var6_8;
lbl60:
                        // 2 sources

                        if (var2_2 > 0L) {
                            if (v2 /* !! */  == false) break block23;
                            v2 /* !! */  = (CallSite)((CallSite)m44.a("w", (Object)this, (long)3004090775026773964L, (long)var2_2)).length;
                        }
                        if (v1 /* !! */  >= v2 /* !! */ ) break block24;
                    }
                    catch (n9 v9) {
                        throw m44.a("i", (Object)v9, (long)3177543171829022808L, (long)var2_2);
                    }
                    m44.a("u", (Object)this, (sc[])var8_5.toArray(new sc[var8_5.size()]), (long)3004090775026773964L, (long)var2_2);
                }
                catch (n9 v10) {
                    throw m44.a("i", (Object)v10, (long)3177543171829022808L, (long)var2_2);
                }
            }
            v1 /* !! */  = var7_4;
        }
        return (boolean)v1 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    int c(Object[] var1_1) {
        block20: {
            block21: {
                block18: {
                    var2_2 = (Long)var1_1[0];
                    var4_3 = (var2_2 = kr.c ^ var2_2) ^ 117607636216230L;
                    var7_4 = new ArrayList<CallSite>(((CallSite)m44.a("q", (Object)this, (long)-6971913574670853822L, (long)var2_2)).length);
                    var8_5 = m44.a("q", (Object)this, (long)-6971913574670853822L, (long)var2_2);
                    var9_6 = ((CallSite)var8_5).length;
                    var10_7 = 0;
                    var6_8 = m44.a("o", (long)-8732835396196501626L, (long)var2_2);
                    while (var10_7 < var9_6) {
                        block16: {
                            block17: {
                                block19: {
                                    var11_9 = var8_5[var10_7];
                                    try {
                                        try {
                                            try {
                                                v0 = var6_8;
                                                if (var2_2 < 0L) break block16;
                                                if (v0 == false) break block17;
                                                v1 = new Object[1];
                                                v1[0] = var4_3;
                                                v2 /* !! */  = (int)m44.a("p", (Object)var11_9, (Object)v1, (long)-9079913235741359379L, (long)var2_2);
                                                v3 /* !! */  = var6_8;
                                                if (var2_2 > 0L) {
                                                    if (v3 /* !! */  == false) break block18;
                                                }
                                                ** GOTO lbl50
                                            }
                                            catch (n9 v4) {
                                                throw m44.a("o", (Object)v4, (long)-7307508743608142122L, (long)var2_2);
                                            }
                                            if (v2 /* !! */  != 0) break block19;
                                        }
                                        catch (n9 v5) {
                                            throw m44.a("o", (Object)v5, (long)-7307508743608142122L, (long)var2_2);
                                        }
                                        var7_4.add(var11_9);
                                    }
                                    catch (n9 v6) {
                                        throw m44.a("o", (Object)v6, (long)-7307508743608142122L, (long)var2_2);
                                    }
                                }
                                ++var10_7;
                            }
                            v0 = var6_8;
                        }
                        if (v0 != false) continue;
                    }
                    if (var2_2 < 0L) break block21;
                    v2 /* !! */  = var7_4.size();
                }
                try {
                    try {
                        v3 /* !! */  = var6_8;
lbl50:
                        // 2 sources

                        if (var2_2 > 0L) {
                            if (v3 /* !! */  == false) break block20;
                            v3 /* !! */  = (CallSite)((CallSite)m44.a("q", (Object)this, (long)-6971913574670853822L, (long)var2_2)).length;
                        }
                        if (v2 /* !! */  >= v3 /* !! */ ) break block21;
                    }
                    catch (n9 v7) {
                        throw m44.a("o", (Object)v7, (long)-7307508743608142122L, (long)var2_2);
                    }
                    m44.a("s", (Object)this, (sc[])var7_4.toArray(new sc[var7_4.size()]), (long)-6971913574670853822L, (long)var2_2);
                }
                catch (n9 v8) {
                    throw m44.a("o", (Object)v8, (long)-7307508743608142122L, (long)var2_2);
                }
            }
            v2 /* !! */  = ((CallSite)m44.a("q", (Object)this, (long)-6971913574670853822L, (long)var2_2)).length;
        }
        return v2 /* !! */ ;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Object[] objectArray) {
        block4: {
            void var7_6;
            CallSite callSite;
            long l10;
            long l11;
            block3: {
                CallSite callSite2;
                Object object;
                l11 = (Long)objectArray[0];
                l10 = l11 ^ 0x366379B23F1CL;
                callSite = m44.a("o", (long)1609736174550729393L, (long)l11);
                try {
                    object = m44.a("q", (Object)this, (long)1684269418671496585L, (long)l11);
                    if (callSite != false) break block3;
                    if (object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)n92, (long)1321420714191519254L, (long)l11);
                }
                object = callSite2 = (Object)false;
            }
            while (var7_6 < ((CallSite)m44.a("q", (Object)this, (long)1729077873602695554L, (long)l11)).length) {
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l10;
                m44.a("p", (Object)m44.a("q", (Object)this, (long)1729077873602695554L, (long)l11)[var7_6], (Object)objectArray2, (long)976352716341539097L, (long)l11);
                ++var7_6;
                if (callSite == false) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void B(Object[] var1_1) {
        block20: {
            block18: {
                var5_2 = (HashSet)var1_1[0];
                var2_3 = (Long)var1_1[1];
                var4_4 = (df)var1_1[2];
                var6_5 = (var2_3 = kr.c ^ var2_3) ^ 76236996043995L;
                var9_6 = new ArrayList<CallSite>(((CallSite)m44.a("t", (Object)this, (long)3356203625227725039L, (long)var2_3)).length);
                var10_7 = m44.a("t", (Object)this, (long)3356203625227725039L, (long)var2_3);
                var8_8 = m44.a("j", (long)3403495112992455644L, (long)var2_3);
                var11_9 = ((CallSite)var10_7).length;
                var12_10 = 0;
                while (var12_10 < var11_9) {
                    block16: {
                        block17: {
                            block19: {
                                var13_11 = var10_7[var12_10];
                                try {
                                    try {
                                        try {
                                            v0 = var8_8;
                                            if (var2_3 <= 0L) break block16;
                                            if (v0 != false) break block17;
                                            v1 = new Object[3];
                                            v1[2] = var6_5;
                                            v1[1] = var4_4;
                                            v1[0] = var5_2;
                                            v2 /* !! */  = (int)m44.a("u", (Object)var13_11, (Object)v1, (long)3163022428952316819L, (long)var2_3);
                                            v3 /* !! */  = (int)var8_8;
                                            if (var2_3 >= 0L) {
                                                if (v3 /* !! */  != 0) break block18;
                                            }
                                            ** GOTO lbl53
                                        }
                                        catch (n9 v4) {
                                            throw m44.a("j", (Object)v4, (long)3115342378139535227L, (long)var2_3);
                                        }
                                        if (v2 /* !! */  != 0) break block19;
                                    }
                                    catch (n9 v5) {
                                        throw m44.a("j", (Object)v5, (long)3115342378139535227L, (long)var2_3);
                                    }
                                    var9_6.add(var13_11);
                                }
                                catch (n9 v6) {
                                    throw m44.a("j", (Object)v6, (long)3115342378139535227L, (long)var2_3);
                                }
                            }
                            ++var12_10;
                        }
                        v0 = var8_8;
                    }
                    if (v0 == false) continue;
                }
                if (var2_3 < 0L) break block20;
                v2 /* !! */  = var9_6.size();
            }
            try {
                v3 /* !! */  = ((CallSite)m44.a("t", (Object)this, (long)3356203625227725039L, (long)var2_3)).length;
lbl53:
                // 2 sources

                if (v2 /* !! */  < v3 /* !! */ ) {
                    m44.a("v", (Object)this, (sc[])var9_6.toArray(new sc[var9_6.size()]), (long)3356203625227725039L, (long)var2_3);
                }
            }
            catch (n9 v7) {
                throw m44.a("j", (Object)v7, (long)3115342378139535227L, (long)var2_3);
            }
        }
    }

    void w(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        df df2 = (df)objectArray[1];
        long l11 = (l10 = c ^ l10) ^ 0x876A00EEC75L;
        CallSite callSite = m44.a("r", (Object)this, (long)3870184694334206921L, (long)l10);
        CallSite callSite2 = m44.a("l", (long)3190199497419087117L, (long)l10);
        for (CallSite callSite3 : callSite) {
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l11;
            objectArray2[0] = df2;
            m44.a("s", (Object)callSite3, (Object)objectArray2, (long)3027046127514941428L, (long)l10);
            if (callSite2 != false) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean l(Object[] var1_1) {
        block26: {
            block27: {
                block28: {
                    var5_2 = (hf)var1_1[0];
                    var2_3 = (lqu)var1_1[1];
                    var3_4 = (Long)var1_1[2];
                    var6_5 = (PrintWriter)var1_1[3];
                    v0 = var3_4;
                    v1 = v0 ^ 138721227050887L;
                    var7_6 = v1 >>> 32;
                    var9_7 = (int)(v1 << 32 >>> 32);
                    var10_8 = v0 ^ 131438816045646L;
                    var12_9 = v0 ^ 30774151829103L;
                    var14_10 = v0 ^ 15711569148454L;
                    var16_11 = v0 ^ 99147324161282L;
                    var18_12 = v0 ^ 41473284262212L;
                    var20_13 = m44.a("h", (long)3105723213626104401L, (long)var3_4);
                    try {
                        v2 /* !! */  = m44.a("v", (Object)this, (long)3623315272531769502L, (long)var3_4);
                        if (var20_13 == false) break block26;
                        if (v2 /* !! */  == false) break block27;
                    }
                    catch (n9 v3) {
                        throw m44.a("h", (Object)v3, (long)3981605608750930689L, (long)var3_4);
                    }
                    var21_14 = 0;
                    var22_15 = true;
                    var23_16 = new ArrayList<CallSite>();
                    for (var24_17 = 0; var24_17 < ((CallSite)m44.a("v", (Object)this, (long)3668686838490772629L, (long)var3_4)).length; ++var24_17) {
                        block35: {
                            block34: {
                                block29: {
                                    block32: {
                                        block33: {
                                            block30: {
                                                block31: {
                                                    var25_18 = m44.a("v", (Object)this, (long)3668686838490772629L, (long)var3_4)[var24_17];
                                                    v4 = new Object[1];
                                                    v4[0] = var14_10;
                                                    var26_19 = m44.a("w", (Object)var25_18, (Object)v4, (long)2952095244864370531L, (long)var3_4);
                                                    try {
                                                        try {
                                                            v5 = new Object[2];
                                                            v5[1] = var26_19;
                                                            v5[0] = var12_9;
                                                            v6 /* !! */  = m44.a("w", (Object)var5_2, (Object)v5, (long)3276387524263984760L, (long)var3_4);
                                                            v7 = var20_13;
                                                            if (var3_4 > 0L) {
                                                                if (v7 == false) break block28;
                                                                v7 = var20_13;
                                                            }
                                                            if (v7 == false) break block29;
                                                        }
                                                        catch (n9 v8) {
                                                            throw m44.a("h", (Object)v8, (long)3981605608750930689L, (long)var3_4);
                                                        }
                                                        if (v6 /* !! */ ) {
                                                        }
                                                        ** GOTO lbl106
                                                    }
                                                    catch (n9 v9) {
                                                        throw m44.a("h", (Object)v9, (long)3981605608750930689L, (long)var3_4);
                                                    }
                                                    var23_16.add(var25_18);
                                                    var22_15 = false;
                                                    try {
                                                        try {
                                                            v10 = new StringBuilder().append((String)kr.b("m", (int)20505, (long)(3443891932632529549L ^ var3_4))).append((String)m44.a("w", (Object)this, (Object)new Object[0], (long)3989937957937176752L, (long)var3_4));
                                                            v11 /* !! */  = 26965;
                                                            if (var3_4 >= 0L) {
                                                                v12 = kr.b("m", (int)v11 /* !! */ , (long)(5818521630200169417L ^ var3_4));
                                                                if (var20_13 == false) break block30;
                                                                v10 = v10.append((String)v12);
                                                                v11 /* !! */  = (int)m44.a("w", (Object)this, (Object)new Object[0], (long)3049029394425736856L, (long)var3_4);
                                                            }
                                                            if (v11 /* !! */  == 0) break block31;
                                                        }
                                                        catch (n9 v13) {
                                                            throw m44.a("h", (Object)v13, (long)3981605608750930689L, (long)var3_4);
                                                        }
                                                        v12 = "";
                                                        break block30;
                                                    }
                                                    catch (n9 v14) {
                                                        throw m44.a("h", (Object)v14, (long)3981605608750930689L, (long)var3_4);
                                                    }
                                                }
                                                v15 = new Object[1];
                                                v15[0] = var16_11;
                                                v12 = "'" + (String)m44.a("w", (Object)this, (Object)v15, (long)3860856797382688832L, (long)var3_4) + (String)kr.b("m", (int)14485, (long)(8625405792307958284L ^ var3_4));
                                            }
                                            var27_20 /* !! */  = v10.append((String)v12).append((String)kr.b("m", (int)21022, (long)(1870878482707331201L ^ var3_4))).append(this.j(var10_8)).append((String)kr.b("m", (int)16673, (long)(9022369582524115897L ^ var3_4))).append((String)m44.a("w", (Object)var25_18, (long)var7_6, (int)var9_7, (long)3364575330467019554L, (long)var3_4)).append((String)kr.b("m", (int)5282, (long)(1056258481362861620L ^ var3_4))).toString();
                                            try {
                                                try {
                                                    v16 /* !! */  = (int)var20_13;
                                                    if (var3_4 >= 0L) {
                                                        if (v16 /* !! */  == 0) break block32;
                                                        if (m44.a("w", (Object)var2_3, (long)2893779901937840739L, (long)var3_4) == false) break block33;
                                                    }
                                                    ** GOTO lbl103
                                                }
                                                catch (n9 v17) {
                                                    throw m44.a("h", (Object)v17, (long)3981605608750930689L, (long)var3_4);
                                                }
                                                v18 = new Object[1];
                                                v18[0] = var18_12;
                                                m44.a("w", (Object)var2_3, (Object)v18, (long)3096412178331694126L, (long)var3_4).println("\t" + (String)var27_20 /* !! */ );
                                            }
                                            catch (n9 v19) {
                                                throw m44.a("h", (Object)v19, (long)3981605608750930689L, (long)var3_4);
                                            }
                                        }
                                        var6_5.println((String)var27_20 /* !! */ );
                                    }
                                    try {
                                        v16 /* !! */  = (int)var20_13;
lbl103:
                                        // 2 sources

                                        if (var3_4 > 0L) {
                                            if (v16 /* !! */  != 0) break block34;
                                        }
                                        ** GOTO lbl116
lbl106:
                                        // 2 sources

                                        v20 = true;
                                    }
                                    catch (n9 v21) {
                                        throw m44.a("h", (Object)v21, (long)3981605608750930689L, (long)var3_4);
                                    }
                                }
                                var21_14 = v20;
                            }
                            try {
                                try {
                                    v16 /* !! */  = var21_14;
lbl116:
                                    // 2 sources

                                    if (var20_13 == false) break block35;
                                    if (v16 /* !! */  == 0) continue;
                                }
                                catch (n9 v22) {
                                    throw m44.a("h", (Object)v22, (long)3981605608750930689L, (long)var3_4);
                                }
                                v16 /* !! */  = var23_16.size();
                            }
                            catch (n9 v23) {
                                throw m44.a("h", (Object)v23, (long)3981605608750930689L, (long)var3_4);
                            }
                        }
                        var27_20 /* !! */  = new sc[v16 /* !! */ ];
                        m44.a("t", (Object)this, (sc[])var23_16.toArray(var27_20 /* !! */ ), (long)3668686838490772629L, (long)var3_4);
                        if (var20_13 != false) continue;
                    }
                    v6 /* !! */  = var22_15;
                }
                return v6 /* !! */ ;
            }
            v2 /* !! */  = (CallSite)false;
        }
        return (boolean)v2 /* !! */ ;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void W(Object[] objectArray) {
        block4: {
            void var11_10;
            CallSite callSite;
            long l10;
            HashMap hashMap;
            HashMap hashMap2;
            long l11;
            block3: {
                CallSite callSite2;
                Object object;
                l11 = (Long)objectArray[0];
                int n10 = (Integer)objectArray[1];
                int n11 = (Integer)objectArray[2];
                hashMap2 = (HashMap)objectArray[3];
                hashMap = (HashMap)objectArray[4];
                l10 = l11 ^ 0x1B8AC0D7B171L;
                callSite = m44.a("n", (long)7658353343727016719L, (long)l11);
                try {
                    object = m44.a("p", (Object)this, (long)8293039031803492800L, (long)l11);
                    if (callSite == false) break block3;
                    if (object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)n92, (long)8511750725982034527L, (long)l11);
                }
                object = callSite2 = (Object)false;
            }
            while (var11_10 < ((CallSite)m44.a("p", (Object)this, (long)8338302806716642763L, (long)l11)).length) {
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = hashMap;
                objectArray2[1] = l10;
                objectArray2[0] = hashMap2;
                m44.a("q", (Object)m44.a("p", (Object)this, (long)8338302806716642763L, (long)l11)[var11_10], (Object)objectArray2, (long)7615046327392255686L, (long)l11);
                ++var11_10;
                if (callSite != false) continue;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void s(Object[] objectArray) {
        block4: {
            void var11_10;
            CallSite callSite;
            long l10;
            Set set;
            Set set2;
            long l11;
            Set set3;
            Set set4;
            block3: {
                CallSite callSite2;
                Object object;
                set4 = (Set)objectArray[0];
                set3 = (Set)objectArray[1];
                l11 = (Long)objectArray[2];
                set2 = (Set)objectArray[3];
                set = (Set)objectArray[4];
                l10 = l11 ^ 0x5F50B8C925DDL;
                callSite = m44.a("h", (long)313498970671567038L, (long)l11);
                try {
                    object = m44.a("v", (Object)this, (long)382965665269731206L, (long)l11);
                    if (callSite != false) break block3;
                    if (object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)25203013826079769L, (long)l11);
                }
                object = callSite2 = (Object)false;
            }
            while (var11_10 < ((CallSite)m44.a("v", (Object)this, (long)428334583381394317L, (long)l11)).length) {
                Object[] objectArray2 = new Object[5];
                objectArray2[4] = set;
                objectArray2[3] = set2;
                objectArray2[2] = l10;
                objectArray2[1] = set3;
                objectArray2[0] = set4;
                m44.a("w", (Object)m44.a("v", (Object)this, (long)428334583381394317L, (long)l11)[var11_10], (Object)objectArray2, (long)1950045513514532043L, (long)l11);
                ++var11_10;
                if (callSite == false) continue;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void z(gu gu2, long l10) {
        block4: {
            void var9_7;
            CallSite callSite;
            long l11;
            block3: {
                CallSite callSite2;
                Object object;
                long l12 = l10;
                long l13 = l12 ^ 0x66FDF08525FDL;
                l11 = l12 ^ 0L;
                CallSite callSite3 = m44.a("h", (long)5618762033536375070L, (long)l10);
                gu2.K(this.b, this, l13, this.H());
                callSite = callSite3;
                try {
                    object = m44.a("v", (Object)this, (long)5544088189886891558L, (long)l10);
                    if (callSite != false) break block3;
                    if (object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)5330456466231403961L, (long)l10);
                }
                object = callSite2 = (Object)false;
            }
            while (var9_7 < ((CallSite)m44.a("v", (Object)this, (long)5499422787409922605L, (long)l10)).length) {
                m44.a("w", (Object)m44.a("v", (Object)this, (long)5499422787409922605L, (long)l10)[var9_7], (Object)gu2, (long)l11, (long)6299859519162172061L, (long)l10);
                ++var9_7;
                if (callSite == false) continue;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void z(Object[] objectArray) {
        block4: {
            void var8_7;
            CallSite callSite;
            long l10;
            long l11;
            Set set;
            block3: {
                CallSite callSite2;
                Object object;
                set = (Set)objectArray[0];
                l11 = (Long)objectArray[1];
                l10 = l11 ^ 0x1E0A187EA644L;
                callSite = m44.a("n", (long)-7259939807516176424L, (long)l11);
                try {
                    object = m44.a("p", (Object)this, (long)-7334437805944123168L, (long)l11);
                    if (callSite != false) break block3;
                    if (object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)n92, (long)-6971628764462779521L, (long)l11);
                }
                object = callSite2 = (Object)false;
            }
            while (var8_7 < ((CallSite)m44.a("p", (Object)this, (long)-7307223873774871317L, (long)l11)).length) {
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l10;
                objectArray2[0] = set;
                m44.a("q", (Object)m44.a("p", (Object)this, (long)-7307223873774871317L, (long)l11)[var8_7], (Object)objectArray2, (long)-7141391430891294845L, (long)l11);
                ++var8_7;
                if (callSite == false) continue;
            }
        }
    }

    boolean T(Object[] objectArray) {
        boolean bl2;
        block2: {
            block3: {
                int n10 = (Integer)objectArray[0];
                int n11 = (Integer)objectArray[1];
                int n12 = (Integer)objectArray[2];
                long l10 = ((long)n10 << 48 | (long)n11 << 32 >>> 16 | (long)n12 << 48 >>> 48) ^ c;
                CallSite callSite = m44.a("n", (long)-8797871488038865745L, (long)l10);
                try {
                    bl2 = ((CallSite)m44.a("p", (Object)this, (long)-7199044078386996629L, (long)l10)).length;
                    if (callSite == false) break block2;
                    if (bl2) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)n92, (long)-7368010465601587713L, (long)l10);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void K(Object[] objectArray) {
        block4: {
            void var7_6;
            CallSite callSite;
            long l10;
            long l11;
            block3: {
                CallSite callSite2;
                Object object;
                l11 = (Long)objectArray[0];
                l10 = l11 ^ 0x70616B9E34FL;
                callSite = m44.a("i", (long)3278805135175146696L, (long)l11);
                try {
                    object = m44.a("w", (Object)this, (long)3805967349933800967L, (long)l11);
                    if (callSite == false) break block3;
                    if (object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("i", (Object)n92, (long)3591787950838668696L, (long)l11);
                }
                object = callSite2 = (Object)false;
            }
            while (var7_6 < ((CallSite)m44.a("w", (Object)this, (long)3778751075661492748L, (long)l11)).length) {
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l10;
                m44.a("v", (Object)m44.a("w", (Object)this, (long)3778751075661492748L, (long)l11)[var7_6], (Object)objectArray2, (long)3153642153038371189L, (long)l11);
                ++var7_6;
                if (callSite != false) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected void N(Object[] var1_1) {
        block15: {
            block14: {
                var2_2 = (DataOutputStream)var1_1[0];
                var6_3 = (Map)var1_1[1];
                var3_4 = (Long)var1_1[2];
                var5_5 = (lqu)var1_1[3];
                v0 = var3_4;
                var7_6 = v0 ^ 0L;
                var9_7 = v0 ^ 93420344099345L;
                v1 = m44.a("k", (long)1083949478671047661L, (long)var3_4);
                v2 = new Object[4];
                v2[3] = var5_5;
                v2[2] = var7_6;
                v2[1] = var6_3;
                v2[0] = var2_2;
                super.N(v2);
                var11_8 = v1;
                try {
                    try {
                        v3 /* !! */  = m44.a("u", (Object)this, (long)1009829788873835733L, (long)var3_4);
                        if (var11_8 != false) break block14;
                        if (v3 /* !! */  != false) {
                        }
                        ** GOTO lbl57
                    }
                    catch (n9 v4) {
                        throw m44.a("k", (Object)v4, (long)795652690278573898L, (long)var3_4);
                    }
                    var2_2.writeShort(((CallSite)m44.a("u", (Object)this, (long)1054673411819342046L, (long)var3_4)).length);
                    v3 /* !! */  = (reference)false;
                }
                catch (n9 v5) {
                    throw m44.a("k", (Object)v5, (long)795652690278573898L, (long)var3_4);
                }
            }
            var12_9 = v3 /* !! */ ;
            block8: while (var12_9 < ((CallSite)m44.a("u", (Object)this, (long)1054673411819342046L, (long)var3_4)).length) {
                try {
                    v6 = new Object[4];
                    v6[3] = var5_5;
                    v6[2] = var9_7;
                    v6[1] = var6_3;
                    v6[0] = var2_2;
                    m44.a("t", (Object)m44.a("u", (Object)this, (long)1054673411819342046L, (long)var3_4)[var12_9], (Object)v6, (long)1494634890930276146L, (long)var3_4);
                    ++var12_9;
                    do {
                        v7 = var11_8;
                        if (var3_4 > 0L) {
                            if (v7 != false) break block15;
                            v7 = var11_8;
                        }
                        if (v7 == false) continue block8;
                    } while (var3_4 < 0L);
                    break;
                }
                catch (n9 v8) {
                    throw m44.a("k", (Object)v8, (long)795652690278573898L, (long)var3_4);
                }
            }
            try {
                if (var3_4 <= 0L || var11_8 == false) break block15;
lbl57:
                // 2 sources

                var2_2.write((byte[])m44.a("u", (Object)this, (long)988812052272789927L, (long)var3_4));
            }
            catch (n9 v9) {
                throw m44.a("k", (Object)v9, (long)795652690278573898L, (long)var3_4);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected void c(Object[] var1_1) {
        block15: {
            block14: {
                var2_2 = (Long)var1_1[0];
                var4_3 = (DataOutputStream)var1_1[1];
                v0 = var2_2;
                var5_4 = v0 ^ 0L;
                var7_5 = v0 ^ 138122824747950L;
                v1 = m44.a("i", (long)1272493964096652623L, (long)var2_2);
                v2 = new Object[2];
                v2[1] = var4_3;
                v2[0] = var5_4;
                super.c(v2);
                var9_6 = v1;
                try {
                    try {
                        v3 /* !! */  = m44.a("w", (Object)this, (long)1198408428474194551L, (long)var2_2);
                        if (var9_6 != false) break block14;
                        if (v3 /* !! */  != false) {
                        }
                        ** GOTO lbl51
                    }
                    catch (n9 v4) {
                        throw m44.a("i", (Object)v4, (long)1560639255972444648L, (long)var2_2);
                    }
                    var4_3.writeShort(((CallSite)m44.a("w", (Object)this, (long)1153144890887870076L, (long)var2_2)).length);
                    v3 /* !! */  = (reference)false;
                }
                catch (n9 v5) {
                    throw m44.a("i", (Object)v5, (long)1560639255972444648L, (long)var2_2);
                }
            }
            var10_7 = v3 /* !! */ ;
            block8: while (var10_7 < ((CallSite)m44.a("w", (Object)this, (long)1153144890887870076L, (long)var2_2)).length) {
                try {
                    v6 = new Object[2];
                    v6[1] = var7_5;
                    v6[0] = var4_3;
                    m44.a("v", (Object)m44.a("w", (Object)this, (long)1153144890887870076L, (long)var2_2)[var10_7], (Object)v6, (long)1081845137742568784L, (long)var2_2);
                    ++var10_7;
                    do {
                        v7 = var9_6;
                        if (var2_2 >= 0L) {
                            if (v7 != false) break block15;
                            v7 = var9_6;
                        }
                        if (v7 == false) continue block8;
                    } while (var2_2 <= 0L);
                    break;
                }
                catch (n9 v8) {
                    throw m44.a("i", (Object)v8, (long)1560639255972444648L, (long)var2_2);
                }
            }
            try {
                if (var2_2 < 0L || var9_6 == false) break block15;
lbl51:
                // 2 sources

                var4_3.write((byte[])m44.a("w", (Object)this, (long)1376640891870979845L, (long)var2_2));
            }
            catch (n9 v9) {
                throw m44.a("i", (Object)v9, (long)1560639255972444648L, (long)var2_2);
            }
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    int g(int var1_1, byte var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[DOLOOP]], but top level block is 4[SIMPLE_IF_TAKEN]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    kr(_4 var1_1, int var2_2, long var3_3, String var5_4, h1 var6_5, l6q var7_6, l6q var8_7, PrintWriter var9_8, String var10_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[DOLOOP]], but top level block is 3[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Object[] objectArray) {
        block4: {
            void var11_10;
            CallSite callSite;
            long l10;
            lqu lqu2;
            l6z l6z2;
            _6 _62;
            long l11;
            block3: {
                CallSite callSite2;
                Object object;
                l11 = (Long)objectArray[0];
                _u _u2 = (_u)objectArray[1];
                _62 = (_6)objectArray[2];
                l6z2 = (l6z)objectArray[3];
                lqu2 = (lqu)objectArray[4];
                l10 = l11 ^ 0x1217CFBB2F1DL;
                callSite = m44.a("o", (long)6212413212200665809L, (long)l11);
                try {
                    object = m44.a("q", (Object)this, (long)6286946463132720617L, (long)l11);
                    if (callSite != false) break block3;
                    if (object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)n92, (long)5924101855547309686L, (long)l11);
                }
                object = callSite2 = (Object)false;
            }
            while (var11_10 < ((CallSite)m44.a("q", (Object)this, (long)6313740228570436066L, (long)l11)).length) {
                Object[] objectArray2 = new Object[4];
                objectArray2[3] = lqu2;
                objectArray2[2] = l6z2;
                objectArray2[1] = l10;
                objectArray2[0] = _62;
                m44.a("p", (Object)m44.a("q", (Object)this, (long)6313740228570436066L, (long)l11)[var11_10], (Object)objectArray2, (long)5320629923711078752L, (long)l11);
                ++var11_10;
                if (callSite == false) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                kr.c = prr.a(6514098993393085207L, 5431653922940573743L, MethodHandles.lookup().lookupClass()).a(91811879635002L);
                kr.j = new HashMap<K, V>(13);
                var0 = kr.c ^ 112748237340241L;
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
                var9_3 = new String[13];
                var7_4 = 0;
                var6_5 = "\u00d9X\u00bc\u00ad\u00d7\u0019{\u0092\u0092\u00b2\u0004\u007f\u009fc\u00e3M\u00b6@\u00aaG\u00da2l\u0010\u00f9,\u0001\u00ab\u008c\u0098\u008eA\u00b8(\u00de\u009d\u009ff\u00c47\u0010rm\u00f6M?\u00f6X\r\u0000BE^mr\u00c5\u0000\u0018\u007f\u0013po\u00b1\u0081\u00f8Ni<\u00a5\u00d3Q\u008b#\u009d\u00179\u008d\u00bd\u00a0'K\u00ac\u0010\u00df\u00ba\u00c1\u0016I\u00da\u00d3\u00e5\u001e\u0088r@Kg\u00fd\u00fa\u0010#qf]\u00d7x\u008e\u0014gH\u0095\u00f1\u0002\u0005\u00ce\u0091\u0010\u00e5\u00fc\u0080X>\u00da\u00e8\r\u00dd\u00bb\u001aX\u00dc:*\u00c4X\u00cbV$\u00c7\u00fd\u00c0\u009d\u0010\u00d8\u00af\u00fa;}d1d\u009a\u00a7#\u001b\u0088\u0080SC\u00b1\u00f8\u00bd\u00e8\u00c1\u001fKU\u0080\u00ad\u00c8\u00b9r3\u0083\r\u00b3\u0006\u0082#K\u00c0Sb\fU\u0013\u00c1:|\u001c\u00f1\u0014\u00b6\u00efx\u00e8\u00aenS:\u00b6\u00b7d\u00c8\u0019+\u008a&\u00d3\u00d2\u00b5\u00eb\u00e3\u00c6<\u00c1\u0093\u009f\u00b3Cn\u00fc5\u0010\u00c4\u00e1\u0082\u0081\u008d\u00db\u00dbE\u00a1:\u00f7\t\u00e7a\u0016\u00ec\u0010cg>og\u008b#\u00c4]y\u00ad1\u00a1<\u00a2\u00ab\u0010O\u0091\u00916EX\u00d3\u00c6\u00bbE\u007f$\u0011\n\u0013\u001b(\u00a0\u0086\u00b57\u0098\u00d5\u00d9\u00ae\u008b \u008e\u001c\u00899\u0017\u001c\u00c4\u001eEl\u001c\u00d0f\u0016\u0004\u0084\u0006\u00c7B\u0082\u008b\u00c8\u0002N\u00a8\u00ae\u0092\u0084\u00cc'";
                var8_6 = "\u00d9X\u00bc\u00ad\u00d7\u0019{\u0092\u0092\u00b2\u0004\u007f\u009fc\u00e3M\u00b6@\u00aaG\u00da2l\u0010\u00f9,\u0001\u00ab\u008c\u0098\u008eA\u00b8(\u00de\u009d\u009ff\u00c47\u0010rm\u00f6M?\u00f6X\r\u0000BE^mr\u00c5\u0000\u0018\u007f\u0013po\u00b1\u0081\u00f8Ni<\u00a5\u00d3Q\u008b#\u009d\u00179\u008d\u00bd\u00a0'K\u00ac\u0010\u00df\u00ba\u00c1\u0016I\u00da\u00d3\u00e5\u001e\u0088r@Kg\u00fd\u00fa\u0010#qf]\u00d7x\u008e\u0014gH\u0095\u00f1\u0002\u0005\u00ce\u0091\u0010\u00e5\u00fc\u0080X>\u00da\u00e8\r\u00dd\u00bb\u001aX\u00dc:*\u00c4X\u00cbV$\u00c7\u00fd\u00c0\u009d\u0010\u00d8\u00af\u00fa;}d1d\u009a\u00a7#\u001b\u0088\u0080SC\u00b1\u00f8\u00bd\u00e8\u00c1\u001fKU\u0080\u00ad\u00c8\u00b9r3\u0083\r\u00b3\u0006\u0082#K\u00c0Sb\fU\u0013\u00c1:|\u001c\u00f1\u0014\u00b6\u00efx\u00e8\u00aenS:\u00b6\u00b7d\u00c8\u0019+\u008a&\u00d3\u00d2\u00b5\u00eb\u00e3\u00c6<\u00c1\u0093\u009f\u00b3Cn\u00fc5\u0010\u00c4\u00e1\u0082\u0081\u008d\u00db\u00dbE\u00a1:\u00f7\t\u00e7a\u0016\u00ec\u0010cg>og\u008b#\u00c4]y\u00ad1\u00a1<\u00a2\u00ab\u0010O\u0091\u00916EX\u00d3\u00c6\u00bbE\u007f$\u0011\n\u0013\u001b(\u00a0\u0086\u00b57\u0098\u00d5\u00d9\u00ae\u008b \u008e\u001c\u00899\u0017\u001c\u00c4\u001eEl\u001c\u00d0f\u0016\u0004\u0084\u0006\u00c7B\u0082\u008b\u00c8\u0002N\u00a8\u00ae\u0092\u0084\u00cc'".length();
                var5_7 = 40;
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
                    var9_3[var7_4++] = kr.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "oH\u00cb\u00c4o\u009a,\u001d\u00ec\u0014#\u00car\u009bL\u00d5\u00ee\u00c9&\u0097U\u0085\u009cCl\u00eb,+\u0086\u009d\u00ec\u00f5\u0010M\u00c3Ar2Qo!\n\u00cf\u0006x\u0082fL\u00b8";
                    var8_6 = "oH\u00cb\u00c4o\u009a,\u001d\u00ec\u0014#\u00car\u009bL\u00d5\u00ee\u00c9&\u0097U\u0085\u009cCl\u00eb,+\u0086\u009d\u00ec\u00f5\u0010M\u00c3Ar2Qo!\n\u00cf\u0006x\u0082fL\u00b8".length();
                    var5_7 = 32;
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
                    var9_3[var7_4++] = kr.c(var10_9).intern();
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
        kr.g = var9_3;
        kr.i = new String[13];
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String c(byte[] byArray) {
        int n10 = 0;
        int n11 = byArray.length;
        char[] cArray = new char[n11];
        for (int i10 = 0; i10 < n11; ++i10) {
            char c10;
            int n12 = 0xFF & byArray[i10];
            if (n12 < 192) {
                cArray[n10++] = (char)n12;
                continue;
            }
            if (n12 < 224) {
                c10 = (char)((char)(n12 & 0x1F) << 6);
                n12 = byArray[++i10];
                c10 = (char)(c10 | (char)(n12 & 0x3F));
                cArray[n10++] = c10;
                continue;
            }
            if (i10 >= n11 - 2) continue;
            c10 = (char)((char)(n12 & 0xF) << 12);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F) << 6);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F));
            cArray[n10++] = c10;
        }
        return new String(cArray, 0, n10);
    }

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x5299;
        if (i[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])j.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/kr", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = g[n11].getBytes("ISO-8859-1");
            kr.i[n11] = kr.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return i[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = kr.b(n10, l10);
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
            throw new RuntimeException("com/zelix/kr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(kr.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

