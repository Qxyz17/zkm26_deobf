/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._9;
import com.zelix.df;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.kw;
import com.zelix.l6q;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.x8;
import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class ko
extends kw {
    _9[] I;
    boolean M;
    byte[] r;
    int N;
    private static final long a = prr.a(-8310167189721451870L, -8134302704207407253L, MethodHandles.lookup().lookupClass()).a(167283133207064L);

    public int P(Object[] objectArray) {
        return this.N;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void C(Object[] var1_1) {
        block21: {
            block26: {
                block22: {
                    block20: {
                        var2_2 = (Long)var1_1[0];
                        var4_3 = (HashSet)var1_1[1];
                        var5_4 = (df)var1_1[2];
                        v0 = var2_2 = ko.a ^ var2_2;
                        var6_5 = v0 ^ 53139019371789L;
                        var8_6 = v0 ^ 13627975844226L;
                        v1 = v0 ^ 24168969648572L;
                        var10_7 = (int)(v1 >>> 32);
                        var11_8 = (int)(v1 << 32 >>> 56);
                        var12_9 = (int)(v1 << 40 >>> 40);
                        var13_10 = m44.a("j", (long)6794747880665647788L, (long)var2_2);
                        try {
                            try {
                                v2 = m44.a("t", (Object)this, (long)5003772549054464671L, (long)var2_2);
                                if (var13_10 != false) break block20;
                                if (v2 == false) break block21;
                            }
                            catch (n9 v3) {
                                throw m44.a("j", (Object)v3, (long)4859172357981079325L, (long)var2_2);
                            }
                            v2 = m44.a("u", (Object)var4_3, (long)4943017826447169126L, (long)var2_2);
                        }
                        catch (n9 v4) {
                            throw m44.a("j", (Object)v4, (long)4859172357981079325L, (long)var2_2);
                        }
                    }
                    if (v2 <= 0) break block21;
                    var14_11 = new ArrayList<_9>(this.N);
                    var15_12 = 0;
                    while (var15_12 < this.N) {
                        block24: {
                            block25: {
                                block23: {
                                    var16_14 = m44.a("u", (Object)this.I[var15_12], (Object)new Object[0], (long)5050757177405808365L, (long)var2_2);
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v5 /* !! */  = (int)m44.a("u", (Object)var4_3, (Object)var16_14, (long)5112031490443569233L, (long)var2_2);
                                                    v6 /* !! */  = var13_10;
                                                    if (var2_2 >= 0L) {
                                                        if (v6 /* !! */  != false) break block22;
                                                        if (var13_10 != false) break block23;
                                                    }
                                                    ** GOTO lbl88
                                                }
                                                catch (n9 v7) {
                                                    throw m44.a("j", (Object)v7, (long)4859172357981079325L, (long)var2_2);
                                                }
                                                if (var2_2 < 0L) break block23;
                                                if (v5 /* !! */  != 0) ** GOTO lbl60
                                            }
                                            catch (n9 v8) {
                                                throw m44.a("j", (Object)v8, (long)4859172357981079325L, (long)var2_2);
                                            }
                                            var14_11.add(this.I[var15_12]);
                                            v9 = var13_10;
                                            if (var2_2 <= 0L) break block24;
                                            if (v9 != false) {
                                            }
                                            break block25;
                                        }
                                        catch (n9 v10) {
                                            throw m44.a("j", (Object)v10, (long)4859172357981079325L, (long)var2_2);
                                        }
lbl60:
                                        // 2 sources

                                        v11 = new Object[3];
                                        v11[2] = this.I[var15_12];
                                        v11[1] = var6_5;
                                        v11[0] = var16_14;
                                        v12 = m44.a("u", (Object)var5_4, (Object)v11, (long)6478478729100243272L, (long)var2_2);
                                    }
                                    catch (n9 v13) {
                                        throw m44.a("j", (Object)v13, (long)4859172357981079325L, (long)var2_2);
                                    }
                                }
                                var17_15 = v12;
                                v14 = new Object[2];
                                v14[1] = m44.a("n", (long)6880591315860684564L, (long)var2_2);
                                v14[0] = var8_6;
                                m44.a("u", (Object)var16_14, (Object)v14, (long)6856409816787068978L, (long)var2_2);
                            }
                            ++var15_12;
                            v9 = var13_10;
                        }
                        if (v9 == false) continue;
                    }
                    v15 = var14_11;
                    if (var2_2 < 0L) ** GOTO lbl96
                    v5 /* !! */  = v15.size();
                }
                try {
                    try {
                        v6 /* !! */  = var13_10;
lbl88:
                        // 2 sources

                        if (var2_2 >= 0L) {
                            if (v6 /* !! */  != false) break block26;
                            v6 /* !! */  = (CallSite)this.I.length;
                        }
                        if (v5 /* !! */  >= v6 /* !! */ ) break block21;
                    }
                    catch (n9 v16) {
                        throw m44.a("j", (Object)v16, (long)4859172357981079325L, (long)var2_2);
                    }
                    v15 = var14_11;
lbl96:
                    // 2 sources

                    v5 /* !! */  = v15.size();
                }
                catch (n9 v17) {
                    throw m44.a("j", (Object)v17, (long)4859172357981079325L, (long)var2_2);
                }
            }
            var15_13 = new _9[v5 /* !! */ ];
            this.I = var14_11.toArray(var15_13);
            this.N = this.I.length;
            m44.a("u", (Object)this, (int)var10_7, (byte)((byte)var11_8), (int)var12_9, (long)5015873158416606290L, (long)var2_2);
        }
    }

    @Override
    final x8 x(Object[] objectArray) {
        return this.b;
    }

    ko(_4 _42, long l10, int n10, String string, h1 h12, l6q l6q2) {
        long l11 = (l10 = a ^ l10) ^ 0x7E3953186A84L;
        super(_42, n10, string, l11, h12, l6q2);
        m44.a("t", (Object)this, (boolean)true, (long)1023142667417176541L, (long)l10);
    }

    ko(long l10, _4 _42, x8 x82, int n10) {
        l10 = a ^ l10;
        super(_42, x82, n10);
        m44.a("r", (Object)this, (boolean)true, (long)-1178663257401218997L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    final void P(Object[] var1_1) {
        var4_2 = (df)var1_1[0];
        var2_3 = (Long)var1_1[1];
        var5_4 = (var2_3 = ko.a ^ var2_3) ^ 118225224011850L;
        var8_5 = 0;
        var7_6 = m44.a("k", (long)-4779793650978468638L, (long)var2_3);
        while (var8_5 < this.N) {
            v0 = new Object[2];
            v0[1] = var4_2;
            v0[0] = var5_4;
            m44.a("t", (Object)this.I[var8_5], (Object)v0, (long)-6775207865478166848L, (long)var2_3);
            ++var8_5;
lbl15:
            // 2 sources

            ** while (var7_6 == false)
lbl16:
            // 1 sources

        }
lbl17:
        // 2 sources

        if (var2_3 < 0L) ** GOTO lbl15
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected final void c(Object[] var1_1) {
        block9: {
            block8: {
                var3_2 = (Long)var1_1[0];
                var2_3 = (DataOutputStream)var1_1[1];
                v0 = var3_2;
                var5_4 = v0 ^ 0L;
                var7_5 = v0 ^ 17613658218621L;
                v1 = m44.a("i", (long)716282175763740856L, (long)var3_2);
                v2 = new Object[2];
                v2[1] = var2_3;
                v2[0] = var5_4;
                super.c(v2);
                var9_6 = v1;
                try {
                    try {
                        v3 = this;
                        if (var9_6 == false) break block8;
                        if (m44.a("w", (Object)v3, (long)762231116548230524L, (long)var3_2) != false) {
                        }
                        ** GOTO lbl36
                    }
                    catch (n9 v4) {
                        throw m44.a("i", (Object)v4, (long)904161626825509118L, (long)var3_2);
                    }
                    v3 = this;
                }
                catch (n9 v5) {
                    throw m44.a("i", (Object)v5, (long)904161626825509118L, (long)var3_2);
                }
            }
            try {
                v6 = new Object[2];
                v6[1] = var7_5;
                v6[0] = var2_3;
                m44.a("v", (Object)v3, (Object)v6, (long)805643427008004697L, (long)var3_2);
                if (var3_2 <= 0L || var9_6 != false) break block9;
lbl36:
                // 2 sources

                var2_3.write((byte[])m44.a("w", (Object)this, (long)1617596459663815281L, (long)var3_2));
            }
            catch (n9 v7) {
                throw m44.a("i", (Object)v7, (long)904161626825509118L, (long)var3_2);
            }
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    final int g(int var1_1, byte var2_2, int var3_3) {
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
     * Unable to fully structure code
     */
    @Override
    void z(gu var1_1, long var2_2) {
        v0 = var2_2;
        var4_3 = v0 ^ 113240848016893L;
        var6_4 = v0 ^ 0L;
        v1 = m44.a("h", (long)6170399952317654249L, (long)var2_2);
        var1_1.K(this.b, this, var4_3, this.H());
        var8_5 = v1;
        var9_6 = 0;
        while (var9_6 < this.N) {
            this.I[var9_6].z(var1_1, var6_4);
            ++var9_6;
lbl14:
            // 2 sources

            ** while (var8_5 == false)
lbl15:
            // 1 sources

        }
lbl16:
        // 2 sources

        if (var2_2 <= 0L) ** GOTO lbl14
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected final void N(Object[] var1_1) {
        block9: {
            block8: {
                var5_2 = (DataOutputStream)var1_1[0];
                var2_3 = (Map)var1_1[1];
                var3_4 = (Long)var1_1[2];
                var6_5 = (lqu)var1_1[3];
                v0 = var3_4;
                var7_6 = v0 ^ 6187301157402L;
                var9_7 = v0 ^ 0L;
                v1 = m44.a("k", (long)1083949478671047661L, (long)var3_4);
                v2 = new Object[4];
                v2[3] = var6_5;
                v2[2] = var9_7;
                v2[1] = var2_3;
                v2[0] = var5_2;
                super.N(v2);
                var11_8 = v1;
                try {
                    try {
                        v3 = this;
                        if (var11_8 != false) break block8;
                        if (m44.a("u", (Object)v3, (long)1455161733382165470L, (long)var3_4) != false) {
                        }
                        ** GOTO lbl41
                    }
                    catch (n9 v4) {
                        throw m44.a("k", (Object)v4, (long)1309987839879829084L, (long)var3_4);
                    }
                    v3 = this;
                }
                catch (n9 v5) {
                    throw m44.a("k", (Object)v5, (long)1309987839879829084L, (long)var3_4);
                }
            }
            try {
                v6 = new Object[3];
                v6[2] = var2_3;
                v6[1] = var7_6;
                v6[0] = var5_2;
                m44.a("t", (Object)v3, (Object)v6, (long)1184366653708797804L, (long)var3_4);
                if (var3_4 < 0L || var11_8 == false) break block9;
lbl41:
                // 2 sources

                var5_2.write((byte[])m44.a("u", (Object)this, (long)635257834972900563L, (long)var3_4));
            }
            catch (n9 v7) {
                throw m44.a("k", (Object)v7, (long)1309987839879829084L, (long)var3_4);
            }
        }
    }

    protected abstract void T(Object[] var1);

    final void g(Object[] objectArray) {
        _9[] _9Array = (_9[])objectArray[0];
        this.N = _9Array.length;
        this.I = _9Array;
    }

    protected abstract void n(Object[] var1);

    private static n9 d(n9 n92) {
        return n92;
    }
}

