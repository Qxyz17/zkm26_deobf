/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class al {
    private int E;
    private List q;
    private List B;
    private boolean C;
    private int x;
    private static final long a = prr.a(-4051747971445896017L, 5530426317964292567L, MethodHandles.lookup().lookupClass()).a(280553197668114L);

    public void Q(Object[] objectArray) {
        block6: {
            lmu lmu2 = (lmu)objectArray[0];
            long l10 = (Long)objectArray[1];
            long l11 = (l10 = a ^ l10) ^ 0x63710F5C0D1AL;
            CallSite callSite = m44.a("n", (long)-1650950805659751984L, (long)l10);
            block2: while (m44.a("p", (Object)this, (long)-1296964831499437619L, (long)l10) > m44.a("p", (Object)this, (long)-786320576535886671L, (long)l10)) {
                try {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l11;
                    m44.a("q", (Object)this, (Object)objectArray2, (long)-675574632547957816L, (long)l10);
                    do {
                        CallSite callSite2 = callSite;
                        if (l10 >= 0L) {
                            if (callSite2 == false) break block6;
                            callSite2 = callSite;
                        }
                        if (callSite2 != false) continue block2;
                    } while (l10 < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)n92, (long)-896120241300556705L, (long)l10);
                }
            }
            m44.a("r", (Object)this, (int)((Integer)m44.a("p", (Object)this, (long)-773631027484743945L, (long)l10).remove(m44.a("p", (Object)this, (long)-773631027484743945L, (long)l10).size() - 1)), (long)-786320576535886671L, (long)l10);
        }
    }

    public al(int n10, short s10, short s11) {
        long l10 = ((long)n10 << 32 | (long)s10 << 48 >>> 32 | (long)s11 << 48 >>> 48) ^ a;
        m44.a("u", (Object)this, new ArrayList(), (long)-3833942259630726427L, (long)l10);
        m44.a("u", (Object)this, new ArrayList(), (long)-3488983899906696160L, (long)l10);
        m44.a("u", (Object)this, (int)0, (long)-3109911093233777894L, (long)l10);
        m44.a("u", (Object)this, (int)0, (long)-3476413225871622554L, (long)l10);
    }

    public lmu k(Object[] objectArray) {
        al al2;
        block4: {
            long l10;
            block5: {
                l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite = m44.a("k", (long)1077429332493700661L, (long)l10);
                try {
                    try {
                        al2 = this;
                        if (callSite == false) break block4;
                        reference v12 = m44.a("u", (Object)al2, (long)713022169911909928L, (long)l10) - true;
                        m44.a("w", (Object)al2, (int)v12, (long)713022169911909928L, (long)l10);
                        if (v12 >= m44.a("u", (Object)this, (long)1365440762944250708L, (long)l10)) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)1474154662123852730L, (long)l10);
                    }
                    m44.a("w", (Object)this, (int)((Integer)m44.a("u", (Object)this, (long)1344018911868469522L, (long)l10).remove(m44.a("u", (Object)this, (long)1344018911868469522L, (long)l10).size() - 1)), (long)1365440762944250708L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)1474154662123852730L, (long)l10);
                }
            }
            al2 = m44.a("u", (Object)this, (long)1727500336509812695L, (long)l10).remove(m44.a("u", (Object)this, (long)1727500336509812695L, (long)l10).size() - 1);
        }
        return (lmu)((Object)al2);
    }

    public int M(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)(m44.a("q", (Object)this, (long)5794251223862577060L, (long)l10) - m44.a("q", (Object)this, (long)5440203250936658648L, (long)l10));
    }

    /*
     * Exception decompiling
     */
    public void N(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[DOLOOP]], but top level block is 8[SIMPLE_IF_TAKEN]
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

    public void l(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        lmu lmu2 = (lmu)objectArray[1];
        l10 = a ^ l10;
        m44.a("t", (Object)this, (long)4102823946235859166L, (long)l10).add(lmu2);
        al al2 = this;
        m44.a("v", (Object)al2, (int)(m44.a("t", (Object)al2, (long)2804705873119801633L, (long)l10) + true), (long)2804705873119801633L, (long)l10);
    }

    public void J(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        m44.a("u", (Object)this, (long)8806405056806037890L, (long)l10).add((int)m44.a("u", (Object)this, (long)8818977751618948036L, (long)l10));
        m44.a("w", (Object)this, (int)m44.a("u", (Object)this, (long)7022626169524631224L, (long)l10), (long)8818977751618948036L, (long)l10);
        m44.a("t", (Object)lmu2, (Object)new Object[0], (long)9110232083253586163L, (long)l10);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

