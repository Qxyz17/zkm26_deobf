/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._g;
import com.zelix.gd;
import com.zelix.h5;
import com.zelix.l60;
import com.zelix.l6q;
import com.zelix.lke;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ol;
import com.zelix.prr;
import com.zelix.zy;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class l6h
extends l60 {
    private char[] B;
    private char[] r;
    private List O;
    private final Map M;
    private char[] Y;
    private final String P;
    private char[] a;
    private static final long c = prr.a((long)9087976740132067177L, (long)-3940108966212333676L, MethodHandles.lookup().lookupClass()).a(242092508816250L);

    private String i(Object[] objectArray) {
        gd gd2 = (gd)objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = c ^ l) ^ 0x4201116A7DCAL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = bl;
        objectArray2[0] = m44.a("s", (Object)((Object)this), (long)-7498046548865341796L, (long)l);
        CallSite callSite = m44.a("r", (Object)gd2, (Object)objectArray2, (long)-8336024081279123297L, (long)l);
        return callSite;
    }

    /*
     * Exception decompiling
     */
    l6h(_g var1_1, boolean var2_2, boolean var3_3, boolean var4_4, String var5_5, zy var6_6, List var7_7, long var8_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [19[CASE]], but top level block is 7[TRYBLOCK]
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

    String o(Object[] objectArray) {
        CallSite callSite;
        Object object;
        CallSite callSite2;
        gd gd2;
        long l;
        long l2;
        h5 h52;
        lke lke2;
        Set set;
        ol ol2;
        l6q l6q2;
        boolean bl;
        String string;
        long l3;
        block26: {
            block23: {
                block25: {
                    CallSite callSite3;
                    block24: {
                        boolean bl2;
                        block22: {
                            gd gd3;
                            l3 = (Long)objectArray[0];
                            string = (String)objectArray[1];
                            bl = (Boolean)objectArray[2];
                            bl2 = (Boolean)objectArray[3];
                            l6q2 = (l6q)objectArray[4];
                            ol2 = (ol)objectArray[5];
                            set = (Set)objectArray[6];
                            lke2 = (lke)objectArray[7];
                            h52 = (h5)objectArray[8];
                            long l4 = l3;
                            l2 = l4 ^ 0x50B9C040C990L;
                            long l5 = l4 ^ 0x2848A13A6397L;
                            l = l4 ^ 0x411D9FBC6B5CL;
                            long l6 = l4 ^ 0x6F5301B9CEE8L;
                            gd2 = (gd)m44.a("p", (Object)((Object)this), (long)8774988108510763579L, (long)l3).get(string);
                            callSite2 = m44.a("n", (long)9220965630511292347L, (long)l3);
                            try {
                                gd3 = gd2;
                                if (callSite2 == null && gd3 == null) {
                                }
                                break block22;
                            }
                            catch (n9 n92) {
                                throw m44.a("n", (Object)((Object)n92), (long)6985478672739260475L, (long)l3);
                            }
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l6;
                            gd2 = new gd((char[])m44.a("p", (Object)((Object)this), (long)7425199508044184130L, (long)l3), (char[])m44.a("p", (Object)((Object)this), (long)7097149084167190785L, (long)l3), l5, (char[])m44.a("p", (Object)((Object)this), (long)7415500265601943784L, (long)l3), (char[])m44.a("p", (Object)((Object)this), (long)7101006163670141013L, (long)l3), (List)((Object)m44.a("p", (Object)((Object)this), (long)9139009606215821619L, (long)l3)), (boolean)m44.a("q", (Object)((Object)this), (Object)objectArray2, (long)7427604695345802763L, (long)l3));
                            gd3 = m44.a("p", (Object)((Object)this), (long)8774988108510763579L, (long)l3).put(string, gd2);
                        }
                        try {
                            try {
                                try {
                                    if (!bl2) break block23;
                                    callSite3 = m44.a("p", (Object)((Object)this), (long)7343901721838179463L, (long)l3);
                                    if (l3 < 0L || callSite2 != null) break block24;
                                }
                                catch (n9 n93) {
                                    throw m44.a("n", (Object)((Object)n93), (long)6985478672739260475L, (long)l3);
                                }
                                if (callSite3 == null) break block25;
                            }
                            catch (n9 n94) {
                                throw m44.a("n", (Object)((Object)n94), (long)6985478672739260475L, (long)l3);
                            }
                            callSite3 = m44.a("p", (Object)((Object)this), (long)7343901721838179463L, (long)l3);
                        }
                        catch (n9 n95) {
                            throw m44.a("n", (Object)((Object)n95), (long)6985478672739260475L, (long)l3);
                        }
                    }
                    try {
                        try {
                            try {
                                object = ((String)((Object)callSite3)).length();
                                if (callSite2 != null) break block26;
                                if (object == 0) break block25;
                            }
                            catch (n9 n96) {
                                throw m44.a("n", (Object)((Object)n96), (long)6985478672739260475L, (long)l3);
                            }
                            object = m44.a("n", (char)((String)((Object)m44.a("p", (Object)((Object)this), (long)7343901721838179463L, (long)l3))).charAt(0), (long)7096950175166898084L, (long)l3);
                            if (callSite2 != null) break block26;
                        }
                        catch (n9 n97) {
                            throw m44.a("n", (Object)((Object)n97), (long)6985478672739260475L, (long)l3);
                        }
                        if (object == 0) break block23;
                    }
                    catch (n9 n98) {
                        throw m44.a("n", (Object)((Object)n98), (long)6985478672739260475L, (long)l3);
                    }
                }
                object = 1;
                break block26;
            }
            object = false;
        }
        boolean bl3 = object;
        block18: while (true) {
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = l2;
            objectArray3[1] = bl3 ? false : bl;
            objectArray3[0] = gd2;
            callSite = m44.a("o", (Object)((Object)this), (Object)objectArray3, (long)8821981743615359349L, (long)l3);
            do {
                Object object2;
                Object object3;
                block28: {
                    object3 = callSite;
                    object2 = bl3;
                    if (callSite2 == null) {
                        block27: {
                            try {
                                try {
                                    if (!object2) break block27;
                                    object2 = m44.a("n", (char)((String)object3).charAt(0), (long)8758527651942926438L, (long)l3);
                                    if (callSite2 != null) break block28;
                                }
                                catch (n9 n99) {
                                    throw m44.a("n", (Object)((Object)n99), (long)6985478672739260475L, (long)l3);
                                }
                                if (object2) break block27;
                            }
                            catch (n9 n910) {
                                throw m44.a("n", (Object)((Object)n910), (long)6985478672739260475L, (long)l3);
                            }
                            StringBuilder stringBuilder = new StringBuilder((String)object3);
                            m44.a("q", (Object)stringBuilder, (int)0, (char)m44.a("n", (char)((String)object3).charAt(0), (long)8762741187813077681L, (long)l3), (long)7355936949392075855L, (long)l3);
                            object3 = stringBuilder.toString();
                        }
                        Object[] objectArray4 = new Object[9];
                        objectArray4[8] = h52;
                        objectArray4[7] = l;
                        objectArray4[6] = lke2;
                        objectArray4[5] = set;
                        objectArray4[4] = ol2;
                        objectArray4[3] = l6q2;
                        objectArray4[2] = bl3;
                        objectArray4[1] = string;
                        objectArray4[0] = object3;
                        object2 = m44.a("q", (Object)((Object)this), (Object)objectArray4, (long)7000761389868823753L, (long)l3);
                    }
                }
                if (!object2) continue block18;
                callSite = object3;
            } while (l3 <= 0L || callSite2 != null);
            break;
        }
        return callSite;
    }

    private static n9 b(n9 n92) {
        return n92;
    }
}
