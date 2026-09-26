/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmw;
import com.zelix.lu3;
import com.zelix.lwz;
import com.zelix.m44;
import com.zelix.n8;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class gf {
    private boolean O;
    private lu3 P;
    private List m;
    private static final long a = prr.a(6626011664961877958L, 6294071025720816830L, MethodHandles.lookup().lookupClass()).a(35484385421677L);

    public int V(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("w", (Object)this, (long)1390470027057953839L, (long)l10).size();
    }

    /*
     * Exception decompiling
     */
    public boolean h(Object[] var1_1) {
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
     * Exception decompiling
     */
    public String t(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[WHILELOOP], 17[DOLOOP]], but top level block is 6[TRYBLOCK]
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

    public Set m(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        return (Set)m44.a("u", (Object)this, (long)-5126899792021334083L, (long)l10).get(n10);
    }

    private boolean O(Object[] objectArray) {
        boolean bl2;
        block6: {
            long l10 = (Long)objectArray[0];
            HashSet hashSet = (HashSet)objectArray[1];
            l10 = a ^ l10;
            CallSite callSite = m44.a("v", (Object)hashSet, (long)-2173449905388745809L, (long)l10);
            CallSite callSite2 = m44.a("i", (long)-2018867227184326869L, (long)l10);
            while (callSite.hasNext()) {
                block8: {
                    boolean bl3;
                    block7: {
                        lmw lmw2 = (lmw)callSite.next();
                        try {
                            try {
                                bl2 = lmw2 instanceof n8;
                                CallSite callSite3 = callSite2;
                                if (l10 >= 0L) {
                                    if (callSite3 != null) break block6;
                                    callSite3 = callSite2;
                                }
                                if (callSite3 != null) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("i", (Object)n92, (long)-425456571604213816L, (long)l10);
                            }
                            if (!bl2) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("i", (Object)n93, (long)-425456571604213816L, (long)l10);
                        }
                        bl3 = true;
                    }
                    return bl3;
                }
                if (callSite2 == null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    public gf(lu3 lu32, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x6F7D3E21B8EBL;
        m44.a("s", (Object)this, (boolean)true, (long)6540511588725450111L, (long)l10);
        m44.a("s", (Object)this, (lu3)lu32, (long)6900878899491294759L, (long)l10);
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        m44.a("s", (Object)this, new ArrayList(m44.a("p", (Object)lu32, (Object)objectArray, (long)6450416877519238865L, (long)l10).size()), (long)6603836913224103105L, (long)l10);
    }

    void G(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        boolean bl2 = (Boolean)objectArray[1];
        l10 = a ^ l10;
        m44.a("r", (Object)this, (boolean)bl2, (long)-2067829263206523658L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    public void T(Object[] var1_1) {
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

    public boolean W(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (boolean)m44.a("q", (Object)this, (long)-5326485920512374353L, (long)l10);
    }

    public void B(Object[] objectArray) {
        HashSet hashSet = (HashSet)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        m44.a("q", (Object)this, (long)-5690875783937630623L, (long)l10).add(hashSet);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String Z(Object[] var1_1) {
        block15: {
            block16: {
                var2_2 = (Long)var1_1[0];
                v0 = var2_2 = gf.a ^ var2_2;
                var4_3 = v0 ^ 64252536201592L;
                var6_4 = v0 ^ 127035106878891L;
                var8_5 = v0 ^ 82657299052986L;
                var10_6 = v0 ^ 65950039057445L;
                var12_7 = v0 ^ 39481676192687L;
                var14_8 = m44.a("o", (long)-9091196883583470331L, (long)var2_2);
                try {
                    v1 = m44.a("q", (Object)this, (long)-8726403383174403711L, (long)var2_2).size();
                    v2 = new Object[1];
                    v2[0] = var6_4;
                    v3 = m44.a("p", (Object)m44.a("q", (Object)this, (long)-9041886375273557145L, (long)var2_2), (Object)v2, (long)-8879859255541421167L, (long)var2_2).size();
                    v4 = new Object[1];
                    v4[0] = var12_7;
                    v5 /* !! */  = m44.a("p", (Object)m44.a("q", (Object)this, (long)-9041886375273557145L, (long)var2_2), (Object)v4, (long)-7150659243923636631L, (long)var2_2);
                    if (var14_8 != null) break block15;
                    if (v5 /* !! */  == false) break block16;
                }
                catch (n9 v6) {
                    throw m44.a("o", (Object)v6, (long)-7478675856618766874L, (long)var2_2);
                }
                v5 /* !! */  = (CallSite)true;
                break block15;
            }
            v5 /* !! */  = (CallSite)false;
        }
        try {
            if (v1 < v3 + v5 /* !! */ ) {
                return null;
            }
        }
        catch (n9 v7) {
            throw m44.a("o", (Object)v7, (long)-7478675856618766874L, (long)var2_2);
        }
        var15_9 = 0;
        v8 = new Object[1];
        v8[0] = var6_4;
        var16_10 = m44.a("p", (Object)m44.a("q", (Object)this, (long)-9041886375273557145L, (long)var2_2), (Object)v8, (long)-8879859255541421167L, (long)var2_2).iterator();
        while (var16_10.hasNext()) {
            block18: {
                block17: {
                    var17_11 = (lwz)var16_10.next();
                    try {
                        try {
                            v9 = new Object[1];
                            v9[0] = var4_3;
                            v10 = m44.a("p", (Object)var17_11, (Object)v9, (long)-6974845836481740290L, (long)var2_2);
                            if (var2_2 < 0L || var14_8 != null) break block17;
                            if (v10 == false) {
                            }
                            ** GOTO lbl66
                        }
                        catch (n9 v11) {
                            throw m44.a("o", (Object)v11, (long)-7478675856618766874L, (long)var2_2);
                        }
                        v12 = new Object[1];
                        v12[0] = var8_5;
                        v10 = m44.a("p", (Object)var17_11, (Object)v12, (long)-7379975145145976174L, (long)var2_2);
                    }
                    catch (n9 v13) {
                        throw m44.a("o", (Object)v13, (long)-7478675856618766874L, (long)var2_2);
                    }
                }
                try {
                    if (v10 == false) break block18;
lbl66:
                    // 2 sources

                    v14 = new Object[2];
                    v14[1] = var15_9;
                    v14[0] = var10_6;
                    return m44.a("p", (Object)this, (Object)v14, (long)-6977044535147738870L, (long)var2_2);
                }
                catch (n9 v15) {
                    throw m44.a("o", (Object)v15, (long)-7478675856618766874L, (long)var2_2);
                }
            }
            ++var15_9;
            if (var14_8 == null) continue;
        }
        return null;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

