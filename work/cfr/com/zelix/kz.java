/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._v;
import com.zelix.bg;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.j9;
import com.zelix.js;
import com.zelix.kx;
import com.zelix.l6q;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.nw;
import com.zelix.prr;
import com.zelix.x8;
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

public class kz
extends kx {
    bg[] g;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map i;

    /*
     * Unable to fully structure code
     */
    public void C(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var4_3 = (var2_2 = kz.a ^ var2_2) ^ 52793533926463L;
        var7_4 = 0;
        var6_5 = m44.a("i", (long)-6111156109076529193L, (long)var2_2);
        while (var7_4 < ((CallSite)m44.a("w", (Object)this, (long)-5498407639125555806L, (long)var2_2)).length) {
            v0 = new Object[2];
            v0[1] = var7_4;
            v0[0] = var4_3;
            m44.a("v", (Object)m44.a("w", (Object)this, (long)-5498407639125555806L, (long)var2_2)[var7_4], (Object)v0, (long)-5797919400776575505L, (long)var2_2);
            ++var7_4;
lbl14:
            // 2 sources

            ** while (var6_5 != false)
lbl15:
            // 1 sources

        }
lbl16:
        // 2 sources

        if (var2_2 <= 0L) ** GOTO lbl14
    }

    bg e(Object[] objectArray) {
        bg bg2;
        j9 j92 = (j9)objectArray[0];
        js[] jsArray = (js[])objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x27E70271B3DDL;
        int n10 = (int)(l12 >>> 32);
        int n11 = (int)(l12 << 32 >>> 56);
        int n12 = (int)(l12 << 40 >>> 40);
        long l13 = l11 ^ 0x70AF808D1128L;
        bg[] bgArray = new bg[((CallSite)m44.a("u", (Object)this, (long)5524665125592267448L, (long)l10)).length + 1];
        System.arraycopy(m44.a("u", (Object)this, (long)5524665125592267448L, (long)l10), 0, bgArray, 0, ((CallSite)m44.a("u", (Object)this, (long)5524665125592267448L, (long)l10)).length);
        bgArray[((CallSite)m44.a("u", (Object)this, (long)5524665125592267448L, (long)l10)).length] = bg2 = new bg(this, l13, j92, jsArray, ((CallSite)m44.a("u", (Object)this, (long)5524665125592267448L, (long)l10)).length);
        m44.a("w", (Object)this, (bg[])bgArray, (long)5524665125592267448L, (long)l10);
        this.W = (int)m44.a("t", (Object)this, (int)n10, (byte)((byte)n11), (int)n12, (long)5502654418320343309L, (long)l10);
        return bg2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void c(Object[] var1_1) {
        block15: {
            block14: {
                var2_2 = (Long)var1_1[0];
                var4_3 = (DataOutputStream)var1_1[1];
                v0 = var2_2;
                var5_4 = v0 ^ 0L;
                var7_5 = v0 ^ 87017900681524L;
                v1 = m44.a("i", (long)716282175763740856L, (long)var2_2);
                v2 = new Object[2];
                v2[1] = var4_3;
                v2[0] = var5_4;
                super.c(v2);
                var9_6 = v1;
                try {
                    try {
                        v3 = this;
                        if (var9_6 == false) break block14;
                        if (m44.a("w", (Object)v3, (long)1198408428474194551L, (long)var2_2) != false) {
                        }
                        ** GOTO lbl54
                    }
                    catch (IllegalArgumentException v4) {
                        throw m44.a("i", (Object)v4, (long)1496933087650997290L, (long)var2_2);
                    }
                    var4_3.writeShort(((CallSite)m44.a("w", (Object)this, (long)660263343992815418L, (long)var2_2)).length);
                    v3 = this;
                }
                catch (IllegalArgumentException v5) {
                    throw m44.a("i", (Object)v5, (long)1496933087650997290L, (long)var2_2);
                }
            }
            var10_7 = m44.a("w", (Object)v3, (long)660263343992815418L, (long)var2_2);
            var11_8 = ((CallSite)var10_7).length;
            var12_9 = 0;
            block8: while (var12_9 < var11_8) {
                var13_10 = var10_7[var12_9];
                try {
                    v6 = new Object[2];
                    v6[1] = var7_5;
                    v6[0] = var4_3;
                    m44.a("v", (Object)var13_10, (Object)v6, (long)831036106349126273L, (long)var2_2);
                    ++var12_9;
                    do {
                        v7 = var9_6;
                        if (var2_2 >= 0L) {
                            if (v7 == false) break block15;
                            v7 = var9_6;
                        }
                        if (v7 != false) continue block8;
                    } while (var2_2 <= 0L);
                    break;
                }
                catch (IllegalArgumentException v8) {
                    throw m44.a("i", (Object)v8, (long)1496933087650997290L, (long)var2_2);
                }
            }
            try {
                if (var2_2 < 0L || var9_6 != false) break block15;
lbl54:
                // 2 sources

                var4_3.write((byte[])m44.a("w", (Object)this, (long)1376640891870979845L, (long)var2_2));
            }
            catch (IllegalArgumentException v9) {
                throw m44.a("i", (Object)v9, (long)1496933087650997290L, (long)var2_2);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public bg a(Object[] var1_1) {
        block7: {
            block6: {
                var2_2 = (Long)var1_1[0];
                var4_3 = (Integer)var1_1[1];
                v0 = var2_2 = kz.a ^ var2_2;
                var5_4 = v0 ^ 111864770099453L;
                var7_5 = v0 ^ 65703276316016L;
                var9_6 = m44.a("k", (long)-2165425869192645355L, (long)var2_2);
                try {
                    v1 = var4_3;
                    if (var9_6 != false) break block6;
                    if (v1 >= 0) {
                    }
                    ** GOTO lbl21
                }
                catch (IllegalArgumentException v2) {
                    throw m44.a("k", (Object)v2, (long)-1973633714434042768L, (long)var2_2);
                }
                v1 = var4_3;
            }
            try {
                if (v1 < ((CallSite)m44.a("u", (Object)this, (long)-471848667675046048L, (long)var2_2)).length) break block7;
lbl21:
                // 2 sources

                v3 = new Object[1];
                v3[0] = var7_5;
                throw new IllegalArgumentException((String)kz.b("p", (int)10562, (long)(7639152087972861753L ^ var2_2)) + (String)m44.a("t", (Object)m44.a("t", (Object)this, (Object)v3, (long)-2215500224594018971L, (long)var2_2), (Object)new Object[0], (long)-1879116664203398653L, (long)var2_2) + (String)kz.b("p", (int)10182, (long)(5643981413373008316L ^ var2_2)) + this.j(var5_4) + (String)kz.b("p", (int)4061, (long)(4706730445555364269L ^ var2_2)) + var4_3 + ">" + (((CallSite)m44.a("u", (Object)this, (long)-471848667675046048L, (long)var2_2)).length - 1));
            }
            catch (IllegalArgumentException v4) {
                throw m44.a("k", (Object)v4, (long)-1973633714434042768L, (long)var2_2);
            }
        }
        return m44.a("u", (Object)this, (long)-471848667675046048L, (long)var2_2)[var4_3];
    }

    public void w(Object[] objectArray) {
        block6: {
            kz kz2;
            CallSite callSite;
            long l10;
            Set set;
            long l11;
            block5: {
                l11 = (Long)objectArray[0];
                set = (Set)objectArray[1];
                l10 = (l11 = a ^ l11) ^ 0x71680C7F8D1EL;
                callSite = m44.a("h", (long)5461145363161561729L, (long)l11);
                try {
                    try {
                        kz2 = this;
                        if (callSite == false) break block5;
                        if (m44.a("v", (Object)kz2, (long)5951724611817871438L, (long)l11) == false) break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("h", (Object)illegalArgumentException, (long)6268853089128949267L, (long)l11);
                    }
                    kz2 = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("h", (Object)illegalArgumentException, (long)6268853089128949267L, (long)l11);
                }
            }
            for (CallSite callSite2 : m44.a("v", (Object)kz2, (long)5409076171808996611L, (long)l11)) {
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l10;
                objectArray2[0] = set;
                m44.a("w", (Object)callSite2, (Object)objectArray2, (long)5338144318688251884L, (long)l11);
                if (callSite != false) continue;
            }
        }
    }

    kz(_v _v2, x8 x82, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x155BD016326L;
        super(l11, _v2, x82, 2);
        m44.a("s", (Object)this, (bg[])new bg[0], (long)5962664824363836588L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    @Override
    int g(int var1_1, byte var2_2, int var3_3) {
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
        while (var9_6 < ((CallSite)m44.a("v", (Object)this, (long)6158864677973222251L, (long)var2_2)).length) {
            m44.a("w", (Object)m44.a("v", (Object)this, (long)6158864677973222251L, (long)var2_2)[var9_6], (Object)var1_1, (long)var6_4, (long)5831293134151661907L, (long)var2_2);
            ++var9_6;
lbl14:
            // 2 sources

            ** while (var8_5 == false)
lbl15:
            // 1 sources

        }
lbl16:
        // 2 sources

        if (var2_2 < 0L) ** GOTO lbl14
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void k(Object[] var1_1) {
        block20: {
            block18: {
                var4_2 = (Set)var1_1[0];
                var2_3 = (Long)var1_1[1];
                v0 = (var2_3 = kz.a ^ var2_3) ^ 63214064489668L;
                var5_4 = (int)(v0 >>> 32);
                var6_5 = (int)(v0 << 32 >>> 56);
                var7_6 = (int)(v0 << 40 >>> 40);
                var9_7 = new ArrayList<CallSite>(((CallSite)m44.a("t", (Object)this, (long)3148740923857313185L, (long)var2_3)).length);
                var10_8 = m44.a("t", (Object)this, (long)3148740923857313185L, (long)var2_3);
                var11_9 = ((CallSite)var10_8).length;
                var8_10 = m44.a("j", (long)3128761403220974115L, (long)var2_3);
                var12_11 = 0;
                while (var12_11 < var11_9) {
                    block16: {
                        block17: {
                            block19: {
                                var13_12 = var10_8[var12_11];
                                try {
                                    try {
                                        try {
                                            v1 = var8_10;
                                            if (var2_3 <= 0L) break block16;
                                            if (v1 == false) break block17;
                                            v2 = (int)var4_2.contains(var13_12);
                                            v3 /* !! */  = (int)var8_10;
                                            if (var2_3 > 0L) {
                                                if (v3 /* !! */  == 0) break block18;
                                            }
                                            ** GOTO lbl51
                                        }
                                        catch (IllegalArgumentException v4) {
                                            throw m44.a("j", (Object)v4, (long)3917293319961462449L, (long)var2_3);
                                        }
                                        if (v2 == 0) break block19;
                                    }
                                    catch (IllegalArgumentException v5) {
                                        throw m44.a("j", (Object)v5, (long)3917293319961462449L, (long)var2_3);
                                    }
                                    var9_7.add(var13_12);
                                }
                                catch (IllegalArgumentException v6) {
                                    throw m44.a("j", (Object)v6, (long)3917293319961462449L, (long)var2_3);
                                }
                            }
                            ++var12_11;
                        }
                        v1 = var8_10;
                    }
                    if (v1 != false) continue;
                }
                if (var2_3 <= 0L) break block20;
                v2 = var9_7.size();
            }
            try {
                v3 /* !! */  = ((CallSite)m44.a("t", (Object)this, (long)3148740923857313185L, (long)var2_3)).length;
lbl51:
                // 2 sources

                if (v2 < v3 /* !! */ ) {
                    m44.a("v", (Object)this, (bg[])var9_7.toArray(new bg[var9_7.size()]), (long)3148740923857313185L, (long)var2_3);
                    this.W = (int)m44.a("u", (Object)this, (int)var5_4, (byte)((byte)var6_5), (int)var7_6, (long)3117693340449875476L, (long)var2_3);
                }
            }
            catch (IllegalArgumentException v7) {
                throw m44.a("j", (Object)v7, (long)3917293319961462449L, (long)var2_3);
            }
        }
    }

    /*
     * Exception decompiling
     */
    kz(_4 var1_1, int var2_2, String var3_3, h1 var4_4, short var5_5, int var6_6, l6q var7_7, l6q var8_8, l6q var9_9, l6q var10_10, l6q var11_11, int var12_12, PrintWriter var13_13) {
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

    public void R(Object[] objectArray) {
        block7: {
            _v _v2;
            kz kz2;
            CallSite callSite;
            long l10;
            long l11;
            int n10;
            int n11;
            int n12;
            long l12;
            block6: {
                l12 = (Long)objectArray[0];
                long l13 = l12 = a ^ l12;
                long l14 = l13 ^ 0x1E0463FFA1A3L;
                n12 = (int)(l14 >>> 32);
                n11 = (int)(l14 << 32 >>> 48);
                n10 = (int)(l14 << 48 >>> 48);
                l11 = l13 ^ 0x2EA40933D45L;
                l10 = l13 ^ 0x3DF4AD98E69DL;
                callSite = m44.a("n", (long)-1481772754954698872L, (long)l12);
                try {
                    try {
                        kz2 = this;
                        if (callSite != false) break block6;
                        if (m44.a("p", (Object)kz2, (long)-1556280511707209552L, (long)l12) == false) break block7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("n", (Object)illegalArgumentException, (long)-1296669776610156819L, (long)l12);
                    }
                    kz2 = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)-1296669776610156819L, (long)l12);
                }
            }
            if ((_v2 = kz2.G(l11)).a(n12, n11, n10).equals(kz.b("p", (int)9151, (long)(0x13DC6D146740D75CL ^ l12)))) {
                for (CallSite callSite2 : m44.a("p", (Object)this, (long)-869516883391756803L, (long)l12)) {
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = _v2;
                    objectArray2[0] = l10;
                    m44.a("q", (Object)callSite2, (Object)objectArray2, (long)-1188554403738446673L, (long)l12);
                    if (callSite == false) continue;
                }
            }
        }
    }

    boolean t(Object[] objectArray) {
        boolean bl2;
        block2: {
            block3: {
                long l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite = m44.a("n", (long)-4616312123320250713L, (long)l10);
                try {
                    bl2 = ((CallSite)m44.a("p", (Object)this, (long)-4668380899440948955L, (long)l10)).length;
                    if (callSite == false) break block2;
                    if (bl2) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)-6712330491258023371L, (long)l10);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void N(Object[] var1_1) {
        block15: {
            block14: {
                var3_2 = (DataOutputStream)var1_1[0];
                var2_3 = (Map)var1_1[1];
                var5_4 = (Long)var1_1[2];
                var4_5 = (lqu)var1_1[3];
                v0 = var5_4;
                var7_6 = v0 ^ 32855173474499L;
                var9_7 = v0 ^ 0L;
                v1 = m44.a("k", (long)1680553024964027930L, (long)var5_4);
                v2 = new Object[4];
                v2[3] = var4_5;
                v2[2] = var9_7;
                v2[1] = var2_3;
                v2[0] = var3_2;
                super.N(v2);
                var11_8 = v1;
                try {
                    try {
                        v3 = this;
                        if (var11_8 == false) break block14;
                        if (m44.a("u", (Object)v3, (long)1009829788873835733L, (long)var5_4) != false) {
                        }
                        ** GOTO lbl60
                    }
                    catch (IllegalArgumentException v4) {
                        throw m44.a("k", (Object)v4, (long)748745961791060616L, (long)var5_4);
                    }
                    var3_2.writeShort(((CallSite)m44.a("u", (Object)this, (long)1696593485081092504L, (long)var5_4)).length);
                    v3 = this;
                }
                catch (IllegalArgumentException v5) {
                    throw m44.a("k", (Object)v5, (long)748745961791060616L, (long)var5_4);
                }
            }
            var12_9 = m44.a("u", (Object)v3, (long)1696593485081092504L, (long)var5_4);
            var13_10 = ((CallSite)var12_9).length;
            var14_11 = 0;
            block8: while (var14_11 < var13_10) {
                var15_12 = var12_9[var14_11];
                try {
                    v6 = new Object[4];
                    v6[3] = var4_5;
                    v6[2] = var7_6;
                    v6[1] = var2_3;
                    v6[0] = var3_2;
                    m44.a("t", (Object)var15_12, (Object)v6, (long)769082107486001517L, (long)var5_4);
                    ++var14_11;
                    do {
                        v7 = var11_8;
                        if (var5_4 >= 0L) {
                            if (v7 == false) break block15;
                            v7 = var11_8;
                        }
                        if (v7 != false) continue block8;
                    } while (var5_4 <= 0L);
                    break;
                }
                catch (IllegalArgumentException v8) {
                    throw m44.a("k", (Object)v8, (long)748745961791060616L, (long)var5_4);
                }
            }
            try {
                if (var5_4 < 0L || var11_8 != false) break block15;
lbl60:
                // 2 sources

                var3_2.write((byte[])m44.a("u", (Object)this, (long)988812052272789927L, (long)var5_4));
            }
            catch (IllegalArgumentException v9) {
                throw m44.a("k", (Object)v9, (long)748745961791060616L, (long)var5_4);
            }
        }
    }

    /*
     * Exception decompiling
     */
    public nw D(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [39[DOLOOP]], but top level block is 8[TRYBLOCK]
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
        block11: {
            block10: {
                kz.a = prr.a(3311239727485294547L, -8051946792447100477L, MethodHandles.lookup().lookupClass()).a(133909924705583L);
                kz.i = new HashMap<K, V>(13);
                var0 = kz.a ^ 106171735841336L;
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
                var9_3 = new String[14];
                var7_4 = 0;
                var6_5 = "^\u00e5%\u0090\u00f6\u0000;\u0014\u0012\u009e\u00ba\u00f5\u00adN\u00d0\u00a1 R\u00d8\u0018\u0006\u00b83XS\u000e\u00c4H\u00ee\u00e0Z '\u00e7|.'9\u0001y\u00d67F\u00af3\u000bUtu\u0010\u0095}f\u001e\u00d3X\u00f0\u00a5\u0087\u0085#`\u0085e9T\u0010\u0092\u0015\u00af7\u00fcJ\u0000\u00ba\u008e:\u0007J\u00bd\u0010\u00ad\u000b\u0010\u009a\u00bb\u00a8\u00c3\u00bf\u00ae\u00e5\u00aex^3\u0084\u00d3\u00f9,e\u00f8\u00f6\u00956\u00c8|\u00b6\u0085Nf3{\u00c6\u00f5d\u0005\u00d7{G\u00f9?\u0002$?\f\u00a6 \u00fc\u00e4Q\u0002\u0082\u00d3\u00f5*\u00a9)'(|T\u00bc\u00eb\u008c\u00d3\u000e\u00af$\u0084\u000f\u001d{\u00b9\u00cf\u00e3|\u008b\u00d4pH\u009d\u000e\u00dd\u00b8\u00ef\u009e\u00caF\u00e5\u0002E\u00f6-\t\u001b\u00aa\u00990\u0016\u0097\u00d3\\1{\u00f7\u008eK\u00d3\u00b9\u00c0T5\u00e9\u00d5.W\u00c6\u007f\u00e9\u00b6\u0086\u00d4\u00bea+\u00be\u0085\u008elv\u00e8V\u00a8q@\u008c9\u0098\u0091\u0091\u0001#\u00d7\u00fa\u00c5\u001dsq\u00b2\u00e7b\u00b9\u00c5\u00bd\u001d\u00fd\u008f\u00f1>\u00b9\u0087O`\u0099h\u00d0\u001c\u00b2\u00f7R\\\u0018F\u0011\u0001\u00e8\u0004\u00c5\u00d5s\u00d3\u0015\u00c5\u009a\u00e1\u00df^\u0004Xh0\u0005\u00c5\u00c6\u0094NY\u00c4\u00f6\u00a07m2\u001eW[(\u00ca'\u0093\u008e\u00d6\u0015.`,\u00cd[\u001cLc\u00e4\u00951\u00cb\u00d5\u00bb\u00ee\u0002\u00de\u00e4\u0098R\u00d6\u00ad\u0089\f\u00bbkR\u00e5{=\u000f\u00a5{x\u0006\u00d7\u0010\u00e2E\u00e1\u00d0r\u00fe\u00d0E\u00d7\u0000\u00d1\u00beY\u0003Y\u0095\u00acQ\u00e6\u0010H\u00c1~\u00d8\u0007\u0019\u008eV\n\u00e0\u00c1G;D\u0086\u00bd@hKF \u00c33\u0098\u0083<\u00a4\u00ca\u00db\u0095\u00be\u00ef\u0098\u009b\u001c\u0018\u00ee&\u009aCk\u00f4`d,\u00fe:X\u0011\u00f2\u00d0\n?|>\t\u001f\u00c4\u00c5\u00b5\u0004\u00e6\u00f0n\u008f\u00ae5\u00c55\u00ea56\u0091\u0093\u00a0\u00ff\u00ab\u00f9\u008e\u00c1\u00910\u0080Yk\u0086M\u001e\u008a:\u00c1\fH1v\u00fe\u00d2\u00a3\u00b0\u00d8\u00d7\u00f1\u008a\u001d\u0015\u00f3\u0093\u0082\u009fW\u00a4\u00a9\u00b8\u009a\u00a5\u00cf\u0002*c!\b?\u0093&\u00eaq\u0089\u00d5\u00bed(\u00df\u000bq\u00d8\u00ee\u0092\u0005\u00ad{\u0086\u00e5\f\u00fa\t\u0093\u00eb\u00da\u0002\u001c\u00d9\u0099<nM\u0082\u00b2\u0011\u00cb\u0004;\u00afq\u0081\u00b4\u0088\u00ee$C \u00a2(7\u00fb\twr\u001a\u008d\u00ae\u0093.[q\u001c(\u0010\u0000\u00d8\u00c6\u00e4\u00a0T\u0093\u009b\u0084\u00b9>`3\u0090\u000f\u00a5\u00a2x&1k\u00c5\u0096\n\u00ab\u0010\u0004\u0082q\u0097bQ\u00f0/\u009dW\u00f4\u00e4\u007f\u00bc\u00fan";
                var8_6 = "^\u00e5%\u0090\u00f6\u0000;\u0014\u0012\u009e\u00ba\u00f5\u00adN\u00d0\u00a1 R\u00d8\u0018\u0006\u00b83XS\u000e\u00c4H\u00ee\u00e0Z '\u00e7|.'9\u0001y\u00d67F\u00af3\u000bUtu\u0010\u0095}f\u001e\u00d3X\u00f0\u00a5\u0087\u0085#`\u0085e9T\u0010\u0092\u0015\u00af7\u00fcJ\u0000\u00ba\u008e:\u0007J\u00bd\u0010\u00ad\u000b\u0010\u009a\u00bb\u00a8\u00c3\u00bf\u00ae\u00e5\u00aex^3\u0084\u00d3\u00f9,e\u00f8\u00f6\u00956\u00c8|\u00b6\u0085Nf3{\u00c6\u00f5d\u0005\u00d7{G\u00f9?\u0002$?\f\u00a6 \u00fc\u00e4Q\u0002\u0082\u00d3\u00f5*\u00a9)'(|T\u00bc\u00eb\u008c\u00d3\u000e\u00af$\u0084\u000f\u001d{\u00b9\u00cf\u00e3|\u008b\u00d4pH\u009d\u000e\u00dd\u00b8\u00ef\u009e\u00caF\u00e5\u0002E\u00f6-\t\u001b\u00aa\u00990\u0016\u0097\u00d3\\1{\u00f7\u008eK\u00d3\u00b9\u00c0T5\u00e9\u00d5.W\u00c6\u007f\u00e9\u00b6\u0086\u00d4\u00bea+\u00be\u0085\u008elv\u00e8V\u00a8q@\u008c9\u0098\u0091\u0091\u0001#\u00d7\u00fa\u00c5\u001dsq\u00b2\u00e7b\u00b9\u00c5\u00bd\u001d\u00fd\u008f\u00f1>\u00b9\u0087O`\u0099h\u00d0\u001c\u00b2\u00f7R\\\u0018F\u0011\u0001\u00e8\u0004\u00c5\u00d5s\u00d3\u0015\u00c5\u009a\u00e1\u00df^\u0004Xh0\u0005\u00c5\u00c6\u0094NY\u00c4\u00f6\u00a07m2\u001eW[(\u00ca'\u0093\u008e\u00d6\u0015.`,\u00cd[\u001cLc\u00e4\u00951\u00cb\u00d5\u00bb\u00ee\u0002\u00de\u00e4\u0098R\u00d6\u00ad\u0089\f\u00bbkR\u00e5{=\u000f\u00a5{x\u0006\u00d7\u0010\u00e2E\u00e1\u00d0r\u00fe\u00d0E\u00d7\u0000\u00d1\u00beY\u0003Y\u0095\u00acQ\u00e6\u0010H\u00c1~\u00d8\u0007\u0019\u008eV\n\u00e0\u00c1G;D\u0086\u00bd@hKF \u00c33\u0098\u0083<\u00a4\u00ca\u00db\u0095\u00be\u00ef\u0098\u009b\u001c\u0018\u00ee&\u009aCk\u00f4`d,\u00fe:X\u0011\u00f2\u00d0\n?|>\t\u001f\u00c4\u00c5\u00b5\u0004\u00e6\u00f0n\u008f\u00ae5\u00c55\u00ea56\u0091\u0093\u00a0\u00ff\u00ab\u00f9\u008e\u00c1\u00910\u0080Yk\u0086M\u001e\u008a:\u00c1\fH1v\u00fe\u00d2\u00a3\u00b0\u00d8\u00d7\u00f1\u008a\u001d\u0015\u00f3\u0093\u0082\u009fW\u00a4\u00a9\u00b8\u009a\u00a5\u00cf\u0002*c!\b?\u0093&\u00eaq\u0089\u00d5\u00bed(\u00df\u000bq\u00d8\u00ee\u0092\u0005\u00ad{\u0086\u00e5\f\u00fa\t\u0093\u00eb\u00da\u0002\u001c\u00d9\u0099<nM\u0082\u00b2\u0011\u00cb\u0004;\u00afq\u0081\u00b4\u0088\u00ee$C \u00a2(7\u00fb\twr\u001a\u008d\u00ae\u0093.[q\u001c(\u0010\u0000\u00d8\u00c6\u00e4\u00a0T\u0093\u009b\u0084\u00b9>`3\u0090\u000f\u00a5\u00a2x&1k\u00c5\u0096\n\u00ab\u0010\u0004\u0082q\u0097bQ\u00f0/\u009dW\u00f4\u00e4\u007f\u00bc\u00fan".length();
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
                    var9_3[var7_4++] = kz.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "@\u00f2\u008fw5G\u00eb\u000f\u00c3\u00de\u0012\u001ev\u00e4\u00e9\tkxp\u00f1\u000b\u0013\u00ce\u009cxsu\u00f1\u00f0=\u0097\u0012\u0089\u00f5o\u00be\u000b\u00e1}H0t\u00e5M\u00cc<5Q\u0093\u00c11\u009aa\u00d5n9\u0099o\u0092\u0090c\u00f0\u00c1(\u0087\u0012-\u00eb\u00b7\u00b4\u0085t\u0093\u0002\u0093\f\u001fsS/\u00f3\u00cf\u00cd\u00cb\u00fd6P?n";
                    var8_6 = "@\u00f2\u008fw5G\u00eb\u000f\u00c3\u00de\u0012\u001ev\u00e4\u00e9\tkxp\u00f1\u000b\u0013\u00ce\u009cxsu\u00f1\u00f0=\u0097\u0012\u0089\u00f5o\u00be\u000b\u00e1}H0t\u00e5M\u00cc<5Q\u0093\u00c11\u009aa\u00d5n9\u0099o\u0092\u0090c\u00f0\u00c1(\u0087\u0012-\u00eb\u00b7\u00b4\u0085t\u0093\u0002\u0093\f\u001fsS/\u00f3\u00cf\u00cd\u00cb\u00fd6P?n".length();
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
                    var9_3[var7_4++] = kz.c(var10_9).intern();
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
        kz.c = var9_3;
        kz.d = new String[14];
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x14C7;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])i.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/kz", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n11].getBytes("ISO-8859-1");
            kz.d[n11] = kz.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = kz.b(n10, l10);
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
            throw new RuntimeException("com/zelix/kz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(kz.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

