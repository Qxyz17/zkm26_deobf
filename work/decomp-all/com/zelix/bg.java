/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._v;
import com.zelix.a;
import com.zelix.eo;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.j5;
import com.zelix.j9;
import com.zelix.js;
import com.zelix.kz;
import com.zelix.l6q;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.mb;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.xt;
import com.zelix.y0;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bg
extends _4
implements a,
eo,
mb,
y0 {
    j9 w;
    private int s;
    boolean d;
    js[] U;
    String M;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;

    public void I(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        js[] jsArray = new js[n + 1];
        System.arraycopy(this.U, 0, jsArray, 0, jsArray.length);
        this.U = jsArray;
    }

    /*
     * Exception decompiling
     */
    public void U(Object[] var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public int a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (int)m44.a("s", (Object)((Object)this), (long)6352774251827855320L, (long)l);
    }

    protected void j(Object[] objectArray) {
        DataOutputStream dataOutputStream = (DataOutputStream)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        dataOutputStream.writeShort(m44.a("r", (Object)((Object)this), (long)-6439407527633943778L, (long)l).E());
        dataOutputStream.writeShort(this.U.length);
        js[] jsArray = this.U;
        int n = jsArray.length;
        CallSite callSite = m44.a("l", (long)-6557888248734231115L, (long)l);
        for (int i = 0; i < n; ++i) {
            js js2 = jsArray[i];
            dataOutputStream.writeShort(js2.E());
            if (callSite != false) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean Y(Object[] var1_1) {
        block14: {
            block12: {
                block13: {
                    block11: {
                        var4_2 = (Integer)var1_1[0];
                        var6_3 = (String)var1_1[1];
                        var3_4 = (Integer)var1_1[2];
                        var5_5 = (Integer)var1_1[3];
                        var7_6 = (String)var1_1[4];
                        var2_7 = (String)var1_1[5];
                        v0 = var8_8 = ((long)var4_2 << 56 | (long)var3_4 << 32 >>> 8 | (long)var5_5 << 40 >>> 40) ^ bg.a;
                        var10_9 = v0 ^ 19087302771834L;
                        var12_10 = v0 ^ 23131795435375L;
                        var14_11 = v0 ^ 57957930218962L;
                        var16_12 = m44.a("k", (long)7251558563241793002L, (long)var8_8);
                        try {
                            try {
                                v1 = new Object[1];
                                v1[0] = var14_11;
                                v2 = m44.a("t", (Object)m44.a("u", (Object)this, (long)7421269787527070529L, (long)var8_8), (Object)v1, (long)8787401399889930093L, (long)var8_8).equals(var6_3);
                                if (var16_12 == false) break block11;
                                if (!v2) break block12;
                            }
                            catch (n9 v3) {
                                throw m44.a("k", (Object)v3, (long)8704614253957777122L, (long)var8_8);
                            }
                            v4 = new Object[1];
                            v4[0] = var10_9;
                            v2 = m44.a("t", (Object)m44.a("u", (Object)this, (long)7421269787527070529L, (long)var8_8), (Object)v4, (long)8967376541868393291L, (long)var8_8).equals(var7_6);
                        }
                        catch (n9 v5) {
                            throw m44.a("k", (Object)v5, (long)8704614253957777122L, (long)var8_8);
                        }
                    }
                    try {
                        try {
                            v6 = var16_12;
                            if (var3_4 > 0) {
                                if (v6 == false) break block13;
                                if (!v2) break block12;
                            }
                            ** GOTO lbl53
                        }
                        catch (n9 v7) {
                            throw m44.a("k", (Object)v7, (long)8704614253957777122L, (long)var8_8);
                        }
                        v8 = new Object[1];
                        v8[0] = var12_10;
                        v2 = m44.a("t", (Object)m44.a("u", (Object)this, (long)7421269787527070529L, (long)var8_8), (Object)v8, (long)7335189145802886399L, (long)var8_8).equals(var2_7);
                    }
                    catch (n9 v9) {
                        throw m44.a("k", (Object)v9, (long)8704614253957777122L, (long)var8_8);
                    }
                }
                try {
                    v6 = var16_12;
lbl53:
                    // 2 sources

                    if (v6 == false) break block14;
                    if (!v2) break block12;
                }
                catch (n9 v10) {
                    throw m44.a("k", (Object)v10, (long)8704614253957777122L, (long)var8_8);
                }
                v2 = true;
                break block14;
            }
            v2 = false;
        }
        return v2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String o(Object[] objectArray) {
        StringBuilder stringBuilder;
        block11: {
            long l = (Long)objectArray[0];
            long l2 = l = a ^ l;
            long l3 = l2 ^ 0x4246643056E6L;
            int n = (int)(l3 >>> 48);
            int n2 = (int)(l3 << 16 >>> 32);
            int n3 = (int)(l3 << 48 >>> 48);
            long l4 = l2 ^ 0x4246643056E6L;
            int n4 = (int)(l4 >>> 48);
            int n5 = (int)(l4 << 16 >>> 32);
            int n6 = (int)(l4 << 48 >>> 48);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append((char)bg.b("n", (int)10146, (long)(0x12CC42D4EAC681BCL ^ l)));
            CallSite callSite = m44.a("k", (long)-4946495336560014830L, (long)l);
            stringBuilder2.append((String)((Object)m44.a("t", (Object)m44.a("u", (Object)((Object)this), (long)-5114515601956725575L, (long)l), (char)((char)n), (int)n2, (short)((short)n3), (long)-6833942528616982985L, (long)l)));
            CallSite callSite2 = callSite;
            stringBuilder2.append((String)((Object)bg.a("m", (int)16362, (long)(0x6F9C4007A8C3F3B3L ^ l))));
            stringBuilder2.append((char)bg.b("n", (int)17758, (long)(0x14F4542E6B53E346L ^ l)));
            int n7 = 0;
            block6: while (n7 < this.U.length) {
                try {
                    try {
                        try {
                            stringBuilder = stringBuilder2.append((String)((Object)m44.a("t", (Object)this.U[n7], (char)((char)n4), (int)n5, (short)((short)n6), (long)-4772944816888283656L, (long)l)));
                            if (l < 0L) break block11;
                        }
                        catch (n9 n92) {
                            throw m44.a("k", (Object)((Object)n92), (long)-6398152519486645990L, (long)l);
                        }
                    }
                    catch (n9 n93) {
                        throw m44.a("k", (Object)((Object)n93), (long)-6398152519486645990L, (long)l);
                    }
                }
                catch (n9 n94) {
                    throw m44.a("k", (Object)((Object)n94), (long)-6398152519486645990L, (long)l);
                }
                while (callSite2 != false) {
                    CallSite callSite3 = callSite2;
                    if (l > 0L) {
                        if (callSite3 != false) {
                            if (n7 < this.U.length - 1) {
                                stringBuilder2.append((char)bg.b("n", (int)13106, (long)(0x1315D3B0BE23952FL ^ l)));
                            }
                            ++n7;
                        }
                        callSite3 = callSite2;
                    }
                    if (callSite3 != false) continue block6;
                    stringBuilder2.append((char)bg.b("n", (int)25929, (long)(0x41BDED7742EE4352L ^ l)));
                    stringBuilder2.append((char)bg.b("n", (int)12798, (long)(0x3DB1602EBFD697E4L ^ l)));
                    if (l <= 0L) continue;
                }
                break block6;
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder.toString();
    }

    String e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("s", (Object)((Object)this), (long)-7465094528944426881L, (long)l);
    }

    public js[] E(Object[] objectArray) {
        js[] jsArray = new js[this.U.length];
        System.arraycopy(this.U, 0, jsArray, 0, this.U.length);
        return jsArray;
    }

    /*
     * Exception decompiling
     */
    public void S(Object[] var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public void o(Object[] var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public Set l(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        HashSet<CallSite> hashSet = new HashSet<CallSite>((int)bg.b("n", (int)5170, (long)(0x4D8CC3D01BDF3906L ^ l)));
        js[] jsArray = this.U;
        CallSite callSite = m44.a("n", (long)-5730879867508506305L, (long)l);
        int n = jsArray.length;
        int n2 = 0;
        while (n2 < n) {
            CallSite callSite2;
            block3: {
                block4: {
                    block5: {
                        js js2 = jsArray[n2];
                        try {
                            callSite2 = callSite;
                            if (l <= 0L) break block3;
                            if (callSite2 == false) break block4;
                            if (!(js2 instanceof j5)) break block5;
                        }
                        catch (n9 n92) {
                            throw m44.a("n", (Object)((Object)n92), (long)-6045970882223189449L, (long)l);
                        }
                        j5 j52 = (j5)js2;
                        hashSet.add(m44.a("q", (Object)j52, (Object)new Object[0], (long)-5813466713318617040L, (long)l));
                    }
                    ++n2;
                }
                callSite2 = callSite;
            }
            if (callSite2 != false) continue;
        }
        return hashSet;
    }

    public void q(Object[] objectArray) {
        Set set = (Set)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x54D6D2433A80L;
        long l4 = l2 ^ 0x71D891EDF4F2L;
        js[] jsArray = this.U;
        CallSite callSite = m44.a("o", (long)6536589407838211665L, (long)l);
        int n = jsArray.length;
        int n2 = 0;
        while (n2 < n) {
            CallSite callSite2;
            block5: {
                block6: {
                    block7: {
                        js js2 = jsArray[n2];
                        try {
                            try {
                                callSite2 = callSite;
                                if (l <= 0L) break block5;
                                if (callSite2 != false) break block6;
                                if (js2.A(l4) != m44.a("k", (long)4730794932612349613L, (long)l)) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("o", (Object)((Object)n92), (long)6809838116456865966L, (long)l);
                            }
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l3;
                            objectArray2[0] = set;
                            m44.a("p", (Object)((j9)js2), (Object)objectArray2, (long)5043452366625035178L, (long)l);
                        }
                        catch (n9 n93) {
                            throw m44.a("o", (Object)((Object)n93), (long)6809838116456865966L, (long)l);
                        }
                    }
                    ++n2;
                }
                callSite2 = callSite;
            }
            if (callSite2 == false) continue;
        }
    }

    /*
     * Exception decompiling
     */
    public void h(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 9[SWITCH]
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

    public String G(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                l = (l2 = a ^ l2) ^ 0x6CA5EA660736L;
                CallSite callSite2 = m44.a("o", (long)-3594261347508839687L, (long)l2);
                try {
                    try {
                        callSite = m44.a("q", (Object)((Object)this), (long)-3163218404709338715L, (long)l2);
                        if (callSite2 != false) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)((Object)n92), (long)-3879472193972390906L, (long)l2);
                    }
                    callSite = m44.a("q", (Object)((Object)this), (long)-3163218404709338715L, (long)l2);
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)((Object)n93), (long)-3879472193972390906L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l;
            return m44.a("p", (Object)callSite, (Object)objectArray2, (long)-3812500423613082231L, (long)l2);
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    protected void P(Object[] var1_1) {
        var3_2 = (DataOutputStream)var1_1[0];
        var4_3 = (Map)var1_1[1];
        var5_4 = (Long)var1_1[2];
        var2_5 = (lqu)var1_1[3];
        var5_4 = bg.a ^ var5_4;
        v0 = m44.a("i", (long)2589755814151288599L, (long)var5_4);
        var3_2.writeShort(m44.a("w", (Object)this, (long)4177030342470704203L, (long)var5_4).E());
        var7_6 = v0;
        var3_2.writeShort(this.U.length);
        var8_7 = this.U;
        var9_8 = var8_7.length;
        var10_9 = 0;
        while (var10_9 < var9_8) {
            block10: {
                block11: {
                    block9: {
                        var11_10 = var8_7[var10_9];
                        var12_11 = (js)var4_3.get(var11_10);
                        try {
                            try {
                                v1 = var7_6;
                                if (var5_4 < 0L) ** GOTO lbl34
                                if (v1 != false) break block9;
                                if (var12_11 != null) {
                                }
                                ** GOTO lbl36
                            }
                            catch (n9 v2) {
                                throw m44.a("i", (Object)v2, (long)2866382772630051304L, (long)var5_4);
                            }
                            var3_2.writeShort(var12_11.E());
                        }
                        catch (n9 v3) {
                            throw m44.a("i", (Object)v3, (long)2866382772630051304L, (long)var5_4);
                        }
                    }
                    try {
                        v1 = var7_6;
lbl34:
                        // 2 sources

                        if (var5_4 < 0L) break block10;
                        if (v1 == false) break block11;
lbl36:
                        // 2 sources

                        var3_2.writeShort(var11_10.E());
                    }
                    catch (n9 v4) {
                        throw m44.a("i", (Object)v4, (long)2866382772630051304L, (long)var5_4);
                    }
                }
                ++var10_9;
                v1 = var7_6;
            }
            if (v1 == false) continue;
        }
    }

    /*
     * Exception decompiling
     */
    bg(_4 var1_1, h1 var2_2, int var3_3, l6q var4_4, l6q var5_5, l6q var6_6, l6q var7_7, PrintWriter var8_8, long var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [55[DOLOOP]], but top level block is 25[TRYBLOCK]
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

    int h(Object[] objectArray) {
        return 4 + this.U.length * 2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void g(Object[] var1_1) {
        block50: {
            block54: {
                block53: {
                    block52: {
                        block51: {
                            block49: {
                                var2_2 = (Long)var1_1[0];
                                var4_3 = (_v)var1_1[1];
                                v0 = var2_2 = bg.a ^ var2_2;
                                var5_4 = v0 ^ 13382671123436L;
                                var7_5 = v0 ^ 56194308842313L;
                                var9_6 = v0 ^ 106677229043039L;
                                var11_7 = v0 ^ 60719545573237L;
                                var13_8 = v0 ^ 80770913376509L;
                                var15_9 = m44.a("j", (long)-7956839431204839205L, (long)var2_2);
                                try {
                                    try {
                                        try {
                                            v1 /* !! */  = m44.a("t", (Object)this, (long)-7717883467045261382L, (long)var2_2);
                                            if (var15_9 == false) break block49;
                                            if (v1 /* !! */  == false) break block50;
                                        }
                                        catch (n9 v2) {
                                            throw m44.a("j", (Object)v2, (long)-8215667235348646957L, (long)var2_2);
                                        }
                                        v3 = this;
                                        if (var2_2 <= 0L || var15_9 == false) break block51;
                                    }
                                    catch (n9 v4) {
                                        throw m44.a("j", (Object)v4, (long)-8215667235348646957L, (long)var2_2);
                                    }
                                    v5 = new Object[1];
                                    v5[0] = var5_4;
                                    v1 /* !! */  = (CallSite)m44.a("u", (Object)v3, (Object)v5, (long)-8561124283103433347L, (long)var2_2).equals(bg.a("m", (int)32662, (long)(502423932128467204L ^ var2_2)));
                                }
                                catch (n9 v6) {
                                    throw m44.a("j", (Object)v6, (long)-8215667235348646957L, (long)var2_2);
                                }
                            }
                            if (v1 /* !! */  == false) break block50;
                            v3 = this;
                        }
                        try {
                            try {
                                v7 = v3.U;
                                if (var2_2 < 0L || var15_9 == false) break block52;
                                if (v7 == null) break block50;
                            }
                            catch (n9 v8) {
                                throw m44.a("j", (Object)v8, (long)-8215667235348646957L, (long)var2_2);
                            }
                            v7 = this.U;
                        }
                        catch (n9 v9) {
                            throw m44.a("j", (Object)v9, (long)-8215667235348646957L, (long)var2_2);
                        }
                    }
                    try {
                        try {
                            v10 = v7.length;
                            v11 /* !! */  = var15_9;
                            if (var2_2 > 0L) {
                                if (v11 /* !! */  == false) break block53;
                                v11 /* !! */  = (CallSite)2;
                            }
                            if (v10 < v11 /* !! */ ) break block50;
                        }
                        catch (n9 v12) {
                            throw m44.a("j", (Object)v12, (long)-8215667235348646957L, (long)var2_2);
                        }
                        v10 = 1;
                    }
                    catch (n9 v13) {
                        throw m44.a("j", (Object)v13, (long)-8215667235348646957L, (long)var2_2);
                    }
                }
                var16_10 = v10;
                var17_11 = this.U[var16_10++];
                try {
                    try {
                        v14 = var17_11;
                        if (var15_9 == false) break block54;
                        if (!(v14 instanceof xt)) break block50;
                    }
                    catch (n9 v15) {
                        throw m44.a("j", (Object)v15, (long)-8215667235348646957L, (long)var2_2);
                    }
                    v14 = var17_11;
                }
                catch (n9 v16) {
                    throw m44.a("j", (Object)v16, (long)-8215667235348646957L, (long)var2_2);
                }
            }
            var18_12 = (xt)v14;
            v17 = new Object[1];
            v17[0] = var7_5;
            var19_13 = m44.a("u", (Object)var18_12, (Object)v17, (long)-8138399007970831649L, (long)var2_2);
            var20_14 = new StringBuilder();
            var21_15 = new StringTokenizer((String)var19_13, ";");
            var22_16 = var21_15.countTokens();
            var23_17 = 0;
            while (var23_17 < var22_16) {
                block60: {
                    block61: {
                        block59: {
                            block58: {
                                block57: {
                                    block56: {
                                        block55: {
                                            try {
                                                try {
                                                    v18 /* !! */  = var15_9;
                                                    if (var2_2 >= 0L) {
                                                        if (v18 /* !! */  == false) break block50;
                                                        v18 /* !! */  = (CallSite)var23_17;
                                                    }
                                                    if (v18 /* !! */  <= 0) break block55;
                                                }
                                                catch (n9 v19) {
                                                    throw m44.a("j", (Object)v19, (long)-8215667235348646957L, (long)var2_2);
                                                }
                                                var20_14.append(";");
                                            }
                                            catch (n9 v20) {
                                                throw m44.a("j", (Object)v20, (long)-8215667235348646957L, (long)var2_2);
                                            }
                                        }
                                        var24_19 = var21_15.nextToken();
                                        if (var2_2 < 0L) break block61;
                                        if (var16_10 >= this.U.length) ** GOTO lbl172
                                        var25_20 = this.U[var16_10++];
                                        try {
                                            try {
                                                v21 = var25_20;
                                                if (var15_9 == false) break block56;
                                                if (v21 instanceof j9) {
                                                }
                                                ** GOTO lbl162
                                            }
                                            catch (n9 v22) {
                                                throw m44.a("j", (Object)v22, (long)-8215667235348646957L, (long)var2_2);
                                            }
                                            v21 = var25_20;
                                        }
                                        catch (n9 v23) {
                                            throw m44.a("j", (Object)v23, (long)-8215667235348646957L, (long)var2_2);
                                        }
                                    }
                                    var26_21 = (j9)v21;
                                    v24 = new Object[1];
                                    v24[0] = var13_8;
                                    var27_22 = m44.a("u", (Object)var26_21, (Object)v24, (long)-8210516990299110109L, (long)var2_2);
                                    try {
                                        try {
                                            v25 = var15_9;
                                            if (var2_2 < 0L) ** GOTO lbl148
                                            if (v25 == false) break block57;
                                            if (var27_22 != null) {
                                            }
                                            ** GOTO lbl151
                                        }
                                        catch (n9 v26) {
                                            throw m44.a("j", (Object)v26, (long)-8215667235348646957L, (long)var2_2);
                                        }
                                        var20_14.append(var27_22.d(var11_7));
                                    }
                                    catch (n9 v27) {
                                        throw m44.a("j", (Object)v27, (long)-8215667235348646957L, (long)var2_2);
                                    }
                                }
                                try {
                                    v25 = var15_9;
lbl148:
                                    // 2 sources

                                    if (var2_2 >= 0L) {
                                        if (v25 != false) break block58;
                                    }
                                    ** GOTO lbl159
lbl151:
                                    // 2 sources

                                    var20_14.append(var24_19);
                                }
                                catch (n9 v28) {
                                    throw m44.a("j", (Object)v28, (long)-8215667235348646957L, (long)var2_2);
                                }
                            }
                            try {
                                v25 = var15_9;
lbl159:
                                // 2 sources

                                if (var2_2 >= 0L) {
                                    if (v25 != false) break block59;
                                }
                                ** GOTO lbl170
lbl162:
                                // 2 sources

                                var20_14.append(var24_19);
                            }
                            catch (n9 v29) {
                                throw m44.a("j", (Object)v29, (long)-8215667235348646957L, (long)var2_2);
                            }
                        }
                        try {
                            v25 = var15_9;
lbl170:
                            // 2 sources

                            if (var2_2 <= 0L) break block60;
                            if (v25 != false) break block61;
lbl172:
                            // 2 sources

                            var20_14.append(var24_19);
                        }
                        catch (n9 v30) {
                            throw m44.a("j", (Object)v30, (long)-8215667235348646957L, (long)var2_2);
                        }
                    }
                    ++var23_17;
                    v25 = var15_9;
                }
                if (v25 != false) continue;
            }
            var23_18 = var20_14.toString();
            try {
                if (var2_2 > 0L && var2_2 >= 0L && !var23_18.equals(var19_13)) {
                    v31 = new Object[2];
                    v31[1] = var23_18;
                    v31[0] = var9_6;
                    m44.a("u", (Object)var18_12, (Object)v31, (long)-8609055444196770827L, (long)var2_2);
                }
            }
            catch (n9 v32) {
                throw m44.a("j", (Object)v32, (long)-8215667235348646957L, (long)var2_2);
            }
        }
    }

    /*
     * Exception decompiling
     */
    public void V(Object[] var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public String q(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0xBD83EF24929L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return (String)((Object)m44.a("m", (int)m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-8233558850355179891L, (long)l), (long)-7941858525182395321L, (long)l)) + (char)bg.b("n", (int)27221, (long)(0x2F5363D06D5FFC67L ^ l)) + (String)((Object)m44.a("m", (int)System.identityHashCode((Object)this), (long)-7941858525182395321L, (long)l));
    }

    void a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        l = a ^ l;
        m44.a("s", (Object)((Object)this), (int)n, (long)2676250303422792402L, (long)l);
    }

    public boolean W(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x39AFF052BCBBL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return (boolean)m44.a("v", (Object)m44.a("w", (Object)((Object)this), (long)5928972331917899771L, (long)l), (Object)objectArray2, (long)6335901849198520778L, (long)l);
    }

    bg(kz kz2, long l, j9 j92, js[] jsArray, int n) {
        l = a ^ l;
        super((_4)kz2);
        m44.a("v", (Object)((Object)this), (boolean)true, (long)-2588292072105744566L, (long)l);
        m44.a("v", (Object)((Object)this), (j9)j92, (long)-2649056830605984128L, (long)l);
        this.U = jsArray;
        m44.a("v", (Object)((Object)this), (int)n, (long)-4094188640146693921L, (long)l);
    }

    void z(gu gu2, long l) {
        long l2 = l;
        long l3 = l2 ^ 0x6DE1DADD9981L;
        long l4 = l2 ^ 0x66FDF08525FDL;
        CallSite callSite = m44.a("h", (long)5618762033536375070L, (long)l);
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)6340709331530478146L, (long)l), (long)l3, (Object)gu2, (Object)((Object)this), (Object)this.H(), (long)6303418127431750277L, (long)l);
        js[] jsArray = this.U;
        CallSite callSite2 = callSite;
        for (js js2 : jsArray) {
            gu2.K(js2, (Object)this, l4, (Object)this.H());
            if (callSite2 == false) continue;
        }
    }

    boolean I(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (boolean)m44.a("s", (Object)((Object)this), (long)3218881943051016181L, (long)l);
    }

    public void K(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x1C3BAA7FA05AL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("w", (Object)((kz)this.H()), (Object)objectArray2, (long)1963653461078828918L, (long)l);
    }

    /*
     * Exception decompiling
     */
    public void O(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 9[SWITCH]
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

    public j9 A(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("w", (Object)((Object)this), (long)-5357119000167706597L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        bg.a = prr.a((long)-5611439503535917409L, (long)298554176250812694L, MethodHandles.lookup().lookupClass()).a(155104042561304L);
                        bg.f = new HashMap<K, V>(13);
                        var11 = bg.a ^ 69506276010062L;
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
                        var20_3 = new String[4];
                        var18_4 = 0;
                        var17_5 = "\u00cc\u00c4\u00d8\u00cf\u0007 \u0094G\u0085?\u001fDZ\u0019\u00a06H,E,\u0001\u00f4f\u00de\u00deKK\u00b343\u00eeM\u00bb\u00f2G\u00ff\u009c\u0087\u00dd\u0004C\u009f\u0091\u009cE\u0003\u00c3\u00af\u00d6jk\u0012S\u00d5-\u0081l\u00aa\u009f\u00cf\u0013d]|\u00dd{61\u00d1y\u00112\u00c0\u000bN\u00b5Q1\u00easn\u0017m9\u00e2\u00eb8`\u00d3";
                        var19_6 = "\u00cc\u00c4\u00d8\u00cf\u0007 \u0094G\u0085?\u001fDZ\u0019\u00a06H,E,\u0001\u00f4f\u00de\u00deKK\u00b343\u00eeM\u00bb\u00f2G\u00ff\u009c\u0087\u00dd\u0004C\u009f\u0091\u009cE\u0003\u00c3\u00af\u00d6jk\u0012S\u00d5-\u0081l\u00aa\u009f\u00cf\u0013d]|\u00dd{61\u00d1y\u00112\u00c0\u000bN\u00b5Q1\u00easn\u0017m9\u00e2\u00eb8`\u00d3".length();
                        var16_7 = 16;
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
                            var20_3[var18_4++] = bg.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "y\u00cf\u00ebL\b\u00f2\u00e89Dv\u008fBq\u00adX|&x?\u00aeE!\u00d2\u0080\u00d7\u008fTr\u00a3O\u00daJ/nz,\u00d9\u00c9E\u0083k\u00cb\u00f8i\u00e5\u00c6\u00c8\u0006y\u00ccu\u00cb\u00fa\u00d5\u00d3[H\u00ae`\u0012\u000e\u00c8:C]D\u00c8\u00b9^[5\u0007fTA\u00fd\u000f\u00dc\u00e8\u0018W\u00af\u00d1\u0019U\u00ac\u008a\u00ff}\u00c7\u00d6.\n\u001e\u00c1\u00b0\u000b\u00cc\u009e\u00d4\u00173u\u00b1\u00eb_g\u009a\\\u00e0\u00fa7h\u00df\u0081\u00c2\u00a2\u00e8\u00b7\u00c4\u00a2zH\"~\u001a<sC";
                            var19_6 = "y\u00cf\u00ebL\b\u00f2\u00e89Dv\u008fBq\u00adX|&x?\u00aeE!\u00d2\u0080\u00d7\u008fTr\u00a3O\u00daJ/nz,\u00d9\u00c9E\u0083k\u00cb\u00f8i\u00e5\u00c6\u00c8\u0006y\u00ccu\u00cb\u00fa\u00d5\u00d3[H\u00ae`\u0012\u000e\u00c8:C]D\u00c8\u00b9^[5\u0007fTA\u00fd\u000f\u00dc\u00e8\u0018W\u00af\u00d1\u0019U\u00ac\u008a\u00ff}\u00c7\u00d6.\n\u001e\u00c1\u00b0\u000b\u00cc\u009e\u00d4\u00173u\u00b1\u00eb_g\u009a\\\u00e0\u00fa7h\u00df\u0081\u00c2\u00a2\u00e8\u00b7\u00c4\u00a2zH\"~\u001a<sC".length();
                            var16_7 = 56;
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
                            var20_3[var18_4++] = bg.a(var21_9).intern();
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
                bg.b = var20_3;
                bg.c = new String[4];
                bg.i = new HashMap<K, V>(13);
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
                var6_12 = new long[7];
                var3_13 = 0;
                var4_14 = "\u00cb\u00b4q\u00a3 ?\u001a]\u00ddW\u00e9\u00ba\u00c2\u00c8O\u00da\u00b7\u00ef5\u0004\b=&s\u00a8N\u00b5\u0011F\u0096[\u00f6\u00fa\u00fa)\u009a\u00c5\u00c2\u0002\u00ed";
                var5_15 = "\u00cb\u00b4q\u00a3 ?\u001a]\u00ddW\u00e9\u00ba\u00c2\u00c8O\u00da\u00b7\u00ef5\u0004\b=&s\u00a8N\u00b5\u0011F\u0096[\u00f6\u00fa\u00fa)\u009a\u00c5\u00c2\u0002\u00ed".length();
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
                    var4_14 = "\u00c6\u0016u\u0013\u00dd\u00f1\u00b2\u00de\u00af\u009ek?f\u0014\u008c\u00b7";
                    var5_15 = "\u00c6\u0016u\u0013\u00dd\u00f1\u00b2\u00de\u00af\u009ek?f\u0014\u008c\u00b7".length();
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
        bg.g = var6_12;
        bg.h = new Integer[7];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c2;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c2 = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c2 = (char)(c2 | (char)(n3 & 0x3F));
                cArray[n++] = c2;
                continue;
            }
            if (i >= n2 - 2) continue;
            c2 = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F));
            cArray[n++] = c2;
        }
        return new String(cArray, 0, n);
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x641D;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/bg", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            bg.c[n2] = bg.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = bg.a(n, l);
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
            throw new RuntimeException("com/zelix/bg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xE5C;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = g[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/bg", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            bg.h[n2] = n3;
        }
        return h[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = bg.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/bg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bg.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(bg.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
