/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.r5;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class ltm
extends l7t
implements r5 {
    ArrayList W;
    private static final long a = prr.a((long)2994937298835527951L, (long)-2278497404520999182L, MethodHandles.lookup().lookupClass()).a(123389054211612L);

    public ltm(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x2C9E225B00B0L;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
        m44.a("p", (Object)((Object)this), new ArrayList(), (long)315963741663639586L, (long)l);
    }

    /*
     * Exception decompiling
     */
    public void M(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[DOLOOP]], but top level block is 0[TRYBLOCK]
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

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        ((ArrayList)((Object)m44.a("q", (Object)((Object)this), (long)-8076710758986796119L, (long)l))).add(string);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
