/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lb6;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.v8;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _x {
    private String[] D;
    private Map Z;
    private v8 i;
    private static int[] P;
    private Set B;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    /*
     * Unable to fully structure code
     */
    public static String v(Object[] var0) {
        block50: {
            block51: {
                block57: {
                    block58: {
                        block60: {
                            block61: {
                                block59: {
                                    block56: {
                                        block55: {
                                            block54: {
                                                block52: {
                                                    block53: {
                                                        block48: {
                                                            block49: {
                                                                var5_1 = (String)var0[0];
                                                                var4_2 = (String)var0[1];
                                                                var1_3 = (v8)var0[2];
                                                                var2_4 = (Long)var0[3];
                                                                var2_4 = _x.a ^ var2_4;
                                                                var5_1 = var5_1.trim();
                                                                var6_5 = m44.a("h", (long)6177115091806099935L, (long)var2_4);
                                                                var4_2 = var4_2.trim();
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v0 = var5_1.length();
                                                                            if (var6_5 == null) break block48;
                                                                            if (v0 <= 0) break block49;
                                                                        }
                                                                        catch (n9 v1) {
                                                                            throw m44.a("h", (Object)v1, (long)5598774684064565168L, (long)var2_4);
                                                                        }
                                                                        v0 = var5_1.charAt(0);
                                                                        if (var6_5 == null) break block48;
                                                                    }
                                                                    catch (n9 v2) {
                                                                        throw m44.a("h", (Object)v2, (long)5598774684064565168L, (long)var2_4);
                                                                    }
                                                                    if (v0 != _x.b("e", (int)2833, (long)(5693865516000850401L ^ var2_4))) break block49;
                                                                }
                                                                catch (n9 v3) {
                                                                    throw m44.a("h", (Object)v3, (long)5598774684064565168L, (long)var2_4);
                                                                }
                                                                var5_1 = var5_1.substring(1);
                                                            }
                                                            v0 = var5_1.lastIndexOf((int)_x.b("e", (int)2833, (long)(5693865516000850401L ^ var2_4)));
                                                        }
                                                        var7_6 = v0;
                                                        try {
                                                            if (var7_6 <= 0) {
                                                                return var4_2;
                                                            }
                                                        }
                                                        catch (n9 v4) {
                                                            throw m44.a("h", (Object)v4, (long)5598774684064565168L, (long)var2_4);
                                                        }
                                                        var8_7 = null;
                                                        var9_8 = null;
                                                        var10_9 = new StringBuilder(var5_1.substring(0, var7_6));
                                                        while (true) {
                                                            if ((var9_8 = (String)m44.a("w", (Object)var1_3, (Object)(var11_10 = var10_9.toString()), (long)5283007290961252477L, (long)var2_4)) != null) {
                                                                var8_7 = var11_10;
                                                                try {
                                                                    if (var2_4 < 0L || var2_4 < 0L || var6_5 == null) break;
                                                                    break;
                                                                }
                                                                catch (n9 v5) {
                                                                    throw m44.a("h", (Object)v5, (long)5598774684064565168L, (long)var2_4);
                                                                }
                                                            }
                                                            var12_11 = var11_10.lastIndexOf("/");
                                                            try {
                                                                try {
                                                                    if (var6_5 == null) continue;
                                                                    if (var12_11 <= -1) break;
                                                                }
                                                                catch (n9 v6) {
                                                                    throw m44.a("h", (Object)v6, (long)5598774684064565168L, (long)var2_4);
                                                                }
                                                                var10_9.setLength(var12_11);
                                                            }
                                                            catch (n9 v7) {
                                                                throw m44.a("h", (Object)v7, (long)5598774684064565168L, (long)var2_4);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    v8 = var8_7;
                                                                    if (var6_5 == null) break block50;
                                                                    if (v8 == null) break block51;
                                                                }
                                                                catch (n9 v9) {
                                                                    throw m44.a("h", (Object)v9, (long)5598774684064565168L, (long)var2_4);
                                                                }
                                                                v8 = var8_7;
                                                                if (var6_5 == null) break block50;
                                                            }
                                                            catch (n9 v10) {
                                                                throw m44.a("h", (Object)v10, (long)5598774684064565168L, (long)var2_4);
                                                            }
                                                            if (v8.equals(var9_8)) break block51;
                                                        }
                                                        catch (n9 v11) {
                                                            throw m44.a("h", (Object)v11, (long)5598774684064565168L, (long)var2_4);
                                                        }
                                                        var11_10 = var5_1.substring(var8_7.length() + 1);
                                                        try {
                                                            try {
                                                                v12 = var11_10.length();
                                                                if (var6_5 == null) break block52;
                                                                if (v12 < var4_2.length()) break block53;
                                                            }
                                                            catch (n9 v13) {
                                                                throw m44.a("h", (Object)v13, (long)5598774684064565168L, (long)var2_4);
                                                            }
                                                            return var4_2;
                                                        }
                                                        catch (n9 v14) {
                                                            throw m44.a("h", (Object)v14, (long)5598774684064565168L, (long)var2_4);
                                                        }
                                                    }
                                                    try {
                                                        v15 = var4_2;
                                                        if (var6_5 == null) break block54;
                                                        v12 = (int)v15.equals(var5_1);
                                                    }
                                                    catch (n9 v16) {
                                                        throw m44.a("h", (Object)v16, (long)5598774684064565168L, (long)var2_4);
                                                    }
                                                }
                                                if (v12 != 0) ** GOTO lbl107
                                                var12_12 = var5_1.substring(0, var5_1.indexOf(var4_2) - 1);
                                                var13_14 = (String)m44.a("w", (Object)var1_3, (Object)var12_12, (long)5283007290961252477L, (long)var2_4);
                                                try {
                                                    if (var2_4 < 0L || var6_5 != null) break block55;
lbl107:
                                                    // 2 sources

                                                    v15 = "";
                                                }
                                                catch (n9 v17) {
                                                    throw m44.a("h", (Object)v17, (long)5598774684064565168L, (long)var2_4);
                                                }
                                            }
                                            var12_13 = v15;
                                            var13_14 = "";
                                        }
                                        try {
                                            v18 = var13_14.equals(var9_8);
                                            if (var6_5 == null) break block56;
                                            if (v18) {
                                            }
                                            ** GOTO lbl127
                                        }
                                        catch (n9 v19) {
                                            throw m44.a("h", (Object)v19, (long)5598774684064565168L, (long)var2_4);
                                        }
                                        var14_15 = var11_10;
                                        try {
                                            try {
                                                if (var2_4 >= 0L && var6_5 != null) break block57;
lbl127:
                                                // 2 sources

                                                v20 = var9_8;
                                                if (var6_5 == null) break block58;
                                            }
                                            catch (n9 v21) {
                                                throw m44.a("h", (Object)v21, (long)5598774684064565168L, (long)var2_4);
                                            }
                                            v18 = v20.startsWith(var13_14);
                                        }
                                        catch (n9 v22) {
                                            throw m44.a("h", (Object)v22, (long)5598774684064565168L, (long)var2_4);
                                        }
                                    }
                                    if (!v18) ** GOTO lbl176
                                    var15_16 = new StringBuilder();
                                    var16_17 = var13_14.length();
                                    try {
                                        try {
                                            v23 = var6_5;
                                            if (var2_4 < 0L) ** GOTO lbl159
                                            if (v23 == null) break block59;
                                            if (var16_17 == 0) {
                                            }
                                            ** GOTO lbl160
                                        }
                                        catch (n9 v24) {
                                            throw m44.a("h", (Object)v24, (long)5598774684064565168L, (long)var2_4);
                                        }
                                        var15_16.append(var9_8);
                                    }
                                    catch (n9 v25) {
                                        throw m44.a("h", (Object)v25, (long)5598774684064565168L, (long)var2_4);
                                    }
                                }
                                try {
                                    if (var2_4 < 0L) break block60;
                                    v23 = var6_5;
lbl159:
                                    // 2 sources

                                    if (v23 != null) break block61;
lbl160:
                                    // 2 sources

                                    var15_16.append(var9_8.substring(var16_17 + 1));
                                }
                                catch (n9 v26) {
                                    throw m44.a("h", (Object)v26, (long)5598774684064565168L, (long)var2_4);
                                }
                            }
                            var15_16.append((char)_x.b("e", (int)2833, (long)(5693865516000850401L ^ var2_4)));
                            var15_16.append(var11_10);
                        }
                        v20 = var15_16.toString();
                        if (var2_4 <= 0L) break block58;
                        var14_15 = v20;
                        try {
                            if (var6_5 != null) break block57;
lbl176:
                            // 2 sources

                            v20 = (String)_x.a("f", (int)6139, (long)(1295601924961995825L ^ var2_4)) + var11_10;
                        }
                        catch (n9 v27) {
                            throw m44.a("h", (Object)v27, (long)5598774684064565168L, (long)var2_4);
                        }
                    }
                    var14_15 = v20;
                }
                return var14_15;
            }
            v8 = var4_2;
        }
        return v8;
    }

    public String i(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        String string2 = (String)objectArray[2];
        boolean bl2 = (Boolean)objectArray[3];
        long l11 = (l10 = a ^ l10) ^ 0x3A3D8AD36EACL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = m44.a("q", (Object)this, (long)-4973602653820038758L, (long)l10);
        objectArray2[3] = bl2;
        objectArray2[2] = string2;
        objectArray2[1] = l11;
        objectArray2[0] = string;
        return m44.a("o", (Object)objectArray2, (long)-5150365862281689800L, (long)l10);
    }

    public String T(Object[] objectArray) {
        String string;
        block16: {
            String string2;
            block17: {
                String string3;
                StringBuilder stringBuilder;
                block18: {
                    block19: {
                        String string4;
                        CallSite callSite;
                        String string5;
                        String string6;
                        long l10;
                        block15: {
                            CallSite callSite2;
                            char c10;
                            String string7;
                            block13: {
                                block14: {
                                    string2 = (String)objectArray[0];
                                    l10 = (Long)objectArray[1];
                                    l10 = a ^ l10;
                                    string7 = string2;
                                    string6 = "";
                                    string5 = "";
                                    callSite = m44.a("i", (long)-2645677637634025682L, (long)l10);
                                    try {
                                        c10 = string7.charAt(0);
                                        callSite2 = _x.b("e", (int)2833, (long)(0x4F0483C2FD7C3F10L ^ l10));
                                        if (callSite == null) break block13;
                                        if (c10 != callSite2) break block14;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("i", (Object)n92, (long)-4376380980887172799L, (long)l10);
                                    }
                                    string7 = string7.substring(1);
                                    string6 = "/";
                                }
                                try {
                                    string4 = string7;
                                    if (callSite == null) break block15;
                                    c10 = string4.charAt(string7.length() - 1);
                                    callSite2 = _x.b("e", (int)2833, (long)(0x4F0483C2FD7C3F10L ^ l10));
                                }
                                catch (n9 n93) {
                                    throw m44.a("i", (Object)n93, (long)-4376380980887172799L, (long)l10);
                                }
                            }
                            if (c10 == callSite2) {
                                string7 = string7.substring(0, string7.length() - 1);
                                string5 = "/";
                            }
                            string4 = (String)((Object)m44.a("v", (Object)m44.a("w", (Object)this, (long)-2831631634109844524L, (long)l10), (Object)string7, (long)-4062198047308456308L, (long)l10));
                        }
                        String string8 = string4;
                        try {
                            try {
                                try {
                                    try {
                                        string = string8;
                                        if (callSite == null) break block16;
                                        if (string == null) break block17;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("i", (Object)n94, (long)-4376380980887172799L, (long)l10);
                                    }
                                    stringBuilder = new StringBuilder().append(string6).append(string8);
                                    string3 = string8;
                                    if (callSite == null) break block18;
                                }
                                catch (n9 n95) {
                                    throw m44.a("i", (Object)n95, (long)-4376380980887172799L, (long)l10);
                                }
                                if (string3.length() <= 0) break block19;
                            }
                            catch (n9 n96) {
                                throw m44.a("i", (Object)n96, (long)-4376380980887172799L, (long)l10);
                            }
                            string3 = string5;
                            break block18;
                        }
                        catch (n9 n97) {
                            throw m44.a("i", (Object)n97, (long)-4376380980887172799L, (long)l10);
                        }
                    }
                    string3 = "";
                }
                String string9 = stringBuilder.append(string3).toString();
                return string9;
            }
            string = string2;
        }
        return string;
    }

    public static String Z(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        v8 v82 = (v8)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x76B47961818AL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = new lb6();
        objectArray2[2] = v82;
        objectArray2[1] = l11;
        objectArray2[0] = string;
        return m44.a("i", (Object)objectArray2, (long)-8616645328816710373L, (long)l10);
    }

    public static void x(int[] nArray) {
        P = nArray;
    }

    /*
     * Exception decompiling
     */
    public String R(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[DOLOOP]], but top level block is 5[TRYBLOCK]
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
    public static String U(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [22[DOLOOP]], but top level block is 10[TRYBLOCK]
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

    public _x(char c10, v8 v82, Set set, short s10, int n10) {
        block6: {
            long l10;
            long l11 = l10 = ((long)c10 << 48 | (long)s10 << 48 >>> 16 | (long)n10 << 32 >>> 32) ^ a;
            long l12 = l11 ^ 0x4B009910A041L;
            long l13 = l11 ^ 0x559E608C22BL;
            long l14 = l11 ^ 0x2B9A91B5C91DL;
            CallSite callSite = m44.a("n", (long)4258106620651566961L, (long)l10);
            Object[] objectArray = new Object[1];
            objectArray[0] = l13;
            m44.a("r", (Object)this, (Map)((Object)m44.a("n", (Object)objectArray, (long)2760566633561473709L, (long)l10)), (long)4146894174567406833L, (long)l10);
            m44.a("r", (Object)this, (v8)v82, (long)4101505293963383691L, (long)l10);
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l12;
            objectArray2[0] = set;
            m44.a("r", (Object)this, (Set)((Object)m44.a("n", (Object)objectArray2, (long)4431817545247436178L, (long)l10)), (long)2723220622660474282L, (long)l10);
            CallSite callSite2 = callSite;
            m44.a("r", (Object)this, (String[])new String[set.size()], (long)2490133171231647791L, (long)l10);
            int n11 = 0;
            block2: for (String string : set) {
                try {
                    m44.a("p", (Object)this, (long)2490133171231647791L, (long)l10)[n11++] = string;
                    do {
                        CallSite callSite3 = callSite2;
                        if (s10 > 0) {
                            if (callSite3 == null) break block6;
                            callSite3 = callSite2;
                        }
                        if (callSite3 != null) continue block2;
                    } while (n10 >= 0);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)n92, (long)2530046567776004382L, (long)l10);
                }
            }
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l14;
            m44.a("n", (Object)m44.a("p", (Object)this, (long)2490133171231647791L, (long)l10), (Object)m44.a("n", (Object)objectArray3, (long)2376514916509586439L, (long)l10), (long)4552038898539576584L, (long)l10);
        }
    }

    public static int[] g() {
        return P;
    }

    /*
     * Exception decompiling
     */
    public static String b(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [93[DOLOOP]], but top level block is 13[TRYBLOCK]
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

    public boolean o(Object[] objectArray) {
        boolean bl2;
        block7: {
            CallSite callSite;
            String string;
            long l10;
            block5: {
                CallSite callSite2;
                block6: {
                    l10 = (Long)objectArray[0];
                    String string2 = (String)objectArray[1];
                    l10 = a ^ l10;
                    string = string2;
                    callSite2 = m44.a("m", (long)-8159127139066166622L, (long)l10);
                    try {
                        bl2 = string.charAt(0);
                        callSite = _x.b("e", (int)2833, (long)(0x4F04DCEEC96B6A9CL ^ l10));
                        if (callSite2 == null) break block5;
                        if (bl2 != callSite) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)n92, (long)-7579655464940036915L, (long)l10);
                    }
                    string = string.substring(1);
                }
                try {
                    bl2 = string.charAt(string.length() - 1);
                    if (callSite2 == null) break block7;
                    callSite = _x.b("e", (int)2833, (long)(0x4F04DCEEC96B6A9CL ^ l10));
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)n93, (long)-7579655464940036915L, (long)l10);
                }
            }
            if (bl2 == callSite) {
                string = string.substring(0, string.length() - 1);
            }
            bl2 = (boolean)m44.a("r", (Object)m44.a("s", (Object)this, (long)-8270762703471450536L, (long)l10), (Object)string, (long)-7991411170336152029L, (long)l10);
        }
        return bl2;
    }

    public String O(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x129DB0E7C1DL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = m44.a("t", (Object)this, (long)-4902364166422540137L, (long)l10);
        objectArray2[1] = string;
        objectArray2[0] = l11;
        return m44.a("j", (Object)objectArray2, (long)-6400105327459133548L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    public String d(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [87[DOLOOP]], but top level block is 32[TRYBLOCK]
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
    public static String s(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [34[DOLOOP]], but top level block is 16[TRYBLOCK]
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
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _x.a = prr.a(1446075545560510660L, -2182820784765351432L, MethodHandles.lookup().lookupClass()).a(8887984981418L);
                        var20 = _x.a ^ 123619011076024L;
                        _x.d = new HashMap<K, V>(13);
                        m44.a("i", (Object)new int[4], (long)4985714850234429047L, (long)var20);
                        var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                            v2 = v2;
                            v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                        }
                        var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_3 = new String[5];
                        var16_4 = 0;
                        var15_5 = "d\u0090\u00c3\f6\u0003\n\u00dc>y\u0086\u00ac\u00e4\u00d0W<\u0010\u00e7L\u0018%m&^\u008d/+L\u009el\u00daj\u00b8\u0010\u0001\u00e4kN\u00b5\u0087\u00e6\"%N3\u00102\u00cc\"\u001d";
                        var17_6 = "d\u0090\u00c3\f6\u0003\n\u00dc>y\u0086\u00ac\u00e4\u00d0W<\u0010\u00e7L\u0018%m&^\u008d/+L\u009el\u00daj\u00b8\u0010\u0001\u00e4kN\u00b5\u0087\u00e6\"%N3\u00102\u00cc\"\u001d".length();
                        var14_7 = 16;
                        var13_8 = -1;
lbl21:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = _x.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u00acHt(\u00f7\u00cc@\u00c2\u0084\u00d5\"\u008dNx\u000b\u00ea\u0010/,\u00e5\u0011\u00b1\u00bb\u00e5;D!\u00a0\u00a5\u009e\u00f2\u0014\u00a7";
                            var17_6 = "\u00acHt(\u00f7\u00cc@\u00c2\u0084\u00d5\"\u008dNx\u000b\u00ea\u0010/,\u00e5\u0011\u00b1\u00bb\u00e5;D!\u00a0\u00a5\u009e\u00f2\u0014\u00a7".length();
                            var14_7 = 16;
                            var13_8 = -1;
lbl35:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = _x.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var11_1.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl52:
                        // 1 sources

                        ** continue;
                    }
                }
                _x.b = var18_3;
                _x.c = new String[5];
                _x.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[4];
                var3_13 = 0;
                var4_14 = "v\u001f\u00bd.R\u00ea\u008cA\u0004g\u00fe\u00f1\u00eb\u00ad\u00fc\u00ee";
                var5_15 = "v\u001f\u00bd.R\u00ea\u008cA\u0004g\u00fe\u00f1\u00eb\u00ad\u00fc\u00ee".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl79:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00e5bh\u0006*\u00a4\u00b7j^\u00c2i-\u0019\u00c4\u00a8\u0007";
                    var5_15 = "\u00e5bh\u0006*\u00a4\u00b7j^\u00c2i-\u0019\u00c4\u00a8\u0007".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl92:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl105:
                // 1 sources

                ** continue;
            }
        }
        _x.e = var6_12;
        _x.f = new Integer[4];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String a(byte[] byArray) {
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

    private static String a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x5C0E;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/_x", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n11].getBytes("ISO-8859-1");
            _x.c[n11] = _x.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = _x.a(n10, l10);
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
            throw new RuntimeException("com/zelix/_x" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x7D34;
        if (f[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = e[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/_x", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _x.f[n11] = n12;
        }
        return f[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = _x.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/_x" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_x.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(_x.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

