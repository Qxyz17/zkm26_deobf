/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ad;
import com.zelix.lbd;
import com.zelix.lka;
import com.zelix.lmq;
import com.zelix.lqi;
import com.zelix.m44;
import com.zelix.og;
import com.zelix.p0;
import com.zelix.p1;
import com.zelix.p5;
import com.zelix.p7;
import com.zelix.p8;
import com.zelix.p9;
import com.zelix.pa;
import com.zelix.pc;
import com.zelix.pd;
import com.zelix.pe;
import com.zelix.pf;
import com.zelix.pg;
import com.zelix.pj;
import com.zelix.pl;
import com.zelix.pm;
import com.zelix.pn;
import com.zelix.pr;
import com.zelix.prr;
import com.zelix.ps;
import com.zelix.pt;
import com.zelix.pv;
import com.zelix.pw;
import com.zelix.q0;
import com.zelix.q3;
import com.zelix.q5;
import com.zelix.q8;
import com.zelix.q_;
import com.zelix.qb;
import com.zelix.qc;
import com.zelix.qd;
import com.zelix.qg;
import com.zelix.qh;
import com.zelix.qi;
import com.zelix.qj;
import com.zelix.qk;
import com.zelix.qm;
import com.zelix.qo;
import com.zelix.qq;
import com.zelix.qs;
import com.zelix.qt;
import com.zelix.qw;
import com.zelix.qx;
import com.zelix.qz;
import com.zelix.t;
import com.zelix.v1;
import com.zelix.v4;
import com.zelix.vc;
import com.zelix.vd;
import com.zelix.vf;
import com.zelix.vr;
import com.zelix.vz;
import com.zelix.yk;
import com.zelix.zl;
import com.zelix.zq;
import com.zelix.zx;
import java.io.Reader;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lqz
implements lqi,
lmq {
    private int h;
    private boolean z;
    private List x;
    int U;
    private lbd s;
    private int[] J;
    private final int[] m;
    private static int[] I;
    private final og[] N;
    protected vc V;
    private static int[] L;
    yk C;
    public lka P;
    public lbd p;
    private final ad Q;
    private int[] l;
    private int S;
    private static int[] F;
    private static int[] g;
    private int R;
    public lbd o;
    private int D;
    private static int[] v;
    private lbd X;
    private int b;
    private static final long a;
    private static final String c;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;

    private boolean Z(Object[] objectArray) {
        Object object;
        block10: {
            block11: {
                CallSite callSite;
                long l10;
                block8: {
                    long l11;
                    block9: {
                        l10 = (Long)objectArray[0];
                        long l12 = l10 = a ^ l10;
                        l11 = l12 ^ 0x549B9543FDFEL;
                        long l13 = l12 ^ 0x61A25B90013BL;
                        CallSite callSite2 = m44.a("r", (Object)this, (long)1858975008919733775L, (long)l10);
                        callSite = m44.a("l", (long)2039895545202852429L, (long)l10);
                        try {
                            try {
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l13;
                                object = m44.a("m", (Object)this, (Object)objectArray2, (long)2050442053711359918L, (long)l10);
                                if (callSite != null) break block8;
                                if (object == false) break block9;
                            }
                            catch (RuntimeException runtimeException) {
                                throw m44.a("l", (Object)runtimeException, (long)2241082211711537493L, (long)l10);
                            }
                            m44.a("p", (Object)this, (lbd)((Object)callSite2), (long)1858975008919733775L, (long)l10);
                        }
                        catch (RuntimeException runtimeException) {
                            throw m44.a("l", (Object)runtimeException, (long)2241082211711537493L, (long)l10);
                        }
                    }
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l11;
                    object = m44.a("m", (Object)this, (Object)objectArray3, (long)2019384694946991723L, (long)l10);
                }
                try {
                    try {
                        if (callSite != null) break block10;
                        if (object == false) break block11;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("l", (Object)runtimeException, (long)2241082211711537493L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("l", (Object)runtimeException, (long)2241082211711537493L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Exception decompiling
     */
    public final void y(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[CASE]], but top level block is 1[TRYBLOCK]
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
    public final void u(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = lqz.a ^ var2_2;
        var4_3 = v0 ^ 28123531898192L;
        var6_4 = v0 ^ 72865407808148L;
        var8_5 = v0 ^ 11514229861216L;
        var10_6 = v0 ^ 75909536039231L;
        var12_7 = v0 ^ 68336057146442L;
        v1 = v0 ^ 26953605083195L;
        var14_8 = (int)(v1 >>> 48);
        var15_9 = (int)(v1 << 16 >>> 32);
        var16_10 = (int)(v1 << 48 >>> 48);
        var17_11 = v0 ^ 123222131525623L;
        var19_12 = v0 ^ 125062661535634L;
        var22_13 = new pn((int)lqz.a("r", (int)23581, (long)(876933823185317966L ^ var2_2)), (char)var14_8, var15_9, var16_10);
        var23_14 = true;
        var21_15 = m44.a("j", (long)-4937784075574811269L, (long)var2_2);
        v2 = new Object[2];
        v2[1] = var22_13;
        v2[0] = var17_11;
        m44.a("u", (Object)m44.a("t", (Object)this, (long)-6549374025425565835L, (long)var2_2), (Object)v2, (long)-6820338430953476201L, (long)var2_2);
        try {
            v3 = new Object[2];
            v3[1] = var10_6;
            v3[0] = (int)lqz.a("r", (int)32232, (long)(3212080966639571230L ^ var2_2));
            var24_16 = m44.a("k", (Object)this, (Object)v3, (long)-6568507981410438708L, (long)var2_2);
            m44.a("v", (Object)this, (int)lqz.a("r", (int)5660, (long)(8369947263795444498L ^ var2_2)), (long)-6434540753519697302L, (long)var2_2);
            v4 = new Object[1];
            v4[0] = var6_4;
            m44.a("u", (Object)this, (Object)v4, (long)-6875235531648048098L, (long)var2_2);
            v5 = new Object[3];
            v5[2] = true;
            v5[1] = var22_13;
            v5[0] = var19_12;
            m44.a("u", (Object)m44.a("t", (Object)this, (long)-6549374025425565835L, (long)var2_2), (Object)v5, (long)-5060127323837799358L, (long)var2_2);
            var23_14 = false;
            v6 = new Object[2];
            v6[1] = (int)m44.a("t", (Object)var24_16, (long)-5055515402487951749L, (long)var2_2);
            v6[0] = var8_5;
            m44.a("u", (Object)var22_13, (Object)v6, (long)-4752398334254456042L, (long)var2_2);
            ** if (var21_15 != null) goto lbl-1000
        }
        catch (Throwable var25_17) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block26: {
                                    block27: {
                                        if (var2_2 <= 0L) break block26;
                                        v9 = var23_14;
                                        if (var21_15 != null) break block27;
                                        try {
                                            block32: {
                                                if (!v9) ** GOTO lbl88
                                                break block32;
                                                catch (Throwable v10) {
                                                    throw m44.a("j", (Object)v10, (long)-5174721878056700317L, (long)var2_2);
                                                }
                                            }
                                            v11 = new Object[2];
                                            v11[1] = var12_7;
                                            v11[0] = var22_13;
                                            m44.a("u", (Object)m44.a("t", (Object)this, (long)-6549374025425565835L, (long)var2_2), (Object)v11, (long)-6866346223137972531L, (long)var2_2);
                                            v9 = false;
                                        }
                                        catch (Throwable v12) {
                                            throw m44.a("j", (Object)v12, (long)-5174721878056700317L, (long)var2_2);
                                        }
                                    }
                                    var23_14 = v9;
                                }
                                try {
                                    if (var2_2 < 0L || var21_15 == null) break block28;
lbl88:
                                    // 2 sources

                                    v13 = new Object[1];
                                    v13[0] = var4_3;
                                    m44.a("u", (Object)m44.a("t", (Object)this, (long)-6549374025425565835L, (long)var2_2), (Object)v13, (long)-6847767473514781197L, (long)var2_2);
                                }
                                catch (Throwable v14) {
                                    throw m44.a("j", (Object)v14, (long)-5174721878056700317L, (long)var2_2);
                                }
                            }
                            v15 = var25_17 instanceof RuntimeException;
                            if (var2_2 < 0L || var21_15 != null) break block29;
                            try {
                                block33: {
                                    if (!v15) break block30;
                                    break block33;
                                    catch (Throwable v16) {
                                        throw m44.a("j", (Object)v16, (long)-5174721878056700317L, (long)var2_2);
                                    }
                                }
                                throw (RuntimeException)var25_17;
                            }
                            catch (Throwable v17) {
                                throw m44.a("j", (Object)v17, (long)-5174721878056700317L, (long)var2_2);
                            }
                        }
                        try {
                            v18 = var25_17;
                            if (var21_15 != null) break block31;
                            v15 = v18 instanceof t;
                        }
                        catch (Throwable v19) {
                            throw m44.a("j", (Object)v19, (long)-5174721878056700317L, (long)var2_2);
                        }
                    }
                    try {
                        if (v15) {
                            throw (t)var25_17;
                        }
                    }
                    catch (Throwable v20) {
                        throw m44.a("j", (Object)v20, (long)-5174721878056700317L, (long)var2_2);
                    }
                    v18 = var25_17;
                }
                throw (Error)v18;
            }
            catch (Throwable var26_18) {
                try {
                    if (var2_2 >= 0L && var23_14) {
                        v21 = new Object[3];
                        v21[2] = true;
                        v21[1] = var22_13;
                        v21[0] = var19_12;
                        m44.a("u", (Object)m44.a("t", (Object)this, (long)-6549374025425565835L, (long)var2_2), (Object)v21, (long)-5060127323837799358L, (long)var2_2);
                    }
                }
                catch (Throwable v22) {
                    throw m44.a("j", (Object)v22, (long)-5174721878056700317L, (long)var2_2);
                }
                throw var26_18;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var23_14) ** GOTO lbl140
                v7 = new Object[3];
                v7[2] = true;
                v7[1] = var22_13;
                v7[0] = var19_12;
                m44.a("u", (Object)m44.a("t", (Object)this, (long)-6549374025425565835L, (long)var2_2), (Object)v7, (long)-5060127323837799358L, (long)var2_2);
            }
            catch (Throwable v8) {
                throw m44.a("j", (Object)v8, (long)-5174721878056700317L, (long)var2_2);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl140:
        // 3 sources

    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean D(Object[] objectArray) {
        Object object;
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x4D3213A4050AL;
        long l13 = l11 ^ 0x30A5F86736B4L;
        CallSite callSite = m44.a("k", (long)8414989040204425930L, (long)l10);
        m44.a("w", (Object)this, (int)n10, (long)8533890887650960770L, (long)l10);
        CallSite callSite2 = callSite;
        CallSite callSite3 = m44.a("u", (Object)this, (long)7520251794871871964L, (long)l10);
        m44.a("w", (Object)this, (lbd)((Object)callSite3), (long)8163695893736468104L, (long)l10);
        m44.a("w", (Object)this, (lbd)((Object)callSite3), (long)7843280140714525919L, (long)l10);
        try {
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l13;
            Object object2 = m44.a("j", (Object)this, (Object)objectArray2, (long)8018546282752333914L, (long)l10);
            if (callSite2 == null) {
                object2 = object2 == false ? (Object)true : (Object)false;
            }
            object = object2;
        }
        catch (ad ad2) {
            boolean bl2;
            try {
                bl2 = true;
            }
            catch (Throwable throwable) {
                Object[] objectArray3 = new Object[3];
                objectArray3[2] = n10;
                objectArray3[1] = l12;
                objectArray3[0] = 3;
                m44.a("j", (Object)this, (Object)objectArray3, (long)8565900095164051874L, (long)l10);
                throw throwable;
            }
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = n10;
            objectArray4[1] = l12;
            objectArray4[0] = 3;
            m44.a("j", (Object)this, (Object)objectArray4, (long)8565900095164051874L, (long)l10);
            return bl2;
        }
        Object[] objectArray5 = new Object[3];
        objectArray5[2] = n10;
        objectArray5[1] = l12;
        objectArray5[0] = 3;
        m44.a("j", (Object)this, (Object)objectArray5, (long)8565900095164051874L, (long)l10);
        return (boolean)object;
    }

    /*
     * Exception decompiling
     */
    private void K6(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[CASE]], but top level block is 2[TRYBLOCK]
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

    private boolean y(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x1972E7788FC8L;
                CallSite callSite = m44.a("h", (long)7569280531413579529L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)lqz.a("r", (int)17374, (long)(0x48FDE4E7AABFBCA0L ^ l10));
                        object = m44.a("i", (Object)this, (Object)objectArray2, (long)7607432476817493355L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("h", (Object)runtimeException, (long)7664487608652342289L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("h", (Object)runtimeException, (long)7664487608652342289L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    private boolean h(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0xDB1F7703352L;
                CallSite callSite = m44.a("j", (long)-3057548008458089581L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)lqz.a("r", (int)777, (long)(0x17051697102E4193L ^ l10));
                        object = m44.a("k", (Object)this, (Object)objectArray2, (long)-3095922055167430159L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("j", (Object)runtimeException, (long)-2970213993356748661L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("j", (Object)runtimeException, (long)-2970213993356748661L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     */
    public final void d(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = lqz.a ^ var2_2;
        var4_3 = v0 ^ 56461700219606L;
        var6_4 = v0 ^ 35969732543718L;
        var8_5 = v0 ^ 122887979364025L;
        v1 = v0 ^ 45857068058759L;
        var10_6 = v1 >>> 8;
        var12_7 = (int)(v1 << 56 >>> 56);
        var13_8 = v0 ^ 50387958426731L;
        var15_9 = v0 ^ 22989833532364L;
        var17_10 = v0 ^ 99917680207985L;
        var19_11 = v0 ^ 100538426775572L;
        var22_12 = new pa(var10_6, (int)lqz.a("r", (int)8823, (long)(1237535366114353641L ^ var2_2)), (byte)var12_7);
        var23_13 = true;
        var21_14 = m44.a("l", (long)-7710341484163282179L, (long)var2_2);
        v2 = new Object[2];
        v2[1] = var22_12;
        v2[0] = var17_10;
        m44.a("s", (Object)m44.a("r", (Object)this, (long)-8458365071445989133L, (long)var2_2), (Object)v2, (long)-8151690580982267887L, (long)var2_2);
        try {
            v3 = new Object[2];
            v3[1] = var8_5;
            v3[0] = (int)lqz.a("r", (int)25982, (long)(4537903010027890311L ^ var2_2));
            var24_15 = m44.a("m", (Object)this, (Object)v3, (long)-8407708111195644342L, (long)var2_2);
            m44.a("p", (Object)this, (int)lqz.a("r", (int)2696, (long)(5651691034398689628L ^ var2_2)), (long)-8559722723748999700L, (long)var2_2);
            v4 = new Object[1];
            v4[0] = var13_8;
            m44.a("s", (Object)this, (Object)v4, (long)-8297132499002504081L, (long)var2_2);
            v5 = new Object[3];
            v5[2] = true;
            v5[1] = var22_12;
            v5[0] = var19_11;
            m44.a("s", (Object)m44.a("r", (Object)this, (long)-8458365071445989133L, (long)var2_2), (Object)v5, (long)-7619813714864944188L, (long)var2_2);
            var23_13 = false;
            v6 = new Object[2];
            v6[1] = (int)m44.a("r", (Object)var24_15, (long)-7615277694380039683L, (long)var2_2);
            v6[0] = var6_4;
            m44.a("s", (Object)var22_12, (Object)v6, (long)-7959483236425413488L, (long)var2_2);
            ** if (var21_14 != null) goto lbl-1000
        }
        catch (Throwable var25_16) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block26: {
                                    block27: {
                                        if (var2_2 <= 0L) break block26;
                                        v9 = var23_13;
                                        if (var21_14 != null) break block27;
                                        try {
                                            block32: {
                                                if (!v9) ** GOTO lbl87
                                                break block32;
                                                catch (Throwable v10) {
                                                    throw m44.a("l", (Object)v10, (long)-7518307608281097755L, (long)var2_2);
                                                }
                                            }
                                            v11 = new Object[2];
                                            v11[1] = var15_9;
                                            v11[0] = var22_12;
                                            m44.a("s", (Object)m44.a("r", (Object)this, (long)-8458365071445989133L, (long)var2_2), (Object)v11, (long)-8127875055273037493L, (long)var2_2);
                                            v9 = false;
                                        }
                                        catch (Throwable v12) {
                                            throw m44.a("l", (Object)v12, (long)-7518307608281097755L, (long)var2_2);
                                        }
                                    }
                                    var23_13 = v9;
                                }
                                try {
                                    if (var2_2 <= 0L || var21_14 == null) break block28;
lbl87:
                                    // 2 sources

                                    v13 = new Object[1];
                                    v13[0] = var4_3;
                                    m44.a("s", (Object)m44.a("r", (Object)this, (long)-8458365071445989133L, (long)var2_2), (Object)v13, (long)-8110423219324302731L, (long)var2_2);
                                }
                                catch (Throwable v14) {
                                    throw m44.a("l", (Object)v14, (long)-7518307608281097755L, (long)var2_2);
                                }
                            }
                            v15 = var25_16 instanceof RuntimeException;
                            if (var2_2 <= 0L || var21_14 != null) break block29;
                            try {
                                block33: {
                                    if (!v15) break block30;
                                    break block33;
                                    catch (Throwable v16) {
                                        throw m44.a("l", (Object)v16, (long)-7518307608281097755L, (long)var2_2);
                                    }
                                }
                                throw (RuntimeException)var25_16;
                            }
                            catch (Throwable v17) {
                                throw m44.a("l", (Object)v17, (long)-7518307608281097755L, (long)var2_2);
                            }
                        }
                        try {
                            v18 = var25_16;
                            if (var21_14 != null) break block31;
                            v15 = v18 instanceof t;
                        }
                        catch (Throwable v19) {
                            throw m44.a("l", (Object)v19, (long)-7518307608281097755L, (long)var2_2);
                        }
                    }
                    try {
                        if (v15) {
                            throw (t)var25_16;
                        }
                    }
                    catch (Throwable v20) {
                        throw m44.a("l", (Object)v20, (long)-7518307608281097755L, (long)var2_2);
                    }
                    v18 = var25_16;
                }
                throw (Error)v18;
            }
            catch (Throwable var26_17) {
                try {
                    if (var2_2 > 0L && var23_13) {
                        v21 = new Object[3];
                        v21[2] = true;
                        v21[1] = var22_12;
                        v21[0] = var19_11;
                        m44.a("s", (Object)m44.a("r", (Object)this, (long)-8458365071445989133L, (long)var2_2), (Object)v21, (long)-7619813714864944188L, (long)var2_2);
                    }
                }
                catch (Throwable v22) {
                    throw m44.a("l", (Object)v22, (long)-7518307608281097755L, (long)var2_2);
                }
                throw var26_17;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var23_13) ** GOTO lbl139
                v7 = new Object[3];
                v7[2] = true;
                v7[1] = var22_12;
                v7[0] = var19_11;
                m44.a("s", (Object)m44.a("r", (Object)this, (long)-8458365071445989133L, (long)var2_2), (Object)v7, (long)-7619813714864944188L, (long)var2_2);
            }
            catch (Throwable v8) {
                throw m44.a("l", (Object)v8, (long)-7518307608281097755L, (long)var2_2);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl139:
        // 3 sources

    }

    /*
     * Unable to fully structure code
     */
    public final void R(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = lqz.a ^ var2_2;
        var4_3 = v0 ^ 6672164284097L;
        var6_4 = v0 ^ 24179110781169L;
        var8_5 = v0 ^ 99572075842222L;
        var10_6 = v0 ^ 27043868854396L;
        var12_7 = v0 ^ 128207844025286L;
        var14_8 = v0 ^ 36987263440859L;
        var16_9 = v0 ^ 122684092140646L;
        var18_10 = v0 ^ 121200040246275L;
        var21_11 = new vz(var12_7, (int)lqz.a("r", (int)8798, (long)(9111033908728563036L ^ var2_2)));
        var22_12 = true;
        var20_13 = m44.a("k", (long)3524181117942099690L, (long)var2_2);
        v1 = new Object[2];
        v1[1] = var21_11;
        v1[0] = var16_9;
        m44.a("t", (Object)m44.a("u", (Object)this, (long)3353752921518722276L, (long)var2_2), (Object)v1, (long)3082808298148799494L, (long)var2_2);
        try {
            v2 = new Object[2];
            v2[1] = var8_5;
            v2[0] = (int)lqz.a("r", (int)1316, (long)(4077818723044041350L ^ var2_2));
            var23_14 = m44.a("j", (Object)this, (Object)v2, (long)3406664497483348573L, (long)var2_2);
            m44.a("w", (Object)this, (int)lqz.a("r", (int)12434, (long)(5903703473647425524L ^ var2_2)), (long)3252431002549922299L, (long)var2_2);
            v3 = new Object[1];
            v3[0] = var10_6;
            m44.a("t", (Object)this, (Object)v3, (long)2940178449034504312L, (long)var2_2);
            v4 = new Object[3];
            v4[2] = true;
            v4[1] = var21_11;
            v4[0] = var18_10;
            m44.a("t", (Object)m44.a("u", (Object)this, (long)3353752921518722276L, (long)var2_2), (Object)v4, (long)3627595105272983507L, (long)var2_2);
            var22_12 = false;
            v5 = new Object[2];
            v5[1] = (int)m44.a("u", (Object)var23_14, (long)3622631344496641514L, (long)var2_2);
            v5[0] = var6_4;
            m44.a("t", (Object)var21_11, (Object)v5, (long)3863254370007214215L, (long)var2_2);
            ** if (var20_13 != null) goto lbl-1000
        }
        catch (Throwable var24_15) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block26: {
                                    block27: {
                                        if (var2_2 <= 0L) break block26;
                                        v8 = var22_12;
                                        if (var20_13 != null) break block27;
                                        try {
                                            block32: {
                                                if (!v8) ** GOTO lbl84
                                                break block32;
                                                catch (Throwable v9) {
                                                    throw m44.a("k", (Object)v9, (long)3728609247779847666L, (long)var2_2);
                                                }
                                            }
                                            v10 = new Object[2];
                                            v10[1] = var14_8;
                                            v10[0] = var21_11;
                                            m44.a("t", (Object)m44.a("u", (Object)this, (long)3353752921518722276L, (long)var2_2), (Object)v10, (long)3108831710584739164L, (long)var2_2);
                                            v8 = false;
                                        }
                                        catch (Throwable v11) {
                                            throw m44.a("k", (Object)v11, (long)3728609247779847666L, (long)var2_2);
                                        }
                                    }
                                    var22_12 = v8;
                                }
                                try {
                                    if (var2_2 <= 0L || var20_13 == null) break block28;
lbl84:
                                    // 2 sources

                                    v12 = new Object[1];
                                    v12[0] = var4_3;
                                    m44.a("t", (Object)m44.a("u", (Object)this, (long)3353752921518722276L, (long)var2_2), (Object)v12, (long)3127407198296534626L, (long)var2_2);
                                }
                                catch (Throwable v13) {
                                    throw m44.a("k", (Object)v13, (long)3728609247779847666L, (long)var2_2);
                                }
                            }
                            v14 = var24_15 instanceof RuntimeException;
                            if (var2_2 < 0L || var20_13 != null) break block29;
                            try {
                                block33: {
                                    if (!v14) break block30;
                                    break block33;
                                    catch (Throwable v15) {
                                        throw m44.a("k", (Object)v15, (long)3728609247779847666L, (long)var2_2);
                                    }
                                }
                                throw (RuntimeException)var24_15;
                            }
                            catch (Throwable v16) {
                                throw m44.a("k", (Object)v16, (long)3728609247779847666L, (long)var2_2);
                            }
                        }
                        try {
                            v17 = var24_15;
                            if (var20_13 != null) break block31;
                            v14 = v17 instanceof t;
                        }
                        catch (Throwable v18) {
                            throw m44.a("k", (Object)v18, (long)3728609247779847666L, (long)var2_2);
                        }
                    }
                    try {
                        if (v14) {
                            throw (t)var24_15;
                        }
                    }
                    catch (Throwable v19) {
                        throw m44.a("k", (Object)v19, (long)3728609247779847666L, (long)var2_2);
                    }
                    v17 = var24_15;
                }
                throw (Error)v17;
            }
            catch (Throwable var25_16) {
                try {
                    if (var2_2 > 0L && var22_12) {
                        v20 = new Object[3];
                        v20[2] = true;
                        v20[1] = var21_11;
                        v20[0] = var18_10;
                        m44.a("t", (Object)m44.a("u", (Object)this, (long)3353752921518722276L, (long)var2_2), (Object)v20, (long)3627595105272983507L, (long)var2_2);
                    }
                }
                catch (Throwable v21) {
                    throw m44.a("k", (Object)v21, (long)3728609247779847666L, (long)var2_2);
                }
                throw var25_16;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var22_12) ** GOTO lbl136
                v6 = new Object[3];
                v6[2] = true;
                v6[1] = var21_11;
                v6[0] = var18_10;
                m44.a("t", (Object)m44.a("u", (Object)this, (long)3353752921518722276L, (long)var2_2), (Object)v6, (long)3627595105272983507L, (long)var2_2);
            }
            catch (Throwable v7) {
                throw m44.a("k", (Object)v7, (long)3728609247779847666L, (long)var2_2);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl136:
        // 3 sources

    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void KZ(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x368D569112D5L;
        long l13 = l11 ^ 0xA62ACA1A7B4L;
        long l14 = l11 ^ 0x451061DB4DEBL;
        long l15 = l11 ^ 0x700B9255CB23L;
        long l16 = l11 ^ 0x71A41AB6FB46L;
        vf vf2 = new vf((int)lqz.a("r", (int)31493, (long)(0x5463E54E59605B0BL ^ l10)), l12);
        CallSite callSite = m44.a("n", (long)-5211377729060116049L, (long)l10);
        boolean bl2 = true;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = vf2;
        objectArray2[0] = l15;
        m44.a("q", (Object)m44.a("p", (Object)this, (long)-6210478058187273311L, (long)l10), (Object)objectArray2, (long)-5941010628689288381L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l14;
            objectArray3[0] = (int)lqz.a("r", (int)27777, (long)(0x1A2CA341EED54C4EL ^ l10));
            CallSite callSite2 = m44.a("o", (Object)this, (Object)objectArray3, (long)-6339950275377005288L, (long)l10);
            m44.a("r", (Object)this, (int)lqz.a("r", (int)13435, (long)(0xC621EA0A2D394C4L ^ l10)), (long)-6167702380858429762L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = vf2;
            objectArray4[0] = l16;
            m44.a("q", (Object)m44.a("p", (Object)this, (long)-6210478058187273311L, (long)l10), (Object)objectArray4, (long)-5399023101024180074L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("p", (Object)callSite2, (long)-5403418380004392273L, (long)l10);
            objectArray5[0] = l13;
            m44.a("q", (Object)vf2, (Object)objectArray5, (long)-5559668457149042750L, (long)l10);
            if (callSite != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 <= 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = vf2;
                objectArray6[0] = l16;
                m44.a("q", (Object)m44.a("p", (Object)this, (long)-6210478058187273311L, (long)l10), (Object)objectArray6, (long)-5399023101024180074L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("n", (Object)runtimeException, (long)-5405531471957329225L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = vf2;
            objectArray7[0] = l16;
            m44.a("q", (Object)m44.a("p", (Object)this, (long)-6210478058187273311L, (long)l10), (Object)objectArray7, (long)-5399023101024180074L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("n", (Object)runtimeException, (long)-5405531471957329225L, (long)l10);
        }
    }

    /*
     * Exception decompiling
     */
    public final void KQ(Object[] var1_1) {
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
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void g(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x556FBD39DE08L;
        long l13 = l11 ^ 0x1A1D70433457L;
        long l14 = l11 ^ 0x7C96CB793EF7L;
        long l15 = l11 ^ 0x2F0683CDB29FL;
        long l16 = l11 ^ 0x2EA90B2E82FAL;
        v4 v42 = new v4(l14, (int)lqz.a("r", (int)15462, (long)(0x23D223FD18E52FL ^ l10)));
        boolean bl2 = true;
        CallSite callSite = m44.a("j", (long)-3598049976453361645L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = v42;
        objectArray2[0] = l15;
        m44.a("u", (Object)m44.a("t", (Object)this, (long)-3426205701377379811L, (long)l10), (Object)objectArray2, (long)-3156718489260008705L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l13;
            objectArray3[0] = (int)lqz.a("r", (int)26756, (long)(0x1C96CFD43C84311DL ^ l10));
            CallSite callSite2 = m44.a("k", (Object)this, (Object)objectArray3, (long)-3332760628529265500L, (long)l10);
            m44.a("v", (Object)this, (int)lqz.a("r", (int)26756, (long)(0x1C96CFD43C84311DL ^ l10)), (long)-3180750448113854718L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = v42;
            objectArray4[0] = l16;
            m44.a("u", (Object)m44.a("t", (Object)this, (long)-3426205701377379811L, (long)l10), (Object)objectArray4, (long)-3697862021689437910L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("t", (Object)callSite2, (long)-3693113796330652909L, (long)l10);
            objectArray5[0] = l12;
            m44.a("u", (Object)v42, (Object)objectArray5, (long)-3790823675910449538L, (long)l10);
            if (callSite != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 < 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = v42;
                objectArray6[0] = l16;
                m44.a("u", (Object)m44.a("t", (Object)this, (long)-3426205701377379811L, (long)l10), (Object)objectArray6, (long)-3697862021689437910L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("j", (Object)runtimeException, (long)-3654690025426025717L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = v42;
            objectArray7[0] = l16;
            m44.a("u", (Object)m44.a("t", (Object)this, (long)-3426205701377379811L, (long)l10), (Object)objectArray7, (long)-3697862021689437910L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("j", (Object)runtimeException, (long)-3654690025426025717L, (long)l10);
        }
    }

    /*
     * Exception decompiling
     */
    public final void K1(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 2[TRYBLOCK]
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
    public final void Ku(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 2[TRYBLOCK]
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
    public final void F(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 2[TRYBLOCK]
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
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean x(Object[] objectArray) {
        Object object;
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x6E022468FC5DL;
        long l13 = l11 ^ 0xF7C287943C0L;
        CallSite callSite = m44.a("l", (long)-8241823976591174755L, (long)l10);
        m44.a("p", (Object)this, (int)n10, (long)-8126363189439095595L, (long)l10);
        CallSite callSite2 = callSite;
        CallSite callSite3 = m44.a("r", (Object)this, (long)-7995457131013205877L, (long)l10);
        m44.a("p", (Object)this, (lbd)((Object)callSite3), (long)-8638918823938435105L, (long)l10);
        m44.a("p", (Object)this, (lbd)((Object)callSite3), (long)-7669684540991423096L, (long)l10);
        try {
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l13;
            Object object2 = m44.a("m", (Object)this, (Object)objectArray2, (long)-7922734225702936457L, (long)l10);
            if (callSite2 == null) {
                object2 = object2 == false ? (Object)true : (Object)false;
            }
            object = object2;
        }
        catch (ad ad2) {
            boolean bl2;
            try {
                bl2 = true;
            }
            catch (Throwable throwable) {
                Object[] objectArray3 = new Object[3];
                objectArray3[2] = n10;
                objectArray3[1] = l12;
                objectArray3[0] = 4;
                m44.a("m", (Object)this, (Object)objectArray3, (long)-8090976281510803211L, (long)l10);
                throw throwable;
            }
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = n10;
            objectArray4[1] = l12;
            objectArray4[0] = 4;
            m44.a("m", (Object)this, (Object)objectArray4, (long)-8090976281510803211L, (long)l10);
            return bl2;
        }
        Object[] objectArray5 = new Object[3];
        objectArray5[2] = n10;
        objectArray5[1] = l12;
        objectArray5[0] = 4;
        m44.a("m", (Object)this, (Object)objectArray5, (long)-8090976281510803211L, (long)l10);
        return (boolean)object;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void K2(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x9A1D50A518FL;
        long l13 = l11 ^ 0x73EFBB08C41AL;
        long l14 = l11 ^ 0x3C9D76722E45L;
        long l15 = l11 ^ 0x98685FCA88DL;
        long l16 = l11 ^ 0x8290D1F98E8L;
        pv pv2 = new pv(l12, (int)lqz.a("r", (int)2623, (long)(0x274E7A902954C9F5L ^ l10)));
        CallSite callSite = m44.a("h", (long)-3169674198992549375L, (long)l10);
        boolean bl2 = true;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = pv2;
        objectArray2[0] = l15;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)-3863654648727820273L, (long)l10), (Object)objectArray2, (long)-3592971168160759571L, (long)l10);
        CallSite callSite2 = callSite;
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l14;
            objectArray3[0] = (int)lqz.a("r", (int)31292, (long)(0x769F1A95E379B9E4L ^ l10));
            CallSite callSite3 = m44.a("i", (Object)this, (Object)objectArray3, (long)-3770215073634967882L, (long)l10);
            m44.a("t", (Object)this, (int)lqz.a("r", (int)126, (long)(0x610D4709BB464311L ^ l10)), (long)-3906429771743802096L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = pv2;
            objectArray4[0] = l16;
            m44.a("w", (Object)m44.a("v", (Object)this, (long)-3863654648727820273L, (long)l10), (Object)objectArray4, (long)-2973316294474331336L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("v", (Object)callSite3, (long)-2977642338783010559L, (long)l10);
            objectArray5[0] = l13;
            m44.a("w", (Object)pv2, (Object)objectArray5, (long)-3353370330519925652L, (long)l10);
            if (callSite2 != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 < 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = pv2;
                objectArray6[0] = l16;
                m44.a("w", (Object)m44.a("v", (Object)this, (long)-3863654648727820273L, (long)l10), (Object)objectArray6, (long)-2973316294474331336L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("h", (Object)runtimeException, (long)-2930215766670141159L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = pv2;
            objectArray7[0] = l16;
            m44.a("w", (Object)m44.a("v", (Object)this, (long)-3863654648727820273L, (long)l10), (Object)objectArray7, (long)-2973316294474331336L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("h", (Object)runtimeException, (long)-2930215766670141159L, (long)l10);
        }
    }

    private boolean w(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x71B1C77FC790L;
                CallSite callSite = m44.a("h", (long)2401285330086461265L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)lqz.a("r", (int)14601, (long)(0x22DB3A5027A78F43L ^ l10));
                        object = m44.a("i", (Object)this, (Object)objectArray2, (long)2435162391462102323L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("h", (Object)runtimeException, (long)2451596590194650185L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("h", (Object)runtimeException, (long)2451596590194650185L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    private boolean C(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x7FBB26DDB1D1L;
                CallSite callSite = m44.a("i", (long)6274106109729605904L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)lqz.a("r", (int)8798, (long)(0x7E70975CB8D762A6L ^ l10));
                        object = m44.a("h", (Object)this, (Object)objectArray2, (long)6307961163659293554L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("i", (Object)runtimeException, (long)6072220188722207240L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("i", (Object)runtimeException, (long)6072220188722207240L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                block12: {
                    lqz.a = prr.a(9211468365182682597L, 7790649329015799638L, MethodHandles.lookup().lookupClass()).a(116298938589102L);
                    v0 = var14 = lqz.a ^ 129080356406635L;
                    var16_1 = v0 ^ 115382694067263L;
                    var18_2 = v0 ^ 112750004314021L;
                    var20_3 = v0 ^ 62688471308436L;
                    var22_4 = v0 ^ 3876592245409L;
                    var24_5 = v0 ^ 119662907039700L;
                    var11_6 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v1 = SecretKeyFactory.getInstance("DES");
                    v2 = new byte[8];
                    v3 = v2;
                    v2[0] = (byte)(var14 >>> 56);
                    for (var12_7 = 1; var12_7 < 8; ++var12_7) {
                        v3 = v3;
                        v3[var12_7] = (byte)(var14 << var12_7 * 8 >>> 56);
                    }
                    break block12;
lbl19:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var11_6.init(2, (Key)v1.generateSecret(new DESKeySpec(v3)), new IvParameterSpec(new byte[8]));
                var13_8 = var11_6.doFinal("&_\u0092Y\u0082\u00d3i\u00b9".getBytes("ISO-8859-1"));
                ** while (true)
                lqz.c = lqz.c(var13_8).intern();
                lqz.f = new HashMap<K, V>(13);
                var0_9 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var14 >>> 56);
                for (var1_10 = 1; var1_10 < 8; ++var1_10) {
                    v6 = v6;
                    v6[var1_10] = (byte)(var14 << var1_10 * 8 >>> 56);
                }
                var0_9.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_11 = new long[292];
                var3_12 = 0;
                var4_13 = "\u00da\u0094\u0081\u00a1\u0082\u000ed\u00ac\u00bbqQ}\u00c80\u00f8\u0018=\u00b7\u00caE\u001cy^O\u0007\u00b8\u00fb\u008fi];\u007fD\u000b\r(\u00bb\u008f\u0097\u00f6\u0005\u00ea\u00f2\u0082\u00e3\u0004\u00c2\u00a2\u00932%\u000fMD\u000b\u008bu\u00b4\u0097v\u009e\u00ef\u009d\u009e\u00f2\r\u00e8\u00a4\\*\u0094\u00ed\u00c1o\u00b9i\u009a\u0080\u00f6X{\u00ea?\u0015\u00c065\u0014L\u00efl*\u009a\u0002/\u009c\u00bbD\u0016\u00ff8t\u00d7z\u0083\u001b\u0099\u001f^\u00a3\u0017\u009c\u00cb\u0098\u009f\b\u00ab\u00e7 \u00bd\u0093\u00f1\u00ee\b\u00d4\u00dft{o{\u00a0\u00d2:x\u0016\u001ce62\u00a5\"[%8;\u00dc\u009a|:\u0085\u00b8-\u0092p\u0011&\u0097\u00dd\u00ad\u00de\u00f9\u00df\u00c6G\u00d7\u001c\u00e8$\u0017\u0085\u00e4oA\u00a5}~k\u00b9\u0081\u00d8\u00dbo~\u001f)B\u009a\u007f\u00fb\u00e2\u0087\u00b7\u00191ab91:\u00fbX\\|\u009cJ\u00de\u0018\u00ba\u00a4\u001c\u00daSk\u00f8:\u0006Gj\u008e\u00a9\u0014=\u001f\u001c\u001d\u0081\u0081\u0095\u0084^\u0082V\u00baT\u00b0\u00f0\f\u0099\u0006\u00e6\u0007\u00fe\u009d\u00f6x\u00e3c\u00d4UaH #\u00cd\u00fe\u0090gV\u0004\u0012\u0095k\u00a8\u0092\u00a5\u0017\u00e74M{\u00b3\u00bf\u00dd\u00ca\u00d4\u001e/\u0092\u00d8\u00b8%fE\u00cbu\u0087n\u0091\u008f\"\u00cc\u00b6\u00ffu\u00a6\u00b2vM7%\u00c1\u00cb\u0090\u00bc{\u00e4\u0088\u00c7&|.\u00a0\u00f3\u00174k\u0011Tw\u00f8\n\u0011\u00f2\u00d9g\u00a9\u00a2\u00afM~\u00c9\f\u00dd\u00bf_\u00d8\u008d\u00b0\u008cB4\u00ff\u00fb\u00fc\u0001\u00d1s:q\u00fc \u00ec\u00f0f$\u00fc2\u00eb\u00ce\u00fb\u00c5m\u00b3qA\u00bb\u00ed\u00b7\u0093\u00d9\u00bf>m\u0096\u00a5E\u00bd\u0089u\u009aOH\u000f\u0081\u000e\u00e7H\u009a\u008a\u00eb\u009a,ceW\u00f5v\u0000[\tc\u00d4o\u0083\u00cfQy\u00f4$2|\r\u0002\u00f1Y\u0005\u00f8o\u00de\u00dc~\u00f6\u00dc\u00cf\u0017\u000b\u00bc6!\u00e6\"\r\u0005\u00ef &\u00eb\u00c1\"7\u00c1\u00ff\u0081\u00ee\u0015\u009f\u00df\u00f6q\u00da$\u00d5\u00b6\u009f\u00a3\u00d0\u00b1m#\u00acM\u0005>n\u0087\u00b4\u0000#H<\u00f3\u0095[\"\u0085\u008f\u0018\u00913\u00a7\u00c0\u0084\u00bcT\u009f\u00d9\u00dbP\u0081\u00a3h\u00b3\u0013\u009f\u00de\u00ffnM\u00aeG\u00f7+\u0002\u0000\u00a0\u00f4\u00d5\u00f8\u00e0\u0000\u00f0\u00ad\u009d\u00b7\u00937\u00a5o/\u00c9+\u009f\u00f2\u00110\u00cav\u00f2Q\u0089\u00acw\u00f6\u00e9d\u00bb~Iy\u0002\u0002*\u00b3e\u00a1\ny\u0084\u008a\u00f7Q`\u000f\u00f8\u0017ji\b\u00bc%'\u00caat\u0092t\u00e9\u00e0M\u00c3\u00a8_\u00a52\u00e3\u00e5\f\u0014\u00fe\u00deb\u0018g/>>.Q\u00d7C\u0086Q\u00efbmF\u00b9\u00edW\u0086\u0098c0\u001c\u00d5\u00cb\u00d0\u00b5\u00b7]\u00b3\u00fd6O=\u00b4E4E\u0096t\u001aE\u00af/\u0095\u00c9\u00de\u00dd='\u0015c\u00ba\u0018\\\u00e6\u009f\u001e\u00f6\u00e2\u00ca\u00b9\u000f\u000e]\u0093\u00a0\u0019{\u00f1\u0001\u009e6\u00f9\u008f\u0007q\u0014\u00e7\u00c0\u0093\u00c8@\u00a4\u009f\u0094\u00b9\u00ed.\u00cb\u009c\u009c\u00fei\u00c6\u007f-\u00a1\u00f5\u00aa\u00e0M!X\u0082G\u00cd<\u00a8\u0091\u00c8El\u00df\f\u00e3\u00ffk\u00acs_,u\u000f\u00beO\u00e5\u00fb\u00f94\u001b\u00daI\u00a7\u0096\u00ba\u0084,\u00a4\u00e4\u00b8\u0010\u00a3\u0005\u00f5\u0089\u00d6\u0099\u00d7\u00dc\u0005\u00aag\u00a50\u00c4\u00cb^\u00bc\u00ff(\u00c1oV\u00b5>\u00b5\u0017\u00b1\u00aa\u00a9q\u00c8\u0001\u00b1\u00aa\u00c8\u008b#D\u0004\u0005\u007f\u00fa\u0096\u00c6+\u0088\"o\u00a6]\r\u0080 \u00e4MQ7\u008f\u00af\u00077\u00e0\u000fJ\u009f\u00a9\u008e \u00a3\u00bf8+Q\u0093\u0089 \u00b0T\u0006|ts\u00dc;_\"\u00cc\u001eot\u008b\u0012\u00f1\u00af\u000e\u00dan\u0011\u0014\u0081\u009c\u00a0%\u009c\b\u0082\u000b\u00b5\u00df\u00da\u000f\u008b.fF\u007f\u0087\u00f8,]Y\u0083|T\u00df\u00d3\u00c3\u0088\u00db!1\u00b4(fLS>\bT\u0019\u00b5\u00f0:\u009cQ[2\u0001\u00a5\u0095p]k\t\u000bC\u00a3|\u00a6\u00ff\u00b5%\u00ba\u0080\u00f8\u00afc]o\u00a6|3\u00c6\u00dd\u00d8bX\u00e1q\u001b\u00835$/<\u0014\u00f5\u0015\u00db\u0013DE\u00caD\u0093\u00cf\u00e0\u00b9\u00b9g\u008coQ<_\u00ebz\u00c8\u001b)\u00fe\u00a9!\u009d\u0097\u000b\u00d8-\u00e7\u0010=~}\u008e3C\u00b1O\u00f2\u00e9\u008c\u007f\u009e\u00994\u00f9\u00bfU\u00ea\u00e3\u00a8\u00aao\u00de\u00c00\u00c7\u009e\u00f8e\u0093)lS\u00dec\u0007N\u00a7\u008b\u00b4Q\u0006\u008d#\u0019~\u001e\u0017\u0092x&\u00e7(\u0084\u008e\u0093x\u00b4\u00df\u0003H\u000e\u00ae\u00ebl!\u00bf\u00d3\u0082\u00b1\u0085\u00c3\u00ff,\u00d1$\u00f5Xio\u00dc\u00e52\u008e\u00aaX\u00ab\u009a\u00fc\u00f9\u0083\u0092\r\u00e3\u00bc\u00eb\u00f8'\u001c\u00e8\u00ad`?\u0016\u0087\n-\u00f7\u00f5\u00cdW\u00c3\u00f0\u00e5{\u0096[OO\u00ea/\\R\u00d4G\u00b3\u0081\u008b+U\u00fe\u0001\u00b0\u00c57\u00df\u0098\u0013l\u0012\f\u009c\u00bd\u00e9\u00bd\\\u00e9\u0084\u0005\u00f88:h\u0094\u0097uc\u00fa\u00d1r\u00bc\u00db\r\u00c5_h\u00c7\u0001\u0088\u00e8\u0093{m\u0001i\u0096\u0006\u00ee\u00be\u0091-F:\u0018\u0003\u0018{B\u00dc\u00e9\u00bd\u008f\u009a$h\u0001\u0094L8\\\u00c8C\u00bb\u0090\u00ad%a\u0005\u00f5\u00d3\"J\u000e\u00e5i\\\u00ac\u0016zL\u00a4\u009e\u00ce\u001c\u00f6\u0086\u001bq\u00c6\u008d<\u00ca\u0088\u00a4c\u00e9\u00a1\u0098o\u00b6ov\u00f1\u000f\u00b6\u0087\u0088\u00b0\u00a3S\ru\u00e3\u0018\u00bb\u00bd\u00be\u0083\u0087y\u009e\u00a8\u0011\u00c4\u00c8\u0082\u0083\u0099\u007fS\u00abV\u0093\u00cf\u00e7\u00b0_\u009a\u00f3ta\t \u00cb\u00ed\u00c7`\u00dc\u00cc\u00b6\u00d1\u00ef9[\u00cf\u0014=i(\\\u0010{p\u001c\u0089:\u0098\u00e9\u009ez\u00d5S\u0098\u00fa\u0004\u0095\u000e><\u00a6\u0086\u00e2\u00e4\b\u00df\u00acVS\u008deR\f\u00c5o:\u00fb\u0089\u00fd\u00c3\u00a7\u00cb\u00c0\u00ef\u00ad\u0017Q,&\u0012\u00b6M\u00d0z\u00de\u00b9\u00e8a\b\u00beA'\u00c3\u00e6[\u00d1\u00ad\u009e\u00c7B\u00ce;C\u0018h\u00dfZJ\u00d5oy\u00bf\u00cdF\u0096\u0003\u009c7\u00ae\u00e7j\u0018\u009e\u00c2\u00dd\u007f<\u00c1\u00f4\u009dC\u0098\u00cbPQ\u00a6\u00d6T\u00c3\u009c\u0013W\u001c\u00f8\u0085\u0018\u00ed\u00f1\u00da\u00acI\u0004\u00c79\u008a\u0007\u00bc\u00be\u00f7D}\u00da0\u0001nC\u00b1+\u0094\u00e2G\u00feI\u00e7\"\u00dcv\u0001\u00d4:\u0000\u00f9/b{\u001c\u00d9\u0010\u00d9F\u00a1W;L$#d4#\f\u008eM\\x%\u0087M\u00a8\u00fem\u0001\u00f8\u00ce\u00a3U2\u007f#\r\u0091\u0088\u00b3(\u00ca\u0094\u00e6.\u0088\u00b8\u0089\u001a+\u0093\u00b6\u00acF\u0090\u00b7\u00c0\u00da\u00a3]\u00cf\u00efY\u00ed\u00b2\u00a7\u00fe\u00c2l\u00d8\u00c8Q\u00da\u00a4\u0092\u00c6\u0088\u00e7*di\u0094pM\u00df\u00c2\u0000\u00bc\u00e7\u0012\u0094k\u00c1e\u00ae2]\u0086W\u0018A}\u00bd\u00d2\u0010)\u00f1\u00f5m\u00f6s\u008aa\u00c2g\u00c9s\u00abo\u007f\u00f2>l\u0006\t\u00af\u00b4\u0094c\u00cc\u00e0N\u00d1N\u00a2C5h\u0091\u00ea\u00f0\u001dL\u00c4`\u00e7\u0089\u00f9\u00a6j\u00cc\u0084\u008a\u00a6\u00ff\u0084\u00cb\u00ac\u00a9\u00d6)\u00a5*\u00a8\u00ae\u00bbS\u00b1\u00cbw\u00a4H\u00f0\u0097\u0096E.\u00d6\n\u00db1\u00fc\u00d0\u00f1Jd\u009eK\u007f\u001d\u00cd\u00f9(\u00df\\\u00fe\u0005\u00d85\u00c8\u00dd?o\u00bb\u008e\u008c^dn\u00c9\u00ced\u000fXY&p\u00ae\u00b4\u0095\u0096R\u001e\u00a0\u00d1!I\u00cc\u008f\u00f1\u00a9FKo\u00d6i\u00e3\u0012\u00de@\u00dde\u00e0\u00e3\u00ee\u008c]r\u00b34`I\u00fd\u0097\u00f5\u008a\u00cc\u00fc\u00bc\u001c\u00b5\u000b\u00e3\u0097\u0002\u00cd\u00b2tW\u00f8\u00e3\u00f42\u001a=\u001a \u0001/\u0006\u00d6\u00f3L\u00f5\u00954\u00b0S\u00dc\u00cd\u0013\u00e1r\u00ed\u00beV\f\u0015\u00b1\u00c7s\u0094z80\u00a0\u00b8>\u00e9Oq\u00ab\t\u00e7\u00dc\u00eb\u00e22\u00f4\u0011M\u00ff\u00d5\u00b6%\u00fe\u00e9\u00cf\u00cb\u0093S\u009c%5\u00b4n\u00d9\u00ea+`\u00f6%m\u0014\u00c2\u00d6e\u0085\u0006C\u008b\u00dd\u00cd\u00adr\u00a2\u00a8yAh\u00cd\u0091\u00ae\u007f\u0088]\u00afC\u009f-4W\u00d7\u0083x\u0000!-D\u00f3\u00fe\u00edZ\u00c6\u0093\u00d1\u008f\u00f8m#w8\u001db\u0002l\u00a0@hHV$.\u00ba\u00ed\u00a6/>\u00d3V\u0099\u00f3\u0087\u0007[T@0\u00dc \u00f0\u00f3\u00fb\u001e\b\u0018\u00ca\u00a4\u00c5$l\u0089\u00d6\u00ddr\u00dd\u00fcv\u00a2h\u008a\u00de\u00bb\u0011\u00e1\u0014\u0083\u009e\u00fd\u00af\u0086\u00da2\u00ea\u00ac~1YYg\u00cd\u0095'\u00d5G:{\u0098\u0098Y\u00edZ\u0095GE\u00f5\u00e2\u0001`47\u00ca\u00e4\u0003]\u001e\u00f6\u000f#\u00c3\u0012\u00fb\u0005\u000b=S\u00f5zh\u00d96\u009f\u0083q\u0007\u00ac:\u0002\u00e0\u00fd\u00ddh_gG\bE\u00e15y\u00ce\u0016\u00e0;\u00c4\u00c1\u00e4\u00d6Z\u00c3\u00d7\n\u000e\u001b6b3\u00c0\u00cfkk\u0007\u00f8s\u00ea\f\u000f=g\u00c6\u00c5Hea\u00ec@\u008f\u00da{\u00a1\\ $\u0090\u0012\u008f\u0098\u009e\u00c6\u00c5\u00f1\u00e6c\u00ae\u0003/\u00fa\u0091\u00b4\u00c8\u00e0\u00d4k\u00a7\u00cb\u00aa*5\u001c\u00a3(=x\u00a1\u00eew\\\u0018\u00ad\u0096\u0087KC\u0086v\u00edb\u00f6m\u00ae\u00a8\u0094\u00fd\u0086\u008dbb\u00b0\b}\u000bmucQ\u00cb\u008aw\u00e4\u00d2>\u001e\u0093\u001d'\u000b\u0080>gn\u0017\u00d5\u0083\u00c1\u0004\u0090\u0082#\u000b\u0094H\u00f4=\u0016-p\u00d6\u0089\u008bLK\u00cb\u00fa\u00e8\u0082\"\u00c2\u00d0\u0003\u00a3\u0010\u00fbF\u007f\u001fE\u00b2\u0017\u00ed\u00dd\u00f942\u00fb\u00da\u00017\u0095[\u0000\u001dI\u009f@\u00a0\u009d\u000b\u0000ok`U\u008fN>\u00f7\u0096p\u00f6\u00c1\u0003#\u00c7\u00ee\u00da`z\u00f8\u00cc\u00e0[\u0017v\u00fc_\u00ee4\u00d4\u00f0\u009f\u008ctI:\u00c8\u00af\u00ef\u00f1\t\u0004\u0003\u008f\u00eei\u00ec\u00d8\u001em\u0095\u00d2U\u00ea\u00a9\u00f9\u0005\u00ee\u0087W\u00a7\u0006 k\u00b1\"\u00f8t0\u00f7\u001e\u00a2\u00f4\u00c4~\u00f6 \u00dc\u00be\u00d7\u009f\u00dbuZ\u00ce#\u00cf\u0011\u00ac\u0093VO\u0002S`l\u00d8\u00c6Ll\u00a2\u00ab\u00f9\u007f\u0087\u008e5\u00a7\u00ces\u00ec\u00f6y\u00ec\u00f5f\u0014;\u00c44\u00ef\u00ec\u00e1[\u00db \u0088Y\u00baf\u00e1\u00c0\u001d!\u008a\u00bd\u0019\u0088g (\u00bbC\u00ba'\u001b\u00eaw7\u0083\u00a5\u00db\u00b6<w\u009c\u00d5\u0099\u00c8b\u00f0\u000f3\u00f3\u00e6hm>\u00a1\u00bd\u00f3\u00e2\u00fe\u00c2\u001aB\u008e\u00dbD\\\u009c:\u0089C\u0019\u0092\u00cf?\u00f0f\u00eb7\u0011A\u00c3\u001fT\u0097^\u00d3\u00a6`R\u000b3\u00b1\u00ab\u00c0)`\u00d8V\u0015\u0016\u00da\u00f4\u00ec\u001a95\u0005U\u00d5\u00a4%7<";
                var5_14 = "\u00da\u0094\u0081\u00a1\u0082\u000ed\u00ac\u00bbqQ}\u00c80\u00f8\u0018=\u00b7\u00caE\u001cy^O\u0007\u00b8\u00fb\u008fi];\u007fD\u000b\r(\u00bb\u008f\u0097\u00f6\u0005\u00ea\u00f2\u0082\u00e3\u0004\u00c2\u00a2\u00932%\u000fMD\u000b\u008bu\u00b4\u0097v\u009e\u00ef\u009d\u009e\u00f2\r\u00e8\u00a4\\*\u0094\u00ed\u00c1o\u00b9i\u009a\u0080\u00f6X{\u00ea?\u0015\u00c065\u0014L\u00efl*\u009a\u0002/\u009c\u00bbD\u0016\u00ff8t\u00d7z\u0083\u001b\u0099\u001f^\u00a3\u0017\u009c\u00cb\u0098\u009f\b\u00ab\u00e7 \u00bd\u0093\u00f1\u00ee\b\u00d4\u00dft{o{\u00a0\u00d2:x\u0016\u001ce62\u00a5\"[%8;\u00dc\u009a|:\u0085\u00b8-\u0092p\u0011&\u0097\u00dd\u00ad\u00de\u00f9\u00df\u00c6G\u00d7\u001c\u00e8$\u0017\u0085\u00e4oA\u00a5}~k\u00b9\u0081\u00d8\u00dbo~\u001f)B\u009a\u007f\u00fb\u00e2\u0087\u00b7\u00191ab91:\u00fbX\\|\u009cJ\u00de\u0018\u00ba\u00a4\u001c\u00daSk\u00f8:\u0006Gj\u008e\u00a9\u0014=\u001f\u001c\u001d\u0081\u0081\u0095\u0084^\u0082V\u00baT\u00b0\u00f0\f\u0099\u0006\u00e6\u0007\u00fe\u009d\u00f6x\u00e3c\u00d4UaH #\u00cd\u00fe\u0090gV\u0004\u0012\u0095k\u00a8\u0092\u00a5\u0017\u00e74M{\u00b3\u00bf\u00dd\u00ca\u00d4\u001e/\u0092\u00d8\u00b8%fE\u00cbu\u0087n\u0091\u008f\"\u00cc\u00b6\u00ffu\u00a6\u00b2vM7%\u00c1\u00cb\u0090\u00bc{\u00e4\u0088\u00c7&|.\u00a0\u00f3\u00174k\u0011Tw\u00f8\n\u0011\u00f2\u00d9g\u00a9\u00a2\u00afM~\u00c9\f\u00dd\u00bf_\u00d8\u008d\u00b0\u008cB4\u00ff\u00fb\u00fc\u0001\u00d1s:q\u00fc \u00ec\u00f0f$\u00fc2\u00eb\u00ce\u00fb\u00c5m\u00b3qA\u00bb\u00ed\u00b7\u0093\u00d9\u00bf>m\u0096\u00a5E\u00bd\u0089u\u009aOH\u000f\u0081\u000e\u00e7H\u009a\u008a\u00eb\u009a,ceW\u00f5v\u0000[\tc\u00d4o\u0083\u00cfQy\u00f4$2|\r\u0002\u00f1Y\u0005\u00f8o\u00de\u00dc~\u00f6\u00dc\u00cf\u0017\u000b\u00bc6!\u00e6\"\r\u0005\u00ef &\u00eb\u00c1\"7\u00c1\u00ff\u0081\u00ee\u0015\u009f\u00df\u00f6q\u00da$\u00d5\u00b6\u009f\u00a3\u00d0\u00b1m#\u00acM\u0005>n\u0087\u00b4\u0000#H<\u00f3\u0095[\"\u0085\u008f\u0018\u00913\u00a7\u00c0\u0084\u00bcT\u009f\u00d9\u00dbP\u0081\u00a3h\u00b3\u0013\u009f\u00de\u00ffnM\u00aeG\u00f7+\u0002\u0000\u00a0\u00f4\u00d5\u00f8\u00e0\u0000\u00f0\u00ad\u009d\u00b7\u00937\u00a5o/\u00c9+\u009f\u00f2\u00110\u00cav\u00f2Q\u0089\u00acw\u00f6\u00e9d\u00bb~Iy\u0002\u0002*\u00b3e\u00a1\ny\u0084\u008a\u00f7Q`\u000f\u00f8\u0017ji\b\u00bc%'\u00caat\u0092t\u00e9\u00e0M\u00c3\u00a8_\u00a52\u00e3\u00e5\f\u0014\u00fe\u00deb\u0018g/>>.Q\u00d7C\u0086Q\u00efbmF\u00b9\u00edW\u0086\u0098c0\u001c\u00d5\u00cb\u00d0\u00b5\u00b7]\u00b3\u00fd6O=\u00b4E4E\u0096t\u001aE\u00af/\u0095\u00c9\u00de\u00dd='\u0015c\u00ba\u0018\\\u00e6\u009f\u001e\u00f6\u00e2\u00ca\u00b9\u000f\u000e]\u0093\u00a0\u0019{\u00f1\u0001\u009e6\u00f9\u008f\u0007q\u0014\u00e7\u00c0\u0093\u00c8@\u00a4\u009f\u0094\u00b9\u00ed.\u00cb\u009c\u009c\u00fei\u00c6\u007f-\u00a1\u00f5\u00aa\u00e0M!X\u0082G\u00cd<\u00a8\u0091\u00c8El\u00df\f\u00e3\u00ffk\u00acs_,u\u000f\u00beO\u00e5\u00fb\u00f94\u001b\u00daI\u00a7\u0096\u00ba\u0084,\u00a4\u00e4\u00b8\u0010\u00a3\u0005\u00f5\u0089\u00d6\u0099\u00d7\u00dc\u0005\u00aag\u00a50\u00c4\u00cb^\u00bc\u00ff(\u00c1oV\u00b5>\u00b5\u0017\u00b1\u00aa\u00a9q\u00c8\u0001\u00b1\u00aa\u00c8\u008b#D\u0004\u0005\u007f\u00fa\u0096\u00c6+\u0088\"o\u00a6]\r\u0080 \u00e4MQ7\u008f\u00af\u00077\u00e0\u000fJ\u009f\u00a9\u008e \u00a3\u00bf8+Q\u0093\u0089 \u00b0T\u0006|ts\u00dc;_\"\u00cc\u001eot\u008b\u0012\u00f1\u00af\u000e\u00dan\u0011\u0014\u0081\u009c\u00a0%\u009c\b\u0082\u000b\u00b5\u00df\u00da\u000f\u008b.fF\u007f\u0087\u00f8,]Y\u0083|T\u00df\u00d3\u00c3\u0088\u00db!1\u00b4(fLS>\bT\u0019\u00b5\u00f0:\u009cQ[2\u0001\u00a5\u0095p]k\t\u000bC\u00a3|\u00a6\u00ff\u00b5%\u00ba\u0080\u00f8\u00afc]o\u00a6|3\u00c6\u00dd\u00d8bX\u00e1q\u001b\u00835$/<\u0014\u00f5\u0015\u00db\u0013DE\u00caD\u0093\u00cf\u00e0\u00b9\u00b9g\u008coQ<_\u00ebz\u00c8\u001b)\u00fe\u00a9!\u009d\u0097\u000b\u00d8-\u00e7\u0010=~}\u008e3C\u00b1O\u00f2\u00e9\u008c\u007f\u009e\u00994\u00f9\u00bfU\u00ea\u00e3\u00a8\u00aao\u00de\u00c00\u00c7\u009e\u00f8e\u0093)lS\u00dec\u0007N\u00a7\u008b\u00b4Q\u0006\u008d#\u0019~\u001e\u0017\u0092x&\u00e7(\u0084\u008e\u0093x\u00b4\u00df\u0003H\u000e\u00ae\u00ebl!\u00bf\u00d3\u0082\u00b1\u0085\u00c3\u00ff,\u00d1$\u00f5Xio\u00dc\u00e52\u008e\u00aaX\u00ab\u009a\u00fc\u00f9\u0083\u0092\r\u00e3\u00bc\u00eb\u00f8'\u001c\u00e8\u00ad`?\u0016\u0087\n-\u00f7\u00f5\u00cdW\u00c3\u00f0\u00e5{\u0096[OO\u00ea/\\R\u00d4G\u00b3\u0081\u008b+U\u00fe\u0001\u00b0\u00c57\u00df\u0098\u0013l\u0012\f\u009c\u00bd\u00e9\u00bd\\\u00e9\u0084\u0005\u00f88:h\u0094\u0097uc\u00fa\u00d1r\u00bc\u00db\r\u00c5_h\u00c7\u0001\u0088\u00e8\u0093{m\u0001i\u0096\u0006\u00ee\u00be\u0091-F:\u0018\u0003\u0018{B\u00dc\u00e9\u00bd\u008f\u009a$h\u0001\u0094L8\\\u00c8C\u00bb\u0090\u00ad%a\u0005\u00f5\u00d3\"J\u000e\u00e5i\\\u00ac\u0016zL\u00a4\u009e\u00ce\u001c\u00f6\u0086\u001bq\u00c6\u008d<\u00ca\u0088\u00a4c\u00e9\u00a1\u0098o\u00b6ov\u00f1\u000f\u00b6\u0087\u0088\u00b0\u00a3S\ru\u00e3\u0018\u00bb\u00bd\u00be\u0083\u0087y\u009e\u00a8\u0011\u00c4\u00c8\u0082\u0083\u0099\u007fS\u00abV\u0093\u00cf\u00e7\u00b0_\u009a\u00f3ta\t \u00cb\u00ed\u00c7`\u00dc\u00cc\u00b6\u00d1\u00ef9[\u00cf\u0014=i(\\\u0010{p\u001c\u0089:\u0098\u00e9\u009ez\u00d5S\u0098\u00fa\u0004\u0095\u000e><\u00a6\u0086\u00e2\u00e4\b\u00df\u00acVS\u008deR\f\u00c5o:\u00fb\u0089\u00fd\u00c3\u00a7\u00cb\u00c0\u00ef\u00ad\u0017Q,&\u0012\u00b6M\u00d0z\u00de\u00b9\u00e8a\b\u00beA'\u00c3\u00e6[\u00d1\u00ad\u009e\u00c7B\u00ce;C\u0018h\u00dfZJ\u00d5oy\u00bf\u00cdF\u0096\u0003\u009c7\u00ae\u00e7j\u0018\u009e\u00c2\u00dd\u007f<\u00c1\u00f4\u009dC\u0098\u00cbPQ\u00a6\u00d6T\u00c3\u009c\u0013W\u001c\u00f8\u0085\u0018\u00ed\u00f1\u00da\u00acI\u0004\u00c79\u008a\u0007\u00bc\u00be\u00f7D}\u00da0\u0001nC\u00b1+\u0094\u00e2G\u00feI\u00e7\"\u00dcv\u0001\u00d4:\u0000\u00f9/b{\u001c\u00d9\u0010\u00d9F\u00a1W;L$#d4#\f\u008eM\\x%\u0087M\u00a8\u00fem\u0001\u00f8\u00ce\u00a3U2\u007f#\r\u0091\u0088\u00b3(\u00ca\u0094\u00e6.\u0088\u00b8\u0089\u001a+\u0093\u00b6\u00acF\u0090\u00b7\u00c0\u00da\u00a3]\u00cf\u00efY\u00ed\u00b2\u00a7\u00fe\u00c2l\u00d8\u00c8Q\u00da\u00a4\u0092\u00c6\u0088\u00e7*di\u0094pM\u00df\u00c2\u0000\u00bc\u00e7\u0012\u0094k\u00c1e\u00ae2]\u0086W\u0018A}\u00bd\u00d2\u0010)\u00f1\u00f5m\u00f6s\u008aa\u00c2g\u00c9s\u00abo\u007f\u00f2>l\u0006\t\u00af\u00b4\u0094c\u00cc\u00e0N\u00d1N\u00a2C5h\u0091\u00ea\u00f0\u001dL\u00c4`\u00e7\u0089\u00f9\u00a6j\u00cc\u0084\u008a\u00a6\u00ff\u0084\u00cb\u00ac\u00a9\u00d6)\u00a5*\u00a8\u00ae\u00bbS\u00b1\u00cbw\u00a4H\u00f0\u0097\u0096E.\u00d6\n\u00db1\u00fc\u00d0\u00f1Jd\u009eK\u007f\u001d\u00cd\u00f9(\u00df\\\u00fe\u0005\u00d85\u00c8\u00dd?o\u00bb\u008e\u008c^dn\u00c9\u00ced\u000fXY&p\u00ae\u00b4\u0095\u0096R\u001e\u00a0\u00d1!I\u00cc\u008f\u00f1\u00a9FKo\u00d6i\u00e3\u0012\u00de@\u00dde\u00e0\u00e3\u00ee\u008c]r\u00b34`I\u00fd\u0097\u00f5\u008a\u00cc\u00fc\u00bc\u001c\u00b5\u000b\u00e3\u0097\u0002\u00cd\u00b2tW\u00f8\u00e3\u00f42\u001a=\u001a \u0001/\u0006\u00d6\u00f3L\u00f5\u00954\u00b0S\u00dc\u00cd\u0013\u00e1r\u00ed\u00beV\f\u0015\u00b1\u00c7s\u0094z80\u00a0\u00b8>\u00e9Oq\u00ab\t\u00e7\u00dc\u00eb\u00e22\u00f4\u0011M\u00ff\u00d5\u00b6%\u00fe\u00e9\u00cf\u00cb\u0093S\u009c%5\u00b4n\u00d9\u00ea+`\u00f6%m\u0014\u00c2\u00d6e\u0085\u0006C\u008b\u00dd\u00cd\u00adr\u00a2\u00a8yAh\u00cd\u0091\u00ae\u007f\u0088]\u00afC\u009f-4W\u00d7\u0083x\u0000!-D\u00f3\u00fe\u00edZ\u00c6\u0093\u00d1\u008f\u00f8m#w8\u001db\u0002l\u00a0@hHV$.\u00ba\u00ed\u00a6/>\u00d3V\u0099\u00f3\u0087\u0007[T@0\u00dc \u00f0\u00f3\u00fb\u001e\b\u0018\u00ca\u00a4\u00c5$l\u0089\u00d6\u00ddr\u00dd\u00fcv\u00a2h\u008a\u00de\u00bb\u0011\u00e1\u0014\u0083\u009e\u00fd\u00af\u0086\u00da2\u00ea\u00ac~1YYg\u00cd\u0095'\u00d5G:{\u0098\u0098Y\u00edZ\u0095GE\u00f5\u00e2\u0001`47\u00ca\u00e4\u0003]\u001e\u00f6\u000f#\u00c3\u0012\u00fb\u0005\u000b=S\u00f5zh\u00d96\u009f\u0083q\u0007\u00ac:\u0002\u00e0\u00fd\u00ddh_gG\bE\u00e15y\u00ce\u0016\u00e0;\u00c4\u00c1\u00e4\u00d6Z\u00c3\u00d7\n\u000e\u001b6b3\u00c0\u00cfkk\u0007\u00f8s\u00ea\f\u000f=g\u00c6\u00c5Hea\u00ec@\u008f\u00da{\u00a1\\ $\u0090\u0012\u008f\u0098\u009e\u00c6\u00c5\u00f1\u00e6c\u00ae\u0003/\u00fa\u0091\u00b4\u00c8\u00e0\u00d4k\u00a7\u00cb\u00aa*5\u001c\u00a3(=x\u00a1\u00eew\\\u0018\u00ad\u0096\u0087KC\u0086v\u00edb\u00f6m\u00ae\u00a8\u0094\u00fd\u0086\u008dbb\u00b0\b}\u000bmucQ\u00cb\u008aw\u00e4\u00d2>\u001e\u0093\u001d'\u000b\u0080>gn\u0017\u00d5\u0083\u00c1\u0004\u0090\u0082#\u000b\u0094H\u00f4=\u0016-p\u00d6\u0089\u008bLK\u00cb\u00fa\u00e8\u0082\"\u00c2\u00d0\u0003\u00a3\u0010\u00fbF\u007f\u001fE\u00b2\u0017\u00ed\u00dd\u00f942\u00fb\u00da\u00017\u0095[\u0000\u001dI\u009f@\u00a0\u009d\u000b\u0000ok`U\u008fN>\u00f7\u0096p\u00f6\u00c1\u0003#\u00c7\u00ee\u00da`z\u00f8\u00cc\u00e0[\u0017v\u00fc_\u00ee4\u00d4\u00f0\u009f\u008ctI:\u00c8\u00af\u00ef\u00f1\t\u0004\u0003\u008f\u00eei\u00ec\u00d8\u001em\u0095\u00d2U\u00ea\u00a9\u00f9\u0005\u00ee\u0087W\u00a7\u0006 k\u00b1\"\u00f8t0\u00f7\u001e\u00a2\u00f4\u00c4~\u00f6 \u00dc\u00be\u00d7\u009f\u00dbuZ\u00ce#\u00cf\u0011\u00ac\u0093VO\u0002S`l\u00d8\u00c6Ll\u00a2\u00ab\u00f9\u007f\u0087\u008e5\u00a7\u00ces\u00ec\u00f6y\u00ec\u00f5f\u0014;\u00c44\u00ef\u00ec\u00e1[\u00db \u0088Y\u00baf\u00e1\u00c0\u001d!\u008a\u00bd\u0019\u0088g (\u00bbC\u00ba'\u001b\u00eaw7\u0083\u00a5\u00db\u00b6<w\u009c\u00d5\u0099\u00c8b\u00f0\u000f3\u00f3\u00e6hm>\u00a1\u00bd\u00f3\u00e2\u00fe\u00c2\u001aB\u008e\u00dbD\\\u009c:\u0089C\u0019\u0092\u00cf?\u00f0f\u00eb7\u0011A\u00c3\u001fT\u0097^\u00d3\u00a6`R\u000b3\u00b1\u00ab\u00c0)`\u00d8V\u0015\u0016\u00da\u00f4\u00ec\u001a95\u0005U\u00d5\u00a4%7<".length();
                var2_15 = 0;
                while (true) {
                    var7_16 = var4_13.substring(var2_15, var2_15 += 8).getBytes("ISO-8859-1");
                    v7 = var6_11;
                    v8 = var3_12++;
                    v9 = ((long)var7_16[0] & 255L) << 56 | ((long)var7_16[1] & 255L) << 48 | ((long)var7_16[2] & 255L) << 40 | ((long)var7_16[3] & 255L) << 32 | ((long)var7_16[4] & 255L) << 24 | ((long)var7_16[5] & 255L) << 16 | ((long)var7_16[6] & 255L) << 8 | (long)var7_16[7] & 255L;
                    v10 = -1;
                    break block10;
                    break;
                }
lbl50:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_15 < var5_14) ** continue;
                    var4_13 = "\u00e00\u00f4+\u0085w\u0015\u0086\u00c7*ol:^\u00b4\u00ff";
                    var5_14 = "\u00e00\u00f4+\u0085w\u0015\u0086\u00c7*ol:^\u00b4\u00ff".length();
                    var2_15 = 0;
                    while (true) {
                        var7_16 = var4_13.substring(var2_15, var2_15 += 8).getBytes("ISO-8859-1");
                        v7 = var6_11;
                        v8 = var3_12++;
                        v9 = ((long)var7_16[0] & 255L) << 56 | ((long)var7_16[1] & 255L) << 48 | ((long)var7_16[2] & 255L) << 40 | ((long)var7_16[3] & 255L) << 32 | ((long)var7_16[4] & 255L) << 24 | ((long)var7_16[5] & 255L) << 16 | ((long)var7_16[6] & 255L) << 8 | (long)var7_16[7] & 255L;
                        v10 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl63:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_15 < var5_14) ** continue;
                    break block11;
                    break;
                }
            }
            var8_17 = v9;
            var10_18 = var0_9.doFinal(new byte[]{(byte)(var8_17 >>> 56), (byte)(var8_17 >>> 48), (byte)(var8_17 >>> 40), (byte)(var8_17 >>> 32), (byte)(var8_17 >>> 24), (byte)(var8_17 >>> 16), (byte)(var8_17 >>> 8), (byte)var8_17});
            v11 = ((long)var10_18[0] & 255L) << 56 | ((long)var10_18[1] & 255L) << 48 | ((long)var10_18[2] & 255L) << 40 | ((long)var10_18[3] & 255L) << 32 | ((long)var10_18[4] & 255L) << 24 | ((long)var10_18[5] & 255L) << 16 | ((long)var10_18[6] & 255L) << 8 | (long)var10_18[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl76:
                // 1 sources

                ** continue;
            }
        }
        lqz.d = var6_11;
        lqz.e = new Integer[292];
        v12 = new Object[1];
        v12[0] = var22_4;
        m44.a("l", (Object)v12, (long)6481768289995190593L, (long)var14);
        v13 = new Object[1];
        v13[0] = var16_1;
        m44.a("l", (Object)v13, (long)6766914276196726298L, (long)var14);
        v14 = new Object[1];
        v14[0] = var18_2;
        m44.a("l", (Object)v14, (long)5017465566886667524L, (long)var14);
        v15 = new Object[1];
        v15[0] = var20_3;
        m44.a("l", (Object)v15, (long)4981787111424602091L, (long)var14);
        v16 = new Object[1];
        v16[0] = var24_5;
        m44.a("l", (Object)v16, (long)4943434186855828361L, (long)var14);
    }

    private boolean o(Object[] objectArray) {
        Object object;
        block10: {
            block11: {
                CallSite callSite;
                long l10;
                block8: {
                    long l11;
                    block9: {
                        l10 = (Long)objectArray[0];
                        l11 = (l10 = a ^ l10) ^ 0x5321E63276AFL;
                        callSite = m44.a("o", (long)-8039990928567087506L, (long)l10);
                        try {
                            try {
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l11;
                                objectArray2[0] = (int)lqz.a("r", (int)777, (long)(0x17054807016C046EL ^ l10));
                                object = m44.a("n", (Object)this, (Object)objectArray2, (long)-8001685034397273076L, (long)l10);
                                if (callSite != null) break block8;
                                if (object == false) break block9;
                            }
                            catch (RuntimeException runtimeException) {
                                throw m44.a("o", (Object)runtimeException, (long)-7837687716554613386L, (long)l10);
                            }
                            return true;
                        }
                        catch (RuntimeException runtimeException) {
                            throw m44.a("o", (Object)runtimeException, (long)-7837687716554613386L, (long)l10);
                        }
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l11;
                    objectArray3[0] = (int)lqz.a("r", (int)11026, (long)(0x18D5DBD5CFEE2C61L ^ l10));
                    object = m44.a("n", (Object)this, (Object)objectArray3, (long)-8001685034397273076L, (long)l10);
                }
                try {
                    try {
                        if (callSite != null) break block10;
                        if (object == false) break block11;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("o", (Object)runtimeException, (long)-7837687716554613386L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("o", (Object)runtimeException, (long)-7837687716554613386L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Exception decompiling
     */
    public final void KJ(Object[] var1_1) {
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
     */
    public final void b(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = lqz.a ^ var2_2;
        var4_3 = v0 ^ 133958039827766L;
        var6_4 = v0 ^ 37403813194482L;
        var8_5 = v0 ^ 116794418574086L;
        var10_6 = v0 ^ 41006681446745L;
        var12_7 = v0 ^ 56252826392680L;
        var14_8 = v0 ^ 103797383316524L;
        var16_9 = v0 ^ 17937647853457L;
        var18_10 = v0 ^ 19790802710516L;
        var21_11 = new p7(var12_7, (int)lqz.a("r", (int)20282, (long)(6112691697201281643L ^ var2_2)));
        var20_12 = m44.a("l", (long)-6692604360711963363L, (long)var2_2);
        var22_13 = true;
        v1 = new Object[2];
        v1[1] = var21_11;
        v1[0] = var16_9;
        m44.a("s", (Object)m44.a("r", (Object)this, (long)-4792512492396421357L, (long)var2_2), (Object)v1, (long)-5098309985032292367L, (long)var2_2);
        try {
            v2 = new Object[2];
            v2[1] = var10_6;
            v2[0] = (int)lqz.a("r", (int)19697, (long)(7799242595798055346L ^ var2_2));
            var23_14 = m44.a("m", (Object)this, (Object)v2, (long)-4849927599390561878L, (long)var2_2);
            m44.a("p", (Object)this, (int)lqz.a("r", (int)19697, (long)(7799242595798055346L ^ var2_2)), (long)-4695694173445080564L, (long)var2_2);
            v3 = new Object[1];
            v3[0] = var6_4;
            m44.a("s", (Object)this, (Object)v3, (long)-5120555442707530632L, (long)var2_2);
            v4 = new Object[3];
            v4[2] = true;
            v4[1] = var21_11;
            v4[0] = var18_10;
            m44.a("s", (Object)m44.a("r", (Object)this, (long)-4792512492396421357L, (long)var2_2), (Object)v4, (long)-6800240532986102748L, (long)var2_2);
            var22_13 = false;
            v5 = new Object[2];
            v5[1] = (int)m44.a("r", (Object)var23_14, (long)-6795558247044442595L, (long)var2_2);
            v5[0] = var8_5;
            m44.a("s", (Object)var21_11, (Object)v5, (long)-6455216663165207696L, (long)var2_2);
            ** if (var20_12 != null) goto lbl-1000
        }
        catch (Throwable var24_15) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block26: {
                                    block27: {
                                        if (var2_2 <= 0L) break block26;
                                        v8 = var22_13;
                                        if (var20_12 != null) break block27;
                                        try {
                                            block32: {
                                                if (!v8) ** GOTO lbl84
                                                break block32;
                                                catch (Throwable v9) {
                                                    throw m44.a("l", (Object)v9, (long)-6896750869572948475L, (long)var2_2);
                                                }
                                            }
                                            v10 = new Object[2];
                                            v10[1] = var14_8;
                                            v10[0] = var21_11;
                                            m44.a("s", (Object)m44.a("r", (Object)this, (long)-4792512492396421357L, (long)var2_2), (Object)v10, (long)-5128555178118347093L, (long)var2_2);
                                            v8 = false;
                                        }
                                        catch (Throwable v11) {
                                            throw m44.a("l", (Object)v11, (long)-6896750869572948475L, (long)var2_2);
                                        }
                                    }
                                    var22_13 = v8;
                                }
                                try {
                                    if (var2_2 < 0L || var20_12 == null) break block28;
lbl84:
                                    // 2 sources

                                    v12 = new Object[1];
                                    v12[0] = var4_3;
                                    m44.a("s", (Object)m44.a("r", (Object)this, (long)-4792512492396421357L, (long)var2_2), (Object)v12, (long)-5147131130118570603L, (long)var2_2);
                                }
                                catch (Throwable v13) {
                                    throw m44.a("l", (Object)v13, (long)-6896750869572948475L, (long)var2_2);
                                }
                            }
                            v14 = var24_15 instanceof RuntimeException;
                            if (var2_2 < 0L || var20_12 != null) break block29;
                            try {
                                block33: {
                                    if (!v14) break block30;
                                    break block33;
                                    catch (Throwable v15) {
                                        throw m44.a("l", (Object)v15, (long)-6896750869572948475L, (long)var2_2);
                                    }
                                }
                                throw (RuntimeException)var24_15;
                            }
                            catch (Throwable v16) {
                                throw m44.a("l", (Object)v16, (long)-6896750869572948475L, (long)var2_2);
                            }
                        }
                        try {
                            v17 = var24_15;
                            if (var20_12 != null) break block31;
                            v14 = v17 instanceof t;
                        }
                        catch (Throwable v18) {
                            throw m44.a("l", (Object)v18, (long)-6896750869572948475L, (long)var2_2);
                        }
                    }
                    try {
                        if (v14) {
                            throw (t)var24_15;
                        }
                    }
                    catch (Throwable v19) {
                        throw m44.a("l", (Object)v19, (long)-6896750869572948475L, (long)var2_2);
                    }
                    v17 = var24_15;
                }
                throw (Error)v17;
            }
            catch (Throwable var25_16) {
                try {
                    if (var2_2 > 0L && var22_13) {
                        v20 = new Object[3];
                        v20[2] = true;
                        v20[1] = var21_11;
                        v20[0] = var18_10;
                        m44.a("s", (Object)m44.a("r", (Object)this, (long)-4792512492396421357L, (long)var2_2), (Object)v20, (long)-6800240532986102748L, (long)var2_2);
                    }
                }
                catch (Throwable v21) {
                    throw m44.a("l", (Object)v21, (long)-6896750869572948475L, (long)var2_2);
                }
                throw var25_16;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var22_13) ** GOTO lbl136
                v6 = new Object[3];
                v6[2] = true;
                v6[1] = var21_11;
                v6[0] = var18_10;
                m44.a("s", (Object)m44.a("r", (Object)this, (long)-4792512492396421357L, (long)var2_2), (Object)v6, (long)-6800240532986102748L, (long)var2_2);
            }
            catch (Throwable v7) {
                throw m44.a("l", (Object)v7, (long)-6896750869572948475L, (long)var2_2);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl136:
        // 3 sources

    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void P(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x125D88EB5C68L;
        long l13 = l11 ^ 0x317A7F44EB3FL;
        long l14 = l11 ^ 0x4618CCA6DF7L;
        long l15 = l11 ^ 0x5CE04295D92L;
        qz qz2 = new qz(l12, (int)lqz.a("r", (int)11349, (long)(0x1C70933EE7CAAA0AL ^ l10)));
        boolean bl2 = true;
        CallSite callSite = m44.a("j", (long)1259041947841122171L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = qz2;
        objectArray2[0] = l14;
        m44.a("u", (Object)m44.a("t", (Object)this, (long)1088612677141163381L, (long)l10), (Object)objectArray2, (long)817753137064969623L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l13;
            objectArray3[0] = (int)lqz.a("r", (int)777, (long)(0x17057D253A6B857BL ^ l10));
            m44.a("k", (Object)this, (Object)objectArray3, (long)1069478170104486860L, (long)l10);
            if (callSite != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 < 0L || !bl2) throw throwable;
                Object[] objectArray4 = new Object[3];
                objectArray4[2] = true;
                objectArray4[1] = qz2;
                objectArray4[0] = l15;
                m44.a("u", (Object)m44.a("t", (Object)this, (long)1088612677141163381L, (long)l10), (Object)objectArray4, (long)1425008242627235394L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("j", (Object)runtimeException, (long)1310483367859739747L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray5 = new Object[3];
            objectArray5[2] = true;
            objectArray5[1] = qz2;
            objectArray5[0] = l15;
            m44.a("u", (Object)m44.a("t", (Object)this, (long)1088612677141163381L, (long)l10), (Object)objectArray5, (long)1425008242627235394L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("j", (Object)runtimeException, (long)1310483367859739747L, (long)l10);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void V(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x31811D04701L;
        long l13 = l11 ^ 0x5E06027E903CL;
        long l14 = l11 ^ 0x4C6ADCAAAD5EL;
        long l15 = l11 ^ 0x79712F242B96L;
        long l16 = l11 ^ 0x78DEA7C71BF3L;
        p8 p82 = new p8(l13, (int)lqz.a("r", (int)17374, (long)(0x48FDE686331C82B3L ^ l10)));
        CallSite callSite = m44.a("k", (long)6275905631636195610L, (long)l10);
        boolean bl2 = true;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = p82;
        objectArray2[0] = l15;
        m44.a("t", (Object)m44.a("u", (Object)this, (long)5294819631898438420L, (long)l10), (Object)objectArray2, (long)5564271238342657014L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l14;
            objectArray3[0] = (int)lqz.a("r", (int)1395, (long)(0x25A99A37E66AC502L ^ l10));
            CallSite callSite2 = m44.a("j", (Object)this, (Object)objectArray3, (long)5239640929407770029L, (long)l10);
            m44.a("w", (Object)this, (int)lqz.a("r", (int)1395, (long)(0x25A99A37E66AC502L ^ l10)), (long)5391620358663818763L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = p82;
            objectArray4[0] = l16;
            m44.a("t", (Object)m44.a("u", (Object)this, (long)5294819631898438420L, (long)l10), (Object)objectArray4, (long)6172139733848852515L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("u", (Object)callSite2, (long)6176188698945937946L, (long)l10);
            objectArray5[0] = l12;
            m44.a("t", (Object)p82, (Object)objectArray5, (long)5939438135969451895L, (long)l10);
            if (callSite != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 <= 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = p82;
                objectArray6[0] = l16;
                m44.a("t", (Object)m44.a("u", (Object)this, (long)5294819631898438420L, (long)l10), (Object)objectArray6, (long)6172139733848852515L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("k", (Object)runtimeException, (long)6074996076416866818L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = p82;
            objectArray7[0] = l16;
            m44.a("t", (Object)m44.a("u", (Object)this, (long)5294819631898438420L, (long)l10), (Object)objectArray7, (long)6172139733848852515L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("k", (Object)runtimeException, (long)6074996076416866818L, (long)l10);
        }
    }

    private boolean A(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x5A7F2F658522L;
                CallSite callSite = m44.a("j", (long)7197103532463537635L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)lqz.a("r", (int)17902, (long)(0x42568FAE1DD23136L ^ l10));
                        object = m44.a("k", (Object)this, (Object)objectArray2, (long)7167835623874037633L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("j", (Object)runtimeException, (long)6969313632929066747L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("j", (Object)runtimeException, (long)6969313632929066747L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Exception decompiling
     */
    public final void KU(Object[] var1_1) {
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void k(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x2E096DCEFEF0L;
        long l13 = l11 ^ 0x1B129E407838L;
        long l14 = l11 ^ 0x1ABD16A3485DL;
        long l15 = l11 ^ 0x3C713E6140FFL;
        zx zx2 = new zx((int)lqz.a("r", (int)20213, (long)(0x401365ED4FBADD3FL ^ l10)), l15);
        boolean bl2 = true;
        CallSite callSite = m44.a("m", (long)339490192503659188L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = zx2;
        objectArray2[0] = l13;
        m44.a("r", (Object)m44.a("s", (Object)this, (long)1933337288842311866L, (long)l10), (Object)objectArray2, (long)2203985722274353240L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l12;
            objectArray3[0] = (int)lqz.a("r", (int)15559, (long)(0x41B75E312422AF3FL ^ l10));
            m44.a("l", (Object)this, (Object)objectArray3, (long)1952472932824829443L, (long)l10);
            if (callSite != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 <= 0L || !bl2) throw throwable;
                Object[] objectArray4 = new Object[3];
                objectArray4[2] = true;
                objectArray4[1] = zx2;
                objectArray4[0] = l14;
                m44.a("r", (Object)m44.a("s", (Object)this, (long)1933337288842311866L, (long)l10), (Object)objectArray4, (long)435083353637968781L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("m", (Object)runtimeException, (long)567694196238731692L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray5 = new Object[3];
            objectArray5[2] = true;
            objectArray5[1] = zx2;
            objectArray5[0] = l14;
            m44.a("r", (Object)m44.a("s", (Object)this, (long)1933337288842311866L, (long)l10), (Object)objectArray5, (long)435083353637968781L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("m", (Object)runtimeException, (long)567694196238731692L, (long)l10);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void O(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x109C9B81AE62L;
        long l13 = l11 ^ 0x5FEE56FB443DL;
        long l14 = l11 ^ 0x25FDCEE25458L;
        long l15 = l11 ^ 0x6AF5A575C2F5L;
        long l16 = l11 ^ 0x6B5A2D96F290L;
        v1 v12 = new v1((int)lqz.a("r", (int)24329, (long)(0x252C224D541E772CL ^ l10)), l14);
        CallSite callSite = m44.a("h", (long)-4721059459988889479L, (long)l10);
        boolean bl2 = true;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = v12;
        objectArray2[0] = l15;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)-6910234994618940809L, (long)l10), (Object)objectArray2, (long)-6603595705707156843L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l13;
            objectArray3[0] = (int)lqz.a("r", (int)2683, (long)(0x2E21AB85018F238AL ^ l10));
            CallSite callSite2 = m44.a("i", (Object)this, (Object)objectArray3, (long)-6785268573924002610L, (long)l10);
            m44.a("t", (Object)this, (int)lqz.a("r", (int)2683, (long)(0x2E21AB85018F238AL ^ l10)), (long)-6651269492339234968L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = v12;
            objectArray4[0] = l16;
            m44.a("w", (Object)m44.a("v", (Object)this, (long)-6910234994618940809L, (long)l10), (Object)objectArray4, (long)-4844523108319403712L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("v", (Object)callSite2, (long)-4839916721237816455L, (long)l10);
            objectArray5[0] = l12;
            m44.a("w", (Object)v12, (Object)objectArray5, (long)-4968020141958765036L, (long)l10);
            if (callSite != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 < 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = v12;
                objectArray6[0] = l16;
                m44.a("w", (Object)m44.a("v", (Object)this, (long)-6910234994618940809L, (long)l10), (Object)objectArray6, (long)-4844523108319403712L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("h", (Object)runtimeException, (long)-4815004160440536223L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = v12;
            objectArray7[0] = l16;
            m44.a("w", (Object)m44.a("v", (Object)this, (long)-6910234994618940809L, (long)l10), (Object)objectArray7, (long)-4844523108319403712L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("h", (Object)runtimeException, (long)-4815004160440536223L, (long)l10);
        }
    }

    private boolean e(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x72C0EB4EEEABL;
                CallSite callSite = m44.a("k", (long)605759679906829930L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)lqz.a("r", (int)15462, (long)(0x23ED87C4642356L ^ l10));
                        object = m44.a("j", (Object)this, (Object)objectArray2, (long)644133743837867016L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("k", (Object)runtimeException, (long)810315250114839922L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("k", (Object)runtimeException, (long)810315250114839922L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    private boolean G(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x528092B0C13CL;
                CallSite callSite = m44.a("l", (long)2882083276517276157L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)lqz.a("r", (int)29202, (long)(0x6084AC91D3B8C22CL ^ l10));
                        object = m44.a("m", (Object)this, (Object)objectArray2, (long)2839322178371077023L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("l", (Object)runtimeException, (long)2641907833193589477L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("l", (Object)runtimeException, (long)2641907833193589477L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void KS(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x637F7E5CB7CCL;
        long l13 = l11 ^ 0xAC1176321BBL;
        long l14 = l11 ^ 0x780819E7A206L;
        int n10 = (int)(l14 >>> 48);
        int n11 = (int)(l14 << 16 >>> 32);
        int n12 = (int)(l14 << 48 >>> 48);
        long l15 = l11 ^ 0x3FDAE4EDA773L;
        long l16 = l11 ^ 0x3E756C0E9716L;
        long l17 = l11 ^ 0x329CD69BD10EL;
        zl zl2 = new zl((short)n10, (int)lqz.a("r", (int)30117, (long)(0x794FD74AED063987L ^ l10)), n11, n12);
        boolean bl2 = true;
        CallSite callSite = m44.a("n", (long)-2594855960849349121L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = zl2;
        objectArray2[0] = l15;
        m44.a("q", (Object)m44.a("p", (Object)this, (long)-4206435937634506767L, (long)l10), (Object)objectArray2, (long)-4477416277691871469L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l13;
            objectArray3[0] = (int)lqz.a("r", (int)23039, (long)(0x596A464335FA144EL ^ l10));
            CallSite callSite2 = m44.a("o", (Object)this, (Object)objectArray3, (long)-4299892000792309432L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = zl2;
            objectArray4[0] = l16;
            m44.a("q", (Object)m44.a("p", (Object)this, (long)-4206435937634506767L, (long)l10), (Object)objectArray4, (long)-2791494231818304314L, (long)l10);
            bl2 = false;
            Object object = m44.a("p", (Object)callSite2, (long)-4600094601307602672L, (long)l10);
            object = ((String)object).substring(1, ((String)object).length() - 1);
            Object[] objectArray5 = new Object[4];
            objectArray5[3] = "\"";
            objectArray5[2] = l12;
            objectArray5[1] = c;
            objectArray5[0] = object;
            object = m44.a("n", (Object)objectArray5, (long)-2750658352525748217L, (long)l10);
            Object[] objectArray6 = new Object[2];
            objectArray6[1] = l17;
            objectArray6[0] = object;
            m44.a("q", (Object)zl2, (Object)objectArray6, (long)-4223461284045016494L, (long)l10);
            if (callSite != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 <= 0L || !bl2) throw throwable;
                Object[] objectArray7 = new Object[3];
                objectArray7[2] = true;
                objectArray7[1] = zl2;
                objectArray7[0] = l16;
                m44.a("q", (Object)m44.a("p", (Object)this, (long)-4206435937634506767L, (long)l10), (Object)objectArray7, (long)-2791494231818304314L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("n", (Object)runtimeException, (long)-2833892172716992793L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray8 = new Object[3];
            objectArray8[2] = true;
            objectArray8[1] = zl2;
            objectArray8[0] = l16;
            m44.a("q", (Object)m44.a("p", (Object)this, (long)-4206435937634506767L, (long)l10), (Object)objectArray8, (long)-2791494231818304314L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("n", (Object)runtimeException, (long)-2833892172716992793L, (long)l10);
        }
    }

    private boolean P(Object[] objectArray) {
        Object object;
        block28: {
            block29: {
                long l10 = (Long)objectArray[0];
                long l11 = l10 = a ^ l10;
                long l12 = l11 ^ 0x108E748F5F6L;
                long l13 = l11 ^ 0x7CF840FFD7E7L;
                long l14 = l11 ^ 0x1C84A7D249DDL;
                long l15 = l11 ^ 0xF0206EA83B7L;
                long l16 = l11 ^ 0x5BC478D16D5FL;
                long l17 = l11 ^ 0xC732ADBAA8CL;
                long l18 = l11 ^ 0xC7B94CAC901L;
                CallSite callSite = m44.a("q", (Object)this, (long)8464334210545101492L, (long)l10);
                CallSite callSite2 = m44.a("o", (long)8139155463237316342L, (long)l10);
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        Object[] objectArray2 = new Object[1];
                                                                        objectArray2[0] = l14;
                                                                        object = m44.a("n", (Object)this, (Object)objectArray2, (long)8113525923405928824L, (long)l10);
                                                                        if (callSite2 != null) break block28;
                                                                        if (object == false) break block29;
                                                                    }
                                                                    catch (RuntimeException runtimeException) {
                                                                        throw m44.a("o", (Object)runtimeException, (long)8332451579072626158L, (long)l10);
                                                                    }
                                                                    m44.a("s", (Object)this, (lbd)((Object)callSite), (long)8464334210545101492L, (long)l10);
                                                                    Object[] objectArray3 = new Object[1];
                                                                    objectArray3[0] = l18;
                                                                    object = m44.a("n", (Object)this, (Object)objectArray3, (long)7791019974583247001L, (long)l10);
                                                                    if (callSite2 != null) break block28;
                                                                }
                                                                catch (RuntimeException runtimeException) {
                                                                    throw m44.a("o", (Object)runtimeException, (long)8332451579072626158L, (long)l10);
                                                                }
                                                                if (object == false) break block29;
                                                            }
                                                            catch (RuntimeException runtimeException) {
                                                                throw m44.a("o", (Object)runtimeException, (long)8332451579072626158L, (long)l10);
                                                            }
                                                            m44.a("s", (Object)this, (lbd)((Object)callSite), (long)8464334210545101492L, (long)l10);
                                                            Object[] objectArray4 = new Object[1];
                                                            objectArray4[0] = l12;
                                                            object = m44.a("n", (Object)this, (Object)objectArray4, (long)7507177107156773976L, (long)l10);
                                                            if (callSite2 != null) break block28;
                                                        }
                                                        catch (RuntimeException runtimeException) {
                                                            throw m44.a("o", (Object)runtimeException, (long)8332451579072626158L, (long)l10);
                                                        }
                                                        if (object == false) break block29;
                                                    }
                                                    catch (RuntimeException runtimeException) {
                                                        throw m44.a("o", (Object)runtimeException, (long)8332451579072626158L, (long)l10);
                                                    }
                                                    m44.a("s", (Object)this, (lbd)((Object)callSite), (long)8464334210545101492L, (long)l10);
                                                    Object[] objectArray5 = new Object[1];
                                                    objectArray5[0] = l17;
                                                    object = m44.a("n", (Object)this, (Object)objectArray5, (long)8106727398445471201L, (long)l10);
                                                    if (callSite2 != null) break block28;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw m44.a("o", (Object)runtimeException, (long)8332451579072626158L, (long)l10);
                                                }
                                                if (object == false) break block29;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw m44.a("o", (Object)runtimeException, (long)8332451579072626158L, (long)l10);
                                            }
                                            m44.a("s", (Object)this, (lbd)((Object)callSite), (long)8464334210545101492L, (long)l10);
                                            Object[] objectArray6 = new Object[1];
                                            objectArray6[0] = l16;
                                            object = m44.a("n", (Object)this, (Object)objectArray6, (long)8234007452452434118L, (long)l10);
                                            if (callSite2 != null) break block28;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw m44.a("o", (Object)runtimeException, (long)8332451579072626158L, (long)l10);
                                        }
                                        if (object == false) break block29;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw m44.a("o", (Object)runtimeException, (long)8332451579072626158L, (long)l10);
                                    }
                                    m44.a("s", (Object)this, (lbd)((Object)callSite), (long)8464334210545101492L, (long)l10);
                                    Object[] objectArray7 = new Object[1];
                                    objectArray7[0] = l13;
                                    object = m44.a("n", (Object)this, (Object)objectArray7, (long)7862910497823007384L, (long)l10);
                                    if (callSite2 != null) break block28;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw m44.a("o", (Object)runtimeException, (long)8332451579072626158L, (long)l10);
                                }
                                if (object == false) break block29;
                            }
                            catch (RuntimeException runtimeException) {
                                throw m44.a("o", (Object)runtimeException, (long)8332451579072626158L, (long)l10);
                            }
                            m44.a("s", (Object)this, (lbd)((Object)callSite), (long)8464334210545101492L, (long)l10);
                            Object[] objectArray8 = new Object[1];
                            objectArray8[0] = l15;
                            object = m44.a("n", (Object)this, (Object)objectArray8, (long)8132504694212872782L, (long)l10);
                            if (callSite2 != null) break block28;
                        }
                        catch (RuntimeException runtimeException) {
                            throw m44.a("o", (Object)runtimeException, (long)8332451579072626158L, (long)l10);
                        }
                        if (object == false) break block29;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("o", (Object)runtimeException, (long)8332451579072626158L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("o", (Object)runtimeException, (long)8332451579072626158L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Exception decompiling
     */
    public final void KR(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[CASE]], but top level block is 1[TRYBLOCK]
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
    public final void e(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = lqz.a ^ var2_2;
        var4_3 = v0 ^ 67336464253410L;
        var6_4 = v0 ^ 35759369487965L;
        var8_5 = v0 ^ 51475832899538L;
        var10_6 = v0 ^ 107356663246221L;
        var12_7 = v0 ^ 39256567410527L;
        var14_8 = v0 ^ 29202577486072L;
        var16_9 = v0 ^ 93149658114885L;
        var18_10 = v0 ^ 93559699757856L;
        var21_11 = new q_(var6_4, (int)lqz.a("r", (int)16227, (long)(6489789776470556591L ^ var2_2)));
        var20_12 = m44.a("h", (long)1714555491035695561L, (long)var2_2);
        var22_13 = true;
        v1 = new Object[2];
        v1[1] = var21_11;
        v1[0] = var16_9;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)696324767690419143L, (long)var2_2), (Object)v1, (long)1003017374191452965L, (long)var2_2);
        try {
            v2 = new Object[2];
            v2[1] = var10_6;
            v2[0] = (int)lqz.a("r", (int)31940, (long)(2866292736454949949L ^ var2_2));
            var23_14 = m44.a("i", (Object)this, (Object)v2, (long)605132043459681662L, (long)var2_2);
            m44.a("t", (Object)this, (int)lqz.a("r", (int)31940, (long)(2866292736454949949L ^ var2_2)), (long)721086041943412440L, (long)var2_2);
            v3 = new Object[1];
            v3[0] = var12_7;
            m44.a("w", (Object)this, (Object)v3, (long)1148039210113355611L, (long)var2_2);
            v4 = new Object[3];
            v4[2] = true;
            v4[1] = var21_11;
            v4[0] = var18_10;
            m44.a("w", (Object)m44.a("v", (Object)this, (long)696324767690419143L, (long)var2_2), (Object)v4, (long)1546130690159855856L, (long)var2_2);
            var22_13 = false;
            v5 = new Object[2];
            v5[1] = (int)m44.a("v", (Object)var23_14, (long)1541663938831721161L, (long)var2_2);
            v5[0] = var8_5;
            m44.a("w", (Object)var21_11, (Object)v5, (long)1350572244898828196L, (long)var2_2);
            ** if (var20_12 != null) goto lbl-1000
        }
        catch (Throwable var24_15) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block26: {
                                    block27: {
                                        if (var2_2 < 0L) break block26;
                                        v8 = var22_13;
                                        if (var20_12 != null) break block27;
                                        try {
                                            block32: {
                                                if (!v8) ** GOTO lbl84
                                                break block32;
                                                catch (Throwable v9) {
                                                    throw m44.a("h", (Object)v9, (long)1485507793083718353L, (long)var2_2);
                                                }
                                            }
                                            v10 = new Object[2];
                                            v10[1] = var14_8;
                                            v10[0] = var21_11;
                                            m44.a("w", (Object)m44.a("v", (Object)this, (long)696324767690419143L, (long)var2_2), (Object)v10, (long)866928448494154367L, (long)var2_2);
                                            v8 = false;
                                        }
                                        catch (Throwable v11) {
                                            throw m44.a("h", (Object)v11, (long)1485507793083718353L, (long)var2_2);
                                        }
                                    }
                                    var22_13 = v8;
                                }
                                try {
                                    if (var2_2 <= 0L || var20_12 == null) break block28;
lbl84:
                                    // 2 sources

                                    v12 = new Object[1];
                                    v12[0] = var4_3;
                                    m44.a("w", (Object)m44.a("v", (Object)this, (long)696324767690419143L, (long)var2_2), (Object)v12, (long)884380540445509953L, (long)var2_2);
                                }
                                catch (Throwable v13) {
                                    throw m44.a("h", (Object)v13, (long)1485507793083718353L, (long)var2_2);
                                }
                            }
                            v14 = var24_15 instanceof RuntimeException;
                            if (var2_2 < 0L || var20_12 != null) break block29;
                            try {
                                block33: {
                                    if (!v14) break block30;
                                    break block33;
                                    catch (Throwable v15) {
                                        throw m44.a("h", (Object)v15, (long)1485507793083718353L, (long)var2_2);
                                    }
                                }
                                throw (RuntimeException)var24_15;
                            }
                            catch (Throwable v16) {
                                throw m44.a("h", (Object)v16, (long)1485507793083718353L, (long)var2_2);
                            }
                        }
                        try {
                            v17 = var24_15;
                            if (var20_12 != null) break block31;
                            v14 = v17 instanceof t;
                        }
                        catch (Throwable v18) {
                            throw m44.a("h", (Object)v18, (long)1485507793083718353L, (long)var2_2);
                        }
                    }
                    try {
                        if (v14) {
                            throw (t)var24_15;
                        }
                    }
                    catch (Throwable v19) {
                        throw m44.a("h", (Object)v19, (long)1485507793083718353L, (long)var2_2);
                    }
                    v17 = var24_15;
                }
                throw (Error)v17;
            }
            catch (Throwable var25_16) {
                try {
                    if (var2_2 > 0L && var22_13) {
                        v20 = new Object[3];
                        v20[2] = true;
                        v20[1] = var21_11;
                        v20[0] = var18_10;
                        m44.a("w", (Object)m44.a("v", (Object)this, (long)696324767690419143L, (long)var2_2), (Object)v20, (long)1546130690159855856L, (long)var2_2);
                    }
                }
                catch (Throwable v21) {
                    throw m44.a("h", (Object)v21, (long)1485507793083718353L, (long)var2_2);
                }
                throw var25_16;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var22_13) ** GOTO lbl136
                v6 = new Object[3];
                v6[2] = true;
                v6[1] = var21_11;
                v6[0] = var18_10;
                m44.a("w", (Object)m44.a("v", (Object)this, (long)696324767690419143L, (long)var2_2), (Object)v6, (long)1546130690159855856L, (long)var2_2);
            }
            catch (Throwable v7) {
                throw m44.a("h", (Object)v7, (long)1485507793083718353L, (long)var2_2);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl136:
        // 3 sources

    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void KM(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x63A7103F30B5L;
        long l13 = l11 ^ 0x2CD5DD45DAEAL;
        long l14 = l11 ^ 0x19CE2ECB5C22L;
        long l15 = l11 ^ 0x50B6DE81708BL;
        long l16 = l15 >>> 16;
        int n10 = (int)(l15 << 48 >>> 48);
        long l17 = l11 ^ 0x1861A6286C47L;
        qt qt2 = new qt((int)lqz.a("r", (int)23813, (long)(0xE2A523328536A2AL ^ l10)), l16, (char)n10);
        boolean bl2 = true;
        CallSite callSite = m44.a("o", (long)2354290054427573934L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = qt2;
        objectArray2[0] = l14;
        m44.a("p", (Object)m44.a("q", (Object)this, (long)4525724936328535200L, (long)l10), (Object)objectArray2, (long)4218786030355559490L, (long)l10);
        CallSite callSite2 = callSite;
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l13;
            objectArray3[0] = (int)lqz.a("r", (int)16196, (long)(0x3F997ECAF47A8835L ^ l10));
            CallSite callSite3 = m44.a("n", (Object)this, (Object)objectArray3, (long)4540350894161390105L, (long)l10);
            m44.a("s", (Object)this, (int)lqz.a("r", (int)11495, (long)(0x7F72F7ADDE0E1BFFL ^ l10)), (long)4424367279459056063L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = qt2;
            objectArray4[0] = l17;
            m44.a("p", (Object)m44.a("q", (Object)this, (long)4525724936328535200L, (long)l10), (Object)objectArray4, (long)2455509485298253719L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("q", (Object)callSite3, (long)2450620486004708782L, (long)l10);
            objectArray5[0] = l12;
            m44.a("p", (Object)qt2, (Object)objectArray5, (long)2727350941303011523L, (long)l10);
            if (callSite2 != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 <= 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = qt2;
                objectArray6[0] = l17;
                m44.a("p", (Object)m44.a("q", (Object)this, (long)4525724936328535200L, (long)l10), (Object)objectArray6, (long)2455509485298253719L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("o", (Object)runtimeException, (long)2592622037186342326L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = qt2;
            objectArray7[0] = l17;
            m44.a("p", (Object)m44.a("q", (Object)this, (long)4525724936328535200L, (long)l10), (Object)objectArray7, (long)2455509485298253719L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("o", (Object)runtimeException, (long)2592622037186342326L, (long)l10);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void Kh(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = lqz.a ^ var2_2;
        var4_3 = v0 ^ 79218578353838L;
        var6_4 = v0 ^ 75342107561934L;
        var8_5 = v0 ^ 34448759427082L;
        var10_6 = v0 ^ 96109208439294L;
        var12_7 = v0 ^ 26508106163105L;
        var14_8 = v0 ^ 109089162493652L;
        var16_9 = v0 ^ 49478389130601L;
        var18_10 = v0 ^ 49132767925516L;
        var21_11 = new pj(var4_3, (int)lqz.a("r", (int)20832, (long)(1976877117804109610L ^ var2_2)));
        var22_12 = true;
        var20_13 = m44.a("l", (long)-7356864623168567323L, (long)var2_2);
        v1 = new Object[2];
        v1[1] = var21_11;
        v1[0] = var16_9;
        m44.a("s", (Object)m44.a("r", (Object)this, (long)-8681341289255868949L, (long)var2_2), (Object)v1, (long)-8951160149897343735L, (long)var2_2);
        try {
            v2 = new Object[2];
            v2[1] = var12_7;
            v2[0] = (int)lqz.a("r", (int)27652, (long)(2383843131035378343L ^ var2_2));
            var23_14 = m44.a("m", (Object)this, (Object)v2, (long)-8770296438755667118L, (long)var2_2);
            m44.a("p", (Object)this, (int)lqz.a("r", (int)20854, (long)(4248442363072864127L ^ var2_2)), (long)-8922274800714317580L, (long)var2_2);
            v3 = new Object[1];
            v3[0] = var8_5;
            m44.a("s", (Object)this, (Object)v3, (long)-9076973557957310848L, (long)var2_2);
            v4 = new Object[3];
            v4[2] = true;
            v4[1] = var21_11;
            v4[0] = var18_10;
            m44.a("s", (Object)m44.a("r", (Object)this, (long)-8681341289255868949L, (long)var2_2), (Object)v4, (long)-7252893183178684708L, (long)var2_2);
            var22_12 = false;
            v5 = new Object[2];
            v5[1] = (int)m44.a("r", (Object)var23_14, (long)-7257147729164456731L, (long)var2_2);
            v5[0] = var10_6;
            m44.a("s", (Object)var21_11, (Object)v5, (long)-7164580541131079288L, (long)var2_2);
            ** if (var20_13 != null) goto lbl-1000
        }
        catch (Throwable var24_15) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block26: {
                                    block27: {
                                        if (var2_2 <= 0L) break block26;
                                        v8 = var22_12;
                                        if (var20_13 != null) break block27;
                                        try {
                                            block32: {
                                                if (!v8) ** GOTO lbl84
                                                break block32;
                                                catch (Throwable v9) {
                                                    throw m44.a("l", (Object)v9, (long)-7299793144767130371L, (long)var2_2);
                                                }
                                            }
                                            v10 = new Object[2];
                                            v10[1] = var14_8;
                                            v10[0] = var21_11;
                                            m44.a("s", (Object)m44.a("r", (Object)this, (long)-8681341289255868949L, (long)var2_2), (Object)v10, (long)-9067000125994681261L, (long)var2_2);
                                            v8 = false;
                                        }
                                        catch (Throwable v11) {
                                            throw m44.a("l", (Object)v11, (long)-7299793144767130371L, (long)var2_2);
                                        }
                                    }
                                    var22_12 = v8;
                                }
                                try {
                                    if (var2_2 < 0L || var20_13 == null) break block28;
lbl84:
                                    // 2 sources

                                    v12 = new Object[1];
                                    v12[0] = var6_4;
                                    m44.a("s", (Object)m44.a("r", (Object)this, (long)-8681341289255868949L, (long)var2_2), (Object)v12, (long)-9049549339629500563L, (long)var2_2);
                                }
                                catch (Throwable v13) {
                                    throw m44.a("l", (Object)v13, (long)-7299793144767130371L, (long)var2_2);
                                }
                            }
                            v14 = var24_15 instanceof RuntimeException;
                            if (var2_2 <= 0L || var20_13 != null) break block29;
                            try {
                                block33: {
                                    if (!v14) break block30;
                                    break block33;
                                    catch (Throwable v15) {
                                        throw m44.a("l", (Object)v15, (long)-7299793144767130371L, (long)var2_2);
                                    }
                                }
                                throw (RuntimeException)var24_15;
                            }
                            catch (Throwable v16) {
                                throw m44.a("l", (Object)v16, (long)-7299793144767130371L, (long)var2_2);
                            }
                        }
                        try {
                            v17 = var24_15;
                            if (var20_13 != null) break block31;
                            v14 = v17 instanceof t;
                        }
                        catch (Throwable v18) {
                            throw m44.a("l", (Object)v18, (long)-7299793144767130371L, (long)var2_2);
                        }
                    }
                    try {
                        if (v14) {
                            throw (t)var24_15;
                        }
                    }
                    catch (Throwable v19) {
                        throw m44.a("l", (Object)v19, (long)-7299793144767130371L, (long)var2_2);
                    }
                    v17 = var24_15;
                }
                throw (Error)v17;
            }
            catch (Throwable var25_16) {
                try {
                    if (var2_2 > 0L && var22_12) {
                        v20 = new Object[3];
                        v20[2] = true;
                        v20[1] = var21_11;
                        v20[0] = var18_10;
                        m44.a("s", (Object)m44.a("r", (Object)this, (long)-8681341289255868949L, (long)var2_2), (Object)v20, (long)-7252893183178684708L, (long)var2_2);
                    }
                }
                catch (Throwable v21) {
                    throw m44.a("l", (Object)v21, (long)-7299793144767130371L, (long)var2_2);
                }
                throw var25_16;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var22_12) ** GOTO lbl136
                v6 = new Object[3];
                v6[2] = true;
                v6[1] = var21_11;
                v6[0] = var18_10;
                m44.a("s", (Object)m44.a("r", (Object)this, (long)-8681341289255868949L, (long)var2_2), (Object)v6, (long)-7252893183178684708L, (long)var2_2);
            }
            catch (Throwable v7) {
                throw m44.a("l", (Object)v7, (long)-7299793144767130371L, (long)var2_2);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl136:
        // 3 sources

    }

    /*
     * Exception decompiling
     */
    public final void Kb(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [79[CASE]], but top level block is 2[TRYBLOCK]
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
    public final void S(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [17[CASE]], but top level block is 2[TRYBLOCK]
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

    private boolean M(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x2C1F85D06EFEL;
                CallSite callSite = m44.a("n", (long)7731964016667374927L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l11;
                        object = m44.a("o", (Object)this, (Object)objectArray2, (long)7631489773397595715L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("n", (Object)runtimeException, (long)7501785436146837079L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("n", (Object)runtimeException, (long)7501785436146837079L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    private boolean R(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x4F645F95FFB3L;
                CallSite callSite = m44.a("k", (long)1833011900405958514L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)lqz.a("r", (int)18527, (long)(0x20BD101DC355C770L ^ l10));
                        object = m44.a("j", (Object)this, (Object)objectArray2, (long)1866831787168595216L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("k", (Object)runtimeException, (long)1884453844481889386L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("k", (Object)runtimeException, (long)1884453844481889386L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Exception decompiling
     */
    public final void Ki(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 2[TRYBLOCK]
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
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void KP(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x360969DABD5L;
        long l13 = l11 ^ 0x4C125BE7418AL;
        long l14 = l11 ^ 0x447E1BC827FBL;
        long l15 = l11 ^ 0x7909A869C742L;
        long l16 = l11 ^ 0x78A6208AF727L;
        qi qi2 = new qi((int)lqz.a("r", (int)16391, (long)(0x45AB4063DAD96CA3L ^ l10)), l14);
        boolean bl2 = true;
        CallSite callSite = m44.a("o", (long)-4914413922489899570L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = qi2;
        objectArray2[0] = l15;
        m44.a("p", (Object)m44.a("q", (Object)this, (long)-6507989402963163200L, (long)l10), (Object)objectArray2, (long)-6778969339428360414L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l13;
            objectArray3[0] = (int)lqz.a("r", (int)1945, (long)(0x1329CE18E4392B01L ^ l10));
            CallSite callSite2 = m44.a("n", (Object)this, (Object)objectArray3, (long)-6601448216896507527L, (long)l10);
            m44.a("s", (Object)this, (int)lqz.a("r", (int)25684, (long)(0x7BD61FBED099482DL ^ l10)), (long)-6483245716060364065L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = qi2;
            objectArray4[0] = l16;
            m44.a("p", (Object)m44.a("q", (Object)this, (long)-6507989402963163200L, (long)l10), (Object)objectArray4, (long)-5083481946253728521L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("q", (Object)callSite2, (long)-5088440176058200370L, (long)l10);
            objectArray5[0] = l12;
            m44.a("p", (Object)qi2, (Object)objectArray5, (long)-4703693165858397277L, (long)l10);
            if (callSite != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 < 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = qi2;
                objectArray6[0] = l16;
                m44.a("p", (Object)m44.a("q", (Object)this, (long)-6507989402963163200L, (long)l10), (Object)objectArray6, (long)-5083481946253728521L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("o", (Object)runtimeException, (long)-5144596463003240746L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = qi2;
            objectArray7[0] = l16;
            m44.a("p", (Object)m44.a("q", (Object)this, (long)-6507989402963163200L, (long)l10), (Object)objectArray7, (long)-5083481946253728521L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("o", (Object)runtimeException, (long)-5144596463003240746L, (long)l10);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private lbd N(Object[] var1_1) {
        block24: {
            block25: {
                block26: {
                    block27: {
                        block28: {
                            block23: {
                                block21: {
                                    var4_2 = (Integer)var1_1[0];
                                    var2_3 = (Long)var1_1[1];
                                    v0 = var2_3 = lqz.a ^ var2_3;
                                    var5_4 = v0 ^ 39188824406751L;
                                    var7_5 = v0 ^ 53728423602677L;
                                    var10_6 = m44.a("s", (Object)this, (long)3802016463665018178L, (long)var2_3);
                                    var9_7 = m44.a("m", (long)2906579943944418900L, (long)var2_3);
                                    try {
                                        block22: {
                                            try {
                                                try {
                                                    v1 = this;
                                                    v2 = m44.a("s", (Object)this, (long)3925202593985728037L, (long)var2_3);
                                                    if (var9_7 != null) break block21;
                                                    m44.a("q", (Object)v1, (lbd)v2, (long)3802016463665018178L, (long)var2_3);
                                                    if (m44.a("s", (Object)v2, (long)3185793429954210624L, (long)var2_3) == null) break block22;
                                                }
                                                catch (RuntimeException v3) {
                                                    throw m44.a("m", (Object)v3, (long)3098750709598807372L, (long)var2_3);
                                                }
                                                m44.a("q", (Object)this, (lbd)m44.a("s", (Object)m44.a("s", (Object)this, (long)3925202593985728037L, (long)var2_3), (long)3185793429954210624L, (long)var2_3), (long)3925202593985728037L, (long)var2_3);
                                                if (var2_3 <= 0L || var9_7 == null) break block23;
                                            }
                                            catch (RuntimeException v4) {
                                                throw m44.a("m", (Object)v4, (long)3098750709598807372L, (long)var2_3);
                                            }
                                        }
                                        v1 = this;
                                        v5 = new Object[1];
                                        v5[0] = var7_5;
                                        v6 = m44.a("r", (Object)m44.a("s", (Object)this, (long)3401321931324580100L, (long)var2_3), (Object)v5, (long)3622075950582111849L, (long)var2_3);
                                        v2 = v6;
                                        m44.a("q", (Object)m44.a("s", (Object)this, (long)3925202593985728037L, (long)var2_3), (lbd)v6, (long)3185793429954210624L, (long)var2_3);
                                    }
                                    catch (RuntimeException v7) {
                                        throw m44.a("m", (Object)v7, (long)3098750709598807372L, (long)var2_3);
                                    }
                                }
                                m44.a("q", (Object)v1, (lbd)v2, (long)3925202593985728037L, (long)var2_3);
                            }
                            try {
                                try {
                                    try {
                                        v8 = this;
                                        v9 = var9_7;
                                        if (var2_3 < 0L) break block24;
                                        if (v9 != null) break block25;
                                        if (m44.a("s", (Object)m44.a("s", (Object)v8, (long)3802016463665018178L, (long)var2_3), (long)4028217436281576674L, (long)var2_3) != var4_2) break block26;
                                    }
                                    catch (RuntimeException v10) {
                                        throw m44.a("m", (Object)v10, (long)3098750709598807372L, (long)var2_3);
                                    }
                                    v11 = this;
                                    m44.a("q", (Object)v11, (int)(m44.a("s", (Object)v11, (long)3930684386426786698L, (long)var2_3) + true), (long)3930684386426786698L, (long)var2_3);
                                    v12 = this;
                                    if (var9_7 != null) break block27;
                                }
                                catch (RuntimeException v13) {
                                    throw m44.a("m", (Object)v13, (long)3098750709598807372L, (long)var2_3);
                                }
                                v14 = m44.a("s", (Object)v12, (long)3060572194248330718L, (long)var2_3) + true;
                                m44.a("q", (Object)v12, (int)v14, (long)3060572194248330718L, (long)var2_3);
                                if (v14 <= lqz.a("r", (int)4750, (long)(1604202285138947434L ^ var2_3))) break block28;
                            }
                            catch (RuntimeException v15) {
                                throw m44.a("m", (Object)v15, (long)3098750709598807372L, (long)var2_3);
                            }
                            m44.a("q", (Object)this, (int)0, (long)3060572194248330718L, (long)var2_3);
                            var11_8 = 0;
                            block16: while (true) {
                                v16 /* !! */  = var11_8;
                                v17 /* !! */  = ((CallSite)m44.a("s", (Object)this, (long)3975695401820872286L, (long)var2_3)).length;
                                block17: while (v16 /* !! */  < v17 /* !! */ ) {
                                    v12 = this;
                                    if (var9_7 != null) break block27;
                                    var12_9 = m44.a("s", (Object)v12, (long)3975695401820872286L, (long)var2_3)[var11_8];
                                    while (var12_9 != null) {
                                        block29: {
                                            block30: {
                                                try {
                                                    if (var2_3 < 0L) break block29;
                                                    v18 = var12_9;
                                                    if (var9_7 != null) break block30;
                                                    v16 /* !! */  = (int)m44.a("s", (Object)v18, (long)3223230371872897353L, (long)var2_3);
                                                    v17 /* !! */  = (int)m44.a("s", (Object)this, (long)3930684386426786698L, (long)var2_3);
                                                    if (var9_7 != null || var2_3 <= 0L) continue block17;
                                                }
                                                catch (RuntimeException v19) {
                                                    throw m44.a("m", (Object)v19, (long)3098750709598807372L, (long)var2_3);
                                                }
                                                try {
                                                    if (v16 /* !! */  < v17 /* !! */ ) {
                                                        m44.a("q", (Object)var12_9, null, (long)2984061300610311016L, (long)var2_3);
                                                    }
                                                }
                                                catch (RuntimeException v20) {
                                                    throw m44.a("m", (Object)v20, (long)3098750709598807372L, (long)var2_3);
                                                }
                                                v18 = m44.a("s", (Object)var12_9, (long)3149374336009967679L, (long)var2_3);
                                            }
                                            var12_9 = v18;
                                        }
                                        v21 = var9_7;
lbl95:
                                        // 2 sources

                                        ** while (v21 != null)
lbl96:
                                        // 1 sources

                                    }
lbl97:
                                    // 2 sources

                                    ++var11_8;
                                    v21 = var9_7;
                                    if (var2_3 <= 0L) ** GOTO lbl95
                                    if (v21 == null) continue block16;
                                }
                                break;
                            }
                        }
                        v12 = this;
                    }
                    return m44.a("s", (Object)v12, (long)3802016463665018178L, (long)var2_3);
                }
                m44.a("q", (Object)this, (lbd)m44.a("s", (Object)this, (long)3802016463665018178L, (long)var2_3), (long)3925202593985728037L, (long)var2_3);
                m44.a("q", (Object)this, (lbd)var10_6, (long)3802016463665018178L, (long)var2_3);
                m44.a("q", (Object)this, (int)var4_2, (long)2905966295134995150L, (long)var2_3);
                v8 = this;
            }
            v22 = new Object[1];
            v9 = v22;
            v22[0] = var5_4;
        }
        throw m44.a("r", (Object)v8, (Object)v9, (long)2899699272019016718L, (long)var2_3);
    }

    private boolean B(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x623766470DFAL;
                CallSite callSite = m44.a("j", (long)-1497156812782160581L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)lqz.a("r", (int)18527, (long)(0x20BD3D4EFA873539L ^ l10));
                        object = m44.a("k", (Object)this, (Object)objectArray2, (long)-1467754780947017895L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("j", (Object)runtimeException, (long)-1697925664337517021L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("j", (Object)runtimeException, (long)-1697925664337517021L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Exception decompiling
     */
    public final void w(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 3[TRYBLOCK]
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
    public final void KV(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[CASE]], but top level block is 2[TRYBLOCK]
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
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void m(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x7AF59E26ACE7L;
        long l13 = l11 ^ 0x3587535C46B8L;
        long l14 = l11 ^ 0x79279B2E94CDL;
        long l15 = l11 ^ 0x9CA0D2C070L;
        long l16 = l11 ^ 0x1332831F015L;
        pg pg2 = new pg((int)lqz.a("r", (int)6286, (long)(0x36C276565669B3BCL ^ l10)), l14);
        boolean bl2 = true;
        CallSite callSite = m44.a("m", (long)-4828414027229404420L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = pg2;
        objectArray2[0] = l15;
        m44.a("r", (Object)m44.a("s", (Object)this, (long)-6729359108515512078L, (long)l10), (Object)objectArray2, (long)-6422631317373933552L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l13;
            objectArray3[0] = (int)lqz.a("r", (int)28367, (long)(0x6968126AEAD24576L ^ l10));
            CallSite callSite2 = m44.a("l", (Object)this, (Object)objectArray3, (long)-6678688406383069621L, (long)l10);
            m44.a("q", (Object)this, (int)lqz.a("r", (int)21792, (long)(0x761DD041A15FFEA5L ^ l10)), (long)-6830663434370210323L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = pg2;
            objectArray4[0] = l16;
            m44.a("r", (Object)m44.a("s", (Object)this, (long)-6729359108515512078L, (long)l10), (Object)objectArray4, (long)-4737327695387139131L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("s", (Object)callSite2, (long)-4733209491334329860L, (long)l10);
            objectArray5[0] = l12;
            m44.a("r", (Object)pg2, (Object)objectArray5, (long)-5076851550884141935L, (long)l10);
            if (callSite != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 <= 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = pg2;
                objectArray6[0] = l16;
                m44.a("r", (Object)m44.a("s", (Object)this, (long)-6729359108515512078L, (long)l10), (Object)objectArray6, (long)-4737327695387139131L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("m", (Object)runtimeException, (long)-4636243253525548572L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = pg2;
            objectArray7[0] = l16;
            m44.a("r", (Object)m44.a("s", (Object)this, (long)-6729359108515512078L, (long)l10), (Object)objectArray7, (long)-4737327695387139131L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("m", (Object)runtimeException, (long)-4636243253525548572L, (long)l10);
        }
    }

    private boolean d(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x16DDDF91D562L;
                CallSite callSite = m44.a("j", (long)3720381370351414691L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)lqz.a("r", (int)9110, (long)(0x268D19B8BA520706L ^ l10));
                        object = m44.a("k", (Object)this, (Object)objectArray2, (long)3690990333632665537L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("j", (Object)runtimeException, (long)3528488325909479099L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("j", (Object)runtimeException, (long)3528488325909479099L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean f(Object[] objectArray) {
        Object object;
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x326A2BFC3819L;
        long l13 = l11 ^ 0x1D9DE652C2B5L;
        CallSite callSite = m44.a("h", (long)5321975661020616665L, (long)l10);
        m44.a("t", (Object)this, (int)n10, (long)5439512532152277137L, (long)l10);
        CallSite callSite2 = m44.a("v", (Object)this, (long)6146906006322205903L, (long)l10);
        m44.a("t", (Object)this, (lbd)((Object)callSite2), (long)5501210105282171803L, (long)l10);
        m44.a("t", (Object)this, (lbd)((Object)callSite2), (long)5893966044178053580L, (long)l10);
        CallSite callSite3 = callSite;
        try {
            Object object2;
            block6: {
                block7: {
                    try {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l13;
                        object2 = m44.a("i", (Object)this, (Object)objectArray2, (long)6300094884917629193L, (long)l10);
                        if (callSite3 != null) break block6;
                        if (object2 != false) break block7;
                    }
                    catch (ad ad2) {
                        throw m44.a("h", (Object)ad2, (long)5372146741919089857L, (long)l10);
                    }
                    object2 = true;
                    break block6;
                }
                object2 = false;
            }
            object = object2;
        }
        catch (ad ad3) {
            boolean bl2;
            try {
                bl2 = true;
            }
            catch (Throwable throwable) {
                Object[] objectArray3 = new Object[3];
                objectArray3[2] = n10;
                objectArray3[1] = l12;
                objectArray3[0] = 5;
                m44.a("i", (Object)this, (Object)objectArray3, (long)5472805489020816561L, (long)l10);
                throw throwable;
            }
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = n10;
            objectArray4[1] = l12;
            objectArray4[0] = 5;
            m44.a("i", (Object)this, (Object)objectArray4, (long)5472805489020816561L, (long)l10);
            return bl2;
        }
        Object[] objectArray5 = new Object[3];
        objectArray5[2] = n10;
        objectArray5[1] = l12;
        objectArray5[0] = 5;
        m44.a("i", (Object)this, (Object)objectArray5, (long)5472805489020816561L, (long)l10);
        return (boolean)object;
    }

    /*
     * Exception decompiling
     */
    public final void KT(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [14[CASE]], but top level block is 2[TRYBLOCK]
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
    public final void K3(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[CASE]], but top level block is 2[TRYBLOCK]
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
    public final void q(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 2[TRYBLOCK]
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
    public final void Kr(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = lqz.a ^ var2_2;
        var4_3 = v0 ^ 72631617437434L;
        var6_4 = v0 ^ 90031196076234L;
        var8_5 = v0 ^ 33607180554901L;
        var10_6 = v0 ^ 38094648780104L;
        var12_7 = v0 ^ 111859781341152L;
        var14_8 = v0 ^ 47876998796381L;
        var16_9 = v0 ^ 86395265303078L;
        var18_10 = v0 ^ 46337116775480L;
        var21_11 = new p1(var10_6, 4);
        var22_12 = true;
        var20_13 = m44.a("h", (long)-1669942582393096495L, (long)var2_2);
        v1 = new Object[2];
        v1[1] = var21_11;
        v1[0] = var14_8;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)-670569477343570721L, (long)var2_2), (Object)v1, (long)-940388312274437059L, (long)var2_2);
        try {
            v2 = new Object[2];
            v2[1] = var8_5;
            v2[0] = (int)lqz.a("r", (int)29062, (long)(8566341013280001698L ^ var2_2));
            var23_14 = m44.a("i", (Object)this, (Object)v2, (long)-613154410002439578L, (long)var2_2);
            m44.a("t", (Object)this, (int)lqz.a("r", (int)29062, (long)(8566341013280001698L ^ var2_2)), (long)-785402199360507456L, (long)var2_2);
            v3 = new Object[1];
            v3[0] = var16_9;
            m44.a("w", (Object)this, (Object)v3, (long)-977765445264399555L, (long)var2_2);
            v4 = new Object[3];
            v4[2] = true;
            v4[1] = var21_11;
            v4[0] = var18_10;
            m44.a("w", (Object)m44.a("v", (Object)this, (long)-670569477343570721L, (long)var2_2), (Object)v4, (long)-1554715382143043608L, (long)var2_2);
            var22_12 = false;
            v5 = new Object[2];
            v5[1] = (int)m44.a("v", (Object)var23_14, (long)-1549968227028574767L, (long)var2_2);
            v5[0] = var6_4;
            m44.a("w", (Object)var21_11, (Object)v5, (long)-1322284236094590788L, (long)var2_2);
            ** if (var20_13 != null) goto lbl-1000
        }
        catch (Throwable var24_15) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block26: {
                                    block27: {
                                        if (var2_2 <= 0L) break block26;
                                        v8 = var22_12;
                                        if (var20_13 != null) break block27;
                                        try {
                                            block32: {
                                                if (!v8) ** GOTO lbl84
                                                break block32;
                                                catch (Throwable v9) {
                                                    throw m44.a("h", (Object)v9, (long)-1475515721925679671L, (long)var2_2);
                                                }
                                            }
                                            v10 = new Object[2];
                                            v10[1] = var12_7;
                                            v10[0] = var21_11;
                                            m44.a("w", (Object)m44.a("v", (Object)this, (long)-670569477343570721L, (long)var2_2), (Object)v10, (long)-927866972624564889L, (long)var2_2);
                                            v8 = false;
                                        }
                                        catch (Throwable v11) {
                                            throw m44.a("h", (Object)v11, (long)-1475515721925679671L, (long)var2_2);
                                        }
                                    }
                                    var22_12 = v8;
                                }
                                try {
                                    if (var2_2 <= 0L || var20_13 == null) break block28;
lbl84:
                                    // 2 sources

                                    v12 = new Object[1];
                                    v12[0] = var4_3;
                                    m44.a("w", (Object)m44.a("v", (Object)this, (long)-670569477343570721L, (long)var2_2), (Object)v12, (long)-910417234364713383L, (long)var2_2);
                                }
                                catch (Throwable v13) {
                                    throw m44.a("h", (Object)v13, (long)-1475515721925679671L, (long)var2_2);
                                }
                            }
                            v14 = var24_15 instanceof RuntimeException;
                            if (var2_2 < 0L || var20_13 != null) break block29;
                            try {
                                block33: {
                                    if (!v14) break block30;
                                    break block33;
                                    catch (Throwable v15) {
                                        throw m44.a("h", (Object)v15, (long)-1475515721925679671L, (long)var2_2);
                                    }
                                }
                                throw (RuntimeException)var24_15;
                            }
                            catch (Throwable v16) {
                                throw m44.a("h", (Object)v16, (long)-1475515721925679671L, (long)var2_2);
                            }
                        }
                        try {
                            v17 = var24_15;
                            if (var20_13 != null) break block31;
                            v14 = v17 instanceof t;
                        }
                        catch (Throwable v18) {
                            throw m44.a("h", (Object)v18, (long)-1475515721925679671L, (long)var2_2);
                        }
                    }
                    try {
                        if (v14) {
                            throw (t)var24_15;
                        }
                    }
                    catch (Throwable v19) {
                        throw m44.a("h", (Object)v19, (long)-1475515721925679671L, (long)var2_2);
                    }
                    v17 = var24_15;
                }
                throw (Error)v17;
            }
            catch (Throwable var25_16) {
                try {
                    if (var2_2 > 0L && var22_12) {
                        v20 = new Object[3];
                        v20[2] = true;
                        v20[1] = var21_11;
                        v20[0] = var18_10;
                        m44.a("w", (Object)m44.a("v", (Object)this, (long)-670569477343570721L, (long)var2_2), (Object)v20, (long)-1554715382143043608L, (long)var2_2);
                    }
                }
                catch (Throwable v21) {
                    throw m44.a("h", (Object)v21, (long)-1475515721925679671L, (long)var2_2);
                }
                throw var25_16;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var22_12) ** GOTO lbl136
                v6 = new Object[3];
                v6[2] = true;
                v6[1] = var21_11;
                v6[0] = var18_10;
                m44.a("w", (Object)m44.a("v", (Object)this, (long)-670569477343570721L, (long)var2_2), (Object)v6, (long)-1554715382143043608L, (long)var2_2);
            }
            catch (Throwable v7) {
                throw m44.a("h", (Object)v7, (long)-1475515721925679671L, (long)var2_2);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl136:
        // 3 sources

    }

    private static void U(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        int[] nArray = new int[lqz.a("r", (int)22002, (long)(0x58753082C1E4EA45L ^ l10))];
        nArray[0] = 0;
        nArray[1] = (int)lqz.a("r", (int)12675, (long)(0x61C168E600DB8E16L ^ l10));
        nArray[2] = (int)lqz.a("r", (int)14516, (long)(0x16AAFC12360E87EDL ^ l10));
        nArray[3] = 0;
        nArray[4] = 0;
        nArray[5] = 0;
        nArray[lqz.a("r", (int)20282, (long)(0x54D4AF522C527164L ^ l10))] = (int)lqz.a("r", (int)25092, (long)(0x52D3A952E53A5D85L ^ l10));
        nArray[lqz.a("r", (int)27428, (long)(0x6FA760BC592B5436L ^ l10))] = 0;
        nArray[lqz.a("r", (int)28230, (long)(0x30F6075C19D5D020L ^ l10))] = 0;
        nArray[lqz.a("r", (int)21857, (long)(0x71569548BA5CEA34L ^ l10))] = 0;
        nArray[lqz.a("r", (int)23995, (long)(0x13E91928FC8B62DCL ^ l10))] = 0;
        nArray[lqz.a("r", (int)21395, (long)(0x6CAFC6E89FA16C57L ^ l10))] = 0;
        nArray[lqz.a("r", (int)8199, (long)(0x5F1679DBF9B21FFAL ^ l10))] = 0;
        nArray[lqz.a("r", (int)11026, (long)(0x18D5F1226A78141DL ^ l10))] = 0;
        nArray[lqz.a("r", (int)15317, (long)(0x6896318902CB0580L ^ l10))] = 0;
        nArray[lqz.a("r", (int)12647, (long)(0x36CDBC5C25A48E9CL ^ l10))] = 0;
        nArray[lqz.a("r", (int)15559, (long)(0x41B75E97A8390399L ^ l10))] = 0;
        nArray[lqz.a("r", (int)13970, (long)(0x328C3DF48DE788C4L ^ l10))] = 0;
        nArray[lqz.a("r", (int)18527, (long)(0x20BD26AFDF647610L ^ l10))] = 0;
        nArray[lqz.a("r", (int)777, (long)(0x170562F0A4FA3C12L ^ l10))] = 0;
        nArray[lqz.a("r", (int)12353, (long)(0x6951798ABE648FF4L ^ l10))] = 0;
        nArray[lqz.a("r", (int)30663, (long)(0x4043D5EF9AE7C843L ^ l10))] = 0;
        nArray[lqz.a("r", (int)25670, (long)(0x2FBD0501C93FDA12L ^ l10))] = 0;
        nArray[lqz.a("r", (int)3305, (long)(0x2DA64939D752B350L ^ l10))] = 0;
        nArray[lqz.a("r", (int)8798, (long)(0x7E709131DDAE9DA4L ^ l10))] = 0;
        nArray[lqz.a("r", (int)15930, (long)(0x63BB7D88B3BC0119L ^ l10))] = 0;
        nArray[lqz.a("r", (int)15462, (long)(0x23E6916C8E832EL ^ l10))] = 0;
        nArray[lqz.a("r", (int)16289, (long)(0x3955009C8976001EL ^ l10))] = 0;
        nArray[lqz.a("r", (int)17124, (long)(0x1743FD41A109FDDBL ^ l10))] = 0;
        nArray[lqz.a("r", (int)10393, (long)(0x60C482F0EACC9765L ^ l10))] = 0;
        nArray[lqz.a("r", (int)8823, (long)(0x112CDAB021B49D06L ^ l10))] = 0;
        nArray[lqz.a("r", (int)10519, (long)(0x184B6D04184E9632L ^ l10))] = 0;
        nArray[lqz.a("r", (int)16712, (long)(0x793084DBA0F2FEC3L ^ l10))] = (int)lqz.a("r", (int)31212, (long)(0x108DE26134E3C6C6L ^ l10));
        nArray[lqz.a("r", (int)31493, (long)(0x54638EF1D96E44B6L ^ l10))] = 0;
        nArray[lqz.a("r", (int)23813, (long)(0xE2A504914C3E296L ^ l10))] = 0;
        nArray[lqz.a("r", (int)21096, (long)(0x228F24265D336DB6L ^ l10))] = 0;
        nArray[lqz.a("r", (int)17374, (long)(0x48FD84430E637DBBL ^ l10))] = 0;
        nArray[lqz.a("r", (int)9384, (long)(0x1B80AB6CB6BC9AEDL ^ l10))] = 0;
        nArray[lqz.a("r", (int)26117, (long)(0x3B1BCDA7007D5928L ^ l10))] = 0;
        nArray[lqz.a("r", (int)3504, (long)(0x2C75B8A58DC2B294L ^ l10))] = 0;
        nArray[lqz.a("r", (int)20832, (long)(0x1B6F71F7C4DAEEDDL ^ l10))] = 0;
        nArray[lqz.a("r", (int)23581, (long)(0xC2B150F8F476327L ^ l10))] = 0;
        nArray[lqz.a("r", (int)13545, (long)(0x1DC132BDD4360B3FL ^ l10))] = 0;
        nArray[lqz.a("r", (int)16391, (long)(0x45AB22DE60EB7F7FL ^ l10))] = (int)lqz.a("r", (int)31333, (long)(0x328F75D96453C554L ^ l10));
        nArray[lqz.a("r", (int)9110, (long)(0x268D76B326679CB7L ^ l10))] = (int)lqz.a("r", (int)30331, (long)(0x6E2C99F2C3F0C908L ^ l10));
        nArray[lqz.a("r", (int)5034, (long)(0x770CD13F2661AC6DL ^ l10))] = (int)lqz.a("r", (int)4250, (long)(0x5714C30146ABAFC5L ^ l10));
        nArray[lqz.a("r", (int)24525, (long)(0x4C4F9296EF5DE081L ^ l10))] = 0;
        nArray[lqz.a("r", (int)29062, (long)(0x76E1F1FCC8B04E61L ^ l10))] = 0;
        nArray[lqz.a("r", (int)14562, (long)(0x279587F62FF07DEL ^ l10))] = (int)lqz.a("r", (int)26113, (long)(0x7DB5832EEE78D9EEL ^ l10));
        nArray[lqz.a("r", (int)2623, (long)(0x274E68A2BEF3B5E6L ^ l10))] = (int)lqz.a("r", (int)29251, (long)(0x584C0976EA3FCD05L ^ l10));
        nArray[lqz.a("r", (int)19691, (long)(0x1609334853F3732AL ^ l10))] = 0;
        nArray[lqz.a("r", (int)9645, (long)(0x3CAD1F989C9A1AF5L ^ l10))] = 0;
        nArray[lqz.a("r", (int)8584, (long)(0x5E6D4E869801E42L ^ l10))] = 0;
        nArray[lqz.a("r", (int)18721, (long)(0x10923BAE0382F66AL ^ l10))] = (int)lqz.a("r", (int)29678, (long)(0x74E719DF570ECCFBL ^ l10));
        nArray[lqz.a("r", (int)21312, (long)(0x31F5E58C44F96CE7L ^ l10))] = 0;
        nArray[lqz.a("r", (int)31940, (long)(0x27C75102B0BE43E6L ^ l10))] = 0;
        nArray[lqz.a("r", (int)24329, (long)(0x252C530CE3306147L ^ l10))] = 0;
        nArray[lqz.a("r", (int)23174, (long)(0x2DDF84936BC86563L ^ l10))] = 0;
        nArray[lqz.a("r", (int)22136, (long)(0xA2C9C369A8CE821L ^ l10))] = 0;
        nArray[lqz.a("r", (int)20259, (long)(0x2CEBA24C36CBF178L ^ l10))] = 0;
        nArray[lqz.a("r", (int)12801, (long)(0xF081C44E9348DCFL ^ l10))] = 0;
        nArray[lqz.a("r", (int)11074, (long)(0x6D52562D34A014B0L ^ l10))] = 0;
        nArray[lqz.a("r", (int)18174, (long)(0x7C6875463318F9B9L ^ l10))] = 0;
        nArray[lqz.a("r", (int)29099, (long)(0x2079ECA7F223CE2CL ^ l10))] = (int)lqz.a("r", (int)1623, (long)(0x17276A2EA068B991L ^ l10));
        nArray[lqz.a("r", (int)16227, (long)(0x5A101266DF6E8074L ^ l10))] = (int)lqz.a("r", (int)15559, (long)(0x41B75E97A8390399L ^ l10));
        nArray[lqz.a("r", (int)26108, (long)(0x57A3E2853ED4DA44L ^ l10))] = 0;
        nArray[lqz.a("r", (int)9874, (long)(0x23FF9B26D341991AL ^ l10))] = (int)lqz.a("r", (int)27929, (long)(0x48C964C7DCDF52D5L ^ l10));
        nArray[lqz.a("r", (int)10612, (long)(0x7201DB22D96C966EL ^ l10))] = 0;
        nArray[lqz.a("r", (int)24168, (long)(0x5583070D74606158L ^ l10))] = (int)lqz.a("r", (int)12955, (long)(0x38D19ED004660DCDL ^ l10));
        nArray[lqz.a("r", (int)29624, (long)(0x487EF85E3474CCE5L ^ l10))] = 0;
        nArray[lqz.a("r", (int)2683, (long)(0x2E21DAC4B6A135E1L ^ l10))] = (int)lqz.a("r", (int)26224, (long)(0x4AD76763DA3C5970L ^ l10));
        m44.a("h", (int[])nArray, (long)-6298007595503599552L, (long)l10);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void Z(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x7DA4A35269B8L;
        long l13 = l11 ^ 0x727053DD8DDCL;
        long l14 = l11 ^ 0x48BF50DCEF70L;
        long l15 = l11 ^ 0x4910D83FDF15L;
        q0 q02 = new q0((int)lqz.a("r", (int)11807, (long)(0xC3FBAC22422AB3L ^ l10)), l13);
        boolean bl2 = true;
        CallSite callSite = m44.a("m", (long)-7782696082387743236L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = q02;
        objectArray2[0] = l14;
        m44.a("r", (Object)m44.a("s", (Object)this, (long)-8242489293115035662L, (long)l10), (Object)objectArray2, (long)-8512239820692617456L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l12;
            objectArray3[0] = (int)lqz.a("r", (int)2623, (long)(0x274E3BA9FC748E08L ^ l10));
            m44.a("l", (Object)this, (Object)objectArray3, (long)-8335951372855125685L, (long)l10);
            if (callSite != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 <= 0L || !bl2) throw throwable;
                Object[] objectArray4 = new Object[3];
                objectArray4[2] = true;
                objectArray4[1] = q02;
                objectArray4[0] = l15;
                m44.a("r", (Object)m44.a("s", (Object)this, (long)-8242489293115035662L, (long)l10), (Object)objectArray4, (long)-7979840137433822011L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("m", (Object)runtimeException, (long)-8023011618453397788L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray5 = new Object[3];
            objectArray5[2] = true;
            objectArray5[1] = q02;
            objectArray5[0] = l15;
            m44.a("r", (Object)m44.a("s", (Object)this, (long)-8242489293115035662L, (long)l10), (Object)objectArray5, (long)-7979840137433822011L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("m", (Object)runtimeException, (long)-8023011618453397788L, (long)l10);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void o(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x7CAED242ED2DL;
        long l13 = l12 >>> 32;
        int n10 = (int)(l12 << 32 >>> 32);
        long l14 = l11 ^ 0x3EC915FDF5D8L;
        long l15 = l11 ^ 0x71BBD8871F87L;
        long l16 = l11 ^ 0x44A02B09994FL;
        long l17 = l11 ^ 0x450FA3EAA92AL;
        qk qk2 = new qk(l13, (int)lqz.a("r", (int)28230, (long)(0x30F6584820879DF1L ^ l10)), n10);
        boolean bl2 = true;
        CallSite callSite = m44.a("j", (long)-1891156448950273085L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = qk2;
        objectArray2[0] = l16;
        m44.a("u", (Object)m44.a("t", (Object)this, (long)-314187956279600691L, (long)l10), (Object)objectArray2, (long)-8586202676727505L, (long)l10);
        CallSite callSite2 = callSite;
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l15;
            objectArray3[0] = (int)lqz.a("r", (int)30587, (long)(0xAAD0A0BC3C985C5L ^ l10));
            CallSite callSite3 = m44.a("k", (Object)this, (Object)objectArray3, (long)-400877012624920716L, (long)l10);
            m44.a("v", (Object)this, (int)lqz.a("r", (int)8030, (long)(0x1088F9213CC4ECD5L ^ l10)), (long)-573118273633747758L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = qk2;
            objectArray4[0] = l17;
            m44.a("u", (Object)m44.a("t", (Object)this, (long)-314187956279600691L, (long)l10), (Object)objectArray4, (long)-1765721442893219078L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("t", (Object)callSite3, (long)-1770188195219517245L, (long)l10);
            objectArray5[0] = l14;
            m44.a("u", (Object)qk2, (Object)objectArray5, (long)-2255139764267926098L, (long)l10);
            if (callSite2 != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 <= 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = qk2;
                objectArray6[0] = l17;
                m44.a("u", (Object)m44.a("t", (Object)this, (long)-314187956279600691L, (long)l10), (Object)objectArray6, (long)-1765721442893219078L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("j", (Object)runtimeException, (long)-1830848008785909541L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = qk2;
            objectArray7[0] = l17;
            m44.a("u", (Object)m44.a("t", (Object)this, (long)-314187956279600691L, (long)l10), (Object)objectArray7, (long)-1765721442893219078L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("j", (Object)runtimeException, (long)-1830848008785909541L, (long)l10);
        }
    }

    private boolean T(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x25EC0E93A43FL;
                CallSite callSite = m44.a("o", (long)4826803358662958334L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)lqz.a("r", (int)11783, (long)(0x4DFC42F606707AA1L ^ l10));
                        object = m44.a("n", (Object)this, (Object)objectArray2, (long)4784013673214584476L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("o", (Object)runtimeException, (long)4731741975910289382L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("o", (Object)runtimeException, (long)4731741975910289382L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean F(Object[] objectArray) {
        Object object;
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x5CF0C07AF378L;
        long l13 = l12 >>> 16;
        int n11 = (int)(l12 << 48 >>> 48);
        long l14 = l11 ^ 0x1C4E5A9AAC4AL;
        CallSite callSite = m44.a("k", (long)-2483635624887843958L, (long)l10);
        m44.a("w", (Object)this, (int)n10, (long)-2364906641551373118L, (long)l10);
        CallSite callSite2 = callSite;
        CallSite callSite3 = m44.a("u", (Object)this, (long)-4531434495984123748L, (long)l10);
        m44.a("w", (Object)this, (lbd)((Object)callSite3), (long)-2879181879691147320L, (long)l10);
        m44.a("w", (Object)this, (lbd)((Object)callSite3), (long)-4208406285469291105L, (long)l10);
        try {
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = (int)((short)n11);
            objectArray2[0] = l13;
            Object object2 = m44.a("j", (Object)this, (Object)objectArray2, (long)-2518926326613485083L, (long)l10);
            if (callSite2 == null) {
                object2 = object2 == false ? (Object)true : (Object)false;
            }
            object = object2;
        }
        catch (ad ad2) {
            boolean bl2;
            try {
                bl2 = true;
            }
            catch (Throwable throwable) {
                Object[] objectArray3 = new Object[3];
                objectArray3[2] = n10;
                objectArray3[1] = l14;
                objectArray3[0] = 0;
                m44.a("j", (Object)this, (Object)objectArray3, (long)-2332757142995314462L, (long)l10);
                throw throwable;
            }
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = n10;
            objectArray4[1] = l14;
            objectArray4[0] = 0;
            m44.a("j", (Object)this, (Object)objectArray4, (long)-2332757142995314462L, (long)l10);
            return bl2;
        }
        Object[] objectArray5 = new Object[3];
        objectArray5[2] = n10;
        objectArray5[1] = l14;
        objectArray5[0] = 0;
        m44.a("j", (Object)this, (Object)objectArray5, (long)-2332757142995314462L, (long)l10);
        return (boolean)object;
    }

    /*
     * Exception decompiling
     */
    public final void K8(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 3[TRYBLOCK]
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

    private boolean t(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x72C8555F8D26L;
                CallSite callSite = m44.a("n", (long)7774645829100942823L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)lqz.a("r", (int)777, (long)(0x170569EEB201FFE7L ^ l10));
                        object = m44.a("o", (Object)this, (Object)objectArray2, (long)7745465898623635333L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("n", (Object)runtimeException, (long)7544604034665817855L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("n", (Object)runtimeException, (long)7544604034665817855L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     */
    public final void r(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = lqz.a ^ var2_2;
        var4_3 = v0 ^ 95532940128985L;
        var6_4 = v0 ^ 14515771714845L;
        var8_5 = v0 ^ 75927073699049L;
        var10_6 = v0 ^ 11531638759094L;
        var12_7 = v0 ^ 46105064889372L;
        var14_8 = v0 ^ 124589514179523L;
        var16_9 = v0 ^ 69712028751998L;
        var18_10 = v0 ^ 69031135995931L;
        var21_11 = new p0(2, var12_7);
        var22_12 = true;
        var20_13 = m44.a("k", (long)-6561681995416634638L, (long)var2_2);
        v1 = new Object[2];
        v1[1] = var21_11;
        v1[0] = var16_9;
        m44.a("t", (Object)m44.a("u", (Object)this, (long)-5002729043166766852L, (long)var2_2), (Object)v1, (long)-4697248759895576546L, (long)var2_2);
        try {
            v2 = new Object[2];
            v2[1] = var10_6;
            v2[0] = (int)lqz.a("r", (int)24525, (long)(5498814081365437537L ^ var2_2));
            var23_14 = m44.a("j", (Object)this, (Object)v2, (long)-4945313321979777467L, (long)var2_2);
            m44.a("w", (Object)this, (int)lqz.a("r", (int)24525, (long)(5498814081365437537L ^ var2_2)), (long)-5099583100795863581L, (long)var2_2);
            v3 = new Object[1];
            v3[0] = var6_4;
            m44.a("t", (Object)this, (Object)v3, (long)-4675001656982865001L, (long)var2_2);
            v4 = new Object[3];
            v4[2] = true;
            v4[1] = var21_11;
            v4[0] = var18_10;
            m44.a("t", (Object)m44.a("u", (Object)this, (long)-5002729043166766852L, (long)var2_2), (Object)v4, (long)-6462772715916657717L, (long)var2_2);
            var22_12 = false;
            v5 = new Object[2];
            v5[1] = (int)m44.a("u", (Object)var23_14, (long)-6458587444598697486L, (long)var2_2);
            v5[0] = var8_5;
            m44.a("t", (Object)var21_11, (Object)v5, (long)-6807936777759753057L, (long)var2_2);
            ** if (var20_13 != null) goto lbl-1000
        }
        catch (Throwable var24_15) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block26: {
                                    block27: {
                                        if (var2_2 < 0L) break block26;
                                        v8 = var22_12;
                                        if (var20_13 != null) break block27;
                                        try {
                                            block32: {
                                                if (!v8) ** GOTO lbl84
                                                break block32;
                                                catch (Throwable v9) {
                                                    throw m44.a("k", (Object)v9, (long)-6366121023096886806L, (long)var2_2);
                                                }
                                            }
                                            v10 = new Object[2];
                                            v10[1] = var14_8;
                                            v10[0] = var21_11;
                                            m44.a("t", (Object)m44.a("u", (Object)this, (long)-5002729043166766852L, (long)var2_2), (Object)v10, (long)-4666686838473162428L, (long)var2_2);
                                            v8 = false;
                                        }
                                        catch (Throwable v11) {
                                            throw m44.a("k", (Object)v11, (long)-6366121023096886806L, (long)var2_2);
                                        }
                                    }
                                    var22_12 = v8;
                                }
                                try {
                                    if (var2_2 <= 0L || var20_13 == null) break block28;
lbl84:
                                    // 2 sources

                                    v12 = new Object[1];
                                    v12[0] = var4_3;
                                    m44.a("t", (Object)m44.a("u", (Object)this, (long)-5002729043166766852L, (long)var2_2), (Object)v12, (long)-4648109860238886278L, (long)var2_2);
                                }
                                catch (Throwable v13) {
                                    throw m44.a("k", (Object)v13, (long)-6366121023096886806L, (long)var2_2);
                                }
                            }
                            v14 = var24_15 instanceof RuntimeException;
                            if (var2_2 <= 0L || var20_13 != null) break block29;
                            try {
                                block33: {
                                    if (!v14) break block30;
                                    break block33;
                                    catch (Throwable v15) {
                                        throw m44.a("k", (Object)v15, (long)-6366121023096886806L, (long)var2_2);
                                    }
                                }
                                throw (RuntimeException)var24_15;
                            }
                            catch (Throwable v16) {
                                throw m44.a("k", (Object)v16, (long)-6366121023096886806L, (long)var2_2);
                            }
                        }
                        try {
                            v17 = var24_15;
                            if (var20_13 != null) break block31;
                            v14 = v17 instanceof t;
                        }
                        catch (Throwable v18) {
                            throw m44.a("k", (Object)v18, (long)-6366121023096886806L, (long)var2_2);
                        }
                    }
                    try {
                        if (v14) {
                            throw (t)var24_15;
                        }
                    }
                    catch (Throwable v19) {
                        throw m44.a("k", (Object)v19, (long)-6366121023096886806L, (long)var2_2);
                    }
                    v17 = var24_15;
                }
                throw (Error)v17;
            }
            catch (Throwable var25_16) {
                try {
                    if (var2_2 > 0L && var22_12) {
                        v20 = new Object[3];
                        v20[2] = true;
                        v20[1] = var21_11;
                        v20[0] = var18_10;
                        m44.a("t", (Object)m44.a("u", (Object)this, (long)-5002729043166766852L, (long)var2_2), (Object)v20, (long)-6462772715916657717L, (long)var2_2);
                    }
                }
                catch (Throwable v21) {
                    throw m44.a("k", (Object)v21, (long)-6366121023096886806L, (long)var2_2);
                }
                throw var25_16;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var22_12) ** GOTO lbl136
                v6 = new Object[3];
                v6[2] = true;
                v6[1] = var21_11;
                v6[0] = var18_10;
                m44.a("t", (Object)m44.a("u", (Object)this, (long)-5002729043166766852L, (long)var2_2), (Object)v6, (long)-6462772715916657717L, (long)var2_2);
            }
            catch (Throwable v7) {
                throw m44.a("k", (Object)v7, (long)-6366121023096886806L, (long)var2_2);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl136:
        // 3 sources

    }

    private boolean z(Object[] objectArray) {
        Object object;
        block12: {
            block13: {
                long l10 = (Long)objectArray[0];
                long l11 = l10 = a ^ l10;
                long l12 = l11 ^ 0xA1D68559A49L;
                long l13 = l11 ^ 0x54F3368BA9E5L;
                long l14 = l11 ^ 0x1D132CDB3670L;
                CallSite callSite = m44.a("p", (Object)this, (long)-8453774332832983699L, (long)l10);
                CallSite callSite2 = m44.a("n", (long)-8129730891403079377L, (long)l10);
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        Object[] objectArray2 = new Object[1];
                                        objectArray2[0] = l14;
                                        object = m44.a("o", (Object)this, (Object)objectArray2, (long)-7869172377461294989L, (long)l10);
                                        if (callSite2 != null) break block12;
                                        if (object == false) break block13;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw m44.a("n", (Object)runtimeException, (long)-8323880786611486153L, (long)l10);
                                    }
                                    m44.a("r", (Object)this, (lbd)((Object)callSite), (long)-8453774332832983699L, (long)l10);
                                    Object[] objectArray3 = new Object[1];
                                    objectArray3[0] = l12;
                                    object = m44.a("o", (Object)this, (Object)objectArray3, (long)-8258286576115766131L, (long)l10);
                                    if (callSite2 != null) break block12;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw m44.a("n", (Object)runtimeException, (long)-8323880786611486153L, (long)l10);
                                }
                                if (object == false) break block13;
                            }
                            catch (RuntimeException runtimeException) {
                                throw m44.a("n", (Object)runtimeException, (long)-8323880786611486153L, (long)l10);
                            }
                            m44.a("r", (Object)this, (lbd)((Object)callSite), (long)-8453774332832983699L, (long)l10);
                            Object[] objectArray4 = new Object[1];
                            objectArray4[0] = l13;
                            object = m44.a("o", (Object)this, (Object)objectArray4, (long)-8243715511351544933L, (long)l10);
                            if (callSite2 != null) break block12;
                        }
                        catch (RuntimeException runtimeException) {
                            throw m44.a("n", (Object)runtimeException, (long)-8323880786611486153L, (long)l10);
                        }
                        if (object == false) break block13;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("n", (Object)runtimeException, (long)-8323880786611486153L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("n", (Object)runtimeException, (long)-8323880786611486153L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Exception decompiling
     */
    public final void Ky(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[CASE]], but top level block is 2[TRYBLOCK]
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
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void KK(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x2FAE72608376L;
        long l13 = l11 ^ 0x72D9002890C2L;
        long l14 = l11 ^ 0x3DABCD527A9DL;
        long l15 = l11 ^ 0x8B03EDCFC55L;
        long l16 = l11 ^ 0x91FB63FCC30L;
        q8 q82 = new q8(l12, (int)lqz.a("r", (int)10612, (long)(0x7201C826F5EBBEA5L ^ l10)));
        CallSite callSite = m44.a("h", (long)-9161712341065900327L, (long)l10);
        boolean bl2 = true;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = q82;
        objectArray2[0] = l15;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)-7009417791406408489L, (long)l10), (Object)objectArray2, (long)-7279168345089338315L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l14;
            objectArray3[0] = (int)lqz.a("r", (int)2835, (long)(0xF2F3F4B1F921C41L ^ l10));
            CallSite callSite2 = m44.a("i", (Object)this, (Object)objectArray3, (long)-6956512852185560466L, (long)l10);
            m44.a("t", (Object)this, (int)lqz.a("r", (int)1668, (long)(0x696CAF1B326A118AL ^ l10)), (long)-7128754113192191544L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = q82;
            objectArray4[0] = l16;
            m44.a("w", (Object)m44.a("v", (Object)this, (long)-7009417791406408489L, (long)l10), (Object)objectArray4, (long)-9050922829706797088L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("v", (Object)callSite2, (long)-9046241645434194471L, (long)l10);
            objectArray5[0] = l13;
            m44.a("w", (Object)q82, (Object)objectArray5, (long)-8813986177244276556L, (long)l10);
            if (callSite != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 < 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = q82;
                objectArray6[0] = l16;
                m44.a("w", (Object)m44.a("v", (Object)this, (long)-7009417791406408489L, (long)l10), (Object)objectArray6, (long)-9050922829706797088L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("h", (Object)runtimeException, (long)-8967289732585173567L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = q82;
            objectArray7[0] = l16;
            m44.a("w", (Object)m44.a("v", (Object)this, (long)-7009417791406408489L, (long)l10), (Object)objectArray7, (long)-9050922829706797088L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("h", (Object)runtimeException, (long)-8967289732585173567L, (long)l10);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void KW(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x4D9414E37D3CL;
        int n10 = (int)(l12 >>> 48);
        int n11 = (int)(l12 << 16 >>> 32);
        int n12 = (int)(l12 << 48 >>> 48);
        long l13 = l11 ^ 0x4285D10B390BL;
        long l14 = l11 ^ 0xDF71C71D354L;
        long l15 = l11 ^ 0x38ECEFFF559CL;
        long l16 = l11 ^ 0x3943671C65F9L;
        pe pe2 = new pe((char)n10, (int)lqz.a("r", (int)25670, (long)(0x2FBD2659349B5B10L ^ l10)), n11, (short)n12);
        CallSite callSite = m44.a("i", (long)2959497683210336016L, (long)l10);
        boolean bl2 = true;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = pe2;
        objectArray2[0] = l15;
        m44.a("v", (Object)m44.a("w", (Object)this, (long)3994899556956984606L, (long)l10), (Object)objectArray2, (long)3689013965944077820L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l14;
            objectArray3[0] = (int)lqz.a("r", (int)26108, (long)(0x57A3C1DDC3705B46L ^ l10));
            CallSite callSite2 = m44.a("h", (Object)this, (Object)objectArray3, (long)3944221127616357287L, (long)l10);
            m44.a("u", (Object)this, (int)lqz.a("r", (int)26108, (long)(0x57A3C1DDC3705B46L ^ l10)), (long)3807973511468724225L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = pe2;
            objectArray4[0] = l16;
            m44.a("v", (Object)m44.a("w", (Object)this, (long)3994899556956984606L, (long)l10), (Object)objectArray4, (long)3147341035986351657L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("w", (Object)callSite2, (long)3151529611132607504L, (long)l10);
            objectArray5[0] = l13;
            m44.a("v", (Object)pe2, (Object)objectArray5, (long)3199629525546004861L, (long)l10);
            if (callSite != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 < 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = pe2;
                objectArray6[0] = l16;
                m44.a("v", (Object)m44.a("w", (Object)this, (long)3994899556956984606L, (long)l10), (Object)objectArray6, (long)3147341035986351657L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("i", (Object)runtimeException, (long)3045833178513368072L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = pe2;
            objectArray7[0] = l16;
            m44.a("v", (Object)m44.a("w", (Object)this, (long)3994899556956984606L, (long)l10), (Object)objectArray7, (long)3147341035986351657L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("i", (Object)runtimeException, (long)3045833178513368072L, (long)l10);
        }
    }

    private boolean v(Object[] objectArray) {
        Object object;
        block10: {
            block11: {
                CallSite callSite;
                long l10;
                block8: {
                    long l11;
                    block9: {
                        l10 = (Long)objectArray[0];
                        long l12 = l10 = a ^ l10;
                        long l13 = l12 ^ 0x3289697FEE76L;
                        l11 = l12 ^ 0x58566888121BL;
                        callSite = m44.a("k", (long)-803824713001391398L, (long)l10);
                        try {
                            try {
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l13;
                                object = m44.a("j", (Object)this, (Object)objectArray2, (long)-1414641909097241598L, (long)l10);
                                if (callSite != null) break block8;
                                if (object == false) break block9;
                            }
                            catch (RuntimeException runtimeException) {
                                throw m44.a("k", (Object)runtimeException, (long)-608271841023510078L, (long)l10);
                            }
                            return true;
                        }
                        catch (RuntimeException runtimeException) {
                            throw m44.a("k", (Object)runtimeException, (long)-608271841023510078L, (long)l10);
                        }
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l11;
                    objectArray3[0] = (int)lqz.a("r", (int)12353, (long)(0x6951580A9548D33CL ^ l10));
                    object = m44.a("j", (Object)this, (Object)objectArray3, (long)-846599022469017416L, (long)l10);
                }
                try {
                    try {
                        if (callSite != null) break block10;
                        if (object == false) break block11;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("k", (Object)runtimeException, (long)-608271841023510078L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("k", (Object)runtimeException, (long)-608271841023510078L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Exception decompiling
     */
    public final void Kl(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[CASE]], but top level block is 1[TRYBLOCK]
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
    private boolean p(Object[] var1_1) {
        block12: {
            block13: {
                block11: {
                    var2_2 = (Long)var1_1[0];
                    v0 = var2_2 = lqz.a ^ var2_2;
                    var4_3 = v0 ^ 126551410928469L;
                    var6_4 = v0 ^ 16174738640198L;
                    var8_5 = v0 ^ 89864138595946L;
                    var10_6 = m44.a("j", (long)-528834014990555477L, (long)var2_2);
                    try {
                        try {
                            v1 = this;
                            if (var10_6 == null) {
                                v2 = new Object[1];
                                v2[0] = var6_4;
                                if (m44.a("k", (Object)v1, (Object)v2, (long)-2031922216362978874L, (long)var2_2) == false) break block11;
                            }
                            ** GOTO lbl27
                        }
                        catch (RuntimeException v3) {
                            throw m44.a("j", (Object)v3, (long)-288245670724454989L, (long)var2_2);
                        }
                        return true;
                    }
                    catch (RuntimeException v4) {
                        throw m44.a("j", (Object)v4, (long)-288245670724454989L, (long)var2_2);
                    }
                }
                block8: while (true) {
                    v1 = this;
lbl27:
                    // 2 sources

                    var11_7 = m44.a("t", (Object)v1, (long)-204217135104089367L, (long)var2_2);
                    do {
                        v5 = new Object[1];
                        v5[0] = var4_3;
                        if (m44.a("k", (Object)this, (Object)v5, (long)-381863995933202764L, (long)var2_2) == false) continue block8;
                        m44.a("v", (Object)this, (lbd)var11_7, (long)-204217135104089367L, (long)var2_2);
                    } while (var2_2 < 0L || var10_6 != null);
                    break;
                }
                try {
                    try {
                        v6 = new Object[2];
                        v6[1] = var8_5;
                        v6[0] = (int)lqz.a("r", (int)21395, (long)(7831740536247172334L ^ var2_2));
                        v7 /* !! */  = m44.a("k", (Object)this, (Object)v6, (long)-562581333993481015L, (long)var2_2);
                        if (var10_6 != null) break block12;
                        if (v7 /* !! */  == false) break block13;
                    }
                    catch (RuntimeException v8) {
                        throw m44.a("j", (Object)v8, (long)-288245670724454989L, (long)var2_2);
                    }
                    return true;
                }
                catch (RuntimeException v9) {
                    throw m44.a("j", (Object)v9, (long)-288245670724454989L, (long)var2_2);
                }
            }
            v7 /* !! */  = (CallSite)false;
        }
        return (boolean)v7 /* !! */ ;
    }

    private boolean Q(Object[] objectArray) {
        Object object;
        block10: {
            block11: {
                CallSite callSite;
                long l10;
                block8: {
                    long l11;
                    block9: {
                        l10 = (Long)objectArray[0];
                        long l12 = l10 = a ^ l10;
                        long l13 = l12 ^ 0x2F2C60D9272FL;
                        l11 = l12 ^ 0x7022B95B3403L;
                        callSite = m44.a("o", (long)-4473118052681113618L, (long)l10);
                        try {
                            try {
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l13;
                                objectArray2[0] = (int)lqz.a("r", (int)8199, (long)(0x5F162F21DACF7606L ^ l10));
                                object = m44.a("n", (Object)this, (Object)objectArray2, (long)-4506922529098848884L, (long)l10);
                                if (callSite != null) break block8;
                                if (object == false) break block9;
                            }
                            catch (RuntimeException runtimeException) {
                                throw m44.a("o", (Object)runtimeException, (long)-4415061995972555530L, (long)l10);
                            }
                            return true;
                        }
                        catch (RuntimeException runtimeException) {
                            throw m44.a("o", (Object)runtimeException, (long)-4415061995972555530L, (long)l10);
                        }
                    }
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l11;
                    object = m44.a("n", (Object)this, (Object)objectArray3, (long)-2699812225637160829L, (long)l10);
                }
                try {
                    try {
                        if (callSite != null) break block10;
                        if (object == false) break block11;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("o", (Object)runtimeException, (long)-4415061995972555530L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("o", (Object)runtimeException, (long)-4415061995972555530L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     */
    public final void p(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = lqz.a ^ var2_2;
        var4_3 = v0 ^ 77319933472154L;
        var6_4 = v0 ^ 83187945978069L;
        var8_5 = v0 ^ 94277411498922L;
        var10_6 = v0 ^ 29465201967605L;
        var12_7 = v0 ^ 107008627255988L;
        var14_8 = v0 ^ 107618129583232L;
        var16_9 = v0 ^ 52602971293501L;
        var18_10 = v0 ^ 51093426419544L;
        var21_11 = new q5((int)lqz.a("r", (int)9874, (long)(2593984622693010105L ^ var2_2)), var12_7);
        var20_12 = m44.a("h", (long)8913512398737089969L, (long)var2_2);
        var22_13 = true;
        v1 = new Object[2];
        v1[1] = var21_11;
        v1[0] = var16_9;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)7336835210062661567L, (long)var2_2), (Object)v1, (long)7030987165854691165L, (long)var2_2);
        try {
            v2 = new Object[2];
            v2[1] = var10_6;
            v2[0] = (int)lqz.a("r", (int)24329, (long)(2678629606495400676L ^ var2_2));
            var23_14 = m44.a("i", (Object)this, (Object)v2, (long)7214105850812412166L, (long)var2_2);
            m44.a("t", (Object)this, (int)lqz.a("r", (int)24329, (long)(2678629606495400676L ^ var2_2)), (long)7384131529316033184L, (long)var2_2);
            v3 = new Object[1];
            v3[0] = var6_4;
            m44.a("w", (Object)this, (Object)v3, (long)7262827022114989198L, (long)var2_2);
            v4 = new Object[3];
            v4[2] = true;
            v4[1] = var21_11;
            v4[0] = var18_10;
            m44.a("w", (Object)m44.a("v", (Object)this, (long)7336835210062661567L, (long)var2_2), (Object)v4, (long)8722503552090350728L, (long)var2_2);
            var22_13 = false;
            v5 = new Object[2];
            v5[1] = (int)m44.a("v", (Object)var23_14, (long)8727250677735837361L, (long)var2_2);
            v5[0] = var8_5;
            m44.a("w", (Object)var21_11, (Object)v5, (long)9135069307121771484L, (long)var2_2);
            ** if (var20_12 != null) goto lbl-1000
        }
        catch (Throwable var24_15) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block26: {
                                    block27: {
                                        if (var2_2 < 0L) break block26;
                                        v8 = var22_13;
                                        if (var20_12 != null) break block27;
                                        try {
                                            block32: {
                                                if (!v8) ** GOTO lbl84
                                                break block32;
                                                catch (Throwable v9) {
                                                    throw m44.a("h", (Object)v9, (long)8711630841349355177L, (long)var2_2);
                                                }
                                            }
                                            v10 = new Object[2];
                                            v10[1] = var14_8;
                                            v10[0] = var21_11;
                                            m44.a("w", (Object)m44.a("v", (Object)this, (long)7336835210062661567L, (long)var2_2), (Object)v10, (long)6953427786590576135L, (long)var2_2);
                                            v8 = false;
                                        }
                                        catch (Throwable v11) {
                                            throw m44.a("h", (Object)v11, (long)8711630841349355177L, (long)var2_2);
                                        }
                                    }
                                    var22_13 = v8;
                                }
                                try {
                                    if (var2_2 <= 0L || var20_12 == null) break block28;
lbl84:
                                    // 2 sources

                                    v12 = new Object[1];
                                    v12[0] = var4_3;
                                    m44.a("w", (Object)m44.a("v", (Object)this, (long)7336835210062661567L, (long)var2_2), (Object)v12, (long)6934848560481871161L, (long)var2_2);
                                }
                                catch (Throwable v13) {
                                    throw m44.a("h", (Object)v13, (long)8711630841349355177L, (long)var2_2);
                                }
                            }
                            v14 = var24_15 instanceof RuntimeException;
                            if (var2_2 < 0L || var20_12 != null) break block29;
                            try {
                                block33: {
                                    if (!v14) break block30;
                                    break block33;
                                    catch (Throwable v15) {
                                        throw m44.a("h", (Object)v15, (long)8711630841349355177L, (long)var2_2);
                                    }
                                }
                                throw (RuntimeException)var24_15;
                            }
                            catch (Throwable v16) {
                                throw m44.a("h", (Object)v16, (long)8711630841349355177L, (long)var2_2);
                            }
                        }
                        try {
                            v17 = var24_15;
                            if (var20_12 != null) break block31;
                            v14 = v17 instanceof t;
                        }
                        catch (Throwable v18) {
                            throw m44.a("h", (Object)v18, (long)8711630841349355177L, (long)var2_2);
                        }
                    }
                    try {
                        if (v14) {
                            throw (t)var24_15;
                        }
                    }
                    catch (Throwable v19) {
                        throw m44.a("h", (Object)v19, (long)8711630841349355177L, (long)var2_2);
                    }
                    v17 = var24_15;
                }
                throw (Error)v17;
            }
            catch (Throwable var25_16) {
                try {
                    if (var2_2 >= 0L && var22_13) {
                        v20 = new Object[3];
                        v20[2] = true;
                        v20[1] = var21_11;
                        v20[0] = var18_10;
                        m44.a("w", (Object)m44.a("v", (Object)this, (long)7336835210062661567L, (long)var2_2), (Object)v20, (long)8722503552090350728L, (long)var2_2);
                    }
                }
                catch (Throwable v21) {
                    throw m44.a("h", (Object)v21, (long)8711630841349355177L, (long)var2_2);
                }
                throw var25_16;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var22_13) ** GOTO lbl136
                v6 = new Object[3];
                v6[2] = true;
                v6[1] = var21_11;
                v6[0] = var18_10;
                m44.a("w", (Object)m44.a("v", (Object)this, (long)7336835210062661567L, (long)var2_2), (Object)v6, (long)8722503552090350728L, (long)var2_2);
            }
            catch (Throwable v7) {
                throw m44.a("h", (Object)v7, (long)8711630841349355177L, (long)var2_2);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl136:
        // 3 sources

    }

    /*
     * Exception decompiling
     */
    public final void n(Object[] var1_1) {
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
     */
    public final void KF(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = lqz.a ^ var2_2;
        var4_3 = v0 ^ 12024793672214L;
        var6_4 = v0 ^ 82862397688617L;
        var8_5 = v0 ^ 97514002042137L;
        var10_6 = v0 ^ 26126051780422L;
        var12_7 = v0 ^ 94374256878996L;
        var14_8 = v0 ^ 119770943732275L;
        var16_9 = v0 ^ 38315428913550L;
        var18_10 = v0 ^ 38992018182635L;
        var21_11 = new pw((int)lqz.a("r", (int)16712, (long)(8732688269859261395L ^ var2_2)), var4_3);
        var22_12 = true;
        v1 = m44.a("k", (long)-2521974819098000638L, (long)var2_2);
        v2 = new Object[2];
        v2[1] = var21_11;
        v2[0] = var16_9;
        m44.a("t", (Object)m44.a("u", (Object)this, (long)-4367750779177426676L, (long)var2_2), (Object)v2, (long)-4098248594862781970L, (long)var2_2);
        var20_13 = v1;
        try {
            v3 = new Object[2];
            v3[1] = var10_6;
            v3[0] = (int)lqz.a("r", (int)29497, (long)(6693359644818782525L ^ var2_2));
            var23_14 = m44.a("j", (Object)this, (Object)v3, (long)-4418407257942714443L, (long)var2_2);
            m44.a("w", (Object)this, (int)lqz.a("r", (int)16186, (long)(877150296162760163L ^ var2_2)), (long)-4554624051996769261L, (long)var2_2);
            v4 = new Object[1];
            v4[0] = var12_7;
            m44.a("t", (Object)this, (Object)v4, (long)-4240752623318661744L, (long)var2_2);
            v5 = new Object[3];
            v5[2] = true;
            v5[1] = var21_11;
            v5[0] = var18_10;
            m44.a("t", (Object)m44.a("u", (Object)this, (long)-4367750779177426676L, (long)var2_2), (Object)v5, (long)-2323993975427366341L, (long)var2_2);
            var22_12 = false;
            v6 = new Object[2];
            v6[1] = (int)m44.a("u", (Object)var23_14, (long)-2328816968782059518L, (long)var2_2);
            v6[0] = var8_5;
            m44.a("t", (Object)var21_11, (Object)v6, (long)-2849296233246390929L, (long)var2_2);
            ** if (var20_13 != null) goto lbl-1000
        }
        catch (Throwable var24_15) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block26: {
                                    block27: {
                                        if (var2_2 <= 0L) break block26;
                                        v9 = var22_12;
                                        if (var20_13 != null) break block27;
                                        try {
                                            block32: {
                                                if (!v9) ** GOTO lbl85
                                                break block32;
                                                catch (Throwable v10) {
                                                    throw m44.a("k", (Object)v10, (long)-2425501663447248870L, (long)var2_2);
                                                }
                                            }
                                            v11 = new Object[2];
                                            v11[1] = var14_8;
                                            v11[0] = var21_11;
                                            m44.a("t", (Object)m44.a("u", (Object)this, (long)-4367750779177426676L, (long)var2_2), (Object)v11, (long)-4121773643008870220L, (long)var2_2);
                                            v9 = false;
                                        }
                                        catch (Throwable v12) {
                                            throw m44.a("k", (Object)v12, (long)-2425501663447248870L, (long)var2_2);
                                        }
                                    }
                                    var22_12 = v9;
                                }
                                try {
                                    if (var2_2 < 0L || var20_13 == null) break block28;
lbl85:
                                    // 2 sources

                                    v13 = new Object[1];
                                    v13[0] = var6_4;
                                    m44.a("t", (Object)m44.a("u", (Object)this, (long)-4367750779177426676L, (long)var2_2), (Object)v13, (long)-4139224723365428342L, (long)var2_2);
                                }
                                catch (Throwable v14) {
                                    throw m44.a("k", (Object)v14, (long)-2425501663447248870L, (long)var2_2);
                                }
                            }
                            v15 = var24_15 instanceof RuntimeException;
                            if (var2_2 < 0L || var20_13 != null) break block29;
                            try {
                                block33: {
                                    if (!v15) break block30;
                                    break block33;
                                    catch (Throwable v16) {
                                        throw m44.a("k", (Object)v16, (long)-2425501663447248870L, (long)var2_2);
                                    }
                                }
                                throw (RuntimeException)var24_15;
                            }
                            catch (Throwable v17) {
                                throw m44.a("k", (Object)v17, (long)-2425501663447248870L, (long)var2_2);
                            }
                        }
                        try {
                            v18 = var24_15;
                            if (var20_13 != null) break block31;
                            v15 = v18 instanceof t;
                        }
                        catch (Throwable v19) {
                            throw m44.a("k", (Object)v19, (long)-2425501663447248870L, (long)var2_2);
                        }
                    }
                    try {
                        if (v15) {
                            throw (t)var24_15;
                        }
                    }
                    catch (Throwable v20) {
                        throw m44.a("k", (Object)v20, (long)-2425501663447248870L, (long)var2_2);
                    }
                    v18 = var24_15;
                }
                throw (Error)v18;
            }
            catch (Throwable var25_16) {
                try {
                    if (var2_2 > 0L && var22_12) {
                        v21 = new Object[3];
                        v21[2] = true;
                        v21[1] = var21_11;
                        v21[0] = var18_10;
                        m44.a("t", (Object)m44.a("u", (Object)this, (long)-4367750779177426676L, (long)var2_2), (Object)v21, (long)-2323993975427366341L, (long)var2_2);
                    }
                }
                catch (Throwable v22) {
                    throw m44.a("k", (Object)v22, (long)-2425501663447248870L, (long)var2_2);
                }
                throw var25_16;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var22_12) ** GOTO lbl137
                v7 = new Object[3];
                v7[2] = true;
                v7[1] = var21_11;
                v7[0] = var18_10;
                m44.a("t", (Object)m44.a("u", (Object)this, (long)-4367750779177426676L, (long)var2_2), (Object)v7, (long)-2323993975427366341L, (long)var2_2);
            }
            catch (Throwable v8) {
                throw m44.a("k", (Object)v8, (long)-2425501663447248870L, (long)var2_2);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl137:
        // 3 sources

    }

    private boolean J(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                int n10 = (Integer)objectArray[1];
                long l11 = (l10 << 16 | (long)n10 << 48 >>> 48) ^ a;
                long l12 = l11 ^ 0x323DFC2CD659L;
                CallSite callSite = m44.a("k", (long)-225166854601694494L, (long)l11);
                try {
                    try {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l12;
                        object = m44.a("j", (Object)this, (Object)objectArray2, (long)-1949295683409581728L, (long)l11);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("k", (Object)runtimeException, (long)-20603038591700486L, (long)l11);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("k", (Object)runtimeException, (long)-20603038591700486L, (long)l11);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void T(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x16BCDBAF8F51L;
        long l13 = l11 ^ 0x59CE16D5650EL;
        long l14 = l11 ^ 0x709FDB6246CBL;
        long l15 = l11 ^ 0x6CD5E55BE3C6L;
        long l16 = l11 ^ 0x6D7A6DB8D3A3L;
        qs qs2 = new qs((int)lqz.a("r", (int)27428, (long)(0x6FA717DDAE2B636EL ^ l10)), l14);
        boolean bl2 = true;
        CallSite callSite = m44.a("k", (long)-6969202434363932342L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = qs2;
        objectArray2[0] = l15;
        m44.a("t", (Object)m44.a("u", (Object)this, (long)-9139228876630793404L, (long)l10), (Object)objectArray2, (long)-8833715487626392666L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l13;
            objectArray3[0] = (int)lqz.a("r", (int)18809, (long)(0x4D36E618967541D0L ^ l10));
            CallSite callSite2 = m44.a("j", (Object)this, (Object)objectArray3, (long)-9158382039914949123L, (long)l10);
            m44.a("w", (Object)this, (int)lqz.a("r", (int)14899, (long)(0x1D1790A1D378B208L ^ l10)), (long)-9042392960941685157L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = qs2;
            objectArray4[0] = l16;
            m44.a("t", (Object)m44.a("u", (Object)this, (long)-9139228876630793404L, (long)l10), (Object)objectArray4, (long)-7063951239173816205L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("u", (Object)callSite2, (long)-7068910601106642358L, (long)l10);
            objectArray5[0] = l12;
            m44.a("t", (Object)qs2, (Object)objectArray5, (long)-7332693481814374617L, (long)l10);
            if (callSite != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 <= 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = qs2;
                objectArray6[0] = l16;
                m44.a("t", (Object)m44.a("u", (Object)this, (long)-9139228876630793404L, (long)l10), (Object)objectArray6, (long)-7063951239173816205L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("k", (Object)runtimeException, (long)-7197124825687010734L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = qs2;
            objectArray7[0] = l16;
            m44.a("t", (Object)m44.a("u", (Object)this, (long)-9139228876630793404L, (long)l10), (Object)objectArray7, (long)-7063951239173816205L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("k", (Object)runtimeException, (long)-7197124825687010734L, (long)l10);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void Ka(Object[] var1_1) {
        block30: {
            block29: {
                var2_2 = (Long)var1_1[0];
                v0 = var2_2 = lqz.a ^ var2_2;
                var4_3 = v0 ^ 117935213032545L;
                var6_4 = v0 ^ 90559631781328L;
                v1 = v0 ^ 9843644540710L;
                var8_5 = (int)(v1 >>> 32);
                var9_6 = (int)(v1 << 32 >>> 48);
                var10_7 = (int)(v1 << 48 >>> 48);
                var11_8 = v0 ^ 61422255216654L;
                var13_9 = v0 ^ 131794411802162L;
                var15_10 = v0 ^ 22990895844358L;
                var17_11 = v0 ^ 84595038160251L;
                var19_12 = v0 ^ 3053859806918L;
                var21_13 = v0 ^ 3747373231779L;
                var24_14 = new q3((int)lqz.a("r", (int)22002, (long)(6374046966359629853L ^ var2_2)), var8_5, (char)var9_6, (short)var10_7);
                var23_15 = m44.a("k", (long)-2141455723164189622L, (long)var2_2);
                var25_16 = true;
                v2 = new Object[2];
                v2[1] = var24_14;
                v2[0] = var19_12;
                m44.a("t", (Object)m44.a("u", (Object)this, (long)-276265693386858940L, (long)var2_2), (Object)v2, (long)-547125216140527962L, (long)var2_2);
                v3 = new Object[2];
                v3[1] = var11_8;
                v3[0] = (int)lqz.a("r", (int)12353, (long)(7588953472410961324L ^ var2_2));
                m44.a("j", (Object)this, (Object)v3, (long)-151281683584505603L, (long)var2_2);
                v4 = new Object[2];
                v4[1] = (int)lqz.a("r", (int)5174, (long)(7498634116801716668L ^ var2_2));
                v4[0] = var6_4;
                v5 /* !! */  = m44.a("j", (Object)this, (Object)v4, (long)-2299861860990936189L, (long)var2_2);
                if (var23_15 != null) break block29;
                try {
                    if (v5 /* !! */  != false) {
                        v6 = new Object[1];
                        v6[0] = var13_9;
                        m44.a("t", (Object)this, (Object)v6, (long)-518833941779261608L, (long)var2_2);
                    }
                }
                catch (Throwable v7) {
                    throw m44.a("k", (Object)v7, (long)-2225126724370780334L, (long)var2_2);
                }
                v8 = new Object[1];
                v8[0] = var15_10;
                m44.a("t", (Object)this, (Object)v8, (long)-1819538342456350182L, (long)var2_2);
                v9 = new Object[2];
                v9[1] = var11_8;
                v9[0] = (int)lqz.a("r", (int)30663, (long)(4630769814410265115L ^ var2_2));
                m44.a("j", (Object)this, (Object)v9, (long)-151281683584505603L, (long)var2_2);
                if (var23_15 != null) break block30;
                v5 /* !! */  = (CallSite)var25_16;
            }
            try {
                if (v5 /* !! */  == false) ** GOTO lbl150
                v10 = new Object[3];
                v10[2] = true;
                v10[1] = var24_14;
                v10[0] = var21_13;
                m44.a("t", (Object)m44.a("u", (Object)this, (long)-276265693386858940L, (long)var2_2), (Object)v10, (long)-2236138555493827213L, (long)var2_2);
            }
            catch (Throwable v11) {
                throw m44.a("k", (Object)v11, (long)-2225126724370780334L, (long)var2_2);
            }
            catch (Throwable var26_17) {
                try {
                    block36: {
                        block34: {
                            block35: {
                                block33: {
                                    block31: {
                                        block32: {
                                            if (var2_2 < 0L) break block31;
                                            v12 = var25_16;
                                            if (var23_15 != null) break block32;
                                            try {
                                                block37: {
                                                    if (!v12) ** GOTO lbl98
                                                    break block37;
                                                    catch (Throwable v13) {
                                                        throw m44.a("k", (Object)v13, (long)-2225126724370780334L, (long)var2_2);
                                                    }
                                                }
                                                v14 = new Object[2];
                                                v14[1] = var17_11;
                                                v14[0] = var24_14;
                                                m44.a("t", (Object)m44.a("u", (Object)this, (long)-276265693386858940L, (long)var2_2), (Object)v14, (long)-467067403866585092L, (long)var2_2);
                                                v12 = false;
                                            }
                                            catch (Throwable v15) {
                                                throw m44.a("k", (Object)v15, (long)-2225126724370780334L, (long)var2_2);
                                            }
                                        }
                                        var25_16 = v12;
                                    }
                                    try {
                                        if (var2_2 <= 0L || var23_15 == null) break block33;
lbl98:
                                        // 2 sources

                                        v16 = new Object[1];
                                        v16[0] = var4_3;
                                        m44.a("t", (Object)m44.a("u", (Object)this, (long)-276265693386858940L, (long)var2_2), (Object)v16, (long)-448489601519633214L, (long)var2_2);
                                    }
                                    catch (Throwable v17) {
                                        throw m44.a("k", (Object)v17, (long)-2225126724370780334L, (long)var2_2);
                                    }
                                }
                                v18 = var26_17 instanceof RuntimeException;
                                if (var2_2 <= 0L || var23_15 != null) break block34;
                                try {
                                    block38: {
                                        if (!v18) break block35;
                                        break block38;
                                        catch (Throwable v19) {
                                            throw m44.a("k", (Object)v19, (long)-2225126724370780334L, (long)var2_2);
                                        }
                                    }
                                    throw (RuntimeException)var26_17;
                                }
                                catch (Throwable v20) {
                                    throw m44.a("k", (Object)v20, (long)-2225126724370780334L, (long)var2_2);
                                }
                            }
                            try {
                                v21 = var26_17;
                                if (var23_15 != null) break block36;
                                v18 = v21 instanceof t;
                            }
                            catch (Throwable v22) {
                                throw m44.a("k", (Object)v22, (long)-2225126724370780334L, (long)var2_2);
                            }
                        }
                        try {
                            if (v18) {
                                throw (t)var26_17;
                            }
                        }
                        catch (Throwable v23) {
                            throw m44.a("k", (Object)v23, (long)-2225126724370780334L, (long)var2_2);
                        }
                        v21 = var26_17;
                    }
                    throw (Error)v21;
                }
                catch (Throwable var27_18) {
                    try {
                        if (var2_2 > 0L && var25_16) {
                            v24 = new Object[3];
                            v24[2] = true;
                            v24[1] = var24_14;
                            v24[0] = var21_13;
                            m44.a("t", (Object)m44.a("u", (Object)this, (long)-276265693386858940L, (long)var2_2), (Object)v24, (long)-2236138555493827213L, (long)var2_2);
                        }
                    }
                    catch (Throwable v25) {
                        throw m44.a("k", (Object)v25, (long)-2225126724370780334L, (long)var2_2);
                    }
                    throw var27_18;
                }
            }
        }
    }

    /*
     * Exception decompiling
     */
    public final void Kv(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[CASE]], but top level block is 2[TRYBLOCK]
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
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean c(Object[] objectArray) {
        Object object;
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x6F8AF54F4FD5L;
        long l13 = l11 ^ 0x67BB74500B59L;
        CallSite callSite = m44.a("l", (long)4474090154580762645L, (long)l10);
        m44.a("p", (Object)this, (int)n10, (long)4373375896171294557L, (long)l10);
        CallSite callSite2 = callSite;
        CallSite callSite3 = m44.a("r", (Object)this, (long)2486672613632353027L, (long)l10);
        m44.a("p", (Object)this, (lbd)((Object)callSite3), (long)4293166920578982999L, (long)l10);
        m44.a("p", (Object)this, (lbd)((Object)callSite3), (long)2740386511743684096L, (long)l10);
        try {
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l13;
            Object object2 = m44.a("m", (Object)this, (Object)objectArray2, (long)4285603814038199836L, (long)l10);
            if (callSite2 == null) {
                object2 = object2 == false ? (Object)true : (Object)false;
            }
            object = object2;
        }
        catch (ad ad2) {
            boolean bl2;
            try {
                bl2 = true;
            }
            catch (Throwable throwable) {
                Object[] objectArray3 = new Object[3];
                objectArray3[2] = n10;
                objectArray3[1] = l12;
                objectArray3[0] = 1;
                m44.a("m", (Object)this, (Object)objectArray3, (long)4341208873610754941L, (long)l10);
                throw throwable;
            }
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = n10;
            objectArray4[1] = l12;
            objectArray4[0] = 1;
            m44.a("m", (Object)this, (Object)objectArray4, (long)4341208873610754941L, (long)l10);
            return bl2;
        }
        Object[] objectArray5 = new Object[3];
        objectArray5[2] = n10;
        objectArray5[1] = l12;
        objectArray5[0] = 1;
        m44.a("m", (Object)this, (Object)objectArray5, (long)4341208873610754941L, (long)l10);
        return (boolean)object;
    }

    private boolean b(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x2577B9442978L;
                CallSite callSite = m44.a("h", (long)-3478115302173896263L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)lqz.a("r", (int)11783, (long)(0x4DFC426DB1A7F7E6L ^ l10));
                        object = m44.a("i", (Object)this, (Object)objectArray2, (long)-3520905004761830437L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("h", (Object)runtimeException, (long)-3680137047799528799L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("h", (Object)runtimeException, (long)-3680137047799528799L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     */
    public final void A(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = lqz.a ^ var2_2;
        var4_3 = v0 ^ 51446948782255L;
        var6_4 = v0 ^ 67236466206367L;
        var8_5 = v0 ^ 125707130096832L;
        var10_6 = v0 ^ 53067321069074L;
        var12_7 = v0 ^ 92515952366755L;
        var14_8 = v0 ^ 10414529368501L;
        var16_9 = v0 ^ 78406966004232L;
        var18_10 = v0 ^ 77927949040237L;
        var21_11 = new pm((int)lqz.a("r", (int)10393, (long)(6972942263845128691L ^ var2_2)), var12_7);
        var22_12 = true;
        v1 = m44.a("m", (long)3928899009002072196L, (long)var2_2);
        v2 = new Object[2];
        v2[1] = var21_11;
        v2[0] = var16_9;
        m44.a("r", (Object)m44.a("s", (Object)this, (long)2946695939675212426L, (long)var2_2), (Object)v2, (long)3217396471194788456L, (long)var2_2);
        var20_13 = v1;
        try {
            v3 = new Object[2];
            v3[1] = var8_5;
            v3[0] = (int)lqz.a("r", (int)27362, (long)(3557526950285069059L ^ var2_2));
            var23_14 = m44.a("l", (Object)this, (Object)v3, (long)2965848592399334451L, (long)var2_2);
            m44.a("q", (Object)this, (int)lqz.a("r", (int)26122, (long)(6536195629420529476L ^ var2_2)), (long)3120110641081528213L, (long)var2_2);
            v4 = new Object[1];
            v4[0] = var10_6;
            m44.a("r", (Object)this, (Object)v4, (long)3360728087063293462L, (long)var2_2);
            v5 = new Object[3];
            v5[2] = true;
            v5[1] = var21_11;
            v5[0] = var18_10;
            m44.a("r", (Object)m44.a("s", (Object)this, (long)2946695939675212426L, (long)var2_2), (Object)v5, (long)3763292247804471741L, (long)var2_2);
            var22_12 = false;
            v6 = new Object[2];
            v6[1] = (int)m44.a("s", (Object)var23_14, (long)3758259217988518788L, (long)var2_2);
            v6[0] = var6_4;
            m44.a("r", (Object)var21_11, (Object)v6, (long)3743372800298151657L, (long)var2_2);
            ** if (var20_13 != null) goto lbl-1000
        }
        catch (Throwable var24_15) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block26: {
                                    block27: {
                                        if (var2_2 <= 0L) break block26;
                                        v9 = var22_12;
                                        if (var20_13 != null) break block27;
                                        try {
                                            block32: {
                                                if (!v9) ** GOTO lbl85
                                                break block32;
                                                catch (Throwable v10) {
                                                    throw m44.a("m", (Object)v10, (long)3877747163727887260L, (long)var2_2);
                                                }
                                            }
                                            v11 = new Object[2];
                                            v11[1] = var14_8;
                                            v11[0] = var21_11;
                                            m44.a("r", (Object)m44.a("s", (Object)this, (long)2946695939675212426L, (long)var2_2), (Object)v11, (long)3263668421383918386L, (long)var2_2);
                                            v9 = false;
                                        }
                                        catch (Throwable v12) {
                                            throw m44.a("m", (Object)v12, (long)3877747163727887260L, (long)var2_2);
                                        }
                                    }
                                    var22_12 = v9;
                                }
                                try {
                                    if (var2_2 < 0L || var20_13 == null) break block28;
lbl85:
                                    // 2 sources

                                    v13 = new Object[1];
                                    v13[0] = var4_3;
                                    m44.a("r", (Object)m44.a("s", (Object)this, (long)2946695939675212426L, (long)var2_2), (Object)v13, (long)3245090500270024716L, (long)var2_2);
                                }
                                catch (Throwable v14) {
                                    throw m44.a("m", (Object)v14, (long)3877747163727887260L, (long)var2_2);
                                }
                            }
                            v15 = var24_15 instanceof RuntimeException;
                            if (var2_2 < 0L || var20_13 != null) break block29;
                            try {
                                block33: {
                                    if (!v15) break block30;
                                    break block33;
                                    catch (Throwable v16) {
                                        throw m44.a("m", (Object)v16, (long)3877747163727887260L, (long)var2_2);
                                    }
                                }
                                throw (RuntimeException)var24_15;
                            }
                            catch (Throwable v17) {
                                throw m44.a("m", (Object)v17, (long)3877747163727887260L, (long)var2_2);
                            }
                        }
                        try {
                            v18 = var24_15;
                            if (var20_13 != null) break block31;
                            v15 = v18 instanceof t;
                        }
                        catch (Throwable v19) {
                            throw m44.a("m", (Object)v19, (long)3877747163727887260L, (long)var2_2);
                        }
                    }
                    try {
                        if (v15) {
                            throw (t)var24_15;
                        }
                    }
                    catch (Throwable v20) {
                        throw m44.a("m", (Object)v20, (long)3877747163727887260L, (long)var2_2);
                    }
                    v18 = var24_15;
                }
                throw (Error)v18;
            }
            catch (Throwable var25_16) {
                try {
                    if (var2_2 >= 0L && var22_12) {
                        v21 = new Object[3];
                        v21[2] = true;
                        v21[1] = var21_11;
                        v21[0] = var18_10;
                        m44.a("r", (Object)m44.a("s", (Object)this, (long)2946695939675212426L, (long)var2_2), (Object)v21, (long)3763292247804471741L, (long)var2_2);
                    }
                }
                catch (Throwable v22) {
                    throw m44.a("m", (Object)v22, (long)3877747163727887260L, (long)var2_2);
                }
                throw var25_16;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var22_12) ** GOTO lbl137
                v7 = new Object[3];
                v7[2] = true;
                v7[1] = var21_11;
                v7[0] = var18_10;
                m44.a("r", (Object)m44.a("s", (Object)this, (long)2946695939675212426L, (long)var2_2), (Object)v7, (long)3763292247804471741L, (long)var2_2);
            }
            catch (Throwable v8) {
                throw m44.a("m", (Object)v8, (long)3877747163727887260L, (long)var2_2);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl137:
        // 3 sources

    }

    private boolean L(Object[] objectArray) {
        Object object;
        block28: {
            block29: {
                long l10 = (Long)objectArray[0];
                long l11 = l10 = a ^ l10;
                long l12 = l11 ^ 0x2A6E7B74B0B9L;
                long l13 = l11 ^ 0x5E94B66C5223L;
                long l14 = l11 ^ 0x68B2D250FCB3L;
                long l15 = l11 ^ 0x112AC1AC12EDL;
                long l16 = l11 ^ 0x7654BC1A934L;
                long l17 = l11 ^ 0x127E3B31D3A5L;
                long l18 = l11 ^ 0x45B0E32465D5L;
                CallSite callSite = m44.a("q", (Object)this, (long)7482569893590284308L, (long)l10);
                CallSite callSite2 = m44.a("o", (long)7085323811787226198L, (long)l10);
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        Object[] objectArray2 = new Object[1];
                                                                        objectArray2[0] = l16;
                                                                        object = m44.a("n", (Object)this, (Object)objectArray2, (long)7419570482465733523L, (long)l10);
                                                                        if (callSite2 != null) break block28;
                                                                        if (object == false) break block29;
                                                                    }
                                                                    catch (RuntimeException runtimeException) {
                                                                        throw m44.a("o", (Object)runtimeException, (long)6990402607668080462L, (long)l10);
                                                                    }
                                                                    m44.a("s", (Object)this, (lbd)((Object)callSite), (long)7482569893590284308L, (long)l10);
                                                                    Object[] objectArray3 = new Object[1];
                                                                    objectArray3[0] = l18;
                                                                    object = m44.a("n", (Object)this, (Object)objectArray3, (long)7471963146360988392L, (long)l10);
                                                                    if (callSite2 != null) break block28;
                                                                }
                                                                catch (RuntimeException runtimeException) {
                                                                    throw m44.a("o", (Object)runtimeException, (long)6990402607668080462L, (long)l10);
                                                                }
                                                                if (object == false) break block29;
                                                            }
                                                            catch (RuntimeException runtimeException) {
                                                                throw m44.a("o", (Object)runtimeException, (long)6990402607668080462L, (long)l10);
                                                            }
                                                            m44.a("s", (Object)this, (lbd)((Object)callSite), (long)7482569893590284308L, (long)l10);
                                                            Object[] objectArray4 = new Object[1];
                                                            objectArray4[0] = l13;
                                                            object = m44.a("n", (Object)this, (Object)objectArray4, (long)7378985543333519609L, (long)l10);
                                                            if (callSite2 != null) break block28;
                                                        }
                                                        catch (RuntimeException runtimeException) {
                                                            throw m44.a("o", (Object)runtimeException, (long)6990402607668080462L, (long)l10);
                                                        }
                                                        if (object == false) break block29;
                                                    }
                                                    catch (RuntimeException runtimeException) {
                                                        throw m44.a("o", (Object)runtimeException, (long)6990402607668080462L, (long)l10);
                                                    }
                                                    m44.a("s", (Object)this, (lbd)((Object)callSite), (long)7482569893590284308L, (long)l10);
                                                    Object[] objectArray5 = new Object[1];
                                                    objectArray5[0] = l15;
                                                    object = m44.a("n", (Object)this, (Object)objectArray5, (long)6941624855741126326L, (long)l10);
                                                    if (callSite2 != null) break block28;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw m44.a("o", (Object)runtimeException, (long)6990402607668080462L, (long)l10);
                                                }
                                                if (object == false) break block29;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw m44.a("o", (Object)runtimeException, (long)6990402607668080462L, (long)l10);
                                            }
                                            m44.a("s", (Object)this, (lbd)((Object)callSite), (long)7482569893590284308L, (long)l10);
                                            Object[] objectArray6 = new Object[1];
                                            objectArray6[0] = l12;
                                            object = m44.a("n", (Object)this, (Object)objectArray6, (long)7408580160815297534L, (long)l10);
                                            if (callSite2 != null) break block28;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw m44.a("o", (Object)runtimeException, (long)6990402607668080462L, (long)l10);
                                        }
                                        if (object == false) break block29;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw m44.a("o", (Object)runtimeException, (long)6990402607668080462L, (long)l10);
                                    }
                                    m44.a("s", (Object)this, (lbd)((Object)callSite), (long)7482569893590284308L, (long)l10);
                                    Object[] objectArray7 = new Object[1];
                                    objectArray7[0] = l17;
                                    object = m44.a("n", (Object)this, (Object)objectArray7, (long)7285210525230644600L, (long)l10);
                                    if (callSite2 != null) break block28;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw m44.a("o", (Object)runtimeException, (long)6990402607668080462L, (long)l10);
                                }
                                if (object == false) break block29;
                            }
                            catch (RuntimeException runtimeException) {
                                throw m44.a("o", (Object)runtimeException, (long)6990402607668080462L, (long)l10);
                            }
                            m44.a("s", (Object)this, (lbd)((Object)callSite), (long)7482569893590284308L, (long)l10);
                            Object[] objectArray8 = new Object[1];
                            objectArray8[0] = l14;
                            object = m44.a("n", (Object)this, (Object)objectArray8, (long)7074972289850698518L, (long)l10);
                            if (callSite2 != null) break block28;
                        }
                        catch (RuntimeException runtimeException) {
                            throw m44.a("o", (Object)runtimeException, (long)6990402607668080462L, (long)l10);
                        }
                        if (object == false) break block29;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("o", (Object)runtimeException, (long)6990402607668080462L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("o", (Object)runtimeException, (long)6990402607668080462L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    private boolean K(Object[] objectArray) {
        Object object;
        block10: {
            block11: {
                CallSite callSite;
                long l10;
                block8: {
                    long l11;
                    block9: {
                        l10 = (Long)objectArray[0];
                        long l12 = l10 = a ^ l10;
                        long l13 = l12 ^ 0x4940D40BE93AL;
                        l11 = l12 ^ 0x6B9EC1A843D0L;
                        callSite = m44.a("m", (long)6448702462290855804L, (long)l10);
                        try {
                            try {
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l13;
                                object = m44.a("l", (Object)this, (Object)objectArray2, (long)4974107481178183561L, (long)l10);
                                if (callSite != null) break block8;
                                if (object == false) break block9;
                            }
                            catch (RuntimeException runtimeException) {
                                throw m44.a("m", (Object)runtimeException, (long)6496621597317403748L, (long)l10);
                            }
                            return true;
                        }
                        catch (RuntimeException runtimeException) {
                            throw m44.a("m", (Object)runtimeException, (long)6496621597317403748L, (long)l10);
                        }
                    }
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l11;
                    object = m44.a("l", (Object)this, (Object)objectArray3, (long)4753681049235966372L, (long)l10);
                }
                try {
                    try {
                        if (callSite != null) break block10;
                        if (object == false) break block11;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("m", (Object)runtimeException, (long)6496621597317403748L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("m", (Object)runtimeException, (long)6496621597317403748L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    private boolean E(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x4506E14E8C12L;
                CallSite callSite = m44.a("j", (long)7696969514085889235L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)lqz.a("r", (int)17902, (long)(0x425690D7D3F93806L ^ l10));
                        object = m44.a("k", (Object)this, (Object)objectArray2, (long)7658753779869421233L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("j", (Object)runtimeException, (long)7604300118844319691L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("j", (Object)runtimeException, (long)7604300118844319691L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Exception decompiling
     */
    public final void L(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 3[TRYBLOCK]
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
    public final void K4(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 3[TRYBLOCK]
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
    public final void Ke(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 3[TRYBLOCK]
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

    private boolean l(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x592BD5F8446AL;
                CallSite callSite = m44.a("j", (long)-6725777691251868501L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)lqz.a("r", (int)15462, (long)(0x23C66CFAD28997L ^ l10));
                        object = m44.a("k", (Object)this, (Object)objectArray2, (long)-6759542602397464887L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("j", (Object)runtimeException, (long)-6773419861082378317L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("j", (Object)runtimeException, (long)-6773419861082378317L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x1D558545B5D4L;
        long l13 = l11 ^ 0x52FE9500A496L;
        long l14 = l11 ^ 0x67E5668E225EL;
        long l15 = l11 ^ 0x664AEE6D123BL;
        qd qd2 = new qd((int)lqz.a("r", (int)1668, (long)(0x696CC04E6A38CF81L ^ l10)), l12);
        boolean bl2 = true;
        CallSite callSite = m44.a("k", (long)6832066737327210706L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = qd2;
        objectArray2[0] = l14;
        m44.a("t", (Object)m44.a("u", (Object)this, (long)4662040295078634204L, (long)l10), (Object)objectArray2, (long)4967573337929435710L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l13;
            objectArray3[0] = (int)lqz.a("r", (int)9110, (long)(0x268D0AE252B26A77L ^ l10));
            m44.a("j", (Object)this, (Object)objectArray3, (long)4719472510479406181L, (long)l10);
            if (callSite != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 < 0L || !bl2) throw throwable;
                Object[] objectArray4 = new Object[3];
                objectArray4[2] = true;
                objectArray4[1] = qd2;
                objectArray4[0] = l15;
                m44.a("t", (Object)m44.a("u", (Object)this, (long)4662040295078634204L, (long)l10), (Object)objectArray4, (long)6660761136948347371L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("k", (Object)runtimeException, (long)6739256595534975946L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray5 = new Object[3];
            objectArray5[2] = true;
            objectArray5[1] = qd2;
            objectArray5[0] = l15;
            m44.a("t", (Object)m44.a("u", (Object)this, (long)4662040295078634204L, (long)l10), (Object)objectArray5, (long)6660761136948347371L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("k", (Object)runtimeException, (long)6739256595534975946L, (long)l10);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void Kq(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x4164319F5B76L;
        long l13 = l11 ^ 0x7BF1BD9CF8DDL;
        long l14 = l11 ^ 0x348370E61282L;
        long l15 = l11 ^ 0x1988368944AL;
        long l16 = l11 ^ 0x370B8BA42FL;
        CallSite callSite = m44.a("o", (long)-1674206555450362170L, (long)l10);
        p5 p52 = new p5(l12, (int)lqz.a("r", (int)11074, (long)(0x6D524C01A5935464L ^ l10)));
        boolean bl2 = true;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = p52;
        objectArray2[0] = l15;
        m44.a("p", (Object)m44.a("q", (Object)this, (long)-673707542456658744L, (long)l10), (Object)objectArray2, (long)-944564204434949078L, (long)l10);
        CallSite callSite2 = callSite;
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l14;
            objectArray3[0] = (int)lqz.a("r", (int)25215, (long)(0x2628B1CDF3CE1D3CL ^ l10));
            CallSite callSite3 = m44.a("n", (Object)this, (Object)objectArray3, (long)-618531074871516559L, (long)l10);
            m44.a("s", (Object)this, (int)lqz.a("r", (int)7642, (long)(0x18D33B491288E243L ^ l10)), (long)-788522667175611945L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = p52;
            objectArray4[0] = l16;
            m44.a("p", (Object)m44.a("q", (Object)this, (long)-673707542456658744L, (long)l10), (Object)objectArray4, (long)-1550469126354487297L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("q", (Object)callSite3, (long)-1555358086053962298L, (long)l10);
            objectArray5[0] = l13;
            m44.a("p", (Object)p52, (Object)objectArray5, (long)-1319159495584993109L, (long)l10);
            if (callSite2 != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 < 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = p52;
                objectArray6[0] = l16;
                m44.a("p", (Object)m44.a("q", (Object)this, (long)-673707542456658744L, (long)l10), (Object)objectArray6, (long)-1550469126354487297L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("o", (Object)runtimeException, (long)-1471902648185346594L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = p52;
            objectArray7[0] = l16;
            m44.a("p", (Object)m44.a("q", (Object)this, (long)-673707542456658744L, (long)l10), (Object)objectArray7, (long)-1550469126354487297L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("o", (Object)runtimeException, (long)-1471902648185346594L, (long)l10);
        }
    }

    /*
     * Exception decompiling
     */
    public final void K5(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [26[CASE]], but top level block is 2[TRYBLOCK]
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
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean j(Object[] objectArray) {
        Object object;
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x3CEF8364CF86L;
        long l13 = l11 ^ 0x13729BA4E379L;
        m44.a("s", (Object)this, (int)n10, (long)-4836292803415757042L, (long)l10);
        CallSite callSite = m44.a("o", (long)-4736526565755559866L, (long)l10);
        CallSite callSite2 = m44.a("q", (Object)this, (long)-6714518549587287216L, (long)l10);
        m44.a("s", (Object)this, (lbd)((Object)callSite2), (long)-4915898946725157884L, (long)l10);
        m44.a("s", (Object)this, (lbd)((Object)callSite2), (long)-6461367603101528493L, (long)l10);
        CallSite callSite3 = callSite;
        try {
            Object object2;
            block6: {
                block7: {
                    try {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l13;
                        object2 = m44.a("n", (Object)this, (Object)objectArray2, (long)-6837818770326349700L, (long)l10);
                        if (callSite3 != null) break block6;
                        if (object2 != false) break block7;
                    }
                    catch (ad ad2) {
                        throw m44.a("o", (Object)ad2, (long)-4822585018490227874L, (long)l10);
                    }
                    object2 = true;
                    break block6;
                }
                object2 = false;
            }
            object = object2;
        }
        catch (ad ad3) {
            boolean bl2;
            try {
                bl2 = true;
            }
            catch (Throwable throwable) {
                Object[] objectArray3 = new Object[3];
                objectArray3[2] = n10;
                objectArray3[1] = l12;
                objectArray3[0] = 2;
                m44.a("n", (Object)this, (Object)objectArray3, (long)-4869445503454266578L, (long)l10);
                throw throwable;
            }
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = n10;
            objectArray4[1] = l12;
            objectArray4[0] = 2;
            m44.a("n", (Object)this, (Object)objectArray4, (long)-4869445503454266578L, (long)l10);
            return bl2;
        }
        Object[] objectArray5 = new Object[3];
        objectArray5[2] = n10;
        objectArray5[1] = l12;
        objectArray5[0] = 2;
        m44.a("n", (Object)this, (Object)objectArray5, (long)-4869445503454266578L, (long)l10);
        return (boolean)object;
    }

    private boolean q(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x24B816A93C0L;
                CallSite callSite = m44.a("h", (long)8431696947042953985L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)lqz.a("r", (int)17902, (long)(0x4256D79AB3DD27D4L ^ l10));
                        object = m44.a("i", (Object)this, (Object)objectArray2, (long)8474398671560511843L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("h", (Object)runtimeException, (long)8526899480137119769L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("h", (Object)runtimeException, (long)8526899480137119769L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean U(Object[] var1_1) {
        block54: {
            block55: {
                block56: {
                    block50: {
                        block52: {
                            block53: {
                                block47: {
                                    block51: {
                                        block48: {
                                            block49: {
                                                block46: {
                                                    block43: {
                                                        block44: {
                                                            var4_2 = (Integer)var1_1[0];
                                                            var2_3 = (Long)var1_1[1];
                                                            v0 = var2_3 = lqz.a ^ var2_3;
                                                            var5_4 = v0 ^ 2730078372763L;
                                                            var7_5 = v0 ^ 113955111138672L;
                                                            var9_6 = m44.a("h", (long)3806500968429120209L, (long)var2_3);
                                                            try {
                                                                block45: {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    v1 = this;
                                                                                    if (var9_6 != null) break block43;
                                                                                    if (m44.a("v", (Object)v1, (long)3553381533474582163L, (long)var2_3) == m44.a("v", (Object)this, (long)3225578161970283716L, (long)var2_3)) {
                                                                                    }
                                                                                    ** GOTO lbl55
                                                                                }
                                                                                catch (RuntimeException v2) {
                                                                                    throw m44.a("h", (Object)v2, (long)4000795312008559049L, (long)var2_3);
                                                                                }
                                                                                v3 = this;
                                                                                m44.a("t", (Object)v3, (int)(m44.a("v", (Object)v3, (long)3924072372037330329L, (long)var2_3) - true), (long)3924072372037330329L, (long)var2_3);
                                                                                v4 = this;
                                                                                if (var2_3 <= 0L || var9_6 != null) break block44;
                                                                            }
                                                                            catch (RuntimeException v5) {
                                                                                throw m44.a("h", (Object)v5, (long)4000795312008559049L, (long)var2_3);
                                                                            }
                                                                            if (var2_3 <= 0L) break block44;
                                                                            if (m44.a("v", (Object)m44.a("v", (Object)v4, (long)3553381533474582163L, (long)var2_3), (long)3509255494273382341L, (long)var2_3) != null) break block45;
                                                                        }
                                                                        catch (RuntimeException v6) {
                                                                            throw m44.a("h", (Object)v6, (long)4000795312008559049L, (long)var2_3);
                                                                        }
                                                                        v7 = new Object[1];
                                                                        v7[0] = var7_5;
                                                                        v8 = m44.a("w", (Object)m44.a("v", (Object)this, (long)3726371621643615617L, (long)var2_3), (Object)v7, (long)3369085713946477292L, (long)var2_3);
                                                                        m44.a("t", (Object)m44.a("v", (Object)this, (long)3553381533474582163L, (long)var2_3), (lbd)v8, (long)3509255494273382341L, (long)var2_3);
                                                                        m44.a("t", (Object)this, (lbd)v8, (long)3553381533474582163L, (long)var2_3);
                                                                        m44.a("t", (Object)this, (lbd)v8, (long)3225578161970283716L, (long)var2_3);
                                                                        if (var2_3 <= 0L || var9_6 == null) break block46;
                                                                    }
                                                                    catch (RuntimeException v9) {
                                                                        throw m44.a("h", (Object)v9, (long)4000795312008559049L, (long)var2_3);
                                                                    }
                                                                }
                                                                v4 = this;
                                                            }
                                                            catch (RuntimeException v10) {
                                                                throw m44.a("h", (Object)v10, (long)4000795312008559049L, (long)var2_3);
                                                            }
                                                        }
                                                        try {
                                                            v11 = m44.a("v", (Object)m44.a("v", (Object)this, (long)3553381533474582163L, (long)var2_3), (long)3509255494273382341L, (long)var2_3);
                                                            m44.a("t", (Object)this, (lbd)v11, (long)3553381533474582163L, (long)var2_3);
                                                            m44.a("t", (Object)v4, (lbd)v11, (long)3225578161970283716L, (long)var2_3);
                                                            if (var2_3 < 0L || var9_6 == null) break block46;
lbl55:
                                                            // 2 sources

                                                            v1 = this;
                                                        }
                                                        catch (RuntimeException v12) {
                                                            throw m44.a("h", (Object)v12, (long)4000795312008559049L, (long)var2_3);
                                                        }
                                                    }
                                                    m44.a("t", (Object)v1, (lbd)m44.a("v", (Object)m44.a("v", (Object)this, (long)3553381533474582163L, (long)var2_3), (long)3509255494273382341L, (long)var2_3), (long)3553381533474582163L, (long)var2_3);
                                                }
                                                try {
                                                    v13 /* !! */  = m44.a("v", (Object)this, (long)3573599045761720331L, (long)var2_3);
                                                    v14 = var9_6;
                                                    if (var2_3 >= 0L) {
                                                        if (v14 != null) break block47;
                                                        if (v13 /* !! */  == false) break block48;
                                                    }
                                                    ** GOTO lbl123
                                                }
                                                catch (RuntimeException v15) {
                                                    throw m44.a("h", (Object)v15, (long)4000795312008559049L, (long)var2_3);
                                                }
                                                var10_7 = 0;
                                                var11_8 = m44.a("v", (Object)this, (long)2902058333815024071L, (long)var2_3);
                                                while (var11_8 != null) {
                                                    try {
                                                        try {
                                                            v16 = var11_8;
                                                            v17 = var9_6;
                                                            if (var2_3 > 0L) {
                                                                if (v17 != null) break block49;
                                                                v18 = m44.a("v", (Object)this, (long)3553381533474582163L, (long)var2_3);
                                                                if (var9_6 != null) break block50;
                                                            }
                                                            ** GOTO lbl100
                                                        }
                                                        catch (RuntimeException v19) {
                                                            throw m44.a("h", (Object)v19, (long)4000795312008559049L, (long)var2_3);
                                                        }
                                                        if (v16 == v18) break;
                                                    }
                                                    catch (RuntimeException v20) {
                                                        throw m44.a("h", (Object)v20, (long)4000795312008559049L, (long)var2_3);
                                                    }
                                                    ++var10_7;
                                                    var11_8 = m44.a("v", (Object)var11_8, (long)3509255494273382341L, (long)var2_3);
                                                    if (var9_6 == null) continue;
                                                }
                                                if (var2_3 < 0L) break block55;
                                                v16 = var11_8;
                                            }
                                            try {
                                                try {
                                                    v17 = var9_6;
lbl100:
                                                    // 2 sources

                                                    if (v17 != null) break block51;
                                                    if (v16 == null) break block48;
                                                }
                                                catch (RuntimeException v21) {
                                                    throw m44.a("h", (Object)v21, (long)4000795312008559049L, (long)var2_3);
                                                }
                                                v22 = new Object[3];
                                                v22[2] = var5_4;
                                                v22[1] = var10_7;
                                                v22[0] = var4_2;
                                                m44.a("i", (Object)this, (Object)v22, (long)3515987435079415712L, (long)var2_3);
                                            }
                                            catch (RuntimeException v23) {
                                                throw m44.a("h", (Object)v23, (long)4000795312008559049L, (long)var2_3);
                                            }
                                        }
                                        v16 = m44.a("v", (Object)this, (long)3553381533474582163L, (long)var2_3);
                                    }
                                    v13 /* !! */  = m44.a("v", (Object)v16, (long)3126145838937014375L, (long)var2_3);
                                }
                                try {
                                    try {
                                        v14 = var9_6;
lbl123:
                                        // 2 sources

                                        if (var2_3 >= 0L) {
                                            if (v14 != null) break block52;
                                            if (v13 /* !! */  == var4_2) break block53;
                                        }
                                        ** GOTO lbl140
                                    }
                                    catch (RuntimeException v24) {
                                        throw m44.a("h", (Object)v24, (long)4000795312008559049L, (long)var2_3);
                                    }
                                    return true;
                                }
                                catch (RuntimeException v25) {
                                    throw m44.a("h", (Object)v25, (long)4000795312008559049L, (long)var2_3);
                                }
                            }
                            v13 /* !! */  = m44.a("v", (Object)this, (long)3924072372037330329L, (long)var2_3);
                        }
                        try {
                            try {
                                try {
                                    v14 = var9_6;
lbl140:
                                    // 2 sources

                                    if (v14 != null) break block54;
                                    if (v13 /* !! */  != false) break block55;
                                }
                                catch (RuntimeException v26) {
                                    throw m44.a("h", (Object)v26, (long)4000795312008559049L, (long)var2_3);
                                }
                                v27 = this;
                                if (var9_6 != null) break block56;
                            }
                            catch (RuntimeException v28) {
                                throw m44.a("h", (Object)v28, (long)4000795312008559049L, (long)var2_3);
                            }
                            v29 = m44.a("v", (Object)v27, (long)3553381533474582163L, (long)var2_3);
                            v18 = m44.a("v", (Object)this, (long)3225578161970283716L, (long)var2_3);
                        }
                        catch (RuntimeException v30) {
                            throw m44.a("h", (Object)v30, (long)4000795312008559049L, (long)var2_3);
                        }
                    }
                    if (v29 != v18) break block55;
                    v27 = this;
                }
                throw m44.a("v", (Object)v27, (long)2902466535951974600L, (long)var2_3);
            }
            v13 /* !! */  = (CallSite)false;
        }
        return (boolean)v13 /* !! */ ;
    }

    /*
     * Exception decompiling
     */
    public final void Kx(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 3[TRYBLOCK]
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
    public final void KN(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 3[TRYBLOCK]
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
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void Kp(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x396B4BA218FCL;
        long l13 = l11 ^ 0x761986D8F2A3L;
        long l14 = l11 ^ 0x3DB03EED6BBEL;
        long l15 = l11 ^ 0x43027556746BL;
        long l16 = l11 ^ 0x42ADFDB5440EL;
        pc pc2 = new pc((int)lqz.a("r", (int)31940, (long)(0x27C709B4D7B3E313L ^ l10)), l14);
        boolean bl2 = true;
        CallSite callSite = m44.a("n", (long)640993945421010663L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = pc2;
        objectArray2[0] = l15;
        m44.a("q", (Object)m44.a("p", (Object)this, (long)1623477390193751273L, (long)l10), (Object)objectArray2, (long)1352620607755525131L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l13;
            objectArray3[0] = (int)lqz.a("r", (int)18464, (long)(0x527934330349D7D2L ^ l10));
            CallSite callSite2 = m44.a("o", (Object)this, (Object)objectArray3, (long)1678659420092940880L, (long)l10);
            m44.a("r", (Object)this, (int)lqz.a("r", (int)18464, (long)(0x527934330349D7D2L ^ l10)), (long)1526676659017191926L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = pc2;
            objectArray4[0] = l16;
            m44.a("q", (Object)m44.a("p", (Object)this, (long)1623477390193751273L, (long)l10), (Object)objectArray4, (long)746157253850093534L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("p", (Object)callSite2, (long)741687204656856551L, (long)l10);
            objectArray5[0] = l12;
            m44.a("q", (Object)pc2, (Object)objectArray5, (long)977322863967883402L, (long)l10);
            if (callSite != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 <= 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = pc2;
                objectArray6[0] = l16;
                m44.a("q", (Object)m44.a("p", (Object)this, (long)1623477390193751273L, (long)l10), (Object)objectArray6, (long)746157253850093534L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("n", (Object)runtimeException, (long)843161376268109311L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = pc2;
            objectArray7[0] = l16;
            m44.a("q", (Object)m44.a("p", (Object)this, (long)1623477390193751273L, (long)l10), (Object)objectArray7, (long)746157253850093534L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("n", (Object)runtimeException, (long)843161376268109311L, (long)l10);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void D(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = lqz.a ^ var2_2;
        var4_3 = v0 ^ 59723293790731L;
        var6_4 = v0 ^ 41496648766523L;
        var8_5 = v0 ^ 117439379062372L;
        var10_6 = v0 ^ 45617797502996L;
        var12_7 = v0 ^ 44911239838902L;
        var14_8 = v0 ^ 19670262326033L;
        var16_9 = v0 ^ 105366552983724L;
        var18_10 = v0 ^ 103882492807369L;
        var21_11 = new pl(var10_6, (int)lqz.a("r", (int)11026, (long)(1789535726180104239L ^ var2_2)));
        var20_12 = m44.a("i", (long)4909583636243585568L, (long)var2_2);
        var22_13 = true;
        v1 = new Object[2];
        v1[1] = var21_11;
        v1[0] = var16_9;
        m44.a("v", (Object)m44.a("w", (Object)this, (long)6503440593304172590L, (long)var2_2), (Object)v1, (long)6774088459801088204L, (long)var2_2);
        try {
            v2 = new Object[2];
            v2[1] = var8_5;
            v2[0] = (int)lqz.a("r", (int)15930, (long)(7186401299767881003L ^ var2_2));
            var23_14 = m44.a("h", (Object)this, (Object)v2, (long)6596884016754888343L, (long)var2_2);
            m44.a("u", (Object)this, (int)lqz.a("r", (int)15930, (long)(7186401299767881003L ^ var2_2)), (long)6478644134402448689L, (long)var2_2);
            v3 = new Object[1];
            v3[0] = var12_7;
            m44.a("v", (Object)this, (Object)v3, (long)6631459160375991474L, (long)var2_2);
            v4 = new Object[3];
            v4[2] = true;
            v4[1] = var21_11;
            v4[0] = var18_10;
            m44.a("v", (Object)m44.a("w", (Object)this, (long)6503440593304172590L, (long)var2_2), (Object)v4, (long)5088503286075530009L, (long)var2_2);
            var22_13 = false;
            v5 = new Object[2];
            v5[1] = (int)m44.a("w", (Object)var23_14, (long)5083469156614304032L, (long)var2_2);
            v5[0] = var6_4;
            m44.a("v", (Object)var21_11, (Object)v5, (long)4708294751534455885L, (long)var2_2);
            ** if (var20_12 != null) goto lbl-1000
        }
        catch (Throwable var24_15) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block26: {
                                    block27: {
                                        if (var2_2 <= 0L) break block26;
                                        v8 = var22_13;
                                        if (var20_12 != null) break block27;
                                        try {
                                            block32: {
                                                if (!v8) ** GOTO lbl84
                                                break block32;
                                                catch (Throwable v9) {
                                                    throw m44.a("i", (Object)v9, (long)5148914112967346488L, (long)var2_2);
                                                }
                                            }
                                            v10 = new Object[2];
                                            v10[1] = var14_8;
                                            v10[0] = var21_11;
                                            m44.a("v", (Object)m44.a("w", (Object)this, (long)6503440593304172590L, (long)var2_2), (Object)v10, (long)6912737047762624918L, (long)var2_2);
                                            v8 = false;
                                        }
                                        catch (Throwable v11) {
                                            throw m44.a("i", (Object)v11, (long)5148914112967346488L, (long)var2_2);
                                        }
                                    }
                                    var22_13 = v8;
                                }
                                try {
                                    if (var2_2 < 0L || var20_12 == null) break block28;
lbl84:
                                    // 2 sources

                                    v12 = new Object[1];
                                    v12[0] = var4_3;
                                    m44.a("v", (Object)m44.a("w", (Object)this, (long)6503440593304172590L, (long)var2_2), (Object)v12, (long)6894157838012881576L, (long)var2_2);
                                }
                                catch (Throwable v13) {
                                    throw m44.a("i", (Object)v13, (long)5148914112967346488L, (long)var2_2);
                                }
                            }
                            v14 = var24_15 instanceof RuntimeException;
                            if (var2_2 <= 0L || var20_12 != null) break block29;
                            try {
                                block33: {
                                    if (!v14) break block30;
                                    break block33;
                                    catch (Throwable v15) {
                                        throw m44.a("i", (Object)v15, (long)5148914112967346488L, (long)var2_2);
                                    }
                                }
                                throw (RuntimeException)var24_15;
                            }
                            catch (Throwable v16) {
                                throw m44.a("i", (Object)v16, (long)5148914112967346488L, (long)var2_2);
                            }
                        }
                        try {
                            v17 = var24_15;
                            if (var20_12 != null) break block31;
                            v14 = v17 instanceof t;
                        }
                        catch (Throwable v18) {
                            throw m44.a("i", (Object)v18, (long)5148914112967346488L, (long)var2_2);
                        }
                    }
                    try {
                        if (v14) {
                            throw (t)var24_15;
                        }
                    }
                    catch (Throwable v19) {
                        throw m44.a("i", (Object)v19, (long)5148914112967346488L, (long)var2_2);
                    }
                    v17 = var24_15;
                }
                throw (Error)v17;
            }
            catch (Throwable var25_16) {
                try {
                    if (var2_2 > 0L && var22_13) {
                        v20 = new Object[3];
                        v20[2] = true;
                        v20[1] = var21_11;
                        v20[0] = var18_10;
                        m44.a("v", (Object)m44.a("w", (Object)this, (long)6503440593304172590L, (long)var2_2), (Object)v20, (long)5088503286075530009L, (long)var2_2);
                    }
                }
                catch (Throwable v21) {
                    throw m44.a("i", (Object)v21, (long)5148914112967346488L, (long)var2_2);
                }
                throw var25_16;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var22_13) ** GOTO lbl136
                v6 = new Object[3];
                v6[2] = true;
                v6[1] = var21_11;
                v6[0] = var18_10;
                m44.a("v", (Object)m44.a("w", (Object)this, (long)6503440593304172590L, (long)var2_2), (Object)v6, (long)5088503286075530009L, (long)var2_2);
            }
            catch (Throwable v7) {
                throw m44.a("i", (Object)v7, (long)5148914112967346488L, (long)var2_2);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl136:
        // 3 sources

    }

    /*
     * Exception decompiling
     */
    public final void j(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 2[TRYBLOCK]
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
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void KX(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x473E9AAEEC6AL;
        long l13 = l11 ^ 0x84C57D40635L;
        long l14 = l11 ^ 0x1B82BE2FD367L;
        long l15 = l11 ^ 0x3D57A45A80FDL;
        long l16 = l11 ^ 0x3CF82CB9B098L;
        qj qj2 = new qj(l14, (int)lqz.a("r", (int)22136, (long)(0xA2CBAD52C8DBC42L ^ l10)));
        CallSite callSite = m44.a("h", (long)-255796100832550287L, (long)l10);
        boolean bl2 = true;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = qj2;
        objectArray2[0] = l15;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)-2156733562728185729L, (long)l10), (Object)objectArray2, (long)-1850127241985857379L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l13;
            objectArray3[0] = (int)lqz.a("r", (int)5034, (long)(0x770CF7DC9060F80EL ^ l10));
            CallSite callSite2 = m44.a("i", (Object)this, (Object)objectArray3, (long)-2027264641921698106L, (long)l10);
            m44.a("t", (Object)this, (int)lqz.a("r", (int)5034, (long)(0x770CF7DC9060F80EL ^ l10)), (long)-2181530021349989024L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = qj2;
            objectArray4[0] = l16;
            m44.a("w", (Object)m44.a("v", (Object)this, (long)-2156733562728185729L, (long)l10), (Object)objectArray4, (long)-86522474818428088L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("v", (Object)callSite2, (long)-81769852690577039L, (long)l10);
            objectArray5[0] = l12;
            m44.a("w", (Object)qj2, (Object)objectArray5, (long)-502613554233301988L, (long)l10);
            if (callSite != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 <= 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = qj2;
                objectArray6[0] = l16;
                m44.a("w", (Object)m44.a("v", (Object)this, (long)-2156733562728185729L, (long)l10), (Object)objectArray6, (long)-86522474818428088L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("h", (Object)runtimeException, (long)-61365289567735447L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = qj2;
            objectArray7[0] = l16;
            m44.a("w", (Object)m44.a("v", (Object)this, (long)-2156733562728185729L, (long)l10), (Object)objectArray7, (long)-86522474818428088L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("h", (Object)runtimeException, (long)-61365289567735447L, (long)l10);
        }
    }

    private boolean a(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x626F6F20E63EL;
                CallSite callSite = m44.a("n", (long)71221517055680255L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)lqz.a("r", (int)11783, (long)(0x4DFC057567C338A0L ^ l10));
                        object = m44.a("o", (Object)this, (Object)objectArray2, (long)28565954877351069L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("n", (Object)runtimeException, (long)264518045240872423L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("n", (Object)runtimeException, (long)264518045240872423L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     */
    public final void f(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = lqz.a ^ var2_2;
        var4_3 = v0 ^ 107789469189082L;
        var6_4 = v0 ^ 125225839740394L;
        var8_5 = v0 ^ 68816730795957L;
        v1 = v0 ^ 10524670200711L;
        var10_6 = (int)(v1 >>> 48);
        var11_7 = (int)(v1 << 16 >>> 48);
        var12_8 = (int)(v1 << 32 >>> 32);
        var13_9 = v0 ^ 76665406108352L;
        var15_10 = v0 ^ 12701682477437L;
        var17_11 = v0 ^ 121586696683270L;
        var19_12 = v0 ^ 11144897403160L;
        var22_13 = new pf((short)var10_6, 5, (short)var11_7, var12_8);
        var21_14 = m44.a("h", (long)-3030064828112892943L, (long)var2_2);
        var23_15 = true;
        v2 = new Object[2];
        v2[1] = var22_13;
        v2[0] = var15_10;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)-3778088414873409025L, (long)var2_2), (Object)v2, (long)-3471376145810210531L, (long)var2_2);
        try {
            v3 = new Object[2];
            v3[1] = var8_5;
            v3[0] = (int)lqz.a("r", (int)10612, (long)(8215070514749827981L ^ var2_2));
            var24_16 = m44.a("i", (Object)this, (Object)v3, (long)-3864788498153005242L, (long)var2_2);
            m44.a("t", (Object)this, (int)lqz.a("r", (int)10612, (long)(8215070514749827981L ^ var2_2)), (long)-4019021926314128160L, (long)var2_2);
            v4 = new Object[1];
            v4[0] = var17_11;
            m44.a("w", (Object)this, (Object)v4, (long)-3508753241337160163L, (long)var2_2);
            v5 = new Object[3];
            v5[2] = true;
            v5[1] = var22_13;
            v5[0] = var19_12;
            m44.a("w", (Object)m44.a("v", (Object)this, (long)-3778088414873409025L, (long)var2_2), (Object)v5, (long)-2932781659390276920L, (long)var2_2);
            var23_15 = false;
            v6 = new Object[2];
            v6[1] = (int)m44.a("v", (Object)var24_16, (long)-2928104904569003791L, (long)var2_2);
            v6[0] = var6_4;
            m44.a("w", (Object)var22_13, (Object)v6, (long)-3420926503238529636L, (long)var2_2);
            ** if (var21_14 != null) goto lbl-1000
        }
        catch (Throwable var25_17) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block26: {
                                    block27: {
                                        if (var2_2 < 0L) break block26;
                                        v9 = var23_15;
                                        if (var21_14 != null) break block27;
                                        try {
                                            block32: {
                                                if (!v9) ** GOTO lbl88
                                                break block32;
                                                catch (Throwable v10) {
                                                    throw m44.a("h", (Object)v10, (long)-2979753190081586967L, (long)var2_2);
                                                }
                                            }
                                            v11 = new Object[2];
                                            v11[1] = var13_9;
                                            v11[0] = var22_13;
                                            m44.a("w", (Object)m44.a("v", (Object)this, (long)-3778088414873409025L, (long)var2_2), (Object)v11, (long)-3584955592640204729L, (long)var2_2);
                                            v9 = false;
                                        }
                                        catch (Throwable v12) {
                                            throw m44.a("h", (Object)v12, (long)-2979753190081586967L, (long)var2_2);
                                        }
                                    }
                                    var23_15 = v9;
                                }
                                try {
                                    if (var2_2 <= 0L || var21_14 == null) break block28;
lbl88:
                                    // 2 sources

                                    v13 = new Object[1];
                                    v13[0] = var4_3;
                                    m44.a("w", (Object)m44.a("v", (Object)this, (long)-3778088414873409025L, (long)var2_2), (Object)v13, (long)-3567505804837254279L, (long)var2_2);
                                }
                                catch (Throwable v14) {
                                    throw m44.a("h", (Object)v14, (long)-2979753190081586967L, (long)var2_2);
                                }
                            }
                            v15 = var25_17 instanceof RuntimeException;
                            if (var2_2 <= 0L || var21_14 != null) break block29;
                            try {
                                block33: {
                                    if (!v15) break block30;
                                    break block33;
                                    catch (Throwable v16) {
                                        throw m44.a("h", (Object)v16, (long)-2979753190081586967L, (long)var2_2);
                                    }
                                }
                                throw (RuntimeException)var25_17;
                            }
                            catch (Throwable v17) {
                                throw m44.a("h", (Object)v17, (long)-2979753190081586967L, (long)var2_2);
                            }
                        }
                        try {
                            v18 = var25_17;
                            if (var21_14 != null) break block31;
                            v15 = v18 instanceof t;
                        }
                        catch (Throwable v19) {
                            throw m44.a("h", (Object)v19, (long)-2979753190081586967L, (long)var2_2);
                        }
                    }
                    try {
                        if (v15) {
                            throw (t)var25_17;
                        }
                    }
                    catch (Throwable v20) {
                        throw m44.a("h", (Object)v20, (long)-2979753190081586967L, (long)var2_2);
                    }
                    v18 = var25_17;
                }
                throw (Error)v18;
            }
            catch (Throwable var26_18) {
                try {
                    if (var2_2 > 0L && var23_15) {
                        v21 = new Object[3];
                        v21[2] = true;
                        v21[1] = var22_13;
                        v21[0] = var19_12;
                        m44.a("w", (Object)m44.a("v", (Object)this, (long)-3778088414873409025L, (long)var2_2), (Object)v21, (long)-2932781659390276920L, (long)var2_2);
                    }
                }
                catch (Throwable v22) {
                    throw m44.a("h", (Object)v22, (long)-2979753190081586967L, (long)var2_2);
                }
                throw var26_18;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var23_15) ** GOTO lbl140
                v7 = new Object[3];
                v7[2] = true;
                v7[1] = var22_13;
                v7[0] = var19_12;
                m44.a("w", (Object)m44.a("v", (Object)this, (long)-3778088414873409025L, (long)var2_2), (Object)v7, (long)-2932781659390276920L, (long)var2_2);
            }
            catch (Throwable v8) {
                throw m44.a("h", (Object)v8, (long)-2979753190081586967L, (long)var2_2);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl140:
        // 3 sources

    }

    /*
     * Exception decompiling
     */
    public final void z(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [20[CASE]], but top level block is 4[TRYBLOCK]
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
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void Kj(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x78D4B2D6F71CL;
        long l13 = l11 ^ 0x37A67FAC1D43L;
        long l14 = l11 ^ 0x2BD8C229B8BL;
        long l15 = l11 ^ 0x31204C1ABEEL;
        long l16 = l11 ^ 0x6AF0631047DL;
        vr vr2 = new vr(l16, (int)lqz.a("r", (int)23174, (long)(0x2DDF9D9AF5B12A76L ^ l10)));
        boolean bl2 = true;
        CallSite callSite = m44.a("n", (long)-1800026810557515513L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = vr2;
        objectArray2[0] = l14;
        m44.a("q", (Object)m44.a("p", (Object)this, (long)-475268667209901303L, (long)l10), (Object)objectArray2, (long)-205695564798430229L, (long)l10);
        CallSite callSite2 = callSite;
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l13;
            objectArray3[0] = (int)lqz.a("r", (int)9645, (long)(0x3CAD069102E355E0L ^ l10));
            CallSite callSite3 = m44.a("o", (Object)this, (Object)objectArray3, (long)-528176357491593808L, (long)l10);
            m44.a("r", (Object)this, (int)lqz.a("r", (int)9645, (long)(0x3CAD069102E355E0L ^ l10)), (long)-373911010208285162L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = vr2;
            objectArray4[0] = l15;
            m44.a("q", (Object)m44.a("p", (Object)this, (long)-475268667209901303L, (long)l10), (Object)objectArray4, (long)-1893020724174243778L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("p", (Object)callSite3, (long)-1897351166250790393L, (long)l10);
            objectArray5[0] = l12;
            m44.a("q", (Object)vr2, (Object)objectArray5, (long)-2130092361184133270L, (long)l10);
            if (callSite2 != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 <= 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = vr2;
                objectArray6[0] = l15;
                m44.a("q", (Object)m44.a("p", (Object)this, (long)-475268667209901303L, (long)l10), (Object)objectArray6, (long)-1893020724174243778L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("n", (Object)runtimeException, (long)-1994035315437819361L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = vr2;
            objectArray7[0] = l15;
            m44.a("q", (Object)m44.a("p", (Object)this, (long)-475268667209901303L, (long)l10), (Object)objectArray7, (long)-1893020724174243778L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("n", (Object)runtimeException, (long)-1994035315437819361L, (long)l10);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void I(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = lqz.a ^ var2_2;
        var4_3 = v0 ^ 139505440775529L;
        var6_4 = v0 ^ 40889928024749L;
        var8_5 = v0 ^ 119906838879065L;
        var10_6 = v0 ^ 37929694228742L;
        var12_7 = v0 ^ 98215625256051L;
        v1 = v0 ^ 84782316818325L;
        var14_8 = (int)(v1 >>> 48);
        var15_9 = v1 << 16 >>> 16;
        var17_10 = v0 ^ 25721527203790L;
        var19_11 = v0 ^ 25062386091947L;
        var22_12 = new qx((int)lqz.a("r", (int)21395, (long)(7831700620221828871L ^ var2_2)), (char)var14_8, var15_9);
        var21_13 = m44.a("k", (long)-8412705419397081790L, (long)var2_2);
        var23_14 = true;
        v2 = new Object[2];
        v2[1] = var22_12;
        v2[0] = var17_10;
        m44.a("t", (Object)m44.a("u", (Object)this, (long)-7700429191202998452L, (long)var2_2), (Object)v2, (long)-7971321724747669586L, (long)var2_2);
        try {
            v3 = new Object[2];
            v3[1] = var10_6;
            v3[0] = (int)lqz.a("r", (int)20832, (long)(1976936368248245645L ^ var2_2));
            var24_15 = m44.a("j", (Object)this, (Object)v3, (long)-7715053464813092363L, (long)var2_2);
            m44.a("w", (Object)this, (int)lqz.a("r", (int)20832, (long)(1976936368248245645L ^ var2_2)), (long)-7599107267934154157L, (long)var2_2);
            v4 = new Object[1];
            v4[0] = var6_4;
            m44.a("t", (Object)this, (Object)v4, (long)-8021149801927912409L, (long)var2_2);
            v5 = new Object[3];
            v5[2] = true;
            v5[1] = var22_12;
            v5[0] = var19_11;
            m44.a("t", (Object)m44.a("u", (Object)this, (long)-7700429191202998452L, (long)var2_2), (Object)v5, (long)-8502876948807330693L, (long)var2_2);
            var23_14 = false;
            v6 = new Object[2];
            v6[1] = (int)m44.a("u", (Object)var24_15, (long)-8507769239255531966L, (long)var2_2);
            v6[0] = var8_5;
            m44.a("t", (Object)var22_12, (Object)v6, (long)-8199522675508915409L, (long)var2_2);
            ** if (var21_13 != null) goto lbl-1000
        }
        catch (Throwable var25_16) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block26: {
                                    block27: {
                                        if (var2_2 <= 0L) break block26;
                                        v9 = var23_14;
                                        if (var21_13 != null) break block27;
                                        try {
                                            block32: {
                                                if (!v9) ** GOTO lbl87
                                                break block32;
                                                catch (Throwable v10) {
                                                    throw m44.a("k", (Object)v10, (long)-8640482803929987494L, (long)var2_2);
                                                }
                                            }
                                            v11 = new Object[2];
                                            v11[1] = var12_7;
                                            v11[0] = var22_12;
                                            m44.a("t", (Object)m44.a("u", (Object)this, (long)-7700429191202998452L, (long)var2_2), (Object)v11, (long)-8030849385709883660L, (long)var2_2);
                                            v9 = false;
                                        }
                                        catch (Throwable v12) {
                                            throw m44.a("k", (Object)v12, (long)-8640482803929987494L, (long)var2_2);
                                        }
                                    }
                                    var23_14 = v9;
                                }
                                try {
                                    if (var2_2 <= 0L || var21_13 == null) break block28;
lbl87:
                                    // 2 sources

                                    v13 = new Object[1];
                                    v13[0] = var4_3;
                                    m44.a("t", (Object)m44.a("u", (Object)this, (long)-7700429191202998452L, (long)var2_2), (Object)v13, (long)-8012272388400982582L, (long)var2_2);
                                }
                                catch (Throwable v14) {
                                    throw m44.a("k", (Object)v14, (long)-8640482803929987494L, (long)var2_2);
                                }
                            }
                            v15 = var25_16 instanceof RuntimeException;
                            if (var2_2 <= 0L || var21_13 != null) break block29;
                            try {
                                block33: {
                                    if (!v15) break block30;
                                    break block33;
                                    catch (Throwable v16) {
                                        throw m44.a("k", (Object)v16, (long)-8640482803929987494L, (long)var2_2);
                                    }
                                }
                                throw (RuntimeException)var25_16;
                            }
                            catch (Throwable v17) {
                                throw m44.a("k", (Object)v17, (long)-8640482803929987494L, (long)var2_2);
                            }
                        }
                        try {
                            v18 = var25_16;
                            if (var21_13 != null) break block31;
                            v15 = v18 instanceof t;
                        }
                        catch (Throwable v19) {
                            throw m44.a("k", (Object)v19, (long)-8640482803929987494L, (long)var2_2);
                        }
                    }
                    try {
                        if (v15) {
                            throw (t)var25_16;
                        }
                    }
                    catch (Throwable v20) {
                        throw m44.a("k", (Object)v20, (long)-8640482803929987494L, (long)var2_2);
                    }
                    v18 = var25_16;
                }
                throw (Error)v18;
            }
            catch (Throwable var26_17) {
                try {
                    if (var2_2 >= 0L && var23_14) {
                        v21 = new Object[3];
                        v21[2] = true;
                        v21[1] = var22_12;
                        v21[0] = var19_11;
                        m44.a("t", (Object)m44.a("u", (Object)this, (long)-7700429191202998452L, (long)var2_2), (Object)v21, (long)-8502876948807330693L, (long)var2_2);
                    }
                }
                catch (Throwable v22) {
                    throw m44.a("k", (Object)v22, (long)-8640482803929987494L, (long)var2_2);
                }
                throw var26_17;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var23_14) ** GOTO lbl139
                v7 = new Object[3];
                v7[2] = true;
                v7[1] = var22_12;
                v7[0] = var19_11;
                m44.a("t", (Object)m44.a("u", (Object)this, (long)-7700429191202998452L, (long)var2_2), (Object)v7, (long)-8502876948807330693L, (long)var2_2);
            }
            catch (Throwable v8) {
                throw m44.a("k", (Object)v8, (long)-8640482803929987494L, (long)var2_2);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl139:
        // 3 sources

    }

    private boolean u(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x3027BC3A3160L;
                CallSite callSite = m44.a("h", (long)-2908386516014397023L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)lqz.a("r", (int)2623, (long)(0x274E2153416DCA55L ^ l10));
                        object = m44.a("i", (Object)this, (Object)objectArray2, (long)-2937702803155930173L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("h", (Object)runtimeException, (long)-3101410545709245767L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("h", (Object)runtimeException, (long)-3101410545709245767L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Exception decompiling
     */
    public final void W(Object[] var1_1) {
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
     * Exception decompiling
     */
    public final void Kt(Object[] var1_1) {
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
     * Exception decompiling
     */
    public final void v(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [12[CASE]], but top level block is 1[TRYBLOCK]
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
    public final void K(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = lqz.a ^ var2_2;
        var4_3 = v0 ^ 58633588367759L;
        var6_4 = v0 ^ 42603567425471L;
        var8_5 = v0 ^ 116332007411168L;
        var10_6 = v0 ^ 48217148215090L;
        var12_7 = v0 ^ 117772885330545L;
        var14_8 = v0 ^ 20757803258005L;
        var16_9 = v0 ^ 102075609697064L;
        var18_10 = v0 ^ 102777973373773L;
        var21_11 = new qw(var12_7, (int)lqz.a("r", (int)26108, (long)(6315073516089361906L ^ var2_2)));
        var22_12 = true;
        var20_13 = m44.a("m", (long)-5213379133389903452L, (long)var2_2);
        v1 = new Object[2];
        v1[1] = var21_11;
        v1[0] = var16_9;
        m44.a("r", (Object)m44.a("s", (Object)this, (long)-6213595563321799766L, (long)var2_2), (Object)v1, (long)-5942949878466960568L, (long)var2_2);
        try {
            v2 = new Object[2];
            v2[1] = var8_5;
            v2[0] = (int)lqz.a("r", (int)1196, (long)(6935163596552479895L ^ var2_2));
            var23_14 = m44.a("l", (Object)this, (Object)v2, (long)-6338583321603048173L, (long)var2_2);
            m44.a("q", (Object)this, (int)lqz.a("r", (int)25214, (long)(7177205980630467269L ^ var2_2)), (long)-6166334432732303691L, (long)var2_2);
            v3 = new Object[1];
            v3[0] = var10_6;
            m44.a("r", (Object)this, (Object)v3, (long)-5799598404846063818L, (long)var2_2);
            v4 = new Object[3];
            v4[2] = true;
            v4[1] = var21_11;
            v4[0] = var18_10;
            m44.a("r", (Object)m44.a("s", (Object)this, (long)-6213595563321799766L, (long)var2_2), (Object)v4, (long)-5397003653469804387L, (long)var2_2);
            var22_12 = false;
            v5 = new Object[2];
            v5[1] = (int)m44.a("s", (Object)var23_14, (long)-5402033387367791964L, (long)var2_2);
            v5[0] = var6_4;
            m44.a("r", (Object)var21_11, (Object)v5, (long)-5561037191388401719L, (long)var2_2);
            ** if (var20_13 != null) goto lbl-1000
        }
        catch (Throwable var24_15) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block26: {
                                    block27: {
                                        if (var2_2 <= 0L) break block26;
                                        v8 = var22_12;
                                        if (var20_13 != null) break block27;
                                        try {
                                            block32: {
                                                if (!v8) ** GOTO lbl84
                                                break block32;
                                                catch (Throwable v9) {
                                                    throw m44.a("m", (Object)v9, (long)-5408650418250515780L, (long)var2_2);
                                                }
                                            }
                                            v10 = new Object[2];
                                            v10[1] = var14_8;
                                            v10[0] = var21_11;
                                            m44.a("r", (Object)m44.a("s", (Object)this, (long)-6213595563321799766L, (long)var2_2), (Object)v10, (long)-6022725871023943150L, (long)var2_2);
                                            v8 = false;
                                        }
                                        catch (Throwable v11) {
                                            throw m44.a("m", (Object)v11, (long)-5408650418250515780L, (long)var2_2);
                                        }
                                    }
                                    var22_12 = v8;
                                }
                                try {
                                    if (var2_2 < 0L || var20_13 == null) break block28;
lbl84:
                                    // 2 sources

                                    v12 = new Object[1];
                                    v12[0] = var4_3;
                                    m44.a("r", (Object)m44.a("s", (Object)this, (long)-6213595563321799766L, (long)var2_2), (Object)v12, (long)-6041302904517072596L, (long)var2_2);
                                }
                                catch (Throwable v13) {
                                    throw m44.a("m", (Object)v13, (long)-5408650418250515780L, (long)var2_2);
                                }
                            }
                            v14 = var24_15 instanceof RuntimeException;
                            if (var2_2 <= 0L || var20_13 != null) break block29;
                            try {
                                block33: {
                                    if (!v14) break block30;
                                    break block33;
                                    catch (Throwable v15) {
                                        throw m44.a("m", (Object)v15, (long)-5408650418250515780L, (long)var2_2);
                                    }
                                }
                                throw (RuntimeException)var24_15;
                            }
                            catch (Throwable v16) {
                                throw m44.a("m", (Object)v16, (long)-5408650418250515780L, (long)var2_2);
                            }
                        }
                        try {
                            v17 = var24_15;
                            if (var20_13 != null) break block31;
                            v14 = v17 instanceof t;
                        }
                        catch (Throwable v18) {
                            throw m44.a("m", (Object)v18, (long)-5408650418250515780L, (long)var2_2);
                        }
                    }
                    try {
                        if (v14) {
                            throw (t)var24_15;
                        }
                    }
                    catch (Throwable v19) {
                        throw m44.a("m", (Object)v19, (long)-5408650418250515780L, (long)var2_2);
                    }
                    v17 = var24_15;
                }
                throw (Error)v17;
            }
            catch (Throwable var25_16) {
                try {
                    if (var2_2 >= 0L && var22_12) {
                        v20 = new Object[3];
                        v20[2] = true;
                        v20[1] = var21_11;
                        v20[0] = var18_10;
                        m44.a("r", (Object)m44.a("s", (Object)this, (long)-6213595563321799766L, (long)var2_2), (Object)v20, (long)-5397003653469804387L, (long)var2_2);
                    }
                }
                catch (Throwable v21) {
                    throw m44.a("m", (Object)v21, (long)-5408650418250515780L, (long)var2_2);
                }
                throw var25_16;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var22_12) ** GOTO lbl136
                v6 = new Object[3];
                v6[2] = true;
                v6[1] = var21_11;
                v6[0] = var18_10;
                m44.a("r", (Object)m44.a("s", (Object)this, (long)-6213595563321799766L, (long)var2_2), (Object)v6, (long)-5397003653469804387L, (long)var2_2);
            }
            catch (Throwable v7) {
                throw m44.a("m", (Object)v7, (long)-5408650418250515780L, (long)var2_2);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl136:
        // 3 sources

    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean O(Object[] var1_1) {
        block17: {
            block18: {
                block15: {
                    block16: {
                        block13: {
                            block14: {
                                var2_2 = (Long)var1_1[0];
                                v0 = var2_2 = lqz.a ^ var2_2;
                                var4_3 = v0 ^ 86557046503216L;
                                var6_4 = v0 ^ 119190570786266L;
                                var8_5 = v0 ^ 7388255363511L;
                                var10_6 = m44.a("o", (long)-4074522632291018378L, (long)var2_2);
                                try {
                                    try {
                                        v1 = new Object[1];
                                        v1[0] = var4_3;
                                        v2 /* !! */  = m44.a("n", (Object)this, (Object)v1, (long)-2662309491378976381L, (long)var2_2);
                                        if (var10_6 != null) break block13;
                                        if (v2 /* !! */  == false) break block14;
                                    }
                                    catch (RuntimeException v3) {
                                        throw m44.a("o", (Object)v3, (long)-4313703979659457938L, (long)var2_2);
                                    }
                                    return true;
                                }
                                catch (RuntimeException v4) {
                                    throw m44.a("o", (Object)v4, (long)-4313703979659457938L, (long)var2_2);
                                }
                            }
                            v5 = new Object[1];
                            v5[0] = var6_4;
                            v2 /* !! */  = m44.a("n", (Object)this, (Object)v5, (long)-2309660223184382034L, (long)var2_2);
                        }
                        try {
                            try {
                                v6 = var10_6;
                                if (var2_2 >= 0L) {
                                    if (v6 != null) break block15;
                                    if (v2 /* !! */  == false) break block16;
                                }
                                ** GOTO lbl52
                            }
                            catch (RuntimeException v7) {
                                throw m44.a("o", (Object)v7, (long)-4313703979659457938L, (long)var2_2);
                            }
                            return true;
                        }
                        catch (RuntimeException v8) {
                            throw m44.a("o", (Object)v8, (long)-4313703979659457938L, (long)var2_2);
                        }
                    }
                    v9 = new Object[2];
                    v9[1] = var8_5;
                    v9[0] = (int)lqz.a("r", (int)12353, (long)(7588854426833969296L ^ var2_2));
                    v2 /* !! */  = m44.a("n", (Object)this, (Object)v9, (long)-4040828089879190764L, (long)var2_2);
                }
                try {
                    try {
                        v6 = var10_6;
lbl52:
                        // 2 sources

                        if (v6 != null) break block17;
                        if (v2 /* !! */  == false) break block18;
                    }
                    catch (RuntimeException v10) {
                        throw m44.a("o", (Object)v10, (long)-4313703979659457938L, (long)var2_2);
                    }
                    return true;
                }
                catch (RuntimeException v11) {
                    throw m44.a("o", (Object)v11, (long)-4313703979659457938L, (long)var2_2);
                }
            }
            v2 /* !! */  = (CallSite)false;
        }
        return (boolean)v2 /* !! */ ;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x488374B0CFC2L;
        long l13 = l11 ^ 0x5CEA9E2F6B30L;
        long l14 = l11 ^ 0x69F16DA1EDF8L;
        long l15 = l11 ^ 0x685EE542DD9DL;
        long l16 = l11 ^ 0x64B75FD79B85L;
        zq zq2 = new zq((int)lqz.a("r", (int)26122, (long)(0x5AB515F594E8E0B4L ^ l10)), l12);
        boolean bl2 = true;
        CallSite callSite = m44.a("m", (long)-7965057480905896076L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = zq2;
        objectArray2[0] = l14;
        m44.a("r", (Object)m44.a("s", (Object)this, (long)-8136620350242296454L, (long)l10), (Object)objectArray2, (long)-8406439614871272040L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l13;
            objectArray3[0] = (int)lqz.a("r", (int)30336, (long)(0x76AF12C6617D700DL ^ l10));
            CallSite callSite2 = m44.a("l", (Object)this, (Object)objectArray3, (long)-8153519553348412477L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = zq2;
            objectArray4[0] = l15;
            m44.a("r", (Object)m44.a("s", (Object)this, (long)-8136620350242296454L, (long)l10), (Object)objectArray4, (long)-7797480403762721203L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = l16;
            objectArray5[0] = m44.a("s", (Object)callSite2, (long)-8457064665228112997L, (long)l10);
            m44.a("r", (Object)zq2, (Object)objectArray5, (long)-8077181204477118247L, (long)l10);
            if (callSite != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 <= 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = zq2;
                objectArray6[0] = l15;
                m44.a("r", (Object)m44.a("s", (Object)this, (long)-8136620350242296454L, (long)l10), (Object)objectArray6, (long)-7797480403762721203L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("m", (Object)runtimeException, (long)-7917143156779525012L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = zq2;
            objectArray7[0] = l15;
            m44.a("r", (Object)m44.a("s", (Object)this, (long)-8136620350242296454L, (long)l10), (Object)objectArray7, (long)-7797480403762721203L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("m", (Object)runtimeException, (long)-7917143156779525012L, (long)l10);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void E(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = lqz.a ^ var2_2;
        var4_3 = v0 ^ 53830583244858L;
        var6_4 = v0 ^ 38593242242570L;
        var8_5 = v0 ^ 119208914744405L;
        v1 = v0 ^ 13641229109468L;
        var10_6 = (int)(v1 >>> 48);
        var11_7 = (int)(v1 << 16 >>> 48);
        var12_8 = (int)(v1 << 32 >>> 32);
        var13_9 = v0 ^ 51113181312647L;
        var15_10 = v0 ^ 25597325830432L;
        var17_11 = v0 ^ 98339962679965L;
        var19_12 = v0 ^ 97714908545784L;
        var22_13 = new pt((short)var10_6, (short)var11_7, (int)lqz.a("r", (int)10519, (long)(1750545384068853809L ^ var2_2)), var12_8);
        var23_14 = true;
        v2 = m44.a("h", (long)-8209113336246022127L, (long)var2_2);
        v3 = new Object[2];
        v3[1] = var22_13;
        v3[0] = var17_11;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)-8038403722675686881L, (long)var2_2), (Object)v3, (long)-7767755856170935555L, (long)var2_2);
        var21_15 = v2;
        try {
            v4 = new Object[2];
            v4[1] = var8_5;
            v4[0] = (int)lqz.a("r", (int)15516, (long)(3396931999401813401L ^ var2_2));
            var24_16 = m44.a("i", (Object)this, (Object)v4, (long)-7944963632115465050L, (long)var2_2);
            m44.a("t", (Object)this, (int)lqz.a("r", (int)16215, (long)(1237668352975840984L ^ var2_2)), (long)-7792984203934230784L, (long)var2_2);
            v5 = new Object[1];
            v5[0] = var13_9;
            m44.a("w", (Object)this, (Object)v5, (long)-7622718004248947069L, (long)var2_2);
            v6 = new Object[3];
            v6[2] = true;
            v6[1] = var22_13;
            v6[0] = var19_12;
            m44.a("w", (Object)m44.a("v", (Object)this, (long)-8038403722675686881L, (long)var2_2), (Object)v6, (long)-8309994106884697816L, (long)var2_2);
            var23_14 = false;
            v7 = new Object[2];
            v7[1] = (int)m44.a("v", (Object)var24_16, (long)-8305452555209884911L, (long)var2_2);
            v7[0] = var6_4;
            m44.a("w", (Object)var22_13, (Object)v7, (long)-8401958212161448324L, (long)var2_2);
            ** if (var21_15 != null) goto lbl-1000
        }
        catch (Throwable var25_17) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block26: {
                                    block27: {
                                        if (var2_2 <= 0L) break block26;
                                        v10 = var23_14;
                                        if (var21_15 != null) break block27;
                                        try {
                                            block32: {
                                                if (!v10) ** GOTO lbl89
                                                break block32;
                                                catch (Throwable v11) {
                                                    throw m44.a("h", (Object)v11, (long)-8267033594676460791L, (long)var2_2);
                                                }
                                            }
                                            v12 = new Object[2];
                                            v12[1] = var15_10;
                                            v12[0] = var22_13;
                                            m44.a("w", (Object)m44.a("v", (Object)this, (long)-8038403722675686881L, (long)var2_2), (Object)v12, (long)-7647113145505403993L, (long)var2_2);
                                            v10 = false;
                                        }
                                        catch (Throwable v13) {
                                            throw m44.a("h", (Object)v13, (long)-8267033594676460791L, (long)var2_2);
                                        }
                                    }
                                    var23_14 = v10;
                                }
                                try {
                                    if (var2_2 < 0L || var21_15 == null) break block28;
lbl89:
                                    // 2 sources

                                    v14 = new Object[1];
                                    v14[0] = var4_3;
                                    m44.a("w", (Object)m44.a("v", (Object)this, (long)-8038403722675686881L, (long)var2_2), (Object)v14, (long)-7665691015197011815L, (long)var2_2);
                                }
                                catch (Throwable v15) {
                                    throw m44.a("h", (Object)v15, (long)-8267033594676460791L, (long)var2_2);
                                }
                            }
                            v16 = var25_17 instanceof RuntimeException;
                            if (var2_2 < 0L || var21_15 != null) break block29;
                            try {
                                block33: {
                                    if (!v16) break block30;
                                    break block33;
                                    catch (Throwable v17) {
                                        throw m44.a("h", (Object)v17, (long)-8267033594676460791L, (long)var2_2);
                                    }
                                }
                                throw (RuntimeException)var25_17;
                            }
                            catch (Throwable v18) {
                                throw m44.a("h", (Object)v18, (long)-8267033594676460791L, (long)var2_2);
                            }
                        }
                        try {
                            v19 = var25_17;
                            if (var21_15 != null) break block31;
                            v16 = v19 instanceof t;
                        }
                        catch (Throwable v20) {
                            throw m44.a("h", (Object)v20, (long)-8267033594676460791L, (long)var2_2);
                        }
                    }
                    try {
                        if (v16) {
                            throw (t)var25_17;
                        }
                    }
                    catch (Throwable v21) {
                        throw m44.a("h", (Object)v21, (long)-8267033594676460791L, (long)var2_2);
                    }
                    v19 = var25_17;
                }
                throw (Error)v19;
            }
            catch (Throwable var26_18) {
                try {
                    if (var2_2 > 0L && var23_14) {
                        v22 = new Object[3];
                        v22[2] = true;
                        v22[1] = var22_13;
                        v22[0] = var19_12;
                        m44.a("w", (Object)m44.a("v", (Object)this, (long)-8038403722675686881L, (long)var2_2), (Object)v22, (long)-8309994106884697816L, (long)var2_2);
                    }
                }
                catch (Throwable v23) {
                    throw m44.a("h", (Object)v23, (long)-8267033594676460791L, (long)var2_2);
                }
                throw var26_18;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var23_14) ** GOTO lbl141
                v8 = new Object[3];
                v8[2] = true;
                v8[1] = var22_13;
                v8[0] = var19_12;
                m44.a("w", (Object)m44.a("v", (Object)this, (long)-8038403722675686881L, (long)var2_2), (Object)v8, (long)-8309994106884697816L, (long)var2_2);
            }
            catch (Throwable v9) {
                throw m44.a("h", (Object)v9, (long)-8267033594676460791L, (long)var2_2);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl141:
        // 3 sources

    }

    /*
     * Unable to fully structure code
     */
    public final void Kz(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = lqz.a ^ var2_2;
        var4_3 = v0 ^ 104778200387663L;
        var6_4 = v0 ^ 5063144984459L;
        var8_5 = v0 ^ 24357795510146L;
        var10_6 = v0 ^ 84281416111743L;
        var12_7 = v0 ^ 4215621860384L;
        var14_8 = v0 ^ 133011582722389L;
        var16_9 = v0 ^ 60260356864744L;
        var18_10 = v0 ^ 60894009166477L;
        var21_11 = new pr(var8_5, (int)lqz.a("r", (int)3504, (long)(3203631498891844834L ^ var2_2)));
        var22_12 = true;
        v1 = m44.a("m", (long)5072796270943443044L, (long)var2_2);
        v2 = new Object[2];
        v2[1] = var21_11;
        v2[0] = var16_9;
        m44.a("r", (Object)m44.a("s", (Object)this, (long)6342394121929112170L, (long)var2_2), (Object)v2, (long)6649015689813709448L, (long)var2_2);
        var20_13 = v1;
        try {
            v3 = new Object[2];
            v3[1] = var12_7;
            v3[0] = (int)lqz.a("r", (int)15973, (long)(4040004753842335504L ^ var2_2));
            var23_14 = m44.a("l", (Object)this, (Object)v3, (long)6469629863228378323L, (long)var2_2);
            m44.a("q", (Object)this, (int)lqz.a("r", (int)8326, (long)(9011467007363346615L ^ var2_2)), (long)6605845626823761781L, (long)var2_2);
            v4 = new Object[1];
            v4[0] = var6_4;
            m44.a("r", (Object)this, (Object)v4, (long)6739926471108958465L, (long)var2_2);
            v5 = new Object[3];
            v5[2] = true;
            v5[1] = var21_11;
            v5[0] = var18_10;
            m44.a("r", (Object)m44.a("s", (Object)this, (long)6342394121929112170L, (long)var2_2), (Object)v5, (long)4961163442891037021L, (long)var2_2);
            var22_12 = false;
            v6 = new Object[2];
            v6[1] = (int)m44.a("s", (Object)var23_14, (long)4956340416115536740L, (long)var2_2);
            v6[0] = var10_6;
            m44.a("r", (Object)var21_11, (Object)v6, (long)4833295041475649033L, (long)var2_2);
            ** if (var20_13 != null) goto lbl-1000
        }
        catch (Throwable var24_15) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block26: {
                                    block27: {
                                        if (var2_2 <= 0L) break block26;
                                        v9 = var22_12;
                                        if (var20_13 != null) break block27;
                                        try {
                                            block32: {
                                                if (!v9) ** GOTO lbl85
                                                break block32;
                                                catch (Throwable v10) {
                                                    throw m44.a("m", (Object)v10, (long)4985756375204629372L, (long)var2_2);
                                                }
                                            }
                                            v11 = new Object[2];
                                            v11[1] = var14_8;
                                            v11[0] = var21_11;
                                            m44.a("r", (Object)m44.a("s", (Object)this, (long)6342394121929112170L, (long)var2_2), (Object)v11, (long)6749366020371047378L, (long)var2_2);
                                            v9 = false;
                                        }
                                        catch (Throwable v12) {
                                            throw m44.a("m", (Object)v12, (long)4985756375204629372L, (long)var2_2);
                                        }
                                    }
                                    var22_12 = v9;
                                }
                                try {
                                    if (var2_2 < 0L || var20_13 == null) break block28;
lbl85:
                                    // 2 sources

                                    v13 = new Object[1];
                                    v13[0] = var4_3;
                                    m44.a("r", (Object)m44.a("s", (Object)this, (long)6342394121929112170L, (long)var2_2), (Object)v13, (long)6766817990020667628L, (long)var2_2);
                                }
                                catch (Throwable v14) {
                                    throw m44.a("m", (Object)v14, (long)4985756375204629372L, (long)var2_2);
                                }
                            }
                            v15 = var24_15 instanceof RuntimeException;
                            if (var2_2 < 0L || var20_13 != null) break block29;
                            try {
                                block33: {
                                    if (!v15) break block30;
                                    break block33;
                                    catch (Throwable v16) {
                                        throw m44.a("m", (Object)v16, (long)4985756375204629372L, (long)var2_2);
                                    }
                                }
                                throw (RuntimeException)var24_15;
                            }
                            catch (Throwable v17) {
                                throw m44.a("m", (Object)v17, (long)4985756375204629372L, (long)var2_2);
                            }
                        }
                        try {
                            v18 = var24_15;
                            if (var20_13 != null) break block31;
                            v15 = v18 instanceof t;
                        }
                        catch (Throwable v19) {
                            throw m44.a("m", (Object)v19, (long)4985756375204629372L, (long)var2_2);
                        }
                    }
                    try {
                        if (v15) {
                            throw (t)var24_15;
                        }
                    }
                    catch (Throwable v20) {
                        throw m44.a("m", (Object)v20, (long)4985756375204629372L, (long)var2_2);
                    }
                    v18 = var24_15;
                }
                throw (Error)v18;
            }
            catch (Throwable var25_16) {
                try {
                    if (var2_2 > 0L && var22_12) {
                        v21 = new Object[3];
                        v21[2] = true;
                        v21[1] = var21_11;
                        v21[0] = var18_10;
                        m44.a("r", (Object)m44.a("s", (Object)this, (long)6342394121929112170L, (long)var2_2), (Object)v21, (long)4961163442891037021L, (long)var2_2);
                    }
                }
                catch (Throwable v22) {
                    throw m44.a("m", (Object)v22, (long)4985756375204629372L, (long)var2_2);
                }
                throw var25_16;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var22_12) ** GOTO lbl137
                v7 = new Object[3];
                v7[2] = true;
                v7[1] = var21_11;
                v7[0] = var18_10;
                m44.a("r", (Object)m44.a("s", (Object)this, (long)6342394121929112170L, (long)var2_2), (Object)v7, (long)4961163442891037021L, (long)var2_2);
            }
            catch (Throwable v8) {
                throw m44.a("m", (Object)v8, (long)4985756375204629372L, (long)var2_2);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl137:
        // 3 sources

    }

    private boolean i(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x20B3C604AA34L;
                CallSite callSite = m44.a("l", (long)5545977654577173237L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)lqz.a("r", (int)14601, (long)(0x22DB6B5226DCE2E7L ^ l10));
                        object = m44.a("m", (Object)this, (Object)objectArray2, (long)5507689352551344279L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("l", (Object)runtimeException, (long)5738011565427720685L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("l", (Object)runtimeException, (long)5738011565427720685L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Exception decompiling
     */
    public final void t(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 3[TRYBLOCK]
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

    private boolean r(Object[] objectArray) {
        Object object;
        block22: {
            block23: {
                CallSite callSite;
                CallSite callSite2;
                long l10;
                long l11;
                block20: {
                    block21: {
                        l11 = (Long)objectArray[0];
                        l10 = (l11 = a ^ l11) ^ 0x26878CEE019DL;
                        callSite2 = m44.a("s", (Object)this, (long)-2099505752372429538L, (long)l11);
                        callSite = m44.a("m", (long)-1774906989127059108L, (long)l11);
                        try {
                            try {
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l10;
                                objectArray2[0] = (int)lqz.a("r", (int)15559, (long)(0x41B701C667734CD7L ^ l11));
                                object = m44.a("l", (Object)this, (Object)objectArray2, (long)-1745645694780406978L, (long)l11);
                                if (callSite != null) break block20;
                                if (object == false) break block21;
                            }
                            catch (RuntimeException runtimeException) {
                                throw m44.a("m", (Object)runtimeException, (long)-2015214416327497148L, (long)l11);
                            }
                            m44.a("q", (Object)this, (lbd)((Object)callSite2), (long)-2099505752372429538L, (long)l11);
                        }
                        catch (RuntimeException runtimeException) {
                            throw m44.a("m", (Object)runtimeException, (long)-2015214416327497148L, (long)l11);
                        }
                    }
                    callSite2 = m44.a("s", (Object)this, (long)-2099505752372429538L, (long)l11);
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l10;
                    objectArray3[0] = (int)lqz.a("r", (int)31493, (long)(0x5463D1A016240BF8L ^ l11));
                    object = m44.a("l", (Object)this, (Object)objectArray3, (long)-1745645694780406978L, (long)l11);
                }
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (callSite != null) break block22;
                                                if (object == false) break block23;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw m44.a("m", (Object)runtimeException, (long)-2015214416327497148L, (long)l11);
                                            }
                                            m44.a("q", (Object)this, (lbd)((Object)callSite2), (long)-2099505752372429538L, (long)l11);
                                            Object[] objectArray4 = new Object[2];
                                            objectArray4[1] = l10;
                                            objectArray4[0] = (int)lqz.a("r", (int)16712, (long)(0x7930DB8A6FB8B18DL ^ l11));
                                            object = m44.a("l", (Object)this, (Object)objectArray4, (long)-1745645694780406978L, (long)l11);
                                            if (callSite != null) break block22;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw m44.a("m", (Object)runtimeException, (long)-2015214416327497148L, (long)l11);
                                        }
                                        if (object == false) break block23;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw m44.a("m", (Object)runtimeException, (long)-2015214416327497148L, (long)l11);
                                    }
                                    m44.a("q", (Object)this, (lbd)((Object)callSite2), (long)-2099505752372429538L, (long)l11);
                                    Object[] objectArray5 = new Object[2];
                                    objectArray5[1] = l10;
                                    objectArray5[0] = (int)lqz.a("r", (int)19691, (long)(0x16096C199CB93C64L ^ l11));
                                    object = m44.a("l", (Object)this, (Object)objectArray5, (long)-1745645694780406978L, (long)l11);
                                    if (callSite != null) break block22;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw m44.a("m", (Object)runtimeException, (long)-2015214416327497148L, (long)l11);
                                }
                                if (object == false) break block23;
                            }
                            catch (RuntimeException runtimeException) {
                                throw m44.a("m", (Object)runtimeException, (long)-2015214416327497148L, (long)l11);
                            }
                            m44.a("q", (Object)this, (lbd)((Object)callSite2), (long)-2099505752372429538L, (long)l11);
                            Object[] objectArray6 = new Object[2];
                            objectArray6[1] = l10;
                            objectArray6[0] = (int)lqz.a("r", (int)21312, (long)(0x31F5BADD8BB323A9L ^ l11));
                            object = m44.a("l", (Object)this, (Object)objectArray6, (long)-1745645694780406978L, (long)l11);
                            if (callSite != null) break block22;
                        }
                        catch (RuntimeException runtimeException) {
                            throw m44.a("m", (Object)runtimeException, (long)-2015214416327497148L, (long)l11);
                        }
                        if (object == false) break block23;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("m", (Object)runtimeException, (long)-2015214416327497148L, (long)l11);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("m", (Object)runtimeException, (long)-2015214416327497148L, (long)l11);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     */
    public final void Q(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = lqz.a ^ var2_2;
        var4_3 = v0 ^ 83470292265554L;
        var6_4 = v0 ^ 25788674999869L;
        var8_5 = v0 ^ 54365623633181L;
        var10_6 = v0 ^ 119128674736968L;
        var12_7 = v0 ^ 37862676267253L;
        var14_8 = v0 ^ 39308073218192L;
        var16_9 = v0 ^ 55225011067363L;
        var19_10 = new qh(var8_5, (int)lqz.a("r", (int)29487, (long)(5239848636260784308L ^ var2_2)));
        var18_11 = m44.a("h", (long)-253567219786177927L, (long)var2_2);
        var20_12 = true;
        v1 = new Object[2];
        v1[1] = var19_10;
        v1[0] = var12_7;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)-2154513408519012233L, (long)var2_2), (Object)v1, (long)-1847856647613126507L, (long)var2_2);
        try {
            v2 = new Object[2];
            v2[1] = var6_4;
            v2[0] = (int)lqz.a("r", (int)8003, (long)(5705502405449512043L ^ var2_2));
            m44.a("i", (Object)this, (Object)v2, (long)-2029528364246092082L, (long)var2_2);
            v3 = new Object[1];
            v3[0] = var16_9;
            m44.a("w", (Object)this, (Object)v3, (long)-79293912369312011L, (long)var2_2);
            ** if (var18_11 != null) goto lbl-1000
        }
        catch (Throwable var21_13) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block26: {
                                    block27: {
                                        if (var2_2 <= 0L) break block26;
                                        v6 = var20_12;
                                        if (var18_11 != null) break block27;
                                        try {
                                            block32: {
                                                if (!v6) ** GOTO lbl70
                                                break block32;
                                                catch (Throwable v7) {
                                                    throw m44.a("h", (Object)v7, (long)-59140943436926623L, (long)var2_2);
                                                }
                                            }
                                            v8 = new Object[2];
                                            v8[1] = var10_6;
                                            v8[0] = var19_10;
                                            m44.a("w", (Object)m44.a("v", (Object)this, (long)-2154513408519012233L, (long)var2_2), (Object)v8, (long)-1749784781165798961L, (long)var2_2);
                                            v6 = false;
                                        }
                                        catch (Throwable v9) {
                                            throw m44.a("h", (Object)v9, (long)-59140943436926623L, (long)var2_2);
                                        }
                                    }
                                    var20_12 = v6;
                                }
                                try {
                                    if (var2_2 < 0L || var18_11 == null) break block28;
lbl70:
                                    // 2 sources

                                    v10 = new Object[1];
                                    v10[0] = var4_3;
                                    m44.a("w", (Object)m44.a("v", (Object)this, (long)-2154513408519012233L, (long)var2_2), (Object)v10, (long)-1732331430688382223L, (long)var2_2);
                                }
                                catch (Throwable v11) {
                                    throw m44.a("h", (Object)v11, (long)-59140943436926623L, (long)var2_2);
                                }
                            }
                            v12 = var21_13 instanceof RuntimeException;
                            if (var2_2 <= 0L || var18_11 != null) break block29;
                            try {
                                block33: {
                                    if (!v12) break block30;
                                    break block33;
                                    catch (Throwable v13) {
                                        throw m44.a("h", (Object)v13, (long)-59140943436926623L, (long)var2_2);
                                    }
                                }
                                throw (RuntimeException)var21_13;
                            }
                            catch (Throwable v14) {
                                throw m44.a("h", (Object)v14, (long)-59140943436926623L, (long)var2_2);
                            }
                        }
                        try {
                            v15 = var21_13;
                            if (var18_11 != null) break block31;
                            v12 = v15 instanceof t;
                        }
                        catch (Throwable v16) {
                            throw m44.a("h", (Object)v16, (long)-59140943436926623L, (long)var2_2);
                        }
                    }
                    try {
                        if (v12) {
                            throw (t)var21_13;
                        }
                    }
                    catch (Throwable v17) {
                        throw m44.a("h", (Object)v17, (long)-59140943436926623L, (long)var2_2);
                    }
                    v15 = var21_13;
                }
                throw (Error)v15;
            }
            catch (Throwable var22_14) {
                try {
                    if (var2_2 >= 0L && var20_12) {
                        v18 = new Object[3];
                        v18[2] = true;
                        v18[1] = var19_10;
                        v18[0] = var14_8;
                        m44.a("w", (Object)m44.a("v", (Object)this, (long)-2154513408519012233L, (long)var2_2), (Object)v18, (long)-88801522760539328L, (long)var2_2);
                    }
                }
                catch (Throwable v19) {
                    throw m44.a("h", (Object)v19, (long)-59140943436926623L, (long)var2_2);
                }
                throw var22_14;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var20_12) ** GOTO lbl122
                v4 = new Object[3];
                v4[2] = true;
                v4[1] = var19_10;
                v4[0] = var14_8;
                m44.a("w", (Object)m44.a("v", (Object)this, (long)-2154513408519012233L, (long)var2_2), (Object)v4, (long)-88801522760539328L, (long)var2_2);
            }
            catch (Throwable v5) {
                throw m44.a("h", (Object)v5, (long)-59140943436926623L, (long)var2_2);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl122:
        // 3 sources

    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void M(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x39BD182AE5BFL;
        long l13 = l11 ^ 0x18142D3D99BFL;
        long l14 = l11 ^ 0x5766E04773E0L;
        long l15 = l11 ^ 0x627D13C9F528L;
        long l16 = l11 ^ 0x63D29B2AC54DL;
        p9 p92 = new p9(l12, (int)lqz.a("r", (int)13545, (long)(0x1DC14B74D5A42A89L ^ l10)));
        boolean bl2 = true;
        CallSite callSite = m44.a("m", (long)-8528016799329855580L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = p92;
        objectArray2[0] = l15;
        m44.a("r", (Object)m44.a("s", (Object)this, (long)-7510630429641149014L, (long)l10), (Object)objectArray2, (long)-7816463097664922296L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l14;
            objectArray3[0] = (int)lqz.a("r", (int)18213, (long)(0x3A5AE6E63082D9CFL ^ l10));
            CallSite callSite2 = m44.a("l", (Object)this, (Object)objectArray3, (long)-7635595168864845037L, (long)l10);
            m44.a("q", (Object)this, (int)lqz.a("r", (int)30117, (long)(0x794F8AED1A226BDCL ^ l10)), (long)-7751546898535280459L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = p92;
            objectArray4[0] = l16;
            m44.a("r", (Object)m44.a("s", (Object)this, (long)-7510630429641149014L, (long)l10), (Object)objectArray4, (long)-8423486747436951907L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("s", (Object)callSite2, (long)-8428449413070209884L, (long)l10);
            objectArray5[0] = l13;
            m44.a("r", (Object)p92, (Object)objectArray5, (long)-8299284705628139063L, (long)l10);
            if (callSite != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 < 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = p92;
                objectArray6[0] = l16;
                m44.a("r", (Object)m44.a("s", (Object)this, (long)-7510630429641149014L, (long)l10), (Object)objectArray6, (long)-8423486747436951907L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("m", (Object)runtimeException, (long)-8435062114643229508L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = p92;
            objectArray7[0] = l16;
            m44.a("r", (Object)m44.a("s", (Object)this, (long)-7510630429641149014L, (long)l10), (Object)objectArray7, (long)-8423486747436951907L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("m", (Object)runtimeException, (long)-8435062114643229508L, (long)l10);
        }
    }

    private boolean g(Object[] objectArray) {
        Object object;
        block20: {
            block21: {
                long l10 = (Long)objectArray[0];
                long l11 = l10 = a ^ l10;
                long l12 = l11 ^ 0xC97783C3D6FL;
                long l13 = l11 ^ 0x318889F8370DL;
                long l14 = l11 ^ 0x73ADE68F73A5L;
                long l15 = l11 ^ 0x4F330F645852L;
                long l16 = l11 ^ 0x2FD9E0B9707FL;
                CallSite callSite = m44.a("s", (Object)this, (long)-3657679968762555650L, (long)l10);
                CallSite callSite2 = m44.a("m", (long)-3981742093301049668L, (long)l10);
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        Object[] objectArray2 = new Object[1];
                                                        objectArray2[0] = l12;
                                                        object = m44.a("l", (Object)this, (Object)objectArray2, (long)-3139855878945256580L, (long)l10);
                                                        if (callSite2 != null) break block20;
                                                        if (object == false) break block21;
                                                    }
                                                    catch (RuntimeException runtimeException) {
                                                        throw m44.a("m", (Object)runtimeException, (long)-3753533700140792412L, (long)l10);
                                                    }
                                                    m44.a("q", (Object)this, (lbd)((Object)callSite), (long)-3657679968762555650L, (long)l10);
                                                    Object[] objectArray3 = new Object[1];
                                                    objectArray3[0] = l13;
                                                    object = m44.a("l", (Object)this, (Object)objectArray3, (long)-3222834369803589099L, (long)l10);
                                                    if (callSite2 != null) break block20;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw m44.a("m", (Object)runtimeException, (long)-3753533700140792412L, (long)l10);
                                                }
                                                if (object == false) break block21;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw m44.a("m", (Object)runtimeException, (long)-3753533700140792412L, (long)l10);
                                            }
                                            m44.a("q", (Object)this, (lbd)((Object)callSite), (long)-3657679968762555650L, (long)l10);
                                            Object[] objectArray4 = new Object[1];
                                            objectArray4[0] = l14;
                                            object = m44.a("l", (Object)this, (Object)objectArray4, (long)-3972205729158871905L, (long)l10);
                                            if (callSite2 != null) break block20;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw m44.a("m", (Object)runtimeException, (long)-3753533700140792412L, (long)l10);
                                        }
                                        if (object == false) break block21;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw m44.a("m", (Object)runtimeException, (long)-3753533700140792412L, (long)l10);
                                    }
                                    m44.a("q", (Object)this, (lbd)((Object)callSite), (long)-3657679968762555650L, (long)l10);
                                    Object[] objectArray5 = new Object[1];
                                    objectArray5[0] = l15;
                                    object = m44.a("l", (Object)this, (Object)objectArray5, (long)-3812060350100187014L, (long)l10);
                                    if (callSite2 != null) break block20;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw m44.a("m", (Object)runtimeException, (long)-3753533700140792412L, (long)l10);
                                }
                                if (object == false) break block21;
                            }
                            catch (RuntimeException runtimeException) {
                                throw m44.a("m", (Object)runtimeException, (long)-3753533700140792412L, (long)l10);
                            }
                            m44.a("q", (Object)this, (lbd)((Object)callSite), (long)-3657679968762555650L, (long)l10);
                            Object[] objectArray6 = new Object[1];
                            objectArray6[0] = l16;
                            object = m44.a("l", (Object)this, (Object)objectArray6, (long)-3420745260959485865L, (long)l10);
                            if (callSite2 != null) break block20;
                        }
                        catch (RuntimeException runtimeException) {
                            throw m44.a("m", (Object)runtimeException, (long)-3753533700140792412L, (long)l10);
                        }
                        if (object == false) break block21;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("m", (Object)runtimeException, (long)-3753533700140792412L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("m", (Object)runtimeException, (long)-3753533700140792412L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Exception decompiling
     */
    private void H(Object[] var1_1) {
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
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void c(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x6B9E398EAB3L;
        int n10 = (int)(l12 >>> 32);
        int n11 = (int)(l12 << 32 >>> 48);
        int n12 = (int)(l12 << 48 >>> 48);
        long l13 = l11 ^ 0x2175BB4DFFCL;
        long l14 = l11 ^ 0x4D6596CE35A3L;
        long l15 = l11 ^ 0x787E6540B36BL;
        long l16 = l11 ^ 0x79D1EDA3830EL;
        qm qm2 = new qm((int)lqz.a("r", (int)8584, (long)(0x5E6B7221E9B79B7L ^ l10)), n10, (char)n11, n12);
        CallSite callSite = m44.a("n", (long)-3466223716870385177L, (long)l10);
        boolean bl2 = true;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = qm2;
        objectArray2[0] = l15;
        m44.a("q", (Object)m44.a("p", (Object)this, (long)-3348431366726962199L, (long)l10), (Object)objectArray2, (long)-3042953153504683253L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l14;
            objectArray3[0] = (int)lqz.a("r", (int)4553, (long)(0x34A77CD007DD4938L ^ l10));
            CallSite callSite2 = m44.a("o", (Object)this, (Object)objectArray3, (long)-3437389297738185392L, (long)l10);
            m44.a("r", (Object)this, (int)lqz.a("r", (int)28834, (long)(0x73466F43A90F2913L ^ l10)), (long)-3301170235606870282L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = qm2;
            objectArray4[0] = l16;
            m44.a("q", (Object)m44.a("p", (Object)this, (long)-3348431366726962199L, (long)l10), (Object)objectArray4, (long)-3649365482663440162L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("p", (Object)callSite2, (long)-3653760799424316697L, (long)l10);
            objectArray5[0] = l13;
            m44.a("q", (Object)qm2, (Object)objectArray5, (long)-3850544097278650486L, (long)l10);
            if (callSite != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 <= 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = qm2;
                objectArray6[0] = l16;
                m44.a("q", (Object)m44.a("p", (Object)this, (long)-3348431366726962199L, (long)l10), (Object)objectArray6, (long)-3649365482663440162L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("n", (Object)runtimeException, (long)-3696406695508147457L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = qm2;
            objectArray7[0] = l16;
            m44.a("q", (Object)m44.a("p", (Object)this, (long)-3348431366726962199L, (long)l10), (Object)objectArray7, (long)-3649365482663440162L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("n", (Object)runtimeException, (long)-3696406695508147457L, (long)l10);
        }
    }

    private static void J(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        int[] nArray = new int[lqz.a("r", (int)22002, (long)(0x58755BF4F77D8CDBL ^ l10))];
        nArray[0] = (int)lqz.a("r", (int)3665, (long)(0x576486D8283657A2L ^ l10));
        nArray[1] = (int)lqz.a("r", (int)11115, (long)(0x7258B772D412722FL ^ l10));
        nArray[2] = (int)lqz.a("r", (int)3338, (long)(0xE108CD9865E55DDL ^ l10));
        nArray[3] = (int)lqz.a("r", (int)12495, (long)(0x54072A900D50E801L ^ l10));
        nArray[4] = 0;
        nArray[5] = (int)lqz.a("r", (int)29251, (long)(0x584C6200DCA6AB9BL ^ l10));
        nArray[lqz.a("r", (int)20282, (long)(0x54D4C4241ACB17FAL ^ l10))] = 0;
        nArray[lqz.a("r", (int)27428, (long)(0x6FA70BCA6FB232A8L ^ l10))] = (int)lqz.a("r", (int)29251, (long)(0x584C6200DCA6AB9BL ^ l10));
        nArray[lqz.a("r", (int)28230, (long)(0x30F66C2A2F4CB6BEL ^ l10))] = (int)lqz.a("r", (int)29251, (long)(0x584C6200DCA6AB9BL ^ l10));
        nArray[lqz.a("r", (int)21857, (long)(0x7156FE3E8CC58CAAL ^ l10))] = (int)lqz.a("r", (int)29251, (long)(0x584C6200DCA6AB9BL ^ l10));
        nArray[lqz.a("r", (int)23995, (long)(0x13E9725ECA120442L ^ l10))] = (int)lqz.a("r", (int)29251, (long)(0x584C6200DCA6AB9BL ^ l10));
        nArray[lqz.a("r", (int)21395, (long)(0x6CAFAD9EA9380AC9L ^ l10))] = (int)lqz.a("r", (int)29251, (long)(0x584C6200DCA6AB9BL ^ l10));
        nArray[lqz.a("r", (int)8199, (long)(0x5F1612ADCF2B7964L ^ l10))] = 0;
        nArray[lqz.a("r", (int)11026, (long)(0x18D59A545CE17283L ^ l10))] = 0;
        nArray[lqz.a("r", (int)15317, (long)(0x68965AFF3452631EL ^ l10))] = (int)lqz.a("r", (int)29251, (long)(0x584C6200DCA6AB9BL ^ l10));
        nArray[lqz.a("r", (int)12647, (long)(0x36CDD72A133DE802L ^ l10))] = 0;
        nArray[lqz.a("r", (int)15559, (long)(0x41B735E19EA06507L ^ l10))] = 0;
        nArray[lqz.a("r", (int)13970, (long)(0x328C5682BB7EEE5AL ^ l10))] = (int)lqz.a("r", (int)29251, (long)(0x584C6200DCA6AB9BL ^ l10));
        nArray[lqz.a("r", (int)18527, (long)(0x20BD4DD9E9FD108EL ^ l10))] = 0;
        nArray[lqz.a("r", (int)777, (long)(0x1705098692635A8CL ^ l10))] = 0;
        nArray[lqz.a("r", (int)12353, (long)(0x695112FC88FDE96AL ^ l10))] = 0;
        nArray[lqz.a("r", (int)30663, (long)(0x4043BE99AC7EAEDDL ^ l10))] = (int)lqz.a("r", (int)29251, (long)(0x584C6200DCA6AB9BL ^ l10));
        nArray[lqz.a("r", (int)25670, (long)(0x2FBD6E77FFA6BC8CL ^ l10))] = (int)lqz.a("r", (int)13002, (long)(0x2ADB0DBF8C806B47L ^ l10));
        nArray[lqz.a("r", (int)3305, (long)(0x2DA6224FE1CBD5CEL ^ l10))] = 0;
        nArray[lqz.a("r", (int)8798, (long)(0x7E70FA47EB37FB3AL ^ l10))] = (int)lqz.a("r", (int)29251, (long)(0x584C6200DCA6AB9BL ^ l10));
        nArray[lqz.a("r", (int)15930, (long)(0x63BB16FE85256787L ^ l10))] = 0;
        nArray[lqz.a("r", (int)15462, (long)(0x238DE75A17E5B0L ^ l10))] = (int)lqz.a("r", (int)29251, (long)(0x584C6200DCA6AB9BL ^ l10));
        nArray[lqz.a("r", (int)16289, (long)(0x39556BEABFEF6680L ^ l10))] = 0;
        nArray[lqz.a("r", (int)17124, (long)(0x1743963797909B45L ^ l10))] = (int)lqz.a("r", (int)29251, (long)(0x584C6200DCA6AB9BL ^ l10));
        nArray[lqz.a("r", (int)10393, (long)(0x60C4E986DC55F1FBL ^ l10))] = 0;
        nArray[lqz.a("r", (int)8823, (long)(0x112CB1C6172DFB98L ^ l10))] = (int)lqz.a("r", (int)29251, (long)(0x584C6200DCA6AB9BL ^ l10));
        nArray[lqz.a("r", (int)10519, (long)(0x184B06722ED7F0ACL ^ l10))] = 0;
        nArray[lqz.a("r", (int)16712, (long)(0x7930EFAD966B985DL ^ l10))] = (int)lqz.a("r", (int)25130, (long)(0x677AC7FC4CA23B63L ^ l10));
        nArray[lqz.a("r", (int)31493, (long)(0x5463E587EFF72228L ^ l10))] = 0;
        nArray[lqz.a("r", (int)23813, (long)(0xE2A3B3F225A8408L ^ l10))] = 0;
        nArray[lqz.a("r", (int)21096, (long)(0x228F4F506BAA0B28L ^ l10))] = (int)lqz.a("r", (int)30905, (long)(0x47222C7ACB6E21C3L ^ l10));
        nArray[lqz.a("r", (int)17374, (long)(0x48FDEF3538FA1B25L ^ l10))] = (int)lqz.a("r", (int)30905, (long)(0x47222C7ACB6E21C3L ^ l10));
        nArray[lqz.a("r", (int)9384, (long)(0x1B80C01A8025FC73L ^ l10))] = (int)lqz.a("r", (int)26205, (long)(0x2F02AA80FB02BFA7L ^ l10));
        nArray[lqz.a("r", (int)26117, (long)(0x3B1BA6D136E43FB6L ^ l10))] = (int)lqz.a("r", (int)12414, (long)(0x4FE890976818699EL ^ l10));
        nArray[lqz.a("r", (int)3504, (long)(0x2C75D3D3BB5BD40AL ^ l10))] = (int)lqz.a("r", (int)26913, (long)(0x6E8FF945C61C301FL ^ l10));
        nArray[lqz.a("r", (int)20832, (long)(0x1B6F1A81F2438843L ^ l10))] = (int)lqz.a("r", (int)29251, (long)(0x584C6200DCA6AB9BL ^ l10));
        nArray[lqz.a("r", (int)23581, (long)(0xC2B7E79B9DE05B9L ^ l10))] = (int)lqz.a("r", (int)29251, (long)(0x584C6200DCA6AB9BL ^ l10));
        nArray[lqz.a("r", (int)13545, (long)(0x1DC159CBE2AF6DA1L ^ l10))] = (int)lqz.a("r", (int)25830, (long)(0x617DAAA44EA0BD57L ^ l10));
        nArray[lqz.a("r", (int)16391, (long)(0x45AB49A8567219E1L ^ l10))] = 0;
        nArray[lqz.a("r", (int)9110, (long)(0x268D1DC510FEFA29L ^ l10))] = 0;
        nArray[lqz.a("r", (int)5034, (long)(0x770CBA4910F8CAF3L ^ l10))] = (int)lqz.a("r", (int)15677, (long)(0x7D6DE4D3EACDE4BBL ^ l10));
        nArray[lqz.a("r", (int)24525, (long)(0x4C4FF9E0D9C4861FL ^ l10))] = (int)lqz.a("r", (int)23085, (long)(0x35B44305A65C03B8L ^ l10));
        nArray[lqz.a("r", (int)29062, (long)(0x76E19A8AFE2928FFL ^ l10))] = (int)lqz.a("r", (int)19901, (long)(0x45E8C183E9C194B8L ^ l10));
        nArray[lqz.a("r", (int)14562, (long)(0x279330954666140L ^ l10))] = (int)lqz.a("r", (int)2526, (long)(0x31E30751F8245029L ^ l10));
        nArray[lqz.a("r", (int)2623, (long)(0x274E03D4886AD378L ^ l10))] = (int)lqz.a("r", (int)29952, (long)(0x69686FDC6331ACFBL ^ l10));
        nArray[lqz.a("r", (int)19691, (long)(0x1609583E656A15B4L ^ l10))] = (int)lqz.a("r", (int)7834, (long)(0xF9F65FE97E747EDL ^ l10));
        nArray[lqz.a("r", (int)9645, (long)(0x3CAD74EEAA037C6BL ^ l10))] = (int)lqz.a("r", (int)7834, (long)(0xF9F65FE97E747EDL ^ l10));
        nArray[lqz.a("r", (int)8584, (long)(0x5E6BF9E5F1978DCL ^ l10))] = (int)lqz.a("r", (int)9646, (long)(0x502951A934B47C98L ^ l10));
        nArray[lqz.a("r", (int)18721, (long)(0x109250D8351B90F4L ^ l10))] = (int)lqz.a("r", (int)7834, (long)(0xF9F65FE97E747EDL ^ l10));
        nArray[lqz.a("r", (int)21312, (long)(0x31F58EFA72600A79L ^ l10))] = (int)lqz.a("r", (int)19901, (long)(0x45E8C183E9C194B8L ^ l10));
        nArray[lqz.a("r", (int)31940, (long)(0x27C73A7486272578L ^ l10))] = (int)lqz.a("r", (int)19901, (long)(0x45E8C183E9C194B8L ^ l10));
        nArray[lqz.a("r", (int)24329, (long)(0x252C387AD5A907D9L ^ l10))] = (int)lqz.a("r", (int)29251, (long)(0x584C6200DCA6AB9BL ^ l10));
        nArray[lqz.a("r", (int)23174, (long)(0x2DDFEFE55D5103FDL ^ l10))] = (int)lqz.a("r", (int)2202, (long)(0x5BDF730989405156L ^ l10));
        nArray[lqz.a("r", (int)22136, (long)(0xA2CF740AC158EBFL ^ l10))] = (int)lqz.a("r", (int)7834, (long)(0xF9F65FE97E747EDL ^ l10));
        nArray[lqz.a("r", (int)20259, (long)(0x2CEBC93A005297E6L ^ l10))] = (int)lqz.a("r", (int)7834, (long)(0xF9F65FE97E747EDL ^ l10));
        nArray[lqz.a("r", (int)12801, (long)(0xF087732DFADEB51L ^ l10))] = (int)lqz.a("r", (int)7834, (long)(0xF9F65FE97E747EDL ^ l10));
        nArray[lqz.a("r", (int)11074, (long)(0x6D523D5B0239722EL ^ l10))] = (int)lqz.a("r", (int)29251, (long)(0x584C6200DCA6AB9BL ^ l10));
        nArray[lqz.a("r", (int)18174, (long)(0x7C681E3005819F27L ^ l10))] = (int)lqz.a("r", (int)30905, (long)(0x47222C7ACB6E21C3L ^ l10));
        nArray[lqz.a("r", (int)29099, (long)(0x207987D1C4BAA8B2L ^ l10))] = (int)lqz.a("r", (int)23717, (long)(0x3F18D9880DFA8568L ^ l10));
        nArray[lqz.a("r", (int)16227, (long)(0x5A107910E9F7E6EAL ^ l10))] = (int)lqz.a("r", (int)21006, (long)(0x2713D17860B8B3FL ^ l10));
        nArray[lqz.a("r", (int)26108, (long)(0x57A389F3084DBCDAL ^ l10))] = (int)lqz.a("r", (int)30905, (long)(0x47222C7ACB6E21C3L ^ l10));
        nArray[lqz.a("r", (int)9874, (long)(0x23FFF050E5D8FF84L ^ l10))] = (int)lqz.a("r", (int)4696, (long)(0x2F1FF3D10D784BA4L ^ l10));
        nArray[lqz.a("r", (int)10612, (long)(0x7201B054EFF5F0F0L ^ l10))] = (int)lqz.a("r", (int)30905, (long)(0x47222C7ACB6E21C3L ^ l10));
        nArray[lqz.a("r", (int)24168, (long)(0x55836C7B42F907C6L ^ l10))] = 0;
        nArray[lqz.a("r", (int)29624, (long)(0x487E932802EDAA7BL ^ l10))] = (int)lqz.a("r", (int)30905, (long)(0x47222C7ACB6E21C3L ^ l10));
        nArray[lqz.a("r", (int)2683, (long)(0x2E21B1B28038537FL ^ l10))] = (int)lqz.a("r", (int)14098, (long)(0x10825EDB6913EEBFL ^ l10));
        m44.a("n", (int[])nArray, (long)-3749887386636534312L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    public final void KE(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 3[TRYBLOCK]
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
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void KB(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x5A24B89C8373L;
        long l13 = l11 ^ 0x155675E6692CL;
        long l14 = l11 ^ 0x204D8668EFE4L;
        long l15 = l11 ^ 0x2A8A970C2886L;
        int n10 = (int)(l15 >>> 48);
        long l16 = l15 << 16 >>> 16;
        long l17 = l11 ^ 0x21E20E8BDF81L;
        qo qo2 = new qo((short)n10, l16, (int)lqz.a("r", (int)21857, (long)(0x7156AEB12E6FD14EL ^ l10)));
        CallSite callSite = m44.a("i", (long)-7824397597950325400L, (long)l10);
        boolean bl2 = true;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = qo2;
        objectArray2[0] = l14;
        m44.a("v", (Object)m44.a("w", (Object)this, (long)-8284191906458570906L, (long)l10), (Object)objectArray2, (long)-8553995915036555388L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l13;
            objectArray3[0] = (int)lqz.a("r", (int)23791, (long)(0x198E231B988658E5L ^ l10));
            CallSite callSite2 = m44.a("h", (Object)this, (Object)objectArray3, (long)-8303326447766971937L, (long)l10);
            m44.a("u", (Object)this, (int)lqz.a("r", (int)28878, (long)(0x45FE853710E2F4F4L ^ l10)), (long)-8169324000071710087L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = qo2;
            objectArray4[0] = l17;
            m44.a("v", (Object)m44.a("w", (Object)this, (long)-8284191906458570906L, (long)l10), (Object)objectArray4, (long)-7938296525876212655L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("w", (Object)callSite2, (long)-7943114051813857688L, (long)l10);
            objectArray5[0] = l12;
            m44.a("v", (Object)qo2, (Object)objectArray5, (long)-7629301485329528059L, (long)l10);
            if (callSite != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 < 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = qo2;
                objectArray6[0] = l17;
                m44.a("v", (Object)m44.a("w", (Object)this, (long)-8284191906458570906L, (long)l10), (Object)objectArray6, (long)-7938296525876212655L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("i", (Object)runtimeException, (long)-8053314085116912016L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = qo2;
            objectArray7[0] = l17;
            m44.a("v", (Object)m44.a("w", (Object)this, (long)-8284191906458570906L, (long)l10), (Object)objectArray7, (long)-7938296525876212655L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("i", (Object)runtimeException, (long)-8053314085116912016L, (long)l10);
        }
    }

    private boolean S(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x5D57D0D76D80L;
                CallSite callSite = m44.a("o", (long)-3502597520522669722L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l11;
                        object = m44.a("n", (Object)this, (Object)objectArray2, (long)-3609510221077933531L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("o", (Object)runtimeException, (long)-3732780086808444290L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("o", (Object)runtimeException, (long)-3732780086808444290L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public t p(Object[] var1_1) {
        block60: {
            block48: {
                block49: {
                    var2_2 = (Long)var1_1[0];
                    v0 = var2_2 = lqz.a ^ var2_2;
                    var4_3 = v0 ^ 135412130314193L;
                    var6_4 = v0 ^ 31569809094945L;
                    var8_5 = v0 ^ 46937025716046L;
                    m44.a("t", (Object)this, (long)-4400431677500561746L, (long)var2_2).clear();
                    var11_6 = new boolean[lqz.a("r", (int)20140, (long)(6607418648932784461L ^ var2_2))];
                    var10_7 = m44.a("j", (long)-4568601495325172069L, (long)var2_2);
                    try {
                        try {
                            v1 /* !! */  = m44.a("t", (Object)this, (long)-4567988295341938175L, (long)var2_2);
                            if (var10_7 != null) break block48;
                            if (v1 /* !! */  < 0) break block49;
                        }
                        catch (RuntimeException v2) {
                            throw m44.a("j", (Object)v2, (long)-4337011039328039549L, (long)var2_2);
                        }
                        var11_6[m44.a("t", (Object)this, (long)-4567988295341938175L, (long)var2_2)] = true;
                        m44.a("v", (Object)this, (int)-1, (long)-4567988295341938175L, (long)var2_2);
                    }
                    catch (RuntimeException v3) {
                        throw m44.a("j", (Object)v3, (long)-4337011039328039549L, (long)var2_2);
                    }
                }
                v1 /* !! */  = (CallSite)false;
            }
            var12_8 = v1 /* !! */ ;
            block34: while (true) {
                v4 /* !! */  = var12_8;
                block35: while (v4 /* !! */  < lqz.a("r", (int)22002, (long)(6374068508309095116L ^ var2_2))) {
                    block51: {
                        block50: {
                            try {
                                try {
                                    v5 = m44.a("t", (Object)this, (long)-2390159280317931254L, (long)var2_2)[var12_8];
lbl34:
                                    // 2 sources

                                    while (true) {
                                        v6 = var10_7;
                                        while (true) {
                                            if (v6 != null) break block50;
                                            v7 = m44.a("t", (Object)this, (long)-2430898482628560059L, (long)var2_2);
                                            if (var2_2 >= 0L && var10_7 == null) {
                                            }
                                            ** GOTO lbl140
                                            break;
                                        }
                                        break;
                                    }
                                }
                                catch (RuntimeException v8) {
                                    throw m44.a("j", (Object)v8, (long)-4337011039328039549L, (long)var2_2);
                                }
                                if (v5 != v7) break block51;
                            }
                            catch (RuntimeException v9) {
                                throw m44.a("j", (Object)v9, (long)-4337011039328039549L, (long)var2_2);
                            }
                            v5 = var13_10 = (reference)false;
                        }
                        while (var13_10 < lqz.a("r", (int)16712, (long)(8732631204367603274L ^ var2_2))) {
                            block58: {
                                block59: {
                                    block56: {
                                        block57: {
                                            block54: {
                                                block55: {
                                                    block52: {
                                                        block53: {
                                                            v4 /* !! */  = (CallSite)(m44.a("n", (long)-4187539273241152561L, (long)var2_2)[var12_8] & 1 << var13_10);
                                                            if (var10_7 != null) continue block35;
                                                            try {
                                                                try {
                                                                    v6 = var10_7;
                                                                    if (var2_2 < 0L) ** continue;
                                                                    if (var2_2 >= 0L) {
                                                                        if (v6 != null) break block52;
                                                                        if (v4 /* !! */  == false) break block53;
                                                                    }
                                                                    ** GOTO lbl74
                                                                }
                                                                catch (RuntimeException v10) {
                                                                    throw m44.a("j", (Object)v10, (long)-4337011039328039549L, (long)var2_2);
                                                                }
                                                                var11_6[var13_10] = true;
                                                            }
                                                            catch (RuntimeException v11) {
                                                                throw m44.a("j", (Object)v11, (long)-4337011039328039549L, (long)var2_2);
                                                            }
                                                        }
                                                        v12 = m44.a("n", (long)-4606629920793450295L, (long)var2_2)[var12_8] & 1 << var13_10;
                                                    }
                                                    try {
                                                        try {
                                                            v13 = var10_7;
lbl74:
                                                            // 2 sources

                                                            if (var2_2 >= 0L) {
                                                                if (v13 != null) break block54;
                                                                if (v12 == false) break block55;
                                                            }
                                                            ** GOTO lbl91
                                                        }
                                                        catch (RuntimeException v14) {
                                                            throw m44.a("j", (Object)v14, (long)-4337011039328039549L, (long)var2_2);
                                                        }
                                                        var11_6[lqz.a("r", (int)16712, (long)(8732631204367603274L ^ var2_2)) + var13_10] = true;
                                                    }
                                                    catch (RuntimeException v15) {
                                                        throw m44.a("j", (Object)v15, (long)-4337011039328039549L, (long)var2_2);
                                                    }
                                                }
                                                v12 = m44.a("n", (long)-4086682292695944970L, (long)var2_2)[var12_8] & 1 << var13_10;
                                            }
                                            try {
                                                try {
                                                    v13 = var10_7;
lbl91:
                                                    // 2 sources

                                                    if (var2_2 > 0L) {
                                                        if (v13 != null) break block56;
                                                        if (v12 == false) break block57;
                                                    }
                                                    ** GOTO lbl109
                                                }
                                                catch (RuntimeException v16) {
                                                    throw m44.a("j", (Object)v16, (long)-4337011039328039549L, (long)var2_2);
                                                }
                                                var11_6[lqz.a("r", (int)16227, (long)(6489721617752451325L ^ var2_2)) + var13_10] = true;
                                            }
                                            catch (RuntimeException v17) {
                                                throw m44.a("j", (Object)v17, (long)-4337011039328039549L, (long)var2_2);
                                            }
                                        }
                                        v12 = m44.a("n", (long)-2376933442888480171L, (long)var2_2)[var12_8] & 1 << var13_10;
                                    }
                                    try {
                                        try {
                                            if (var2_2 < 0L) break block58;
                                            v13 = var10_7;
lbl109:
                                            // 2 sources

                                            if (v13 != null) break block58;
                                            if (v12 == false) break block59;
                                        }
                                        catch (RuntimeException v18) {
                                            throw m44.a("j", (Object)v18, (long)-4337011039328039549L, (long)var2_2);
                                        }
                                        var11_6[lqz.a("r", (int)26122, (long)(6536247786951848283L ^ var2_2)) + var13_10] = true;
                                    }
                                    catch (RuntimeException v19) {
                                        throw m44.a("j", (Object)v19, (long)-4337011039328039549L, (long)var2_2);
                                    }
                                }
                                v12 = m44.a("n", (long)-2641278515776725555L, (long)var2_2)[var12_8] & 1 << var13_10;
                            }
                            try {
                                if (v12 != 0) {
                                    var11_6[lqz.a("r", (int)27384, (long)(4399153526339091821L ^ var2_2)) + var13_10] = true;
                                }
                            }
                            catch (RuntimeException v20) {
                                throw m44.a("j", (Object)v20, (long)-4337011039328039549L, (long)var2_2);
                            }
                            ++var13_10;
                            if (var10_7 == null) continue;
                        }
                    }
                    ++var12_8;
                    v21 = var10_7;
                    if (var2_2 <= 0L) ** GOTO lbl169
                    if (v21 == null) continue block34;
                }
                break;
            }
            v22 = false;
            ** while (var2_2 < 0L)
lbl136:
            // 1 sources

            var12_8 = (reference)v22;
            do {
                block61: {
                    v23 /* !! */  = var12_8;
                    v7 = lqz.a("r", (int)16853, (long)(6013659591144085229L ^ var2_2));
lbl140:
                    // 2 sources

                    try {
                        try {
                            try {
                                try {
                                    if (v23 /* !! */  >= v7) break;
                                    v24 = var11_6[var12_8];
                                    if (var10_7 != null) break block60;
                                }
                                catch (RuntimeException v25) {
                                    throw m44.a("j", (Object)v25, (long)-4337011039328039549L, (long)var2_2);
                                }
                                if (var10_7 != null) break block61;
                            }
                            catch (RuntimeException v26) {
                                throw m44.a("j", (Object)v26, (long)-4337011039328039549L, (long)var2_2);
                            }
                            if (v24 == 0) break block61;
                        }
                        catch (RuntimeException v27) {
                            throw m44.a("j", (Object)v27, (long)-4337011039328039549L, (long)var2_2);
                        }
                        m44.a("v", (Object)this, (int[])new int[1], (long)-2413459051253127859L, (long)var2_2);
                        m44.a("t", (Object)this, (long)-2413459051253127859L, (long)var2_2)[0] = var12_8;
                        v28 = m44.a("t", (Object)this, (long)-4400431677500561746L, (long)var2_2);
lbl161:
                        // 2 sources

                        while (true) {
                            v28.add(m44.a("t", (Object)this, (long)-2413459051253127859L, (long)var2_2));
                            break;
                        }
                    }
                    catch (RuntimeException v29) {
                        throw m44.a("j", (Object)v29, (long)-4337011039328039549L, (long)var2_2);
                    }
                }
                ++var12_8;
                v21 = var10_7;
lbl169:
                // 2 sources

            } while (v21 == null);
            m44.a("v", (Object)this, (int)0, (long)-4043945021480642576L, (long)var2_2);
            v30 = new Object[1];
            v30[0] = var8_5;
            m44.a("k", (Object)this, (Object)v30, (long)-2361967371324093118L, (long)var2_2);
            v31 = new Object[3];
            v31[2] = var4_3;
            v31[1] = 0;
            v31[0] = 0;
            m44.a("k", (Object)this, (Object)v31, (long)-4287089698308635670L, (long)var2_2);
            v28 = m44.a("t", (Object)this, (long)-4400431677500561746L, (long)var2_2);
            ** while (var2_2 < 0L)
lbl183:
            // 1 sources

            v24 = v28.size();
        }
        var12_9 = new int[v24][];
        var13_10 = (reference)false;
        while (var13_10 < m44.a("t", (Object)this, (long)-4400431677500561746L, (long)var2_2).size()) {
            var12_9[var13_10] = (int[])m44.a("t", (Object)this, (long)-4400431677500561746L, (long)var2_2).get((int)var13_10);
            ++var13_10;
lbl190:
            // 2 sources

            ** while (var10_7 != null)
lbl191:
            // 1 sources

        }
lbl192:
        // 2 sources

        if (var2_2 <= 0L) ** GOTO lbl190
        return new t((lbd)m44.a("t", (Object)this, (long)-2590598935161119347L, (long)var2_2), var12_9, var6_4, (String[])m44.a("n", (long)-2625904177604154800L, (long)var2_2));
    }

    /*
     * Exception decompiling
     */
    public final void s(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 3[TRYBLOCK]
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
    public final void KY(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 3[TRYBLOCK]
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

    private static void l(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        int[] nArray = new int[lqz.a("r", (int)22002, (long)(0x58753EF9C66E49DFL ^ l10))];
        nArray[0] = 0;
        nArray[1] = (int)lqz.a("r", (int)13123, (long)(0x23D329FFAEAAAFDCL ^ l10));
        nArray[2] = (int)lqz.a("r", (int)4822, (long)(0x55B1281FBAD0E8CL ^ l10));
        nArray[3] = 0;
        nArray[4] = 0;
        nArray[5] = 0;
        nArray[lqz.a("r", (int)20282, (long)(0x54D4A1292BD8D2FEL ^ l10))] = (int)lqz.a("r", (int)7928, (long)(0x70297C81B500321L ^ l10));
        nArray[lqz.a("r", (int)27428, (long)(0x6FA76EC75EA1F7ACL ^ l10))] = 0;
        nArray[lqz.a("r", (int)28230, (long)(0x30F609271E5F73BAL ^ l10))] = 0;
        nArray[lqz.a("r", (int)21857, (long)(0x71569B33BDD649AEL ^ l10))] = 0;
        nArray[lqz.a("r", (int)23995, (long)(0x13E91753FB01C146L ^ l10))] = 0;
        nArray[lqz.a("r", (int)21395, (long)(0x6CAFC893982BCFCDL ^ l10))] = 0;
        nArray[lqz.a("r", (int)8199, (long)(0x5F1677A0FE38BC60L ^ l10))] = 0;
        nArray[lqz.a("r", (int)11026, (long)(0x18D5FF596DF2B787L ^ l10))] = 0;
        nArray[lqz.a("r", (int)15317, (long)(0x68963FF20541A61AL ^ l10))] = 0;
        nArray[lqz.a("r", (int)12647, (long)(0x36CDB227222E2D06L ^ l10))] = 0;
        nArray[lqz.a("r", (int)15559, (long)(0x41B750ECAFB3A003L ^ l10))] = 0;
        nArray[lqz.a("r", (int)13970, (long)(0x328C338F8A6D2B5EL ^ l10))] = 0;
        nArray[lqz.a("r", (int)18527, (long)(0x20BD28D4D8EED58AL ^ l10))] = 0;
        nArray[lqz.a("r", (int)777, (long)(0x17056C8BA3709F88L ^ l10))] = 0;
        nArray[lqz.a("r", (int)12353, (long)(0x695177F1B9EE2C6EL ^ l10))] = 0;
        nArray[lqz.a("r", (int)30663, (long)(0x4043DB949D6D6BD9L ^ l10))] = 0;
        nArray[lqz.a("r", (int)25670, (long)(0x2FBD0B7ACEB57988L ^ l10))] = 0;
        nArray[lqz.a("r", (int)3305, (long)(0x2DA64742D0D810CAL ^ l10))] = 0;
        nArray[lqz.a("r", (int)8798, (long)(0x7E709F4ADA243E3EL ^ l10))] = 0;
        nArray[lqz.a("r", (int)15930, (long)(0x63BB73F3B436A283L ^ l10))] = 0;
        nArray[lqz.a("r", (int)15462, (long)(0x23E8EA6B0420B4L ^ l10))] = 0;
        nArray[lqz.a("r", (int)16289, (long)(0x39550EE78EFCA384L ^ l10))] = 0;
        nArray[lqz.a("r", (int)17124, (long)(0x1743F33AA6835E41L ^ l10))] = 0;
        nArray[lqz.a("r", (int)10393, (long)(0x60C48C8BED4634FFL ^ l10))] = 0;
        nArray[lqz.a("r", (int)8823, (long)(0x112CD4CB263E3E9CL ^ l10))] = 0;
        nArray[lqz.a("r", (int)10519, (long)(0x184B637F1FC435A8L ^ l10))] = 0;
        nArray[lqz.a("r", (int)16712, (long)(0x79308AA0A7785D59L ^ l10))] = 0;
        nArray[lqz.a("r", (int)31493, (long)(0x5463808ADEE4E72CL ^ l10))] = 0;
        nArray[lqz.a("r", (int)23813, (long)(0xE2A5E321349410CL ^ l10))] = 0;
        nArray[lqz.a("r", (int)21096, (long)(0x228F2A5D5AB9CE2CL ^ l10))] = 0;
        nArray[lqz.a("r", (int)17374, (long)(0x48FD8A3809E9DE21L ^ l10))] = 0;
        nArray[lqz.a("r", (int)9384, (long)(0x1B80A517B1363977L ^ l10))] = 0;
        nArray[lqz.a("r", (int)26117, (long)(0x3B1BC3DC07F7FAB2L ^ l10))] = 0;
        nArray[lqz.a("r", (int)3504, (long)(0x2C75B6DE8A48110EL ^ l10))] = 0;
        nArray[lqz.a("r", (int)20832, (long)(0x1B6F7F8CC3504D47L ^ l10))] = 0;
        nArray[lqz.a("r", (int)23581, (long)(0xC2B1B7488CDC0BDL ^ l10))] = 0;
        nArray[lqz.a("r", (int)13545, (long)(0x1DC13CC6D3BCA8A5L ^ l10))] = 0;
        nArray[lqz.a("r", (int)16391, (long)(0x45AB2CA56761DCE5L ^ l10))] = 0;
        nArray[lqz.a("r", (int)9110, (long)(0x268D78C821ED3F2DL ^ l10))] = 0;
        nArray[lqz.a("r", (int)5034, (long)(0x770CDF4421EB0FF7L ^ l10))] = (int)lqz.a("r", (int)15559, (long)(0x41B750ECAFB3A003L ^ l10));
        nArray[lqz.a("r", (int)24525, (long)(0x4C4F9CEDE8D7431BL ^ l10))] = 0;
        nArray[lqz.a("r", (int)29062, (long)(0x76E1FF87CF3AEDFBL ^ l10))] = 0;
        nArray[lqz.a("r", (int)14562, (long)(0x27956046575A444L ^ l10))] = (int)lqz.a("r", (int)15559, (long)(0x41B750ECAFB3A003L ^ l10));
        nArray[lqz.a("r", (int)2623, (long)(0x274E66D9B979167CL ^ l10))] = 0;
        nArray[lqz.a("r", (int)19691, (long)(0x16093D335479D0B0L ^ l10))] = 0;
        nArray[lqz.a("r", (int)9645, (long)(0x3CAD11E39B10B96FL ^ l10))] = 0;
        nArray[lqz.a("r", (int)8584, (long)(0x5E6DA936E0ABDD8L ^ l10))] = 0;
        nArray[lqz.a("r", (int)18721, (long)(0x109235D5040855F0L ^ l10))] = 0;
        nArray[lqz.a("r", (int)21312, (long)(0x31F5EBF74373CF7DL ^ l10))] = 0;
        nArray[lqz.a("r", (int)31940, (long)(0x27C75F79B734E07CL ^ l10))] = 0;
        nArray[lqz.a("r", (int)24329, (long)(0x252C5D77E4BAC2DDL ^ l10))] = 0;
        nArray[lqz.a("r", (int)23174, (long)(0x2DDF8AE86C42C6F9L ^ l10))] = 0;
        nArray[lqz.a("r", (int)22136, (long)(0xA2C924D9D064BBBL ^ l10))] = 0;
        nArray[lqz.a("r", (int)20259, (long)(0x2CEBAC37314152E2L ^ l10))] = 0;
        nArray[lqz.a("r", (int)12801, (long)(0xF08123FEEBE2E55L ^ l10))] = 0;
        nArray[lqz.a("r", (int)11074, (long)(0x6D525856332AB72AL ^ l10))] = 0;
        nArray[lqz.a("r", (int)18174, (long)(0x7C687B3D34925A23L ^ l10))] = 0;
        nArray[lqz.a("r", (int)29099, (long)(0x2079E2DCF5A96DB6L ^ l10))] = 0;
        nArray[lqz.a("r", (int)16227, (long)(0x5A101C1DD8E423EEL ^ l10))] = 0;
        nArray[lqz.a("r", (int)26108, (long)(0x57A3ECFE395E79DEL ^ l10))] = 0;
        nArray[lqz.a("r", (int)9874, (long)(0x23FF955DD4CB3A80L ^ l10))] = 0;
        nArray[lqz.a("r", (int)10612, (long)(0x7201D559DEE635F4L ^ l10))] = 0;
        nArray[lqz.a("r", (int)24168, (long)(0x5583097673EAC2C2L ^ l10))] = 0;
        nArray[lqz.a("r", (int)29624, (long)(0x487EF62533FE6F7FL ^ l10))] = 0;
        nArray[lqz.a("r", (int)2683, (long)(0x2E21D4BFB12B967BL ^ l10))] = (int)lqz.a("r", (int)15559, (long)(0x41B750ECAFB3A003L ^ l10));
        m44.a("j", (int[])nArray, (long)890080414709873637L, (long)l10);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void Kn(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x2A57CD003185L;
        long l13 = l11 ^ 0x6525007ADBDAL;
        long l14 = l11 ^ 0x65EE2E5F4779L;
        long l15 = l11 ^ 0x503EF3F45D12L;
        long l16 = l11 ^ 0x51917B176D77L;
        qb qb2 = new qb(l14, (int)lqz.a("r", (int)8199, (long)(0x5F163251181D9676L ^ l10)));
        CallSite callSite = m44.a("o", (long)2421907063205330846L, (long)l10);
        boolean bl2 = true;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = qb2;
        objectArray2[0] = l15;
        m44.a("p", (Object)m44.a("q", (Object)this, (long)4611355242355907984L, (long)l10), (Object)objectArray2, (long)4304432417143666034L, (long)l10);
        CallSite callSite2 = callSite;
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l13;
            objectArray3[0] = (int)lqz.a("r", (int)21399, (long)(0xCA5F88CE5C8653CL ^ l10));
            CallSite callSite3 = m44.a("n", (Object)this, (Object)objectArray3, (long)4481883060587129641L, (long)l10);
            m44.a("s", (Object)this, (int)lqz.a("r", (int)11987, (long)(0x2FEA9524267198CBL ^ l10)), (long)4347886145011169423L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = qb2;
            objectArray4[0] = l16;
            m44.a("p", (Object)m44.a("q", (Object)this, (long)4611355242355907984L, (long)l10), (Object)objectArray4, (long)2532132591775186599L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("q", (Object)callSite3, (long)2536111160066053278L, (long)l10);
            objectArray5[0] = l12;
            m44.a("p", (Object)qb2, (Object)objectArray5, (long)2659717304724388339L, (long)l10);
            if (callSite2 != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 < 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = qb2;
                objectArray6[0] = l16;
                m44.a("p", (Object)m44.a("q", (Object)this, (long)4611355242355907984L, (long)l10), (Object)objectArray6, (long)2532132591775186599L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("o", (Object)runtimeException, (long)2506976608844803206L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = qb2;
            objectArray7[0] = l16;
            m44.a("p", (Object)m44.a("q", (Object)this, (long)4611355242355907984L, (long)l10), (Object)objectArray7, (long)2532132591775186599L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("o", (Object)runtimeException, (long)2506976608844803206L, (long)l10);
        }
    }

    /*
     * Exception decompiling
     */
    public final void KL(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 2[TRYBLOCK]
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
    public final vd g(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [17[CASE]], but top level block is 2[TRYBLOCK]
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
    public final void KO(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 2[TRYBLOCK]
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
    private void ys(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [31[DOLOOP], 32[DOLOOP]], but top level block is 12[TRYBLOCK]
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public lqz(long l10, Reader reader) {
        int n10;
        CallSite callSite;
        block7: {
            long l11 = l10 = a ^ l10;
            long l12 = l11 ^ 0x54DEB5CE1565L;
            long l13 = l11 ^ 0xE678D803800L;
            long l14 = l11 ^ 0x5DE5883FAECDL;
            long l15 = l11 ^ 0x7E791AD37398L;
            int n11 = (int)(l15 >>> 48);
            long l16 = l15 << 16 >>> 16;
            m44.a("q", (Object)this, (vc)new vc(l14), (long)5378669601487726794L, (long)l10);
            this.m = new int[lqz.a("r", (int)22002, (long)(0x587577A041571693L ^ l10))];
            this.N = new og[lqz.a("r", (int)20282, (long)(0x54D4E870ACE18DB2L ^ l10))];
            m44.a("q", (Object)this, (boolean)false, (long)5873479100490317854L, (long)l10);
            m44.a("q", (Object)this, (int)0, (long)6262591950483386702L, (long)l10);
            CallSite callSite2 = m44.a("m", (long)6108670051743730372L, (long)l10);
            this.Q = new ad(null);
            m44.a("q", (Object)this, new ArrayList(), (long)6246999133201134321L, (long)l10);
            m44.a("q", (Object)this, (int)-1, (long)6108135576355208798L, (long)l10);
            callSite = callSite2;
            m44.a("q", (Object)this, (int[])new int[lqz.a("r", (int)9339, (long)(0x1877F791C11FE7B3L ^ l10))], (long)5321015518934237724L, (long)l10);
            m44.a("q", (Object)this, (yk)new yk(reader, (char)n11, 1, l16, 1), (long)6182217281371467587L, (long)l10);
            m44.a("q", (Object)this, (lka)new lka((yk)((Object)m44.a("s", (Object)this, (long)6182217281371467587L, (long)l10)), l13), (long)6026810558987935124L, (long)l10);
            m44.a("q", (Object)this, (lbd)new lbd(), (long)5211542004137511378L, (long)l10);
            CallSite callSite3 = m44.a("s", (Object)this, (long)5211542004137511378L, (long)l10);
            Object[] objectArray = new Object[1];
            objectArray[0] = l12;
            CallSite callSite4 = m44.a("r", (Object)m44.a("s", (Object)this, (long)6026810558987935124L, (long)l10), (Object)objectArray, (long)5680260557706027769L, (long)l10);
            m44.a("q", (Object)this, (lbd)((Object)callSite4), (long)5397980822267654837L, (long)l10);
            m44.a("q", (Object)callSite3, (lbd)((Object)callSite4), (long)5811422795181447120L, (long)l10);
            m44.a("q", (Object)this, (int)0, (long)5340421007707533082L, (long)l10);
            n10 = 0;
            block4: while (n10 < lqz.a("r", (int)22002, (long)(0x587577A041571693L ^ l10))) {
                try {
                    m44.a("s", (Object)this, (long)5371449538623599957L, (long)l10)[n10] = (CallSite)-1;
                    ++n10;
                    while (l10 > 0L && callSite == null) {
                        if (callSite == null) continue block4;
                        if (l10 <= 0L) continue;
                        break block4;
                    }
                    break block7;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("m", (Object)runtimeException, (long)6309716083917199836L, (long)l10);
                }
            }
            n10 = 0;
        }
        try {
            do {
                if (l10 < 0L) continue;
                if (n10 >= ((CallSite)m44.a("s", (Object)this, (long)5457489617139507918L, (long)l10)).length) return;
                m44.a("s", (Object)this, (long)5457489617139507918L, (long)l10)[n10] = new og();
                ++n10;
            } while (callSite == null || l10 <= 0L);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("m", (Object)runtimeException, (long)6309716083917199836L, (long)l10);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void B(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x72A0F315C83AL;
        long l13 = l11 ^ 0x3DD23E6F2265L;
        long l14 = l11 ^ 0x220F5D27B579L;
        long l15 = l11 ^ 0x8C9CDE1A4ADL;
        long l16 = l11 ^ 0x966450294C8L;
        qq qq2 = new qq(l14, (int)lqz.a("r", (int)24168, (long)(0x55831470ABDA116BL ^ l10)));
        boolean bl2 = true;
        CallSite callSite = m44.a("h", (long)-2872435286644029919L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = qq2;
        objectArray2[0] = l15;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)-4160890794848836561L, (long)l10), (Object)objectArray2, (long)-4466670824223159091L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l13;
            objectArray3[0] = (int)lqz.a("r", (int)27099, (long)(0x320F3323DFBA2641L ^ l10));
            CallSite callSite2 = m44.a("i", (Object)this, (Object)objectArray3, (long)-4067454069466787178L, (long)l10);
            m44.a("t", (Object)this, (int)lqz.a("r", (int)25645, (long)(0x503094EB8E952BE6L ^ l10)), (long)-4185652069380767440L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = qq2;
            objectArray4[0] = l16;
            m44.a("w", (Object)m44.a("v", (Object)this, (long)-4160890794848836561L, (long)l10), (Object)objectArray4, (long)-2694091722922195176L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("v", (Object)callSite2, (long)-2698417730453639903L, (long)l10);
            objectArray5[0] = l12;
            m44.a("w", (Object)qq2, (Object)objectArray5, (long)-2497687736113463220L, (long)l10);
            if (callSite != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 <= 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = qq2;
                objectArray6[0] = l16;
                m44.a("w", (Object)m44.a("v", (Object)this, (long)-4160890794848836561L, (long)l10), (Object)objectArray6, (long)-2694091722922195176L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("h", (Object)runtimeException, (long)-2632977378305010375L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = qq2;
            objectArray7[0] = l16;
            m44.a("w", (Object)m44.a("v", (Object)this, (long)-4160890794848836561L, (long)l10), (Object)objectArray7, (long)-2694091722922195176L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("h", (Object)runtimeException, (long)-2632977378305010375L, (long)l10);
        }
    }

    private boolean X(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x664879CBC102L;
                CallSite callSite = m44.a("j", (long)2864574895631432131L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)lqz.a("r", (int)777, (long)(0x17057D6E9E95B3C3L ^ l10));
                        object = m44.a("k", (Object)this, (Object)objectArray2, (long)2835430149523588001L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("j", (Object)runtimeException, (long)2636793697100393179L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("j", (Object)runtimeException, (long)2636793697100393179L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    private static void Kc(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        int[] nArray = new int[lqz.a("r", (int)12575, (long)(0x223C49FF01E1ACB9L ^ l10))];
        nArray[0] = 0;
        nArray[1] = 0;
        nArray[2] = 0;
        nArray[3] = 0;
        nArray[4] = 0;
        nArray[5] = 0;
        nArray[lqz.a("r", (int)20338, (long)(0x189D307FABE552CBL ^ l10))] = 0;
        nArray[lqz.a("r", (int)27428, (long)(0x6FA76499C84477DDL ^ l10))] = 0;
        nArray[lqz.a("r", (int)3927, (long)(0x5739F5A3A3139333L ^ l10))] = 0;
        nArray[lqz.a("r", (int)15130, (long)(0x30CA462EFAABA74FL ^ l10))] = 0;
        nArray[lqz.a("r", (int)7159, (long)(0xCA37057E9E3078AL ^ l10))] = 0;
        nArray[lqz.a("r", (int)12023, (long)(0x2A5C94481977B2AAL ^ l10))] = 0;
        nArray[lqz.a("r", (int)8199, (long)(0x5F167DFE68DD3C11L ^ l10))] = 0;
        nArray[lqz.a("r", (int)6555, (long)(0x19E4273AC0F5854EL ^ l10))] = 0;
        nArray[lqz.a("r", (int)15317, (long)(0x689635AC93A4266BL ^ l10))] = 0;
        nArray[lqz.a("r", (int)10642, (long)(0x77F39904FC0935F7L ^ l10))] = 0;
        nArray[lqz.a("r", (int)15559, (long)(0x41B75AB239562072L ^ l10))] = 0;
        nArray[lqz.a("r", (int)20740, (long)(0x4B4F71D08A4A4D5BL ^ l10))] = 0;
        nArray[lqz.a("r", (int)23409, (long)(0x735690E3F36E47FCL ^ l10))] = 0;
        nArray[lqz.a("r", (int)2437, (long)(0x69E8FD040D1195C3L ^ l10))] = 0;
        nArray[lqz.a("r", (int)197, (long)(0x7A78C0A7E29B9CF5L ^ l10))] = 0;
        nArray[lqz.a("r", (int)27370, (long)(0x73074AEE35B47688L ^ l10))] = 0;
        nArray[lqz.a("r", (int)24510, (long)(0x13EE30588547C204L ^ l10))] = 0;
        nArray[lqz.a("r", (int)5741, (long)(0x34040FBD87BB0A05L ^ l10))] = 0;
        nArray[lqz.a("r", (int)19661, (long)(0x6FDA66931D1BD063L ^ l10))] = 0;
        nArray[lqz.a("r", (int)15930, (long)(0x63BB79AD22D322F2L ^ l10))] = 0;
        nArray[lqz.a("r", (int)21311, (long)(0x3D91241A69B1CF5EL ^ l10))] = 0;
        nArray[lqz.a("r", (int)5713, (long)(0x122C57DC3BED8A26L ^ l10))] = 0;
        nArray[lqz.a("r", (int)24411, (long)(0xECABC416532C3A9L ^ l10))] = 0;
        nArray[lqz.a("r", (int)2589, (long)(0x3577EFB6AC7A9615L ^ l10))] = 0;
        nArray[lqz.a("r", (int)16686, (long)(0x2C2AF4528572DD23L ^ l10))] = 0;
        nArray[lqz.a("r", (int)16924, (long)(0x6DD5D50E05105E35L ^ l10))] = 0;
        nArray[lqz.a("r", (int)28416, (long)(0x420A35BEFF8A73F4L ^ l10))] = 0;
        nArray[lqz.a("r", (int)10842, (long)(0x7DCA4BCDB51FB65DL ^ l10))] = 0;
        nArray[lqz.a("r", (int)18988, (long)(0x31E9BB41F8FD5617L ^ l10))] = 0;
        nArray[lqz.a("r", (int)19307, (long)(0x528290386EDD700L ^ l10))] = 0;
        nArray[lqz.a("r", (int)9805, (long)(0xABF9B1455EBBAC7L ^ l10))] = 0;
        nArray[lqz.a("r", (int)19081, (long)(0x7C0039D8767D5657L ^ l10))] = 0;
        nArray[lqz.a("r", (int)455, (long)(0x59538D865D19D6DL ^ l10))] = 0;
        nArray[lqz.a("r", (int)17363, (long)(0x3DD767FEA1655F14L ^ l10))] = 0;
        nArray[lqz.a("r", (int)27727, (long)(0x4B2CF92C502F70CEL ^ l10))] = 0;
        nArray[lqz.a("r", (int)17708, (long)(0x49F02A4726BDD9A9L ^ l10))] = 0;
        nArray[lqz.a("r", (int)10729, (long)(0xD925C58216EB513L ^ l10))] = 0;
        nArray[lqz.a("r", (int)13292, (long)(0x6C8CB2CD2B5A2F29L ^ l10))] = 0;
        nArray[lqz.a("r", (int)30431, (long)(0x42354A39CB2BEB7FL ^ l10))] = 0;
        nArray[lqz.a("r", (int)2651, (long)(0x5D8E328E141E16E0L ^ l10))] = 0;
        nArray[lqz.a("r", (int)17139, (long)(0x3A2026A7EDC5DF5EL ^ l10))] = 0;
        nArray[lqz.a("r", (int)20326, (long)(0xC11CE84759C533FL ^ l10))] = 0;
        nArray[lqz.a("r", (int)23519, (long)(0x1F53D612C189C740L ^ l10))] = 0;
        nArray[lqz.a("r", (int)11355, (long)(0x56A8ACECE3C63049L ^ l10))] = 0;
        nArray[lqz.a("r", (int)32274, (long)(0x32FDB389702C627FL ^ l10))] = 0;
        nArray[lqz.a("r", (int)22612, (long)(0x67EA0A5A2B13C4AFL ^ l10))] = 0;
        nArray[lqz.a("r", (int)18649, (long)(0x7571F10C0E4D4DAL ^ l10))] = 0;
        nArray[lqz.a("r", (int)28358, (long)(0x3FB6078262BDF36DL ^ l10))] = 0;
        nArray[lqz.a("r", (int)28982, (long)(0x585069EE512FEDE0L ^ l10))] = 0;
        nArray[lqz.a("r", (int)21855, (long)(0x4CA16C8A28FFC8E3L ^ l10))] = 0;
        nArray[lqz.a("r", (int)10083, (long)(0x480FA56BB53D3B2BL ^ l10))] = 0;
        nArray[lqz.a("r", (int)19487, (long)(0x7AEF6BBF46C9505FL ^ l10))] = 0;
        nArray[lqz.a("r", (int)12561, (long)(0x63E6F572BB642D40L ^ l10))] = 0;
        nArray[lqz.a("r", (int)12090, (long)(0x2A6EFA1A6E723293L ^ l10))] = 0;
        nArray[lqz.a("r", (int)11602, (long)(0x4A89D9FAD7553181L ^ l10))] = 0;
        nArray[lqz.a("r", (int)3646, (long)(0x56425EB343D5126EL ^ l10))] = 0;
        nArray[lqz.a("r", (int)2177, (long)(0x54C8B2F6FFC71466L ^ l10))] = 0;
        nArray[lqz.a("r", (int)10288, (long)(0x17847C7EC0F93475L ^ l10))] = 0;
        nArray[lqz.a("r", (int)13008, (long)(0x39619B24E9C1AE74L ^ l10))] = 0;
        nArray[lqz.a("r", (int)6972, (long)(0x746FD98352B70747L ^ l10))] = 0;
        nArray[lqz.a("r", (int)30672, (long)(0x301A8089FABB6BCFL ^ l10))] = 0;
        nArray[lqz.a("r", (int)18001, (long)(0x22778F15F5F5DACFL ^ l10))] = 0;
        nArray[lqz.a("r", (int)12161, (long)(0x2406085E9F2D33FBL ^ l10))] = 0;
        nArray[lqz.a("r", (int)28255, (long)(0x1679CDB56293F3D0L ^ l10))] = 0;
        nArray[lqz.a("r", (int)22935, (long)(0x31D31FBE6EE2C51CL ^ l10))] = 0;
        m44.a("k", (int[])nArray, (long)-8054052410713270609L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    public final void X(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 2[TRYBLOCK]
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
    public final void G(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 2[TRYBLOCK]
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
    public final void Kf(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 2[TRYBLOCK]
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
    public final void K0(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = lqz.a ^ var2_2;
        var4_3 = v0 ^ 136801044973503L;
        var6_4 = v0 ^ 124870694523632L;
        var8_5 = v0 ^ 122628312695183L;
        var10_6 = v0 ^ 36238459300816L;
        var12_7 = v0 ^ 100990904268453L;
        var14_8 = v0 ^ 24114629766424L;
        var16_9 = v0 ^ 22269792607613L;
        var18_10 = v0 ^ 43322190857401L;
        v1 = m44.a("m", (long)-7956151402121113708L, (long)var2_2);
        var21_11 = new qc((int)lqz.a("r", (int)17124, (long)(1676450784350487645L ^ var2_2)), var18_10);
        var22_12 = true;
        v2 = new Object[2];
        v2[1] = var21_11;
        v2[0] = var14_8;
        m44.a("r", (Object)m44.a("s", (Object)this, (long)-8073662234204115558L, (long)var2_2), (Object)v2, (long)-8379457648084220552L, (long)var2_2);
        var20_13 = v1;
        try {
            v3 = new Object[2];
            v3[1] = var10_6;
            v3[0] = (int)lqz.a("r", (int)19749, (long)(6492880256261999608L ^ var2_2));
            var23_14 = m44.a("l", (Object)this, (Object)v3, (long)-8198630267797742813L, (long)var2_2);
            m44.a("q", (Object)this, (int)lqz.a("r", (int)19749, (long)(6492880256261999608L ^ var2_2)), (long)-8332628282080032635L, (long)var2_2);
            v4 = new Object[1];
            v4[0] = var6_4;
            m44.a("r", (Object)this, (Object)v4, (long)-8147147467199197525L, (long)var2_2);
            v5 = new Object[3];
            v5[2] = true;
            v5[1] = var21_11;
            v5[0] = var16_9;
            m44.a("r", (Object)m44.a("s", (Object)this, (long)-8073662234204115558L, (long)var2_2), (Object)v5, (long)-7842538276212289875L, (long)var2_2);
            var22_12 = false;
            v6 = new Object[2];
            v6[1] = (int)m44.a("s", (Object)var23_14, (long)-7838420070884662124L, (long)var2_2);
            v6[0] = var8_5;
            m44.a("r", (Object)var21_11, (Object)v6, (long)-7718198774114629127L, (long)var2_2);
            ** if (var20_13 != null) goto lbl-1000
        }
        catch (Throwable var24_15) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block26: {
                                    block27: {
                                        if (var2_2 <= 0L) break block26;
                                        v9 = var22_12;
                                        if (var20_13 != null) break block27;
                                        try {
                                            block32: {
                                                if (!v9) ** GOTO lbl85
                                                break block32;
                                                catch (Throwable v10) {
                                                    throw m44.a("m", (Object)v10, (long)-7872058910001275764L, (long)var2_2);
                                                }
                                            }
                                            v11 = new Object[2];
                                            v11[1] = var12_7;
                                            v11[0] = var21_11;
                                            m44.a("r", (Object)m44.a("s", (Object)this, (long)-8073662234204115558L, (long)var2_2), (Object)v11, (long)-8477265976879729630L, (long)var2_2);
                                            v9 = false;
                                        }
                                        catch (Throwable v12) {
                                            throw m44.a("m", (Object)v12, (long)-7872058910001275764L, (long)var2_2);
                                        }
                                    }
                                    var22_12 = v9;
                                }
                                try {
                                    if (var2_2 <= 0L || var20_13 == null) break block28;
lbl85:
                                    // 2 sources

                                    v13 = new Object[1];
                                    v13[0] = var4_3;
                                    m44.a("r", (Object)m44.a("s", (Object)this, (long)-8073662234204115558L, (long)var2_2), (Object)v13, (long)-8495844722236109028L, (long)var2_2);
                                }
                                catch (Throwable v14) {
                                    throw m44.a("m", (Object)v14, (long)-7872058910001275764L, (long)var2_2);
                                }
                            }
                            v15 = var24_15 instanceof RuntimeException;
                            if (var2_2 <= 0L || var20_13 != null) break block29;
                            try {
                                block33: {
                                    if (!v15) break block30;
                                    break block33;
                                    catch (Throwable v16) {
                                        throw m44.a("m", (Object)v16, (long)-7872058910001275764L, (long)var2_2);
                                    }
                                }
                                throw (RuntimeException)var24_15;
                            }
                            catch (Throwable v17) {
                                throw m44.a("m", (Object)v17, (long)-7872058910001275764L, (long)var2_2);
                            }
                        }
                        try {
                            v18 = var24_15;
                            if (var20_13 != null) break block31;
                            v15 = v18 instanceof t;
                        }
                        catch (Throwable v19) {
                            throw m44.a("m", (Object)v19, (long)-7872058910001275764L, (long)var2_2);
                        }
                    }
                    try {
                        if (v15) {
                            throw (t)var24_15;
                        }
                    }
                    catch (Throwable v20) {
                        throw m44.a("m", (Object)v20, (long)-7872058910001275764L, (long)var2_2);
                    }
                    v18 = var24_15;
                }
                throw (Error)v18;
            }
            catch (Throwable var25_16) {
                try {
                    if (var2_2 >= 0L && var22_12) {
                        v21 = new Object[3];
                        v21[2] = true;
                        v21[1] = var21_11;
                        v21[0] = var16_9;
                        m44.a("r", (Object)m44.a("s", (Object)this, (long)-8073662234204115558L, (long)var2_2), (Object)v21, (long)-7842538276212289875L, (long)var2_2);
                    }
                }
                catch (Throwable v22) {
                    throw m44.a("m", (Object)v22, (long)-7872058910001275764L, (long)var2_2);
                }
                throw var25_16;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var22_12) ** GOTO lbl137
                v7 = new Object[3];
                v7[2] = true;
                v7[1] = var21_11;
                v7[0] = var16_9;
                m44.a("r", (Object)m44.a("s", (Object)this, (long)-8073662234204115558L, (long)var2_2), (Object)v7, (long)-7842538276212289875L, (long)var2_2);
            }
            catch (Throwable v8) {
                throw m44.a("m", (Object)v8, (long)-7872058910001275764L, (long)var2_2);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl137:
        // 3 sources

    }

    private boolean W(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x1695A23804A4L;
                CallSite callSite = m44.a("l", (long)-2132608984846222235L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)lqz.a("r", (int)8798, (long)(0x7E70FE723C32D7D3L ^ l10));
                        object = m44.a("m", (Object)this, (Object)objectArray2, (long)-2089942427560671737L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("l", (Object)runtimeException, (long)-2219793887208427651L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("l", (Object)runtimeException, (long)-2219793887208427651L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void i(Object[] objectArray) {
        long l10;
        int n10 = (Integer)objectArray[0];
        long l11 = (Long)objectArray[1];
        long l12 = l10 = ((long)n10 << 48 | l11 << 16 >>> 16) ^ a;
        long l13 = l12 ^ 0x28DCDE8AEBFBL;
        long l14 = l12 ^ 0x67AE13F001A4L;
        long l15 = l12 ^ 0x477F9FFD9232L;
        int n11 = (int)(l15 >>> 48);
        int n12 = (int)(l15 << 16 >>> 32);
        int n13 = (int)(l15 << 48 >>> 48);
        long l16 = l12 ^ 0x52B5E07E876CL;
        long l17 = l12 ^ 0x531A689DB709L;
        ps ps2 = new ps((char)n11, (int)lqz.a("r", (int)9110, (long)(0x268D3FB2D442CF45L ^ l10)), n12, n13);
        boolean bl2 = true;
        CallSite callSite = m44.a("i", (long)-296580963107461664L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = ps2;
        objectArray2[0] = l16;
        m44.a("v", (Object)m44.a("w", (Object)this, (long)-1909295747715004434L, (long)l10), (Object)objectArray2, (long)-2179063884658446580L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l14;
            objectArray3[0] = (int)lqz.a("r", (int)18864, (long)(0x1CDAD8669D3DA41AL ^ l10));
            CallSite callSite2 = m44.a("h", (Object)this, (Object)objectArray3, (long)-1995980365282922153L, (long)l10);
            m44.a("u", (Object)this, (int)lqz.a("r", (int)5257, (long)(0x55D75968880778DDL ^ l10)), (long)-1862016470218611983L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = ps2;
            objectArray4[0] = l17;
            m44.a("v", (Object)m44.a("w", (Object)this, (long)-1909295747715004434L, (long)l10), (Object)objectArray4, (long)-477958090143554343L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("w", (Object)callSite2, (long)-482992218732310816L, (long)l10);
            objectArray5[0] = l13;
            m44.a("v", (Object)ps2, (Object)objectArray5, (long)-101555013141879923L, (long)l10);
            if (callSite != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l11 < 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = ps2;
                objectArray6[0] = l17;
                m44.a("v", (Object)m44.a("w", (Object)this, (long)-1909295747715004434L, (long)l10), (Object)objectArray6, (long)-477958090143554343L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("i", (Object)runtimeException, (long)-525633102590855432L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = ps2;
            objectArray7[0] = l17;
            m44.a("v", (Object)m44.a("w", (Object)this, (long)-1909295747715004434L, (long)l10), (Object)objectArray7, (long)-477958090143554343L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("i", (Object)runtimeException, (long)-525633102590855432L, (long)l10);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void C(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x16EFD739ED1CL;
        long l13 = l11 ^ 0x599D1A430743L;
        long l14 = l11 ^ 0x93AEEE5AF79L;
        long l15 = l11 ^ 0x6C86E9CD818BL;
        long l16 = l11 ^ 0x6D29612EB1EEL;
        qg qg2 = new qg(l14, (int)lqz.a("r", (int)21096, (long)(0x228F5314A6A538A3L ^ l10)));
        boolean bl2 = true;
        CallSite callSite = m44.a("n", (long)-214647637089639673L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = qg2;
        objectArray2[0] = l15;
        m44.a("q", (Object)m44.a("p", (Object)this, (long)-2060414897711513335L, (long)l10), (Object)objectArray2, (long)-1790929884952925717L, (long)l10);
        CallSite callSite2 = callSite;
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l13;
            objectArray3[0] = (int)lqz.a("r", (int)31098, (long)(0x4654560AD3561344L ^ l10));
            CallSite callSite3 = m44.a("o", (Object)this, (Object)objectArray3, (long)-2113344508327675984L, (long)l10);
            m44.a("r", (Object)this, (int)lqz.a("r", (int)31302, (long)(0x300752A466DC90C1L ^ l10)), (long)-2247305208943975402L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = qg2;
            objectArray4[0] = l16;
            m44.a("q", (Object)m44.a("p", (Object)this, (long)-2060414897711513335L, (long)l10), (Object)objectArray4, (long)-19477207683751362L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = (int)m44.a("p", (Object)callSite3, (long)-23873619258128377L, (long)l10);
            objectArray5[0] = l12;
            m44.a("q", (Object)qg2, (Object)objectArray5, (long)-544924062028683926L, (long)l10);
            if (callSite2 != null) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 <= 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = qg2;
                objectArray6[0] = l16;
                m44.a("q", (Object)m44.a("p", (Object)this, (long)-2060414897711513335L, (long)l10), (Object)objectArray6, (long)-19477207683751362L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("n", (Object)runtimeException, (long)-120562234147360737L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = qg2;
            objectArray7[0] = l16;
            m44.a("q", (Object)m44.a("p", (Object)this, (long)-2060414897711513335L, (long)l10), (Object)objectArray7, (long)-19477207683751362L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("n", (Object)runtimeException, (long)-120562234147360737L, (long)l10);
        }
    }

    /*
     * Exception decompiling
     */
    public final void h(Object[] var1_1) {
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
     * Exception decompiling
     */
    public final void Y(Object[] var1_1) {
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
     */
    public final void x(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = lqz.a ^ var2_2;
        var4_3 = v0 ^ 111942331267186L;
        var6_4 = v0 ^ 129893808979522L;
        v1 = v0 ^ 139944642661471L;
        var8_5 = (int)(v1 >>> 48);
        var9_6 = (int)(v1 << 16 >>> 32);
        var10_7 = (int)(v1 << 48 >>> 48);
        var11_8 = v0 ^ 63022457246749L;
        var13_9 = v0 ^ 73105270262120L;
        var15_10 = v0 ^ 13514058224341L;
        var17_11 = v0 ^ 115801717408942L;
        var19_12 = v0 ^ 15281296564912L;
        var22_13 = new pd(3, (char)var8_5, var9_6, (char)var10_7);
        var23_14 = true;
        var21_15 = m44.a("h", (long)-5883095496321699751L, (long)var2_2);
        v2 = new Object[2];
        v2[1] = var22_13;
        v2[0] = var15_10;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)-5748405816569507241L, (long)var2_2), (Object)v2, (long)-5441696288023135563L, (long)var2_2);
        try {
            v3 = new Object[2];
            v3[1] = var11_8;
            v3[0] = (int)lqz.a("r", (int)23581, (long)(876797790351484268L ^ var2_2));
            var24_16 = m44.a("i", (Object)this, (Object)v3, (long)-5623442800181418770L, (long)var2_2);
            m44.a("t", (Object)this, (int)lqz.a("r", (int)23581, (long)(876797790351484268L ^ var2_2)), (long)-5507454717910042808L, (long)var2_2);
            v4 = new Object[1];
            v4[0] = var17_11;
            m44.a("w", (Object)this, (Object)v4, (long)-5411532060043024971L, (long)var2_2);
            v5 = new Object[3];
            v5[2] = true;
            v5[1] = var22_13;
            v5[0] = var19_12;
            m44.a("w", (Object)m44.a("v", (Object)this, (long)-5748405816569507241L, (long)var2_2), (Object)v5, (long)-5988471003919584928L, (long)var2_2);
            var23_14 = false;
            v6 = new Object[2];
            v6[1] = (int)m44.a("v", (Object)var24_16, (long)-5983788718044767399L, (long)var2_2);
            v6[0] = var6_4;
            m44.a("w", (Object)var22_13, (Object)v6, (long)-6111830273838942668L, (long)var2_2);
            ** if (var21_15 != null) goto lbl-1000
        }
        catch (Throwable var25_17) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block26: {
                                    block27: {
                                        if (var2_2 < 0L) break block26;
                                        v9 = var23_14;
                                        if (var21_15 != null) break block27;
                                        try {
                                            block32: {
                                                if (!v9) ** GOTO lbl88
                                                break block32;
                                                catch (Throwable v10) {
                                                    throw m44.a("h", (Object)v10, (long)-5976895155154721983L, (long)var2_2);
                                                }
                                            }
                                            v11 = new Object[2];
                                            v11[1] = var13_9;
                                            v11[0] = var22_13;
                                            m44.a("w", (Object)m44.a("v", (Object)this, (long)-5748405816569507241L, (long)var2_2), (Object)v11, (long)-5361629747706655761L, (long)var2_2);
                                            v9 = false;
                                        }
                                        catch (Throwable v12) {
                                            throw m44.a("h", (Object)v12, (long)-5976895155154721983L, (long)var2_2);
                                        }
                                    }
                                    var23_14 = v9;
                                }
                                try {
                                    if (var2_2 <= 0L || var21_15 == null) break block28;
lbl88:
                                    // 2 sources

                                    v13 = new Object[1];
                                    v13[0] = var4_3;
                                    m44.a("w", (Object)m44.a("v", (Object)this, (long)-5748405816569507241L, (long)var2_2), (Object)v13, (long)-5344176713155841839L, (long)var2_2);
                                }
                                catch (Throwable v14) {
                                    throw m44.a("h", (Object)v14, (long)-5976895155154721983L, (long)var2_2);
                                }
                            }
                            v15 = var25_17 instanceof RuntimeException;
                            if (var2_2 < 0L || var21_15 != null) break block29;
                            try {
                                block33: {
                                    if (!v15) break block30;
                                    break block33;
                                    catch (Throwable v16) {
                                        throw m44.a("h", (Object)v16, (long)-5976895155154721983L, (long)var2_2);
                                    }
                                }
                                throw (RuntimeException)var25_17;
                            }
                            catch (Throwable v17) {
                                throw m44.a("h", (Object)v17, (long)-5976895155154721983L, (long)var2_2);
                            }
                        }
                        try {
                            v18 = var25_17;
                            if (var21_15 != null) break block31;
                            v15 = v18 instanceof t;
                        }
                        catch (Throwable v19) {
                            throw m44.a("h", (Object)v19, (long)-5976895155154721983L, (long)var2_2);
                        }
                    }
                    try {
                        if (v15) {
                            throw (t)var25_17;
                        }
                    }
                    catch (Throwable v20) {
                        throw m44.a("h", (Object)v20, (long)-5976895155154721983L, (long)var2_2);
                    }
                    v18 = var25_17;
                }
                throw (Error)v18;
            }
            catch (Throwable var26_18) {
                try {
                    if (var2_2 > 0L && var23_14) {
                        v21 = new Object[3];
                        v21[2] = true;
                        v21[1] = var22_13;
                        v21[0] = var19_12;
                        m44.a("w", (Object)m44.a("v", (Object)this, (long)-5748405816569507241L, (long)var2_2), (Object)v21, (long)-5988471003919584928L, (long)var2_2);
                    }
                }
                catch (Throwable v22) {
                    throw m44.a("h", (Object)v22, (long)-5976895155154721983L, (long)var2_2);
                }
                throw var26_18;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var23_14) ** GOTO lbl140
                v7 = new Object[3];
                v7[2] = true;
                v7[1] = var22_13;
                v7[0] = var19_12;
                m44.a("w", (Object)m44.a("v", (Object)this, (long)-5748405816569507241L, (long)var2_2), (Object)v7, (long)-5988471003919584928L, (long)var2_2);
            }
            catch (Throwable v8) {
                throw m44.a("h", (Object)v8, (long)-5976895155154721983L, (long)var2_2);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl140:
        // 3 sources

    }

    private boolean V(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x5B57880FCB60L;
                CallSite callSite = m44.a("h", (long)3288541075582022561L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)lqz.a("r", (int)8798, (long)(0x7E70B3B016051817L ^ l10));
                        object = m44.a("i", (Object)this, (Object)objectArray2, (long)3259275365973838275L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("h", (Object)runtimeException, (long)3383884449214914745L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("h", (Object)runtimeException, (long)3383884449214914745L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Exception decompiling
     */
    public final void Ks(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[CASE]], but top level block is 1[TRYBLOCK]
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
    public final void Kd(Object[] var1_1) {
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
     * Exception decompiling
     */
    public final void K7(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [20[CASE]], but top level block is 2[TRYBLOCK]
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

    private static void KG(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        int[] nArray = new int[lqz.a("r", (int)22002, (long)(0x58756171AD8A8EEEL ^ l10))];
        nArray[0] = 0;
        nArray[1] = (int)lqz.a("r", (int)3781, (long)(0x56878892C8CBD431L ^ l10));
        nArray[2] = (int)lqz.a("r", (int)3648, (long)(0x3970B23F3042554AL ^ l10));
        nArray[3] = 0;
        nArray[4] = (int)lqz.a("r", (int)13391, (long)(0x513168EC7F2A6FDDL ^ l10));
        nArray[5] = 0;
        nArray[lqz.a("r", (int)20282, (long)(0x54D4FEA1403C15CFL ^ l10))] = (int)lqz.a("r", (int)25365, (long)(0x64AE849CCE8D385FL ^ l10));
        nArray[lqz.a("r", (int)27428, (long)(0x6FA7314F3545309DL ^ l10))] = 0;
        nArray[lqz.a("r", (int)28230, (long)(0x30F656AF75BBB48BL ^ l10))] = 0;
        nArray[lqz.a("r", (int)21857, (long)(0x7156C4BBD6328E9FL ^ l10))] = 0;
        nArray[lqz.a("r", (int)23995, (long)(0x13E948DB90E50677L ^ l10))] = 0;
        nArray[lqz.a("r", (int)21395, (long)(0x6CAF971BF3CF08FCL ^ l10))] = 0;
        nArray[lqz.a("r", (int)8199, (long)(0x5F16282895DC7B51L ^ l10))] = (int)lqz.a("r", (int)15028, (long)(0x4A3E40627D1861CBL ^ l10));
        nArray[lqz.a("r", (int)11026, (long)(0x18D5A0D1061670B6L ^ l10))] = (int)lqz.a("r", (int)15028, (long)(0x4A3E40627D1861CBL ^ l10));
        nArray[lqz.a("r", (int)15317, (long)(0x6896607A6EA5612BL ^ l10))] = 0;
        nArray[lqz.a("r", (int)12647, (long)(0x36CDEDAF49CAEA37L ^ l10))] = (int)lqz.a("r", (int)15028, (long)(0x4A3E40627D1861CBL ^ l10));
        nArray[lqz.a("r", (int)15559, (long)(0x41B70F64C4576732L ^ l10))] = (int)lqz.a("r", (int)15028, (long)(0x4A3E40627D1861CBL ^ l10));
        nArray[lqz.a("r", (int)13970, (long)(0x328C6C07E189EC6FL ^ l10))] = 0;
        nArray[lqz.a("r", (int)18527, (long)(0x20BD775CB30A12BBL ^ l10))] = (int)lqz.a("r", (int)15028, (long)(0x4A3E40627D1861CBL ^ l10));
        nArray[lqz.a("r", (int)777, (long)(0x17053303C89458B9L ^ l10))] = (int)lqz.a("r", (int)15028, (long)(0x4A3E40627D1861CBL ^ l10));
        nArray[lqz.a("r", (int)12353, (long)(0x69512879D20AEB5FL ^ l10))] = (int)lqz.a("r", (int)15028, (long)(0x4A3E40627D1861CBL ^ l10));
        nArray[lqz.a("r", (int)30663, (long)(0x4043841CF689ACE8L ^ l10))] = 0;
        nArray[lqz.a("r", (int)25670, (long)(0x2FBD54F2A551BEB9L ^ l10))] = (int)lqz.a("r", (int)22911, (long)(0x36606D4316F782E0L ^ l10));
        nArray[lqz.a("r", (int)3305, (long)(0x2DA618CABB3CD7FBL ^ l10))] = (int)lqz.a("r", (int)15028, (long)(0x4A3E40627D1861CBL ^ l10));
        nArray[lqz.a("r", (int)8798, (long)(0x7E70C0C2B1C0F90FL ^ l10))] = 0;
        nArray[lqz.a("r", (int)15930, (long)(0x63BB2C7BDFD265B2L ^ l10))] = (int)lqz.a("r", (int)15028, (long)(0x4A3E40627D1861CBL ^ l10));
        nArray[lqz.a("r", (int)15462, (long)(0x23B76200E0E785L ^ l10))] = 0;
        nArray[lqz.a("r", (int)16289, (long)(0x3955516FE51864B5L ^ l10))] = (int)lqz.a("r", (int)15028, (long)(0x4A3E40627D1861CBL ^ l10));
        nArray[lqz.a("r", (int)17124, (long)(0x1743ACB2CD679970L ^ l10))] = 0;
        nArray[lqz.a("r", (int)10393, (long)(0x60C4D30386A2F3CEL ^ l10))] = (int)lqz.a("r", (int)15028, (long)(0x4A3E40627D1861CBL ^ l10));
        nArray[lqz.a("r", (int)8823, (long)(0x112C8B434DDAF9ADL ^ l10))] = 0;
        nArray[lqz.a("r", (int)10519, (long)(0x184B3CF77420F299L ^ l10))] = (int)lqz.a("r", (int)15028, (long)(0x4A3E40627D1861CBL ^ l10));
        nArray[lqz.a("r", (int)16712, (long)(0x7930D528CC9C9A68L ^ l10))] = (int)lqz.a("r", (int)23339, (long)(0x756BA20CE22D8055L ^ l10));
        nArray[lqz.a("r", (int)31493, (long)(0x5463DF02B500201DL ^ l10))] = (int)lqz.a("r", (int)15028, (long)(0x4A3E40627D1861CBL ^ l10));
        nArray[lqz.a("r", (int)23813, (long)(0xE2A01BA78AD863DL ^ l10))] = (int)lqz.a("r", (int)15028, (long)(0x4A3E40627D1861CBL ^ l10));
        nArray[lqz.a("r", (int)21096, (long)(0x228F75D5315D091DL ^ l10))] = 0;
        nArray[lqz.a("r", (int)17374, (long)(0x48FDD5B0620D1910L ^ l10))] = (int)lqz.a("r", (int)23339, (long)(0x756BA20CE22D8055L ^ l10));
        nArray[lqz.a("r", (int)9384, (long)(0x1B80FA9FDAD2FE46L ^ l10))] = 0;
        nArray[lqz.a("r", (int)26117, (long)(0x3B1B9C546C133D83L ^ l10))] = 0;
        nArray[lqz.a("r", (int)3504, (long)(0x2C75E956E1ACD63FL ^ l10))] = 0;
        nArray[lqz.a("r", (int)20832, (long)(0x1B6F2004A8B48A76L ^ l10))] = 0;
        nArray[lqz.a("r", (int)23581, (long)(0xC2B44FCE329078CL ^ l10))] = 0;
        nArray[lqz.a("r", (int)13545, (long)(0x1DC1634EB8586F94L ^ l10))] = 0;
        nArray[lqz.a("r", (int)16391, (long)(0x45AB732D0C851BD4L ^ l10))] = 0;
        nArray[lqz.a("r", (int)9110, (long)(0x268D27404A09F81CL ^ l10))] = 0;
        nArray[lqz.a("r", (int)5034, (long)(0x770C80CC4A0FC8C6L ^ l10))] = (int)lqz.a("r", (int)3295, (long)(0x4B91564D093ED77AL ^ l10));
        nArray[lqz.a("r", (int)24525, (long)(0x4C4FC3658333842AL ^ l10))] = 0;
        nArray[lqz.a("r", (int)29062, (long)(0x76E1A00FA4DE2ACAL ^ l10))] = 0;
        nArray[lqz.a("r", (int)14562, (long)(0x279098C0E916375L ^ l10))] = 0;
        nArray[lqz.a("r", (int)2623, (long)(0x274E3951D29DD14DL ^ l10))] = (int)lqz.a("r", (int)10917, (long)(0x683D64A0DBEF106L ^ l10));
        nArray[lqz.a("r", (int)19691, (long)(0x160962BB3F9D1781L ^ l10))] = (int)lqz.a("r", (int)10917, (long)(0x683D64A0DBEF106L ^ l10));
        nArray[lqz.a("r", (int)9645, (long)(0x3CAD4E6BF0F47E5EL ^ l10))] = (int)lqz.a("r", (int)10917, (long)(0x683D64A0DBEF106L ^ l10));
        nArray[lqz.a("r", (int)8584, (long)(0x5E6851B05EE7AE9L ^ l10))] = (int)lqz.a("r", (int)10917, (long)(0x683D64A0DBEF106L ^ l10));
        nArray[lqz.a("r", (int)18721, (long)(0x10926A5D6FEC92C1L ^ l10))] = (int)lqz.a("r", (int)10917, (long)(0x683D64A0DBEF106L ^ l10));
        nArray[lqz.a("r", (int)21312, (long)(0x31F5B47F2897084CL ^ l10))] = 0;
        nArray[lqz.a("r", (int)31940, (long)(0x27C700F1DCD0274DL ^ l10))] = 0;
        nArray[lqz.a("r", (int)24329, (long)(0x252C02FF8F5E05ECL ^ l10))] = 0;
        nArray[lqz.a("r", (int)23174, (long)(0x2DDFD56007A601C8L ^ l10))] = (int)lqz.a("r", (int)10917, (long)(0x683D64A0DBEF106L ^ l10));
        nArray[lqz.a("r", (int)22136, (long)(0xA2CCDC5F6E28C8AL ^ l10))] = (int)lqz.a("r", (int)10917, (long)(0x683D64A0DBEF106L ^ l10));
        nArray[lqz.a("r", (int)20259, (long)(0x2CEBF3BF5AA595D3L ^ l10))] = (int)lqz.a("r", (int)10917, (long)(0x683D64A0DBEF106L ^ l10));
        nArray[lqz.a("r", (int)12801, (long)(0xF084DB7855AE964L ^ l10))] = (int)lqz.a("r", (int)10917, (long)(0x683D64A0DBEF106L ^ l10));
        nArray[lqz.a("r", (int)11074, (long)(0x6D5207DE58CE701BL ^ l10))] = 0;
        nArray[lqz.a("r", (int)18174, (long)(0x7C6824B55F769D12L ^ l10))] = 0;
        nArray[lqz.a("r", (int)29099, (long)(0x2079BD549E4DAA87L ^ l10))] = (int)lqz.a("r", (int)23339, (long)(0x756BA20CE22D8055L ^ l10));
        nArray[lqz.a("r", (int)16227, (long)(0x5A104395B300E4DFL ^ l10))] = (int)lqz.a("r", (int)23339, (long)(0x756BA20CE22D8055L ^ l10));
        nArray[lqz.a("r", (int)26108, (long)(0x57A3B37652BABEEFL ^ l10))] = 0;
        nArray[lqz.a("r", (int)9874, (long)(0x23FFCAD5BF2FFDB1L ^ l10))] = 0;
        nArray[lqz.a("r", (int)10612, (long)(0x72018AD1B502F2C5L ^ l10))] = 0;
        nArray[lqz.a("r", (int)24168, (long)(0x558356FE180E05F3L ^ l10))] = 0;
        nArray[lqz.a("r", (int)29624, (long)(0x487EA9AD581AA84EL ^ l10))] = 0;
        nArray[lqz.a("r", (int)2683, (long)(0x2E218B37DACF514AL ^ l10))] = 0;
        m44.a("k", (int[])nArray, (long)-3233246603222661513L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    public final void Ko(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [12[CASE]], but top level block is 2[TRYBLOCK]
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

    private static Throwable a(Throwable throwable) {
        return throwable;
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

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x612;
        if (e[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = d[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lqz", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lqz.e[n11] = n12;
        }
        return e[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = lqz.a(n10, l10);
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
            throw new RuntimeException("com/zelix/lqz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lqz.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

