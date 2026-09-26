/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix._q;
import com.zelix.d0;
import com.zelix.gd;
import com.zelix.l62;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.n4;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.zy;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class dh
extends d0 {
    private char[] V;
    private List v;
    private char[] j;
    private String i;
    private Map z;
    private Map X;
    private char[] p;
    private char[] G;
    private static final long c = prr.a(305691324810317312L, 2355394119774900259L, MethodHandles.lookup().lookupClass()).a(68265016485308L);
    private static final String[] k;
    private static final String[] l;
    private static final Map o;

    @Override
    String a(Object[] objectArray) {
        String string;
        String string2;
        _f _f2;
        long l10;
        long l11;
        boolean bl2;
        long l12;
        l62 l622;
        block9: {
            block8: {
                block7: {
                    CallSite callSite;
                    CallSite callSite2;
                    CallSite callSite3;
                    long l13;
                    block6: {
                        l622 = (l62)objectArray[0];
                        l12 = (Long)objectArray[1];
                        bl2 = (Boolean)objectArray[2];
                        long l14 = l12;
                        l11 = l14 ^ 0x2935EA5A4851L;
                        l10 = l14 ^ 0x451C202D8F87L;
                        long l15 = l14 ^ 0x1D1EE797AED3L;
                        l13 = l14 ^ 0xD0B0BDAC034L;
                        long l16 = l14 ^ 0x20E57461D9A5L;
                        long l17 = l14 ^ 0x43E674775D20L;
                        _f2 = l622.G(l15);
                        callSite3 = m44.a("i", (long)2706802438317491676L, (long)l12);
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l16;
                        objectArray2[0] = _f2;
                        callSite2 = m44.a("v", (Object)m44.a("w", (Object)this, (long)4408290182774110357L, (long)l12), (Object)objectArray2, (long)2836496593349160191L, (long)l12);
                        try {
                            try {
                                callSite = callSite2;
                                if (callSite3 != null) break block6;
                                if (callSite == null) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("i", (Object)n92, (long)4422726840154551999L, (long)l12);
                            }
                            Object[] objectArray3 = new Object[1];
                            objectArray3[0] = l17;
                            callSite = m44.a("v", (Object)callSite2, (Object)objectArray3, (long)4355865407125001267L, (long)l12);
                        }
                        catch (n9 n93) {
                            throw m44.a("i", (Object)n93, (long)4422726840154551999L, (long)l12);
                        }
                    }
                    string2 = (String)((Object)callSite);
                    Object[] objectArray4 = new Object[1];
                    objectArray4[0] = l13;
                    string = (String)((Object)m44.a("v", (Object)callSite2, (Object)objectArray4, (long)2591128078479822979L, (long)l12));
                    if (l12 < 0L) break block8;
                    if (callSite3 == null) break block9;
                }
                string2 = "";
            }
            string = "";
        }
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l11;
        Object[] objectArray6 = new Object[9];
        objectArray6[8] = (boolean)m44.a("w", (Object)this, (long)2451652727158538742L, (long)l12);
        objectArray6[7] = l10;
        objectArray6[6] = (boolean)m44.a("v", (Object)_f2, (Object)objectArray5, (long)2690366395354042622L, (long)l12);
        objectArray6[5] = bl2;
        objectArray6[4] = null;
        objectArray6[3] = string;
        objectArray6[2] = string2;
        objectArray6[1] = m44.a("v", (Object)l622, (long)4606615794249881166L, (long)l12);
        objectArray6[0] = "";
        return m44.a("h", (Object)this, (Object)objectArray6, (long)2590511356245325966L, (long)l12);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private String P(Object[] var1_1) {
        block18: {
            block15: {
                block16: {
                    block17: {
                        var6_2 = (Long)var1_1[0];
                        var3_3 = (String)var1_1[1];
                        var8_4 = (String)var1_1[2];
                        var2_5 = (String)var1_1[3];
                        var5_6 = (HashMap)var1_1[4];
                        var9_7 = (Boolean)var1_1[5];
                        var4_8 = (Boolean)var1_1[6];
                        v0 = var6_2 = dh.c ^ var6_2;
                        var10_9 = v0 ^ 91351807027328L;
                        var12_10 = v0 ^ 65878378824859L;
                        var14_11 = m44.a("l", (long)-5423077914876783375L, (long)var6_2);
                        try {
                            v1 /* !! */  = var8_4;
                            if (var14_11 != null) break block15;
                            if (!v1 /* !! */ .equals("")) break block16;
                        }
                        catch (n9 v2) {
                            throw m44.a("l", (Object)v2, (long)-6031010912189749358L, (long)var6_2);
                        }
                        var15_12 = (gd)m44.a("r", (Object)this, (long)-5393121422638228938L, (long)var6_2).get(var3_3);
                        try {
                            v3 = var15_12;
                            if (var14_11 == null && v3 == null) {
                            }
                            break block17;
                        }
                        catch (n9 v4) {
                            throw m44.a("l", (Object)v4, (long)-6031010912189749358L, (long)var6_2);
                        }
                        v5 = new Object[6];
                        v5[5] = m44.a("r", (Object)this, (long)-5940038614539085848L, (long)var6_2);
                        v5[4] = m44.a("r", (Object)this, (long)-5612818644406022483L, (long)var6_2);
                        v5[3] = var10_9;
                        v5[2] = m44.a("r", (Object)this, (long)-5267313613648185847L, (long)var6_2);
                        v5[1] = m44.a("r", (Object)this, (long)-5979429068261317145L, (long)var6_2);
                        v5[0] = m44.a("r", (Object)this, (long)-5739445122373668327L, (long)var6_2);
                        var15_12 = m44.a("s", (Object)this, (Object)v5, (long)-5779273224691068718L, (long)var6_2);
                        v3 = m44.a("r", (Object)this, (long)-5393121422638228938L, (long)var6_2).put(var3_3, var15_12);
                    }
                    var16_14 = null;
                    v6 = new Object[3];
                    v6[2] = var12_10;
                    v6[1] = var9_7;
                    v6[0] = m44.a("r", (Object)this, (long)-6099254796152123918L, (long)var6_2);
                    var16_14 = m44.a("s", (Object)var15_12, (Object)v6, (long)-5404029658851853874L, (long)var6_2);
                    return var16_14;
                }
                v1 /* !! */  = m44.a("r", (Object)this, (long)-5726343404278860837L, (long)var6_2).get(var8_4);
            }
            var15_13 = (gd)v1 /* !! */ ;
            try {
                v7 = var15_13;
                if (var14_11 == null && v7 == null) {
                }
                break block18;
            }
            catch (n9 v8) {
                throw m44.a("l", (Object)v8, (long)-6031010912189749358L, (long)var6_2);
            }
            v9 = new Object[6];
            v9[5] = m44.a("r", (Object)this, (long)-5940038614539085848L, (long)var6_2);
            v9[4] = m44.a("r", (Object)this, (long)-5612818644406022483L, (long)var6_2);
            v9[3] = var10_9;
            v9[2] = m44.a("r", (Object)this, (long)-5267313613648185847L, (long)var6_2);
            v9[1] = m44.a("r", (Object)this, (long)-5979429068261317145L, (long)var6_2);
            v9[0] = m44.a("r", (Object)this, (long)-5739445122373668327L, (long)var6_2);
            var15_13 = m44.a("s", (Object)this, (Object)v9, (long)-5779273224691068718L, (long)var6_2);
            v7 = m44.a("r", (Object)this, (long)-5726343404278860837L, (long)var6_2).put(var8_4, var15_13);
        }
        var16_15 = null;
        block8: while (true) {
            v10 = new Object[3];
            v10[2] = var12_10;
            v10[1] = var9_7;
            v10[0] = m44.a("r", (Object)this, (long)-6099254796152123918L, (long)var6_2);
            var16_15 = m44.a("s", (Object)var15_13, (Object)v10, (long)-5404029658851853874L, (long)var6_2);
            v11 = var16_15;
            block9: while (true) {
                if (v11 != null && m44.a("h", (long)-5327684171639140145L, (long)var6_2) != false) {
                    var16_15 = (String)var16_15 + (String)dh.b("n", (int)24978, (long)(7753671597265260565L ^ var6_2));
                }
                v11 = var16_15;
                do {
                    v12 = var14_11;
                    do {
                        block20: {
                            block19: {
                                if (v12 != null) continue block9;
                                if (v11 == null) continue block8;
                                try {
                                    v13 = var5_6;
                                    if (var14_11 != null) break block19;
                                    if (v13 == null) break block20;
                                }
                                catch (n9 v14) {
                                    throw m44.a("l", (Object)v14, (long)-6031010912189749358L, (long)var6_2);
                                }
                                v13 = var5_6;
                            }
                            if (m44.a("s", (Object)v13, (Object)var16_15, (long)-5988970783598907697L, (long)var6_2) == false) ** break;
                            continue block8;
                        }
                        v15 = var16_15;
                        v12 = var14_11;
                    } while (var6_2 <= 0L);
                } while (v12 != null);
                break;
            }
            break;
        }
        return v15;
    }

    /*
     * Exception decompiling
     */
    dh(n4 var1_1, boolean var2_2, long var3_3, boolean var5_4, String var6_5, int var7_6, int var8_7, boolean var9_8, zy var10_9, HashMap var11_10, l6q var12_11, Map var13_12, List var14_13) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private String q(Object[] var1_1) {
        block51: {
            block46: {
                block50: {
                    block52: {
                        block49: {
                            block48: {
                                block47: {
                                    block45: {
                                        block43: {
                                            block44: {
                                                var7_2 = (String)var1_1[0];
                                                var10_3 = (String)var1_1[1];
                                                var11_4 = (String)var1_1[2];
                                                var8_5 = (String)var1_1[3];
                                                var2_6 = (HashMap)var1_1[4];
                                                var9_7 = (Boolean)var1_1[5];
                                                var6_8 = ((Boolean)var1_1[6]).booleanValue();
                                                var3_9 = (Long)var1_1[7];
                                                var5_10 = (Boolean)var1_1[8];
                                                v0 = var3_9 = dh.c ^ var3_9;
                                                var12_11 = v0 ^ 105809400700586L;
                                                var14_12 = v0 ^ 13361298796399L;
                                                var16_13 = v0 ^ 122054822126098L;
                                                var26_14 = "";
                                                var24_15 = m44.a("o", (long)6565721080180194130L, (long)var3_9);
                                                try {
                                                    v1 = var7_2.equals("");
                                                    if (var24_15 != null) break block43;
                                                    if (v1 == 0) break block44;
                                                }
                                                catch (n9 v2) {
                                                    throw m44.a("o", (Object)v2, (long)4895114072300914737L, (long)var3_9);
                                                }
                                                v3 = new Object[2];
                                                v3[1] = var16_13;
                                                v3[0] = var10_3;
                                                var26_14 = m44.a("p", (Object)this, (Object)v3, (long)4891161275524635161L, (long)var3_9);
                                            }
                                            v1 = var6_8;
                                        }
                                        try {
                                            try {
                                                v4 = var24_15;
                                                if (var3_9 > 0L) {
                                                    if (v4 != null) break block45;
                                                    if (v1 == 0) break block46;
                                                }
                                                ** GOTO lbl53
                                            }
                                            catch (n9 v5) {
                                                throw m44.a("o", (Object)v5, (long)4895114072300914737L, (long)var3_9);
                                            }
                                            v1 = var7_2.length();
                                        }
                                        catch (n9 v6) {
                                            throw m44.a("o", (Object)v6, (long)4895114072300914737L, (long)var3_9);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                if (var3_9 <= 0L) break block47;
                                                v4 = var24_15;
lbl53:
                                                // 2 sources

                                                if (v4 != null) break block47;
                                                if (v1 != 0) break block46;
                                            }
                                            catch (n9 v7) {
                                                throw m44.a("o", (Object)v7, (long)4895114072300914737L, (long)var3_9);
                                            }
                                            v8 = var11_4;
                                            v9 = var24_15;
                                            if (var3_9 >= 0L) {
                                                if (v9 != null) break block48;
                                            }
                                            ** GOTO lbl82
                                        }
                                        catch (n9 v10) {
                                            throw m44.a("o", (Object)v10, (long)4895114072300914737L, (long)var3_9);
                                        }
                                        v1 = v8.length();
                                    }
                                    catch (n9 v11) {
                                        throw m44.a("o", (Object)v11, (long)4895114072300914737L, (long)var3_9);
                                    }
                                }
                                try {
                                    if (v1 != 0) break block46;
                                    v8 = m44.a("q", (Object)this, (long)4969831879452566097L, (long)var3_9);
                                }
                                catch (n9 v12) {
                                    throw m44.a("o", (Object)v12, (long)4895114072300914737L, (long)var3_9);
                                }
                            }
                            try {
                                try {
                                    if (var3_9 <= 0L) break block49;
                                    v9 = var24_15;
lbl82:
                                    // 2 sources

                                    if (v9 != null) break block49;
                                    if (v8 == null) break block50;
                                }
                                catch (n9 v13) {
                                    throw m44.a("o", (Object)v13, (long)4895114072300914737L, (long)var3_9);
                                }
                                v8 = m44.a("q", (Object)this, (long)4969831879452566097L, (long)var3_9);
                            }
                            catch (n9 v14) {
                                throw m44.a("o", (Object)v14, (long)4895114072300914737L, (long)var3_9);
                            }
                        }
                        try {
                            try {
                                try {
                                    try {
                                        v15 /* !! */  = v8.length();
                                        if (var24_15 != null) break block51;
                                        if (v15 /* !! */  == 0) break block50;
                                    }
                                    catch (n9 v16) {
                                        throw m44.a("o", (Object)v16, (long)4895114072300914737L, (long)var3_9);
                                    }
                                    v15 /* !! */  = (int)m44.a("o", (char)m44.a("q", (Object)this, (long)4969831879452566097L, (long)var3_9).charAt(0), (long)4953327125970278840L, (long)var3_9);
                                    v17 = var24_15;
                                    if (var3_9 >= 0L) {
                                        if (v17 != null) break block52;
                                    }
                                    ** GOTO lbl121
                                }
                                catch (n9 v18) {
                                    throw m44.a("o", (Object)v18, (long)4895114072300914737L, (long)var3_9);
                                }
                                if (v15 /* !! */  != 0) break block46;
                            }
                            catch (n9 v19) {
                                throw m44.a("o", (Object)v19, (long)4895114072300914737L, (long)var3_9);
                            }
                            v15 /* !! */  = (int)m44.a("o", (char)m44.a("q", (Object)this, (long)4969831879452566097L, (long)var3_9).charAt(0), (long)5085757493697657677L, (long)var3_9);
                        }
                        catch (n9 v20) {
                            throw m44.a("o", (Object)v20, (long)4895114072300914737L, (long)var3_9);
                        }
                    }
                    try {
                        v17 = var24_15;
lbl121:
                        // 2 sources

                        if (v17 != null) break block51;
                        if (v15 /* !! */  == 0) break block46;
                    }
                    catch (n9 v21) {
                        throw m44.a("o", (Object)v21, (long)4895114072300914737L, (long)var3_9);
                    }
                }
                v15 /* !! */  = true;
                break block51;
            }
            v15 /* !! */  = false;
        }
        var27_16 = v15 /* !! */ ;
        block36: while (true) {
            var18_17 = var5_10;
            var19_18 = var27_16 != false ? true : var9_7;
            var20_19 = var2_6;
            var21_20 = var10_3;
            var22_21 = var7_2;
            var23_22 = var26_14;
            v22 = new Object[7];
            v22[6] = var18_17;
            v22[5] = var19_18;
            v22[4] = var20_19;
            v22[3] = var21_20;
            v22[2] = var22_21;
            v22[1] = var23_22;
            v22[0] = var12_11;
            v23 = m44.a("n", (Object)this, (Object)v22, (long)6488954518867705832L, (long)var3_9);
            do {
                block54: {
                    block53: {
                        var28_24 = v23;
                        v24 /* !! */  = var27_16;
                        if (var24_15 == null) {
                            try {
                                try {
                                    if (!v24 /* !! */ ) break block53;
                                    v25 = var28_24;
                                    if (var24_15 != null) break block54;
                                }
                                catch (n9 v26) {
                                    throw m44.a("o", (Object)v26, (long)4895114072300914737L, (long)var3_9);
                                }
                                v24 /* !! */  = (boolean)m44.a("o", (char)v25.charAt(0), (long)4953327125970278840L, (long)var3_9);
                            }
                            catch (n9 v27) {
                                throw m44.a("o", (Object)v27, (long)4895114072300914737L, (long)var3_9);
                            }
                        }
                        try {
                            try {
                                if (v24 /* !! */ ) break block53;
                                v25 = var28_24;
                                v28 = var24_15;
                                while (true) {
                                    if (v28 != null) break block54;
                                    break;
                                }
                            }
                            catch (n9 v29) {
                                throw m44.a("o", (Object)v29, (long)4895114072300914737L, (long)var3_9);
                            }
                            if (m44.a("o", (char)v25.charAt(0), (long)5085757493697657677L, (long)var3_9) == false) break block53;
                        }
                        catch (n9 v30) {
                            throw m44.a("o", (Object)v30, (long)4895114072300914737L, (long)var3_9);
                        }
                        var29_25 = new StringBuilder((String)var28_24);
                        m44.a("p", (Object)var29_25, (int)0, (char)m44.a("o", (char)var28_24.charAt(0), (long)4860429552661724463L, (long)var3_9), (long)4826972892140292262L, (long)var3_9);
                        var28_24 = var29_25.toString();
                    }
                    v25 = (String)var26_14 + var7_2 + var11_4 + (String)var28_24 + var8_5;
                }
                var25_23 = v25;
                v31 = new Object[5];
                v31[4] = var14_12;
                v31[3] = var27_16;
                v31[2] = var9_7;
                v31[1] = var25_23;
                v31[0] = var10_3;
                if (m44.a("p", (Object)this, (Object)v31, (long)4973457699282002944L, (long)var3_9) == false) continue block36;
                v32 = var25_23;
                v28 = var24_15;
                if (var3_9 <= 0L) ** continue;
            } while (v28 != null);
            break;
        }
        return v32;
    }

    @Override
    String U(Object[] objectArray) {
        String string;
        String string2;
        long l10;
        long l11;
        long l12;
        boolean bl2;
        String string3;
        HashMap hashMap;
        String string4;
        l62 l622;
        long l13;
        block12: {
            block9: {
                CallSite callSite;
                block10: {
                    CallSite callSite2;
                    block11: {
                        Object object;
                        long l14;
                        long l15;
                        _q _q2;
                        block8: {
                            l13 = (Long)objectArray[0];
                            l622 = (l62)objectArray[1];
                            string4 = (String)objectArray[2];
                            hashMap = (HashMap)objectArray[3];
                            string3 = (String)objectArray[4];
                            _q2 = (_q)objectArray[5];
                            bl2 = (Boolean)objectArray[6];
                            long l16 = l13;
                            l12 = l16 ^ 0x759DA8B324DBL;
                            l11 = l16 ^ 0x19B462C4E30DL;
                            l15 = l16 ^ 0x2CBA33F64684L;
                            l10 = l16 ^ 0x41B6A57EC259L;
                            l14 = l16 ^ 0x51A34933ACBEL;
                            long l17 = l16 ^ 0x1F4E369E31AAL;
                            callSite2 = m44.a("k", (long)5267560998293350742L, (long)l13);
                            try {
                                try {
                                    object = _q2;
                                    if (callSite2 != null) break block8;
                                    if (object == null) break block9;
                                }
                                catch (n9 n92) {
                                    throw m44.a("k", (Object)n92, (long)5902796380599360053L, (long)l13);
                                }
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l17;
                                object = m44.a("t", (Object)_q2, (Object)objectArray2, (long)5834826914756327609L, (long)l13);
                            }
                            catch (n9 n93) {
                                throw m44.a("k", (Object)n93, (long)5902796380599360053L, (long)l13);
                            }
                        }
                        string2 = (String)object;
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l14;
                        string = (String)((Object)m44.a("t", (Object)_q2, (Object)objectArray3, (long)5728532452301732873L, (long)l13));
                        try {
                            callSite = callSite2;
                            if (l13 < 0L) break block10;
                            if (callSite != null) break block11;
                            Object[] objectArray4 = new Object[1];
                            objectArray4[0] = l15;
                            if (m44.a("t", (Object)_q2, (Object)objectArray4, (long)6216835062134956415L, (long)l13) != null) break block12;
                        }
                        catch (n9 n94) {
                            throw m44.a("k", (Object)n94, (long)5902796380599360053L, (long)l13);
                        }
                        string2 = string2 + (String)((Object)dh.b("n", (int)32589, (long)(0x1AB175416415F36CL ^ l13)));
                    }
                    callSite = callSite2;
                }
                if (callSite == null) break block12;
            }
            string2 = "";
            string = "";
        }
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l12;
        Object[] objectArray6 = new Object[9];
        objectArray6[8] = (boolean)m44.a("u", (Object)this, (long)5659997247518961020L, (long)l13);
        objectArray6[7] = l11;
        objectArray6[6] = (boolean)m44.a("t", (Object)l622.G(l10), (Object)objectArray5, (long)5322205083441609844L, (long)l13);
        objectArray6[5] = bl2;
        objectArray6[4] = hashMap;
        objectArray6[3] = string;
        objectArray6[2] = string2;
        objectArray6[1] = string3;
        objectArray6[0] = string4;
        CallSite callSite = m44.a("j", (Object)this, (Object)objectArray6, (long)5726613839503905796L, (long)l13);
        return callSite;
    }

    gd S(Object[] objectArray) {
        char[] cArray = (char[])objectArray[0];
        char[] cArray2 = (char[])objectArray[1];
        char[] cArray3 = (char[])objectArray[2];
        long l10 = (Long)objectArray[3];
        char[] cArray4 = (char[])objectArray[4];
        List list = (List)objectArray[5];
        long l11 = l10 ^ 0x5361830D405DL;
        return new gd(cArray, cArray2, l11, cArray3, cArray4, list, (boolean)m44.a("r", (Object)this, (long)6605499827288897627L, (long)l10));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        o = new HashMap(13);
        long l10 = c ^ 0x6BE4CBB42DF8L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n10 = 0;
        String string = "\u0080\u001c\\\u00fe\\\u00ac\u0010vN$s\u00c8\u00b5apB\u0010\u009b>\u00ab\u00c8\u00d3\u00fa\u0099\u007f\u00b5\u00ce|\u00c5\u0089G\u00bd\u00d1";
        int n11 = "\u0080\u001c\\\u00fe\\\u00ac\u0010vN$s\u00c8\u00b5apB\u0010\u009b>\u00ab\u00c8\u00d3\u00fa\u0099\u007f\u00b5\u00ce|\u00c5\u0089G\u00bd\u00d1".length();
        int n12 = 16;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = dh.b(byArray3).intern();
            if ((n13 += n12) >= n11) {
                k = stringArray;
                l = new String[2];
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    private static n9 c(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x4E35;
        if (l[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])o.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/dh", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = k[n11].getBytes("ISO-8859-1");
            dh.l[n11] = dh.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return l[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = dh.b(n10, l10);
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
            throw new RuntimeException("com/zelix/dh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dh.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

