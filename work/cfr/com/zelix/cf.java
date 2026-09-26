/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._p;
import com.zelix.cv;
import com.zelix.df;
import com.zelix.f33;
import com.zelix.ho;
import com.zelix.l6q;
import com.zelix.lk0;
import com.zelix.lmg;
import com.zelix.m44;
import com.zelix.me;
import com.zelix.mn;
import com.zelix.ol;
import com.zelix.prr;
import com.zelix.r;
import com.zelix.z5;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cf {
    public static final String W;
    public static final char[] Z;
    public static final char[] z;
    private static double c;
    public static final char[] s;
    private static final int[] l;
    public static final char[] Q;
    public static final char[] u;
    private static final long a;
    private static final String[] b;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Long[] g;
    private static final Map h;

    public static String z(Object[] objectArray) {
        String string;
        block14: {
            Properties properties;
            CallSite callSite;
            long l10;
            Properties properties2;
            long l11;
            String string2;
            String string3;
            block12: {
                block13: {
                    string3 = (String)objectArray[0];
                    string2 = (String)objectArray[1];
                    l11 = (Long)objectArray[2];
                    properties2 = (Properties)objectArray[3];
                    l10 = (l11 = a ^ l11) ^ 0x721909BCB537L;
                    callSite = m44.a("m", (long)-6698227309367018179L, (long)l11);
                    try {
                        try {
                            properties = properties2;
                            if (callSite != null) break block12;
                            if (properties != null) break block13;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("m", (Object)illegalArgumentException, (long)-4838872829206943133L, (long)l11);
                        }
                        return string2;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("m", (Object)illegalArgumentException, (long)-4838872829206943133L, (long)l11);
                    }
                }
                properties = properties2;
            }
            CallSite callSite2 = m44.a("r", (Object)properties, (long)-4949899249701749847L, (long)l11);
            while (callSite2.hasMoreElements()) {
                CallSite callSite3;
                block16: {
                    block17: {
                        CallSite callSite4;
                        block15: {
                            String string4 = (String)callSite2.nextElement();
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = string4;
                            objectArray2[0] = l10;
                            CallSite callSite5 = m44.a("m", (Object)objectArray2, (long)-4711672204481111172L, (long)l11);
                            try {
                                try {
                                    try {
                                        string = string3;
                                        CallSite callSite6 = callSite;
                                        if (l11 > 0L) {
                                            if (callSite6 != null) break block14;
                                            callSite6 = callSite;
                                        }
                                        if (callSite6 != null) break block15;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("m", (Object)illegalArgumentException, (long)-4838872829206943133L, (long)l11);
                                    }
                                    if (l11 <= 0L) break block16;
                                    if (!string.equals(callSite5)) break block17;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("m", (Object)illegalArgumentException, (long)-4838872829206943133L, (long)l11);
                                }
                                callSite4 = m44.a("r", (Object)properties2, (Object)string4, (long)-5091752651309305637L, (long)l11);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("m", (Object)illegalArgumentException, (long)-4838872829206943133L, (long)l11);
                            }
                        }
                        return callSite4;
                    }
                    callSite3 = callSite;
                }
                if (callSite3 == null) continue;
            }
            string = string2;
        }
        return string;
    }

    public static boolean t(Object[] objectArray) {
        boolean bl2;
        block9: {
            long l10 = (Long)objectArray[0];
            Object[] objectArray2 = (Object[])objectArray[1];
            long l11 = l10 = a ^ l10;
            long l12 = l11 ^ 0x17EC3E00D873L;
            long l13 = l11 ^ 0x5E32EA67F809L;
            int n10 = (int)(l13 >>> 32);
            int n11 = (int)(l13 << 32 >>> 48);
            int n12 = (int)(l13 << 48 >>> 48);
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l12;
            objectArray3[0] = cf.x(objectArray2.length, n10, (char)n11, (short)n12);
            CallSite callSite = m44.a("k", (Object)objectArray3, (long)1472693288923169592L, (long)l10);
            Object[] objectArray4 = objectArray2;
            CallSite callSite2 = m44.a("k", (long)1240036206317473539L, (long)l10);
            int n13 = objectArray4.length;
            int n14 = 0;
            while (n14 < n13) {
                CallSite callSite3;
                block7: {
                    block8: {
                        block10: {
                            Object object = objectArray4[n14];
                            try {
                                try {
                                    try {
                                        callSite3 = callSite2;
                                        if (l10 <= 0L) break block7;
                                        if (callSite3 != null) break block8;
                                        bl2 = callSite.add(object);
                                        if (callSite2 != null) break block9;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("k", (Object)illegalArgumentException, (long)1073753715550328925L, (long)l10);
                                    }
                                    if (bl2) break block10;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("k", (Object)illegalArgumentException, (long)1073753715550328925L, (long)l10);
                                }
                                return false;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("k", (Object)illegalArgumentException, (long)1073753715550328925L, (long)l10);
                            }
                        }
                        ++n14;
                    }
                    callSite3 = callSite2;
                }
                if (callSite3 == null) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String k(byte[] var0, int var1_1, byte var2_2, int var3_3) {
        var4_4 = ((long)var1_1 << 32 | (long)var2_2 << 56 >>> 32 | (long)var3_3 << 40 >>> 40) ^ cf.a;
        var7_5 = 0;
        var8_6 = var0.length;
        var9_7 = new char[var8_6];
        var10_8 = 0;
        var6_9 = m44.a("k", (long)-9021425390177444613L, (long)var4_4);
        while (var10_8 < var8_6) {
            block19: {
                block20: {
                    block22: {
                        block21: {
                            block17: {
                                var11_10 = 255 & var0[var10_8];
                                try {
                                    block18: {
                                        try {
                                            try {
                                                v0 = var11_10;
                                                v1 = 192;
                                                v2 = var6_9;
                                                if (var2_2 <= 0) {
                                                    if (v2 != null) break block17;
                                                    if (v0 >= v1) break block18;
                                                }
                                                ** GOTO lbl38
                                            }
                                            catch (IllegalArgumentException v3) {
                                                throw m44.a("k", (Object)v3, (long)-7125056989251007579L, (long)var4_4);
                                            }
                                            var9_7[var7_5++] = (char)var11_10;
                                            v4 = var6_9;
                                            if (var1_1 < 0) break block19;
                                            if (v4 == null) break block20;
                                        }
                                        catch (IllegalArgumentException v5) {
                                            throw m44.a("k", (Object)v5, (long)-7125056989251007579L, (long)var4_4);
                                        }
                                    }
                                    v0 = var11_10;
                                    v1 = 224;
                                }
                                catch (IllegalArgumentException v6) {
                                    throw m44.a("k", (Object)v6, (long)-7125056989251007579L, (long)var4_4);
                                }
                            }
                            try {
                                v2 = var6_9;
lbl38:
                                // 2 sources

                                if (var3_3 < 0) ** GOTO lbl62
                                if (v2 != null) break block21;
                                if (v0 < v1) {
                                }
                                ** GOTO lbl53
                            }
                            catch (IllegalArgumentException v7) {
                                throw m44.a("k", (Object)v7, (long)-7125056989251007579L, (long)var4_4);
                            }
                            var12_11 = (char)((char)(var11_10 & 31) << 6);
                            var11_10 = var0[++var10_8];
                            var12_11 = (char)(var12_11 | (char)(var11_10 & 63));
                            try {
                                var9_7[var7_5++] = var12_11;
                                v4 = var6_9;
                                if (var2_2 > 0) break block19;
                                if (v4 == null) break block20;
lbl53:
                                // 2 sources

                                v0 = var10_8;
                                v1 = var8_6 - 2;
                            }
                            catch (IllegalArgumentException v8) {
                                throw m44.a("k", (Object)v8, (long)-7125056989251007579L, (long)var4_4);
                            }
                        }
                        try {
                            try {
                                v2 = var6_9;
lbl62:
                                // 2 sources

                                if (v2 != null) break block22;
                                if (v0 >= v1) break block20;
                            }
                            catch (IllegalArgumentException v9) {
                                throw m44.a("k", (Object)v9, (long)-7125056989251007579L, (long)var4_4);
                            }
                            v0 = (char)(var11_10 & 15);
                            v1 = 12;
                        }
                        catch (IllegalArgumentException v10) {
                            throw m44.a("k", (Object)v10, (long)-7125056989251007579L, (long)var4_4);
                        }
                    }
                    var12_11 = (char)(v0 << v1);
                    var11_10 = var0[++var10_8];
                    var12_11 = (char)(var12_11 | (char)(var11_10 & 63) << 6);
                    var11_10 = var0[++var10_8];
                    var12_11 = (char)(var12_11 | (char)(var11_10 & 63));
                    var9_7[var7_5++] = var12_11;
                }
                ++var10_8;
                v4 = var6_9;
            }
            if (v4 == null) continue;
        }
        return new String(var9_7, 0, var7_5);
    }

    public static Object q(Object[] objectArray) {
        Object object;
        block6: {
            Object object2;
            block7: {
                Object object3 = objectArray[0];
                object2 = objectArray[1];
                _p _p2 = (_p)objectArray[2];
                long l10 = (Long)objectArray[3];
                long l11 = (l10 = a ^ l10) ^ 0x397202E084ABL;
                CallSite callSite = m44.a("l", (long)5774183915359718932L, (long)l10);
                try {
                    object = _p2;
                    if (callSite != null) break block6;
                    if (object == null) break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)5760603794035792202L, (long)l10);
                }
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = l11;
                objectArray2[1] = object2;
                objectArray2[0] = object3;
                CallSite callSite2 = m44.a("s", (Object)_p2, (Object)objectArray2, (long)5406544372727023648L, (long)l10);
                try {
                    try {
                        object = callSite2;
                        if (callSite != null) break block6;
                        if (object == null) break block7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)5760603794035792202L, (long)l10);
                    }
                    return callSite2;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)5760603794035792202L, (long)l10);
                }
            }
            object = object2;
        }
        return object;
    }

    /*
     * Exception decompiling
     */
    public static void d(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [28[DOLOOP]], but top level block is 9[TRYBLOCK]
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

    public static lmg v(Object[] objectArray) {
        lmg lmg2 = (lmg)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x2161D3DE028EL;
        lmg lmg3 = new lmg(lmg2, l11);
        return lmg3;
    }

    public static int y(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x19453A907F21L;
        return cf.v(l11, string).length;
    }

    public static int p(int n10) {
        return n10 & 0xFFFF;
    }

    /*
     * Exception decompiling
     */
    public static boolean W(Object[] var0) {
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
     * Unable to fully structure code
     */
    public static Random Z(Object[] var0) {
        block8: {
            block7: {
                var1_1 = (Integer)var0[0];
                var2_2 = (Long)var0[1];
                var4_3 = (var2_2 = cf.a ^ var2_2) ^ 120365419507509L;
                v0 = new Object[2];
                v0[1] = var1_1;
                v0[0] = var4_3;
                var7_4 = m44.a("k", (Object)v0, (long)-4854182604320920480L, (long)var2_2);
                var6_5 = m44.a("k", (long)-4968301554263087813L, (long)var2_2);
                try {
                    v1 = m44.a("o", (long)-6370820698500878317L, (long)var2_2);
                    if (var6_5 != null) break block7;
                    if (v1 != false) {
                    }
                    ** GOTO lbl23
                }
                catch (IllegalArgumentException v2) {
                    throw m44.a("k", (Object)v2, (long)-6566583591031033243L, (long)var2_2);
                }
                var9_6 = new Random((long)var7_4);
                try {
                    if (var6_5 == null) break block8;
lbl23:
                    // 2 sources

                    v1 = m44.a("o", (long)-6561154831692364999L, (long)var2_2);
                }
                catch (IllegalArgumentException v3) {
                    throw m44.a("k", (Object)v3, (long)-6566583591031033243L, (long)var2_2);
                }
            }
            try {
                v4 = v1 != false ? new Random() : new SecureRandom();
            }
            catch (IllegalArgumentException v5) {
                throw m44.a("k", (Object)v5, (long)-6566583591031033243L, (long)var2_2);
            }
            var9_6 = v4;
            m44.a("t", (Object)var9_6, (long)var7_4, (long)-4981132158123351842L, (long)var2_2);
        }
        return var9_6;
    }

    public static ol X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        ol ol2 = (ol)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x1D9AC0AB5565L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("r", (Object)ol2, (Object)objectArray2, (long)-4023550921342601489L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String u(Object[] var0) {
        block18: {
            block17: {
                block15: {
                    block16: {
                        block14: {
                            block12: {
                                block13: {
                                    var2_1 = (Long)var0[0];
                                    var1_2 = (String)var0[1];
                                    var4_3 = (var2_1 = cf.a ^ var2_1) ^ 46641418460686L;
                                    var7_4 = var1_2;
                                    var8_5 = 0;
                                    var6_6 = m44.a("o", (long)2132835150798586799L, (long)var2_1);
                                    try {
                                        v0 = var7_4.startsWith("[");
                                        if (var6_6 != null) break block12;
                                        if (v0 == 0) break block13;
                                    }
                                    catch (IllegalArgumentException v1) {
                                        throw m44.a("o", (Object)v1, (long)165112872251036913L, (long)var2_1);
                                    }
                                    var8_5 = mn.V(var4_3, (String)var7_4, "[".charAt(0));
                                    var7_4 = var7_4.substring(var8_5);
                                }
                                v0 = var7_4.endsWith(";");
                            }
                            try {
                                v2 = var6_6;
                                if (var2_1 < 0L) ** GOTO lbl42
                                if (v2 != null) break block14;
                                if (v0 != 0) {
                                }
                                ** GOTO lbl35
                            }
                            catch (IllegalArgumentException v3) {
                                throw m44.a("o", (Object)v3, (long)165112872251036913L, (long)var2_1);
                            }
                            var7_4 = var7_4.substring(1, var7_4.length() - 1);
                            try {
                                v4 = var6_6;
                                if (var2_1 < 0L) break block15;
                                if (v4 == null) break block16;
lbl35:
                                // 2 sources

                                v0 = var7_4.length();
                            }
                            catch (IllegalArgumentException v5) {
                                throw m44.a("o", (Object)v5, (long)165112872251036913L, (long)var2_1);
                            }
                        }
                        try {
                            v2 = var6_6;
lbl42:
                            // 2 sources

                            if (v2 != null) break block17;
                            if (v0 != 1) break block16;
                        }
                        catch (IllegalArgumentException v6) {
                            throw m44.a("o", (Object)v6, (long)165112872251036913L, (long)var2_1);
                        }
                        var7_4 = m44.a("o", (Object)new Object[]{var7_4}, (long)1895080594256334902L, (long)var2_1);
                    }
                    v4 = var7_4.replace('/', '.');
                }
                var7_4 = v4;
                v0 = var9_7 = 0;
            }
            block8: while (var9_7 < var8_5) {
                v7 = (String)var7_4 + (String)cf.a("y", (int)22673, (long)(4595212119093245364L ^ var2_1));
                if (var2_1 < 0L) ** GOTO lbl62
                if (var6_6 != null) break block18;
                var7_4 = v7;
                ++var9_7;
                do {
                    v7 = var6_6;
lbl62:
                    // 2 sources

                    if (v7 == null) continue block8;
                } while (var2_1 <= 0L);
            }
            v8 = var7_4;
        }
        return v8;
    }

    public static HashSet f(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        try {
            if (m44.a("j", (long)5862363442036459230L, (long)l10) != false) {
                return new LinkedHashSet(n10);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("n", (Object)illegalArgumentException, (long)5914298516109804712L, (long)l10);
        }
        return new HashSet(n10);
    }

    public static Set C(Object[] objectArray) {
        CallSite callSite;
        block6: {
            Object[] objectArray2 = (Object[])objectArray[0];
            long l10 = (Long)objectArray[1];
            long l11 = l10 = a ^ l10;
            long l12 = l11 ^ 0x361F44C7207EL;
            long l13 = l11 ^ 0x7FC190A00004L;
            int n10 = (int)(l13 >>> 32);
            int n11 = (int)(l13 << 32 >>> 48);
            int n12 = (int)(l13 << 48 >>> 48);
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l12;
            objectArray3[0] = cf.x(objectArray2.length, n10, (char)n11, (short)n12);
            CallSite callSite2 = m44.a("n", (Object)objectArray3, (long)-1405915500246336715L, (long)l10);
            Object[] objectArray4 = objectArray2;
            int n13 = objectArray4.length;
            CallSite callSite3 = m44.a("n", (long)-1641456857192401138L, (long)l10);
            int n14 = 0;
            while (n14 < n13) {
                CallSite callSite4;
                block7: {
                    block8: {
                        block9: {
                            Object object = objectArray4[n14];
                            callSite = callSite2;
                            Object object2 = callSite3;
                            if (l10 > 0L) {
                                if (object2 != null) break block6;
                                object2 = object;
                            }
                            boolean bl2 = callSite.add(object2);
                            try {
                                try {
                                    callSite4 = callSite3;
                                    if (l10 < 0L) break block7;
                                    if (callSite4 != null) break block8;
                                    if (bl2) break block9;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("n", (Object)illegalArgumentException, (long)-654257093512667056L, (long)l10);
                                }
                                throw new IllegalArgumentException((String)((Object)cf.a("y", (int)4794, (long)(0x73A05F8062B5CB13L ^ l10))));
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("n", (Object)illegalArgumentException, (long)-654257093512667056L, (long)l10);
                            }
                        }
                        ++n14;
                    }
                    callSite4 = callSite3;
                }
                if (callSite4 == null) continue;
            }
            callSite = callSite2;
        }
        return callSite;
    }

    public static HashMap I(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            if (m44.a("o", (long)9015724759496190619L, (long)l10) != false) {
                return new LinkedHashMap();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("k", (Object)illegalArgumentException, (long)9103686558552123629L, (long)l10);
        }
        return new HashMap();
    }

    public static HashMap E(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        try {
            if (m44.a("h", (long)2216124283406158148L, (long)l10) != false) {
                return new LinkedHashMap(n10);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("l", (Object)illegalArgumentException, (long)2128445727041588018L, (long)l10);
        }
        return new HashMap(n10);
    }

    public static byte[] S(Object[] objectArray) {
        byte[] byArray;
        block4: {
            String string = (String)objectArray[0];
            String string2 = (String)objectArray[1];
            long l10 = (Long)objectArray[2];
            long l11 = (l10 = a ^ l10) ^ 0x23956E30063CL;
            int n10 = string.length();
            byte[] byArray2 = new byte[n10 / 2];
            int n11 = 0;
            try {
                for (int i10 = 0; i10 < n10; i10 += 2) {
                    byArray = byArray2;
                    if (l10 > 0L) {
                        int n12 = n11++;
                        Object[] objectArray2 = new Object[3];
                        objectArray2[2] = string2;
                        objectArray2[1] = l11;
                        objectArray2[0] = string.substring(i10, i10 + 2);
                        byArray[n12] = (byte)((int)m44.a("l", (Object)objectArray2, (long)1436158641186232387L, (long)l10));
                        continue;
                    }
                    break block4;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("l", (Object)illegalArgumentException, (long)858466669514333522L, (long)l10);
            }
            byArray = byArray2;
        }
        return byArray;
    }

    public static r t(Object[] objectArray) {
        String string = (String)objectArray[0];
        Collection collection = (Collection)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x7DF9ADBF678DL;
        long l13 = l11 ^ 0x6BC93B9EE8F3L;
        try {
            if (m44.a("o", (long)1654547983970238835L, (long)l10) != false) {
                return new z5(string, l13, collection);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("k", (Object)illegalArgumentException, (long)1566867806340449029L, (long)l10);
        }
        return new cv(l12, string, collection);
    }

    public static String N(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x270AA783DF72L;
        String string = Integer.toHexString(n10);
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = 48;
        objectArray2[3] = l11;
        objectArray2[2] = 4;
        objectArray2[1] = 82;
        objectArray2[0] = string;
        return (String)((Object)cf.a("y", (int)19470, (long)(0x3ABA67255CA1C02CL ^ l10))) + (String)((Object)m44.a("h", (Object)objectArray2, (long)-4887042443365671451L, (long)l10));
    }

    public static long B(Object[] objectArray) {
        long l10;
        block15: {
            Object object;
            block14: {
                long l11;
                Object object2;
                block16: {
                    int n10;
                    long l12;
                    block12: {
                        CallSite callSite;
                        block13: {
                            String string = (String)objectArray[0];
                            l12 = (Long)objectArray[1];
                            l12 = a ^ l12;
                            char[] cArray = string.toCharArray();
                            object = 0L;
                            callSite = m44.a("j", (long)5455093051183814018L, (long)l12);
                            try {
                                n10 = cArray.length;
                                if (callSite != null) break block12;
                                if (n10 <= 0) break block13;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("j", (Object)illegalArgumentException, (long)6082007078997344988L, (long)l12);
                            }
                            int n11 = 0;
                            block8: while (n11 < cArray.length) {
                                object = cf.b("a", (int)28647, (long)(0x58298BA27BA483D3L ^ l12)) * object + (long)cArray[n11];
                                try {
                                    ++n11;
                                    do {
                                        CallSite callSite2 = callSite;
                                        if (l12 > 0L) {
                                            if (callSite2 != null) break block14;
                                            callSite2 = callSite;
                                        }
                                        if (callSite2 == null) continue block8;
                                    } while (l12 < 0L);
                                    break;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("j", (Object)illegalArgumentException, (long)6082007078997344988L, (long)l12);
                                }
                            }
                        }
                        try {
                            l10 = object;
                            if (l12 <= 0L) break block15;
                            object2 = 0L;
                            if (callSite != null) break block16;
                            long l13 = l10 - object2;
                            n10 = l13 == 0L ? 0 : (l13 < 0L ? -1 : 1);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("j", (Object)illegalArgumentException, (long)6082007078997344988L, (long)l12);
                        }
                    }
                    try {
                        if (n10 >= 0) break block14;
                        l11 = object;
                        object2 = cf.b("a", (int)29385, (long)(0x514440080B1EFCL ^ l12));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("j", (Object)illegalArgumentException, (long)6082007078997344988L, (long)l12);
                    }
                }
                l10 = l11 * object2;
                break block15;
            }
            l10 = object;
        }
        return l10;
    }

    public static String v(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x6A92EB78E52L;
        long l13 = l11 ^ 0x236590743DE6L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l13;
        objectArray2[0] = n10;
        CallSite callSite = m44.a("h", (Object)objectArray2, (long)-6244164244768825290L, (long)l10);
        reference var9_6 = callSite / 16;
        reference var10_7 = callSite % 16;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l12;
        objectArray3[0] = (int)var9_6;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l12;
        objectArray4[0] = (int)var10_7;
        return (String)((Object)m44.a("h", (Object)objectArray3, (long)-6193754716543382552L, (long)l10)) + (String)((Object)m44.a("h", (Object)objectArray4, (long)-6193754716543382552L, (long)l10));
    }

    public static Object J(long l10, Object object, Map map) {
        Object object2;
        block6: {
            block7: {
                l10 = a ^ l10;
                CallSite callSite = m44.a("o", (long)-5897057865329692641L, (long)l10);
                try {
                    object2 = map;
                    if (callSite != null) break block6;
                    if (object2 == null) break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("o", (Object)illegalArgumentException, (long)-5621985398053492927L, (long)l10);
                }
                Object v10 = map.get(object);
                try {
                    try {
                        object2 = v10;
                        if (callSite != null) break block6;
                        if (object2 == null) break block7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("o", (Object)illegalArgumentException, (long)-5621985398053492927L, (long)l10);
                    }
                    return v10;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("o", (Object)illegalArgumentException, (long)-5621985398053492927L, (long)l10);
                }
            }
            object2 = object;
        }
        return object2;
    }

    public static void I(Object[] objectArray) {
        char[] cArray = (char[])objectArray[0];
        int n10 = (Integer)objectArray[1];
        int n11 = (Integer)objectArray[2];
        char c10 = cArray[n10];
        cArray[n10] = cArray[n11];
        cArray[n11] = c10;
    }

    public static String r(Object[] objectArray) {
        String string;
        block17: {
            CallSite callSite;
            Object object;
            Object object2;
            Map map = (Map)objectArray[0];
            long l10 = (Long)objectArray[1];
            String string2 = (String)objectArray[2];
            String string3 = (String)objectArray[3];
            long l11 = (l10 = a ^ l10) ^ 0x42B581F3F58BL;
            Object object3 = map.entrySet().iterator();
            CallSite callSite2 = m44.a("i", (long)-2038110361527976575L, (long)l10);
            block10: while (object3.hasNext()) {
                object2 = object3.next();
                do {
                    block16: {
                        String string4;
                        block15: {
                            object = object2;
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = (String)object.getKey();
                            objectArray2[0] = l11;
                            callSite = m44.a("i", (Object)objectArray2, (long)-134835604249830464L, (long)l10);
                            try {
                                try {
                                    string4 = string2;
                                    CallSite callSite3 = callSite2;
                                    if (l10 > 0L) {
                                        if (callSite3 != null) break block15;
                                        callSite3 = callSite;
                                    }
                                    if (!string4.equals(callSite3)) break block16;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("i", (Object)illegalArgumentException, (long)-259820782033835297L, (long)l10);
                                }
                                string4 = (String)object.getValue();
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("i", (Object)illegalArgumentException, (long)-259820782033835297L, (long)l10);
                            }
                        }
                        return string4;
                    }
                    if (callSite2 == null) continue block10;
                    object2 = m44.a("v", (Object)m44.a("i", (long)-2051095825694921473L, (long)l10), (long)-292069359054832875L, (long)l10);
                } while (l10 <= 0L);
            }
            object3 = object2;
            while (object3.hasMoreElements()) {
                CallSite callSite4;
                block19: {
                    block20: {
                        CallSite callSite5;
                        block18: {
                            object = (String)object3.nextElement();
                            Object[] objectArray3 = new Object[2];
                            objectArray3[1] = object;
                            objectArray3[0] = l11;
                            callSite = m44.a("i", (Object)objectArray3, (long)-134835604249830464L, (long)l10);
                            try {
                                try {
                                    try {
                                        string = string2;
                                        CallSite callSite6 = callSite2;
                                        if (l10 > 0L) {
                                            if (callSite6 != null) break block17;
                                            callSite6 = callSite2;
                                        }
                                        if (callSite6 != null) break block18;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("i", (Object)illegalArgumentException, (long)-259820782033835297L, (long)l10);
                                    }
                                    if (l10 <= 0L) break block19;
                                    if (!string.equals(callSite)) break block20;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("i", (Object)illegalArgumentException, (long)-259820782033835297L, (long)l10);
                                }
                                callSite5 = m44.a("i", (Object)object, (long)-2078164537558202217L, (long)l10);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("i", (Object)illegalArgumentException, (long)-259820782033835297L, (long)l10);
                            }
                        }
                        return callSite5;
                    }
                    callSite4 = callSite2;
                }
                if (callSite4 == null) continue;
            }
            string = string3;
        }
        return string;
    }

    public static String k(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x5D14FE5A5A31L;
        int n10 = (int)(l12 >>> 32);
        int n11 = (int)(l12 << 32 >>> 48);
        int n12 = (int)(l12 << 48 >>> 48);
        long l13 = l11 ^ 0x425CBD5E5D6CL;
        try {
            Object[] objectArray2 = new Object[5];
            objectArray2[4] = cf.a("y", (int)10629, (long)(0x5C84E7995E8AEB24L ^ l10));
            objectArray2[3] = n12;
            objectArray2[2] = n11;
            objectArray2[1] = n10;
            objectArray2[0] = string;
            return m44.a("o", (Object)objectArray2, (long)8130786749919379653L, (long)l10);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            lk0.t(false, new String[]{m44.a("p", (Object)noSuchAlgorithmException, (long)8286030095189733620L, (long)l10)}, l13);
            return "";
        }
    }

    public static void F(Object[] objectArray) {
        int[] nArray = (int[])objectArray[0];
        int n10 = (Integer)objectArray[1];
        int n11 = (Integer)objectArray[2];
        int n12 = nArray[n10];
        nArray[n10] = nArray[n11];
        nArray[n11] = n12;
    }

    public static boolean E(Object[] objectArray) {
        boolean bl2;
        block10: {
            List list = (List)objectArray[0];
            List list2 = (List)objectArray[1];
            long l10 = (Long)objectArray[2];
            long l11 = l10 = a ^ l10;
            long l12 = l11 ^ 0x399E1C4EDF06L;
            long l13 = l11 ^ 0x7040C829FF7CL;
            int n10 = (int)(l13 >>> 32);
            int n11 = (int)(l13 << 32 >>> 48);
            int n12 = (int)(l13 << 48 >>> 48);
            boolean bl3 = false;
            CallSite callSite = m44.a("n", (long)1603369626654410870L, (long)l10);
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l12;
            objectArray2[0] = cf.x(list.size() + list2.size(), n10, (char)n11, (short)n12);
            CallSite callSite2 = m44.a("n", (Object)objectArray2, (long)1370537724281357389L, (long)l10);
            callSite2.addAll(list2);
            Iterator iterator = list.iterator();
            CallSite callSite3 = callSite;
            while (iterator.hasNext()) {
                CallSite callSite4;
                block13: {
                    block14: {
                        boolean bl4;
                        block11: {
                            Object e10 = iterator.next();
                            try {
                                block12: {
                                    try {
                                        try {
                                            try {
                                                bl2 = callSite2.add(e10);
                                                CallSite callSite5 = callSite3;
                                                if (l10 >= 0L) {
                                                    if (callSite5 != null) break block10;
                                                    callSite5 = callSite3;
                                                }
                                                if (callSite5 != null) break block11;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw m44.a("n", (Object)illegalArgumentException, (long)690056944671268648L, (long)l10);
                                            }
                                            if (l10 < 0L) break block11;
                                            if (!bl2) break block12;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("n", (Object)illegalArgumentException, (long)690056944671268648L, (long)l10);
                                        }
                                        list2.add(e10);
                                        callSite4 = callSite3;
                                        if (l10 < 0L) break block13;
                                        if (callSite4 == null) break block14;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("n", (Object)illegalArgumentException, (long)690056944671268648L, (long)l10);
                                    }
                                }
                                bl4 = true;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("n", (Object)illegalArgumentException, (long)690056944671268648L, (long)l10);
                            }
                        }
                        bl3 = bl4;
                    }
                    callSite4 = callSite3;
                }
                if (callSite4 == null) continue;
            }
            bl2 = bl3;
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    public static boolean M(Object[] var0) {
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

    public static r F(Object[] objectArray) {
        r r10 = (r)objectArray[0];
        return (r)r10.clone();
    }

    public static void J(Object[] objectArray) {
        List list = (List)objectArray[0];
        Random random = (Random)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x411A111A312AL;
        int n10 = (int)(l11 >>> 32);
        int n11 = (int)(l11 << 32 >>> 32);
        int n12 = list.size();
        if (n12 < 10 || list instanceof RandomAccess) {
            for (int i10 = n12; i10 > 1; --i10) {
                cf.N(list, i10 - 1, random.nextInt(i10));
            }
        } else {
            CallSite callSite = m44.a("u", (Object)list, (long)8357622050922096969L, (long)l10);
            Object[] objectArray2 = new Object[4];
            objectArray2[3] = n11;
            objectArray2[2] = n10;
            objectArray2[1] = random;
            objectArray2[0] = callSite;
            m44.a("j", (Object)objectArray2, (long)8356156277979685742L, (long)l10);
            CallSite callSite2 = m44.a("u", (Object)list, (long)8153580300192513909L, (long)l10);
            for (int i11 = 0; i11 < ((CallSite)callSite).length; ++i11) {
                callSite2.next();
                m44.a("u", (Object)callSite2, (Object)callSite[i11], (long)7922276350343641521L, (long)l10);
            }
        }
    }

    public static String Z(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Throwable throwable = (Throwable)objectArray[1];
        l10 = a ^ l10;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
        m44.a("q", (Object)throwable, (Object)printWriter, (long)-8184394955452501649L, (long)l10);
        m44.a("q", (Object)printWriter, (long)-8218072894064312444L, (long)l10);
        return m44.a("q", (Object)byteArrayOutputStream, (long)-7987622866146465673L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    public static long m(Object[] var0) {
        var1_1 = (Long)var0[0];
        var3_2 = (var1_1 = cf.a ^ var1_1) ^ 107231474229275L;
        var6_3 = Thread.currentThread();
        var5_4 = m44.a("j", (long)-5871528013585534798L, (long)var1_1);
        try {
            v0 = new Object[1];
            v0[0] = var3_2;
            if (m44.a("j", (Object)v0, (long)-5280242941941020512L, (long)var1_1) == false) {
                return var6_3.getId();
            }
        }
        catch (Throwable v1) {
            throw m44.a("j", (Object)v1, (long)-5667807146508179476L, (long)var1_1);
        }
        var7_5 = MethodHandles.lookup();
        var8_6 = new Class[]{};
        var9_7 = MethodType.methodType(m44.a("n", (long)-5706418227998624848L, (long)var1_1), var8_6);
        var11_8 = var6_3.getClass();
        while (!var11_8.getName().equals(cf.a("y", (int)3530, (long)(5582836665211261912L ^ var1_1)))) {
            var11_8 = var11_8.getSuperclass();
lbl22:
            // 2 sources

            ** while (var5_4 != null)
lbl23:
            // 1 sources

        }
lbl24:
        // 2 sources

        try {
            v2 = var9_7;
            v3 = var11_8;
            var10_9 = var7_5.findVirtual(v3, f33.b((String)cf.a("y", (int)21283, (long)(5085108859065847082L ^ var1_1)), v3, v2.parameterArray()), v2);
            if (var1_1 <= 0L) ** GOTO lbl22
            return var10_9.invoke(var6_3);
        }
        catch (Throwable var12_10) {
            v4 = new Object[1];
            v4[0] = var3_2;
            if (m44.a("j", (Object)v4, (long)-5280242941941020512L, (long)var1_1) != false) {
                // empty if block
            }
            return var6_3.getId();
        }
    }

    public static String q(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x64798503F857L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l11;
        objectArray2[1] = null;
        objectArray2[0] = string;
        return m44.a("h", (Object)objectArray2, (long)-3575942208155432260L, (long)l10);
    }

    public static HashSet X(Object[] objectArray) {
        Collection collection = (Collection)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        try {
            if (m44.a("m", (long)2266445032572487921L, (long)l10) != false) {
                return new LinkedHashSet(collection);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("i", (Object)illegalArgumentException, (long)2034647265576422023L, (long)l10);
        }
        return new HashSet(collection);
    }

    public static String C(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x2250CE328682L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return "[" + (String)((Object)m44.a("i", (Object)objectArray2, (long)-5075332003082359558L, (long)l10)) + "]";
    }

    public static long w(Object[] objectArray) {
        CallSite callSite;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            callSite = m44.a("i", (long)-7373384956418474393L, (long)l10) != false ? m44.a("r", (Object)new Random(), (long)-8974923345467141105L, (long)l10) : m44.a("r", (Object)new SecureRandom(), (long)-7360512639275320443L, (long)l10);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("m", (Object)illegalArgumentException, (long)-7385712072916758725L, (long)l10);
        }
        CallSite callSite2 = callSite;
        return (long)callSite2;
    }

    public static HashSet A(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            if (m44.a("m", (long)3162732683546442849L, (long)l10) != false) {
                return new LinkedHashSet();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("i", (Object)illegalArgumentException, (long)2930941524424539671L, (long)l10);
        }
        return new HashSet();
    }

    public static void j(Object[] objectArray) {
        int n10;
        char[] cArray = (char[])objectArray[0];
        Random random = (Random)objectArray[1];
        long l10 = (Long)objectArray[2];
        l10 = a ^ l10;
        for (int i10 = n10 = cArray.length; i10 > 1; --i10) {
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = random.nextInt(i10);
            objectArray2[1] = i10 - 1;
            objectArray2[0] = cArray;
            m44.a("j", (Object)objectArray2, (long)-6792760817822946802L, (long)l10);
        }
    }

    /*
     * Exception decompiling
     */
    private static String U(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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

    public static byte[] v(long l10, String string) {
        int n10;
        byte[] byArray;
        int n11;
        block20: {
            l10 = a ^ l10;
            char[] cArray = string.toCharArray();
            n11 = 0;
            int n12 = string.length();
            CallSite callSite = m44.a("l", (long)-7668967436185793628L, (long)l10);
            byArray = new byte[n12 * 3];
            int n13 = 0;
            while (n13 < n12) {
                CallSite callSite2;
                block23: {
                    block24: {
                        int n14;
                        int n15;
                        int n16;
                        block25: {
                            block21: {
                                n16 = cArray[n13];
                                try {
                                    block22: {
                                        try {
                                            try {
                                                try {
                                                    n10 = n16;
                                                    CallSite callSite3 = callSite;
                                                    if (l10 > 0L) {
                                                        if (callSite3 != null) break block20;
                                                        callSite3 = callSite;
                                                    }
                                                    if (callSite3 != null) break block21;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw m44.a("l", (Object)illegalArgumentException, (long)-8484331228750373638L, (long)l10);
                                                }
                                                if (l10 < 0L) break block21;
                                                if (n10 != 0) break block22;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw m44.a("l", (Object)illegalArgumentException, (long)-8484331228750373638L, (long)l10);
                                            }
                                            byArray[n11++] = -64;
                                            byArray[n11++] = -128;
                                            callSite2 = callSite;
                                            if (l10 < 0L) break block23;
                                            if (callSite2 == null) break block24;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("l", (Object)illegalArgumentException, (long)-8484331228750373638L, (long)l10);
                                        }
                                    }
                                    n15 = n16;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("l", (Object)illegalArgumentException, (long)-8484331228750373638L, (long)l10);
                                }
                            }
                            try {
                                block26: {
                                    try {
                                        try {
                                            n14 = 128;
                                            if (l10 < 0L || callSite != null) break block25;
                                            if (n15 >= n14) break block26;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("l", (Object)illegalArgumentException, (long)-8484331228750373638L, (long)l10);
                                        }
                                        byArray[n11++] = (byte)n16;
                                        callSite2 = callSite;
                                        if (l10 < 0L) break block23;
                                        if (callSite2 == null) break block24;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("l", (Object)illegalArgumentException, (long)-8484331228750373638L, (long)l10);
                                    }
                                }
                                n15 = n16;
                                n14 = 2048;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("l", (Object)illegalArgumentException, (long)-8484331228750373638L, (long)l10);
                            }
                        }
                        try {
                            block27: {
                                try {
                                    if (n15 >= n14) break block27;
                                    byArray[n11++] = (byte)(0xC0 | n16 >>> 6 & 0x1F);
                                    byArray[n11++] = (byte)(0x80 | n16 & 0x3F);
                                    callSite2 = callSite;
                                    if (l10 <= 0L) break block23;
                                    if (callSite2 == null) break block24;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("l", (Object)illegalArgumentException, (long)-8484331228750373638L, (long)l10);
                                }
                            }
                            byArray[n11++] = (byte)(0xE0 | n16 >>> 12 & 0xF);
                            byArray[n11++] = (byte)(0x80 | n16 >>> 6 & 0x3F);
                            byArray[n11++] = (byte)(0x80 | n16 & 0x3F);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("l", (Object)illegalArgumentException, (long)-8484331228750373638L, (long)l10);
                        }
                    }
                    ++n13;
                    callSite2 = callSite;
                }
                if (callSite2 == null) continue;
            }
            n10 = n11;
        }
        byte[] byArray2 = new byte[n10];
        System.arraycopy(byArray, 0, byArray2, 0, n11);
        return byArray2;
    }

    public static void c(Object[] objectArray) {
        int n10;
        Object[] objectArray2 = (Object[])objectArray[0];
        Random random = (Random)objectArray[1];
        int n11 = (Integer)objectArray[2];
        int n12 = (Integer)objectArray[3];
        long l10 = ((long)n11 << 32 | (long)n12 << 32 >>> 32) ^ a;
        for (int i10 = n10 = objectArray2.length; i10 > 1; --i10) {
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = random.nextInt(i10);
            objectArray3[1] = i10 - 1;
            objectArray3[0] = objectArray2;
            m44.a("n", (Object)objectArray3, (long)-2723397033929376263L, (long)l10);
        }
    }

    /*
     * Exception decompiling
     */
    public static String F(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[TRYBLOCK]], but top level block is 11[SWITCH]
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
     * Could not resolve type clashes
     */
    public static int e(Object[] var0) {
        block494: {
            block495: {
                block492: {
                    block493: {
                        block491: {
                            block490: {
                                block488: {
                                    block489: {
                                        block487: {
                                            block486: {
                                                block484: {
                                                    block485: {
                                                        block483: {
                                                            block482: {
                                                                block480: {
                                                                    block481: {
                                                                        block479: {
                                                                            block478: {
                                                                                block476: {
                                                                                    block477: {
                                                                                        block475: {
                                                                                            block474: {
                                                                                                block472: {
                                                                                                    block473: {
                                                                                                        block471: {
                                                                                                            block470: {
                                                                                                                block468: {
                                                                                                                    block469: {
                                                                                                                        block467: {
                                                                                                                            block466: {
                                                                                                                                block464: {
                                                                                                                                    block465: {
                                                                                                                                        block463: {
                                                                                                                                            block462: {
                                                                                                                                                block460: {
                                                                                                                                                    block461: {
                                                                                                                                                        block459: {
                                                                                                                                                            block458: {
                                                                                                                                                                block456: {
                                                                                                                                                                    block457: {
                                                                                                                                                                        block455: {
                                                                                                                                                                            block454: {
                                                                                                                                                                                block452: {
                                                                                                                                                                                    block453: {
                                                                                                                                                                                        block451: {
                                                                                                                                                                                            block450: {
                                                                                                                                                                                                block448: {
                                                                                                                                                                                                    block449: {
                                                                                                                                                                                                        block447: {
                                                                                                                                                                                                            block446: {
                                                                                                                                                                                                                block444: {
                                                                                                                                                                                                                    block445: {
                                                                                                                                                                                                                        block443: {
                                                                                                                                                                                                                            block442: {
                                                                                                                                                                                                                                block440: {
                                                                                                                                                                                                                                    block441: {
                                                                                                                                                                                                                                        block439: {
                                                                                                                                                                                                                                            block438: {
                                                                                                                                                                                                                                                block436: {
                                                                                                                                                                                                                                                    block437: {
                                                                                                                                                                                                                                                        block435: {
                                                                                                                                                                                                                                                            block434: {
                                                                                                                                                                                                                                                                block432: {
                                                                                                                                                                                                                                                                    block433: {
                                                                                                                                                                                                                                                                        block431: {
                                                                                                                                                                                                                                                                            block430: {
                                                                                                                                                                                                                                                                                block428: {
                                                                                                                                                                                                                                                                                    block429: {
                                                                                                                                                                                                                                                                                        block427: {
                                                                                                                                                                                                                                                                                            block426: {
                                                                                                                                                                                                                                                                                                block424: {
                                                                                                                                                                                                                                                                                                    block425: {
                                                                                                                                                                                                                                                                                                        block423: {
                                                                                                                                                                                                                                                                                                            block422: {
                                                                                                                                                                                                                                                                                                                block420: {
                                                                                                                                                                                                                                                                                                                    block421: {
                                                                                                                                                                                                                                                                                                                        block419: {
                                                                                                                                                                                                                                                                                                                            block418: {
                                                                                                                                                                                                                                                                                                                                block416: {
                                                                                                                                                                                                                                                                                                                                    block417: {
                                                                                                                                                                                                                                                                                                                                        block415: {
                                                                                                                                                                                                                                                                                                                                            block414: {
                                                                                                                                                                                                                                                                                                                                                block412: {
                                                                                                                                                                                                                                                                                                                                                    block413: {
                                                                                                                                                                                                                                                                                                                                                        block411: {
                                                                                                                                                                                                                                                                                                                                                            block410: {
                                                                                                                                                                                                                                                                                                                                                                block408: {
                                                                                                                                                                                                                                                                                                                                                                    block409: {
                                                                                                                                                                                                                                                                                                                                                                        block407: {
                                                                                                                                                                                                                                                                                                                                                                            block406: {
                                                                                                                                                                                                                                                                                                                                                                                block404: {
                                                                                                                                                                                                                                                                                                                                                                                    block405: {
                                                                                                                                                                                                                                                                                                                                                                                        block403: {
                                                                                                                                                                                                                                                                                                                                                                                            block402: {
                                                                                                                                                                                                                                                                                                                                                                                                block400: {
                                                                                                                                                                                                                                                                                                                                                                                                    block401: {
                                                                                                                                                                                                                                                                                                                                                                                                        block399: {
                                                                                                                                                                                                                                                                                                                                                                                                            block398: {
                                                                                                                                                                                                                                                                                                                                                                                                                block396: {
                                                                                                                                                                                                                                                                                                                                                                                                                    block397: {
                                                                                                                                                                                                                                                                                                                                                                                                                        block395: {
                                                                                                                                                                                                                                                                                                                                                                                                                            block394: {
                                                                                                                                                                                                                                                                                                                                                                                                                                block392: {
                                                                                                                                                                                                                                                                                                                                                                                                                                    block393: {
                                                                                                                                                                                                                                                                                                                                                                                                                                        block391: {
                                                                                                                                                                                                                                                                                                                                                                                                                                            block390: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                block388: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    block389: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        block387: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            block386: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                block384: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    block385: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        block383: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            block382: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                block380: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    block381: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        block379: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            block378: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                block376: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    block377: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        block375: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            block374: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                block372: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    block373: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        block371: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            block370: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                block368: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    block369: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        block367: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            block366: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                block364: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    block365: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        var1_1 = (Long)var0[0];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        var1_1 = cf.a ^ var1_1;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        var3_2 = m44.a("k", (long)-2279576326353518997L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (m44.a("o", (long)-2216630415062452646L, (long)var1_1) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v0) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v0, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v1 /* !! */  = m44.a("o", (long)-1898811501021689505L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v2 = var3_2;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (var1_1 > 0L) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v2 != null) break block364;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v1 /* !! */  == false) break block365;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ** GOTO lbl30
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            catch (IllegalArgumentException v3) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                throw m44.a("k", (Object)v3, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            return 2;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v4) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v4, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    v1 /* !! */  = m44.a("o", (long)-102019855484054905L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    v2 = var3_2;
lbl30:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v2 != null) break block366;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v1 /* !! */  == false) break block367;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                catch (IllegalArgumentException v5) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    throw m44.a("k", (Object)v5, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v1 /* !! */  = (CallSite)3;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            return (int)v1 /* !! */ ;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            v6 = -2276090105310281584L;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            v7 = var1_1;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (var1_1 > 0L) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (m44.a("o", (long)v6, (long)v7) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    return 4;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ** GOTO lbl53
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v8) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v8, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v6 = -368994114390123075L;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v7 = var1_1;
lbl53:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v9 /* !! */  = m44.a("o", (long)v6, (long)v7);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v10 = var3_2;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (var1_1 > 0L) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v10 != null) break block368;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v9 /* !! */  == false) break block369;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ** GOTO lbl70
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            catch (IllegalArgumentException v11) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                throw m44.a("k", (Object)v11, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            return 5;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v12) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v12, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    v9 /* !! */  = m44.a("o", (long)-1937976432522317566L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    v10 = var3_2;
lbl70:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v10 != null) break block370;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v9 /* !! */  == false) break block371;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                catch (IllegalArgumentException v13) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    throw m44.a("k", (Object)v13, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v9 /* !! */  = (CallSite)6;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            return (int)v9 /* !! */ ;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            v14 = -559939872523639336L;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            v15 = var1_1;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (var1_1 > 0L) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (m44.a("o", (long)v14, (long)v15) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    return 7;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ** GOTO lbl93
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v16) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v16, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v14 = -189159608046553412L;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v15 = var1_1;
lbl93:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v17 /* !! */  = m44.a("o", (long)v14, (long)v15);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v18 = var3_2;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (var1_1 >= 0L) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v18 != null) break block372;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v17 /* !! */  == false) break block373;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ** GOTO lbl110
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            catch (IllegalArgumentException v19) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                throw m44.a("k", (Object)v19, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            return 8;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v20) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v20, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    v17 /* !! */  = m44.a("o", (long)-2236447469123666999L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    v18 = var3_2;
lbl110:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v18 != null) break block374;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v17 /* !! */  == false) break block375;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                catch (IllegalArgumentException v21) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    throw m44.a("k", (Object)v21, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v17 /* !! */  = (CallSite)9;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            return (int)v17 /* !! */ ;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            v22 = -74695331271026625L;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            v23 = var1_1;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (var1_1 > 0L) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (m44.a("o", (long)v22, (long)v23) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    return 10;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ** GOTO lbl133
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v24) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v24, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v22 = -346829602898994211L;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v23 = var1_1;
lbl133:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v25 /* !! */  = m44.a("o", (long)v22, (long)v23);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v26 = var3_2;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (var1_1 >= 0L) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v26 != null) break block376;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v25 /* !! */  == false) break block377;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ** GOTO lbl150
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            catch (IllegalArgumentException v27) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                throw m44.a("k", (Object)v27, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            return 11;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v28) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v28, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    v25 /* !! */  = m44.a("o", (long)-260698553604433076L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    v26 = var3_2;
lbl150:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v26 != null) break block378;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v25 /* !! */  == false) break block379;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                catch (IllegalArgumentException v29) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    throw m44.a("k", (Object)v29, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v25 /* !! */  = (CallSite)12;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            return (int)v25 /* !! */ ;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            v30 = -333913866348912537L;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            v31 = var1_1;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (var1_1 >= 0L) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (m44.a("o", (long)v30, (long)v31) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    return 13;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ** GOTO lbl173
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v32) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v32, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v30 = -2218337694876929371L;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v31 = var1_1;
lbl173:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v33 /* !! */  = m44.a("o", (long)v30, (long)v31);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v34 = var3_2;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (var1_1 > 0L) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v34 != null) break block380;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v33 /* !! */  == false) break block381;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ** GOTO lbl190
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            catch (IllegalArgumentException v35) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                throw m44.a("k", (Object)v35, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            return 14;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v36) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v36, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    v33 /* !! */  = m44.a("o", (long)-278784097109428485L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    v34 = var3_2;
lbl190:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v34 != null) break block382;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v33 /* !! */  == false) break block383;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                catch (IllegalArgumentException v37) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    throw m44.a("k", (Object)v37, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v33 /* !! */  = (CallSite)15;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            return (int)v33 /* !! */ ;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            v38 = -2214677571443304449L;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            v39 = var1_1;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (var1_1 > 0L) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (m44.a("o", (long)v38, (long)v39) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    return 16;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ** GOTO lbl213
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v40) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v40, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v38 = -42410259217711201L;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v39 = var1_1;
lbl213:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v41 /* !! */  = m44.a("o", (long)v38, (long)v39);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                v42 = var3_2;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (var1_1 > 0L) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v42 != null) break block384;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v41 /* !! */  == false) break block385;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ** GOTO lbl230
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            catch (IllegalArgumentException v43) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                throw m44.a("k", (Object)v43, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            return 17;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v44) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v44, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    v41 /* !! */  = m44.a("o", (long)-48411407329800719L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    v42 = var3_2;
lbl230:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v42 != null) break block386;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v41 /* !! */  == false) break block387;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                catch (IllegalArgumentException v45) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    throw m44.a("k", (Object)v45, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                v41 /* !! */  = (CallSite)18;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            return (int)v41 /* !! */ ;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            v46 = -118161192757159207L;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            v47 = var1_1;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (var1_1 >= 0L) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (m44.a("o", (long)v46, (long)v47) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    return 19;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            ** GOTO lbl253
                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v48) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v48, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                v46 = -2256774435201277940L;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                v47 = var1_1;
lbl253:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                                                                                                                                                                                                                v49 /* !! */  = m44.a("o", (long)v46, (long)v47);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                v50 = var3_2;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (var1_1 > 0L) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v50 != null) break block388;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v49 /* !! */  == false) break block389;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                ** GOTO lbl270
                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            catch (IllegalArgumentException v51) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                throw m44.a("k", (Object)v51, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            return 20;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v52) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v52, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                    v49 /* !! */  = m44.a("o", (long)-2257837614595468072L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    v50 = var3_2;
lbl270:
                                                                                                                                                                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v50 != null) break block390;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v49 /* !! */  == false) break block391;
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                catch (IllegalArgumentException v53) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    throw m44.a("k", (Object)v53, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                v49 /* !! */  = (CallSite)21;
                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                            return (int)v49 /* !! */ ;
                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                                                                            v54 = -102775963757674175L;
                                                                                                                                                                                                                                                                                                                                                                                                                                            v55 = var1_1;
                                                                                                                                                                                                                                                                                                                                                                                                                                            if (var1_1 >= 0L) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                if (m44.a("o", (long)v54, (long)v55) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    return 22;
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                            ** GOTO lbl293
                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v56) {
                                                                                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v56, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                v54 = -194993354256680526L;
                                                                                                                                                                                                                                                                                                                                                                                                                                                v55 = var1_1;
lbl293:
                                                                                                                                                                                                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                                                                                                                                                                                                v57 /* !! */  = m44.a("o", (long)v54, (long)v55);
                                                                                                                                                                                                                                                                                                                                                                                                                                                v58 = var3_2;
                                                                                                                                                                                                                                                                                                                                                                                                                                                if (var1_1 >= 0L) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v58 != null) break block392;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v57 /* !! */  == false) break block393;
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                ** GOTO lbl310
                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                            catch (IllegalArgumentException v59) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                throw m44.a("k", (Object)v59, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                            return 23;
                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v60) {
                                                                                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v60, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                    v57 /* !! */  = m44.a("o", (long)-2239544907791270217L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                                                                                                    v58 = var3_2;
lbl310:
                                                                                                                                                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v58 != null) break block394;
                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v57 /* !! */  == false) break block395;
                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                catch (IllegalArgumentException v61) {
                                                                                                                                                                                                                                                                                                                                                                                                                                    throw m44.a("k", (Object)v61, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                v57 /* !! */  = (CallSite)24;
                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                            return (int)v57 /* !! */ ;
                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                                                            v62 = -2280570436330311585L;
                                                                                                                                                                                                                                                                                                                                                                                                                            v63 = var1_1;
                                                                                                                                                                                                                                                                                                                                                                                                                            if (var1_1 > 0L) {
                                                                                                                                                                                                                                                                                                                                                                                                                                if (m44.a("o", (long)v62, (long)v63) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                    return 25;
                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                            ** GOTO lbl333
                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v64) {
                                                                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v64, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                                                                                                v62 = -535839581674027267L;
                                                                                                                                                                                                                                                                                                                                                                                                                                v63 = var1_1;
lbl333:
                                                                                                                                                                                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                                                                                                                                                                                v65 /* !! */  = m44.a("o", (long)v62, (long)v63);
                                                                                                                                                                                                                                                                                                                                                                                                                                v66 = var3_2;
                                                                                                                                                                                                                                                                                                                                                                                                                                if (var1_1 >= 0L) {
                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v66 != null) break block396;
                                                                                                                                                                                                                                                                                                                                                                                                                                    if (v65 /* !! */  == false) break block397;
                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                ** GOTO lbl350
                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                            catch (IllegalArgumentException v67) {
                                                                                                                                                                                                                                                                                                                                                                                                                                throw m44.a("k", (Object)v67, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                            return 26;
                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v68) {
                                                                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v68, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                    v65 /* !! */  = m44.a("o", (long)-104260122013733893L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                                                                                    v66 = var3_2;
lbl350:
                                                                                                                                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                                                                                                                                    if (v66 != null) break block398;
                                                                                                                                                                                                                                                                                                                                                                                                                    if (v65 /* !! */  == false) break block399;
                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                catch (IllegalArgumentException v69) {
                                                                                                                                                                                                                                                                                                                                                                                                                    throw m44.a("k", (Object)v69, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                v65 /* !! */  = (CallSite)27;
                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                            return (int)v65 /* !! */ ;
                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                                            v70 = -561193915973061529L;
                                                                                                                                                                                                                                                                                                                                                                                                            v71 = var1_1;
                                                                                                                                                                                                                                                                                                                                                                                                            if (var1_1 >= 0L) {
                                                                                                                                                                                                                                                                                                                                                                                                                if (m44.a("o", (long)v70, (long)v71) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                    return 28;
                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                            ** GOTO lbl373
                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v72) {
                                                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v72, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                                                                                v70 = -122841126403104452L;
                                                                                                                                                                                                                                                                                                                                                                                                                v71 = var1_1;
lbl373:
                                                                                                                                                                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                                                                                                                                                                v73 /* !! */  = m44.a("o", (long)v70, (long)v71);
                                                                                                                                                                                                                                                                                                                                                                                                                v74 = var3_2;
                                                                                                                                                                                                                                                                                                                                                                                                                if (var1_1 >= 0L) {
                                                                                                                                                                                                                                                                                                                                                                                                                    if (v74 != null) break block400;
                                                                                                                                                                                                                                                                                                                                                                                                                    if (v73 /* !! */  == false) break block401;
                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                ** GOTO lbl390
                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                            catch (IllegalArgumentException v75) {
                                                                                                                                                                                                                                                                                                                                                                                                                throw m44.a("k", (Object)v75, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                            return 29;
                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v76) {
                                                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v76, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    v73 /* !! */  = m44.a("o", (long)-258532181181453238L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                                                                    v74 = var3_2;
lbl390:
                                                                                                                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                                                                                                                    if (v74 != null) break block402;
                                                                                                                                                                                                                                                                                                                                                                                                    if (v73 /* !! */  == false) break block403;
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                catch (IllegalArgumentException v77) {
                                                                                                                                                                                                                                                                                                                                                                                                    throw m44.a("k", (Object)v77, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                v73 /* !! */  = (CallSite)30;
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                            return (int)v73 /* !! */ ;
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                            v78 = -1943016704135031655L;
                                                                                                                                                                                                                                                                                                                                                                                            v79 = var1_1;
                                                                                                                                                                                                                                                                                                                                                                                            if (var1_1 >= 0L) {
                                                                                                                                                                                                                                                                                                                                                                                                if (m44.a("o", (long)v78, (long)v79) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                    return 31;
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                            ** GOTO lbl413
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v80) {
                                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v80, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                                                                v78 = -2086187900954302633L;
                                                                                                                                                                                                                                                                                                                                                                                                v79 = var1_1;
lbl413:
                                                                                                                                                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                                                                                                                                                v81 /* !! */  = m44.a("o", (long)v78, (long)v79);
                                                                                                                                                                                                                                                                                                                                                                                                v82 = var3_2;
                                                                                                                                                                                                                                                                                                                                                                                                if (var1_1 > 0L) {
                                                                                                                                                                                                                                                                                                                                                                                                    if (v82 != null) break block404;
                                                                                                                                                                                                                                                                                                                                                                                                    if (v81 /* !! */  == false) break block405;
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                ** GOTO lbl430
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                            catch (IllegalArgumentException v83) {
                                                                                                                                                                                                                                                                                                                                                                                                throw m44.a("k", (Object)v83, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                            return 32;
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v84) {
                                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v84, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                    v81 /* !! */  = m44.a("o", (long)-336685172283814202L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                                                    v82 = var3_2;
lbl430:
                                                                                                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                                                                                                    if (v82 != null) break block406;
                                                                                                                                                                                                                                                                                                                                                                                    if (v81 /* !! */  == false) break block407;
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                catch (IllegalArgumentException v85) {
                                                                                                                                                                                                                                                                                                                                                                                    throw m44.a("k", (Object)v85, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                v81 /* !! */  = (CallSite)33;
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                            return (int)v81 /* !! */ ;
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                            v86 = -1995263405665052118L;
                                                                                                                                                                                                                                                                                                                                                                            v87 = var1_1;
                                                                                                                                                                                                                                                                                                                                                                            if (var1_1 > 0L) {
                                                                                                                                                                                                                                                                                                                                                                                if (m44.a("o", (long)v86, (long)v87) != null) {
                                                                                                                                                                                                                                                                                                                                                                                    return 34;
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                            ** GOTO lbl453
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v88) {
                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v88, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                                                v86 = -270120860378094267L;
                                                                                                                                                                                                                                                                                                                                                                                v87 = var1_1;
lbl453:
                                                                                                                                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                                                                                                                                v89 /* !! */  = m44.a("o", (long)v86, (long)v87);
                                                                                                                                                                                                                                                                                                                                                                                v90 = var3_2;
                                                                                                                                                                                                                                                                                                                                                                                if (var1_1 > 0L) {
                                                                                                                                                                                                                                                                                                                                                                                    if (v90 != null) break block408;
                                                                                                                                                                                                                                                                                                                                                                                    if (v89 /* !! */  == false) break block409;
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                ** GOTO lbl470
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                            catch (IllegalArgumentException v91) {
                                                                                                                                                                                                                                                                                                                                                                                throw m44.a("k", (Object)v91, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                            return 35;
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v92) {
                                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v92, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                    v89 /* !! */  = m44.a("o", (long)-353762615276846854L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                                    v90 = var3_2;
lbl470:
                                                                                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                                                                                    if (v90 != null) break block410;
                                                                                                                                                                                                                                                                                                                                                                    if (v89 /* !! */  == false) break block411;
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                catch (IllegalArgumentException v93) {
                                                                                                                                                                                                                                                                                                                                                                    throw m44.a("k", (Object)v93, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                v89 /* !! */  = (CallSite)36;
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                            return (int)v89 /* !! */ ;
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                            v94 = -547593185282459748L;
                                                                                                                                                                                                                                                                                                                                                            v95 = var1_1;
                                                                                                                                                                                                                                                                                                                                                            if (var1_1 > 0L) {
                                                                                                                                                                                                                                                                                                                                                                if (m44.a("o", (long)v94, (long)v95) != null) {
                                                                                                                                                                                                                                                                                                                                                                    return 37;
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                            ** GOTO lbl493
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v96) {
                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v96, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                                v94 = -329152123939054566L;
                                                                                                                                                                                                                                                                                                                                                                v95 = var1_1;
lbl493:
                                                                                                                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                                                                                                                v97 /* !! */  = m44.a("o", (long)v94, (long)v95);
                                                                                                                                                                                                                                                                                                                                                                v98 = var3_2;
                                                                                                                                                                                                                                                                                                                                                                if (var1_1 > 0L) {
                                                                                                                                                                                                                                                                                                                                                                    if (v98 != null) break block412;
                                                                                                                                                                                                                                                                                                                                                                    if (v97 /* !! */  == false) break block413;
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                ** GOTO lbl510
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                            catch (IllegalArgumentException v99) {
                                                                                                                                                                                                                                                                                                                                                                throw m44.a("k", (Object)v99, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                            return 38;
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v100) {
                                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v100, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                    v97 /* !! */  = m44.a("o", (long)-2133397125454813105L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                    v98 = var3_2;
lbl510:
                                                                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                                                                    if (v98 != null) break block414;
                                                                                                                                                                                                                                                                                                                                                    if (v97 /* !! */  == false) break block415;
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                catch (IllegalArgumentException v101) {
                                                                                                                                                                                                                                                                                                                                                    throw m44.a("k", (Object)v101, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                v97 /* !! */  = (CallSite)39;
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            return (int)v97 /* !! */ ;
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                            v102 = -171323631487995871L;
                                                                                                                                                                                                                                                                                                                                            v103 = var1_1;
                                                                                                                                                                                                                                                                                                                                            if (var1_1 >= 0L) {
                                                                                                                                                                                                                                                                                                                                                if (m44.a("o", (long)v102, (long)v103) != null) {
                                                                                                                                                                                                                                                                                                                                                    return 40;
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            ** GOTO lbl533
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v104) {
                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v104, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                v102 = -233838333887692196L;
                                                                                                                                                                                                                                                                                                                                                v103 = var1_1;
lbl533:
                                                                                                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                                                                                                v105 /* !! */  = m44.a("o", (long)v102, (long)v103);
                                                                                                                                                                                                                                                                                                                                                v106 = var3_2;
                                                                                                                                                                                                                                                                                                                                                if (var1_1 > 0L) {
                                                                                                                                                                                                                                                                                                                                                    if (v106 != null) break block416;
                                                                                                                                                                                                                                                                                                                                                    if (v105 /* !! */  == false) break block417;
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                ** GOTO lbl550
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            catch (IllegalArgumentException v107) {
                                                                                                                                                                                                                                                                                                                                                throw m44.a("k", (Object)v107, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            return 41;
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v108) {
                                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v108, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    v105 /* !! */  = m44.a("o", (long)-225493274816129528L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                    v106 = var3_2;
lbl550:
                                                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                                                    if (v106 != null) break block418;
                                                                                                                                                                                                                                                                                                                                    if (v105 /* !! */  == false) break block419;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                catch (IllegalArgumentException v109) {
                                                                                                                                                                                                                                                                                                                                    throw m44.a("k", (Object)v109, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                v105 /* !! */  = (CallSite)42;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            return (int)v105 /* !! */ ;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                            v110 = -548145717472621412L;
                                                                                                                                                                                                                                                                                                                            v111 = var1_1;
                                                                                                                                                                                                                                                                                                                            if (var1_1 >= 0L) {
                                                                                                                                                                                                                                                                                                                                if (m44.a("o", (long)v110, (long)v111) != null) {
                                                                                                                                                                                                                                                                                                                                    return 43;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            ** GOTO lbl573
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v112) {
                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v112, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                v110 = -161659452076589015L;
                                                                                                                                                                                                                                                                                                                                v111 = var1_1;
lbl573:
                                                                                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                                                                                v113 /* !! */  = m44.a("o", (long)v110, (long)v111);
                                                                                                                                                                                                                                                                                                                                v114 = var3_2;
                                                                                                                                                                                                                                                                                                                                if (var1_1 >= 0L) {
                                                                                                                                                                                                                                                                                                                                    if (v114 != null) break block420;
                                                                                                                                                                                                                                                                                                                                    if (v113 /* !! */  == false) break block421;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                ** GOTO lbl590
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            catch (IllegalArgumentException v115) {
                                                                                                                                                                                                                                                                                                                                throw m44.a("k", (Object)v115, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            return 44;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v116) {
                                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v116, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    v113 /* !! */  = m44.a("o", (long)-427178133369492612L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                    v114 = var3_2;
lbl590:
                                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                                    if (v114 != null) break block422;
                                                                                                                                                                                                                                                                                                                    if (v113 /* !! */  == false) break block423;
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                catch (IllegalArgumentException v117) {
                                                                                                                                                                                                                                                                                                                    throw m44.a("k", (Object)v117, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                v113 /* !! */  = (CallSite)45;
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            return (int)v113 /* !! */ ;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                            v118 = -2081397813006668971L;
                                                                                                                                                                                                                                                                                                            v119 = var1_1;
                                                                                                                                                                                                                                                                                                            if (var1_1 >= 0L) {
                                                                                                                                                                                                                                                                                                                if (m44.a("o", (long)v118, (long)v119) != null) {
                                                                                                                                                                                                                                                                                                                    return 46;
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            ** GOTO lbl613
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v120) {
                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v120, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                v118 = -1950949295035339093L;
                                                                                                                                                                                                                                                                                                                v119 = var1_1;
lbl613:
                                                                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                                                                v121 /* !! */  = m44.a("o", (long)v118, (long)v119);
                                                                                                                                                                                                                                                                                                                v122 = var3_2;
                                                                                                                                                                                                                                                                                                                if (var1_1 >= 0L) {
                                                                                                                                                                                                                                                                                                                    if (v122 != null) break block424;
                                                                                                                                                                                                                                                                                                                    if (v121 /* !! */  == false) break block425;
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                ** GOTO lbl630
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            catch (IllegalArgumentException v123) {
                                                                                                                                                                                                                                                                                                                throw m44.a("k", (Object)v123, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            return 47;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v124) {
                                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v124, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    v121 /* !! */  = m44.a("o", (long)-1731889049714161210L, (long)var1_1);
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                    v122 = var3_2;
lbl630:
                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                    if (v122 != null) break block426;
                                                                                                                                                                                                                                                                                                    if (v121 /* !! */  == false) break block427;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                catch (IllegalArgumentException v125) {
                                                                                                                                                                                                                                                                                                    throw m44.a("k", (Object)v125, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                v121 /* !! */  = (CallSite)48;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            return (int)v121 /* !! */ ;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                            v126 = -412770151070405393L;
                                                                                                                                                                                                                                                                                            v127 = var1_1;
                                                                                                                                                                                                                                                                                            if (var1_1 >= 0L) {
                                                                                                                                                                                                                                                                                                if (m44.a("o", (long)v126, (long)v127) != null) {
                                                                                                                                                                                                                                                                                                    return 49;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            ** GOTO lbl653
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v128) {
                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v128, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                v126 = -2293600211030019868L;
                                                                                                                                                                                                                                                                                                v127 = var1_1;
lbl653:
                                                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                                                v129 /* !! */  = m44.a("o", (long)v126, (long)v127);
                                                                                                                                                                                                                                                                                                v130 = var3_2;
                                                                                                                                                                                                                                                                                                if (var1_1 > 0L) {
                                                                                                                                                                                                                                                                                                    if (v130 != null) break block428;
                                                                                                                                                                                                                                                                                                    if (v129 /* !! */  == false) break block429;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                ** GOTO lbl670
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            catch (IllegalArgumentException v131) {
                                                                                                                                                                                                                                                                                                throw m44.a("k", (Object)v131, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            return 50;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v132) {
                                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v132, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    v129 /* !! */  = m44.a("o", (long)-330557092890901189L, (long)var1_1);
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                    v130 = var3_2;
lbl670:
                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                    if (v130 != null) break block430;
                                                                                                                                                                                                                                                                                    if (v129 /* !! */  == false) break block431;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                catch (IllegalArgumentException v133) {
                                                                                                                                                                                                                                                                                    throw m44.a("k", (Object)v133, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                v129 /* !! */  = (CallSite)51;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            return (int)v129 /* !! */ ;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                            v134 = -2299085103717605893L;
                                                                                                                                                                                                                                                                            v135 = var1_1;
                                                                                                                                                                                                                                                                            if (var1_1 > 0L) {
                                                                                                                                                                                                                                                                                if (m44.a("o", (long)v134, (long)v135) != null) {
                                                                                                                                                                                                                                                                                    return 52;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            ** GOTO lbl693
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v136) {
                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v136, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                v134 = -411523396527295796L;
                                                                                                                                                                                                                                                                                v135 = var1_1;
lbl693:
                                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                                v137 /* !! */  = m44.a("o", (long)v134, (long)v135);
                                                                                                                                                                                                                                                                                v138 = var3_2;
                                                                                                                                                                                                                                                                                if (var1_1 >= 0L) {
                                                                                                                                                                                                                                                                                    if (v138 != null) break block432;
                                                                                                                                                                                                                                                                                    if (v137 /* !! */  == false) break block433;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                ** GOTO lbl710
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            catch (IllegalArgumentException v139) {
                                                                                                                                                                                                                                                                                throw m44.a("k", (Object)v139, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            return 53;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        catch (IllegalArgumentException v140) {
                                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v140, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    v137 /* !! */  = m44.a("o", (long)-256173632180050734L, (long)var1_1);
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                    v138 = var3_2;
lbl710:
                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                    if (v138 != null) break block434;
                                                                                                                                                                                                                                                                    if (v137 /* !! */  == false) break block435;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                catch (IllegalArgumentException v141) {
                                                                                                                                                                                                                                                                    throw m44.a("k", (Object)v141, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                v137 /* !! */  = (CallSite)54;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            return (int)v137 /* !! */ ;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                            v142 = -255073828749976171L;
                                                                                                                                                                                                                                                            v143 = var1_1;
                                                                                                                                                                                                                                                            if (var1_1 > 0L) {
                                                                                                                                                                                                                                                                if (m44.a("o", (long)v142, (long)v143) != null) {
                                                                                                                                                                                                                                                                    return 55;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            ** GOTO lbl733
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        catch (IllegalArgumentException v144) {
                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v144, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                v142 = -47708637018094823L;
                                                                                                                                                                                                                                                                v143 = var1_1;
lbl733:
                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                v145 /* !! */  = m44.a("o", (long)v142, (long)v143);
                                                                                                                                                                                                                                                                v146 = var3_2;
                                                                                                                                                                                                                                                                if (var1_1 > 0L) {
                                                                                                                                                                                                                                                                    if (v146 != null) break block436;
                                                                                                                                                                                                                                                                    if (v145 /* !! */  == false) break block437;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                ** GOTO lbl750
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            catch (IllegalArgumentException v147) {
                                                                                                                                                                                                                                                                throw m44.a("k", (Object)v147, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            return 56;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        catch (IllegalArgumentException v148) {
                                                                                                                                                                                                                                                            throw m44.a("k", (Object)v148, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    v145 /* !! */  = m44.a("o", (long)-2006344890275874048L, (long)var1_1);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                    v146 = var3_2;
lbl750:
                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                    if (v146 != null) break block438;
                                                                                                                                                                                                                                                    if (v145 /* !! */  == false) break block439;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                catch (IllegalArgumentException v149) {
                                                                                                                                                                                                                                                    throw m44.a("k", (Object)v149, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                v145 /* !! */  = (CallSite)57;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            return (int)v145 /* !! */ ;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                            v150 = -1999905672666801824L;
                                                                                                                                                                                                                                            v151 = var1_1;
                                                                                                                                                                                                                                            if (var1_1 >= 0L) {
                                                                                                                                                                                                                                                if (m44.a("o", (long)v150, (long)v151) != null) {
                                                                                                                                                                                                                                                    return 58;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            ** GOTO lbl773
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        catch (IllegalArgumentException v152) {
                                                                                                                                                                                                                                            throw m44.a("k", (Object)v152, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                v150 = -219503885469625594L;
                                                                                                                                                                                                                                                v151 = var1_1;
lbl773:
                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                v153 /* !! */  = m44.a("o", (long)v150, (long)v151);
                                                                                                                                                                                                                                                v154 = var3_2;
                                                                                                                                                                                                                                                if (var1_1 >= 0L) {
                                                                                                                                                                                                                                                    if (v154 != null) break block440;
                                                                                                                                                                                                                                                    if (v153 /* !! */  == false) break block441;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                ** GOTO lbl790
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            catch (IllegalArgumentException v155) {
                                                                                                                                                                                                                                                throw m44.a("k", (Object)v155, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            return 59;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        catch (IllegalArgumentException v156) {
                                                                                                                                                                                                                                            throw m44.a("k", (Object)v156, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    v153 /* !! */  = m44.a("o", (long)-2236954856662070186L, (long)var1_1);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                    v154 = var3_2;
lbl790:
                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                    if (v154 != null) break block442;
                                                                                                                                                                                                                                    if (v153 /* !! */  == false) break block443;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                catch (IllegalArgumentException v157) {
                                                                                                                                                                                                                                    throw m44.a("k", (Object)v157, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                v153 /* !! */  = (CallSite)60;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            return (int)v153 /* !! */ ;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            v158 = -1903751137132745214L;
                                                                                                                                                                                                                            v159 = var1_1;
                                                                                                                                                                                                                            if (var1_1 >= 0L) {
                                                                                                                                                                                                                                if (m44.a("o", (long)v158, (long)v159) != null) {
                                                                                                                                                                                                                                    return 61;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            ** GOTO lbl813
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (IllegalArgumentException v160) {
                                                                                                                                                                                                                            throw m44.a("k", (Object)v160, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                v158 = -2028992257001367407L;
                                                                                                                                                                                                                                v159 = var1_1;
lbl813:
                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                v161 /* !! */  = m44.a("o", (long)v158, (long)v159);
                                                                                                                                                                                                                                v162 = var3_2;
                                                                                                                                                                                                                                if (var1_1 >= 0L) {
                                                                                                                                                                                                                                    if (v162 != null) break block444;
                                                                                                                                                                                                                                    if (v161 /* !! */  == false) break block445;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                ** GOTO lbl830
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (IllegalArgumentException v163) {
                                                                                                                                                                                                                                throw m44.a("k", (Object)v163, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            return 62;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (IllegalArgumentException v164) {
                                                                                                                                                                                                                            throw m44.a("k", (Object)v164, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    v161 /* !! */  = m44.a("o", (long)-345590571676586248L, (long)var1_1);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    v162 = var3_2;
lbl830:
                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                    if (v162 != null) break block446;
                                                                                                                                                                                                                    if (v161 /* !! */  == false) break block447;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (IllegalArgumentException v165) {
                                                                                                                                                                                                                    throw m44.a("k", (Object)v165, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                v161 /* !! */  = (CallSite)63;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            return (int)v161 /* !! */ ;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            v166 = -1937380306961687717L;
                                                                                                                                                                                                            v167 = var1_1;
                                                                                                                                                                                                            if (var1_1 >= 0L) {
                                                                                                                                                                                                                if (m44.a("o", (long)v166, (long)v167) != null) {
                                                                                                                                                                                                                    return 64;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            ** GOTO lbl853
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (IllegalArgumentException v168) {
                                                                                                                                                                                                            throw m44.a("k", (Object)v168, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                v166 = -115678359046804336L;
                                                                                                                                                                                                                v167 = var1_1;
lbl853:
                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                v169 /* !! */  = m44.a("o", (long)v166, (long)v167);
                                                                                                                                                                                                                v170 = var3_2;
                                                                                                                                                                                                                if (var1_1 >= 0L) {
                                                                                                                                                                                                                    if (v170 != null) break block448;
                                                                                                                                                                                                                    if (v169 /* !! */  == false) break block449;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                ** GOTO lbl870
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (IllegalArgumentException v171) {
                                                                                                                                                                                                                throw m44.a("k", (Object)v171, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            return 65;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (IllegalArgumentException v172) {
                                                                                                                                                                                                            throw m44.a("k", (Object)v172, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    v169 /* !! */  = m44.a("o", (long)-121419515222928617L, (long)var1_1);
                                                                                                                                                                                                }
                                                                                                                                                                                                try {
                                                                                                                                                                                                    v170 = var3_2;
lbl870:
                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                    if (v170 != null) break block450;
                                                                                                                                                                                                    if (v169 /* !! */  == false) break block451;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (IllegalArgumentException v173) {
                                                                                                                                                                                                    throw m44.a("k", (Object)v173, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                                }
                                                                                                                                                                                                v169 /* !! */  = (CallSite)66;
                                                                                                                                                                                            }
                                                                                                                                                                                            return (int)v169 /* !! */ ;
                                                                                                                                                                                        }
                                                                                                                                                                                        try {
                                                                                                                                                                                            v174 = -307228267919563358L;
                                                                                                                                                                                            v175 = var1_1;
                                                                                                                                                                                            if (var1_1 >= 0L) {
                                                                                                                                                                                                if (m44.a("o", (long)v174, (long)v175) != null) {
                                                                                                                                                                                                    return 67;
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            ** GOTO lbl893
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (IllegalArgumentException v176) {
                                                                                                                                                                                            throw m44.a("k", (Object)v176, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                        }
                                                                                                                                                                                        try {
                                                                                                                                                                                            try {
                                                                                                                                                                                                v174 = -100982014572001986L;
                                                                                                                                                                                                v175 = var1_1;
lbl893:
                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                v177 /* !! */  = m44.a("o", (long)v174, (long)v175);
                                                                                                                                                                                                v178 = var3_2;
                                                                                                                                                                                                if (var1_1 > 0L) {
                                                                                                                                                                                                    if (v178 != null) break block452;
                                                                                                                                                                                                    if (v177 /* !! */  == false) break block453;
                                                                                                                                                                                                }
                                                                                                                                                                                                ** GOTO lbl910
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (IllegalArgumentException v179) {
                                                                                                                                                                                                throw m44.a("k", (Object)v179, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                            }
                                                                                                                                                                                            return 68;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (IllegalArgumentException v180) {
                                                                                                                                                                                            throw m44.a("k", (Object)v180, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    v177 /* !! */  = m44.a("o", (long)-573943106448684493L, (long)var1_1);
                                                                                                                                                                                }
                                                                                                                                                                                try {
                                                                                                                                                                                    v178 = var3_2;
lbl910:
                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                    if (v178 != null) break block454;
                                                                                                                                                                                    if (v177 /* !! */  == false) break block455;
                                                                                                                                                                                }
                                                                                                                                                                                catch (IllegalArgumentException v181) {
                                                                                                                                                                                    throw m44.a("k", (Object)v181, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                                }
                                                                                                                                                                                v177 /* !! */  = (CallSite)69;
                                                                                                                                                                            }
                                                                                                                                                                            return (int)v177 /* !! */ ;
                                                                                                                                                                        }
                                                                                                                                                                        try {
                                                                                                                                                                            v182 = -2212284532524296397L;
                                                                                                                                                                            v183 = var1_1;
                                                                                                                                                                            if (var1_1 > 0L) {
                                                                                                                                                                                if (m44.a("o", (long)v182, (long)v183) != null) {
                                                                                                                                                                                    return 70;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            ** GOTO lbl933
                                                                                                                                                                        }
                                                                                                                                                                        catch (IllegalArgumentException v184) {
                                                                                                                                                                            throw m44.a("k", (Object)v184, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                        }
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                v182 = -1887008656365287975L;
                                                                                                                                                                                v183 = var1_1;
lbl933:
                                                                                                                                                                                // 2 sources

                                                                                                                                                                                v185 /* !! */  = m44.a("o", (long)v182, (long)v183);
                                                                                                                                                                                v186 = var3_2;
                                                                                                                                                                                if (var1_1 > 0L) {
                                                                                                                                                                                    if (v186 != null) break block456;
                                                                                                                                                                                    if (v185 /* !! */  == false) break block457;
                                                                                                                                                                                }
                                                                                                                                                                                ** GOTO lbl950
                                                                                                                                                                            }
                                                                                                                                                                            catch (IllegalArgumentException v187) {
                                                                                                                                                                                throw m44.a("k", (Object)v187, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                            }
                                                                                                                                                                            return 71;
                                                                                                                                                                        }
                                                                                                                                                                        catch (IllegalArgumentException v188) {
                                                                                                                                                                            throw m44.a("k", (Object)v188, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    v185 /* !! */  = m44.a("o", (long)-548812641332156225L, (long)var1_1);
                                                                                                                                                                }
                                                                                                                                                                try {
                                                                                                                                                                    v186 = var3_2;
lbl950:
                                                                                                                                                                    // 2 sources

                                                                                                                                                                    if (v186 != null) break block458;
                                                                                                                                                                    if (v185 /* !! */  == false) break block459;
                                                                                                                                                                }
                                                                                                                                                                catch (IllegalArgumentException v189) {
                                                                                                                                                                    throw m44.a("k", (Object)v189, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                                }
                                                                                                                                                                v185 /* !! */  = (CallSite)72;
                                                                                                                                                            }
                                                                                                                                                            return (int)v185 /* !! */ ;
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            v190 = -297470637715474189L;
                                                                                                                                                            v191 = var1_1;
                                                                                                                                                            if (var1_1 > 0L) {
                                                                                                                                                                if (m44.a("o", (long)v190, (long)v191) != null) {
                                                                                                                                                                    return 73;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            ** GOTO lbl973
                                                                                                                                                        }
                                                                                                                                                        catch (IllegalArgumentException v192) {
                                                                                                                                                            throw m44.a("k", (Object)v192, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                v190 = -2075978638555018850L;
                                                                                                                                                                v191 = var1_1;
lbl973:
                                                                                                                                                                // 2 sources

                                                                                                                                                                v193 /* !! */  = m44.a("o", (long)v190, (long)v191);
                                                                                                                                                                v194 = var3_2;
                                                                                                                                                                if (var1_1 > 0L) {
                                                                                                                                                                    if (v194 != null) break block460;
                                                                                                                                                                    if (v193 /* !! */  == false) break block461;
                                                                                                                                                                }
                                                                                                                                                                ** GOTO lbl990
                                                                                                                                                            }
                                                                                                                                                            catch (IllegalArgumentException v195) {
                                                                                                                                                                throw m44.a("k", (Object)v195, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                            }
                                                                                                                                                            return 74;
                                                                                                                                                        }
                                                                                                                                                        catch (IllegalArgumentException v196) {
                                                                                                                                                            throw m44.a("k", (Object)v196, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    v193 /* !! */  = m44.a("o", (long)-197762031267675976L, (long)var1_1);
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    v194 = var3_2;
lbl990:
                                                                                                                                                    // 2 sources

                                                                                                                                                    if (v194 != null) break block462;
                                                                                                                                                    if (v193 /* !! */  == false) break block463;
                                                                                                                                                }
                                                                                                                                                catch (IllegalArgumentException v197) {
                                                                                                                                                    throw m44.a("k", (Object)v197, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                                }
                                                                                                                                                v193 /* !! */  = (CallSite)75;
                                                                                                                                            }
                                                                                                                                            return (int)v193 /* !! */ ;
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            v198 = -2216306991427166469L;
                                                                                                                                            v199 = var1_1;
                                                                                                                                            if (var1_1 > 0L) {
                                                                                                                                                if (m44.a("o", (long)v198, (long)v199) != null) {
                                                                                                                                                    return 76;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            ** GOTO lbl1013
                                                                                                                                        }
                                                                                                                                        catch (IllegalArgumentException v200) {
                                                                                                                                            throw m44.a("k", (Object)v200, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                v198 = -371501334524558818L;
                                                                                                                                                v199 = var1_1;
lbl1013:
                                                                                                                                                // 2 sources

                                                                                                                                                v201 /* !! */  = m44.a("o", (long)v198, (long)v199);
                                                                                                                                                v202 = var3_2;
                                                                                                                                                if (var1_1 >= 0L) {
                                                                                                                                                    if (v202 != null) break block464;
                                                                                                                                                    if (v201 /* !! */  == false) break block465;
                                                                                                                                                }
                                                                                                                                                ** GOTO lbl1030
                                                                                                                                            }
                                                                                                                                            catch (IllegalArgumentException v203) {
                                                                                                                                                throw m44.a("k", (Object)v203, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                            }
                                                                                                                                            return 77;
                                                                                                                                        }
                                                                                                                                        catch (IllegalArgumentException v204) {
                                                                                                                                            throw m44.a("k", (Object)v204, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    v201 /* !! */  = m44.a("o", (long)-138364244307982380L, (long)var1_1);
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    v202 = var3_2;
lbl1030:
                                                                                                                                    // 2 sources

                                                                                                                                    if (v202 != null) break block466;
                                                                                                                                    if (v201 /* !! */  == false) break block467;
                                                                                                                                }
                                                                                                                                catch (IllegalArgumentException v205) {
                                                                                                                                    throw m44.a("k", (Object)v205, (long)-31927189003704011L, (long)var1_1);
                                                                                                                                }
                                                                                                                                v201 /* !! */  = (CallSite)78;
                                                                                                                            }
                                                                                                                            return (int)v201 /* !! */ ;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            v206 = -106235291754503093L;
                                                                                                                            v207 = var1_1;
                                                                                                                            if (var1_1 >= 0L) {
                                                                                                                                if (m44.a("o", (long)v206, (long)v207) != null) {
                                                                                                                                    return 79;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            ** GOTO lbl1053
                                                                                                                        }
                                                                                                                        catch (IllegalArgumentException v208) {
                                                                                                                            throw m44.a("k", (Object)v208, (long)-31927189003704011L, (long)var1_1);
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                v206 = -74326299090092172L;
                                                                                                                                v207 = var1_1;
lbl1053:
                                                                                                                                // 2 sources

                                                                                                                                v209 /* !! */  = m44.a("o", (long)v206, (long)v207);
                                                                                                                                v210 = var3_2;
                                                                                                                                if (var1_1 >= 0L) {
                                                                                                                                    if (v210 != null) break block468;
                                                                                                                                    if (v209 /* !! */  == false) break block469;
                                                                                                                                }
                                                                                                                                ** GOTO lbl1070
                                                                                                                            }
                                                                                                                            catch (IllegalArgumentException v211) {
                                                                                                                                throw m44.a("k", (Object)v211, (long)-31927189003704011L, (long)var1_1);
                                                                                                                            }
                                                                                                                            return 80;
                                                                                                                        }
                                                                                                                        catch (IllegalArgumentException v212) {
                                                                                                                            throw m44.a("k", (Object)v212, (long)-31927189003704011L, (long)var1_1);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v209 /* !! */  = m44.a("o", (long)-2163375020487532019L, (long)var1_1);
                                                                                                                }
                                                                                                                try {
                                                                                                                    v210 = var3_2;
lbl1070:
                                                                                                                    // 2 sources

                                                                                                                    if (v210 != null) break block470;
                                                                                                                    if (v209 /* !! */  == false) break block471;
                                                                                                                }
                                                                                                                catch (IllegalArgumentException v213) {
                                                                                                                    throw m44.a("k", (Object)v213, (long)-31927189003704011L, (long)var1_1);
                                                                                                                }
                                                                                                                v209 /* !! */  = (CallSite)81;
                                                                                                            }
                                                                                                            return (int)v209 /* !! */ ;
                                                                                                        }
                                                                                                        try {
                                                                                                            v214 = -559060110698314772L;
                                                                                                            v215 = var1_1;
                                                                                                            if (var1_1 > 0L) {
                                                                                                                if (m44.a("o", (long)v214, (long)v215) != null) {
                                                                                                                    return 82;
                                                                                                                }
                                                                                                            }
                                                                                                            ** GOTO lbl1093
                                                                                                        }
                                                                                                        catch (IllegalArgumentException v216) {
                                                                                                            throw m44.a("k", (Object)v216, (long)-31927189003704011L, (long)var1_1);
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                v214 = -33977260380730329L;
                                                                                                                v215 = var1_1;
lbl1093:
                                                                                                                // 2 sources

                                                                                                                v217 /* !! */  = m44.a("o", (long)v214, (long)v215);
                                                                                                                v218 = var3_2;
                                                                                                                if (var1_1 > 0L) {
                                                                                                                    if (v218 != null) break block472;
                                                                                                                    if (v217 /* !! */  == false) break block473;
                                                                                                                }
                                                                                                                ** GOTO lbl1110
                                                                                                            }
                                                                                                            catch (IllegalArgumentException v219) {
                                                                                                                throw m44.a("k", (Object)v219, (long)-31927189003704011L, (long)var1_1);
                                                                                                            }
                                                                                                            return 83;
                                                                                                        }
                                                                                                        catch (IllegalArgumentException v220) {
                                                                                                            throw m44.a("k", (Object)v220, (long)-31927189003704011L, (long)var1_1);
                                                                                                        }
                                                                                                    }
                                                                                                    v217 /* !! */  = m44.a("o", (long)-1898995255534869797L, (long)var1_1);
                                                                                                }
                                                                                                try {
                                                                                                    v218 = var3_2;
lbl1110:
                                                                                                    // 2 sources

                                                                                                    if (v218 != null) break block474;
                                                                                                    if (v217 /* !! */  == false) break block475;
                                                                                                }
                                                                                                catch (IllegalArgumentException v221) {
                                                                                                    throw m44.a("k", (Object)v221, (long)-31927189003704011L, (long)var1_1);
                                                                                                }
                                                                                                v217 /* !! */  = (CallSite)84;
                                                                                            }
                                                                                            return (int)v217 /* !! */ ;
                                                                                        }
                                                                                        try {
                                                                                            v222 = -390468297797513252L;
                                                                                            v223 = var1_1;
                                                                                            if (var1_1 >= 0L) {
                                                                                                if (m44.a("o", (long)v222, (long)v223) != null) {
                                                                                                    return 85;
                                                                                                }
                                                                                            }
                                                                                            ** GOTO lbl1133
                                                                                        }
                                                                                        catch (IllegalArgumentException v224) {
                                                                                            throw m44.a("k", (Object)v224, (long)-31927189003704011L, (long)var1_1);
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                v222 = -2305318831821288253L;
                                                                                                v223 = var1_1;
lbl1133:
                                                                                                // 2 sources

                                                                                                v225 /* !! */  = m44.a("o", (long)v222, (long)v223);
                                                                                                v226 = var3_2;
                                                                                                if (var1_1 >= 0L) {
                                                                                                    if (v226 != null) break block476;
                                                                                                    if (v225 /* !! */  == false) break block477;
                                                                                                }
                                                                                                ** GOTO lbl1150
                                                                                            }
                                                                                            catch (IllegalArgumentException v227) {
                                                                                                throw m44.a("k", (Object)v227, (long)-31927189003704011L, (long)var1_1);
                                                                                            }
                                                                                            return 86;
                                                                                        }
                                                                                        catch (IllegalArgumentException v228) {
                                                                                            throw m44.a("k", (Object)v228, (long)-31927189003704011L, (long)var1_1);
                                                                                        }
                                                                                    }
                                                                                    v225 /* !! */  = m44.a("o", (long)-2161084779091909724L, (long)var1_1);
                                                                                }
                                                                                try {
                                                                                    v226 = var3_2;
lbl1150:
                                                                                    // 2 sources

                                                                                    if (v226 != null) break block478;
                                                                                    if (v225 /* !! */  == false) break block479;
                                                                                }
                                                                                catch (IllegalArgumentException v229) {
                                                                                    throw m44.a("k", (Object)v229, (long)-31927189003704011L, (long)var1_1);
                                                                                }
                                                                                v225 /* !! */  = (CallSite)87;
                                                                            }
                                                                            return (int)v225 /* !! */ ;
                                                                        }
                                                                        try {
                                                                            v230 = -2175549458612666054L;
                                                                            v231 = var1_1;
                                                                            if (var1_1 > 0L) {
                                                                                if (m44.a("o", (long)v230, (long)v231) != null) {
                                                                                    return 88;
                                                                                }
                                                                            }
                                                                            ** GOTO lbl1173
                                                                        }
                                                                        catch (IllegalArgumentException v232) {
                                                                            throw m44.a("k", (Object)v232, (long)-31927189003704011L, (long)var1_1);
                                                                        }
                                                                        try {
                                                                            try {
                                                                                v230 = -2012916154572385603L;
                                                                                v231 = var1_1;
lbl1173:
                                                                                // 2 sources

                                                                                v233 /* !! */  = m44.a("o", (long)v230, (long)v231);
                                                                                v234 = var3_2;
                                                                                if (var1_1 > 0L) {
                                                                                    if (v234 != null) break block480;
                                                                                    if (v233 /* !! */  == false) break block481;
                                                                                }
                                                                                ** GOTO lbl1190
                                                                            }
                                                                            catch (IllegalArgumentException v235) {
                                                                                throw m44.a("k", (Object)v235, (long)-31927189003704011L, (long)var1_1);
                                                                            }
                                                                            return 89;
                                                                        }
                                                                        catch (IllegalArgumentException v236) {
                                                                            throw m44.a("k", (Object)v236, (long)-31927189003704011L, (long)var1_1);
                                                                        }
                                                                    }
                                                                    v233 /* !! */  = m44.a("o", (long)-2300822531943552216L, (long)var1_1);
                                                                }
                                                                try {
                                                                    v234 = var3_2;
lbl1190:
                                                                    // 2 sources

                                                                    if (v234 != null) break block482;
                                                                    if (v233 /* !! */  == false) break block483;
                                                                }
                                                                catch (IllegalArgumentException v237) {
                                                                    throw m44.a("k", (Object)v237, (long)-31927189003704011L, (long)var1_1);
                                                                }
                                                                v233 /* !! */  = (CallSite)90;
                                                            }
                                                            return (int)v233 /* !! */ ;
                                                        }
                                                        try {
                                                            v238 = -1978338564190701692L;
                                                            v239 = var1_1;
                                                            if (var1_1 > 0L) {
                                                                if (m44.a("o", (long)v238, (long)v239) != null) {
                                                                    return 91;
                                                                }
                                                            }
                                                            ** GOTO lbl1213
                                                        }
                                                        catch (IllegalArgumentException v240) {
                                                            throw m44.a("k", (Object)v240, (long)-31927189003704011L, (long)var1_1);
                                                        }
                                                        try {
                                                            try {
                                                                v238 = -1964444979039289550L;
                                                                v239 = var1_1;
lbl1213:
                                                                // 2 sources

                                                                v241 /* !! */  = m44.a("o", (long)v238, (long)v239);
                                                                v242 = var3_2;
                                                                if (var1_1 >= 0L) {
                                                                    if (v242 != null) break block484;
                                                                    if (v241 /* !! */  == false) break block485;
                                                                }
                                                                ** GOTO lbl1230
                                                            }
                                                            catch (IllegalArgumentException v243) {
                                                                throw m44.a("k", (Object)v243, (long)-31927189003704011L, (long)var1_1);
                                                            }
                                                            return 92;
                                                        }
                                                        catch (IllegalArgumentException v244) {
                                                            throw m44.a("k", (Object)v244, (long)-31927189003704011L, (long)var1_1);
                                                        }
                                                    }
                                                    v241 /* !! */  = m44.a("o", (long)-269289870897638823L, (long)var1_1);
                                                }
                                                try {
                                                    v242 = var3_2;
lbl1230:
                                                    // 2 sources

                                                    if (v242 != null) break block486;
                                                    if (v241 /* !! */  == false) break block487;
                                                }
                                                catch (IllegalArgumentException v245) {
                                                    throw m44.a("k", (Object)v245, (long)-31927189003704011L, (long)var1_1);
                                                }
                                                v241 /* !! */  = (CallSite)93;
                                            }
                                            return (int)v241 /* !! */ ;
                                        }
                                        try {
                                            v246 = -108007827448543232L;
                                            v247 = var1_1;
                                            if (var1_1 > 0L) {
                                                if (m44.a("o", (long)v246, (long)v247) != null) {
                                                    return 94;
                                                }
                                            }
                                            ** GOTO lbl1253
                                        }
                                        catch (IllegalArgumentException v248) {
                                            throw m44.a("k", (Object)v248, (long)-31927189003704011L, (long)var1_1);
                                        }
                                        try {
                                            try {
                                                v246 = -1991599834316181393L;
                                                v247 = var1_1;
lbl1253:
                                                // 2 sources

                                                v249 /* !! */  = m44.a("o", (long)v246, (long)v247);
                                                v250 = var3_2;
                                                if (var1_1 >= 0L) {
                                                    if (v250 != null) break block488;
                                                    if (v249 /* !! */  == false) break block489;
                                                }
                                                ** GOTO lbl1270
                                            }
                                            catch (IllegalArgumentException v251) {
                                                throw m44.a("k", (Object)v251, (long)-31927189003704011L, (long)var1_1);
                                            }
                                            return 95;
                                        }
                                        catch (IllegalArgumentException v252) {
                                            throw m44.a("k", (Object)v252, (long)-31927189003704011L, (long)var1_1);
                                        }
                                    }
                                    v249 /* !! */  = m44.a("o", (long)-10780704968941405L, (long)var1_1);
                                }
                                try {
                                    v250 = var3_2;
lbl1270:
                                    // 2 sources

                                    if (v250 != null) break block490;
                                    if (v249 /* !! */  == false) break block491;
                                }
                                catch (IllegalArgumentException v253) {
                                    throw m44.a("k", (Object)v253, (long)-31927189003704011L, (long)var1_1);
                                }
                                v249 /* !! */  = (CallSite)96;
                            }
                            return (int)v249 /* !! */ ;
                        }
                        try {
                            v254 = -274457330965461101L;
                            v255 = var1_1;
                            if (var1_1 > 0L) {
                                if (m44.a("o", (long)v254, (long)v255) != null) {
                                    return 97;
                                }
                            }
                            ** GOTO lbl1293
                        }
                        catch (IllegalArgumentException v256) {
                            throw m44.a("k", (Object)v256, (long)-31927189003704011L, (long)var1_1);
                        }
                        try {
                            try {
                                v254 = -278256871839672577L;
                                v255 = var1_1;
lbl1293:
                                // 2 sources

                                v257 /* !! */  = m44.a("o", (long)v254, (long)v255);
                                v258 = var3_2;
                                if (var1_1 > 0L) {
                                    if (v258 != null) break block492;
                                    if (v257 /* !! */  == false) break block493;
                                }
                                ** GOTO lbl1311
                            }
                            catch (IllegalArgumentException v259) {
                                throw m44.a("k", (Object)v259, (long)-31927189003704011L, (long)var1_1);
                            }
                            return 98;
                        }
                        catch (IllegalArgumentException v260) {
                            throw m44.a("k", (Object)v260, (long)-31927189003704011L, (long)var1_1);
                        }
                    }
                    v257 /* !! */  = m44.a("o", (long)-2277202181217541812L, (long)var1_1);
                }
                try {
                    try {
                        v258 = var3_2;
lbl1311:
                        // 2 sources

                        if (v258 != null) break block494;
                        if (v257 /* !! */  == false) break block495;
                    }
                    catch (IllegalArgumentException v261) {
                        throw m44.a("k", (Object)v261, (long)-31927189003704011L, (long)var1_1);
                    }
                    return 99;
                }
                catch (IllegalArgumentException v262) {
                    throw m44.a("k", (Object)v262, (long)-31927189003704011L, (long)var1_1);
                }
            }
            v257 /* !! */  = (CallSite)false;
        }
        return (int)v257 /* !! */ ;
    }

    public static String t(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x49D8A6BBBA92L;
        int n10 = (int)(l12 >>> 32);
        int n11 = (int)(l12 << 32 >>> 48);
        int n12 = (int)(l12 << 48 >>> 48);
        long l13 = l11 ^ 0x5690E5BFBDCFL;
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append((String)((Object)cf.a("y", (int)2273, (long)(0xDDDFB05258F2AE9L ^ l10))));
            Object[] objectArray2 = new Object[5];
            objectArray2[4] = cf.a("y", (int)19686, (long)(0x673C02D9B0496EDAL ^ l10));
            objectArray2[3] = n12;
            objectArray2[2] = n11;
            objectArray2[1] = n10;
            objectArray2[0] = stringBuilder.toString();
            return m44.a("l", (Object)objectArray2, (long)-8037430324428005274L, (long)l10);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            lk0.t(false, new String[]{m44.a("s", (Object)noSuchAlgorithmException, (long)-7899612039451307945L, (long)l10)}, l13);
            return "";
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String x(Object[] objectArray) {
        Object object;
        block15: {
            long l10 = (Long)objectArray[0];
            String[] stringArray = (String[])objectArray[1];
            l10 = a ^ l10;
            StringBuilder stringBuilder = new StringBuilder();
            CallSite callSite = m44.a("i", (long)3181646859810058769L, (long)l10);
            stringBuilder.append("'");
            int n10 = 0;
            block10: while (n10 < stringArray.length) {
                try {
                    try {
                        try {
                            try {
                                stringBuilder.append(stringArray[n10]);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("i", (Object)illegalArgumentException, (long)3743821676232058191L, (long)l10);
                            }
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("i", (Object)illegalArgumentException, (long)3743821676232058191L, (long)l10);
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("i", (Object)illegalArgumentException, (long)3743821676232058191L, (long)l10);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("i", (Object)illegalArgumentException, (long)3743821676232058191L, (long)l10);
                }
                do {
                    CallSite callSite2;
                    block18: {
                        block19: {
                            int n11;
                            int n12;
                            block16: {
                                block17: {
                                    object = callSite;
                                    if (l10 <= 0L) break block15;
                                    if (object != null) break block10;
                                    n12 = n10;
                                    n11 = stringArray.length - 2;
                                    if (l10 <= 0L || callSite != null || l10 < 0L) break block16;
                                    if (n12 >= n11) break block17;
                                    stringBuilder.append((String)((Object)cf.a("y", (int)17079, (long)(0x75AB3D2CF29EDE26L ^ l10))));
                                    callSite2 = callSite;
                                    if (l10 < 0L) break block18;
                                    if (callSite2 == null) break block19;
                                }
                                n12 = n10;
                                n11 = stringArray.length - 1;
                            }
                            try {
                                if (n12 < n11) {
                                    stringBuilder.append((String)((Object)cf.a("y", (int)20154, (long)(0x47B16B85B95CD212L ^ l10))));
                                }
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("i", (Object)illegalArgumentException, (long)3743821676232058191L, (long)l10);
                            }
                        }
                        ++n10;
                        callSite2 = callSite;
                    }
                    if (callSite2 == null) continue block10;
                    stringBuilder.append("'");
                } while (l10 < 0L);
            }
            object = stringBuilder.toString();
        }
        return object;
    }

    /*
     * Exception decompiling
     */
    public static String L(Object[] var0) {
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

    public static void o(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        char[] cArray = (char[])objectArray[1];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x470B17078D83L;
        long l13 = l11 ^ 0x246B7F6C8D3AL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l13;
        objectArray2[0] = 97;
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l12;
        objectArray3[1] = m44.a("o", (Object)objectArray2, (long)-5920437197041538323L, (long)l10);
        objectArray3[0] = cArray;
        m44.a("o", (Object)objectArray3, (long)-6045940634542956621L, (long)l10);
    }

    private static void N(List list, int n10, int n11) {
        List list2 = list;
        Object e10 = list2.get(n10);
        list2.set(n10, list2.get(n11));
        list2.set(n11, e10);
    }

    public static HashMap s(Object[] objectArray) {
        Map map = (Map)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        try {
            if (m44.a("m", (long)7240723259828663289L, (long)l10) != false) {
                return new LinkedHashMap(map);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("i", (Object)illegalArgumentException, (long)7436766963561886095L, (long)l10);
        }
        return new HashMap(map);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static long s(Object[] var0) {
        block21: {
            var1_1 = (Long)var0[0];
            var3_2 = (Integer)var0[1];
            var4_3 = (var1_1 = cf.a ^ var1_1) ^ 13722936840811L;
            var6_4 = m44.a("h", (long)-8016964920936984952L, (long)var1_1);
            try {
                v0 = m44.a("l", (long)-7778834303983425867L, (long)var1_1);
                if (var6_4 == null) {
                    if (v0 == null) break block21;
                }
                ** GOTO lbl17
            }
            catch (Throwable v1) {
                throw m44.a("h", (Object)v1, (long)-8111607529155880490L, (long)var1_1);
            }
            try {
                block26: {
                    block24: {
                        block25: {
                            block23: {
                                block22: {
                                    block29: {
                                        block28: {
                                            block27: {
                                                v0 = m44.a("l", (long)-7778834303983425867L, (long)var1_1);
lbl17:
                                                // 2 sources

                                                var9_5 = m44.a("h", (Object)v0, (long)-8286483862503466324L, (long)var1_1);
                                                cfr_temp_0 = var9_5 - 0L;
                                                v2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                                if (var6_4 != null) break block22;
                                                if (v2 <= 0) ** GOTO lbl40
                                                break block27;
                                                catch (Throwable v3) {
                                                    throw m44.a("h", (Object)v3, (long)-8111607529155880490L, (long)var1_1);
                                                }
                                            }
                                            v2 = (reference)var3_2;
                                            if (var1_1 <= 0L || var6_4 != null) break block22;
                                            break block28;
                                            catch (Throwable v4) {
                                                throw m44.a("h", (Object)v4, (long)-8111607529155880490L, (long)var1_1);
                                            }
                                        }
                                        if (v2 < 0) break block23;
                                        break block29;
                                        catch (Throwable v5) {
                                            throw m44.a("h", (Object)v5, (long)-8111607529155880490L, (long)var1_1);
                                        }
                                    }
                                    try {
                                        block30: {
                                            v6 = var9_5;
                                            if (var1_1 <= 0L) break block24;
                                            v7 = 0L;
                                            if (var6_4 != null) break block25;
                                            break block30;
                                            catch (Throwable v8) {
                                                throw m44.a("h", (Object)v8, (long)-8111607529155880490L, (long)var1_1);
                                            }
                                        }
                                        cfr_temp_1 = v6 - v7;
                                        v2 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                    }
                                    catch (Throwable v9) {
                                        throw m44.a("h", (Object)v9, (long)-8111607529155880490L, (long)var1_1);
                                    }
                                }
                                try {
                                    block31: {
                                        if (var1_1 < 0L) break block31;
                                        if (v2 >= 0) ** GOTO lbl73
                                        v2 = (reference)var3_2;
                                    }
                                    if (v2 > 0) {
                                    }
                                    ** GOTO lbl73
                                }
                                catch (Throwable v10) {
                                    throw m44.a("h", (Object)v10, (long)-8111607529155880490L, (long)var1_1);
                                }
                            }
                            v11 = var9_5 + (long)var3_2;
                            if (var1_1 <= 0L) ** GOTO lbl74
                            var7_7 = v11;
                            try {
                                if (var6_4 == null) break block26;
lbl73:
                                // 3 sources

                                v11 = var9_5;
lbl74:
                                // 2 sources

                                v7 = var3_2;
                            }
                            catch (Throwable v12) {
                                throw m44.a("h", (Object)v12, (long)-8111607529155880490L, (long)var1_1);
                            }
                        }
                        v6 = v11 - v7;
                    }
                    var7_7 = v6;
                }
                return (long)var7_7;
            }
            catch (Throwable var9_6) {
                // empty catch block
            }
        }
        v13 = new Object[1];
        v13[0] = var4_3;
        var7_8 = m44.a("h", (Object)v13, (long)-7808408723125175480L, (long)var1_1);
        return (long)var7_8;
    }

    public static Map e(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Map map = (Map)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x6889E7423B09L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = map;
        CallSite callSite = m44.a("n", (Object)objectArray2, (long)-2522200760351511440L, (long)l10);
        return callSite;
    }

    public static String c(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x37F59AFA7287L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = cf.a("y", (int)25900, (long)(0x7C26DDAD948CA582L ^ l10));
        objectArray2[1] = cf.a("y", (int)18175, (long)(0x701251B8EFCB0640L ^ l10));
        objectArray2[0] = l11;
        return m44.a("k", (Object)objectArray2, (long)-1171107944256594453L, (long)l10);
    }

    public static HashMap X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        float f10 = ((Float)objectArray[2]).floatValue();
        l10 = a ^ l10;
        try {
            if (m44.a("n", (long)-7933303416059132318L, (long)l10) != false) {
                return new LinkedHashMap(n10, f10);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("j", (Object)illegalArgumentException, (long)-7876868571170700268L, (long)l10);
        }
        return new HashMap(n10, f10);
    }

    public static String H(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String)((Object)cf.a("y", (int)23154, (long)(0x6948E4F449F355B2L ^ l10))));
        CallSite callSite = m44.a("m", (long)-6652114415344523578L, (long)l10);
        m44.a("r", (Object)simpleDateFormat, (Object)callSite, (long)-4893595813350567531L, (long)l10);
        return m44.a("r", (Object)simpleDateFormat, (Object)new Date(), (long)-4971376014894483434L, (long)l10);
    }

    public static Map A(Object[] objectArray) {
        CallSite callSite;
        block3: {
            Map map = (Map)objectArray[0];
            long l10 = (Long)objectArray[1];
            long l11 = l10 = a ^ l10;
            long l12 = l11 ^ 0x2A7C4A310CFCL;
            long l13 = l11 ^ 0x6E94460D631CL;
            int n10 = (int)(l13 >>> 32);
            int n11 = (int)(l13 << 32 >>> 48);
            int n12 = (int)(l13 << 48 >>> 48);
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l12;
            objectArray2[0] = cf.x(map.size(), n10, (char)n11, (short)n12);
            CallSite callSite2 = m44.a("n", (Object)objectArray2, (long)-8629628792951927331L, (long)l10);
            CallSite callSite3 = m44.a("n", (long)-8493702058379602922L, (long)l10);
            for (Map.Entry entry : map.entrySet()) {
                callSite = callSite2;
                CallSite callSite4 = callSite3;
                if (l10 > 0L) {
                    if (callSite4 != null) break block3;
                    callSite4 = entry.getValue();
                }
                Object k10 = callSite.put(callSite4, entry.getKey());
                if (callSite3 == null) continue;
            }
            callSite = callSite2;
        }
        return callSite;
    }

    public static String e(Object[] objectArray) {
        Object object;
        block13: {
            StringBuilder stringBuilder;
            block14: {
                Collection collection = (Collection)objectArray[0];
                long l10 = (Long)objectArray[1];
                l10 = a ^ l10;
                stringBuilder = new StringBuilder();
                CallSite callSite = m44.a("j", (long)6240950829287164074L, (long)l10);
                stringBuilder.append("'");
                int n10 = collection.size();
                int n11 = 0;
                for (String string : collection) {
                    CallSite callSite2;
                    block17: {
                        block18: {
                            int n12;
                            int n13;
                            block15: {
                                try {
                                    block16: {
                                        try {
                                            try {
                                                try {
                                                    stringBuilder.append(string);
                                                    object = callSite;
                                                    if (l10 < 0L) break block13;
                                                    if (object != null) break block14;
                                                    n13 = n11;
                                                    n12 = n10 - 2;
                                                    if (l10 < 0L || callSite != null) break block15;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw m44.a("j", (Object)illegalArgumentException, (long)5282595619458277364L, (long)l10);
                                                }
                                                if (l10 < 0L) break block15;
                                                if (n13 >= n12) break block16;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw m44.a("j", (Object)illegalArgumentException, (long)5282595619458277364L, (long)l10);
                                            }
                                            stringBuilder.append((String)((Object)cf.a("y", (int)13333, (long)(0x32DF6F27A510D217L ^ l10))));
                                            callSite2 = callSite;
                                            if (l10 <= 0L) break block17;
                                            if (callSite2 == null) break block18;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("j", (Object)illegalArgumentException, (long)5282595619458277364L, (long)l10);
                                        }
                                    }
                                    n13 = n11;
                                    n12 = n10 - 1;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("j", (Object)illegalArgumentException, (long)5282595619458277364L, (long)l10);
                                }
                            }
                            try {
                                if (n13 < n12) {
                                    stringBuilder.append((String)((Object)cf.a("y", (int)2051, (long)(0x1A91AA1D3522EE2CL ^ l10))));
                                }
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("j", (Object)illegalArgumentException, (long)5282595619458277364L, (long)l10);
                            }
                        }
                        ++n11;
                        callSite2 = callSite;
                    }
                    if (callSite2 == null) continue;
                }
                stringBuilder.append("'");
                if (l10 >= 0L) {
                    // empty if block
                }
            }
            object = stringBuilder.toString();
        }
        return object;
    }

    public static r Q(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            if (m44.a("h", (long)5868573699502556916L, (long)l10) != false) {
                return new z5();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("l", (Object)illegalArgumentException, (long)5925013041153655938L, (long)l10);
        }
        return new cv();
    }

    public static List t(Object[] objectArray) {
        ArrayList<String> arrayList3;
        long l10 = (Long)objectArray[0];
        Collection collection = (Collection)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x6D5F3A8F56D4L;
        ArrayList<String> arrayList2 = new ArrayList<String>(collection.size());
        CallSite callSite = m44.a("j", (long)-2610904234000267790L, (long)l10);
        block6: for (ArrayList<String> arrayList3 : collection) {
            do {
                CallSite callSite2;
                block10: {
                    block8: {
                        String string = (String)((Object)arrayList3);
                        try {
                            Object object;
                            block9: {
                                try {
                                    try {
                                        Object[] objectArray2 = new Object[2];
                                        objectArray2[1] = l11;
                                        objectArray2[0] = string;
                                        object = m44.a("j", (Object)objectArray2, (long)-2682717629830444863L, (long)l10);
                                        if (callSite != null) break block8;
                                        if (object == false) break block9;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("j", (Object)illegalArgumentException, (long)-4316709717392567636L, (long)l10);
                                    }
                                    arrayList2.add((String)((Object)m44.a("j", (Object)new Object[]{string}, (long)-4262435208510109731L, (long)l10)) + (String)((Object)cf.a("y", (int)5487, (long)(0x483FDBD5E0CDFE3CL ^ l10))) + string + ")");
                                    callSite2 = callSite;
                                    if (l10 <= 0L) break block10;
                                    if (callSite2 == null) break block8;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("j", (Object)illegalArgumentException, (long)-4316709717392567636L, (long)l10);
                                }
                            }
                            object = arrayList2.add(string);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("j", (Object)illegalArgumentException, (long)-4316709717392567636L, (long)l10);
                        }
                    }
                    callSite2 = callSite;
                }
                if (callSite2 == null) continue block6;
                arrayList3 = arrayList2;
            } while (l10 <= 0L);
        }
        return arrayList3;
    }

    public static String p(Object[] objectArray) {
        Object object;
        block5: {
            long l10;
            long l11;
            String string;
            block6: {
                string = (String)objectArray[0];
                int n10 = (Integer)objectArray[1];
                l11 = (Long)objectArray[2];
                l10 = (l11 = a ^ l11) ^ 0x2712E7DB38A4L;
                CallSite callSite = m44.a("n", (long)7376913176472680534L, (long)l11);
                try {
                    try {
                        object = string;
                        if (callSite != null) break block5;
                        if (((String)object).length() > n10) {
                        }
                        break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("n", (Object)illegalArgumentException, (long)8769577748122464008L, (long)l11);
                    }
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = string.substring(0, n10);
                    objectArray2[0] = l10;
                    return (String)((Object)m44.a("n", (Object)objectArray2, (long)9126842187692310008L, (long)l11)) + (String)((Object)cf.a("y", (int)31164, (long)(0xF4541659E7B2F56L ^ l11))) + (string.length() - n10) + (String)((Object)cf.a("y", (int)8526, (long)(0x4E4D35E0A70777BAL ^ l11)));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)8769577748122464008L, (long)l11);
                }
            }
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = string;
            objectArray3[0] = l10;
            object = m44.a("n", (Object)objectArray3, (long)9126842187692310008L, (long)l11);
        }
        return object;
    }

    public static byte[] R(Object[] objectArray) {
        byte[] byArray;
        block6: {
            boolean bl2;
            long l10 = (Long)objectArray[0];
            String string = (String)objectArray[1];
            int n10 = (Integer)objectArray[2];
            long l11 = (l10 = a ^ l10) ^ 0x1D20284F432CL;
            try {
                bl2 = n10 <= 36;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("o", (Object)illegalArgumentException, (long)8325610843825923377L, (long)l10);
            }
            lk0.t(bl2, new String[]{(String)((Object)cf.a("y", (int)12838, (long)(0x7628B56B671B6EF7L ^ l10))) + n10}, l11);
            int n11 = string.length();
            byte[] byArray2 = new byte[n11 / 2];
            int n12 = 0;
            try {
                for (int i10 = 0; i10 < n11; i10 += 2) {
                    byArray = byArray2;
                    if (l10 >= 0L) {
                        byArray[n12++] = (byte)m44.a("o", string.substring(i10, i10 + 2), (int)n10, (long)8244558880212006556L, (long)l10);
                        continue;
                    }
                    break block6;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("o", (Object)illegalArgumentException, (long)8325610843825923377L, (long)l10);
            }
            byArray = byArray2;
        }
        return byArray;
    }

    /*
     * Exception decompiling
     */
    public static String X(Object[] var0) {
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
     * Exception decompiling
     */
    public static String Q(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[DOLOOP]], but top level block is 9[SIMPLE_IF_TAKEN]
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

    public static LinkedHashSet s(Object[] objectArray) {
        LinkedHashSet linkedHashSet = (LinkedHashSet)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        return (LinkedHashSet)((Object)m44.a("q", (Object)linkedHashSet, (long)-2217868574557866750L, (long)l10));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List Z(Object[] objectArray) {
        ArrayList<CallSite> arrayList;
        Enumeration enumeration = (Enumeration)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        ArrayList<CallSite> arrayList2 = new ArrayList<CallSite>();
        CallSite callSite = m44.a("l", (long)-1379702996048481556L, (long)l10);
        block2: while (enumeration.hasMoreElements()) {
            try {
                do {
                    arrayList = arrayList2;
                    CallSite callSite2 = callSite;
                    if (l10 > 0L) {
                        if (callSite2 != null) return arrayList;
                        callSite2 = enumeration.nextElement();
                    }
                    arrayList.add(callSite2);
                    if (callSite == null) continue block2;
                } while (l10 < 0L);
                break;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("l", (Object)illegalArgumentException, (long)-934061087560309326L, (long)l10);
            }
        }
        arrayList = arrayList2;
        return arrayList;
    }

    /*
     * Unable to fully structure code
     */
    public static String S(Object[] var0) {
        block13: {
            block11: {
                var3_1 = (byte[])var0[0];
                var1_2 = (Long)var0[1];
                var4_3 = (var1_2 = cf.a ^ var1_2) ^ 77229246223093L;
                var6_4 = m44.a("k", (long)-6625602541733103045L, (long)var1_2);
                if (var3_1 == null) break block13;
                var7_5 = new StringBuilder();
                var7_5.append("{");
                var8_6 = 0;
                while (var8_6 < var3_1.length) {
                    block8: {
                        block9: {
                            block12: {
                                try {
                                    try {
                                        block10: {
                                            try {
                                                if (var1_2 < 0L) ** GOTO lbl-1000
                                                v0 = new Object[2];
                                                v0[1] = var4_3;
                                                v0[0] = (int)var3_1[var8_6];
                                                v1 = var7_5.append((String)m44.a("k", (Object)v0, (long)-6415061835577660790L, (long)var1_2));
                                                v2 = var6_4;
lbl23:
                                                // 2 sources

                                                while (v2 == null) lbl-1000:
                                                // 2 sources

                                                {
                                                    v3 = var6_4;
                                                    if (var1_2 < 0L) break block8;
                                                    if (v3 != null) break block9;
                                                    break block10;
                                                }
                                                break block11;
                                            }
                                            catch (IllegalArgumentException v4) {
                                                throw m44.a("k", (Object)v4, (long)-4909237387489596059L, (long)var1_2);
                                            }
                                        }
                                        if (var8_6 >= var3_1.length - 1) break block12;
                                    }
                                    catch (IllegalArgumentException v5) {
                                        throw m44.a("k", (Object)v5, (long)-4909237387489596059L, (long)var1_2);
                                    }
                                    var7_5.append(',');
                                }
                                catch (IllegalArgumentException v6) {
                                    throw m44.a("k", (Object)v6, (long)-4909237387489596059L, (long)var1_2);
                                }
                            }
                            ++var8_6;
                        }
                        v3 = var6_4;
                    }
                    if (v3 == null) continue;
                }
                v7 = new StringBuilder().append(var7_5.toString());
                v2 = "}";
                if (var1_2 <= 0L) ** GOTO lbl23
                v1 = v7.append((String)v2);
            }
            return v1.toString();
        }
        return cf.a("y", (int)10124, (long)(3315843579247309569L ^ var1_2));
    }

    public static void n(Object[] objectArray) {
        int[] nArray = (int[])objectArray[0];
        long l10 = (Long)objectArray[1];
        int n10 = (Integer)objectArray[2];
        Random random = (Random)objectArray[3];
        l10 = a ^ l10;
        for (int i10 = n10; i10 > 1; --i10) {
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = random.nextInt(i10);
            objectArray2[1] = i10 - 1;
            objectArray2[0] = nArray;
            m44.a("k", (Object)objectArray2, (long)7000043129203593725L, (long)l10);
        }
    }

    public static r P(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        Map map = (Map)objectArray[2];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x723DAAE1F5E0L;
        int n10 = (int)(l12 >>> 32);
        int n11 = (int)(l12 << 32 >>> 48);
        int n12 = (int)(l12 << 48 >>> 48);
        long l13 = l11 ^ 0x6176AC828217L;
        try {
            if (m44.a("n", (long)5658628881340553474L, (long)l10) != false) {
                return new z5(n10, (char)n11, string, map, (short)n12);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("j", (Object)illegalArgumentException, (long)5606981172792417140L, (long)l10);
        }
        return new cv(string, map, l13);
    }

    public static String a(String string) {
        return string.replace('/', '.');
    }

    public static String m(Object[] objectArray) {
        String string = (String)objectArray[0];
        return string.replace('.', '/');
    }

    public static l6q B(Object[] objectArray) {
        Object object;
        me me2 = (me)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x620BAFBFDFDCL;
        long l13 = l11 ^ 0x4CE2A0207680L;
        long l14 = l13 >>> 16;
        int n10 = (int)(l13 << 48 >>> 48);
        long l15 = l11 ^ 0x667917ED5AFEL;
        long l16 = l11 ^ 0x3C7589699B20L;
        df df2 = new df(l12);
        Iterator iterator = m44.a("v", (Object)me2, (long)l15, (long)-4091981959649573014L, (long)l10).iterator();
        CallSite callSite = m44.a("i", (long)-2655049848014322415L, (long)l10);
        block0: while (iterator.hasNext()) {
            object = iterator.next();
            do {
                CallSite callSite22;
                Map.Entry entry = (Map.Entry)object;
                Object k10 = entry.getKey();
                Object object2 = entry.getValue();
                while (true) {
                    block3: for (CallSite callSite22 : (List)object2) {
                        do {
                            CallSite callSite3 = callSite22;
                            df2.L(l14, (char)n10, callSite3, k10);
                            if (callSite != null) continue block0;
                            object2 = callSite;
                            if (l10 <= 0L) continue block3;
                            if (object2 == null) continue block3;
                            callSite22 = callSite;
                        } while (l10 <= 0L);
                    }
                    break;
                }
                if (callSite22 == null) continue block0;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l16;
                object = m44.a("v", (Object)df2, (Object)objectArray2, (long)-4513450422623821836L, (long)l10);
            } while (l10 <= 0L);
        }
        return object;
    }

    public static String D(Object[] objectArray) {
        String string;
        block5: {
            String string2 = (String)objectArray[0];
            String string3 = (String)objectArray[1];
            long l10 = (Long)objectArray[2];
            long l11 = (l10 = a ^ l10) ^ 0x3A08EDFB893L;
            CallSite callSite = m44.a("v", (Object)m44.a("i", (long)-5867827322181738009L, (long)l10), (long)-5266364506758515187L, (long)l10);
            while (callSite.hasMoreElements()) {
                block6: {
                    String string4 = (String)callSite.nextElement();
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = string4;
                    objectArray2[0] = l11;
                    CallSite callSite2 = m44.a("i", (Object)objectArray2, (long)-5532471281792756008L, (long)l10);
                    try {
                        CallSite callSite3;
                        string = string2;
                        if (l10 < 0L) break block5;
                        if (l10 >= 0L) {
                            if (!string.equals(callSite2)) break block6;
                            callSite3 = m44.a("i", string4, (long)-5895034581263071857L, (long)l10);
                        }
                        return callSite3;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("i", (Object)illegalArgumentException, (long)-5657454114389907513L, (long)l10);
                    }
                }
                if (l10 > 0L) continue;
            }
            string = string3;
        }
        return string;
    }

    public static void v(Object[] objectArray) {
        Properties properties = (Properties)objectArray[0];
        long l10 = (Long)objectArray[1];
        PrintWriter printWriter = (PrintWriter)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x7BFA12A90072L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = printWriter;
        objectArray2[2] = properties;
        objectArray2[1] = "";
        objectArray2[0] = l11;
        m44.a("m", (Object)objectArray2, (long)5905914694031134324L, (long)l10);
    }

    public static int x(int n10, int n11, char c10, short s10) {
        long l10 = ((long)n11 << 32 | (long)c10 << 48 >>> 32 | (long)s10 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x68F7CC6F25FL;
        int n12 = (int)(l11 >>> 32);
        int n13 = (int)(l11 << 32 >>> 48);
        int n14 = (int)(l11 << 48 >>> 48);
        return cf.y(n10, c, n12, n13, (short)n14);
    }

    public static r r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Collection collection = (Collection)objectArray[1];
        l10 = a ^ l10;
        try {
            if (m44.a("h", (long)-5223776378713792508L, (long)l10) != false) {
                return new z5(collection);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("l", (Object)illegalArgumentException, (long)-5419545208717467022L, (long)l10);
        }
        return new cv(collection);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        cf.a = prr.a(-2576844953303008001L, 6261132162924155094L, MethodHandles.lookup().lookupClass()).a(275099791718177L);
                        var20 = cf.a ^ 61267314305823L;
                        cf.e = new HashMap<K, V>(13);
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
                        var18_3 = new String[46];
                        var16_4 = 0;
                        var15_5 = "[~W\u00c4?\u00cd2\u00e6x\u0001\u00b9\u00ed\u00c1\u001a\u00ec\u00f4\u0010\u0088\f\u0018\u001d\u00ed\u00b9\u00e6t\u001b\u00a1\u00d4B\u0087\u00c1lX\u0010\r4\u0018\u0091\u00afFO;tvul\u00b3|\u009b\u00f5 g$\u008d\u00ce\u00a92Z\u00e4\u00141\u0012\u000eT\u008do\u0084?.P\u00a5\u00fc\u00f0\u001an\u00cc\u009eHO=\u00d0@\u0016\u00103\u009b\u0018r;\u00ba\u0080O2\u00fbe\u009dc\u00c3Y\u00c2(\u0002\u00fc\u008c\u00dd\u00e6\u009c\u00ac0I\u00be\u00e9\u00ca\u00a7q\u0012\u00e1\u0018j\u0081\u00f0\u00c6\u00e0\u000f\u00bd\u0004\u00ba\u0098\u0005\"t\u009b\u00df\u000e.~,\u0091\u0013\u00fd\u0002\u0010\u00cb\u00db\u0013\u00b3\u00d8\u007f\u00c8b\u00f19l\u0080\u00b1\n\u00aci\u0010IW$%u\u009a\u00f3-\u00f3\u009d3Z\u00b6\u00f5L; \u00f7\u001bhyD5@\u00a1\u00eeW]\u0010u9\u00f3\u0094\u00e6\u00f0(\u0093\u00c6/\u00ed\u00d9\u00c9F\u00d5\u008dG\u00b2\u00e0e( \u00d9m\u001eX6\u00bf;\u009c2\u00b6YCe\u00c0:\u009b\u00054\u00cd\f\u00d0g%\f\u001e\u00ee\u00fcW2V0\u00c9j\u001c\u00d1-\u00a5\u00b8\u00a2\u0010\u0096\u00db\u00bfN#\u001c\u00fbB\u00c9\u00885\u00b9\u0018\u0011m]P]\u0007\u00a2\u0002\u00ac\u0018\u00c6\u00db\t\u00e8\u00b6c\u00c44\u008c\u00a5g\u00b0\u00a7\u0086\u000f\u00eb\u001d\u00ae<\tt\u00e8\u00e8l\u0080\u000f\u00f7\u001e\u0017\u008a\u00c4\u0006\u0086\u00feP\u00fbz\u00b5\u0084\u00cc\u00ee\u00a9\u00e9\u0089\u009cuE\u00a8\u0010\u00f3\u009apE\u00c5\u00d6\u00b4|#w\u0087\u00b1\u00e2\u00a9Zk\u0001rt\u00fb\u0000\u00d3$\u00ff\u00ed(\u00d7\u000bm?:\u0016\u0093\u008d9Z\u00ac\u00d2\u0094}\u0084\u0089\u009c\u00de0k]\u00c8\u00a3/C\u0098\u001a\u009aU\u0019^\u000f\u00c8\u00b8\u0087q\u00951\u00c0+\u0010\u00fa\u00e6\u00f9\u00d7\u00b8\u00a3J\u00fd\u00aciWe\u00ab\u00bf|\u00cf\u0010o\u0001X\u0094\u00b1\u00a4\u00df[\u0096\u00dc\u008fR\u00f8\u001fR\u0085\u0010Z\u00ce\u0095y\u00a71\u00e5\u00b4\n\u00e4\u00b1\u00a4\u0097\u000e\u00aeD\u0010\u00d8\u00c6.\u00db\u0082\u00ae\u00ba \u00a3\u00c6\u00fcL{n\u0098\u0006(\u00fd\u0080z\u0099[@h\n,\u001d\u00cd\u00a0\u00bd\u0012,\u0095\u00f1\u00d8\u00a4\u00eb\u00da\u00eb\u0081\u0085\u00c6P\u00c6\u0091\u00fbI\r\u00c5\u00eal9dF\u00f8.\u001f8\u0084\u00c0\u009f\u00ec\u00b0\u00b6\u00af\u0081\u00dd\u00d7\u001e\\\u00e7\u0081\u00a5\u00e8\u0082\u009f\u001fLQ\u0084U\u00e7\u0010\u00ca\u00c6\u00bbL\u0011\u00e9\u0004acO\u00a0%\u00e0A\u00ca\u00ae\t\u0017\u00dc\u00e4\u00c2\u0003\u0086@\u00d5*\u00e6\u00ba\u00b8\u00cd\u00b2\u0010o&\u00dc$\u00aeR\u00ff\u000f\u00b7\u0095ey\u0018k\u00c7\u0018(0\\\u0086<>Op\u00a7\u00dc\u00fa\u0006\u00bc\u0098\u00e6N!%_\u0012\u00d4l\u00f3\u00ae\u0019t\u00f1>!Z,\u001c\u00c2\u00991M'h\u0000\u00a1\u00a5\u0010\u001b\u00f1\u0016\u00a0\u0082\u0081\u001a'\u0006\u00a4\b\u00a6\u0006 Cq\u0010>\u00ee\u00b2\u00bf\u00bd\u00df\u0094S\u0081\u00a1\u00bcq\u001d\u00b2\u0094/ \u009e\u00a5\u00a2\u00b4\u008cEY\u00ee\u00865\u00bd\u00015m\u00b0\u00a2?`\u009c\u00d6\u00adO5\u00ab\u0096\u00bc\u00e0]B\u00f2\u001b\u00ed@\u001c\u0016\u00faZ\u0019\u0091\u0012d\u00c0\u00b7\u00c2\u009f'}\u00d8\u00a7\u001dz{X\u00d1K\u0012\u0012rwr\u008d_=g\u0085\u00c8\u00ed\u0000#\u00ed\u00f6\u00b1U\u00cam?\u00fcnS\u009f\u00a4Fd<F\u00f6ek\u00de\u0098{\u00a4\\6\u009f\u00eb[\u0010\u00cdw\u0092Mf\u00ab\u00d0Gcf\u00c75\u00df?9\u008b\u0010bY\u0095\u00d4\u0083M\u00afNK\u00d60\u00ef\u00b5\u0005\u001e\u00b2 \u001c\u00db\u0090\u0010[\b\u00b2YZ\u001b\"\u0019,\u001c\u00eaN\u0013\u00d7\u0090\u00fc\\j9=\u00bc\u0018O\u001a#.\u00c9\u0084\u0010\u00b3\u00d6\u00b8\u00c3\u00f6[\u00f11\u0098u;\u00f7\u00e5\u00fcb\u00be@\u00b3Is\u00b4c\u00f1\u0099\u0081\u00cdE\u00e0j\u00b4\u0098`\u00fd\u0006\nb\u0018\u00db\u00b95\u00ea={\u008f\u00b6\u00b3m\u00fc\u009c\u009a~^1z\u0082\u00cd\u001f\u00cdOJ\u0095\u0002F\u008f\u00d8\t\u00ba\u008e\u001c\u0015\u00ee\u00eb@\u00ab\u00fb\u00da\n\u00e2|\f\u00a4\u0010a\u0097\u00d6\u00c6\u00c0\u00a3\u00e2\u007f\u00a0*\u0092>k#<\u008ch\u008b\u001d\u0088\u00d4|mC\u008cSLL\u00db\u00c0\u009b3\u00d5\u00a7\u00e1\u00e9\u00f1\u0095\r\u001b~dY\u0015\u009d\u0002\u009a'-\u0002\u0004\u00d9im1\u008f\u00e2\u0099N0\u0086\u008cb\u00ff\u00d9\u00c9\u0093\u0084\u00ca\u00f8%\u00d4\u00a9\u0092O\u0018\u00e5\u00980\u00fd\u00cd\u00d6\u00d2\u0019%\u00cf\u00da\u00d9\u0012p\u009a`n\u00b9\u0011\u0099\u00a1\u0081\u0087D\u0087\u00ee4E\u00b0\u001a\u001b\u00ed\u00e7\u00b9V\u00f0\u0004VoC\u00f8j\u0010\u00d2\u008c\u0010ml\u00ac\u00f08R|\u00c3\u00af\u00d6\u00b7\u0005DP\u00906h\"l-\u001d\u00f3m\u00f4\u0086dj\u00ed\u0005L\u0091\u00b3\u001e]\u0097\u00b3\u0002c\u0097\u009b\u00adK\u007fr\u0090\u00e8zF\f.:\u0090\u00ac\u00df\u0004\u0002\u00ec6\u00a4I\u00d8sG\u000e\u00b6\u00ff\u00a7\u00e3O\u0015\u00ff\u0015\u00c3\u00ccxN\u00d2\u00162\u00f6*buu\u00ec\u00d6Ih\r(\nP\u00b8\u0092{\u00db\u00e4\u0005\u00fa\u00dc$}/\u009c\u00c8\u008d.\u00da\u00c1\u00d73\u00f7\u00c2/\u0017*\u00e9\t\u00ab\u00f0O\u0010\u00a8\u0084`\fU~\u0098\u001e\u00b5;__\u00d2\u00b9\u0098\u00178\u0005\u00f7+I\u00c8jY+\u00b5\u00f0a\u00d4\u00f1]Az\u00f0\u00f7\u00f8\u00f6c\u00f9\u0082\u0013N4\u00f2\u00b2\r\u00eb\u0014k\u00e9\u0010\u0089\u000e\u00fd9L\u00ac]Y\u00d5\u00e9|s\u00a9|\u00e2\u0090\u00ab\"\u00e1\u00b9\u00fe\u009b\u0010=\u00ab\u00ec\u00a3\n\u00e0\u0085\u00f8n\u00fc\u00ef\u0014\u00df>=?\u0010/\u0080\u00c6^PHh\u00b8\u008d\u00a6u\u00fb\u00e1t\u00df\u00f9\u0010dE\u00eajt\u00bc\u00c04\u008d\u0000\u00fa#;+\u00ba\\\u0010f\u00de%J:|\u00e8\u009f\u008a\u0000.\u00e6\u00ed\u0089\u00edJ\u0018\u0011\u00afSY\u00af\u00ed\u001b\u00f7\u00e2\u00dcxY\u00fd\u00betWWR\u000f\u00ad\u00a2\u00c4\u00db\u00c0\u0010%\u00d1\u0018\u000e\u00ca\r\u00cc\u001e\u0001\u00a1\u00c1+\u00c5\u0015\u0013\u0090\u0010\u009f\u00b9\u008e\u009c\u00b8\u00f1RD\u00ca\u0011c\u00c2\u0014\u00eb\u00a9}X\b\u008f\u0096\f\u00c0in_\u00f5R#\u00ebv\u000e&\u00e4Q\u000e/\u0016\u00d8\u00c0\u001a\u00ec\u0087\u00f0P[8\u0088\u00e0\u000f\u0092PI\u008a\u00e3u;\u00cf\u0087U_3\u00bc\u0015O?Q\u00eba0\u00f4\u00b22\u00a2\u00c5\u00a9\u0082\u00a0V\u0002O\u009f\u00eb\u00bc\u00ae\u0097]\u0019\u00c2\u0082\u0013\u00a3\u009dK\u00a5\u0090\u00e4\u0004}\u007f\u00eaN\u00bf\u0087K)";
                        var17_6 = "[~W\u00c4?\u00cd2\u00e6x\u0001\u00b9\u00ed\u00c1\u001a\u00ec\u00f4\u0010\u0088\f\u0018\u001d\u00ed\u00b9\u00e6t\u001b\u00a1\u00d4B\u0087\u00c1lX\u0010\r4\u0018\u0091\u00afFO;tvul\u00b3|\u009b\u00f5 g$\u008d\u00ce\u00a92Z\u00e4\u00141\u0012\u000eT\u008do\u0084?.P\u00a5\u00fc\u00f0\u001an\u00cc\u009eHO=\u00d0@\u0016\u00103\u009b\u0018r;\u00ba\u0080O2\u00fbe\u009dc\u00c3Y\u00c2(\u0002\u00fc\u008c\u00dd\u00e6\u009c\u00ac0I\u00be\u00e9\u00ca\u00a7q\u0012\u00e1\u0018j\u0081\u00f0\u00c6\u00e0\u000f\u00bd\u0004\u00ba\u0098\u0005\"t\u009b\u00df\u000e.~,\u0091\u0013\u00fd\u0002\u0010\u00cb\u00db\u0013\u00b3\u00d8\u007f\u00c8b\u00f19l\u0080\u00b1\n\u00aci\u0010IW$%u\u009a\u00f3-\u00f3\u009d3Z\u00b6\u00f5L; \u00f7\u001bhyD5@\u00a1\u00eeW]\u0010u9\u00f3\u0094\u00e6\u00f0(\u0093\u00c6/\u00ed\u00d9\u00c9F\u00d5\u008dG\u00b2\u00e0e( \u00d9m\u001eX6\u00bf;\u009c2\u00b6YCe\u00c0:\u009b\u00054\u00cd\f\u00d0g%\f\u001e\u00ee\u00fcW2V0\u00c9j\u001c\u00d1-\u00a5\u00b8\u00a2\u0010\u0096\u00db\u00bfN#\u001c\u00fbB\u00c9\u00885\u00b9\u0018\u0011m]P]\u0007\u00a2\u0002\u00ac\u0018\u00c6\u00db\t\u00e8\u00b6c\u00c44\u008c\u00a5g\u00b0\u00a7\u0086\u000f\u00eb\u001d\u00ae<\tt\u00e8\u00e8l\u0080\u000f\u00f7\u001e\u0017\u008a\u00c4\u0006\u0086\u00feP\u00fbz\u00b5\u0084\u00cc\u00ee\u00a9\u00e9\u0089\u009cuE\u00a8\u0010\u00f3\u009apE\u00c5\u00d6\u00b4|#w\u0087\u00b1\u00e2\u00a9Zk\u0001rt\u00fb\u0000\u00d3$\u00ff\u00ed(\u00d7\u000bm?:\u0016\u0093\u008d9Z\u00ac\u00d2\u0094}\u0084\u0089\u009c\u00de0k]\u00c8\u00a3/C\u0098\u001a\u009aU\u0019^\u000f\u00c8\u00b8\u0087q\u00951\u00c0+\u0010\u00fa\u00e6\u00f9\u00d7\u00b8\u00a3J\u00fd\u00aciWe\u00ab\u00bf|\u00cf\u0010o\u0001X\u0094\u00b1\u00a4\u00df[\u0096\u00dc\u008fR\u00f8\u001fR\u0085\u0010Z\u00ce\u0095y\u00a71\u00e5\u00b4\n\u00e4\u00b1\u00a4\u0097\u000e\u00aeD\u0010\u00d8\u00c6.\u00db\u0082\u00ae\u00ba \u00a3\u00c6\u00fcL{n\u0098\u0006(\u00fd\u0080z\u0099[@h\n,\u001d\u00cd\u00a0\u00bd\u0012,\u0095\u00f1\u00d8\u00a4\u00eb\u00da\u00eb\u0081\u0085\u00c6P\u00c6\u0091\u00fbI\r\u00c5\u00eal9dF\u00f8.\u001f8\u0084\u00c0\u009f\u00ec\u00b0\u00b6\u00af\u0081\u00dd\u00d7\u001e\\\u00e7\u0081\u00a5\u00e8\u0082\u009f\u001fLQ\u0084U\u00e7\u0010\u00ca\u00c6\u00bbL\u0011\u00e9\u0004acO\u00a0%\u00e0A\u00ca\u00ae\t\u0017\u00dc\u00e4\u00c2\u0003\u0086@\u00d5*\u00e6\u00ba\u00b8\u00cd\u00b2\u0010o&\u00dc$\u00aeR\u00ff\u000f\u00b7\u0095ey\u0018k\u00c7\u0018(0\\\u0086<>Op\u00a7\u00dc\u00fa\u0006\u00bc\u0098\u00e6N!%_\u0012\u00d4l\u00f3\u00ae\u0019t\u00f1>!Z,\u001c\u00c2\u00991M'h\u0000\u00a1\u00a5\u0010\u001b\u00f1\u0016\u00a0\u0082\u0081\u001a'\u0006\u00a4\b\u00a6\u0006 Cq\u0010>\u00ee\u00b2\u00bf\u00bd\u00df\u0094S\u0081\u00a1\u00bcq\u001d\u00b2\u0094/ \u009e\u00a5\u00a2\u00b4\u008cEY\u00ee\u00865\u00bd\u00015m\u00b0\u00a2?`\u009c\u00d6\u00adO5\u00ab\u0096\u00bc\u00e0]B\u00f2\u001b\u00ed@\u001c\u0016\u00faZ\u0019\u0091\u0012d\u00c0\u00b7\u00c2\u009f'}\u00d8\u00a7\u001dz{X\u00d1K\u0012\u0012rwr\u008d_=g\u0085\u00c8\u00ed\u0000#\u00ed\u00f6\u00b1U\u00cam?\u00fcnS\u009f\u00a4Fd<F\u00f6ek\u00de\u0098{\u00a4\\6\u009f\u00eb[\u0010\u00cdw\u0092Mf\u00ab\u00d0Gcf\u00c75\u00df?9\u008b\u0010bY\u0095\u00d4\u0083M\u00afNK\u00d60\u00ef\u00b5\u0005\u001e\u00b2 \u001c\u00db\u0090\u0010[\b\u00b2YZ\u001b\"\u0019,\u001c\u00eaN\u0013\u00d7\u0090\u00fc\\j9=\u00bc\u0018O\u001a#.\u00c9\u0084\u0010\u00b3\u00d6\u00b8\u00c3\u00f6[\u00f11\u0098u;\u00f7\u00e5\u00fcb\u00be@\u00b3Is\u00b4c\u00f1\u0099\u0081\u00cdE\u00e0j\u00b4\u0098`\u00fd\u0006\nb\u0018\u00db\u00b95\u00ea={\u008f\u00b6\u00b3m\u00fc\u009c\u009a~^1z\u0082\u00cd\u001f\u00cdOJ\u0095\u0002F\u008f\u00d8\t\u00ba\u008e\u001c\u0015\u00ee\u00eb@\u00ab\u00fb\u00da\n\u00e2|\f\u00a4\u0010a\u0097\u00d6\u00c6\u00c0\u00a3\u00e2\u007f\u00a0*\u0092>k#<\u008ch\u008b\u001d\u0088\u00d4|mC\u008cSLL\u00db\u00c0\u009b3\u00d5\u00a7\u00e1\u00e9\u00f1\u0095\r\u001b~dY\u0015\u009d\u0002\u009a'-\u0002\u0004\u00d9im1\u008f\u00e2\u0099N0\u0086\u008cb\u00ff\u00d9\u00c9\u0093\u0084\u00ca\u00f8%\u00d4\u00a9\u0092O\u0018\u00e5\u00980\u00fd\u00cd\u00d6\u00d2\u0019%\u00cf\u00da\u00d9\u0012p\u009a`n\u00b9\u0011\u0099\u00a1\u0081\u0087D\u0087\u00ee4E\u00b0\u001a\u001b\u00ed\u00e7\u00b9V\u00f0\u0004VoC\u00f8j\u0010\u00d2\u008c\u0010ml\u00ac\u00f08R|\u00c3\u00af\u00d6\u00b7\u0005DP\u00906h\"l-\u001d\u00f3m\u00f4\u0086dj\u00ed\u0005L\u0091\u00b3\u001e]\u0097\u00b3\u0002c\u0097\u009b\u00adK\u007fr\u0090\u00e8zF\f.:\u0090\u00ac\u00df\u0004\u0002\u00ec6\u00a4I\u00d8sG\u000e\u00b6\u00ff\u00a7\u00e3O\u0015\u00ff\u0015\u00c3\u00ccxN\u00d2\u00162\u00f6*buu\u00ec\u00d6Ih\r(\nP\u00b8\u0092{\u00db\u00e4\u0005\u00fa\u00dc$}/\u009c\u00c8\u008d.\u00da\u00c1\u00d73\u00f7\u00c2/\u0017*\u00e9\t\u00ab\u00f0O\u0010\u00a8\u0084`\fU~\u0098\u001e\u00b5;__\u00d2\u00b9\u0098\u00178\u0005\u00f7+I\u00c8jY+\u00b5\u00f0a\u00d4\u00f1]Az\u00f0\u00f7\u00f8\u00f6c\u00f9\u0082\u0013N4\u00f2\u00b2\r\u00eb\u0014k\u00e9\u0010\u0089\u000e\u00fd9L\u00ac]Y\u00d5\u00e9|s\u00a9|\u00e2\u0090\u00ab\"\u00e1\u00b9\u00fe\u009b\u0010=\u00ab\u00ec\u00a3\n\u00e0\u0085\u00f8n\u00fc\u00ef\u0014\u00df>=?\u0010/\u0080\u00c6^PHh\u00b8\u008d\u00a6u\u00fb\u00e1t\u00df\u00f9\u0010dE\u00eajt\u00bc\u00c04\u008d\u0000\u00fa#;+\u00ba\\\u0010f\u00de%J:|\u00e8\u009f\u008a\u0000.\u00e6\u00ed\u0089\u00edJ\u0018\u0011\u00afSY\u00af\u00ed\u001b\u00f7\u00e2\u00dcxY\u00fd\u00betWWR\u000f\u00ad\u00a2\u00c4\u00db\u00c0\u0010%\u00d1\u0018\u000e\u00ca\r\u00cc\u001e\u0001\u00a1\u00c1+\u00c5\u0015\u0013\u0090\u0010\u009f\u00b9\u008e\u009c\u00b8\u00f1RD\u00ca\u0011c\u00c2\u0014\u00eb\u00a9}X\b\u008f\u0096\f\u00c0in_\u00f5R#\u00ebv\u000e&\u00e4Q\u000e/\u0016\u00d8\u00c0\u001a\u00ec\u0087\u00f0P[8\u0088\u00e0\u000f\u0092PI\u008a\u00e3u;\u00cf\u0087U_3\u00bc\u0015O?Q\u00eba0\u00f4\u00b22\u00a2\u00c5\u00a9\u0082\u00a0V\u0002O\u009f\u00eb\u00bc\u00ae\u0097]\u0019\u00c2\u0082\u0013\u00a3\u009dK\u00a5\u0090\u00e4\u0004}\u007f\u00eaN\u00bf\u0087K)".length();
                        var14_7 = 16;
                        var13_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = cf.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "U\u00ff\u00e3\u00dez\u00b3\u0099\u00b1az\u0015c\u0095\u00ec\u0016W\u0010\u00b4b\u00d9\u009bX\u009c\u009f8\u00b87\u00bfJ\u00cd\u0083\u00ddi";
                            var17_6 = "U\u00ff\u00e3\u00dez\u00b3\u0099\u00b1az\u0015c\u0095\u00ec\u0016W\u0010\u00b4b\u00d9\u009bX\u009c\u009f8\u00b87\u00bfJ\u00cd\u0083\u00ddi".length();
                            var14_7 = 16;
                            var13_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = cf.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block14;
                            break;
                        }
                    }
                    var19_9 = var11_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                cf.b = var18_3;
                cf.d = new String[46];
                cf.h = new HashMap<K, V>(13);
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
                var6_12 = new long[2];
                var3_13 = 0;
                var4_14 = "\u0082\u00b3\u00e8\u00c0RL\u0001\u00bd\u00fe;\u008er\u00ad\u00d7\u008f\u00ee";
                var5_15 = "\u0082\u00b3\u00e8\u00c0RL\u0001\u00bd\u00fe;\u008er\u00ad\u00d7\u008f\u00ee".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl73:
                // 1 sources

                while (true) {
                    var6_12[v10] = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
                    if (var2_16 < var5_15) ** continue;
                    break block16;
                    break;
                }
            }
            var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
            v10 = var3_13++;
            var8_18 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            ** while (true)
        }
        cf.f = var6_12;
        cf.g = new Long[2];
        cf.c = 0.74;
        cf.W = m44.a("n", (Object)cf.a("y", (int)13699, (long)(2807764968496096450L ^ var20)), (long)-2213592349654676744L, (long)var20);
        cf.u = cf.a("y", (int)9009, (long)(1633253992440689255L ^ var20)).toCharArray();
        cf.Q = cf.a("y", (int)31785, (long)(4520466199384599926L ^ var20)).toCharArray();
        cf.z = cf.a("y", (int)30310, (long)(7646315203732088591L ^ var20)).toCharArray();
        cf.Z = cf.a("y", (int)454, (long)(5004236073265942693L ^ var20)).toCharArray();
        cf.s = cf.a("y", (int)26445, (long)(5612235114492704272L ^ var20)).toCharArray();
        cf.l = new int[]{5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 107, 113, 127, 131, 137, 149, 157, 163, 167, 173, 179, 191, 197, 211, 223, 229, 239, 251, 257, 263, 269, 277, 283, 293, 307, 317, 331, 347, 359, 367, 379, 389, 397, 409, 419, 431, 443, 457, 467, 479, 491, 503, 521, 541, 557, 569, 587, 599, 613, 631, 647, 661, 677, 691, 709, 727, 743, 761, 787, 809, 827, 853, 877, 907, 929, 953, 977, 997, 1019, 1049, 1087, 1109, 1151, 1181, 1213, 1249, 1277, 1303, 1361, 1399, 1427, 1459, 1489, 1523, 1559, 1597, 1637, 1693, 1733, 1777, 1823, 1861, 1901, 1949, 1993, 2039, 2081, 2129, 2179, 2237, 2287, 2333, 2381, 2437, 2503, 2557, 2609, 2663, 2719, 2777, 2833, 2897, 2957, 3019, 3083, 3163, 3229, 3299, 3371, 3449, 3527, 3607, 3691, 3767, 3847, 3929, 4013, 4099, 4201, 4289, 4391, 4481, 4583, 4679, 4783, 4889, 4987, 5087, 5189, 5297, 5407, 5519, 5639, 5779, 5897, 6029, 6151, 6277, 6421, 6551, 6689, 6823, 6961, 7103, 7247, 7393, 7541, 7699, 7853, 8011, 8179, 8353, 8521, 8693, 8867, 9049, 9239, 9431, 9623, 9817, 10037, 10243, 10453, 10663, 10883, 11113, 11351, 11579, 11813, 12071, 12323, 12577, 12829, 13093, 13367, 13649, 13931, 14221, 14519, 14813, 15121, 15427, 15737, 16057, 16381, 16729, 17077, 17419, 17783, 18143, 18517, 18899, 19289, 19681, 20089, 20507, 20921, 21341, 21773, 22229, 22679, 23143, 23609, 24083, 24571, 25073, 25577, 26099, 26627, 27179, 27733, 28289, 28859, 29437, 30029, 30631, 31247, 31873, 32531, 33191, 33857, 34537, 35251, 35963, 36683, 37423, 38177, 38953, 39733, 40529, 41341, 42169, 43013, 43889, 44771, 45667, 46589, 47521, 48473, 49451, 50441, 51461, 52501, 53569, 54647, 55763, 56891, 58031, 59197, 60383, 61603, 62851, 64109, 65393, 66701, 68041, 69403, 70793, 72211, 73673, 75149, 76667, 78203, 79769, 81371, 83003, 84673, 86369, 88117, 89891, 91691, 93529, 95401, 97327, 99277, 101267, 101273, 102019, 102829, 103787, 104593, 105397, 106279, 107053, 107981, 108821, 109579, 110503, 111317, 112153, 113023, 113843, 114713, 115597, 116371, 117239, 118037, 118907, 119783, 120647, 121379, 122209, 123059, 123887, 124753, 125621, 126443, 127331, 128201, 128981, 129769, 130633, 131543, 132409, 133213, 134089, 135007, 135757, 136547, 137393, 138283, 139177, 139991, 140813, 141667, 142537, 143477, 144341, 145253, 146051, 146933, 147761, 148691, 149423, 150247, 151157, 151901, 152783, 153611, 154523, 155383, 156253, 157177, 157999, 158923, 159773, 160649, 161521, 162451, 163243, 164113, 165047, 165931, 166847, 167641, 168631, 169553, 170351, 171179, 172079, 172871, 173807, 174653, 175673, 176417, 177257, 178223, 179021, 179807, 180623, 181711, 182489, 183349, 184199, 185077, 185893, 186727, 187559, 188519, 189391, 190261, 191137, 192029, 192853, 193727, 194681, 195493, 196429, 197293, 198139, 198971, 199889, 200867, 201757, 202621, 203459, 204431, 205327, 206191, 207061, 207877, 208697, 209569, 210347, 211231, 212131, 213133, 214007, 214817, 215833, 216779, 217643, 218579, 219433, 220217, 221093, 222007, 222919, 223757, 224669, 225523, 226433, 227377, 228281, 229081, 229837, 230719, 231589, 232567, 233549, 234463, 235307, 236329, 237217, 238171, 239027, 239947, 240853, 241679, 242521, 243479, 244367, 245209, 246131, 246937, 247873, 248701, 249539, 250619, 251417, 252283, 253307, 254053, 255023, 255869, 256801, 257783, 258617, 259547, 260483, 261431, 262349, 263267, 264113, 265021, 265921, 266837, 267601, 268519, 269341, 270269, 271127, 272039, 272933, 273941, 274847, 275699, 276557, 277513, 278479, 279397, 280297, 281159, 281959, 282889, 283859, 284723, 285611, 286553, 287537, 288559, 289369, 290317, 291167, 292091, 293071, 294053, 294923, 295879, 296753, 297719, 298681, 299623};
    }

    public static ho P(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        ho ho2 = (ho)objectArray[1];
        l10 = a ^ l10;
        return (ho)((Object)m44.a("v", (Object)ho2, (long)1313212453240023164L, (long)l10));
    }

    public static long b(Object[] objectArray) {
        long l10;
        block2: {
            String string = (String)objectArray[0];
            long l11 = (Long)objectArray[1];
            String string2 = (String)objectArray[2];
            l11 = a ^ l11;
            long l12 = 0L;
            string = ((StringBuilder)((Object)m44.a("q", (Object)new StringBuilder(string), (long)-7711503487934248797L, (long)l11))).toString();
            int n10 = string2.length();
            long l13 = 1L;
            for (char c10 : string.toCharArray()) {
                l12 += (long)string2.indexOf(c10) * l13;
                l10 = l13 * (long)n10;
                if (l11 >= 0L) {
                    l13 = l10;
                    if (l11 >= 0L) continue;
                }
                break block2;
            }
            l10 = l12;
        }
        return l10;
    }

    /*
     * Unable to fully structure code
     */
    public static int y(int var0, double var1_1, int var3_2, int var4_3, short var5_4) {
        block16: {
            var6_5 = ((long)var3_2 << 32 | (long)var4_3 << 48 >>> 32 | (long)var5_4 << 48 >>> 48) ^ cf.a;
            var8_6 = (int)((double)var0 / var1_1);
            var9_7 = 0;
            var10_8 = cf.l.length - 1;
            var11_9 = 0;
            while (var9_7 <= var10_8) {
                block18: {
                    block17: {
                        var11_9 = (var9_7 + var10_8) / 2;
                        v0 = var8_6;
                        v1 = cf.l[var11_9];
                        if (var5_4 > 0) ** GOTO lbl28
                        if (var4_3 < 0) break block17;
                        if (v0 < v1) {
                            var10_8 = var11_9 - 1;
                            if (var3_2 >= 0) continue;
                        }
                        v2 = var8_6;
                        if (var4_3 < 0) break block18;
                        v3 = cf.l[var11_9];
                    }
                    if (v2 > v3) {
                        var9_7 = var11_9 + 1;
                        if (var3_2 >= 0) continue;
                    }
                    v2 = cf.l[var11_9];
                }
                return v2;
            }
            try {
                v0 = cf.l[var11_9];
                v1 = var8_6;
lbl28:
                // 2 sources

                if (var4_3 >= 0) {
                    if (v0 > v1) {
                        return cf.l[var11_9];
                    }
                }
                ** GOTO lbl39
            }
            catch (IllegalArgumentException v4) {
                throw m44.a("m", (Object)v4, (long)338022778676646411L, (long)var6_5);
            }
            try {
                v0 = var11_9 + 1;
                if (var3_2 <= 0) break block16;
                v1 = cf.l.length;
lbl39:
                // 2 sources

                if (v0 < v1) {
                    return cf.l[var11_9 + 1];
                }
            }
            catch (IllegalArgumentException v5) {
                throw m44.a("m", (Object)v5, (long)338022778676646411L, (long)var6_5);
            }
            v0 = var8_6;
        }
        return v0;
    }

    private static String l(Object[] objectArray) {
        String string;
        block5: {
            String string2 = (String)objectArray[0];
            int n10 = (Integer)objectArray[1];
            int n11 = (Integer)objectArray[2];
            int n12 = (Integer)objectArray[3];
            String string3 = (String)objectArray[4];
            long l10 = ((long)n10 << 32 | (long)n11 << 48 >>> 32 | (long)n12 << 48 >>> 48) ^ a;
            CallSite callSite = m44.a("h", string3, (long)-5731956100881982993L, (long)l10);
            m44.a("w", (Object)callSite, (Object)m44.a("w", string2, (long)-5723074537259593275L, (long)l10), (int)0, (int)string2.length(), (long)-6311296724391426423L, (long)l10);
            StringBuilder stringBuilder = new StringBuilder();
            CallSite callSite2 = m44.a("w", (Object)callSite, (long)-5947010316898984281L, (long)l10);
            int n13 = 0;
            while (n13 < ((CallSite)callSite2).length) {
                block4: {
                    String string4 = Integer.toHexString(callSite2[n13] & 0xFF);
                    try {
                        if (n10 <= 0) break block4;
                        string = string4;
                        if (n12 < 0) break block5;
                        if (string.length() == 1) {
                            stringBuilder.append('0');
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("h", (Object)illegalArgumentException, (long)-5512998523981552186L, (long)l10);
                    }
                    stringBuilder.append(string4);
                    ++n13;
                }
                if (n11 > 0) continue;
            }
            string = stringBuilder.toString();
        }
        return string;
    }

    public static void u(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        Properties properties = (Properties)objectArray[2];
        PrintWriter printWriter = (PrintWriter)objectArray[3];
        l10 = a ^ l10;
        CallSite callSite = m44.a("i", (long)-3805821507693914855L, (long)l10);
        printWriter.println((String)((Object)cf.a("y", (int)30610, (long)(0x75EDBBF1942A0C3CL ^ l10))) + string + (String)((Object)cf.a("y", (int)8950, (long)(0x12B97A436F2D594BL ^ l10))));
        CallSite callSite2 = callSite;
        CallSite callSite3 = m44.a("v", (Object)properties, (long)-3788399445399437270L, (long)l10);
        while (callSite3.hasMoreElements()) {
            Object e10 = callSite3.nextElement();
            CallSite callSite4 = m44.a("v", (Object)properties, e10, (long)-3706717596628589256L, (long)l10);
            printWriter.println(e10.toString() + (String)((Object)cf.a("y", (int)27442, (long)(0x51F02D0AC5741085L ^ l10))) + callSite4.toString());
            if (callSite2 == null) continue;
        }
    }

    public static HashSet Z(Object[] objectArray) {
        HashSet hashSet = (HashSet)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        return (HashSet)((Object)m44.a("u", (Object)hashSet, (long)441660482832846481L, (long)l10));
    }

    public static ArrayList P(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        ArrayList arrayList = (ArrayList)objectArray[1];
        l10 = a ^ l10;
        return (ArrayList)((Object)m44.a("s", (Object)arrayList, (long)8900198929064829850L, (long)l10));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String h(Object[] objectArray) {
        StringBuilder stringBuilder;
        byte[] byArray = (byte[])objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x183DC97E40D3L;
        CallSite callSite = m44.a("m", (long)8515039807018461213L, (long)l10);
        if (byArray == null) {
            return "";
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        int n10 = 0;
        block2: while (n10 < byArray.length) {
            try {
                do {
                    if (l10 >= 0L) {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)byArray[n10];
                        stringBuilder = stringBuilder2.append((String)((Object)m44.a("m", (Object)objectArray2, (long)8421521567624575148L, (long)l10)));
                        if (callSite != null) return stringBuilder.toString();
                        ++n10;
                    }
                    if (callSite == null) continue block2;
                } while (l10 <= 0L);
                break;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("m", (Object)illegalArgumentException, (long)7636060544866877251L, (long)l10);
            }
        }
        stringBuilder = stringBuilder2;
        return stringBuilder.toString();
    }

    public static void G(Object[] objectArray) {
        Object[] objectArray2 = (Object[])objectArray[0];
        int n10 = (Integer)objectArray[1];
        int n11 = (Integer)objectArray[2];
        Object object = objectArray2[n10];
        objectArray2[n10] = objectArray2[n11];
        objectArray2[n11] = object;
    }

    /*
     * Unable to fully structure code
     */
    public static String f(Object[] var0) {
        var1_1 = (String)var0[0];
        var2_2 = (Long)var0[1];
        var4_3 = (String)var0[2];
        var2_2 = cf.a ^ var2_2;
        var6_4 = var1_1.toCharArray();
        var7_5 = var4_3.toCharArray();
        var5_6 = m44.a("n", (long)-7529919833617692234L, (long)var2_2);
        var8_7 = new StringBuilder(var6_4.length);
        var9_8 = 0;
        while (var9_8 < var6_4.length) {
            block7: {
                block8: {
                    block6: {
                        var10_9 = var6_4[var9_8];
                        try {
                            v0 = var9_8;
                            if (var5_6 != null) break block6;
                            if (v0 < var7_5.length - 1) {
                            }
                            ** GOTO lbl26
                        }
                        catch (IllegalArgumentException v1) {
                            throw m44.a("n", (Object)v1, (long)-8623378699720089880L, (long)var2_2);
                        }
                        var11_10 = var7_5[var9_8];
                        try {
                            v2 = var5_6;
                            if (var2_2 <= 0L) break block7;
                            if (v2 == null) break block8;
lbl26:
                            // 2 sources

                            v0 = var7_5[var9_8 % var7_5.length];
                        }
                        catch (IllegalArgumentException v3) {
                            throw m44.a("n", (Object)v3, (long)-8623378699720089880L, (long)var2_2);
                        }
                    }
                    var11_10 = v0;
                }
                var8_7.append((char)((byte)var10_9 ^ (byte)var11_10));
                ++var9_8;
                v2 = var5_6;
            }
            if (v2 == null) continue;
        }
        return var8_7.toString();
    }

    /*
     * Exception decompiling
     */
    public static long H(Object[] var0) {
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

    public static String Y(Object[] objectArray) {
        String string2;
        block12: {
            StringBuilder stringBuilder;
            block13: {
                Collection collection = (Collection)objectArray[0];
                long l10 = (Long)objectArray[1];
                l10 = a ^ l10;
                StringBuilder stringBuilder2 = new StringBuilder();
                CallSite callSite = m44.a("n", (long)-8502777287108619210L, (long)l10);
                int n10 = collection.size();
                int n11 = 0;
                for (String string2 : collection) {
                    CallSite callSite2;
                    block16: {
                        block17: {
                            int n12;
                            int n13;
                            block14: {
                                if (l10 <= 0L) break block12;
                                String string3 = string2;
                                try {
                                    block15: {
                                        try {
                                            try {
                                                try {
                                                    stringBuilder = stringBuilder2.append(string3);
                                                    if (callSite != null) break block13;
                                                    n13 = n11;
                                                    n12 = n10 - 2;
                                                    if (l10 <= 0L || callSite != null) break block14;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw m44.a("n", (Object)illegalArgumentException, (long)-7650540342521986200L, (long)l10);
                                                }
                                                if (l10 < 0L) break block14;
                                                if (n13 >= n12) break block15;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw m44.a("n", (Object)illegalArgumentException, (long)-7650540342521986200L, (long)l10);
                                            }
                                            stringBuilder2.append((String)((Object)cf.a("y", (int)26252, (long)(0x17C8F93E281D5C1CL ^ l10))));
                                            callSite2 = callSite;
                                            if (l10 <= 0L) break block16;
                                            if (callSite2 == null) break block17;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("n", (Object)illegalArgumentException, (long)-7650540342521986200L, (long)l10);
                                        }
                                    }
                                    n13 = n11;
                                    n12 = n10 - 1;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("n", (Object)illegalArgumentException, (long)-7650540342521986200L, (long)l10);
                                }
                            }
                            try {
                                if (n13 < n12) {
                                    stringBuilder2.append((String)((Object)cf.a("y", (int)11782, (long)(0x779B1AC64C9714B8L ^ l10))));
                                }
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("n", (Object)illegalArgumentException, (long)-7650540342521986200L, (long)l10);
                            }
                        }
                        ++n11;
                        callSite2 = callSite;
                    }
                    if (callSite2 == null) continue;
                }
                stringBuilder = stringBuilder2;
            }
            string2 = stringBuilder.toString();
        }
        return string2;
    }

    public static void A(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int[] nArray = (int[])objectArray[1];
        Random random = (Random)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x4008A2188942L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = random;
        objectArray2[2] = nArray.length;
        objectArray2[1] = l11;
        objectArray2[0] = nArray;
        m44.a("o", (Object)objectArray2, (long)7560576914494779111L, (long)l10);
    }

    public static boolean K(Object[] objectArray) {
        String string = (String)objectArray[0];
        try {
            Class.forName(f33.a(string));
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    public static String I(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String[] stringArray = (String[])objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x64406F69587FL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = stringArray;
        objectArray2[1] = true;
        objectArray2[0] = l11;
        return m44.a("m", (Object)objectArray2, (long)3277199222764779942L, (long)l10);
    }

    public static Object x(Object[] objectArray) {
        Object object;
        block6: {
            Object object2;
            block7: {
                Object object3 = objectArray[0];
                long l10 = (Long)objectArray[1];
                object2 = objectArray[2];
                ol ol2 = (ol)objectArray[3];
                long l11 = (l10 = a ^ l10) ^ 0x7424CC8BEB3L;
                CallSite callSite = m44.a("l", (long)-8810689852519441524L, (long)l10);
                try {
                    object = ol2;
                    if (callSite != null) break block6;
                    if (object == null) break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)-7320065396046852910L, (long)l10);
                }
                Object object4 = ol2.m(l11, object3, object2);
                try {
                    try {
                        object = object4;
                        if (callSite != null) break block6;
                        if (object == null) break block7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)-7320065396046852910L, (long)l10);
                    }
                    return object4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)-7320065396046852910L, (long)l10);
                }
            }
            object = object2;
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String i(Object[] objectArray) {
        StringBuilder stringBuilder;
        Object object;
        long l10;
        CallSite callSite;
        char[] cArray;
        long l11;
        long l12;
        block14: {
            block12: {
                l12 = (Long)objectArray[0];
                l11 = (Long)objectArray[1];
                cArray = (char[])objectArray[2];
                l11 = a ^ l11;
                callSite = m44.a("k", (long)-5186687707914262989L, (long)l11);
                try {
                    try {
                        long l13 = l12 - 0L;
                        l10 = l13 == 0L ? 0 : (l13 < 0L ? -1 : 1);
                        if (callSite != null) break block12;
                        if (l10 < 0) {
                            throw new IllegalArgumentException(((StringBuilder)((Object)m44.a("t", (Object)new StringBuilder().append((String)((Object)cf.a("y", (int)19414, (long)(0x66E820EF1B75434CL ^ l11)))), (long)l12, (long)-6721333920640357391L, (long)l11))).toString());
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("k", (Object)illegalArgumentException, (long)-6352630678723645075L, (long)l11);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("k", (Object)illegalArgumentException, (long)-6352630678723645075L, (long)l11);
                }
                long l14 = l12 - 0L;
                l10 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
            }
            try {
                try {
                    if (callSite != null) break block14;
                    if (l10 == false) {
                        return String.valueOf(cArray[0]);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("k", (Object)illegalArgumentException, (long)-6352630678723645075L, (long)l11);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("k", (Object)illegalArgumentException, (long)-6352630678723645075L, (long)l11);
            }
            l10 = cArray.length;
        }
        long l15 = l10;
        StringBuilder stringBuilder2 = new StringBuilder();
        block8: while (l12 > 0L) {
            object = stringBuilder2.append(cArray[(int)(l12 % (long)l15)]);
            do {
                if (callSite != null) return ((StringBuilder)object).toString();
                l12 /= (long)l15;
                if (callSite == null) continue block8;
                stringBuilder = stringBuilder2;
            } while (l11 <= 0L);
        }
        object = m44.a("t", (Object)stringBuilder, (long)-5008437634361235930L, (long)l11);
        return ((StringBuilder)object).toString();
    }

    public static Object[] s(Object[] objectArray) {
        Object[] objectArray2 = (Object[])objectArray[0];
        return (Object[])objectArray2.clone();
    }

    public static Random X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return new Random(l10);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3EDB;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/cf", exception);
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
            cf.d[n11] = cf.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = cf.a(n10, l10);
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
            throw new RuntimeException("com/zelix/cf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x29C0;
        if (g[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = f[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/cf", exception);
            }
            long l13 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            cf.g[n11] = l13;
        }
        return g[n11];
    }

    private static long b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = cf.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return l11;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/cf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cf.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(cf.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

