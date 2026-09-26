/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.js;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.to;
import com.zelix.yf;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class tb
extends to {
    private final Map R;
    private static final long a = prr.a((long)-6609082698503242657L, (long)4548716214005525008L, MethodHandles.lookup().lookupClass()).a(4750084937000L);

    /*
     * Exception decompiling
     */
    public void k(Object[] var1_1) {
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
        HashMap hashMap = (HashMap)objectArray[0];
        long l = (Long)objectArray[1];
    }

    boolean K(Object[] objectArray) {
        return true;
    }

    public void V(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
    }

    public void j(Object[] objectArray) {
        long l = (Long)objectArray[0];
        HashMap hashMap = (HashMap)objectArray[1];
        yf yf2 = (yf)objectArray[2];
    }

    public Map V(Object[] objectArray) {
        return this.R;
    }

    public tb(to to2, js[] jsArray, Map map, long l) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x774B7BFE49DAL;
        long l4 = l2 ^ 0xAC93FFD8D8CL;
        super(l4, to2.A);
        this.E = jsArray;
        this.R = map;
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        m44.a("s", (Object)((Object)this), (Object)objectArray, (long)3092538875467927192L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
