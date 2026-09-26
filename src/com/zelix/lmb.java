/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.rq;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class lmb {
    private List N;
    private boolean I;
    private int Q;
    private int U;
    private List G;
    private static final long a = prr.a((long)137581834925092708L, (long)5160118336301271079L, MethodHandles.lookup().lookupClass()).a(14103811809087L);

    public void o(Object[] objectArray) {
        long l = (Long)objectArray[0];
        rq rq2 = (rq)objectArray[1];
        l = a ^ l;
        m44.a("q", (Object)this, (long)2959325194962376645L, (long)l).add(rq2);
        lmb lmb2 = this;
        m44.a("s", (Object)lmb2, (int)(m44.a("q", (Object)lmb2, (long)2899690380760510536L, (long)l) + true), (long)2899690380760510536L, (long)l);
    }

    public lmb(long l) {
        l = a ^ l;
        m44.a("r", (Object)this, new ArrayList(), (long)-2231363500442165284L, (long)l);
        m44.a("r", (Object)this, new ArrayList(), (long)-309871579292152127L, (long)l);
        m44.a("r", (Object)this, (int)0, (long)-2295431546173179823L, (long)l);
        m44.a("r", (Object)this, (int)0, (long)-1842324906934151861L, (long)l);
    }

    public void k(Object[] objectArray) {
        rq rq2 = (rq)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        m44.a("q", (Object)this, (long)-4129174233350507584L, (long)l).add((int)m44.a("q", (Object)this, (long)-2634715888423868342L, (long)l));
        m44.a("s", (Object)this, (int)m44.a("q", (Object)this, (long)-2511361856931625648L, (long)l), (long)-2634715888423868342L, (long)l);
        m44.a("p", (Object)rq2, (Object)new Object[0], (long)-4433065827677948468L, (long)l);
    }

    public int C(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (int)(m44.a("u", (Object)this, (long)7086879980497058348L, (long)l) - m44.a("u", (Object)this, (long)7211359916157589302L, (long)l));
    }

    public void j(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        m44.a("v", (Object)this, (long)2593694513813298474L, (long)l).clear();
        m44.a("v", (Object)this, (long)4126740558249626679L, (long)l).clear();
        m44.a("t", (Object)this, (int)0, (long)2509280110645410471L, (long)l);
        m44.a("t", (Object)this, (int)0, (long)2637001201131067325L, (long)l);
    }

    public void T(Object[] objectArray) {
        block6: {
            rq rq2 = (rq)objectArray[0];
            long l = (Long)objectArray[1];
            long l2 = (l = a ^ l) ^ 0x76FC38266546L;
            CallSite callSite = m44.a("m", (long)2622946059103073829L, (long)l);
            block2: while (m44.a("s", (Object)this, (long)2398046406810925362L, (long)l) > m44.a("s", (Object)this, (long)2814135044905833512L, (long)l)) {
                try {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l2;
                    m44.a("r", (Object)this, (Object)objectArray2, (long)4598654944613324046L, (long)l);
                    do {
                        CallSite callSite2 = callSite;
                        if (l >= 0L) {
                            if (callSite2 == false) break block6;
                            callSite2 = callSite;
                        }
                        if (callSite2 != false) continue block2;
                    } while (l < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("m", (Object)((Object)n92), (long)2380936579713647934L, (long)l);
                }
            }
            m44.a("q", (Object)this, (int)((Integer)m44.a("s", (Object)this, (long)4238013536201052066L, (long)l).remove(m44.a("s", (Object)this, (long)4238013536201052066L, (long)l).size() - 1)), (long)2814135044905833512L, (long)l);
        }
    }

    /*
     * Exception decompiling
     */
    public void e(Object[] var1_1) {
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

    public rq t(Object[] objectArray) {
        lmb lmb2;
        block4: {
            long l;
            block5: {
                l = (Long)objectArray[0];
                l = a ^ l;
                CallSite callSite = m44.a("n", (long)-4937247701809538490L, (long)l);
                try {
                    try {
                        lmb2 = this;
                        if (callSite != false) break block4;
                        reference v1 = m44.a("p", (Object)lmb2, (long)-4743168004678916519L, (long)l) - true;
                        m44.a("r", (Object)lmb2, (int)v1, (long)-4743168004678916519L, (long)l);
                        if (v1 >= m44.a("p", (Object)this, (long)-5159256289916253373L, (long)l)) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)-4728293209307850155L, (long)l);
                    }
                    m44.a("r", (Object)this, (int)((Integer)m44.a("p", (Object)this, (long)-6504603520542502711L, (long)l).remove(m44.a("p", (Object)this, (long)-6504603520542502711L, (long)l).size() - 1)), (long)-5159256289916253373L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)-4728293209307850155L, (long)l);
                }
            }
            lmb2 = m44.a("p", (Object)this, (long)-4683595965173792300L, (long)l).remove(m44.a("p", (Object)this, (long)-4683595965173792300L, (long)l).size() - 1);
        }
        return (rq)lmb2;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
