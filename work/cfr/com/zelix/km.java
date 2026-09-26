/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.b5;
import com.zelix.cf;
import com.zelix.df;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.iq;
import com.zelix.kw;
import com.zelix.l6q;
import com.zelix.lk9;
import com.zelix.lkv;
import com.zelix.lmt;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.m7;
import com.zelix.n9;
import com.zelix.prr;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class km
extends kw {
    final lkv F;
    b5[] n;
    int r;
    byte[] o;
    boolean N;
    private static final long a;
    private static final String[] d;
    private static final String[] g;
    private static final Map h;
    private static final long[] j;
    private static final Integer[] k;
    private static final Map l;

    /*
     * Unable to fully structure code
     */
    final void C(Object[] var1_1) {
        var2_2 = (DataOutputStream)var1_1[0];
        var3_3 = (Long)var1_1[1];
        var5_4 = (var3_3 = km.a ^ var3_3) ^ 66503734061501L;
        v0 = m44.a("j", (long)8668183833533689004L, (long)var3_3);
        var2_2.writeShort(this.n.length);
        var8_5 = 0;
        var7_6 = v0;
        while (var8_5 < this.n.length) {
            v1 = new Object[2];
            v1[1] = var2_2;
            v1[0] = var5_4;
            m44.a("u", (Object)this.n[var8_5], (Object)v1, (long)9110108747414928002L, (long)var3_3);
            ++var8_5;
lbl17:
            // 2 sources

            ** while (var7_6 != false)
lbl18:
            // 1 sources

        }
lbl19:
        // 2 sources

        if (var3_3 <= 0L) ** GOTO lbl17
    }

    final void a(Object[] objectArray) {
        block4: {
            int n10;
            CallSite callSite;
            long l10;
            long l11;
            block3: {
                int n11;
                l11 = (Long)objectArray[0];
                l10 = (l11 = a ^ l11) ^ 0x5379162F5242L;
                callSite = m44.a("i", (long)723080230523920111L, (long)l11);
                try {
                    n11 = this.N;
                    if (callSite != false) break block3;
                    if (n11 == 0) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("i", (Object)n92, (long)632417113578887600L, (long)l11);
                }
                n11 = n10 = 0;
            }
            while (n10 < this.n.length) {
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l10;
                m44.a("v", (Object)this.n[n10], (Object)objectArray2, (long)920800405734912514L, (long)l11);
                ++n10;
                if (callSite == false) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected final void N(Object[] var1_1) {
        block15: {
            block14: {
                var5_2 = (DataOutputStream)var1_1[0];
                var4_3 = (Map)var1_1[1];
                var2_4 = (Long)var1_1[2];
                var6_5 = (lqu)var1_1[3];
                v0 = var2_4;
                var7_6 = v0 ^ 0L;
                var9_7 = v0 ^ 50819876077675L;
                v1 = m44.a("k", (long)1680553024964027930L, (long)var2_4);
                v2 = new Object[4];
                v2[3] = var6_5;
                v2[2] = var7_6;
                v2[1] = var4_3;
                v2[0] = var5_2;
                super.N(v2);
                var11_8 = v1;
                try {
                    try {
                        v3 = this.N;
                        if (var11_8 == false) break block14;
                        if (v3 != 0) {
                        }
                        ** GOTO lbl56
                    }
                    catch (n9 v4) {
                        throw m44.a("k", (Object)v4, (long)992164032002350258L, (long)var2_4);
                    }
                    var5_2.writeShort(this.n.length);
                    v3 = 0;
                }
                catch (n9 v5) {
                    throw m44.a("k", (Object)v5, (long)992164032002350258L, (long)var2_4);
                }
            }
            var12_9 = v3;
            block8: while (var12_9 < this.n.length) {
                try {
                    v6 = new Object[3];
                    v6[2] = var9_7;
                    v6[1] = var4_3;
                    v6[0] = var5_2;
                    m44.a("t", (Object)this.n[var12_9], (Object)v6, (long)1127125947052758916L, (long)var2_4);
                    ++var12_9;
                    do {
                        v7 = var11_8;
                        if (var2_4 >= 0L) {
                            if (v7 == false) break block15;
                            v7 = var11_8;
                        }
                        if (v7 != false) continue block8;
                    } while (var2_4 < 0L);
                    break;
                }
                catch (n9 v8) {
                    throw m44.a("k", (Object)v8, (long)992164032002350258L, (long)var2_4);
                }
            }
            try {
                if (var2_4 < 0L || var11_8 != false) break block15;
lbl56:
                // 2 sources

                var5_2.write((byte[])m44.a("u", (Object)this, (long)1126093380793972925L, (long)var2_4));
            }
            catch (n9 v9) {
                throw m44.a("k", (Object)v9, (long)992164032002350258L, (long)var2_4);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void q(Object[] var1_1) {
        block18: {
            block17: {
                block15: {
                    var2_2 = (Long)var1_1[0];
                    var4_3 = (Set)var1_1[1];
                    var5_4 = (var2_2 = km.a ^ var2_2) ^ 75579432477113L;
                    var7_5 = m44.a("k", (long)-7076647614317868755L, (long)var2_2);
                    if (!this.N) break block18;
                    var8_6 = new ArrayList<b5>(this.n.length);
                    var9_7 = 0;
                    while (var9_7 < this.n.length) {
                        block13: {
                            block14: {
                                block16: {
                                    var10_9 = this.n[var9_7];
                                    try {
                                        try {
                                            try {
                                                v0 = var7_5;
                                                if (var2_2 < 0L) break block13;
                                                if (v0 != false) break block14;
                                                v1 = (int)var4_3.contains(km.S.e(var5_4, (int)m44.a("t", (Object)var10_9, (Object)new Object[0], (long)-8682418185107276492L, (long)var2_2)));
                                                v2 /* !! */  = var7_5;
                                                if (var2_2 >= 0L) {
                                                    if (v2 /* !! */  != false) break block15;
                                                }
                                                ** GOTO lbl49
                                            }
                                            catch (n9 v3) {
                                                throw m44.a("k", (Object)v3, (long)-6988289344335982990L, (long)var2_2);
                                            }
                                            if (v1 == 0) break block16;
                                        }
                                        catch (n9 v4) {
                                            throw m44.a("k", (Object)v4, (long)-6988289344335982990L, (long)var2_2);
                                        }
                                        var8_6.add(var10_9);
                                    }
                                    catch (n9 v5) {
                                        throw m44.a("k", (Object)v5, (long)-6988289344335982990L, (long)var2_2);
                                    }
                                }
                                ++var9_7;
                            }
                            v0 = var7_5;
                        }
                        if (v0 == false) continue;
                    }
                    v6 = var8_6;
                    if (var2_2 < 0L) ** GOTO lbl57
                    v1 = v6.size();
                }
                try {
                    try {
                        v2 /* !! */  = var7_5;
lbl49:
                        // 2 sources

                        if (var2_2 >= 0L) {
                            if (v2 /* !! */  != false) break block17;
                            v2 /* !! */  = (CallSite)this.n.length;
                        }
                        if (v1 >= v2 /* !! */ ) break block18;
                    }
                    catch (n9 v7) {
                        throw m44.a("k", (Object)v7, (long)-6988289344335982990L, (long)var2_2);
                    }
                    v6 = var8_6;
lbl57:
                    // 2 sources

                    v1 = v6.size();
                }
                catch (n9 v8) {
                    throw m44.a("k", (Object)v8, (long)-6988289344335982990L, (long)var2_2);
                }
            }
            var9_8 = new b5[v1];
            this.n = var8_6.toArray(var9_8);
            this.r = this.n.length;
            this.W = this.r * km.c("k", (int)17294, (long)(3227944615584823874L ^ var2_2)) + 2;
        }
    }

    /*
     * Exception decompiling
     */
    km(long var1_1, _4 var3_2, int var4_3, String var5_4, h1 var6_5, lkv var7_6, l6q var8_7, PrintWriter var9_8, l6q var10_9, String var11_10) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [26[DOLOOP]], but top level block is 5[TRYBLOCK]
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

    void G(Object[] objectArray) {
        block4: {
            int n10;
            CallSite callSite;
            long l10;
            long l11;
            df df2;
            block3: {
                int n11;
                df2 = (df)objectArray[0];
                l11 = (Long)objectArray[1];
                l10 = (l11 = a ^ l11) ^ 0x5C6C238C8D29L;
                callSite = m44.a("h", (long)2362688953870799233L, (long)l11);
                try {
                    n11 = this.N;
                    if (callSite == false) break block3;
                    if (n11 == 0) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)4206270696725048105L, (long)l11);
                }
                n11 = n10 = 0;
            }
            while (n10 < this.n.length) {
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = df2;
                objectArray2[0] = l10;
                m44.a("w", (Object)this.n[n10], (Object)objectArray2, (long)4080821092517435980L, (long)l11);
                ++n10;
                if (callSite != false) continue;
            }
        }
    }

    @Override
    void z(gu gu2, long l10) {
        block7: {
            CallSite callSite;
            long l11;
            block6: {
                long l12 = l10;
                long l13 = l12 ^ 0x66FDF08525FDL;
                l11 = l12 ^ 0L;
                callSite = m44.a("h", (long)6170399952317654249L, (long)l10);
                try {
                    int n10;
                    try {
                        n10 = this.N;
                        if (callSite == false) break block6;
                        if (n10 != 0) {
                        }
                        break block7;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)5708299248435469889L, (long)l10);
                    }
                    gu2.K(this.b, this, l13, this.H());
                    n10 = 0;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)5708299248435469889L, (long)l10);
                }
            }
            for (int i10 = v9354835; i10 < this.n.length; ++i10) {
                m44.a("w", (Object)this.n[i10], (Object)gu2, (long)l11, (long)6207356877339248454L, (long)l10);
                if (callSite != false) continue;
            }
        }
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
                var7_5 = v0 ^ 111606548645625L;
                v1 = m44.a("i", (long)1272493964096652623L, (long)var3_2);
                v2 = new Object[2];
                v2[1] = var2_3;
                v2[0] = var5_4;
                super.c(v2);
                var9_6 = v1;
                try {
                    try {
                        v3 = this;
                        if (var9_6 != false) break block8;
                        if (v3.N) {
                        }
                        ** GOTO lbl36
                    }
                    catch (n9 v4) {
                        throw m44.a("i", (Object)v4, (long)1398058877560046096L, (long)var3_2);
                    }
                    v3 = this;
                }
                catch (n9 v5) {
                    throw m44.a("i", (Object)v5, (long)1398058877560046096L, (long)var3_2);
                }
            }
            try {
                v6 = new Object[2];
                v6[1] = var7_5;
                v6[0] = var2_3;
                m44.a("v", (Object)v3, (Object)v6, (long)1625859627419531950L, (long)var3_2);
                if (var3_2 <= 0L || var9_6 == false) break block9;
lbl36:
                // 2 sources

                var2_3.write((byte[])m44.a("w", (Object)this, (long)1225708336046122527L, (long)var3_2));
            }
            catch (n9 v7) {
                throw m44.a("i", (Object)v7, (long)1398058877560046096L, (long)var3_2);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void V(Object[] var1_1) {
        block35: {
            block43: {
                block42: {
                    block36: {
                        block34: {
                            var3_2 = (Long)var1_1[0];
                            var2_3 = (HashSet)var1_1[1];
                            var5_4 = (df)var1_1[2];
                            v0 = var3_2 = km.a ^ var3_2;
                            var6_5 = v0 ^ 56594930013382L;
                            var8_6 = v0 ^ 26437160175385L;
                            v1 = v0 ^ 36215226463844L;
                            var10_7 = (int)(v1 >>> 32);
                            var11_8 = (int)(v1 << 32 >>> 48);
                            var12_9 = (int)(v1 << 48 >>> 48);
                            var13_10 = m44.a("i", (long)-2341651766845207705L, (long)var3_2);
                            try {
                                try {
                                    v2 /* !! */  = this.N;
                                    if (var13_10 != false) break block34;
                                    if (v2 /* !! */  == 0) break block35;
                                }
                                catch (n9 v3) {
                                    throw m44.a("i", (Object)v3, (long)-2499812532533490632L, (long)var3_2);
                                }
                                v2 /* !! */  = (int)m44.a("v", (Object)var2_3, (long)-4228277880869480531L, (long)var3_2);
                            }
                            catch (n9 v4) {
                                throw m44.a("i", (Object)v4, (long)-2499812532533490632L, (long)var3_2);
                            }
                        }
                        if (v2 /* !! */  <= 0) break block35;
                        var14_11 = new ArrayList<b5>(this.n.length);
                        var15_12 = 0;
                        while (var15_12 < this.n.length) {
                            block40: {
                                block41: {
                                    block39: {
                                        block37: {
                                            try {
                                                block38: {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    v5 /* !! */  = (int)m44.a("v", (Object)var2_3, (Object)m44.a("v", (Object)this.n[var15_12], (Object)new Object[0], (long)-4607149244086578208L, (long)var3_2), (long)-4090791684142306918L, (long)var3_2);
                                                                    v6 /* !! */  = var13_10;
                                                                    if (var3_2 >= 0L) {
                                                                        if (v6 /* !! */  != false) break block36;
                                                                        if (var13_10 != false) break block37;
                                                                    }
                                                                    ** GOTO lbl118
                                                                }
                                                                catch (n9 v7) {
                                                                    throw m44.a("i", (Object)v7, (long)-2499812532533490632L, (long)var3_2);
                                                                }
                                                                if (var3_2 < 0L) break block37;
                                                                if (v5 /* !! */  == 0) break block38;
                                                            }
                                                            catch (n9 v8) {
                                                                throw m44.a("i", (Object)v8, (long)-2499812532533490632L, (long)var3_2);
                                                            }
                                                            v9 = m44.a("v", (Object)var2_3, (Object)m44.a("v", (Object)this.n[var15_12], (Object)new Object[0], (long)-2849324842096399219L, (long)var3_2), (long)-4090791684142306918L, (long)var3_2);
                                                            if (var13_10 != false) break block39;
                                                        }
                                                        catch (n9 v10) {
                                                            throw m44.a("i", (Object)v10, (long)-2499812532533490632L, (long)var3_2);
                                                        }
                                                        if (var3_2 < 0L) break block39;
                                                        if (v9 == false) {
                                                        }
                                                        ** GOTO lbl74
                                                    }
                                                    catch (n9 v11) {
                                                        throw m44.a("i", (Object)v11, (long)-2499812532533490632L, (long)var3_2);
                                                    }
                                                }
                                                var14_11.add(this.n[var15_12]);
                                            }
                                            catch (n9 v12) {
                                                throw m44.a("i", (Object)v12, (long)-2499812532533490632L, (long)var3_2);
                                            }
                                        }
                                        try {
                                            v13 = var13_10;
                                            if (var3_2 <= 0L) break block40;
                                            if (v13 == false) break block41;
lbl74:
                                            // 2 sources

                                            v14 = new Object[3];
                                            v14[2] = this.n[var15_12];
                                            v14[1] = var6_5;
                                            v14[0] = m44.a("v", (Object)this.n[var15_12], (Object)new Object[0], (long)-4607149244086578208L, (long)var3_2);
                                            v9 = m44.a("v", (Object)var5_4, (Object)v14, (long)-2872402414359727997L, (long)var3_2);
                                        }
                                        catch (n9 v15) {
                                            throw m44.a("i", (Object)v15, (long)-2499812532533490632L, (long)var3_2);
                                        }
                                    }
                                    var16_15 /* !! */  = (int)v9;
                                    v16 = new Object[3];
                                    v16[2] = this.n[var15_12];
                                    v16[1] = var6_5;
                                    v16[0] = m44.a("v", (Object)this.n[var15_12], (Object)new Object[0], (long)-2849324842096399219L, (long)var3_2);
                                    var16_15 /* !! */  = (int)m44.a("v", (Object)var5_4, (Object)v16, (long)-2872402414359727997L, (long)var3_2);
                                    v17 = new Object[3];
                                    v17[2] = var8_6;
                                    v17[1] = var5_4;
                                    v17[0] = m44.a("v", (Object)this.n[var15_12], (Object)new Object[0], (long)-4607149244086578208L, (long)var3_2);
                                    m44.a("h", (Object)this, (Object)v17, (long)-2761234928168560293L, (long)var3_2);
                                    v18 = new Object[3];
                                    v18[2] = var8_6;
                                    v18[1] = var5_4;
                                    v18[0] = m44.a("v", (Object)this.n[var15_12], (Object)new Object[0], (long)-2849324842096399219L, (long)var3_2);
                                    m44.a("h", (Object)this, (Object)v18, (long)-2761234928168560293L, (long)var3_2);
                                }
                                ++var15_12;
                                v13 = var13_10;
                            }
                            if (v13 == false) continue;
                        }
                        v19 = var14_11;
                        if (var3_2 <= 0L) ** GOTO lbl126
                        v5 /* !! */  = v19.size();
                    }
                    try {
                        try {
                            v6 /* !! */  = var13_10;
lbl118:
                            // 2 sources

                            if (var3_2 >= 0L) {
                                if (v6 /* !! */  != false) break block42;
                                v6 /* !! */  = (CallSite)this.n.length;
                            }
                            if (v5 /* !! */  >= v6 /* !! */ ) break block43;
                        }
                        catch (n9 v20) {
                            throw m44.a("i", (Object)v20, (long)-2499812532533490632L, (long)var3_2);
                        }
                        v19 = var14_11;
lbl126:
                        // 2 sources

                        v5 /* !! */  = v19.size();
                    }
                    catch (n9 v21) {
                        throw m44.a("i", (Object)v21, (long)-2499812532533490632L, (long)var3_2);
                    }
                }
                var15_13 = new b5[v5 /* !! */ ];
                this.n = var14_11.toArray(var15_13);
                this.r = this.n.length;
                this.W = this.r * km.c("k", (int)2914, (long)(7025005440536965349L ^ var3_2)) + 2;
            }
            var15_14 = this.n;
            var16_15 /* !! */  = var15_14.length;
            var17_16 = 0;
            while (var17_16 < var16_15 /* !! */ ) {
                block47: {
                    block48: {
                        block46: {
                            block44: {
                                block45: {
                                    var18_17 = var15_14[var17_16];
                                    try {
                                        try {
                                            v22 /* !! */  = m44.a("v", (Object)var18_17, (Object)new Object[0], (long)-4607149244086578208L, (long)var3_2).a(2, var10_7, (char)var11_8, (char)var12_9);
                                            if (var3_2 < 0L || var13_10 != false) break block44;
                                            if (v22 /* !! */ ) break block45;
                                        }
                                        catch (n9 v23) {
                                            throw m44.a("i", (Object)v23, (long)-2499812532533490632L, (long)var3_2);
                                        }
                                        m44.a("v", (Object)var18_17, (Object)new Object[0], (long)-4607149244086578208L, (long)var3_2).G(m7.t);
                                    }
                                    catch (n9 v24) {
                                        throw m44.a("i", (Object)v24, (long)-2499812532533490632L, (long)var3_2);
                                    }
                                }
                                try {
                                    v25 = m44.a("v", (Object)var18_17, (Object)new Object[0], (long)-2849324842096399219L, (long)var3_2);
                                    v26 /* !! */  = var13_10;
                                    if (var3_2 >= 0L) {
                                        if (v26 /* !! */  != false) break block46;
                                        v26 /* !! */  = (CallSite)2;
                                    }
                                    v22 /* !! */  = v25.a((int)v26 /* !! */ , var10_7, (char)var11_8, (char)var12_9);
                                }
                                catch (n9 v27) {
                                    throw m44.a("i", (Object)v27, (long)-2499812532533490632L, (long)var3_2);
                                }
                            }
                            try {
                                if (var3_2 <= 0L) break block47;
                                if (v22 /* !! */ ) break block48;
                                v25 = m44.a("v", (Object)var18_17, (Object)new Object[0], (long)-2849324842096399219L, (long)var3_2);
                            }
                            catch (n9 v28) {
                                throw m44.a("i", (Object)v28, (long)-2499812532533490632L, (long)var3_2);
                            }
                        }
                        v25.G(m7.t);
                    }
                    ++var17_16;
                    v22 /* !! */  = var13_10;
                }
                if (!v22 /* !! */ ) continue;
            }
        }
    }

    private boolean w(Object[] objectArray) {
        boolean bl2;
        block14: {
            block12: {
                long l10;
                long l11;
                iq iq2;
                block13: {
                    CallSite callSite;
                    long l12;
                    df df2;
                    block11: {
                        boolean bl3;
                        block10: {
                            iq2 = (iq)objectArray[0];
                            df2 = (df)objectArray[1];
                            l11 = (Long)objectArray[2];
                            long l13 = l11 = a ^ l11;
                            l10 = l13 ^ 0x2F039221684AL;
                            l12 = l13 ^ 0x5B42E8453CA8L;
                            callSite = m44.a("j", (long)-611389676550118556L, (long)l11);
                            try {
                                bl3 = this.N;
                                if (callSite != false) break block10;
                                if (bl3) break block11;
                            }
                            catch (n9 n92) {
                                throw m44.a("j", (Object)n92, (long)-770746703381748677L, (long)l11);
                            }
                            bl3 = false;
                        }
                        return bl3;
                    }
                    Set set = df2.J(l12, iq2);
                    try {
                        if (callSite != false) break block12;
                        if (set == null) break block13;
                    }
                    catch (n9 n93) {
                        throw m44.a("j", (Object)n93, (long)-770746703381748677L, (long)l11);
                    }
                    for (lmt lmt2 : set) {
                        block16: {
                            boolean bl4;
                            block15: {
                                try {
                                    try {
                                        bl2 = lmt2 instanceof b5;
                                        CallSite callSite2 = callSite;
                                        if (l11 >= 0L) {
                                            if (callSite2 != false) break block14;
                                            callSite2 = callSite;
                                        }
                                        if (callSite2 != false) break block15;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("j", (Object)n94, (long)-770746703381748677L, (long)l11);
                                    }
                                    if (!bl2) break block16;
                                }
                                catch (n9 n95) {
                                    throw m44.a("j", (Object)n95, (long)-770746703381748677L, (long)l11);
                                }
                                bl4 = false;
                            }
                            return bl4;
                        }
                        if (callSite == false) continue;
                    }
                }
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = m44.a("n", (long)-1163444901826884130L, (long)l11);
                objectArray2[0] = l10;
                m44.a("u", (Object)iq2, (Object)objectArray2, (long)-653304518904020486L, (long)l11);
            }
            bl2 = true;
        }
        return bl2;
    }

    abstract b5 j(Object[] var1);

    Map j(Object[] objectArray) {
        CallSite callSite5;
        Object object;
        CallSite callSite2;
        ArrayList<lk9> arrayList;
        CallSite callSite3;
        long l10;
        long l11;
        block18: {
            l11 = (Long)objectArray[0];
            long l12 = l11 = a ^ l11;
            l10 = l12 ^ 0x3E9B40C9A1C7L;
            long l13 = l12 ^ 0x5C03E700A144L;
            long l14 = l12 ^ 0x81EBAE11E6FL;
            long l15 = l12 ^ 0x4CF6B6DD718FL;
            int n10 = (int)(l15 >>> 32);
            int n11 = (int)(l15 << 32 >>> 48);
            int n12 = (int)(l15 << 48 >>> 48);
            callSite3 = m44.a("m", (long)-7082816018664928941L, (long)l11);
            try {
                if (!this.N) {
                    return null;
                }
            }
            catch (n9 n92) {
                throw m44.a("m", (Object)n92, (long)-6954998203703570932L, (long)l11);
            }
            arrayList = new ArrayList<lk9>(this.n.length);
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l14;
            objectArray2[0] = cf.x(this.n.length, n10, (char)n11, (short)n12);
            callSite2 = m44.a("m", (Object)objectArray2, (long)-7300822941492699314L, (long)l11);
            b5[] b5Array = this.n;
            int n13 = b5Array.length;
            int n14 = 0;
            while (n14 < n13) {
                CallSite callSite4;
                block16: {
                    block17: {
                        block19: {
                            b5 b52 = b5Array[n14];
                            try {
                                try {
                                    try {
                                        callSite4 = callSite3;
                                        if (l11 < 0L) break block16;
                                        if (callSite4 != false) break block17;
                                        object = m44.a("r", (Object)b52, (Object)new Object[0], (long)-8858030652481118034L, (long)l11);
                                        if (callSite3 != false) break block18;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("m", (Object)n93, (long)-6954998203703570932L, (long)l11);
                                    }
                                    if (object == 0) break block19;
                                }
                                catch (n9 n94) {
                                    throw m44.a("m", (Object)n94, (long)-6954998203703570932L, (long)l11);
                                }
                                Object[] objectArray3 = new Object[1];
                                objectArray3[0] = l13;
                                arrayList.add(new lk9((int)m44.a("r", (Object)b52, (Object)new Object[0], (long)-8647016223340888758L, (long)l11), m44.a("r", (Object)b52, (Object)objectArray3, (long)-7370425541796885737L, (long)l11)));
                            }
                            catch (n9 n95) {
                                throw m44.a("m", (Object)n95, (long)-6954998203703570932L, (long)l11);
                            }
                        }
                        ++n14;
                    }
                    callSite4 = callSite3;
                }
                if (callSite4 == false) continue;
            }
            Collections.sort(arrayList);
            object = -1;
        }
        int n15 = object;
        block13: for (CallSite callSite5 : arrayList) {
            do {
                block20: {
                    int n10;
                    Object object2;
                    lk9 lk92;
                    block21: {
                        lk92 = (lk9)((Object)callSite5);
                        try {
                            try {
                                object2 = lk92;
                                if (l11 < 0L) break block20;
                                n10 = ((lk9)object2).n();
                                if (callSite3 != false) break block21;
                                if (n10 <= n15) break block20;
                            }
                            catch (n9 n96) {
                                throw m44.a("m", (Object)n96, (long)-6954998203703570932L, (long)l11);
                            }
                            n10 = lk92.n();
                        }
                        catch (n9 n97) {
                            throw m44.a("m", (Object)n97, (long)-6954998203703570932L, (long)l11);
                        }
                    }
                    n15 = n10;
                    object2 = ((HashMap)((Object)callSite2)).put(S.e(l10, n15), lk92.W());
                }
                if (callSite3 == false) continue block13;
                callSite5 = callSite2;
            } while (l11 <= 0L);
        }
        return callSite5;
    }

    @Override
    public void W(Object[] objectArray) {
        block4: {
            int n10;
            CallSite callSite;
            long l10;
            HashMap hashMap;
            int n11;
            int n12;
            long l11;
            block3: {
                int n13;
                l11 = (Long)objectArray[0];
                n12 = (Integer)objectArray[1];
                n11 = (Integer)objectArray[2];
                HashMap hashMap2 = (HashMap)objectArray[3];
                hashMap = (HashMap)objectArray[4];
                l10 = l11 ^ 0xAC388E9EA0BL;
                callSite = m44.a("n", (long)8223466915102598904L, (long)l11);
                try {
                    n13 = this.N;
                    if (callSite != false) break block3;
                    if (n13 == 0) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)n92, (long)8129479145561072039L, (long)l11);
                }
                n13 = n10 = 0;
            }
            while (n10 < this.n.length) {
                Object[] objectArray2 = new Object[4];
                objectArray2[3] = hashMap;
                objectArray2[2] = n11;
                objectArray2[1] = l10;
                objectArray2[0] = n12;
                m44.a("q", (Object)this.n[n10], (Object)objectArray2, (long)8349290212028726254L, (long)l11);
                ++n10;
                if (callSite == false) continue;
            }
        }
    }

    @Override
    final int g(int n10, byte by2, int n11) {
        int n12;
        block2: {
            long l10;
            block3: {
                l10 = (long)n10 << 32 | (long)by2 << 56 >>> 32 | (long)n11 << 40 >>> 40;
                CallSite callSite = m44.a("n", (long)-22607516224745753L, (long)l10);
                try {
                    n12 = this.N;
                    if (callSite == false) break block2;
                    if (n12 == 0) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)n92, (long)-1929238934413331377L, (long)l10);
                }
                int n13 = 2 + this.n.length * km.c("k", (int)17294, (long)(0x2CCB9A324ED5007FL ^ l10));
                return n13;
            }
            n12 = ((CallSite)m44.a("p", (Object)this, (long)-1775113755907108800L, (long)l10)).length;
        }
        return n12;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        km.a = prr.a(-5093979396207743147L, -490483328988736258L, MethodHandles.lookup().lookupClass()).a(81872174808432L);
                        km.h = new HashMap<K, V>(13);
                        var11 = km.a ^ 105813291932472L;
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
                        var17_5 = "\u00a3\u000e\u0014M\u00bd3\u00c2\u0092*\u00b3)='{RF\u0018CtD\u00eestn\u008e\u00a7\u009e\u000e\u00e1\u00e0\u0099}gv\u0017\u00b2\u00adR\u00fb>\u00af\u0010\u00e9\u00d5[Bw4\u00ad\u001b\u00ca\u00a5\u00ec\u00f5\u00d6\u0017&N \u00b7\u00e6\u00ee\u00dbY\u0081\u00b5\u008d\u0081S`8^\u00a1\u00d0\u00c0\u009e\u00bfa\u001eI\u00dbj\u00a9$\u0081\u0018\u00e6\u0092\u00ef&\u007f\u0010\u0099\u00dc\u0086m\u00b6\u009c\u00a4\u000f\u00cf\u00a5\u0013\u00c4\u0096\u00f6\u00d4\u00ee l\u0093\u0005\u0091\u0010l+\u009c\u00c2{\u00f2\u0084\u00b0\u00ae1\u00e7\u00e8A\u00c06&B\u00f16\u00cd\u0005@\u0096\u00ac#v\u0092";
                        var19_6 = "\u00a3\u000e\u0014M\u00bd3\u00c2\u0092*\u00b3)='{RF\u0018CtD\u00eestn\u008e\u00a7\u009e\u000e\u00e1\u00e0\u0099}gv\u0017\u00b2\u00adR\u00fb>\u00af\u0010\u00e9\u00d5[Bw4\u00ad\u001b\u00ca\u00a5\u00ec\u00f5\u00d6\u0017&N \u00b7\u00e6\u00ee\u00dbY\u0081\u00b5\u008d\u0081S`8^\u00a1\u00d0\u00c0\u009e\u00bfa\u001eI\u00dbj\u00a9$\u0081\u0018\u00e6\u0092\u00ef&\u007f\u0010\u0099\u00dc\u0086m\u00b6\u009c\u00a4\u000f\u00cf\u00a5\u0013\u00c4\u0096\u00f6\u00d4\u00ee l\u0093\u0005\u0091\u0010l+\u009c\u00c2{\u00f2\u0084\u00b0\u00ae1\u00e7\u00e8A\u00c06&B\u00f16\u00cd\u0005@\u0096\u00ac#v\u0092".length();
                        var16_7 = 16;
                        var15_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = km.c(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "C>\u00ac|T\u00c1\u00a3B\u00aa\u00eb\u0097Fq\u00fa\u00e6G\u0010}\u00eb\u00b8;\u00bb\u00fc\n\u00e2\u00bf1\u0015\r\u00a2`\u00f5J";
                            var19_6 = "C>\u00ac|T\u00c1\u00a3B\u00aa\u00eb\u0097Fq\u00fa\u00e6G\u0010}\u00eb\u00b8;\u00bb\u00fc\n\u00e2\u00bf1\u0015\r\u00a2`\u00f5J".length();
                            var16_7 = 16;
                            var15_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = km.c(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block14;
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
                km.d = var20_3;
                km.g = new String[8];
                km.l = new HashMap<K, V>(13);
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
                var6_12 = new long[2];
                var3_13 = 0;
                var4_14 = "[ty5F8\u00ccJ\u0005[\u00f8;\u0014\u00edq\t";
                var5_15 = "[ty5F8\u00ccJ\u0005[\u00f8;\u0014\u00edq\t".length();
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
        km.j = var6_12;
        km.k = new Integer[2];
    }

    private static n9 a(n9 n92) {
        return n92;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x5C84;
        if (g[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/km", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n11].getBytes("ISO-8859-1");
            km.g[n11] = km.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = km.b(n10, l10);
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
            throw new RuntimeException("com/zelix/km" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x2F41;
        if (k[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = j[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])l.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/km", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            km.k[n11] = n12;
        }
        return k[n11];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = km.c(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/km" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(km.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(km.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

