/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._f;
import com.zelix.bn;
import com.zelix.i4;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ni;
import com.zelix.prr;
import com.zelix.s8;
import com.zelix.st;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class sw
extends _4
implements i4,
ni {
    private int g;
    private String D;
    private boolean N;
    private static final long b = prr.a((long)-3612825258120107524L, (long)-4138685757770142872L, MethodHandles.lookup().lookupClass()).a(231581038578887L);

    final void f(Object[] objectArray) {
        long l = (Long)objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        l = b ^ l;
        m44.a("q", (Object)((Object)this), (boolean)bl, (long)4575484457511193341L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final String J(Object[] objectArray) {
        _4 _42;
        long l;
        long l2;
        block20: {
            boolean bl;
            CallSite callSite;
            _4 _43;
            block18: {
                CallSite callSite2;
                block19: {
                    _4 _44;
                    l2 = (Long)objectArray[0];
                    long l3 = l2 = b ^ l2;
                    l = l3 ^ 0x5F1BB3A49A1EL;
                    long l4 = l3 ^ 0x3D4617AC39B2L;
                    _43 = this.H();
                    callSite2 = m44.a("i", (long)9219081713972095767L, (long)l2);
                    block12: while (_43 != null) {
                        try {
                            try {
                                try {
                                    _44 = _43;
                                }
                                catch (n9 n92) {
                                    throw m44.a("i", (Object)((Object)n92), (long)7281152312655172848L, (long)l2);
                                }
                            }
                            catch (n9 n93) {
                                throw m44.a("i", (Object)((Object)n93), (long)7281152312655172848L, (long)l2);
                            }
                        }
                        catch (n9 n94) {
                            throw m44.a("i", (Object)((Object)n94), (long)7281152312655172848L, (long)l2);
                        }
                        do {
                            block17: {
                                block22: {
                                    _4 _45;
                                    block23: {
                                        boolean bl2;
                                        block21: {
                                            bl2 = _44 instanceof s8;
                                            if (l2 < 0L || callSite2 != false) break block21;
                                            if (bl2) break block17;
                                            if (l2 < 0L) break block22;
                                            _45 = _43;
                                            if (callSite2 != false) break block23;
                                            bl2 = _45 instanceof _f;
                                        }
                                        try {
                                            if (bl2) break block17;
                                            _45 = _43.H();
                                        }
                                        catch (n9 n95) {
                                            throw m44.a("i", (Object)((Object)n95), (long)7281152312655172848L, (long)l2);
                                        }
                                    }
                                    _43 = _45;
                                }
                                if (callSite2 == false) continue block12;
                            }
                            callSite = null;
                            _44 = _43;
                        } while (l2 < 0L);
                    }
                    if (_44 == null) {
                        // empty if block
                    }
                    try {
                        bl = _43 instanceof s8;
                        if (callSite2 != false) break block18;
                        if (!bl) break block19;
                    }
                    catch (n9 n96) {
                        throw m44.a("i", (Object)((Object)n96), (long)7281152312655172848L, (long)l2);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l4;
                    return m44.a("v", (Object)((s8)_43), (Object)objectArray2, (long)7125182501154527933L, (long)l2);
                }
                try {
                    _42 = _43;
                    if (callSite2 != false) break block20;
                    bl = _42 instanceof _f;
                }
                catch (n9 n97) {
                    throw m44.a("i", (Object)((Object)n97), (long)7281152312655172848L, (long)l2);
                }
            }
            if (!bl) return callSite;
            _42 = _43;
        }
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l;
        return m44.a("v", (Object)((_f)_42), (Object)objectArray3, (long)7024250847642704863L, (long)l2);
    }

    abstract String N(Object[] var1);

    sw(char c, _4 _42, char c2, int n, int n2) {
        long l = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n2 << 32 >>> 32) ^ b;
        super(_42);
        m44.a("u", (Object)((Object)this), (boolean)true, (long)-5817780031665071423L, (long)l);
        m44.a("u", (Object)((Object)this), (int)n, (long)-6286494966511783996L, (long)l);
    }

    public final boolean U(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return (boolean)m44.a("u", (Object)((Object)this), (long)-1927199547250224957L, (long)l);
    }

    abstract String G(Object[] var1);

    /*
     * Exception decompiling
     */
    static sw f(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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

    abstract boolean d(Object[] var1);

    abstract boolean i(Object[] var1);

    public abstract void I(Object[] var1);

    final void S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l = b ^ l;
        m44.a("v", (Object)((Object)this), (String)string, (long)8896606207838404526L, (long)l);
    }

    public final String s(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return m44.a("q", (Object)((Object)this), (long)-310169477340610709L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final String c(Object[] objectArray) {
        _4 _42;
        boolean bl;
        CallSite callSite;
        _4 _43;
        long l;
        long l2;
        block18: {
            CallSite callSite2;
            block19: {
                _4 _44;
                l2 = (Long)objectArray[0];
                long l3 = l2 = b ^ l2;
                l = l3 ^ 0x7A7FB6C7D6E5L;
                long l4 = l3 ^ 0x292C79C2B27EL;
                _43 = this.H();
                callSite2 = m44.a("j", (long)-9197584453766425412L, (long)l2);
                block12: while (_43 != null) {
                    try {
                        try {
                            try {
                                _44 = _43;
                            }
                            catch (n9 n92) {
                                throw m44.a("j", (Object)((Object)n92), (long)-7304692215822898341L, (long)l2);
                            }
                        }
                        catch (n9 n93) {
                            throw m44.a("j", (Object)((Object)n93), (long)-7304692215822898341L, (long)l2);
                        }
                    }
                    catch (n9 n94) {
                        throw m44.a("j", (Object)((Object)n94), (long)-7304692215822898341L, (long)l2);
                    }
                    do {
                        block17: {
                            block21: {
                                _4 _45;
                                block22: {
                                    boolean bl2;
                                    block20: {
                                        bl2 = _44 instanceof st;
                                        if (l2 < 0L || callSite2 != false) break block20;
                                        if (bl2) break block17;
                                        if (l2 < 0L) break block21;
                                        _45 = _43;
                                        if (callSite2 != false) break block22;
                                        bl2 = _45 instanceof bn;
                                    }
                                    try {
                                        if (bl2) break block17;
                                        _45 = _43.H();
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("j", (Object)((Object)n95), (long)-7304692215822898341L, (long)l2);
                                    }
                                }
                                _43 = _45;
                            }
                            if (callSite2 == false) continue block12;
                        }
                        callSite = null;
                        _44 = _43;
                    } while (l2 <= 0L);
                }
                if (_44 == null) {
                    // empty if block
                }
                try {
                    bl = _43 instanceof st;
                    if (callSite2 != false) break block18;
                    if (!bl) break block19;
                }
                catch (n9 n96) {
                    throw m44.a("j", (Object)((Object)n96), (long)-7304692215822898341L, (long)l2);
                }
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l4;
                return m44.a("u", (Object)((st)_43), (Object)objectArray2, (long)-7337433885452348030L, (long)l2);
            }
            try {
                _42 = _43;
                if (callSite2 != false) return m44.a("u", (Object)((bn)_42), (long)l, (long)-9043683241135178176L, (long)l2);
                bl = _42 instanceof bn;
            }
            catch (n9 n97) {
                throw m44.a("j", (Object)((Object)n97), (long)-7304692215822898341L, (long)l2);
            }
        }
        if (!bl) return callSite;
        _42 = _43;
        return m44.a("u", (Object)((bn)_42), (long)l, (long)-9043683241135178176L, (long)l2);
    }

    final int X(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return (int)m44.a("q", (Object)((Object)this), (long)2555755471597937778L, (long)l);
    }

    public abstract void z(Object[] var1);

    private static n9 d(n9 n92) {
        return n92;
    }
}
