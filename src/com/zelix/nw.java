/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix.ae;
import com.zelix.bg;
import com.zelix.kz;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.oj;
import com.zelix.prr;
import com.zelix.xt;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class nw {
    private Map R;
    static final String r;
    private final kz G;
    private final _f O;
    static final String z;
    private static final long a;

    static {
        a = prr.a((long)-5814996847202776159L, (long)-8055446803677768900L, MethodHandles.lookup().lookupClass()).a(140989063755523L);
        z = String.valueOf('\u0001');
        r = String.valueOf('\u0002');
    }

    public oj R(Object[] objectArray) {
        bg bg2 = (bg)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return (oj)m44.a("p", (Object)this, (long)7501661451162515377L, (long)l).get(bg2);
    }

    /*
     * Exception decompiling
     */
    public static List f(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [41[UNCONDITIONALDOLOOP], 42[DOLOOP], 40[DOLOOP]], but top level block is 17[TRYBLOCK]
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

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void c(Object[] var1_1) {
        block16: {
            block13: {
                var2_2 = (Long)var1_1[0];
                v0 = var2_2 = nw.a ^ var2_2;
                var4_3 = v0 ^ 22599254131270L;
                var6_4 = v0 ^ 117990735346541L;
                var8_5 = v0 ^ 83451894778239L;
                v1 = v0 ^ 4874177030158L;
                var10_6 = (int)(v1 >>> 32);
                var11_7 = (int)(v1 << 32 >>> 56);
                var12_8 = (int)(v1 << 40 >>> 40);
                var13_9 = v0 ^ 72198982257928L;
                var15_10 = v0 ^ 10848355383833L;
                var18_11 = false;
                var17_12 = m44.a("h", (long)-3460494427458069730L, (long)var2_2);
                for (Map.Entry<K, V> var20_14 : m44.a("v", (Object)this, (long)-3335688929095397857L, (long)var2_2).entrySet()) {
                    block15: {
                        block14: {
                            var21_15 = (oj)var20_14.getValue();
                            v2 = new Object[1];
                            v2[0] = var4_3;
                            var22_16 = m44.a("w", (Object)var21_15, (Object)v2, (long)-3012666931737199409L, (long)var2_2);
                            v3 = new Object[1];
                            v3[0] = var13_9;
                            v4 = new Object[2];
                            v4[1] = m44.a("w", (Object)var21_15, (Object)v3, (long)-3985919767822059968L, (long)var2_2);
                            v4[0] = var6_4;
                            m44.a("w", (Object)var22_16, (Object)v4, (long)-3552082377225765433L, (long)var2_2);
                            v5 = new Object[1];
                            v5[0] = var15_10;
                            var23_17 = m44.a("w", (Object)var21_15, (Object)v5, (long)-3464708128794013879L, (long)var2_2);
                            try {
                                try {
                                    v6 = ((CallSite)var23_17).length;
                                    v7 = var17_12;
                                    if (var2_2 >= 0L) {
                                        if (v7 != false) break block13;
                                        if (var17_12 != false) break block14;
                                    }
                                    ** GOTO lbl67
                                }
                                catch (n9 v8) {
                                    throw m44.a("h", (Object)v8, (long)-4030498308286837493L, (long)var2_2);
                                }
                                if (v6 <= 0) break block15;
                            }
                            catch (n9 v9) {
                                throw m44.a("h", (Object)v9, (long)-4030498308286837493L, (long)var2_2);
                            }
                            v10 = true;
                        }
                        var18_11 = v10;
                        v11 = new Object[1];
                        v11[0] = var8_5;
                        var24_18 = m44.a("w", (Object)var21_15, (Object)v11, (long)-2985337410509756470L, (long)var2_2);
                        m44.a("w", (Object)var24_18, (Object)new Object[]{0}, (long)-4012426577032401286L, (long)var2_2);
                    }
                    if (var17_12 == false) continue;
                }
                if (var2_2 <= 0L) break block16;
                v6 = var18_11;
            }
            try {
                try {
                    v7 = var17_12;
lbl67:
                    // 2 sources

                    if (v7 != false || v6 == false) break block16;
                }
                catch (n9 v12) {
                    throw m44.a("h", (Object)v12, (long)-4030498308286837493L, (long)var2_2);
                }
                v6 = m44.a("w", (Object)m44.a("v", (Object)this, (long)-3937703295216159598L, (long)var2_2), (int)var10_6, (byte)((byte)var11_7), (int)var12_8, (long)-2914259401129764130L, (long)var2_2);
            }
            catch (n9 v13) {
                throw m44.a("h", (Object)v13, (long)-4030498308286837493L, (long)var2_2);
            }
        }
    }

    public void V(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x656D72802213L;
        long l4 = l2 ^ 0x551CA7E5C93AL;
        long l5 = l2 ^ 0x6A6E0B800FACL;
        long l6 = l2 ^ 0xF295F0506DL;
        long l7 = l2 ^ 0x4019E119DB97L;
        int n = (int)(l7 >>> 48);
        int n2 = (int)(l7 << 16 >>> 32);
        int n3 = (int)(l7 << 48 >>> 48);
        long l8 = l2 ^ 0x25CB0DFD9B93L;
        Iterator iterator = m44.a("t", (Object)this, (long)3476616739829264277L, (long)l).entrySet().iterator();
        CallSite callSite = m44.a("j", (long)3347290191382936212L, (long)l);
        block2: while (true) {
            Object object = iterator.hasNext();
            block3: while (object) {
                Map.Entry entry = iterator.next();
                oj oj2 = (oj)entry.getValue();
                StringBuilder stringBuilder = new StringBuilder();
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l4;
                CallSite callSite2 = m44.a("u", (Object)oj2, (Object)objectArray2, (long)3704704445320874123L, (long)l);
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l8;
                CallSite callSite3 = m44.a("u", (Object)oj2, (Object)objectArray3, (long)3341897726059146947L, (long)l);
                int n4 = 0;
                int n5 = 0;
                block4: while (true) {
                    int n6 = n5;
                    Object object2 = callSite2.size();
                    while (n6 < object2) {
                        CallSite callSite4;
                        block10: {
                            xt xt2;
                            String string;
                            block11: {
                                boolean bl;
                                block8: {
                                    block9: {
                                        string = (String)callSite2.get(n5);
                                        stringBuilder.append((String)((Object)m44.a("n", (long)3750032009556848212L, (long)l)));
                                        object = string.equals(m44.a("n", (long)3750032009556848212L, (long)l));
                                        if (callSite != false) continue block3;
                                        try {
                                            object2 = callSite;
                                            if (l <= 0L) continue;
                                            if (object2 != 0) break block8;
                                            if (!object) break block9;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("j", (Object)((Object)n92), (long)2997962705973013633L, (long)l);
                                        }
                                        if (l > 0L) break block10;
                                    }
                                    bl = string.equals(m44.a("n", (long)4007112601227906268L, (long)l));
                                }
                                if (!bl) break block11;
                                xt2 = (xt)callSite3[n4];
                                ae ae2 = new ae(l6, n5, (String)((Object)m44.a("u", (Object)xt2, (char)((char)n), (int)n2, (short)((short)n3), (long)2945900474917674935L, (long)l)), xt2);
                                Object[] objectArray4 = new Object[2];
                                objectArray4[1] = l5;
                                objectArray4[0] = ae2;
                                m44.a("u", (Object)oj2, (Object)objectArray4, (long)3201543048230288257L, (long)l);
                                ++n4;
                                callSite4 = callSite;
                                if (l < 0L) continue block4;
                                if (callSite4 == false) break block10;
                            }
                            xt2 = new ae(n5, string);
                            Object[] objectArray5 = new Object[2];
                            objectArray5[1] = l5;
                            objectArray5[0] = xt2;
                            m44.a("u", (Object)oj2, (Object)objectArray5, (long)3201543048230288257L, (long)l);
                        }
                        ++n5;
                        callSite4 = callSite;
                        if (callSite4 == false) continue block4;
                    }
                    break;
                }
                Object[] objectArray6 = new Object[2];
                objectArray6[1] = stringBuilder.toString();
                objectArray6[0] = l3;
                m44.a("u", (Object)oj2, (Object)objectArray6, (long)2964411880269376079L, (long)l);
                object = callSite;
                if (l <= 0L) continue;
                if (!object) continue block2;
            }
            break;
        }
    }

    public boolean y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (boolean)m44.a("t", (Object)m44.a("u", (Object)this, (long)-9084212327345447356L, (long)l), (long)-7410910486748643994L, (long)l);
    }

    public void T(Object[] objectArray) {
        bg bg2 = (bg)objectArray[0];
        long l = (Long)objectArray[1];
        List list = (List)objectArray[2];
        int n = (Integer)objectArray[3];
        long l2 = (l = a ^ l) ^ 0x4EDC120CBA4FL;
        m44.a("w", (Object)this, (long)-516722720330881154L, (long)l).put(bg2, new oj(bg2, l2, list, n));
    }

    public boolean W(Object[] objectArray) {
        long l = (Long)objectArray[0];
        bg bg2 = (bg)objectArray[1];
        l = a ^ l;
        return m44.a("w", (Object)this, (long)-3115229946469364882L, (long)l).containsKey(bg2);
    }

    public nw(_f _f2, char c, char c2, kz kz2, int n) {
        long l = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ a;
        long l2 = l ^ 0x74E94062365DL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        m44.a("t", (Object)this, (Map)((Object)m44.a("h", (Object)objectArray, (long)-3298340224633882917L, (long)l)), (long)-4029272297296832577L, (long)l);
        this.O = _f2;
        this.G = kz2;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
