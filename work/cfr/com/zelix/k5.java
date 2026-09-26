/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._6;
import com.zelix._u;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.hf;
import com.zelix.ki;
import com.zelix.l6q;
import com.zelix.l6z;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.s8;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class k5
extends ki {
    s8[] j;
    private static final long c;
    private static final String[] g;
    private static final String[] i;
    private static final Map k;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public s8 H(Object[] var1_1) {
        block11: {
            block10: {
                var2_2 = (String)var1_1[0];
                var3_3 = (Boolean)var1_1[1];
                var4_4 = (Long)var1_1[2];
                v0 = var4_4 = k5.c ^ var4_4;
                var6_5 = v0 ^ 60761269928384L;
                var8_6 = v0 ^ 117358529456601L;
                var10_7 = m44.a("k", (long)5152905208449078117L, (long)var4_4);
                try {
                    v1 = m44.a("u", (Object)this, (long)5083331861247724637L, (long)var4_4);
                    if (var10_7 != false) break block10;
                    if (v1 == false) break block11;
                }
                catch (n9 v2) {
                    throw m44.a("k", (Object)v2, (long)5123983747149063419L, (long)var4_4);
                }
                v1 = var11_8 = (reference)false;
            }
            while (var11_8 < ((CallSite)m44.a("u", (Object)this, (long)6421530288437371129L, (long)var4_4)).length) {
                block12: {
                    block14: {
                        block13: {
                            if (!var3_3) break block13;
                            v3 = new Object[1];
                            v3[0] = var8_6;
                            var12_9 = m44.a("t", (Object)m44.a("u", (Object)this, (long)6421530288437371129L, (long)var4_4)[var11_8], (Object)v3, (long)4856762935194082381L, (long)var4_4);
                            v4 /* !! */  = var10_7;
                            if (var4_4 <= 0L) ** GOTO lbl36
                            if (v4 /* !! */  == false) break block14;
                        }
                        v5 = new Object[1];
                        v5[0] = var6_5;
                        var12_9 = m44.a("t", (Object)m44.a("u", (Object)this, (long)6421530288437371129L, (long)var4_4)[var11_8], (Object)v5, (long)6526755718473720527L, (long)var4_4);
                    }
                    try {
                        v4 /* !! */  = (CallSite)var2_2.equals(var12_9);
lbl36:
                        // 2 sources

                        if (var4_4 < 0L) break block12;
                        if (v4 /* !! */  != false) {
                            return m44.a("u", (Object)this, (long)6421530288437371129L, (long)var4_4)[var11_8];
                        }
                    }
                    catch (n9 v6) {
                        throw m44.a("k", (Object)v6, (long)5123983747149063419L, (long)var4_4);
                    }
                    ++var11_8;
                    v4 /* !! */  = var10_7;
                }
                if (v4 /* !! */  == false) continue;
            }
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    k5(_4 var1_1, int var2_2, String var3_3, h1 var4_4, l6q var5_5, long var6_6, PrintWriter var8_7, String var9_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[DOLOOP]], but top level block is 3[TRYBLOCK]
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
     * WARNING - void declaration
     */
    @Override
    public void z(gu gu2, long l10) {
        block4: {
            void var9_7;
            CallSite callSite;
            long l11;
            block3: {
                CallSite callSite2;
                Object object;
                long l12 = l10;
                long l13 = l12 ^ 0x66FDF08525FDL;
                l11 = l12 ^ 0L;
                CallSite callSite3 = m44.a("h", (long)5618762033536375070L, (long)l10);
                gu2.K(this.b, this, l13, this.H());
                callSite = callSite3;
                try {
                    object = m44.a("v", (Object)this, (long)5544088189886891558L, (long)l10);
                    if (callSite != false) break block3;
                    if (object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)5577459242913033856L, (long)l10);
                }
                object = callSite2 = (Object)false;
            }
            while (var9_7 < ((CallSite)m44.a("v", (Object)this, (long)6009713364618816130L, (long)l10)).length) {
                m44.a("w", (Object)m44.a("v", (Object)this, (long)6009713364618816130L, (long)l10)[var9_7], (Object)gu2, (long)l11, (long)5759007463919830180L, (long)l10);
                ++var9_7;
                if (callSite == false) continue;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Object[] objectArray) {
        block4: {
            void var7_6;
            CallSite callSite;
            long l10;
            long l11;
            block3: {
                CallSite callSite2;
                Object object;
                l11 = (Long)objectArray[0];
                l10 = l11 ^ 0x366379B23F1CL;
                callSite = m44.a("o", (long)1609736174550729393L, (long)l11);
                try {
                    object = m44.a("q", (Object)this, (long)1684269418671496585L, (long)l11);
                    if (callSite != false) break block3;
                    if (object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)n92, (long)1641607591221966127L, (long)l11);
                }
                object = callSite2 = (Object)false;
            }
            while (var7_6 < ((CallSite)m44.a("q", (Object)this, (long)633317321873027373L, (long)l11)).length) {
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l10;
                m44.a("p", (Object)m44.a("q", (Object)this, (long)633317321873027373L, (long)l11)[var7_6], (Object)objectArray2, (long)1202945322579644177L, (long)l11);
                ++var7_6;
                if (callSite == false) continue;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void W(Object[] objectArray) {
        block4: {
            void var11_10;
            CallSite callSite;
            long l10;
            HashMap hashMap;
            HashMap hashMap2;
            long l11;
            block3: {
                CallSite callSite2;
                Object object;
                l11 = (Long)objectArray[0];
                int n10 = (Integer)objectArray[1];
                int n11 = (Integer)objectArray[2];
                hashMap2 = (HashMap)objectArray[3];
                hashMap = (HashMap)objectArray[4];
                l10 = l11 ^ 0x1B8AC0D7B171L;
                callSite = m44.a("n", (long)7658353343727016719L, (long)l11);
                try {
                    object = m44.a("p", (Object)this, (long)8293039031803492800L, (long)l11);
                    if (callSite == false) break block3;
                    if (object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)n92, (long)8250973279195615590L, (long)l11);
                }
                object = callSite2 = (Object)false;
            }
            while (var11_10 < ((CallSite)m44.a("p", (Object)this, (long)7818406926218728804L, (long)l11)).length) {
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = hashMap;
                objectArray2[1] = l10;
                objectArray2[0] = hashMap2;
                m44.a("q", (Object)m44.a("p", (Object)this, (long)7818406926218728804L, (long)l11)[var11_10], (Object)objectArray2, (long)7642945798677133226L, (long)l11);
                ++var11_10;
                if (callSite != false) continue;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void z(Object[] objectArray) {
        block4: {
            void var8_7;
            CallSite callSite;
            long l10;
            long l11;
            Set set;
            block3: {
                CallSite callSite2;
                Object object;
                set = (Set)objectArray[0];
                l11 = (Long)objectArray[1];
                l10 = l11 ^ 0x1E0A187EA644L;
                callSite = m44.a("n", (long)-7259939807516176424L, (long)l11);
                try {
                    object = m44.a("p", (Object)this, (long)-7334437805944123168L, (long)l11);
                    if (callSite != false) break block3;
                    if (object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)n92, (long)-7232423831822387130L, (long)l11);
                }
                object = callSite2 = (Object)false;
            }
            while (var8_7 < ((CallSite)m44.a("p", (Object)this, (long)-8817886374936871868L, (long)l11)).length) {
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l10;
                objectArray2[0] = set;
                m44.a("q", (Object)m44.a("p", (Object)this, (long)-8817886374936871868L, (long)l11)[var8_7], (Object)objectArray2, (long)-7009903130217171486L, (long)l11);
                ++var8_7;
                if (callSite == false) continue;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Object[] objectArray) {
        block4: {
            void var11_10;
            CallSite callSite;
            long l10;
            lqu lqu2;
            l6z l6z2;
            _6 _62;
            long l11;
            block3: {
                CallSite callSite2;
                Object object;
                l11 = (Long)objectArray[0];
                _u _u2 = (_u)objectArray[1];
                _62 = (_6)objectArray[2];
                l6z2 = (l6z)objectArray[3];
                lqu2 = (lqu)objectArray[4];
                l10 = l11 ^ 0x2FC5490995E7L;
                callSite = m44.a("o", (long)6212413212200665809L, (long)l11);
                try {
                    object = m44.a("q", (Object)this, (long)6286946463132720617L, (long)l11);
                    if (callSite != false) break block3;
                    if (object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)n92, (long)6244288211242579279L, (long)l11);
                }
                object = callSite2 = (Object)false;
            }
            while (var11_10 < ((CallSite)m44.a("q", (Object)this, (long)5235994066928054605L, (long)l11)).length) {
                Object[] objectArray2 = new Object[4];
                objectArray2[3] = l10;
                objectArray2[2] = lqu2;
                objectArray2[1] = l6z2;
                objectArray2[0] = _62;
                m44.a("p", (Object)m44.a("q", (Object)this, (long)5235994066928054605L, (long)l11)[var11_10], (Object)objectArray2, (long)6112248090225406784L, (long)l11);
                ++var11_10;
                if (callSite == false) continue;
            }
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    int g(int var1_1, byte var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[DOLOOP]], but top level block is 6[SIMPLE_IF_TAKEN]
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
    @Override
    protected void N(Object[] var1_1) {
        block15: {
            block14: {
                var4_2 = (DataOutputStream)var1_1[0];
                var5_3 = (Map)var1_1[1];
                var2_4 = (Long)var1_1[2];
                var6_5 = (lqu)var1_1[3];
                v0 = var2_4;
                var7_6 = v0 ^ 93420344099345L;
                var9_7 = v0 ^ 0L;
                v1 = m44.a("k", (long)1680553024964027930L, (long)var2_4);
                v2 = new Object[4];
                v2[3] = var6_5;
                v2[2] = var9_7;
                v2[1] = var5_3;
                v2[0] = var4_2;
                super.N(v2);
                var11_8 = v1;
                try {
                    try {
                        v3 /* !! */  = m44.a("u", (Object)this, (long)1009829788873835733L, (long)var2_4);
                        if (var11_8 == false) break block14;
                        if (v3 /* !! */  != false) {
                        }
                        ** GOTO lbl57
                    }
                    catch (n9 v4) {
                        throw m44.a("k", (Object)v4, (long)1122576785348209779L, (long)var2_4);
                    }
                    var4_2.writeShort(((CallSite)m44.a("u", (Object)this, (long)1267172259769804913L, (long)var2_4)).length);
                    v3 /* !! */  = (reference)false;
                }
                catch (n9 v5) {
                    throw m44.a("k", (Object)v5, (long)1122576785348209779L, (long)var2_4);
                }
            }
            var12_9 = v3 /* !! */ ;
            block8: while (var12_9 < ((CallSite)m44.a("u", (Object)this, (long)1267172259769804913L, (long)var2_4)).length) {
                try {
                    v6 = new Object[4];
                    v6[3] = var6_5;
                    v6[2] = var7_6;
                    v6[1] = var5_3;
                    v6[0] = var4_2;
                    m44.a("t", (Object)m44.a("u", (Object)this, (long)1267172259769804913L, (long)var2_4)[var12_9], (Object)v6, (long)1581219630668972309L, (long)var2_4);
                    ++var12_9;
                    do {
                        v7 = var11_8;
                        if (var2_4 >= 0L) {
                            if (v7 == false) break block15;
                            v7 = var11_8;
                        }
                        if (v7 != false) continue block8;
                    } while (var2_4 <= 0L);
                    break;
                }
                catch (n9 v8) {
                    throw m44.a("k", (Object)v8, (long)1122576785348209779L, (long)var2_4);
                }
            }
            try {
                if (var2_4 <= 0L || var11_8 != false) break block15;
lbl57:
                // 2 sources

                var4_2.write((byte[])m44.a("u", (Object)this, (long)988812052272789927L, (long)var2_4));
            }
            catch (n9 v9) {
                throw m44.a("k", (Object)v9, (long)1122576785348209779L, (long)var2_4);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void s(Object[] objectArray) {
        block4: {
            void var11_10;
            CallSite callSite;
            long l10;
            Set set;
            Set set2;
            long l11;
            Set set3;
            Set set4;
            block3: {
                CallSite callSite2;
                Object object;
                set4 = (Set)objectArray[0];
                set3 = (Set)objectArray[1];
                l11 = (Long)objectArray[2];
                set2 = (Set)objectArray[3];
                set = (Set)objectArray[4];
                l10 = l11 ^ 0x4CF189BE8D99L;
                callSite = m44.a("h", (long)2018094200126205257L, (long)l11);
                try {
                    object = m44.a("v", (Object)this, (long)382965665269731206L, (long)l11);
                    if (callSite == false) break block3;
                    if (object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)344246415871682336L, (long)l11);
                }
                object = callSite2 = (Object)false;
            }
            while (var11_10 < ((CallSite)m44.a("v", (Object)this, (long)1929464361503613730L, (long)l11)).length) {
                Object[] objectArray2 = new Object[5];
                objectArray2[4] = set;
                objectArray2[3] = set2;
                objectArray2[2] = l10;
                objectArray2[1] = set3;
                objectArray2[0] = set4;
                m44.a("w", (Object)m44.a("v", (Object)this, (long)1929464361503613730L, (long)l11)[var11_10], (Object)objectArray2, (long)1839233746996432619L, (long)l11);
                ++var11_10;
                if (callSite != false) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected void c(Object[] var1_1) {
        block15: {
            block14: {
                var3_2 = (Long)var1_1[0];
                var2_3 = (DataOutputStream)var1_1[1];
                v0 = var3_2;
                var5_4 = v0 ^ 0L;
                var7_5 = v0 ^ 138122824747950L;
                v1 = m44.a("i", (long)716282175763740856L, (long)var3_2);
                v2 = new Object[2];
                v2[1] = var2_3;
                v2[0] = var5_4;
                super.c(v2);
                var9_6 = v1;
                try {
                    try {
                        v3 /* !! */  = m44.a("w", (Object)this, (long)1198408428474194551L, (long)var3_2);
                        if (var9_6 == false) break block14;
                        if (v3 /* !! */  != false) {
                        }
                        ** GOTO lbl51
                    }
                    catch (n9 v4) {
                        throw m44.a("i", (Object)v4, (long)1240189093990675153L, (long)var3_2);
                    }
                    var2_3.writeShort(((CallSite)m44.a("w", (Object)this, (long)1096589944709314259L, (long)var3_2)).length);
                    v3 /* !! */  = (reference)false;
                }
                catch (n9 v5) {
                    throw m44.a("i", (Object)v5, (long)1240189093990675153L, (long)var3_2);
                }
            }
            var10_7 = v3 /* !! */ ;
            block8: while (var10_7 < ((CallSite)m44.a("w", (Object)this, (long)1096589944709314259L, (long)var3_2)).length) {
                try {
                    v6 = new Object[2];
                    v6[1] = var7_5;
                    v6[0] = var2_3;
                    m44.a("v", (Object)m44.a("w", (Object)this, (long)1096589944709314259L, (long)var3_2)[var10_7], (Object)v6, (long)1487391503694097298L, (long)var3_2);
                    ++var10_7;
                    do {
                        v7 = var9_6;
                        if (var3_2 > 0L) {
                            if (v7 == false) break block15;
                            v7 = var9_6;
                        }
                        if (v7 != false) continue block8;
                    } while (var3_2 <= 0L);
                    break;
                }
                catch (n9 v8) {
                    throw m44.a("i", (Object)v8, (long)1240189093990675153L, (long)var3_2);
                }
            }
            try {
                if (var3_2 <= 0L || var9_6 != false) break block15;
lbl51:
                // 2 sources

                var2_3.write((byte[])m44.a("w", (Object)this, (long)1376640891870979845L, (long)var3_2));
            }
            catch (n9 v9) {
                throw m44.a("i", (Object)v9, (long)1240189093990675153L, (long)var3_2);
            }
        }
    }

    int E(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = c ^ l10;
        return ((CallSite)m44.a("w", (Object)this, (long)-3623229992271858605L, (long)l10)).length;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean l(Object[] var1_1) {
        block26: {
            block27: {
                block28: {
                    var5_2 = (hf)var1_1[0];
                    var6_3 = (lqu)var1_1[1];
                    var3_4 = (Long)var1_1[2];
                    var2_5 = (PrintWriter)var1_1[3];
                    v0 = var3_4;
                    v1 = v0 ^ 138721227050887L;
                    var7_6 = v1 >>> 32;
                    var9_7 = (int)(v1 << 32 >>> 32);
                    var10_8 = v0 ^ 131438816045646L;
                    var12_9 = v0 ^ 30774151829103L;
                    var14_10 = v0 ^ 99147324161282L;
                    var16_11 = v0 ^ 41473284262212L;
                    var18_12 = v0 ^ 98160926896858L;
                    var20_13 = m44.a("h", (long)3105723213626104401L, (long)var3_4);
                    try {
                        v2 /* !! */  = m44.a("v", (Object)this, (long)3623315272531769502L, (long)var3_4);
                        if (var20_13 == false) break block26;
                        if (v2 /* !! */  == false) break block27;
                    }
                    catch (n9 v3) {
                        throw m44.a("h", (Object)v3, (long)3737716660332236856L, (long)var3_4);
                    }
                    var21_14 = 0;
                    var22_15 = true;
                    var23_16 = new ArrayList<CallSite>();
                    for (var24_17 = 0; var24_17 < ((CallSite)m44.a("v", (Object)this, (long)3305323991637480506L, (long)var3_4)).length; ++var24_17) {
                        block35: {
                            block34: {
                                block29: {
                                    block32: {
                                        block33: {
                                            block30: {
                                                block31: {
                                                    var25_18 = m44.a("v", (Object)this, (long)3305323991637480506L, (long)var3_4)[var24_17];
                                                    v4 = new Object[1];
                                                    v4[0] = var18_12;
                                                    var26_19 = m44.a("w", (Object)var25_18, (Object)v4, (long)3876096921676360311L, (long)var3_4);
                                                    try {
                                                        try {
                                                            v5 = new Object[2];
                                                            v5[1] = var26_19;
                                                            v5[0] = var12_9;
                                                            v6 /* !! */  = m44.a("w", (Object)var5_2, (Object)v5, (long)3276387524263984760L, (long)var3_4);
                                                            v7 = var20_13;
                                                            if (var3_4 >= 0L) {
                                                                if (v7 == false) break block28;
                                                                v7 = var20_13;
                                                            }
                                                            if (v7 == false) break block29;
                                                        }
                                                        catch (n9 v8) {
                                                            throw m44.a("h", (Object)v8, (long)3737716660332236856L, (long)var3_4);
                                                        }
                                                        if (v6 /* !! */ ) {
                                                        }
                                                        ** GOTO lbl106
                                                    }
                                                    catch (n9 v9) {
                                                        throw m44.a("h", (Object)v9, (long)3737716660332236856L, (long)var3_4);
                                                    }
                                                    var23_16.add(var25_18);
                                                    var22_15 = false;
                                                    try {
                                                        try {
                                                            v10 = new StringBuilder().append((String)k5.b("p", (int)27593, (long)(3867620203776622907L ^ var3_4))).append((String)m44.a("w", (Object)this, (Object)new Object[0], (long)3989937957937176752L, (long)var3_4));
                                                            v11 /* !! */  = 10028;
                                                            if (var3_4 > 0L) {
                                                                v12 = k5.b("p", (int)v11 /* !! */ , (long)(2075507166247652824L ^ var3_4));
                                                                if (var20_13 == false) break block30;
                                                                v10 = v10.append((String)v12);
                                                                v11 /* !! */  = (int)m44.a("w", (Object)this, (Object)new Object[0], (long)3049029394425736856L, (long)var3_4);
                                                            }
                                                            if (v11 /* !! */  == 0) break block31;
                                                        }
                                                        catch (n9 v13) {
                                                            throw m44.a("h", (Object)v13, (long)3737716660332236856L, (long)var3_4);
                                                        }
                                                        v12 = "";
                                                        break block30;
                                                    }
                                                    catch (n9 v14) {
                                                        throw m44.a("h", (Object)v14, (long)3737716660332236856L, (long)var3_4);
                                                    }
                                                }
                                                v15 = new Object[1];
                                                v15[0] = var14_10;
                                                v12 = "'" + (String)m44.a("w", (Object)this, (Object)v15, (long)3860856797382688832L, (long)var3_4) + (String)k5.b("p", (int)27314, (long)(7140644482960572491L ^ var3_4));
                                            }
                                            var27_20 /* !! */  = v10.append((String)v12).append((String)k5.b("p", (int)28773, (long)(8798762827152808605L ^ var3_4))).append(this.j(var10_8)).append((String)k5.b("p", (int)29657, (long)(6596061275058559266L ^ var3_4))).append(var26_19.O(var7_6, var9_7)).append((String)k5.b("p", (int)17936, (long)(55186049251175655L ^ var3_4))).toString();
                                            try {
                                                try {
                                                    v16 /* !! */  = (int)var20_13;
                                                    if (var3_4 >= 0L) {
                                                        if (v16 /* !! */  == 0) break block32;
                                                        if (m44.a("w", (Object)var6_3, (long)2893779901937840739L, (long)var3_4) == false) break block33;
                                                    }
                                                    ** GOTO lbl103
                                                }
                                                catch (n9 v17) {
                                                    throw m44.a("h", (Object)v17, (long)3737716660332236856L, (long)var3_4);
                                                }
                                                v18 = new Object[1];
                                                v18[0] = var16_11;
                                                m44.a("w", (Object)var6_3, (Object)v18, (long)3096412178331694126L, (long)var3_4).println("\t" + (String)var27_20 /* !! */ );
                                            }
                                            catch (n9 v19) {
                                                throw m44.a("h", (Object)v19, (long)3737716660332236856L, (long)var3_4);
                                            }
                                        }
                                        var2_5.println((String)var27_20 /* !! */ );
                                    }
                                    try {
                                        v16 /* !! */  = (int)var20_13;
lbl103:
                                        // 2 sources

                                        if (var3_4 >= 0L) {
                                            if (v16 /* !! */  != 0) break block34;
                                        }
                                        ** GOTO lbl116
lbl106:
                                        // 2 sources

                                        v20 = true;
                                    }
                                    catch (n9 v21) {
                                        throw m44.a("h", (Object)v21, (long)3737716660332236856L, (long)var3_4);
                                    }
                                }
                                var21_14 = v20;
                            }
                            try {
                                try {
                                    v16 /* !! */  = var21_14;
lbl116:
                                    // 2 sources

                                    if (var20_13 == false) break block35;
                                    if (v16 /* !! */  == 0) continue;
                                }
                                catch (n9 v22) {
                                    throw m44.a("h", (Object)v22, (long)3737716660332236856L, (long)var3_4);
                                }
                                v16 /* !! */  = var23_16.size();
                            }
                            catch (n9 v23) {
                                throw m44.a("h", (Object)v23, (long)3737716660332236856L, (long)var3_4);
                            }
                        }
                        var27_20 /* !! */  = new s8[v16 /* !! */ ];
                        m44.a("t", (Object)this, (s8[])var23_16.toArray(var27_20 /* !! */ ), (long)3305323991637480506L, (long)var3_4);
                        if (var20_13 != false) continue;
                    }
                    v6 /* !! */  = var22_15;
                }
                return v6 /* !! */ ;
            }
            v2 /* !! */  = (CallSite)false;
        }
        return (boolean)v2 /* !! */ ;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void K(Object[] objectArray) {
        block4: {
            void var7_6;
            CallSite callSite;
            long l10;
            long l11;
            block3: {
                CallSite callSite2;
                Object object;
                l11 = (Long)objectArray[0];
                l10 = l11 ^ 0x70616B9E34FL;
                callSite = m44.a("i", (long)3278805135175146696L, (long)l11);
                try {
                    object = m44.a("w", (Object)this, (long)3805967349933800967L, (long)l11);
                    if (callSite == false) break block3;
                    if (object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("i", (Object)n92, (long)3838773698448365217L, (long)l11);
                }
                object = callSite2 = (Object)false;
            }
            while (var7_6 < ((CallSite)m44.a("w", (Object)this, (long)3118680622401966755L, (long)l11)).length) {
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l10;
                m44.a("v", (Object)m44.a("w", (Object)this, (long)3118680622401966755L, (long)l11)[var7_6], (Object)objectArray2, (long)3671261988123011746L, (long)l11);
                ++var7_6;
                if (callSite != false) continue;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String[] w(Object[] objectArray) {
        String[] stringArray;
        String[] stringArray2;
        CallSite callSite;
        long l10;
        long l11;
        block9: {
            Object object;
            block8: {
                l11 = (Long)objectArray[0];
                l10 = (l11 = c ^ l11) ^ 0x5578CF3CFA91L;
                callSite = m44.a("j", (long)-6589934369084549693L, (long)l11);
                try {
                    object = m44.a("t", (Object)this, (long)-4766218671359166708L, (long)l11);
                    if (callSite == false) return new String[object];
                    if (object == false) break block8;
                }
                catch (n9 n92) {
                    throw m44.a("j", (Object)n92, (long)-4878121693876052054L, (long)l11);
                }
                stringArray2 = new String[((CallSite)m44.a("t", (Object)this, (long)-6751817242533602392L, (long)l11)).length];
                break block9;
            }
            object = false;
            return new String[object];
        }
        block4: for (int i10 = 0; i10 < ((CallSite)m44.a("t", (Object)this, (long)-6751817242533602392L, (long)l11)).length; ++i10) {
            try {
                do {
                    stringArray = stringArray2;
                    Object object = callSite;
                    if (l11 >= 0L) {
                        if (object == false) return stringArray;
                        object = i10;
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l10;
                    stringArray[object] = m44.a("u", (Object)m44.a("t", (Object)this, (long)-6751817242533602392L, (long)l11)[i10], (Object)objectArray2, (long)-6790632718901847650L, (long)l11);
                    if (callSite != false) continue block4;
                } while (l11 < 0L);
                break;
            }
            catch (n9 n93) {
                throw m44.a("j", (Object)n93, (long)-4878121693876052054L, (long)l11);
            }
        }
        stringArray = stringArray2;
        return stringArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                k5.c = prr.a(-1064560571520232452L, 4129042447096962590L, MethodHandles.lookup().lookupClass()).a(113181474013383L);
                k5.k = new HashMap<K, V>(13);
                var0 = k5.c ^ 125187452763124L;
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
                var9_3 = new String[13];
                var7_4 = 0;
                var6_5 = "\u00a0\u0091\u00e2\u00c9|\u00ca\u0083\u0086\u00b20\u0003\u00c1\u0000CT0(\u0007\u001a\u0087?n\u008dEtH\u0081\u001e9\u00d9\u00efw\u001c\u00e3\u0017u\u00c0\u0090\u00f8\u0006\u0010\u00c0\u00a3\u0018\u009c\u00b9&\u00abS\u0087?'\b\b\u009d\u00a0\u00ca )\u00fc\u00e4\u008e\u00cb,\n\u0081\u000b\u00fa\"dY\u0006\u00e1M\u00a9]\u008d\u0002\u001aUl\u008d\u00a1\u00f5L\u00f6\u00e8\u00f87\u0001\u0010\u00f9\u00c7Z\u0004 6\"\u00e5f\u00e8\u00b9`_\u00fc\u00d4\u00fa\u0010\u0093\r\u00d9\u00dbY\u00c7kY\u00e1\t\u00fdt~\u00d85\u008c\u0010\u00c9\u00d9\u0019\u00f59\u00b7J[;_\u0099\u00bc1G\\]\u0010b\u00f6\u00e4\u00ae\u000e\u00caL\u00db3\u00a2\u00b3\u00e3\u0096\u00d8W\u0013 \u00a5\u00cd?\u009b\u00ad\u00da\bO2\u008f_1cA\u0007\u0090\u0087\u00dc\u00cf*\u00abO5\u00d8\u0002*\u0087\u0095\u00d8_\u00cfnP\u00a0e\u00f3\u00c6\u00a9\u008dW\u00a2\u00aa\u0091\u00ed)\u00f2\u008d\u00cc\u008f\u00c9\u00e3\u00fc\u00bc\u00c8n\u00eb\u00d3\u00fe\u00fb\n\u00f0\fT\u0018\u00a3\u0000\u00ec\u00c8\u00bd\u00f1RI\u00d6\u00c7\u00d6\u00e0\u00c08\u00d5\u009b\u001e\u00d4YA\u001a\u00e2\u0088\u001fmqI\u00cbr\u00ae\u0006\u0003ZO\u00b4I{(\u00a9y\u00b7\u00deq\u00a9\u009f\u00d2\u00e7\u00ea\u00fb(\r\u00c1\u00faB=\u001bD\r\"\u0018L\u00d1i\u0019\u008f\u00dc\u001b\u001e!\u00c2\u009c\tT#\u0003\u00fb\u001eMKP\u00eaNS\u008e\u009dgT\u00df\u001c'\u0010\u000b\u00ad\u00b4 |\u0004FU7\u00de\u00a7\u00a2c\u00ff\u001b\u00b3";
                var8_6 = "\u00a0\u0091\u00e2\u00c9|\u00ca\u0083\u0086\u00b20\u0003\u00c1\u0000CT0(\u0007\u001a\u0087?n\u008dEtH\u0081\u001e9\u00d9\u00efw\u001c\u00e3\u0017u\u00c0\u0090\u00f8\u0006\u0010\u00c0\u00a3\u0018\u009c\u00b9&\u00abS\u0087?'\b\b\u009d\u00a0\u00ca )\u00fc\u00e4\u008e\u00cb,\n\u0081\u000b\u00fa\"dY\u0006\u00e1M\u00a9]\u008d\u0002\u001aUl\u008d\u00a1\u00f5L\u00f6\u00e8\u00f87\u0001\u0010\u00f9\u00c7Z\u0004 6\"\u00e5f\u00e8\u00b9`_\u00fc\u00d4\u00fa\u0010\u0093\r\u00d9\u00dbY\u00c7kY\u00e1\t\u00fdt~\u00d85\u008c\u0010\u00c9\u00d9\u0019\u00f59\u00b7J[;_\u0099\u00bc1G\\]\u0010b\u00f6\u00e4\u00ae\u000e\u00caL\u00db3\u00a2\u00b3\u00e3\u0096\u00d8W\u0013 \u00a5\u00cd?\u009b\u00ad\u00da\bO2\u008f_1cA\u0007\u0090\u0087\u00dc\u00cf*\u00abO5\u00d8\u0002*\u0087\u0095\u00d8_\u00cfnP\u00a0e\u00f3\u00c6\u00a9\u008dW\u00a2\u00aa\u0091\u00ed)\u00f2\u008d\u00cc\u008f\u00c9\u00e3\u00fc\u00bc\u00c8n\u00eb\u00d3\u00fe\u00fb\n\u00f0\fT\u0018\u00a3\u0000\u00ec\u00c8\u00bd\u00f1RI\u00d6\u00c7\u00d6\u00e0\u00c08\u00d5\u009b\u001e\u00d4YA\u001a\u00e2\u0088\u001fmqI\u00cbr\u00ae\u0006\u0003ZO\u00b4I{(\u00a9y\u00b7\u00deq\u00a9\u009f\u00d2\u00e7\u00ea\u00fb(\r\u00c1\u00faB=\u001bD\r\"\u0018L\u00d1i\u0019\u008f\u00dc\u001b\u001e!\u00c2\u009c\tT#\u0003\u00fb\u001eMKP\u00eaNS\u008e\u009dgT\u00df\u001c'\u0010\u000b\u00ad\u00b4 |\u0004FU7\u00de\u00a7\u00a2c\u00ff\u001b\u00b3".length();
                var5_7 = 16;
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
                    var9_3[var7_4++] = k5.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0015\u001c\u009bgj\u00c9\u0090_\u00cd\u00ebl:~V\u0015\u00f1\u0010h9\u00f8\u0019\u0004g\u00c3\u00fb\u00a5m\u0091\u009e#~\u00ce\u00b6";
                    var8_6 = "\u0015\u001c\u009bgj\u00c9\u0090_\u00cd\u00ebl:~V\u0015\u00f1\u0010h9\u00f8\u0019\u0004g\u00c3\u00fb\u00a5m\u0091\u009e#~\u00ce\u00b6".length();
                    var5_7 = 16;
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
                    var9_3[var7_4++] = k5.c(var10_9).intern();
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
        k5.g = var9_3;
        k5.i = new String[13];
    }

    private static Exception a(Exception exception) {
        return exception;
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

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x12F4;
        if (i[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])k.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/k5", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = g[n11].getBytes("ISO-8859-1");
            k5.i[n11] = k5.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return i[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = k5.b(n10, l10);
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
            throw new RuntimeException("com/zelix/k5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(k5.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

