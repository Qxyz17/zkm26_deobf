/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._yo;
import com.zelix.a2;
import com.zelix.ess;
import com.zelix.gj;
import com.zelix.se;
import com.zelix.sr;
import com.zelix.x44;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class vh {
    private boolean H;
    private a2 B;
    private List r;
    private static final long a = ess.a(-3339624934042888323L, 5380326741007393441L, MethodHandles.lookup().lookupClass()).a(178395893387255L);

    public vh(long l, a2 a22) {
        long l2 = (l = a ^ l) ^ 0x36E1275601EL;
        x44.a("s", (Object)this, (boolean)true, (long)-8656181741316616838L, (long)l);
        x44.a("s", (Object)this, (a2)a22, (long)-7473832527985916407L, (long)l);
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        x44.a("s", (Object)this, new ArrayList(x44.a("h", (Object)a22, (Object)objectArray, (long)-7267881093897483394L, (long)l).size()), (long)-8980330434421310123L, (long)l);
    }

    public int K(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return x44.a("m", (Object)this, (long)-8663142069606663732L, (long)l).size();
    }

    private boolean J(Object[] objectArray) {
        boolean bl;
        block6: {
            long l = (Long)objectArray[0];
            HashSet hashSet = (HashSet)objectArray[1];
            l = a ^ l;
            CallSite callSite = x44.a("n", (Object)hashSet, (long)8907292117544781014L, (long)l);
            CallSite callSite2 = x44.a("v", (long)7445248599385241904L, (long)l);
            while (callSite.hasNext()) {
                block8: {
                    boolean bl2;
                    block7: {
                        sr sr2 = (sr)callSite.next();
                        try {
                            try {
                                bl = sr2 instanceof se;
                                CallSite callSite3 = callSite2;
                                if (l >= 0L) {
                                    if (callSite3 == false) break block6;
                                    callSite3 = callSite2;
                                }
                                if (callSite3 == false) break block7;
                            }
                            catch (gj gj2) {
                                throw x44.a("v", (Object)gj2, (long)8813273279477758789L, (long)l);
                            }
                            if (!bl) break block8;
                        }
                        catch (gj gj3) {
                            throw x44.a("v", (Object)gj3, (long)8813273279477758789L, (long)l);
                        }
                        bl2 = true;
                    }
                    return bl2;
                }
                if (callSite2 != false) continue;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Exception decompiling
     */
    public String y(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [17[DOLOOP], 16[WHILELOOP]], but top level block is 6[TRYBLOCK]
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
    public boolean s(Object[] var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void M(Object[] objectArray) {
        long l = (Long)objectArray[0];
        HashSet hashSet = (HashSet)objectArray[1];
        l = a ^ l;
        x44.a("n", (Object)this, (long)5761613993836016127L, (long)l).add(hashSet);
    }

    public Set n(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        l = a ^ l;
        return (Set)x44.a("h", (Object)this, (long)5333171820285391881L, (long)l).get(n);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String R(Object[] var1_1) {
        block15: {
            block16: {
                var2_2 = (Long)var1_1[0];
                v0 = var2_2 = vh.a ^ var2_2;
                v1 = v0 ^ 28911673202158L;
                var4_3 = (int)(v1 >>> 32);
                var5_4 = (int)(v1 << 32 >>> 48);
                var6_5 = (int)(v1 << 48 >>> 48);
                var7_6 = v0 ^ 63836162115475L;
                var9_7 = v0 ^ 132381895853398L;
                var11_8 = v0 ^ 111340617537168L;
                var13_9 = v0 ^ 100178247881694L;
                var15_10 = x44.a("p", (long)-1705523919214971338L, (long)var2_2);
                try {
                    v2 = x44.a("l", (Object)this, (long)-1108116963178819947L, (long)var2_2).size();
                    v3 = new Object[1];
                    v3[0] = var13_9;
                    v4 = x44.a("h", (Object)x44.a("l", (Object)this, (long)-1474994181058873911L, (long)var2_2), (Object)v3, (long)-1665464534638069570L, (long)var2_2).size();
                    v5 = new Object[1];
                    v5[0] = var7_6;
                    v6 /* !! */  = x44.a("h", (Object)x44.a("l", (Object)this, (long)-1474994181058873911L, (long)var2_2), (Object)v5, (long)-1355239743522072572L, (long)var2_2);
                    if (var15_10 == false) break block15;
                    if (v6 /* !! */  == false) break block16;
                }
                catch (gj v7) {
                    throw x44.a("p", (Object)v7, (long)-772054568889469885L, (long)var2_2);
                }
                v6 /* !! */  = (CallSite)true;
                break block15;
            }
            v6 /* !! */  = (CallSite)false;
        }
        try {
            if (v2 < v4 + v6 /* !! */ ) {
                return null;
            }
        }
        catch (gj v8) {
            throw x44.a("p", (Object)v8, (long)-772054568889469885L, (long)var2_2);
        }
        var16_11 = 0;
        v9 = new Object[1];
        v9[0] = var13_9;
        var17_12 = x44.a("h", (Object)x44.a("l", (Object)this, (long)-1474994181058873911L, (long)var2_2), (Object)v9, (long)-1665464534638069570L, (long)var2_2).iterator();
        while (var17_12.hasNext()) {
            block18: {
                block19: {
                    block17: {
                        var18_13 = (_yo)var17_12.next();
                        try {
                            try {
                                v10 = new Object[1];
                                v10[0] = var9_7;
                                v11 = x44.a("h", (Object)var18_13, (Object)v10, (long)-966739239219486717L, (long)var2_2);
                                if (var2_2 < 0L || var15_10 == false) break block17;
                                if (v11 == false) {
                                }
                                ** GOTO lbl72
                            }
                            catch (gj v12) {
                                throw x44.a("p", (Object)v12, (long)-772054568889469885L, (long)var2_2);
                            }
                            v13 = new Object[3];
                            v13[2] = (int)((char)var6_5);
                            v13[1] = (int)((short)var5_4);
                            v13[0] = var4_3;
                            v11 = x44.a("h", (Object)var18_13, (Object)v13, (long)-1352428192766633669L, (long)var2_2);
                        }
                        catch (gj v14) {
                            throw x44.a("p", (Object)v14, (long)-772054568889469885L, (long)var2_2);
                        }
                    }
                    try {
                        if (var2_2 <= 0L) break block18;
                        if (v11 == false) break block19;
lbl72:
                        // 2 sources

                        v15 = new Object[2];
                        v15[1] = var11_8;
                        v15[0] = var16_11;
                        return x44.a("h", (Object)this, (Object)v15, (long)-1575404990112967386L, (long)var2_2);
                    }
                    catch (gj v16) {
                        throw x44.a("p", (Object)v16, (long)-772054568889469885L, (long)var2_2);
                    }
                }
                ++var16_11;
                v11 = var15_10;
            }
            if (v11 != false) continue;
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    public void g(Object[] var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    void v(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        x44.a("v", (Object)this, (boolean)bl, (long)617622905432064567L, (long)l);
    }

    public boolean M(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (boolean)x44.a("k", (Object)this, (long)-8709921354863030907L, (long)l);
    }

    private static gj a(gj gj2) {
        return gj2;
    }
}
