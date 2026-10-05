/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._fr;
import com.zelix._fz;
import com.zelix._rv;
import com.zelix._sx;
import com.zelix._ug;
import com.zelix._ur;
import com.zelix._xx;
import com.zelix._y4;
import com.zelix._ye;
import com.zelix._yz;
import com.zelix.a3;
import com.zelix.an;
import com.zelix.ap;
import com.zelix.ea;
import com.zelix.ess;
import com.zelix.gj;
import com.zelix.h2;
import com.zelix.h4;
import com.zelix.h8;
import com.zelix.he;
import com.zelix.hy;
import com.zelix.is;
import com.zelix.iu;
import com.zelix.iz;
import com.zelix.lr;
import com.zelix.lt;
import com.zelix.pg;
import com.zelix.ri;
import com.zelix.wp;
import com.zelix.x44;
import com.zelix.x7;
import com.zelix.x9;
import com.zelix.xl;
import com.zelix.yn;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class hz
extends h8
implements Comparable,
ap {
    private boolean p;
    int c;
    int f;
    x9[] r;
    boolean S;
    int W;
    h2 m;
    boolean M;
    h4[] N;
    int k;
    boolean Q;
    String n;
    Integer X;
    x9 O;
    x9 u;
    private final byte[] I;
    int D;
    String a;
    private is j;
    hz t;
    private static String[] v;
    final int y;
    private List i;
    int R;
    boolean Z;
    List s;
    String x;
    boolean b;
    int J;
    boolean E;
    private static final long ab;
    private static final String[] eb;
    private static final String[] fb;
    private static final Map gb;
    private static final long[] kb;
    private static final Integer[] lb;
    private static final Map mb;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void x(Object[] var1_1) {
        block45: {
            block49: {
                block46: {
                    block47: {
                        block48: {
                            block43: {
                                block44: {
                                    block41: {
                                        block42: {
                                            var4_2 = (Integer)var1_1[0];
                                            var3_3 = (Integer)var1_1[1];
                                            var2_4 = (int[])var1_1[2];
                                            var5_5 = (Long)var1_1[3];
                                            var7_6 = (_y4)var1_1[4];
                                            v0 = var5_5 = hz.ab ^ var5_5;
                                            var8_7 = v0 ^ 78535954038204L;
                                            var10_8 = v0 ^ 43834122190143L;
                                            var12_9 = v0 ^ 90306642146381L;
                                            var14_10 = v0 ^ 134958196880496L;
                                            v1 = v0 ^ 125407325607153L;
                                            var16_11 = v1 >>> 8;
                                            var18_12 = (int)(v1 << 56 >>> 56);
                                            var19_13 = v0 ^ 57608776827934L;
                                            var22_14 = x44.a("i", (Object)this, (long)var16_11, (int)var4_2, (byte)((byte)var18_12), (long)-20431640041449452L, (long)var5_5);
                                            var21_15 = x44.a("q", (long)-96863446389044509L, (long)var5_5);
                                            try {
                                                try {
                                                    if (var21_15 != false) break block41;
                                                    if (var22_14 instanceof x9) break block42;
                                                }
                                                catch (gj v2) {
                                                    throw x44.a("q", (Object)v2, (long)-1935996640172303705L, (long)var5_5);
                                                }
                                                throw new _sx((String)x44.a("i", (Object)this, (long)var19_13, (long)-300232549339203369L, (long)var5_5) + (String)hz.a("z", (int)14802, (long)(6371804354071398595L ^ var5_5)) + (String)hz.a("z", (int)30159, (long)(4948786699506435286L ^ var5_5)) + (String)hz.a("z", (int)18193, (long)(1702755826062620191L ^ var5_5)));
                                            }
                                            catch (gj v3) {
                                                throw x44.a("q", (Object)v3, (long)-1935996640172303705L, (long)var5_5);
                                            }
                                        }
                                        try {
                                            x44.a("r", (Object)this, (x9)((x9)var22_14), (long)-242220563733961796L, (long)var5_5);
                                            this.x = x44.a("m", (Object)this, (long)-242220563733961796L, (long)var5_5).W(var14_10);
                                            x44.a("r", (Object)this, (String)this.x.toLowerCase(), (long)-2224678291274785951L, (long)var5_5);
                                            v4 = this;
                                            if (var5_5 < 0L || var21_15 != false) break block43;
                                            v4.a = this.x;
                                        }
                                        catch (gj v5) {
                                            throw x44.a("q", (Object)v5, (long)-1935996640172303705L, (long)var5_5);
                                        }
                                    }
                                    try {
                                        v6 = var7_6;
                                        if (var5_5 >= 0L) {
                                            if (v6 == null) break block44;
                                            v6 = var7_6;
                                        }
                                        v6.G((x7)x44.a("m", (Object)this, (long)-242220563733961796L, (long)var5_5), (hy)this, var12_9);
                                    }
                                    catch (gj v7) {
                                        throw x44.a("q", (Object)v7, (long)-1935996640172303705L, (long)var5_5);
                                    }
                                }
                                v4 = this;
                            }
                            try {
                                v8 = new Object[1];
                                v8[0] = var10_8;
                                v9 = x44.a("i", (Object)v4.m, (Object)v8, (long)-1966676649972938423L, (long)var5_5);
                                if (var21_15 != false) break block45;
                                if (v9 != false) break block46;
                            }
                            catch (gj v10) {
                                throw x44.a("q", (Object)v10, (long)-1935996640172303705L, (long)var5_5);
                            }
                            var23_16 = x44.a("i", (Object)this, (long)var16_11, (int)var3_3, (byte)((byte)var18_12), (long)-20431640041449452L, (long)var5_5);
                            try {
                                try {
                                    try {
                                        try {
                                            v11 = var21_15;
                                            if (var5_5 >= 0L) {
                                                if (v11 != false) break block47;
                                                if (var23_16 instanceof x9) break block48;
                                            }
                                            ** GOTO lbl97
                                        }
                                        catch (gj v12) {
                                            throw x44.a("q", (Object)v12, (long)-1935996640172303705L, (long)var5_5);
                                        }
                                        v9 = (reference)this.k(var8_7).equals(hz.a("z", (int)6912, (long)(259613901952100874L ^ var5_5)));
                                        if (var21_15 != false) break block45;
                                    }
                                    catch (gj v13) {
                                        throw x44.a("q", (Object)v13, (long)-1935996640172303705L, (long)var5_5);
                                    }
                                    if (v9 != false) break block46;
                                }
                                catch (gj v14) {
                                    throw x44.a("q", (Object)v14, (long)-1935996640172303705L, (long)var5_5);
                                }
                                throw new _sx((String)x44.a("i", (Object)this, (long)var19_13, (long)-300232549339203369L, (long)var5_5) + (String)hz.a("z", (int)30220, (long)(2135056382413358858L ^ var5_5)) + (String)hz.a("z", (int)28327, (long)(1259712569392652197L ^ var5_5)) + (String)hz.a("z", (int)1451, (long)(839825920504181941L ^ var5_5)));
                            }
                            catch (gj v15) {
                                throw x44.a("q", (Object)v15, (long)-1935996640172303705L, (long)var5_5);
                            }
                        }
                        this.O = (x9)var23_16;
                    }
                    try {
                        try {
                            try {
                                try {
                                    v11 = var21_15;
lbl97:
                                    // 2 sources

                                    if (v11 != false) break block49;
                                    if (var7_6 == null) break block46;
                                }
                                catch (gj v16) {
                                    throw x44.a("q", (Object)v16, (long)-1935996640172303705L, (long)var5_5);
                                }
                                v9 = (reference)(this.O instanceof x7);
                                if (var21_15 != false) break block45;
                            }
                            catch (gj v17) {
                                throw x44.a("q", (Object)v17, (long)-1935996640172303705L, (long)var5_5);
                            }
                            if (v9 == false) break block46;
                        }
                        catch (gj v18) {
                            throw x44.a("q", (Object)v18, (long)-1935996640172303705L, (long)var5_5);
                        }
                        var7_6.G((x7)this.O, (hy)this, var12_9);
                    }
                    catch (gj v19) {
                        throw x44.a("q", (Object)v19, (long)-1935996640172303705L, (long)var5_5);
                    }
                }
                x44.a("r", (Object)this, (x9[])new x9[var2_4.length], (long)-254114808198909146L, (long)var5_5);
            }
            v9 = var23_17 = (reference)false;
        }
        while (var23_17 < x44.a("m", (Object)this, (long)-2160002048924031878L, (long)var5_5)) {
            block52: {
                block53: {
                    block54: {
                        block50: {
                            block51: {
                                var24_18 = x44.a("i", (Object)this, (long)var16_11, (int)var2_4[var23_17], (byte)((byte)var18_12), (long)-20431640041449452L, (long)var5_5);
                                try {
                                    try {
                                        v20 = var21_15;
                                        if (var5_5 > 0L) {
                                            if (v20 != false) break block50;
                                            if (var24_18 instanceof x9) break block51;
                                        }
                                        ** GOTO lbl143
                                    }
                                    catch (gj v21) {
                                        throw x44.a("q", (Object)v21, (long)-1935996640172303705L, (long)var5_5);
                                    }
                                    throw new _sx((String)x44.a("i", (Object)this, (long)var19_13, (long)-300232549339203369L, (long)var5_5) + (String)hz.a("z", (int)30220, (long)(2135056382413358858L ^ var5_5)) + (String)hz.a("z", (int)28327, (long)(1259712569392652197L ^ var5_5)) + (String)hz.a("z", (int)17893, (long)(1414139445118170342L ^ var5_5)));
                                }
                                catch (gj v22) {
                                    throw x44.a("q", (Object)v22, (long)-1935996640172303705L, (long)var5_5);
                                }
                            }
                            x44.a("m", (Object)this, (long)-254114808198909146L, (long)var5_5)[var23_17] = (x9)var24_18;
                        }
                        try {
                            try {
                                try {
                                    v20 = var21_15;
lbl143:
                                    // 2 sources

                                    if (var5_5 <= 0L) break block52;
                                    if (v20 != false) break block53;
                                    if (var7_6 == null) break block54;
                                }
                                catch (gj v23) {
                                    throw x44.a("q", (Object)v23, (long)-1935996640172303705L, (long)var5_5);
                                }
                                if (!(x44.a("m", (Object)this, (long)-254114808198909146L, (long)var5_5)[var23_17] instanceof x7)) break block54;
                            }
                            catch (gj v24) {
                                throw x44.a("q", (Object)v24, (long)-1935996640172303705L, (long)var5_5);
                            }
                            var7_6.G((x7)x44.a("m", (Object)this, (long)-254114808198909146L, (long)var5_5)[var23_17], (hy)this, var12_9);
                        }
                        catch (gj v25) {
                            throw x44.a("q", (Object)v25, (long)-1935996640172303705L, (long)var5_5);
                        }
                    }
                    ++var23_17;
                }
                v20 = var21_15;
            }
            if (v20 == false) continue;
        }
    }

    public final boolean H(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = ab ^ l) ^ 0x4704900B7E82L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return (boolean)x44.a("l", (Object)this.m, (Object)objectArray2, (long)-6410426736788534540L, (long)l);
    }

    @Override
    public String p(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x2BC40D6D22E8L;
        String string = this.k(l2);
        int n = string.lastIndexOf((int)hz.c("n", (int)20406, (long)(0x478B3D093E582AF8L ^ l)));
        try {
            if (n == -1) {
                return string;
            }
        }
        catch (gj gj2) {
            throw x44.a("u", (Object)gj2, (long)-5010929712585292301L, (long)l);
        }
        return string.substring(n + 1);
    }

    public boolean T(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = ab ^ l;
        return (boolean)x44.a("k", (Object)this, (long)-120313609792050748L, (long)l);
    }

    public void g(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = ab ^ l;
        x44.a("q", (Object)this, (boolean)true, (long)-384069571262254566L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    public String e(Object[] var1_1) {
        block38: {
            block45: {
                block44: {
                    block43: {
                        block39: {
                            block40: {
                                block41: {
                                    block42: {
                                        block37: {
                                            var2_2 = (Long)var1_1[0];
                                            v0 = var2_2 = hz.ab ^ var2_2;
                                            var4_3 = v0 ^ 133492432988415L;
                                            var6_4 = v0 ^ 102323742711188L;
                                            var8_5 = v0 ^ 132227712753659L;
                                            var10_6 = x44.a("r", (long)-1448785575830429792L, (long)var2_2);
                                            try {
                                                try {
                                                    v1 = x44.a("n", (Object)this, (long)-1615168928447514108L, (long)var2_2);
                                                    if (var10_6 != false) break block37;
                                                    if (v1 == null) break block38;
                                                }
                                                catch (gj v2) {
                                                    throw x44.a("r", (Object)v2, (long)-1125113392659034140L, (long)var2_2);
                                                }
                                                v1 = x44.a("n", (Object)this, (long)-1615168928447514108L, (long)var2_2);
                                            }
                                            catch (gj v3) {
                                                throw x44.a("r", (Object)v3, (long)-1125113392659034140L, (long)var2_2);
                                            }
                                        }
                                        v4 = new Object[1];
                                        v4[0] = var8_5;
                                        var11_7 = x44.a("j", (Object)v1, (Object)v4, (long)-1522338646634968476L, (long)var2_2);
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v5 = var11_7;
                                                        if (var10_6 != false) break block39;
                                                        if (v5 == null) break block40;
                                                    }
                                                    catch (gj v6) {
                                                        throw x44.a("r", (Object)v6, (long)-1125113392659034140L, (long)var2_2);
                                                    }
                                                    v7 = var11_7;
                                                    if (var10_6 != false) break block41;
                                                }
                                                catch (gj v8) {
                                                    throw x44.a("r", (Object)v8, (long)-1125113392659034140L, (long)var2_2);
                                                }
                                                if (!v7.equals(this.k(var4_3))) break block42;
                                            }
                                            catch (gj v9) {
                                                throw x44.a("r", (Object)v9, (long)-1125113392659034140L, (long)var2_2);
                                            }
                                            return null;
                                        }
                                        catch (gj v10) {
                                            throw x44.a("r", (Object)v10, (long)-1125113392659034140L, (long)var2_2);
                                        }
                                    }
                                    v7 = var11_7;
                                }
                                return v7;
                            }
                            v11 = new Object[1];
                            v11[0] = var6_4;
                            v5 = x44.a("j", (Object)this, (Object)v11, (long)-579524709981685715L, (long)var2_2);
                        }
                        var12_8 = v5;
                        try {
                            try {
                                v12 = var12_8;
                                if (var10_6 != false) break block43;
                                if (v12 == null) break block38;
                            }
                            catch (gj v13) {
                                throw x44.a("r", (Object)v13, (long)-1125113392659034140L, (long)var2_2);
                            }
                            v12 = this.k(var4_3);
                        }
                        catch (gj v14) {
                            throw x44.a("r", (Object)v14, (long)-1125113392659034140L, (long)var2_2);
                        }
                    }
                    var13_9 = v12;
                    try {
                        v15 = var13_9;
                        if (var10_6 != false) break block44;
                        if (v15.startsWith((String)var12_8)) {
                        }
                        ** GOTO lbl86
                    }
                    catch (gj v16) {
                        throw x44.a("r", (Object)v16, (long)-1125113392659034140L, (long)var2_2);
                    }
                    v15 = var12_8;
                    if (var2_2 < 0L) break block44;
                    var11_7 = v15;
                    try {
                        if (var10_6 == false) ** GOTO lbl132
lbl86:
                        // 2 sources

                        v15 = var13_9;
                    }
                    catch (gj v17) {
                        throw x44.a("r", (Object)v17, (long)-1125113392659034140L, (long)var2_2);
                    }
                }
                var11_7 = v15;
                block26: while (var11_7 != null) {
                    try {
                        try {
                            v18 = var12_8;
                            v19 = var10_6;
                            if (var2_2 > 0L) {
                                if (v19 != false) break block45;
                                v19 = var10_6;
                            }
                            if (v19 != false) break block45;
                        }
                        catch (gj v20) {
                            throw x44.a("r", (Object)v20, (long)-1125113392659034140L, (long)var2_2);
                        }
                        if (!v18.startsWith((String)var11_7)) {
                        }
                        ** GOTO lbl132
                    }
                    catch (gj v21) {
                        throw x44.a("r", (Object)v21, (long)-1125113392659034140L, (long)var2_2);
                    }
                    do {
                        block49: {
                            block50: {
                                block48: {
                                    block46: {
                                        block47: {
                                            var14_10 = var11_7.lastIndexOf("$");
                                            try {
                                                v22 = var10_6;
                                                if (var2_2 <= 0L) break block46;
                                                if (v22 != false) break block47;
                                                if (var14_10 <= 0) break block48;
                                            }
                                            catch (gj v23) {
                                                throw x44.a("r", (Object)v23, (long)-1125113392659034140L, (long)var2_2);
                                            }
                                            var11_7 = var11_7.substring(0, var14_10);
                                        }
                                        v22 = var10_6;
                                    }
                                    if (var2_2 < 0L) break block49;
                                    if (v22 == false) break block50;
                                }
                                var11_7 = null;
                            }
                            v22 = var10_6;
                        }
                        if (v22 == false) continue block26;
lbl132:
                        // 4 sources

                    } while (var2_2 <= 0L);
                }
                v18 = var11_7;
            }
            return v18;
        }
        return null;
    }

    public final int b() {
        return this.m.n();
    }

    /*
     * Exception decompiling
     */
    public final Set p(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[DOLOOP]], but top level block is 12[SIMPLE_IF_TAKEN]
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public String W(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = ab ^ l) ^ 0x3DAC82D292ADL;
        String string = this.k(l2);
        int n = string.lastIndexOf((int)hz.c("n", (int)20406, (long)(0x478B2B61B1E79ABDL ^ l)));
        try {
            if (n == -1) {
                return "";
            }
        }
        catch (gj gj2) {
            throw x44.a("p", (Object)gj2, (long)734244593156552118L, (long)l);
        }
        return string.substring(0, n).replace((char)hz.c("n", (int)20406, (long)(0x478B2B61B1E79ABDL ^ l)), (char)hz.c("n", (int)17723, (long)(0x1E0EE7F6EED71031L ^ l)));
    }

    /*
     * Exception decompiling
     */
    public boolean j(Object[] var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public boolean E(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = ab ^ l;
        return (boolean)x44.a("i", (Object)this, (long)-2261309146919424895L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String w(String var0, long var1_1, wp var3_2) {
        block38: {
            block37: {
                block35: {
                    block36: {
                        block33: {
                            block34: {
                                block32: {
                                    block31: {
                                        block30: {
                                            block29: {
                                                block28: {
                                                    var4_3 = (var1_1 = hz.ab ^ var1_1) ^ 18509005831428L;
                                                    var7_4 = var0.lastIndexOf("[") + 1;
                                                    var6_5 = x44.a("p", (long)3701639614548346650L, (long)var1_1);
                                                    try {
                                                        v0 = var3_2;
                                                        if (var6_5 != false) break block28;
                                                        if (v0 == null) break block29;
                                                    }
                                                    catch (gj v1) {
                                                        throw x44.a("p", (Object)v1, (long)2943375014999086942L, (long)var1_1);
                                                    }
                                                    v0 = var3_2;
                                                }
                                                v0.V(var7_4);
                                            }
                                            var8_6 = var0.substring(var7_4);
                                            try {
                                                try {
                                                    v2 = var7_4;
                                                    v3 /* !! */  = var6_5;
                                                    if (var1_1 > 0L) {
                                                        if (v3 /* !! */  != false) break block30;
                                                        if (v2 <= 0) break block31;
                                                    }
                                                    ** GOTO lbl36
                                                }
                                                catch (gj v4) {
                                                    throw x44.a("p", (Object)v4, (long)2943375014999086942L, (long)var1_1);
                                                }
                                                v2 = var8_6.length();
                                            }
                                            catch (gj v5) {
                                                throw x44.a("p", (Object)v5, (long)2943375014999086942L, (long)var1_1);
                                            }
                                        }
                                        try {
                                            try {
                                                v3 /* !! */  = var6_5;
lbl36:
                                                // 2 sources

                                                if (var1_1 > 0L) {
                                                    if (v3 /* !! */  != false) break block32;
                                                    v3 /* !! */  = (CallSite)true;
                                                }
                                                if (v2 != v3 /* !! */ ) break block31;
                                            }
                                            catch (gj v6) {
                                                throw x44.a("p", (Object)v6, (long)2943375014999086942L, (long)var1_1);
                                            }
                                            v2 = 1;
                                            break block32;
                                        }
                                        catch (gj v7) {
                                            throw x44.a("p", (Object)v7, (long)2943375014999086942L, (long)var1_1);
                                        }
                                    }
                                    v2 = 0;
                                }
                                var9_7 = v2;
                                try {
                                    try {
                                        v8 = var9_7;
                                        v9 = var6_5;
                                        if (var1_1 >= 0L) {
                                            if (v9 != false) break block33;
                                            if (v8 == 0) break block34;
                                        }
                                        ** GOTO lbl72
                                    }
                                    catch (gj v10) {
                                        throw x44.a("p", (Object)v10, (long)2943375014999086942L, (long)var1_1);
                                    }
                                    return null;
                                }
                                catch (gj v11) {
                                    throw x44.a("p", (Object)v11, (long)2943375014999086942L, (long)var1_1);
                                }
                            }
                            v8 = (int)var8_6.startsWith("L");
                        }
                        try {
                            try {
                                try {
                                    v9 = var6_5;
lbl72:
                                    // 2 sources

                                    if (v9 != false) break block35;
                                    if (v8 == 0) break block36;
                                }
                                catch (gj v12) {
                                    throw x44.a("p", (Object)v12, (long)2943375014999086942L, (long)var1_1);
                                }
                                v8 = (int)var8_6.endsWith(";");
                                v13 /* !! */  = (int)var6_5;
                                if (var1_1 >= 0L) {
                                    if (v13 /* !! */  != 0) break block35;
                                }
                                ** GOTO lbl102
                            }
                            catch (gj v14) {
                                throw x44.a("p", (Object)v14, (long)2943375014999086942L, (long)var1_1);
                            }
                            if (v8 == 0) break block36;
                        }
                        catch (gj v15) {
                            throw x44.a("p", (Object)v15, (long)2943375014999086942L, (long)var1_1);
                        }
                        var10_8 = var8_6.substring(1, var8_6.length() - 1);
                        return hz.D(var4_3, var10_8);
                    }
                    try {
                        v16 = var8_6;
                        if (var6_5 != false) break block37;
                        v8 = v16.length();
                    }
                    catch (gj v17) {
                        throw x44.a("p", (Object)v17, (long)2943375014999086942L, (long)var1_1);
                    }
                }
                try {
                    v13 /* !! */  = 1;
lbl102:
                    // 2 sources

                    if (v8 <= v13 /* !! */ ) break block38;
                    v16 = hz.D(var4_3, var8_6);
                }
                catch (gj v18) {
                    throw x44.a("p", (Object)v18, (long)2943375014999086942L, (long)var1_1);
                }
            }
            return v16;
        }
        return null;
    }

    public byte[] i(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = ab ^ l;
        return x44.a("l", (Object)this, (long)-4151964502189720259L, (long)l);
    }

    public void w(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        l = ab ^ l;
        x44.a("w", (Object)this, (int)n, (long)6991450401861662490L, (long)l);
    }

    @Override
    public final String k(long l) {
        return this.x;
    }

    public final void c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        ea ea2 = (ea)objectArray[1];
        long l2 = l = ab ^ l;
        long l3 = l2 ^ 0x45526B288934L;
        long l4 = l2 ^ 0x50EA95E7A958L;
        long l5 = l2 ^ 0x45EA3A64BCE1L;
        long l6 = l2 ^ 0x65AB7F903536L;
        long l7 = l2 ^ 0x63A06FB41551L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        x44.a("m", (Object)ea2, (Object)objectArray2, (long)-5176540479811987049L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = this.c(l4);
        x44.a("m", (Object)ea2, (Object)objectArray3, (long)-4784395371133578514L, (long)l);
        iu[] iuArray = this.n(l6);
        CallSite callSite = x44.a("u", (long)-5033903849744003481L, (long)l);
        for (iu iu2 : iuArray) {
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l7;
            objectArray4[0] = ea2;
            x44.a("m", (Object)iu2, (Object)objectArray4, (long)-6802885183541692906L, (long)l);
            if (callSite == false) continue;
        }
    }

    /*
     * Exception decompiling
     */
    public iu s(long var1_1, _fz var3_2) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public x9 o(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = ab ^ l;
        return x44.a("o", (Object)this, (long)-5892561317829021402L, (long)l);
    }

    public int compareTo(Object object) {
        long l = ab ^ 0x429B52D6A061L;
        long l2 = l ^ 0x622FEF39DF2CL;
        return (int)x44.a("j", (Object)this, (long)l2, (Object)((hz)object), (long)-215409119812271592L, (long)l);
    }

    public static String p(String string, char c, long l) {
        l = ab ^ l;
        int n = string.lastIndexOf(c);
        try {
            if (n == -1) {
                return "";
            }
        }
        catch (gj gj2) {
            throw x44.a("v", (Object)gj2, (long)6383560343498893072L, (long)l);
        }
        return string.substring(0, n);
    }

    void O(Object[] objectArray) {
        boolean bl;
        hz hz2;
        long l;
        block2: {
            block3: {
                boolean bl2 = (Boolean)objectArray[0];
                l = (Long)objectArray[1];
                l = ab ^ l;
                CallSite callSite = x44.a("w", (long)1418217343904261060L, (long)l);
                x44.a("t", (Object)this, (boolean)bl2, (long)1154210533615978388L, (long)l);
                CallSite callSite2 = callSite;
                try {
                    hz2 = this;
                    bl = bl2;
                    if (callSite2 == false) break block2;
                    if (bl) break block3;
                }
                catch (gj gj2) {
                    throw x44.a("w", (Object)gj2, (long)1540164250579495641L, (long)l);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        x44.a("t", (Object)hz2, (boolean)bl, (long)657740675606897137L, (long)l);
    }

    @Override
    public abstract xl N(long var1, int var3, byte var4);

    public abstract iu[] n(long var1);

    /*
     * Exception decompiling
     */
    void z(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [13[DOLOOP]], but top level block is 5[TRYBLOCK]
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public int F(Object[] objectArray) {
        return this.D;
    }

    public static String P(String string, long l) {
        long l2 = (l = ab ^ l) ^ 0x6C7DB6EB65A8L;
        return hz.w(string, l2, null);
    }

    public int j(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = ab ^ l;
        return (int)x44.a("l", (Object)this, (long)4633958146185807411L, (long)l);
    }

    public final boolean A(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = ab ^ l) ^ 0x787FA9F7BE92L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return (boolean)x44.a("n", (Object)this.m, (Object)objectArray2, (long)-8816591455420437757L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    public static String n(Object[] var0) {
        block21: {
            block20: {
                block18: {
                    block19: {
                        var3_1 = (String)var0[0];
                        var1_2 = (Long)var0[1];
                        var4_3 = (var1_2 = hz.ab ^ var1_2) ^ 66384964089468L;
                        var7_4 = var3_1.lastIndexOf("[") + 1;
                        var8_5 = var3_1.substring(var7_4);
                        var6_6 = x44.a("p", (long)8657872500739230818L, (long)var1_2);
                        try {
                            try {
                                try {
                                    try {
                                        v0 = var7_4;
                                        if (var6_6 != false) break block18;
                                        if (v0 <= 0) break block19;
                                    }
                                    catch (gj v1) {
                                        throw x44.a("p", (Object)v1, (long)7178978935211007014L, (long)var1_2);
                                    }
                                    v0 = var8_5.length();
                                    if (var1_2 < 0L || var6_6 != false) break block18;
                                }
                                catch (gj v2) {
                                    throw x44.a("p", (Object)v2, (long)7178978935211007014L, (long)var1_2);
                                }
                                if (v0 != 1) break block19;
                            }
                            catch (gj v3) {
                                throw x44.a("p", (Object)v3, (long)7178978935211007014L, (long)var1_2);
                            }
                            return null;
                        }
                        catch (gj v4) {
                            throw x44.a("p", (Object)v4, (long)7178978935211007014L, (long)var1_2);
                        }
                    }
                    try {
                        v5 = var8_5;
                        if (var6_6 != false) break block20;
                        v0 = (int)v5.startsWith("L");
                    }
                    catch (gj v6) {
                        throw x44.a("p", (Object)v6, (long)7178978935211007014L, (long)var1_2);
                    }
                }
                try {
                    try {
                        if (v0 != 0) {
                            v5 = var8_5;
                            if (var6_6 != false) break block20;
                        }
                        ** GOTO lbl59
                    }
                    catch (gj v7) {
                        throw x44.a("p", (Object)v7, (long)7178978935211007014L, (long)var1_2);
                    }
                    if (v5.endsWith(";")) {
                    }
                    ** GOTO lbl59
                }
                catch (gj v8) {
                    throw x44.a("p", (Object)v8, (long)7178978935211007014L, (long)var1_2);
                }
                v5 = var8_5.substring(1, var8_5.length() - 1);
                if (var1_2 <= 0L) break block20;
                var9_7 = v5;
                try {
                    if (var6_6 == false) break block21;
lbl59:
                    // 3 sources

                    v5 = var8_5;
                }
                catch (gj v9) {
                    throw x44.a("p", (Object)v9, (long)7178978935211007014L, (long)var1_2);
                }
            }
            var9_7 = v5;
        }
        return hz.D(var4_3, var9_7);
    }

    public Enumeration q(Object[] objectArray) {
        return Collections.enumeration(this.i);
    }

    public boolean i(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = ab ^ l) ^ 0x3935F54D6AE6L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this.D;
        return (boolean)x44.a("u", (Object)objectArray2, (long)3122490973571704477L, (long)l);
    }

    public boolean Q(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = ab ^ l;
        return (boolean)x44.a("j", (Object)this, (long)-3735405853937537609L, (long)l);
    }

    public String t(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = ab ^ l;
        return x44.a("o", (Object)this, (long)-6540869336360263813L, (long)l);
    }

    public void N(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        this.D = n;
    }

    public abstract void e(Object[] var1);

    public final void B(Object[] objectArray) {
        yn yn2 = (yn)objectArray[0];
        an an2 = (an)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l = ab ^ l;
        long l3 = l2 ^ 0x1B3DE1FDF3C1L;
        long l4 = l2 ^ 0x67C71F60ACC6L;
        long l5 = l2 ^ 0x35961F37FB5L;
        long l6 = l2 ^ 0x7831D61CB3C7L;
        iu[] iuArray = this.n(l6);
        CallSite callSite = x44.a("t", (long)4382818842985171094L, (long)l);
        int n = 0;
        while (n < this.R) {
            CallSite callSite2;
            block7: {
                block8: {
                    block9: {
                        iu iu2 = iuArray[n];
                        try {
                            try {
                                try {
                                    callSite2 = callSite;
                                    if (l <= 0L) break block7;
                                    if (callSite2 != false) break block8;
                                    if (iu2.V(l5)) break block9;
                                }
                                catch (gj gj2) {
                                    throw x44.a("t", (Object)gj2, (long)2834115334366681298L, (long)l);
                                }
                                if (iu2.Q(l4)) break block9;
                            }
                            catch (gj gj3) {
                                throw x44.a("t", (Object)gj3, (long)2834115334366681298L, (long)l);
                            }
                            Object[] objectArray2 = new Object[4];
                            objectArray2[3] = iu2;
                            objectArray2[2] = l3;
                            objectArray2[1] = this;
                            objectArray2[0] = yn2;
                            x44.a("l", (Object)an2, (Object)objectArray2, (long)4608931615693196183L, (long)l);
                        }
                        catch (gj gj4) {
                            throw x44.a("t", (Object)gj4, (long)2834115334366681298L, (long)l);
                        }
                    }
                    ++n;
                }
                callSite2 = callSite;
            }
            if (callSite2 == false) continue;
        }
    }

    /*
     * Exception decompiling
     */
    public String L(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[DOLOOP]], but top level block is 10[SIMPLE_IF_TAKEN]
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public List K(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = ab ^ l;
        try {
            if (this.s != null) {
                return new ArrayList(this.s);
            }
        }
        catch (gj gj2) {
            throw x44.a("r", (Object)gj2, (long)-3662840784649637204L, (long)l);
        }
        return new ArrayList(0);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void W(Object[] var1_1) {
        block20: {
            block19: {
                block18: {
                    block16: {
                        block17: {
                            var2_2 = (Long)var1_1[0];
                            var4_3 = (_xx)var1_1[1];
                            var5_4 = (var2_2 = hz.ab ^ var2_2) ^ 131219543757683L;
                            var8_5 = var4_3.readInt();
                            var7_6 = x44.a("t", (long)3011390857256639886L, (long)var2_2);
                            try {
                                try {
                                    v0 /* !! */  = var8_5;
                                    v1 /* !! */  = hz.c("n", (int)16731, (long)(8156140065119218731L ^ var2_2));
                                    if (var7_6 != false) break block16;
                                    if (v0 /* !! */  == v1 /* !! */ ) break block17;
                                }
                                catch (gj v2) {
                                    throw x44.a("t", (Object)v2, (long)3624472335652277706L, (long)var2_2);
                                }
                                throw new _sx("'" + (String)x44.a("l", (Object)this, (long)var5_4, (long)3222359775853850554L, (long)var2_2) + (String)hz.a("z", (int)31448, (long)(3781792430326488233L ^ var2_2)) + Integer.toHexString(var8_5) + "'");
                            }
                            catch (gj v3) {
                                throw x44.a("t", (Object)v3, (long)3624472335652277706L, (long)var2_2);
                            }
                        }
                        x44.a("w", (Object)this, (int)var4_3.readUnsignedShort(), (long)3325514434281191482L, (long)var2_2);
                        v0 /* !! */  = this.D = var4_3.readUnsignedShort();
                        v1 /* !! */  = hz.c("n", (int)5089, (long)(5104774499626548880L ^ var2_2));
                    }
                    try {
                        try {
                            v4 = var7_6;
                            if (var2_2 < 0L) ** GOTO lbl45
                            if (v4 != false) break block18;
                            if (v0 /* !! */  >= v1 /* !! */ ) {
                            }
                            ** GOTO lbl58
                        }
                        catch (gj v5) {
                            throw x44.a("t", (Object)v5, (long)3624472335652277706L, (long)var2_2);
                        }
                        v0 /* !! */  = this.D;
                        v1 /* !! */  = hz.c("n", (int)13331, (long)(7472249258425112941L ^ var2_2));
                    }
                    catch (gj v6) {
                        throw x44.a("t", (Object)v6, (long)3624472335652277706L, (long)var2_2);
                    }
                }
                try {
                    try {
                        if (var2_2 <= 0L) break block19;
                        v4 = var7_6;
lbl45:
                        // 2 sources

                        if (v4 != false) break block19;
                        if (v0 /* !! */  != v1 /* !! */ ) break block20;
                    }
                    catch (gj v7) {
                        throw x44.a("t", (Object)v7, (long)3624472335652277706L, (long)var2_2);
                    }
                    v0 /* !! */  = (int)x44.a("h", (Object)this, (long)3325514434281191482L, (long)var2_2);
                    v1 /* !! */  = (CallSite)3;
                }
                catch (gj v8) {
                    throw x44.a("t", (Object)v8, (long)3624472335652277706L, (long)var2_2);
                }
            }
            try {
                if (v0 /* !! */  >= v1 /* !! */ ) break block20;
lbl58:
                // 2 sources

                throw new _sx("'" + (String)x44.a("l", (Object)this, (long)var5_4, (long)3222359775853850554L, (long)var2_2) + (String)hz.a("z", (int)31008, (long)(5907798792214552405L ^ var2_2)) + this.D + "." + (int)x44.a("h", (Object)this, (long)3325514434281191482L, (long)var2_2));
            }
            catch (gj v9) {
                throw x44.a("t", (Object)v9, (long)3624472335652277706L, (long)var2_2);
            }
        }
    }

    public String J(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                l = (l2 = ab ^ l2) ^ 0x4CC1DAA7A18CL;
                CallSite callSite2 = x44.a("p", (long)7661065518634261051L, (long)l2);
                try {
                    try {
                        callSite = x44.a("l", (Object)this, (long)8455467967762179782L, (long)l2);
                        if (callSite2 == false) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (gj gj2) {
                        throw x44.a("p", (Object)gj2, (long)7827489725728264998L, (long)l2);
                    }
                    callSite = x44.a("l", (Object)this, (long)8455467967762179782L, (long)l2);
                }
                catch (gj gj3) {
                    throw x44.a("p", (Object)gj3, (long)7827489725728264998L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l;
            return x44.a("h", (Object)callSite, (Object)objectArray2, (long)7675553459570995941L, (long)l2);
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    private a3 M(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [27[DOLOOP]], but top level block is 39[SIMPLE_IF_TAKEN]
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public String j(long l) {
        long l2 = l ^ 0x1E8C3F6CAF05L;
        return ((_rv)this.i.get(0)).C(l2);
    }

    public String G(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = ab ^ l) ^ 0x4CCF2EF6A31BL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this.a;
        return x44.a("t", (Object)objectArray2, (long)8728964630308668314L, (long)l);
    }

    @Override
    public boolean X(Object[] objectArray) {
        return true;
    }

    public abstract void Z(Object[] var1);

    void R(Object[] objectArray) {
        long l = (Long)objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        l = ab ^ l;
        x44.a("u", (Object)this, (boolean)bl, (long)9115567977827983135L, (long)l);
    }

    public boolean P(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = ab ^ l;
        return (boolean)x44.a("n", (Object)this, (long)-8929024865027724092L, (long)l);
    }

    /*
     * Exception decompiling
     */
    public final iz w(Object[] var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    static String D(long l, String string) {
        l = ab ^ l;
        return string.replace((char)hz.c("n", (int)17723, (long)(0x1E0EB222C297C625L ^ l)), (char)hz.c("n", (int)20406, (long)(0x478B7EB59DA74CA9L ^ l)));
    }

    public final void P(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = ab ^ l) ^ 0x63C4960A14EL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = bl;
        objectArray2[0] = l2;
        x44.a("o", (Object)this.m, (Object)objectArray2, (long)2822524622265607969L, (long)l);
    }

    public static String T(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = ab ^ l) ^ 0x4CE04CB698F1L;
        return hz.p(string, (char)hz.c("n", (int)20406, (long)(0x478B233472E41912L ^ l)), l2);
    }

    public final boolean d(long l) {
        long l2 = (l = ab ^ l) ^ 0x5EE30EA84CB0L;
        long l3 = l2 >>> 16;
        int n = (int)(l2 << 48 >>> 48);
        return this.m.Y(l3, (char)n);
    }

    void L(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = ab ^ l;
        x44.a("v", (Object)this, null, (long)-8929929091152980093L, (long)l);
        x44.a("v", (Object)this, (boolean)false, (long)-8981468570180609915L, (long)l);
    }

    public void i(Object[] objectArray) {
        block5: {
            hz hz2;
            long l;
            block4: {
                _rv _rv2 = (_rv)objectArray[0];
                l = (Long)objectArray[1];
                long l2 = (l = ab ^ l) ^ 0x5A6BA6894C0CL;
                CallSite callSite = x44.a("t", (long)-8339850521335318522L, (long)l);
                try {
                    try {
                        hz2 = this;
                        if (callSite != false) break block4;
                        hz2.i.add(_rv2);
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l2;
                        if (x44.a("l", (Object)_rv2, (Object)objectArray2, (long)-7769537458422947013L, (long)l) == false) break block5;
                    }
                    catch (gj gj2) {
                        throw x44.a("t", (Object)gj2, (long)-7510653675822421950L, (long)l);
                    }
                    hz2 = this;
                }
                catch (gj gj3) {
                    throw x44.a("t", (Object)gj3, (long)-7510653675822421950L, (long)l);
                }
            }
            x44.a("w", (Object)hz2, (boolean)false, (long)-8599799106589768520L, (long)l);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final iz[] J(Object[] var1_1) {
        block8: {
            block9: {
                var2_2 = (Long)var1_1[0];
                var4_3 = (String)var1_1[1];
                v0 = var2_2 = hz.ab ^ var2_2;
                var5_4 = v0 ^ 99475891711860L;
                var7_5 = v0 ^ 41169065542009L;
                var10_6 = new ArrayList<iz>();
                v1 = new Object[1];
                v1[0] = var7_5;
                var11_7 = x44.a("l", (Object)this, (Object)v1, (long)-8391262247773899055L, (long)var2_2);
                var9_8 = x44.a("t", (long)-7827855743058009289L, (long)var2_2);
                var12_9 = 0;
                while (var12_9 < var11_7.length) {
                    block11: {
                        block10: {
                            try {
                                try {
                                    try {
                                        v2 = var11_7;
                                        if (var2_2 <= 0L) break block8;
                                        v3 = (int)v2[var12_9].w(var5_4).equals(var4_3);
                                        if (var9_8 == false) break block9;
                                        if (var9_8 == false) break block10;
                                    }
                                    catch (gj v4) {
                                        throw x44.a("t", (Object)v4, (long)-7661580932234909142L, (long)var2_2);
                                    }
                                    if (var2_2 < 0L) break block11;
                                    if (v3 == 0) break block10;
                                }
                                catch (gj v5) {
                                    throw x44.a("t", (Object)v5, (long)-7661580932234909142L, (long)var2_2);
                                }
                                v6 = var10_6;
lbl33:
                                // 2 sources

                                while (true) {
                                    v6.add(var11_7[var12_9]);
                                    break;
                                }
                            }
                            catch (gj v7) {
                                throw x44.a("t", (Object)v7, (long)-7661580932234909142L, (long)var2_2);
                            }
                        }
                        ++var12_9;
                        v8 = var9_8;
                    }
                    if (v8 != false) continue;
                }
                v6 = var10_6;
                ** while (var2_2 < 0L)
lbl45:
                // 1 sources

                v3 = v6.size();
            }
            v2 = new iz[v3];
        }
        var12_10 = v2;
        return var10_6.toArray(var12_10);
    }

    public boolean R(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = ab ^ l;
        return (boolean)x44.a("o", (Object)this, (long)-7935022397541147695L, (long)l);
    }

    public boolean p(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = ab ^ l;
        return (boolean)x44.a("k", (Object)this, (long)831249386115502167L, (long)l);
    }

    public int i(Object[] objectArray) {
        return this.i.size();
    }

    public int J(Object[] objectArray) {
        return this.y;
    }

    public boolean Z(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = ab ^ l) ^ 0x5D17437BEE3FL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this.D;
        return (boolean)x44.a("r", (Object)objectArray2, (long)1921618548068985628L, (long)l);
    }

    public final boolean L(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = ab ^ l) ^ 0x791765453051L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return (boolean)x44.a("o", (Object)this.m, (Object)objectArray2, (long)-4061389131077753612L, (long)l);
    }

    public boolean K(long l) {
        boolean bl;
        l = ab ^ l;
        try {
            bl = this.X != null;
        }
        catch (gj gj2) {
            throw x44.a("t", (Object)gj2, (long)-1180798667391365094L, (long)l);
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    public List M(Object[] var1_1) {
        block10: {
            block11: {
                block12: {
                    block9: {
                        var2_2 = (Long)var1_1[0];
                        var2_2 = hz.ab ^ var2_2;
                        var4_3 = x44.a("s", (long)-3265674092368763159L, (long)var2_2);
                        try {
                            v0 = this;
                            if (var4_3 != false) break block9;
                            if (v0.s != null) {
                            }
                            ** GOTO lbl22
                        }
                        catch (gj v1) {
                            throw x44.a("s", (Object)v1, (long)-3950830248164772179L, (long)var2_2);
                        }
                        var5_4 = new ArrayList<E>(this.s.size() + 1);
                        try {
                            var5_4.add(this);
                            v2 = var5_4;
                            if (var2_2 < 0L) break block10;
                            v2.addAll(this.s);
                            if (var4_3 == false) break block11;
lbl22:
                            // 2 sources

                            v0 = this.t;
                        }
                        catch (gj v3) {
                            throw x44.a("s", (Object)v3, (long)-3950830248164772179L, (long)var2_2);
                        }
                    }
                    if (v0 == null) break block12;
                    var5_4 = new ArrayList<E>(this.t.s.size() + 1);
                    var5_4.add(this.t);
                    v2 = var5_4;
                    if (var2_2 < 0L) break block10;
                    v2.addAll(this.t.s);
                    if (var4_3 == false) break block11;
                }
                var5_4 = new ArrayList<hz>(1);
                var5_4.add(this);
            }
            v2 = var5_4;
        }
        return v2;
    }

    public boolean x(long l) {
        long l2 = (l = ab ^ l) ^ 0x521CA0EDAA8EL;
        return this.m.F(l2);
    }

    public static boolean q(Object[] objectArray) {
        boolean bl;
        block6: {
            block8: {
                block7: {
                    String string = (String)objectArray[0];
                    long l = (Long)objectArray[1];
                    l = ab ^ l;
                    CallSite callSite = x44.a("u", (long)1050381055444794071L, (long)l);
                    try {
                        try {
                            try {
                                bl = string.equals(hz.a("z", (int)18126, (long)(0x2AE957811CDC87E5L ^ l)));
                                if (callSite != false) break block6;
                                if (bl) break block7;
                            }
                            catch (gj gj2) {
                                throw x44.a("u", (Object)gj2, (long)1519294603771701907L, (long)l);
                            }
                            bl = string.equals(hz.a("z", (int)13915, (long)(0x52AACAF4A6E77774L ^ l)));
                            if (callSite != false) break block6;
                        }
                        catch (gj gj3) {
                            throw x44.a("u", (Object)gj3, (long)1519294603771701907L, (long)l);
                        }
                        if (!bl) break block8;
                    }
                    catch (gj gj4) {
                        throw x44.a("u", (Object)gj4, (long)1519294603771701907L, (long)l);
                    }
                }
                bl = true;
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    public boolean n(long l) {
        boolean bl;
        block6: {
            block8: {
                block7: {
                    long l2 = l = ab ^ l;
                    long l3 = l2 ^ 0x7DA0F353CF6CL;
                    long l4 = l2 ^ 0x74D282CF5BB2L;
                    CallSite callSite = x44.a("v", (long)-1850814507888553452L, (long)l);
                    try {
                        try {
                            try {
                                bl = this.B(l3);
                                if (callSite != false) break block6;
                                if (bl) break block7;
                            }
                            catch (gj gj2) {
                                throw x44.a("v", (Object)gj2, (long)-155729983874727344L, (long)l);
                            }
                            bl = this.K(l4);
                            if (callSite != false) break block6;
                        }
                        catch (gj gj3) {
                            throw x44.a("v", (Object)gj3, (long)-155729983874727344L, (long)l);
                        }
                        if (!bl) break block8;
                    }
                    catch (gj gj4) {
                        throw x44.a("v", (Object)gj4, (long)-155729983874727344L, (long)l);
                    }
                }
                bl = true;
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    public boolean N(long l, byte by) {
        boolean bl;
        block2: {
            block3: {
                long l2 = (l << 8 | (long)by << 56 >>> 56) ^ ab;
                CallSite callSite = x44.a("w", (long)-8491922901234566580L, (long)l2);
                try {
                    bl = this.y;
                    if (callSite == false) break block2;
                    if (!bl) break block3;
                }
                catch (gj gj2) {
                    throw x44.a("w", (Object)gj2, (long)-8297909742067158191L, (long)l2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public Integer v(Object[] objectArray) {
        return this.X;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public _rv n(Object[] objectArray) {
        List list;
        block9: {
            CallSite callSite;
            long l;
            block8: {
                l = (Long)objectArray[0];
                l = ab ^ l;
                callSite = x44.a("r", (long)4709555473361236273L, (long)l);
                try {
                    try {
                        list = this.i;
                        if (callSite == false) break block8;
                        if (list == null) return null;
                    }
                    catch (gj gj2) {
                        throw x44.a("r", (Object)gj2, (long)5164210200219793452L, (long)l);
                    }
                    list = this.i;
                }
                catch (gj gj3) {
                    throw x44.a("r", (Object)gj3, (long)5164210200219793452L, (long)l);
                }
            }
            try {
                try {
                    if (callSite == false) return (_rv)((Object)list);
                    if (list.size() != 0) break block9;
                    return null;
                }
                catch (gj gj4) {
                    throw x44.a("r", (Object)gj4, (long)5164210200219793452L, (long)l);
                }
            }
            catch (gj gj5) {
                throw x44.a("r", (Object)gj5, (long)5164210200219793452L, (long)l);
            }
        }
        list = this.i.get(0);
        return (_rv)((Object)list);
    }

    public boolean g(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = ab ^ l) ^ 0x69CF495A233BL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this.D;
        objectArray2[0] = l2;
        return (boolean)x44.a("p", (Object)objectArray2, (long)7755934054628130519L, (long)l);
    }

    @Override
    public String M(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x4D0DD7167E70L;
        return x44.a("t", this.a, (long)l2, (long)-3287488727841177613L, (long)l);
    }

    public hz R(Object[] objectArray) {
        return this.t;
    }

    static String t(String string, long l) {
        l = ab ^ l;
        return string.replace((char)hz.c("n", (int)20406, (long)(0x478B6B522C186B59L ^ l)), (char)hz.c("n", (int)17723, (long)(0x1E0EA7C57328E1D5L ^ l)));
    }

    public boolean v(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = ab ^ l) ^ 0x6BE1E1503E88L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this.D;
        objectArray2[0] = l2;
        return (boolean)x44.a("w", (Object)objectArray2, (long)-786946094717302546L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ArrayList b(Object[] var1_1) {
        block25: {
            var5_2 = (_ug)var1_1[0];
            var4_3 = (Integer)var1_1[1];
            var2_4 = (Long)var1_1[2];
            v0 = var2_4 = hz.ab ^ var2_4;
            var6_5 = v0 ^ 59748833654307L;
            var8_6 = v0 ^ 57190730685498L;
            var10_7 = v0 ^ 12900529765188L;
            var12_8 = v0 ^ 2454598450207L;
            v1 = v0 ^ 60676430890264L;
            var14_9 = (int)(v1 >>> 32);
            var15_10 = (int)(v1 << 32 >>> 48);
            var16_11 = (int)(v1 << 48 >>> 48);
            var17_12 = v0 ^ 14328114423686L;
            var20_13 = new ArrayList<String>();
            var21_14 = null;
            var22_15 = this.O(var14_9, var15_10, (char)var16_11);
            var19_16 = x44.a("s", (long)6668296809913281760L, (long)var2_4);
            var23_17 = 0;
            var24_18 = this;
            var25_19 = null;
            var26_20 = var4_3;
            block18: while (var22_15 != null) {
                v2 = var20_13;
                if (var19_16 == false) break block25;
                v2.add(var22_15);
                do {
                    block30: {
                        block31: {
                            block32: {
                                block33: {
                                    block26: {
                                        block28: {
                                            block29: {
                                                block27: {
                                                    var27_21 = (String)hz.a("z", (int)303, (long)(4742721386444525415L ^ var2_4)) + (String)x44.a("k", (Object)var24_18, (long)var10_7, (long)4940277031179110285L, (long)var2_4) + "'";
                                                    var24_18 = var5_2.C(var22_15, var26_20, var27_21, var17_12);
                                                    try {
                                                        try {
                                                            try {
                                                                v3 /* !! */  = x44.a("j", (long)6512717819484299596L, (long)var2_4);
                                                                if (var19_16 == false) break block26;
                                                                if (v3 /* !! */  == false) break block27;
                                                            }
                                                            catch (gj v4) {
                                                                throw x44.a("s", (Object)v4, (long)6520027599433737725L, (long)var2_4);
                                                            }
                                                            v5 = var25_19;
                                                            v6 /* !! */  = var19_16;
                                                            if (var2_4 > 0L) {
                                                                if (!v6 /* !! */ ) break block28;
                                                            }
                                                            ** GOTO lbl80
                                                        }
                                                        catch (gj v7) {
                                                            throw x44.a("s", (Object)v7, (long)6520027599433737725L, (long)var2_4);
                                                        }
                                                        if (v5 == null) break block27;
                                                    }
                                                    catch (gj v8) {
                                                        throw x44.a("s", (Object)v8, (long)6520027599433737725L, (long)var2_4);
                                                    }
                                                    v9 = new Object[4];
                                                    v9[3] = 1;
                                                    v9[2] = var24_18;
                                                    v9[1] = var6_5;
                                                    v9[0] = var25_19;
                                                    v10 = x44.a("s", (Object)v9, (long)4936734222607600788L, (long)var2_4);
                                                    try {
                                                        try {
                                                            if (var19_16 == false) break block29;
                                                            if (v10 == null) break block27;
                                                        }
                                                        catch (gj v11) {
                                                            throw x44.a("s", (Object)v11, (long)6520027599433737725L, (long)var2_4);
                                                        }
                                                        throw new gj((String)var28_22);
                                                    }
                                                    catch (gj v12) {
                                                        throw x44.a("s", (Object)v12, (long)6520027599433737725L, (long)var2_4);
                                                    }
                                                }
                                                var25_19 = var24_18;
                                                v10 = var24_18.O(var14_9, var15_10, (char)var16_11);
                                            }
                                            var22_15 = v10;
                                            v5 = var24_18;
                                        }
                                        try {
                                            v6 /* !! */  = var19_16;
lbl80:
                                            // 2 sources

                                            if (var2_4 < 0L) ** GOTO lbl91
                                            if (v6 /* !! */ ) {
                                                v3 /* !! */  = (CallSite)v5.K(var12_8);
                                            }
                                            ** GOTO lbl90
                                        }
                                        catch (gj v13) {
                                            throw x44.a("s", (Object)v13, (long)6520027599433737725L, (long)var2_4);
                                        }
                                    }
                                    if (v3 /* !! */  != false) {
                                        v5 = var24_18;
lbl90:
                                        // 2 sources

                                        v6 /* !! */  = false;
lbl91:
                                        // 2 sources

                                        v14 = x44.a("k", (Object)v5, (Object)new Object[v6 /* !! */ ], (long)6537079016384423315L, (long)var2_4);
                                    } else {
                                        v14 = var4_3;
                                    }
                                    var26_20 = v14;
                                    try {
                                        try {
                                            v15 /* !! */  = var23_17++;
                                            if (var2_4 <= 0L) break block30;
                                            if (v15 /* !! */  <= hz.c("n", (int)30200, (long)(8529401908005826725L ^ var2_4))) break block31;
                                            v16 = var21_14;
                                            if (var2_4 <= 0L || var19_16 == false) break block32;
                                        }
                                        catch (gj v17) {
                                            throw x44.a("s", (Object)v17, (long)6520027599433737725L, (long)var2_4);
                                        }
                                        if (v16 != null) break block33;
                                    }
                                    catch (gj v18) {
                                        throw x44.a("s", (Object)v18, (long)6520027599433737725L, (long)var2_4);
                                    }
                                    v19 = new Object[1];
                                    v19[0] = var8_6;
                                    var21_14 = x44.a("s", (Object)v19, (long)6647007121142175218L, (long)var2_4);
                                }
                                v16 = var21_14;
                            }
                            try {
                                v15 /* !! */  = (int)v16.add(var22_15);
                                if (var2_4 <= 0L) break block30;
                                if (v15 /* !! */  == 0) {
                                    throw new gj((String)hz.a("z", (int)16005, (long)(5108507255665537231L ^ var2_4)) + (String)x44.a("k", (Object)var24_18, (long)var10_7, (long)4940277031179110285L, (long)var2_4) + (String)hz.a("z", (int)12425, (long)(3098932824381079252L ^ var2_4)) + (String)x44.a("k", (Object)this, (long)var10_7, (long)4940277031179110285L, (long)var2_4) + "'");
                                }
                            }
                            catch (gj v20) {
                                throw x44.a("s", (Object)v20, (long)6520027599433737725L, (long)var2_4);
                            }
                        }
                        v15 /* !! */  = (int)var19_16;
                    }
                    if (v15 /* !! */  != 0) continue block18;
                } while (var2_4 <= 0L);
            }
            v2 = var20_13;
        }
        return v2;
    }

    @Override
    public final String a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return this.x.replace((char)hz.c("n", (int)9992, (long)(0x3A0D6DDE9C602714L ^ l)), (char)hz.c("n", (int)24133, (long)(0x657A69CA9AF2DE5FL ^ l)));
    }

    @Override
    public String q(long l) {
        return ((_rv)this.i.get(0)).w();
    }

    public void C(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = ab ^ l;
        x44.a("w", (Object)this, (boolean)true, (long)-7659932684226294164L, (long)l);
    }

    /*
     * Exception decompiling
     */
    public String z(Object[] var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public String b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return this.a;
    }

    public int L(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = ab ^ l;
        return (int)x44.a("j", (Object)this, (long)-1239342905673746224L, (long)l);
    }

    hz(_rv _rv2, byte[] byArray, long l, int n) {
        Object object;
        hz hz2;
        block4: {
            block5: {
                AbstractList abstractList;
                long l2 = (l = ab ^ l) ^ 0x716DB4C9F3D5L;
                CallSite callSite = x44.a("u", (long)3718791476955776991L, (long)l);
                super(null);
                CallSite callSite2 = callSite;
                try {
                    hz hz3 = this;
                    abstractList = x44.a("l", (long)3725315630516689197L, (long)l) != false ? new Vector(1) : new ArrayList(1);
                }
                catch (gj gj2) {
                    throw x44.a("u", (Object)gj2, (long)2890720799916808091L, (long)l);
                }
                try {
                    hz3.i = abstractList;
                    x44.a("v", (Object)this, (boolean)false, (long)3262488652103940822L, (long)l);
                    x44.a("v", (Object)this, (boolean)false, (long)3774834324261297331L, (long)l);
                    x44.a("v", (Object)this, (boolean)false, (long)3533715383101329556L, (long)l);
                    x44.a("v", (Object)this, (boolean)false, (long)3936996375296748925L, (long)l);
                    this.i.add(_rv2);
                    hz2 = this;
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l2;
                    object = x44.a("m", (Object)_rv2, (Object)objectArray, (long)3167198076512984290L, (long)l);
                    if (callSite2 != false) break block4;
                    if (object != false) break block5;
                }
                catch (gj gj3) {
                    throw x44.a("u", (Object)gj3, (long)2890720799916808091L, (long)l);
                }
                object = true;
                break block4;
            }
            object = false;
        }
        x44.a("v", (Object)hz2, (boolean)object, (long)3998716260182293345L, (long)l);
        this.I = byArray;
        this.y = n;
    }

    public final void Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        long l2 = (l = ab ^ l) ^ 0x1D29B7222147L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = bl;
        x44.a("o", (Object)this.m, (Object)objectArray2, (long)-7986865445397866917L, (long)l);
    }

    public hz B(Object[] objectArray) {
        hz hz2;
        block10: {
            hz hz3;
            block11: {
                Integer n = (Integer)objectArray[0];
                long l = (Long)objectArray[1];
                l = ab ^ l;
                hz3 = this;
                CallSite callSite = x44.a("t", (long)4691208443324036446L, (long)l);
                try {
                    hz2 = this;
                    if (callSite != false) break block10;
                    if (hz2.s == null) break block11;
                }
                catch (gj gj2) {
                    throw x44.a("t", (Object)gj2, (long)6529286369884808474L, (long)l);
                }
                for (hz hz4 : this.s) {
                    Object object;
                    block13: {
                        block14: {
                            hz hz5;
                            block12: {
                                try {
                                    try {
                                        try {
                                            hz2 = hz4;
                                            CallSite callSite2 = callSite;
                                            if (l >= 0L) {
                                                if (callSite2 != false) break block10;
                                                callSite2 = callSite;
                                            }
                                            if (callSite2 != false) break block12;
                                        }
                                        catch (gj gj3) {
                                            throw x44.a("t", (Object)gj3, (long)6529286369884808474L, (long)l);
                                        }
                                        object = hz2.X;
                                        if (l < 0L) break block13;
                                        if (object > n) break block14;
                                    }
                                    catch (gj gj4) {
                                        throw x44.a("t", (Object)gj4, (long)6529286369884808474L, (long)l);
                                    }
                                    hz5 = hz4;
                                }
                                catch (gj gj5) {
                                    throw x44.a("t", (Object)gj5, (long)6529286369884808474L, (long)l);
                                }
                            }
                            hz3 = hz5;
                        }
                        object = callSite;
                    }
                    if (object == false) continue;
                }
            }
            hz2 = hz3;
        }
        return hz2;
    }

    public abstract boolean b();

    public void H(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = ab ^ l) ^ 0x10F0D9CAA9FFL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        x44.a("i", (Object)this.m, (Object)objectArray2, (long)-405210586250807817L, (long)l);
    }

    public int m(Object[] objectArray) {
        return this.c;
    }

    public void Q(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = ab ^ l;
        x44.a("r", (Object)this, (boolean)true, (long)7902433185499342747L, (long)l);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Map A(Object[] var1_1) {
        block163: {
            block148: {
                block170: {
                    block169: {
                        block146: {
                            block147: {
                                block145: {
                                    block132: {
                                        block133: {
                                            block143: {
                                                block144: {
                                                    block134: {
                                                        block135: {
                                                            block136: {
                                                                block164: {
                                                                    var2_2 = (_ye)var1_1[0];
                                                                    var7_3 = (pg)var1_1[1];
                                                                    var5_4 = (Long)var1_1[2];
                                                                    var3_5 = (_ur)var1_1[3];
                                                                    var4_6 = (Random)var1_1[4];
                                                                    v0 = var5_4 = hz.ab ^ var5_4;
                                                                    var8_7 = v0 ^ 7584960090921L;
                                                                    var10_8 = v0 ^ 55342762486333L;
                                                                    var12_9 = v0 ^ 65116594396670L;
                                                                    v1 = v0 ^ 16720576540984L;
                                                                    var14_10 = (int)(v1 >>> 56);
                                                                    var15_11 = v1 << 8 >>> 8;
                                                                    var17_12 = v0 ^ 139348643132909L;
                                                                    var19_13 = v0 ^ 509783311471L;
                                                                    var21_14 = v0 ^ 134296343322128L;
                                                                    var23_15 = v0 ^ 122257508457842L;
                                                                    var25_16 = v0 ^ 100137806476986L;
                                                                    var27_17 = v0 ^ 29501571098846L;
                                                                    var29_18 = v0 ^ 55097022676575L;
                                                                    var31_19 = v0 ^ 27328450032428L;
                                                                    var33_20 = v0 ^ 31034600416464L;
                                                                    var35_21 = v0 ^ 55412864795249L;
                                                                    var37_22 = v0 ^ 49970703508753L;
                                                                    var39_23 = v0 ^ 52313545424733L;
                                                                    var41_24 = v0 ^ 17825798485120L;
                                                                    var43_25 = v0 ^ 61475099089405L;
                                                                    v2 = v0 ^ 91971309708078L;
                                                                    var45_26 = (int)(v2 >>> 32);
                                                                    var46_27 = (int)(v2 << 32 >>> 48);
                                                                    var47_28 = (int)(v2 << 48 >>> 48);
                                                                    var48_29 = v0 ^ 87023008846883L;
                                                                    var50_30 = v0 ^ 127401918498192L;
                                                                    var52_31 = v0 ^ 92448978094536L;
                                                                    var54_32 = v0 ^ 57974230076385L;
                                                                    var57_33 = this.k(var33_20);
                                                                    var60_34 = 1;
                                                                    var61_35 = 4865979568630159862L;
                                                                    var56_36 = x44.a("u", (long)-1744154877661817969L, (long)var5_4);
                                                                    var63_37 = 4865979568626664830L;
                                                                    v3 /* !! */  = var4_6.nextInt((int)hz.c("n", (int)25189, (long)(5929036826446643478L ^ var5_4)));
                                                                    if (var56_36 != false) break block132;
                                                                    if (v3 /* !! */  != 0) break block133;
                                                                    break block164;
                                                                    catch (IOException v4) {
                                                                        throw x44.a("u", (Object)v4, (long)-266365468764339253L, (long)var5_4);
                                                                    }
                                                                }
                                                                try {
                                                                    block165: {
                                                                        v5 = var7_3.n(var12_9);
                                                                        v6 = var56_36;
                                                                        if (var5_4 < 0L) ** GOTO lbl226
                                                                        if (v6 != false) break block134;
                                                                        break block165;
                                                                        catch (IOException v7) {
                                                                            throw x44.a("u", (Object)v7, (long)-266365468764339253L, (long)var5_4);
                                                                        }
                                                                    }
                                                                    if (!v5) break block135;
                                                                }
                                                                catch (IOException v8) {
                                                                    throw x44.a("u", (Object)v8, (long)-266365468764339253L, (long)var5_4);
                                                                }
                                                                v9 = new Object[1];
                                                                v9[0] = var35_21;
                                                                v10 = new Object[2];
                                                                v10[1] = var31_19;
                                                                v10[0] = x44.a("m", (Object)var3_5, (Object)v9, (long)-1746581584017112270L, (long)var5_4);
                                                                var65_38 = x44.a("u", (Object)v10, (long)-2061863035627081953L, (long)var5_4);
                                                                var66_39 = null;
                                                                if (var65_38 == null || x44.a("m", (Object)(var67_42 = new File((String)var65_38)), (long)-2155184084179897109L, (long)var5_4) == false) break block136;
                                                                var66_39 = new BufferedReader(new InputStreamReader((InputStream)new FileInputStream((File)var67_42), (String)hz.a("z", (int)32484, (long)(1936564798585558664L ^ var5_4))));
                                                                var68_47 = new ArrayList<Object>();
                                                                var69_48 = false;
                                                                while ((var70_51 = var66_39.readLine()) != null) {
                                                                    block141: {
                                                                        block140: {
                                                                            block139: {
                                                                                block138: {
                                                                                    block137: {
                                                                                        block166: {
                                                                                            v5 = var69_48;
                                                                                            v11 /* !! */  = var56_36;
                                                                                            if (var5_4 <= 0L) ** GOTO lbl88
                                                                                            if (v11 /* !! */  != false) break block134;
                                                                                            v11 /* !! */  = var56_36;
lbl88:
                                                                                            // 2 sources

                                                                                            if (var5_4 <= 0L) ** GOTO lbl109
                                                                                            if (v11 /* !! */  != false) break block137;
                                                                                            break block166;
                                                                                            catch (IOException v12) {
                                                                                                throw x44.a("u", (Object)v12, (long)-266365468764339253L, (long)var5_4);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            block167: {
                                                                                                if (v5) break;
                                                                                                break block167;
                                                                                                catch (IOException v13) {
                                                                                                    throw x44.a("u", (Object)v13, (long)-266365468764339253L, (long)var5_4);
                                                                                                }
                                                                                            }
                                                                                            var68_47.add(var70_51);
                                                                                            v14 = var70_51.indexOf((String)hz.a("z", (int)2230, (long)(8605561480496193735L ^ var5_4)));
                                                                                        }
                                                                                        catch (IOException v15) {
                                                                                            throw x44.a("u", (Object)v15, (long)-266365468764339253L, (long)var5_4);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        v11 /* !! */  = var56_36;
lbl109:
                                                                                        // 2 sources

                                                                                        if (var5_4 > 0L) {
                                                                                            if (v11 /* !! */  != false) break block138;
                                                                                            v11 /* !! */  = (CallSite)-1;
                                                                                        }
                                                                                        if (v14 <= v11 /* !! */ ) continue;
                                                                                    }
                                                                                    catch (IOException v16) {
                                                                                        throw x44.a("u", (Object)v16, (long)-266365468764339253L, (long)var5_4);
                                                                                    }
                                                                                    v14 = 1;
                                                                                }
                                                                                var69_48 = v14;
                                                                                var71_52 = var61_35;
                                                                                var73_54 = var63_37 ^ var71_52;
                                                                                var75_56 = ((String)var68_47.get(var68_47.size() - 3)).trim();
                                                                                v17 = new Object[2];
                                                                                v17[1] = var39_23;
                                                                                v17[0] = var75_56;
                                                                                var76_57 = x44.a("u", (Object)v17, (long)-402358739767238259L, (long)var5_4);
                                                                                v18 = var56_36;
                                                                                if (var5_4 <= 0L) ** GOTO lbl145
                                                                                if (v18 != false) break block139;
                                                                                try {
                                                                                    block168: {
                                                                                        if (var76_57 == var71_52) ** GOTO lbl146
                                                                                        break block168;
                                                                                        catch (IOException v19) {
                                                                                            throw x44.a("u", (Object)v19, (long)-266365468764339253L, (long)var5_4);
                                                                                        }
                                                                                    }
                                                                                    var7_3.G(var43_25, x44.a("l", (long)-496688035431398333L, (long)var5_4));
                                                                                }
                                                                                catch (IOException v20) {
                                                                                    throw x44.a("u", (Object)v20, (long)-266365468764339253L, (long)var5_4);
                                                                                }
                                                                            }
                                                                            try {
                                                                                if (var5_4 <= 0L) break block140;
                                                                                v18 = var56_36;
lbl145:
                                                                                // 2 sources

                                                                                if (v18 == false) break block140;
lbl146:
                                                                                // 2 sources

                                                                                var7_3.G(var43_25, x44.a("l", (long)-183464361120813018L, (long)var5_4));
                                                                            }
                                                                            catch (IOException v21) {
                                                                                throw x44.a("u", (Object)v21, (long)-266365468764339253L, (long)var5_4);
                                                                            }
                                                                        }
                                                                        var78_59 = ((String)var68_47.get(var68_47.size() - 5)).trim();
                                                                        var79_60 = var78_59.substring(3, (int)hz.c("n", (int)9849, (long)(4316554199085319436L ^ var5_4)));
                                                                        var80_61 = new StringTokenizer(var79_60, ".");
                                                                        var81_62 = (double)Integer.parseInt(var80_61.nextToken()) * 365.25;
                                                                        var81_62 += (double)Integer.parseInt(var80_61.nextToken()) * 30.4;
                                                                        var81_62 += (double)Integer.parseInt(var80_61.nextToken());
                                                                        var83_63 = (long)(var81_62 *= 1440.0);
                                                                        try {
                                                                            v22 /* !! */  = var83_63 == var73_54 ? 0 : (var83_63 < var73_54 ? -1 : 1);
                                                                            if (var5_4 <= 0L) break block141;
                                                                            if (v22 /* !! */  > 0) {
                                                                                var7_3.G(var43_25, x44.a("l", (long)-496688035431398333L, (long)var5_4));
                                                                            }
                                                                        }
                                                                        catch (IOException v23) {
                                                                            throw x44.a("u", (Object)v23, (long)-266365468764339253L, (long)var5_4);
                                                                        }
                                                                        v22 /* !! */  = (long)var56_36;
                                                                    }
                                                                    if (v22 /* !! */  == false) continue;
                                                                }
                                                            }
                                                            try {
                                                                if (var5_4 <= 0L) break block135;
                                                                v24 = var66_39;
                                                                if (var5_4 <= 0L) ** GOTO lbl232
                                                                if (var56_36 == false) {
                                                                    if (v24 == null) break block135;
                                                                }
                                                                ** GOTO lbl182
                                                            }
                                                            catch (IOException v25) {
                                                                throw x44.a("u", (Object)v25, (long)-266365468764339253L, (long)var5_4);
                                                            }
                                                            try {
                                                                v26 = var66_39;
lbl182:
                                                                // 2 sources

                                                                x44.a("m", v26, (long)-419158730049288946L, (long)var5_4);
                                                            }
                                                            catch (IOException var67_43) {}
                                                            break block135;
                                                            catch (Exception var67_44) {
                                                                try {
                                                                    if (var5_4 <= 0L) break block135;
                                                                    v27 = var66_39;
                                                                    if (var56_36 == false) {
                                                                        if (v27 == null) break block135;
                                                                    }
                                                                    ** GOTO lbl198
                                                                }
                                                                catch (IOException v28) {
                                                                    throw x44.a("u", (Object)v28, (long)-266365468764339253L, (long)var5_4);
                                                                }
                                                                try {
                                                                    v27 = var66_39;
lbl198:
                                                                    // 2 sources

                                                                    x44.a("m", v27, (long)-419158730049288946L, (long)var5_4);
                                                                }
                                                                catch (IOException var67_45) {}
                                                                catch (Throwable var85_64) {
                                                                    block142: {
                                                                        try {
                                                                            if (var5_4 < 0L) break block142;
                                                                            v29 = var66_39;
                                                                            if (var56_36 == false) {
                                                                                if (v29 == null) break block142;
                                                                            }
                                                                            ** GOTO lbl214
                                                                        }
                                                                        catch (IOException v30) {
                                                                            throw x44.a("u", (Object)v30, (long)-266365468764339253L, (long)var5_4);
                                                                        }
                                                                        try {
                                                                            v29 = var66_39;
lbl214:
                                                                            // 2 sources

                                                                            x44.a("m", v29, (long)-419158730049288946L, (long)var5_4);
                                                                        }
                                                                        catch (IOException var86_65) {
                                                                            // empty catch block
                                                                        }
                                                                    }
                                                                    throw var85_64;
                                                                }
                                                            }
                                                        }
                                                        v5 = var7_3.n(var12_9);
                                                    }
                                                    try {
                                                        try {
                                                            v6 = var56_36;
lbl226:
                                                            // 2 sources

                                                            if (v6 != false) break block143;
                                                            if (v5) break block144;
                                                        }
                                                        catch (IOException v31) {
                                                            throw x44.a("u", (Object)v31, (long)-266365468764339253L, (long)var5_4);
                                                        }
                                                        v24 = var7_3.G();
lbl232:
                                                        // 2 sources

                                                        v5 = (Boolean)v24;
                                                        break block143;
                                                    }
                                                    catch (IOException v32) {
                                                        throw x44.a("u", (Object)v32, (long)-266365468764339253L, (long)var5_4);
                                                    }
                                                }
                                                v5 = true;
                                            }
                                            var60_34 = (int)v5;
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v3 /* !! */  = var60_34;
                                                            if (var56_36 != false) break block132;
                                                            if (v3 /* !! */  != 0) break block133;
                                                        }
                                                        catch (IOException v33) {
                                                            throw x44.a("u", (Object)v33, (long)-266365468764339253L, (long)var5_4);
                                                        }
                                                        v34 = new Object[1];
                                                        v34[0] = var54_32;
                                                        v3 /* !! */  = (int)x44.a("m", (Object)var3_5, (Object)v34, (long)-459835449112630488L, (long)var5_4);
                                                        v35 = var56_36;
                                                        if (var5_4 >= 0L) {
                                                            if (v35 != false) break block132;
                                                        }
                                                        ** GOTO lbl279
                                                    }
                                                    catch (IOException v36) {
                                                        throw x44.a("u", (Object)v36, (long)-266365468764339253L, (long)var5_4);
                                                    }
                                                    if (v3 /* !! */  != 0) break block133;
                                                }
                                                catch (IOException v37) {
                                                    throw x44.a("u", (Object)v37, (long)-266365468764339253L, (long)var5_4);
                                                }
                                                v38 = new Object[2];
                                                v38[1] = var15_11;
                                                v38[0] = (int)((byte)var14_10);
                                                x44.a("m", (Object)var3_5, (Object)v38, (long)-196023151911930237L, (long)var5_4);
                                            }
                                            catch (IOException v39) {
                                                throw x44.a("u", (Object)v39, (long)-266365468764339253L, (long)var5_4);
                                            }
                                        }
                                        v3 /* !! */  = (int)var57_33.equals(hz.a("z", (int)9080, (long)(2002266445504547600L ^ var5_4)));
                                    }
                                    try {
                                        try {
                                            v35 = var56_36;
lbl279:
                                            // 2 sources

                                            if (var5_4 >= 0L) {
                                                if (v35 != false) break block145;
                                                if (v3 /* !! */  != 0) break block146;
                                            }
                                            ** GOTO lbl296
                                        }
                                        catch (IOException v40) {
                                            throw x44.a("u", (Object)v40, (long)-266365468764339253L, (long)var5_4);
                                        }
                                        v41 = new Object[1];
                                        v41[0] = var8_7;
                                        v3 /* !! */  = (int)x44.a("m", (Object)this, (Object)v41, (long)-1735191563788699493L, (long)var5_4);
                                    }
                                    catch (IOException v42) {
                                        throw x44.a("u", (Object)v42, (long)-266365468764339253L, (long)var5_4);
                                    }
                                }
                                try {
                                    v35 = var56_36;
lbl296:
                                    // 2 sources

                                    if (v35 != false) break block147;
                                    if (v3 /* !! */  != 0) break block146;
                                }
                                catch (IOException v43) {
                                    throw x44.a("u", (Object)v43, (long)-266365468764339253L, (long)var5_4);
                                }
                                v3 /* !! */  = var60_34;
                            }
                            if (v3 /* !! */  == 0) break block146;
                            var65_38 = this.O(var45_26, var46_27, (char)var47_28);
                            var66_39 = (String)hz.a("z", (int)3637, (long)(557751290703390294L ^ var5_4)) + (String)x44.a("m", (Object)this, (long)var23_15, (long)-2109646970005921349L, (long)var5_4) + "'";
                            v44 = new Object[6];
                            v44[5] = var66_39;
                            v44[4] = var4_6;
                            v44[3] = var3_5;
                            v44[2] = var7_3;
                            v44[1] = var65_38;
                            v44[0] = var37_22;
                            var67_42 = x44.a("m", (Object)var2_2, (Object)v44, (long)-1794218994088661637L, (long)var5_4);
                            v45 = new Object[2];
                            v45[1] = var19_13;
                            v45[0] = var67_42;
                            v46 = x44.a("u", (Object)v45, (long)-2274369870931341596L, (long)var5_4);
                            if (var5_4 < 0L) break block169;
                            var58_66 = v46;
                            if (var56_36 == false) break block170;
                        }
                        v47 = new Object[1];
                        v47[0] = var17_12;
                        v46 = x44.a("u", (Object)v47, (long)-571446816234070402L, (long)var5_4);
                    }
                    var58_66 = v46;
                }
                var65_38 = new Vector<E>();
                var66_40 = 0;
                block95: while (var66_40 < x44.a("i", (Object)this, (long)-330316653408191210L, (long)var5_4)) {
                    v48 = new Object[2];
                    v48[1] = var66_40;
                    v48[0] = var52_31;
                    var67_42 = x44.a("m", (Object)this, (Object)v48, (long)-2128812580749338600L, (long)var5_4);
                    var68_47 = (String)hz.a("z", (int)648, (long)(7034610550396889836L ^ var5_4)) + (String)x44.a("m", (Object)this, (long)var23_15, (long)-2109646970005921349L, (long)var5_4) + "'";
                    v49 = new Object[6];
                    v49[5] = var68_47;
                    v49[4] = var4_6;
                    v49[3] = var3_5;
                    v49[2] = var7_3;
                    v49[1] = var67_42;
                    v49[0] = var37_22;
                    var69_49 = x44.a("m", (Object)var2_2, (Object)v49, (long)-1794218994088661637L, (long)var5_4);
                    try {
                        x44.a("m", (Object)var65_38, (Object)var69_49, (long)-569244351075822089L, (long)var5_4);
                        ++var66_40;
                        do {
                            v50 = var56_36;
                            if (var5_4 >= 0L) {
                                if (v50 != false) break block148;
                                v50 = var56_36;
                            }
                            if (v50 == false) continue block95;
                        } while (var5_4 < 0L);
                        break;
                    }
                    catch (IOException v51) {
                        throw x44.a("u", (Object)v51, (long)-266365468764339253L, (long)var5_4);
                    }
                }
                var66_40 = 0;
            }
            block97: while (true) {
                v52 /* !! */  = var66_40;
                block98: while (v52 /* !! */  < var65_38.size()) {
                    v53 /* !! */  = var65_38.elementAt(var66_40);
                    do {
                        var67_42 = (Map)v53 /* !! */ ;
                        var68_47 = var67_42.entrySet().iterator();
                        block100: while (true) {
                            v54 /* !! */  = var68_47.hasNext();
                            while (v54 /* !! */ ) {
                                block160: {
                                    block154: {
                                        block161: {
                                            block157: {
                                                block159: {
                                                    block158: {
                                                        block155: {
                                                            block153: {
                                                                block152: {
                                                                    block151: {
                                                                        block149: {
                                                                            block150: {
                                                                                var69_50 = var68_47.next();
                                                                                var70_51 = (_fz)var69_50.getKey();
                                                                                var71_53 = (hz)var69_50.getValue();
                                                                                var72_68 = var71_53.k(var33_20);
                                                                                v52 /* !! */  = (int)var72_68.equals(hz.a("z", (int)9080, (long)(2002266445504547600L ^ var5_4)));
                                                                                if (var56_36 != false) continue block98;
                                                                                if (v52 /* !! */  != 0) break block154;
                                                                                v55 = new Object[3];
                                                                                v55[2] = var70_51;
                                                                                v55[1] = var10_8;
                                                                                v55[0] = var71_53;
                                                                                var73_55 = x44.a("m", (Object)var2_2, (Object)v55, (long)-2308719021236004L, (long)var5_4);
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            v56 = var73_55;
                                                                                            v57 = var56_36;
                                                                                            if (var5_4 >= 0L) {
                                                                                                if (v57 != false) break block149;
                                                                                                if (v56 == null) break block150;
                                                                                            }
                                                                                            ** GOTO lbl417
                                                                                        }
                                                                                        catch (IOException v58) {
                                                                                            throw x44.a("u", (Object)v58, (long)-266365468764339253L, (long)var5_4);
                                                                                        }
                                                                                        v56 = var73_55;
                                                                                        v59 = var71_53;
                                                                                        if (var5_4 < 0L || var56_36 != false) break block151;
                                                                                    }
                                                                                    catch (IOException v60) {
                                                                                        throw x44.a("u", (Object)v60, (long)-266365468764339253L, (long)var5_4);
                                                                                    }
                                                                                    if (v56 == v59) break block150;
                                                                                }
                                                                                catch (IOException v61) {
                                                                                    throw x44.a("u", (Object)v61, (long)-266365468764339253L, (long)var5_4);
                                                                                }
                                                                                var71_53 = var73_55;
                                                                                var72_68 = var73_55.k(var33_20);
                                                                            }
                                                                            v56 = var71_53;
                                                                        }
                                                                        try {
                                                                            v57 = var56_36;
lbl417:
                                                                            // 2 sources

                                                                            if (v57 != false) break block152;
                                                                            v59 = this;
                                                                        }
                                                                        catch (IOException v62) {
                                                                            throw x44.a("u", (Object)v62, (long)-266365468764339253L, (long)var5_4);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (v56 == v59) {
                                                                            v54 /* !! */  = var56_36;
                                                                            if (var5_4 <= 0L) continue;
                                                                            if (!v54 /* !! */ ) continue block100;
                                                                        }
                                                                    }
                                                                    catch (IOException v63) {
                                                                        throw x44.a("u", (Object)v63, (long)-266365468764339253L, (long)var5_4);
                                                                    }
                                                                    v56 = var58_66.put(var70_51, var71_53);
                                                                }
                                                                var74_69 = v56;
                                                                try {
                                                                    v64 = var74_69;
                                                                    if (var56_36 != false) break block153;
                                                                    if (v64 == null) break block154;
                                                                }
                                                                catch (IOException v65) {
                                                                    throw x44.a("u", (Object)v65, (long)-266365468764339253L, (long)var5_4);
                                                                }
                                                                v64 = var71_53;
                                                            }
                                                            if (v64 == var74_69) break block154;
                                                            var75_56 = yn.E(var72_68);
                                                            var76_58 = yn.E(var74_69.k(var33_20));
                                                            try {
                                                                block156: {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v66 = var76_58;
                                                                                v67 = var56_36;
                                                                                if (var5_4 >= 0L) {
                                                                                    if (v67 != false) break block155;
                                                                                    if (v66 == null) break block156;
                                                                                }
                                                                                ** GOTO lbl481
                                                                            }
                                                                            catch (IOException v68) {
                                                                                throw x44.a("u", (Object)v68, (long)-266365468764339253L, (long)var5_4);
                                                                            }
                                                                            v69 = var76_58;
                                                                            v70 = var56_36;
                                                                            if (var5_4 > 0L) {
                                                                                if (v70 != false) break block157;
                                                                            }
                                                                            ** GOTO lbl527
                                                                        }
                                                                        catch (IOException v71) {
                                                                            throw x44.a("u", (Object)v71, (long)-266365468764339253L, (long)var5_4);
                                                                        }
                                                                        if (var5_4 <= 0L) break block157;
                                                                        if (v69.S(var48_29)) {
                                                                        }
                                                                        ** GOTO lbl519
                                                                    }
                                                                    catch (IOException v72) {
                                                                        throw x44.a("u", (Object)v72, (long)-266365468764339253L, (long)var5_4);
                                                                    }
                                                                }
                                                                v66 = var75_56;
                                                            }
                                                            catch (IOException v73) {
                                                                throw x44.a("u", (Object)v73, (long)-266365468764339253L, (long)var5_4);
                                                            }
                                                        }
                                                        try {
                                                            v67 = var56_36;
lbl481:
                                                            // 2 sources

                                                            if (var5_4 > 0L) {
                                                                if (v67 != false) break block158;
                                                                if (v66 == null) break block154;
                                                            }
                                                            ** GOTO lbl494
                                                        }
                                                        catch (IOException v74) {
                                                            throw x44.a("u", (Object)v74, (long)-266365468764339253L, (long)var5_4);
                                                        }
                                                        v66 = var75_56;
                                                    }
                                                    try {
                                                        try {
                                                            if (var5_4 <= 0L) break block159;
                                                            v67 = var56_36;
lbl494:
                                                            // 2 sources

                                                            if (v67 != false) break block159;
                                                            v75 /* !! */  = (CallSite)v66.S(var48_29);
                                                            if (var5_4 <= 0L) break block160;
                                                            if (v75 /* !! */  != false) break block154;
                                                        }
                                                        catch (IOException v76) {
                                                            throw x44.a("u", (Object)v76, (long)-266365468764339253L, (long)var5_4);
                                                        }
                                                        v77 = new Object[6];
                                                        v77[5] = hz.a("z", (int)26186, (long)(2577355339670081059L ^ var5_4));
                                                        v77[4] = var29_18;
                                                        v77[3] = var74_69;
                                                        v77[2] = var70_51;
                                                        v77[1] = var71_53;
                                                        v77[0] = var2_2;
                                                        x44.a("k", (Object)this, (Object)v77, (long)-2132590920407128315L, (long)var5_4);
                                                        v66 = var58_66.put(var70_51, var74_69);
                                                    }
                                                    catch (IOException v78) {
                                                        throw x44.a("u", (Object)v78, (long)-266365468764339253L, (long)var5_4);
                                                    }
                                                }
                                                try {
                                                    v75 /* !! */  = var56_36;
                                                    if (var5_4 < 0L) break block160;
                                                    if (v75 /* !! */  == false) break block154;
lbl519:
                                                    // 2 sources

                                                    v69 = var75_56;
                                                }
                                                catch (IOException v79) {
                                                    throw x44.a("u", (Object)v79, (long)-266365468764339253L, (long)var5_4);
                                                }
                                            }
                                            try {
                                                if (var5_4 <= 0L) break block161;
                                                v70 = var56_36;
lbl527:
                                                // 2 sources

                                                if (v70 != false) break block161;
                                                if (v69 != null) {
                                                }
                                                ** GOTO lbl541
                                            }
                                            catch (IOException v80) {
                                                throw x44.a("u", (Object)v80, (long)-266365468764339253L, (long)var5_4);
                                            }
                                            v69 = var75_56;
                                        }
                                        try {
                                            block162: {
                                                try {
                                                    block171: {
                                                        v75 /* !! */  = (CallSite)v69.S(var48_29);
                                                        if (var5_4 > 0L) {
                                                            if (v75 /* !! */  == false) break block162;
                                                        }
                                                        break block171;
lbl541:
                                                        // 2 sources

                                                        v81 = new Object[6];
                                                        v81[5] = hz.a("z", (int)27563, (long)(1256034260841841614L ^ var5_4));
                                                        v81[4] = var29_18;
                                                        v81[3] = var71_53;
                                                        v81[2] = var70_51;
                                                        v81[1] = var74_69;
                                                        v81[0] = var2_2;
                                                        x44.a("k", (Object)this, (Object)v81, (long)-2132590920407128315L, (long)var5_4);
                                                        v75 /* !! */  = var56_36;
                                                    }
                                                    if (var5_4 < 0L) break block160;
                                                    if (v75 /* !! */  == false) break block154;
                                                }
                                                catch (IOException v82) {
                                                    throw x44.a("u", (Object)v82, (long)-266365468764339253L, (long)var5_4);
                                                }
                                            }
                                            v83 = new Object[6];
                                            v83[5] = hz.a("z", (int)28425, (long)(8755271514419349352L ^ var5_4));
                                            v83[4] = var29_18;
                                            v83[3] = var71_53;
                                            v83[2] = var70_51;
                                            v83[1] = var74_69;
                                            v83[0] = var2_2;
                                            x44.a("k", (Object)this, (Object)v83, (long)-2132590920407128315L, (long)var5_4);
                                        }
                                        catch (IOException v84) {
                                            throw x44.a("u", (Object)v84, (long)-266365468764339253L, (long)var5_4);
                                        }
                                    }
                                    v75 /* !! */  = var56_36;
                                }
                                if (v75 /* !! */  != false) break block100;
                                continue block100;
                            }
                            break;
                        }
                        ++var66_40;
                        v52 /* !! */  = (int)var56_36;
                        if (var5_4 < 0L) continue block98;
                        if (v52 /* !! */  == 0) continue block97;
                        v85 = new Object[2];
                        v85[1] = var19_13;
                        v85[0] = var58_66;
                        var59_67 = x44.a("u", (Object)v85, (long)-2274369870931341596L, (long)var5_4);
                        v53 /* !! */  = this.n(var27_17);
                    } while (var5_4 <= 0L);
                }
                break;
            }
            var66_41 /* !! */  = v53 /* !! */ ;
            var67_46 = 0;
            block102: while (var67_46 < this.R) {
                try {
                    v86 = new Object[5];
                    v86[4] = this;
                    v86[3] = yn.B(var50_30, var57_33);
                    v86[2] = var25_16;
                    v86[1] = var59_67;
                    v86[0] = var2_2;
                    x44.a("m", var66_41 /* !! */ [var67_46], (Object)v86, (long)-252255038831252409L, (long)var5_4);
                    ++var67_46;
                    do {
                        v87 = var56_36;
                        if (var5_4 > 0L) {
                            if (v87 != false) break block163;
                            v87 = var56_36;
                        }
                        if (v87 == false) continue block102;
                    } while (var5_4 <= 0L);
                    break;
                }
                catch (IOException v88) {
                    throw x44.a("u", (Object)v88, (long)-266365468764339253L, (long)var5_4);
                }
            }
            v89 = new Object[3];
            v89[2] = var58_66;
            v89[1] = var57_33;
            v89[0] = var21_14;
            x44.a("m", (Object)var2_2, (Object)v89, (long)-2276547728479213370L, (long)var5_4);
            v90 = new Object[3];
            v90[2] = var59_67;
            v90[1] = var41_24;
            v90[0] = var57_33;
            x44.a("m", (Object)var2_2, (Object)v90, (long)-2074920511190493336L, (long)var5_4);
        }
        return var59_67;
    }

    /*
     * Exception decompiling
     */
    public final void v(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [13[DOLOOP]], but top level block is 4[TRYBLOCK]
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public boolean G(Object[] objectArray) {
        boolean bl;
        long l = (Long)objectArray[0];
        l = ab ^ l;
        try {
            bl = x44.a("o", (Object)this, (long)-642622665755057019L, (long)l) != null;
        }
        catch (gj gj2) {
            throw x44.a("s", (Object)gj2, (long)-1232863519256669851L, (long)l);
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    public final iu[] V(Object[] var1_1) {
        block23: {
            block25: {
                block24: {
                    block19: {
                        var3_2 = (Long)var1_1[0];
                        var2_3 = (_fr)var1_1[1];
                        v0 = var3_2 = hz.ab ^ var3_2;
                        var5_4 = v0 ^ 28203903679598L;
                        var7_5 = v0 ^ 102022176989859L;
                        var9_6 = v0 ^ 101848924975783L;
                        var12_7 = this.n(var7_5);
                        var13_8 = new ArrayList<iu>();
                        var11_9 = x44.a("p", (long)-1098405478161530709L, (long)var3_2);
                        var14_10 = 0;
                        while (var14_10 < var12_7.length) {
                            block21: {
                                block22: {
                                    block20: {
                                        try {
                                            try {
                                                try {
                                                    v1 = (int)var12_7[var14_10].t(var9_6).equals(var2_3.v());
                                                    v2 = var11_9;
                                                    if (var3_2 <= 0L) ** GOTO lbl64
                                                    if (v2 == false) break block19;
                                                    v3 = var11_9;
                                                    if (var3_2 > 0L) {
                                                        if (v3 == false) break block20;
                                                    }
                                                    ** GOTO lbl44
                                                }
                                                catch (gj v4) {
                                                    throw x44.a("p", (Object)v4, (long)-706809946201978442L, (long)var3_2);
                                                }
                                                if (var3_2 <= 0L) break block21;
                                                if (v1 == 0) break block22;
                                            }
                                            catch (gj v5) {
                                                throw x44.a("p", (Object)v5, (long)-706809946201978442L, (long)var3_2);
                                            }
                                            v6 = new Object[1];
                                            v6[0] = var5_4;
                                            v7 = x44.a("h", (Object)var12_7[var14_10], (Object)v6, (long)-1726024292911552346L, (long)var3_2).equals(x44.a("h", (Object)var2_3, (Object)new Object[0], (long)-908902140140533631L, (long)var3_2));
                                        }
                                        catch (gj v8) {
                                            throw x44.a("p", (Object)v8, (long)-706809946201978442L, (long)var3_2);
                                        }
                                    }
                                    try {
                                        try {
                                            v3 = var11_9;
lbl44:
                                            // 2 sources

                                            if (v3 == false || !v7) break block22;
                                        }
                                        catch (gj v9) {
                                            throw x44.a("p", (Object)v9, (long)-706809946201978442L, (long)var3_2);
                                        }
                                        v7 = var13_8.add(var12_7[var14_10]);
                                    }
                                    catch (gj v10) {
                                        throw x44.a("p", (Object)v10, (long)-706809946201978442L, (long)var3_2);
                                    }
                                }
                                ++var14_10;
                                v11 = var11_9;
                            }
                            if (v11 != false) continue;
                        }
                        v12 = var13_8;
                        if (var3_2 < 0L) break block25;
                        v1 = v12.size();
                    }
                    try {
                        try {
                            v2 = var11_9;
lbl64:
                            // 2 sources

                            if (v2 == false) break block23;
                            if (v1 != 0) break block24;
                        }
                        catch (gj v13) {
                            throw x44.a("p", (Object)v13, (long)-706809946201978442L, (long)var3_2);
                        }
                        return null;
                    }
                    catch (gj v14) {
                        throw x44.a("p", (Object)v14, (long)-706809946201978442L, (long)var3_2);
                    }
                }
                v12 = var13_8;
            }
            v1 = v12.size();
        }
        var14_11 = new iu[v1];
        return var13_8.toArray(var14_11);
    }

    @Override
    public final boolean I(Object[] objectArray) {
        return false;
    }

    public final void o(Object[] objectArray) {
        yn yn2 = (yn)objectArray[0];
        _yz _yz2 = (_yz)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l = ab ^ l;
        long l3 = l2 ^ 0x7E41DECFF869L;
        long l4 = l2 ^ 0x5296920341BL;
        long l5 = l2 ^ 0x286515459F9AL;
        iu[] iuArray = this.n(l4);
        int n = 0;
        CallSite callSite = x44.a("p", (long)-4967862242407510198L, (long)l);
        while (n < this.R) {
            CallSite callSite2;
            block5: {
                block6: {
                    block7: {
                        iu iu2 = iuArray[n];
                        try {
                            try {
                                callSite2 = callSite;
                                if (l <= 0L) break block5;
                                if (callSite2 != false) break block6;
                                if (iu2.V(l3)) break block7;
                            }
                            catch (gj gj2) {
                                throw x44.a("p", (Object)gj2, (long)-6879052744543084786L, (long)l);
                            }
                            Object[] objectArray2 = new Object[4];
                            objectArray2[3] = l5;
                            objectArray2[2] = iu2;
                            objectArray2[1] = this;
                            objectArray2[0] = yn2;
                            x44.a("h", (Object)_yz2, (Object)objectArray2, (long)-4933386945469054524L, (long)l);
                        }
                        catch (gj gj3) {
                            throw x44.a("p", (Object)gj3, (long)-6879052744543084786L, (long)l);
                        }
                    }
                    ++n;
                }
                callSite2 = callSite;
            }
            if (callSite2 == false) continue;
        }
    }

    public boolean U(short s, char c, int n) {
        boolean bl;
        long l = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n << 32 >>> 32) ^ ab;
        try {
            bl = this.t != null;
        }
        catch (gj gj2) {
            throw x44.a("s", (Object)gj2, (long)8616484549125507093L, (long)l);
        }
        return bl;
    }

    public void j(Object[] objectArray) {
        block11: {
            List list;
            long l;
            block10: {
                List list2;
                CallSite callSite;
                hz hz4;
                block8: {
                    Integer n;
                    block9: {
                        l = (Long)objectArray[0];
                        hz4 = (hz)objectArray[1];
                        n = (Integer)objectArray[2];
                        l = ab ^ l;
                        callSite = x44.a("p", (long)6379842219516127459L, (long)l);
                        try {
                            try {
                                list2 = this.s;
                                if (callSite == false) break block8;
                                if (list2 != null) break block9;
                            }
                            catch (gj gj2) {
                                throw x44.a("p", (Object)gj2, (long)6807338870056788478L, (long)l);
                            }
                            this.s = new ArrayList();
                        }
                        catch (gj gj3) {
                            throw x44.a("p", (Object)gj3, (long)6807338870056788478L, (long)l);
                        }
                    }
                    hz4.t = this;
                    x44.a("h", (Object)hz4, (Object)new Object[]{n}, (long)4953908615784582088L, (long)l);
                    list2 = this.s;
                }
                boolean bl = list2.add(hz4);
                try {
                    try {
                        list = this.s;
                        if (callSite == false) break block10;
                        if (list.size() <= 1) break block11;
                    }
                    catch (gj gj4) {
                        throw x44.a("p", (Object)gj4, (long)6807338870056788478L, (long)l);
                    }
                    list = this.s;
                }
                catch (gj gj5) {
                    throw x44.a("p", (Object)gj5, (long)6807338870056788478L, (long)l);
                }
            }
            x44.a("p", (Object)list, (hz2, hz3) -> hz2.X - hz3.X, (long)6352061767889249783L, (long)l);
        }
    }

    public boolean e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = ab ^ l) ^ 0x1B130D33C5ADL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this.D;
        return (boolean)x44.a("v", (Object)objectArray2, (long)616901075353053402L, (long)l);
    }

    public static String[] H() {
        return v;
    }

    /*
     * Unable to fully structure code
     */
    public final void r(Object[] var1_1) {
        var3_2 = (yn)var1_1[0];
        var2_3 = (an)var1_1[1];
        var4_4 = (Long)var1_1[2];
        v0 = var4_4 = hz.ab ^ var4_4;
        var6_5 = v0 ^ 24900180628059L;
        var8_6 = v0 ^ 121494282667320L;
        var11_7 = this.n(var8_6);
        var10_8 = x44.a("s", (long)733507066761985641L, (long)var4_4);
        var12_9 = 0;
        while (var12_9 < this.R) {
            v1 = new Object[4];
            v1[3] = var11_7[var12_9];
            v1[2] = this;
            v1[1] = var3_2;
            v1[0] = var6_5;
            x44.a("k", (Object)var2_3, (Object)v1, (long)1476859689742668152L, (long)var4_4);
            ++var12_9;
lbl21:
            // 2 sources

            ** while (var10_8 != false)
lbl22:
            // 1 sources

        }
lbl23:
        // 2 sources

        if (var4_4 < 0L) ** GOTO lbl21
    }

    public final String w(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = ab ^ l;
        return (char)hz.c("n", (int)23294, (long)(0x44C0A92FD2482A7EL ^ l)) + this.x + (char)hz.c("n", (int)16163, (long)(0x24613026BAB74FA6L ^ l));
    }

    public void s(Object[] objectArray) {
        boolean bl;
        hz hz2;
        long l;
        boolean bl2;
        block2: {
            block3: {
                bl2 = (Boolean)objectArray[0];
                l = (Long)objectArray[1];
                l = ab ^ l;
                CallSite callSite = x44.a("u", (long)2079783843971607734L, (long)l);
                try {
                    hz2 = this;
                    bl = bl2;
                    if (callSite == false) break block2;
                    if (bl) break block3;
                }
                catch (gj gj2) {
                    throw x44.a("u", (Object)gj2, (long)1886346835073426859L, (long)l);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        x44.a("v", (Object)hz2, (boolean)bl, (long)2267264545594656998L, (long)l);
        x44.a("v", (Object)this, (boolean)bl2, (long)455610005466377859L, (long)l);
    }

    public boolean V(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = ab ^ l;
        return (boolean)x44.a("j", (Object)this, (long)4739929699181382006L, (long)l);
    }

    public final String H(long l) {
        l = ab ^ l;
        int n = this.x.lastIndexOf("/");
        try {
            if (n > 0) {
                return this.x.substring(n + 1);
            }
        }
        catch (gj gj2) {
            throw x44.a("u", (Object)gj2, (long)-2759102929739635149L, (long)l);
        }
        return this.x;
    }

    /*
     * Exception decompiling
     */
    public iz I(Object[] var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public Set k(Object[] var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public hz d(long l) {
        return this;
    }

    public String O(int n, int n2, char c) {
        block5: {
            x9 x92;
            long l;
            block4: {
                long l2 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ ab;
                l = l2 ^ 0x4F24A5C587CAL;
                CallSite callSite = x44.a("s", (long)1182906123614953472L, (long)l2);
                try {
                    try {
                        x92 = this.O;
                        if (callSite == false) break block4;
                        if (x92 == null) break block5;
                    }
                    catch (gj gj2) {
                        throw x44.a("s", (Object)gj2, (long)1629107667975399709L, (long)l2);
                    }
                    x92 = this.O;
                }
                catch (gj gj3) {
                    throw x44.a("s", (Object)gj3, (long)1629107667975399709L, (long)l2);
                }
            }
            return x92.W(l);
        }
        return null;
    }

    public boolean m(Object[] objectArray) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                CallSite callSite2;
                long l;
                long l2;
                block6: {
                    l2 = (Long)objectArray[0];
                    l = (l2 = ab ^ l2) ^ 0x2FD9C60AE4E8L;
                    callSite2 = x44.a("r", (long)-8481421144388552159L, (long)l2);
                    try {
                        try {
                            callSite = x44.a("n", (Object)this, (long)-7688285264440768804L, (long)l2);
                            if (callSite2 == false) break block6;
                            if (callSite == null) break block7;
                        }
                        catch (gj gj2) {
                            throw x44.a("r", (Object)gj2, (long)-8306125940178128068L, (long)l2);
                        }
                        callSite = x44.a("n", (Object)this, (long)-7688285264440768804L, (long)l2);
                    }
                    catch (gj gj3) {
                        throw x44.a("r", (Object)gj3, (long)-8306125940178128068L, (long)l2);
                    }
                }
                try {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l;
                    object = x44.a("j", (Object)callSite, (Object)objectArray2, (long)-8028719323456454401L, (long)l2);
                    if (callSite2 == false) break block8;
                    if (!object) break block7;
                }
                catch (gj gj4) {
                    throw x44.a("r", (Object)gj4, (long)-8306125940178128068L, (long)l2);
                }
                object = 1;
                break block8;
            }
            object = false;
        }
        return object;
    }

    public int a(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l;
            long l2;
            block4: {
                int n = (Integer)objectArray[0];
                long l3 = (Long)objectArray[1];
                l2 = ((long)n << 56 | l3 << 8 >>> 8) ^ ab;
                l = l2 ^ 0x610BF568A769L;
                CallSite callSite2 = x44.a("s", (long)-7824203061203590400L, (long)l2);
                try {
                    try {
                        callSite = x44.a("o", (Object)this, (long)-8328121169232830467L, (long)l2);
                        if (callSite2 == false) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (gj gj2) {
                        throw x44.a("s", (Object)gj2, (long)-7666359299239417315L, (long)l2);
                    }
                    callSite = x44.a("o", (Object)this, (long)-8328121169232830467L, (long)l2);
                }
                catch (gj gj3) {
                    throw x44.a("s", (Object)gj3, (long)-7666359299239417315L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l;
            return (int)x44.a("k", (Object)callSite, (Object)objectArray2, (long)-7939730818180186824L, (long)l2);
        }
        return -1;
    }

    public boolean B(long l) {
        int n;
        block8: {
            block7: {
                List list;
                CallSite callSite;
                block6: {
                    l = ab ^ l;
                    callSite = x44.a("r", (long)9057788594357489113L, (long)l);
                    try {
                        try {
                            list = this.s;
                            if (callSite == false) break block6;
                            if (list == null) break block7;
                        }
                        catch (gj gj2) {
                            throw x44.a("r", (Object)gj2, (long)8881939232126305476L, (long)l);
                        }
                        list = this.s;
                    }
                    catch (gj gj3) {
                        throw x44.a("r", (Object)gj3, (long)8881939232126305476L, (long)l);
                    }
                }
                try {
                    n = list.size();
                    if (callSite == false) break block8;
                    if (n <= 0) break block7;
                }
                catch (gj gj4) {
                    throw x44.a("r", (Object)gj4, (long)8881939232126305476L, (long)l);
                }
                n = 1;
                break block8;
            }
            n = 0;
        }
        return n != 0;
    }

    public static String A(Object[] objectArray) {
        String string;
        block4: {
            String string2;
            block3: {
                String string3;
                block2: {
                    string3 = (String)objectArray[0];
                    long l = (Long)objectArray[1];
                    l = ab ^ l;
                    int n = string3.lastIndexOf("/");
                    CallSite callSite = x44.a("u", (long)6639704138892405838L, (long)l);
                    if (n <= -1) break block2;
                    string2 = string3.substring(n + 1);
                    if (l <= 0L) break block3;
                    string = string2;
                    if (callSite != false) break block4;
                }
                string2 = string3;
            }
            string = string2;
        }
        return string;
    }

    public abstract iz[] u(Object[] var1);

    public final boolean r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = ab ^ l) ^ 0x14E338F32824L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return (boolean)x44.a("j", (Object)this.m, (Object)objectArray2, (long)6351106815373838623L, (long)l);
    }

    /*
     * WARNING - void declaration
     */
    void A(Object[] objectArray) {
        block8: {
            void var7_6;
            CallSite callSite;
            long l;
            long l2;
            block7: {
                CallSite callSite2;
                Object object;
                l2 = (Long)objectArray[0];
                l = (l2 = ab ^ l2) ^ 0x1D6993B4DD9DL;
                callSite = x44.a("t", (long)-5211330384608720953L, (long)l2);
                try {
                    object = x44.a("h", (Object)this, (long)-5474209098063584361L, (long)l2);
                    if (callSite == false) break block7;
                    if (object == false) break block8;
                }
                catch (gj gj2) {
                    throw x44.a("t", (Object)gj2, (long)-5666402784223736102L, (long)l2);
                }
                object = callSite2 = (Object)false;
            }
            while (var7_6 < this.W) {
                Object object;
                block10: {
                    block11: {
                        h4 h42;
                        block9: {
                            try {
                                try {
                                    h42 = this.N[var7_6];
                                    if (callSite == false) break block9;
                                    object = h42 instanceof he;
                                    if (l2 <= 0L) break block10;
                                    if (!object) break block11;
                                }
                                catch (gj gj3) {
                                    throw x44.a("t", (Object)gj3, (long)-5666402784223736102L, (long)l2);
                                }
                                h42 = this.N[var7_6];
                            }
                            catch (gj gj4) {
                                throw x44.a("t", (Object)gj4, (long)-5666402784223736102L, (long)l2);
                            }
                        }
                        he he2 = (he)h42;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l;
                        x44.a("l", (Object)he2, (Object)objectArray2, (long)-6156135088761960035L, (long)l2);
                    }
                    ++var7_6;
                    object = callSite;
                }
                if (object) continue;
            }
        }
    }

    @Override
    public String c(long l) {
        long l2 = l;
        long l3 = l2 ^ 0x33ACFA889060L;
        long l4 = l2 ^ 0x4AB5F7EF1993L;
        String string = this.k(l3);
        return hz.p(string, (char)hz.c("n", (int)20406, (long)(0x478B2561C9BD9870L ^ l)), l4);
    }

    public final String C(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = ab ^ l;
        int n = this.a.lastIndexOf("/");
        try {
            if (n > 0) {
                return this.a.substring(n + 1);
            }
        }
        catch (gj gj2) {
            throw x44.a("p", (Object)gj2, (long)-9070099947970003546L, (long)l);
        }
        return this.a;
    }

    public final String V(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = ab ^ l) ^ 0x2E0A10AC96B9L;
        return this.m.E(l2);
    }

    /*
     * Exception decompiling
     */
    public void k(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[DOLOOP]], but top level block is 1[TRYBLOCK]
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final Enumeration m(Object[] objectArray) {
        CallSite callSite;
        block4: {
            CallSite callSite2;
            block5: {
                long l = (Long)objectArray[0];
                long l2 = (l = ab ^ l) ^ 0x45141D5D97EDL;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l2;
                callSite2 = x44.a("n", (Object)this, (Object)objectArray2, (long)440619826139793241L, (long)l);
                CallSite callSite3 = x44.a("v", (long)1851148225085517300L, (long)l);
                try {
                    try {
                        callSite = callSite2;
                        if (callSite3 != false) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (gj gj2) {
                        throw x44.a("v", (Object)gj2, (long)159512637120314800L, (long)l);
                    }
                    return new ri();
                }
                catch (gj gj3) {
                    throw x44.a("v", (Object)gj3, (long)159512637120314800L, (long)l);
                }
            }
            callSite = callSite2;
        }
        return Collections.enumeration(callSite);
    }

    public int f(Object[] objectArray) {
        return this.R;
    }

    public boolean S(long l) {
        boolean bl;
        block2: {
            block3: {
                l = ab ^ l;
                CallSite callSite = x44.a("p", (long)5291386373530352938L, (long)l);
                try {
                    bl = this.a.equals(this.x);
                    if (callSite != false) break block2;
                    if (bl) break block3;
                }
                catch (gj gj2) {
                    throw x44.a("p", (Object)gj2, (long)5974286290671283566L, (long)l);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Exception decompiling
     */
    public void X(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[DOLOOP]], but top level block is 1[TRYBLOCK]
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     */
    private void G(Object[] var1_1) {
        block35: {
            block34: {
                block32: {
                    block33: {
                        var2_2 = (_ye)var1_1[0];
                        var6_3 = (hz)var1_1[1];
                        var5_4 = (_fz)var1_1[2];
                        var4_5 = (hz)var1_1[3];
                        var7_6 = (Long)var1_1[4];
                        var3_7 = (String)var1_1[5];
                        v0 = var7_6 = hz.ab ^ var7_6;
                        var9_8 = v0 ^ 21228585472887L;
                        var11_9 = v0 ^ 59173321088421L;
                        var13_10 = v0 ^ 43403049757788L;
                        var15_11 = v0 ^ 140363099739337L;
                        var17_12 = v0 ^ 122118516064645L;
                        var19_13 = v0 ^ 74522158967604L;
                        var21_14 = v0 ^ 137062976467511L;
                        var23_15 = x44.a("r", (long)5556288981437283697L, (long)var7_6);
                        try {
                            try {
                                v1 = var6_3;
                                if (var23_15 == false) break block32;
                                if (v1 != var4_5) break block33;
                            }
                            catch (gj v2) {
                                throw x44.a("r", (Object)v2, (long)5470362212986106988L, (long)var7_6);
                            }
                            return;
                        }
                        catch (gj v3) {
                            throw x44.a("r", (Object)v3, (long)5470362212986106988L, (long)var7_6);
                        }
                    }
                    v1 = var6_3;
                }
                var24_16 = v1.k(var9_8);
                v4 = new Object[4];
                v4[3] = var11_9;
                v4[2] = var4_5;
                v4[1] = var5_4;
                v4[0] = var24_16;
                x44.a("j", (Object)var2_2, (Object)v4, (long)6050968337126872417L, (long)var7_6);
                v5 = new Object[4];
                v5[3] = var4_5;
                v5[2] = var5_4;
                v5[1] = var24_16;
                v5[0] = var19_13;
                var25_17 = x44.a("j", (Object)var2_2, (Object)v5, (long)5537751086642862333L, (long)var7_6);
                try {
                    try {
                        try {
                            v6 = yn.B(var21_14, var4_5.k(var9_8));
                            if (var23_15 == false) break block34;
                            if (v6) break block35;
                        }
                        catch (gj v7) {
                            throw x44.a("r", (Object)v7, (long)5470362212986106988L, (long)var7_6);
                        }
                        v8 = var4_5;
                        if (var7_6 > 0L && var23_15 != false) {
                        }
                        ** GOTO lbl72
                    }
                    catch (gj v9) {
                        throw x44.a("r", (Object)v9, (long)5470362212986106988L, (long)var7_6);
                    }
                    v6 = v8.d(var13_10);
                }
                catch (gj v10) {
                    throw x44.a("r", (Object)v10, (long)5470362212986106988L, (long)var7_6);
                }
            }
            if (!v6) break block35;
            do {
                block42: {
                    block44: {
                        block43: {
                            block41: {
                                block40: {
                                    block39: {
                                        block38: {
                                            block37: {
                                                block36: {
                                                    v8 = var25_17;
lbl72:
                                                    // 2 sources

                                                    try {
                                                        try {
                                                            try {
                                                                if (var7_6 < 0L) ** GOTO lbl79
                                                                if (v8 == null) break;
lbl77:
                                                                // 2 sources

                                                                while (true) {
                                                                    v8 = var25_17;
lbl79:
                                                                    // 2 sources

                                                                    if (var7_6 < 0L || var23_15 == false) break block36;
                                                                    break;
                                                                }
                                                            }
                                                            catch (gj v11) {
                                                                throw x44.a("r", (Object)v11, (long)5470362212986106988L, (long)var7_6);
                                                            }
                                                            if (v8 == var4_5) break;
                                                        }
                                                        catch (gj v12) {
                                                            throw x44.a("r", (Object)v12, (long)5470362212986106988L, (long)var7_6);
                                                        }
                                                        v8 = var25_17;
                                                    }
                                                    catch (gj v13) {
                                                        throw x44.a("r", (Object)v13, (long)5470362212986106988L, (long)var7_6);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            v14 = yn.B(var21_14, v8.k(var9_8));
                                                            if (var23_15 == false) break block37;
                                                            if (v14) break;
                                                        }
                                                        catch (gj v15) {
                                                            throw x44.a("r", (Object)v15, (long)5470362212986106988L, (long)var7_6);
                                                        }
                                                        v16 = var25_17;
                                                        if (var23_15 == false) break block38;
                                                    }
                                                    catch (gj v17) {
                                                        throw x44.a("r", (Object)v17, (long)5470362212986106988L, (long)var7_6);
                                                    }
                                                    v14 = v16.d(var13_10);
                                                }
                                                catch (gj v18) {
                                                    throw x44.a("r", (Object)v18, (long)5470362212986106988L, (long)var7_6);
                                                }
                                            }
                                            if (!v14) break;
                                            v16 = var25_17;
                                        }
                                        var26_18 = v16.k(var9_8);
                                        v19 = new Object[4];
                                        v19[3] = var11_9;
                                        v19[2] = var4_5;
                                        v19[1] = var5_4;
                                        v19[0] = var26_18;
                                        x44.a("j", (Object)var2_2, (Object)v19, (long)6050968337126872417L, (long)var7_6);
                                        var27_19 = var25_17;
                                        v20 = new Object[4];
                                        v20[3] = var4_5;
                                        v20[2] = var5_4;
                                        v20[1] = var26_18;
                                        v20[0] = var19_13;
                                        var25_17 = x44.a("j", (Object)var2_2, (Object)v20, (long)5537751086642862333L, (long)var7_6);
                                        try {
                                            v21 = var25_17;
                                            if (var7_6 <= 0L || var23_15 == false) break block39;
                                            if (v21 != null) {
                                            }
                                            ** GOTO lbl144
                                        }
                                        catch (gj v22) {
                                            throw x44.a("r", (Object)v22, (long)5470362212986106988L, (long)var7_6);
                                        }
                                        v21 = var25_17;
                                    }
                                    try {
                                        if (v21 == var27_19) break block40;
lbl144:
                                        // 2 sources

                                        v23 = true;
                                        break block41;
                                    }
                                    catch (gj v24) {
                                        throw x44.a("r", (Object)v24, (long)5470362212986106988L, (long)var7_6);
                                    }
                                }
                                v23 = false;
                            }
                            try {
                                v25 = new String[1];
                                v26 = v25;
                                v27 = v25;
                                v28 = 0;
                                v29 = new Object[1];
                                v29[0] = var15_11;
                                v30 = new StringBuilder().append((String)hz.a("z", (int)25468, (long)(441944706342288572L ^ var7_6))).append((String)x44.a("j", (Object)var6_3, (Object)v29, (long)5751080758747224933L, (long)var7_6));
                                v31 = " ";
                                if (var7_6 <= 0L) break block42;
                                v30 = v30.append((String)v31);
                                v32 = var25_17;
                                if (var23_15 == false) break block43;
                                if (v32 == null) break block44;
                            }
                            catch (gj v33) {
                                throw x44.a("r", (Object)v33, (long)5470362212986106988L, (long)var7_6);
                            }
                            v32 = var25_17;
                        }
                        v34 = new Object[1];
                        v34[0] = var15_11;
                        v31 = x44.a("j", (Object)v32, (Object)v34, (long)5751080758747224933L, (long)var7_6);
                        break block42;
                    }
                    v31 = hz.a("z", (int)14763, (long)(5597066955406354042L ^ var7_6));
                }
                v26[v28] = v30.append((String)v31).toString();
                lt.p(var17_12, v23, v27);
            } while (var23_15 != false);
        }
        ** while (var7_6 <= 0L)
lbl185:
        // 1 sources

    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List g(Object[] objectArray) {
        ArrayList<iu> arrayList;
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l2 = l = ab ^ l;
        long l3 = l2 ^ 0x6E1B812DE151L;
        long l4 = l2 ^ 0x6E73EE4DF155L;
        ArrayList<iu> arrayList2 = new ArrayList<iu>();
        iu[] iuArray = this.n(l3);
        CallSite callSite = x44.a("r", (long)7945740274518743552L, (long)l);
        block4: for (int i = 0; i < iuArray.length; ++i) {
            boolean bl;
            try {
                try {
                    bl = iuArray[i].t(l4).equals(string);
                    if (callSite != false || !bl) continue;
                }
                catch (gj gj2) {
                    throw x44.a("r", (Object)gj2, (long)8485585214043097668L, (long)l);
                }
                arrayList = arrayList2;
            }
            catch (gj gj3) {
                throw x44.a("r", (Object)gj3, (long)8485585214043097668L, (long)l);
            }
            do {
                bl = arrayList.add(iuArray[i]);
                if (callSite == false) continue block4;
                arrayList = arrayList2;
            } while (l < 0L);
        }
        return arrayList;
    }

    public String s(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        long l2 = (l = ab ^ l) ^ 0x4895EC84ED2CL;
        return ((x9)((Object)x44.a("i", (Object)this, (long)7288233522668874362L, (long)l)[n])).W(l2);
    }

    public final int X(long l, hz hz2) {
        long l2 = (l = ab ^ l) ^ 0xEB42D44ED83L;
        return this.k(l2).compareTo(hz2.k(l2));
    }

    public void D(Object[] objectArray) {
        Integer n = (Integer)objectArray[0];
        this.X = n;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String f(Object[] var0) {
        block11: {
            block14: {
                block13: {
                    block10: {
                        var1_1 = (Long)var0[0];
                        var3_2 = (String)var0[1];
                        var1_1 = hz.ab ^ var1_1;
                        var6_3 = var3_2.lastIndexOf("$");
                        var4_4 = x44.a("r", (long)3133612457430425400L, (long)var1_1);
                        try {
                            v0 /* !! */  = var6_3;
                            v1 = var3_2.length() - 1;
                            if (var4_4 != false) break block10;
                            if (v0 /* !! */  == v1) {
                            }
                            ** GOTO lbl22
                        }
                        catch (gj v2) {
                            throw x44.a("r", (Object)v2, (long)3529407621223010172L, (long)var1_1);
                        }
                        var5_5 = var3_2;
                        try {
                            block12: {
                                v0 /* !! */  = (int)var4_4;
                                if (var1_1 > 0L) {
                                    if (v0 /* !! */  == 0) break block11;
                                }
                                break block12;
lbl22:
                                // 2 sources

                                v0 /* !! */  = var6_3;
                            }
                            v1 = -1;
                        }
                        catch (gj v3) {
                            throw x44.a("r", (Object)v3, (long)3529407621223010172L, (long)var1_1);
                        }
                    }
                    if (v0 /* !! */  <= v1) break block13;
                    v4 = var3_2.substring(var6_3 + 1);
                    if (var1_1 < 0L) break block14;
                    var5_5 = v4;
                    if (var4_4 == false) break block11;
                }
                v4 = var3_2;
            }
            var5_5 = v4;
        }
        return var5_5;
    }

    public final boolean Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = ab ^ l) ^ 0x4E66869C0787L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return (boolean)x44.a("m", (Object)this.m, (Object)objectArray2, (long)1708650205524552342L, (long)l);
    }

    /*
     * Exception decompiling
     */
    public String Y(Object[] var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static void v(String[] stringArray) {
        v = stringArray;
    }

    /*
     * Exception decompiling
     */
    public String v(Object[] var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String[] d(Object[] var1_1) {
        block12: {
            block11: {
                var2_2 = (Long)var1_1[0];
                var4_3 = (var2_2 = hz.ab ^ var2_2) ^ 84418654274719L;
                var6_4 = x44.a("v", (long)1386973693310608213L, (long)var2_2);
                try {
                    v0 = x44.a("j", (Object)this, (long)906918512430662601L, (long)var2_2);
                    if (var6_4 == false) break block11;
                    if (v0 == null) {
                    }
                    ** GOTO lbl17
                }
                catch (gj v1) {
                    throw x44.a("v", (Object)v1, (long)1571407902750206536L, (long)var2_2);
                }
                var7_5 = new String[]{};
                try {
                    if (var6_4 != false) break block12;
lbl17:
                    // 2 sources

                    v0 = x44.a("j", (Object)this, (long)906918512430662601L, (long)var2_2);
                }
                catch (gj v2) {
                    throw x44.a("v", (Object)v2, (long)1571407902750206536L, (long)var2_2);
                }
            }
            var7_5 = new String[((CallSite)v0).length];
            block6: for (var8_6 = 0; var8_6 < ((CallSite)x44.a("j", (Object)this, (long)906918512430662601L, (long)var2_2)).length; ++var8_6) {
                try {
                    do {
                        v3 = var7_5;
                        v4 /* !! */  = var6_4;
                        if (var2_2 > 0L) {
                            if (v4 /* !! */  == false) return v3;
                            v4 /* !! */  = (CallSite)var8_6;
                        }
                        v3[v4 /* !! */ ] = x44.a("j", (Object)this, (long)906918512430662601L, (long)var2_2)[var8_6].W(var4_3);
                        if (var6_4 != false) continue block6;
                    } while (var2_2 <= 0L);
                    break;
                }
                catch (gj v5) {
                    throw x44.a("v", (Object)v5, (long)1571407902750206536L, (long)var2_2);
                }
            }
        }
        v3 = var7_5;
        return v3;
    }

    @Override
    public String o(long l) {
        String string;
        block2: {
            String string2;
            block3: {
                long l2 = l;
                long l3 = l2 ^ 0x141A041968F6L;
                long l4 = l2 ^ 0x27916B55F8F7L;
                string2 = ((_rv)this.i.get(0)).C(l3);
                String string3 = lr.X(l4, string2);
                CallSite callSite = x44.a("t", (long)-2288517232276549545L, (long)l);
                try {
                    string = string2;
                    if (callSite == false) break block2;
                    if (string.equals(string3)) break block3;
                }
                catch (gj gj2) {
                    throw x44.a("t", (Object)gj2, (long)-1815852648697030326L, (long)l);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append((String)((Object)hz.a("z", (int)2890, (long)(0x3EC9E93D85C4B9A6L ^ l))));
                stringBuilder.append(string2);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
            string = string2;
        }
        return string;
    }

    public abstract void n(Object[] var1);

    public boolean w(long l) {
        long l2 = (l = ab ^ l) ^ 0x6A884AAE5088L;
        return (boolean)x44.a("w", (long)l2, (int)this.D, (long)6628870944687508801L, (long)l);
    }

    public static String i(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        int n = (Integer)objectArray[2];
        long l2 = l = ab ^ l;
        long l3 = l2 ^ 0xBFE3B429D16L;
        long l4 = l2 ^ 0x5513F7337866L;
        Object object = hz.D(l3, string);
        CallSite callSite = x44.a("r", (long)1025601085023141457L, (long)l);
        String string2 = "L" + (String)object + ";";
        if (callSite != false) {
            object = string2;
            if (n > 0) {
                Object[] objectArray2 = new Object[5];
                objectArray2[4] = (int)hz.c("n", (int)352, (long)(0x4A5EB5A67F4E568DL ^ l));
                objectArray2[3] = l4;
                objectArray2[2] = ((String)object).length() + n;
                objectArray2[1] = (int)hz.c("n", (int)24215, (long)(0xAA3556D5FDB896EL ^ l));
                objectArray2[0] = object;
                object = x44.a("r", (Object)objectArray2, (long)688049567736859720L, (long)l);
            }
            string2 = object;
        }
        return string2;
    }

    public boolean F(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = ab ^ l) ^ 0x12D150C1034AL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this.D;
        objectArray2[0] = l2;
        return (boolean)x44.a("w", (Object)objectArray2, (long)4301014662939029249L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    private String j(Object[] var1_1) {
        block12: {
            block14: {
                block13: {
                    block11: {
                        var2_2 = (Long)var1_1[0];
                        var4_3 = (String)var1_1[1];
                        var2_2 = hz.ab ^ var2_2;
                        var6_4 = var4_3.lastIndexOf("$");
                        var5_5 = x44.a("w", (long)4064962668682218541L, (long)var2_2);
                        try {
                            try {
                                v0 = var6_4;
                                v1 = -1;
                                if (var5_5 != false) break block11;
                                if (v0 <= v1) break block12;
                            }
                            catch (gj v2) {
                                throw x44.a("w", (Object)v2, (long)2589442688301128809L, (long)var2_2);
                            }
                            v0 = var6_4;
                            v1 = var4_3.length() - 1;
                        }
                        catch (gj v3) {
                            throw x44.a("w", (Object)v3, (long)2589442688301128809L, (long)var2_2);
                        }
                    }
                    if (v0 >= v1) break block12;
                    var7_6 = var4_3.substring(var6_4 + 1);
                    try {
                        v4 = var7_6;
                        v5 = var5_5;
                        if (var2_2 > 0L) {
                            if (v5 != false) break block13;
                            if (x44.a("w", (Object)new Object[]{v4}, (long)2753727874271877417L, (long)var2_2) == false) break block12;
                        }
                        ** GOTO lbl39
                    }
                    catch (gj v6) {
                        throw x44.a("w", (Object)v6, (long)2589442688301128809L, (long)var2_2);
                    }
                    v4 = var4_3 = var4_3.substring(0, var6_4);
                }
                try {
                    try {
                        v5 = var5_5;
lbl39:
                        // 2 sources

                        if (v5 != false) break block14;
                        if (yn.E(v4) == null) break block12;
                    }
                    catch (gj v7) {
                        throw x44.a("w", (Object)v7, (long)2589442688301128809L, (long)var2_2);
                    }
                    v4 = var4_3;
                }
                catch (gj v8) {
                    throw x44.a("w", (Object)v8, (long)2589442688301128809L, (long)var2_2);
                }
            }
            return v4;
        }
        return null;
    }

    public a3 S(Object[] objectArray) {
        _ug _ug2 = (_ug)objectArray[0];
        long l = (Long)objectArray[1];
        Integer n = (Integer)objectArray[2];
        long l2 = l = ab ^ l;
        long l3 = l2 ^ 0x291A5FB60CFFL;
        long l4 = l2 ^ 0x305A20869293L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        CallSite callSite = x44.a("v", (Object)objectArray2, (long)-8287761463553948361L, (long)l);
        ((HashSet)((Object)callSite)).add(this);
        Object[] objectArray3 = new Object[4];
        objectArray3[3] = n;
        objectArray3[2] = _ug2;
        objectArray3[1] = l4;
        objectArray3[0] = callSite;
        return x44.a("h", (Object)this, (Object)objectArray3, (long)-8482527066093854865L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    public final void q(Object[] var1_1) {
        var5_2 = (yn)var1_1[0];
        var2_3 = (Long)var1_1[1];
        var6_4 = (Integer)var1_1[2];
        var4_5 = (_yz)var1_1[3];
        v0 = var7_6 = (var2_3 << 32 | (long)var6_4 << 32 >>> 32) ^ hz.ab;
        var9_7 = v0 ^ 93727644635859L;
        var11_8 = v0 ^ 8146368342215L;
        var14_9 = this.n(var11_8);
        var15_10 = 0;
        var13_11 = x44.a("t", (long)-6353846948382010474L, (long)var7_6);
        while (var15_10 < this.R) {
            v1 = new Object[4];
            v1[3] = var14_9[var15_10];
            v1[2] = this;
            v1[1] = var5_2;
            v1[0] = var9_7;
            x44.a("l", (Object)var4_5, (Object)v1, (long)-6894790151724351209L, (long)var7_6);
            ++var15_10;
lbl22:
            // 2 sources

            ** while (var13_11 != false)
lbl23:
            // 1 sources

        }
lbl24:
        // 2 sources

        if (var6_4 < 0) ** GOTO lbl22
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        hz.ab = ess.a(2245792316483819094L, -6771855466456423546L, MethodHandles.lookup().lookupClass()).a(270885428122765L);
                        var20 = hz.ab ^ 128622001542069L;
                        hz.gb = new HashMap<K, V>(13);
                        x44.a("v", (Object)new String[3], (long)1472443467792734253L, (long)var20);
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
                        var18_3 = new String[29];
                        var16_4 = 0;
                        var15_5 = "\u0000\u0099M\u0000\u00d0oN\u00dbF)\u00ad\u00f1JQV#YE\u0011\u001e\\=T!\u00a1\u00d3\u0099\u00b1\u00ec'\u00fb\u008a\r\u00d7\u00a0\u00ddK\u00f27\u00cb\u0010W\u008bu7\u00db\u00c6\u00bf\u0005\u00b6\u00f0\u00191w\u00a6\u0094/@.S\u00e72\u0016\u008c)\u0081\u0011\u0083\u00e7\u0087\u00cb\u00b7\u0080\u0082\u009e0uD\u00d5\u0004K4\u00c6\u009bM\u00deS\u00c9\u0094e\u00c3>\u00f2B\u0081\u00b0\u00c2\u00eb\u00ce@\u0084_\u0018\u001fV\u0092Bs\u00e2!\u00de\u0091\u00de7\u0085\u001b\u0099\u00ebe\u00f8s\u0014\u0010\u00b3\u0096?L\u00e4a[\u00a9\u00fc\u00c3\u00e9t \u00fcV\u00d0\u00101\u0013\r\u00a1\u0094\u00d7\u00b5\u00dc\u0093\u008c=_\u00d4/|\u00118\r\u00de\u00fc\u00b6\u00e5\u00f4\u007f\u00cd\u00f7A!:k@\u00c7\u001c\u00e8\u0093\u00a6\u0087\u00ce\u00b4\u00e1\u0095\u00bcX\u0082H\u00cc\u00c0pF\u00bd\t\u008c\"u\u00e0zI\u001el\u00cf6\u00bc\u00aa\u00f3.\u00e9\u00c2$\n\u001b\u00ae\u00c7;8\u00b6J\u00dd\u00fcrw\u0099=X\u007f?l\u00a6\u00fc\u00cb\u00d5\u00a6\u00a4\u00c0\u008eO4\u00ca\u00a8f-p\u000b\u009a\u0018\u00adCs\n\u00a9\u008ey\u0091\u00fa\u0018\u00a0\u00de!\u0019,\u008b5\u0096lh\u00df\u00e7\u00a0O\u00135\u0010\u00ce\u00ac\u00d2G\u00b2P/\u00ca\u009a\u00da1\u00ba\u00e1;\u00d0S8i\u009c\u0014\u00da^|\u0088\u009f\u0086\u00b6\u009cPUJX\u00e1d0UDm\u0019\u00da\u0012\u00e2\u0005\u00a0\u008bu\u0080\u00b2ygP\u0089\u00c5\f\u00bf\u00b5\u00e5OW\u00ebv\u00bf\u009e\u0090\u00b3*\u00f2(\u000e\u009a\u008e\u00a6\u00f2\u0010\u00bb\u00bb\u009e\u0015k\u00c5y\u00fd#\u0004\u0012\u0012\u00e1\"\u0006A\u0010I\u0083\u00b3%\f\u00e8\u009f\u00c8tP\u00fc\u00d2\u0011\u00912\u00c5\u0010\u0084\u00f20y\u0080!\u00c1]\u008a\u00af\u00a4]\u00bc\u001a\u0012R\u0010,jk8r\u0012B\u00e0\u00dd\u00c8D\u0081\u0098\u00c3{rh\u00feN\u0019\u0003vL\u00f8\u00e0]6\u00de\u0005\u00dd\u0015d\u0096j\u00b5\u00f6)\u0010\u000b\u0019\u00de\u00ab].\u00d1j\u00e4\u00bb\nlS#\f\u00ad\u00c4z\u00ee\\\u0086\u00bc\u00b0 t\u00f0\u00ad\u0002\u00aa\u0082\u00e5t\u00c0\u0005fL|\u00ea\u0095\u0012h\u00e0\u00ea~\u00c8\u00e3Kl\u00de\u00cb\u0089@\u00b0\u00c9\u00d6\u00ac\u00a6V\u00e0\u0088\u00ef\u00e6\u00ee0n\u00de\u00c0\u00d1rU\u007f\u0001\u00b1\u00a40u\u0007\u00d3\u00ae\u0090F\u00d2d(\u00f54\u00cb \u00d3i\u00c57i\u00db/\u00c4W\u00bbNg\u00c6\u008dy_s&\u00e94\u00dc\u0005?h\u0083F\u00b8+\u00c8\u00cb\u0090\u0000t\u009d2\u00f8\u0010\u00cer\u0086<\u00b9\u001f'\u00da\u00ee\u00eb\u00bd\u00b6\u00f7h\u00e9\u00bf\u0010Q\u009b\u00d5\u00a2\u0094,?|l\u00b6\u0088\u00f7\u00b6\"\u0003f0\r\u0002C98\u00efB$\u00ce\u0098L\u00abJ\u0016-\u00df\u0093\u00e1a\u0098f\u00bcN\u00a5\u0001l\u00d85\",\u00a1\u00a8\u00c7\u00b7$\u001b76\u00e4\u0092\u00931$m\u00fd\f6\u00a0@\t\u00ce\u00ca\u00e4\u0005!\u00c1\u00ddn\u0094^\u0007\bDL|\u0082\u0010\u00ab\u00f4>,\u00bb\u000et\u00f8x\u0015\u00a4|0\u009aj\u00be\u00fa\u00f9\u00c5\u0015\u00af\u00ed^\u009d\u00eb\u0092\u001fH\u009d\u0015S>\u009burZ\u00e1y\u00ae\u0085\u00a0\u00de\u00f1\u00c6\u00e7\u00be0\u00bes\u00c8k\u00aa\u001f\"\u00a6~\u00faa\u0094\u00f6*\u00da`\u00a3\u007f\u009fP\u00ae\u0016\u00e0m\bN\u0087\u00f8\u00e2.\u0092Z,\u0082\u00f0\u00ebF\u0097\u00d7\u00a0\u000f\u00b9\u00e7\u00e3\n\u00f3\u0080\u0091\u0010\u0084\u000fY%\\\u00d2Q\u00a24M\u00be\u00b6\u00d0*\u00cb\u00d70) wFb\u00c7r^\u008eO\u00c4\u00b0\u0010{@\u00bb\u007f\u00f9\u00f0\u0010'\u0006\u009e\u00ea\\9\u0099Q\u00e8\u009e\u0084\u00adb\r\u0097\u00ed\u00e1@<\u0080\u008c\u00ad\u00170\u00ea\u00eb\u000fO0\u0080\u001c`1\\)\u0082\u00b2\u008e\u00a8\u00c7_\u008aq]d\u008c\u00ee}\u00e8\u0016\u009f?\u00a9\u00d2LRA\u00f4hz\u00cd\u0010\u0099\u00adU\u00a8V\u000b\u001f\u0081g\u0011=!\u00eb\u00b0: \u008f\u00ba|l\u00039\u0012\u00ef\u00de\r\u0002\u000f\u00ba\u0086\u009f\u00bdN\u00c6k'n\u00a482\u008f\u00f14\r9(\u00b0R8\u00d6\u00b4c\u001e\u0010\u00a4\u00af9Av\u00b5C\u00ef\u00ea\u00da';r\u00cb\u00bcx\u00bdo\u0081w\u00e3\u0097~$\u00e0P\u00c8\u00e1\u0083\u00b8\u00ae\u00e0\u00abT\u00b3\\d\u00ef[\u00ed\u0000\u00a1'\u00a0\t\u009b[\u00b1\t\u00c9(H\u001e\u00a9\u00c2kt\u00e60\u00d1E\u00af\u009e\u00e2\u00f3\u00bc\u00ee\u0092S\u0082(\u009b\u0015I\u00fc\u009bi\u0005e\u00d6WG6\u0012\u00a9\u009b\\\u00c9\u00fct\u0094\t\u00deO\u00b5\u00c9R\u008b\u00ea\u00f8\u00b9\u00c8 7kI\t\u00b4^\u00b7\u00db\u00d7\u0093\u00fc|\u009e\u00c5$b%\u00d4\u00fc2S\u0010\u00c6\u00b0{\u00f6\u00d2]\u00d6\u00a8\u00fdt\u00f6\u0095\u00fe\n\f\u00de";
                        var17_6 = "\u0000\u0099M\u0000\u00d0oN\u00dbF)\u00ad\u00f1JQV#YE\u0011\u001e\\=T!\u00a1\u00d3\u0099\u00b1\u00ec'\u00fb\u008a\r\u00d7\u00a0\u00ddK\u00f27\u00cb\u0010W\u008bu7\u00db\u00c6\u00bf\u0005\u00b6\u00f0\u00191w\u00a6\u0094/@.S\u00e72\u0016\u008c)\u0081\u0011\u0083\u00e7\u0087\u00cb\u00b7\u0080\u0082\u009e0uD\u00d5\u0004K4\u00c6\u009bM\u00deS\u00c9\u0094e\u00c3>\u00f2B\u0081\u00b0\u00c2\u00eb\u00ce@\u0084_\u0018\u001fV\u0092Bs\u00e2!\u00de\u0091\u00de7\u0085\u001b\u0099\u00ebe\u00f8s\u0014\u0010\u00b3\u0096?L\u00e4a[\u00a9\u00fc\u00c3\u00e9t \u00fcV\u00d0\u00101\u0013\r\u00a1\u0094\u00d7\u00b5\u00dc\u0093\u008c=_\u00d4/|\u00118\r\u00de\u00fc\u00b6\u00e5\u00f4\u007f\u00cd\u00f7A!:k@\u00c7\u001c\u00e8\u0093\u00a6\u0087\u00ce\u00b4\u00e1\u0095\u00bcX\u0082H\u00cc\u00c0pF\u00bd\t\u008c\"u\u00e0zI\u001el\u00cf6\u00bc\u00aa\u00f3.\u00e9\u00c2$\n\u001b\u00ae\u00c7;8\u00b6J\u00dd\u00fcrw\u0099=X\u007f?l\u00a6\u00fc\u00cb\u00d5\u00a6\u00a4\u00c0\u008eO4\u00ca\u00a8f-p\u000b\u009a\u0018\u00adCs\n\u00a9\u008ey\u0091\u00fa\u0018\u00a0\u00de!\u0019,\u008b5\u0096lh\u00df\u00e7\u00a0O\u00135\u0010\u00ce\u00ac\u00d2G\u00b2P/\u00ca\u009a\u00da1\u00ba\u00e1;\u00d0S8i\u009c\u0014\u00da^|\u0088\u009f\u0086\u00b6\u009cPUJX\u00e1d0UDm\u0019\u00da\u0012\u00e2\u0005\u00a0\u008bu\u0080\u00b2ygP\u0089\u00c5\f\u00bf\u00b5\u00e5OW\u00ebv\u00bf\u009e\u0090\u00b3*\u00f2(\u000e\u009a\u008e\u00a6\u00f2\u0010\u00bb\u00bb\u009e\u0015k\u00c5y\u00fd#\u0004\u0012\u0012\u00e1\"\u0006A\u0010I\u0083\u00b3%\f\u00e8\u009f\u00c8tP\u00fc\u00d2\u0011\u00912\u00c5\u0010\u0084\u00f20y\u0080!\u00c1]\u008a\u00af\u00a4]\u00bc\u001a\u0012R\u0010,jk8r\u0012B\u00e0\u00dd\u00c8D\u0081\u0098\u00c3{rh\u00feN\u0019\u0003vL\u00f8\u00e0]6\u00de\u0005\u00dd\u0015d\u0096j\u00b5\u00f6)\u0010\u000b\u0019\u00de\u00ab].\u00d1j\u00e4\u00bb\nlS#\f\u00ad\u00c4z\u00ee\\\u0086\u00bc\u00b0 t\u00f0\u00ad\u0002\u00aa\u0082\u00e5t\u00c0\u0005fL|\u00ea\u0095\u0012h\u00e0\u00ea~\u00c8\u00e3Kl\u00de\u00cb\u0089@\u00b0\u00c9\u00d6\u00ac\u00a6V\u00e0\u0088\u00ef\u00e6\u00ee0n\u00de\u00c0\u00d1rU\u007f\u0001\u00b1\u00a40u\u0007\u00d3\u00ae\u0090F\u00d2d(\u00f54\u00cb \u00d3i\u00c57i\u00db/\u00c4W\u00bbNg\u00c6\u008dy_s&\u00e94\u00dc\u0005?h\u0083F\u00b8+\u00c8\u00cb\u0090\u0000t\u009d2\u00f8\u0010\u00cer\u0086<\u00b9\u001f'\u00da\u00ee\u00eb\u00bd\u00b6\u00f7h\u00e9\u00bf\u0010Q\u009b\u00d5\u00a2\u0094,?|l\u00b6\u0088\u00f7\u00b6\"\u0003f0\r\u0002C98\u00efB$\u00ce\u0098L\u00abJ\u0016-\u00df\u0093\u00e1a\u0098f\u00bcN\u00a5\u0001l\u00d85\",\u00a1\u00a8\u00c7\u00b7$\u001b76\u00e4\u0092\u00931$m\u00fd\f6\u00a0@\t\u00ce\u00ca\u00e4\u0005!\u00c1\u00ddn\u0094^\u0007\bDL|\u0082\u0010\u00ab\u00f4>,\u00bb\u000et\u00f8x\u0015\u00a4|0\u009aj\u00be\u00fa\u00f9\u00c5\u0015\u00af\u00ed^\u009d\u00eb\u0092\u001fH\u009d\u0015S>\u009burZ\u00e1y\u00ae\u0085\u00a0\u00de\u00f1\u00c6\u00e7\u00be0\u00bes\u00c8k\u00aa\u001f\"\u00a6~\u00faa\u0094\u00f6*\u00da`\u00a3\u007f\u009fP\u00ae\u0016\u00e0m\bN\u0087\u00f8\u00e2.\u0092Z,\u0082\u00f0\u00ebF\u0097\u00d7\u00a0\u000f\u00b9\u00e7\u00e3\n\u00f3\u0080\u0091\u0010\u0084\u000fY%\\\u00d2Q\u00a24M\u00be\u00b6\u00d0*\u00cb\u00d70) wFb\u00c7r^\u008eO\u00c4\u00b0\u0010{@\u00bb\u007f\u00f9\u00f0\u0010'\u0006\u009e\u00ea\\9\u0099Q\u00e8\u009e\u0084\u00adb\r\u0097\u00ed\u00e1@<\u0080\u008c\u00ad\u00170\u00ea\u00eb\u000fO0\u0080\u001c`1\\)\u0082\u00b2\u008e\u00a8\u00c7_\u008aq]d\u008c\u00ee}\u00e8\u0016\u009f?\u00a9\u00d2LRA\u00f4hz\u00cd\u0010\u0099\u00adU\u00a8V\u000b\u001f\u0081g\u0011=!\u00eb\u00b0: \u008f\u00ba|l\u00039\u0012\u00ef\u00de\r\u0002\u000f\u00ba\u0086\u009f\u00bdN\u00c6k'n\u00a482\u008f\u00f14\r9(\u00b0R8\u00d6\u00b4c\u001e\u0010\u00a4\u00af9Av\u00b5C\u00ef\u00ea\u00da';r\u00cb\u00bcx\u00bdo\u0081w\u00e3\u0097~$\u00e0P\u00c8\u00e1\u0083\u00b8\u00ae\u00e0\u00abT\u00b3\\d\u00ef[\u00ed\u0000\u00a1'\u00a0\t\u009b[\u00b1\t\u00c9(H\u001e\u00a9\u00c2kt\u00e60\u00d1E\u00af\u009e\u00e2\u00f3\u00bc\u00ee\u0092S\u0082(\u009b\u0015I\u00fc\u009bi\u0005e\u00d6WG6\u0012\u00a9\u009b\\\u00c9\u00fct\u0094\t\u00deO\u00b5\u00c9R\u008b\u00ea\u00f8\u00b9\u00c8 7kI\t\u00b4^\u00b7\u00db\u00d7\u0093\u00fc|\u009e\u00c5$b%\u00d4\u00fc2S\u0010\u00c6\u00b0{\u00f6\u00d2]\u00d6\u00a8\u00fdt\u00f6\u0095\u00fe\n\f\u00de".length();
                        var14_7 = 40;
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
                            var18_3[var16_4++] = hz.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\t\u009dz\u00ab\u00a5>8\\V\u00f6C\u0098\u0014\u00b3n\u0002\u0010\u00b7\u00df\u00aa\u00f7\u00d5B\u0086\u00a3D,I!\u00d6\u0003\u00d4\u00a7";
                            var17_6 = "\t\u009dz\u00ab\u00a5>8\\V\u00f6C\u0098\u0014\u00b3n\u0002\u0010\u00b7\u00df\u00aa\u00f7\u00d5B\u0086\u00a3D,I!\u00d6\u0003\u00d4\u00a7".length();
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
                            var18_3[var16_4++] = hz.a(var19_9).intern();
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
                hz.eb = var18_3;
                hz.fb = new String[29];
                hz.mb = new HashMap<K, V>(13);
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
                var6_12 = new long[18];
                var3_13 = 0;
                var4_14 = "[\u00e1b^\u00a7\u0097N\t\u0081\u00b9\u00874\u00dbI\u00cf8+\u00b4\u000f)~\u009a\u001b\u001a\u0093\u008e\u009c\u00e1\u00f8\u00df\u0005\t\u00e0\u009c\u0096\u00e8+\u0095*\u00f9\u009bX\u001b\u00d27\u0098\u001epj\u0001\u00c6J\u008aD\u001d\u00fdG\u008e\u0001\u00fdP\u00ce\u00b7\u0083\u00e1\u008d\u00fbKM\u00c6\u0015\u00aa\u00d51u\u0001\u0083\u00f7X.M\u00c0/\u00f5\u009606\u00f2Bv\u00derHR\u00e0j\u001aL3\u00e5Ct5\u008a\u0087\u0014\u009aD\u00dfJ\u00aaDn\u000e\u00d7k\u00b7\u00fc\u00ab\u009b\n\u00b2\u001f\u0093~dN*";
                var5_15 = "[\u00e1b^\u00a7\u0097N\t\u0081\u00b9\u00874\u00dbI\u00cf8+\u00b4\u000f)~\u009a\u001b\u001a\u0093\u008e\u009c\u00e1\u00f8\u00df\u0005\t\u00e0\u009c\u0096\u00e8+\u0095*\u00f9\u009bX\u001b\u00d27\u0098\u001epj\u0001\u00c6J\u008aD\u001d\u00fdG\u008e\u0001\u00fdP\u00ce\u00b7\u0083\u00e1\u008d\u00fbKM\u00c6\u0015\u00aa\u00d51u\u0001\u0083\u00f7X.M\u00c0/\u00f5\u009606\u00f2Bv\u00derHR\u00e0j\u001aL3\u00e5Ct5\u008a\u0087\u0014\u009aD\u00dfJ\u00aaDn\u000e\u00d7k\u00b7\u00fc\u00ab\u009b\n\u00b2\u001f\u0093~dN*".length();
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
                    var4_14 = "\u001e<\u00e2H~h\u0018\u00c6\u007f\u009f\u009d\u00eb\u00a2\u00d3\u00d8\u00d8";
                    var5_15 = "\u001e<\u00e2H~h\u0018\u00c6\u007f\u009f\u009d\u00eb\u00a2\u00d3\u00d8\u00d8".length();
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
        hz.kb = var6_12;
        hz.lb = new Integer[18];
    }

    private static Exception b(Exception exception) {
        return exception;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5E78;
        if (fb[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])gb.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    gb.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/hz", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = eb[n2].getBytes("ISO-8859-1");
            hz.fb[n2] = hz.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return fb[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = hz.a(n, l);
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
            throw new RuntimeException("com/zelix/hz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5565;
        if (lb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = kb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])mb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    mb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/hz", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            hz.lb[n2] = n3;
        }
        return lb[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = hz.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/hz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(hz.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(hz.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
