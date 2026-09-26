/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.c;
import com.zelix.js;
import com.zelix.m;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.to;
import com.zelix.us;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;

public abstract class x7
extends js
implements c,
m {
    List B;

    public final void F(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x791D211D4B68L;
        m44.a("p", (Object)((Object)this), (long)-2184408470352194324L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("p", (Object)((Object)this), (Object)objectArray2, (long)-389139401457408305L, (long)l);
    }

    public void Z(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x5BB79E261300L;
        m44.a("p", (Object)((Object)this), (long)l2, null, null, null, (long)-6187384355785420129L, (long)l);
    }

    /*
     * Exception decompiling
     */
    public void T(long var1_1, Object var3_2, Object var4_3, Object var5_4) {
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

    public x7(int n, to to2) {
        super(n, to2);
    }

    public synchronized void I() {
    }

    public synchronized void Y(Object[] objectArray) {
        block2: {
            CallSite callSite;
            long l;
            us us2;
            block3: {
                block4: {
                    us2 = (us)objectArray[0];
                    l = (Long)objectArray[1];
                    CallSite callSite2 = m44.a("k", (long)-2567178363381368133L, (long)l);
                    try {
                        if (l < 0L) break block2;
                        callSite = m44.a("u", (Object)((Object)this), (long)-2553718038993817113L, (long)l);
                        if (callSite2 != false) break block3;
                        if (callSite != null) break block4;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)((Object)n92), (long)-2400594191611360467L, (long)l);
                    }
                    return;
                }
                callSite = m44.a("u", (Object)((Object)this), (long)-2553718038993817113L, (long)l);
            }
            m44.a("t", (Object)callSite, (Object)us2, (long)-4289448557524953229L, (long)l);
        }
    }

    public final synchronized void y(Object[] objectArray) {
        block10: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            us us2;
            block8: {
                block9: {
                    us2 = (us)objectArray[0];
                    l = (Long)objectArray[1];
                    callSite2 = m44.a("j", (long)4856756773914158466L, (long)l);
                    try {
                        try {
                            callSite = m44.a("t", (Object)((Object)this), (long)4879219830859869918L, (long)l);
                            if (l < 0L || callSite2 != false) break block8;
                            if (callSite != null) break block9;
                        }
                        catch (n9 n92) {
                            throw m44.a("j", (Object)((Object)n92), (long)4726041969960555540L, (long)l);
                        }
                        m44.a("v", (Object)((Object)this), new ArrayList(2), (long)4879219830859869918L, (long)l);
                    }
                    catch (n9 n93) {
                        throw m44.a("j", (Object)((Object)n93), (long)4726041969960555540L, (long)l);
                    }
                }
                callSite = m44.a("t", (Object)((Object)this), (long)4879219830859869918L, (long)l);
            }
            try {
                boolean bl;
                try {
                    bl = callSite.contains(us2);
                    if (callSite2 != false || bl) break block10;
                }
                catch (n9 n94) {
                    throw m44.a("j", (Object)((Object)n94), (long)4726041969960555540L, (long)l);
                }
                bl = m44.a("t", (Object)((Object)this), (long)4879219830859869918L, (long)l).add(us2);
            }
            catch (n9 n95) {
                throw m44.a("j", (Object)((Object)n95), (long)4726041969960555540L, (long)l);
            }
        }
    }

    public final void A(Object[] objectArray) {
        us us2 = (us)objectArray[0];
        long l = (Long)objectArray[1];
        Object object = objectArray[2];
        Object object2 = objectArray[3];
        Object object3 = objectArray[4];
        long l2 = l ^ 0x71A21AA1F8D7L;
        us2.x((m)this, object, object2, object3, l2);
    }

    public final void u(Object[] objectArray) {
        long l = (Long)objectArray[0];
        us us2 = (us)objectArray[1];
        long l2 = l ^ 0x68943DF24D52L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = null;
        objectArray2[3] = null;
        objectArray2[2] = null;
        objectArray2[1] = l2;
        objectArray2[0] = us2;
        m44.a("v", (Object)((Object)this), (Object)objectArray2, (long)-7727334488220693083L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
