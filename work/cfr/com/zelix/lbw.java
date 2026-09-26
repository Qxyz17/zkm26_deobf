/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.bn;
import com.zelix.df;
import com.zelix.ee;
import com.zelix.hr;
import com.zelix.l62;
import com.zelix.lb6;
import com.zelix.lbk;
import com.zelix.loe;
import com.zelix.m44;
import com.zelix.n0;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sz;
import com.zelix.u5;
import com.zelix.ui;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lbw {
    private final boolean x;
    private final Random z;
    private final n0 y;
    private final ee l;
    private static final long a = prr.a(6311893171325124999L, -7754800316800425343L, MethodHandles.lookup().lookupClass()).a(143824884353707L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public u5 s(Object[] objectArray) {
        l62 l622 = (l62)objectArray[0];
        String string = (String)objectArray[1];
        bn bn2 = (bn)objectArray[2];
        df df2 = (df)objectArray[3];
        boolean bl2 = (Boolean)objectArray[4];
        Map map = (Map)objectArray[5];
        Map map2 = (Map)objectArray[6];
        long l10 = (Long)objectArray[7];
        boolean bl3 = (Boolean)objectArray[8];
        boolean bl4 = (Boolean)objectArray[9];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x1D7D12E8695AL;
        long l13 = l11 ^ 0x7A7A0B984E2FL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l13;
        Object[] objectArray3 = new Object[10];
        objectArray3[9] = bl4;
        objectArray3[8] = bl3;
        objectArray3[7] = map2;
        objectArray3[6] = map;
        objectArray3[5] = (boolean)m44.a("s", (Object)l622, (Object)objectArray2, (long)3724780201137187764L, (long)l10);
        objectArray3[4] = df2;
        objectArray3[3] = l12;
        objectArray3[2] = bn2;
        objectArray3[1] = string;
        objectArray3[0] = l622;
        return m44.a("s", (Object)this, (Object)objectArray3, (long)3269503045991950794L, (long)l10);
    }

    boolean J(Object[] objectArray) {
        Object object;
        block12: {
            block13: {
                CallSite callSite;
                CallSite callSite2;
                long l10;
                u5 u52;
                long l11;
                bn bn2;
                block10: {
                    long l12;
                    block11: {
                        bn2 = (bn)objectArray[0];
                        l11 = (Long)objectArray[1];
                        u52 = (u5)objectArray[2];
                        long l13 = l11 = a ^ l11;
                        long l14 = l13 ^ 0x79A8714FA441L;
                        l12 = l13 ^ 0xA08178BAA8FL;
                        l10 = l13 ^ 0x31113ED4EBEL;
                        callSite2 = m44.a("n", (long)-8672126423841169651L, (long)l11);
                        try {
                            try {
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l14;
                                callSite = m44.a("q", (Object)bn2, (Object)objectArray2, (long)-7019259531749932860L, (long)l11);
                                if (callSite2 == null) break block10;
                                if (callSite != false) break block11;
                            }
                            catch (n9 n92) {
                                throw m44.a("n", (Object)n92, (long)-7218441435605911686L, (long)l11);
                            }
                            return true;
                        }
                        catch (n9 n93) {
                            throw m44.a("n", (Object)n93, (long)-7218441435605911686L, (long)l11);
                        }
                    }
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l12;
                    callSite = m44.a("q", (Object)bn2, (Object)objectArray3, (long)-7011141993682511938L, (long)l11);
                }
                CallSite callSite3 = callSite;
                try {
                    object = callSite3;
                    if (callSite2 == null) break block12;
                    if (object <= 0) break block13;
                }
                catch (n9 n94) {
                    throw m44.a("n", (Object)n94, (long)-7218441435605911686L, (long)l11);
                }
                CallSite callSite4 = m44.a("q", (Object)u52, (Object)new Object[0], (long)-8956617900441864885L, (long)l11);
                CallSite callSite5 = callSite4[((CallSite)callSite4).length - 1];
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = bn2.V();
                objectArray4[0] = l10;
                CallSite callSite6 = m44.a("n", (Object)objectArray4, (long)-6940092220623026265L, (long)l11);
                try {
                    try {
                        object = ((ui)((Object)callSite5)).R();
                        if (callSite2 == null) break block12;
                        if (object < callSite6.size() + ((CallSite)callSite4).length - callSite3) break block13;
                    }
                    catch (n9 n95) {
                        throw m44.a("n", (Object)n95, (long)-7218441435605911686L, (long)l11);
                    }
                    return false;
                }
                catch (n9 n96) {
                    throw m44.a("n", (Object)n96, (long)-7218441435605911686L, (long)l11);
                }
            }
            object = true;
        }
        return (boolean)object;
    }

    public lbw(hr hr2, n0 n02, long l10, boolean bl2, Random random) {
        long l11 = (l10 = a ^ l10) ^ 0x5A18E1FACE7FL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        this.l = m44.a("r", (Object)n02, (Object)objectArray, (long)5256077405033797980L, (long)l10);
        this.y = n02;
        this.x = bl2;
        this.z = random;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    final boolean m(Object[] var1_1) {
        block69: {
            block70: {
                block67: {
                    block68: {
                        block65: {
                            block66: {
                                block63: {
                                    block64: {
                                        block61: {
                                            block62: {
                                                block59: {
                                                    block60: {
                                                        block57: {
                                                            block58: {
                                                                block55: {
                                                                    block56: {
                                                                        block53: {
                                                                            block54: {
                                                                                var13_2 = (l62)var1_1[0];
                                                                                var4_3 = (bn)var1_1[1];
                                                                                var12_4 = (u5)var1_1[2];
                                                                                var9_5 = (loe)var1_1[3];
                                                                                var10_6 = (loe)var1_1[4];
                                                                                var5_7 = (Long)var1_1[5];
                                                                                var8_8 = (df)var1_1[6];
                                                                                var2_9 = (Map)var1_1[7];
                                                                                var3_10 = (Map)var1_1[8];
                                                                                var11_11 = (Boolean)var1_1[9];
                                                                                var7_12 = (Boolean)var1_1[10];
                                                                                v0 = var5_7 = lbw.a ^ var5_7;
                                                                                var14_13 = v0 ^ 79245566757537L;
                                                                                v1 = v0 ^ 49583059958822L;
                                                                                var16_14 = (int)(v1 >>> 48);
                                                                                var17_15 = (int)(v1 << 16 >>> 32);
                                                                                var18_16 = (int)(v1 << 48 >>> 48);
                                                                                var19_17 = v0 ^ 44567398693799L;
                                                                                v2 = v0 ^ 2979897651226L;
                                                                                var21_18 = (int)(v2 >>> 32);
                                                                                var22_19 = (int)(v2 << 32 >>> 48);
                                                                                var23_20 = (int)(v2 << 48 >>> 48);
                                                                                var24_21 = v0 ^ 37043814561272L;
                                                                                var26_22 = v0 ^ 57242227118197L;
                                                                                var28_23 = v0 ^ 132998436713530L;
                                                                                var30_24 = v0 ^ 119764503175617L;
                                                                                var33_25 = var9_5.M(var28_23);
                                                                                var32_26 = m44.a("i", (long)4600712791753140082L, (long)var5_7);
                                                                                try {
                                                                                    v3 /* !! */  = var11_11 != false ? var9_5 : var33_25;
                                                                                }
                                                                                catch (n9 v4) {
                                                                                    throw m44.a("i", (Object)v4, (long)2570879033749147397L, (long)var5_7);
                                                                                }
                                                                                var34_27 /* !! */  = v3 /* !! */ ;
                                                                                try {
                                                                                    try {
                                                                                        v5 /* !! */  = m44.a("v", (Object)var9_5, (Object)new Object[0], (long)2444042485082130550L, (long)var5_7).equals(m44.a("v", (Object)var10_6, (Object)new Object[0], (long)2444042485082130550L, (long)var5_7));
                                                                                        v6 = var32_26;
                                                                                        if (var5_7 > 0L) {
                                                                                            if (v6 == null) break block53;
                                                                                            if (!v5 /* !! */ ) break block54;
                                                                                        }
                                                                                        ** GOTO lbl59
                                                                                    }
                                                                                    catch (n9 v7) {
                                                                                        throw m44.a("i", (Object)v7, (long)2570879033749147397L, (long)var5_7);
                                                                                    }
                                                                                    return false;
                                                                                }
                                                                                catch (n9 v8) {
                                                                                    throw m44.a("i", (Object)v8, (long)2570879033749147397L, (long)var5_7);
                                                                                }
                                                                            }
                                                                            v5 /* !! */  = var11_11;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    v6 = var32_26;
lbl59:
                                                                                    // 2 sources

                                                                                    if (var5_7 >= 0L) {
                                                                                        if (v6 == null) break block55;
                                                                                        if (!v5 /* !! */ ) break block56;
                                                                                    }
                                                                                    ** GOTO lbl82
                                                                                }
                                                                                catch (n9 v9) {
                                                                                    throw m44.a("i", (Object)v9, (long)2570879033749147397L, (long)var5_7);
                                                                                }
                                                                                v10 = var2_9.containsKey(var9_5);
                                                                                if (var32_26 == null) break block57;
                                                                            }
                                                                            catch (n9 v11) {
                                                                                throw m44.a("i", (Object)v11, (long)2570879033749147397L, (long)var5_7);
                                                                            }
                                                                            if (v10) break block58;
                                                                        }
                                                                        catch (n9 v12) {
                                                                            throw m44.a("i", (Object)v12, (long)2570879033749147397L, (long)var5_7);
                                                                        }
                                                                    }
                                                                    v5 /* !! */  = var11_11;
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v6 = var32_26;
lbl82:
                                                                            // 2 sources

                                                                            if (v6 == null) break block59;
                                                                            if (v5 /* !! */ ) break block60;
                                                                        }
                                                                        catch (n9 v13) {
                                                                            throw m44.a("i", (Object)v13, (long)2570879033749147397L, (long)var5_7);
                                                                        }
                                                                        v5 /* !! */  = var3_10.containsKey(var9_5.M(var28_23));
                                                                        v14 = var32_26;
                                                                        if (var5_7 > 0L) {
                                                                            if (v14 == null) break block59;
                                                                        }
                                                                        ** GOTO lbl114
                                                                    }
                                                                    catch (n9 v15) {
                                                                        throw m44.a("i", (Object)v15, (long)2570879033749147397L, (long)var5_7);
                                                                    }
                                                                    if (!v5 /* !! */ ) break block60;
                                                                }
                                                                catch (n9 v16) {
                                                                    throw m44.a("i", (Object)v16, (long)2570879033749147397L, (long)var5_7);
                                                                }
                                                            }
                                                            v10 = false;
                                                        }
                                                        return v10;
                                                    }
                                                    v17 = new Object[1];
                                                    v17[0] = var19_17;
                                                    v5 /* !! */  = m44.a("v", (Object)var10_6, (Object)v17, (long)2567281072787760452L, (long)var5_7);
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v14 = var32_26;
lbl114:
                                                                // 2 sources

                                                                if (v14 == null) break block61;
                                                                if (v5 /* !! */ ) break block62;
                                                            }
                                                            catch (n9 v18) {
                                                                throw m44.a("i", (Object)v18, (long)2570879033749147397L, (long)var5_7);
                                                            }
                                                            v5 /* !! */  = var8_8.A((char)var16_14, var17_15, var18_16, var34_27 /* !! */ );
                                                            v19 = var32_26;
                                                            if (var5_7 >= 0L) {
                                                                if (v19 == null) break block61;
                                                            }
                                                            ** GOTO lbl144
                                                        }
                                                        catch (n9 v20) {
                                                            throw m44.a("i", (Object)v20, (long)2570879033749147397L, (long)var5_7);
                                                        }
                                                        if (!v5 /* !! */ ) break block62;
                                                    }
                                                    catch (n9 v21) {
                                                        throw m44.a("i", (Object)v21, (long)2570879033749147397L, (long)var5_7);
                                                    }
                                                    return false;
                                                }
                                                catch (n9 v22) {
                                                    throw m44.a("i", (Object)v22, (long)2570879033749147397L, (long)var5_7);
                                                }
                                            }
                                            v23 = new Object[2];
                                            v23[1] = var9_5;
                                            v23[0] = var26_22;
                                            v5 /* !! */  = m44.a("v", (Object)m44.a("w", (Object)this, (long)4100026398958200811L, (long)var5_7), (Object)v23, (long)2554736533339243985L, (long)var5_7);
                                        }
                                        try {
                                            try {
                                                v19 = var32_26;
lbl144:
                                                // 2 sources

                                                if (var5_7 >= 0L) {
                                                    if (v19 == null) break block63;
                                                    if (!v5 /* !! */ ) break block64;
                                                }
                                                ** GOTO lbl166
                                            }
                                            catch (n9 v24) {
                                                throw m44.a("i", (Object)v24, (long)2570879033749147397L, (long)var5_7);
                                            }
                                            return false;
                                        }
                                        catch (n9 v25) {
                                            throw m44.a("i", (Object)v25, (long)2570879033749147397L, (long)var5_7);
                                        }
                                    }
                                    v26 = new Object[4];
                                    v26[3] = var10_6;
                                    v26[2] = var9_5;
                                    v26[1] = var13_2;
                                    v26[0] = var30_24;
                                    v5 /* !! */  = m44.a("v", (Object)m44.a("w", (Object)this, (long)4100026398958200811L, (long)var5_7), (Object)v26, (long)4587948710019069004L, (long)var5_7);
                                }
                                try {
                                    try {
                                        v19 = var32_26;
lbl166:
                                        // 2 sources

                                        if (var5_7 >= 0L) {
                                            if (v19 == null) break block65;
                                            if (!v5 /* !! */ ) break block66;
                                        }
                                        ** GOTO lbl184
                                    }
                                    catch (n9 v27) {
                                        throw m44.a("i", (Object)v27, (long)2570879033749147397L, (long)var5_7);
                                    }
                                    return false;
                                }
                                catch (n9 v28) {
                                    throw m44.a("i", (Object)v28, (long)2570879033749147397L, (long)var5_7);
                                }
                            }
                            v5 /* !! */  = var7_12;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        v19 = var32_26;
lbl184:
                                        // 2 sources

                                        if (v19 == null) break block67;
                                        if (!v5 /* !! */ ) break block68;
                                    }
                                    catch (n9 v29) {
                                        throw m44.a("i", (Object)v29, (long)2570879033749147397L, (long)var5_7);
                                    }
                                    v30 = new Object[6];
                                    v30[5] = new sz(var21_18, (short)var22_19, (char)var23_20);
                                    v30[4] = true;
                                    v30[3] = var10_6;
                                    v30[2] = var9_5;
                                    v30[1] = var13_2;
                                    v30[0] = var14_13;
                                    v5 /* !! */  = m44.a("v", (Object)m44.a("w", (Object)this, (long)4100026398958200811L, (long)var5_7), (Object)v30, (long)4173231563654065215L, (long)var5_7);
                                    v31 = var32_26;
                                    if (var5_7 >= 0L) {
                                        if (v31 == null) break block67;
                                    }
                                    ** GOTO lbl223
                                }
                                catch (n9 v32) {
                                    throw m44.a("i", (Object)v32, (long)2570879033749147397L, (long)var5_7);
                                }
                                if (v5 /* !! */ ) break block68;
                            }
                            catch (n9 v33) {
                                throw m44.a("i", (Object)v33, (long)2570879033749147397L, (long)var5_7);
                            }
                            return false;
                        }
                        catch (n9 v34) {
                            throw m44.a("i", (Object)v34, (long)2570879033749147397L, (long)var5_7);
                        }
                    }
                    v35 = new Object[3];
                    v35[2] = var12_4;
                    v35[1] = var24_21;
                    v35[0] = var4_3;
                    v5 /* !! */  = m44.a("v", (Object)this, (Object)v35, (long)4429628985238899940L, (long)var5_7);
                }
                try {
                    try {
                        v31 = var32_26;
lbl223:
                        // 2 sources

                        if (v31 == null) break block69;
                        if (v5 /* !! */ ) break block70;
                    }
                    catch (n9 v36) {
                        throw m44.a("i", (Object)v36, (long)2570879033749147397L, (long)var5_7);
                    }
                    return false;
                }
                catch (n9 v37) {
                    throw m44.a("i", (Object)v37, (long)2570879033749147397L, (long)var5_7);
                }
            }
            v5 /* !! */  = true;
        }
        return v5 /* !! */ ;
    }

    /*
     * Exception decompiling
     */
    private u5 A(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:383)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:65)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
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

    public u5 c(Object[] objectArray) {
        l62 l622 = (l62)objectArray[0];
        String string = (String)objectArray[1];
        bn bn2 = (bn)objectArray[2];
        df df2 = (df)objectArray[3];
        Map map = (Map)objectArray[4];
        Map map2 = (Map)objectArray[5];
        boolean bl2 = (Boolean)objectArray[6];
        boolean bl3 = (Boolean)objectArray[7];
        long l10 = (Long)objectArray[8];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x1D58C736AB95L;
        long l13 = l11 ^ 0x7A5FDE468CE0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l13;
        Object[] objectArray3 = new Object[10];
        objectArray3[9] = bl3;
        objectArray3[8] = bl2;
        objectArray3[7] = map2;
        objectArray3[6] = map;
        objectArray3[5] = (boolean)m44.a("t", (Object)l622, (Object)objectArray2, (long)-1045376080133854853L, (long)l10);
        objectArray3[4] = df2;
        objectArray3[3] = l12;
        objectArray3[2] = bn2;
        objectArray3[1] = string;
        objectArray3[0] = l622;
        return m44.a("t", (Object)this, (Object)objectArray3, (long)-1184275627181167867L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    private static List I(Object[] var0) {
        var5_1 = (Boolean)var0[0];
        var3_2 = (loe)var0[1];
        var1_3 = (Long)var0[2];
        var6_4 = (Boolean)var0[3];
        var4_5 = (char[])var0[4];
        v0 = var1_3 = lbw.a ^ var1_3;
        var7_6 = v0 ^ 98170637399233L;
        var9_7 = v0 ^ 7657807536186L;
        var11_8 = v0 ^ 115815835343333L;
        var14_9 = new ArrayList<CallSite>();
        var15_10 = var3_2.v();
        var16_11 = m44.a("r", (Object)var3_2, (Object)new Object[0], (long)5678749868105787218L, (long)var1_3);
        var17_12 = m44.a("m", (Object)new Object[]{var16_11}, (long)5852357030338185503L, (long)var1_3);
        v1 = new Object[2];
        v1[1] = var16_11;
        v1[0] = var11_8;
        var18_13 = m44.a("m", (Object)v1, (long)5257034065445703932L, (long)var1_3);
        var13_14 = m44.a("m", (long)5835821458961451094L, (long)var1_3);
        var19_15 = null;
        var20_16 = new lbk();
        v2 = new Object[1];
        v2[0] = var9_7;
        var21_17 = m44.a("m", (Object)v2, (long)5485046918305887645L, (long)var1_3);
        block0: while (true) {
            v3 = new Object[8];
            v3[7] = var6_4;
            v3[6] = var19_15;
            v3[5] = var4_5;
            v3[4] = var17_12;
            v3[3] = var18_13;
            v3[2] = var5_1;
            v3[1] = var7_6;
            v3[0] = var15_10;
            var19_15 = m44.a("r", (Object)var20_16, (Object)v3, (long)5627193692809638021L, (long)var1_3);
            block1: while (true) {
                block6: {
                    block5: {
                        if (var19_15 != null) break block5;
                        v4 = var13_14;
                        do {
                            if (v4 == null) continue block1;
                            v4 = var13_14;
                        } while (var1_3 <= 0L);
                        if (v4 != null) break block6;
                    }
                    var22_18 = var19_15.v();
                    if (var13_14 == null) continue;
                    if (!var21_17.add(var22_18)) continue block0;
                    var23_19 = new loe(var15_10, var22_18);
                    var14_9.add(var19_15);
                    if (var13_14 == null) ** break;
                    continue block0;
                }
                if (var1_3 >= 0L) break block0;
            }
            break;
        }
        return var14_9;
    }

    /*
     * Unable to fully structure code
     */
    private u5 P(Object[] var1_1) {
        var9_2 = (l62)var1_1[0];
        var5_3 = (Long)var1_1[1];
        var10_4 = (bn)var1_1[2];
        var12_5 = (loe)var1_1[3];
        var8_6 = (Boolean)var1_1[4];
        var7_7 = (df)var1_1[5];
        var2_8 = (Boolean)var1_1[6];
        var4_9 = (Map)var1_1[7];
        var11_10 = (Map)var1_1[8];
        var13_11 = (Boolean)var1_1[9];
        var3_12 = (char[][])var1_1[10];
        v0 = var5_3 = lbw.a ^ var5_3;
        var14_13 = v0 ^ 50536396876876L;
        var16_14 = v0 ^ 10586152979312L;
        var18_15 = v0 ^ 75465699756521L;
        var20_16 = v0 ^ 112164257870511L;
        var22_17 = v0 ^ 31585795430480L;
        var25_18 = var12_5.v();
        var26_19 = m44.a("p", (Object)var12_5, (Object)new Object[0], (long)-1908127951787176936L, (long)var5_3);
        var27_20 = m44.a("o", (Object)new Object[]{var26_19}, (long)-396966713954409899L, (long)var5_3);
        v1 = new Object[2];
        v1[1] = var26_19;
        v1[0] = var20_16;
        var28_21 = m44.a("o", (Object)v1, (long)-2035992107750884426L, (long)var5_3);
        var29_22 = null;
        var30_23 = new lb6();
        var31_24 = new lbk();
        v2 = new Object[1];
        v2[0] = var16_14;
        var32_25 = m44.a("o", (Object)v2, (long)-1777582328562868521L, (long)var5_3);
        var24_26 = m44.a("o", (long)-308760574454832356L, (long)var5_3);
        block0: while (true) {
            v3 = new Object[1];
            v3[0] = var22_17;
            v4 = new Object[9];
            v4[8] = var3_12;
            v4[7] = var8_6;
            v4[6] = var29_22;
            v4[5] = var14_13;
            v4[4] = var30_23;
            v4[3] = var27_20;
            v4[2] = var28_21;
            v4[1] = (boolean)m44.a("p", (Object)var10_4, (Object)v3, (long)-2123462929212293931L, (long)var5_3);
            v4[0] = var25_18;
            var29_22 = m44.a("p", (Object)var31_24, (Object)v4, (long)-2056961936571560702L, (long)var5_3);
            block1: while (true) {
                v5 = var29_22;
                do {
                    if (v5 == null) {
                        return null;
                    }
                    var33_27 = var29_22.v();
                    if (var24_26 == null) continue block1;
                    if (!var32_25.add(var33_27)) continue block0;
                    var34_28 = new loe(var25_18, var33_27);
                    v6 = new Object[11];
                    v6[10] = var2_8;
                    v6[9] = var13_11;
                    v6[8] = var11_10;
                    v6[7] = var4_9;
                    v6[6] = var7_7;
                    v6[5] = var18_15;
                    v6[4] = var12_5;
                    v6[3] = var34_28;
                    v6[2] = var29_22;
                    v6[1] = var10_4;
                    v6[0] = var9_2;
                    if (m44.a("p", (Object)this, (Object)v6, (long)-527119932293888991L, (long)var5_3) != false) ** break;
                    continue block0;
                    v5 = var29_22;
                } while (var5_3 < 0L);
                break;
            }
            break;
        }
        return v5;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    final u5 w(Object[] var1_1) {
        block68: {
            block74: {
                block73: {
                    block67: {
                        block65: {
                            block66: {
                                block53: {
                                    block64: {
                                        block63: {
                                            block59: {
                                                block60: {
                                                    block61: {
                                                        block62: {
                                                            block57: {
                                                                block58: {
                                                                    block55: {
                                                                        block56: {
                                                                            block71: {
                                                                                block70: {
                                                                                    block69: {
                                                                                        block54: {
                                                                                            block52: {
                                                                                                var3_2 = (l62)var1_1[0];
                                                                                                var9_3 = (String)var1_1[1];
                                                                                                var6_4 = (bn)var1_1[2];
                                                                                                var4_5 = (Long)var1_1[3];
                                                                                                var11_6 = (df)var1_1[4];
                                                                                                var7_7 = (Boolean)var1_1[5];
                                                                                                var2_8 = (Map)var1_1[6];
                                                                                                var10_9 = (Map)var1_1[7];
                                                                                                var8_10 = (Boolean)var1_1[8];
                                                                                                var12_11 = (Boolean)var1_1[9];
                                                                                                v0 = var4_5 = lbw.a ^ var4_5;
                                                                                                v1 = v0 ^ 56818509928361L;
                                                                                                var13_12 = (int)(v1 >>> 32);
                                                                                                var14_13 = (int)(v1 << 32 >>> 32);
                                                                                                var15_14 = v0 ^ 19003082973369L;
                                                                                                var17_15 = v0 ^ 135815174092592L;
                                                                                                var19_16 = v0 ^ 93304966761495L;
                                                                                                var21_17 = v0 ^ 16384375623330L;
                                                                                                var23_18 = v0 ^ 70254264082321L;
                                                                                                var25_19 = v0 ^ 92962843503164L;
                                                                                                var28_20 = false;
                                                                                                var27_21 = m44.a("i", (long)-7599448326799225310L, (long)var4_5);
                                                                                                var29_22 = 0;
                                                                                                try {
                                                                                                    v2 /* !! */  = m44.a("w", (Object)this, (long)-7573896840034085554L, (long)var4_5);
                                                                                                    if (var27_21 == null) break block52;
                                                                                                    if (v2 /* !! */  == false) break block53;
                                                                                                }
                                                                                                catch (Exception v3) {
                                                                                                    throw m44.a("i", (Object)v3, (long)-8431357295200917931L, (long)var4_5);
                                                                                                }
                                                                                                v2 /* !! */  = (CallSite)true;
                                                                                            }
                                                                                            var30_23 /* !! */  = v2 /* !! */ ;
                                                                                            try {
                                                                                                if (var4_5 < 0L) break block54;
                                                                                                v4 = m44.a("m", (long)-7718364377487849221L, (long)var4_5);
                                                                                                if (var27_21 != null) {
                                                                                                    if (v4 == null) break block54;
                                                                                                }
                                                                                                ** GOTO lbl48
                                                                                            }
                                                                                            catch (Exception v5) {
                                                                                                throw m44.a("i", (Object)v5, (long)-8431357295200917931L, (long)var4_5);
                                                                                            }
                                                                                            try {
                                                                                                v4 = m44.a("m", (long)-7718364377487849221L, (long)var4_5);
lbl48:
                                                                                                // 2 sources

                                                                                                var30_23 /* !! */  = (CallSite)Integer.parseInt((String)v4);
                                                                                            }
                                                                                            catch (Exception var31_25) {
                                                                                                // empty catch block
                                                                                            }
                                                                                        }
                                                                                        v6 /* !! */  = var8_10;
                                                                                        if (var27_21 == null) break block55;
                                                                                        if (v6 /* !! */ ) break block56;
                                                                                        break block69;
                                                                                        catch (Exception v7) {
                                                                                            throw m44.a("i", (Object)v7, (long)-8431357295200917931L, (long)var4_5);
                                                                                        }
                                                                                    }
                                                                                    v6 /* !! */  = m44.a("m", (long)-8420703975407347485L, (long)var4_5);
                                                                                    if (var27_21 == null) break block55;
                                                                                    break block70;
                                                                                    catch (Exception v8) {
                                                                                        throw m44.a("i", (Object)v8, (long)-8431357295200917931L, (long)var4_5);
                                                                                    }
                                                                                }
                                                                                if (v6 /* !! */ ) break block56;
                                                                                break block71;
                                                                                catch (Exception v9) {
                                                                                    throw m44.a("i", (Object)v9, (long)-8431357295200917931L, (long)var4_5);
                                                                                }
                                                                            }
                                                                            try {
                                                                                block72: {
                                                                                    v10 = m44.a("w", (Object)this, (long)-8420198822936957935L, (long)var4_5).nextInt((int)var30_23 /* !! */ );
                                                                                    if (var27_21 == null) break block57;
                                                                                    break block72;
                                                                                    catch (Exception v11) {
                                                                                        throw m44.a("i", (Object)v11, (long)-8431357295200917931L, (long)var4_5);
                                                                                    }
                                                                                }
                                                                                if (v10 != 0) break block58;
                                                                            }
                                                                            catch (Exception v12) {
                                                                                throw m44.a("i", (Object)v12, (long)-8431357295200917931L, (long)var4_5);
                                                                            }
                                                                        }
                                                                        v6 /* !! */  = true;
                                                                    }
                                                                    var28_20 = v6 /* !! */ ;
                                                                }
                                                                v10 = 4;
                                                            }
                                                            var31_26 = v10;
                                                            try {
                                                                if (var4_5 < 0L) break block59;
                                                                v13 = m44.a("m", (long)-8360476473060181517L, (long)var4_5);
                                                                if (var27_21 == null) ** GOTO lbl105
                                                                if (v13 != null) {
                                                                }
                                                                ** GOTO lbl113
                                                            }
                                                            catch (Exception v14) {
                                                                throw m44.a("i", (Object)v14, (long)-8431357295200917931L, (long)var4_5);
                                                            }
                                                            try {
                                                                v13 = m44.a("m", (long)-8360476473060181517L, (long)var4_5);
lbl105:
                                                                // 2 sources

                                                                var31_26 = Integer.parseInt((String)v13);
                                                                break block59;
                                                            }
                                                            catch (Exception var32_28) {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (var4_5 > 0L && var27_21 != null) break block59;
lbl113:
                                                                                // 2 sources

                                                                                v15 /* !! */  = var8_10;
                                                                                if (var27_21 == null) break block60;
                                                                            }
                                                                            catch (Exception v16) {
                                                                                throw m44.a("i", (Object)v16, (long)-8431357295200917931L, (long)var4_5);
                                                                            }
                                                                            if (var4_5 <= 0L) break block61;
                                                                            if (v15 /* !! */ ) break block62;
                                                                        }
                                                                        catch (Exception v17) {
                                                                            throw m44.a("i", (Object)v17, (long)-8431357295200917931L, (long)var4_5);
                                                                        }
                                                                        v18 /* !! */  = (int)m44.a("m", (long)-8420703975407347485L, (long)var4_5);
                                                                        v19 = var27_21;
                                                                        if (var4_5 > 0L) {
                                                                            if (v19 == null) break block63;
                                                                        }
                                                                        ** GOTO lbl146
                                                                    }
                                                                    catch (Exception v20) {
                                                                        throw m44.a("i", (Object)v20, (long)-8431357295200917931L, (long)var4_5);
                                                                    }
                                                                    if (v18 /* !! */  == 0) break block59;
                                                                }
                                                                catch (Exception v21) {
                                                                    throw m44.a("i", (Object)v21, (long)-8431357295200917931L, (long)var4_5);
                                                                }
                                                            }
                                                        }
                                                        v22 = 20158;
                                                    }
                                                    v15 /* !! */  = lbw.a("e", (int)v22, (long)(5925583310067688800L ^ var4_5));
                                                }
                                                var31_26 = (int)v15 /* !! */ ;
                                            }
                                            v18 /* !! */  = m44.a("w", (Object)this, (long)-8420198822936957935L, (long)var4_5).nextInt(var31_26);
                                        }
                                        try {
                                            v19 = var27_21;
lbl146:
                                            // 2 sources

                                            if (v19 == null) break block64;
                                            if (v18 /* !! */  != 0) break block53;
                                        }
                                        catch (Exception v23) {
                                            throw m44.a("i", (Object)v23, (long)-8431357295200917931L, (long)var4_5);
                                        }
                                        v18 /* !! */  = 1;
                                    }
                                    var29_22 = v18 /* !! */ ;
                                }
                                var30_24 /* !! */  = null;
                                try {
                                    try {
                                        if (var4_5 < 0L) break block65;
                                        v24 = var29_22;
                                        if (var27_21 == null) break block66;
                                        if (v24 == 0) break block67;
                                    }
                                    catch (Exception v25) {
                                        throw m44.a("i", (Object)v25, (long)-8431357295200917931L, (long)var4_5);
                                    }
                                    v24 = ((CallSite)m44.a("m", (long)-8601967108651639446L, (long)var4_5)).length;
                                }
                                catch (Exception v26) {
                                    throw m44.a("i", (Object)v26, (long)-8431357295200917931L, (long)var4_5);
                                }
                            }
                            var30_24 /* !! */  = new char[v24][];
                            System.arraycopy(m44.a("m", (long)-8601967108651639446L, (long)var4_5), 0, var30_24 /* !! */ , 0, ((CallSite)m44.a("m", (long)-8601967108651639446L, (long)var4_5)).length);
                            v27 = var30_24 /* !! */ ;
                            if (var4_5 < 0L) break block73;
                            v28 = new Object[2];
                            v28[1] = var25_19;
                            v28[0] = (int)lbw.a("e", (int)8970, (long)(7933299756146690261L ^ var4_5));
                            v29 = new Object[4];
                            v29[3] = var14_13;
                            v29[2] = var13_12;
                            v29[1] = m44.a("i", (Object)v28, (long)-8444230217345839637L, (long)var4_5);
                            v29[0] = v27;
                            m44.a("i", (Object)v29, (long)-7677382359475108371L, (long)var4_5);
                        }
                        if (var27_21 != null) break block74;
                    }
                    v27 = m44.a("m", (long)-8601967108651639446L, (long)var4_5);
                }
                var30_24 /* !! */  = (char[][])v27;
            }
            var31_27 = var6_4.B(var19_16);
            v30 = new Object[1];
            v30[0] = var21_17;
            var32_29 = m44.a("v", (Object)var6_4, (Object)v30, (long)-8256643789054268810L, (long)var4_5);
            if (var32_29 != false) {
                v31 = new Object[2];
                v31[1] = m44.a("v", (Object)var31_27, (Object)new Object[0], (long)-8594365233799093978L, (long)var4_5);
                v31[0] = var23_18;
                var33_30 = m44.a("i", (Object)v31, (long)-8178279564388526456L, (long)var4_5);
                try {
                    if (var33_30.size() == 0) {
                        return null;
                    }
                }
                catch (Exception v32) {
                    throw m44.a("i", (Object)v32, (long)-8431357295200917931L, (long)var4_5);
                }
            }
            var33_30 = null;
            try {
                v33 /* !! */  = var28_20;
                if (var27_21 == null) break block68;
                if (!v33 /* !! */ ) {
                }
                ** GOTO lbl-1000
            }
            catch (Exception v34) {
                throw m44.a("i", (Object)v34, (long)-8431357295200917931L, (long)var4_5);
            }
            v33 /* !! */  = m44.a("m", (long)-7506880529077500505L, (long)var4_5);
        }
        if (v33 /* !! */ ) lbl-1000:
        // 2 sources

        {
            v35 = new Object[11];
            v35[10] = var30_24 /* !! */ ;
            v35[9] = var12_11;
            v35[8] = var10_9;
            v35[7] = var2_8;
            v35[6] = var17_15;
            v35[5] = var7_7;
            v35[4] = var11_6;
            v35[3] = (boolean)var32_29;
            v35[2] = var31_27;
            v35[1] = var6_4;
            v35[0] = var3_2;
            var33_30 = m44.a("h", (Object)this, (Object)v35, (long)-7699180592104191768L, (long)var4_5);
        } else {
            v36 = new Object[11];
            v36[10] = var30_24 /* !! */ ;
            v36[9] = var12_11;
            v36[8] = var10_9;
            v36[7] = var2_8;
            v36[6] = var7_7;
            v36[5] = var11_6;
            v36[4] = (boolean)var32_29;
            v36[3] = var31_27;
            v36[2] = var6_4;
            v36[1] = var15_14;
            v36[0] = var3_2;
            var33_30 = m44.a("h", (Object)this, (Object)v36, (long)-8592158306800724800L, (long)var4_5);
        }
        return var33_30;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public u5 K(Object[] var1_1) {
        block27: {
            block28: {
                block36: {
                    block40: {
                        block37: {
                            block38: {
                                block39: {
                                    block35: {
                                        block41: {
                                            block45: {
                                                block30: {
                                                    block44: {
                                                        block42: {
                                                            block43: {
                                                                block33: {
                                                                    block34: {
                                                                        block32: {
                                                                            block31: {
                                                                                block29: {
                                                                                    var7_2 = (l62)var1_1[0];
                                                                                    var3_3 = (Long)var1_1[1];
                                                                                    var9_4 = (String)var1_1[2];
                                                                                    var6_5 = (bn)var1_1[3];
                                                                                    var11_6 = (df)var1_1[4];
                                                                                    var8_7 = (Boolean)var1_1[5];
                                                                                    var5_8 = (Map)var1_1[6];
                                                                                    var12_9 = (Map)var1_1[7];
                                                                                    var2_10 = (Boolean)var1_1[8];
                                                                                    var10_11 = (Boolean)var1_1[9];
                                                                                    v0 = var3_3 = lbw.a ^ var3_3;
                                                                                    var13_12 = v0 ^ 33077011606897L;
                                                                                    var15_13 = v0 ^ 104974248200354L;
                                                                                    var17_14 = v0 ^ 3339920018840L;
                                                                                    var19_15 = v0 ^ 103322299111761L;
                                                                                    var21_16 = v0 ^ 56983029199489L;
                                                                                    var23_17 = v0 ^ 91223751481868L;
                                                                                    var25_18 = v0 ^ 52371666842385L;
                                                                                    var27_19 = v0 ^ 38003318134932L;
                                                                                    var29_20 = v0 ^ 79880551732324L;
                                                                                    v1 = v0 ^ 58659286198789L;
                                                                                    var31_21 = (int)(v1 >>> 48);
                                                                                    var32_22 = v1 << 16 >>> 16;
                                                                                    var35_23 = var6_5.B(var21_16);
                                                                                    var36_24 = null;
                                                                                    var37_25 = null;
                                                                                    var34_26 = m44.a("o", (long)7502769438482165940L, (long)var3_3);
                                                                                    v2 = new Object[1];
                                                                                    v2[0] = var29_20;
                                                                                    if (m44.a("p", (Object)var7_2, (Object)v2, (long)7636452432565891583L, (long)var3_3) != false) {
                                                                                        v3 = new Object[3];
                                                                                        v3[2] = var17_14;
                                                                                        v3[1] = var35_23;
                                                                                        v3[0] = var7_2;
                                                                                        var37_25 = m44.a("p", (Object)m44.a("q", (Object)this, (long)8007411873090170925L, (long)var3_3), (Object)v3, (long)7740105599062695828L, (long)var3_3);
                                                                                    }
                                                                                    if (var37_25 == null) break block41;
                                                                                    v4 = new Object[2];
                                                                                    v4[1] = var15_13;
                                                                                    v4[0] = var37_25;
                                                                                    var36_24 = m44.a("p", (Object)m44.a("q", (Object)this, (long)8007411873090170925L, (long)var3_3), (Object)v4, (long)8134981427312898564L, (long)var3_3);
                                                                                    try {
                                                                                        v5 = var36_24;
                                                                                        if (var34_26 == null) break block27;
                                                                                        if (v5 != null) break block28;
                                                                                    }
                                                                                    catch (n9 v6) {
                                                                                        throw m44.a("o", (Object)v6, (long)8388985893527378115L, (long)var3_3);
                                                                                    }
                                                                                    var38_27 = m44.a("p", (Object)m44.a("q", (Object)this, (long)8007411873090170925L, (long)var3_3), (Object)new Object[]{var6_5}, (long)7639507811815333563L, (long)var3_3);
                                                                                    try {
                                                                                        v7 = var38_27;
                                                                                        if (var34_26 == null) break block29;
                                                                                        if (v7 == null) break block30;
                                                                                    }
                                                                                    catch (n9 v8) {
                                                                                        throw m44.a("o", (Object)v8, (long)8388985893527378115L, (long)var3_3);
                                                                                    }
                                                                                    v7 = var38_27;
                                                                                }
                                                                                var39_29 = v7.h(var19_15);
                                                                                var40_31 = l62.t(var39_29);
                                                                                try {
                                                                                    v9 = var40_31;
                                                                                    if (var3_3 < 0L || var34_26 == null) break block31;
                                                                                    if (v9 == null) break block32;
                                                                                }
                                                                                catch (n9 v10) {
                                                                                    throw m44.a("o", (Object)v10, (long)8388985893527378115L, (long)var3_3);
                                                                                }
                                                                                v9 = var40_31;
                                                                            }
                                                                            try {
                                                                                v11 /* !! */  = v9.c((short)var31_21, var32_22);
                                                                                if (var34_26 == null) break block33;
                                                                                if (!v11 /* !! */ ) break block34;
                                                                            }
                                                                            catch (n9 v12) {
                                                                                throw m44.a("o", (Object)v12, (long)8388985893527378115L, (long)var3_3);
                                                                            }
                                                                        }
                                                                        var36_24 = null;
                                                                        break block42;
                                                                    }
                                                                    v13 = new Object[1];
                                                                    v13[0] = var13_12;
                                                                    v11 /* !! */  = m44.a("p", (Object)var40_31, (Object)v13, (long)7824814608074827896L, (long)var3_3);
                                                                }
                                                                if (v11 /* !! */ ) break block43;
                                                                v14 = new Object[2];
                                                                v14[1] = var38_27;
                                                                v14[0] = var23_17;
                                                                var36_24 = m44.a("p", (Object)m44.a("q", (Object)this, (long)7734199687053009271L, (long)var3_3), (Object)v14, (long)7630418433779620241L, (long)var3_3);
                                                                v15 = var34_26;
                                                                if (var3_3 <= 0L) break block44;
                                                                if (v15 != null) break block42;
                                                            }
                                                            v16 = new Object[10];
                                                            v16[9] = var10_11;
                                                            v16[8] = var2_10;
                                                            v16[7] = var12_9;
                                                            v16[6] = var5_8;
                                                            v16[5] = var8_7;
                                                            v16[4] = var11_6;
                                                            v16[3] = var25_18;
                                                            v16[2] = var6_5;
                                                            v16[1] = var9_4;
                                                            v16[0] = var7_2;
                                                            var36_24 = m44.a("p", (Object)this, (Object)v16, (long)8580669480095003521L, (long)var3_3);
                                                        }
                                                        v15 = var34_26;
                                                    }
                                                    if (v15 != null) break block45;
                                                }
                                                v17 = new Object[10];
                                                v17[9] = var10_11;
                                                v17[8] = var2_10;
                                                v17[7] = var12_9;
                                                v17[6] = var5_8;
                                                v17[5] = var8_7;
                                                v17[4] = var11_6;
                                                v17[3] = var25_18;
                                                v17[2] = var6_5;
                                                v17[1] = var9_4;
                                                v17[0] = var7_2;
                                                var36_24 = m44.a("p", (Object)this, (Object)v17, (long)8580669480095003521L, (long)var3_3);
                                            }
                                            try {
                                                if (var3_3 < 0L || var36_24 == null) ** GOTO lbl197
                                                v18 = new Object[3];
                                                v18[2] = var36_24;
                                                v18[1] = var37_25;
                                                v18[0] = var27_19;
                                                m44.a("p", (Object)m44.a("q", (Object)this, (long)8007411873090170925L, (long)var3_3), (Object)v18, (long)8043994929440581597L, (long)var3_3);
                                            }
                                            catch (n9 v19) {
                                                throw m44.a("o", (Object)v19, (long)8388985893527378115L, (long)var3_3);
                                            }
                                        }
                                        var38_28 = m44.a("p", (Object)m44.a("q", (Object)this, (long)8007411873090170925L, (long)var3_3), (Object)new Object[]{var6_5}, (long)7639507811815333563L, (long)var3_3);
                                        try {
                                            v20 = var38_28;
                                            if (var34_26 == null) break block35;
                                            if (v20 == null) break block36;
                                        }
                                        catch (n9 v21) {
                                            throw m44.a("o", (Object)v21, (long)8388985893527378115L, (long)var3_3);
                                        }
                                        v20 = var38_28;
                                    }
                                    var39_30 = l62.t(v20.h(var19_15));
                                    try {
                                        try {
                                            v22 = var34_26;
                                            if (var3_3 < 0L) break block37;
                                            if (v22 == null) break block38;
                                            if (var39_30 == null) break block39;
                                        }
                                        catch (n9 v23) {
                                            throw m44.a("o", (Object)v23, (long)8388985893527378115L, (long)var3_3);
                                        }
                                        if (!var39_30.c((short)var31_21, var32_22)) break block40;
                                    }
                                    catch (n9 v24) {
                                        throw m44.a("o", (Object)v24, (long)8388985893527378115L, (long)var3_3);
                                    }
                                }
                                var36_24 = null;
                            }
                            v22 = var34_26;
                        }
                        if (v22 != null) break block28;
                    }
                    v25 = new Object[2];
                    v25[1] = var38_28;
                    v25[0] = var23_17;
                    var36_24 = m44.a("p", (Object)m44.a("q", (Object)this, (long)7734199687053009271L, (long)var3_3), (Object)v25, (long)7630418433779620241L, (long)var3_3);
                    break block28;
                }
                v26 = new Object[10];
                v26[9] = var10_11;
                v26[8] = var2_10;
                v26[7] = var12_9;
                v26[6] = var5_8;
                v26[5] = var8_7;
                v26[4] = var11_6;
                v26[3] = var25_18;
                v26[2] = var6_5;
                v26[1] = var9_4;
                v26[0] = var7_2;
                var36_24 = m44.a("p", (Object)this, (Object)v26, (long)8580669480095003521L, (long)var3_3);
            }
            v5 = var36_24;
        }
        return v5;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l10 = a ^ 0x767332CD424FL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u0080lt\u009f\u0097Mk\u008a\u00d4\u0098\u00faF\u00182\u00d6Z";
        int n11 = "\u0080lt\u009f\u0097Mk\u008a\u00d4\u0098\u00faF\u00182\u00d6Z".length();
        int n12 = 0;
        do {
            byte[] byArray3 = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n13] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n12 < n11);
        b = lArray;
        c = new Integer[2];
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3028;
        if (c[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lbw", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lbw.c[n11] = n12;
        }
        return c[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = lbw.a(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/lbw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lbw.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

