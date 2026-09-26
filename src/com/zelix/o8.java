/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.e;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.nc;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class o8
implements Comparable {
    private List O;
    private nc v;
    private Set Z;
    private nc Y;
    private nc m;
    private static final long a = prr.a((long)-7205648683329178339L, (long)1239722737385216965L, MethodHandles.lookup().lookupClass()).a(240308305413385L);

    /*
     * Unable to fully structure code
     */
    private void C(nc var1_1, char var2_2, short var3_3, BitSet var4_4, int var5_5, Set var6_6, List var7_7) {
        block24: {
            block26: {
                block25: {
                    block22: {
                        block21: {
                            v0 = var8_8 = ((long)var2_2 << 48 | (long)var3_3 << 48 >>> 16 | (long)var5_5 << 32 >>> 32) ^ o8.a;
                            v1 = v0 ^ 42094467992089L;
                            var10_9 = (int)(v1 >>> 48);
                            var11_10 = (int)(v1 << 16 >>> 48);
                            var12_11 = (int)(v1 << 32 >>> 32);
                            var13_12 = v0 ^ 119397381241025L;
                            var18_13 = m44.a("n", (long)1505499019110309940L, (long)var8_8);
                            try {
                                try {
                                    if (var18_13 != null) break block21;
                                    if (var6_6.add(var1_1)) {
                                    }
                                    ** GOTO lbl79
                                }
                                catch (n9 v2) {
                                    throw m44.a("n", (Object)v2, (long)1465573248333927390L, (long)var8_8);
                                }
                                var4_4.set(var1_1.v());
                            }
                            catch (n9 v3) {
                                throw m44.a("n", (Object)v3, (long)1465573248333927390L, (long)var8_8);
                            }
                        }
                        try {
                            block23: {
                                try {
                                    try {
                                        v4 = var1_1;
                                        if (var18_13 != null) break block22;
                                        if (v4 != this.m) break block23;
                                    }
                                    catch (n9 v5) {
                                        throw m44.a("n", (Object)v5, (long)1465573248333927390L, (long)var8_8);
                                    }
                                    this.V(var4_4, var7_7, var13_12);
                                    if (var18_13 == null) break block24;
                                }
                                catch (n9 v6) {
                                    throw m44.a("n", (Object)v6, (long)1465573248333927390L, (long)var8_8);
                                }
                            }
                            v4 = var1_1;
                        }
                        catch (n9 v7) {
                            throw m44.a("n", (Object)v7, (long)1465573248333927390L, (long)var8_8);
                        }
                    }
                    var19_14 = v4.U();
                    try {
                        v8 = var19_14;
                        if (var18_13 != null) break block25;
                        if (v8 == null) break block26;
                    }
                    catch (n9 v9) {
                        throw m44.a("n", (Object)v9, (long)1465573248333927390L, (long)var8_8);
                    }
                    v8 = var19_14;
                }
                var20_15 = v8.size();
                for (nc var22_20 : var19_14) {
                    block28: {
                        block27: {
                            try {
                                try {
                                    if (var18_13 != null) break block24;
                                    v10 = this;
                                    v11 = var22_20;
                                    if (var20_15 <= 0) break block27;
                                }
                                catch (n9 v12) {
                                    throw m44.a("n", (Object)v12, (long)1465573248333927390L, (long)var8_8);
                                }
                                v13 = (BitSet)var4_4.clone();
                                break block28;
                            }
                            catch (n9 v14) {
                                throw m44.a("n", (Object)v14, (long)1465573248333927390L, (long)var8_8);
                            }
                        }
                        v13 = var4_4;
                    }
                    var15_17 = var7_7;
                    var16_18 = var6_6;
                    var17_19 = v13;
                    v10.C(v11, (char)var10_9, (short)var11_10, var17_19, var12_11, var16_18, var15_17);
                    if (var18_13 == null) continue;
                }
            }
            try {
                if (var2_2 < '\u0000' || var5_5 >= 0 || var18_13 == null) break block24;
lbl79:
                // 2 sources

                this.V(var4_4, var7_7, var13_12);
            }
            catch (n9 v15) {
                throw m44.a("n", (Object)v15, (long)1465573248333927390L, (long)var8_8);
            }
        }
    }

    /*
     * Exception decompiling
     */
    void R(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [20[DOLOOP], 19[WHILELOOP]], but top level block is 21[WHILELOOP]
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

    public nc A() {
        return this.m;
    }

    public boolean u(Object[] objectArray) {
        boolean bl;
        block6: {
            long l = (Long)objectArray[0];
            int n = (Integer)objectArray[1];
            long l2 = (l = a ^ l) ^ 0x45F9C644FB48L;
            int n2 = (int)(l2 >>> 32);
            int n3 = (int)(l2 << 32 >>> 40);
            int n4 = (int)(l2 << 56 >>> 56);
            Iterator iterator = this.Z.iterator();
            CallSite callSite = m44.a("l", (long)-7928977887438805722L, (long)l);
            while (iterator.hasNext()) {
                block8: {
                    boolean bl2;
                    block7: {
                        nc nc2 = (nc)iterator.next();
                        try {
                            try {
                                bl = nc2.N(n, n2, n3, (byte)n4);
                                CallSite callSite2 = callSite;
                                if (l > 0L) {
                                    if (callSite2 != null) break block6;
                                    callSite2 = callSite;
                                }
                                if (callSite2 != null) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("l", (Object)((Object)n92), (long)-7979036148010920244L, (long)l);
                            }
                            if (!bl) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("l", (Object)((Object)n93), (long)-7979036148010920244L, (long)l);
                        }
                        bl2 = true;
                    }
                    return bl2;
                }
                if (callSite == null) continue;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Exception decompiling
     */
    private void V(BitSet var1_1, List var2_2, long var3_3) {
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

    public nc y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("w", (Object)this, (long)8273600260791169837L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    public o8(nc var1_1, nc var2_2, long var3_3) {
        block17: {
            block14: {
                block15: {
                    v0 = var3_3 = o8.a ^ var3_3;
                    var5_4 = v0 ^ 75324228032455L;
                    var7_5 = v0 ^ 78766239145438L;
                    var9_6 = v0 ^ 97557661133857L;
                    var11_7 = v0 ^ 68481831719959L;
                    var13_8 = v0 ^ 50306770319497L;
                    v1 = m44.a("i", (long)-928903586795878453L, (long)var3_3);
                    super();
                    this.O = new ArrayList<E>();
                    v2 = new Object[1];
                    v2[0] = var7_5;
                    this.Z = m44.a("i", (Object)v2, (long)-1010340918065592199L, (long)var3_3);
                    this.m = var1_1;
                    this.O.add(var2_2);
                    var15_9 = v1;
                    try {
                        block16: {
                            try {
                                try {
                                    try {
                                        try {
                                            if (var15_9 != null) break block14;
                                            v3 = new Object[2];
                                            v3[1] = var1_1;
                                            v3[0] = var11_7;
                                            if (m44.a("v", (Object)var2_2, (Object)v3, (long)-1314942717571364041L, (long)var3_3) != false) {
                                            }
                                            ** GOTO lbl65
                                        }
                                        catch (n9 v4) {
                                            throw m44.a("i", (Object)v4, (long)-889030601167555551L, (long)var3_3);
                                        }
                                        v5 = new Object[1];
                                        v5[0] = var13_8;
                                        this.Y = m44.a("v", (Object)var2_2, (Object)v5, (long)-1610723245415408863L, (long)var3_3);
                                        v6 = var15_9;
                                        if (var3_3 >= 0L) {
                                            if (v6 != null) break block15;
                                        }
                                        ** GOTO lbl64
                                    }
                                    catch (n9 v7) {
                                        throw m44.a("i", (Object)v7, (long)-889030601167555551L, (long)var3_3);
                                    }
                                    if (var3_3 < 0L) break block15;
                                    if (m44.a("v", (Object)var1_1, (long)var5_4, (long)-1021795590471954006L, (long)var3_3) == this.Y) break block16;
                                }
                                catch (n9 v8) {
                                    throw m44.a("i", (Object)v8, (long)-889030601167555551L, (long)var3_3);
                                }
                                m44.a("u", (Object)this, (nc)m44.a("v", (Object)var1_1, (long)var5_4, (long)-1021795590471954006L, (long)var3_3), (long)-1174937342477734323L, (long)var3_3);
                                if (var15_9 == null) break block17;
                            }
                            catch (n9 v9) {
                                throw m44.a("i", (Object)v9, (long)-889030601167555551L, (long)var3_3);
                            }
                        }
                        m44.a("u", (Object)this, (nc)var1_1, (long)-1174937342477734323L, (long)var3_3);
                    }
                    catch (n9 v10) {
                        throw m44.a("i", (Object)v10, (long)-889030601167555551L, (long)var3_3);
                    }
                }
                try {
                    if (var3_3 < 0L) break block14;
                    v6 = var15_9;
lbl64:
                    // 2 sources

                    if (v6 == null) break block17;
lbl65:
                    // 2 sources

                    v11 = new Object[1];
                    v11[0] = var13_8;
                    this.Y = m44.a("v", (Object)var1_1, (Object)v11, (long)-1610723245415408863L, (long)var3_3);
                }
                catch (n9 v12) {
                    throw m44.a("i", (Object)v12, (long)-889030601167555551L, (long)var3_3);
                }
            }
            v13 = new Object[1];
            v13[0] = var9_6;
            m44.a("u", (Object)this, (nc)m44.a("v", (Object)var1_1, (Object)v13, (long)-1579781784867379335L, (long)var3_3), (long)-1174937342477734323L, (long)var3_3);
        }
    }

    public int compareTo(Object object) {
        long l = a ^ 0x7B93FF1F0686L;
        return (int)m44.a("w", (Object)this, (Object)new Object[]{(o8)object}, (long)-4188035338419839846L, (long)l);
    }

    public boolean W(Object[] objectArray) {
        nc nc2 = (nc)objectArray[0];
        return this.Z.contains(nc2);
    }

    public nc k(Object[] objectArray) {
        return (nc)this.O.get(0);
    }

    public int B(Object[] objectArray) {
        o8 o82 = (o8)objectArray[0];
        return this.m.F() - o82.m.F();
    }

    public List J(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x49C60030EC53L;
        return new e(l2, this.O);
    }

    public void q(Object[] objectArray) {
        nc nc2 = (nc)objectArray[0];
        this.O.add(nc2);
    }

    public nc Q(Object[] objectArray) {
        return this.Y;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
