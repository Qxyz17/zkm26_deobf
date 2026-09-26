/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.bi;
import com.zelix.df;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.kw;
import com.zelix.l6q;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ni;
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ks
extends kw
implements ni {
    bi[] O;
    byte[] E;
    int c;
    boolean F;
    private static final long a;
    private static final String[] d;
    private static final String[] g;
    private static final Map h;
    private static final long[] i;
    private static final Integer[] j;
    private static final Map k;

    /*
     * WARNING - void declaration
     */
    void k(Object[] objectArray) {
        block4: {
            void var8_7;
            CallSite callSite;
            long l10;
            long l11;
            df df2;
            block3: {
                CallSite callSite2;
                Object object;
                df2 = (df)objectArray[0];
                l11 = (Long)objectArray[1];
                l10 = (l11 = a ^ l11) ^ 0x7FFA8CD4F6D2L;
                callSite = m44.a("k", (long)4857878629024339853L, (long)l11);
                try {
                    object = m44.a("u", (Object)this, (long)5045589028681757627L, (long)l11);
                    if (callSite != false) break block3;
                    if (object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("k", (Object)n92, (long)6378072139198872114L, (long)l11);
                }
                object = callSite2 = (Object)false;
            }
            while (var8_7 < this.O.length) {
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = df2;
                objectArray2[0] = l10;
                m44.a("t", (Object)this.O[var8_7], (Object)objectArray2, (long)6601798997699100094L, (long)l11);
                ++var8_7;
                if (callSite == false) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected void N(Object[] var1_1) {
        block15: {
            block14: {
                var3_2 = (DataOutputStream)var1_1[0];
                var4_3 = (Map)var1_1[1];
                var5_4 = (Long)var1_1[2];
                var2_5 = (lqu)var1_1[3];
                var7_6 = var5_4 ^ 0L;
                v0 = m44.a("k", (long)1083949478671047661L, (long)var5_4);
                v1 = new Object[4];
                v1[3] = var2_5;
                v1[2] = var7_6;
                v1[1] = var4_3;
                v1[0] = var3_2;
                super.N(v1);
                var9_7 = v0;
                try {
                    try {
                        v2 /* !! */  = m44.a("u", (Object)this, (long)749243421611425755L, (long)var5_4);
                        if (var9_7 != false) break block14;
                        if (v2 /* !! */  != false) {
                        }
                        ** GOTO lbl49
                    }
                    catch (n9 v3) {
                        throw m44.a("k", (Object)v3, (long)1505088757909354066L, (long)var5_4);
                    }
                    var3_2.writeShort(this.c);
                    v2 /* !! */  = (reference)false;
                }
                catch (n9 v4) {
                    throw m44.a("k", (Object)v4, (long)1505088757909354066L, (long)var5_4);
                }
            }
            var10_8 = v2 /* !! */ ;
            block8: while (var10_8 < this.c) {
                try {
                    this.O[var10_8].k(var3_2);
                    ++var10_8;
                    do {
                        v5 = var9_7;
                        if (var5_4 > 0L) {
                            if (v5 != false) break block15;
                            v5 = var9_7;
                        }
                        if (v5 == false) continue block8;
                    } while (var5_4 < 0L);
                    break;
                }
                catch (n9 v6) {
                    throw m44.a("k", (Object)v6, (long)1505088757909354066L, (long)var5_4);
                }
            }
            try {
                if (var5_4 <= 0L || var9_7 == false) break block15;
lbl49:
                // 2 sources

                var3_2.write((byte[])m44.a("u", (Object)this, (long)1206783782547144691L, (long)var5_4));
            }
            catch (n9 v7) {
                throw m44.a("k", (Object)v7, (long)1505088757909354066L, (long)var5_4);
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
                var5_4 = var3_2 ^ 0L;
                v0 = m44.a("i", (long)716282175763740856L, (long)var3_2);
                v1 = new Object[2];
                v1[1] = var2_3;
                v1[0] = var5_4;
                super.c(v1);
                var7_5 = v0;
                try {
                    try {
                        v2 /* !! */  = m44.a("w", (Object)this, (long)1497411856566149497L, (long)var3_2);
                        if (var7_5 == false) break block14;
                        if (v2 /* !! */  != false) {
                        }
                        ** GOTO lbl45
                    }
                    catch (n9 v3) {
                        throw m44.a("i", (Object)v3, (long)738905392875694320L, (long)var3_2);
                    }
                    var2_3.writeShort(this.c);
                    v2 /* !! */  = (reference)false;
                }
                catch (n9 v4) {
                    throw m44.a("i", (Object)v4, (long)738905392875694320L, (long)var3_2);
                }
            }
            var8_6 = v2 /* !! */ ;
            block8: while (var8_6 < this.c) {
                try {
                    this.O[var8_6].k(var2_3);
                    ++var8_6;
                    do {
                        v5 = var7_5;
                        if (var3_2 >= 0L) {
                            if (v5 == false) break block15;
                            v5 = var7_5;
                        }
                        if (v5 != false) continue block8;
                    } while (var3_2 <= 0L);
                    break;
                }
                catch (n9 v6) {
                    throw m44.a("i", (Object)v6, (long)738905392875694320L, (long)var3_2);
                }
            }
            try {
                if (var3_2 < 0L || var7_5 != false) break block15;
lbl45:
                // 2 sources

                var2_3.write((byte[])m44.a("w", (Object)this, (long)1017078761453756753L, (long)var3_2));
            }
            catch (n9 v7) {
                throw m44.a("i", (Object)v7, (long)738905392875694320L, (long)var3_2);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void I(Object[] var1_1) {
        block21: {
            block26: {
                block22: {
                    block20: {
                        var2_2 = (Long)var1_1[0];
                        var5_3 = (HashSet)var1_1[1];
                        var4_4 = (df)var1_1[2];
                        v0 = var2_2 = ks.a ^ var2_2;
                        var6_5 = v0 ^ 6955020291887L;
                        var8_6 = v0 ^ 64193410948000L;
                        var10_7 = m44.a("h", (long)4929749674274197646L, (long)var2_2);
                        try {
                            try {
                                v1 = m44.a("v", (Object)this, (long)4685665109487137976L, (long)var2_2);
                                if (var10_7 != false) break block20;
                                if (v1 == false) break block21;
                            }
                            catch (n9 v2) {
                                throw m44.a("h", (Object)v2, (long)6881549963029953841L, (long)var2_2);
                            }
                            v1 = m44.a("w", (Object)var5_3, (long)6826074404256123972L, (long)var2_2);
                        }
                        catch (n9 v3) {
                            throw m44.a("h", (Object)v3, (long)6881549963029953841L, (long)var2_2);
                        }
                    }
                    if (v1 <= 0) break block21;
                    var11_8 = new ArrayList<bi>(this.O.length);
                    var12_9 = 0;
                    while (var12_9 < this.O.length) {
                        block24: {
                            block25: {
                                block23: {
                                    var13_11 = m44.a("w", (Object)this.O[var12_9], (Object)new Object[0], (long)4876284425236634239L, (long)var2_2);
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v4 /* !! */  = (int)m44.a("w", (Object)var5_3, (Object)var13_11, (long)6688869682522616435L, (long)var2_2);
                                                    v5 /* !! */  = var10_7;
                                                    if (var2_2 > 0L) {
                                                        if (v5 /* !! */  != false) break block22;
                                                        if (var10_7 != false) break block23;
                                                    }
                                                    ** GOTO lbl83
                                                }
                                                catch (n9 v6) {
                                                    throw m44.a("h", (Object)v6, (long)6881549963029953841L, (long)var2_2);
                                                }
                                                if (var2_2 < 0L) break block23;
                                                if (v4 /* !! */  != 0) ** GOTO lbl55
                                            }
                                            catch (n9 v7) {
                                                throw m44.a("h", (Object)v7, (long)6881549963029953841L, (long)var2_2);
                                            }
                                            var11_8.add(this.O[var12_9]);
                                            v8 = var10_7;
                                            if (var2_2 <= 0L) break block24;
                                            if (v8 != false) {
                                            }
                                            break block25;
                                        }
                                        catch (n9 v9) {
                                            throw m44.a("h", (Object)v9, (long)6881549963029953841L, (long)var2_2);
                                        }
lbl55:
                                        // 2 sources

                                        v10 = new Object[3];
                                        v10[2] = this.O[var12_9];
                                        v10[1] = var6_5;
                                        v10[0] = var13_11;
                                        v11 = m44.a("w", (Object)var4_4, (Object)v10, (long)4884743217182780266L, (long)var2_2);
                                    }
                                    catch (n9 v12) {
                                        throw m44.a("h", (Object)v12, (long)6881549963029953841L, (long)var2_2);
                                    }
                                }
                                var14_12 = v11;
                                v13 = new Object[2];
                                v13[1] = m44.a("l", (long)6847701933180036768L, (long)var2_2);
                                v13[0] = var8_6;
                                m44.a("w", (Object)var13_11, (Object)v13, (long)4973357595147645456L, (long)var2_2);
                            }
                            ++var12_9;
                            v8 = var10_7;
                        }
                        if (v8 == false) continue;
                    }
                    v14 = var11_8;
                    if (var2_2 < 0L) ** GOTO lbl91
                    v4 /* !! */  = v14.size();
                }
                try {
                    try {
                        v5 /* !! */  = var10_7;
lbl83:
                        // 2 sources

                        if (var2_2 > 0L) {
                            if (v5 /* !! */  != false) break block26;
                            v5 /* !! */  = (CallSite)this.O.length;
                        }
                        if (v4 /* !! */  >= v5 /* !! */ ) break block21;
                    }
                    catch (n9 v15) {
                        throw m44.a("h", (Object)v15, (long)6881549963029953841L, (long)var2_2);
                    }
                    v14 = var11_8;
lbl91:
                    // 2 sources

                    v4 /* !! */  = v14.size();
                }
                catch (n9 v16) {
                    throw m44.a("h", (Object)v16, (long)6881549963029953841L, (long)var2_2);
                }
            }
            var12_10 = new bi[v4 /* !! */ ];
            this.O = var11_8.toArray(var12_10);
            this.c = this.O.length;
            this.W = this.c * 4 + 2;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    ks(_4 var1_1, int var2_2, String var3_3, h1 var4_4, l6q var5_5, PrintWriter var6_6, l6q var7_7, long var8_8) {
        block20: {
            block21: {
                v0 = var8_8 = ks.a ^ var8_8;
                v1 = v0 ^ 4819919453649L;
                var10_9 = v1 >>> 32;
                var12_10 = (int)(v1 << 32 >>> 32);
                var13_11 = v0 ^ 82609078927245L;
                var15_12 = v0 ^ 77566743346496L;
                v2 = m44.a("l", (long)-7307770348675994659L, (long)var8_8);
                super(var1_1, var2_2, var3_3, var15_12, var4_4, var5_5);
                var17_13 = v2;
                try {
                    try {
                        try {
                            m44.a("p", (Object)this, (boolean)true, (long)-8673146282957934052L, (long)var8_8);
                            v3 /* !! */  = this.W;
                            if (var17_13 == false) break block20;
                            if (v3 /* !! */  >= 2) {
                            }
                            ** GOTO lbl69
                        }
                        catch (n9 v4) {
                            throw m44.a("l", (Object)v4, (long)-7411739969898251371L, (long)var8_8);
                        }
                        this.c = var4_4.readUnsignedShort();
                        v3 /* !! */  = this.c * 4 + 2;
                        if (var8_8 >= 0L) {
                            if (var17_13 == false) break block21;
                        }
                        ** GOTO lbl68
                    }
                    catch (n9 v5) {
                        throw m44.a("l", (Object)v5, (long)-7411739969898251371L, (long)var8_8);
                    }
                    if (v3 /* !! */  == this.W) {
                    }
                    ** GOTO lbl56
                }
                catch (n9 v6) {
                    throw m44.a("l", (Object)v6, (long)-7411739969898251371L, (long)var8_8);
                }
                this.O = new bi[this.c];
                var18_14 = 0;
                block12: while (var18_14 < this.c) {
                    try {
                        this.O[var18_14] = new bi(var10_9, var12_10, this, var4_4, var7_7);
                        ++var18_14;
                        do {
                            v7 = var17_13;
                            if (var8_8 > 0L) {
                                if (v7 == false) break block20;
                                v7 = var17_13;
                            }
                            if (v7 != false) continue block12;
                        } while (var8_8 < 0L);
                        break;
                    }
                    catch (n9 v8) {
                        throw m44.a("l", (Object)v8, (long)-7411739969898251371L, (long)var8_8);
                    }
                }
                try {
                    v9 = var17_13;
                    if (var8_8 <= 0L) break block21;
                    if (v9 != false) break block20;
lbl56:
                    // 2 sources

                    m44.a("p", (Object)this, (boolean)false, (long)-8673146282957934052L, (long)var8_8);
                    var6_6.println((String)ks.b("r", (int)13497, (long)(7082436587917747371L ^ var8_8)) + this.f(var13_11) + (String)ks.b("r", (int)8880, (long)(3328487656859579043L ^ var8_8)) + (String)ks.b("r", (int)8869, (long)(2241052410839577266L ^ var8_8)) + (String)ks.b("r", (int)25802, (long)(7724011318301422814L ^ var8_8)));
                    m44.a("p", (Object)this, (byte[])new byte[this.W], (long)-7099844614180031948L, (long)var8_8);
                    m44.a("r", (Object)this, (long)-7099844614180031948L, (long)var8_8)[0] = (CallSite)((byte)(this.c >>> ks.c("e", (int)11571, (long)(7368820808367407223L ^ var8_8)) & ks.c("e", (int)2869, (long)(6350207518850131571L ^ var8_8))));
                    m44.a("r", (Object)this, (long)-7099844614180031948L, (long)var8_8)[1] = (CallSite)((byte)(this.c >>> 0 & ks.c("e", (int)9936, (long)(5493024169552186263L ^ var8_8))));
                    v9 = m44.a("s", (Object)var4_4, (Object)m44.a("r", (Object)this, (long)-7099844614180031948L, (long)var8_8), (int)2, (int)(this.W - 2), (long)-9027870010239281837L, (long)var8_8);
                }
                catch (n9 v10) {
                    throw m44.a("l", (Object)v10, (long)-7411739969898251371L, (long)var8_8);
                }
            }
            try {
                v3 /* !! */  = (int)var17_13;
lbl68:
                // 2 sources

                if (var8_8 <= 0L || v3 /* !! */  != 0) break block20;
lbl69:
                // 2 sources

                m44.a("p", (Object)this, (boolean)false, (long)-8673146282957934052L, (long)var8_8);
                var6_6.println((String)ks.b("r", (int)30538, (long)(9179036059866589019L ^ var8_8)) + this.f(var13_11) + (String)ks.b("r", (int)1763, (long)(4558874141205108470L ^ var8_8)) + (String)ks.b("r", (int)12451, (long)(5100058427677614259L ^ var8_8)) + (String)ks.b("r", (int)27290, (long)(8295127472871602828L ^ var8_8)));
                m44.a("p", (Object)this, (byte[])new byte[this.W], (long)-7099844614180031948L, (long)var8_8);
                v3 /* !! */  = var4_4.read((byte[])m44.a("r", (Object)this, (long)-7099844614180031948L, (long)var8_8));
            }
            catch (n9 v11) {
                throw m44.a("l", (Object)v11, (long)-7411739969898251371L, (long)var8_8);
            }
        }
    }

    /*
     * Exception decompiling
     */
    public boolean C(Object[] var1_1) {
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
     * WARNING - void declaration
     */
    void i(Object[] objectArray) {
        block4: {
            void var6_6;
            CallSite callSite;
            ArrayList arrayList;
            block3: {
                CallSite callSite2;
                Object object;
                long l10 = (Long)objectArray[0];
                arrayList = (ArrayList)objectArray[1];
                l10 = a ^ l10;
                callSite = m44.a("j", (long)4013717470350362363L, (long)l10);
                try {
                    object = m44.a("t", (Object)this, (long)3063793791329722170L, (long)l10);
                    if (callSite == false) break block3;
                    if (object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("j", (Object)n92, (long)3747617849958323891L, (long)l10);
                }
                object = callSite2 = (Object)false;
            }
            while (var6_6 < this.O.length) {
                arrayList.add(this.O[var6_6]);
                ++var6_6;
                if (callSite != false) continue;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    void z(gu gu2, long l10) {
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
                    object = m44.a("v", (Object)this, (long)5230637320741928232L, (long)l10);
                    if (callSite != false) break block3;
                    if (object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)6201467966586205345L, (long)l10);
                }
                object = callSite2 = (Object)false;
            }
            while (var9_7 < this.c) {
                this.O[var9_7].z(gu2, l11);
                ++var9_7;
                if (callSite == false) continue;
            }
        }
    }

    public int[] v(Object[] objectArray) {
        int[] nArray;
        block4: {
            int[] nArray2;
            block5: {
                long l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                nArray2 = new int[this.c];
                CallSite callSite = m44.a("j", (long)9192937912551746420L, (long)l10);
                int n10 = 0;
                bi[] biArray = this.O;
                int n11 = biArray.length;
                int n12 = 0;
                block2: while (n12 < n11) {
                    bi bi2 = biArray[n12];
                    try {
                        nArray = nArray2;
                        if (l10 < 0L) break block4;
                        nArray[n10++] = bi2.q();
                        ++n12;
                        while (callSite == false) {
                            if (callSite == false) continue block2;
                            if (l10 < 0L) continue;
                            break block2;
                        }
                        break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)7240152529959945931L, (long)l10);
                    }
                }
                m44.a("j", (Object)nArray2, (long)7315793211489142062L, (long)l10);
            }
            nArray = nArray2;
        }
        return nArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        ks.a = prr.a(7080428522475299323L, -634462087426210541L, MethodHandles.lookup().lookupClass()).a(65415086684624L);
                        ks.h = new HashMap<K, V>(13);
                        var11 = ks.a ^ 119768390419890L;
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
                        var17_5 = "\"\u00c1ti\u00ce\u00f3\u00e4\u00e3\u00c3W\u00a3\u0011@\u001d\u00dc\u00a8@\u00d7\u008f\u0097\u001c\u00c56g\u0002Af\u00c8\u00be\u009faW.\u00f2\u009f\u0090a\u00c4\u00ca\u00d9z\u0002\u0088\u00eb\u0096\u00d0\u008f\u00bb\u00a8/ \u00f3(\u008e\u00ad\u00fb\b#tp\u0019\u0014\u00c1\u00a9qte>\u000e\u00f3=\u00cb_\u00f3\u00d1\u00e7\u0093\u00f6\u00e5\u00cds\u0010':\u00da\u00a5\u009a\u00bb5F{\u001e\u0091\u009b\u000e\u00cd\u00b5>\u0010z\u00ab\u00aa\u0002\u00f17))\u0018\u00d9N\u00c1\u00bd\u0003\u008c\u00fc\u0010\u00d1M\u00b2\u009fX\u00d8\u0015\u00ffY\"\u00e7\u00af\u00d2\n\u00c1\u00d0\u0010y\u0005A\u00b4- ;K\u00e1er#\u0091\u0081=\u00e4";
                        var19_6 = "\"\u00c1ti\u00ce\u00f3\u00e4\u00e3\u00c3W\u00a3\u0011@\u001d\u00dc\u00a8@\u00d7\u008f\u0097\u001c\u00c56g\u0002Af\u00c8\u00be\u009faW.\u00f2\u009f\u0090a\u00c4\u00ca\u00d9z\u0002\u0088\u00eb\u0096\u00d0\u008f\u00bb\u00a8/ \u00f3(\u008e\u00ad\u00fb\b#tp\u0019\u0014\u00c1\u00a9qte>\u000e\u00f3=\u00cb_\u00f3\u00d1\u00e7\u0093\u00f6\u00e5\u00cds\u0010':\u00da\u00a5\u009a\u00bb5F{\u001e\u0091\u009b\u000e\u00cd\u00b5>\u0010z\u00ab\u00aa\u0002\u00f17))\u0018\u00d9N\u00c1\u00bd\u0003\u008c\u00fc\u0010\u00d1M\u00b2\u009fX\u00d8\u0015\u00ffY\"\u00e7\u00af\u00d2\n\u00c1\u00d0\u0010y\u0005A\u00b4- ;K\u00e1er#\u0091\u0081=\u00e4".length();
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
                            var20_3[var18_4++] = ks.c(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "Yme\u0011`\u00f3\u0081s\u00fc\u00a4\u00bam\u0088\u001a|\u0018\u00b7J\u00d6\u00b5\u00bd\u0014s\u00d26:'\u00a4\u00cc\u0091\u0092\u0019V\u0007\u007fo\rO\u00daRJ\u0006\u00e6\u0094\u00edTq\u00a5\u0007\u00a0*s?\u00eaH\u00dd\u00cb\u00a1dE;0]\u00d3\u0010c\u00a5x\u00fdf\u0001\u0019\u00ccp\u0094\u00e6wd>z\u00c9";
                            var19_6 = "Yme\u0011`\u00f3\u0081s\u00fc\u00a4\u00bam\u0088\u001a|\u0018\u00b7J\u00d6\u00b5\u00bd\u0014s\u00d26:'\u00a4\u00cc\u0091\u0092\u0019V\u0007\u007fo\rO\u00daRJ\u0006\u00e6\u0094\u00edTq\u00a5\u0007\u00a0*s?\u00eaH\u00dd\u00cb\u00a1dE;0]\u00d3\u0010c\u00a5x\u00fdf\u0001\u0019\u00ccp\u0094\u00e6wd>z\u00c9".length();
                            var16_7 = 64;
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
                            var20_3[var18_4++] = ks.c(var21_9).intern();
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
                ks.d = var20_3;
                ks.g = new String[8];
                ks.k = new HashMap<K, V>(13);
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
                var6_12 = new long[3];
                var3_13 = 0;
                var4_14 = "\u00ab\u00dc\u00ec\u008f\u00da\u00dc[\u00e7\u0005\u00d2D\u00ca/\u00f3Z\u0084\u00b7\u0096\u0093l\u008dV\u00a83";
                var5_15 = "\u00ab\u00dc\u00ec\u008f\u00da\u00dc[\u00e7\u0005\u00d2D\u00ca/\u00f3Z\u0084\u00b7\u0096\u0093l\u008dV\u00a83".length();
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
        ks.i = var6_12;
        ks.j = new Integer[3];
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x199A;
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
                throw new RuntimeException("com/zelix/ks", exception);
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
            ks.g[n11] = ks.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = ks.b(n10, l10);
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
            throw new RuntimeException("com/zelix/ks" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x24CD;
        if (j[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = i[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])k.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ks", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ks.j[n11] = n12;
        }
        return j[n11];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = ks.c(n10, l10);
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
            throw new RuntimeException("com/zelix/ks" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ks.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ks.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

