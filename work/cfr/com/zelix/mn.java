/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.io.StringWriter;
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

public class mn {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    public static int Z(Object[] objectArray) {
        int n10;
        block14: {
            block13: {
                Object object;
                String string;
                CallSite callSite;
                long l10;
                String string2;
                String string3;
                block15: {
                    String string4;
                    block12: {
                        string3 = (String)objectArray[0];
                        string2 = (String)objectArray[1];
                        l10 = (Long)objectArray[2];
                        l10 = a ^ l10;
                        callSite = m44.a("n", (long)-5442474945108465074L, (long)l10);
                        try {
                            string4 = string3;
                            if (callSite != null) break block12;
                            if (string4 == null) break block13;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("n", (Object)illegalArgumentException, (long)-5670080223245314761L, (long)l10);
                        }
                        string4 = string3;
                    }
                    try {
                        try {
                            try {
                                n10 = string4.length();
                                if (callSite != null) break block14;
                                if (n10 <= 0) break block13;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("n", (Object)illegalArgumentException, (long)-5670080223245314761L, (long)l10);
                            }
                            string = string2;
                            if (l10 < 0L || callSite != null) break block15;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("n", (Object)illegalArgumentException, (long)-5670080223245314761L, (long)l10);
                        }
                        if (string == null) break block13;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("n", (Object)illegalArgumentException, (long)-5670080223245314761L, (long)l10);
                    }
                    string = string2;
                }
                try {
                    n10 = string.length();
                    if (callSite != null) break block14;
                    if (n10 <= 0) break block13;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)-5670080223245314761L, (long)l10);
                }
                int n11 = string2.length();
                Object object2 = -1;
                Object object3 = 0 - n11;
                block10: while (true) {
                    object3 += n11;
                    object3 = m44.a("q", string3, (Object)string2, (int)object3, (long)-6113304153155518160L, (long)l10);
                    ++object2;
                    object = object3;
                    do {
                        if (object != -1) continue block10;
                        object = object2;
                    } while (callSite != null);
                    break;
                }
                return object;
            }
            n10 = 0;
        }
        return n10;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String q(Object[] var0) {
        block11: {
            block9: {
                block10: {
                    var1_1 = (String)var0[0];
                    var2_2 = (String)var0[1];
                    var3_3 = (Long)var0[2];
                    var5_4 = (String)var0[3];
                    var3_3 = mn.a ^ var3_3;
                    var6_5 = m44.a("h", (long)-5564633323543614224L, (long)var3_3);
                    try {
                        try {
                            v0 = var1_1;
                            if (var6_5 != null) break block9;
                            if (v0 != null) break block10;
                        }
                        catch (IllegalArgumentException v1) {
                            throw m44.a("h", (Object)v1, (long)-5192132831424818295L, (long)var3_3);
                        }
                        throw new IllegalArgumentException((String)mn.a("i", (int)358, (long)(5179975664385873949L ^ var3_3)));
                    }
                    catch (IllegalArgumentException v2) {
                        throw m44.a("h", (Object)v2, (long)-5192132831424818295L, (long)var3_3);
                    }
                }
                v0 = var1_1;
            }
            var7_6 = v0.length();
            var8_7 = new StringWriter(var7_6);
            var9_8 = var1_1.toCharArray();
            var10_9 = var2_2.length();
            var11_10 /* !! */  = 0;
            var12_11 = false;
            block6: while (var11_10 /* !! */  < var7_6) {
                try {
                    v3 = var1_1;
                    v4 = var6_5;
                    if (var3_3 > 0L) {
                        if (v4 != null) break block11;
                        v4 = var6_5;
                    }
                    if (v4 != null) break block11;
                }
                catch (IllegalArgumentException v5) {
                    throw m44.a("h", (Object)v5, (long)-5192132831424818295L, (long)var3_3);
                }
                v6 /* !! */  = m44.a("w", (Object)v3, (Object)var2_2, (int)var11_10 /* !! */ , (long)-5938228218216069234L, (long)var3_3);
                v7 = -1;
                if (var3_3 <= 0L) ** GOTO lbl49
                if (v6 /* !! */  <= v7) ** GOTO lbl51
                m44.a("w", (Object)var8_7, (Object)var9_8, (int)var11_10 /* !! */ , (int)(var12_11 - var11_10 /* !! */ ), (long)-5924158126317473545L, (long)var3_3);
                v8 = var8_7;
                do {
                    m44.a("w", (Object)v8, (Object)var5_4, (long)-6042516953973821624L, (long)var3_3);
                    v6 /* !! */  = (CallSite)var12_11;
                    v7 = var10_9;
lbl49:
                    // 2 sources

                    var11_10 /* !! */  = (int)(v6 /* !! */  + v7);
                    if (var6_5 == null) continue block6;
lbl51:
                    // 3 sources

                    m44.a("w", (Object)var8_7, (Object)var9_8, (int)var11_10 /* !! */ , (int)(var7_6 - var11_10 /* !! */ ), (long)-5924158126317473545L, (long)var3_3);
                    v8 = var8_7;
                } while (var3_3 <= 0L);
            }
            v3 = m44.a("w", (Object)v8, (long)-6222810221295841044L, (long)var3_3);
        }
        return v3;
    }

    /*
     * Exception decompiling
     */
    public static int N(String var0, long var1_1, int var3_2, char[] var4_3) {
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int G(Object[] objectArray) {
        int n10;
        int n11;
        CallSite callSite;
        int n12;
        long l10;
        String string;
        block16: {
            string = (String)objectArray[0];
            int n13 = (Integer)objectArray[1];
            l10 = (Long)objectArray[2];
            l10 = a ^ l10;
            n12 = string.length();
            callSite = m44.a("l", (long)-285375322537532868L, (long)l10);
            try {
                try {
                    n11 = n12;
                    if (callSite != null) break block16;
                    if (n11 == 0) {
                        return -1;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)-487090881667883707L, (long)l10);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("l", (Object)illegalArgumentException, (long)-487090881667883707L, (long)l10);
            }
            n11 = n13;
        }
        int n14 = n11;
        char c10 = string.charAt(n14);
        block10: while (m44.a("l", (char)c10, (long)-203166781493398204L, (long)l10) != false) {
            try {
                try {
                    try {}
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)-487090881667883707L, (long)l10);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)-487090881667883707L, (long)l10);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("l", (Object)illegalArgumentException, (long)-487090881667883707L, (long)l10);
            }
            do {
                n10 = ++n14;
                CallSite callSite2 = callSite;
                if (l10 >= 0L) {
                    if (callSite2 != null) return n10;
                    callSite2 = callSite;
                }
                if (callSite2 == null) {
                    if (n10 == n12) {
                        return -1;
                    }
                    char c11 = c10 = string.charAt(n14);
                }
                if (callSite == null) continue block10;
            } while (l10 < 0L);
        }
        n10 = n14;
        return n10;
    }

    /*
     * Unable to fully structure code
     */
    public static boolean R(String var0, long var1_1, String var3_2) {
        block21: {
            block22: {
                block20: {
                    block18: {
                        block19: {
                            block16: {
                                block17: {
                                    var4_3 = (var1_1 = mn.a ^ var1_1) ^ 79409646617026L;
                                    var6_4 = m44.a("i", (long)-8104405013592567375L, (long)var1_1);
                                    try {
                                        try {
                                            try {
                                                v0 = var3_2.equals("*");
                                                if (var6_4 != null) break block16;
                                                if (v0) break block17;
                                            }
                                            catch (IllegalArgumentException v1) {
                                                throw m44.a("i", (Object)v1, (long)-8452980114189324600L, (long)var1_1);
                                            }
                                            v2 = var0.equals(var3_2);
                                            if (var1_1 < 0L || var6_4 != null) break block18;
                                        }
                                        catch (IllegalArgumentException v3) {
                                            throw m44.a("i", (Object)v3, (long)-8452980114189324600L, (long)var1_1);
                                        }
                                        if (v2 == 0) break block19;
                                    }
                                    catch (IllegalArgumentException v4) {
                                        throw m44.a("i", (Object)v4, (long)-8452980114189324600L, (long)var1_1);
                                    }
                                }
                                v0 = true;
                            }
                            return v0;
                        }
                        v2 = var0.indexOf("*");
                    }
                    try {
                        try {
                            try {
                                v5 = -1;
                                if (var1_1 <= 0L || var6_4 != null) break block20;
                                if (v2 != v5) break block21;
                            }
                            catch (IllegalArgumentException v6) {
                                throw m44.a("i", (Object)v6, (long)-8452980114189324600L, (long)var1_1);
                            }
                            v2 = var3_2.indexOf("*");
                            if (var6_4 != null) break block22;
                        }
                        catch (IllegalArgumentException v7) {
                            throw m44.a("i", (Object)v7, (long)-8452980114189324600L, (long)var1_1);
                        }
                        v5 = -1;
                    }
                    catch (IllegalArgumentException v8) {
                        throw m44.a("i", (Object)v8, (long)-8452980114189324600L, (long)var1_1);
                    }
                }
                try {
                    if (v2 != v5) break block21;
                    v2 = (int)var0.equals(var3_2);
                }
                catch (IllegalArgumentException v9) {
                    throw m44.a("i", (Object)v9, (long)-8452980114189324600L, (long)var1_1);
                }
            }
            return (boolean)v2;
        }
        var7_5 = new StringTokenizer(var3_2, "*", true);
        var8_6 = new String[var7_5.countTokens()];
        var9_7 = 0;
        while (var7_5.hasMoreTokens()) {
            var8_6[var9_7++] = var7_5.nextToken();
lbl62:
            // 2 sources

            ** while (var6_4 != null)
lbl63:
            // 1 sources

        }
lbl64:
        // 2 sources

        var10_8 = 0;
        var11_9 = 0;
        if (var1_1 <= 0L) ** GOTO lbl62
        return mn.R(var4_3, var0, var10_8, var8_6, var11_9);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String l(Object[] var0) {
        var2_1 = (String)var0[0];
        var5_2 = (Integer)var0[1];
        var6_3 = (Integer)var0[2];
        var3_4 = (Long)var0[3];
        var1_5 = ((Integer)var0[4]).intValue();
        var3_4 = mn.a ^ var3_4;
        var7_6 = var2_1.length();
        block2 : switch (var5_2) {
            case 76: {
                var8_7 = new StringBuilder(var2_1);
                var9_8 = var6_3 - var7_6;
                try {
                    for (var10_9 = 0; var10_9 < var9_8; ++var10_9) {
                        var8_7.append(var1_5);
                        if (var3_4 < 0L) break block2;
                    }
                }
                catch (IllegalArgumentException v0) {
                    throw m44.a("h", (Object)v0, (long)-6408091547782495383L, (long)var3_4);
                }
                if (var3_4 > 0L) break;
            }
            case 82: {
                var8_7 = new StringBuilder();
                var9_8 = var6_3 - var7_6;
                try {
                    for (var10_9 = 0; var10_9 < var9_8; ++var10_9) {
                        var8_7.append(var1_5);
                        if (var3_4 >= 0L) {
                            continue;
                        }
                        ** GOTO lbl38
                    }
                }
                catch (IllegalArgumentException v1) {
                    throw m44.a("h", (Object)v1, (long)-6408091547782495383L, (long)var3_4);
                }
                var8_7.append(var2_1);
lbl38:
                // 2 sources

                if (var3_4 >= 0L) break;
            }
            default: {
                throw new IllegalArgumentException((String)mn.a("i", (int)7123, (long)(5629931062411055691L ^ var3_4)));
            }
        }
        return var8_7.toString().substring(0, var6_3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean R(long var0, String var2_1, int var3_2, String[] var4_3, int var5_4) {
        block73: {
            block74: {
                block61: {
                    block62: {
                        block67: {
                            block66: {
                                block65: {
                                    block64: {
                                        block63: {
                                            block75: {
                                                block60: {
                                                    block54: {
                                                        block55: {
                                                            block57: {
                                                                block56: {
                                                                    var6_5 = (var0 = mn.a ^ var0) ^ 12775893549554L;
                                                                    var8_6 = m44.a("i", (long)1132405932457988481L, (long)var0);
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    v0 = var3_2;
                                                                                    v1 = var2_1.length();
                                                                                    if (var8_6 != null) break block54;
                                                                                    if (v0 < v1) break block55;
                                                                                }
                                                                                catch (IllegalArgumentException v2) {
                                                                                    throw m44.a("i", (Object)v2, (long)756808118478991096L, (long)var0);
                                                                                }
                                                                                v3 = var5_4;
                                                                                v4 = var4_3.length;
                                                                                if (var0 > 0L && var8_6 == null) {
                                                                                }
                                                                                ** GOTO lbl33
                                                                            }
                                                                            catch (IllegalArgumentException v5) {
                                                                                throw m44.a("i", (Object)v5, (long)756808118478991096L, (long)var0);
                                                                            }
                                                                            if (v3 < v4) break block56;
                                                                        }
                                                                        catch (IllegalArgumentException v6) {
                                                                            throw m44.a("i", (Object)v6, (long)756808118478991096L, (long)var0);
                                                                        }
                                                                        return true;
                                                                    }
                                                                    catch (IllegalArgumentException v7) {
                                                                        throw m44.a("i", (Object)v7, (long)756808118478991096L, (long)var0);
                                                                    }
                                                                }
                                                                do {
                                                                    block59: {
                                                                        block58: {
                                                                            v3 = var5_4;
                                                                            v4 = var4_3.length;
lbl33:
                                                                            // 2 sources

                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (v3 >= v4) break;
lbl37:
                                                                                        // 2 sources

                                                                                        while (true) {
                                                                                            v8 = var4_3[var5_4].equals("*");
                                                                                            if (var8_6 != null) break block57;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    catch (IllegalArgumentException v9) {
                                                                                        throw m44.a("i", (Object)v9, (long)756808118478991096L, (long)var0);
                                                                                    }
                                                                                    if (var8_6 != null) break block58;
                                                                                }
                                                                                catch (IllegalArgumentException v10) {
                                                                                    throw m44.a("i", (Object)v10, (long)756808118478991096L, (long)var0);
                                                                                }
                                                                                if (v8) break block59;
                                                                            }
                                                                            catch (IllegalArgumentException v11) {
                                                                                throw m44.a("i", (Object)v11, (long)756808118478991096L, (long)var0);
                                                                            }
                                                                            v12 = false;
                                                                        }
                                                                        return v12;
                                                                    }
                                                                    ++var5_4;
                                                                } while (var8_6 == null);
                                                                ** while (var0 < 0L)
lbl58:
                                                                // 1 sources

                                                                v8 = true;
                                                            }
                                                            return v8;
                                                        }
                                                        try {
                                                            v0 = var5_4;
                                                            if (var8_6 != null) break block60;
                                                            v1 = var4_3.length;
                                                        }
                                                        catch (IllegalArgumentException v13) {
                                                            throw m44.a("i", (Object)v13, (long)756808118478991096L, (long)var0);
                                                        }
                                                    }
                                                    if (v0 < v1) break block75;
                                                    v0 = false;
                                                }
                                                return v0;
                                            }
                                            var9_7 = var4_3[var5_4];
                                            try {
                                                try {
                                                    v14 = var9_7.equals("*");
                                                    if (var8_6 != null) break block61;
                                                    if (!v14) break block62;
                                                }
                                                catch (IllegalArgumentException v15) {
                                                    throw m44.a("i", (Object)v15, (long)756808118478991096L, (long)var0);
                                                }
lbl84:
                                                // 2 sources

                                                while (var9_7.equals("*")) {
                                                    break block63;
                                                }
                                                break block64;
                                            }
                                            catch (IllegalArgumentException v16) {
                                                throw m44.a("i", (Object)v16, (long)756808118478991096L, (long)var0);
                                            }
                                        }
                                        try {
                                            try {
                                                v17 = ++var5_4;
                                                v18 = var8_6;
                                                if (var0 <= 0L) ** GOTO lbl117
                                                if (v18 != null) break block65;
                                                v19 = var4_3.length;
                                                if (var8_6 == null) {
                                                }
                                                ** GOTO lbl132
                                            }
                                            catch (IllegalArgumentException v20) {
                                                throw m44.a("i", (Object)v20, (long)756808118478991096L, (long)var0);
                                            }
                                            if (v17 >= v19) break block64;
                                        }
                                        catch (IllegalArgumentException v21) {
                                            throw m44.a("i", (Object)v21, (long)756808118478991096L, (long)var0);
                                        }
                                        var9_7 = var4_3[var5_4];
                                        if (var8_6 == null) ** GOTO lbl84
                                    }
                                    v22 = var9_7;
                                    v23 = "*";
                                    if (var0 < 0L) ** GOTO lbl136
                                    v17 = (int)v22.equals(v23);
                                }
                                try {
                                    try {
                                        v18 = var8_6;
lbl117:
                                        // 2 sources

                                        if (var0 < 0L) ** GOTO lbl131
                                        if (v18 == null) {
                                            if (v17 == 0) break block66;
                                        }
                                        ** GOTO lbl130
                                    }
                                    catch (IllegalArgumentException v24) {
                                        throw m44.a("i", (Object)v24, (long)756808118478991096L, (long)var0);
                                    }
                                    return true;
                                }
                                catch (IllegalArgumentException v25) {
                                    throw m44.a("i", (Object)v25, (long)756808118478991096L, (long)var0);
                                }
                            }
                            block43: while (true) {
                                v17 = var3_2;
lbl130:
                                // 2 sources

                                v18 = var2_1;
lbl131:
                                // 2 sources

                                v19 = v18.length();
lbl132:
                                // 2 sources

                                if (v17 >= v19) ** GOTO lbl181
                                do {
                                    block71: {
                                        block72: {
                                            block68: {
                                                block70: {
                                                    block69: {
                                                        v22 = var2_1;
                                                        v23 = var9_7;
lbl136:
                                                        // 2 sources

                                                        var10_8 = m44.a("v", v22, (Object)v23, (int)var3_2, (long)1217734066478152447L, (long)var0);
                                                        try {
                                                            try {
                                                                v26 /* !! */  = var10_8;
                                                                v27 = var8_6;
                                                                if (var0 >= 0L) {
                                                                    if (v27 != null) break block67;
                                                                    v27 = var8_6;
                                                                }
                                                                if (v27 != null) break block68;
                                                            }
                                                            catch (IllegalArgumentException v28) {
                                                                throw m44.a("i", (Object)v28, (long)756808118478991096L, (long)var0);
                                                            }
                                                            if (v26 /* !! */  != -1) {
                                                            }
                                                            ** GOTO lbl170
                                                        }
                                                        catch (IllegalArgumentException v29) {
                                                            throw m44.a("i", (Object)v29, (long)756808118478991096L, (long)var0);
                                                        }
                                                        var3_2 = (boolean)var10_8;
                                                        var11_10 = mn.R(var6_5, var2_1, var3_2 + var9_7.length(), var4_3, var5_4 + 1);
                                                        try {
                                                            v30 = var11_10;
                                                            if (var8_6 != null) break block69;
                                                            if (!v30) break block70;
                                                        }
                                                        catch (IllegalArgumentException v31) {
                                                            throw m44.a("i", (Object)v31, (long)756808118478991096L, (long)var0);
                                                        }
                                                        v30 = true;
                                                    }
                                                    return v30;
                                                }
                                                try {
                                                    v32 = var8_6;
                                                    if (var0 < 0L) break block71;
                                                    if (v32 == null) break block72;
lbl170:
                                                    // 2 sources

                                                    v33 = false;
                                                }
                                                catch (IllegalArgumentException v34) {
                                                    throw m44.a("i", (Object)v34, (long)756808118478991096L, (long)var0);
                                                }
                                            }
                                            return v33;
                                        }
                                        ++var3_2;
                                        v32 = var8_6;
                                    }
                                    if (v32 == null) continue block43;
lbl181:
                                    // 2 sources

                                } while (var0 < 0L);
                                break;
                            }
                            v26 /* !! */  = (CallSite)false;
                        }
                        return (boolean)v26 /* !! */ ;
                    }
                    v14 = var2_1.regionMatches(var3_2, var9_7, 0, var9_7.length());
                }
                var10_9 = v14;
                try {
                    try {
                        v35 = var10_9;
                        if (var8_6 != null) break block73;
                        if (v35) break block74;
                    }
                    catch (IllegalArgumentException v36) {
                        throw m44.a("i", (Object)v36, (long)756808118478991096L, (long)var0);
                    }
                    return false;
                }
                catch (IllegalArgumentException v37) {
                    throw m44.a("i", (Object)v37, (long)756808118478991096L, (long)var0);
                }
            }
            v35 = mn.R(var6_5, var2_1, var3_2 += var9_7.length(), var4_3, var5_4 + 1);
        }
        return v35;
    }

    public static String a(Object[] objectArray) {
        StringBuilder stringBuilder;
        block4: {
            int n10 = (Integer)objectArray[0];
            long l10 = (Long)objectArray[1];
            char c10 = ((Integer)objectArray[2]).intValue();
            l10 = a ^ l10;
            StringBuilder stringBuilder2 = new StringBuilder(n10);
            try {
                for (int i10 = 0; i10 < n10; ++i10) {
                    stringBuilder = stringBuilder2.append(c10);
                    if (l10 >= 0L) {
                        continue;
                    }
                    break block4;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("j", (Object)illegalArgumentException, (long)-4907838527891906661L, (long)l10);
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder.toString();
    }

    /*
     * Exception decompiling
     */
    public static String c(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[TRYBLOCK]], but top level block is 15[SWITCH]
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

    public static int V(long l10, String string, char n10) {
        int n11;
        block13: {
            block12: {
                int n12;
                block16: {
                    String string2;
                    CallSite callSite;
                    block11: {
                        l10 = a ^ l10;
                        callSite = m44.a("k", (long)172680164694826067L, (long)l10);
                        try {
                            string2 = string;
                            if (callSite != null) break block11;
                            if (string2 == null) break block12;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("k", (Object)illegalArgumentException, (long)527728724553130794L, (long)l10);
                        }
                        string2 = string;
                    }
                    try {
                        n11 = string2.length();
                        if (callSite != null) break block13;
                        if (n11 <= 0) break block12;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("k", (Object)illegalArgumentException, (long)527728724553130794L, (long)l10);
                    }
                    char[] cArray = string.toCharArray();
                    int n13 = 0;
                    char[] cArray2 = cArray;
                    int n14 = cArray2.length;
                    int n15 = 0;
                    while (n15 < n14) {
                        CallSite callSite2;
                        block14: {
                            block15: {
                                block17: {
                                    int n16 = cArray2[n15];
                                    try {
                                        try {
                                            try {
                                                callSite2 = callSite;
                                                if (l10 <= 0L) break block14;
                                                if (callSite2 != null) break block15;
                                                n12 = n16;
                                                if (callSite != null) break block16;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw m44.a("k", (Object)illegalArgumentException, (long)527728724553130794L, (long)l10);
                                            }
                                            if (n12 != n10) break block17;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("k", (Object)illegalArgumentException, (long)527728724553130794L, (long)l10);
                                        }
                                        ++n13;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("k", (Object)illegalArgumentException, (long)527728724553130794L, (long)l10);
                                    }
                                }
                                ++n15;
                            }
                            callSite2 = callSite;
                        }
                        if (callSite2 == null) continue;
                    }
                    n12 = n13;
                }
                return n12;
            }
            n11 = 0;
        }
        return n11;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        mn.a = prr.a(3858629539945834432L, -7555685659023730048L, MethodHandles.lookup().lookupClass()).a(272213664172593L);
                        mn.d = new HashMap<K, V>(13);
                        var11 = mn.a ^ 87220031248921L;
                        var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var20_3 = new String[11];
                        var18_4 = 0;
                        var17_5 = "7\u009e\u00c9\u00d0\u0005o\u00deJ\u00cf\u00c3\u001a\u00a1C\u00c9J\u008fo\u008dd/@\u0093/\u00f4\u00f7\u00c1\u00e6\u00f1\u0094\u009a\u00bf\u00a3\u0010\f~\u0019;\u00db\u00c0\u0095P\u0097\u00e5[\to?\u0094\u00b8\u0010\u0017\u00ed\u00ba|^\u00fe\u00df\u008b\u0098t\u00f5#>?m\u0095(\u00ef\u00d2\u00cf\u0081\u0082\u008c\u0080$xQ6c\u0012\u0093/\u00a4\u0012\u0081\u00ea\u00c3\u00a2\nx#\u007f\u00a7\u000e\u00f2\u00ccAe\u00c1\u009e\u00a5\u00fa\u00c4\u00e51s\u00e3\u0010J\u00ca1\u001c\u00a4\u0011\u001a\u00e5\u00c6\u00c5\u00c9\u0002\u00ed\u00f2\u00eb\u00f8\u0010\f$\u00e3\u00f0H\u00a5\u0002\u00b0\u008bD\u00e6#ds\fy\u0010\u00ee\u00ba\u00db\u00d6}\u0012+\u00e4F\u0086\u00ba|7\u00f6\u00b08\u0010g`\u0099\u00c0\u0004\u00c0\u00cd\u00c2G\u00f4\u00c8\u009c J\u00ccR\u0010\u009a\b\u00d3\u00f1\u001c1/\u0017\u0004\u009b\u00b1I\u001f\u009f\u00c4\u00fc";
                        var19_6 = "7\u009e\u00c9\u00d0\u0005o\u00deJ\u00cf\u00c3\u001a\u00a1C\u00c9J\u008fo\u008dd/@\u0093/\u00f4\u00f7\u00c1\u00e6\u00f1\u0094\u009a\u00bf\u00a3\u0010\f~\u0019;\u00db\u00c0\u0095P\u0097\u00e5[\to?\u0094\u00b8\u0010\u0017\u00ed\u00ba|^\u00fe\u00df\u008b\u0098t\u00f5#>?m\u0095(\u00ef\u00d2\u00cf\u0081\u0082\u008c\u0080$xQ6c\u0012\u0093/\u00a4\u0012\u0081\u00ea\u00c3\u00a2\nx#\u007f\u00a7\u000e\u00f2\u00ccAe\u00c1\u009e\u00a5\u00fa\u00c4\u00e51s\u00e3\u0010J\u00ca1\u001c\u00a4\u0011\u001a\u00e5\u00c6\u00c5\u00c9\u0002\u00ed\u00f2\u00eb\u00f8\u0010\f$\u00e3\u00f0H\u00a5\u0002\u00b0\u008bD\u00e6#ds\fy\u0010\u00ee\u00ba\u00db\u00d6}\u0012+\u00e4F\u0086\u00ba|7\u00f6\u00b08\u0010g`\u0099\u00c0\u0004\u00c0\u00cd\u00c2G\u00f4\u00c8\u009c J\u00ccR\u0010\u009a\b\u00d3\u00f1\u001c1/\u0017\u0004\u009b\u00b1I\u001f\u009f\u00c4\u00fc".length();
                        var16_7 = 32;
                        var15_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = mn.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\f\u00a7\u0014]\u00d6\u00b7k\u008a\u0019\u00a9\u00e4u\u009a\u00c4$\u00b2\u0010,\u00f8\u00e8\u00bd\u00f9\u0087\u00d7\u00a0\u0018Z\u00e9\u00e5`\u000e\u0002'";
                            var19_6 = "\f\u00a7\u0014]\u00d6\u00b7k\u008a\u0019\u00a9\u00e4u\u009a\u00c4$\u00b2\u0010,\u00f8\u00e8\u00bd\u00f9\u0087\u00d7\u00a0\u0018Z\u00e9\u00e5`\u000e\u0002'".length();
                            var16_7 = 16;
                            var15_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = mn.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                mn.b = var20_3;
                mn.c = new String[11];
                mn.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[4];
                var3_13 = 0;
                var4_14 = "\u00bfs\u00a8hW\u00a6/\u0012\u009a\u00aeg \u00128\u0082\u00da";
                var5_15 = "\u00bfs\u00a8hW\u00a6/\u0012\u009a\u00aeg \u00128\u0082\u00da".length();
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
lbl78:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00a8\u00cbAHV\u0006\u00c4\u0082:\u00f8\u00f8\u00ca\u0003+O-";
                    var5_15 = "\u00a8\u00cbAHV\u0006\u00c4\u0082:\u00f8\u00f8\u00ca\u0003+O-".length();
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
lbl91:
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
lbl104:
                // 1 sources

                ** continue;
            }
        }
        mn.e = var6_12;
        mn.f = new Integer[4];
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x65FC;
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
                throw new RuntimeException("com/zelix/mn", exception);
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
            mn.c[n11] = mn.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = mn.a(n10, l10);
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
            throw new RuntimeException("com/zelix/mn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0xC59;
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
                throw new RuntimeException("com/zelix/mn", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            mn.f[n11] = n12;
        }
        return f[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = mn.b(n10, l10);
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
            throw new RuntimeException("com/zelix/mn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(mn.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(mn.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

