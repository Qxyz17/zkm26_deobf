/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.a2;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class cc {
    private final Map G;
    private static final long a = prr.a((long)3394938785968901881L, (long)-8460715524614439810L, MethodHandles.lookup().lookupClass()).a(185174823761847L);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Set X(Object[] objectArray) {
        CallSite callSite;
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x5CBFB7F65AB1L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        CallSite callSite2 = m44.a("n", (Object)objectArray2, (long)-678469776532926698L, (long)l);
        Iterator iterator = m44.a("p", (Object)this, (long)-945568729993743460L, (long)l).entrySet().iterator();
        CallSite callSite3 = m44.a("n", (long)-1637003572798818434L, (long)l);
        block2: while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            try {
                do {
                    callSite = callSite2;
                    CallSite callSite4 = callSite3;
                    if (l > 0L) {
                        if (callSite4 != null) return callSite;
                        callSite4 = entry.getValue();
                    }
                    callSite.add(callSite4);
                    if (callSite3 == null) continue block2;
                } while (l < 0L);
                break;
            }
            catch (n9 n92) {
                throw m44.a("n", (Object)((Object)n92), (long)-1414827933832728023L, (long)l);
            }
        }
        callSite = callSite2;
        return callSite;
    }

    public Set D(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("m", m44.a("s", (Object)this, (long)6058405669464823151L, (long)l).entrySet(), (long)5367852564691949650L, (long)l);
    }

    public boolean Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        l = a ^ l;
        return m44.a("t", (Object)this, (long)980937801997192416L, (long)l).containsKey(object);
    }

    public a2 s(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        l = a ^ l;
        return (a2)m44.a("u", (Object)this, (long)-6963228438593397215L, (long)l).get(object);
    }

    public cc(char c, short s, int n) {
        long l = ((long)c << 48 | (long)s << 48 >>> 16 | (long)n << 32 >>> 32) ^ a;
        long l2 = l ^ 0x51B36B29B25DL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        this.G = m44.a("h", (Object)objectArray, (long)6213230603833914075L, (long)l);
    }

    public Set b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("m", m44.a("s", (Object)this, (long)8353044723700396695L, (long)l).keySet(), (long)7892082564877729706L, (long)l);
    }

    /*
     * Exception decompiling
     */
    public void d(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [25[DOLOOP]], but top level block is 26[SIMPLE_IF_TAKEN]
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

    private static n9 a(n9 n92) {
        return n92;
    }
}
