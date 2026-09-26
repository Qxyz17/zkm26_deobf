/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.aw;
import com.zelix.df;
import com.zelix.eo;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.iq;
import com.zelix.jf;
import com.zelix.js;
import com.zelix.k_;
import com.zelix.l;
import com.zelix.l6q;
import com.zelix.lmt;
import com.zelix.m44;
import com.zelix.m7;
import com.zelix.n;
import com.zelix.oa;
import com.zelix.ow;
import com.zelix.prr;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class be
extends _4
implements lmt,
eo {
    private Object[] N;
    private boolean C;
    private jf q;
    private static Comparator u;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public int B(Object[] objectArray) {
        return ((iq)this.N[0]).c();
    }

    jf s(Object[] objectArray) {
        return this.q;
    }

    boolean h(int n2, int n3, long l) {
        int n4;
        block8: {
            block10: {
                l = a ^ l;
                int n5 = this.t(0);
                CallSite callSite = m44.a("o", (long)-8728388504924719210L, (long)l);
                int n6 = this.t(1);
                try {
                    block9: {
                        try {
                            try {
                                try {
                                    n4 = n5;
                                    if (callSite == false) break block8;
                                    if (n4 >= n3) break block9;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("o", (Object)illegalArgumentException, (long)-6919924011372231201L, (long)l);
                                }
                                n4 = n6;
                                if (callSite == false) break block8;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("o", (Object)illegalArgumentException, (long)-6919924011372231201L, (long)l);
                            }
                            if (n4 > n2) break block10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("o", (Object)illegalArgumentException, (long)-6919924011372231201L, (long)l);
                        }
                    }
                    n4 = 1;
                    break block8;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("o", (Object)illegalArgumentException, (long)-6919924011372231201L, (long)l);
                }
            }
            n4 = 0;
        }
        int n7 = n4;
        return n7 != 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    boolean D(Object[] var1_1) {
        block23: {
            block24: {
                block27: {
                    block28: {
                        block25: {
                            block26: {
                                block21: {
                                    var3_2 = (Long)var1_1[0];
                                    var6_3 = (HashSet)var1_1[1];
                                    var7_4 = (int[])var1_1[2];
                                    var5_5 = (df)var1_1[3];
                                    var2_6 = (l)var1_1[4];
                                    v0 = var3_2 = be.a ^ var3_2;
                                    var8_7 = v0 ^ 25584515791614L;
                                    v1 = v0 ^ 16847508650463L;
                                    var10_8 = (int)(v1 >>> 32);
                                    var11_9 = (int)(v1 << 32 >>> 48);
                                    var12_10 = (int)(v1 << 48 >>> 48);
                                    var13_11 = v0 ^ 56425042761381L;
                                    var16_12 = (iq)this.N[0];
                                    var17_13 = (iq)this.N[1];
                                    var18_14 = (iq)this.N[2];
                                    var15_15 = m44.a("i", (long)8194559153760118111L, (long)var3_2);
                                    try {
                                        block22: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v2 = m44.a("v", (Object)var6_3, (Object)var18_14, (long)7566806719701567394L, (long)var3_2);
                                                                if (var15_15 != false) break block21;
                                                                if (v2 != false) break block22;
                                                            }
                                                            catch (IllegalArgumentException v3) {
                                                                throw m44.a("i", (Object)v3, (long)8127142858109594337L, (long)var3_2);
                                                            }
                                                            v4 /* !! */  = m44.a("v", (Object)var6_3, (Object)var16_12, (long)7566806719701567394L, (long)var3_2);
                                                            if (var15_15 != false) break block23;
                                                        }
                                                        catch (IllegalArgumentException v5) {
                                                            throw m44.a("i", (Object)v5, (long)8127142858109594337L, (long)var3_2);
                                                        }
                                                        if (v4 /* !! */  == false) break block24;
                                                    }
                                                    catch (IllegalArgumentException v6) {
                                                        throw m44.a("i", (Object)v6, (long)8127142858109594337L, (long)var3_2);
                                                    }
                                                    v7 = new Object[6];
                                                    v7[5] = (int)((short)var12_10);
                                                    v7[4] = var7_4;
                                                    v7[3] = var17_13.c();
                                                    v7[2] = (int)((char)var11_9);
                                                    v7[1] = var10_8;
                                                    v7[0] = var16_12.c();
                                                    v4 /* !! */  = m44.a("i", (Object)v7, (long)7767322505363177349L, (long)var3_2);
                                                    if (var15_15 != false) break block23;
                                                }
                                                catch (IllegalArgumentException v8) {
                                                    throw m44.a("i", (Object)v8, (long)8127142858109594337L, (long)var3_2);
                                                }
                                                if (v4 /* !! */  == false) break block24;
                                            }
                                            catch (IllegalArgumentException v9) {
                                                throw m44.a("i", (Object)v9, (long)8127142858109594337L, (long)var3_2);
                                            }
                                        }
                                        v10 = new Object[3];
                                        v10[2] = this;
                                        v10[1] = var8_7;
                                        v10[0] = var16_12;
                                        v2 = m44.a("v", (Object)var5_5, (Object)v10, (long)8510405837311155899L, (long)var3_2);
                                    }
                                    catch (IllegalArgumentException v11) {
                                        throw m44.a("i", (Object)v11, (long)8127142858109594337L, (long)var3_2);
                                    }
                                }
                                var19_16 = v2;
                                v12 = new Object[3];
                                v12[2] = this;
                                v12[1] = var8_7;
                                v12[0] = var17_13;
                                var19_16 = m44.a("v", (Object)var5_5, (Object)v12, (long)8510405837311155899L, (long)var3_2);
                                v13 = new Object[3];
                                v13[2] = this;
                                v13[1] = var8_7;
                                v13[0] = var18_14;
                                var19_16 = m44.a("v", (Object)var5_5, (Object)v13, (long)8510405837311155899L, (long)var3_2);
                                try {
                                    try {
                                        v14 /* !! */  = m44.a("v", (Object)var6_3, (Object)var16_12, (long)7566806719701567394L, (long)var3_2);
                                        v15 = var15_15;
                                        if (var3_2 >= 0L) {
                                            if (v15 != false) break block25;
                                            if (v14 /* !! */  == false) break block26;
                                        }
                                        ** GOTO lbl109
                                    }
                                    catch (IllegalArgumentException v16) {
                                        throw m44.a("i", (Object)v16, (long)8127142858109594337L, (long)var3_2);
                                    }
                                    v17 = new Object[4];
                                    v17[3] = n.f;
                                    v17[2] = var13_11;
                                    v17[1] = var5_5;
                                    v17[0] = var16_12;
                                    m44.a("h", (Object)this, (Object)v17, (long)7778911397236764638L, (long)var3_2);
                                }
                                catch (IllegalArgumentException v18) {
                                    throw m44.a("i", (Object)v18, (long)8127142858109594337L, (long)var3_2);
                                }
                            }
                            v14 /* !! */  = m44.a("v", (Object)var6_3, (Object)var17_13, (long)7566806719701567394L, (long)var3_2);
                        }
                        try {
                            try {
                                v15 = var15_15;
lbl109:
                                // 2 sources

                                if (v15 != false) break block27;
                                if (v14 /* !! */  == false) break block28;
                            }
                            catch (IllegalArgumentException v19) {
                                throw m44.a("i", (Object)v19, (long)8127142858109594337L, (long)var3_2);
                            }
                            v20 = new Object[4];
                            v20[3] = n.R;
                            v20[2] = var13_11;
                            v20[1] = var5_5;
                            v20[0] = var17_13;
                            m44.a("h", (Object)this, (Object)v20, (long)7778911397236764638L, (long)var3_2);
                        }
                        catch (IllegalArgumentException v21) {
                            throw m44.a("i", (Object)v21, (long)8127142858109594337L, (long)var3_2);
                        }
                    }
                    v22 = new Object[4];
                    v22[3] = n.J;
                    v22[2] = var13_11;
                    v22[1] = var5_5;
                    v22[0] = var18_14;
                    m44.a("h", (Object)this, (Object)v22, (long)7778911397236764638L, (long)var3_2);
                    v14 /* !! */  = (CallSite)true;
                }
                return (boolean)v14 /* !! */ ;
            }
            v4 /* !! */  = (CallSite)false;
        }
        return (boolean)v4 /* !! */ ;
    }

    public static Comparator p(Object[] objectArray) {
        CallSite callSite;
        block4: {
            long l2;
            block5: {
                l2 = (Long)objectArray[0];
                l2 = a ^ l2;
                CallSite callSite2 = m44.a("m", (long)6259027370540007995L, (long)l2);
                try {
                    try {
                        callSite = m44.a("i", (long)5443021887675853992L, (long)l2);
                        if (callSite2 != false) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("m", (Object)illegalArgumentException, (long)6317720454468046213L, (long)l2);
                    }
                    m44.a("n", (Comparator)new oa(), (long)5443021887675853992L, (long)l2);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("m", (Object)illegalArgumentException, (long)6317720454468046213L, (long)l2);
                }
            }
            callSite = m44.a("i", (long)5443021887675853992L, (long)l2);
        }
        return callSite;
    }

    public iq D(n n2) {
        return (iq)this.N[n2.ordinal()];
    }

    public int t(int n2) {
        iq iq2 = (iq)this.N[n2];
        return iq2.B();
    }

    /*
     * Exception decompiling
     */
    private boolean B(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [23[DOLOOP]], but top level block is 4[TRYBLOCK]
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

    public String R(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return be.a("e", (int)4449, (long)(0x1FF9CB8A31B32CADL ^ l2));
    }

    public m7 i(long l2) {
        return m44.a("k", (long)-5333071195003347841L, (long)l2);
    }

    public void S(Object[] objectArray) {
        block9: {
            jf jf2;
            block10: {
                be be2;
                jf jf3;
                long l2;
                jf jf4;
                block8: {
                    jf4 = (jf)objectArray[0];
                    jf2 = (jf)objectArray[1];
                    l2 = (Long)objectArray[2];
                    CallSite callSite = m44.a("o", (long)-7028195342100598978L, (long)l2);
                    try {
                        try {
                            try {
                                jf3 = this.q;
                                if (l2 < 0L || callSite == false) break block8;
                                if (jf3 == null) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("o", (Object)illegalArgumentException, (long)-8692192802812699273L, (long)l2);
                            }
                            be2 = this;
                            if (callSite == false) break block10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("o", (Object)illegalArgumentException, (long)-8692192802812699273L, (long)l2);
                        }
                        jf3 = be2.q;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("o", (Object)illegalArgumentException, (long)-8692192802812699273L, (long)l2);
                    }
                }
                try {
                    if (jf3 != jf4) break block9;
                    be2 = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("o", (Object)illegalArgumentException, (long)-8692192802812699273L, (long)l2);
                }
            }
            be2.q = jf2;
        }
    }

    String Y(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        int n2 = (Integer)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x273839E90180L;
        iq iq2 = (iq)this.N[n2];
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        return m44.a("r", (Object)iq2, (Object)objectArray2, (long)4342783239473559260L, (long)l2);
    }

    public int O(Object[] objectArray) {
        return ((iq)this.N[1]).c();
    }

    /*
     * Exception decompiling
     */
    public static ow Q(Object[] var0) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean O(Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        int n3 = (Integer)objectArray[1];
        int n4 = (Integer)objectArray[2];
        int n5 = (Integer)objectArray[3];
        int[] nArray = (int[])objectArray[4];
        int n6 = (Integer)objectArray[5];
        long l2 = ((long)n3 << 32 | (long)n4 << 48 >>> 32 | (long)n6 << 48 >>> 48) ^ a;
        CallSite callSite = m44.a("l", (Object)nArray, (int)n2, (long)7242899806151463024L, (long)l2);
        CallSite callSite2 = m44.a("l", (long)8864672001004669517L, (long)l2);
        int n7 = n2 + 1;
        block10: while (n7 < n5) {
            try {
                try {
                    try {
                        try {
                            try {}
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("l", (Object)illegalArgumentException, (long)7074118278029883396L, (long)l2);
                            }
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("l", (Object)illegalArgumentException, (long)7074118278029883396L, (long)l2);
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)7074118278029883396L, (long)l2);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)7074118278029883396L, (long)l2);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("l", (Object)illegalArgumentException, (long)7074118278029883396L, (long)l2);
            }
            do {
                CallSite callSite3;
                int n8;
                void var10_9;
                int n9 = ++var10_9;
                CallSite callSite4 = callSite2;
                if (n4 > 0) {
                    if (callSite4 == false) return n9 != 0;
                    callSite4 = callSite2;
                }
                if (callSite4 == false) return n8 != 0;
                if (n4 < 0) return n8 != 0;
                if (n9 >= nArray.length) return 0 != 0;
                n8 = n7++;
                if (callSite2 == false) return n8 != 0;
                if (n3 >= 0) {
                    if (n8 != nArray[var10_9]) {
                        return 0 != 0;
                    }
                    callSite3 = callSite2;
                }
                if (callSite3 != false) continue block10;
            } while (n6 >= 0);
        }
        return 1 != 0;
    }

    public be(k_ k_2, jf jf2, iq iq2, iq iq3, iq iq4) {
        super((_4)k_2);
        this.N = new Object[3];
        this.q = jf2;
        iq2.G(m7.y);
        iq3.G(m7.F);
        iq4.G(m7.X);
        Object[] objectArray = new Object[]{iq2, iq3, iq4};
        this.N = objectArray;
        this.C = true;
    }

    /*
     * Unable to fully structure code
     */
    public boolean Y(Object[] var1_1) {
        block30: {
            block32: {
                block31: {
                    block28: {
                        var2_2 = (Integer)var1_1[0];
                        var4_3 = (Long)var1_1[1];
                        var3_4 = (Integer)var1_1[2];
                        var4_3 = be.a ^ var4_3;
                        var7_5 = this.t(0);
                        var6_6 = m44.a("k", (long)-224336230252704342L, (long)var4_3);
                        var8_7 = this.t(1);
                        try {
                            block29: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v0 = var7_5;
                                                    v1 = var2_2;
                                                    if (var6_6 == false) break block28;
                                                    if (v0 <= v1) break block29;
                                                }
                                                catch (IllegalArgumentException v2) {
                                                    throw m44.a("k", (Object)v2, (long)-1888404335090188317L, (long)var4_3);
                                                }
                                                v0 = var7_5;
                                                v1 = var3_4;
                                                v3 = var6_6;
                                                if (var4_3 >= 0L) {
                                                    if (v3 == false) break block28;
                                                }
                                                ** GOTO lbl56
                                            }
                                            catch (IllegalArgumentException v4) {
                                                throw m44.a("k", (Object)v4, (long)-1888404335090188317L, (long)var4_3);
                                            }
                                            if (var4_3 < 0L) break block28;
                                            if (v0 >= v1) break block29;
                                        }
                                        catch (IllegalArgumentException v5) {
                                            throw m44.a("k", (Object)v5, (long)-1888404335090188317L, (long)var4_3);
                                        }
                                        v0 = var8_7;
                                        if (var6_6 == false) break block30;
                                    }
                                    catch (IllegalArgumentException v6) {
                                        throw m44.a("k", (Object)v6, (long)-1888404335090188317L, (long)var4_3);
                                    }
                                    if (v0 <= var3_4) {
                                    }
                                    ** GOTO lbl-1000
                                }
                                catch (IllegalArgumentException v7) {
                                    throw m44.a("k", (Object)v7, (long)-1888404335090188317L, (long)var4_3);
                                }
                            }
                            v0 = var7_5;
                            v1 = var2_2;
                        }
                        catch (IllegalArgumentException v8) {
                            throw m44.a("k", (Object)v8, (long)-1888404335090188317L, (long)var4_3);
                        }
                    }
                    try {
                        try {
                            v3 = var6_6;
lbl56:
                            // 2 sources

                            if (var4_3 < 0L) ** GOTO lbl73
                            if (v3 == false) break block31;
                            if (v0 < v1) {
                            }
                            ** GOTO lbl-1000
                        }
                        catch (IllegalArgumentException v9) {
                            throw m44.a("k", (Object)v9, (long)-1888404335090188317L, (long)var4_3);
                        }
                        v0 = var8_7;
                        v1 = var2_2;
                    }
                    catch (IllegalArgumentException v10) {
                        throw m44.a("k", (Object)v10, (long)-1888404335090188317L, (long)var4_3);
                    }
                }
                try {
                    try {
                        try {
                            v3 = var6_6;
lbl73:
                            // 2 sources

                            if (v3 == false) break block32;
                            if (v0 > v1) {
                            }
                            ** GOTO lbl-1000
                        }
                        catch (IllegalArgumentException v11) {
                            throw m44.a("k", (Object)v11, (long)-1888404335090188317L, (long)var4_3);
                        }
                        v0 = var8_7;
                        if (var6_6 == false) break block30;
                    }
                    catch (IllegalArgumentException v12) {
                        throw m44.a("k", (Object)v12, (long)-1888404335090188317L, (long)var4_3);
                    }
                    v1 = var3_4;
                }
                catch (IllegalArgumentException v13) {
                    throw m44.a("k", (Object)v13, (long)-1888404335090188317L, (long)var4_3);
                }
            }
            if (v0 < v1) lbl-1000:
            // 2 sources

            {
                v0 = 1;
            } else lbl-1000:
            // 3 sources

            {
                v0 = 0;
            }
        }
        var9_8 = v0;
        return (boolean)var9_8;
    }

    void z(gu gu2, long l2) {
        block5: {
            jf jf2;
            long l3;
            block4: {
                l3 = l2 ^ 0x6DE1DADD9981L;
                CallSite callSite = m44.a("h", (long)5618762033536375070L, (long)l2);
                try {
                    try {
                        jf2 = this.q;
                        if (callSite != false) break block4;
                        if (jf2 == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("h", (Object)illegalArgumentException, (long)5514762404767372960L, (long)l2);
                    }
                    jf2 = this.q;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("h", (Object)illegalArgumentException, (long)5514762404767372960L, (long)l2);
                }
            }
            jf2.e(l3, gu2, (Object)this, (Object)this);
        }
    }

    public boolean P(long l2) {
        boolean bl;
        l2 = a ^ l2;
        try {
            bl = this.q == null;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("m", (Object)illegalArgumentException, (long)-8298700547332352259L, (long)l2);
        }
        return bl;
    }

    be(long l2, _4 _42, h1 h12, l6q l6q2, l6q l6q3) {
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x5A4235B1CA73L;
        long l5 = l3 ^ 0x622D8F9F1CFL;
        long l6 = l3 ^ 0x236CB9C0804EL;
        super(_42);
        this.N = new Object[3];
        int n2 = h12.readUnsignedShort();
        int n3 = h12.readUnsignedShort();
        int n4 = h12.readUnsignedShort();
        Integer n5 = S.e(l4, n2);
        l6q2.t((Object)n5, (Object)this, l6);
        this.N[n.f.ordinal()] = n5;
        n5 = S.e(l4, n3);
        l6q2.t((Object)n5, (Object)this, l6);
        this.N[n.R.ordinal()] = n5;
        n5 = S.e(l4, n4);
        l6q2.t((Object)n5, (Object)this, l6);
        this.N[n.J.ordinal()] = n5;
        int n6 = h12.readUnsignedShort();
        Object[] objectArray = new Object[3];
        objectArray[2] = l5;
        objectArray[1] = l6q3;
        objectArray[0] = n6;
        m44.a("v", (Object)((Object)this), (Object)objectArray, (long)-601255928064120772L, (long)l2);
    }

    public boolean F(Object[] objectArray) {
        return this.C;
    }

    void p(Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        l6q l6q2 = (l6q)objectArray[1];
        long l2 = (Long)objectArray[2];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x33505577D1B5L;
        long l5 = l3 ^ 0x72031BD7BFFCL;
        long l6 = l3 ^ 0x1255B195DABBL;
        CallSite callSite = m44.a("l", (long)-5427420396520290843L, (long)l2);
        if (n2 != 0) {
            block6: {
                js js2;
                block7: {
                    js2 = this.m(l5, n2);
                    try {
                        try {
                            Object object = callSite;
                            if (l2 >= 0L) {
                                if (object == false) break block6;
                                object = js2 instanceof jf;
                            }
                            if (object != false) break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("l", (Object)illegalArgumentException, (long)-5943598363069941844L, (long)l2);
                        }
                        throw new aw(this.f(l4) + (String)((Object)be.a("e", (int)9797, (long)(0x2BEA77BB18398AC9L ^ l2))) + (String)((Object)be.a("e", (int)16055, (long)(0x258381A9E7459238L ^ l2))) + (String)((Object)be.a("e", (int)32322, (long)(0x7D32B18477AC52CBL ^ l2))) + n2);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)-5943598363069941844L, (long)l2);
                    }
                }
                this.q = (jf)js2;
            }
            l6q2.t((Object)this.q, (Object)this, l6);
        }
    }

    /*
     * Exception decompiling
     */
    public void d(Integer var1_1, iq var2_2, long var3_3) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    void O(Object[] objectArray) {
        Object object;
        long l2;
        StringBuffer stringBuffer;
        PrintWriter printWriter;
        long l3;
        block6: {
            block5: {
                CallSite callSite;
                block4: {
                    l3 = (Long)objectArray[0];
                    printWriter = (PrintWriter)objectArray[1];
                    stringBuffer = (StringBuffer)objectArray[2];
                    long l4 = l3 = a ^ l3;
                    l2 = l4 ^ 0x24A4764AF15CL;
                    long l5 = l4 ^ 0x193B43B8C20L;
                    CallSite callSite2 = m44.a("k", (long)7492487798052034226L, (long)l3);
                    printWriter.println("");
                    callSite = callSite2;
                    object = be.a("e", (int)11940, (long)(0x2216FB97C6ABD175L ^ l3));
                    try {
                        if (callSite == false) break block4;
                        if (this.q == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("k", (Object)illegalArgumentException, (long)9138750137252357371L, (long)l3);
                    }
                    object = (String)object + this.q.g(l5);
                }
                if (callSite != false) break block6;
            }
            object = (String)object + (String)((Object)be.a("e", (int)15785, (long)(0x711E748922124274L ^ l3)));
        }
        printWriter.println(stringBuffer + (String)object);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = 0;
        objectArray2[0] = l2;
        printWriter.println(stringBuffer + (String)((Object)be.a("e", (int)13782, (long)(0x7DC8BD0ECA904A0AL ^ l3))) + (String)((Object)m44.a("t", (Object)((Object)this), (Object)objectArray2, (long)9038862678483975108L, (long)l3)));
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = 1;
        objectArray3[0] = l2;
        printWriter.println(stringBuffer + (String)((Object)be.a("e", (int)6051, (long)(0x5BBCF2F25135687AL ^ l3))) + (String)((Object)m44.a("t", (Object)((Object)this), (Object)objectArray3, (long)9038862678483975108L, (long)l3)));
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = 2;
        objectArray4[0] = l2;
        printWriter.println(stringBuffer + (String)((Object)be.a("e", (int)23258, (long)(0x329F9A36463CA500L ^ l3))) + (String)((Object)m44.a("t", (Object)((Object)this), (Object)objectArray4, (long)9038862678483975108L, (long)l3)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean c(int n2, int n3, long l2) {
        int n4;
        boolean bl;
        block6: {
            l2 = a ^ l2;
            boolean bl2 = this.t(0);
            boolean bl3 = this.t(1);
            CallSite callSite = m44.a("i", (long)7831948982799251543L, (long)l2);
            try {
                try {
                    try {
                        bl = bl2;
                        n4 = n2;
                        if (callSite != false) break block6;
                        if (bl < n4) return false;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("i", (Object)illegalArgumentException, (long)7908647939643193321L, (long)l2);
                    }
                    bl = bl3;
                    if (callSite != false) return bl;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("i", (Object)illegalArgumentException, (long)7908647939643193321L, (long)l2);
                }
                n4 = n3;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("i", (Object)illegalArgumentException, (long)7908647939643193321L, (long)l2);
            }
        }
        if (bl > n4) return false;
        return true;
    }

    void Q(Object[] objectArray) {
        int n2;
        DataOutputStream dataOutputStream;
        block6: {
            jf jf2;
            block4: {
                block5: {
                    DataOutputStream dataOutputStream2 = (DataOutputStream)objectArray[0];
                    long l2 = (Long)objectArray[1];
                    l2 = a ^ l2;
                    CallSite callSite = m44.a("l", (long)-6118752303323817379L, (long)l2);
                    dataOutputStream2.writeShort(this.t(0));
                    CallSite callSite2 = callSite;
                    try {
                        try {
                            dataOutputStream2.writeShort(this.t(1));
                            dataOutputStream2.writeShort(this.t(2));
                            dataOutputStream = dataOutputStream2;
                            jf2 = this.q;
                            if (callSite2 == false) break block4;
                            if (jf2 != null) break block5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("l", (Object)illegalArgumentException, (long)-5603561973696796652L, (long)l2);
                        }
                        n2 = 0;
                        break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)-5603561973696796652L, (long)l2);
                    }
                }
                jf2 = this.q;
            }
            n2 = jf2.E();
        }
        dataOutputStream.writeShort(n2);
    }

    /*
     * Unable to fully structure code
     */
    public void X(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var4_3 = (df)var1_1[1];
        v0 = var2_2 ^ 122312426200344L;
        var5_4 = v0 >>> 16;
        var7_5 = (int)(v0 << 48 >>> 48);
        var9_6 = 0;
        var8_7 = m44.a("i", (long)-5917543569958511448L, (long)var2_2);
        while (var9_6 < this.N.length) {
            var4_3.L(var5_4, (char)var7_5, (Object)((iq)this.N[var9_6]), (Object)this);
            ++var9_6;
lbl16:
            // 2 sources

            ** while (var8_7 == false)
lbl17:
            // 1 sources

        }
lbl18:
        // 2 sources

        if (var2_2 <= 0L) ** GOTO lbl16
    }

    public String i(long l2) {
        block5: {
            jf jf2;
            long l3;
            block4: {
                l3 = (l2 = a ^ l2) ^ 0x14CE1BCB4670L;
                CallSite callSite = m44.a("k", (long)-5932722124112798494L, (long)l2);
                try {
                    try {
                        jf2 = this.q;
                        if (callSite == false) break block4;
                        if (jf2 == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("k", (Object)illegalArgumentException, (long)-5439423072005624149L, (long)l2);
                    }
                    jf2 = this.q;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("k", (Object)illegalArgumentException, (long)-5439423072005624149L, (long)l2);
                }
            }
            return jf2.g(l3);
        }
        return be.a("e", (int)20002, (long)(0x7A7A770A394EFBA2L ^ l2));
    }

    /*
     * Unable to fully structure code
     */
    void b(byte var1_1, DataOutputStream var2_2, Map var3_3, int var4_4, int var5_5) {
        block17: {
            block14: {
                block16: {
                    block15: {
                        var6_6 = ((long)var1_1 << 56 | (long)var4_4 << 32 >>> 8 | (long)var5_5 << 40 >>> 40) ^ be.a;
                        v0 = m44.a("j", (long)-275949188525741876L, (long)var6_6);
                        var2_2.writeShort(this.t(0));
                        var2_2.writeShort(this.t(1));
                        var8_7 = v0;
                        try {
                            v1 = var2_2;
                            v2 = this.t(2);
                            if (var8_7 != false) break block14;
                            v1.writeShort(v2);
                            if (this.q != null) {
                            }
                            ** GOTO lbl45
                        }
                        catch (IllegalArgumentException v3) {
                            throw m44.a("j", (Object)v3, (long)-190799557038692494L, (long)var6_6);
                        }
                        var9_8 = (js)var3_3.get(this.q);
                        try {
                            try {
                                v4 = var8_7;
                                if (var5_5 <= 0) ** GOTO lbl34
                                if (v4 != false) break block15;
                                if (var9_8 != null) {
                                }
                                ** GOTO lbl37
                            }
                            catch (IllegalArgumentException v5) {
                                throw m44.a("j", (Object)v5, (long)-190799557038692494L, (long)var6_6);
                            }
                            var2_2.writeShort(var9_8.E());
                        }
                        catch (IllegalArgumentException v6) {
                            throw m44.a("j", (Object)v6, (long)-190799557038692494L, (long)var6_6);
                        }
                    }
                    try {
                        v4 = var8_7;
lbl34:
                        // 2 sources

                        if (var5_5 > 0) {
                            if (v4 == false) break block16;
                        }
                        ** GOTO lbl44
lbl37:
                        // 2 sources

                        var2_2.writeShort(this.q.E());
                    }
                    catch (IllegalArgumentException v7) {
                        throw m44.a("j", (Object)v7, (long)-190799557038692494L, (long)var6_6);
                    }
                }
                try {
                    v4 = var8_7;
lbl44:
                    // 2 sources

                    if (v4 == false) break block17;
lbl45:
                    // 2 sources

                    v1 = var2_2;
                    v2 = 0;
                }
                catch (IllegalArgumentException v8) {
                    throw m44.a("j", (Object)v8, (long)-190799557038692494L, (long)var6_6);
                }
            }
            v1.writeShort(v2);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                be.a = prr.a((long)-8352169274979460759L, (long)-4723896715478251016L, MethodHandles.lookup().lookupClass()).a(46502410605414L);
                be.d = new HashMap<K, V>(13);
                var0 = be.a ^ 74047454977664L;
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
                var9_3 = new String[10];
                var7_4 = 0;
                var6_5 = "\u0091\u0011v\u0004\u00ff\u00bc\u008d\u0097\u00b7\u00ccc4\u00b3\u00d8\u00f0\u00ca\u0001\u00c6L\u00bcJ:/\u00da\u00c4}\u00d7e\u00fd~}\u00de\u00c0\u0094\u00a1\u0006\u00e7\u00fe{\u0082\u009b\u00d0\u00be!V$\u009bDV\u00d6-\u00c7\u00c2\u0082\u00a2\u00eb(w\u00e5\u00b3\u00a0*Syj%\u0086JW\u00ccFB\u00a2\u00f3\u0019|\u00a1\u0099\u00a5\u00e9\u00b4\u009a\u00b0\u00fb\u00d4\u00cdz\u00e5WIc\u0096\u0085\u00ed\fOk(\u00cbBw\u00f3j\u00b4:\u00aedj\u001e\u009b\u00f9\u00fe6\u0003Qd\u00b4\u008f\u00f4T\u00f2\u0083\u00c6\u0093\u00be0g\u0087\f\u009b\u007f)\u0013\u009c1\u0000RW\u0010\u00b5}V\u009c\u00b0\u00bcPX\u00baKY`n\u001a\u00db\u00fb(u\u00a7\u000b<\u0094@\u009e\u00a9\u00ac\u0096qcn\u00f6!\u00a2Ey\\\u00dfW\u009dT\u0012CP8\u00ba\u0017\u00fa\u0001J\u00cf\u00a8\u00d5\u00cc4\\\u00fa\u00e1\u0018\u00d9\u00b1Jb\u00be\u00b2\u00e9]O#>*mL\u009cl\u0081\u00eb\u0098\u00b1\u001b\u008b\u00db2\u0010\u00a5\u00b8D^\u0091\u00d0o\u0012\u00d4\u0094\u0086\u00bb\u001e`\u0098\u0006 \u00e4\u00f3\u00f7V\u00c7v\u001c\u0001u\u00a3YT\u0087\b\u008d\u00a7\u00ef@9\u00a8\u00a5\u001a\u0084\u0092J\u00ae\u0082{\u0017\u0089\u00ecQ";
                var8_6 = "\u0091\u0011v\u0004\u00ff\u00bc\u008d\u0097\u00b7\u00ccc4\u00b3\u00d8\u00f0\u00ca\u0001\u00c6L\u00bcJ:/\u00da\u00c4}\u00d7e\u00fd~}\u00de\u00c0\u0094\u00a1\u0006\u00e7\u00fe{\u0082\u009b\u00d0\u00be!V$\u009bDV\u00d6-\u00c7\u00c2\u0082\u00a2\u00eb(w\u00e5\u00b3\u00a0*Syj%\u0086JW\u00ccFB\u00a2\u00f3\u0019|\u00a1\u0099\u00a5\u00e9\u00b4\u009a\u00b0\u00fb\u00d4\u00cdz\u00e5WIc\u0096\u0085\u00ed\fOk(\u00cbBw\u00f3j\u00b4:\u00aedj\u001e\u009b\u00f9\u00fe6\u0003Qd\u00b4\u008f\u00f4T\u00f2\u0083\u00c6\u0093\u00be0g\u0087\f\u009b\u007f)\u0013\u009c1\u0000RW\u0010\u00b5}V\u009c\u00b0\u00bcPX\u00baKY`n\u001a\u00db\u00fb(u\u00a7\u000b<\u0094@\u009e\u00a9\u00ac\u0096qcn\u00f6!\u00a2Ey\\\u00dfW\u009dT\u0012CP8\u00ba\u0017\u00fa\u0001J\u00cf\u00a8\u00d5\u00cc4\\\u00fa\u00e1\u0018\u00d9\u00b1Jb\u00be\u00b2\u00e9]O#>*mL\u009cl\u0081\u00eb\u0098\u00b1\u001b\u008b\u00db2\u0010\u00a5\u00b8D^\u0091\u00d0o\u0012\u00d4\u0094\u0086\u00bb\u001e`\u0098\u0006 \u00e4\u00f3\u00f7V\u00c7v\u001c\u0001u\u00a3YT\u0087\b\u008d\u00a7\u00ef@9\u00a8\u00a5\u001a\u0084\u0092J\u00ae\u0082{\u0017\u0089\u00ecQ".length();
                var5_7 = 56;
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
                    var9_3[var7_4++] = be.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00e7O:/\u00f3v\u0002\u008dq\u00f6s\u009e\u00d4\u0014\u0086\u0088\u000f\u0015`w\u00fcH\u00b94\u00be\u0097t\u00e8\u00ce\u00d6\u00da\u008d\u00ef\u0011+T\u00e2\u00c3\u00f09\u0010\u0095^y\u00b7\u0018\u001be\u00dc\u0098\b\u00e3\u00b5<fJ\u008b";
                    var8_6 = "\u00e7O:/\u00f3v\u0002\u008dq\u00f6s\u009e\u00d4\u0014\u0086\u0088\u000f\u0015`w\u00fcH\u00b94\u00be\u0097t\u00e8\u00ce\u00d6\u00da\u008d\u00ef\u0011+T\u00e2\u00c3\u00f09\u0010\u0095^y\u00b7\u0018\u001be\u00dc\u0098\b\u00e3\u00b5<fJ\u008b".length();
                    var5_7 = 40;
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
                    var9_3[var7_4++] = be.a(var10_9).intern();
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
        be.b = var9_3;
        be.c = new String[10];
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static String a(byte[] byArray) {
        int n2 = 0;
        int n3 = byArray.length;
        char[] cArray = new char[n3];
        for (int i = 0; i < n3; ++i) {
            char c;
            int n4 = 0xFF & byArray[i];
            if (n4 < 192) {
                cArray[n2++] = (char)n4;
                continue;
            }
            if (n4 < 224) {
                c = (char)((char)(n4 & 0x1F) << 6);
                n4 = byArray[++i];
                c = (char)(c | (char)(n4 & 0x3F));
                cArray[n2++] = c;
                continue;
            }
            if (i >= n3 - 2) continue;
            c = (char)((char)(n4 & 0xF) << 12);
            n4 = byArray[++i];
            c = (char)(c | (char)(n4 & 0x3F) << 6);
            n4 = byArray[++i];
            c = (char)(c | (char)(n4 & 0x3F));
            cArray[n2++] = c;
        }
        return new String(cArray, 0, n2);
    }

    private static String a(int n2, long l2) {
        int n3 = n2 ^ (int)(l2 & 0x7FFFL) ^ 0xB3C;
        if (c[n3] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/be", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l2 << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n3].getBytes("ISO-8859-1");
            be.c[n3] = be.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n3];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = be.a(n2, l2);
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
            throw new RuntimeException("com/zelix/be" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(be.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
