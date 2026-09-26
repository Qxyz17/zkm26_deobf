/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class vc {
    private boolean w;
    private int l;
    private List r;
    private List T;
    private int g;
    private static final long a = prr.a((long)8655204674830723638L, (long)4523032847004178889L, MethodHandles.lookup().lookupClass()).a(35717165058403L);

    public vc(long l) {
        l = a ^ l;
        m44.a("t", (Object)this, new ArrayList(), (long)6188378026195277499L, (long)l);
        m44.a("t", (Object)this, new ArrayList(), (long)5476122758244195743L, (long)l);
        m44.a("t", (Object)this, (int)0, (long)5910996211897524496L, (long)l);
        m44.a("t", (Object)this, (int)0, (long)6061686647146133776L, (long)l);
    }

    public void T(Object[] objectArray) {
        long l = (Long)objectArray[0];
        fu fu2 = (fu)objectArray[1];
        l = a ^ l;
        m44.a("s", (Object)this, (long)-3640568960698262758L, (long)l).add((int)m44.a("s", (Object)this, (long)-3271180611556458603L, (long)l));
        m44.a("q", (Object)this, (int)m44.a("s", (Object)this, (long)-3130825482530756715L, (long)l), (long)-3271180611556458603L, (long)l);
        m44.a("r", (Object)fu2, (Object)new Object[0], (long)-3675083133532973516L, (long)l);
    }

    public int T(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (int)(m44.a("q", (Object)this, (long)-1569676569452455633L, (long)l) - m44.a("q", (Object)this, (long)-1432110437569986257L, (long)l));
    }

    public void K(Object[] objectArray) {
        block6: {
            fu fu2 = (fu)objectArray[0];
            long l = (Long)objectArray[1];
            long l2 = (l = a ^ l) ^ 0x733E75350422L;
            CallSite callSite = m44.a("h", (long)5911850963523439625L, (long)l);
            block2: while (m44.a("v", (Object)this, (long)5706162951942765608L, (long)l) > m44.a("v", (Object)this, (long)5271217794468389928L, (long)l)) {
                try {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l2;
                    m44.a("w", (Object)this, (Object)objectArray2, (long)5297848799580425345L, (long)l);
                    do {
                        CallSite callSite2 = callSite;
                        if (l >= 0L) {
                            if (callSite2 != null) break block6;
                            callSite2 = callSite;
                        }
                        if (callSite2 == null) continue block2;
                    } while (l < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)5697649344831042408L, (long)l);
                }
            }
            m44.a("t", (Object)this, (int)((Integer)m44.a("v", (Object)this, (long)6253063256274747559L, (long)l).remove(m44.a("v", (Object)this, (long)6253063256274747559L, (long)l).size() - 1)), (long)5271217794468389928L, (long)l);
        }
    }

    public fu n(Object[] objectArray) {
        vc vc2;
        block4: {
            long l;
            block5: {
                l = (Long)objectArray[0];
                l = a ^ l;
                CallSite callSite = m44.a("j", (long)-2084820746330948333L, (long)l);
                try {
                    try {
                        vc2 = this;
                        if (callSite != null) break block4;
                        reference v1 = m44.a("t", (Object)vc2, (long)-132157679781851854L, (long)l) - true;
                        m44.a("v", (Object)vc2, (int)v1, (long)-132157679781851854L, (long)l);
                        if (v1 >= m44.a("t", (Object)this, (long)-559282990567910094L, (long)l)) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)-141799243023285646L, (long)l);
                    }
                    m44.a("v", (Object)this, (int)((Integer)m44.a("t", (Object)this, (long)-1739110372951690819L, (long)l).remove(m44.a("t", (Object)this, (long)-1739110372951690819L, (long)l).size() - 1)), (long)-559282990567910094L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)-141799243023285646L, (long)l);
                }
            }
            vc2 = m44.a("t", (Object)this, (long)-449267108314580327L, (long)l).remove(m44.a("t", (Object)this, (long)-449267108314580327L, (long)l).size() - 1);
        }
        return (fu)vc2;
    }

    public void B(Object[] objectArray) {
        fu fu2 = (fu)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        m44.a("u", (Object)this, (long)1363094912550605232L, (long)l).add(fu2);
        vc vc2 = this;
        m44.a("w", (Object)vc2, (int)(m44.a("u", (Object)vc2, (long)1514112321958422043L, (long)l) + true), (long)1514112321958422043L, (long)l);
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
