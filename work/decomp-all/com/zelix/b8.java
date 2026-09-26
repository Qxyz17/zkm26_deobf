/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.f8;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.js;
import com.zelix.kw;
import com.zelix.l6q;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ni;
import com.zelix.prr;
import com.zelix.x8;
import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Map;

public class b8
extends kw
implements ni {
    private boolean O;
    private byte[] n;
    static final Object K;
    private boolean h;
    private ArrayList V;
    private int[] D;
    private static final long a;

    void z(gu gu2, long l) {
        long l2 = l ^ 0x66FDF08525FDL;
        gu2.K((js)this.b, (Object)this, l2, (Object)this.H());
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void N(Object[] var1_1) {
        block24: {
            block23: {
                var2_2 = (DataOutputStream)var1_1[0];
                var5_3 = (Map)var1_1[1];
                var3_4 = (Long)var1_1[2];
                var6_5 = (lqu)var1_1[3];
                var7_6 = var3_4 ^ 0L;
                v0 = m44.a("k", (long)1680553024964027930L, (long)var3_4);
                v1 = new Object[4];
                v1[3] = var6_5;
                v1[2] = var7_6;
                v1[1] = var5_3;
                v1[0] = var2_2;
                super.N(v1);
                var9_7 = v0;
                try {
                    v2 = m44.a("u", (Object)this, (long)1675443253592996547L, (long)var3_4);
                    if (var9_7 == false) break block23;
                    if (v2 != false) {
                    }
                    ** GOTO lbl89
                }
                catch (n9 v3) {
                    throw m44.a("k", (Object)v3, (long)706185305916319301L, (long)var3_4);
                }
                v2 = var10_8 = (reference)false;
            }
            while (var10_8 < m44.a("u", (Object)this, (long)1490837550412077939L, (long)var3_4).size()) {
                block27: {
                    block28: {
                        block29: {
                            block25: {
                                var11_9 = m44.a("u", (Object)this, (long)1490837550412077939L, (long)var3_4).get((int)var10_8);
                                try {
                                    block26: {
                                        try {
                                            try {
                                                try {
                                                    if (var9_7 == false) break block24;
                                                    v4 = var11_9;
                                                    if (var9_7 == false) break block25;
                                                }
                                                catch (n9 v5) {
                                                    throw m44.a("k", (Object)v5, (long)706185305916319301L, (long)var3_4);
                                                }
                                                if (var3_4 < 0L) break block25;
                                                if (v4 != null) break block26;
                                            }
                                            catch (n9 v6) {
                                                throw m44.a("k", (Object)v6, (long)706185305916319301L, (long)var3_4);
                                            }
                                            var2_2.writeShort((int)m44.a("u", (Object)this, (long)1636680194945561113L, (long)var3_4)[var10_8]);
                                            v7 = var9_7;
                                            if (var3_4 <= 0L) break block27;
                                            if (v7 != false) break block28;
                                        }
                                        catch (n9 v8) {
                                            throw m44.a("k", (Object)v8, (long)706185305916319301L, (long)var3_4);
                                        }
                                    }
                                    v4 = var11_9;
                                }
                                catch (n9 v9) {
                                    throw m44.a("k", (Object)v9, (long)706185305916319301L, (long)var3_4);
                                }
                            }
                            var12_10 = (js)v4;
                            var13_11 = (js)var5_3.get(var12_10);
                            try {
                                try {
                                    v7 = var9_7;
                                    if (var3_4 < 0L) ** GOTO lbl76
                                    if (v7 == false) break block29;
                                    if (var13_11 != null) {
                                    }
                                    ** GOTO lbl78
                                }
                                catch (n9 v10) {
                                    throw m44.a("k", (Object)v10, (long)706185305916319301L, (long)var3_4);
                                }
                                var2_2.writeShort(var13_11.E());
                            }
                            catch (n9 v11) {
                                throw m44.a("k", (Object)v11, (long)706185305916319301L, (long)var3_4);
                            }
                        }
                        try {
                            v7 = var9_7;
lbl76:
                            // 2 sources

                            if (var3_4 <= 0L) break block27;
                            if (v7 != false) break block28;
lbl78:
                            // 2 sources

                            var2_2.writeShort(var12_10.E());
                        }
                        catch (n9 v12) {
                            throw m44.a("k", (Object)v12, (long)706185305916319301L, (long)var3_4);
                        }
                    }
                    ++var10_8;
                    v7 = var9_7;
                }
                if (v7 != false) continue;
            }
            try {
                if (var3_4 < 0L || var3_4 <= 0L || var9_7 != false) break block24;
lbl89:
                // 2 sources

                var2_2.write((byte[])m44.a("u", (Object)this, (long)1681068333981619312L, (long)var3_4));
            }
            catch (n9 v13) {
                throw m44.a("k", (Object)v13, (long)706185305916319301L, (long)var3_4);
            }
        }
    }

    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        l = a ^ l;
        m44.a("v", (Object)((Object)this), (boolean)bl, (long)-5088115116263769295L, (long)l);
    }

    static {
        a = prr.a((long)-8397652506995898283L, (long)-2382183005233109086L, MethodHandles.lookup().lookupClass()).a(232791362712818L);
        K = new Object();
    }

    public boolean o(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        int n3 = (Integer)objectArray[2];
        long l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ a;
        return (boolean)m44.a("u", (Object)((Object)this), (long)-8326535356980769248L, (long)l);
    }

    public void a(Object[] objectArray) {
        block5: {
            b8 b82;
            long l;
            block4: {
                l = (Long)objectArray[0];
                boolean bl = (Boolean)objectArray[1];
                l = a ^ l;
                CallSite callSite = m44.a("i", (long)801823043247438440L, (long)l);
                m44.a("u", (Object)((Object)this), (boolean)bl, (long)806844851557508785L, (long)l);
                CallSite callSite2 = callSite;
                try {
                    try {
                        b82 = this;
                        if (callSite2 == false) break block4;
                        if (m44.a("w", (Object)((Object)b82), (long)806844851557508785L, (long)l) != false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)((Object)n92), (long)1566966893652359735L, (long)l);
                    }
                    m44.a("u", (Object)((Object)this), null, (long)775890351753375339L, (long)l);
                    m44.a("u", (Object)((Object)this), null, (long)631250547574048513L, (long)l);
                    b82 = this;
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)((Object)n93), (long)1566966893652359735L, (long)l);
                }
            }
            m44.a("u", (Object)((Object)b82), (boolean)false, (long)1292607502844941218L, (long)l);
        }
    }

    /*
     * Exception decompiling
     */
    public void q(x8 var1_1, long var2_2, x8 var4_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [13[DOLOOP]], but top level block is 5[TRYBLOCK]
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    b8(long l, _4 _42, int n, String string, h1 h12, l6q l6q2, f8 f82) {
        block16: {
            b8 b82;
            CallSite callSite;
            long l2;
            long l3;
            long l4;
            long l5;
            block15: {
                long l6 = l = a ^ l;
                l5 = l6 ^ 0x7EDAB2824A33L;
                long l7 = l6 ^ 0x77C4C8139140L;
                l4 = l6 ^ 0x3B3D8050FDC4L;
                l3 = l6 ^ 0x36A3965EC584L;
                l2 = l6 ^ 0x5B6B2A129883L;
                super(_42, n, string, l7, h12, l6q2);
                CallSite callSite2 = m44.a("l", (long)-678454916243159075L, (long)l);
                m44.a("p", (Object)((Object)this), (byte[])new byte[this.W], (long)-679066673081993801L, (long)l);
                callSite = callSite2;
                try {
                    try {
                        h12.read((byte[])m44.a("r", (Object)((Object)this), (long)-679066673081993801L, (long)l));
                        b82 = this;
                        if (callSite == false) break block15;
                        if (((CallSite)m44.a("r", (Object)((Object)b82), (long)-679066673081993801L, (long)l)).length % 2 != 0) break block16;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)((Object)n92), (long)-1726007855611656318L, (long)l);
                    }
                    b82 = _42;
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)((Object)n93), (long)-1726007855611656318L, (long)l);
                }
            }
            String string2 = ((Object)((Object)b82)).getClass().getName();
            m44.a("p", (Object)((Object)this), (boolean)true, (long)-682440442746643708L, (long)l);
            m44.a("p", (Object)((Object)this), (boolean)true, (long)-1421656738429784553L, (long)l);
            int n2 = ((CallSite)m44.a("r", (Object)((Object)this), (long)-679066673081993801L, (long)l)).length / 2;
            m44.a("p", (Object)((Object)this), (int[])new int[n2], (long)-616565179473177634L, (long)l);
            m44.a("p", (Object)((Object)this), new ArrayList(n2), (long)-758955419637515596L, (long)l);
            int n3 = 0;
            int n4 = 0;
            while (n4 < n2) {
                CallSite callSite3;
                block19: {
                    block20: {
                        block17: {
                            CallSite callSite4;
                            int n5 = n3++;
                            int n6 = n3++;
                            Object[] objectArray = new Object[3];
                            objectArray[2] = (int)m44.a("r", (Object)((Object)this), (long)-679066673081993801L, (long)l)[n6];
                            objectArray[1] = (int)m44.a("r", (Object)((Object)this), (long)-679066673081993801L, (long)l)[n5];
                            objectArray[0] = l3;
                            m44.a("r", (Object)((Object)this), (long)-616565179473177634L, (long)l)[n4] = callSite4 = m44.a("l", (Object)objectArray, (long)-1676480559672582342L, (long)l);
                            js js2 = _42.m(l4, (int)callSite4);
                            try {
                                boolean bl;
                                block18: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (callSite == false) break block17;
                                                    if (js2 == null) break block18;
                                                }
                                                catch (n9 n94) {
                                                    throw m44.a("l", (Object)((Object)n94), (long)-1726007855611656318L, (long)l);
                                                }
                                                if (l <= 0L) break block17;
                                                bl = js2 instanceof x8;
                                                if (callSite == false) break block17;
                                            }
                                            catch (n9 n95) {
                                                throw m44.a("l", (Object)((Object)n95), (long)-1726007855611656318L, (long)l);
                                            }
                                            if (l <= 0L) break block17;
                                            if (!bl) break block18;
                                        }
                                        catch (n9 n96) {
                                            throw m44.a("l", (Object)((Object)n96), (long)-1726007855611656318L, (long)l);
                                        }
                                        ((ArrayList)((Object)m44.a("r", (Object)((Object)this), (long)-758955419637515596L, (long)l))).add(js2);
                                        Object[] objectArray2 = new Object[5];
                                        objectArray2[4] = js2;
                                        objectArray2[3] = this;
                                        objectArray2[2] = m44.a("s", (Object)((Object)this), (Object)new Object[0], (long)-1525874229053309636L, (long)l);
                                        objectArray2[1] = l5;
                                        objectArray2[0] = string2;
                                        m44.a("s", (Object)f82, (Object)objectArray2, (long)-1083951910994594302L, (long)l);
                                        l6q2.t((Object)((x8)js2), (Object)this, l2);
                                        callSite3 = callSite;
                                        if (l <= 0L) break block19;
                                        if (callSite3 != false) break block20;
                                    }
                                    catch (n9 n97) {
                                        throw m44.a("l", (Object)((Object)n97), (long)-1726007855611656318L, (long)l);
                                    }
                                }
                                bl = ((ArrayList)((Object)m44.a("r", (Object)((Object)this), (long)-758955419637515596L, (long)l))).add(null);
                            }
                            catch (n9 n98) {
                                throw m44.a("l", (Object)((Object)n98), (long)-1726007855611656318L, (long)l);
                            }
                        }
                        Object[] objectArray = new Object[5];
                        objectArray[4] = m44.a("h", (long)-1022263181172845723L, (long)l);
                        objectArray[3] = this;
                        objectArray[2] = m44.a("s", (Object)((Object)this), (Object)new Object[0], (long)-1525874229053309636L, (long)l);
                        objectArray[1] = l5;
                        objectArray[0] = string2;
                        m44.a("s", (Object)f82, (Object)objectArray, (long)-1083951910994594302L, (long)l);
                    }
                    ++n4;
                    callSite3 = callSite;
                }
                if (callSite3 != false) continue;
            }
        }
    }

    public void w(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        l = a ^ l;
        m44.a("p", (Object)m44.a("q", (Object)((Object)this), (long)-1644743514260969745L, (long)l), (int)n, null, (long)-1626916084402700724L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void c(Object[] var1_1) {
        block16: {
            block15: {
                var3_2 = (Long)var1_1[0];
                var2_3 = (DataOutputStream)var1_1[1];
                var5_4 = var3_2 ^ 0L;
                v0 = m44.a("i", (long)716282175763740856L, (long)var3_2);
                v1 = new Object[2];
                v1[1] = var2_3;
                v1[0] = var5_4;
                super.c(v1);
                var7_5 = v0;
                try {
                    v2 = m44.a("w", (Object)this, (long)712243881426232417L, (long)var3_2);
                    if (var7_5 == false) break block15;
                    if (v2 != false) {
                    }
                    ** GOTO lbl62
                }
                catch (n9 v3) {
                    throw m44.a("i", (Object)v3, (long)1688540902510377191L, (long)var3_2);
                }
                v2 = var8_6 = (reference)false;
            }
            while (var8_6 < m44.a("w", (Object)this, (long)725849267004442065L, (long)var3_2).size()) {
                block19: {
                    block20: {
                        block17: {
                            var9_7 = m44.a("w", (Object)this, (long)725849267004442065L, (long)var3_2).get((int)var8_6);
                            try {
                                block18: {
                                    try {
                                        try {
                                            try {
                                                if (var7_5 == false) break block16;
                                                v4 = var9_7;
                                                if (var7_5 == false) break block17;
                                            }
                                            catch (n9 v5) {
                                                throw m44.a("i", (Object)v5, (long)1688540902510377191L, (long)var3_2);
                                            }
                                            if (var3_2 < 0L) break block17;
                                            if (v4 != null) break block18;
                                        }
                                        catch (n9 v6) {
                                            throw m44.a("i", (Object)v6, (long)1688540902510377191L, (long)var3_2);
                                        }
                                        var2_3.writeShort((int)m44.a("w", (Object)this, (long)582265337333066939L, (long)var3_2)[var8_6]);
                                        v7 = var7_5;
                                        if (var3_2 < 0L) break block19;
                                        if (v7 != false) break block20;
                                    }
                                    catch (n9 v8) {
                                        throw m44.a("i", (Object)v8, (long)1688540902510377191L, (long)var3_2);
                                    }
                                }
                                v4 = var9_7;
                            }
                            catch (n9 v9) {
                                throw m44.a("i", (Object)v9, (long)1688540902510377191L, (long)var3_2);
                            }
                        }
                        var10_8 = (js)v4;
                        var2_3.writeShort(var10_8.E());
                    }
                    ++var8_6;
                    v7 = var7_5;
                }
                if (v7 != false) continue;
            }
            try {
                if (var3_2 <= 0L || var3_2 < 0L || var7_5 != false) break block16;
lbl62:
                // 2 sources

                var2_3.write((byte[])m44.a("w", (Object)this, (long)717869442046282450L, (long)var3_2));
            }
            catch (n9 v10) {
                throw m44.a("i", (Object)v10, (long)1688540902510377191L, (long)var3_2);
            }
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
