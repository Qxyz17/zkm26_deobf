/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._l;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.rx;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class k
implements rx {
    private _l e;
    private final _l F;
    private static final long a = prr.a((long)3393961587229015807L, (long)4996939283440450767L, MethodHandles.lookup().lookupClass()).a(181670173159812L);

    public boolean A(Object[] objectArray) {
        return false;
    }

    public String g(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x20CCCDDE94C1L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return (String)((Object)m44.a("p", (Object)m44.a("q", (Object)this, (long)-7409749394245058374L, (long)l), (Object)objectArray2, (long)-8957395130189021719L, (long)l));
    }

    public int c(Object[] objectArray) {
        int n;
        block10: {
            block11: {
                CallSite callSite;
                long l;
                block8: {
                    long l2;
                    String string;
                    block9: {
                        string = (String)objectArray[0];
                        l = (Long)objectArray[1];
                        long l3 = l = a ^ l;
                        l2 = l3 ^ 0xEAAF7DF389L;
                        long l4 = l3 ^ 0x6F927BF3E221L;
                        callSite = m44.a("o", (long)-1616967090209918684L, (long)l);
                        try {
                            try {
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l4;
                                n = ((String)((Object)m44.a("p", (Object)m44.a("q", (Object)this, (long)-1167831494052874662L, (long)l), (Object)objectArray2, (long)-769904666968749303L, (long)l))).equals(string);
                                if (callSite == null) break block8;
                                if (n == 0) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("o", (Object)((Object)n92), (long)-1048740732301344247L, (long)l);
                            }
                            return 0;
                        }
                        catch (n9 n93) {
                            throw m44.a("o", (Object)((Object)n93), (long)-1048740732301344247L, (long)l);
                        }
                    }
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l2;
                    n = ((String)((Object)m44.a("p", (Object)m44.a("q", (Object)this, (long)-1167831494052874662L, (long)l), (Object)objectArray3, (long)-1552401584875701495L, (long)l))).equals(string) ? 1 : 0;
                }
                try {
                    try {
                        if (callSite == null) break block10;
                        if (n == 0) break block11;
                    }
                    catch (n9 n94) {
                        throw m44.a("o", (Object)((Object)n94), (long)-1048740732301344247L, (long)l);
                    }
                    return 1;
                }
                catch (n9 n95) {
                    throw m44.a("o", (Object)((Object)n95), (long)-1048740732301344247L, (long)l);
                }
            }
            n = 2;
        }
        return n;
    }

    public String S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x682A907CDCF8L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return (String)((Object)m44.a("w", (Object)m44.a("v", (Object)this, (long)507818925353213597L, (long)l), (Object)objectArray2, (long)21537178255493559L, (long)l));
    }

    k(_l _l2) {
        this.F = _l2;
    }

    /*
     * Exception decompiling
     */
    public void e(Object[] var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at CfrApi.lambda$main$2(CfrApi.java:31)
         *     at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
         *     at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
         *     at java.base/java.lang.Thread.run(Thread.java:829)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public String d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x43C2F9F4A695L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return (String)((Object)m44.a("t", (Object)m44.a("u", (Object)this, (long)-4983439309961977018L, (long)l), (Object)objectArray2, (long)-4654327468995138027L, (long)l));
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
