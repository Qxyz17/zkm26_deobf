/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._u;
import com.zelix._v;
import com.zelix.b0;
import com.zelix.bc;
import com.zelix.ee;
import com.zelix.h1;
import com.zelix.js;
import com.zelix.k_;
import com.zelix.kw;
import com.zelix.l6q;
import com.zelix.lb6;
import com.zelix.loe;
import com.zelix.lox;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.o_;
import com.zelix.prr;
import com.zelix.x8;
import com.zelix.y_;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
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
public abstract class b1
extends b0 {
    int d;
    String C;
    String o;
    private int u;
    String V;
    int P;
    boolean b;
    private boolean y;
    List J;
    private static final long a;
    private static final String[] j;
    private static final String[] k;
    private static final Map l;
    private static final long[] I;
    private static final Integer[] L;
    private static final Map M;

    public String H(long l10) {
        l10 = a ^ l10;
        int n10 = this.W.lastIndexOf((int)b1.e("g", (int)30892, (long)(0x52698023244DA5D7L ^ l10)));
        return this.W.substring(0, n10 + 1);
    }

    public void O(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        l10 = a ^ l10;
        m44.a("p", (Object)this, (int)n10, (long)661744183874508155L, (long)l10);
    }

    public abstract bc z(Object[] var1);

    public final boolean T(long l10) {
        l10 = a ^ l10;
        return this.V.equals(b1.b("a", (int)15222, (long)(0x4BCF6FB299E260A5L ^ l10)));
    }

    /*
     * Exception decompiling
     */
    public Enumeration N(Object[] var1_1) {
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
    public final void V(Object[] var1_1) {
        block9: {
            block8: {
                var2_2 = (Boolean)var1_1[0];
                var3_3 = (Long)var1_1[1];
                var3_3 = b1.a ^ var3_3;
                var5_4 = m44.a("k", (long)696639911513520354L, (long)var3_3);
                try {
                    try {
                        if (var5_4 == false) break block8;
                        if (var2_2) {
                        }
                        ** GOTO lbl21
                    }
                    catch (n9 v0) {
                        throw m44.a("k", (Object)v0, (long)605383419789320487L, (long)var3_3);
                    }
                    m44.a("t", (Object)this, (Object)new Object[]{(int)b1.e("g", (int)12767, (long)(2443298953731720389L ^ var3_3))}, (long)1434370496202875648L, (long)var3_3);
                }
                catch (n9 v1) {
                    throw m44.a("k", (Object)v1, (long)605383419789320487L, (long)var3_3);
                }
            }
            try {
                if (var3_3 < 0L || var5_4 != false) break block9;
lbl21:
                // 2 sources

                m44.a("t", (Object)this, (Object)new Object[]{(int)b1.e("g", (int)12767, (long)(2443298953731720389L ^ var3_3))}, (long)1181686877753224970L, (long)var3_3);
            }
            catch (n9 v2) {
                throw m44.a("k", (Object)v2, (long)605383419789320487L, (long)var3_3);
            }
        }
    }

    public final String e(Object[] objectArray) {
        Map map = (Map)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x39FCE45A40DCL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = map;
        objectArray2[1] = l11;
        objectArray2[0] = true;
        return m44.a("v", (Object)this, (Object)objectArray2, (long)-5442098336092545413L, (long)l10);
    }

    b1(_4 _42, h1 h12, long l10, l6q l6q2, PrintWriter printWriter) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x60EBCF5DEFD6L;
        long l13 = l11 ^ 0x29BF1932665EL;
        super(_42, h12, l13, l6q2, printWriter);
        this.d = -1;
        this.P = -1;
        m44.a("p", (Object)this, (int)-1, (long)4613561601129520211L, (long)l10);
        Object[] objectArray = new Object[1];
        objectArray[0] = l12;
        m44.a("m", (Object)this, (Object)objectArray, (long)4787685039254028882L, (long)l10);
    }

    @Override
    public final void R(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l11 = l10;
        long l12 = l11 ^ 0x23F160EA0FDFL;
        long l13 = l12 >>> 16;
        int n10 = (int)(l12 << 48 >>> 48);
        long l14 = l11 ^ 0L;
        this.o = string;
        this.J = js.E(this.o, l13, (short)n10, true);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = string;
        objectArray2[0] = l14;
        super.R(objectArray2);
    }

    /*
     * Unable to fully structure code
     */
    public final void g(Object[] var1_1) {
        block9: {
            block8: {
                var3_2 = (Long)var1_1[0];
                var2_3 = (Boolean)var1_1[1];
                var3_2 = b1.a ^ var3_2;
                var5_4 = m44.a("n", (long)7878962208565566495L, (long)var3_2);
                try {
                    try {
                        if (var5_4 == false) break block8;
                        if (var2_3) {
                        }
                        ** GOTO lbl21
                    }
                    catch (n9 v0) {
                        throw m44.a("n", (Object)v0, (long)7825995218408981978L, (long)var3_2);
                    }
                    m44.a("q", (Object)this, (Object)new Object[]{2}, (long)8582361643254630397L, (long)var3_2);
                }
                catch (n9 v1) {
                    throw m44.a("n", (Object)v1, (long)7825995218408981978L, (long)var3_2);
                }
            }
            try {
                if (var3_2 < 0L || var5_4 != false) break block9;
lbl21:
                // 2 sources

                m44.a("q", (Object)this, (Object)new Object[]{2}, (long)8402439104630934519L, (long)var3_2);
            }
            catch (n9 v2) {
                throw m44.a("n", (Object)v2, (long)7825995218408981978L, (long)var3_2);
            }
        }
    }

    static int J(Object[] objectArray) {
        int n10;
        block10: {
            block11: {
                CallSite callSite;
                long l10;
                block8: {
                    String string;
                    block9: {
                        string = (String)objectArray[0];
                        l10 = (Long)objectArray[1];
                        l10 = a ^ l10;
                        callSite = m44.a("l", (long)-4684322900310037990L, (long)l10);
                        try {
                            try {
                                n10 = string.equals("D");
                                if (callSite != false) break block8;
                                if (n10 == 0) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("l", (Object)n92, (long)-6383370657816015320L, (long)l10);
                            }
                            return 2;
                        }
                        catch (n9 n93) {
                            throw m44.a("l", (Object)n93, (long)-6383370657816015320L, (long)l10);
                        }
                    }
                    n10 = string.equals("J");
                }
                try {
                    try {
                        if (callSite != false) break block10;
                        if (n10 == 0) break block11;
                    }
                    catch (n9 n94) {
                        throw m44.a("l", (Object)n94, (long)-6383370657816015320L, (long)l10);
                    }
                    return 2;
                }
                catch (n9 n95) {
                    throw m44.a("l", (Object)n95, (long)-6383370657816015320L, (long)l10);
                }
            }
            n10 = 1;
        }
        return n10;
    }

    @Override
    public final boolean j(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0xA54E7732801L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("v", (Object)this.E, (Object)objectArray2, (long)-3371959247588369619L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    public final int d(Object[] var1_1) {
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

    public final boolean C(long l10) {
        l10 = a ^ l10;
        return this.V.equals(b1.b("a", (int)31347, (long)(0x7AD3CB53FD7B8767L ^ l10)));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public String M(long var1_1) {
        block10: {
            block11: {
                v0 = var1_1;
                v1 = v0 ^ 89020960911590L;
                var3_2 = v1 >>> 16;
                var5_3 = (int)(v1 << 48 >>> 48);
                v2 = v0 ^ 50096488027388L;
                var6_4 = (int)(v2 >>> 48);
                var7_5 = (int)(v2 << 16 >>> 48);
                var8_6 = (int)(v2 << 32 >>> 32);
                var10_7 = new StringBuilder();
                var10_7.append(js.E((char)var6_4, (short)var7_5, this.B(), var8_6));
                v3 = m44.a("k", (long)4794891892438603373L, (long)var1_1);
                var10_7.append(" ");
                var10_7.append(this.m());
                var9_8 = v3;
                var10_7.append((char)b1.e("g", (int)30321, (long)(7080995556586278938L ^ var1_1)));
                var11_9 = js.E(this.B(), var3_2, (short)var5_3, false);
                for (var12_10 = 0; var12_10 < var11_9.size(); ++var12_10) {
                    block9: {
                        block12: {
                            try {
                                try {
                                    try {
                                        v4 = var10_7;
                                        if (var1_1 >= 0L) {
                                            v5 = js.E((char)var6_4, (short)var7_5, (String)var11_9.get(var12_10), var8_6);
                                            if (var9_8 != false) break block9;
                                            v4.append((String)v5);
                                            v4 = var10_7;
                                        }
                                        if (var1_1 <= 0L) break block10;
                                        v6 /* !! */  = (CallSite)var12_10;
                                        if (var9_8 != false) break block11;
                                    }
                                    catch (n9 v7) {
                                        throw m44.a("k", (Object)v7, (long)6565869838274097759L, (long)var1_1);
                                    }
                                    if (v6 /* !! */  >= var11_9.size() - 1) break block12;
                                }
                                catch (n9 v8) {
                                    throw m44.a("k", (Object)v8, (long)6565869838274097759L, (long)var1_1);
                                }
                                v9 = 3747;
                                v10 = 7735308384759234713L ^ var1_1;
lbl47:
                                // 2 sources

                                while (true) {
                                    v5 = b1.b("a", (int)v9, (long)v10);
                                    break block9;
                                    break;
                                }
                            }
                            catch (n9 v11) {
                                throw m44.a("k", (Object)v11, (long)6565869838274097759L, (long)var1_1);
                            }
                        }
                        v5 = "";
                    }
                    v4.append((String)v5);
                    if (var9_8 == false) continue;
                }
                v12 = var10_7;
                v9 = 30892;
                v10 = 5938528752087490252L ^ var1_1;
                ** while (var1_1 < 0L)
lbl62:
                // 1 sources

                v6 /* !! */  = b1.e("g", (int)v9, (long)v10);
            }
            v12.append((char)v6 /* !! */ );
            v4 = var10_7;
        }
        return v4.toString();
    }

    public final boolean M(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x5AB2A0F11BC7L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("w", (Object)this.E, (Object)objectArray2, (long)-5883414783961190057L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    public Enumeration e(Object[] var1_1) {
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
     * Could not resolve type clashes
     */
    void D(Object[] var1_1) {
        block29: {
            block34: {
                block32: {
                    block31: {
                        block30: {
                            block28: {
                                var2_2 = (ee)var1_1[0];
                                var7_3 = (Map)var1_1[1];
                                var5_4 = (Boolean)var1_1[2];
                                var3_5 = (Long)var1_1[3];
                                var6_6 = (_v)var1_1[4];
                                v0 = var3_5 = b1.a ^ var3_5;
                                var8_7 = v0 ^ 117639961898299L;
                                var10_8 = v0 ^ 139760906629877L;
                                var12_9 = v0 ^ 58641088539251L;
                                var14_10 = v0 ^ 62493995904408L;
                                var16_11 = v0 ^ 95058174561461L;
                                var18_12 = v0 ^ 115563102406855L;
                                var20_13 = v0 ^ 28276742443125L;
                                var22_14 = m44.a("k", (long)-5885445951243486539L, (long)var3_5);
                                try {
                                    try {
                                        v1 /* !! */  = this.T(var16_11);
                                        if (var22_14 != false) break block28;
                                        if (v1 /* !! */ ) break block29;
                                    }
                                    catch (n9 v2) {
                                        throw m44.a("k", (Object)v2, (long)-5204202904710439289L, (long)var3_5);
                                    }
                                    v1 /* !! */  = this.C(var12_9);
                                }
                                catch (n9 v3) {
                                    throw m44.a("k", (Object)v3, (long)-5204202904710439289L, (long)var3_5);
                                }
                            }
                            try {
                                try {
                                    v4 = var22_14;
                                    if (var3_5 > 0L) {
                                        if (v4 != false) break block30;
                                        if (v1 /* !! */ ) break block29;
                                    }
                                    ** GOTO lbl50
                                }
                                catch (n9 v5) {
                                    throw m44.a("k", (Object)v5, (long)-5204202904710439289L, (long)var3_5);
                                }
                                v1 /* !! */  = this.D(var8_7);
                            }
                            catch (n9 v6) {
                                throw m44.a("k", (Object)v6, (long)-5204202904710439289L, (long)var3_5);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (var3_5 < 0L) break block31;
                                    v4 = var22_14;
lbl50:
                                    // 2 sources

                                    if (v4 != false) break block31;
                                    if (v1 /* !! */ ) break block29;
                                }
                                catch (n9 v7) {
                                    throw m44.a("k", (Object)v7, (long)-5204202904710439289L, (long)var3_5);
                                }
                                v8 = this;
                                if (var22_14 != false) break block32;
                            }
                            catch (n9 v9) {
                                throw m44.a("k", (Object)v9, (long)-5204202904710439289L, (long)var3_5);
                            }
                            v10 = new Object[1];
                            v10[0] = var20_13;
                            v1 /* !! */  = m44.a("t", (Object)v8, (Object)v10, (long)-5724417316823516137L, (long)var3_5);
                        }
                        catch (n9 v11) {
                            throw m44.a("k", (Object)v11, (long)-5204202904710439289L, (long)var3_5);
                        }
                    }
                    try {
                        block33: {
                            try {
                                try {
                                    if (v1 /* !! */ ) break block33;
                                    v8 = this;
                                    if (var22_14 != false) break block32;
                                }
                                catch (n9 v12) {
                                    throw m44.a("k", (Object)v12, (long)-5204202904710439289L, (long)var3_5);
                                }
                                if (v8.f(var14_10)) break block29;
                            }
                            catch (n9 v13) {
                                throw m44.a("k", (Object)v13, (long)-5204202904710439289L, (long)var3_5);
                            }
                        }
                        v8 = this;
                    }
                    catch (n9 v14) {
                        throw m44.a("k", (Object)v14, (long)-5204202904710439289L, (long)var3_5);
                    }
                }
                var23_15 = v8.B(var10_8);
                var24_16 = var7_3.put(var23_15, var6_6);
                try {
                    try {
                        v15 = var24_16;
                        if (var22_14 != false || v15 == null) break block34;
                    }
                    catch (n9 v16) {
                        throw m44.a("k", (Object)v16, (long)-5204202904710439289L, (long)var3_5);
                    }
                    v15 = var7_3.put(var23_15, var24_16);
                }
                catch (n9 v17) {
                    throw m44.a("k", (Object)v17, (long)-5204202904710439289L, (long)var3_5);
                }
            }
            try {
                if (var3_5 >= 0L && var5_4) {
                    v18 = new Object[2];
                    v18[1] = var23_15;
                    v18[0] = var18_12;
                    m44.a("t", (Object)var2_2, (Object)v18, (long)-5738261614817812550L, (long)var3_5);
                }
            }
            catch (n9 v19) {
                throw m44.a("k", (Object)v19, (long)-5204202904710439289L, (long)var3_5);
            }
        }
    }

    /*
     * Exception decompiling
     */
    public ArrayList B(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[DOLOOP], 7[DOLOOP]], but top level block is 2[TRYBLOCK]
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

    public String R(Object[] objectArray) {
        HashMap hashMap = (HashMap)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x53B3F8003388L;
        long l13 = l11 ^ 0xD9690171ADAL;
        long l14 = l11 ^ 0x2D6816A94E98L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l13;
        return (String)((Object)m44.a("p", (Object)this, (long)l12, (long)7427363557395405613L, (long)l10)) + loe.p((String)((Object)m44.a("p", (Object)this, (Object)objectArray2, (long)6934613843475810269L, (long)l10)), hashMap, l14);
    }

    public final boolean N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x16AA6F5A3667L;
        return this.i(l11, 2);
    }

    b1(_4 _42, byte by2, int n10, int n11, h1 h12, l6q l6q2) {
        long l10;
        long l11 = l10 = ((long)by2 << 56 | (long)n10 << 32 >>> 8 | (long)n11 << 40 >>> 40) ^ a;
        long l12 = l11 ^ 0x159602CCC0BBL;
        long l13 = l11 ^ 0x64065C50FD4FL;
        super(_42, h12, l13, l6q2);
        this.d = -1;
        this.P = -1;
        m44.a("u", (Object)this, (int)-1, (long)8028753378809230142L, (long)l10);
        Object[] objectArray = new Object[1];
        objectArray[0] = l12;
        m44.a("h", (Object)this, (Object)objectArray, (long)7862215470330506559L, (long)l10);
    }

    public String g(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        int n10 = this.o.lastIndexOf((int)b1.e("g", (int)30892, (long)(0x526998AE1222D629L ^ l10)));
        return this.o.substring(0, n10 + 1);
    }

    public final List v(int n10, int n11, int n12) {
        List list;
        block18: {
            long l10 = ((long)n10 << 32 | (long)n11 << 48 >>> 32 | (long)n12 << 48 >>> 48) ^ a;
            long l11 = l10 ^ 0x481B527678CEL;
            List list2 = js.A(this.o, l11);
            int n13 = list2.size();
            int n14 = 0;
            CallSite callSite = m44.a("n", (long)-7012141525865664537L, (long)l10);
            while (n14 < n13) {
                Object object;
                block21: {
                    block19: {
                        list = list2;
                        Object object2 = callSite;
                        if (n10 >= 0) {
                            if (object2 == false) break block18;
                            object2 = n14;
                        }
                        String string = (String)list.get((int)object2);
                        try {
                            String string2;
                            block20: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            string2 = string;
                                                            if (callSite == false) break block19;
                                                            if (string2.equals("B")) break block20;
                                                        }
                                                        catch (n9 n92) {
                                                            throw m44.a("n", (Object)n92, (long)-6961464264273316318L, (long)l10);
                                                        }
                                                        string2 = string;
                                                        if (callSite == false) break block19;
                                                    }
                                                    catch (n9 n93) {
                                                        throw m44.a("n", (Object)n93, (long)-6961464264273316318L, (long)l10);
                                                    }
                                                    if (n12 <= 0) break block19;
                                                    if (string2.equals("C")) break block20;
                                                }
                                                catch (n9 n94) {
                                                    throw m44.a("n", (Object)n94, (long)-6961464264273316318L, (long)l10);
                                                }
                                                string2 = string;
                                                if (callSite == false) break block19;
                                            }
                                            catch (n9 n95) {
                                                throw m44.a("n", (Object)n95, (long)-6961464264273316318L, (long)l10);
                                            }
                                            if (n10 < 0) break block19;
                                            if (string2.equals("S")) break block20;
                                        }
                                        catch (n9 n96) {
                                            throw m44.a("n", (Object)n96, (long)-6961464264273316318L, (long)l10);
                                        }
                                        string2 = string;
                                        if (callSite == false) break block19;
                                    }
                                    catch (n9 n97) {
                                        throw m44.a("n", (Object)n97, (long)-6961464264273316318L, (long)l10);
                                    }
                                    object = string2.equals("Z");
                                    if (n11 <= 0) break block21;
                                    if (object == false) break block19;
                                }
                                catch (n9 n98) {
                                    throw m44.a("n", (Object)n98, (long)-6961464264273316318L, (long)l10);
                                }
                            }
                            string2 = list2.set(n14, "I");
                        }
                        catch (n9 n99) {
                            throw m44.a("n", (Object)n99, (long)-6961464264273316318L, (long)l10);
                        }
                    }
                    ++n14;
                    object = callSite;
                }
                if (object != false) continue;
            }
            list = list2;
        }
        return list;
    }

    /*
     * Unable to fully structure code
     */
    public final void T(Object[] var1_1) {
        block9: {
            block8: {
                var2_2 = (Boolean)var1_1[0];
                var3_3 = (Long)var1_1[1];
                var3_3 = b1.a ^ var3_3;
                var5_4 = m44.a("h", (long)8942331407402863953L, (long)var3_3);
                try {
                    try {
                        if (var5_4 == false) break block8;
                        if (var2_2) {
                        }
                        ** GOTO lbl21
                    }
                    catch (n9 v0) {
                        throw m44.a("h", (Object)v0, (long)9067360429008376980L, (long)var3_3);
                    }
                    m44.a("w", (Object)this, (Object)new Object[]{4}, (long)7373682430868674227L, (long)var3_3);
                }
                catch (n9 v1) {
                    throw m44.a("h", (Object)v1, (long)9067360429008376980L, (long)var3_3);
                }
            }
            try {
                if (var3_3 <= 0L || var5_4 != false) break block9;
lbl21:
                // 2 sources

                m44.a("w", (Object)this, (Object)new Object[]{4}, (long)7337855503784401593L, (long)var3_3);
            }
            catch (n9 v2) {
                throw m44.a("h", (Object)v2, (long)9067360429008376980L, (long)var3_3);
            }
        }
    }

    public int k(Object[] objectArray) {
        return this.Z;
    }

    @Override
    protected String y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return m44.a("p", (Object)this, (long)3123342812071824851L, (long)l10);
    }

    public final String x(Object[] objectArray) {
        return this.V + this.o;
    }

    public String a(long l10) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x29816F4FB5B9L;
        long l13 = l11 ^ 0x11F2DF9E9205L;
        return this.m() + loe.p(this.H(l12), null, l13);
    }

    public void d(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        m44.a("u", (Object)this, (boolean)true, (long)5202032844456895247L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    public static b1 K(Object[] var0) {
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

    public String C(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x58F281338DDCL;
        return js.u(this.o, false, l11, true);
    }

    public final loe B(long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x3195A983EEAAL;
        return new loe(this.Z(l11), this.V());
    }

    public int x(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("t", (Object)this, (long)-8925981365254825867L, (long)l10);
    }

    public o_ h(long l10) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x7984B715B117L;
        long l13 = l11 ^ 0xB58F817DB39L;
        long l14 = l13 >>> 32;
        int n10 = (int)(l13 << 32 >>> 32);
        return new o_(this.s(l14, n10), this.Z(l12), this.V());
    }

    private void n(Object[] objectArray) {
        block5: {
            int n10;
            long l10;
            block4: {
                long l11 = (Long)objectArray[0];
                long l12 = l11 = a ^ l11;
                long l13 = l12 ^ 0x5D1AB53DF28CL;
                l10 = l13 >>> 16;
                n10 = (int)(l13 << 48 >>> 48);
                long l14 = l12 ^ 0xAFDCD96565EL;
                long l15 = l12 ^ 0x55CBADB2070EL;
                CallSite callSite = m44.a("i", (long)1781346779993827824L, (long)l11);
                try {
                    b1 b12;
                    try {
                        b12 = this;
                        if (callSite == false) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l15;
                        if (m44.a("v", (Object)b12, (Object)objectArray2, (long)2205959480387770989L, (long)l11) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)n92, (long)1834278109704761397L, (long)l11);
                    }
                    this.o = this.A.V();
                    this.V = this.H.V();
                    m44.a("u", (Object)this, (String)((String)((Object)m44.a("v", (Object)this, (long)l14, (long)199586114714631931L, (long)l11))).toLowerCase(), (long)1774228368044441108L, (long)l11);
                    b12 = this;
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)n93, (long)1834278109704761397L, (long)l11);
                }
            }
            b12.J = js.E(this.o, l10, (short)n10, true);
        }
    }

    /*
     * Exception decompiling
     */
    public void s(Object[] var1_1) {
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

    public boolean E(Object[] objectArray) {
        boolean bl2;
        block8: {
            block7: {
                CallSite callSite;
                long l10;
                block6: {
                    int n10 = (Integer)objectArray[0];
                    int n11 = (Integer)objectArray[1];
                    long l11 = l10 = ((long)n10 << 32 | (long)n11 << 32 >>> 32) ^ a;
                    long l12 = l11 ^ 0x4FB9E778052L;
                    long l13 = l11 ^ 0x3871DAEE21DCL;
                    callSite = m44.a("j", (long)-2638075497571767765L, (long)l10);
                    try {
                        try {
                            bl2 = this.D(l12);
                            if (callSite == false) break block6;
                            if (bl2) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("j", (Object)n92, (long)-2688760018215767058L, (long)l10);
                        }
                        bl2 = this.T(l13);
                    }
                    catch (n9 n93) {
                        throw m44.a("j", (Object)n93, (long)-2688760018215767058L, (long)l10);
                    }
                }
                try {
                    if (callSite == false) break block8;
                    if (bl2) break block7;
                }
                catch (n9 n94) {
                    throw m44.a("j", (Object)n94, (long)-2688760018215767058L, (long)l10);
                }
                bl2 = true;
                break block8;
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void I(Object[] var1_1) {
        block6: {
            block7: {
                block5: {
                    var3_2 = (Long)var1_1[0];
                    var2_3 = (String)var1_1[1];
                    v0 = var3_2;
                    var5_4 = v0 ^ 25288957092496L;
                    var7_5 = v0 ^ 42373383002032L;
                    var9_6 = v0 ^ 22774667433673L;
                    var11_7 = v0 ^ 0L;
                    var16_8 = m44.a("o", (long)-5463164503890665271L, (long)var3_2);
                    try {
                        v1 = this;
                        if (var16_8 != false) break block5;
                        if (v1.T(var9_6)) {
                        }
                        ** GOTO lbl27
                    }
                    catch (n9 v2) {
                        throw m44.a("o", (Object)v2, (long)-5928223902023973637L, (long)var3_2);
                    }
                    m44.a("p", (Object)this, (long)-5652208729291698460L, (long)var3_2);
                    var13_9 = null;
                    var14_10 = this;
                    var15_11 = new lb6(0);
                    try {
                        m44.a("p", (Object)this, (long)var7_5, (Object)var15_11, (Object)var14_10, var13_9, (long)-5457174813190822715L, (long)var3_2);
                        if (var3_2 < 0L) break block6;
                        if (var16_8 == false) break block7;
lbl27:
                        // 2 sources

                        this.V = var2_3;
                        v1 = this;
                    }
                    catch (n9 v3) {
                        throw m44.a("o", (Object)v3, (long)-5928223902023973637L, (long)var3_2);
                    }
                }
                v4 = new Object[2];
                v4[1] = var2_3;
                v4[0] = var11_7;
                super.I(v4);
            }
            m44.a("s", (Object)this, (String)m44.a("p", (Object)this, (long)var5_4, (long)-5329148698956805579L, (long)var3_2).toLowerCase(), (long)-6029951903194019110L, (long)var3_2);
        }
    }

    public final void z(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x3DEF280A87DCL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("r", (Object)this.E, (Object)objectArray2, (long)-6446784274174417845L, (long)l10);
    }

    public boolean U(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (boolean)m44.a("u", (Object)this, (long)-6912177461347726547L, (long)l10);
    }

    public lox y(long l10) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x13DEAB687F3AL;
        long l13 = l11 ^ 0x287D75BE2ACAL;
        return new lox(this.Z(l13), l12, this.V());
    }

    @Override
    public String X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10;
        long l12 = l11 ^ 0x6B87C6470B18L;
        long l13 = l11 ^ 0x338AFEC033BAL;
        long l14 = l11 ^ 0x272CBDDC39A6L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l14;
        return this.q(l13) + (String)((Object)m44.a("q", (Object)this.B(l12), (Object)objectArray2, (long)-3550926507171273944L, (long)l10));
    }

    public final void G(Object[] objectArray) {
        boolean bl2 = (Boolean)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0xE6530F4C311L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = bl2;
        m44.a("r", (Object)this.E, (Object)objectArray2, (long)-7358292344869524302L, (long)l10);
    }

    public final boolean d(long l10) {
        long l11 = (l10 = a ^ l10) ^ 0xC035CDF6012L;
        return this.i(l11, 4);
    }

    @Override
    public String Z(long l10) {
        return this.V;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public final String H(Object[] var1_1) {
        block78: {
            block79: {
                block77: {
                    block67: {
                        block65: {
                            block66: {
                                block80: {
                                    block81: {
                                        block63: {
                                            var5_2 = (Boolean)var1_1[0];
                                            var3_3 = (Long)var1_1[1];
                                            var2_4 = (Map)var1_1[2];
                                            v0 = var3_3 = b1.a ^ var3_3;
                                            var6_5 = v0 ^ 47628788444771L;
                                            var8_6 = v0 ^ 82553132502849L;
                                            var10_7 = v0 ^ 13638972636829L;
                                            var12_8 = v0 ^ 22893162802935L;
                                            v1 = v0 ^ 90778315690569L;
                                            var14_9 = (int)(v1 >>> 48);
                                            var15_10 = (int)(v1 << 16 >>> 48);
                                            var16_11 = (int)(v1 << 32 >>> 32);
                                            var18_12 = null;
                                            var17_13 = m44.a("n", (long)4917824989105295576L, (long)var3_3);
                                            if (var2_4 == null) break block80;
                                            var19_14 = 0;
                                            for (Object var21_17 : var2_4.keySet()) {
                                                block64: {
                                                    block62: {
                                                        try {
                                                            try {
                                                                try {
                                                                    v2 = var21_17.intValue();
                                                                    v3 /* !! */  = (int)var17_13;
                                                                    if (var3_3 >= 0L) {
                                                                        if (v3 /* !! */  != 0) break block62;
                                                                        v3 /* !! */  = var19_14;
                                                                    }
                                                                    if (var17_13 != false) break block63;
                                                                }
                                                                catch (n9 v4) {
                                                                    throw m44.a("n", (Object)v4, (long)6749726874036499690L, (long)var3_3);
                                                                }
                                                                if (v2 <= v3 /* !! */ ) break block64;
                                                            }
                                                            catch (n9 v5) {
                                                                throw m44.a("n", (Object)v5, (long)6749726874036499690L, (long)var3_3);
                                                            }
                                                            v2 = var21_17.intValue();
                                                        }
                                                        catch (n9 v6) {
                                                            throw m44.a("n", (Object)v6, (long)6749726874036499690L, (long)var3_3);
                                                        }
                                                    }
                                                    var19_14 = v2;
                                                }
                                                if (var17_13 == false) continue;
                                            }
                                            v7 = var19_14;
                                            if (var3_3 < 0L) break block81;
                                            v3 /* !! */  = 1;
                                        }
                                        v7 = v7 + v3 /* !! */ ;
                                    }
                                    var18_12 = new String[v7];
                                    for (Object var21_17 : var2_4.entrySet()) {
                                        var18_12[((Integer)var21_17.getKey()).intValue()] = (String)var21_17.getValue();
                                        if (var17_13 == false) continue;
                                    }
                                }
                                var19_15 = b1.b("a", (int)14501, (long)(6947811443123384360L ^ var3_3));
                                var21_17 = new StringBuilder();
                                try {
                                    v8 = this.E.d(var12_8);
                                    if (var17_13 != false) break block65;
                                    if (v8 == 0) break block66;
                                }
                                catch (n9 v9) {
                                    throw m44.a("n", (Object)v9, (long)6749726874036499690L, (long)var3_3);
                                }
                                v8 = 0;
                                break block65;
                            }
                            v8 = 1;
                        }
                        var22_18 = v8;
                        var23_19 = 0;
                        while (var23_19 < this.J.size()) {
                            block73: {
                                block74: {
                                    block75: {
                                        block76: {
                                            block71: {
                                                block72: {
                                                    block70: {
                                                        block68: {
                                                            block69: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        v10 = var5_2;
                                                                                        v11 = var17_13;
                                                                                        if (var3_3 < 0L) ** GOTO lbl209
                                                                                        if (v11 != false) break block67;
                                                                                        if (v10) {
                                                                                        }
                                                                                        ** GOTO lbl175
                                                                                    }
                                                                                    catch (n9 v12) {
                                                                                        throw m44.a("n", (Object)v12, (long)6749726874036499690L, (long)var3_3);
                                                                                    }
                                                                                    var21_17.append(js.E((char)var14_9, (short)var15_10, (String)this.J.get(var23_19), var16_11));
                                                                                    var21_17.append(" ");
                                                                                    v13 /* !! */  = var17_13;
                                                                                    if (var3_3 >= 0L) {
                                                                                        if (v13 /* !! */  != false) break block68;
                                                                                    }
                                                                                    ** GOTO lbl135
                                                                                }
                                                                                catch (n9 v14) {
                                                                                    throw m44.a("n", (Object)v14, (long)6749726874036499690L, (long)var3_3);
                                                                                }
                                                                                if (var3_3 <= 0L) break block68;
                                                                                if (var18_12 != null) {
                                                                                }
                                                                                ** GOTO lbl126
                                                                            }
                                                                            catch (n9 v15) {
                                                                                throw m44.a("n", (Object)v15, (long)6749726874036499690L, (long)var3_3);
                                                                            }
                                                                            v16 = var18_12;
                                                                            v17 /* !! */  = var17_13;
                                                                            if (var3_3 >= 0L) {
                                                                                if (v17 /* !! */  != false) break block69;
                                                                            }
                                                                            ** GOTO lbl125
                                                                        }
                                                                        catch (n9 v18) {
                                                                            throw m44.a("n", (Object)v18, (long)6749726874036499690L, (long)var3_3);
                                                                        }
                                                                        if (v16.length > var22_18) {
                                                                        }
                                                                        ** GOTO lbl126
                                                                    }
                                                                    catch (n9 v19) {
                                                                        throw m44.a("n", (Object)v19, (long)6749726874036499690L, (long)var3_3);
                                                                    }
                                                                    v16 = var18_12;
                                                                }
                                                                catch (n9 v20) {
                                                                    throw m44.a("n", (Object)v20, (long)6749726874036499690L, (long)var3_3);
                                                                }
                                                            }
                                                            try {
                                                                v17 /* !! */  = (CallSite)var22_18;
lbl125:
                                                                // 2 sources

                                                                if (v16[v17 /* !! */ ] != null) ** GOTO lbl138
lbl126:
                                                                // 3 sources

                                                                var21_17.append((String)var19_15 + var22_18);
                                                            }
                                                            catch (n9 v21) {
                                                                throw m44.a("n", (Object)v21, (long)6749726874036499690L, (long)var3_3);
                                                            }
                                                        }
                                                        try {
                                                            v13 /* !! */  = var17_13;
lbl135:
                                                            // 2 sources

                                                            if (var3_3 > 0L) {
                                                                if (v13 /* !! */  == false) break block70;
                                                            }
                                                            ** GOTO lbl147
lbl138:
                                                            // 2 sources

                                                            var21_17.append(var18_12[var22_18]);
                                                        }
                                                        catch (n9 v22) {
                                                            throw m44.a("n", (Object)v22, (long)6749726874036499690L, (long)var3_3);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            v13 /* !! */  = (CallSite)var23_19;
lbl147:
                                                            // 2 sources

                                                            if (var3_3 > 0L) {
                                                                v23 /* !! */  = this.J.size() - 1;
                                                                if (var17_13 != false) break block71;
                                                                if (v13 /* !! */  >= v23 /* !! */ ) break block72;
                                                            }
                                                            ** GOTO lbl173
                                                        }
                                                        catch (n9 v24) {
                                                            throw m44.a("n", (Object)v24, (long)6749726874036499690L, (long)var3_3);
                                                        }
                                                        var21_17.append((String)b1.b("a", (int)3747, (long)(7735261105726015020L ^ var3_3)));
                                                    }
                                                    catch (n9 v25) {
                                                        throw m44.a("n", (Object)v25, (long)6749726874036499690L, (long)var3_3);
                                                    }
                                                }
                                                v26 = var22_18;
                                                v27 = new Object[2];
                                                v27[1] = var8_6;
                                                v27[0] = (String)this.J.get(var23_19);
                                                v23 /* !! */  = (int)m44.a("n", (Object)v27, (long)6444431009588530004L, (long)var3_3);
                                            }
                                            var22_18 = v26 + v23 /* !! */ ;
                                            try {
                                                try {
                                                    try {
                                                        v13 /* !! */  = var17_13;
lbl173:
                                                        // 2 sources

                                                        if (var3_3 < 0L) break block73;
                                                        if (v13 /* !! */  == false) break block74;
lbl175:
                                                        // 2 sources

                                                        v28 = var21_17;
                                                        v29 = js.E((char)var14_9, (short)var15_10, (String)this.J.get(var23_19), var16_11);
                                                        if (var17_13 != false) break block75;
                                                    }
                                                    catch (n9 v30) {
                                                        throw m44.a("n", (Object)v30, (long)6749726874036499690L, (long)var3_3);
                                                    }
                                                    v28.append((String)v29);
                                                    v28 = var21_17;
                                                    if (var23_19 >= this.J.size() - 1) break block76;
                                                }
                                                catch (n9 v31) {
                                                    throw m44.a("n", (Object)v31, (long)6749726874036499690L, (long)var3_3);
                                                }
                                                v29 = b1.b("a", (int)3747, (long)(7735261105726015020L ^ var3_3));
                                                break block75;
                                            }
                                            catch (n9 v32) {
                                                throw m44.a("n", (Object)v32, (long)6749726874036499690L, (long)var3_3);
                                            }
                                        }
                                        v29 = "";
                                    }
                                    v28.append((String)v29);
                                }
                                ++var23_19;
                                v13 /* !! */  = var17_13;
                            }
                            if (v13 /* !! */  == false) continue;
                        }
                        v33 = this.V;
                        v34 = b1.b("a", (int)13751, (long)(7699203397662768444L ^ var3_3));
                        if (var3_3 <= 0L) ** GOTO lbl228
                        v10 = v33.equals(v34);
                    }
                    try {
                        v11 = var17_13;
lbl209:
                        // 2 sources

                        if (v11 != false) break block77;
                        if (v10) {
                        }
                        ** GOTO lbl222
                    }
                    catch (n9 v35) {
                        throw m44.a("n", (Object)v35, (long)6749726874036499690L, (long)var3_3);
                    }
                    v36 = new Object[1];
                    v36[0] = var10_7;
                    var20_16 = this.E.D(var6_5) + (String)m44.a("q", (Object)this, (Object)v36, (long)6809124848070683306L, (long)var3_3) + "(" + var21_17 + ")";
                    try {
                        try {
                            if (var3_3 >= 0L && var17_13 == false) break block78;
lbl222:
                            // 2 sources

                            v33 = this.V;
                            if (var17_13 != false) break block79;
                        }
                        catch (n9 v37) {
                            throw m44.a("n", (Object)v37, (long)6749726874036499690L, (long)var3_3);
                        }
                        v34 = b1.b("a", (int)13473, (long)(318315732607663149L ^ var3_3));
lbl228:
                        // 2 sources

                        v10 = v33.equals(v34);
                    }
                    catch (n9 v38) {
                        throw m44.a("n", (Object)v38, (long)6749726874036499690L, (long)var3_3);
                    }
                }
                if (!v10) ** GOTO lbl239
                v33 = this.E.D(var6_5);
                if (var3_3 < 0L) break block79;
                var20_16 = v33;
                try {
                    if (var17_13 == false) break block78;
lbl239:
                    // 2 sources

                    v33 = this.E.D(var6_5) + js.E((char)var14_9, (short)var15_10, this.o, var16_11) + " " + this.V + "(" + var21_17 + ")";
                }
                catch (n9 v39) {
                    throw m44.a("n", (Object)v39, (long)6749726874036499690L, (long)var3_3);
                }
            }
            var20_16 = v33;
        }
        return var20_16;
    }

    public abstract void q(Object[] var1);

    @Override
    public final String V() {
        return this.o;
    }

    /*
     * Exception decompiling
     */
    public void i(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[DOLOOP]], but top level block is 2[TRYBLOCK]
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

    public final String v(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x579D0ADE10ECL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = true;
        return m44.a("r", (Object)this, (Object)objectArray2, (long)-2759464420609703214L, (long)l10);
    }

    public int O(long l10) {
        block5: {
            List list;
            block4: {
                l10 = a ^ l10;
                CallSite callSite = m44.a("h", (long)-4329750266085657951L, (long)l10);
                try {
                    try {
                        list = this.J;
                        if (callSite == false) break block4;
                        if (list == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-4456993120056972444L, (long)l10);
                    }
                    list = this.J;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-4456993120056972444L, (long)l10);
                }
            }
            return list.size();
        }
        return 0;
    }

    public List g(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x561D28D2E7FL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this.o;
        objectArray2[0] = l11;
        CallSite callSite = m44.a("k", (Object)objectArray2, (long)-2927352974126156450L, (long)l10);
        return callSite;
    }

    public final boolean m(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x1C79FEBBF5ECL;
        return this.i(l11, (int)b1.e("g", (int)3523, (long)(0x27D8368FB7BE4BA4L ^ l10)));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void x(Object[] var0) {
        var1_1 = (Long)var0[0];
        var4_2 = (String[])var0[1];
        var3_3 = (_u)var0[2];
        v0 = var1_1 = b1.a ^ var1_1;
        var5_4 = v0 ^ 35910515023650L;
        var7_5 = v0 ^ 51188801805765L;
        var10_6 = 0;
        var9_7 = m44.a("o", (long)5081942125152113249L, (long)var1_1);
        while (var10_6 < var4_2.length - 1) {
            block21: {
                block22: {
                    block17: {
                        var11_8 = var10_6;
                        var12_9 = var4_2[var10_6];
                        for (var13_10 = var10_6 + 1; var13_10 < var4_2.length; ++var13_10) {
                            block20: {
                                block18: {
                                    block19: {
                                        var14_11 = var4_2[var13_10];
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v1 /* !! */  = (int)var3_3.O(var5_4, var14_11, var12_9);
                                                        v2 /* !! */  = (int)var9_7;
                                                        if (var1_1 > 0L) {
                                                            if (v2 /* !! */  != 0) break block17;
                                                            if (var9_7 != false) break block18;
                                                        }
                                                        ** GOTO lbl56
                                                    }
                                                    catch (n9 v3) {
                                                        throw m44.a("o", (Object)v3, (long)6850793486564357715L, (long)var1_1);
                                                    }
                                                    if (v1 /* !! */  != 0) break block19;
                                                }
                                                catch (n9 v4) {
                                                    throw m44.a("o", (Object)v4, (long)6850793486564357715L, (long)var1_1);
                                                }
                                                if (var1_1 <= 0L) break block20;
                                                v5 = (int)var3_3.j(var14_11, var7_5, var12_9);
                                                if (var9_7 != false) break block18;
                                            }
                                            catch (n9 v6) {
                                                throw m44.a("o", (Object)v6, (long)6850793486564357715L, (long)var1_1);
                                            }
                                            if (v5 == 0) continue;
                                        }
                                        catch (n9 v7) {
                                            throw m44.a("o", (Object)v7, (long)6850793486564357715L, (long)var1_1);
                                        }
                                    }
                                    v5 = var13_10;
                                }
                                var11_8 = v5;
                            }
                            var12_9 = var14_11;
                            if (var9_7 == false) continue;
                        }
                        if (var1_1 <= 0L) break block22;
                        v1 /* !! */  = var11_8;
                    }
                    try {
                        if (var1_1 <= 0L) break block21;
                        v2 /* !! */  = var10_6;
lbl56:
                        // 2 sources

                        if (v1 /* !! */  > v2 /* !! */ ) {
                            var4_2[var11_8] = var4_2[var10_6];
                            var4_2[var10_6] = var12_9;
                        }
                    }
                    catch (n9 v8) {
                        throw m44.a("o", (Object)v8, (long)6850793486564357715L, (long)var1_1);
                    }
                    ++var10_6;
                }
                v1 /* !! */  = (int)var9_7;
            }
            if (v1 /* !! */  == 0) continue;
        }
    }

    public boolean g(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite = m44.a("l", (long)-8645353122651702963L, (long)l10);
                try {
                    try {
                        object = m44.a("r", (Object)this, (long)-8435531698371897669L, (long)l10);
                        if (callSite == false) break block4;
                        if (object <= -1) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)-8518067838896004984L, (long)l10);
                    }
                    object = true;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)-8518067838896004984L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    b1(_v _v2, x8 x82, x8 x83, kw[] kwArray, long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x2FFFECC34F27L;
        super(_v2, x82, x83, kwArray, n10);
        this.d = -1;
        this.P = -1;
        m44.a("q", (Object)this, (int)-1, (long)-2236064973309887326L, (long)l10);
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        m44.a("l", (Object)this, (Object)objectArray, (long)-2125688881844133213L, (long)l10);
    }

    @Override
    public final String d(long l10) {
        String string;
        block13: {
            block14: {
                int n10;
                block11: {
                    CallSite callSite;
                    block12: {
                        long l11 = l10 ^ 0x747622686C1CL;
                        callSite = m44.a("o", (long)6250688231216448089L, (long)l10);
                        try {
                            try {
                                n10 = this.V.equals(b1.b("a", (int)13751, (long)(0x6AD968A3035D6FBDL ^ l10)));
                                if (callSite != false) break block11;
                                if (n10 == 0) break block12;
                            }
                            catch (n9 n92) {
                                throw m44.a("o", (Object)n92, (long)5704548646552102507L, (long)l10);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l11;
                            return m44.a("p", (Object)this, (Object)objectArray, (long)5548336784141711403L, (long)l10);
                        }
                        catch (n9 n93) {
                            throw m44.a("o", (Object)n93, (long)5704548646552102507L, (long)l10);
                        }
                    }
                    try {
                        string = this.V;
                        Object object = callSite;
                        if (l10 >= 0L) {
                            if (object != false) break block13;
                            object = 13473;
                        }
                        n10 = string.equals(b1.b("a", (int)object, (long)(0x46A9A6958096EACL ^ l10))) ? 1 : 0;
                    }
                    catch (n9 n94) {
                        throw m44.a("o", (Object)n94, (long)5704548646552102507L, (long)l10);
                    }
                }
                try {
                    if (l10 > 0L) {
                        if (n10 == 0) break block14;
                        n10 = 5262;
                    }
                    return b1.b("a", (int)n10, (long)(0x606CA2DEB1044E81L ^ l10));
                }
                catch (n9 n95) {
                    throw m44.a("o", (Object)n95, (long)5704548646552102507L, (long)l10);
                }
            }
            string = this.V;
        }
        return string;
    }

    public final String S(Object[] objectArray) {
        boolean bl2 = (Boolean)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x13445F28887FL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = null;
        objectArray2[1] = l11;
        objectArray2[0] = bl2;
        return m44.a("u", (Object)this, (Object)objectArray2, (long)8996752645230647000L, (long)l10);
    }

    public loe Z(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return new loe((String)((Object)m44.a("r", (Object)this, (Object)new Object[0], (long)8492620047984636831L, (long)l10)), this.B());
    }

    public String t(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        int n10 = this.o.lastIndexOf((int)b1.e("g", (int)30892, (long)(0x5269EEF1FC937661L ^ l10)));
        return this.o.substring(n10 + 1);
    }

    public abstract void h(Object[] var1);

    public List F(Object[] objectArray) {
        Object object;
        block4: {
            long l10;
            block5: {
                l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite = m44.a("j", (long)-1523451426997232749L, (long)l10);
                try {
                    try {
                        object = this.J;
                        if (callSite == false) break block4;
                        if (object == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)-1506546768900275626L, (long)l10);
                    }
                    return Collections.unmodifiableList(this.J);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)-1506546768900275626L, (long)l10);
                }
            }
            object = m44.a("j", (long)-699607819756485838L, (long)l10);
        }
        return object;
    }

    public final String l(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x2BA07A90B0CFL;
        return (String)((Object)m44.a("w", (Object)this, (long)l11, (long)-1993911705458141078L, (long)l10)) + this.V();
    }

    public static String W(Object[] objectArray) {
        StringBuilder stringBuilder;
        block8: {
            StringBuilder stringBuilder2;
            block9: {
                long l10 = (Long)objectArray[0];
                String string = (String)objectArray[1];
                String string2 = (String)objectArray[2];
                long l11 = l10 = a ^ l10;
                long l12 = l11 ^ 0x266B6486775L;
                long l13 = l12 >>> 16;
                int n10 = (int)(l12 << 48 >>> 48);
                long l14 = l11 ^ 0x7F1F87D7436FL;
                int n11 = (int)(l14 >>> 48);
                int n12 = (int)(l14 << 16 >>> 48);
                int n13 = (int)(l14 << 32 >>> 32);
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(string);
                CallSite callSite = m44.a("h", (long)-8268114095486206967L, (long)l10);
                stringBuilder2.append((char)b1.e("g", (int)30321, (long)(0x6244ED615EF90789L ^ l10)));
                List list = js.E(string2, l13, (short)n10, true);
                int n14 = list.size();
                CallSite callSite2 = callSite;
                int n15 = 0;
                while (n15 < n14) {
                    CallSite callSite3;
                    block10: {
                        block11: {
                            block12: {
                                String string3 = (String)list.get(n15);
                                try {
                                    try {
                                        try {
                                            stringBuilder = stringBuilder2.append(js.E((char)n11, (short)n12, string3, n13));
                                            if (l10 < 0L) break block8;
                                            if (callSite2 == false) break block9;
                                            callSite3 = callSite2;
                                            if (l10 <= 0L) break block10;
                                            if (callSite3 == false) break block11;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("h", (Object)n92, (long)-8318723260261882420L, (long)l10);
                                        }
                                        if (n15 >= n14 - 1) break block12;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("h", (Object)n93, (long)-8318723260261882420L, (long)l10);
                                    }
                                    stringBuilder2.append((String)((Object)b1.b("a", (int)3747, (long)(0x6B59076E6D24170AL ^ l10))));
                                }
                                catch (n9 n94) {
                                    throw m44.a("h", (Object)n94, (long)-8318723260261882420L, (long)l10);
                                }
                            }
                            ++n15;
                        }
                        callSite3 = callSite2;
                    }
                    if (callSite3 != false) continue;
                }
                stringBuilder2.append((char)b1.e("g", (int)30892, (long)(0x5269B6FFCC16895FL ^ l10)));
                if (l10 > 0L) {
                    // empty if block
                }
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder.toString();
    }

    public final void m(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        boolean bl2 = (Boolean)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x5677CB50E898L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = bl2;
        m44.a("r", (Object)this.E, (Object)objectArray2, (long)-4662676119814225029L, (long)l10);
    }

    final void B(Object[] objectArray) {
        block5: {
            b1 b12;
            long l10;
            y_ y_2;
            long l11;
            block4: {
                l11 = (Long)objectArray[0];
                y_2 = (y_)objectArray[1];
                l10 = (l11 = a ^ l11) ^ 0x4AA557CD19A4L;
                CallSite callSite = m44.a("j", (long)-9078142662869330204L, (long)l11);
                try {
                    try {
                        b12 = this;
                        if (callSite != false) break block4;
                        if (b12.d == -1) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)-7235118247167020330L, (long)l11);
                    }
                    b12 = this;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)-7235118247167020330L, (long)l11);
                }
            }
            k_ k_2 = (k_)b12.T[this.d];
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l10;
            objectArray2[0] = y_2;
            m44.a("u", (Object)k_2, (Object)objectArray2, (long)-8801492650171301646L, (long)l11);
        }
    }

    @Override
    public boolean e() {
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String a(Object[] var1_1) {
        block19: {
            block20: {
                block17: {
                    block18: {
                        block16: {
                            var4_2 = (Boolean)var1_1[0];
                            var2_3 = (Long)var1_1[1];
                            v0 = var2_3 = b1.a ^ var2_3;
                            var5_4 = v0 ^ 47686014480238L;
                            var7_5 = v0 ^ 24053184724574L;
                            v1 = v0 ^ 1926473232294L;
                            var9_6 = (int)(v1 >>> 48);
                            var10_7 = (int)(v1 << 16 >>> 48);
                            var11_8 = (int)(v1 << 32 >>> 32);
                            var13_9 = new StringBuilder();
                            var12_10 = m44.a("i", (long)8777740570659073335L, (long)var2_3);
                            try {
                                try {
                                    if (var12_10 != false) break block16;
                                    if (var4_2) {
                                    }
                                    ** GOTO lbl33
                                }
                                catch (n9 v2) {
                                    throw m44.a("i", (Object)v2, (long)6936822827691034885L, (long)var2_3);
                                }
                                var13_9.append(this.Z(var7_5));
                            }
                            catch (n9 v3) {
                                throw m44.a("i", (Object)v3, (long)6936822827691034885L, (long)var2_3);
                            }
                        }
                        try {
                            v4 /* !! */  = var12_10;
                            if (var2_3 <= 0L) break block17;
                            if (v4 /* !! */  == false) break block18;
lbl33:
                            // 2 sources

                            var13_9.append((String)m44.a("v", (Object)this, (long)var5_4, (long)8932101650702141387L, (long)var2_3));
                        }
                        catch (n9 v5) {
                            throw m44.a("i", (Object)v5, (long)6936822827691034885L, (long)var2_3);
                        }
                    }
                    var13_9.append((char)b1.e("g", (int)433, (long)(5838270401381112972L ^ var2_3)));
                    v4 /* !! */  = (CallSite)this.J.size();
                }
                var14_11 = v4 /* !! */ ;
                var15_12 = 0;
                while (var15_12 < var14_11) {
                    block21: {
                        block22: {
                            block23: {
                                var16_13 = (String)this.J.get(var15_12);
                                try {
                                    try {
                                        try {
                                            v6 = var13_9.append(js.E((char)var9_6, (short)var10_7, var16_13, var11_8));
                                            if (var2_3 <= 0L) break block19;
                                            if (var12_10 != false) break block20;
                                            v7 = var12_10;
                                            if (var2_3 < 0L) break block21;
                                            if (v7 != false) break block22;
                                        }
                                        catch (n9 v8) {
                                            throw m44.a("i", (Object)v8, (long)6936822827691034885L, (long)var2_3);
                                        }
                                        if (var15_12 >= var14_11 - true) break block23;
                                    }
                                    catch (n9 v9) {
                                        throw m44.a("i", (Object)v9, (long)6936822827691034885L, (long)var2_3);
                                    }
                                    var13_9.append((String)b1.b("a", (int)16665, (long)(2471781620838216828L ^ var2_3)));
                                }
                                catch (n9 v10) {
                                    throw m44.a("i", (Object)v10, (long)6936822827691034885L, (long)var2_3);
                                }
                            }
                            ++var15_12;
                        }
                        v7 = var12_10;
                    }
                    if (v7 == false) continue;
                }
                var13_9.append((char)b1.e("g", (int)16660, (long)(8600689193572490282L ^ var2_3)));
                if (var2_3 > 0L) {
                    // empty if block
                }
            }
            v6 = var13_9;
        }
        return v6.toString();
    }

    public boolean k(Object[] objectArray) {
        boolean bl2;
        block12: {
            block13: {
                long l10 = (Long)objectArray[0];
                b1 b12 = (b1)objectArray[1];
                long l11 = (l10 = a ^ l10) ^ 0x56C3F4F9201CL;
                CallSite callSite = m44.a("j", (long)-2923973180201663604L, (long)l10);
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        bl2 = this.V.equals(b12.V);
                                        if (callSite != false) break block12;
                                        if (!bl2) break block13;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("j", (Object)n92, (long)-3530906824280840258L, (long)l10);
                                    }
                                    bl2 = this.o.equals(b12.o);
                                    if (callSite != false) break block12;
                                }
                                catch (n9 n93) {
                                    throw m44.a("j", (Object)n93, (long)-3530906824280840258L, (long)l10);
                                }
                                if (!bl2) break block13;
                            }
                            catch (n9 n94) {
                                throw m44.a("j", (Object)n94, (long)-3530906824280840258L, (long)l10);
                            }
                            bl2 = this.h(l11).equals(b12.h(l11));
                            if (callSite != false) break block12;
                        }
                        catch (n9 n95) {
                            throw m44.a("j", (Object)n95, (long)-3530906824280840258L, (long)l10);
                        }
                        if (!bl2) break block13;
                    }
                    catch (n9 n96) {
                        throw m44.a("j", (Object)n96, (long)-3530906824280840258L, (long)l10);
                    }
                    return true;
                }
                catch (n9 n97) {
                    throw m44.a("j", (Object)n97, (long)-3530906824280840258L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        b1.a = prr.a(7811026836832423048L, -7835014433157737226L, MethodHandles.lookup().lookupClass()).a(38508474436686L);
                        b1.l = new HashMap<K, V>(13);
                        var11 = b1.a ^ 140452851889634L;
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
                        var20_3 = new String[8];
                        var18_4 = 0;
                        var17_5 = "d\u00fd\u001b's\u009dG\u009c\u0015\u00a0\u00ba[\u0006FOg\u000b\u00e4J\u00da3\u00bep\u00ee\u0010b\u008fY\u00b2q,=\u0089B\u00bb\u00d6\u00be\u008d\u00e7\u00f3B\u0010\u00b8\u00cc\u00ef \u0086\u0010\u00c3;\nd\u0090/\u00a8\u00be\u00ff\u0004\u00100\u00f5`\u000b\u00e7\u0007\u00eeNJo`vIS\\\r\u0010\u00d3f\u0016\u009f\u00db\u00ac9!\u00b3\u0093\u001dq\u007f\u007f,K sf\u00d2|Ba0],v\u00e5\u0001\u00d0\u008b\u00b6\u00b5\u00d9\u00da\u008d\u00e7\u00aa\u0091\u00b5\u00900\u00c0\u00d7\u00e3\u008d\u00bd\u00c7\t";
                        var19_6 = "d\u00fd\u001b's\u009dG\u009c\u0015\u00a0\u00ba[\u0006FOg\u000b\u00e4J\u00da3\u00bep\u00ee\u0010b\u008fY\u00b2q,=\u0089B\u00bb\u00d6\u00be\u008d\u00e7\u00f3B\u0010\u00b8\u00cc\u00ef \u0086\u0010\u00c3;\nd\u0090/\u00a8\u00be\u00ff\u0004\u00100\u00f5`\u000b\u00e7\u0007\u00eeNJo`vIS\\\r\u0010\u00d3f\u0016\u009f\u00db\u00ac9!\u00b3\u0093\u001dq\u007f\u007f,K sf\u00d2|Ba0],v\u00e5\u0001\u00d0\u008b\u00b6\u00b5\u00d9\u00da\u008d\u00e7\u00aa\u0091\u00b5\u00900\u00c0\u00d7\u00e3\u008d\u00bd\u00c7\t".length();
                        var16_7 = 24;
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
                            var20_3[var18_4++] = b1.d(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00b4j\u00d9\u0090\nn^\u00a9 \u0086UL^@\u001dw\u0010\u0019\u0007\u00dd\u009f}\u0096\u00e8\u00d8\u000fx\u00a2Xz\u001f\u00fa\u0082";
                            var19_6 = "\u00b4j\u00d9\u0090\nn^\u00a9 \u0086UL^@\u001dw\u0010\u0019\u0007\u00dd\u009f}\u0096\u00e8\u00d8\u000fx\u00a2Xz\u001f\u00fa\u0082".length();
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
                            var20_3[var18_4++] = b1.d(var21_9).intern();
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
                b1.j = var20_3;
                b1.k = new String[8];
                b1.M = new HashMap<K, V>(13);
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
                var6_12 = new long[9];
                var3_13 = 0;
                var4_14 = "\u008ah\u00e64\u008d\u0001\\6SE\u007f\u00bf%\u00bbhw>\u00a7\u0085\u000b\b\u00cf\u00cc\u0003O\u00d8\u00c7\u00c9\u00e9]\u00c7\u00f2q\u00d5Sn\u00db\u009d\u008c\u0001z\u00a5\u001d\u00cf\u001f0\u00b6\u00d6+v\u009br-\u0097\u00ea\u0096";
                var5_15 = "\u008ah\u00e64\u008d\u0001\\6SE\u007f\u00bf%\u00bbhw>\u00a7\u0085\u000b\b\u00cf\u00cc\u0003O\u00d8\u00c7\u00c9\u00e9]\u00c7\u00f2q\u00d5Sn\u00db\u009d\u008c\u0001z\u00a5\u001d\u00cf\u001f0\u00b6\u00d6+v\u009br-\u0097\u00ea\u0096".length();
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
                    var4_14 = "\u00c2\u00a2\u00c0\u009c\u00a7I\u00f0\u00f7\u00dfzx\u0010Y\t\u00e3W";
                    var5_15 = "\u00c2\u00a2\u00c0\u009c\u00a7I\u00f0\u00f7\u00dfzx\u0010Y\t\u00e3W".length();
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
        b1.I = var6_12;
        b1.L = new Integer[9];
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String d(byte[] byArray) {
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x7F5;
        if (k[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])l.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/b1", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = j[n11].getBytes("ISO-8859-1");
            b1.k[n11] = b1.d(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = b1.b(n10, l10);
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
            throw new RuntimeException("com/zelix/b1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int e(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x6FAF;
        if (L[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = I[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])M.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    M.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/b1", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            b1.L[n11] = n12;
        }
        return L[n11];
    }

    private static int e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = b1.e(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/b1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b1.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(b1.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

