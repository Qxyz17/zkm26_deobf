/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.zn;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class l7a {
    private List Q;
    private int W = 0;
    private List T = new ArrayList();
    private int I = 0;
    private boolean f;
    private static final long a = prr.a((long)6398639800856286308L, (long)-5315289816304316017L, MethodHandles.lookup().lookupClass()).a(80122822693159L);

    public void C(Object[] objectArray) {
        block6: {
            long l = (Long)objectArray[0];
            zn zn2 = (zn)objectArray[1];
            long l2 = (l = a ^ l) ^ 0x26DAD60EE893L;
            int n = (int)(l2 >>> 32);
            long l3 = l2 << 32 >>> 32;
            CallSite callSite = m44.a("i", (long)-3394224319206963029L, (long)l);
            block2: while (this.I > this.W) {
                try {
                    this.R(n, l3);
                    do {
                        CallSite callSite2 = callSite;
                        if (l > 0L) {
                            if (callSite2 != null) break block6;
                            callSite2 = callSite;
                        }
                        if (callSite2 == null) continue block2;
                    } while (l <= 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("i", (Object)((Object)n92), (long)-3498290933255532315L, (long)l);
                }
            }
            this.W = (Integer)this.Q.remove(this.Q.size() - 1);
        }
    }

    /*
     * Exception decompiling
     */
    public void K(zn var1_1, boolean var2_2, long var3_3) {
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

    public void j(Object[] objectArray) {
        this.T.clear();
        this.Q.clear();
        this.I = 0;
        this.W = 0;
    }

    public int N() {
        return this.I - this.W;
    }

    public void T(zn zn2) {
        this.Q.add(this.W);
        this.W = this.I;
        zn2.n();
    }

    public zn R(int n, long l) {
        l7a l7a2;
        block4: {
            block5: {
                long l2 = ((long)n << 32 | l << 32 >>> 32) ^ a;
                CallSite callSite = m44.a("m", (long)-8090329810576467977L, (long)l2);
                try {
                    try {
                        l7a2 = this;
                        if (callSite != null) break block4;
                        if (--l7a2.I >= this.W) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)((Object)n92), (long)-8057071676721016903L, (long)l2);
                    }
                    this.W = (Integer)this.Q.remove(this.Q.size() - 1);
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)((Object)n93), (long)-8057071676721016903L, (long)l2);
                }
            }
            l7a2 = this.T.remove(this.T.size() - 1);
        }
        return (zn)l7a2;
    }

    public l7a() {
        this.Q = new ArrayList();
    }

    public void U(zn zn2) {
        this.T.add(zn2);
        ++this.I;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
