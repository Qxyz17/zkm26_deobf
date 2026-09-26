/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix.b0;
import com.zelix.b1;
import com.zelix.b4;
import com.zelix.bf;
import com.zelix.bn;
import com.zelix.gm;
import com.zelix.gu;
import com.zelix.hj;
import com.zelix.j1;
import com.zelix.js;
import com.zelix.l62;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.tg;
import com.zelix.to;
import com.zelix.xm;
import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
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
public class j9
extends j1
implements gm,
hj {
    final tg v;
    xm f;
    private static final long a = prr.a(-3704993108232601656L, 8315902171330890903L, MethodHandles.lookup().lookupClass()).a(8797589179755L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long e;

    /*
     * Exception decompiling
     */
    @Override
    void O(DataOutputStream var1_1, long var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[SWITCH]
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

    j9(long l10, int n10, to to2, tg tg2, xm xm2) {
        l10 = a ^ l10;
        super(n10, to2);
        this.v = tg2;
        m44.a("r", (Object)this, (xm)xm2, (long)-6562525357615058061L, (long)l10);
    }

    @Override
    public boolean e(long l10, gu gu2, Object object, Object object2) {
        long l11 = l10 ^ 0xB1C2A58BC7CL;
        return gu2.K(this, object, l11, object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean b(Object[] var1_1) {
        var2_2 = (Integer)var1_1[0];
        var4_3 = (Integer)var1_1[1];
        var3_4 = (Integer)var1_1[2];
        var5_5 = ((long)var2_2 << 48 | (long)var4_3 << 48 >>> 16 | (long)var3_4 << 32 >>> 32) ^ j9.a;
        var7_6 = var5_5 ^ 26941517544021L;
        var9_7 = m44.a("l", (long)-5253265019932388868L, (long)var5_5);
        try {
            v0 /* !! */  = m44.a("h", (long)-5666353044144422740L, (long)var5_5)[m44.a("r", (Object)this, (long)-5302055905636292646L, (long)var5_5).ordinal()];
            if (var9_7 == false) {
            }
            ** GOTO lbl19
        }
        catch (n9 v1) {
            throw m44.a("l", (Object)v1, (long)-6041472179568754451L, (long)var5_5);
        }
        {
            ** switch (v0 /* !! */ )
        }
lbl-1000:
        // 1 sources

        {
            case 1: 
            case 3: 
            case 5: 
            case 7: 
            case 8: 
            case 9: {
                v0 /* !! */  = (CallSite)false;
lbl19:
                // 2 sources

                return (boolean)v0 /* !! */ ;
            }
lbl20:
            // 1 sources

            case 2: 
            case 4: 
            case 6: {
                return true;
            }
        }
lbl22:
        // 1 sources

        throw new n9((String)j9.b("w", (int)1454, (long)(7007415945105478779L ^ var5_5)) + m44.a("r", (Object)this, (long)-5302055905636292646L, (long)var5_5) + (String)j9.b("w", (int)19375, (long)(5319257389874436729L ^ var5_5)) + this.L(var7_6));
    }

    @Override
    public String e(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x5890AC7D9A21L;
        int n10 = (int)(l11 >>> 32);
        int n11 = (int)(l11 << 32 >>> 48);
        int n12 = (int)(l11 << 48 >>> 48);
        return ((xm)((Object)m44.a("p", (Object)this, (long)5599459656691456555L, (long)l10))).b(n10, (short)n11, (short)n12) + (char)e + ((xm)((Object)m44.a("p", (Object)this, (long)5599459656691456555L, (long)l10))).R();
    }

    /*
     * Exception decompiling
     */
    public boolean W(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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

    public String G(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return ((xm)((Object)m44.a("u", (Object)this, (long)4978785852029571718L, (long)l10))).v();
    }

    public b0 k(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return ((xm)((Object)m44.a("v", (Object)this, (long)557172572741095461L, (long)l10))).G();
    }

    public String b(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return ((xm)((Object)m44.a("p", (Object)this, (long)-5905002997315569261L, (long)l10))).R();
    }

    xm I(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("p", (Object)this, (long)8159785563570284195L, (long)l10);
    }

    @Override
    public void T(Object[] objectArray) {
        block5: {
            j9 j92;
            xm xm2;
            long l10;
            block4: {
                xm xm3 = (xm)objectArray[0];
                l10 = (Long)objectArray[1];
                xm2 = (xm)objectArray[2];
                CallSite callSite = m44.a("i", (long)3971612704010432097L, (long)l10);
                try {
                    try {
                        j92 = this;
                        if (callSite == false) break block4;
                        if (m44.a("w", (Object)j92, (long)3008988334572371548L, (long)l10) != xm3) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)n92, (long)3667348993155718688L, (long)l10);
                    }
                    j92 = this;
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)n93, (long)3667348993155718688L, (long)l10);
                }
            }
            m44.a("u", (Object)j92, (xm)xm2, (long)3008988334572371548L, (long)l10);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void C(Object[] var1_1) {
        block75: {
            block71: {
                block72: {
                    block73: {
                        block70: {
                            var2_2 = (Set)var1_1[0];
                            var7_3 = (Set)var1_1[1];
                            var6_4 = (Set)var1_1[2];
                            var3_5 = (Long)var1_1[3];
                            var5_6 = (Set)var1_1[4];
                            v0 = var3_5 = j9.a ^ var3_5;
                            var8_7 = v0 ^ 45205040444349L;
                            v1 = v0 ^ 49292493958482L;
                            var10_8 = (int)(v1 >>> 48);
                            var11_9 = (int)(v1 << 16 >>> 48);
                            var12_10 = (int)(v1 << 32 >>> 32);
                            var13_11 = v0 ^ 26555338316538L;
                            v2 = v0 ^ 95015028573358L;
                            var15_12 = (int)(v2 >>> 32);
                            var16_13 = (int)(v2 << 32 >>> 48);
                            var17_14 = (int)(v2 << 48 >>> 48);
                            var18_15 = v0 ^ 48291768393031L;
                            var21_16 = m44.a("w", (Object)this, (long)1385499108625794212L, (long)var3_5).b(var15_12, (short)var16_13, (short)var17_14);
                            var20_17 = m44.a("i", (long)1001587325412594841L, (long)var3_5);
                            var22_18 = null;
                            try {
                                try {
                                    v3 = var21_16;
                                    if (var20_17 == false) break block70;
                                    if (v3.startsWith("[")) break block71;
                                }
                                catch (n9 v4) {
                                    throw m44.a("i", (Object)v4, (long)584712110418093272L, (long)var3_5);
                                }
                                v3 = var21_16;
                            }
                            catch (n9 v5) {
                                throw m44.a("i", (Object)v5, (long)584712110418093272L, (long)var3_5);
                            }
                        }
                        var22_18 = l62.B(v3, var8_7);
                        try {
                            try {
                                if (var3_5 <= 0L) break block72;
                                v6 = var22_18;
                                if (var20_17 == false) break block73;
                                if (v6 == null) break block71;
                            }
                            catch (n9 v7) {
                                throw m44.a("i", (Object)v7, (long)584712110418093272L, (long)var3_5);
                            }
                            v8 = new Object[2];
                            v8[1] = var18_15;
                            v8[0] = var22_18;
                            v6 = m44.a("v", (Object)this, (Object)v8, (long)1646212482032881385L, (long)var3_5);
                        }
                        catch (n9 v9) {
                            throw m44.a("i", (Object)v9, (long)584712110418093272L, (long)var3_5);
                        }
                    }
                    var22_18 = v6;
                }
                try {
                    block74: {
                        try {
                            try {
                                v10 = new Object[3];
                                v10[2] = var12_10;
                                v10[1] = (int)((short)var11_9);
                                v10[0] = (int)((char)var10_8);
                                v11 /* !! */  = m44.a("h", (Object)this, (Object)v10, (long)1453561111868038785L, (long)var3_5);
                                if (var20_17 == false) break block71;
                                if (v11 /* !! */  == false) break block74;
                            }
                            catch (n9 v12) {
                                throw m44.a("i", (Object)v12, (long)584712110418093272L, (long)var3_5);
                            }
                            var7_3.add(var22_18);
                            v13 = var20_17;
                            if (var3_5 <= 0L) break block75;
                            if (v13 != false) break block71;
                        }
                        catch (n9 v14) {
                            throw m44.a("i", (Object)v14, (long)584712110418093272L, (long)var3_5);
                        }
                    }
                    v11 /* !! */  = (CallSite)var2_2.add(var22_18);
                }
                catch (n9 v15) {
                    throw m44.a("i", (Object)v15, (long)584712110418093272L, (long)var3_5);
                }
            }
            v13 = m44.a("m", (long)1542518552192427161L, (long)var3_5)[m44.a("w", (Object)this, (long)1323602680726799343L, (long)var3_5).ordinal()];
        }
        switch (v13) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                var23_19 = (b4)m44.a("w", (Object)this, (long)1385499108625794212L, (long)var3_5).G();
                try {
                    v16 = var23_19;
                    if (var3_5 >= 0L && var20_17 != false) {
                        if (v16 == null) break;
                    }
                    ** GOTO lbl100
                }
                catch (n9 v17) {
                    throw m44.a("i", (Object)v17, (long)584712110418093272L, (long)var3_5);
                }
                v16 = var23_19;
lbl100:
                // 2 sources

                try {
                    try {
                        if (var3_5 <= 0L) ** GOTO lbl115
                        v18 = v16.J();
                        if (var20_17 != false) {
                            if (!v18) break;
                        }
                        ** GOTO lbl114
                    }
                    catch (n9 v19) {
                        throw m44.a("i", (Object)v19, (long)584712110418093272L, (long)var3_5);
                    }
                    v18 = var6_4.add((bf)var23_19);
                }
                catch (n9 v20) {
                    throw m44.a("i", (Object)v20, (long)584712110418093272L, (long)var3_5);
                }
lbl114:
                // 2 sources

                v16 = var23_19;
lbl115:
                // 2 sources

                var24_20 /* !! */  = (_f)v16.G(var13_11);
                try {
                    try {
                        try {
                            try {
                                v21 = var22_18;
                                if (var20_17 == false) ** GOTO lbl147
                                if (v21 != null) {
                                }
                                ** GOTO lbl139
                            }
                            catch (n9 v22) {
                                throw m44.a("i", (Object)v22, (long)584712110418093272L, (long)var3_5);
                            }
                            if (var3_5 < 0L) ** GOTO lbl148
                            v21 = var24_20 /* !! */ ;
                            if (var20_17 != false) {
                            }
                            ** GOTO lbl147
                        }
                        catch (n9 v23) {
                            throw m44.a("i", (Object)v23, (long)584712110418093272L, (long)var3_5);
                        }
                        if (v21 != var22_18) {
                        }
                        ** GOTO lbl175
                    }
                    catch (n9 v24) {
                        throw m44.a("i", (Object)v24, (long)584712110418093272L, (long)var3_5);
                    }
lbl139:
                    // 2 sources

                    v25 = new Object[2];
                    v25[1] = var18_15;
                    v25[0] = var24_20 /* !! */ ;
                    v21 = m44.a("v", (Object)this, (Object)v25, (long)1646212482032881385L, (long)var3_5);
                }
                catch (n9 v26) {
                    throw m44.a("i", (Object)v26, (long)584712110418093272L, (long)var3_5);
                }
lbl147:
                // 3 sources

                var24_20 /* !! */  = v21;
lbl148:
                // 2 sources

                try {
                    try {
                        try {
                            v27 = new Object[3];
                            v27[2] = var12_10;
                            v27[1] = (int)((short)var11_9);
                            v27[0] = (int)((char)var10_8);
                            v28 /* !! */  = m44.a("h", (Object)this, (Object)v27, (long)1453561111868038785L, (long)var3_5);
                            if (var20_17 == false) ** GOTO lbl175
                            if (v28 /* !! */  != false) {
                            }
                            ** GOTO lbl171
                        }
                        catch (n9 v29) {
                            throw m44.a("i", (Object)v29, (long)584712110418093272L, (long)var3_5);
                        }
                        var7_3.add(var24_20 /* !! */ );
                        v30 = var20_17;
                        if (var3_5 <= 0L) ** GOTO lbl176
                        if (v30 == false) {
                        }
                        ** GOTO lbl175
                    }
                    catch (n9 v31) {
                        throw m44.a("i", (Object)v31, (long)584712110418093272L, (long)var3_5);
                    }
lbl171:
                    // 2 sources

                    v28 /* !! */  = (CallSite)var2_2.add(var24_20 /* !! */ );
                }
                catch (n9 v32) {
                    throw m44.a("i", (Object)v32, (long)584712110418093272L, (long)var3_5);
                }
lbl175:
                // 4 sources

                v30 = var20_17;
lbl176:
                // 2 sources

                if (v30 != false) break;
            }
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                var24_20 /* !! */  = (b1)m44.a("w", (Object)this, (long)1385499108625794212L, (long)var3_5).G();
                try {
                    v33 = var24_20 /* !! */ ;
                    if (var3_5 > 0L && var20_17 != false) {
                        if (v33 == null) break;
                    }
                    ** GOTO lbl188
                }
                catch (n9 v34) {
                    throw m44.a("i", (Object)v34, (long)584712110418093272L, (long)var3_5);
                }
                v33 = var24_20 /* !! */ ;
lbl188:
                // 2 sources

                try {
                    try {
                        v35 = v33.J();
                        if (var20_17 != false) {
                            if (!v35) break;
                        }
                        ** GOTO lbl201
                    }
                    catch (n9 v36) {
                        throw m44.a("i", (Object)v36, (long)584712110418093272L, (long)var3_5);
                    }
                    v35 = var5_6.add((bn)var24_20 /* !! */ );
                }
                catch (n9 v37) {
                    throw m44.a("i", (Object)v37, (long)584712110418093272L, (long)var3_5);
                }
lbl201:
                // 2 sources

                var25_21 = v35;
                var26_22 = (_f)var24_20 /* !! */ .G(var13_11);
                try {
                    try {
                        try {
                            try {
                                v38 = var22_18;
                                if (var20_17 == false) ** GOTO lbl233
                                if (v38 != null) {
                                }
                                ** GOTO lbl225
                            }
                            catch (n9 v39) {
                                throw m44.a("i", (Object)v39, (long)584712110418093272L, (long)var3_5);
                            }
                            if (var3_5 <= 0L) ** GOTO lbl234
                            v38 = var26_22;
                            if (var20_17 != false) {
                            }
                            ** GOTO lbl233
                        }
                        catch (n9 v40) {
                            throw m44.a("i", (Object)v40, (long)584712110418093272L, (long)var3_5);
                        }
                        if (v38 == var22_18) break;
                    }
                    catch (n9 v41) {
                        throw m44.a("i", (Object)v41, (long)584712110418093272L, (long)var3_5);
                    }
lbl225:
                    // 2 sources

                    v42 = new Object[2];
                    v42[1] = var18_15;
                    v42[0] = var22_18;
                    v38 = m44.a("v", (Object)this, (Object)v42, (long)1646212482032881385L, (long)var3_5);
                }
                catch (n9 v43) {
                    throw m44.a("i", (Object)v43, (long)584712110418093272L, (long)var3_5);
                }
lbl233:
                // 3 sources

                var22_18 = v38;
lbl234:
                // 2 sources

                try {
                    try {
                        try {
                            v44 = new Object[3];
                            v44[2] = var12_10;
                            v44[1] = (int)((short)var11_9);
                            v44[0] = (int)((char)var10_8);
                            v45 /* !! */  = m44.a("h", (Object)this, (Object)v44, (long)1453561111868038785L, (long)var3_5);
                            if (var20_17 == false) break;
                            if (v45 /* !! */  != false) {
                            }
                            ** GOTO lbl254
                        }
                        catch (n9 v46) {
                            throw m44.a("i", (Object)v46, (long)584712110418093272L, (long)var3_5);
                        }
                        var7_3.add(var26_22);
                        if (var20_17 != false) break;
                    }
                    catch (n9 v47) {
                        throw m44.a("i", (Object)v47, (long)584712110418093272L, (long)var3_5);
                    }
lbl254:
                    // 2 sources

                    v45 /* !! */  = (CallSite)var2_2.add(var26_22);
                    break;
                }
                catch (n9 v48) {
                    throw m44.a("i", (Object)v48, (long)584712110418093272L, (long)var3_5);
                }
            }
        }
    }

    boolean G(Object[] objectArray) {
        boolean bl2;
        block15: {
            block14: {
                j9 j92;
                CallSite callSite;
                int n10;
                int n11;
                int n12;
                long l10;
                long l11;
                xm xm2;
                long l12;
                block13: {
                    tg tg2 = (tg)((Object)objectArray[0]);
                    l12 = (Long)objectArray[1];
                    xm2 = (xm)objectArray[2];
                    long l13 = l12 = a ^ l12;
                    l11 = l13 ^ 0x1A8851E43B9FL;
                    l10 = l13 ^ 0x459EDADB0F15L;
                    long l14 = l13 ^ 0x760810F7692FL;
                    n12 = (int)(l14 >>> 32);
                    n11 = (int)(l14 << 32 >>> 48);
                    n10 = (int)(l14 << 48 >>> 48);
                    callSite = m44.a("h", (long)-4707186640472188856L, (long)l12);
                    try {
                        try {
                            j92 = this;
                            if (callSite != false) break block13;
                            if (m44.a("v", (Object)j92, (long)-4620902389543047570L, (long)l12) != tg2) break block14;
                        }
                        catch (n9 n92) {
                            throw m44.a("h", (Object)n92, (long)-6513206770013877927L, (long)l12);
                        }
                        j92 = this;
                    }
                    catch (n9 n93) {
                        throw m44.a("h", (Object)n93, (long)-6513206770013877927L, (long)l12);
                    }
                }
                try {
                    try {
                        try {
                            try {
                                bl2 = ((js)((Object)m44.a("v", (Object)j92, (long)-4703050507165144795L, (long)l12))).A(l10).equals((Object)xm2.A(l10));
                                if (callSite != false) break block15;
                                if (bl2) {
                                }
                                break block14;
                            }
                            catch (n9 n94) {
                                throw m44.a("h", (Object)n94, (long)-6513206770013877927L, (long)l12);
                            }
                            bl2 = ((xm)((Object)m44.a("v", (Object)this, (long)-4703050507165144795L, (long)l12))).I(xm2.b(n12, (short)n11, (short)n10), l11, xm2.R(), xm2.v());
                            if (callSite != false) break block15;
                        }
                        catch (n9 n95) {
                            throw m44.a("h", (Object)n95, (long)-6513206770013877927L, (long)l12);
                        }
                        if (!bl2) break block14;
                    }
                    catch (n9 n96) {
                        throw m44.a("h", (Object)n96, (long)-6513206770013877927L, (long)l12);
                    }
                    return true;
                }
                catch (n9 n97) {
                    throw m44.a("h", (Object)n97, (long)-6513206770013877927L, (long)l12);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public String z(char c10, int n10, short s10) {
        long l10 = (long)c10 << 48 | (long)n10 << 32 >>> 16 | (long)s10 << 48 >>> 48;
        long l11 = l10 ^ 0L;
        int n11 = (int)(l11 >>> 48);
        int n12 = (int)(l11 << 16 >>> 32);
        int n13 = (int)(l11 << 48 >>> 48);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m44.a("s", (Object)this, (long)-1483265086643029285L, (long)l10));
        stringBuilder.append((String)((Object)j9.b("w", (int)11804, (long)(0x15D03F2B1C65E2C9L ^ l10))));
        stringBuilder.append((String)((Object)m44.a("r", (Object)m44.a("s", (Object)this, (long)-1581242881830797936L, (long)l10), (char)((char)n11), (int)n12, (short)((short)n13), (long)-1311284489808475622L, (long)l10)));
        return stringBuilder.toString();
    }

    public j9(int n10, long l10, to to2, tg tg2, xm xm2, l6q l6q2) {
        long l11 = (l10 = a ^ l10) ^ 0x22355C2DC913L;
        super(n10, to2);
        this.v = tg2;
        m44.a("p", (Object)this, (xm)xm2, (long)-6865930554293848279L, (long)l10);
        l6q2.t(xm2, this, l11);
    }

    public tg D(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("p", (Object)this, (long)-8808718712276233104L, (long)l10);
    }

    public String m(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0xC9676160831L;
        int n10 = (int)(l11 >>> 32);
        int n11 = (int)(l11 << 32 >>> 48);
        int n12 = (int)(l11 << 48 >>> 48);
        return ((xm)((Object)m44.a("p", (Object)this, (long)-2331436456778528709L, (long)l10))).b(n10, (short)n11, (short)n12);
    }

    public boolean F(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("s", (Object)this, (long)-2084494667187342685L, (long)l10) == m44.a("i", (long)-240347470389914069L, (long)l10);
        }
        catch (n9 n92) {
            throw m44.a("m", (Object)n92, (long)-481513430990908012L, (long)l10);
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void v(Object[] var1_1) {
        block74: {
            block71: {
                block72: {
                    block76: {
                        block75: {
                            var3_2 = (Set)var1_1[0];
                            var6_3 = (Set)var1_1[1];
                            var7_4 = (Set)var1_1[2];
                            var4_5 = (Long)var1_1[3];
                            var2_6 = (Set)var1_1[4];
                            v0 = var4_5 = j9.a ^ var4_5;
                            var8_7 = v0 ^ 99820107337963L;
                            var10_8 = v0 ^ 53887291641811L;
                            var12_9 = v0 ^ 119454947829876L;
                            var14_10 = v0 ^ 107737486346656L;
                            v1 = v0 ^ 94671877062273L;
                            var16_11 = (int)(v1 >>> 48);
                            var17_12 = (int)(v1 << 16 >>> 48);
                            var18_13 = (int)(v1 << 32 >>> 32);
                            var19_14 = v0 ^ 108751450032425L;
                            v2 = v0 ^ 49083541313405L;
                            var21_15 = (int)(v2 >>> 32);
                            var22_16 = (int)(v2 << 32 >>> 48);
                            var23_17 = (int)(v2 << 48 >>> 48);
                            var24_18 = v0 ^ 64054386534817L;
                            var27_19 = m44.a("t", (Object)this, (long)-9157732466397587593L, (long)var4_5).b(var21_15, (short)var22_16, (short)var23_17);
                            var26_20 = m44.a("j", (long)-9151617785539008998L, (long)var4_5);
                            var28_21 = null;
                            v3 = new Object[3];
                            v3[2] = var18_13;
                            v3[1] = (int)((short)var17_12);
                            v3[0] = (int)((char)var16_11);
                            if (m44.a("k", (Object)this, (Object)v3, (long)-8647072985603453614L, (long)var4_5) == false) break block75;
                            var29_22 = var6_3;
                            if (var4_5 <= 0L || var26_20 == false) break block76;
                        }
                        var29_22 = var3_2;
                    }
                    try {
                        try {
                            v4 = var27_19;
                            if (var26_20 != false) ** GOTO lbl50
                            if (v4.startsWith("[")) break block71;
                        }
                        catch (n9 v5) {
                            throw m44.a("j", (Object)v5, (long)-7219786563853781237L, (long)var4_5);
                        }
                        v4 = var27_19;
                    }
                    catch (n9 v6) {
                        throw m44.a("j", (Object)v6, (long)-7219786563853781237L, (long)var4_5);
                    }
lbl50:
                    // 2 sources

                    var28_21 = l62.G(var8_7, v4);
                    try {
                        v7 = var28_21;
                        if (var4_5 <= 0L || var26_20 != false) break block72;
                        if (v7 == null) break block71;
                    }
                    catch (n9 v8) {
                        throw m44.a("j", (Object)v8, (long)-7219786563853781237L, (long)var4_5);
                    }
                    v7 = var28_21;
                }
                try {
                    block73: {
                        try {
                            try {
                                v9 = v7.N(var10_8);
                                if (var26_20 != false) break block71;
                                if (!v9) break block73;
                            }
                            catch (n9 v10) {
                                throw m44.a("j", (Object)v10, (long)-7219786563853781237L, (long)var4_5);
                            }
                            v11 = new Object[1];
                            v11[0] = var14_10;
                            var29_22.addAll(m44.a("u", (Object)var28_21, (Object)v11, (long)-9156334987052803920L, (long)var4_5));
                            v12 = var26_20;
                            if (var4_5 < 0L) break block74;
                            if (v12 == false) break block71;
                        }
                        catch (n9 v13) {
                            throw m44.a("j", (Object)v13, (long)-7219786563853781237L, (long)var4_5);
                        }
                    }
                    v9 = var29_22.add(var28_21);
                }
                catch (n9 v14) {
                    throw m44.a("j", (Object)v14, (long)-7219786563853781237L, (long)var4_5);
                }
            }
            v12 = m44.a("n", (long)-8738290883835938998L, (long)var4_5)[m44.a("t", (Object)this, (long)-9111596310389829572L, (long)var4_5).ordinal()];
        }
        switch (v12) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                var30_23 = (b4)m44.a("t", (Object)this, (long)-9157732466397587593L, (long)var4_5).G();
                try {
                    try {
                        v15 = var30_23;
                        if (var26_20 == false) {
                            if (v15 == null) break;
                        }
                        ** GOTO lbl106
                    }
                    catch (n9 v16) {
                        throw m44.a("j", (Object)v16, (long)-7219786563853781237L, (long)var4_5);
                    }
                    var7_4.add(var30_23);
                    v15 = var30_23;
                }
                catch (n9 v17) {
                    throw m44.a("j", (Object)v17, (long)-7219786563853781237L, (long)var4_5);
                }
lbl106:
                // 2 sources

                var31_24 /* !! */  = v15.G(var19_14);
                try {
                    try {
                        try {
                            try {
                                v18 = var28_21;
                                if (var26_20 != false) ** GOTO lbl133
                                if (v18 != null) {
                                }
                                ** GOTO lbl129
                            }
                            catch (n9 v19) {
                                throw m44.a("j", (Object)v19, (long)-7219786563853781237L, (long)var4_5);
                            }
                            v18 = var31_24 /* !! */ ;
                            if (var4_5 >= 0L && var26_20 == false) {
                            }
                            ** GOTO lbl133
                        }
                        catch (n9 v20) {
                            throw m44.a("j", (Object)v20, (long)-7219786563853781237L, (long)var4_5);
                        }
                        if (v18 != var28_21) {
                        }
                        ** GOTO lbl159
                    }
                    catch (n9 v21) {
                        throw m44.a("j", (Object)v21, (long)-7219786563853781237L, (long)var4_5);
                    }
lbl129:
                    // 2 sources

                    v18 = var31_24 /* !! */ ;
                }
                catch (n9 v22) {
                    throw m44.a("j", (Object)v22, (long)-7219786563853781237L, (long)var4_5);
                }
lbl133:
                // 3 sources

                try {
                    try {
                        try {
                            v23 = v18.N(var10_8);
                            if (var26_20 != false) ** GOTO lbl159
                            if (v23) {
                            }
                            ** GOTO lbl155
                        }
                        catch (n9 v24) {
                            throw m44.a("j", (Object)v24, (long)-7219786563853781237L, (long)var4_5);
                        }
                        v25 = new Object[1];
                        v25[0] = var14_10;
                        var29_22.addAll(m44.a("u", (Object)var31_24 /* !! */ , (Object)v25, (long)-9156334987052803920L, (long)var4_5));
                        v26 = var26_20;
                        if (var4_5 <= 0L) ** GOTO lbl160
                        if (v26 != false) {
                        }
                        ** GOTO lbl159
                    }
                    catch (n9 v27) {
                        throw m44.a("j", (Object)v27, (long)-7219786563853781237L, (long)var4_5);
                    }
lbl155:
                    // 2 sources

                    v23 = var29_22.add(var31_24 /* !! */ );
                }
                catch (n9 v28) {
                    throw m44.a("j", (Object)v28, (long)-7219786563853781237L, (long)var4_5);
                }
lbl159:
                // 4 sources

                v26 = var26_20;
lbl160:
                // 2 sources

                if (v26 == false) break;
            }
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                var31_24 /* !! */  = (b1)m44.a("t", (Object)this, (long)-9157732466397587593L, (long)var4_5).G();
                try {
                    try {
                        v29 = var31_24 /* !! */ ;
                        if (var26_20 == false) {
                            if (v29 == null) break;
                        }
                        ** GOTO lbl178
                    }
                    catch (n9 v30) {
                        throw m44.a("j", (Object)v30, (long)-7219786563853781237L, (long)var4_5);
                    }
                    var2_6.add(var31_24 /* !! */ );
                    v29 = var31_24 /* !! */ ;
                }
                catch (n9 v31) {
                    throw m44.a("j", (Object)v31, (long)-7219786563853781237L, (long)var4_5);
                }
lbl178:
                // 2 sources

                var32_25 = v29.G(var19_14);
                try {
                    try {
                        try {
                            try {
                                v32 = var28_21;
                                if (var26_20 != false) ** GOTO lbl204
                                if (v32 != null) {
                                }
                                ** GOTO lbl200
                            }
                            catch (n9 v33) {
                                throw m44.a("j", (Object)v33, (long)-7219786563853781237L, (long)var4_5);
                            }
                            v32 = var32_25;
                            if (var4_5 >= 0L && var26_20 == false) {
                            }
                            ** GOTO lbl204
                        }
                        catch (n9 v34) {
                            throw m44.a("j", (Object)v34, (long)-7219786563853781237L, (long)var4_5);
                        }
                        if (v32 == var28_21) break;
                    }
                    catch (n9 v35) {
                        throw m44.a("j", (Object)v35, (long)-7219786563853781237L, (long)var4_5);
                    }
lbl200:
                    // 2 sources

                    v32 = var32_25;
                }
                catch (n9 v36) {
                    throw m44.a("j", (Object)v36, (long)-7219786563853781237L, (long)var4_5);
                }
lbl204:
                // 3 sources

                try {
                    try {
                        v37 = l62.r(var24_18, v32.h(var12_9));
                        v38 = var26_20;
                        if (var4_5 < 0L) ** GOTO lbl224
                        if (v38 == false) {
                            if (v37) break;
                        }
                        ** GOTO lbl220
                    }
                    catch (n9 v39) {
                        throw m44.a("j", (Object)v39, (long)-7219786563853781237L, (long)var4_5);
                    }
                    v37 = var32_25.N(var10_8);
                }
                catch (n9 v40) {
                    throw m44.a("j", (Object)v40, (long)-7219786563853781237L, (long)var4_5);
                }
lbl220:
                // 2 sources

                try {
                    try {
                        try {
                            v38 = var26_20;
lbl224:
                            // 2 sources

                            if (v38 != false) break;
                            if (v37) {
                            }
                            ** GOTO lbl239
                        }
                        catch (n9 v41) {
                            throw m44.a("j", (Object)v41, (long)-7219786563853781237L, (long)var4_5);
                        }
                        v42 = new Object[1];
                        v42[0] = var14_10;
                        var29_22.addAll(m44.a("u", (Object)var32_25, (Object)v42, (long)-9156334987052803920L, (long)var4_5));
                        if (var26_20 == false) break;
                    }
                    catch (n9 v43) {
                        throw m44.a("j", (Object)v43, (long)-7219786563853781237L, (long)var4_5);
                    }
lbl239:
                    // 2 sources

                    v37 = var29_22.add(var32_25);
                    break;
                }
                catch (n9 v44) {
                    throw m44.a("j", (Object)v44, (long)-7219786563853781237L, (long)var4_5);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public void s(Object[] var1_1) {
        var4_2 = (Set)var1_1[0];
        var2_3 = (Long)var1_1[1];
        var2_3 = j9.a ^ var2_3;
        var5_4 = m44.a("h", (long)7522990384266555672L, (long)var2_3);
        switch (m44.a("l", (long)8136172515383984408L, (long)var2_3)[m44.a("v", (Object)this, (long)8637688687860819566L, (long)var2_3).ordinal()]) {
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                var6_5 = (b1)m44.a("v", (Object)this, (long)8555455701682594085L, (long)var2_3).G();
                try {
                    v0 = var6_5;
                    if (var2_3 <= 0L || var5_4 == false) ** GOTO lbl18
                    if (v0 != null) {
                    }
                    ** GOTO lbl30
                }
                catch (n9 v1) {
                    throw m44.a("h", (Object)v1, (long)7898202320498164057L, (long)var2_3);
                }
                v0 = var6_5;
lbl18:
                // 2 sources

                try {
                    try {
                        v2 = v0.J();
                        if (var5_4 != false && v2) {
                        }
                        ** GOTO lbl30
                    }
                    catch (n9 v3) {
                        throw m44.a("h", (Object)v3, (long)7898202320498164057L, (long)var2_3);
                    }
                    v2 = var4_2.add((bn)var6_5);
                }
                catch (n9 v4) {
                    throw m44.a("h", (Object)v4, (long)7898202320498164057L, (long)var2_3);
                }
            }
lbl30:
            // 4 sources

            case 1: 
            case 2: 
            case 3: 
            case 4: {
                break;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l10 = a ^ 0x41CEA2900FDFL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[3];
        int n10 = 0;
        String string = "\u00acVb*\u0098\u00a6\u00d2o\u00f5z.>R\u00e6\u00a7\u00a80\u00a6\u0014o)q\u00bb\u00f7\u00a7\u0092\u008cGj\u00d2\u009c.\u00f5\u00b0\u00e5\u00bfV6V~\u009f[\u00e7%p\u00df4\u00d2\u00b0\u00a1U?\u00c3\u00da\u00af\u00e2\u009d\u0013\u001c\u0099\u00ec5[\u0013\u00f8\u0010JQP\u000b\u00c3+\u00cb\u0017\u0018\fe\u00cb\u0080\u001c\u00deF";
        int n11 = "\u00acVb*\u0098\u00a6\u00d2o\u00f5z.>R\u00e6\u00a7\u00a80\u00a6\u0014o)q\u00bb\u00f7\u00a7\u0092\u008cGj\u00d2\u009c.\u00f5\u00b0\u00e5\u00bfV6V~\u009f[\u00e7%p\u00df4\u00d2\u00b0\u00a1U?\u00c3\u00da\u00af\u00e2\u009d\u0013\u001c\u0099\u00ec5[\u0013\u00f8\u0010JQP\u000b\u00c3+\u00cb\u0017\u0018\fe\u00cb\u0080\u001c\u00deF".length();
        int n12 = 16;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = j9.b(byArray3).intern();
            if ((n13 += n12) >= n11) break;
            n12 = string.charAt(n13);
        }
        b = stringArray;
        c = new String[3];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l10 >>> 56);
        int n15 = 1;
        while (true) {
            if (n15 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l11 = -5961078226053352100L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                e = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n15] = (byte)(l10 << n15 * 8 >>> 56);
            ++n15;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3277;
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
                throw new RuntimeException("com/zelix/j9", exception);
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
            j9.c[n11] = j9.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = j9.b(n10, l10);
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
            throw new RuntimeException("com/zelix/j9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(j9.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

